package com.kh.am.calendar.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.ls.LSInput;

import com.kh.am.calendar.model.dao.CalendarDAO;
import com.kh.am.calendar.model.vo.WorkCalendar;
import com.kh.am.calendar.model.vo.Employee;
import com.kh.am.calendar.model.vo.NewsBoard;
import com.kh.am.calendar.model.vo.PartTime;
import com.kh.am.calendar.model.vo.UpdateWorkCalendar;
import com.kh.am.member.model.vo.Member;

@Service
public class CalendarServiceImpl implements CalendarService {
	
	@Autowired
	private CalendarDAO calendarDAO;

	// 사장님 전체 스케쥴 조회
	@Override
	public List<WorkCalendar> selectList(int memberNo) {
		
		// 로그인한 사장님 회원번호에서 가게 번호를 조회 
		int storeNo = calendarDAO.selectStoreNo(memberNo);
		
		System.out.println("가게번호 : " + storeNo);
		
		
		
		//알바생 중에 컬럼값으로 가게번호를 가지고 있는 알바생 조회  후
		//그 알바생들의 근무 스케쥴 테이블 항목별로 전부(*) 가져오기 (특히 날짜, (시작, 끝)시간, 알바생이름)
		List<WorkCalendar> list = calendarDAO.selectCalendarM(storeNo);
				
		
		return list;
	}

	// 알바생 스케쥴 조회(개인)
	@Override
	public List<WorkCalendar> selectListStaff(int memberNo) {
		
		
		
		//해당 알바생번호 조회  후
		//그 알바생들의 근무 스케쥴 테이블 항목별로 전부(*) 가져오기 (특히 날짜, (시작, 끝)시간, 알바생이름)
		List<WorkCalendar> list = calendarDAO.selectCalendarS(memberNo);
				
		
		return list;
	}

	// 사장님 가게 번호 조회
	@Override
	public int selectStoreNo(int memberNo) {
		
		int storeNo = calendarDAO.selectStoreNo(memberNo);
		
		return storeNo;
	}

	// 알바생 목록 조회
	@Override
	public List<Member> selectEList(int storeNo) {
		
		// 사장 알바생 이름 조회
		List<Member> EName = calendarDAO.selectEName(storeNo);
		
		return EName;
	}

	// 파트타임 목록 조회
		@Override
		public List<PartTime> selectPList(int storeNo) {
			
			List<PartTime> pList = calendarDAO.selectPList(storeNo);
			
			return pList;
		}
		
	// 스케쥴 삽입(1개)
	@Transactional(rollbackFor=Exception.class)
	@Override
	public int insertCalendar(WorkCalendar insertCal, int memberNo) {
		
		int storeNo = calendarDAO.selectStoreNo(memberNo);
		
		insertCal.setStoreNo(storeNo);
		
		int result = calendarDAO.insertCalendar(insertCal);
		
		return result;
	}

	// 스케쥴 업데이트
	@Transactional(rollbackFor=Exception.class)
	@Override
	public int updateCalendar(UpdateWorkCalendar updateCal, int memberNo) {
		
		int storeNo = calendarDAO.selectStoreNo(memberNo);
			
		updateCal.setStoreNo(storeNo);
		
		System.out.println("업데이트 서비스" + updateCal);
		
		int result = calendarDAO.updateCalendar(updateCal);
		
		return result;
	}

	// 스케쥴 삭제
	@Transactional(rollbackFor=Exception.class)
	@Override
	public int deleteCalendar(WorkCalendar deleteCal, int memberNo) {
		int storeNo = calendarDAO.selectStoreNo(memberNo);
		
		deleteCal.setStoreNo(storeNo);
		
		System.out.println("딜리트 서비스" + deleteCal);
		
		int result = calendarDAO.deleteCalendar(deleteCal);
		
		return result;
	}

	// 파트타임 페이지 파트타임 조회
	@Override
	public List<PartTime> selectPartTime(int memberNo) {
		
		// 가게번호 조회
		int storeNo = calendarDAO.selectStoreNo(memberNo);
		
		// 파트타임 목록 조회
		List<PartTime> pList = calendarDAO.selectPList(storeNo);
		
		return pList;
	}

	// 파트타임 삭제
	@Transactional(rollbackFor=Exception.class)
	@Override
	public int partTimeDelete(PartTime partTime) {
		
		System.out.println("파트타임 삭제 서비스 : "+ partTime);
		
		int result = calendarDAO.partTimeDelete(partTime);
		
		return result;
	}

	// 파트타임 업데이트
	@Transactional(rollbackFor=Exception.class)
	@Override
	public int partTimeUpdate(PartTime partTime) {
		
		int result = calendarDAO.partTimeUpdate(partTime);
		
		return result;
	}
	
	// 파트타임 인서트
	@Transactional(rollbackFor=Exception.class)
	@Override
	public int partTimeInsert(PartTime partTime) {
		
		int result = calendarDAO.partTimeInsert(partTime);
		
		return result;
	}

	// 메인화면 알바생 정보 조회
	@Override
	public List<Member> selectMList(int storeNo) {
		
		List<Member> mList = calendarDAO.selectMList(storeNo);
		
		return mList;
	}

	// 뉴스보드 리스트
	@Override
	public List<NewsBoard> selectNewsList(String memberGrade) {
		
		List<NewsBoard> list = calendarDAO.selectNewsList(memberGrade);
		return list;
	}

	// 생활뉴스 리스트
	@Override
	public List<NewsBoard> selectNews2List() {
		List<NewsBoard> list = calendarDAO.selectNews2List();
		
		return list;
	}

	

}
