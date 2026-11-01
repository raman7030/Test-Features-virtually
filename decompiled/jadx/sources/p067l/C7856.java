package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7856 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20595;

    /* JADX INFO: renamed from: ۧ */
    public final List f20596;

    /* JADX INFO: renamed from: ܽ */
    public final int f20597;

    public C7856(ArrayList arrayList, int i, int i2) {
        this.f20597 = i;
        this.f20595 = i2;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C12826.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.f20596 = C21562.unmodifiableList(arrayList2);
    }
}
