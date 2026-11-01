package p067l;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܶ */
/* JADX INFO: compiled from: V16Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0866 {

    /* JADX INFO: renamed from: ܳ */
    public static int f4860;

    /* JADX INFO: renamed from: ᩴܿ᩸, reason: not valid java name and contains not printable characters */
    public static int f81837;

    /* JADX INFO: renamed from: ֫ */
    public int f4861;

    /* JADX INFO: renamed from: ܽ */
    public int f4863;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f4864 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f4865 = null;

    /* JADX INFO: renamed from: ۧ */
    public int f4862 = -1;

    /* JADX INFO: renamed from: ֫ۢ᩵, reason: not valid java name and contains not printable characters */
    public static void m55644(Object obj, Object obj2) {
        ((C19701) obj).m44750((String) obj2);
    }

    /* JADX INFO: renamed from: ۘ֫ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m55645() {
        return true;
    }

    /* JADX INFO: renamed from: ۚۙ᩻, reason: not valid java name and contains not printable characters */
    public static C5276 m55646(Object obj, Object obj2) {
        return C5276.m11405((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۛܿ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m55647(Object obj) {
        return ((Iterator) obj).hasNext();
    }

    /* JADX INFO: renamed from: ۢ֡ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m55648(Object obj) {
        return ((DialogInterfaceC2564) obj).m3855();
    }

    /* JADX INFO: renamed from: ۢۖܶ, reason: not valid java name and contains not printable characters */
    public static void m55649(Object obj) {
        ((AbstractActivityC5549) obj).m12268();
    }

    /* JADX INFO: renamed from: ۨۙ᩷, reason: not valid java name and contains not printable characters */
    public static String m55650(Object obj) {
        return ((InterfaceC7568) obj).getName();
    }

    /* JADX INFO: renamed from: ܺۗܽ, reason: not valid java name and contains not printable characters */
    public static int m55651(int i, Object obj) {
        return C17548.m39928(i, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ܽ᩻᩵, reason: not valid java name and contains not printable characters */
    public static String m55652(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܿܽۛ, reason: not valid java name and contains not printable characters */
    public static InputStream m55653(Object obj, Object obj2) {
        return ((C21089) obj).m47687((String) obj2);
    }

    /* JADX INFO: renamed from: ܿ᩹۠, reason: not valid java name and contains not printable characters */
    public static C20671 m55654(Object obj) {
        return ((InterfaceC14936) obj).buildDialog();
    }

    /* JADX INFO: renamed from: ᩳۛ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m55655(Object obj) {
        return ((C25065) obj).m55016();
    }

    /* JADX INFO: renamed from: ᩵ܺ֨, reason: not valid java name and contains not printable characters */
    public static EditText m55656(Object obj) {
        return ((TextInputLayout) obj).getEditText();
    }

    /* JADX INFO: renamed from: ᩵ܿᩳ, reason: not valid java name and contains not printable characters */
    public static byte[] m55657(Object obj, Object obj2) {
        return ((String) obj).getBytes((Charset) obj2);
    }

    /* JADX INFO: renamed from: ᩹᩵ۚ, reason: not valid java name and contains not printable characters */
    public static String m55658(Object obj) {
        return ((C18249) obj).m41531();
    }

    /* JADX INFO: renamed from: ᩺᩸֡, reason: not valid java name and contains not printable characters */
    public static void m55659(Object obj, boolean z) {
        ((C20671) obj).m46722(z);
    }

    public C0866(int i) {
        int i2 = f4860;
        f4860 = i2 + 1;
        this.f4861 = i2;
        this.f4863 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m4506(C1591 c1591) {
        ArrayList arrayList = this.f4864;
        if (arrayList.contains(c1591)) {
            return false;
        }
        arrayList.add(c1591);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f4863;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM11876 = C5410.m11876(this.f4861, "] <", sb);
        for (C1591 c1591 : this.f4864) {
            StringBuilder sbM21133 = C9179.m21133(strM11876, " ");
            sbM21133.append(c1591.m37909());
            strM11876 = sbM21133.toString();
        }
        return C17588.m40053(strM11876, " >");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4504(int i, C0866 c0866) {
        int i2 = c0866.f4861;
        for (C1591 c1591 : this.f4864) {
            c0866.m4506(c1591);
            if (i == 0) {
                c1591.f49272 = i2;
            } else {
                c1591.f49245 = i2;
            }
        }
        this.f4862 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m4503(C1696 c1696, int i) {
        int iM42736;
        int iM42737;
        ArrayList arrayList = this.f4864;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1906 c1906 = (C1906) ((C1591) arrayList.get(0)).f49252;
        c1696.m42752();
        c1906.mo9822(c1696, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C1591) arrayList.get(i2)).mo9822(c1696, false);
        }
        if (i == 0 && c1906.f71752 > 0) {
            C1031.m13425(c1906, c1696, arrayList, 0);
        }
        if (i == 1 && c1906.f71742 > 0) {
            C1031.m13425(c1906, c1696, arrayList, 1);
        }
        try {
            c1696.m42753();
        } catch (Exception unused) {
        }
        this.f4865 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C1591 c1591 = (C1591) arrayList.get(i3);
            C1811 c1811 = new C1811();
            new WeakReference(c1591);
            C1696.m42736(c1591.f49261);
            C1696.m42736(c1591.f49281);
            C1696.m42736(c1591.f49279);
            C1696.m42736(c1591.f49253);
            C1696.m42736(c1591.f49246);
            this.f4865.add(c1811);
        }
        if (i == 0) {
            iM42736 = C1696.m42736(c1906.f49261);
            iM42737 = C1696.m42736(c1906.f49279);
            c1696.m42752();
        } else {
            iM42736 = C1696.m42736(c1906.f49281);
            iM42737 = C1696.m42736(c1906.f49253);
            c1696.m42752();
        }
        return iM42737 - iM42736;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4505(ArrayList arrayList) {
        int size = this.f4864.size();
        if (this.f4862 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0866 c0866 = (C0866) arrayList.get(i);
                if (this.f4862 == c0866.f4861) {
                    m4504(this.f4863, c0866);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
