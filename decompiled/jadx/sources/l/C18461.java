package l;

/* JADX INFO: renamed from: l.ᩴۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I3KA */
/* JADX INFO: loaded from: classes5.dex */
public class C18461 extends C19167 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3644 f57241;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42941(C3644 c3644, C5557 c5557) {
        this.f57241 = c3644;
        try {
            c3644.m11139().mo986(this, c5557);
        } finally {
            this.f57241 = null;
        }
    }

    @Override // l.C19167
    /* JADX INFO: renamed from: ֫ */
    public Object mo11809(InterfaceC13206 interfaceC13206, Object obj) {
        if (interfaceC13206 == null) {
            return null;
        }
        C3644 c3644 = this.f57241;
        this.f57241 = new C3644(c3644, interfaceC13206);
        try {
            return interfaceC13206.mo986(this, obj);
        } finally {
            this.f57241 = c3644;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3644 m42940() {
        return this.f57241;
    }
}
