package p067l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ᩳ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19745 extends AbstractQueue {

    /* JADX INFO: renamed from: ᩸ */
    public final C13040 f60046;

    public C19745() {
        C13040 c13040 = new C13040();
        c13040.f36669 = c13040;
        c13040.f36670 = c13040;
        this.f60046 = c13040;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC25109 interfaceC25109 = (InterfaceC25109) obj;
        InterfaceC25109 interfaceC25109Mo19586 = interfaceC25109.mo19586();
        InterfaceC25109 interfaceC25109Mo19580 = interfaceC25109.mo19580();
        Logger logger = ConcurrentMapC16391.f48159;
        interfaceC25109Mo19586.mo19583(interfaceC25109Mo19580);
        interfaceC25109Mo19580.mo19585(interfaceC25109Mo19586);
        C13040 c13040 = this.f60046;
        InterfaceC25109 interfaceC251010 = c13040.f36670;
        interfaceC251010.mo19583(interfaceC25109);
        interfaceC25109.mo19585(interfaceC251010);
        interfaceC25109.mo19583(c13040);
        c13040.f36670 = interfaceC25109;
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C13040 c13040 = this.f60046;
        InterfaceC25109 interfaceC25109 = c13040.f36669;
        while (interfaceC25109 != c13040) {
            InterfaceC25109 interfaceC25109Mo19580 = interfaceC25109.mo19580();
            Logger logger = ConcurrentMapC16391.f48159;
            EnumC17792 enumC17792 = EnumC17792.INSTANCE;
            interfaceC25109.mo19583(enumC17792);
            interfaceC25109.mo19585(enumC17792);
            interfaceC25109 = interfaceC25109Mo19580;
        }
        c13040.f36669 = c13040;
        c13040.f36670 = c13040;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C13040 c13040 = this.f60046;
        return c13040.f36669 == c13040;
    }

    @Override // java.util.Queue
    public final Object peek() {
        C13040 c13040 = this.f60046;
        InterfaceC25109 interfaceC25109 = c13040.f36669;
        if (interfaceC25109 == c13040) {
            return null;
        }
        return interfaceC25109;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C13040 c13040 = this.f60046;
        InterfaceC25109 interfaceC25109 = c13040.f36669;
        if (interfaceC25109 == c13040) {
            return null;
        }
        remove(interfaceC25109);
        return interfaceC25109;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C13040 c13040 = this.f60046;
        int i = 0;
        for (InterfaceC25109 interfaceC25109Mo19580 = c13040.f36669; interfaceC25109Mo19580 != c13040; interfaceC25109Mo19580 = interfaceC25109Mo19580.mo19580()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC25109 interfaceC25109 = (InterfaceC25109) obj;
        InterfaceC25109 interfaceC25109Mo19586 = interfaceC25109.mo19586();
        InterfaceC25109 interfaceC25109Mo19580 = interfaceC25109.mo19580();
        Logger logger = ConcurrentMapC16391.f48159;
        interfaceC25109Mo19586.mo19583(interfaceC25109Mo19580);
        interfaceC25109Mo19580.mo19585(interfaceC25109Mo19586);
        EnumC17792 enumC17792 = EnumC17792.INSTANCE;
        interfaceC25109.mo19583(enumC17792);
        interfaceC25109.mo19585(enumC17792);
        return interfaceC25109Mo19580 != enumC17792;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((InterfaceC25109) obj).mo19580() != EnumC17792.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C13040 c13040 = this.f60046;
        InterfaceC25109 interfaceC25109 = c13040.f36669;
        if (interfaceC25109 == c13040) {
            interfaceC25109 = null;
        }
        return new C18403(this, interfaceC25109);
    }
}
