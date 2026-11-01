package p067l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19244 extends AbstractC3150 {

    /* JADX INFO: renamed from: ֫֫ */
    public volatile C18274 f57507;

    /* JADX INFO: renamed from: ۗ */
    public final int[] f57508;

    /* JADX INFO: renamed from: ۙ */
    public final C11198[] f57509;

    /* JADX INFO: renamed from: ۛ */
    public final C2479[] f57510;

    /* JADX INFO: renamed from: ۟ */
    public final C16561[] f57511;

    /* JADX INFO: renamed from: ۤ */
    public final C2479[] f57512;

    /* JADX INFO: renamed from: ۧ֫ */
    public C21768 f57513;

    /* JADX INFO: renamed from: ۨ */
    public final C7174 f57514;

    /* JADX INFO: renamed from: ۫ */
    public final C2479[] f57515;

    /* JADX INFO: renamed from: ۬ */
    public final int[] f57516;

    /* JADX INFO: renamed from: ܰ */
    public final C19244[] f57517;

    /* JADX INFO: renamed from: ܽ֫ */
    public final int f57518;

    /* JADX INFO: renamed from: ᩶ */
    public final C19244 f57519;

    /* JADX INFO: renamed from: ᩺ */
    public final String f57520;

    public /* synthetic */ C19244(C21768 c21768, C7174 c7174) {
        this(c21768, c7174, null);
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final C21768 mo3533() {
        return this.f57513;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC24548 mo3533() {
        return this.f57513;
    }

    @Override // p067l.AbstractC3150
    public final String getName() {
        return this.f57513.getName();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ܿ */
    public final String mo3542() {
        return this.f57520;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۧ */
    public final C7174 mo3535() {
        return this.f57514;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C19244 m43841() {
        return this.f57519;
    }

    /* JADX INFO: renamed from: ۠ */
    public final C18274 m43838() {
        if (this.f57507 == null) {
            C18274 c18274M49088 = this.f57513.m49088();
            if (c18274M49088.m41608()) {
                C12911 builder = c18274M49088.toBuilder();
                builder.m29589();
                c18274M49088 = builder.buildPartial();
                if (!c18274M49088.isInitialized()) {
                    throw AbstractC22045.m49645((InterfaceC24548) c18274M49088);
                }
            }
            C18274 c18274 = c18274M49088;
            synchronized (this) {
                if (this.f57507 == null) {
                    this.f57507 = c18274;
                }
            }
        }
        return this.f57507;
    }

    public final List getFields() {
        return C21562.unmodifiableList(Arrays.asList(this.f57512));
    }

    /* JADX INFO: renamed from: ֨ */
    public final List m43834() {
        return C21562.unmodifiableList(Arrays.asList(this.f57511));
    }

    /* JADX INFO: renamed from: ܶ */
    public final List m43840() {
        return C21562.unmodifiableList(Arrays.asList(this.f57511).subList(0, this.f57518));
    }

    /* JADX INFO: renamed from: ֡ */
    public final List m43833() {
        return C21562.unmodifiableList(Arrays.asList(this.f57515));
    }

    /* JADX INFO: renamed from: ۚ */
    public final List m43837() {
        return C21562.unmodifiableList(Arrays.asList(this.f57517));
    }

    /* JADX INFO: renamed from: ᩴ */
    public final List m43842() {
        return C21562.unmodifiableList(Arrays.asList(this.f57509));
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m43839(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f57508, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (~iBinarySearch) - 1;
        }
        return iBinarySearch >= 0 && i < this.f57516[iBinarySearch];
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m43843() {
        return !this.f57513.m49081().isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2479 m43836(String str) {
        C24608 c24608 = this.f57514.f18731;
        String str2 = this.f57520 + '.' + str;
        c24608.getClass();
        AbstractC3150 abstractC3150M54246 = c24608.m54246(str2, EnumC15890.ALL_SYMBOLS);
        if (abstractC3150M54246 instanceof C2479) {
            return (C2479) abstractC3150M54246;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2479 m43835(int i) {
        C2479[] c2479Arr = this.f57510;
        int length = c2479Arr.length;
        C5833 unused = C2479.f3880;
        int i2 = C23268.f73121;
        int i3 = length - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            C2479 c2479 = c2479Arr[i5];
            int number = c2479.getNumber();
            if (i < number) {
                i3 = i5 - 1;
            } else {
                if (i <= number) {
                    return c2479;
                }
                i4 = i5 + 1;
            }
        }
        return null;
    }

    public C19244(String str) {
        String strSubstring;
        String strSubstring2;
        super(0);
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring2 = str.substring(iLastIndexOf + 1);
            strSubstring = str.substring(0, iLastIndexOf);
        } else {
            strSubstring = "";
            strSubstring2 = str;
        }
        C2991 c2991NewBuilder = C21768.newBuilder();
        c2991NewBuilder.setName(strSubstring2);
        C3662 c3662NewBuilder = C10368.newBuilder();
        c3662NewBuilder.m7018(1);
        c3662NewBuilder.m7017(536870912);
        C10368 c10368BuildPartial = c3662NewBuilder.buildPartial();
        if (c10368BuildPartial.isInitialized()) {
            c2991NewBuilder.m5024(c10368BuildPartial);
            this.f57513 = c2991NewBuilder.build();
            this.f57520 = str;
            this.f57519 = null;
            this.f57517 = C23268.f73124;
            this.f57509 = C23268.f73126;
            this.f57512 = C23268.f73128;
            this.f57510 = C23268.f73128;
            this.f57515 = C23268.f73128;
            this.f57511 = C23268.f73125;
            this.f57518 = 0;
            C7174 c7174 = new C7174(strSubstring, this);
            this.f57514 = c7174;
            this.f5767 = c7174;
            this.f57508 = new int[]{1};
            this.f57516 = new int[]{536870912};
            return;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c10368BuildPartial);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19244(C21768 c21768, C7174 c7174, C19244 c19244) throws C8515 {
        C16561[] c16561Arr;
        C19244[] c19244Arr;
        C11198[] c11198Arr;
        C2479[] c2479Arr;
        C2479[] c2479Arr2;
        int i = 0;
        super(i);
        if (c19244 == null) {
            this.f5767 = c7174;
        } else {
            this.f5767 = c19244;
        }
        this.f57513 = c21768;
        this.f57520 = C23268.m51807(c7174, c19244, c21768.getName());
        this.f57514 = c7174;
        this.f57519 = c19244;
        if (c21768.m49079() <= 0) {
            c16561Arr = C23268.f73125;
        } else {
            c16561Arr = new C16561[c21768.m49079()];
        }
        this.f57511 = c16561Arr;
        for (int i2 = 0; i2 < c21768.m49079(); i2++) {
            this.f57511[i2] = new C16561(c21768.m49086(i2), c7174, this, i2);
        }
        if (c21768.m49078() <= 0) {
            c19244Arr = C23268.f73124;
        } else {
            c19244Arr = new C19244[c21768.m49078()];
        }
        this.f57517 = c19244Arr;
        for (int i3 = 0; i3 < c21768.m49078(); i3++) {
            this.f57517[i3] = new C19244(c21768.m49087(i3), c7174, this);
        }
        if (c21768.m49080() <= 0) {
            c11198Arr = C23268.f73126;
        } else {
            c11198Arr = new C11198[c21768.m49080()];
        }
        this.f57509 = c11198Arr;
        for (int i4 = 0; i4 < c21768.m49080(); i4++) {
            this.f57509[i4] = new C11198(c21768.m49077(i4), c7174, this);
        }
        if (c21768.m49084() <= 0) {
            c2479Arr = C23268.f73128;
        } else {
            c2479Arr = new C2479[c21768.m49084()];
        }
        this.f57512 = c2479Arr;
        for (int i5 = 0; i5 < c21768.m49084(); i5++) {
            this.f57512[i5] = new C2479(c21768.m49085(i5), c7174, this, i5, false);
        }
        this.f57510 = c21768.m49084() > 0 ? (C2479[]) this.f57512.clone() : C23268.f73128;
        if (c21768.m49090() <= 0) {
            c2479Arr2 = C23268.f73128;
        } else {
            c2479Arr2 = new C2479[c21768.m49090()];
        }
        this.f57515 = c2479Arr2;
        for (int i6 = 0; i6 < c21768.m49090(); i6++) {
            this.f57515[i6] = new C2479(c21768.m49083(i6), c7174, this, i6, true);
        }
        for (int i7 = 0; i7 < c21768.m49079(); i7++) {
            C16561 c16561 = this.f57511[i7];
            c16561.f48636 = new C2479[c16561.m37542()];
            this.f57511[i7].f48637 = 0;
        }
        for (int i8 = 0; i8 < c21768.m49084(); i8++) {
            C16561 c16561M3540 = this.f57512[i8].m3540();
            if (c16561M3540 != null) {
                c16561M3540.f48636[C16561.m37537(c16561M3540)] = this.f57512[i8];
            }
        }
        int i9 = 0;
        for (C16561 c16562 : this.f57511) {
            if (c16562.m37540()) {
                i9++;
            } else if (i9 > 0) {
                throw new C8515(this, "Synthetic oneofs must come last.", i);
            }
        }
        this.f57518 = this.f57511.length - i9;
        c7174.f18731.m54247(this);
        if (c21768.m49082() <= 0) {
            this.f57508 = C23268.f73127;
            this.f57516 = C23268.f73127;
            return;
        }
        this.f57508 = new int[c21768.m49082()];
        this.f57516 = new int[c21768.m49082()];
        for (C10368 c10368 : c21768.m49081()) {
            this.f57508[i] = c10368.m24004();
            this.f57516[i] = c10368.m24002();
            i++;
        }
        Arrays.sort(this.f57508);
        Arrays.sort(this.f57516);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶ */
    public void m43831() {
        m5384(this.f57513.m49088().m41609());
        for (C19244 c19244 : this.f57517) {
            c19244.m43831();
        }
        for (C11198 c11198 : this.f57509) {
            C11198.m25858(c11198);
        }
        for (C16561 c16561 : this.f57511) {
            C16561.m37538(c16561);
        }
        for (C2479 c2479 : this.f57512) {
            C2479.m3519(c2479);
        }
        for (C2479 c24710 : this.f57515) {
            C2479.m3519(c24710);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹ */
    public void m43832() throws C8515 {
        int i = 0;
        for (C19244 c19244 : this.f57517) {
            c19244.m43832();
        }
        for (C2479 c2479 : this.f57512) {
            C2479.m3520(c2479);
        }
        C2479[] c2479Arr = this.f57510;
        Arrays.sort(c2479Arr);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= c2479Arr.length) {
                C2479[] c2479Arr2 = this.f57515;
                int length = c2479Arr2.length;
                while (i < length) {
                    C2479.m3520(c2479Arr2[i]);
                    i++;
                }
                return;
            }
            C2479 c24710 = c2479Arr[i2];
            C2479 c24711 = c2479Arr[i3];
            if (c24710.getNumber() == c24711.getNumber()) {
                throw new C8515(c24711, "Field number " + c24711.getNumber() + " has already been used in \"" + c24711.m3545().f57520 + "\" by field \"" + c24710.getName() + "\".", i);
            }
            i2 = i3;
        }
    }
}
