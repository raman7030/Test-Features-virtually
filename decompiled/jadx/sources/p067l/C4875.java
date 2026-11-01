package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4875 {

    /* JADX INFO: renamed from: ֫ */
    public final IdentityHashMap f11120 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۧ */
    public int f11121;

    /* JADX INFO: renamed from: ֫ */
    public final C17614 m10340(Object obj) {
        return (C17614) this.f11120.get(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17614 m10341(Object obj, int[] iArr, long j) {
        this.f11121 += iArr.length;
        IdentityHashMap identityHashMap = this.f11120;
        if (identityHashMap.size() >= 4096 || this.f11121 > 65536) {
            throw new IllegalStateException("Speculative syntax history budget exceeded");
        }
        C17614 c17614 = new C17614(iArr, j);
        identityHashMap.put(obj, c17614);
        return c17614;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m10339() {
        IdentityHashMap identityHashMap = this.f11120;
        Collection collectionValues = identityHashMap.values();
        ArrayList arrayList = new ArrayList(collectionValues.size());
        for (Object obj : collectionValues) {
            C12826.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = C21562.unmodifiableList(arrayList);
        identityHashMap.clear();
        this.f11121 = 0;
        return listUnmodifiableList;
    }
}
