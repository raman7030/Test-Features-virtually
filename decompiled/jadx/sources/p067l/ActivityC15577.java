package p067l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import bin.p000mt.plus.ShortcutActivity;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U92X */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC15577 extends ActivityC12426 {
    @Override // android.app.Activity
    public final void finish() {
        if (isTaskRoot()) {
            finishAndRemoveTask();
            if (((int) C7480.stream(((ActivityManager) getSystemService("activity")).getAppTasks()).filter(new C24355(1)).count()) == 1) {
                System.out.println("Kill self process");
                C11164.m25757();
                Process.killProcess(Process.myPid());
                return;
            }
            return;
        }
        super.finish();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35427(ActivityManager.AppTask appTask) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return appTask.getTaskInfo().isRunning;
        }
        return i < 23 || appTask.getTaskInfo().topActivity != null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m35428(Context context, Intent intent) {
        String str;
        String str2;
        String[] strArr;
        Iterator it;
        Intent intentM21282;
        String str3;
        String stringExtra;
        String str4;
        Iterator it2;
        String str5 = "operation";
        String stringExtra2 = intent.getStringExtra("operation");
        if (!"exec-script".equals(stringExtra2)) {
            return false;
        }
        String stringExtra3 = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH);
        boolean booleanExtra = intent.getBooleanExtra("eae", false);
        String str6 = "ewrp";
        boolean booleanExtra2 = intent.getBooleanExtra("ewrp", false);
        boolean booleanExtra3 = intent.getBooleanExtra("ewse", true);
        String strM35425 = m35425(stringExtra2, stringExtra3, booleanExtra, booleanExtra2, booleanExtra3);
        String[] strArrMo20203 = ApplicationC21448.f67649.mo20203("eama", (String[]) null);
        if (strArrMo20203 != null && Arrays.asList(strArrMo20203).contains(strM35425)) {
            m35426(strM35425, strArrMo20203);
            return true;
        }
        if (ShortcutActivity.m139()) {
            Iterator it3 = C1654.m40736(context).iterator();
            while (it3.hasNext()) {
                Intent intentM21283 = ((C1201) it3.next()).m21282();
                if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM21283.getAction())) {
                    String stringExtra4 = intentM21283.getStringExtra("operation");
                    it2 = it3;
                    String stringExtra5 = intentM21283.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                    str = strM35425;
                    strArr = strArrMo20203;
                    boolean booleanExtra4 = intentM21283.getBooleanExtra("eae", false);
                    boolean booleanExtra5 = intentM21283.getBooleanExtra(str6, false);
                    str4 = str6;
                    boolean booleanExtra6 = intentM21283.getBooleanExtra("ewse", true);
                    if (!"exec-script".equals(stringExtra4) || !C12826.equals(stringExtra3, stringExtra5) || booleanExtra != booleanExtra4 || booleanExtra2 != booleanExtra5 || booleanExtra3 != booleanExtra6) {
                    }
                } else {
                    str = strM35425;
                    str4 = str6;
                    it2 = it3;
                    strArr = strArrMo20203;
                }
                it3 = it2;
                strM35425 = str;
                strArrMo20203 = strArr;
                str6 = str4;
            }
            str = strM35425;
            str2 = str6;
            strArr = strArrMo20203;
            it = C1654.m40724(context).iterator();
            while (it.hasNext()) {
                intentM21282 = ((C1201) it.next()).m21282();
                if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM21282.getAction())) {
                    stringExtra = intentM21282.getStringExtra(str5);
                    String stringExtra6 = intentM21282.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                    boolean booleanExtra7 = intentM21282.getBooleanExtra("eae", false);
                    str3 = str5;
                    boolean booleanExtra8 = intentM21282.getBooleanExtra(str2, false);
                    boolean booleanExtra9 = intentM21282.getBooleanExtra("ewse", true);
                    if (!"exec-script".equals(stringExtra) || !C12826.equals(stringExtra3, stringExtra6) || booleanExtra != booleanExtra7 || booleanExtra2 != booleanExtra8 || booleanExtra3 != booleanExtra9) {
                    }
                } else {
                    str3 = str5;
                }
                str = str;
                strArr = strArr;
                str5 = str3;
            }
            return false;
        }
        str = strM35425;
        str2 = str6;
        strArr = strArrMo20203;
        it = C1654.m40724(context).iterator();
        while (it.hasNext()) {
            intentM21282 = ((C1201) it.next()).m21282();
            if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM21282.getAction())) {
                stringExtra = intentM21282.getStringExtra(str5);
                String stringExtra7 = intentM21282.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                boolean booleanExtra10 = intentM21282.getBooleanExtra("eae", false);
                str3 = str5;
                boolean booleanExtra11 = intentM21282.getBooleanExtra(str2, false);
                boolean booleanExtra12 = intentM21282.getBooleanExtra("ewse", true);
                if (!"exec-script".equals(stringExtra)) {
                    continue;
                }
            } else {
                str3 = str5;
            }
            str = str;
            strArr = strArr;
            str5 = str3;
        }
        return false;
        m35426(str, strArr);
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m35429(Intent intent) {
        String stringExtra = intent.getStringExtra("operation");
        if ("exec-script".equals(stringExtra)) {
            m35426(m35425(stringExtra, intent.getStringExtra(MotionUtils.EASING_TYPE_PATH), intent.getBooleanExtra("eae", false), intent.getBooleanExtra("ewrp", false), intent.getBooleanExtra("ewse", true)), ApplicationC21448.f67649.mo20203("eama", (String[]) null));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m35425(String str, String str2, boolean z, boolean z2, boolean z3) {
        return C16111.m36664(str + ":" + str2 + ":" + z + ":" + z2 + ":" + z3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35426(String str, String[] strArr) {
        ArrayList arrayList;
        if (strArr == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(Arrays.asList(strArr));
        }
        arrayList.remove(str);
        arrayList.add(0, str);
        if (arrayList.size() > 50) {
            arrayList = new ArrayList(arrayList.subList(0, 50));
        }
        ApplicationC21448.f67649.edit().mo27879("eama", (String[]) arrayList.toArray(new String[0])).apply();
    }
}
