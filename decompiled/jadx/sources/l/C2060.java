package l;

/* JADX INFO: renamed from: l.֫᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BTO */
/* JADX INFO: loaded from: classes3.dex */
public class C2060 extends AbstractC13411 implements InterfaceC7767, InterfaceC6293 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f6868;

    public C2060(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.f6868 = i;
    }

    @Override // l.InterfaceC7767
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo6745() {
        return this.f6868;
    }

    @Override // l.AbstractC13411
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12643 mo6746() {
        C6999.m18936(this);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2060) {
            C2060 c2060 = (C2060) obj;
            return m32426().equals(c2060.m32426()) && m32427().equals(c2060.m32427()) && C11233.m27802(this.f40080, c2060.f40080) && C11233.m27802(m32425(), c2060.m32425());
        }
        if (obj instanceof InterfaceC6293) {
            return obj.equals(mo32424());
        }
        return false;
    }

    public final int hashCode() {
        return m32427().hashCode() + ((m32426().hashCode() + (m32425() == null ? 0 : m32425().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC12643 interfaceC12643Mo32424 = mo32424();
        if (interfaceC12643Mo32424 != this) {
            return interfaceC12643Mo32424.toString();
        }
        if ("<init>".equals(m32426())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m32426() + " (Kotlin reflection is not available)";
    }
}
