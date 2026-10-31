package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C7192 implements InterfaceC2959 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11008 f22030;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f22031;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f22032;

    public C7192(C11008 c11008, boolean[] zArr, HashSet hashSet) {
        this.f22030 = c11008;
        this.f22032 = zArr;
        this.f22031 = hashSet;
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ܽ */
    public final void mo9041(int i) {
        if (i < this.f22030.f33115) {
            this.f22032[i] = false;
        }
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ֫ */
    public final void mo9039(int i) {
        if (this.f22031.contains(Integer.valueOf(i)) || i >= this.f22030.f33115) {
            return;
        }
        this.f22032[i] = true;
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ۧ */
    public final void mo9040(int i) {
        mo9041(i);
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9042(int i) {
        mo9039(i);
    }
}
