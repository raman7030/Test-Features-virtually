package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5774 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17748;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f17749;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17750;

    public C5774(ArrayList arrayList, int i, int i2) {
        this.f17750 = i;
        this.f17748 = i2;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C11003.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.f17749 = C20195.unmodifiableList(arrayList2);
    }
}
