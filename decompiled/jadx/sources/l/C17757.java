package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C17757 extends AbstractC0823 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public volatile C16736 f54313;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int[] f54314;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9291[] f54315;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C0117[] f54316;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14934[] f54317;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0117[] f54318;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C20412 f54319;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5057 f54320;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0117[] f54321;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f54322;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17757[] f54323;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f54324;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17757 f54325;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f54326;

    public /* synthetic */ C17757(C20412 c20412, C5057 c5057) {
        this(c20412, c5057, null);
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۢ */
    public final C20412 mo1132() {
        return this.f54319;
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f54319;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f54319.getName();
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ܿ */
    public final String mo1141() {
        return this.f54326;
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۧ */
    public final C5057 mo1134() {
        return this.f54320;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17757 m41596() {
        return this.f54325;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C16736 m41593() {
        if (this.f54313 == null) {
            C16736 c16736M46765 = this.f54319.m46765();
            if (c16736M46765.m39372()) {
                C11093 builder = c16736M46765.toBuilder();
                builder.m27527();
                c16736M46765 = builder.buildPartial();
                if (!c16736M46765.isInitialized()) {
                    throw AbstractC20704.m47318((InterfaceC23338) c16736M46765);
                }
            }
            C16736 c16736 = c16736M46765;
            synchronized (this) {
                if (this.f54313 == null) {
                    this.f54313 = c16736;
                }
            }
        }
        return this.f54313;
    }

    public final List getFields() {
        return C20195.unmodifiableList(Arrays.asList(this.f54318));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List m41589() {
        return C20195.unmodifiableList(Arrays.asList(this.f54317));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m41595() {
        return C20195.unmodifiableList(Arrays.asList(this.f54317).subList(0, this.f54324));
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List m41588() {
        return C20195.unmodifiableList(Arrays.asList(this.f54321));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m41592() {
        return C20195.unmodifiableList(Arrays.asList(this.f54323));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m41597() {
        return C20195.unmodifiableList(Arrays.asList(this.f54315));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41594(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f54314, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (~iBinarySearch) - 1;
        }
        return iBinarySearch >= 0 && i < this.f54322[iBinarySearch];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m41598() {
        return !this.f54319.m46758().isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0117 m41591(String str) {
        C23401 c23401 = this.f54320.f15895;
        String str2 = this.f54326 + '.' + str;
        c23401.getClass();
        AbstractC0823 abstractC0823M51848 = c23401.m51848(str2, EnumC14228.ALL_SYMBOLS);
        if (abstractC0823M51848 instanceof C0117) {
            return (C0117) abstractC0823M51848;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0117 m41590(int i) {
        C0117[] c0117Arr = this.f54316;
        int length = c0117Arr.length;
        C3646 unused = C0117.f1104;
        int i2 = C21991.f70406;
        int i3 = length - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            C0117 c0117 = c0117Arr[i5];
            int number = c0117.getNumber();
            if (i < number) {
                i3 = i5 - 1;
            } else {
                if (i <= number) {
                    return c0117;
                }
                i4 = i5 + 1;
            }
        }
        return null;
    }

    public C17757(String str) {
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
        C0655 c0655NewBuilder = C20412.newBuilder();
        c0655NewBuilder.setName(strSubstring2);
        C1361 c1361NewBuilder = C8417.newBuilder();
        c1361NewBuilder.m4780(1);
        c1361NewBuilder.m4779(536870912);
        C8417 c8417BuildPartial = c1361NewBuilder.buildPartial();
        if (c8417BuildPartial.isInitialized()) {
            c0655NewBuilder.m2684(c8417BuildPartial);
            this.f54319 = c0655NewBuilder.build();
            this.f54326 = str;
            this.f54325 = null;
            this.f54323 = C21991.f70409;
            this.f54315 = C21991.f70411;
            this.f54318 = C21991.f70413;
            this.f54316 = C21991.f70413;
            this.f54321 = C21991.f70413;
            this.f54317 = C21991.f70410;
            this.f54324 = 0;
            C5057 c5057 = new C5057(strSubstring, this);
            this.f54320 = c5057;
            this.f2993 = c5057;
            this.f54314 = new int[]{1};
            this.f54322 = new int[]{536870912};
            return;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c8417BuildPartial);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17757(C20412 c20412, C5057 c5057, C17757 c17757) throws C6468 {
        C14934[] c14934Arr;
        C17757[] c17757Arr;
        C9291[] c9291Arr;
        C0117[] c0117Arr;
        C0117[] c0117Arr2;
        int i = 0;
        super(i);
        if (c17757 == null) {
            this.f2993 = c5057;
        } else {
            this.f2993 = c17757;
        }
        this.f54319 = c20412;
        this.f54326 = C21991.m49472(c5057, c17757, c20412.getName());
        this.f54320 = c5057;
        this.f54325 = c17757;
        if (c20412.m46756() <= 0) {
            c14934Arr = C21991.f70410;
        } else {
            c14934Arr = new C14934[c20412.m46756()];
        }
        this.f54317 = c14934Arr;
        for (int i2 = 0; i2 < c20412.m46756(); i2++) {
            this.f54317[i2] = new C14934(c20412.m46763(i2), c5057, this, i2);
        }
        if (c20412.m46755() <= 0) {
            c17757Arr = C21991.f70409;
        } else {
            c17757Arr = new C17757[c20412.m46755()];
        }
        this.f54323 = c17757Arr;
        for (int i3 = 0; i3 < c20412.m46755(); i3++) {
            this.f54323[i3] = new C17757(c20412.m46764(i3), c5057, this);
        }
        if (c20412.m46757() <= 0) {
            c9291Arr = C21991.f70411;
        } else {
            c9291Arr = new C9291[c20412.m46757()];
        }
        this.f54315 = c9291Arr;
        for (int i4 = 0; i4 < c20412.m46757(); i4++) {
            this.f54315[i4] = new C9291(c20412.m46754(i4), c5057, this);
        }
        if (c20412.m46761() <= 0) {
            c0117Arr = C21991.f70413;
        } else {
            c0117Arr = new C0117[c20412.m46761()];
        }
        this.f54318 = c0117Arr;
        for (int i5 = 0; i5 < c20412.m46761(); i5++) {
            this.f54318[i5] = new C0117(c20412.m46762(i5), c5057, this, i5, false);
        }
        this.f54316 = c20412.m46761() > 0 ? (C0117[]) this.f54318.clone() : C21991.f70413;
        if (c20412.m46767() <= 0) {
            c0117Arr2 = C21991.f70413;
        } else {
            c0117Arr2 = new C0117[c20412.m46767()];
        }
        this.f54321 = c0117Arr2;
        for (int i6 = 0; i6 < c20412.m46767(); i6++) {
            this.f54321[i6] = new C0117(c20412.m46760(i6), c5057, this, i6, true);
        }
        for (int i7 = 0; i7 < c20412.m46756(); i7++) {
            C14934 c14934 = this.f54317[i7];
            c14934.f45521 = new C0117[c14934.m35390()];
            this.f54317[i7].f45522 = 0;
        }
        for (int i8 = 0; i8 < c20412.m46761(); i8++) {
            C14934 c14934M1139 = this.f54318[i8].m1139();
            if (c14934M1139 != null) {
                c14934M1139.f45521[C14934.m35385(c14934M1139)] = this.f54318[i8];
            }
        }
        int i9 = 0;
        for (C14934 c14935 : this.f54317) {
            if (c14935.m35388()) {
                i9++;
            } else if (i9 > 0) {
                throw new C6468(this, "Synthetic oneofs must come last.", i);
            }
        }
        this.f54324 = this.f54317.length - i9;
        c5057.f15895.m51849(this);
        if (c20412.m46759() <= 0) {
            this.f54314 = C21991.f70412;
            this.f54322 = C21991.f70412;
            return;
        }
        this.f54314 = new int[c20412.m46759()];
        this.f54322 = new int[c20412.m46759()];
        for (C8417 c8417 : c20412.m46758()) {
            this.f54314[i] = c8417.m22034();
            this.f54322[i] = c8417.m22032();
            i++;
        }
        Arrays.sort(this.f54314);
        Arrays.sort(this.f54322);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void m41586() {
        m3070(this.f54319.m46765().m39373());
        for (C17757 c17757 : this.f54323) {
            c17757.m41586();
        }
        for (C9291 c9291 : this.f54315) {
            C9291.m23849(c9291);
        }
        for (C14934 c14934 : this.f54317) {
            C14934.m35386(c14934);
        }
        for (C0117 c0117 : this.f54318) {
            C0117.m1118(c0117);
        }
        for (C0117 c0118 : this.f54321) {
            C0117.m1118(c0118);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m41587() throws C6468 {
        int i = 0;
        for (C17757 c17757 : this.f54323) {
            c17757.m41587();
        }
        for (C0117 c0117 : this.f54318) {
            C0117.m1119(c0117);
        }
        C0117[] c0117Arr = this.f54316;
        Arrays.sort(c0117Arr);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= c0117Arr.length) {
                C0117[] c0117Arr2 = this.f54321;
                int length = c0117Arr2.length;
                while (i < length) {
                    C0117.m1119(c0117Arr2[i]);
                    i++;
                }
                return;
            }
            C0117 c0118 = c0117Arr[i2];
            C0117 c0119 = c0117Arr[i3];
            if (c0118.getNumber() == c0119.getNumber()) {
                throw new C6468(c0119, "Field number " + c0119.getNumber() + " has already been used in \"" + c0119.m1144().f54326 + "\" by field \"" + c0118.getName() + "\".", i);
            }
            i2 = i3;
        }
    }
}
