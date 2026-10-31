package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩹ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1JO */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22222 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72107;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72108;

    public /* synthetic */ C22222(int i, Object obj) {
        this.f72107 = i;
        this.f72108 = obj;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f72107) {
            case 0:
                C4583.m13480((InterfaceC20106) this.f72108, (Object[]) obj);
                break;
            case 1:
                ((MenuItem) this.f72108).setChecked(((Boolean) obj).booleanValue());
                break;
            case 2:
                C23840.m52538((C23840) this.f72108);
                break;
            default:
                C15063.m35609((C15063) this.f72108, (C12366) obj);
                break;
        }
    }
}
