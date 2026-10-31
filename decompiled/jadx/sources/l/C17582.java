package l;

/* JADX INFO: renamed from: l.ܿ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WBYW */
/* JADX INFO: loaded from: classes5.dex */
public class C17582 extends AbstractC13411 implements InterfaceC23226, InterfaceC14053 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f53736;

    @Override // l.AbstractC13411
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12643 mo6746() {
        C6999.m18937(this);
        return this;
    }

    public C17582(C20697 c20697) {
        super(c20697, C11024.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f53736 = false;
    }

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4049() {
        return get();
    }

    @Override // l.AbstractC13411
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC12643 mo32424() {
        return this.f53736 ? this : super.mo32424();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17582) {
            C17582 c17582 = (C17582) obj;
            return m32425().equals(c17582.m32425()) && m32426().equals(c17582.m32426()) && m32427().equals(c17582.m32427()) && C11233.m27802(this.f40080, c17582.f40080);
        }
        if (obj instanceof InterfaceC14053) {
            return obj.equals(mo32424());
        }
        return false;
    }

    public final int hashCode() {
        return m32427().hashCode() + ((m32426().hashCode() + (m32425().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC12643 interfaceC12643Mo32424 = mo32424();
        if (interfaceC12643Mo32424 != this) {
            return interfaceC12643Mo32424.toString();
        }
        return "property " + m32426() + " (Kotlin reflection is not available)";
    }
}
