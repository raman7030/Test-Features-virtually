package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩻ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9NL */
/* JADX INFO: loaded from: classes.dex */
public final class C24681 extends AbstractC8588 implements Iterator, InterfaceC13575 {

    /* JADX INFO: renamed from: ۙ */
    public int f78077;

    /* JADX INFO: renamed from: ᩶ */
    public Object f78078;

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f78079;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC13575 f78080;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54335(InterfaceC13575 interfaceC13575) {
        this.f78080 = interfaceC13575;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f78077;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m54334();
                }
                Iterator it = this.f78079;
                C13045.m29861(it);
                if (it.hasNext()) {
                    this.f78077 = 2;
                    return true;
                }
                this.f78079 = null;
            }
            this.f78077 = 5;
            InterfaceC13575 interfaceC13575 = this.f78080;
            C13045.m29861(interfaceC13575);
            this.f78080 = null;
            interfaceC13575.mo10744(C10027.f27775);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f78077;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f78077 = 1;
            Iterator it = this.f78079;
            C13045.m29861(it);
            return it.next();
        }
        if (i == 3) {
            this.f78077 = 0;
            Object obj = this.f78078;
            this.f78078 = null;
            return obj;
        }
        throw m54334();
    }

    /* JADX INFO: renamed from: ֫ */
    private final RuntimeException m54334() {
        int i = this.f78077;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f78077);
    }

    @Override // p067l.AbstractC8588
    /* JADX INFO: renamed from: ֫ */
    public final EnumC9061 mo19997(Object obj, InterfaceC13575 interfaceC13575) {
        this.f78078 = obj;
        this.f78077 = 3;
        this.f78080 = interfaceC13575;
        return EnumC9061.COROUTINE_SUSPENDED;
    }

    @Override // p067l.AbstractC8588
    /* JADX INFO: renamed from: ֫ */
    public final Object mo19996(Iterator it, InterfaceC13575 interfaceC13575) {
        if (!it.hasNext()) {
            return C10027.f27775;
        }
        this.f78079 = it;
        this.f78077 = 2;
        this.f78080 = interfaceC13575;
        return EnumC9061.COROUTINE_SUSPENDED;
    }

    @Override // p067l.InterfaceC13575
    /* JADX INFO: renamed from: ֫ */
    public final void mo10744(Object obj) throws Throwable {
        C20086.m45502(obj);
        this.f78077 = 4;
    }

    @Override // p067l.InterfaceC13575
    public final InterfaceC16436 getContext() {
        return C25154.f80484;
    }
}
