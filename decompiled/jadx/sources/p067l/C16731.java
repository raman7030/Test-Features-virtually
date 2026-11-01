package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAYZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16731 implements InterfaceC18744, Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public Object f49338 = C7345.f19256;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC4387 f49339;

    public C16731(InterfaceC4387 interfaceC4387) {
        this.f49339 = interfaceC4387;
    }

    @Override // p067l.InterfaceC18744
    public final Object getValue() {
        if (this.f49338 == C7345.f19256) {
            InterfaceC4387 interfaceC4387 = this.f49339;
            C13045.m29861(interfaceC4387);
            this.f49338 = interfaceC4387.mo6293();
            this.f49339 = null;
        }
        return this.f49338;
    }

    public final String toString() {
        return this.f49338 != C7345.f19256 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C19415(getValue());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
