package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(536870912);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="txtNumber1.Text=\"\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._txtnumber1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 32;BA.debugLine="txtNumber2.Text=\"\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent._txtnumber2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsum_click() throws Exception{
try {
		Debug.PushSubsStack("btnSum_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("btnsum_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnsum_click");}
 BA.debugLineNum = 43;BA.debugLine="Sub btnSum_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="If (txtNumber1.Text =\"\" Or txtNumber2.Text =\"\") T";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",main.mostCurrent._txtnumber1.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",main.mostCurrent._txtnumber2.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 45;BA.debugLine="xui.MsgboxAsync(\"Please Enter Both Numbers\", \"Er";
Debug.ShouldStop(4096);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Please Enter Both Numbers")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))));
 }else {
 BA.debugLineNum = 47;BA.debugLine="Number1=txtNumber1.Text";
Debug.ShouldStop(16384);
main._number1 = BA.numberCast(int.class, main.mostCurrent._txtnumber1.runMethod(true,"getText"));
 BA.debugLineNum = 48;BA.debugLine="Number2=txtNumber2.Text";
Debug.ShouldStop(32768);
main._number2 = BA.numberCast(int.class, main.mostCurrent._txtnumber2.runMethod(true,"getText"));
 BA.debugLineNum = 49;BA.debugLine="sum = Number1 + Number2";
Debug.ShouldStop(65536);
main._sum = RemoteObject.solve(new RemoteObject[] {main._number1,main._number2}, "+",1, 1);
 BA.debugLineNum = 50;BA.debugLine="lblResults.Text= sum";
Debug.ShouldStop(131072);
main.mostCurrent._lblresults.runMethod(true,"setText",BA.ObjectToCharSequence(main._sum));
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private txtNumber1 As EditText";
main.mostCurrent._txtnumber1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtNumber2 As EditText";
main.mostCurrent._txtnumber2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblResults As Label";
main.mostCurrent._lblresults = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Number1, Number2, sum As Int";
main._number1 = RemoteObject.createImmutable(0);
main._number2 = RemoteObject.createImmutable(0);
main._sum = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}