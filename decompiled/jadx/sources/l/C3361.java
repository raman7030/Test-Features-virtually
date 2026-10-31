package l;

/* JADX INFO: renamed from: l.ۗܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BDK */
/* JADX INFO: loaded from: classes3.dex */
public final class C3361 implements InterfaceC11870 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22247 f10634;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22453 f10635;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6183 f10636;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11870 f10637;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23116 f10638;

    public C3361(InterfaceC11870 interfaceC11870, C22453 c22453, boolean z) {
        this.f10637 = interfaceC11870;
        this.f10635 = c22453;
        C22247 c22247 = (C22247) interfaceC11870.getAttributes().m33465("Code");
        this.f10634 = c22247;
        C13985 c13985M49954 = c22247.m49954();
        C6183 c6183M17104 = C6183.f18986;
        for (C10253 c10253 = (C10253) c13985M49954.m33465("LineNumberTable"); c10253 != null; c10253 = (C10253) c13985M49954.m33464(c10253)) {
            c6183M17104 = C6183.m17104(c6183M17104, c10253.m25982());
        }
        this.f10636 = c6183M17104;
        C23116 c23116M51306 = C23116.f74357;
        if (z) {
            for (C6019 c6019 = (C6019) c13985M49954.m33465("LocalVariableTable"); c6019 != null; c6019 = (C6019) c13985M49954.m33464(c6019)) {
                c23116M51306 = C23116.m51305(c23116M51306, c6019.m18659());
            }
            C23116 c23116M51305 = C23116.f74357;
            for (C11664 c11664 = (C11664) c13985M49954.m33465("LocalVariableTypeTable"); c11664 != null; c11664 = (C11664) c13985M49954.m33464(c11664)) {
                c23116M51305 = C23116.m51305(c23116M51305, c11664.m18659());
            }
            if (c23116M51305.size() != 0) {
                c23116M51306 = C23116.m51306(c23116M51306, c23116M51305);
            }
        }
        this.f10638 = c23116M51306;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m10268() {
        return ((this.f10635.m50376() & 512) == 0 || this.f10637.mo10264().m46530()) ? false : true;
    }

    @Override // l.InterfaceC6225
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20274 mo10264() {
        return this.f10637.mo10264();
    }

    @Override // l.InterfaceC6225
    public final C13217 getName() {
        return this.f10637.getName();
    }

    @Override // l.InterfaceC6225
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13217 mo10273() {
        return this.f10637.mo10273();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m10263() {
        return (this.f10637.mo10269() & 8) != 0;
    }

    @Override // l.InterfaceC6225
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo10269() {
        return this.f10637.mo10269();
    }

    @Override // l.InterfaceC6225
    public final C13985 getAttributes() {
        return this.f10637.getAttributes();
    }

    @Override // l.InterfaceC6225
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12512 mo10267() {
        return this.f10637.mo10267();
    }

    @Override // l.InterfaceC11870
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23095 mo10262() {
        return this.f10637.mo10262();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m10265() {
        return this.f10634.m49955();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m10266() {
        return this.f10634.m49957();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4772 m10270() {
        return this.f10634.m49958();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8300 m10271() {
        return this.f10634.m49956();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23116 m10272() {
        return this.f10638;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10191 m10261(int i) {
        return new C10191(this.f10635.m50381(), i, this.f10636.m17106(i));
    }
}
