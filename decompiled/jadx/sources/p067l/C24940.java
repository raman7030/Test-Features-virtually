package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H87Q */
/* JADX INFO: loaded from: classes.dex */
public final class C24940 extends AbstractC10288 {

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC16992 f79644 = new C18905(new C24940(EnumC2911.f5026));

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7606 f79645;

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        c24726.m54377((Number) obj);
    }

    public C24940(InterfaceC7606 interfaceC7606) {
        this.f79645 = interfaceC7606;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC16992 m54807(InterfaceC7606 interfaceC7606) {
        if (interfaceC7606 != EnumC2911.f5026) {
            return new C18905(new C24940(interfaceC7606));
        }
        return f79644;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        EnumC16008 enumC16008M42643 = c18691.m42643();
        int i = C16222.f47741[enumC16008M42643.ordinal()];
        if (i == 1) {
            c18691.m42639();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.f79645.mo4711(c18691);
        }
        throw new C16322("Expecting number, got: " + enumC16008M42643 + "; at path " + c18691.m42642());
    }
}
