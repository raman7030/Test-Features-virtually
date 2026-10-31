package l;

/* JADX INFO: renamed from: l.ۤۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10222 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C4314 f30700 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f30701;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6136 f30702;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C6319 f30703;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20661 f30704;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1755 f30705;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22364 f30706;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15240 f30707;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4824 f30708;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5931 f30709;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22406 f30710;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17013 f30711;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10222 m25648(C2903 c2903) {
        C10222 c10222 = (C10222) c2903.m8838(f30700);
        return c10222 == null ? new C10222(c2903) : c10222;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25665(C1755 c1755, C17013 c17013) {
        new C14454(this).m34510(c1755, c1755.f6074, c17013);
        new C20806(this).m47602(c1755, c1755.f6074, c17013);
        new C5283(this).m15212(c1755, c1755.f6074, c17013);
        C19395 c19395 = new C19395(this);
        AbstractC5144 abstractC5144 = c1755.f6074;
        try {
            this.f30705 = c1755;
            this.f30711 = c17013;
            c19395.f59097 = new C18837();
            c19395.mo10758(abstractC5144);
        } finally {
            c19395.f59097 = null;
            this.f30711 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25664(C1755 c1755, C14169 c14169, C17013 c17013, boolean z) {
        C22364 c22364 = this.f30706;
        C8253 c8253 = !z ? new C8253(c22364) : null;
        try {
            new C8105(this).m34510(c1755, c14169, c17013);
        } finally {
            if (!z) {
                c22364.m50112(c8253);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m25663(C1755 c1755, C14169 c14169, C17013 c17013) {
        C22364 c22364 = this.f30706;
        C8253 c8253 = new C8253(c22364);
        try {
            C15159 c15159 = new C15159(this);
            c15159.f46322 = AbstractC14016.m33607(c1755.f6079.f17186);
            c15159.m47602(c1755, c14169, c17013);
            C21511 c21511 = new C21511(this);
            c21511.m15212(c1755, c14169, c17013);
            return c21511.f69174;
        } finally {
            c22364.m50112(c8253);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25666(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        C22364 c22364 = this.f30706;
        C8253 c8253 = new C8253(c22364);
        try {
            C13043 c13043 = new C13043(this);
            c13043.m34510(c1755, abstractC5144, c17013);
            return c13043.f44296 != EnumC3166.f9966;
        } finally {
            c22364.m50112(c8253);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m25667(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        C22364 c22364 = this.f30706;
        C8253 c8253 = new C8253(c22364);
        try {
            C12338 c12338 = new C12338(this);
            c12338.m34510(c1755, abstractC5144, c17013);
            return c12338.m29942();
        } finally {
            c22364.m50112(c8253);
        }
    }

    public C10222(C2903 c2903) {
        c2903.m8841(f30700, this);
        this.f30702 = C6136.m17057(c2903);
        this.f30706 = C22364.m50099(c2903);
        this.f30704 = C20661.m47250(c2903);
        this.f30703 = C6319.m17456(c2903);
        this.f30707 = C15240.m36054(c2903);
        this.f30708 = C4824.m14050(c2903);
        this.f30710 = C22406.m50289(c2903);
        this.f30709 = C5931.m16615(c2903);
        this.f30701 = EnumC10637.f31999.m26686(EnumC16280.m38301(c2903));
    }
}
