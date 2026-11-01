package p067l;

/* JADX INFO: renamed from: l.᩶ۤ */
/* JADX INFO: compiled from: F5I3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1839 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1944 f67733;

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo15322();

    public AbstractC1839(InterfaceC1944 interfaceC1944) {
        this.f67733 = interfaceC1944;
    }

    @Override // p067l.InterfaceC1594
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo38019(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        InterfaceC1944 interfaceC1944 = this.f67733;
        if (interfaceC1944 == null) {
            return mo15322();
        }
        int iMo51015 = interfaceC1944.mo51015(i, charSequence);
        if (iMo51015 == 0) {
            return true;
        }
        if (iMo51015 != 1) {
            return mo15322();
        }
        return false;
    }
}
