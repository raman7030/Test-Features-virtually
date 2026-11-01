package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 07MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7882 implements InterfaceC9223 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f20694 = new HashMap();

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ֫ */
    public final void mo18200() {
    }

    public C7882(C4271 c4271) {
    }

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ֫ */
    public final void mo18203(C21865 c21865) {
        throw c21865;
    }

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ֫ */
    public final void mo18202(C15828 c15828, InterfaceC8453 interfaceC8453) {
        this.f20694.put(c15828, new C15257(c15828, new C23975(interfaceC8453)));
    }

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ֫ */
    public final void mo18201(C15828 c15828) {
        this.f20694.remove(c15828);
    }

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ۧ */
    public final void mo18204() {
        HashMap map = this.f20694;
        C21230.forEach(map.values(), new C11906());
        map.clear();
    }
}
