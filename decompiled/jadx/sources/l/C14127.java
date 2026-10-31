package l;

import android.view.MenuItem;
import com.google.android.material.search.SearchBar;

/* JADX INFO: renamed from: l.ܰ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14127 implements InterfaceC13117, InterfaceC14050, InterfaceC19301, InterfaceC22001, InterfaceC6087 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42611;

    public /* synthetic */ C14127(Object obj) {
        this.f42611 = obj;
    }

    @Override // l.InterfaceC14050
    public void onMenuItemClick(MenuItem menuItem) {
        C6807.m18460((C6807) this.f42611, menuItem);
    }

    @Override // l.InterfaceC6087
    public void onTouchExplorationStateChanged(boolean z) {
        ((SearchBar) this.f42611).lambda$new$0(z);
    }

    @Override // l.InterfaceC19301
    /* JADX INFO: renamed from: ֫ */
    public void mo33424(long j, long j2) {
        C5189.m14947((C5189) this.f42611, j, j2);
    }

    @Override // l.InterfaceC22001
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC2245 mo17661(int i) {
        return ((AbstractC15440[]) this.f42611)[i].mo23557("r");
    }
}
