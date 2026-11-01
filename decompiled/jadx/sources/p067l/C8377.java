package p067l;

import android.text.SpannableStringBuilder;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۛ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public class C8377 {
    /* JADX INFO: renamed from: ֫ */
    public C8377 mo19521(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public C8377 mo19522(String str, String str2) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo19530(Object obj, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo19531(String str, String str2, String str3) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo19534() {
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m19517(String str) {
        return "target_not_mapped".equals(str) || "result_limit_reached".equals(str) || "scan_budget_exhausted".equals(str) || "relocation_page_budget_exhausted".equals(str) || "scan_space_exhausted".equals(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m19511(InputStream inputStream) {
        if (inputStream == null) {
            C11060.m25467("MD5Utils", "md5 stream is null");
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
                    return C19797.m44998(messageDigest.digest());
                }
            }
        } catch (Throwable th) {
            C11060.m25465("MD5Utils", "md5 exception", th);
            C11060.m25467("MD5Utils", "md5 return null");
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19512(int i, int i2, byte[] bArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static Object[] m19515(int i, Object[] objArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static void m19513(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m19518(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC23676 m19528(Object obj, Object obj2) {
        if (obj == null) {
            return null;
        }
        InterfaceC23676 interfaceC23676 = (InterfaceC23676) obj;
        C20324 c20324Mo45888 = interfaceC23676.mo45888();
        c20324Mo45888.f62783 = interfaceC23676.mo10398();
        c20324Mo45888.f62785 = (C20324) ((InterfaceC23676) obj2);
        int childCount = interfaceC23676.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m19533((InterfaceC23676) c20324Mo45888, (Object) m19528(interfaceC23676.mo10396(i), obj));
        }
        return c20324Mo45888;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m19514(int i, byte[] bArr) {
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

    /* JADX INFO: renamed from: ۧ */
    public static int m19516(int i, byte[] bArr) {
        if (C8113.f21393 == ByteOrder.BIG_ENDIAN) {
            return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        }
        return m19518(i, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public C20324 m19523() {
        return new C20324(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public C20324 m19527(InterfaceC8924 interfaceC8924) {
        return new C20324(interfaceC8924);
    }

    /* JADX INFO: renamed from: ֫ */
    public C6242 m19520(InterfaceC22336 interfaceC22336, InterfaceC8924 interfaceC8924, InterfaceC8924 interfaceC8925, C16299 c16299) {
        C6242 c6242 = new C6242();
        if (interfaceC8925 == null || (interfaceC8925.mo12375() < interfaceC8924.mo12375() && interfaceC8925.getType() != -1)) {
            interfaceC8925 = interfaceC8924;
        }
        c6242.f15809 = interfaceC22336;
        c6242.f15806 = interfaceC8924;
        c6242.f15808 = interfaceC8925;
        c6242.f15807 = c16299;
        return c6242;
    }

    /* JADX INFO: renamed from: ֫ */
    public C20324 m19524(int i, String str) {
        return new C20324(new C5591(i, str));
    }

    /* JADX INFO: renamed from: ֫ */
    public C20324 m19525(int i, InterfaceC8924 interfaceC8924) {
        C5591 c5591 = new C5591(interfaceC8924);
        c5591.m12377(i);
        return new C20324(c5591);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m19532(C20324 c20324, InterfaceC8924 interfaceC8924, InterfaceC8924 interfaceC8925) {
        if (c20324 == null) {
            return;
        }
        int iMo12375 = interfaceC8924 != null ? interfaceC8924.mo12375() : 0;
        int iMo12376 = interfaceC8925 != null ? interfaceC8925.mo12375() : 0;
        c20324.mo45887(iMo12375);
        c20324.mo45884(iMo12376);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m19533(InterfaceC23676 interfaceC23676, Object obj) {
        if (interfaceC23676 == null || obj == null) {
            return;
        }
        interfaceC23676.mo10397((InterfaceC23676) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public Object m19519(C20324 c20324, C20324 c20325) {
        boolean zMo10401 = c20324.mo10401();
        C20324 c20324Mo10396 = c20324;
        if (zMo10401) {
            int childCount = c20324.getChildCount();
            if (childCount == 1) {
                c20324Mo10396 = c20324;
                c20324Mo10396 = c20324.mo10396(0);
            } else if (childCount > 1) {
                throw new RuntimeException("more than one node as root (TODO: make exception hierarchy)");
            }
        }
        c20324Mo10396.mo10397(c20325);
        return c20324Mo10396;
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC23676 m19529(C20324 c20324) {
        if (c20324 == null || !c20324.mo10401()) {
            return c20324;
        }
        if (c20324.getChildCount() == 0) {
            return null;
        }
        if (c20324.getChildCount() != 1) {
            return c20324;
        }
        InterfaceC23676 interfaceC23676Mo10396 = c20324.mo10396(0);
        interfaceC23676Mo10396.mo10399((InterfaceC23676) null);
        interfaceC23676Mo10396.mo10400(-1);
        return interfaceC23676Mo10396;
    }

    /* JADX INFO: renamed from: ֫ */
    public C20324 m19526(int i, InterfaceC8924 interfaceC8924, String str) {
        if (interfaceC8924 != null) {
            C5591 c5591 = new C5591(interfaceC8924);
            c5591.m12377(i);
            c5591.m12372(str);
            return new C20324(c5591);
        }
        return m19524(i, str);
    }
}
