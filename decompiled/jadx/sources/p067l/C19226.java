package p067l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U15W */
/* JADX INFO: loaded from: classes4.dex */
public final class C19226 {

    /* JADX INFO: renamed from: ܽ */
    public HashSet f57475 = new HashSet();

    /* JADX INFO: renamed from: ᩳ */
    public HashSet f57476 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public int f57473 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f57474 = 0;

    /* JADX INFO: renamed from: ܳ */
    public final int m43797() {
        return this.f57476.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m43798() {
        return this.f57475.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43793() {
        return this.f57473;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43795() {
        return this.f57474;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43796(C17884 c17884) {
        this.f57475.addAll(c17884.f53445);
        this.f57476.addAll(c17884.f53446);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43794(C17884 c17884) {
        HashSet hashSet = this.f57475;
        int size = hashSet.size();
        HashSet hashSet2 = this.f57476;
        int size2 = hashSet2.size();
        Iterator it = c17884.f53445.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((C15872) it.next())) {
                size++;
            }
        }
        Iterator it2 = c17884.f53446.iterator();
        while (it2.hasNext()) {
            if (!hashSet2.contains((C24590) it2.next())) {
                size2++;
            }
        }
        this.f57473 = size;
        this.f57474 = size2;
    }

    public final String toString() {
        return "DexEmulator{fields=" + this.f57475.size() + ", methods=" + this.f57476.size() + '}';
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m43799() {
        return this.f57476.size() > 65536 || this.f57475.size() > 65536;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m43800() {
        return this.f57474 > 65536 || this.f57473 > 65536;
    }
}
