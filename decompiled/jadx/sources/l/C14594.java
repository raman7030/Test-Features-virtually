package l;

/* JADX INFO: renamed from: l.ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1BI */
/* JADX INFO: loaded from: classes5.dex */
public class C14594 extends C17417 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f44683;

    public C14594(AbstractC8245 abstractC8245) {
        super(abstractC8245);
        if (abstractC8245 instanceof C16005) {
            this.f53268 = EnumC18123.HORIZONTAL_DIMENSION;
        } else {
            this.f53268 = EnumC18123.VERTICAL_DIMENSION;
        }
    }

    @Override // l.C17417
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo34849(int i) {
        if (this.f53276) {
            return;
        }
        this.f53276 = true;
        this.f53271 = i;
        for (InterfaceC11068 interfaceC11068 : this.f53269) {
            interfaceC11068.mo6241(interfaceC11068);
        }
    }
}
