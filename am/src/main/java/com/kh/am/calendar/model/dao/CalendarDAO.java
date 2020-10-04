package com.kh.am.calendar.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.am.calendar.model.vo.NewsBoard;
import com.kh.am.calendar.model.vo.PartTime;
import com.kh.am.calendar.model.vo.UpdateWorkCalendar;
import com.kh.am.calendar.model.vo.WorkCalendar;
import com.kh.am.member.model.vo.Member;

@Repository
public class CalendarDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	/** 사장님 가게 번호 조회
	 * @param memberNo
	 * @return 
	 */
	public int selectStoreNo(int memberNo) {
		return sqlSession.selectOne("calendarMapper.selectStoreNo", memberNo);
	}

	/** 스케쥴 조회(사장)
	 * @param storeNo
	 * @return list
	 */
	public List<WorkCalendar> selectCalendarM(int storeNo) {
		return sqlSession.selectList("calendarMapper.selectCalendarM", storeNo);
	}

	/** 스케쥴 조회(알바)
	 * @param storeNo
	 * @return list
	 */
	public List<WorkCalendar> selectCalendarS(int memberNo) {
		return sqlSession.selectList("calendarMapper.selectCalendarS", memberNo);
	}

	
	/** 알바생 이름 조회
	 * @param storeNo
	 * @return
	 */
	public List<Member> selectEName(int storeNo) {
		return sqlSession.selectList("calendarMapper.selectEName", storeNo);
	}

	/** 파트타임 목록 조회
	 * @param storeNo
	 * @return pList
	 */
	public List<PartTime> selectPList(int storeNo) {
		return sqlSession.selectList("calendarMapper.selectPList", storeNo);
	}
	
	/** 스케쥴 삽입 1개
	 * @param insertCal
	 * @return
	 */
	public int insertCalendar(WorkCalendar insertCal) {
		return sqlSession.insert("calendarMapper.insertCalendar", insertCal);
	}

	/** 스케쥴 업데이트
	 * @param updateCal
	 * @return result
	 */
	public int updateCalendar(UpdateWorkCalendar updateCal) {
		return sqlSession.update("calendarMapper.updateCalendar", updateCal);
	}

	/** 스케쥴 삭제
	 * @param deleteCal
	 * @return result
	 */
	public int deleteCalendar(WorkCalendar deleteCal) {
		return sqlSession.delete("calendarMapper.deleteCalendar", deleteCal);
	}

	/** 파트타임 삭제
	 * @param partTime
	 * @return result
	 */
	public int partTimeDelete(PartTime partTime) {
		return sqlSession.delete("calendarMapper.partTimeDelete", partTime);
	}

	/** 파트타임 업데이트 
	 * @param map
	 * @return result
	 */
	public int partTimeUpdate(PartTime partTime) {
		
		return sqlSession.delete("calendarMapper.partTimeUpdate", partTime);
	}

	/** 파트타임 삽입
	 * @param partTime
	 * @return result
	 */
	public int partTimeInsert(PartTime partTime) {
		return sqlSession.insert("calendarMapper.partTimeInsert", partTime);
	}

	/** 메인화면 알바생 정보 조회
	 * @param storeNo
	 * @return
	 */
	public List<Member> selectMList(int storeNo) {
		return sqlSession.selectList("calendarMapper.selectMList", storeNo);
	}

	/** 뉴스보드 리스트
	 * @param memberGrade
	 * @return
	 */
	public List<NewsBoard> selectNewsList(String memberGrade) {
		return sqlSession.selectList("calendarMapper.selectNewsList", memberGrade);
	}

	/** 생활뉴스 리스트
	 * @return
	 */
	public List<NewsBoard> selectNews2List() {
		return sqlSession.selectList("calendarMapper.selectNews2List");
	}

	
	
}
