package p067l;

/* JADX INFO: renamed from: l.ۢܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11558 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f32215;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32216;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f32217;

    public /* synthetic */ C11558(int i, Object obj, Object obj2) {
        this.f32216 = i;
        this.f32217 = obj;
        this.f32215 = obj2;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        int i = this.f32216;
        Object obj2 = this.f32215;
        Object obj3 = this.f32217;
        switch (i) {
            case 0:
                C20946.m47262((C20946) obj3, (C5522) obj2);
                break;
            default:
                ActivityC20262 activityC20262 = (ActivityC20262) obj3;
                int i2 = ActivityC20262.f62617;
                if (!((C18249) obj2).m41537()) {
                    activityC20262.finish();
                }
                break;
        }
    }
}
