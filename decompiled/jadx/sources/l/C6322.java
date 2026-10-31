package l;

import android.text.SpannableStringBuilder;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۛ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public class C6322 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6322 mo17581(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6322 mo17582(String str, String str2) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo17590(Object obj, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo17591(String str, String str2, String str3) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo17594() {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m17577(String str) {
        return "target_not_mapped".equals(str) || "result_limit_reached".equals(str) || "scan_budget_exhausted".equals(str) || "relocation_page_budget_exhausted".equals(str) || "scan_space_exhausted".equals(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17571(InputStream inputStream) {
        if (inputStream == null) {
            C9145.m23516("MD5Utils", "md5 stream is null");
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr, 0, 8192);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    return C18338.m42736(messageDigest.digest());
                }
            }
        } catch (Throwable th) {
            C9145.m23514("MD5Utils", "md5 exception", th);
            C9145.m23516("MD5Utils", "md5 return null");
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17572(int i, int i2, byte[] bArr) {
        if (i2 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
        if (i2 > 0) {
            if (i < 0 || i >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i);
            }
            int i3 = (i + i2) - 1;
            if (i3 < 0 || i3 >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object[] m17575(int i, Object[] objArr) {
        if (i < objArr.length) {
            return objArr;
        }
        int length = objArr.length;
        while (length < i + 1) {
            length *= 2;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17573(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m17578(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22420 m17588(Object obj, Object obj2) {
        if (obj == null) {
            return null;
        }
        InterfaceC22420 interfaceC22420 = (InterfaceC22420) obj;
        C18893 c18893Mo43622 = interfaceC22420.mo43622();
        c18893Mo43622.f59553 = interfaceC22420.mo8352();
        c18893Mo43622.f59555 = (C18893) ((InterfaceC22420) obj2);
        int childCount = interfaceC22420.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m17593((InterfaceC22420) c18893Mo43622, (Object) m17588(interfaceC22420.mo8350(i), obj));
        }
        return c18893Mo43622;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m17574(int i, byte[] bArr) {
        if (i < bArr.length) {
            return bArr;
        }
        int length = bArr.length;
        while (length < i + 1) {
            length *= 2;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m17576(int i, byte[] bArr) {
        if (C6044.f18537 == ByteOrder.BIG_ENDIAN) {
            return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        }
        return m17578(i, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18893 m17583() {
        return new C18893(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18893 m17587(InterfaceC6898 interfaceC6898) {
        return new C18893(interfaceC6898);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4076 m17580(InterfaceC21010 interfaceC21010, InterfaceC6898 interfaceC6898, InterfaceC6898 interfaceC6899, C14658 c14658) {
        C4076 c4076 = new C4076();
        if (interfaceC6899 == null || (interfaceC6899.mo10336() < interfaceC6898.mo10336() && interfaceC6899.getType() != -1)) {
            interfaceC6899 = interfaceC6898;
        }
        c4076.f12994 = interfaceC21010;
        c4076.f12991 = interfaceC6898;
        c4076.f12993 = interfaceC6899;
        c4076.f12992 = c14658;
        return c4076;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18893 m17584(int i, String str) {
        return new C18893(new C3391(i, str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18893 m17585(int i, InterfaceC6898 interfaceC6898) {
        C3391 c3391 = new C3391(interfaceC6898);
        c3391.m10338(i);
        return new C18893(c3391);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m17592(C18893 c18893, InterfaceC6898 interfaceC6898, InterfaceC6898 interfaceC6899) {
        if (c18893 == null) {
            return;
        }
        int iMo10336 = interfaceC6898 != null ? interfaceC6898.mo10336() : 0;
        int iMo10337 = interfaceC6899 != null ? interfaceC6899.mo10336() : 0;
        c18893.mo43621(iMo10336);
        c18893.mo43618(iMo10337);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m17593(InterfaceC22420 interfaceC22420, Object obj) {
        if (interfaceC22420 == null || obj == null) {
            return;
        }
        interfaceC22420.mo8351((InterfaceC22420) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m17579(C18893 c18893, C18893 c18894) {
        boolean zMo8355 = c18893.mo8355();
        C18893 c18893Mo8350 = c18893;
        if (zMo8355) {
            int childCount = c18893.getChildCount();
            if (childCount == 1) {
                c18893Mo8350 = c18893;
                c18893Mo8350 = c18893.mo8350(0);
            } else if (childCount > 1) {
                throw new RuntimeException("more than one node as root (TODO: make exception hierarchy)");
            }
        }
        c18893Mo8350.mo8351(c18894);
        return c18893Mo8350;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22420 m17589(C18893 c18893) {
        if (c18893 == null || !c18893.mo8355()) {
            return c18893;
        }
        if (c18893.getChildCount() == 0) {
            return null;
        }
        if (c18893.getChildCount() != 1) {
            return c18893;
        }
        InterfaceC22420 interfaceC22420Mo8350 = c18893.mo8350(0);
        interfaceC22420Mo8350.mo8353((InterfaceC22420) null);
        interfaceC22420Mo8350.mo8354(-1);
        return interfaceC22420Mo8350;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18893 m17586(int i, InterfaceC6898 interfaceC6898, String str) {
        if (interfaceC6898 != null) {
            C3391 c3391 = new C3391(interfaceC6898);
            c3391.m10338(i);
            c3391.m10333(str);
            return new C18893(c3391);
        }
        return m17584(i, str);
    }
}
