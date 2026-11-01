package p067l;

/* JADX INFO: renamed from: l.۫᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M60I */
/* JADX INFO: loaded from: classes4.dex */
public final class C14387 extends C17278 {

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final /* synthetic */ int f41116 = 0;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C17136 f41117;

    /* JADX INFO: renamed from: ܽ֫ */
    public C5738 f41118;

    @Override // p067l.C17278
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30899() {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14387(C5738 c5738) {
        String strM12791 = c5738.m12791();
        String parent = c5738.getParent();
        super(strM12791, parent != null ? "/".concat(parent) : "/", null, c5738.getSize(), c5738.getTime(), !c5738.isDirectory());
        this.f41118 = c5738;
        C17136 c17136M12761 = c5738.m12761();
        this.f41117 = c17136M12761;
        if (c17136M12761 == null || !c17136M12761.m38800()) {
            return;
        }
        m39130(c17136M12761.m38798());
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo27882() {
        return this.f41118.m12789();
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֨ۧ */
    public final C18028 mo26440() {
        C17136 c17136 = this.f41117;
        if (c17136 == null || !c17136.m38801()) {
            return null;
        }
        return new C18028(c17136.m38799(), (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C5738 m33002() {
        return this.f41118;
    }
}
