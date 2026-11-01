package p067l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.widget.TextView;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۗ۬ */
/* JADX INFO: compiled from: N22M */
/* JADX INFO: loaded from: classes.dex */
public class C1003 {

    /* JADX INFO: renamed from: ۘܳ᩻, reason: not valid java name and contains not printable characters */
    public static int f81929;

    /* JADX INFO: renamed from: ֡᩷ܶ, reason: not valid java name and contains not printable characters */
    public static void m56117(Object obj, Object obj2) {
        ((AbstractC17043) obj).m38660((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ֨᩹ܿ, reason: not valid java name and contains not printable characters */
    public static void m56118(Object obj, int i) {
        ((TextView) obj).setTextColor(i);
    }

    /* JADX INFO: renamed from: ۙܶ᩶, reason: not valid java name and contains not printable characters */
    public static Boolean m56119(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۛ۠۬, reason: not valid java name and contains not printable characters */
    public static void m56120(Object obj, int i) {
        ((DataOutputStream) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ۢۗܽ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m56121(Object obj, Object obj2) {
        return ((StringBuilder) obj).append((String) obj2);
    }

    /* JADX INFO: renamed from: ۧܰ۟, reason: not valid java name and contains not printable characters */
    public static String m56122(int i, Object obj) {
        return C7050.m16203(i, (Object[]) obj);
    }

    /* JADX INFO: renamed from: ۨۨܳ, reason: not valid java name and contains not printable characters */
    public static int m56123() {
        return 0;
    }

    /* JADX INFO: renamed from: ۨ᩹ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m56124(Object obj) {
        return ((AbstractC17043) obj).mo25094();
    }

    /* JADX INFO: renamed from: ۬᩵᩸, reason: not valid java name and contains not printable characters */
    public static String m56125(int i, Object obj) {
        return C20778.m46922(i, (String) obj);
    }

    /* JADX INFO: renamed from: ܶ֫ۜ, reason: not valid java name and contains not printable characters */
    public static C18736 m56126() {
        return C18736.m42768();
    }

    /* JADX INFO: renamed from: ᩳ᩺᩺, reason: not valid java name and contains not printable characters */
    public static byte[] m56127(Object obj, Object obj2, Object obj3) {
        return ((C19561) obj).m44452((C5738) obj2, (C20689) obj3);
    }

    /* JADX INFO: renamed from: ᩴۤ᩹, reason: not valid java name and contains not printable characters */
    public static InputStream m56128(Object obj) {
        return ((AbstractC17043) obj).mo29987();
    }

    /* JADX INFO: renamed from: ᩶᩵᩻, reason: not valid java name and contains not printable characters */
    public static Integer m56129(int i) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩷ۢᩴ, reason: not valid java name and contains not printable characters */
    public static int m56130(Object obj) {
        return ((C14146) obj).m32508();
    }

    /* JADX INFO: renamed from: ᩹ۙۛ, reason: not valid java name and contains not printable characters */
    public static boolean m56131(Object obj, Object obj2) {
        return ((AbstractC5996) obj).m13488((String) obj2);
    }

    /* JADX INFO: renamed from: ᩹ۨ᩹, reason: not valid java name and contains not printable characters */
    public static String m56132(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫ */
    public static C1073 m11965(AbstractC14457 abstractC14457) {
        C1073 c1073 = new C1073();
        c1073.f17601 = abstractC14457.m33065(c1073.f17601, 1);
        c1073.f17599 = abstractC14457.m33071(c1073.f17599);
        c1073.f17605 = abstractC14457.m33066(c1073.f17605, 3);
        c1073.f17602 = abstractC14457.m33065(c1073.f17602, 4);
        c1073.f17604 = abstractC14457.m33065(c1073.f17604, 5);
        c1073.f17608 = (ColorStateList) abstractC14457.m33066(c1073.f17608, 6);
        c1073.f17607 = abstractC14457.m33068(7, c1073.f17607);
        c1073.f17603 = abstractC14457.m33068(8, c1073.f17603);
        c1073.f17600 = PorterDuff.Mode.valueOf(c1073.f17607);
        switch (c1073.f17601) {
            case -1:
                Parcelable parcelable = c1073.f17605;
                if (parcelable != null) {
                    c1073.f17606 = parcelable;
                    return c1073;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return c1073;
            case 1:
            case 5:
                Parcelable parcelable2 = c1073.f17605;
                if (parcelable2 != null) {
                    c1073.f17606 = parcelable2;
                    return c1073;
                }
                byte[] bArr = c1073.f17599;
                c1073.f17606 = bArr;
                c1073.f17601 = 3;
                c1073.f17602 = 0;
                c1073.f17604 = bArr.length;
                return c1073;
            case 2:
            case 4:
            case 6:
                String str = new String(c1073.f17599, Charset.forName("UTF-16"));
                c1073.f17606 = str;
                if (c1073.f17601 == 2 && c1073.f17603 == null) {
                    c1073.f17603 = str.split(":", -1)[0];
                }
                return c1073;
            case 3:
                c1073.f17606 = c1073.f17599;
                return c1073;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11966(C1073 c1073, AbstractC14457 abstractC14457) {
        abstractC14457.getClass();
        c1073.f17607 = c1073.f17600.name();
        switch (c1073.f17601) {
            case -1:
                c1073.f17605 = (Parcelable) c1073.f17606;
                break;
            case 1:
            case 5:
                c1073.f17605 = (Parcelable) c1073.f17606;
                break;
            case 2:
                c1073.f17599 = ((String) c1073.f17606).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                c1073.f17599 = (byte[]) c1073.f17606;
                break;
            case 4:
            case 6:
                c1073.f17599 = c1073.f17606.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = c1073.f17601;
        if (-1 != i) {
            abstractC14457.m33072(i, 1);
        }
        byte[] bArr = c1073.f17599;
        if (bArr != null) {
            abstractC14457.m33079(bArr);
        }
        Parcelable parcelable = c1073.f17605;
        if (parcelable != null) {
            abstractC14457.m33076(parcelable, 3);
        }
        int i2 = c1073.f17602;
        if (i2 != 0) {
            abstractC14457.m33072(i2, 4);
        }
        int i3 = c1073.f17604;
        if (i3 != 0) {
            abstractC14457.m33072(i3, 5);
        }
        ColorStateList colorStateList = c1073.f17608;
        if (colorStateList != null) {
            abstractC14457.m33076(colorStateList, 6);
        }
        String str = c1073.f17607;
        if (str != null) {
            abstractC14457.m33074(7, str);
        }
        String str2 = c1073.f17603;
        if (str2 != null) {
            abstractC14457.m33074(8, str2);
        }
    }
}
