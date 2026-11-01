package p067l;

/* JADX INFO: renamed from: l.᩸ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBAF */
/* JADX INFO: loaded from: classes5.dex */
public final class C22842 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final C20987 f71928;

    /* JADX INFO: renamed from: ܽ */
    public final int f71929;

    public C22842(C20987 c20987) {
        super("BootstrapMethods");
        this.f71928 = c20987;
        int size = (c20987.size() * 4) + 8;
        for (int i = 0; i < c20987.size(); i++) {
            size += c20987.m56523get(i).m45863().size() * 2;
        }
        this.f71929 = size;
    }

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return this.f71929;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20987 m51046() {
        return this.f71928;
    }
}
