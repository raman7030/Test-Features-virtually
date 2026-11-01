package p067l;

/* JADX INFO: renamed from: l.ᩴۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I3KA */
/* JADX INFO: loaded from: classes5.dex */
public class C19913 extends C20584 {

    /* JADX INFO: renamed from: ֫ */
    public C5831 f60461;

    /* JADX INFO: renamed from: ֫ */
    public final void m45217(C5831 c5831, C7650 c7650) {
        this.f60461 = c5831;
        try {
            c5831.m13115().mo3380(this, c7650);
        } finally {
            this.f60461 = null;
        }
    }

    @Override // p067l.C20584
    /* JADX INFO: renamed from: ֫ */
    public Object mo13745(InterfaceC14919 interfaceC14919, Object obj) {
        if (interfaceC14919 == null) {
            return null;
        }
        C5831 c5831 = this.f60461;
        this.f60461 = new C5831(c5831, interfaceC14919);
        try {
            return interfaceC14919.mo3380(this, obj);
        } finally {
            this.f60461 = c5831;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5831 m45216() {
        return this.f60461;
    }
}
