package l;

import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.֫ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B7IH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1712 extends AbstractC23584 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2418 f5920;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public UnaryOperator f5921;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15822 f5922;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC13726 f5923;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2418 m5742() {
        return this.f5920;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final UnaryOperator m5744() {
        return this.f5921;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15822 m5745() {
        return this.f5922;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13726 m5746() {
        return this.f5923;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5743(InterfaceC13726 interfaceC13726) {
        this.f5923 = interfaceC13726;
    }

    public AbstractC1712() {
        int i = C16528.f50803;
        this.f5923 = C7377.m19831();
        EnumC16523 enumC16523 = EnumC16523.TERMINATE;
        EnumC16523 enumC16524 = EnumC16523.CONTINUE;
        this.f5922 = new C15822(0);
        this.f5920 = C2418.f7700;
        this.f5921 = C0233.identity();
    }
}
