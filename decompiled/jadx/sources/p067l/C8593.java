package p067l;

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
public final class C8593 implements Iterable {

    /* JADX INFO: renamed from: ۙ */
    public final Object f23077 = new Object();

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f23079 = new HashMap();

    /* JADX INFO: renamed from: ᩹ */
    public Set f23080 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ᩶ */
    public List f23078 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ֫ */
    public final void m20005(C16658 c16658) {
        synchronized (this.f23077) {
            ArrayList arrayList = new ArrayList(this.f23078);
            arrayList.add(c16658);
            this.f23078 = C21562.unmodifiableList(arrayList);
            Integer num = (Integer) this.f23079.get(c16658);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f23080);
                hashSet.add(c16658);
                this.f23080 = C21562.unmodifiableSet(hashSet);
            }
            this.f23079.put(c16658, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20008(C16658 c16658) {
        synchronized (this.f23077) {
            Integer num = (Integer) this.f23079.get(c16658);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f23078);
            arrayList.remove(c16658);
            this.f23078 = C21562.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f23079.remove(c16658);
                HashSet hashSet = new HashSet(this.f23080);
                hashSet.remove(c16658);
                this.f23080 = C21562.unmodifiableSet(hashSet);
            } else {
                this.f23079.put(c16658, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* JADX INFO: renamed from: ۧۧ */
    public final Set m20007() {
        Set set;
        synchronized (this.f23077) {
            set = this.f23080;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f23077) {
            it = this.f23078.iterator();
        }
        return it;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m20006(C16658 c16658) {
        int iIntValue;
        synchronized (this.f23077) {
            iIntValue = this.f23079.containsKey(c16658) ? ((Integer) this.f23079.get(c16658)).intValue() : 0;
        }
        return iIntValue;
    }
}
