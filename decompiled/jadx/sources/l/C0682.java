package l;

import android.os.Build;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֡᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1SD */
/* JADX INFO: loaded from: classes2.dex */
public final class C0682 {
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x017d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17574 m2766(String str, boolean z, boolean z2) {
        String[] strArrSplit;
        String str2;
        boolean z3;
        File file;
        String name;
        String[] strArr;
        C19734 c19734;
        ArrayList arrayList;
        String str3;
        int i;
        File file2;
        if (str == null) {
            str = "";
        }
        String str4 = str;
        File file3 = new File(C4925.m14322(), "term/home");
        if (file3.isFile()) {
            file3.delete();
        }
        file3.mkdirs();
        File file4 = new File(C4925.m14322(), "term/tmp");
        if (file4.isFile()) {
            file4.delete();
        }
        file4.mkdirs();
        HashMap map = new HashMap(System.getenv());
        map.put("HOME", file3.getAbsolutePath());
        map.put("TMPDIR", file4.getAbsolutePath());
        C7549 c7549M6880 = z2 ? null : C2094.m6880();
        int i2 = 0;
        if (c7549M6880 == null || !c7549M6880.m20275()) {
            String strM31436 = z ? C12925.m31436(false) : "/system/bin/sh";
            strArrSplit = ((z && strM31436 == null) ? "/system/bin/sh" : strM31436).split("\\s+");
            str2 = strArrSplit[0];
            z3 = true;
        } else {
            if (c7549M6880.f23326 != null) {
                try {
                    C4211.m12707(c7549M6880);
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                file = new File(C4925.m14335().getDataDir(), "home");
            } else {
                file = new File(C4925.m14322().getParentFile(), "home");
            }
            try {
                if (file.exists()) {
                    if (!C17229.isSymbolicLink(C7850.toPath(file))) {
                        if (file.isDirectory()) {
                            file.renameTo(new File(file.getPath() + "_old"));
                        } else {
                            file.delete();
                        }
                        Os.symlink(new File(C4925.m14322(), "term/home").getPath(), file.getPath());
                    }
                    File fileM20276 = c7549M6880.m20276();
                    File file5 = new File(C4925.m14322(), "term/lib");
                    File file6 = new File(fileM20276, "bash");
                    name = file6.getName();
                    if (z) {
                        strArr = new String[]{name, "-c", "su"};
                    } else {
                        strArr = new String[]{name};
                    }
                    map.put("LANG", "en_US.UTF-8");
                    map.put("TERM", "xterm-256color");
                    map.put("SHELL", file6.getAbsolutePath());
                    map.put("PREFIX", new File(C4925.m14322(), "term").getAbsolutePath());
                    map.put("PROMPT_COMMAND", "history -a");
                    map.put("PWD", str4);
                    C14751.m35057("PATH", fileM20276.getAbsolutePath(), map);
                    C14751.m35057("LD_LIBRARY_PATH", file5.getAbsolutePath(), map);
                    c19734 = new C19734();
                    c19734.f63759 = "su";
                    arrayList = new ArrayList();
                    c19734.f63758 = arrayList;
                    String strM31437 = C12925.m31436(true);
                    str3 = strM31437 != null ? strM31437 : "su";
                    if (!str3.isEmpty()) {
                        String[] strArrSplit2 = str3.split("\\s+");
                        c19734.f63759 = strArrSplit2[0];
                        Collections.addAll(arrayList, strArrSplit2);
                        arrayList.remove(0);
                    }
                    for (String str5 : System.getenv("PATH").split(":")) {
                        file2 = new File(str5, c19734.f63759);
                        if (!file2.exists() && file2.canExecute()) {
                            c19734.f63759 = file2.getAbsolutePath();
                            break;
                        }
                    }
                    if ((!c19734.f63759.equals("magisk") || c19734.f63759.endsWith("/magisk")) && !c19734.f63758.isEmpty()) {
                        c19734.f63759 += " " + ((String) c19734.f63758.get(0));
                        c19734.f63758.remove(0);
                    }
                    System.out.println(c19734);
                    map.put("SU_COMMAND", c19734.f63759);
                    map.put("SU_ARGUMENTS", C9679.m24612((Collection) c19734.f63758, ' '));
                    strArrSplit = strArr;
                    str2 = name;
                    z3 = false;
                } else {
                    Os.symlink(new File(C4925.m14322(), "term/home").getPath(), file.getPath());
                }
            } catch (ErrnoException unused2) {
            }
            File fileM20277 = c7549M6880.m20276();
            File file7 = new File(C4925.m14322(), "term/lib");
            File file8 = new File(fileM20277, "bash");
            name = file8.getName();
            if (z) {
                strArr = new String[]{name, "-c", "su"};
            } else {
                strArr = new String[]{name};
            }
            map.put("LANG", "en_US.UTF-8");
            map.put("TERM", "xterm-256color");
            map.put("SHELL", file8.getAbsolutePath());
            map.put("PREFIX", new File(C4925.m14322(), "term").getAbsolutePath());
            map.put("PROMPT_COMMAND", "history -a");
            map.put("PWD", str4);
            C14751.m35057("PATH", fileM20277.getAbsolutePath(), map);
            C14751.m35057("LD_LIBRARY_PATH", file7.getAbsolutePath(), map);
            c19734 = new C19734();
            c19734.f63759 = "su";
            arrayList = new ArrayList();
            c19734.f63758 = arrayList;
            String strM31438 = C12925.m31436(true);
            if (strM31438 != null) {
            }
            if (!str3.isEmpty()) {
                String[] strArrSplit3 = str3.split("\\s+");
                c19734.f63759 = strArrSplit3[0];
                Collections.addAll(arrayList, strArrSplit3);
                arrayList.remove(0);
            }
            while (i < r0) {
                file2 = new File(str5, c19734.f63759);
                if (!file2.exists()) {
                }
            }
            if (!c19734.f63759.equals("magisk")) {
                c19734.f63759 += " " + ((String) c19734.f63758.get(0));
                c19734.f63758.remove(0);
            } else {
                c19734.f63759 += " " + ((String) c19734.f63758.get(0));
                c19734.f63758.remove(0);
            }
            System.out.println(c19734);
            map.put("SU_COMMAND", c19734.f63759);
            map.put("SU_ARGUMENTS", C9679.m24612((Collection) c19734.f63758, ' '));
            strArrSplit = strArr;
            str2 = name;
            z3 = false;
        }
        String[] strArr2 = new String[map.size()];
        for (Map.Entry entry : map.entrySet()) {
            strArr2[i2] = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
            i2++;
        }
        return new C17574(str2, str4, strArrSplit, strArr2, z3, new C18986());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2767(final C17574 c17574) {
        if (c17574 == null || !c17574.m41098()) {
            return;
        }
        if (c17574.m41095().endsWith("/bash")) {
            c17574.m8717("history -d -1 && history -w; exit\r");
            final long jCurrentTimeMillis = System.currentTimeMillis();
            new Thread(new Runnable() { // from class: l.ᩴ᩸ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    while (true) {
                        C17574 c17575 = c17574;
                        if (!c17575.m41098()) {
                            return;
                        }
                        if (System.currentTimeMillis() - jCurrentTimeMillis > 500) {
                            c17575.m41097();
                            return;
                        }
                        SystemClock.sleep(5L);
                    }
                }
            }).start();
            return;
        }
        c17574.m41097();
    }
}
