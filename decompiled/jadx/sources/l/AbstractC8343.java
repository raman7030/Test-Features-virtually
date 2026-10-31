package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B53K */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8343 implements InterfaceC4277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f25565;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25566;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 f25567;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC10418 f25568;

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ֫ۧ */
    public final EnumC10418 mo12848() {
        return this.f25568;
    }

    public AbstractC8343(AbstractC9049 abstractC9049) {
        this.f25567 = abstractC9049;
        this.f25568 = abstractC9049.f27446;
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9922 mo12847() {
        return this.f25567;
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ᩻ */
    public final int mo12858() {
        return this.f25566;
    }

    @Override // l.InterfaceC4277
    public final String getPackageName() {
        return this.f25565;
    }

    @Override // l.InterfaceC4277
    public final String getPath() {
        return this.f25565;
    }

    public final String toString() {
        return this.f25565;
    }

    @Override // l.InterfaceC4277
    public InterfaceC0748 getType(String str) {
        for (int i = 0; i < mo12851(); i++) {
            InterfaceC0748 type = getType(i);
            if (type.getTypeName().equals(str)) {
                return type;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Iterable m21941() {
        return new C11871(mo12851(), new InterfaceC12954() { // from class: l.᩵ᩳܽ
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
                return this.f63379.getType(i);
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m21942() {
        return new C11871(mo12854(), new InterfaceC12954() { // from class: l.֨ᩳܽ
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
                return this.f4518.mo12849(i);
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

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ֡֫ */
    public Iterable mo12845() {
        return new C11871(mo12844(), new InterfaceC12954() { // from class: l.ۚᩳܽ
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
                return this.f17086.mo12856(i);
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

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ᩹ */
    public Iterable mo12857() {
        return new C11871(mo12846(), new InterfaceC12954() { // from class: l.֡ᩳܽ
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
                return this.f2306.mo12852(i);
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
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
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
        InterfaceC4277 interfaceC4277 = (InterfaceC4277) interfaceC8510;
        if (mo12851() != interfaceC4277.mo12851()) {
            throw new RuntimeException(this.f25565);
        }
        if (mo12854() != interfaceC4277.mo12854()) {
            throw new RuntimeException(this.f25565);
        }
        if (mo12844() != interfaceC4277.mo12844()) {
            throw new RuntimeException(this.f25565);
        }
        if (mo12846() != interfaceC4277.mo12846()) {
            throw new RuntimeException(this.f25565);
        }
        for (int i = 0; i < mo12851(); i++) {
            getType(i).mo12336(interfaceC4277.getType(i));
        }
        for (int i2 = 0; i2 < mo12854(); i2++) {
            mo12849(i2).mo12336(interfaceC4277.mo12849(i2));
        }
        for (int i3 = 0; i3 < mo12844(); i3++) {
            mo12856(i3).mo12336(interfaceC4277.mo12856(i3));
        }
        for (int i4 = 0; i4 < mo12846(); i4++) {
            mo12852(i4).mo12336(interfaceC4277.mo12852(i4));
        }
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۖۧ */
    public Iterable mo12850() {
        return m21941();
    }

    @Override // l.InterfaceC4277
    /* JADX INFO: renamed from: ۠ۧ */
    public Iterable mo12855() {
        return m21942();
    }
}
