package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88HU */
/* JADX INFO: loaded from: classes2.dex */
public final class C9310 {

    /* JADX INFO: renamed from: ֫ */
    public final int f25305;

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f25306;

    /* JADX INFO: renamed from: ۡ */
    public final float f25307;

    /* JADX INFO: renamed from: ۢ */
    public final int f25308;

    /* JADX INFO: renamed from: ۧ */
    public final int f25309;

    /* JADX INFO: renamed from: ܳ */
    public final int f25310;

    /* JADX INFO: renamed from: ܺ */
    public final int f25311;

    /* JADX INFO: renamed from: ܽ */
    public final String f25312;

    /* JADX INFO: renamed from: ܿ */
    public final int f25313;

    /* JADX INFO: renamed from: ᩳ */
    public final int f25314;

    /* JADX INFO: renamed from: ᩷ */
    public final int f25315;

    /* JADX INFO: renamed from: ᩻ */
    public final int f25316;

    /* JADX INFO: renamed from: ֫ */
    public static C9310 m21550(C19203 c19203) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        try {
            c19203.m43724(4);
            int iM43702 = (c19203.m43702() & 3) + 1;
            if (iM43702 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM43703 = c19203.m43702() & 31;
            for (int i9 = 0; i9 < iM43703; i9++) {
                int iM43710 = c19203.m43710();
                int iM43731 = c19203.m43731();
                c19203.m43724(iM43710);
                arrayList.add(C19322.m44016(iM43731, iM43710, c19203.m43728()));
            }
            int iM43704 = c19203.m43702();
            for (int i10 = 0; i10 < iM43704; i10++) {
                int iM43711 = c19203.m43710();
                int iM43732 = c19203.m43731();
                c19203.m43724(iM43711);
                arrayList.add(C19322.m44016(iM43732, iM43711, c19203.m43728()));
            }
            if (iM43703 > 0) {
                C12695 c12695M41117 = C18058.m41117(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i11 = c12695M41117.f35618;
                int i12 = c12695M41117.f35625;
                int i13 = c12695M41117.f35626 + 8;
                int i14 = c12695M41117.f35619 + 8;
                int i15 = c12695M41117.f35631;
                int i16 = c12695M41117.f35629;
                int i17 = c12695M41117.f35630;
                int i18 = c12695M41117.f35628;
                float f2 = c12695M41117.f35632;
                int i19 = c12695M41117.f35633;
                int i20 = c12695M41117.f35627;
                int i21 = c12695M41117.f35624;
                int i22 = C19322.f57686;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i19), Integer.valueOf(i20), Integer.valueOf(i21));
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                f = 1.0f;
            }
            return new C9310(arrayList, iM43702, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C10998.m25387("Error parsing AVC config", e);
        }
    }

    public C9310(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f25306 = arrayList;
        this.f25308 = i;
        this.f25311 = i2;
        this.f25316 = i3;
        this.f25309 = i4;
        this.f25305 = i5;
        this.f25313 = i6;
        this.f25314 = i7;
        this.f25310 = i8;
        this.f25315 = i9;
        this.f25307 = f;
        this.f25312 = str;
    }
}
