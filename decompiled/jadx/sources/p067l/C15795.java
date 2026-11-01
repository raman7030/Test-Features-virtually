package p067l;

import android.view.MenuItem;
import com.google.android.material.search.SearchBar;

/* JADX INFO: renamed from: l.ܰ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15795 implements InterfaceC14835, InterfaceC15722, InterfaceC20712, InterfaceC23278, InterfaceC1144 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f45697;

    public /* synthetic */ C15795(Object obj) {
        this.f45697 = obj;
    }

    @Override // p067l.InterfaceC15722
    public void onMenuItemClick(MenuItem menuItem) {
        C8838.m20409((C8838) this.f45697, menuItem);
    }

    @Override // p067l.InterfaceC1144
    public void onTouchExplorationStateChanged(boolean z) {
        ((SearchBar) this.f45697).lambda$new$0(z);
    }

    @Override // p067l.InterfaceC20712
    /* JADX INFO: renamed from: ֫ */
    public void mo35544(long j, long j2) {
        C7300.m16857((C7300) this.f45697, j, j2);
    }

    @Override // p067l.InterfaceC23278
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC4502 mo19606(int i) {
        return ((AbstractC17043[]) this.f45697)[i].mo25508("r");
    }
}
