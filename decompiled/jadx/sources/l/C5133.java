package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5133 implements InterfaceC14304 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14304 f16072;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC16876 f16073;

    /* JADX WARN: Multi-variable type inference failed */
    public C5133(InterfaceC14304 interfaceC14304, InterfaceC16233 interfaceC16233) {
        this.f16072 = interfaceC14304;
        this.f16073 = (AbstractC16876) interfaceC16233;
    }

    @Override // l.InterfaceC14304
    public final Iterator iterator() {
        return new C0193(this);
    }
}
