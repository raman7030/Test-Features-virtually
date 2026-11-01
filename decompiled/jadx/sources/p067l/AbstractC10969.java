package p067l;

import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64N8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10969 implements InterfaceC11799 {

    /* JADX INFO: renamed from: ᩸ */
    public EnumC12270 f30383 = EnumC12270.AOSP;

    /* JADX INFO: renamed from: ܽ */
    public final Iterable m25315() {
        return new C13651(mo16866(), new InterfaceC14680() { // from class: l.ۢᩳܽ
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
                return this.f32482.mo16867(i);
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

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo25314() {
        Iterator it = mo23906().iterator();
        while (it.hasNext()) {
            if (((InterfaceC6434) it.next()).mo14722() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC11799 interfaceC11799 = (InterfaceC11799) interfaceC10457;
        C10949 c10949 = (C10949) this;
        if (c10949.mo16866() != interfaceC11799.mo16866()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < c10949.mo16866(); i++) {
            c10949.mo16867(i).mo14241(interfaceC11799.mo16867(i));
        }
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ᩺ */
    public Iterable mo23906() {
        return m25315();
    }
}
