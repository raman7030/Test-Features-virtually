package l;

import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64N8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9049 implements InterfaceC9922 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC10418 f27446 = EnumC10418.AOSP;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m23370() {
        return new C11871(mo14956(), new InterfaceC12954() { // from class: l.ۢᩳܽ
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
                return this.f29531.mo14957(i);
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

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23369() {
        Iterator it = mo21936().iterator();
        while (it.hasNext()) {
            if (((InterfaceC4277) it.next()).mo12858() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC8510
    /* JADX INFO: renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC9922 interfaceC9922 = (InterfaceC9922) interfaceC8510;
        C9028 c9028 = (C9028) this;
        if (c9028.mo14956() != interfaceC9922.mo14956()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < c9028.mo14956(); i++) {
            c9028.mo14957(i).mo12336(interfaceC9922.mo14957(i));
        }
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ᩺ */
    public Iterable mo21936() {
        return m23370();
    }
}
