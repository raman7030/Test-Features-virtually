package l;

import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ܿ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public final class C17640 extends C9174 implements InterfaceC0685 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0685 f53931;

    @Override // l.InterfaceC0685
    public final Object get(Object obj) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f53931 = m23582().m8653(this.f27782);
    }

    @Override // l.InterfaceC16724
    public final Object apply(Object obj) {
        return ((C7057) this.f53931).apply(obj);
    }

    private Object readResolve() {
        return this.f53931;
    }
}
