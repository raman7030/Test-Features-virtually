package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.widget.TextView;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N22M */
/* JADX INFO: loaded from: classes.dex */
public class C3245 {

    /* JADX INFO: renamed from: ۘܳ᩻, reason: not valid java name and contains not printable characters */
    public static int f10203;

    /* JADX INFO: renamed from: ֡᩷ܶ, reason: not valid java name and contains not printable characters */
    public static void m9917(Object obj, Object obj2) {
        ((AbstractC15440) obj).m36502((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ֨᩹ܿ, reason: not valid java name and contains not printable characters */
    public static void m9918(Object obj, int i) {
        ((TextView) obj).setTextColor(i);
    }

    /* JADX INFO: renamed from: ۙܶ᩶, reason: not valid java name and contains not printable characters */
    public static Boolean m9921(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۛ۠۬, reason: not valid java name and contains not printable characters */
    public static void m9922(Object obj, int i) {
        ((DataOutputStream) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ۢۗܽ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9923(Object obj, Object obj2) {
        return ((StringBuilder) obj).append((String) obj2);
    }

    /* JADX INFO: renamed from: ۧܰ۟, reason: not valid java name and contains not printable characters */
    public static String m9924(int i, Object obj) {
        return C4925.m14306(i, (Object[]) obj);
    }

    /* JADX INFO: renamed from: ۨۨܳ, reason: not valid java name and contains not printable characters */
    public static int m9925() {
        return 0;
    }

    /* JADX INFO: renamed from: ۨ᩹ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m9926(Object obj) {
        return ((AbstractC15440) obj).mo23120();
    }

    /* JADX INFO: renamed from: ۬᩵᩸, reason: not valid java name and contains not printable characters */
    public static String m9927(int i, Object obj) {
        return C19370.m44628(i, (String) obj);
    }

    /* JADX INFO: renamed from: ܶ֫ۜ, reason: not valid java name and contains not printable characters */
    public static C17222 m9928() {
        return C17222.m40521();
    }

    /* JADX INFO: renamed from: ᩳ᩺᩺, reason: not valid java name and contains not printable characters */
    public static byte[] m9929(Object obj, Object obj2, Object obj3) {
        return ((C18090) obj).m42193((C3545) obj2, (C19277) obj3);
    }

    /* JADX INFO: renamed from: ᩴۤ᩹, reason: not valid java name and contains not printable characters */
    public static InputStream m9930(Object obj) {
        return ((AbstractC15440) obj).mo27926();
    }

    /* JADX INFO: renamed from: ᩶᩵᩻, reason: not valid java name and contains not printable characters */
    public static Integer m9931(int i) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩷ۢᩴ, reason: not valid java name and contains not printable characters */
    public static int m9932(Object obj) {
        return ((C12392) obj).m30444();
    }

    /* JADX INFO: renamed from: ᩹ۙۛ, reason: not valid java name and contains not printable characters */
    public static boolean m9933(Object obj, Object obj2) {
        return ((AbstractC3817) obj).m11552((String) obj2);
    }

    /* JADX INFO: renamed from: ᩹ۨ᩹, reason: not valid java name and contains not printable characters */
    public static String m9934(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4656 m9919(AbstractC12719 abstractC12719) {
        C4656 c4656 = new C4656();
        c4656.f14771 = abstractC12719.m30985(c4656.f14771, 1);
        c4656.f14769 = abstractC12719.m30991(c4656.f14769);
        c4656.f14775 = abstractC12719.m30986(c4656.f14775, 3);
        c4656.f14772 = abstractC12719.m30985(c4656.f14772, 4);
        c4656.f14774 = abstractC12719.m30985(c4656.f14774, 5);
        c4656.f14778 = (ColorStateList) abstractC12719.m30986(c4656.f14778, 6);
        c4656.f14777 = abstractC12719.m30988(7, c4656.f14777);
        c4656.f14773 = abstractC12719.m30988(8, c4656.f14773);
        c4656.f14770 = PorterDuff.Mode.valueOf(c4656.f14777);
        switch (c4656.f14771) {
            case -1:
                Parcelable parcelable = c4656.f14775;
                if (parcelable != null) {
                    c4656.f14776 = parcelable;
                    return c4656;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return c4656;
            case 1:
            case 5:
                Parcelable parcelable2 = c4656.f14775;
                if (parcelable2 != null) {
                    c4656.f14776 = parcelable2;
                    return c4656;
                }
                byte[] bArr = c4656.f14769;
                c4656.f14776 = bArr;
                c4656.f14771 = 3;
                c4656.f14772 = 0;
                c4656.f14774 = bArr.length;
                return c4656;
            case 2:
            case 4:
            case 6:
                String str = new String(c4656.f14769, Charset.forName("UTF-16"));
                c4656.f14776 = str;
                if (c4656.f14771 == 2 && c4656.f14773 == null) {
                    c4656.f14773 = str.split(":", -1)[0];
                }
                return c4656;
            case 3:
                c4656.f14776 = c4656.f14769;
                return c4656;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9920(C4656 c4656, AbstractC12719 abstractC12719) {
        abstractC12719.getClass();
        c4656.f14777 = c4656.f14770.name();
        switch (c4656.f14771) {
            case -1:
                c4656.f14775 = (Parcelable) c4656.f14776;
                break;
            case 1:
            case 5:
                c4656.f14775 = (Parcelable) c4656.f14776;
                break;
            case 2:
                c4656.f14769 = ((String) c4656.f14776).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                c4656.f14769 = (byte[]) c4656.f14776;
                break;
            case 4:
            case 6:
                c4656.f14769 = c4656.f14776.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = c4656.f14771;
        if (-1 != i) {
            abstractC12719.m30992(i, 1);
        }
        byte[] bArr = c4656.f14769;
        if (bArr != null) {
            abstractC12719.m30999(bArr);
        }
        Parcelable parcelable = c4656.f14775;
        if (parcelable != null) {
            abstractC12719.m30996(parcelable, 3);
        }
        int i2 = c4656.f14772;
        if (i2 != 0) {
            abstractC12719.m30992(i2, 4);
        }
        int i3 = c4656.f14774;
        if (i3 != 0) {
            abstractC12719.m30992(i3, 5);
        }
        ColorStateList colorStateList = c4656.f14778;
        if (colorStateList != null) {
            abstractC12719.m30996(colorStateList, 6);
        }
        String str = c4656.f14777;
        if (str != null) {
            abstractC12719.m30994(7, str);
        }
        String str2 = c4656.f14773;
        if (str2 != null) {
            abstractC12719.m30994(8, str2);
        }
    }
}
