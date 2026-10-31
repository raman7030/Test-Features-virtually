package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21749 implements InterfaceC19094 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m49070() {
        return new C11871(mo36414(), new InterfaceC12954() { // from class: l.ܶᩳܽ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // l.InterfaceC9893
            public final /* synthetic */ boolean containsKey(Object obj) {
                return C3077.m9405(this, obj);
            }

            @Override // l.InterfaceC12954
            public final Object get(int i) {
                return this.f47147.mo36413(i);
            }

            @Override // l.InterfaceC9893
            public final /* synthetic */ Object get(Object obj) {
                return C3077.m9406(this, obj);
            }

            @Override // l.InterfaceC9893
            public final /* synthetic */ int size() {
                return -1;
            }

            @Override // l.InterfaceC12954
            /* JADX INFO: renamed from: ֫ */
            public final /* synthetic */ boolean mo2422(int i) {
                return true;
            }

            @Override // l.InterfaceC12954
            /* JADX INFO: renamed from: ܽ */
            public final /* synthetic */ Object mo2319() {
                return null;
            }

            @Override // l.InterfaceC12954, java.util.function.IntFunction
            public final Object apply(int i) {
                return get(i);
            }

            @Override // l.InterfaceC12954
            /* JADX INFO: renamed from: ֫ */
            public final Object mo2318(int i, Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return get(obj);
            }

            @Override // l.InterfaceC12954
            public final Object remove(int i) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.function.Function
            public final Function compose(Function function) {
                throw new NoSuchMethodError();
            }
        });
    }

    @Override // l.InterfaceC8510
    /* JADX INFO: renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC19094 interfaceC19094 = (InterfaceC19094) interfaceC8510;
        if (mo36414() != interfaceC19094.mo36414()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < mo36414(); i++) {
            mo36413(i).mo12336(interfaceC19094.mo36413(i));
        }
    }

    @Override // l.InterfaceC19094
    /* JADX INFO: renamed from: ᩳ */
    public Iterable mo43981() {
        return m49070();
    }
}
