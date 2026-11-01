package p067l;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۢۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11296 implements InterfaceC8060 {

    /* JADX INFO: renamed from: ֫ */
    public C12637 f31478;

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f31479 = new HashSet();

    /* JADX INFO: renamed from: ۧ */
    public final void m26236(C12637 c12637) {
        this.f31479.add(c12637);
        if (this.f31478 != null) {
            return;
        }
        this.f31478 = c12637;
        c12637.m29066();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m26233() {
        this.f31478 = null;
        HashSet hashSet = this.f31479;
        AbstractC16192 abstractC16192CopyOf = AbstractC16192.copyOf((Collection) hashSet);
        hashSet.clear();
        AbstractC6767 abstractC6767ListIterator = abstractC16192CopyOf.listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            ((C12637) abstractC6767ListIterator.next()).m29067();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m26234(Exception exc, boolean z) {
        this.f31478 = null;
        HashSet hashSet = this.f31479;
        AbstractC16192 abstractC16192CopyOf = AbstractC16192.copyOf((Collection) hashSet);
        hashSet.clear();
        AbstractC6767 abstractC6767ListIterator = abstractC16192CopyOf.listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            ((C12637) abstractC6767ListIterator.next()).m29064(exc, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26235(C12637 c12637) {
        HashSet hashSet = this.f31479;
        hashSet.remove(c12637);
        if (this.f31478 == c12637) {
            this.f31478 = null;
            if (hashSet.isEmpty()) {
                return;
            }
            C12637 c12638 = (C12637) hashSet.iterator().next();
            this.f31478 = c12638;
            c12638.m29066();
        }
    }
}
