package p067l;

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
public final class C3017 {
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x017d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
    /* JADX INFO: renamed from: ֫ */
    public static C19071 m5105(String str, boolean z, boolean z2) {
        String[] strArrSplit;
        String str2;
        boolean z3;
        File file;
        String name;
        String[] strArr;
        C21124 c21124;
        ArrayList arrayList;
        String str3;
        int i;
        File file2;
        if (str == null) {
            str = "";
        }
        String str4 = str;
        File file3 = new File(C7050.m16219(), "term/home");
        if (file3.isFile()) {
            file3.delete();
        }
        file3.mkdirs();
        File file4 = new File(C7050.m16219(), "term/tmp");
        if (file4.isFile()) {
            file4.delete();
        }
        file4.mkdirs();
        HashMap map = new HashMap(System.getenv());
        map.put("HOME", file3.getAbsolutePath());
        map.put("TMPDIR", file4.getAbsolutePath());
        C9543 c9543M9006 = z2 ? null : C4359.m9006();
        int i2 = 0;
        if (c9543M9006 == null || !c9543M9006.m22251()) {
            String strM33522 = z ? C14652.m33522(false) : "/system/bin/sh";
            strArrSplit = ((z && strM33522 == null) ? "/system/bin/sh" : strM33522).split("\\s+");
            str2 = strArrSplit[0];
            z3 = true;
        } else {
            if (c9543M9006.f26238 != null) {
                try {
                    C6371.m14583(c9543M9006);
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                file = new File(C7050.m16232().getDataDir(), "home");
            } else {
                file = new File(C7050.m16219().getParentFile(), "home");
            }
            try {
                if (file.exists()) {
                    if (!C18743.isSymbolicLink(C9829.toPath(file))) {
                        if (file.isDirectory()) {
                            file.renameTo(new File(file.getPath() + "_old"));
                        } else {
                            file.delete();
                        }
                        Os.symlink(new File(C7050.m16219(), "term/home").getPath(), file.getPath());
                    }
                    File fileM22252 = c9543M9006.m22252();
                    File file5 = new File(C7050.m16219(), "term/lib");
                    File file6 = new File(fileM22252, "bash");
                    name = file6.getName();
                    if (z) {
                        strArr = new String[]{name, "-c", "su"};
                    } else {
                        strArr = new String[]{name};
                    }
                    map.put("LANG", "en_US.UTF-8");
                    map.put("TERM", "xterm-256color");
                    map.put("SHELL", file6.getAbsolutePath());
                    map.put("PREFIX", new File(C7050.m16219(), "term").getAbsolutePath());
                    map.put("PROMPT_COMMAND", "history -a");
                    map.put("PWD", str4);
                    C16388.m37204("PATH", fileM22252.getAbsolutePath(), map);
                    C16388.m37204("LD_LIBRARY_PATH", file5.getAbsolutePath(), map);
                    c21124 = new C21124();
                    c21124.f66390 = "su";
                    arrayList = new ArrayList();
                    c21124.f66389 = arrayList;
                    String strM33523 = C14652.m33522(true);
                    str3 = strM33523 != null ? strM33523 : "su";
                    if (!str3.isEmpty()) {
                        String[] strArrSplit2 = str3.split("\\s+");
                        c21124.f66390 = strArrSplit2[0];
                        Collections.addAll(arrayList, strArrSplit2);
                        arrayList.remove(0);
                    }
                    for (String str5 : System.getenv("PATH").split(":")) {
                        file2 = new File(str5, c21124.f66390);
                        if (!file2.exists() && file2.canExecute()) {
                            c21124.f66390 = file2.getAbsolutePath();
                            break;
                        }
                    }
                    if ((!c21124.f66390.equals("magisk") || c21124.f66390.endsWith("/magisk")) && !c21124.f66389.isEmpty()) {
                        c21124.f66390 += " " + ((String) c21124.f66389.get(0));
                        c21124.f66389.remove(0);
                    }
                    System.out.println(c21124);
                    map.put("SU_COMMAND", c21124.f66390);
                    map.put("SU_ARGUMENTS", C11567.m26626((Collection) c21124.f66389, ' '));
                    strArrSplit = strArr;
                    str2 = name;
                    z3 = false;
                } else {
                    Os.symlink(new File(C7050.m16219(), "term/home").getPath(), file.getPath());
                }
            } catch (ErrnoException unused2) {
            }
            File fileM22253 = c9543M9006.m22252();
            File file7 = new File(C7050.m16219(), "term/lib");
            File file8 = new File(fileM22253, "bash");
            name = file8.getName();
            if (z) {
                strArr = new String[]{name, "-c", "su"};
            } else {
                strArr = new String[]{name};
            }
            map.put("LANG", "en_US.UTF-8");
            map.put("TERM", "xterm-256color");
            map.put("SHELL", file8.getAbsolutePath());
            map.put("PREFIX", new File(C7050.m16219(), "term").getAbsolutePath());
            map.put("PROMPT_COMMAND", "history -a");
            map.put("PWD", str4);
            C16388.m37204("PATH", fileM22253.getAbsolutePath(), map);
            C16388.m37204("LD_LIBRARY_PATH", file7.getAbsolutePath(), map);
            c21124 = new C21124();
            c21124.f66390 = "su";
            arrayList = new ArrayList();
            c21124.f66389 = arrayList;
            String strM33524 = C14652.m33522(true);
            if (strM33524 != null) {
            }
            if (!str3.isEmpty()) {
                String[] strArrSplit3 = str3.split("\\s+");
                c21124.f66390 = strArrSplit3[0];
                Collections.addAll(arrayList, strArrSplit3);
                arrayList.remove(0);
            }
            while (i < r0) {
                file2 = new File(str5, c21124.f66390);
                if (!file2.exists()) {
                }
            }
            if (!c21124.f66390.equals("magisk")) {
                c21124.f66390 += " " + ((String) c21124.f66389.get(0));
                c21124.f66389.remove(0);
            } else {
                c21124.f66390 += " " + ((String) c21124.f66389.get(0));
                c21124.f66389.remove(0);
            }
            System.out.println(c21124);
            map.put("SU_COMMAND", c21124.f66390);
            map.put("SU_ARGUMENTS", C11567.m26626((Collection) c21124.f66389, ' '));
            strArrSplit = strArr;
            str2 = name;
            z3 = false;
        }
        String[] strArr2 = new String[map.size()];
        for (Map.Entry entry : map.entrySet()) {
            strArr2[i2] = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
            i2++;
        }
        return new C19071(str2, str4, strArrSplit, strArr2, z3, new C20413());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5106(final C19071 c19071) {
        if (c19071 == null || !c19071.m43344()) {
            return;
        }
        if (c19071.m43341().endsWith("/bash")) {
            c19071.m10778("history -d -1 && history -w; exit\r");
            final long jCurrentTimeMillis = System.currentTimeMillis();
            new Thread(new Runnable() { // from class: l.ᩴ᩸ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    while (true) {
                        C19071 c19072 = c19071;
                        if (!c19072.m43344()) {
                            return;
                        }
                        if (System.currentTimeMillis() - jCurrentTimeMillis > 500) {
                            c19072.m43343();
                            return;
                        }
                        SystemClock.sleep(5L);
                    }
                }
            }).start();
            return;
        }
        c19071.m43343();
    }
}
