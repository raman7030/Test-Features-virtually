package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: l.ۧ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13100 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public C19074 f36818;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC25109 f36819;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ ConcurrentMapC16391 f36820;

    /* JADX INFO: renamed from: ۫ */
    public int f36821 = -1;

    /* JADX INFO: renamed from: ۬ */
    public int f36822;

    /* JADX INFO: renamed from: ᩶ */
    public C19074 f36823;

    /* JADX INFO: renamed from: ᩸ */
    public C6394 f36824;

    /* JADX INFO: renamed from: ᩹ */
    public AtomicReferenceArray f36825;

    public AbstractC13100(ConcurrentMapC16391 concurrentMapC16391) {
        this.f36820 = concurrentMapC16391;
        this.f36822 = concurrentMapC16391.f48175.length - 1;
        m29964();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29964() {
        this.f36818 = null;
        if (m29967() || m29968()) {
            return;
        }
        while (true) {
            int i = this.f36822;
            if (i < 0) {
                return;
            }
            C6394[] c6394Arr = this.f36820.f48175;
            this.f36822 = i - 1;
            C6394 c6394 = c6394Arr[i];
            this.f36824 = c6394;
            if (c6394.f16556 != 0) {
                AtomicReferenceArray atomicReferenceArray = this.f36824.f16550;
                this.f36825 = atomicReferenceArray;
                this.f36821 = atomicReferenceArray.length() - 1;
                if (m29968()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m29967() {
        InterfaceC25109 interfaceC25109 = this.f36819;
        if (interfaceC25109 == null) {
            return false;
        }
        while (true) {
            this.f36819 = interfaceC25109.getNext();
            InterfaceC25109 interfaceC251010 = this.f36819;
            if (interfaceC251010 == null) {
                return false;
            }
            if (m29965(interfaceC251010)) {
                return true;
            }
            interfaceC25109 = this.f36819;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m29968() {
        while (true) {
            int i = this.f36821;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f36825;
            this.f36821 = i - 1;
            InterfaceC25109 interfaceC25109 = (InterfaceC25109) atomicReferenceArray.get(i);
            this.f36819 = interfaceC25109;
            if (interfaceC25109 != null && (m29965(interfaceC25109) || m29967())) {
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29965(InterfaceC25109 interfaceC25109) {
        Object obj;
        C6394 c6394;
        ConcurrentMapC16391 concurrentMapC16391 = this.f36820;
        try {
            long jMo42007 = concurrentMapC16391.f48174.mo42007();
            Object key = interfaceC25109.getKey();
            Object obj2 = null;
            if (interfaceC25109.getKey() != null && (obj = interfaceC25109.mo19584().get()) != null && !concurrentMapC16391.m37209(interfaceC25109, jMo42007)) {
                obj2 = obj;
            }
            if (obj2 == null) {
                return false;
            }
            this.f36818 = new C19074(concurrentMapC16391, key, obj2);
            return true;
        } finally {
            this.f36824.m14635();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36818 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19074 m29966() {
        C19074 c19074 = this.f36818;
        if (c19074 == null) {
            throw new NoSuchElementException();
        }
        this.f36823 = c19074;
        m29964();
        return this.f36823;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6194.m14036(this.f36823 != null);
        this.f36820.remove(this.f36823.f56914);
        this.f36823 = null;
    }

    @Override // java.util.Iterator
    public Object next() {
        return m29966();
    }
}
