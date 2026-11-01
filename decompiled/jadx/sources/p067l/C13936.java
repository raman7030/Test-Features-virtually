package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 54PW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13936 {

    /* JADX INFO: renamed from: ֫ */
    public C24625[] f39314 = {null, null, null, null, null, null, new C24625(0), new C24625(0), new C24625(0), new C24625(0), new C24625(0), new C24625(0), new C24625(0), new C24625(0), new C24625(0), new C24625(0), null, null};

    /* JADX INFO: renamed from: ܽ */
    public int[] f39316 = new int[18];

    /* JADX INFO: renamed from: ۧ */
    public int[] f39315 = new int[18];

    public C13936() {
        for (int i = 0; i < 18; i++) {
            this.f39316[i] = -1;
            this.f39315[i] = -1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7230 m31709(EnumC16617 enumC16617, int i) {
        AbstractC7230 abstractC7230 = (AbstractC7230) this.f39314[enumC16617.f48853].m54285(i);
        if (abstractC7230 != null) {
            return abstractC7230;
        }
        throw new C17919(String.format("Could not find the %s item at offset %#x", enumC16617.f48852, Integer.valueOf(i)), null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7230 m31713(EnumC16617 enumC16617, int i) {
        AbstractC7230 abstractC7230 = (AbstractC7230) this.f39314[enumC16617.f48853].m54285(i);
        if (abstractC7230 != null || i == 0) {
            return abstractC7230;
        }
        throw new C17919(String.format("Could not find the %s item at offset %#x", enumC16617.f48852, Integer.valueOf(i)), null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31710(EnumC16617 enumC16617, int i, int i2) {
        int i3 = enumC16617.f48853;
        int[] iArr = this.f39316;
        int i4 = iArr[i3];
        if (i4 == -1) {
            iArr[i3] = i;
        } else if (i4 != i) {
            throw new RuntimeException("The section size in the header and map for item type " + enumC16617 + " do not match");
        }
        int[] iArr2 = this.f39315;
        int i5 = iArr2[i3];
        if (i5 == -1) {
            iArr2[i3] = i2;
        } else {
            if (i5 == i2) {
                return;
            }
            throw new RuntimeException("The section offset in the header and map for item type " + enumC16617 + " do not match");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31711(EnumC16617 enumC16617, ArrayList arrayList) {
        C24625 c24625 = this.f39314[enumC16617.f48853];
        c24625.m54283(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC7230 abstractC7230 = (AbstractC7230) it.next();
            c24625.m54284(abstractC7230.f18864, abstractC7230);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31712(EnumC16617 enumC16617) {
        return this.f39316[enumC16617.f48853];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31708(EnumC16617 enumC16617) {
        return this.f39315[enumC16617.f48853];
    }
}
