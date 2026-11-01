package p067l;

/* JADX INFO: renamed from: l.֫᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BTO */
/* JADX INFO: loaded from: classes3.dex */
public class C4327 extends AbstractC15115 implements InterfaceC9751, InterfaceC8350 {

    /* JADX INFO: renamed from: ۤ */
    public final int f9652;

    public C4327(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.f9652 = i;
    }

    @Override // p067l.InterfaceC9751
    /* JADX INFO: renamed from: ܳ */
    public final int mo8871() {
        return this.f9652;
    }

    @Override // p067l.AbstractC15115
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC14385 mo8872() {
        C9021.m20893(this);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4327) {
            C4327 c4327 = (C4327) obj;
            return m34528().equals(c4327.m34528()) && m34529().equals(c4327.m34529()) && C13045.m29864(this.f43150, c4327.f43150) && C13045.m29864(m34527(), c4327.m34527());
        }
        if (obj instanceof InterfaceC8350) {
            return obj.equals(mo34526());
        }
        return false;
    }

    public final int hashCode() {
        return m34529().hashCode() + ((m34528().hashCode() + (m34527() == null ? 0 : m34527().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC14385 interfaceC14385Mo34526 = mo34526();
        if (interfaceC14385Mo34526 != this) {
            return interfaceC14385Mo34526.toString();
        }
        if ("<init>".equals(m34528())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m34528() + " (Kotlin reflection is not available)";
    }
}
