package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۚۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5325 extends AbstractC13941 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f16608;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f16609;

    public C5325(long j, List list) {
        super(list.size() - 1);
        this.f16608 = j;
        this.f16609 = list;
    }

    @Override // l.InterfaceC18218
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo15260() {
        m33382();
        return this.f16608 + ((C22590) this.f16609.get((int) m33383())).f73016;
    }

    @Override // l.InterfaceC18218
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo15261() {
        m33382();
        C22590 c22590 = (C22590) this.f16609.get((int) m33383());
        return this.f16608 + c22590.f73016 + c22590.f73013;
    }
}
