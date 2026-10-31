package l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ᩳ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18283 extends AbstractQueue {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11228 f56829;

    public C18283() {
        C11228 c11228 = new C11228();
        c11228.f33670 = c11228;
        c11228.f33671 = c11228;
        this.f56829 = c11228;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC23927 interfaceC23927 = (InterfaceC23927) obj;
        InterfaceC23927 interfaceC23927Mo17646 = interfaceC23927.mo17646();
        InterfaceC23927 interfaceC23927Mo17640 = interfaceC23927.mo17640();
        Logger logger = ConcurrentMapC14754.f45046;
        interfaceC23927Mo17646.mo17643(interfaceC23927Mo17640);
        interfaceC23927Mo17640.mo17645(interfaceC23927Mo17646);
        C11228 c11228 = this.f56829;
        InterfaceC23927 interfaceC23928 = c11228.f33671;
        interfaceC23928.mo17643(interfaceC23927);
        interfaceC23927.mo17645(interfaceC23928);
        interfaceC23927.mo17643(c11228);
        c11228.f33671 = interfaceC23927;
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C11228 c11228 = this.f56829;
        InterfaceC23927 interfaceC23927 = c11228.f33670;
        while (interfaceC23927 != c11228) {
            InterfaceC23927 interfaceC23927Mo17640 = interfaceC23927.mo17640();
            Logger logger = ConcurrentMapC14754.f45046;
            EnumC16228 enumC16228 = EnumC16228.INSTANCE;
            interfaceC23927.mo17643(enumC16228);
            interfaceC23927.mo17645(enumC16228);
            interfaceC23927 = interfaceC23927Mo17640;
        }
        c11228.f33670 = c11228;
        c11228.f33671 = c11228;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C11228 c11228 = this.f56829;
        return c11228.f33670 == c11228;
    }

    @Override // java.util.Queue
    public final Object peek() {
        C11228 c11228 = this.f56829;
        InterfaceC23927 interfaceC23927 = c11228.f33670;
        if (interfaceC23927 == c11228) {
            return null;
        }
        return interfaceC23927;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C11228 c11228 = this.f56829;
        InterfaceC23927 interfaceC23927 = c11228.f33670;
        if (interfaceC23927 == c11228) {
            return null;
        }
        remove(interfaceC23927);
        return interfaceC23927;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C11228 c11228 = this.f56829;
        int i = 0;
        for (InterfaceC23927 interfaceC23927Mo17640 = c11228.f33670; interfaceC23927Mo17640 != c11228; interfaceC23927Mo17640 = interfaceC23927Mo17640.mo17640()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC23927 interfaceC23927 = (InterfaceC23927) obj;
        InterfaceC23927 interfaceC23927Mo17646 = interfaceC23927.mo17646();
        InterfaceC23927 interfaceC23927Mo17640 = interfaceC23927.mo17640();
        Logger logger = ConcurrentMapC14754.f45046;
        interfaceC23927Mo17646.mo17643(interfaceC23927Mo17640);
        interfaceC23927Mo17640.mo17645(interfaceC23927Mo17646);
        EnumC16228 enumC16228 = EnumC16228.INSTANCE;
        interfaceC23927.mo17643(enumC16228);
        interfaceC23927.mo17645(enumC16228);
        return interfaceC23927Mo17640 != enumC16228;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((InterfaceC23927) obj).mo17640() != EnumC16228.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C11228 c11228 = this.f56829;
        InterfaceC23927 interfaceC23927 = c11228.f33670;
        if (interfaceC23927 == c11228) {
            interfaceC23927 = null;
        }
        return new C16871(this, interfaceC23927);
    }
}
