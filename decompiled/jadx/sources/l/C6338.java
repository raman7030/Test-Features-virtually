package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
public final class C6338 implements InterfaceC11983 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Intent f19639;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f19640;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC11215 f19641;

    public C6338(AbstractServiceC11215 abstractServiceC11215, Intent intent, int i) {
        this.f19641 = abstractServiceC11215;
        this.f19639 = intent;
        this.f19640 = i;
    }

    @Override // l.InterfaceC11983
    public final Intent getIntent() {
        return this.f19639;
    }

    @Override // l.InterfaceC11983
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17615() {
        this.f19641.stopSelf(this.f19640);
    }
}
