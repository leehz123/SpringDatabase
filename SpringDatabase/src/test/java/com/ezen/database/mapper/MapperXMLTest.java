package com.ezen.database.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j2;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class MapperXMLTest {

	@Autowired
	EmployeeMapperXMl mapper;

	@Autowired
	PizzaMapperXML pMapper;
	
	@Ignore
	@Test
	public void test() {
		log.info(mapper.getList());
	}
	
	@Ignore
	@Test
	public void test2() {
		log.info(mapper.getListByDept(50));
	}
	@Ignore
	@Test
	public void test3() {
		assertEquals(3, pMapper.getList().size());
		log.info(pMapper.getList());
	}
	
	
	@Test
	public void test4() {
		log.info(mapper.getListBetweenDept(30, 80));
	}
	//�� ����. �׸��� �̸����� �ڵ� ���ε� ���ִ� ��� �ְ� �� ���ִ� ��� �ֳ�
	//[Employee(employee_id=103, first_name=Alexander, last_name=Hunold, salary=9000.0, commission_pct=null, job_id=IT_PROG, department_id=60), Employee(employee_id=104, first_name=Bruce, last_name=Ernst, salary=6000.0, commission_pct=null, job_id=IT_PROG, department_id=60), Employee(employee_id=105, first_name=David, last_name=Austin, salary=4800.0, commission_pct=null, job_id=IT_PROG, department_id=60), Employee(employee_id=106, first_name=Valli, last_name=Pataballa, salary=4800.0, commission_pct=null, job_id=IT_PROG, department_id=60), Employee(employee_id=107, first_name=Diana, last_name=Lorentz, salary=4200.0, commission_pct=null, job_id=IT_PROG, department_id=60), Employee(employee_id=114, first_name=Den, last_name=Raphaely, salary=11000.0, commission_pct=null, job_id=PU_MAN, department_id=30), Employee(employee_id=115, first_name=Alexander, last_name=Khoo, salary=3100.0, commission_pct=null, job_id=PU_CLERK, department_id=30), Employee(employee_id=116, first_name=Shelli, last_name=Baida, salary=2900.0, commission_pct=null, job_id=PU_CLERK, department_id=30), Employee(employee_id=117, first_name=Sigal, last_name=Tobias, salary=2800.0, commission_pct=null, job_id=PU_CLERK, department_id=30), Employee(employee_id=118, first_name=Guy, last_name=Himuro, salary=2600.0, commission_pct=null, job_id=PU_CLERK, department_id=30), Employee(employee_id=119, first_name=Karen, last_name=Colmenares, salary=2500.0, commission_pct=null, job_id=PU_CLERK, department_id=30), Employee(employee_id=120, first_name=Matthew, last_name=Weiss, salary=8000.0, commission_pct=null, job_id=ST_MAN, department_id=50), Employee(employee_id=121, first_name=Adam, last_name=Fripp, salary=8200.0, commission_pct=null, job_id=ST_MAN, department_id=50), Employee(employee_id=122, first_name=Payam, last_name=Kaufling, salary=7900.0, commission_pct=null, job_id=ST_MAN, department_id=50), Employee(employee_id=123, first_name=Shanta, last_name=Vollman, salary=6500.0, commission_pct=null, job_id=ST_MAN, department_id=50), Employee(employee_id=124, first_name=Kevin, last_name=Mourgos, salary=5800.0, commission_pct=null, job_id=ST_MAN, department_id=50), Employee(employee_id=125, first_name=Julia, last_name=Nayer, salary=3200.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=126, first_name=Irene, last_name=Mikkilineni, salary=2700.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=127, first_name=James, last_name=Landry, salary=2400.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=128, first_name=Steven, last_name=Markle, salary=2200.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=129, first_name=Laura, last_name=Bissot, salary=3300.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=130, first_name=Mozhe, last_name=Atkinson, salary=2800.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=131, first_name=James, last_name=Marlow, salary=2500.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=132, first_name=TJ, last_name=Olson, salary=2100.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=133, first_name=Jason, last_name=Mallin, salary=3300.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=134, first_name=Michael, last_name=Rogers, salary=2900.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=135, first_name=Ki, last_name=Gee, salary=2400.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=136, first_name=Hazel, last_name=Philtanker, salary=2200.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=137, first_name=Renske, last_name=Ladwig, salary=3600.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=138, first_name=Stephen, last_name=Stiles, salary=3200.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=139, first_name=John, last_name=Seo, salary=2700.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=140, first_name=Joshua, last_name=Patel, salary=2500.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=141, first_name=Trenna, last_name=Rajs, salary=3500.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=142, first_name=Curtis, last_name=Davies, salary=3100.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=143, first_name=Randall, last_name=Matos, salary=2600.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=144, first_name=Peter, last_name=Vargas, salary=2500.0, commission_pct=null, job_id=ST_CLERK, department_id=50), Employee(employee_id=145, first_name=John, last_name=Russell, salary=14000.0, commission_pct=0.4, job_id=SA_MAN, department_id=80), Employee(employee_id=146, first_name=Karen, last_name=Partners, salary=13500.0, commission_pct=0.3, job_id=SA_MAN, department_id=80), Employee(employee_id=147, first_name=Alberto, last_name=Errazuriz, salary=12000.0, commission_pct=0.3, job_id=SA_MAN, department_id=80), Employee(employee_id=148, first_name=Gerald, last_name=Cambrault, salary=11000.0, commission_pct=0.3, job_id=SA_MAN, department_id=80), Employee(employee_id=149, first_name=Eleni, last_name=Zlotkey, salary=10500.0, commission_pct=0.2, job_id=SA_MAN, department_id=80), Employee(employee_id=150, first_name=Peter, last_name=Tucker, salary=10000.0, commission_pct=0.3, job_id=SA_REP, department_id=80), Employee(employee_id=151, first_name=David, last_name=Bernstein, salary=9500.0, commission_pct=0.25, job_id=SA_REP, department_id=80), Employee(employee_id=152, first_name=Peter, last_name=Hall, salary=9000.0, commission_pct=0.25, job_id=SA_REP, department_id=80), Employee(employee_id=153, first_name=Christopher, last_name=Olsen, salary=8000.0, commission_pct=0.2, job_id=SA_REP, department_id=80), Employee(employee_id=154, first_name=Nanette, last_name=Cambrault, salary=7500.0, commission_pct=0.2, job_id=SA_REP, department_id=80), Employee(employee_id=155, first_name=Oliver, last_name=Tuvault, salary=7000.0, commission_pct=0.15, job_id=SA_REP, department_id=80), Employee(employee_id=156, first_name=Janette, last_name=King, salary=10000.0, commission_pct=0.35, job_id=SA_REP, department_id=80), Employee(employee_id=158, first_name=Allan, last_name=McEwen, salary=9000.0, commission_pct=0.35, job_id=SA_REP, department_id=80), Employee(employee_id=159, first_name=Lindsey, last_name=Smith, salary=8000.0, commission_pct=0.3, job_id=SA_REP, department_id=80), Employee(employee_id=160, first_name=Louise, last_name=Doran, salary=7500.0, commission_pct=0.3, job_id=SA_REP, department_id=80), Employee(employee_id=161, first_name=Sarath, last_name=Sewall, salary=7000.0, commission_pct=0.25, job_id=SA_REP, department_id=80), Employee(employee_id=162, first_name=Clara, last_name=Vishney, salary=10500.0, commission_pct=0.25, job_id=SA_REP, department_id=80), Employee(employee_id=163, first_name=Danielle, last_name=Greene, salary=9500.0, commission_pct=0.15, job_id=SA_REP, department_id=80), Employee(employee_id=164, first_name=Mattea, last_name=Marvins, salary=7200.0, commission_pct=0.1, job_id=SA_REP, department_id=80), Employee(employee_id=165, first_name=David, last_name=Lee, salary=6800.0, commission_pct=0.1, job_id=SA_REP, department_id=80), Employee(employee_id=166, first_name=Sundar, last_name=Ande, salary=6400.0, commission_pct=0.1, job_id=SA_REP, department_id=80), Employee(employee_id=167, first_name=Amit, last_name=Banda, salary=6200.0, commission_pct=0.1, job_id=SA_REP, department_id=80), Employee(employee_id=168, first_name=Lisa, last_name=Ozer, salary=11500.0, commission_pct=0.25, job_id=SA_REP, department_id=80), Employee(employee_id=169, first_name=Harrison, last_name=Bloom, salary=10000.0, commission_pct=0.2, job_id=SA_REP, department_id=80), Employee(employee_id=170, first_name=Tayler, last_name=Fox, salary=9600.0, commission_pct=0.2, job_id=SA_REP, department_id=80), Employee(employee_id=171, first_name=William, last_name=Smith, salary=7400.0, commission_pct=0.15, job_id=SA_REP, department_id=80), Employee(employee_id=172, first_name=Elizabeth, last_name=Bates, salary=7300.0, commission_pct=0.15, job_id=SA_REP, department_id=80), Employee(employee_id=173, first_name=Sundita, last_name=Kumar, salary=6100.0, commission_pct=0.1, job_id=SA_REP, department_id=80), Employee(employee_id=174, first_name=Ellen, last_name=Abel, salary=11000.0, commission_pct=0.3, job_id=SA_REP, department_id=80), Employee(employee_id=175, first_name=Alyssa, last_name=Hutton, salary=8800.0, commission_pct=0.25, job_id=SA_REP, department_id=80), Employee(employee_id=176, first_name=Jonathon, last_name=Taylor, salary=8600.0, commission_pct=0.2, job_id=SA_REP, department_id=80), Employee(employee_id=177, first_name=Jack, last_name=Livingston, salary=8400.0, commission_pct=0.2, job_id=SA_REP, department_id=80), Employee(employee_id=179, first_name=Charles, last_name=Johnson, salary=6200.0, commission_pct=0.1, job_id=SA_REP, department_id=80), Employee(employee_id=180, first_name=Winston, last_name=Taylor, salary=3200.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=181, first_name=Jean, last_name=Fleaur, salary=3100.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=182, first_name=Martha, last_name=Sullivan, salary=2500.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=183, first_name=Girard, last_name=Geoni, salary=2800.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=184, first_name=Nandita, last_name=Sarchand, salary=4200.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=185, first_name=Alexis, last_name=Bull, salary=4100.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=186, first_name=Julia, last_name=Dellinger, salary=3400.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=187, first_name=Anthony, last_name=Cabrio, salary=3000.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=188, first_name=Kelly, last_name=Chung, salary=3800.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=189, first_name=Jennifer, last_name=Dilly, salary=3600.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=190, first_name=Timothy, last_name=Gates, salary=2900.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=191, first_name=Randall, last_name=Perkins, salary=2500.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=192, first_name=Sarah, last_name=Bell, salary=4000.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=193, first_name=Britney, last_name=Everett, salary=3900.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=194, first_name=Samuel, last_name=McCain, salary=3200.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=195, first_name=Vance, last_name=Jones, salary=2800.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=196, first_name=Alana, last_name=Walsh, salary=3100.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=197, first_name=Kevin, last_name=Feeney, salary=3000.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=198, first_name=Donald, last_name=OConnell, salary=2600.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=199, first_name=Douglas, last_name=Grant, salary=2600.0, commission_pct=null, job_id=SH_CLERK, department_id=50), Employee(employee_id=203, first_name=Susan, last_name=Mavris, salary=6500.0, commission_pct=null, job_id=HR_REP, department_id=40), Employee(employee_id=204, first_name=Hermann, last_name=Baer, salary=10000.0, commission_pct=null, job_id=PR_REP, department_id=70)]
	
}