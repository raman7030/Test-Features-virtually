package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܽۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18111 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f54100;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f54101;

    public /* synthetic */ C18111(int i, Object obj) {
        this.f54100 = i;
        this.f54101 = obj;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f54100) {
            case 0:
                ((MenuItem) this.f54101).setEnabled(((Boolean) obj).booleanValue());
                break;
            default:
                C25026.m54950((C25026) this.f54101, (C14121) obj);
                break;
        }
    }
}
