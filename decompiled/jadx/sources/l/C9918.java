package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9918 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29991;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16266 f29992;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29993;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9918(C16266 c16266, ActivityC17169 activityC17169, int i, int i2) {
        super(activityC17169, -1);
        this.f29992 = c16266;
        this.f29991 = i;
        this.f29993 = i2;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        try {
            int i = Integer.parseInt(m31260());
            if (i < this.f29991 || i > this.f29993) {
                m31263(R.string.MT_Protector);
            } else if (this.f29992.f50035.m17982(i, true, true)) {
                m31262();
            } else {
                m31263(R.string.MT_Protector);
            }
        } catch (NumberFormatException unused) {
            m31263(R.string.MT_Protector);
        }
    }
}
