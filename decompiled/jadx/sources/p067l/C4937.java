package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۖᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8ATV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4937 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m10476(InterfaceC6278 interfaceC6278, double d) {
        interfaceC6278.mo14251(C5065.m10797(d));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m10477(InterfaceC6278 interfaceC6278, Float f) {
        interfaceC6278.mo14251(f.floatValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC6278 m10475(InterfaceC6278 interfaceC6278, final DoubleConsumer doubleConsumer) {
        InterfaceC6278 interfaceC6279;
        if (doubleConsumer instanceof InterfaceC6278) {
            interfaceC6279 = (InterfaceC6278) doubleConsumer;
        } else {
            C12826.requireNonNull(doubleConsumer);
            interfaceC6279 = new InterfaceC6278() { // from class: l.ۡᩳᩴ
                @Override // java.util.function.DoubleConsumer
                public final /* synthetic */ void accept(double d) {
                    C4937.m10476(this, d);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo14252((Float) obj);
                }

                @Override // p067l.InterfaceC6278
                /* JADX INFO: renamed from: ֫ */
                public final void mo14251(float f) {
                    doubleConsumer.accept(f);
                }

                @Override // p067l.InterfaceC6278
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ void mo14252(Float f) {
                    C4937.m10477((InterfaceC6278) this, f);
                }

                public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer2) {
                    return C4937.m10475((InterfaceC6278) this, doubleConsumer2);
                }

                @Override // p067l.InterfaceC6278
                /* JADX INFO: renamed from: ֫ */
                public final C17676 mo14250(InterfaceC6278 interfaceC62710) {
                    return new C17676(this, interfaceC62710);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC6278.mo14250(interfaceC6279);
    }
}
