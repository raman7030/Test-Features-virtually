package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ۜ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7057 extends C9880 implements InterfaceC0685 {
    public static final long serialVersionUID = 1;

    @Override // l.InterfaceC0685
    public final Object get(Object obj) {
        ConcurrentMapC14754 concurrentMapC14754 = this.f29913;
        return concurrentMapC14754.m35060(obj, concurrentMapC14754.f45066);
    }

    @Override // l.InterfaceC16724
    public final Object apply(Object obj) {
        try {
            return get(obj);
        } catch (ExecutionException e) {
            throw new C6099(e.getCause());
        }
    }

    @Override // l.C9880
    public Object writeReplace() {
        return new C17640(this.f29913);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }
}
