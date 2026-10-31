package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J18G */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10216 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25642(InterfaceC5982 interfaceC5982, Integer num) {
        interfaceC5982.accept(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.۫ۢᩴ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12332 m25641(final InterfaceC5982 interfaceC5982, final IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        return new InterfaceC5982() { // from class: l.۫ۢᩴ
            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                mo16796((Integer) obj);
            }

            @Override // l.InterfaceC5982
            /* JADX INFO: renamed from: ܽ */
            public final /* synthetic */ void mo16796(Integer num) {
                C10216.m25642((InterfaceC5982) this, num);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                return C10216.m25641((InterfaceC5982) this, intConsumer2);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                interfaceC5982.accept(i);
                intConsumer.accept(i);
            }

            public final Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        };
    }
}
