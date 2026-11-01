package p067l;

import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.֫ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B7IH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3995 extends AbstractC24782 {

    /* JADX INFO: renamed from: ֫ */
    public C4666 f8698;

    /* JADX INFO: renamed from: ۧ */
    public UnaryOperator f8699;

    /* JADX INFO: renamed from: ܽ */
    public C17405 f8700;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC15413 f8701;

    /* JADX INFO: renamed from: ֫ */
    public final C4666 m7952() {
        return this.f8698;
    }

    /* JADX INFO: renamed from: ۧ */
    public final UnaryOperator m7954() {
        return this.f8699;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17405 m7955() {
        return this.f8700;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15413 m7956() {
        return this.f8701;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7953(InterfaceC15413 interfaceC15413) {
        this.f8701 = interfaceC15413;
    }

    public AbstractC3995() {
        int i = C18076.f53982;
        this.f8701 = C9379.m21804();
        EnumC18072 enumC18072 = EnumC18072.TERMINATE;
        EnumC18072 enumC18073 = EnumC18072.CONTINUE;
        this.f8700 = new C17405(0);
        this.f8698 = C4666.f10491;
        this.f8699 = C2590.identity();
    }
}
