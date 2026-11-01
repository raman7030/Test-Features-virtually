package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11795 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ int f32949;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C17828 f32950;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ int f32951;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11795(C17828 c17828, ActivityC18686 activityC18686, int i, int i2) {
        super(activityC18686, -1);
        this.f32950 = c17828;
        this.f32949 = i;
        this.f32951 = i2;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        try {
            int i = Integer.parseInt(m33346());
            if (i < this.f32949 || i > this.f32951) {
                m33349(R.string.MT_Protector);
            } else if (this.f32950.f53203.m19930(i, true, true)) {
                m33348();
            } else {
                m33349(R.string.MT_Protector);
            }
        } catch (NumberFormatException unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
