package p067l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۤ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C12344 extends AbstractC13154 implements InterfaceC23442 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC14355 f34446;

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3807(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        return EnumC5532.EXPRESSION_STATEMENT;
    }

    @Override // p067l.InterfaceC23442
    public final AbstractC14355 getExpression() {
        return this.f34446;
    }

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo13739(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60702;
    }

    @Override // p067l.AbstractC7257
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C22680(stringWriter, false).m50781(this, -1);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
