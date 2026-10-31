package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩻ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9NL */
/* JADX INFO: loaded from: classes.dex */
public final class C23477 extends AbstractC6544 implements Iterator, InterfaceC11791 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f75330;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f75331;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC11791 f75332;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51933(InterfaceC11791 interfaceC11791) {
        this.f75332 = interfaceC11791;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f75329;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m51932();
                }
                Iterator it = this.f75331;
                C11233.m27799(it);
                if (it.hasNext()) {
                    this.f75329 = 2;
                    return true;
                }
                this.f75331 = null;
            }
            this.f75329 = 5;
            InterfaceC11791 interfaceC11791 = this.f75332;
            C11233.m27799(interfaceC11791);
            this.f75332 = null;
            interfaceC11791.mo8683(C8058.f24861);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f75329;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f75329 = 1;
            Iterator it = this.f75331;
            C11233.m27799(it);
            return it.next();
        }
        if (i == 3) {
            this.f75329 = 0;
            Object obj = this.f75330;
            this.f75330 = null;
            return obj;
        }
        throw m51932();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final RuntimeException m51932() {
        int i = this.f75329;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f75329);
    }

    @Override // l.AbstractC6544
    /* JADX INFO: renamed from: ֫ */
    public final EnumC7041 mo18047(Object obj, InterfaceC11791 interfaceC11791) {
        this.f75330 = obj;
        this.f75329 = 3;
        this.f75332 = interfaceC11791;
        return EnumC7041.COROUTINE_SUSPENDED;
    }

    @Override // l.AbstractC6544
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18046(Iterator it, InterfaceC11791 interfaceC11791) {
        if (!it.hasNext()) {
            return C8058.f24861;
        }
        this.f75331 = it;
        this.f75329 = 2;
        this.f75332 = interfaceC11791;
        return EnumC7041.COROUTINE_SUSPENDED;
    }

    @Override // l.InterfaceC11791
    /* JADX INFO: renamed from: ֫ */
    public final void mo8683(Object obj) throws Throwable {
        C18642.m43236(obj);
        this.f75329 = 4;
    }

    @Override // l.InterfaceC11791
    public final InterfaceC14801 getContext() {
        return C23974.f77731;
    }
}
