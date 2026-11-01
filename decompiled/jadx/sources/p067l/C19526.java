package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19526 extends AbstractC12605 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C18855 f59461;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ArrayList f59462;

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ۧ */
    public final int mo3749() {
        return this.f59462.size();
    }

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ֫ */
    public final int mo3747() {
        return this.f59461.f56327.size();
    }

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3750(int i, int i2) {
        return this.f59462.get(i) == this.f59461.f56327.get(i2);
    }

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3748(int i, int i2) {
        return this.f59462.get(i) == this.f59461.f56327.get(i2);
    }

    public C19526(C18855 c18855, ArrayList arrayList) {
        this.f59461 = c18855;
        this.f59462 = arrayList;
    }
}
