package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܳۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SATH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16139 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m36729(InterfaceC24857 interfaceC24857, int i) {
        interfaceC24857.mo20276(C5065.m10799(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m36730(InterfaceC24857 interfaceC24857, Character ch) {
        interfaceC24857.mo20276(ch.charValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24857 m36728(InterfaceC24857 interfaceC24857, final IntConsumer intConsumer) {
        InterfaceC24857 interfaceC24858;
        if (intConsumer instanceof InterfaceC24857) {
            interfaceC24858 = (InterfaceC24857) intConsumer;
        } else {
            C12826.requireNonNull(intConsumer);
            interfaceC24858 = new InterfaceC24857() { // from class: l.ᩳۧᩴ
                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    C16139.m36729(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo20274((Character) obj);
                }

                @Override // p067l.InterfaceC24857
                /* JADX INFO: renamed from: ۧ */
                public final /* synthetic */ void mo20274(Character ch) {
                    C16139.m36730((InterfaceC24857) this, ch);
                }

                @Override // p067l.InterfaceC24857
                /* JADX INFO: renamed from: ܽ */
                public final void mo20276(char c) {
                    intConsumer.accept(c);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return C16139.m36728((InterfaceC24857) this, intConsumer2);
                }

                @Override // p067l.InterfaceC24857
                /* JADX INFO: renamed from: ܽ */
                public final C18822 mo20275(InterfaceC24857 interfaceC24859) {
                    return new C18822(this, interfaceC24859);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC24857.mo20275(interfaceC24858);
    }
}
