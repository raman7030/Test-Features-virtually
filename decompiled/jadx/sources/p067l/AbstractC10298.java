package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B53K */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10298 implements InterfaceC6434 {

    /* JADX INFO: renamed from: ۙ */
    public String f28479;

    /* JADX INFO: renamed from: ᩶ */
    public int f28480;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC11799 f28481;

    /* JADX INFO: renamed from: ᩹ */
    public EnumC12270 f28482;

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֫ۧ */
    public final EnumC12270 mo14712() {
        return this.f28482;
    }

    public AbstractC10298(AbstractC10969 abstractC10969) {
        this.f28481 = abstractC10969;
        this.f28482 = abstractC10969.f30383;
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11799 mo14711() {
        return this.f28481;
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ᩻ */
    public final int mo14722() {
        return this.f28480;
    }

    @Override // p067l.InterfaceC6434
    public final String getPackageName() {
        return this.f28479;
    }

    @Override // p067l.InterfaceC6434
    public final String getPath() {
        return this.f28479;
    }

    public final String toString() {
        return this.f28479;
    }

    @Override // p067l.InterfaceC6434
    public InterfaceC3080 getType(String str) {
        for (int i = 0; i < mo14715(); i++) {
            InterfaceC3080 type = getType(i);
            if (type.getTypeName().equals(str)) {
                return type;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final Iterable m23911() {
        return new C13651(mo14715(), new InterfaceC14680() { // from class: l.᩵ᩳܽ
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
                return this.f65999.getType(i);
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

    /* JADX INFO: renamed from: ܽ */
    public final Iterable m23912() {
        return new C13651(mo14718(), new InterfaceC14680() { // from class: l.֨ᩳܽ
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
                return this.f7292.mo14713(i);
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

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֡֫ */
    public Iterable mo14709() {
        return new C13651(mo14708(), new InterfaceC14680() { // from class: l.ۚᩳܽ
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
                return this.f19927.mo14720(i);
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

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ᩹ */
    public Iterable mo14721() {
        return new C13651(mo14710(), new InterfaceC14680() { // from class: l.֡ᩳܽ
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
                return this.f5081.mo14716(i);
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
        InterfaceC6434 interfaceC6434 = (InterfaceC6434) interfaceC10457;
        if (mo14715() != interfaceC6434.mo14715()) {
            throw new RuntimeException(this.f28479);
        }
        if (mo14718() != interfaceC6434.mo14718()) {
            throw new RuntimeException(this.f28479);
        }
        if (mo14708() != interfaceC6434.mo14708()) {
            throw new RuntimeException(this.f28479);
        }
        if (mo14710() != interfaceC6434.mo14710()) {
            throw new RuntimeException(this.f28479);
        }
        for (int i = 0; i < mo14715(); i++) {
            getType(i).mo14241(interfaceC6434.getType(i));
        }
        for (int i2 = 0; i2 < mo14718(); i2++) {
            mo14713(i2).mo14241(interfaceC6434.mo14713(i2));
        }
        for (int i3 = 0; i3 < mo14708(); i3++) {
            mo14720(i3).mo14241(interfaceC6434.mo14720(i3));
        }
        for (int i4 = 0; i4 < mo14710(); i4++) {
            mo14716(i4).mo14241(interfaceC6434.mo14716(i4));
        }
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۖۧ */
    public Iterable mo14714() {
        return m23911();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۠ۧ */
    public Iterable mo14719() {
        return m23912();
    }
}
