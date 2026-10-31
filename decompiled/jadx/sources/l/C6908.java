package l;

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
public final class C6908 extends AbstractC4086 implements InterfaceC16653 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21317 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10232 f21318 = AbstractC10232.m25862(new C5518());

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Thread f21319;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4107 f21320;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f21321;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18231 f21322;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Boolean f21323;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Context f21324;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1969 f21325;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C23156 f21326;

    @Override // l.AbstractC5497
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC16653 mo15627() {
        return this;
    }

    public C6908(ContextWrapper contextWrapper) {
        C4107 c4107 = new C4107();
        C23156 c23156 = C23156.f74419;
        this.f21321 = new Object();
        this.f21324 = contextWrapper.getApplicationContext();
        this.f21320 = c4107;
        if (c23156 != null) {
            this.f21326 = c23156;
        } else {
            c23156.getClass();
            C11868 c11868 = new C11868(c23156);
            c11868.m28994(c23156);
            this.f21326 = new C23156(c11868, 0);
        }
        this.f21322 = C18231.f56651;
        boolean z = this.f21326.f74423;
    }

    @Override // l.AbstractC5497
    /* JADX INFO: renamed from: ܿ */
    public final void mo15628() {
        C1969 c1969;
        synchronized (this.f21321) {
            Thread thread = this.f21319;
            if (thread != null) {
                C22632.m50633("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (c1969 = this.f21325) != null) {
            c1969.m6481();
            this.f21325 = null;
        }
        super.mo15628();
    }

    @Override // l.AbstractC5497
    /* JADX INFO: renamed from: ۧ */
    public final C11902 mo15626() {
        C23156 c23156;
        synchronized (this.f21321) {
            c23156 = this.f21326;
        }
        return c23156;
    }

    @Override // l.AbstractC5497
    /* JADX INFO: renamed from: ֫ */
    public final void mo15624(C11902 c11902) {
        C23156 c23156;
        if (c11902 instanceof C23156) {
            m18696((C23156) c11902);
        }
        synchronized (this.f21321) {
            c23156 = this.f21326;
        }
        C11868 c11868 = new C11868(c23156);
        c11868.m28994(c11902);
        m18696(new C23156(c11868, 0));
    }

    @Override // l.AbstractC5497
    /* JADX INFO: renamed from: ֫ */
    public final void mo15625(C18231 c18231) {
        if (this.f21322.equals(c18231)) {
            return;
        }
        this.f21322 = c18231;
        m18699();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18696(C23156 c23156) {
        boolean zEquals;
        synchronized (this.f21321) {
            zEquals = this.f21326.equals(c23156);
            this.f21326 = c23156;
        }
        if (zEquals) {
            return;
        }
        if (c23156.f74423 && this.f21324 == null) {
            C19956.m46037("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m15629();
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02b5  */
    @Override // l.AbstractC4086
    /* JADX INFO: renamed from: ֫ */
    public final Pair mo12283(C2675 c2675, int[][][] iArr, final int[] iArr2, C15894 c15894, AbstractC4846 abstractC4846) {
        final C23156 c23156;
        int i;
        int i2;
        final boolean z;
        final String str;
        final String languageTag;
        boolean z2;
        InterfaceC18903 c18924;
        int i3;
        int[][] iArr3;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        synchronized (this.f21321) {
            this.f21319 = Thread.currentThread();
            c23156 = this.f21326;
        }
        if (this.f21323 == null && (context = this.f21324) != null) {
            this.f21323 = Boolean.valueOf(C3603.m11050(context));
        }
        if (c23156.f74423 && Build.VERSION.SDK_INT >= 32 && this.f21325 == null) {
            this.f21325 = new C1969(this.f21324, this, this.f21323);
        }
        int iM8370 = c2675.m8370();
        Context context2 = this.f21324;
        int iM8371 = c2675.m8370();
        C21020[] c21020Arr = new C21020[iM8371];
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= c2675.m8370()) {
                z = false;
                break;
            }
            if (2 == c2675.m8371(i4) && c2675.m8375(i4).f18978 > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair pairM18692 = m18692(1, c2675, iArr, new InterfaceC16785() { // from class: l.᩹ᩳۧ
            @Override // l.InterfaceC16785
            /* JADX INFO: renamed from: ֫ */
            public final List mo4346(int i5, C13312 c13312, int[] iArr4) {
                C22451 c22451 = this;
                C6908 c6908 = c22451.f72711;
                C23156 c23157 = c23156;
                C13278 c13278 = new C13278(c6908, c23157);
                int i6 = iArr2[i5];
                int i7 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                int i8 = 0;
                while (i8 < c13312.f39854) {
                    c1846.m16264(new C12573(i5, c13312, i8, c23157, iArr4[i8], z, c13278, i6));
                    i8++;
                    c22451 = this;
                }
                return c1846.m6131();
            }
        }, new C20335());
        if (pairM18692 != null) {
            c21020Arr[((Integer) pairM18692.second).intValue()] = (C21020) pairM18692.first;
        }
        if (pairM18692 == null) {
            str = null;
        } else {
            C21020 c21020 = (C21020) pairM18692.first;
            str = c21020.f67856.m32295(c21020.f67857[0]).f25603;
        }
        c23156.f35547.getClass();
        final Point pointM11018 = (!c23156.f35575 || context2 == null) ? null : C3603.m11018(context2);
        Pair pairM18693 = m18692(2, c2675, iArr, new InterfaceC16785() { // from class: l.ܶᩳۧ
            /* JADX WARN: Code duplicated, block: B:28:0x004a  */
            @Override // l.InterfaceC16785
            /* JADX INFO: renamed from: ֫ */
            public final List mo4346(int i5, C13312 c13312, int[] iArr4) {
                int i6;
                int i7;
                int i8;
                int i9;
                Point point;
                C15394 c15394 = this;
                int i10 = iArr2[i5];
                C23156 c23157 = c23156;
                Point point2 = pointM11018;
                int i11 = point2 != null ? point2.x : c23157.f35560;
                int i12 = point2 != null ? point2.y : c23157.f35558;
                boolean z3 = c23157.f35553;
                if (i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE) {
                    i6 = Integer.MAX_VALUE;
                } else {
                    int i13 = Integer.MAX_VALUE;
                    for (int i14 = 0; i14 < c13312.f39854; i14++) {
                        C8353 c8353M32295 = c13312.m32295(i14);
                        int i15 = c8353M32295.f25633;
                        int i16 = c8353M32295.f25609;
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
                                point = new Point(i9, C3603.m10999(i18, i15));
                            } else {
                                point = new Point(C3603.m10999(i17, i16), i8);
                            }
                            int i19 = c8353M32295.f25633;
                            int i20 = i19 * i16;
                            if (i19 >= ((int) (point.x * 0.98f)) && i16 >= ((int) (point.y * 0.98f)) && i20 < i13) {
                                i13 = i20;
                            }
                        }
                    }
                    i6 = i13;
                }
                int i21 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                int i22 = 0;
                while (i22 < c13312.f39854) {
                    C8353 c8353M32296 = c13312.m32295(i22);
                    int i23 = c8353M32296.f25633;
                    int i24 = (i23 == -1 || (i7 = c8353M32296.f25609) == -1) ? -1 : i23 * i7;
                    c1846.m16264(new C23841(i5, c13312, i22, c23157, iArr4[i22], str, i10, i6 == Integer.MAX_VALUE || (i24 != -1 && i24 <= i6)));
                    i22++;
                    c15394 = this;
                }
                return c1846.m6131();
            }
        }, new C21746());
        int i5 = 4;
        Pair pairM18694 = (c23156.f35563 || pairM18693 == null) ? m18692(4, c2675, iArr, new InterfaceC16785() { // from class: l.֨ᩳۧ
            @Override // l.InterfaceC16785
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final List mo4346(int i6, C13312 c13312, int[] iArr4) {
                int i7 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                for (int i8 = 0; i8 < c13312.f39854; i8++) {
                    int i9 = i8;
                    c1846.m16264(new C10457(i6, c13312, i9, c23156, iArr4[i8]));
                }
                return c1846.m6131();
            }
        }, new C8340()) : null;
        if (pairM18694 != null) {
            c21020Arr[((Integer) pairM18694.second).intValue()] = (C21020) pairM18694.first;
        } else if (pairM18693 != null) {
            c21020Arr[((Integer) pairM18693.second).intValue()] = (C21020) pairM18693.first;
        }
        if (!c23156.f35561 || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = C3603.f11424;
            languageTag = locale.toLanguageTag();
        }
        int i6 = 3;
        Pair pairM18695 = m18692(3, c2675, iArr, new InterfaceC16785() { // from class: l.ۙᩳۧ
            @Override // l.InterfaceC16785
            /* JADX INFO: renamed from: ֫ */
            public final List mo4346(int i7, C13312 c13312, int[] iArr4) {
                int i8 = AbstractC14545.f44556;
                C1846 c1846 = new C1846();
                for (int i9 = 0; i9 < c13312.f39854; i9++) {
                    int i10 = i9;
                    c1846.m16264(new C11142(i7, c13312, i10, c23156, iArr4[i9], str, languageTag));
                }
                return c1846.m6131();
            }
        }, new C3401());
        if (pairM18695 != null) {
            c21020Arr[((Integer) pairM18695.second).intValue()] = (C21020) pairM18695.first;
        }
        int i7 = 0;
        while (i7 < iM8371) {
            int iM8372 = c2675.m8371(i7);
            if (iM8372 == i || iM8372 == i2 || iM8372 == i6 || iM8372 == i5) {
                i3 = iM8371;
            } else {
                C6181 c6181M8375 = c2675.m8375(i7);
                int[][] iArr4 = iArr[i7];
                int i8 = 0;
                int i9 = 0;
                C13312 c13312 = null;
                C6223 c6223 = null;
                while (i8 < c6181M8375.f18978) {
                    C13312 c13312M17102 = c6181M8375.m17102(i8);
                    int[] iArr5 = iArr4[i8];
                    C6181 c6181 = c6181M8375;
                    int i10 = 0;
                    while (i10 < c13312M17102.f39854) {
                        int i11 = iM8371;
                        if (C11010.m27352(iArr5[i10], c23156.f74426)) {
                            iArr3 = iArr4;
                            C6223 c6224 = new C6223(c13312M17102.m32295(i10), iArr5[i10]);
                            if (c6223 == null || c6224.compareTo(c6223) > 0) {
                                c6223 = c6224;
                                i9 = i10;
                                c13312 = c13312M17102;
                            }
                        } else {
                            iArr3 = iArr4;
                        }
                        i10++;
                        iM8371 = i11;
                        iArr4 = iArr3;
                    }
                    i8++;
                    c6181M8375 = c6181;
                }
                i3 = iM8371;
                c21020Arr[i7] = c13312 == null ? null : new C21020(0, c13312, new int[]{i9});
            }
            i7++;
            i6 = 3;
            i = 2;
            i2 = 1;
            i5 = 4;
            iM8371 = i3;
        }
        int iM8373 = c2675.m8370();
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < iM8373; i12++) {
            m18694(c2675.m8375(i12), c23156, map);
        }
        m18694(c2675.m8374(), c23156, map);
        for (int i13 = 0; i13 < iM8373; i13++) {
            C12607 c12607 = (C12607) map.get(Integer.valueOf(c2675.m8371(i13)));
            if (c12607 != null) {
                C13312 c13313 = c12607.f38012;
                AbstractC14545 abstractC14545 = c12607.f38013;
                c21020Arr[i13] = (abstractC14545.isEmpty() || c2675.m8375(i13).m17101(c13313) == -1) ? null : new C21020(0, c13313, C13426.m32449(abstractC14545));
            }
        }
        int iM8374 = c2675.m8370();
        for (int i14 = 0; i14 < iM8374; i14++) {
            C6181 c6181M8376 = c2675.m8375(i14);
            if (c23156.m51338(i14, c6181M8376)) {
                if (c23156.m51336(i14, c6181M8376) != null) {
                    throw null;
                }
                c21020Arr[i14] = null;
            }
        }
        for (int i15 = 0; i15 < iM8370; i15++) {
            int iM8375 = c2675.m8371(i15);
            if (c23156.m51337(i15) || c23156.f35559.contains(Integer.valueOf(iM8375))) {
                c21020Arr[i15] = null;
            }
        }
        C4107 c4107 = this.f21320;
        InterfaceC13257 interfaceC13257M15621 = m15621();
        c4107.getClass();
        AbstractC14545 abstractC14545M43666 = C18924.m43666(c21020Arr);
        InterfaceC9731[] interfaceC9731Arr = new InterfaceC9731[c21020Arr.length];
        int i16 = 0;
        while (i16 < c21020Arr.length) {
            C21020 c21021 = c21020Arr[i16];
            if (c21021 != null) {
                int[] iArr6 = c21021.f67857;
                if (iArr6.length == 0) {
                    c21020Arr = c21020Arr;
                    interfaceC9731Arr = interfaceC9731Arr;
                    i16 = i16;
                } else {
                    if (iArr6.length == 1) {
                        c18924 = new C9025(c21021.f67856, new int[]{iArr6[0]});
                    } else {
                        long j = 25000;
                        c18924 = new C18924(c21021.f67856, iArr6, interfaceC13257M15621, 10000, j, j, (AbstractC14545) abstractC14545M43666.get(i16));
                    }
                    interfaceC9731Arr[i16] = c18924;
                }
            } else {
                c21020Arr = c21020Arr;
                interfaceC9731Arr = interfaceC9731Arr;
                i16 = i16;
            }
            i16++;
            c21020Arr = c21020Arr;
            interfaceC9731Arr = interfaceC9731Arr;
        }
        InterfaceC9731[] interfaceC9731Arr2 = interfaceC9731Arr;
        C17359[] c17359Arr = new C17359[iM8370];
        for (int i17 = 0; i17 < iM8370; i17++) {
            c17359Arr[i17] = (c23156.m51337(i17) || c23156.f35559.contains(Integer.valueOf(c2675.m8371(i17))) || (c2675.m8371(i17) != -2 && interfaceC9731Arr2[i17] == null)) ? null : C17359.f53166;
        }
        if (c23156.f74422) {
            int i18 = -1;
            int i19 = 0;
            int i20 = -1;
            while (true) {
                if (i19 >= c2675.m8370()) {
                    z2 = true;
                    break;
                }
                int iM8376 = c2675.m8371(i19);
                InterfaceC9731 interfaceC9731 = interfaceC9731Arr2[i19];
                if ((iM8376 == 1 || iM8376 == 2) && interfaceC9731 != null) {
                    int[][] iArr7 = iArr[i19];
                    int iM17101 = c2675.m8375(i19).m17101(interfaceC9731.mo2388());
                    int i21 = 0;
                    while (true) {
                        if (i21 >= interfaceC9731.length()) {
                            if (iM8376 != 1) {
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
                        if ((iArr7[iM17101][interfaceC9731.mo2384(i21)] & 32) != 32) {
                            break;
                        }
                        i21++;
                    }
                }
                i19++;
            }
            if (z2 & ((i20 == -1 || i18 == -1) ? false : true)) {
                C17359 c17359 = new C17359(0, true);
                c17359Arr[i20] = c17359;
                c17359Arr[i18] = c17359;
            }
        }
        c23156.f35547.getClass();
        return Pair.create(c17359Arr, interfaceC9731Arr2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0064 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18697(C6908 c6908, C23156 c23156, C8353 c8353) {
        Boolean bool;
        C1969 c1969;
        C1969 c19610;
        if (c23156.f74423 && ((bool = c6908.f21323) == null || !bool.booleanValue())) {
            int i = c8353.f25625;
            if (i != -1 && i > 2) {
                String str = c8353.f25614;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (c19610 = c6908.f21325) != null && c19610.m6480()) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (c1969 = c6908.f21325) == null || !c1969.m6480() || !c6908.f21325.m6477() || !c6908.f21325.m6479() || !c6908.f21325.m6478(c6908.f21322, c8353)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pair m18692(int i, C2675 c2675, int[][][] iArr, InterfaceC16785 interfaceC16785, Comparator comparator) {
        int i2;
        RandomAccess randomAccessOf;
        ArrayList arrayList = new ArrayList();
        int iM8370 = c2675.m8370();
        int i3 = 0;
        while (i3 < iM8370) {
            if (i == c2675.m8371(i3)) {
                C6181 c6181M8375 = c2675.m8375(i3);
                for (int i4 = 0; i4 < c6181M8375.f18978; i4++) {
                    C13312 c13312M17102 = c6181M8375.m17102(i4);
                    List listMo4346 = interfaceC16785.mo4346(i3, c13312M17102, iArr[i3][i4]);
                    int i5 = c13312M17102.f39854;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        AbstractC18197 abstractC18197 = (AbstractC18197) listMo4346.get(i6);
                        int iMo26319 = abstractC18197.mo26319();
                        if (zArr[i6] || iMo26319 == 0) {
                            i2 = iM8370;
                        } else {
                            if (iMo26319 == 1) {
                                randomAccessOf = AbstractC14545.of((Object) abstractC18197);
                                i2 = iM8370;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC18197);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    AbstractC18197 abstractC18198 = (AbstractC18197) listMo4346.get(i7);
                                    int i8 = iM8370;
                                    if (abstractC18198.mo26319() == 2 && abstractC18197.mo26321(abstractC18198)) {
                                        arrayList2.add(abstractC18198);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    iM8370 = i8;
                                }
                                i2 = iM8370;
                                randomAccessOf = arrayList2;
                            }
                            arrayList.add(randomAccessOf);
                        }
                        i6++;
                        iM8370 = i2;
                    }
                }
            }
            i3++;
            iM8370 = iM8370;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((AbstractC18197) list.get(i9)).f56578;
        }
        AbstractC18197 abstractC18199 = (AbstractC18197) list.get(0);
        return Pair.create(new C21020(0, abstractC18199.f56579, iArr2), Integer.valueOf(abstractC18199.f56581));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m18699() {
        boolean z;
        C1969 c1969;
        synchronized (this.f21321) {
            z = this.f21326.f74423 && Build.VERSION.SDK_INT >= 32 && (c1969 = this.f21325) != null && c1969.m6480();
        }
        if (z) {
            m15629();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18700(AbstractC4930 abstractC4930) {
        boolean z;
        synchronized (this.f21321) {
            z = this.f21326.f74431;
        }
        if (z) {
            m15623(abstractC4930);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18694(C6181 c6181, C11902 c11902, HashMap map) {
        for (int i = 0; i < c6181.f18978; i++) {
            C12607 c12607 = (C12607) c11902.f35552.get(c6181.m17102(i));
            if (c12607 != null) {
                C13312 c13312 = c12607.f38012;
                C12607 c12608 = (C12607) map.get(Integer.valueOf(c13312.f39853));
                if (c12608 == null || (c12608.f38013.isEmpty() && !c12607.f38013.isEmpty())) {
                    map.put(Integer.valueOf(c13312.f39853), c12607);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18693(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18691(C8353 c8353, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c8353.f25603)) {
            return 4;
        }
        String strM18693 = m18693(str);
        String strM18694 = m18693(c8353.f25603);
        if (strM18694 == null || strM18693 == null) {
            return (z && strM18694 == null) ? 1 : 0;
        }
        if (strM18694.startsWith(strM18693) || strM18693.startsWith(strM18694)) {
            return 3;
        }
        String str2 = C3603.f11424;
        return strM18694.split("-", 2)[0].equals(strM18693.split("-", 2)[0]) ? 2 : 0;
    }
}
