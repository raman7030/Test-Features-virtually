package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩹ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1JO */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23488 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f74827;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f74828;

    public /* synthetic */ C23488(int i, Object obj) {
        this.f74827 = i;
        this.f74828 = obj;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f74827) {
            case 0:
                C6724.m15369((InterfaceC21477) this.f74828, (Object[]) obj);
                break;
            case 1:
                ((MenuItem) this.f74828).setChecked(((Boolean) obj).booleanValue());
                break;
            case 2:
                C25026.m54947((C25026) this.f74828);
                break;
            default:
                C16684.m37767((C16684) this.f74828, (C14121) obj);
                break;
        }
    }
}
