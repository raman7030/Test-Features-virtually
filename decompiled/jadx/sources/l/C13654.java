package l;

import com.alipay.sdk.m.m.b;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final class C13654 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f40721;

    static {
        HashMap map = new HashMap();
        f40721 = map;
        map.put("local", new C4563(1));
        map.put("zip", new C7680(2));
        map.put("tar", new C5894(0));
        map.put("compress", new C14436(1));
        map.put("archive", new C11539(0));
        map.put(b.k, new C6416(1));
        map.put("payload", new C20528(1));
        map.put("trash", new C22827(0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32812(String str) {
        if (!f40721.containsKey(str)) {
            throw new RuntimeException("Type has not been registered in FileVisitor.Generator: ".concat(str));
        }
        C11806.m28857(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16891 m32811(C12951 c12951) {
        Function function = (Function) f40721.get(c12951.m31506());
        if (function == null) {
            throw new RuntimeException();
        }
        return (AbstractC16891) function.apply(c12951);
    }
}
