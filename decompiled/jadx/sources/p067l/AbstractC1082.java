package p067l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩵ */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1082 {

    /* JADX INFO: renamed from: ֫ */
    public C1607 f18132;

    /* JADX INFO: renamed from: ۧ */
    public C1922 f18133;

    /* JADX INFO: renamed from: ܽ */
    public C1852 f18134;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo14301(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo14302(int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo14303(int i, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14304();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14305(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14306(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo14307(Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract Map mo14308();

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo14309();

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15966(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object[] m15968(int i, Object[] objArr) {
        int iMo14309 = mo14309();
        if (objArr.length < iMo14309) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iMo14309);
        }
        for (int i2 = 0; i2 < iMo14309; i2++) {
            objArr[i2] = mo14302(i2, i);
        }
        if (objArr.length > iMo14309) {
            objArr[iMo14309] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15967(Set set, Object obj) {
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
