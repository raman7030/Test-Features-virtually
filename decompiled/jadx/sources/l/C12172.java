package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 54PW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12172 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23419[] f36303 = {null, null, null, null, null, null, new C23419(0), new C23419(0), new C23419(0), new C23419(0), new C23419(0), new C23419(0), new C23419(0), new C23419(0), new C23419(0), new C23419(0), null, null};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f36305 = new int[18];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f36304 = new int[18];

    public C12172() {
        for (int i = 0; i < 18; i++) {
            this.f36305[i] = -1;
            this.f36304[i] = -1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5116 m29647(EnumC14993 enumC14993, int i) {
        AbstractC5116 abstractC5116 = (AbstractC5116) this.f36303[enumC14993.f45740].m51887(i);
        if (abstractC5116 != null) {
            return abstractC5116;
        }
        throw new C16363(String.format("Could not find the %s item at offset %#x", enumC14993.f45739, Integer.valueOf(i)), null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5116 m29651(EnumC14993 enumC14993, int i) {
        AbstractC5116 abstractC5116 = (AbstractC5116) this.f36303[enumC14993.f45740].m51887(i);
        if (abstractC5116 != null || i == 0) {
            return abstractC5116;
        }
        throw new C16363(String.format("Could not find the %s item at offset %#x", enumC14993.f45739, Integer.valueOf(i)), null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29648(EnumC14993 enumC14993, int i, int i2) {
        int i3 = enumC14993.f45740;
        int[] iArr = this.f36305;
        int i4 = iArr[i3];
        if (i4 == -1) {
            iArr[i3] = i;
        } else if (i4 != i) {
            throw new RuntimeException("The section size in the header and map for item type " + enumC14993 + " do not match");
        }
        int[] iArr2 = this.f36304;
        int i5 = iArr2[i3];
        if (i5 == -1) {
            iArr2[i3] = i2;
        } else {
            if (i5 == i2) {
                return;
            }
            throw new RuntimeException("The section offset in the header and map for item type " + enumC14993 + " do not match");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29649(EnumC14993 enumC14993, ArrayList arrayList) {
        C23419 c23419 = this.f36303[enumC14993.f45740];
        c23419.m51885(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5116 abstractC5116 = (AbstractC5116) it.next();
            c23419.m51886(abstractC5116.f16030, abstractC5116);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29650(EnumC14993 enumC14993) {
        return this.f36305[enumC14993.f45740];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29646(EnumC14993 enumC14993) {
        return this.f36304[enumC14993.f45740];
    }
}
