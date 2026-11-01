package p067l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XK */
/* JADX INFO: loaded from: classes4.dex */
public final class C22711 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f71600 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final C12068 f71601 = new C12068(new C2593());

    /* JADX INFO: renamed from: ܳ */
    public static String f71602;

    /* JADX INFO: renamed from: ܽ */
    public static C9385 f71603;

    /* JADX INFO: renamed from: ܿ */
    public static boolean f71604;

    /* JADX INFO: renamed from: ᩳ */
    public static C16122 f71605;

    /* JADX INFO: renamed from: ᩻ */
    public static int f71606;

    /* JADX INFO: renamed from: ֫ */
    public static int m50818(int i) {
        return (i == 0 || i == 16777216) ? i : i | (-16777216);
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m50822(String str, String str2) {
        if (str.equals("/") || str2.equals("/")) {
            throw new IllegalArgumentException("Root rule cannot be reordered");
        }
        ArrayList arrayList = new ArrayList(f71605.f47446);
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((C15419) arrayList.get(i3)).f44088.equals(str)) {
                i = i3;
            }
            if (((C15419) arrayList.get(i3)).f44088.equals(str2)) {
                i2 = i3;
            }
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("File access rule no longer exists");
        }
        if (i == i2) {
            return;
        }
        arrayList.add(i2, (C15419) arrayList.remove(i));
        m50825(new C16122(arrayList, false));
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m50823(String str, EnumC8044 enumC8044) {
        ArrayList arrayList = new ArrayList(f71605.f47446);
        for (int i = 0; i < arrayList.size(); i++) {
            C15419 c15419 = (C15419) arrayList.get(i);
            if (c15419.f44088.equals(str)) {
                EnumC8890 enumC8890 = c15419.f44089;
                C12826.requireNonNull(enumC8044);
                arrayList.set(i, new C15419(str, enumC8890, enumC8044, false));
                m50825(new C16122(arrayList, false));
            }
        }
        throw new IllegalArgumentException("File access rule no longer exists");
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m50824(C15419 c15419, EnumC8044 enumC8044) {
        m50836(c15419.f44088);
        ArrayList arrayList = new ArrayList(f71605.f47446);
        String str = c15419.f44088;
        EnumC8890 enumC8890 = c15419.f44089;
        C12826.requireNonNull(enumC8044);
        arrayList.add(0, new C15419(str, enumC8890, enumC8044, false));
        m50825(new C16122(arrayList, false));
    }

    /* JADX INFO: renamed from: ۧ */
    public static synchronized C9385 m50827() {
        List listM27638 = f71601.m27638();
        C9385 c9385 = f71603;
        if (c9385 == null || !c9385.f25638.equals(f71602) || !f71603.f25639.equals(listM27638)) {
            f71603 = f71605.m36708(f71602, listM27638);
        }
        return f71603;
    }

    /* JADX INFO: renamed from: ܳ */
    public static synchronized void m50829(String str) {
        Integer numM50681 = C22622.m50681(str);
        if (numM50681 == null) {
            throw new IllegalArgumentException("Invalid MCP port");
        }
        f71606 = numM50681.intValue();
        ApplicationC21448.f67649.edit().mo27875(numM50681.intValue(), "amp").apply();
    }

    /* JADX INFO: renamed from: ܽ */
    public static synchronized AbstractC17043 m50831() {
        return C18524.m42109(f71602, new String[0]);
    }

    /* JADX INFO: renamed from: ܽ */
    public static synchronized void m50832(String str) {
        if (str.equals("/")) {
            throw new IllegalArgumentException("Root rule cannot be removed");
        }
        ArrayList arrayList = new ArrayList(f71605.f47446);
        C7480.removeIf(arrayList, new C7288(0, str));
        m50825(new C16122(arrayList, false));
    }

    /* JADX INFO: renamed from: ܿ */
    public static synchronized boolean m50834() {
        return f71605.f47445;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static synchronized void m50838() {
        String strM50820;
        int i = ApplicationC21448.f67649.getInt("amp", 8787);
        f71606 = C22622.m50682(i) ? i : 8787;
        String string = ApplicationC21448.f67649.getString("amop", null);
        try {
            if (TextUtils.isEmpty(string)) {
                strM50820 = m50820();
            } else {
                try {
                    strM50820 = C14059.m31907(string, "homePath");
                } catch (C5276 unused) {
                    throw new C16674(EnumC9970.PRIMARY_STORAGE);
                }
            }
            if (m50837(strM50820) != null) {
                strM50820 = m50820();
            }
        } catch (C16674 unused2) {
            strM50820 = m50820();
        }
        f71602 = strM50820;
        String string2 = ApplicationC21448.f67649.getString("amfa", null);
        C16122 c16122M36703 = C16122.m36703(string2);
        f71605 = c16122M36703;
        f71603 = null;
        if (string2 != null && !c16122M36703.f47445 && !string2.equals(c16122M36703.m36707())) {
            ApplicationC21448.f67649.edit().putString("amfa", f71605.m36707()).apply();
        }
        if (string != null && !strM50820.equals(string)) {
            ApplicationC21448.f67649.edit().putString("amop", strM50820).apply();
        }
        f71604 = ApplicationC21448.f67649.getBoolean("amfw", false);
    }

    static {
        m50838();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m50835() {
        return f71606;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15419 m50828(String str) {
        EnumC8890 enumC8890;
        String strM31907 = C14059.m31907(str, MotionUtils.EASING_TYPE_PATH);
        synchronized (C22711.class) {
            m50836(strM31907);
        }
        int i = C3264.f6347[C18524.m42109(strM31907, new String[0]).mo25509().mo10732().m32962().ordinal()];
        if (i == 1) {
            enumC8890 = EnumC8890.FILE;
        } else if (i == 2) {
            enumC8890 = EnumC8890.DIRECTORY;
        } else {
            throw new IllegalArgumentException("Rule target must be an existing file or directory");
        }
        return new C15419(strM31907, enumC8890, EnumC8044.DENY, false);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m50836(String str) {
        if (C16122.m36705(str, f71602, f71601.m27638())) {
            throw new IllegalArgumentException("File access rule is shadowed by Home or managed paths");
        }
        Iterator it = f71605.f47446.iterator();
        while (it.hasNext()) {
            if (((C15419) it.next()).f44088.equals(str)) {
                throw new IllegalArgumentException("Duplicate file access rule path");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50825(C16122 c16122) {
        ApplicationC21448.f67649.edit().putString("amfa", c16122.m36707()).apply();
        f71605 = c16122;
        f71603 = null;
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m50830() {
        return f71604;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m50819(Context context, int i) {
        int iM50818 = m50818(i);
        if (iM50818 != 0 && iM50818 != 16777216) {
            return iM50818;
        }
        return C22553.m50541(new ContextThemeWrapper(context, C19552.m44401()).getTheme(), iM50818 == 16777216 ? R.attr.MT_Protector : R.attr.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50826(boolean z, boolean z2) {
        f71604 = z;
        ApplicationC21448.f67649.edit().putBoolean("amfw", z).putBoolean("floating_button_stick_to_edge", z2).apply();
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m50833(String str) {
        String strM50821 = m50821(str);
        AbstractC17043 abstractC17043M42109 = C18524.m42109(strM50821, new String[0]);
        if (!abstractC17043M42109.mo25094()) {
            try {
                abstractC17043M42109.m38666();
                C17548.m39937();
            } catch (Exception unused) {
                throw new C16674(EnumC9970.CREATE_FAILED);
            }
        }
        if (abstractC17043M42109.mo25087()) {
            synchronized (C22711.class) {
                f71602 = strM50821;
                ApplicationC21448.f67649.edit().putString("amop", strM50821).apply();
            }
            return;
        }
        throw new C16674(EnumC9970.CREATE_FAILED);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50821(String str) {
        String strM31907;
        if (TextUtils.isEmpty(str)) {
            strM31907 = m50820();
        } else {
            try {
                strM31907 = C14059.m31907(str, "homePath");
            } catch (C5276 unused) {
                throw new C16674(EnumC9970.PRIMARY_STORAGE);
            }
        }
        EnumC9970 enumC9970M50837 = m50837(strM31907);
        if (enumC9970M50837 == null) {
            return strM31907;
        }
        throw new C16674(enumC9970M50837);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static EnumC9970 m50837(String str) {
        Iterator it = f71601.m27638().iterator();
        while (it.hasNext()) {
            if (C14059.m31906(str, (String) it.next())) {
                return EnumC9970.MANAGED_PATH;
            }
        }
        if (C14059.m31905(str)) {
            return EnumC9970.ANDROID_DATA;
        }
        if (!C18524.m42130(str)) {
            return EnumC9970.PRIMARY_STORAGE;
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        if (!abstractC17043M42109.mo25094() || abstractC17043M42109.mo25087()) {
            return null;
        }
        return EnumC9970.FILE;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50820() {
        return C18524.m42128(C17853.f53287.m38684("MT2").m38684("mcp").mo25505());
    }
}
