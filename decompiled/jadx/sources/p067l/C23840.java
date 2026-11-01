package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QATC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23840 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m52908(InterfaceC21829 interfaceC21829, int i) {
        interfaceC21829.mo16295(C5065.m10796(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m52909(InterfaceC21829 interfaceC21829, Byte b) {
        interfaceC21829.mo16295(b.byteValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC21829 m52907(InterfaceC21829 interfaceC21829, final IntConsumer intConsumer) {
        InterfaceC21829 interfaceC218210;
        if (intConsumer instanceof InterfaceC21829) {
            interfaceC218210 = (InterfaceC21829) intConsumer;
        } else {
            C12826.requireNonNull(intConsumer);
            interfaceC218210 = new InterfaceC21829() { // from class: l.ܶ᩺ۘ
                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    C23840.m52908(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo16296((Byte) obj);
                }

                @Override // p067l.InterfaceC21829
                /* JADX INFO: renamed from: ֫ */
                public final void mo16295(byte b) {
                    intConsumer.accept(b);
                }

                @Override // p067l.InterfaceC21829
                /* JADX INFO: renamed from: ֫ */
                public final /* synthetic */ void mo16296(Byte b) {
                    C23840.m52909((InterfaceC21829) this, b);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return C23840.m52907((InterfaceC21829) this, intConsumer2);
                }

                @Override // p067l.InterfaceC21829
                /* JADX INFO: renamed from: ֫ */
                public final C23170 mo16294(InterfaceC21829 interfaceC218211) {
                    return new C23170(this, interfaceC218211);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC21829.mo16294(interfaceC218210);
    }
}
