
public class Test {
	public static void main(String[] args) {
		System.out.println("Creating Employee object");
		Emplyee emp=new Emplyee();
		System.out.println(Emplyee.department);
		Emplyee.work();
		emp.salary =90000;
		emp.getPaid();
		
		System.out.println("Creating ScrumTeam object");
		ScrumMaster str=new ScrumMaster();
		ScrumMaster.work();
		
		str.salary=10000;
		str.getPaid();
		str.artifacts="PR b, Spr back, Burn char";
		str.ceremonies="Spring Grooming, Sprint Planning, Daily standup,Sprint Demo, Sprint Retro";
		str.attendScrumMeeting();
		str.workOnArtifacts();
		
		System.out.println("Cr developer object");
		Developer dev=new Developer();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Spring backlog";
		dev.ceremonies="Spring Grooming, Sprint Planning, Daily standup,Sprint Demo";
		dev.attendScrumMeeting();
		dev.workOnArtifacts();
		dev.code();
		dev.backEnd();
		dev.frontEnd();
		
		
		Tester qa=new Tester();
		qa.salary=120000;
		qa.getPaid();
		qa.artifacts="Spring backlog";
		qa.ceremonies="Spring Grooming, Sprint Planning, Daily standup,Sprint Demo";
		qa.attendScrumMeeting();
		qa.workOnArtifacts();
		qa.test();
		qa.codeInJava();
		qa.testManual();
		
		BA ba=new BA();
		ba.salary=120000;
		ba.getPaid();
		ba.artifacts="Burnout chart";
		ba.ceremonies="Spring Grooming, Sprint Planning, Daily standup,Sprint Demo";
		ba.attendScrumMeeting();
		ba.workOnArtifacts();
		ba.writeUserStories();
		
		ProducOwner pr=new ProducOwner();
		pr.salary=120000;
		pr.getPaid();
		pr.artifacts="Spring backlog";
		pr.ceremonies="Spring Grooming, Sprint Planning, Daily standup,Sprint Demo";
		pr.attendScrumMeeting();
		pr.workOnArtifacts();
		pr.talkToTheClient();
		pr.talkToTheClient();
		
		
		
		
		
		
		
		
	}

}
