package Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import classes.Action;
import classes.Client;

import classes.dao.ActionDAO;
import classes.dao.ClientDAO;
import classes.service.ActionService;
import classes.service.ClientService;


public class TestMock {

	
	@Before
	public void initMocks()
	{
		MockitoAnnotations.initMocks(this);
		
		
	}
	@InjectMocks
	ActionService actService;
	@InjectMocks
	ClientService clService;
	@Mock
	ActionDAO dbActionMock;
	@Mock
	ClientDAO dbClientMock;
	
	@Before
	public void init() {
		actService = new ActionService();
		clService = new ClientService();
	}
	
	@Test
	public void TestAjoutClient() {
		Client Cl = new Client(1,"gout","toto","tot@tt.fr","adresse","+335555",28234,100);
		boolean saved=clService.save(Cl);
		assertTrue(saved);
		verify(dbClientMock , times(1)).save(Cl);
		
	}
	
	@Test
	public void TestAjoutAction() {
		Client Cl = new Client(1,"gout","toto","tot@tt.fr","adresse","+335555",28234,100);
		Action Act=new Action(1,1,"dateheure",50,"retrait");
		boolean saved=actService.save(Act,Cl);
		assertTrue(saved);
		verify(dbActionMock , times(1)).save(Act);
		
	}
	
}
