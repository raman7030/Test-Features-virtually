package p067l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩶᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C21797 extends AbstractQueue {

    /* JADX INFO: renamed from: ᩸ */
    public final C23138 f68617;

    public C21797() {
        C23138 c23138 = new C23138();
        c23138.f72726 = c23138;
        c23138.f72727 = c23138;
        this.f68617 = c23138;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC25109 interfaceC25109 = (InterfaceC25109) obj;
        InterfaceC25109 interfaceC25109Mo19574 = interfaceC25109.mo19574();
        InterfaceC25109 interfaceC25109Mo19587 = interfaceC25109.mo19587();
        Logger logger = ConcurrentMapC16391.f48159;
        interfaceC25109Mo19574.mo19581(interfaceC25109Mo19587);
        interfaceC25109Mo19587.mo19577(interfaceC25109Mo19574);
        C23138 c23138 = this.f68617;
        InterfaceC25109 interfaceC251010 = c23138.f72727;
        interfaceC251010.mo19581(interfaceC25109);
        interfaceC25109.mo19577(interfaceC251010);
        interfaceC25109.mo19581(c23138);
        c23138.f72727 = interfaceC25109;
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C23138 c23138 = this.f68617;
        InterfaceC25109 interfaceC25109 = c23138.f72726;
        while (interfaceC25109 != c23138) {
            InterfaceC25109 interfaceC25109Mo19587 = interfaceC25109.mo19587();
            Logger logger = ConcurrentMapC16391.f48159;
            EnumC17792 enumC17792 = EnumC17792.INSTANCE;
            interfaceC25109.mo19581(enumC17792);
            interfaceC25109.mo19577(enumC17792);
            interfaceC25109 = interfaceC25109Mo19587;
        }
        c23138.f72726 = c23138;
        c23138.f72727 = c23138;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C23138 c23138 = this.f68617;
        return c23138.f72726 == c23138;
    }

    @Override // java.util.Queue
    public final Object peek() {
        C23138 c23138 = this.f68617;
        InterfaceC25109 interfaceC25109 = c23138.f72726;
        if (interfaceC25109 == c23138) {
            return null;
        }
        return interfaceC25109;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C23138 c23138 = this.f68617;
        InterfaceC25109 interfaceC25109 = c23138.f72726;
        if (interfaceC25109 == c23138) {
            return null;
        }
        remove(interfaceC25109);
        return interfaceC25109;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C23138 c23138 = this.f68617;
        int i = 0;
        for (InterfaceC25109 interfaceC25109Mo19587 = c23138.f72726; interfaceC25109Mo19587 != c23138; interfaceC25109Mo19587 = interfaceC25109Mo19587.mo19587()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC25109 interfaceC25109 = (InterfaceC25109) obj;
        InterfaceC25109 interfaceC25109Mo19574 = interfaceC25109.mo19574();
        InterfaceC25109 interfaceC25109Mo19587 = interfaceC25109.mo19587();
        Logger logger = ConcurrentMapC16391.f48159;
        interfaceC25109Mo19574.mo19581(interfaceC25109Mo19587);
        interfaceC25109Mo19587.mo19577(interfaceC25109Mo19574);
        EnumC17792 enumC17792 = EnumC17792.INSTANCE;
        interfaceC25109.mo19581(enumC17792);
        interfaceC25109.mo19577(enumC17792);
        return interfaceC25109Mo19587 != enumC17792;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((InterfaceC25109) obj).mo19587() != EnumC17792.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C23138 c23138 = this.f68617;
        InterfaceC25109 interfaceC25109 = c23138.f72726;
        if (interfaceC25109 == c23138) {
            interfaceC25109 = null;
        }
        return new C23808(this, interfaceC25109);
    }
}
