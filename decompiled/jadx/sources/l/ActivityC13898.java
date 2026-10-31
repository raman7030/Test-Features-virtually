package l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import bin.mt.plus.ShortcutActivity;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U92X */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC13898 extends ActivityC10582 {
    @Override // android.app.Activity
    public final void finish() {
        if (isTaskRoot()) {
            finishAndRemoveTask();
            if (((int) C5378.stream(((ActivityManager) getSystemService("activity")).getAppTasks()).filter(new C23134(1)).count()) == 1) {
                System.out.println("Kill self process");
                C9255.m23756();
                Process.killProcess(Process.myPid());
                return;
            }
            return;
        }
        super.finish();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33308(ActivityManager.AppTask appTask) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return appTask.getTaskInfo().isRunning;
        }
        return i < 23 || appTask.getTaskInfo().topActivity != null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33309(Context context, Intent intent) {
        String str;
        String str2;
        String[] strArr;
        Iterator it;
        Intent intentM19333;
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
        String strM33306 = m33306(stringExtra2, stringExtra3, booleanExtra, booleanExtra2, booleanExtra3);
        String[] strArrMo18255 = ApplicationC20075.f65008.mo18255("eama", (String[]) null);
        if (strArrMo18255 != null && Arrays.asList(strArrMo18255).contains(strM33306)) {
            m33307(strM33306, strArrMo18255);
            return true;
        }
        if (ShortcutActivity.m141()) {
            Iterator it3 = C16362.m38519(context).iterator();
            while (it3.hasNext()) {
                Intent intentM19334 = ((C7232) it3.next()).m19333();
                if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM19334.getAction())) {
                    String stringExtra4 = intentM19334.getStringExtra("operation");
                    it2 = it3;
                    String stringExtra5 = intentM19334.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                    str = strM33306;
                    strArr = strArrMo18255;
                    boolean booleanExtra4 = intentM19334.getBooleanExtra("eae", false);
                    boolean booleanExtra5 = intentM19334.getBooleanExtra(str6, false);
                    str4 = str6;
                    boolean booleanExtra6 = intentM19334.getBooleanExtra("ewse", true);
                    if (!"exec-script".equals(stringExtra4) || !C11003.equals(stringExtra3, stringExtra5) || booleanExtra != booleanExtra4 || booleanExtra2 != booleanExtra5 || booleanExtra3 != booleanExtra6) {
                    }
                } else {
                    str = strM33306;
                    str4 = str6;
                    it2 = it3;
                    strArr = strArrMo18255;
                }
                it3 = it2;
                strM33306 = str;
                strArrMo18255 = strArr;
                str6 = str4;
            }
            str = strM33306;
            str2 = str6;
            strArr = strArrMo18255;
            it = C16362.m38507(context).iterator();
            while (it.hasNext()) {
                intentM19333 = ((C7232) it.next()).m19333();
                if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM19333.getAction())) {
                    stringExtra = intentM19333.getStringExtra(str5);
                    String stringExtra6 = intentM19333.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                    boolean booleanExtra7 = intentM19333.getBooleanExtra("eae", false);
                    str3 = str5;
                    boolean booleanExtra8 = intentM19333.getBooleanExtra(str2, false);
                    boolean booleanExtra9 = intentM19333.getBooleanExtra("ewse", true);
                    if (!"exec-script".equals(stringExtra) || !C11003.equals(stringExtra3, stringExtra6) || booleanExtra != booleanExtra7 || booleanExtra2 != booleanExtra8 || booleanExtra3 != booleanExtra9) {
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
        str = strM33306;
        str2 = str6;
        strArr = strArrMo18255;
        it = C16362.m38507(context).iterator();
        while (it.hasNext()) {
            intentM19333 = ((C7232) it.next()).m19333();
            if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM19333.getAction())) {
                stringExtra = intentM19333.getStringExtra(str5);
                String stringExtra7 = intentM19333.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                boolean booleanExtra10 = intentM19333.getBooleanExtra("eae", false);
                str3 = str5;
                boolean booleanExtra11 = intentM19333.getBooleanExtra(str2, false);
                boolean booleanExtra12 = intentM19333.getBooleanExtra("ewse", true);
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
        m33307(str, strArr);
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m33310(Intent intent) {
        String stringExtra = intent.getStringExtra("operation");
        if ("exec-script".equals(stringExtra)) {
            m33307(m33306(stringExtra, intent.getStringExtra(MotionUtils.EASING_TYPE_PATH), intent.getBooleanExtra("eae", false), intent.getBooleanExtra("ewrp", false), intent.getBooleanExtra("ewse", true)), ApplicationC20075.f65008.mo18255("eama", (String[]) null));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33306(String str, String str2, boolean z, boolean z2, boolean z3) {
        return C14460.m34530(str + ":" + str2 + ":" + z + ":" + z2 + ":" + z3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33307(String str, String[] strArr) {
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
        ApplicationC20075.f65008.edit().mo25857("eama", (String[]) arrayList.toArray(new String[0])).apply();
    }
}
