package p067l;

/* JADX INFO: renamed from: l.᩻᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC25132 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f80418;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f80419;

    public /* synthetic */ RunnableC25132(int i, Object obj) {
        this.f80418 = i;
        this.f80419 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f80418) {
            case 0:
                ((ActivityC4030) this.f80419).finish();
                break;
            case 1:
                ((ActivityC17874) this.f80419).m40664(false);
                break;
            case 2:
                C9471.m22020((C9471) this.f80419);
                break;
            default:
                C21223.m47928((C14853) this.f80419);
                break;
        }
    }
}
