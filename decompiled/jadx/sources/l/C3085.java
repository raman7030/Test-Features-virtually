package l;

import com.alipay.sdk.m.b0.a;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3085 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f9660;

    static {
        HashMap map = new HashMap();
        f9660 = map;
        map.put("AES/CCM/NoPadding", new C21430());
        map.put(a.f, new C20019());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC3791 m9432(String str) {
        InterfaceC20203 interfaceC20203 = (InterfaceC20203) f9660.get(str);
        if (interfaceC20203 != null) {
            return (InterfaceC3791) interfaceC20203.create();
        }
        throw new IllegalArgumentException(C20094.m46315("Unknown AEADCipher ", str));
    }
}
