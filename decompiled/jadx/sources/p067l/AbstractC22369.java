package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5WF */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22369 implements InterfaceC22528, InterfaceC14680 {

    /* JADX INFO: renamed from: ᩶ */
    public int f70587;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9116 f70588;

    /* JADX INFO: renamed from: ᩹ */
    public final int f70589;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // p067l.InterfaceC11771
    public final /* synthetic */ boolean containsKey(Object obj) {
        return C5293.m11447(this, obj);
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

    public AbstractC22369(InterfaceC9116 interfaceC9116, int i) {
        this.f70588 = interfaceC9116;
        this.f70589 = i;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11799 mo31466() {
        return this.f70588.mo10437();
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC6434 mo31469() {
        return this.f70588.mo10442();
    }

    @Override // p067l.InterfaceC22528
    public InterfaceC3080 getType() {
        return this.f70588.getType();
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܿ */
    public InterfaceC9116 mo31472() {
        return this.f70588;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۚۧ */
    public final int mo50213() {
        return this.f70589;
    }

    @Override // p067l.InterfaceC22528
    public final int getParent() {
        return this.f70587;
    }

    /* JADX INFO: renamed from: ܶ */
    public final Iterable m50215() {
        return new C13651(mo31471(), this);
    }

    @Override // p067l.InterfaceC14680, java.util.function.IntFunction
    public final Object apply(int i) {
        return get(i);
    }

    @Override // p067l.InterfaceC22528
    public final String getPath() {
        return mo31472().getPath() + "/" + mo31468();
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۧ֫ */
    public final int mo50214() {
        InterfaceC3080 type = getType();
        int iMo14722 = (type.mo5203().mo14722() & 255) << 24;
        return ((type.mo5199() & 255) << 16) | iMo14722 | (this.f70589 & 65535);
    }

    @Override // p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4686(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ᩴ */
    public final String mo50216() {
        return String.format("%08x", Integer.valueOf(mo50214()));
    }

    public final String toString() {
        return getPath();
    }

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC22528 interfaceC22528 = (InterfaceC22528) interfaceC10457;
        if (this.f70589 != interfaceC22528.mo50213()) {
            throw new RuntimeException(getPath());
        }
        if (!C12826.equals(mo31468(), interfaceC22528.mo31468())) {
            throw new RuntimeException(getPath());
        }
        if (mo31474() != interfaceC22528.mo31474()) {
            throw new RuntimeException(getPath());
        }
        if (mo31471() != interfaceC22528.mo31471() && mo31474()) {
            throw new RuntimeException(getPath());
        }
        if (mo31467() != interfaceC22528.mo31467()) {
            throw new RuntimeException(getPath());
        }
        if (mo31473() != interfaceC22528.mo31473()) {
            throw new RuntimeException(getPath());
        }
        if (mo31470() != interfaceC22528.mo31470()) {
            throw new RuntimeException(getPath());
        }
        if (getType().getTypeName().equals("style")) {
            if (this instanceof C20337) {
                ((C20337) this).m45908(C20337.f62811);
            }
            if (interfaceC10457 instanceof C20337) {
                ((C20337) interfaceC10457).m45908(C20337.f62811);
            }
        }
        for (int i = 0; i < mo31471(); i++) {
            getValue(i).mo14241(interfaceC22528.getValue(i));
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // p067l.InterfaceC14680
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC14680
    public final Object get(int i) {
        return getValue(i);
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // p067l.InterfaceC22528
    public Iterable values() {
        return m50215();
    }
}
