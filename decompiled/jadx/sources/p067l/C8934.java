package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۜܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8934 extends AbstractC6252 implements InterfaceC18195 {

    /* JADX INFO: renamed from: ۡ */
    public static final /* synthetic */ int f24196 = 0;

    /* JADX INFO: renamed from: ܺ */
    public static final AbstractC12093 f24197 = AbstractC12093.m27884(new C7613());

    /* JADX INFO: renamed from: ۜ */
    public Thread f24198;

    /* JADX INFO: renamed from: ۢ */
    public final C6272 f24199;

    /* JADX INFO: renamed from: ܳ */
    public final Object f24200;

    /* JADX INFO: renamed from: ܽ */
    public C19695 f24201;

    /* JADX INFO: renamed from: ܿ */
    public Boolean f24202;

    /* JADX INFO: renamed from: ᩳ */
    public final Context f24203;

    /* JADX INFO: renamed from: ᩷ */
    public C4240 f24204;

    /* JADX INFO: renamed from: ᩻ */
    public C24376 f24205;

    @Override // p067l.AbstractC7593
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC18195 mo17538() {
        return this;
    }

    public C8934(ContextWrapper contextWrapper) {
        C6272 c6272 = new C6272();
        C24376 c24376 = C24376.f77165;
        this.f24200 = new Object();
        this.f24203 = contextWrapper.getApplicationContext();
        this.f24199 = c6272;
        if (c24376 != null) {
            this.f24205 = c24376;
        } else {
            c24376.getClass();
            C13648 c13648 = new C13648(c24376);
            c13648.m31045(c24376);
            this.f24205 = new C24376(c13648, 0);
        }
        this.f24201 = C19695.f59870;
        boolean z = this.f24205.f77169;
    }

    @Override // p067l.AbstractC7593
    /* JADX INFO: renamed from: ܿ */
    public final void mo17539() {
        C4240 c4240;
        synchronized (this.f24200) {
            Thread thread = this.f24198;
            if (thread != null) {
                C23877.m52959("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (c4240 = this.f24204) != null) {
            c4240.m8622();
            this.f24204 = null;
        }
        super.mo17539();
    }

    @Override // p067l.AbstractC7593
    /* JADX INFO: renamed from: ۧ */
    public final C13680 mo17537() {
        C24376 c24376;
        synchronized (this.f24200) {
            c24376 = this.f24205;
        }
        return c24376;
    }

    @Override // p067l.AbstractC7593
    /* JADX INFO: renamed from: ֫ */
    public final void mo17535(C13680 c13680) {
        C24376 c24376;
        if (c13680 instanceof C24376) {
            m20645((C24376) c13680);
        }
        synchronized (this.f24200) {
            c24376 = this.f24205;
        }
        C13648 c13648 = new C13648(c24376);
        c13648.m31045(c13680);
        m20645(new C24376(c13648, 0));
    }

    @Override // p067l.AbstractC7593
    /* JADX INFO: renamed from: ֫ */
    public final void mo17536(C19695 c19695) {
        if (this.f24201.equals(c19695)) {
            return;
        }
        this.f24201 = c19695;
        m20648();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20645(C24376 c24376) {
        boolean zEquals;
        synchronized (this.f24200) {
            zEquals = this.f24205.equals(c24376);
            this.f24205 = c24376;
        }
        if (zEquals) {
            return;
        }
        if (c24376.f77169 && this.f24203 == null) {
            C21334.m48351("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m17540();
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02b5  */
    @Override // p067l.AbstractC6252
    /* JADX INFO: renamed from: ֫ */
    public final Pair mo14188(C4911 c4911, int[][][] iArr, final int[] iArr2, C17474 c17474, AbstractC6974 abstractC6974) {
        final C24376 c24376;
        int i;
        int i2;
        final boolean z;
        final String str;
        final String languageTag;
        boolean z2;
        InterfaceC20334 c20354;
        int i3;
        int[][] iArr3;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        synchronized (this.f24200) {
            this.f24198 = Thread.currentThread();
            c24376 = this.f24205;
        }
        if (this.f24202 == null && (context = this.f24203) != null) {
            this.f24202 = Boolean.valueOf(C5792.m13026(context));
        }
        if (c24376.f77169 && Build.VERSION.SDK_INT >= 32 && this.f24204 == null) {
            this.f24204 = new C4240(this.f24203, this, this.f24202);
        }
        int iM10416 = c4911.m10416();
        Context context2 = this.f24203;
        int iM10417 = c4911.m10416();
        C22346[] c22346Arr = new C22346[iM10417];
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= c4911.m10416()) {
                z = false;
                break;
            }
            if (2 == c4911.m10417(i4) && c4911.m10421(i4).f21837 > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair pairM20641 = m20641(1, c4911, iArr, new InterfaceC18321() { // from class: l.᩹ᩳۧ
            @Override // p067l.InterfaceC18321
            /* JADX INFO: renamed from: ֫ */
            public final List mo6592(int i5, C15020 c15020, int[] iArr4) {
                C23706 c23706 = this;
                C8934 c8934 = c23706.f75437;
                C24376 c24377 = c24376;
                C14988 c14988 = new C14988(c8934, c24377);
                int i6 = iArr2[i5];
                int i7 = AbstractC16192.f47662;
                C4123 c4123 = new C4123();
                int i8 = 0;
                while (i8 < c15020.f42921) {
                    c4123.m18184(new C14318(i5, c15020, i8, c24377, iArr4[i8], z, c14988, i6));
                    i8++;
                    c23706 = this;
                }
                return c4123.m8329();
            }
        }, new C21695());
        if (pairM20641 != null) {
            c22346Arr[((Integer) pairM20641.second).intValue()] = (C22346) pairM20641.first;
        }
        if (pairM20641 == null) {
            str = null;
        } else {
            C22346 c22346 = (C22346) pairM20641.first;
            str = c22346.f70541.m34395(c22346.f70542[0]).f28517;
        }
        c24376.f38557.getClass();
        final Point pointM12994 = (!c24376.f38585 || context2 == null) ? null : C5792.m12994(context2);
        Pair pairM20642 = m20641(2, c4911, iArr, new InterfaceC18321() { // from class: l.ܶᩳۧ
            /* JADX WARN: Code duplicated, block: B:28:0x004a  */
            @Override // p067l.InterfaceC18321
            /* JADX INFO: renamed from: ֫ */
            public final List mo6592(int i5, C15020 c15020, int[] iArr4) {
                int i6;
                int i7;
                int i8;
                int i9;
                Point point;
                C16999 c16999 = this;
                int i10 = iArr2[i5];
                C24376 c24377 = c24376;
                Point point2 = pointM12994;
                int i11 = point2 != null ? point2.x : c24377.f38570;
                int i12 = point2 != null ? point2.y : c24377.f38568;
                boolean z3 = c24377.f38563;
                if (i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE) {
                    i6 = Integer.MAX_VALUE;
                } else {
                    int i13 = Integer.MAX_VALUE;
                    for (int i14 = 0; i14 < c15020.f42921; i14++) {
                        C10307 c10307M34395 = c15020.m34395(i14);
                        int i15 = c10307M34395.f28547;
                        int i16 = c10307M34395.f28523;
                        if (i15 > 0 && i16 > 0) {
                            if (!z3) {
                                i8 = i12;
                                i9 = i11;
                            } else if ((i15 > i16) != (i11 > i12)) {
                                i9 = i12;
                                i8 = i11;
                            } else {
                                i8 = i12;
                                i9 = i11;
                            }
                            int i17 = i15 * i8;
                            int i18 = i16 * i9;
                            if (i17 >= i18) {
                                point = new Point(i9, C5792.m12975(i18, i15));
                            } else {
                                point = new Point(C5792.m12975(i17, i16), i8);
                            }
                            int i19 = c10307M34395.f28547;
                            int i20 = i19 * i16;
                            if (i19 >= ((int) (point.x * 0.98f)) && i16 >= ((int) (point.y * 0.98f)) && i20 < i13) {
                                i13 = i20;
                            }
                        }
                    }
                    i6 = i13;
                }
                int i21 = AbstractC16192.f47662;
                C4123 c4123 = new C4123();
                int i22 = 0;
                while (i22 < c15020.f42921) {
                    C10307 c10307M34396 = c15020.m34395(i22);
                    int i23 = c10307M34396.f28547;
                    int i24 = (i23 == -1 || (i7 = c10307M34396.f28523) == -1) ? -1 : i23 * i7;
                    c4123.m18184(new C25027(i5, c15020, i22, c24377, iArr4[i22], str, i10, i6 == Integer.MAX_VALUE || (i24 != -1 && i24 <= i6)));
                    i22++;
                    c16999 = this;
                }
                return c4123.m8329();
            }
        }, new C23036());
        int i5 = 4;
        Pair pairM20643 = (c24376.f38573 || pairM20642 == null) ? m20641(4, c4911, iArr, new InterfaceC18321() { // from class: l.֨ᩳۧ
            @Override // p067l.InterfaceC18321
            /* JADX INFO: renamed from: ֫ */
            public final List mo6592(int i6, C15020 c15020, int[] iArr4) {
                int i7 = AbstractC16192.f47662;
                C4123 c4123 = new C4123();
                for (int i8 = 0; i8 < c15020.f42921; i8++) {
                    int i9 = i8;
                    c4123.m18184(new C12307(i6, c15020, i9, c24376, iArr4[i8]));
                }
                return c4123.m8329();
            }
        }, new C10295()) : null;
        if (pairM20643 != null) {
            c22346Arr[((Integer) pairM20643.second).intValue()] = (C22346) pairM20643.first;
        } else if (pairM20642 != null) {
            c22346Arr[((Integer) pairM20642.second).intValue()] = (C22346) pairM20642.first;
        }
        if (!c24376.f38571 || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = C5792.f14228;
            languageTag = locale.toLanguageTag();
        }
        int i6 = 3;
        Pair pairM20644 = m20641(3, c4911, iArr, new InterfaceC18321() { // from class: l.ۙᩳۧ
            @Override // p067l.InterfaceC18321
            /* JADX INFO: renamed from: ֫ */
            public final List mo6592(int i7, C15020 c15020, int[] iArr4) {
                int i8 = AbstractC16192.f47662;
                C4123 c4123 = new C4123();
                for (int i9 = 0; i9 < c15020.f42921; i9++) {
                    int i10 = i9;
                    c4123.m18184(new C12958(i7, c15020, i10, c24376, iArr4[i9], str, languageTag));
                }
                return c4123.m8329();
            }
        }, new C5601());
        if (pairM20644 != null) {
            c22346Arr[((Integer) pairM20644.second).intValue()] = (C22346) pairM20644.first;
        }
        int i7 = 0;
        while (i7 < iM10417) {
            int iM10418 = c4911.m10417(i7);
            if (iM10418 == i || iM10418 == i2 || iM10418 == i6 || iM10418 == i5) {
                i3 = iM10417;
            } else {
                C8243 c8243M10421 = c4911.m10421(i7);
                int[][] iArr4 = iArr[i7];
                int i8 = 0;
                int i9 = 0;
                C15020 c15020 = null;
                C8283 c8283 = null;
                while (i8 < c8243M10421.f21837) {
                    C15020 c15020M19034 = c8243M10421.m19034(i8);
                    int[] iArr5 = iArr4[i8];
                    C8243 c8243 = c8243M10421;
                    int i10 = 0;
                    while (i10 < c15020M19034.f42921) {
                        int i11 = iM10417;
                        if (C12832.m29414(iArr5[i10], c24376.f77172)) {
                            iArr3 = iArr4;
                            C8283 c8284 = new C8283(c15020M19034.m34395(i10), iArr5[i10]);
                            if (c8283 == null || c8284.compareTo(c8283) > 0) {
                                c8283 = c8284;
                                i9 = i10;
                                c15020 = c15020M19034;
                            }
                        } else {
                            iArr3 = iArr4;
                        }
                        i10++;
                        iM10417 = i11;
                        iArr4 = iArr3;
                    }
                    i8++;
                    c8243M10421 = c8243;
                }
                i3 = iM10417;
                c22346Arr[i7] = c15020 == null ? null : new C22346(0, c15020, new int[]{i9});
            }
            i7++;
            i6 = 3;
            i = 2;
            i2 = 1;
            i5 = 4;
            iM10417 = i3;
        }
        int iM10419 = c4911.m10416();
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < iM10419; i12++) {
            m20643(c4911.m10421(i12), c24376, map);
        }
        m20643(c4911.m10420(), c24376, map);
        for (int i13 = 0; i13 < iM10419; i13++) {
            C14350 c14350 = (C14350) map.get(Integer.valueOf(c4911.m10417(i13)));
            if (c14350 != null) {
                C15020 c15021 = c14350.f41039;
                AbstractC16192 abstractC16192 = c14350.f41040;
                c22346Arr[i13] = (abstractC16192.isEmpty() || c4911.m10421(i13).m19033(c15021) == -1) ? null : new C22346(0, c15021, C15129.m34551(abstractC16192));
            }
        }
        int iM104110 = c4911.m10416();
        for (int i14 = 0; i14 < iM104110; i14++) {
            C8243 c8243M10422 = c4911.m10421(i14);
            if (c24376.m53733(i14, c8243M10422)) {
                if (c24376.m53731(i14, c8243M10422) != null) {
                    throw null;
                }
                c22346Arr[i14] = null;
            }
        }
        for (int i15 = 0; i15 < iM10416; i15++) {
            int iM104111 = c4911.m10417(i15);
            if (c24376.m53732(i15) || c24376.f38569.contains(Integer.valueOf(iM104111))) {
                c22346Arr[i15] = null;
            }
        }
        C6272 c6272 = this.f24199;
        InterfaceC14968 interfaceC14968M17532 = m17532();
        c6272.getClass();
        AbstractC16192 abstractC16192M45932 = C20354.m45932(c22346Arr);
        InterfaceC11617[] interfaceC11617Arr = new InterfaceC11617[c22346Arr.length];
        int i16 = 0;
        while (i16 < c22346Arr.length) {
            C22346 c22347 = c22346Arr[i16];
            if (c22347 != null) {
                int[] iArr6 = c22347.f70542;
                if (iArr6.length == 0) {
                    c22346Arr = c22346Arr;
                    interfaceC11617Arr = interfaceC11617Arr;
                    i16 = i16;
                } else {
                    if (iArr6.length == 1) {
                        c20354 = new C10946(c22347.f70541, new int[]{iArr6[0]});
                    } else {
                        long j = 25000;
                        c20354 = new C20354(c22347.f70541, iArr6, interfaceC14968M17532, 10000, j, j, (AbstractC16192) abstractC16192M45932.get(i16));
                    }
                    interfaceC11617Arr[i16] = c20354;
                }
            } else {
                c22346Arr = c22346Arr;
                interfaceC11617Arr = interfaceC11617Arr;
                i16 = i16;
            }
            i16++;
            c22346Arr = c22346Arr;
            interfaceC11617Arr = interfaceC11617Arr;
        }
        InterfaceC11617[] interfaceC11617Arr2 = interfaceC11617Arr;
        C18866[] c18866Arr = new C18866[iM10416];
        for (int i17 = 0; i17 < iM10416; i17++) {
            c18866Arr[i17] = (c24376.m53732(i17) || c24376.f38569.contains(Integer.valueOf(c4911.m10417(i17))) || (c4911.m10417(i17) != -2 && interfaceC11617Arr2[i17] == null)) ? null : C18866.f56350;
        }
        if (c24376.f77168) {
            int i18 = -1;
            int i19 = 0;
            int i20 = -1;
            while (true) {
                if (i19 >= c4911.m10416()) {
                    z2 = true;
                    break;
                }
                int iM104112 = c4911.m10417(i19);
                InterfaceC11617 interfaceC11617 = interfaceC11617Arr2[i19];
                if ((iM104112 == 1 || iM104112 == 2) && interfaceC11617 != null) {
                    int[][] iArr7 = iArr[i19];
                    int iM19033 = c4911.m10421(i19).m19033(interfaceC11617.mo4759());
                    int i21 = 0;
                    while (true) {
                        if (i21 >= interfaceC11617.length()) {
                            if (iM104112 != 1) {
                                if (i18 == -1) {
                                    i18 = i19;
                                    break;
                                }
                                z2 = false;
                                break;
                            }
                            if (i20 == -1) {
                                i20 = i19;
                                break;
                            }
                            z2 = false;
                            break;
                        }
                        if ((iArr7[iM19033][interfaceC11617.mo4755(i21)] & 32) != 32) {
                            break;
                        }
                        i21++;
                    }
                }
                i19++;
            }
            if (z2 & ((i20 == -1 || i18 == -1) ? false : true)) {
                C18866 c18866 = new C18866(0, true);
                c18866Arr[i20] = c18866;
                c18866Arr[i18] = c18866;
            }
        }
        c24376.f38557.getClass();
        return Pair.create(c18866Arr, interfaceC11617Arr2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0064 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m20646(C8934 c8934, C24376 c24376, C10307 c10307) {
        Boolean bool;
        C4240 c4240;
        C4240 c4241;
        if (c24376.f77169 && ((bool = c8934.f24202) == null || !bool.booleanValue())) {
            int i = c10307.f28539;
            if (i != -1 && i > 2) {
                String str = c10307.f28528;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (c4241 = c8934.f24204) != null && c4241.m8621()) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (c4240 = c8934.f24204) == null || !c4240.m8621() || !c8934.f24204.m8618() || !c8934.f24204.m8620() || !c8934.f24204.m8619(c8934.f24201, c10307)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Pair m20641(int i, C4911 c4911, int[][][] iArr, InterfaceC18321 interfaceC18321, Comparator comparator) {
        int i2;
        RandomAccess randomAccessM36873of;
        ArrayList arrayList = new ArrayList();
        int iM10416 = c4911.m10416();
        int i3 = 0;
        while (i3 < iM10416) {
            if (i == c4911.m10417(i3)) {
                C8243 c8243M10421 = c4911.m10421(i3);
                for (int i4 = 0; i4 < c8243M10421.f21837; i4++) {
                    C15020 c15020M19034 = c8243M10421.m19034(i4);
                    List listMo6592 = interfaceC18321.mo6592(i3, c15020M19034, iArr[i3][i4]);
                    int i5 = c15020M19034.f42921;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        AbstractC19663 abstractC19663 = (AbstractC19663) listMo6592.get(i6);
                        int iMo28349 = abstractC19663.mo28349();
                        if (zArr[i6] || iMo28349 == 0) {
                            i2 = iM10416;
                        } else {
                            if (iMo28349 == 1) {
                                randomAccessM36873of = AbstractC16192.m36873of((Object) abstractC19663);
                                i2 = iM10416;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC19663);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    AbstractC19663 abstractC19664 = (AbstractC19663) listMo6592.get(i7);
                                    int i8 = iM10416;
                                    if (abstractC19664.mo28349() == 2 && abstractC19663.mo28351(abstractC19664)) {
                                        arrayList2.add(abstractC19664);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    iM10416 = i8;
                                }
                                i2 = iM10416;
                                randomAccessM36873of = arrayList2;
                            }
                            arrayList.add(randomAccessM36873of);
                        }
                        i6++;
                        iM10416 = i2;
                    }
                }
            }
            i3++;
            iM10416 = iM10416;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((AbstractC19663) list.get(i9)).f59791;
        }
        AbstractC19663 abstractC19665 = (AbstractC19663) list.get(0);
        return Pair.create(new C22346(0, abstractC19665.f59792, iArr2), Integer.valueOf(abstractC19665.f59794));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public void m20648() {
        boolean z;
        C4240 c4240;
        synchronized (this.f24200) {
            z = this.f24205.f77169 && Build.VERSION.SDK_INT >= 32 && (c4240 = this.f24204) != null && c4240.m8621();
        }
        if (z) {
            m17540();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20649(AbstractC7054 abstractC7054) {
        boolean z;
        synchronized (this.f24200) {
            z = this.f24205.f77177;
        }
        if (z) {
            m17534(abstractC7054);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20643(C8243 c8243, C13680 c13680, HashMap map) {
        for (int i = 0; i < c8243.f21837; i++) {
            C14350 c14350 = (C14350) c13680.f38562.get(c8243.m19034(i));
            if (c14350 != null) {
                C15020 c15020 = c14350.f41039;
                C14350 c14351 = (C14350) map.get(Integer.valueOf(c15020.f42920));
                if (c14351 == null || (c14351.f41040.isEmpty() && !c14350.f41040.isEmpty())) {
                    map.put(Integer.valueOf(c15020.f42920), c14350);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m20642(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m20640(C10307 c10307, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c10307.f28517)) {
            return 4;
        }
        String strM20642 = m20642(str);
        String strM20643 = m20642(c10307.f28517);
        if (strM20643 == null || strM20642 == null) {
            return (z && strM20643 == null) ? 1 : 0;
        }
        if (strM20643.startsWith(strM20642) || strM20642.startsWith(strM20643)) {
            return 3;
        }
        String str2 = C5792.f14228;
        return strM20643.split("-", 2)[0].equals(strM20642.split("-", 2)[0]) ? 2 : 0;
    }
}
