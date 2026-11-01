package p067l;

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
public class C14878 implements Set {

    /* JADX INFO: renamed from: ۗ */
    public BitSet f42415;

    /* JADX INFO: renamed from: ۙ */
    public final ArrayList f42416;

    /* JADX INFO: renamed from: ۛ */
    public boolean f42417;

    /* JADX INFO: renamed from: ۤ */
    public boolean f42418;

    /* JADX INFO: renamed from: ۨ */
    public int f42419;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f42420;

    /* JADX INFO: renamed from: ۬ */
    public boolean f42421;

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC21585 f42422;

    /* JADX INFO: renamed from: ᩸ */
    public int f42423;

    /* JADX INFO: renamed from: ᩹ */
    public C23596[] f42424;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        m33990((C23596) obj, null);
        return true;
    }

    public C14878() {
        this(true, false);
    }

    public C14878(boolean z, boolean z2) {
        this.f42417 = false;
        this.f42416 = new ArrayList(7);
        this.f42423 = -1;
        this.f42420 = z;
        if (z2) {
            this.f42424 = new C23596[8];
        } else {
            this.f42422 = new C5491(C6832.f17756, 2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33990(C23596 c23596, C13048 c13048) {
        C23596 c23597;
        if (this.f42417) {
            throw new IllegalStateException("This set is readonly");
        }
        AbstractC7289 abstractC7289 = c23596.f75120;
        AbstractC24266 abstractC24266 = c23596.f75119;
        if (abstractC7289 != C4607.f10339) {
            this.f42418 = true;
        }
        if ((c23596.f75118 & (-1073741825)) > 0) {
            this.f42421 = true;
        }
        C23596[] c23596Arr = this.f42424;
        ArrayList arrayList = this.f42416;
        if (c23596Arr == null) {
            c23597 = (C23596) this.f42422.m8880(c23596);
        } else {
            int i = abstractC24266.f76895;
            int i2 = c23596.f75116;
            int iM33988 = m33988(i, i2, abstractC7289);
            c23597 = this.f42424[iM33988];
            if (c23597 == null) {
                int size = arrayList.size();
                C23596[] c23596Arr2 = this.f42424;
                if (size >= c23596Arr2.length / 2) {
                    this.f42424 = new C23596[c23596Arr2.length * 2];
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        C23596 c23598 = (C23596) arrayList.get(i3);
                        this.f42424[m33988(c23598.f75119.f76895, c23598.f75116, c23598.f75120)] = c23598;
                    }
                    iM33988 = m33988(abstractC24266.f76895, i2, abstractC7289);
                }
                this.f42424[iM33988] = c23596;
                c23597 = c23596;
            }
        }
        if (c23597 == c23596) {
            this.f42423 = -1;
            arrayList.add(c23596);
        } else {
            m33989(c23597, c23596.f75117, c23596.f75118, c13048);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33991(C23596 c23596, AbstractC24266 abstractC24266, AbstractC18017 abstractC18017, AbstractC7289 abstractC7289, C13048 c13048) {
        C23596 c23597;
        if (this.f42417) {
            throw new IllegalStateException("This set is readonly");
        }
        C23596[] c23596Arr = this.f42424;
        if (c23596Arr != null && (c23597 = c23596Arr[m33988(abstractC24266.f76895, c23596.f75116, abstractC7289)]) != null) {
            if (abstractC7289 != C4607.f10339) {
                this.f42418 = true;
            }
            int i = c23596.f75118;
            if (((-1073741825) & i) > 0) {
                this.f42421 = true;
            }
            m33989(c23597, abstractC18017, i, c13048);
            return;
        }
        m33990(new C23596(c23596, abstractC24266, abstractC18017, abstractC7289), c13048);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33989(C23596 c23596, AbstractC18017 abstractC18017, int i, C13048 c13048) {
        AbstractC18017 abstractC18017M40996 = AbstractC18017.m40996(c23596.f75117, abstractC18017, !this.f42420, c13048);
        int iMax = Math.max(c23596.f75118, i);
        c23596.f75118 = iMax;
        if ((i & 1073741824) != 0) {
            c23596.f75118 = iMax | 1073741824;
        }
        c23596.f75117 = abstractC18017M40996;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m33988(int i, int i2, AbstractC7289 abstractC7289) {
        int i3;
        int iHashCode = abstractC7289.hashCode() + ((((i + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + i2) * 31);
        int length = this.f42424.length - 1;
        int i4 = iHashCode ^ (iHashCode >>> 16);
        while (true) {
            i3 = i4 & length;
            C23596 c23596 = this.f42424[i3];
            if (c23596 == null || (c23596.f75119.f76895 == i && c23596.f75116 == i2 && c23596.f75120.equals(abstractC7289))) {
                break;
            }
            i4 = i3 + 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۧ */
    public final BitSet m33992() {
        BitSet bitSet = new BitSet();
        Iterator it = this.f42416.iterator();
        while (it.hasNext()) {
            bitSet.set(((C23596) it.next()).f75116);
        }
        return bitSet;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m33990((C23596) it.next(), null);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14878)) {
            return false;
        }
        C14878 c14878 = (C14878) obj;
        ArrayList arrayList = this.f42416;
        return arrayList != null && arrayList.equals(c14878.f42416) && this.f42420 == c14878.f42420 && this.f42419 == c14878.f42419 && this.f42415 == c14878.f42415 && this.f42418 == c14878.f42418 && this.f42421 == c14878.f42421;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f42416.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f42416.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zM8876;
        C23596[] c23596Arr = this.f42424;
        if (c23596Arr == null) {
            AbstractC21585 abstractC21585 = this.f42422;
            if (abstractC21585 == null) {
                throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
            }
            return abstractC21585.contains(obj);
        }
        if (obj instanceof C23596) {
            C23596 c23596 = (C23596) obj;
            if (c23596Arr != null) {
                zM8876 = c23596Arr[m33988(c23596.f75119.f76895, c23596.f75116, c23596.f75120)] != null;
            } else {
                AbstractC21585 abstractC21586 = this.f42422;
                if (abstractC21586 == null) {
                    throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
                }
                zM8876 = abstractC21586.m8876(c23596);
            }
            if (zM8876) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f42416.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.f42417) {
            throw new IllegalStateException("This set is readonly");
        }
        this.f42416.clear();
        this.f42423 = -1;
        C23596[] c23596Arr = this.f42424;
        if (c23596Arr != null) {
            Arrays.fill(c23596Arr, (Object) null);
        } else {
            this.f42422.clear();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        boolean z = this.f42417;
        ArrayList arrayList = this.f42416;
        if (z) {
            if (this.f42423 == -1) {
                this.f42423 = arrayList.hashCode();
            }
            return this.f42423;
        }
        return arrayList.hashCode();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33993() {
        this.f42417 = true;
        this.f42422 = null;
        this.f42424 = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42416.toString());
        if (this.f42418) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f42418);
        }
        if (this.f42419 != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.f42419);
        }
        if (this.f42415 != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.f42415);
        }
        if (this.f42421) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        if (this.f42424 == null) {
            return (C23596[]) this.f42422.toArray();
        }
        ArrayList arrayList = this.f42416;
        return (C23596[]) arrayList.toArray(new C23596[arrayList.size()]);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f42424 != null ? this.f42416.toArray(objArr) : this.f42422.toArray(objArr);
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
