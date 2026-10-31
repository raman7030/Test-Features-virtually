package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAYZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15112 implements InterfaceC17230, Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f46218 = C5236.f16416;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC2123 f46219;

    public C15112(InterfaceC2123 interfaceC2123) {
        this.f46219 = interfaceC2123;
    }

    @Override // l.InterfaceC17230
    public final Object getValue() {
        if (this.f46218 == C5236.f16416) {
            InterfaceC2123 interfaceC2123 = this.f46219;
            C11233.m27799(interfaceC2123);
            this.f46218 = interfaceC2123.mo4049();
            this.f46219 = null;
        }
        return this.f46218;
    }

    public final String toString() {
        return this.f46218 != C5236.f16416 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C17936(getValue());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
