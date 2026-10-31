package l;

import com.google.android.material.textfield.IndicatorViewController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AST */
/* JADX INFO: loaded from: classes3.dex */
public class C13163 implements Set {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public BitSet f39353;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39354;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f39355;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f39356;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f39357;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f39358;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f39359;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC20220 f39360;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f39361;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22336[] f39362;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        m31894((C22336) obj, null);
        return true;
    }

    public C13163() {
        this(true, false);
    }

    public C13163(boolean z, boolean z2) {
        this.f39355 = false;
        this.f39354 = new ArrayList(7);
        this.f39361 = -1;
        this.f39358 = z;
        if (z2) {
            this.f39362 = new C22336[8];
        } else {
            this.f39360 = new C3286(C4697.f14926, 2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31894(C22336 c22336, C11237 c11237) {
        C22336 c22337;
        if (this.f39355) {
            throw new IllegalStateException("This set is readonly");
        }
        AbstractC5178 abstractC5178 = c22336.f72394;
        AbstractC23041 abstractC23041 = c22336.f72393;
        if (abstractC5178 != C2356.f7548) {
            this.f39356 = true;
        }
        if ((c22336.f72392 & (-1073741825)) > 0) {
            this.f39359 = true;
        }
        C22336[] c22336Arr = this.f39362;
        ArrayList arrayList = this.f39354;
        if (c22336Arr == null) {
            c22337 = (C22336) this.f39360.m6754(c22336);
        } else {
            int i = abstractC23041.f74153;
            int i2 = c22336.f72390;
            int iM31892 = m31892(i, i2, abstractC5178);
            c22337 = this.f39362[iM31892];
            if (c22337 == null) {
                int size = arrayList.size();
                C22336[] c22336Arr2 = this.f39362;
                if (size >= c22336Arr2.length / 2) {
                    this.f39362 = new C22336[c22336Arr2.length * 2];
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        C22336 c22338 = (C22336) arrayList.get(i3);
                        this.f39362[m31892(c22338.f72393.f74153, c22338.f72390, c22338.f72394)] = c22338;
                    }
                    iM31892 = m31892(abstractC23041.f74153, i2, abstractC5178);
                }
                this.f39362[iM31892] = c22336;
                c22337 = c22336;
            }
        }
        if (c22337 == c22336) {
            this.f39361 = -1;
            arrayList.add(c22336);
        } else {
            m31893(c22337, c22336.f72391, c22336.f72392, c11237);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31895(C22336 c22336, AbstractC23041 abstractC23041, AbstractC16466 abstractC16466, AbstractC5178 abstractC5178, C11237 c11237) {
        C22336 c22337;
        if (this.f39355) {
            throw new IllegalStateException("This set is readonly");
        }
        C22336[] c22336Arr = this.f39362;
        if (c22336Arr != null && (c22337 = c22336Arr[m31892(abstractC23041.f74153, c22336.f72390, abstractC5178)]) != null) {
            if (abstractC5178 != C2356.f7548) {
                this.f39356 = true;
            }
            int i = c22336.f72392;
            if (((-1073741825) & i) > 0) {
                this.f39359 = true;
            }
            m31893(c22337, abstractC16466, i, c11237);
            return;
        }
        m31894(new C22336(c22336, abstractC23041, abstractC16466, abstractC5178), c11237);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31893(C22336 c22336, AbstractC16466 abstractC16466, int i, C11237 c11237) {
        AbstractC16466 abstractC16466M38770 = AbstractC16466.m38770(c22336.f72391, abstractC16466, !this.f39358, c11237);
        int iMax = Math.max(c22336.f72392, i);
        c22336.f72392 = iMax;
        if ((i & 1073741824) != 0) {
            c22336.f72392 = iMax | 1073741824;
        }
        c22336.f72391 = abstractC16466M38770;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m31892(int i, int i2, AbstractC5178 abstractC5178) {
        int i3;
        int iHashCode = abstractC5178.hashCode() + ((((i + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + i2) * 31);
        int length = this.f39362.length - 1;
        int i4 = iHashCode ^ (iHashCode >>> 16);
        while (true) {
            i3 = i4 & length;
            C22336 c22336 = this.f39362[i3];
            if (c22336 == null || (c22336.f72393.f74153 == i && c22336.f72390 == i2 && c22336.f72394.equals(abstractC5178))) {
                break;
            }
            i4 = i3 + 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final BitSet m31896() {
        BitSet bitSet = new BitSet();
        Iterator it = this.f39354.iterator();
        while (it.hasNext()) {
            bitSet.set(((C22336) it.next()).f72390);
        }
        return bitSet;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m31894((C22336) it.next(), null);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13163)) {
            return false;
        }
        C13163 c13163 = (C13163) obj;
        ArrayList arrayList = this.f39354;
        return arrayList != null && arrayList.equals(c13163.f39354) && this.f39358 == c13163.f39358 && this.f39357 == c13163.f39357 && this.f39353 == c13163.f39353 && this.f39356 == c13163.f39356 && this.f39359 == c13163.f39359;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f39354.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f39354.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zM6750;
        C22336[] c22336Arr = this.f39362;
        if (c22336Arr == null) {
            AbstractC20220 abstractC20220 = this.f39360;
            if (abstractC20220 == null) {
                throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
            }
            return abstractC20220.contains(obj);
        }
        if (obj instanceof C22336) {
            C22336 c22336 = (C22336) obj;
            if (c22336Arr != null) {
                zM6750 = c22336Arr[m31892(c22336.f72393.f74153, c22336.f72390, c22336.f72394)] != null;
            } else {
                AbstractC20220 abstractC20221 = this.f39360;
                if (abstractC20221 == null) {
                    throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
                }
                zM6750 = abstractC20221.m6750(c22336);
            }
            if (zM6750) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f39354.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.f39355) {
            throw new IllegalStateException("This set is readonly");
        }
        this.f39354.clear();
        this.f39361 = -1;
        C22336[] c22336Arr = this.f39362;
        if (c22336Arr != null) {
            Arrays.fill(c22336Arr, (Object) null);
        } else {
            this.f39360.clear();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        boolean z = this.f39355;
        ArrayList arrayList = this.f39354;
        if (z) {
            if (this.f39361 == -1) {
                this.f39361 = arrayList.hashCode();
            }
            return this.f39361;
        }
        return arrayList.hashCode();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31897() {
        this.f39355 = true;
        this.f39360 = null;
        this.f39362 = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39354.toString());
        if (this.f39356) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f39356);
        }
        if (this.f39357 != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.f39357);
        }
        if (this.f39353 != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.f39353);
        }
        if (this.f39359) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        if (this.f39362 == null) {
            return (C22336[]) this.f39360.toArray();
        }
        ArrayList arrayList = this.f39354;
        return (C22336[]) arrayList.toArray(new C22336[arrayList.size()]);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f39362 != null ? this.f39354.toArray(objArr) : this.f39360.toArray(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
