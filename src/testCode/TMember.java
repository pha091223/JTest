package testCode;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mainSrc.Member;

public class TMember {
	// 독립된 단위 테스트를 하기 위해 라이브러리를 추가함(JUnit)
	// JUnit : 독립된 단위 테스트를 지원해주는 프레임워크
	// - 사용되는 어노테이션
	//   @Test   : @Test가 선언된 메소드가 테스트를 수행함
	//   @Ignore : 테스트를 실행하지 않음
	//   @Before : @Test가 선언된 메소드가 실행되기 전에 수행함
	
	// sysout으로는 콘솔에 결과를 출력하지만
	// 단정(assert) 메소드로 테스크의 결과를 판별한다.
	// ex) assertEquals(예상값, 실제값) : 예상값과 실제값이 일치하면 성공, 아니면 실패
	
	// - JUnit Method
	//    assertEquals(a, b) : 객체 또는 값이 일치하는가
	//    assertArrayEquals(a, b) : 배열의 값이 일치하는가
	//    assertSame(a, b) : 같은 객체인가
	//    assertTrue(a, b) : 조건이 참인가
	//    assertNotNull(a) : 객체가 null이 아닌가
	//    assertNull(a) : 객체가 null인가
	
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
		// System.out.println(newMember);
		// System.out.println(oldMember);
		
		// assertEquals(newMember, oldMember);
		// assertNotNull(newMember);
		// assertSame(newMember, oldMember);
		
		// 단위 테스트 예시
		if(newMember==null) {
			System.out.println("OK");
		}
		assertTrue(newMember==null);
	}
	
	@Before
	public void test2() {
		newMember = new Member();
		oldMember = newMember;
	}

}
