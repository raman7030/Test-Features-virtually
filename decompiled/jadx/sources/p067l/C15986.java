package p067l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ܳۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15986 extends AbstractList {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f46308;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9952 f46309;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f46310;

    public C15986(C9952 c9952, int i, int i2) {
        this.f46309 = c9952;
        this.f46310 = i;
        this.f46308 = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C14645 c14645 = this.f46309.f27561;
        return c14645.m33487(c14645.m33504().m13856((i * 2) + this.f46310 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46308;
    }
}
