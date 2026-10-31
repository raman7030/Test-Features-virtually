package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19076 extends AbstractC3553 implements InterfaceC0418 {
    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C19470.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C19470.b(this, consumer);
    }

    @Override // l.AbstractC3987
    public final InterfaceC15234 a(InterfaceC15234 interfaceC15234, long j, long j2, long j3, long j4) {
        return new C19076((InterfaceC0418) interfaceC15234, j, j2, j3, j4);
    }

    @Override // l.AbstractC3553
    public final Object b() {
        return new C1164(1);
    }
}
