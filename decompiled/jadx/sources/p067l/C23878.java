package p067l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩺֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G93V */
/* JADX INFO: loaded from: classes.dex */
public final class C23878 extends AbstractC20704 implements RandomAccess {

    /* JADX INFO: renamed from: ۙ */
    public static final C23878 f75821 = new C23878(new Object[0], 0, false);

    /* JADX INFO: renamed from: ᩶ */
    public int f75822;

    /* JADX INFO: renamed from: ᩹ */
    public Object[] f75823;

    /* JADX INFO: renamed from: ܽ */
    public static C23878 m52962() {
        return f75821;
    }

    public C23878(Object[] objArr, int i, boolean z) {
        super(z);
        this.f75823 = objArr;
        this.f75822 = i;
    }

    @Override // p067l.InterfaceC24389
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24389 mo10520(int i) {
        if (i < this.f75822) {
            throw new IllegalArgumentException();
        }
        return new C23878(Arrays.copyOf(this.f75823, i), this.f75822, true);
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m46786();
        int i = this.f75822;
        Object[] objArr = this.f75823;
        if (i == objArr.length) {
            this.f75823 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f75823;
        int i2 = this.f75822;
        this.f75822 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m46786();
        if (i < 0 || i > (i2 = this.f75822)) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f75822);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
        Object[] objArr = this.f75823;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[C25053.m54989(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f75823, i, objArr2, i + 1, this.f75822 - i);
            this.f75823 = objArr2;
        }
        this.f75823[i] = obj;
        this.f75822++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m52961(i);
        return this.f75823[i];
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m46786();
        m52961(i);
        Object[] objArr = this.f75823;
        Object obj = objArr[i];
        int i2 = this.f75822;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f75822--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m46786();
        m52961(i);
        Object[] objArr = this.f75823;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f75822;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52961(int i) {
        if (i < 0 || i >= this.f75822) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f75822);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
    }
}
