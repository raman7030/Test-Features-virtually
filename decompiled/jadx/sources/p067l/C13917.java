package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۫ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 07MC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13917 implements InterfaceC9223 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f39269 = new HashMap();

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ֫ */
    public final void mo18203(C21865 c21865) {
    }

    public C13917(C4271 c4271) {
    }

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ֫ */
    public final void mo18200() {
        C21230.forEach(this.f39269.values(), new C6541());
    }

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ֫ */
    public final void mo18202(C15828 c15828, InterfaceC8453 interfaceC8453) {
        this.f39269.put(c15828, new C15257(c15828, new C14587(this, interfaceC8453)));
    }

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ֫ */
    public final void mo18201(C15828 c15828) {
        this.f39269.remove(c15828);
    }

    @Override // p067l.InterfaceC9223
    /* JADX INFO: renamed from: ۧ */
    public final void mo18204() {
        C21230.forEach(this.f39269.values(), new C5200());
    }
}
