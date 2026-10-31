package l;

import java.io.IOException;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ܽۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B7IH */
/* JADX INFO: loaded from: classes5.dex */
public class C16528 extends AbstractC6651 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50803 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13726 f50804;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final UnaryOperator f50805;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2418 f50806;

    public C16528(C10885 c10885) {
        super(c10885);
        this.f50804 = c10885.m5746();
        c10885.getClass();
        this.f50806 = c10885.m5742();
        this.f50805 = c10885.m5744();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16528) {
            return C11003.equals(this.f50804, ((C16528) obj).f50804);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13726 m38904() {
        return this.f50804;
    }

    public int hashCode() {
        return C11003.hash(this.f50804);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo38907(InterfaceC20758 interfaceC20758, IOException iOException) {
        ((C10200) this.f50804).mo25603().mo16706();
        EnumC16523 enumC16523 = EnumC16523.CONTINUE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC16523 mo38905(InterfaceC20758 interfaceC20758, InterfaceC15111 interfaceC15111) {
        this.f50806.getClass();
        return EnumC16523.CONTINUE;
    }

    public final String toString() {
        return this.f50804.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38906(InterfaceC15111 interfaceC15111) {
        C10200 c10200 = (C10200) this.f50804;
        c10200.mo25604().mo16706();
        c10200.m25605().add(interfaceC15111.size());
    }
}
