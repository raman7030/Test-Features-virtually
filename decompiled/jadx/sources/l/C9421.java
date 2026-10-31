package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9421 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28577;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f28578;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18076 f28579;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f28580;

    public C9421(C15063 c15063, String str, C18076 c18076) {
        this.f28580 = c15063;
        this.f28577 = str;
        this.f28579 = c18076;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933((AbstractActivityC3346) this.f28580.requireActivity());
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f28578 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        String str = this.f28577;
        C15063 c15063 = this.f28580;
        c15063.f45996 = str;
        if (c15063.f45991 == null || c15063.f45991.length < c15063.f45998.size()) {
            c15063.f45991 = new int[c15063.f45998.size()];
        }
        int i = 0;
        for (int i2 = 0; i2 < c15063.f45998.size(); i2++) {
            if (this.f28579.m42137(((C15769) c15063.f45998.get(i2)).m37186())) {
                c15063.f45991[i] = i2;
                i++;
            }
            this.f28578.m51045((i * 100) / c15063.f45998.size());
            if (this.f28578.m51053()) {
                return;
            }
        }
        c15063.f45997 = i;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f28578.m51053()) {
            return;
        }
        C15063 c15063 = this.f28580;
        c15063.f45994 = true;
        C15063.m35612(c15063);
        c15063.f45999.notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f28580.f46001.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f28578.m51051();
    }
}
