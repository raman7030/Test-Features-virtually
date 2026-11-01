package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܺۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4MG */
/* JADX INFO: loaded from: classes5.dex */
public final class C17430 extends AbstractC17522 implements InterfaceC5815 {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC15733 f52097;

    /* JADX INFO: renamed from: ۙ */
    public Set f52098;

    /* JADX INFO: renamed from: ᩶ */
    public final C20114 f52099;

    /* JADX INFO: renamed from: ᩸ */
    public final int f52100;

    /* JADX INFO: renamed from: ᩹ */
    public final C9029 f52101;

    public C17430(C20114 c20114, int i, InterfaceC15733 interfaceC15733, C9029 c9029, Set set) {
        this.f52099 = c20114;
        this.f52100 = i;
        this.f52097 = interfaceC15733;
        this.f52101 = c9029;
        this.f52098 = set;
    }

    @Override // p067l.InterfaceC5815
    /* JADX INFO: renamed from: ܽ */
    public final int mo13086() {
        return this.f52100;
    }

    @Override // p067l.InterfaceC5815
    /* JADX INFO: renamed from: ۚ֫ */
    public final InterfaceC12262 mo13085() {
        return this.f52097;
    }

    @Override // p067l.InterfaceC5815
    public final Set getAnnotations() {
        return this.f52101;
    }

    @Override // p067l.InterfaceC20309
    /* JADX INFO: renamed from: ܳ */
    public final String mo10231() {
        return this.f52099.f62229.f79220.f25636;
    }

    @Override // p067l.InterfaceC20309
    public final String getName() {
        return this.f52099.f62227.f25636;
    }

    @Override // p067l.InterfaceC20309
    public final String getType() {
        return this.f52099.f62230.f79220.f25636;
    }

    @Override // p067l.InterfaceC5815
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo13087() {
        return this.f52098;
    }
}
