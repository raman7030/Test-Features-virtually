package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9QQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4110 implements InterfaceC16270 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f13060;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f13061;

    public AbstractC4110(String str, String str2) {
        this.f13061 = str;
        this.f13060 = str2;
    }

    @Override // l.InterfaceC16270
    public final String getName() {
        return this.f13061;
    }

    @Override // l.InterfaceC16270
    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public final String mo12339() {
        return this.f13060;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m12338() {
        return new C11871(mo2311(), new InterfaceC12954() { // from class: l.ۖᩳܽ
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
                return this.f8441.mo2310(i);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC16270 interfaceC16270 = (InterfaceC16270) interfaceC8510;
        if (!C11003.equals(this.f13061, interfaceC16270.getName())) {
            throw new RuntimeException();
        }
        if (!C11003.equals(this.f13060, interfaceC16270.mo12339())) {
            throw new RuntimeException();
        }
        if (mo2311() != interfaceC16270.mo2311()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < mo2311(); i++) {
            mo2310(i).mo12336(interfaceC16270.mo2310(i));
        }
    }

    @Override // l.InterfaceC16270
    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public Iterable mo12337() {
        return m12338();
    }
}
