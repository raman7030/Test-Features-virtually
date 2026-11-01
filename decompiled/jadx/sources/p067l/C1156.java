package p067l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۛ᩹ */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
public final class C1156 implements InterfaceC1436 {

    /* JADX INFO: renamed from: ֫ */
    public final Intent f22511;

    /* JADX INFO: renamed from: ۧ */
    public final int f22512;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ AbstractServiceC1398 f22513;

    public C1156(AbstractServiceC1398 abstractServiceC1398, Intent intent, int i) {
        this.f22513 = abstractServiceC1398;
        this.f22511 = intent;
        this.f22512 = i;
    }

    @Override // p067l.InterfaceC1436
    public final Intent getIntent() {
        return this.f22511;
    }

    @Override // p067l.InterfaceC1436
    /* JADX INFO: renamed from: ֫ */
    public final void mo19555() {
        this.f22513.stopSelf(this.f22512);
    }
}
