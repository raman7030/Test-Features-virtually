package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5WF */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21044 implements InterfaceC21211, InterfaceC12954 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f67902;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7099 f67903;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f67904;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // l.InterfaceC9893
    public final /* synthetic */ boolean containsKey(Object obj) {
        return C3077.m9405(this, obj);
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

    public AbstractC21044(InterfaceC7099 interfaceC7099, int i) {
        this.f67903 = interfaceC7099;
        this.f67904 = i;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9922 mo29404() {
        return this.f67903.mo8391();
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC4277 mo29407() {
        return this.f67903.mo8396();
    }

    @Override // l.InterfaceC21211
    public InterfaceC0748 getType() {
        return this.f67903.getType();
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ܿ */
    public InterfaceC7099 mo29410() {
        return this.f67903;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final int mo47883() {
        return this.f67904;
    }

    @Override // l.InterfaceC21211
    public final int getParent() {
        return this.f67902;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Iterable m47885() {
        return new C11871(mo29409(), this);
    }

    @Override // l.InterfaceC12954, java.util.function.IntFunction
    public final Object apply(int i) {
        return get(i);
    }

    @Override // l.InterfaceC21211
    public final String getPath() {
        return mo29410().getPath() + "/" + mo29406();
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int mo47884() {
        InterfaceC0748 type = getType();
        int iMo12858 = (type.mo2874().mo12858() & 255) << 24;
        return ((type.mo2870() & 255) << 16) | iMo12858 | (this.f67904 & 65535);
    }

    @Override // l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String mo47886() {
        return String.format("%08x", Integer.valueOf(mo47884()));
    }

    public final String toString() {
        return getPath();
    }

    @Override // l.InterfaceC8510
    /* JADX INFO: renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC21211 interfaceC21211 = (InterfaceC21211) interfaceC8510;
        if (this.f67904 != interfaceC21211.mo47883()) {
            throw new RuntimeException(getPath());
        }
        if (!C11003.equals(mo29406(), interfaceC21211.mo29406())) {
            throw new RuntimeException(getPath());
        }
        if (mo29412() != interfaceC21211.mo29412()) {
            throw new RuntimeException(getPath());
        }
        if (mo29409() != interfaceC21211.mo29409() && mo29412()) {
            throw new RuntimeException(getPath());
        }
        if (mo29405() != interfaceC21211.mo29405()) {
            throw new RuntimeException(getPath());
        }
        if (mo29411() != interfaceC21211.mo29411()) {
            throw new RuntimeException(getPath());
        }
        if (mo29408() != interfaceC21211.mo29408()) {
            throw new RuntimeException(getPath());
        }
        if (getType().getTypeName().equals("style")) {
            if (this instanceof C18906) {
                ((C18906) this).m43642(C18906.f59581);
            }
            if (interfaceC8510 instanceof C18906) {
                ((C18906) interfaceC8510).m43642(C18906.f59581);
            }
        }
        for (int i = 0; i < mo29409(); i++) {
            getValue(i).mo12336(interfaceC21211.getValue(i));
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC12954
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        return getValue(i);
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC21211
    public Iterable values() {
        return m47885();
    }
}
