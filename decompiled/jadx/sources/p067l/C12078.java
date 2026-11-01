package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J18G */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12078 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m27664(InterfaceC8054 interfaceC8054, Integer num) {
        interfaceC8054.accept(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.۫ۢᩴ] */
    /* JADX INFO: renamed from: ֫ */
    public static C14089 m27663(final InterfaceC8054 interfaceC8054, final IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        return new InterfaceC8054() { // from class: l.۫ۢᩴ
            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                mo18722((Integer) obj);
            }

            @Override // p067l.InterfaceC8054
            /* JADX INFO: renamed from: ܽ */
            public final /* synthetic */ void mo18722(Integer num) {
                C12078.m27664((InterfaceC8054) this, num);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                return C12078.m27663((InterfaceC8054) this, intConsumer2);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                interfaceC8054.accept(i);
                intConsumer.accept(i);
            }

            public final Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        };
    }
}
