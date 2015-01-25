package com.example.tests;

import org.testng.annotations.Test;


public class MoreGroupCreationTests extends TestBase {
  
	@Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    GroupData group = new GroupData();
    group.name = "Group Name 5";
    group.header = "Header 5";
    group.footer = "Footer 5";
	fillGroupForm(group);
    submitGroupCreation();
    returnToGroupsPage();
  }

  @Test
  public void testEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupData("", "", ""));
    submitGroupCreation();
    returnToGroupsPage();
  }
}
