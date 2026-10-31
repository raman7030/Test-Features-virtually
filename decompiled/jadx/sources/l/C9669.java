package l;

/* JADX INFO: renamed from: l.ۢܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9669 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29266;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29267;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29268;

    public /* synthetic */ C9669(int i, Object obj, Object obj2) {
        this.f29267 = i;
        this.f29268 = obj;
        this.f29266 = obj2;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        int i = this.f29267;
        Object obj2 = this.f29266;
        Object obj3 = this.f29268;
        switch (i) {
            case 0:
                C19547.m44962((C19547) obj3, (C3318) obj2);
                break;
            default:
                ActivityC18827 activityC18827 = (ActivityC18827) obj3;
                int i2 = ActivityC18827.f59388;
                if (!((C16709) obj2).m39301()) {
                    activityC18827.finish();
                }
                break;
        }
    }
}
