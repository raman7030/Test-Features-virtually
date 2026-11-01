package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ۜ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9076 extends C11759 implements InterfaceC3020 {
    public static final long serialVersionUID = 1;

    @Override // p067l.InterfaceC3020
    public final Object get(Object obj) {
        ConcurrentMapC16391 concurrentMapC16391 = this.f32870;
        return concurrentMapC16391.m37207(obj, concurrentMapC16391.f48179);
    }

    @Override // p067l.InterfaceC18263
    public final Object apply(Object obj) {
        try {
            return get(obj);
        } catch (ExecutionException e) {
            throw new C8165(e.getCause());
        }
    }

    @Override // p067l.C11759
    public Object writeReplace() {
        return new C19134(this.f32870);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }
}
