package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩵۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAXH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20757 implements InterfaceC18744, Serializable {

    /* JADX INFO: renamed from: ᩶ */
    public static final AtomicReferenceFieldUpdater f65257 = AtomicReferenceFieldUpdater.newUpdater(C20757.class, Object.class, "᩸");

    /* JADX INFO: renamed from: ᩸ */
    public volatile Object f65258 = C7345.f19256;

    /* JADX INFO: renamed from: ᩹ */
    public volatile InterfaceC4387 f65259;

    public C20757(InterfaceC4387 interfaceC4387) {
        this.f65259 = interfaceC4387;
    }

    @Override // p067l.InterfaceC18744
    public final Object getValue() {
        Object obj = this.f65258;
        C7345 c7345 = C7345.f19256;
        if (obj != c7345) {
            return obj;
        }
        InterfaceC4387 interfaceC4387 = this.f65259;
        if (interfaceC4387 != null) {
            Object objMo6293 = interfaceC4387.mo6293();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65257;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c7345, objMo6293)) {
                if (atomicReferenceFieldUpdater.get(this) != c7345) {
                }
            }
            this.f65259 = null;
            return objMo6293;
        }
        return this.f65258;
    }

    public final String toString() {
        return this.f65258 != C7345.f19256 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C19415(getValue());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
