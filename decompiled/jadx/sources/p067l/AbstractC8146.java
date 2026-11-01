package p067l;

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
public abstract class AbstractC8146 extends AbstractC23966 implements Set, InterfaceC10814 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f21506 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public transient AbstractC16192 f21507;

    /* JADX INFO: renamed from: ۜ */
    public boolean mo18926() {
        return this instanceof C9214;
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX INFO: renamed from: of */
    public static AbstractC8146 m18915of() {
        return C22034.f69338;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8146 m18921(EnumC19932 enumC19932) {
        return new C22704(enumC19932);
    }

    /* JADX INFO: renamed from: of */
    public static AbstractC8146 m18916of(Object obj, Object obj2) {
        return m18924(2, obj, obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8146 m18918(String str, String str2, String str3) {
        return m18924(3, str, str2, str3);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static AbstractC8146 m18925() {
        return m18924(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8146 m18919(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        C6194.m14029("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m18924(length, objArr2);
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC8146 m18924(int i, Object... objArr) {
        if (i == 0) {
            return C22034.f69338;
        }
        if (i == 1) {
            Object obj = objArr[0];
            C12826.requireNonNull(obj);
            return new C22704(obj);
        }
        int iM18917 = m18917(i);
        Object[] objArr2 = new Object[iM18917];
        int i2 = iM18917 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(C20778.m46922(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM11131 = C5191.m11131(iHashCode);
            while (true) {
                int i6 = iM11131 & i2;
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
                iM11131++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            C12826.requireNonNull(obj4);
            return new C22704(obj4);
        }
        if (m18917(i4) < iM18917 / 2) {
            return m18924(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C22034(i3, i2, i4, objArr, objArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18917(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        C6194.m14029("collection too large", iMax < 1073741824);
        return 1073741824;
    }

    public static AbstractC8146 copyOf(Collection collection) {
        if ((collection instanceof AbstractC8146) && !(collection instanceof SortedSet)) {
            AbstractC8146 abstractC8146 = (AbstractC8146) collection;
            if (!abstractC8146.mo21230()) {
                return abstractC8146;
            }
        }
        Object[] array = collection.toArray();
        return m18924(array.length, array);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8146 m18920(Iterator it) {
        if (!it.hasNext()) {
            return C22034.f69338;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new C22704(next);
        }
        C14181 c14181 = new C14181();
        c14181.mo8328(next);
        while (it.hasNext()) {
            c14181.mo8328(it.next());
        }
        return c14181.mo32660();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8146 m18922(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C22034.f69338;
        }
        if (length == 1) {
            return new C22704(objArr[0]);
        }
        return m18924(objArr.length, (Object[]) objArr.clone());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC8146) && mo18926() && ((AbstractC8146) obj).mo18926() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C16667.m37747(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C16667.m37742(this);
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ۧ */
    public AbstractC16192 mo18927() {
        AbstractC16192 abstractC16192 = this.f21507;
        if (abstractC16192 != null) {
            return abstractC16192;
        }
        AbstractC16192 abstractC16192Mo8248 = mo8248();
        this.f21507 = abstractC16192Mo8248;
        return abstractC16192Mo8248;
    }

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC16192 mo8248() {
        Object[] array = toArray();
        int i = AbstractC16192.f47662;
        return AbstractC16192.m36884(array.length, array);
    }

    @Override // p067l.AbstractC23966
    public Object writeReplace() {
        return new C12170(toArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
