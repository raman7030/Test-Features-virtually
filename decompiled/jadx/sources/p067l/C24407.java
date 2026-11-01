package p067l;

/* JADX INFO: renamed from: l.᩺᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24407 extends C7644 {
    /* JADX INFO: renamed from: ֫ */
    public final void m53831(C8374 c8374, AbstractC15689 abstractC15689, InterfaceC21056 interfaceC21056, C12483 c12483, C6939 c6939) {
        for (AbstractC9655 abstractC9655 : this.f56786) {
            C1446.m31704(abstractC9655 instanceof C20385);
            C20385 c20385 = (C20385) abstractC9655;
            if (c20385.f63023 == abstractC15689 && c20385.f63022 == interfaceC21056 && c20385.f63019.f34991 == c12483.f34991) {
                return;
            }
        }
        m43271(new C20385(c8374, abstractC15689, null, interfaceC21056, c12483, c6939));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m53832() {
        return this.f56786.m45784();
    }
}
