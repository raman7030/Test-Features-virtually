package l;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V16Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0483 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f2087;

    /* JADX INFO: renamed from: ᩴܿ᩸, reason: not valid java name and contains not printable characters */
    public static int f2088;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f2089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f2091;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f2092 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f2093 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f2090 = -1;

    /* JADX INFO: renamed from: ֫ۢ᩵, reason: not valid java name and contains not printable characters */
    public static void m2120(Object obj, Object obj2) {
        ((C18237) obj).m42491((String) obj2);
    }

    /* JADX INFO: renamed from: ۘ֫ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2121() {
        return true;
    }

    /* JADX INFO: renamed from: ۚۙ᩻, reason: not valid java name and contains not printable characters */
    public static C3059 m2122(Object obj, Object obj2) {
        return C3059.m9363((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۛܿ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m2123(Object obj) {
        return ((Iterator) obj).hasNext();
    }

    /* JADX INFO: renamed from: ۢ֡ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m2124(Object obj) {
        return ((DialogInterfaceC0206) obj).m1442();
    }

    /* JADX INFO: renamed from: ۢۖܶ, reason: not valid java name and contains not printable characters */
    public static void m2125(Object obj) {
        ((AbstractActivityC3346) obj).m10232();
    }

    /* JADX INFO: renamed from: ۨۙ᩷, reason: not valid java name and contains not printable characters */
    public static String m2126(Object obj) {
        return ((InterfaceC5471) obj).getName();
    }

    /* JADX INFO: renamed from: ܺۗܽ, reason: not valid java name and contains not printable characters */
    public static int m2127(int i, Object obj) {
        return C15972.m37744(i, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ܽ᩻᩵, reason: not valid java name and contains not printable characters */
    public static String m2128(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܿܽۛ, reason: not valid java name and contains not printable characters */
    public static InputStream m2129(Object obj, Object obj2) {
        return ((C19697) obj).m45390((String) obj2);
    }

    /* JADX INFO: renamed from: ܿ᩹۠, reason: not valid java name and contains not printable characters */
    public static C19258 m2130(Object obj) {
        return ((InterfaceC13223) obj).buildDialog();
    }

    /* JADX INFO: renamed from: ᩳۛ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m2131(Object obj) {
        return ((C23881) obj).m52607();
    }

    /* JADX INFO: renamed from: ᩵ܺ֨, reason: not valid java name and contains not printable characters */
    public static EditText m2132(Object obj) {
        return ((TextInputLayout) obj).getEditText();
    }

    /* JADX INFO: renamed from: ᩵ܿᩳ, reason: not valid java name and contains not printable characters */
    public static byte[] m2133(Object obj, Object obj2) {
        return ((String) obj).getBytes((Charset) obj2);
    }

    /* JADX INFO: renamed from: ᩹᩵ۚ, reason: not valid java name and contains not printable characters */
    public static String m2134(Object obj) {
        return ((C16709) obj).m39295();
    }

    /* JADX INFO: renamed from: ᩺᩸֡, reason: not valid java name and contains not printable characters */
    public static void m2135(Object obj, boolean z) {
        ((C19258) obj).m44428(z);
    }

    public C0483(int i) {
        int i2 = f2087;
        f2087 = i2 + 1;
        this.f2089 = i2;
        this.f2091 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2139(C15094 c15094) {
        ArrayList arrayList = this.f2092;
        if (arrayList.contains(c15094)) {
            return false;
        }
        arrayList.add(c15094);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f2091;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM9831 = C3200.m9831(this.f2089, "] <", sb);
        for (C15094 c15094 : this.f2092) {
            StringBuilder sbM19190 = C7166.m19190(strM9831, " ");
            sbM19190.append(c15094.m35751());
            strM9831 = sbM19190.toString();
        }
        return C16014.m37867(strM9831, " >");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2137(int i, C0483 c0483) {
        int i2 = c0483.f2089;
        for (C15094 c15094 : this.f2092) {
            c0483.m2139(c15094);
            if (i == 0) {
                c15094.f46152 = i2;
            } else {
                c15094.f46125 = i2;
            }
        }
        this.f2090 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m2136(C17212 c17212, int i) {
        int iM40489;
        int iM404810;
        ArrayList arrayList = this.f2092;
        if (arrayList.size() == 0) {
            return 0;
        }
        C21446 c21446 = (C21446) ((C15094) arrayList.get(0)).f46132;
        c17212.m40505();
        c21446.mo7759(c17212, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C15094) arrayList.get(i2)).mo7759(c17212, false);
        }
        if (i == 0 && c21446.f69054 > 0) {
            C3807.m11489(c21446, c17212, arrayList, 0);
        }
        if (i == 1 && c21446.f69044 > 0) {
            C3807.m11489(c21446, c17212, arrayList, 1);
        }
        try {
            c17212.m40506();
        } catch (Exception unused) {
        }
        this.f2093 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C15094 c15094 = (C15094) arrayList.get(i3);
            C19535 c19535 = new C19535();
            new WeakReference(c15094);
            C17212.m40489(c15094.f46141);
            C17212.m40489(c15094.f46161);
            C17212.m40489(c15094.f46159);
            C17212.m40489(c15094.f46133);
            C17212.m40489(c15094.f46126);
            this.f2093.add(c19535);
        }
        if (i == 0) {
            iM40489 = C17212.m40489(c21446.f46141);
            iM404810 = C17212.m40489(c21446.f46159);
            c17212.m40505();
        } else {
            iM40489 = C17212.m40489(c21446.f46161);
            iM404810 = C17212.m40489(c21446.f46133);
            c17212.m40505();
        }
        return iM404810 - iM40489;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2138(ArrayList arrayList) {
        int size = this.f2092.size();
        if (this.f2090 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0483 c0483 = (C0483) arrayList.get(i);
                if (this.f2090 == c0483.f2089) {
                    m2137(this.f2091, c0483);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
