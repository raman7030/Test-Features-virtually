package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H76E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4498 {

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f10097 = {"call", "jump", AbstractC0213e.f989m, "unknown"};

    /* JADX INFO: renamed from: ֫ */
    public static int m9503(Iterable iterable) {
        if (iterable == null) {
            throw new NullPointerException("referenceKinds is null");
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iM9504 = m9504((String) it.next());
            if (iM9504 == 0) {
                throw new IllegalArgumentException("Invalid referenceKind");
            }
            if ((i & iM9504) != 0) {
                throw new IllegalArgumentException("Duplicate referenceKind");
            }
            i |= iM9504;
        }
        m9506(i);
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m9506(int i) {
        if (i == 0 || (i & (-16)) != 0) {
            throw new IllegalArgumentException("Invalid referenceKind mask");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m9505(int i) {
        m9506(i);
        ArrayList arrayList = new ArrayList(4);
        if ((i & 1) != 0) {
            arrayList.add("call");
        }
        if ((i & 2) != 0) {
            arrayList.add("jump");
        }
        if ((i & 4) != 0) {
            arrayList.add(AbstractC0213e.f989m);
        }
        if ((i & 8) != 0) {
            arrayList.add("unknown");
        }
        return C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m9504(String str) {
        if ("call".equals(str)) {
            return 1;
        }
        if ("jump".equals(str)) {
            return 2;
        }
        if (AbstractC0213e.f989m.equals(str)) {
            return 4;
        }
        return "unknown".equals(str) ? 8 : 0;
    }
}
