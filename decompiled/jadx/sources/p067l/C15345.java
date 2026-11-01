package p067l;

import com.alipay.sdk.p010m.p035m.C0168b;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final class C15345 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f43802;

    static {
        HashMap map = new HashMap();
        f43802 = map;
        map.put("local", new C6705(1));
        map.put("zip", new C9668(2));
        map.put("tar", new C7970(0));
        map.put("compress", new C16088(1));
        map.put("archive", new C13335(0));
        map.put(C0168b.f616k, new C8466(1));
        map.put("payload", new C21878(1));
        map.put("trash", new C24063(0));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34927(String str) {
        if (!f43802.containsKey(str)) {
            throw new RuntimeException("Type has not been registered in FileVisitor.Generator: ".concat(str));
        }
        C13589.m30906(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC18422 m34926(C14677 c14677) {
        Function function = (Function) f43802.get(c14677.m33593());
        if (function == null) {
            throw new RuntimeException();
        }
        return (AbstractC18422) function.apply(c14677);
    }
}
