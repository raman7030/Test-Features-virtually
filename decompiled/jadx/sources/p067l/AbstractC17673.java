package p067l;

/* JADX INFO: renamed from: l.ܺᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4OL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17673 implements InterfaceC11128 {

    /* JADX INFO: renamed from: ᩸ */
    public int f52799;

    /* JADX INFO: renamed from: ᩹ */
    public String f52800;

    public AbstractC17673(int i, String str) {
        this.f52799 = i;
        this.f52800 = str;
    }

    @Override // p067l.InterfaceC11128
    /* JADX INFO: renamed from: ᩻ */
    public final int mo25656() {
        return this.f52799;
    }

    @Override // p067l.InterfaceC11128
    public final String getPackageName() {
        return this.f52800;
    }

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC11128 interfaceC11128 = (InterfaceC11128) interfaceC10457;
        if (this.f52799 != interfaceC11128.mo25656()) {
            throw new RuntimeException();
        }
        if (!C12826.equals(this.f52800, interfaceC11128.getPackageName())) {
            throw new RuntimeException();
        }
    }
}
