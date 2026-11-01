package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.֡۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAXH */
/* JADX INFO: loaded from: classes2.dex */
public final class C2650 implements InterfaceC18744, Serializable {

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC4387 f4430;

    /* JADX INFO: renamed from: ᩸ */
    public volatile Object f4429 = C7345.f19256;

    /* JADX INFO: renamed from: ᩶ */
    public final Object f4428 = this;

    public C2650(InterfaceC4387 interfaceC4387) {
        this.f4430 = interfaceC4387;
    }

    @Override // p067l.InterfaceC18744
    public final Object getValue() {
        Object objMo6293;
        Object obj = this.f4429;
        C7345 c7345 = C7345.f19256;
        if (obj != c7345) {
            return obj;
        }
        synchronized (this.f4428) {
            objMo6293 = this.f4429;
            if (objMo6293 == c7345) {
                InterfaceC4387 interfaceC4387 = this.f4430;
                C13045.m29861(interfaceC4387);
                objMo6293 = interfaceC4387.mo6293();
                this.f4429 = objMo6293;
                this.f4430 = null;
            }
        }
        return objMo6293;
    }

    public final String toString() {
        return this.f4429 != C7345.f19256 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C19415(getValue());
    }
}
