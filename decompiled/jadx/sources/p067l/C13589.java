package p067l;

import com.alipay.sdk.p010m.p035m.C0168b;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13589 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f38220;

    static {
        HashMap map = new HashMap();
        f38220 = map;
        map.put("local", new C7929(1));
        map.put("zip", new C13026(2));
        map.put("tar", new C17024(2));
        map.put("compress", new C9891(1));
        map.put("archive", new C8224(0));
        map.put(C0168b.f616k, new C24721(3));
        map.put("payload", new C24367(1));
        map.put("trash", new C20298(1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30906(String str) {
        if (!f38220.containsKey(str)) {
            throw new RuntimeException("Type has not been registered in StatelessVisitor.Generator: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC15599 m30905(byte[] bArr, boolean z) {
        C14677 c14677 = new C14677(bArr);
        Function function = (Function) f38220.get(c14677.m33593());
        if (function == null) {
            throw new RuntimeException();
        }
        AbstractC15599 abstractC15599 = (AbstractC15599) function.apply(c14677);
        if (z) {
            abstractC15599.f44640 = true;
        }
        return abstractC15599;
    }
}
