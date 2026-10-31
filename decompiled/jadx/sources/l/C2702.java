package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۖᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8ATV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2702 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8430(InterfaceC4113 interfaceC4113, double d) {
        interfaceC4113.mo12346(C2837.m8730(d));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8431(InterfaceC4113 interfaceC4113, Float f) {
        interfaceC4113.mo12346(f.floatValue());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC4113 m8429(InterfaceC4113 interfaceC4113, final DoubleConsumer doubleConsumer) {
        InterfaceC4113 interfaceC4114;
        if (doubleConsumer instanceof InterfaceC4113) {
            interfaceC4114 = (InterfaceC4113) doubleConsumer;
        } else {
            C11003.requireNonNull(doubleConsumer);
            interfaceC4114 = new InterfaceC4113() { // from class: l.ۡᩳᩴ
                @Override // java.util.function.DoubleConsumer
                public final /* synthetic */ void accept(double d) {
                    C2702.m8430(this, d);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo12347((Float) obj);
                }

                @Override // l.InterfaceC4113
                /* JADX INFO: renamed from: ֫ */
                public final void mo12346(float f) {
                    doubleConsumer.accept(f);
                }

                @Override // l.InterfaceC4113
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ void mo12347(Float f) {
                    C2702.m8431((InterfaceC4113) this, f);
                }

                public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer2) {
                    return C2702.m8429((InterfaceC4113) this, doubleConsumer2);
                }

                @Override // l.InterfaceC4113
                /* JADX INFO: renamed from: ֫ */
                public final C16106 mo12345(InterfaceC4113 interfaceC4115) {
                    return new C16106(this, interfaceC4115);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC4113.mo12345(interfaceC4114);
    }
}
