package p067l;

/* JADX INFO: renamed from: l.ܿۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BCD */
/* JADX INFO: loaded from: classes5.dex */
public final class C18759 extends C17692 {

    /* JADX INFO: renamed from: ۙ */
    public int f56047;

    public C18759(int i) {
        super(i);
        this.f56047 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42780(int i, C18088 c18088) {
        m40217(i, (InterfaceC10988) c18088);
        this.f56047 = -1;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final int m42785() {
        if (this.f56047 == -1) {
            C19430 c19430 = new C19430();
            m42781(c19430);
            this.f56047 = c19430.m44199();
        }
        return this.f56047;
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m42782() {
        int size = size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            C18088 c18088 = (C18088) m43250(i);
            if (c18088 != null) {
                size2 = c18088.m41142().size() + size2;
            }
        }
        return size2;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C18088 m42784(int i) {
        int iM40219 = m40219(i);
        if (iM40219 >= 0) {
            return (C18088) m43238(iM40219);
        }
        throw new IllegalArgumentException("no such label: ".concat(C16351.m37153(i)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42781(InterfaceC10713 interfaceC10713) {
        int size = size();
        for (int i = 0; i < size; i++) {
            ((C18088) m43238(i)).m41142().m9914(interfaceC10713);
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final C18759 m42783() {
        C18759 c18759 = new C18759(this);
        c18759.f56047 = this.f56047;
        return c18759;
    }
}
