package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17210 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f52787;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f52788;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18076 f52789;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f52790;

    public C17210(C19328 c19328, String str, C18076 c18076) {
        this.f52790 = c19328;
        this.f52787 = str;
        this.f52789 = c18076;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933((AbstractActivityC3346) this.f52790.requireActivity());
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f52788 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        String str = this.f52787;
        C19328 c19328 = this.f52790;
        c19328.f60762 = str;
        if (c19328.f60757 == null || c19328.f60757.length < c19328.f60758.size()) {
            c19328.f60757 = new int[c19328.f60758.size()];
        }
        int i = 0;
        for (int i2 = 0; i2 < c19328.f60758.size(); i2++) {
            if (this.f52789.m42137(((C23560) c19328.f60758.get(i2)).m52025())) {
                c19328.f60757[i] = i2;
                i++;
            }
            this.f52788.m51045((i * 100) / c19328.f60758.size());
            if (this.f52788.m51053()) {
                return;
            }
        }
        c19328.f60763 = i;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f52788.m51053()) {
            return;
        }
        C19328 c19328 = this.f52790;
        c19328.f60760 = true;
        C19328.m44529(c19328);
        c19328.f60765.notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f52790.f60767.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f52788.m51051();
    }
}
