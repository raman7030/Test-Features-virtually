package l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۤ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C10496 extends AbstractC11349 implements InterfaceC22174 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f31483;

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1394(this);
    }

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3329 mo987() {
        return EnumC3329.EXPRESSION_STATEMENT;
    }

    @Override // l.InterfaceC22174
    public final AbstractC12612 getExpression() {
        return this.f31483;
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo11803(this, obj);
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57478;
    }

    @Override // l.AbstractC5144
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C21372(stringWriter, false).m48445(this, -1);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
