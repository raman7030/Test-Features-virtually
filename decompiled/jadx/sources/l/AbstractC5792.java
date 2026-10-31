package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5UX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5792 extends AbstractC11437 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object[] f17818;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f17819;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f17820;

    public AbstractC5792(int i) {
        C22061.m49620(i, "initialCapacity");
        this.f17818 = new Object[i];
        this.f17820 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m16259(int i) {
        Object[] objArr = this.f17818;
        int iM28253 = AbstractC11437.m28253(objArr.length, this.f17820 + i);
        if (iM28253 > objArr.length || this.f17819) {
            this.f17818 = Arrays.copyOf(this.f17818, iM28253);
            this.f17819 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16261(int i, Object[] objArr) {
        C12348.m29967(i, objArr);
        m16259(i);
        System.arraycopy(objArr, 0, this.f17818, this.f17820, i);
        this.f17820 += i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11437 mo16260(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m16259(collection.size());
            if (collection instanceof AbstractC22725) {
                this.f17820 = ((AbstractC22725) collection).mo24235(this.f17820, this.f17818);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo6130(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m16264(Object obj) {
        m16262(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m16263(List list) {
        mo16260((Iterable) list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16262(Object obj) {
        obj.getClass();
        m16259(1);
        Object[] objArr = this.f17818;
        int i = this.f17820;
        this.f17820 = i + 1;
        objArr[i] = obj;
    }
}
