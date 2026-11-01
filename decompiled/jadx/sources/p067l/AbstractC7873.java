package p067l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5UX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7873 extends AbstractC13238 {

    /* JADX INFO: renamed from: ֫ */
    public Object[] f20664;

    /* JADX INFO: renamed from: ۧ */
    public boolean f20665;

    /* JADX INFO: renamed from: ܽ */
    public int f20666;

    public AbstractC7873(int i) {
        C23335.m51956(i, "initialCapacity");
        this.f20664 = new Object[i];
        this.f20666 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m18179(int i) {
        Object[] objArr = this.f20664;
        int iM30297 = AbstractC13238.m30297(objArr.length, this.f20666 + i);
        if (iM30297 > objArr.length || this.f20665) {
            this.f20664 = Arrays.copyOf(this.f20664, iM30297);
            this.f20665 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18181(int i, Object[] objArr) {
        C14104.m32027(i, objArr);
        m18179(i);
        System.arraycopy(objArr, 0, this.f20664, this.f20666, i);
        this.f20666 += i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13238 mo18180(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m18179(collection.size());
            if (collection instanceof AbstractC23966) {
                this.f20666 = ((AbstractC23966) collection).mo26245(this.f20666, this.f20664);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo8328(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public void m18184(Object obj) {
        m18182(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m18183(List list) {
        mo18180((Iterable) list);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18182(Object obj) {
        obj.getClass();
        m18179(1);
        Object[] objArr = this.f20664;
        int i = this.f20666;
        this.f20666 = i + 1;
        objArr[i] = obj;
    }
}
