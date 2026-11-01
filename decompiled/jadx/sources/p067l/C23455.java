package p067l;

/* JADX INFO: renamed from: l.᩹ۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R704 */
/* JADX INFO: loaded from: classes.dex */
public final class C23455 {

    /* JADX INFO: renamed from: ֫ */
    public final C13397 f74700;

    /* JADX INFO: renamed from: ۧ */
    public boolean f74701;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC12922 f74702;

    /* JADX INFO: renamed from: ᩳ */
    public C9729 f74703;

    public C23455(C13397 c13397) {
        this.f74700 = c13397;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ */
    public static void m52161(C23455 c23455) {
        try {
            InterfaceC12922 interfaceC12922 = c23455.f74702;
            if (interfaceC12922 != null) {
                interfaceC12922.mo8521();
            }
        } finally {
            c23455.f74702 = null;
            C9729 c9729 = c23455.f74703;
            c23455.f74703 = null;
            if (c9729 != null) {
                c9729.close();
            }
        }
    }
}
