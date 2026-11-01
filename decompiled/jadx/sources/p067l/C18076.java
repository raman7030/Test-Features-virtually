package p067l;

import java.io.IOException;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ܽۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B7IH */
/* JADX INFO: loaded from: classes5.dex */
public class C18076 extends AbstractC8689 {

    /* JADX INFO: renamed from: ۗ */
    public static final /* synthetic */ int f53982 = 0;

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15413 f53983;

    /* JADX INFO: renamed from: ᩶ */
    public final UnaryOperator f53984;

    /* JADX INFO: renamed from: ᩹ */
    public final C4666 f53985;

    public C18076(C12713 c12713) {
        super(c12713);
        this.f53983 = c12713.m7956();
        c12713.getClass();
        this.f53985 = c12713.m7952();
        this.f53984 = c12713.m7954();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18076) {
            return C12826.equals(this.f53983, ((C18076) obj).f53983);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15413 m41130() {
        return this.f53983;
    }

    public int hashCode() {
        return C12826.hash(this.f53983);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo41133(InterfaceC22097 interfaceC22097, IOException iOException) {
        ((C12062) this.f53983).mo27625().mo18632();
        EnumC18072 enumC18072 = EnumC18072.CONTINUE;
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC18072 mo41131(InterfaceC22097 interfaceC22097, InterfaceC16730 interfaceC16730) {
        this.f53985.getClass();
        return EnumC18072.CONTINUE;
    }

    public final String toString() {
        return this.f53983.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41132(InterfaceC16730 interfaceC16730) {
        C12062 c12062 = (C12062) this.f53983;
        c12062.mo27626().mo18632();
        c12062.m27627().add(interfaceC16730.size());
    }
}
