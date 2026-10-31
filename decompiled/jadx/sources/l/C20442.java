package l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩶᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C20442 extends AbstractQueue {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21853 f65942;

    public C20442() {
        C21853 c21853 = new C21853();
        c21853.f70017 = c21853;
        c21853.f70018 = c21853;
        this.f65942 = c21853;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC23927 interfaceC23927 = (InterfaceC23927) obj;
        InterfaceC23927 interfaceC23927Mo17634 = interfaceC23927.mo17634();
        InterfaceC23927 interfaceC23927Mo17647 = interfaceC23927.mo17647();
        Logger logger = ConcurrentMapC14754.f45046;
        interfaceC23927Mo17634.mo17641(interfaceC23927Mo17647);
        interfaceC23927Mo17647.mo17637(interfaceC23927Mo17634);
        C21853 c21853 = this.f65942;
        InterfaceC23927 interfaceC23928 = c21853.f70018;
        interfaceC23928.mo17641(interfaceC23927);
        interfaceC23927.mo17637(interfaceC23928);
        interfaceC23927.mo17641(c21853);
        c21853.f70018 = interfaceC23927;
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C21853 c21853 = this.f65942;
        InterfaceC23927 interfaceC23927 = c21853.f70017;
        while (interfaceC23927 != c21853) {
            InterfaceC23927 interfaceC23927Mo17647 = interfaceC23927.mo17647();
            Logger logger = ConcurrentMapC14754.f45046;
            EnumC16228 enumC16228 = EnumC16228.INSTANCE;
            interfaceC23927.mo17641(enumC16228);
            interfaceC23927.mo17637(enumC16228);
            interfaceC23927 = interfaceC23927Mo17647;
        }
        c21853.f70017 = c21853;
        c21853.f70018 = c21853;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C21853 c21853 = this.f65942;
        return c21853.f70017 == c21853;
    }

    @Override // java.util.Queue
    public final Object peek() {
        C21853 c21853 = this.f65942;
        InterfaceC23927 interfaceC23927 = c21853.f70017;
        if (interfaceC23927 == c21853) {
            return null;
        }
        return interfaceC23927;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C21853 c21853 = this.f65942;
        InterfaceC23927 interfaceC23927 = c21853.f70017;
        if (interfaceC23927 == c21853) {
            return null;
        }
        remove(interfaceC23927);
        return interfaceC23927;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C21853 c21853 = this.f65942;
        int i = 0;
        for (InterfaceC23927 interfaceC23927Mo17647 = c21853.f70017; interfaceC23927Mo17647 != c21853; interfaceC23927Mo17647 = interfaceC23927Mo17647.mo17647()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC23927 interfaceC23927 = (InterfaceC23927) obj;
        InterfaceC23927 interfaceC23927Mo17634 = interfaceC23927.mo17634();
        InterfaceC23927 interfaceC23927Mo17647 = interfaceC23927.mo17647();
        Logger logger = ConcurrentMapC14754.f45046;
        interfaceC23927Mo17634.mo17641(interfaceC23927Mo17647);
        interfaceC23927Mo17647.mo17637(interfaceC23927Mo17634);
        EnumC16228 enumC16228 = EnumC16228.INSTANCE;
        interfaceC23927.mo17641(enumC16228);
        interfaceC23927.mo17637(enumC16228);
        return interfaceC23927Mo17647 != enumC16228;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((InterfaceC23927) obj).mo17647() != EnumC16228.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C21853 c21853 = this.f65942;
        InterfaceC23927 interfaceC23927 = c21853.f70017;
        if (interfaceC23927 == c21853) {
            interfaceC23927 = null;
        }
        return new C22558(this, interfaceC23927);
    }
}
