package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23039 implements InterfaceC20516 {
    /* JADX INFO: renamed from: ܽ */
    public final Iterable m51419() {
        return new C13651(mo38572(), new InterfaceC14680() { // from class: l.ܶᩳܽ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // p067l.InterfaceC11771
            public final /* synthetic */ boolean containsKey(Object obj) {
                return C5293.m11447(this, obj);
            }

            @Override // p067l.InterfaceC14680
            public final Object get(int i) {
                return this.f50277.mo38571(i);
            }

            @Override // p067l.InterfaceC11771
            public final /* synthetic */ Object get(Object obj) {
                return C5293.m11448(this, obj);
            }

            @Override // p067l.InterfaceC11771
            public final /* synthetic */ int size() {
                return -1;
            }

            @Override // p067l.InterfaceC14680
            /* JADX INFO: renamed from: ֫ */
            public final /* synthetic */ boolean mo4793(int i) {
                return true;
            }

            @Override // p067l.InterfaceC14680
            /* JADX INFO: renamed from: ܽ */
            public final /* synthetic */ Object mo4687() {
                return null;
            }

            @Override // p067l.InterfaceC14680, java.util.function.IntFunction
            public final Object apply(int i) {
                return get(i);
            }

            @Override // p067l.InterfaceC14680
            /* JADX INFO: renamed from: ֫ */
            public final Object mo4686(int i, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return get(obj);
            }

            @Override // p067l.InterfaceC14680
            public final Object remove(int i) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Function compose(Function function) {
                throw new NoSuchMethodError();
            }
        });
    }

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC20516 interfaceC20516 = (InterfaceC20516) interfaceC10457;
        if (mo38572() != interfaceC20516.mo38572()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < mo38572(); i++) {
            mo38571(i).mo14241(interfaceC20516.mo38571(i));
        }
    }

    @Override // p067l.InterfaceC20516
    /* JADX INFO: renamed from: ᩳ */
    public Iterable mo46275() {
        return m51419();
    }
}
