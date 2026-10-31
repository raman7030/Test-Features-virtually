package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܽۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16564 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50923;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50924;

    public /* synthetic */ C16564(int i, Object obj) {
        this.f50923 = i;
        this.f50924 = obj;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f50923) {
            case 0:
                ((MenuItem) this.f50924).setEnabled(((Boolean) obj).booleanValue());
                break;
            default:
                C23840.m52541((C23840) this.f50924, (C12366) obj);
                break;
        }
    }
}
