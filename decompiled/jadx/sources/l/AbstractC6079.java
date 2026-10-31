package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۛ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6079 extends AbstractC22725 implements Set, InterfaceC8886 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f18650 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient AbstractC14545 f18651;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean mo16995() {
        return this instanceof C7203;
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static AbstractC6079 of() {
        return C20692.f66656;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m16990(EnumC18481 enumC18481) {
        return new C21397(enumC18481);
    }

    public static AbstractC6079 of(Object obj, Object obj2) {
        return m16993(2, obj, obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m16987(String str, String str2, String str3) {
        return m16993(3, str, str2, str3);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m16994() {
        return m16993(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m16988(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        C4025.m12109("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m16993(length, objArr2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m16993(int i, Object... objArr) {
        if (i == 0) {
            return C20692.f66656;
        }
        if (i == 1) {
            Object obj = objArr[0];
            C11003.requireNonNull(obj);
            return new C21397(obj);
        }
        int iM16986 = m16986(i);
        Object[] objArr2 = new Object[iM16986];
        int i2 = iM16986 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(C19370.m44628(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM9079 = C2970.m9079(iHashCode);
            while (true) {
                int i6 = iM9079 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM9079++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            C11003.requireNonNull(obj4);
            return new C21397(obj4);
        }
        if (m16986(i4) < iM16986 / 2) {
            return m16993(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C20692(i3, i2, i4, objArr, objArr2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16986(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        C4025.m12109("collection too large", iMax < 1073741824);
        return 1073741824;
    }

    public static AbstractC6079 copyOf(Collection collection) {
        if ((collection instanceof AbstractC6079) && !(collection instanceof SortedSet)) {
            AbstractC6079 abstractC6079 = (AbstractC6079) collection;
            if (!abstractC6079.mo19283()) {
                return abstractC6079;
            }
        }
        Object[] array = collection.toArray();
        return m16993(array.length, array);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m16989(Iterator it) {
        if (!it.hasNext()) {
            return C20692.f66656;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new C21397(next);
        }
        C12429 c12429 = new C12429();
        c12429.mo6130(next);
        while (it.hasNext()) {
            c12429.mo6130(it.next());
        }
        return c12429.mo30595();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m16991(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C20692.f66656;
        }
        if (length == 1) {
            return new C21397(objArr[0]);
        }
        return m16993(objArr.length, (Object[]) objArr.clone());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC6079) && mo16995() && ((AbstractC6079) obj).mo16995() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C15045.m35589(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C15045.m35584(this);
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 mo16996() {
        AbstractC14545 abstractC14545 = this.f18651;
        if (abstractC14545 != null) {
            return abstractC14545;
        }
        AbstractC14545 abstractC14545Mo6050 = mo6050();
        this.f18651 = abstractC14545Mo6050;
        return abstractC14545Mo6050;
    }

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC14545 mo6050() {
        Object[] array = toArray();
        int i = AbstractC14545.f44556;
        return AbstractC14545.m34735(array.length, array);
    }

    @Override // l.AbstractC22725
    public Object writeReplace() {
        return new C10313(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
