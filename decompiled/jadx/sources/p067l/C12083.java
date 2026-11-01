package p067l;

/* JADX INFO: renamed from: l.ۤۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12083 {

    /* JADX INFO: renamed from: ܺ */
    public static final C6468 f33661 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final boolean f33662;

    /* JADX INFO: renamed from: ۜ */
    public final C8200 f33663;

    /* JADX INFO: renamed from: ۡ */
    public final C8374 f33664;

    /* JADX INFO: renamed from: ۢ */
    public final C22004 f33665;

    /* JADX INFO: renamed from: ۧ */
    public C4036 f33666;

    /* JADX INFO: renamed from: ܳ */
    public final C23623 f33667;

    /* JADX INFO: renamed from: ܽ */
    public final C16852 f33668;

    /* JADX INFO: renamed from: ܿ */
    public C6953 f33669;

    /* JADX INFO: renamed from: ᩳ */
    public final C8005 f33670;

    /* JADX INFO: renamed from: ᩷ */
    public final C23663 f33671;

    /* JADX INFO: renamed from: ᩻ */
    public C18537 f33672;

    /* JADX INFO: renamed from: ֫ */
    public static C12083 m27670(C5127 c5127) {
        C12083 c12083 = (C12083) c5127.m10905(f33661);
        return c12083 == null ? new C12083(c5127) : c12083;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m27687(C4036 c4036, C18537 c18537) {
        new C16105(this).m36643(c4036, c4036.f8850, c18537);
        new C22142(this).m49930(c4036, c4036.f8850, c18537);
        new C7389(this).m17115(c4036, c4036.f8850, c18537);
        C20801 c20801 = new C20801(this);
        AbstractC7257 abstractC7257 = c4036.f8850;
        try {
            this.f33666 = c4036;
            this.f33672 = c18537;
            c20801.f62320 = new C20271();
            c20801.mo12739(abstractC7257);
        } finally {
            c20801.f62320 = null;
            this.f33672 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27686(C4036 c4036, C15834 c15834, C18537 c18537, boolean z) {
        C23623 c23623 = this.f33667;
        C10212 c10212 = !z ? new C10212(c23623) : null;
        try {
            new C10071(this).m36643(c4036, c15834, c18537);
        } finally {
            if (!z) {
                c23623.m52452(c10212);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m27685(C4036 c4036, C15834 c15834, C18537 c18537) {
        C23623 c23623 = this.f33667;
        C10212 c10212 = new C10212(c23623);
        try {
            C16775 c16775 = new C16775(this);
            c16775.f49440 = AbstractC15689.m35727(c4036.f8855.f20027);
            c16775.m49930(c4036, c15834, c18537);
            C22812 c22812 = new C22812(this);
            c22812.m17115(c4036, c15834, c18537);
            return c22812.f71870;
        } finally {
            c23623.m52452(c10212);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m27688(C4036 c4036, AbstractC7257 abstractC7257, C18537 c18537) {
        C23623 c23623 = this.f33667;
        C10212 c10212 = new C10212(c23623);
        try {
            C14764 c14764 = new C14764(this);
            c14764.m36643(c4036, abstractC7257, c18537);
            return c14764.f47390 != EnumC5377.f12769;
        } finally {
            c23623.m52452(c10212);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m27689(C4036 c4036, AbstractC7257 abstractC7257, C18537 c18537) {
        C23623 c23623 = this.f33667;
        C10212 c10212 = new C10212(c23623);
        try {
            C14094 c14094 = new C14094(this);
            c14094.m36643(c4036, abstractC7257, c18537);
            return c14094.m32002();
        } finally {
            c23623.m52452(c10212);
        }
    }

    public C12083(C5127 c5127) {
        c5127.m10908(f33661, this);
        this.f33663 = C8200.m18988(c5127);
        this.f33667 = C23623.m52439(c5127);
        this.f33665 = C22004.m49577(c5127);
        this.f33664 = C8374.m19396(c5127);
        this.f33668 = C16852.m38215(c5127);
        this.f33669 = C6953.m15930(c5127);
        this.f33671 = C23663.m52629(c5127);
        this.f33670 = C8005.m18541(c5127);
        this.f33662 = EnumC12477.f34970.m28726(EnumC17840.m40515(c5127));
    }
}
