package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۢ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public class C9880 implements InterfaceC23969, Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC14754 f29913;

    public /* synthetic */ C9880(ConcurrentMapC14754 concurrentMapC14754, int i) {
        this(concurrentMapC14754);
    }

    public C9880(C2803 c2803) {
        this(new ConcurrentMapC14754(c2803, null));
    }

    public C9880(ConcurrentMapC14754 concurrentMapC14754) {
        this.f29913 = concurrentMapC14754;
    }

    @Override // l.InterfaceC23969
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo24975(Integer num, CallableC10633 callableC10633) {
        return this.f29913.m35060(num, new C21169(callableC10633));
    }

    @Override // l.InterfaceC23969
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo24977() {
        this.f29913.clear();
    }

    @Override // l.InterfaceC23969
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo24976() {
        for (C4235 c4235 : this.f29913.f45062) {
            c4235.m12752(c4235.f13733.f45061.mo39766());
            c4235.m12758();
        }
    }

    public Object writeReplace() {
        return new C9174(this.f29913);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }
}
