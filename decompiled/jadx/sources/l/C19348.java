package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩵۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAXH */
/* JADX INFO: loaded from: classes5.dex */
public final class C19348 implements InterfaceC17230, Serializable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f62643 = AtomicReferenceFieldUpdater.newUpdater(C19348.class, Object.class, "᩸");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile Object f62644 = C5236.f16416;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC2123 f62645;

    public C19348(InterfaceC2123 interfaceC2123) {
        this.f62645 = interfaceC2123;
    }

    @Override // l.InterfaceC17230
    public final Object getValue() {
        Object obj = this.f62644;
        C5236 c5236 = C5236.f16416;
        if (obj != c5236) {
            return obj;
        }
        InterfaceC2123 interfaceC2123 = this.f62645;
        if (interfaceC2123 != null) {
            Object objMo4049 = interfaceC2123.mo4049();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62643;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c5236, objMo4049)) {
                if (atomicReferenceFieldUpdater.get(this) != c5236) {
                }
            }
            this.f62645 = null;
            return objMo4049;
        }
        return this.f62644;
    }

    public final String toString() {
        return this.f62644 != C5236.f16416 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C17936(getValue());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
