package testCode;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mainSrc.Member;

public class TMember {
	// ������ ���� �׽�Ʈ�� �ϱ� ���� ���̺귯���� �߰���(JUnit)
	// JUnit : ������ ���� �׽�Ʈ�� �������ִ� �����ӿ�ũ
	// - ���Ǵ� ������̼�
	//   @Test   : @Test�� ����� �޼ҵ尡 �׽�Ʈ�� ������
	//   @Ignore : �׽�Ʈ�� �������� ����
	//   @Before : @Test�� ����� �޼ҵ尡 ����Ǳ� ���� ������
	
	// sysout���δ� �ֿܼ� ����� ���������
	// ����(assert) �޼ҵ�� �׽�ũ�� ����� �Ǻ��Ѵ�.
	// ex) assertEquals(����, ������) : ���󰪰� �������� ��ġ�ϸ� ����, �ƴϸ� ����
	
	// - JUnit Method
	//    assertEquals(a, b) : ��ü �Ǵ� ���� ��ġ�ϴ°�
	//    assertArrayEquals(a, b) : �迭�� ���� ��ġ�ϴ°�
	//    assertSame(a, b) : ���� ��ü�ΰ�
	//    assertTrue(a, b) : ������ ���ΰ�
	//    assertNotNull(a) : ��ü�� null�� �ƴѰ�
	//    assertNull(a) : ��ü�� null�ΰ�
	
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
		// System.out.println(newMember);
		// System.out.println(oldMember);
		
		// assertEquals(newMember, oldMember);
		// assertNotNull(newMember);
		// assertSame(newMember, oldMember);
		
		// ���� �׽�Ʈ ����
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
