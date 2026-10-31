package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۧۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R537 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10836 extends AbstractList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9425 f32585;

    public C10836(C9425 c9425) {
        this.f32585 = c9425;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C9425 c9425 = this.f32585;
        if (i >= c9425.size()) {
            return C19370.m44628(i, i < 10 ? "type0" : "type");
        }
        return c9425.m47858(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32585.size();
    }
}
