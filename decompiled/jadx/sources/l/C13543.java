package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18TA */
/* JADX INFO: loaded from: classes4.dex */
public final class C13543 extends AbstractC19042 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f40423;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f40424;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object[] f40425;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f40426;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f40427;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4846[] f40428;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f40429;

    public C13543(AbstractC4846[] abstractC4846Arr, Object[] objArr, InterfaceC1242 interfaceC1242) {
        super(interfaceC1242);
        int length = abstractC4846Arr.length;
        this.f40428 = abstractC4846Arr;
        this.f40426 = new int[length];
        this.f40429 = new int[length];
        this.f40425 = objArr;
        this.f40427 = new HashMap();
        int length2 = abstractC4846Arr.length;
        int i = 0;
        int iMo14107 = 0;
        int iMo14095 = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC4846 abstractC4846 = abstractC4846Arr[i];
            this.f40428[i2] = abstractC4846;
            this.f40429[i2] = iMo14107;
            this.f40426[i2] = iMo14095;
            iMo14107 += abstractC4846.mo14107();
            iMo14095 += this.f40428[i2].mo14095();
            this.f40427.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f40424 = iMo14107;
        this.f40423 = iMo14095;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m32592() {
        return Arrays.asList(this.f40428);
    }

    @Override // l.AbstractC19042
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo32586(int i) {
        return C3603.m11011(this.f40426, i + 1, false, false);
    }

    @Override // l.AbstractC19042
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo32589(int i) {
        return C3603.m11011(this.f40429, i + 1, false, false);
    }

    @Override // l.AbstractC19042
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo32587(Object obj) {
        Integer num = (Integer) this.f40427.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // l.AbstractC19042
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 mo32593(int i) {
        return this.f40428[i];
    }

    @Override // l.AbstractC19042
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo32590(int i) {
        return this.f40426[i];
    }

    @Override // l.AbstractC19042
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo32588(int i) {
        return this.f40429[i];
    }

    @Override // l.AbstractC19042
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object mo32591(int i) {
        return this.f40425[i];
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ۧ */
    public final int mo14107() {
        return this.f40424;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final int mo14095() {
        return this.f40423;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13543 m32585(InterfaceC1242 interfaceC1242) {
        AbstractC4846[] abstractC4846Arr = this.f40428;
        AbstractC4846[] abstractC4846Arr2 = new AbstractC4846[abstractC4846Arr.length];
        for (int i = 0; i < abstractC4846Arr.length; i++) {
            abstractC4846Arr2[i] = new C22716(abstractC4846Arr[i]);
        }
        return new C13543(abstractC4846Arr2, this.f40425, interfaceC1242);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13543(List list, InterfaceC1242 interfaceC1242) {
        AbstractC4846[] abstractC4846Arr = new AbstractC4846[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC4846Arr[i2] = ((InterfaceC20600) it.next()).mo22411();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC20600) it2.next()).getUid();
            i++;
        }
        this(abstractC4846Arr, objArr, interfaceC1242);
    }
}
