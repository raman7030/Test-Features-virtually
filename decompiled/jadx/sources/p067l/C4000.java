package p067l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5R8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4000 extends AbstractList {

    /* JADX INFO: renamed from: ᩶ */
    public static final C4000 f8718 = new C4000(AbstractC16192.m36872of());

    /* JADX INFO: renamed from: ᩸ */
    public int f8719 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final List f8720;

    public C4000(AbstractC16192 abstractC16192) {
        this.f8720 = abstractC16192;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (C24787) this.f8720.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8720.size();
    }
}
