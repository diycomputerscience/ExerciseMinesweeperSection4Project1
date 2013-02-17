package com.diycomputerscience.minesweeper.view;

import static org.junit.Assert.assertEquals;

import javax.swing.JFrame;

import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UITest extends BaseSwingTestCase {
	 
	private FrameFixture window;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		
		this.window = new FrameFixture(robot(), createUI());
		this.window.show();
	}

	@After
	public void tearDown() throws Exception {		
		this.window.cleanUp();
		super.tearDown();
	}

	@Test
	public void testUIVisibility() {
		
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				window.requireVisible();
			}			
		});
						
	}

	@Test
	public void testUIDefaultCloseOperation() {
		int defaultCloseOperation = GuiActionRunner.execute(new GuiQuery<Integer>() {
			@Override
			protected Integer executeInEDT() throws Throwable {
				return ((JFrame)window.target).getDefaultCloseOperation();			
			}			
		});
		assertEquals(JFrame.EXIT_ON_CLOSE, defaultCloseOperation);
	}
}
