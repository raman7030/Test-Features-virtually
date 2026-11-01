package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۢ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public class C11759 implements InterfaceC25149, Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public final ConcurrentMapC16391 f32870;

    public /* synthetic */ C11759(ConcurrentMapC16391 concurrentMapC16391, int i) {
        this(concurrentMapC16391);
    }

    public C11759(C5033 c5033) {
        this(new ConcurrentMapC16391(c5033, null));
    }

    public C11759(ConcurrentMapC16391 concurrentMapC16391) {
        this.f32870 = concurrentMapC16391;
    }

    @Override // p067l.InterfaceC25149
    /* JADX INFO: renamed from: ֫ */
    public final Object mo26990(Integer num, CallableC12475 callableC12475) {
        return this.f32870.m37207(num, new C22488(callableC12475));
    }

    @Override // p067l.InterfaceC25149
    /* JADX INFO: renamed from: ܽ */
    public final void mo26992() {
        this.f32870.clear();
    }

    @Override // p067l.InterfaceC25149
    /* JADX INFO: renamed from: ۧ */
    public final void mo26991() {
        for (C6394 c6394 : this.f32870.f48175) {
            c6394.m14628(c6394.f16546.f48174.mo42007());
            c6394.m14634();
        }
    }

    public Object writeReplace() {
        return new C11088(this.f32870);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }
}
