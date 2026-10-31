package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2637 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f8326 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f8327;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16041 m8296(Object obj) {
        return (C16041) this.f8326.get(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16041 m8297(Object obj, int[] iArr, long j) {
        this.f8327 += iArr.length;
        IdentityHashMap identityHashMap = this.f8326;
        if (identityHashMap.size() >= 4096 || this.f8327 > 65536) {
            throw new IllegalStateException("Speculative syntax history budget exceeded");
        }
        C16041 c16041 = new C16041(iArr, j);
        identityHashMap.put(obj, c16041);
        return c16041;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m8295() {
        IdentityHashMap identityHashMap = this.f8326;
        Collection collectionValues = identityHashMap.values();
        ArrayList arrayList = new ArrayList(collectionValues.size());
        for (Object obj : collectionValues) {
            C11003.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = C20195.unmodifiableList(arrayList);
        identityHashMap.clear();
        this.f8327 = 0;
        return listUnmodifiableList;
    }
}
