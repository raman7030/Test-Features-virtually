package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: l.ۧ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11291 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C17577 f33819;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23927 f33820;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC14754 f33821;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f33822 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f33823;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17577 f33824;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4235 f33825;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AtomicReferenceArray f33826;

    public AbstractC11291(ConcurrentMapC14754 concurrentMapC14754) {
        this.f33821 = concurrentMapC14754;
        this.f33823 = concurrentMapC14754.f45062.length - 1;
        m27903();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27903() {
        this.f33819 = null;
        if (m27906() || m27907()) {
            return;
        }
        while (true) {
            int i = this.f33823;
            if (i < 0) {
                return;
            }
            C4235[] c4235Arr = this.f33821.f45062;
            this.f33823 = i - 1;
            C4235 c4235 = c4235Arr[i];
            this.f33825 = c4235;
            if (c4235.f13743 != 0) {
                AtomicReferenceArray atomicReferenceArray = this.f33825.f13737;
                this.f33826 = atomicReferenceArray;
                this.f33822 = atomicReferenceArray.length() - 1;
                if (m27907()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m27906() {
        InterfaceC23927 interfaceC23927 = this.f33820;
        if (interfaceC23927 == null) {
            return false;
        }
        while (true) {
            this.f33820 = interfaceC23927.getNext();
            InterfaceC23927 interfaceC23928 = this.f33820;
            if (interfaceC23928 == null) {
                return false;
            }
            if (m27904(interfaceC23928)) {
                return true;
            }
            interfaceC23927 = this.f33820;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m27907() {
        while (true) {
            int i = this.f33822;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f33826;
            this.f33822 = i - 1;
            InterfaceC23927 interfaceC23927 = (InterfaceC23927) atomicReferenceArray.get(i);
            this.f33820 = interfaceC23927;
            if (interfaceC23927 != null && (m27904(interfaceC23927) || m27906())) {
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27904(InterfaceC23927 interfaceC23927) {
        Object obj;
        C4235 c4235;
        ConcurrentMapC14754 concurrentMapC14754 = this.f33821;
        try {
            long jMo39766 = concurrentMapC14754.f45061.mo39766();
            Object key = interfaceC23927.getKey();
            Object obj2 = null;
            if (interfaceC23927.getKey() != null && (obj = interfaceC23927.mo17644().get()) != null && !concurrentMapC14754.m35062(interfaceC23927, jMo39766)) {
                obj2 = obj;
            }
            if (obj2 == null) {
                return false;
            }
            this.f33819 = new C17577(concurrentMapC14754, key, obj2);
            return true;
        } finally {
            this.f33825.m12759();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33819 != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17577 m27905() {
        C17577 c17577 = this.f33819;
        if (c17577 == null) {
            throw new NoSuchElementException();
        }
        this.f33824 = c17577;
        m27903();
        return this.f33824;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C4025.m12116(this.f33824 != null);
        this.f33821.remove(this.f33824.f53724);
        this.f33824 = null;
    }

    @Override // java.util.Iterator
    public Object next() {
        return m27905();
    }
}
