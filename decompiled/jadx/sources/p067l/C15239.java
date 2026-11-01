package p067l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18TA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15239 extends AbstractC20466 {

    /* JADX INFO: renamed from: ۜ */
    public final int f43493;

    /* JADX INFO: renamed from: ۡ */
    public final int f43494;

    /* JADX INFO: renamed from: ۢ */
    public final Object[] f43495;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f43496;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f43497;

    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC6974[] f43498;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f43499;

    public C15239(AbstractC6974[] abstractC6974Arr, Object[] objArr, InterfaceC3549 interfaceC3549) {
        super(interfaceC3549);
        int length = abstractC6974Arr.length;
        this.f43498 = abstractC6974Arr;
        this.f43496 = new int[length];
        this.f43499 = new int[length];
        this.f43495 = objArr;
        this.f43497 = new HashMap();
        int length2 = abstractC6974Arr.length;
        int i = 0;
        int iMo15987 = 0;
        int iMo15975 = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC6974 abstractC6974 = abstractC6974Arr[i];
            this.f43498[i2] = abstractC6974;
            this.f43499[i2] = iMo15987;
            this.f43496[i2] = iMo15975;
            iMo15987 += abstractC6974.mo15987();
            iMo15975 += this.f43498[i2].mo15975();
            this.f43497.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f43494 = iMo15987;
        this.f43493 = iMo15975;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final List m34695() {
        return Arrays.asList(this.f43498);
    }

    @Override // p067l.AbstractC20466
    /* JADX INFO: renamed from: ۧ */
    public final int mo34689(int i) {
        return C5792.m12987(this.f43496, i + 1, false, false);
    }

    @Override // p067l.AbstractC20466
    /* JADX INFO: renamed from: ܽ */
    public final int mo34692(int i) {
        return C5792.m12987(this.f43499, i + 1, false, false);
    }

    @Override // p067l.AbstractC20466
    /* JADX INFO: renamed from: ۧ */
    public final int mo34690(Object obj) {
        Integer num = (Integer) this.f43497.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p067l.AbstractC20466
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC6974 mo34696(int i) {
        return this.f43498[i];
    }

    @Override // p067l.AbstractC20466
    /* JADX INFO: renamed from: ܿ */
    public final int mo34693(int i) {
        return this.f43496[i];
    }

    @Override // p067l.AbstractC20466
    /* JADX INFO: renamed from: ܳ */
    public final int mo34691(int i) {
        return this.f43499[i];
    }

    @Override // p067l.AbstractC20466
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo34694(int i) {
        return this.f43495[i];
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ۧ */
    public final int mo15987() {
        return this.f43494;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final int mo15975() {
        return this.f43493;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15239 m34688(InterfaceC3549 interfaceC3549) {
        AbstractC6974[] abstractC6974Arr = this.f43498;
        AbstractC6974[] abstractC6974Arr2 = new AbstractC6974[abstractC6974Arr.length];
        for (int i = 0; i < abstractC6974Arr.length; i++) {
            abstractC6974Arr2[i] = new C23957(abstractC6974Arr[i]);
        }
        return new C15239(abstractC6974Arr2, this.f43495, interfaceC3549);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15239(List list, InterfaceC3549 interfaceC3549) {
        AbstractC6974[] abstractC6974Arr = new AbstractC6974[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC6974Arr[i2] = ((InterfaceC21946) it.next()).mo24380();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC21946) it2.next()).getUid();
            i++;
        }
        this(abstractC6974Arr, objArr, interfaceC3549);
    }
}
