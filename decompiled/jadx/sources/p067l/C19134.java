package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ܿ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19134 extends C11088 implements InterfaceC3020 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֫֫ */
    public transient InterfaceC3020 f57124;

    @Override // p067l.InterfaceC3020
    public final Object get(Object obj) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f57124 = m25533().m10713(this.f30722);
    }

    @Override // p067l.InterfaceC18263
    public final Object apply(Object obj) {
        return ((C9076) this.f57124).apply(obj);
    }

    private Object readResolve() {
        return this.f57124;
    }
}
