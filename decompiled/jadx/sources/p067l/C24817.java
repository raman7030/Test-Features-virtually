package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩻ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24817 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f79284;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f79285;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f79286;

    public /* synthetic */ C24817(int i, Object obj, Object obj2) {
        this.f79285 = i;
        this.f79286 = obj;
        this.f79284 = obj2;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f79285) {
            case 0:
                C17440 c17440 = (C17440) this.f79286;
                ((MenuItem) this.f79284).setEnabled(((Boolean) c17440.f52154.m4060()).booleanValue() || ((Boolean) c17440.f52152.m4060()).booleanValue());
                break;
            default:
                C20946.m47261((C20946) this.f79286, (C5522) this.f79284);
                break;
        }
    }
}
