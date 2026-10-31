package l;

import com.alipay.sdk.m.m.b;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11806 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f35218;

    static {
        HashMap map = new HashMap();
        f35218 = map;
        map.put("local", new C5851(1));
        map.put("zip", new C11213(2));
        map.put("tar", new C15420(2));
        map.put("compress", new C7915(1));
        map.put("archive", new C6161(0));
        map.put(b.k, new C23519(3));
        map.put("payload", new C23147(1));
        map.put("trash", new C18865(1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28857(String str) {
        if (!f35218.containsKey(str)) {
            throw new RuntimeException("Type has not been registered in StatelessVisitor.Generator: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC13921 m28856(byte[] bArr, boolean z) {
        C12951 c12951 = new C12951(bArr);
        Function function = (Function) f35218.get(c12951.m31506());
        if (function == null) {
            throw new RuntimeException();
        }
        AbstractC13921 abstractC13921 = (AbstractC13921) function.apply(c12951);
        if (z) {
            abstractC13921.f41559 = true;
        }
        return abstractC13921;
    }
}
