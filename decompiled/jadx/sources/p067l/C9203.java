package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C9203 implements InterfaceC5180 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C12830 f24908;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ HashSet f24909;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean[] f24910;

    public C9203(C12830 c12830, boolean[] zArr, HashSet hashSet) {
        this.f24908 = c12830;
        this.f24910 = zArr;
        this.f24909 = hashSet;
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ܽ */
    public final void mo11093(int i) {
        if (i < this.f24908.f36109) {
            this.f24910[i] = false;
        }
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ֫ */
    public final void mo11091(int i) {
        if (this.f24909.contains(Integer.valueOf(i)) || i >= this.f24908.f36109) {
            return;
        }
        this.f24910[i] = true;
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ۧ */
    public final void mo11092(int i) {
        mo11093(i);
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11094(int i) {
        mo11091(i);
    }
}
