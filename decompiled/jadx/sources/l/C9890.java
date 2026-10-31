package l;

/* JADX INFO: renamed from: l.ۢ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9890 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17650 f29929;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9184 f29930;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f29931;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9232 f29934;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18837 f29928 = new C18837();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18837 f29933 = new C18837();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f29932 = null;

    public C9890(C9184 c9184, C9232 c9232, C17650 c17650, AbstractC5698 abstractC5698) {
        this.f29930 = c9184;
        this.f29934 = c9232;
        this.f29929 = c17650;
        this.f29931 = abstractC5698;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14169 m24987() {
        AbstractC12612 abstractC12612M24984;
        C9232 c9232 = this.f29934;
        C9184 c9184 = this.f29930;
        int i = c9184.f27818.f52172;
        try {
            c9184.f27818.m39946((InterfaceC3109) c9232);
            C12048 c12048M24985 = m24985();
            if (c9232.f27940 == EnumC11091.INVOKE) {
                abstractC12612M24984 = m24983(c12048M24985);
            } else {
                abstractC12612M24984 = m24984();
            }
            C14169 c14169M39955 = c9184.f27818.m39955((AbstractC5144) abstractC12612M24984, this.f29933.m43517());
            c14169M39955.f74560 = c9232.f74560;
            c14169M39955.f16086 = c9232.f16086;
            c14169M39955.f16085 = c9232.f16085;
            return c14169M39955;
        } finally {
            c9184.f27818.f52172 = i;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m24986() {
        return this.f29932;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m24983(C12048 c12048) {
        AbstractC12612 abstractC12612M39914;
        C9232 c9232 = this.f29934;
        C9184 c9184 = this.f29930;
        if (c12048 != null) {
            abstractC12612M39914 = c9184.f27818.m39914((AbstractC5698) c12048);
            AbstractC4308 abstractC4308 = (!c9232.f27946 || C9184.m23599(c9184, c9232.f27943, this.f29931)) ? c9232.f27945.f16086 : c9232.f27943.m16071().f17560;
            if (abstractC4308 == c9184.f27808.f66505.f17560) {
                abstractC4308 = c9232.f27945.f16086;
            }
            if (!c12048.f17560.f13890.mo16080((AbstractC5698) abstractC4308.f13890, c9184.f27821)) {
                abstractC12612M39914 = c9184.f27818.m39936((AbstractC5144) c9184.f27818.m39965(abstractC4308), abstractC12612M39914);
                abstractC12612M39914.f16086 = abstractC4308;
            }
        } else {
            abstractC12612M39914 = c9232.f27945;
        }
        C6262 c6262M39912 = c9184.f27818.m39912(abstractC12612M39914, c9232.f27943.f17562);
        AbstractC5698 abstractC5698 = c9232.f27943;
        c6262M39912.f19396 = abstractC5698;
        c6262M39912.f16086 = abstractC5698.mo16091(c9184.f27821);
        C17013 c17013 = c9184.f27818;
        C2609 c2609M8239 = C2609.m8239();
        AbstractC5698 abstractC5699 = c9232.f27943;
        C2609 c2609M43517 = this.f29928.m43517();
        C9184.m23596(c9184, abstractC5699, c2609M43517, c9232.f27948);
        C15580 c15580M39929 = c17013.m39929(c6262M39912, c2609M8239, c2609M43517);
        c15580M39929.f16086 = c9232.f27943.mo16091(c9184.f27821).mo12923();
        AbstractC12612 abstractC12612M27677 = c9184.f27813.m27677(c9184.f27821.m17519(((C9232) this.f29929.f77786).f27939.mo12923()), c9184.f27817, c15580M39929);
        C9184.m23606(c9232.f27948, abstractC12612M27677);
        return abstractC12612M27677;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private AbstractC12612 m24984() {
        C9232 c9232 = this.f29934;
        EnumC20521 enumC20521 = c9232.f27942;
        EnumC20521 enumC20522 = EnumC20521.f66118;
        C9184 c9184 = this.f29930;
        if (enumC20521 == enumC20522) {
            C17013 c17013 = c9184.f27818;
            AbstractC12612 abstractC12612M39965 = c9184.f27818.m39965(c9184.f27821.m17515(c9232.f27945.f16086));
            C17013 c17014 = c9184.f27818;
            C9378 c9378 = (C9378) this.f29933.first();
            c17014.getClass();
            C18404 c18404M39958 = c17013.m39958(abstractC12612M39965, C2609.of((Object) c17014.m39914((AbstractC5698) c9378.f28489)), null);
            c18404M39958.f16086 = c9232.f27945.f16086;
            return c18404M39958;
        }
        C17013 c17015 = c9184.f27818;
        C2609 c2609M8239 = C2609.m8239();
        AbstractC12612 abstractC12612M39966 = c9184.f27818.m39965(c9232.f27945.f16086);
        AbstractC5698 abstractC5698 = c9232.f27943;
        C2609 c2609M43517 = this.f29928.m43517();
        C9184.m23596(c9184, abstractC5698, c2609M43517, c9232.f27948);
        C19110 c19110M39939 = c17015.m39939((AbstractC12612) null, c2609M8239, abstractC12612M39966, c2609M43517, (C5557) null, false);
        AbstractC5698 abstractC5699 = c9232.f27943;
        c19110M39939.f60194 = abstractC5699;
        c19110M39939.f60192 = abstractC5699.mo16091(c9184.f27821);
        c19110M39939.f16086 = c9232.f27945.f16086;
        C9184.m23606(c9232.f27948, c19110M39939);
        return c19110M39939;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12048 m24982(String str, AbstractC4308 abstractC4308, boolean z) {
        C9184 c9184 = this.f29930;
        C12048 c12048 = new C12048(8589938688L, c9184.f27819.f18880.m30652(str), abstractC4308, this.f29931);
        c12048.f36040 = this.f29934.f16085;
        this.f29933.m43511(c9184.f27818.m39923(c12048, (AbstractC12612) null));
        if (z) {
            this.f29928.m43511(c9184.f27818.m39914((AbstractC5698) c12048));
        }
        return c12048;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12048 m24985() {
        C12048 c12048M24982;
        C17650 c17650 = this.f29929;
        C9184 c9184 = c17650.f53963.f21747;
        C6319 c6319 = c9184.f27821;
        C6319 c63110 = c9184.f27821;
        AbstractC23195 abstractC23195 = c17650.f77786;
        AbstractC4308 abstractC4308M17519 = c6319.m17519(c63110.m17493(((C9232) abstractC23195).f74560.f13890).f17560);
        C2609 c2609Mo12933 = abstractC4308M17519.mo12933();
        C9184 c9185 = this.f29930;
        C6319 c63111 = c9185.f27821;
        C9232 c9232 = this.f29934;
        C2609 c2609Mo12934 = c9232.m51449(c63111).mo12933();
        int i = C4618.f14692[c9232.f27942.ordinal()];
        if (i == 3) {
            c12048M24982 = m24982("rec$", c9232.f27945.f16086, false);
            this.f29932 = c9185.f27815.m23939(c9232.f27945);
        } else if (i != 4) {
            c12048M24982 = null;
        } else {
            c12048M24982 = m24982("rec$", (AbstractC4308) abstractC4308M17519.mo12933().f8240, false);
            c2609Mo12933 = c2609Mo12933.f8241;
            c2609Mo12934 = c2609Mo12934.f8241;
        }
        C2609 c2609Mo12935 = c9232.f27943.f17560.mo12933();
        int iM8245 = c2609Mo12935.m8245();
        int iM8246 = c2609Mo12933.m8245();
        int i2 = ((C9232) abstractC23195).f27948 != null ? iM8245 - 1 : iM8245;
        boolean z = c9232.f27948 != null || iM8245 == c2609Mo12934.m8245();
        for (int i3 = 0; c2609Mo12935.m8249() && i3 < i2; i3++) {
            AbstractC4308 abstractC4308 = (AbstractC4308) c2609Mo12935.f8240;
            if (z) {
                EnumC0701 enumC0701Mo3256 = ((AbstractC4308) c2609Mo12934.f8240).mo3256();
                EnumC0701 enumC0701 = EnumC0701.INTERSECTION;
                if (enumC0701Mo3256 == enumC0701) {
                    abstractC4308 = (AbstractC4308) c2609Mo12933.f8240;
                }
                if (((AbstractC4308) c2609Mo12934.f8240).mo3256() == EnumC0701.TYPEVAR && ((C8541) c2609Mo12934.f8240).mo12939().mo3256() == enumC0701) {
                    abstractC4308 = (AbstractC4308) c2609Mo12933.f8240;
                }
            }
            m24982(C19370.m44628(i3, "x$"), abstractC4308, true);
            c2609Mo12935 = c2609Mo12935.f8241;
            c2609Mo12933 = c2609Mo12933.f8241;
            c2609Mo12934 = c2609Mo12934.f8241;
        }
        while (i2 < iM8246) {
            m24982(C19370.m44628(i2, "xva$"), c9232.f27948, true);
            i2++;
        }
        return c12048M24982;
    }
}
