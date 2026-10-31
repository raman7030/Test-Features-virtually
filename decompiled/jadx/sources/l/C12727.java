package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12727 implements InterfaceC21403 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC6377 f38283;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f38284;

    public C12727(ViewOnClickListenerC6377 viewOnClickListenerC6377, C22933 c22933) {
        this.f38283 = viewOnClickListenerC6377;
        this.f38284 = c22933;
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22513() {
        return this.f38284.m51053();
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC17169 mo22516() {
        return this.f38283.f19738;
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ۧ */
    public final void mo22515(int i) {
        this.f38284.m51045(i);
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ֫ */
    public final void mo22512(int i, int i2) {
        ViewOnClickListenerC6377 viewOnClickListenerC6377 = this.f38283;
        viewOnClickListenerC6377.f19738.m10218(R.string.MT_Protector, viewOnClickListenerC6377.f19738.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        if (i2 > 0) {
            ((C3764) new C4741(viewOnClickListenerC6377.f19738).m13885(C3764.class)).m11400();
        }
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ۧ */
    public final void mo22514() {
        this.f38284.m51051();
    }
}
