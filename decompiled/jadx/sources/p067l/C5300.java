package p067l;

import com.alipay.sdk.p010m.p014b0.C0087a;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5300 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f12463;

    static {
        HashMap map = new HashMap();
        f12463 = map;
        map.put("AES/CCM/NoPadding", new C22735());
        map.put(C0087a.f317f, new C21394());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC5971 m11475(String str) {
        InterfaceC21569 interfaceC21569 = (InterfaceC21569) f12463.get(str);
        if (interfaceC21569 != null) {
            return (InterfaceC5971) interfaceC21569.create();
        }
        throw new IllegalArgumentException(C21466.m48631("Unknown AEADCipher ", str));
    }
}
