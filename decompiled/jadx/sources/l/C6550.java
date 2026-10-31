package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8RA */
/* JADX INFO: loaded from: classes2.dex */
public final class C6550 implements Iterable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f20198 = new Object();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f20200 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Set f20201 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f20199 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18055(C15036 c15036) {
        synchronized (this.f20198) {
            ArrayList arrayList = new ArrayList(this.f20199);
            arrayList.add(c15036);
            this.f20199 = C20195.unmodifiableList(arrayList);
            Integer num = (Integer) this.f20200.get(c15036);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f20201);
                hashSet.add(c15036);
                this.f20201 = C20195.unmodifiableSet(hashSet);
            }
            this.f20200.put(c15036, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18058(C15036 c15036) {
        synchronized (this.f20198) {
            Integer num = (Integer) this.f20200.get(c15036);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f20199);
            arrayList.remove(c15036);
            this.f20199 = C20195.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f20200.remove(c15036);
                HashSet hashSet = new HashSet(this.f20201);
                hashSet.remove(c15036);
                this.f20201 = C20195.unmodifiableSet(hashSet);
            } else {
                this.f20200.put(c15036, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final Set m18057() {
        Set set;
        synchronized (this.f20198) {
            set = this.f20201;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f20198) {
            it = this.f20199.iterator();
        }
        return it;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m18056(C15036 c15036) {
        int iIntValue;
        synchronized (this.f20198) {
            iIntValue = this.f20200.containsKey(c15036) ? ((Integer) this.f20200.get(c15036)).intValue() : 0;
        }
        return iIntValue;
    }
}
