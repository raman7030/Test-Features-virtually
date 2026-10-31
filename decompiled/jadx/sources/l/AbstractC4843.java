package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4843 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15425 f15300;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21777 f15301;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C20366 f15302;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo12411(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo12412(int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo12413(int i, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12414();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12415(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12416(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo12417(Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract Map mo12418();

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo12419();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14086(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] m14088(int i, Object[] objArr) {
        int iMo12419 = mo12419();
        if (objArr.length < iMo12419) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iMo12419);
        }
        for (int i2 = 0; i2 < iMo12419; i2++) {
            objArr[i2] = mo12412(i2, i);
        }
        if (objArr.length > iMo12419) {
            objArr[iMo12419] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14087(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
