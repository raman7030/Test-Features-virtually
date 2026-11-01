package p067l;

import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.۟۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9465 extends AbstractC11527 {

    /* JADX INFO: renamed from: ۖ */
    public static final C22926 f25901;

    /* JADX INFO: renamed from: ۘ */
    public static final C7959[] f25902;

    /* JADX INFO: renamed from: ᩴ */
    public static final C19359 f25904 = new C19359();

    /* JADX INFO: renamed from: ᩵ */
    public static final String[] f25905 = {"document", "part", "tag", "tagItem", AnnotationHandler.ATTRIBUTE};

    /* JADX INFO: renamed from: ܺ */
    public static final C16889 f25903 = new C16889(new String[]{null, null, "'<!--'", "'<![CDATA['", "'<!'", null, null, null, null, null, "'/>'", null, null, "'='", null, "'/'"}, new String[]{null, "RawText", "Comment", "Cdata", "Declaration", "Processing", "EndOpen", "TagOpen", "Text", "Other", "SelfClose", "TagClose", "TagSpace", "Equals", "TagWord", "Slash", "BrokenQuoted", "TagOther", "ValueSpace", "QuotedValue", "BareValue"}, null);

    /* JADX INFO: renamed from: ֡ */
    @Deprecated
    public static final String[] f25900 = new String[21];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f25900;
            if (i2 >= strArr.length) {
                break;
            }
            C16889 c16889 = f25903;
            String strM38445 = c16889.m38445(i2);
            strArr[i2] = strM38445;
            if (strM38445 == null) {
                strArr[i2] = c16889.m38446(i2);
            }
            if (strArr[i2] == null) {
                strArr[i2] = "<INVALID>";
            }
            i2++;
        }
        C22926 c22926M18956 = new C8173().m18956("\u0004\u0001\u0014L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002#\t\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u00032\t\u0003\u0001\u0003\u0003\u00035\b\u0003\u0003\u00037\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004\f\u0004E\t\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0003\u0004J\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001\u0000\u0006\u0007\u0001\u0000\n\u000b\u0001\u0000\u0013\u0014[\u0000\r\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u001b\u0003\u0004\u0002\u0000\u0013\u001b\u0005\u0002\u0000\u0000\u0014\u001b\u0005\u0003\u0000\u0000\u0015\u001b\u0005\u0004\u0000\u0000\u0016\u001b\u0005\u0005\u0000\u0000\u0017\u001b\u0005\b\u0000\u0000\u0018\u001b\u0005\t\u0000\u0000\u0019\u001b\u0005\u0001\u0000\u0000\u001a\u0012\u0001\u0000\u0000\u0000\u001a\u0013\u0001\u0000\u0000\u0000\u001a\u0014\u0001\u0000\u0000\u0000\u001a\u0015\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d!\u0005\u000e\u0000\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$&\u0007\u0001\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000'7\u0003\b\u0004\u0000(7\u0005\f\u0000\u0000)7\u0005\u000f\u0000\u0000*7\u0005\u0010\u0000\u0000+7\u0005\u0011\u0000\u0000,0\u0005\r\u0000\u0000-/\u0005\u0012\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000035\u0007\u0002\u0000\u000043\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u00006'\u0001\u0000\u0000\u00006(\u0001\u0000\u0000\u00006)\u0001\u0000\u0000\u00006*\u0001\u0000\u0000\u00006+\u0001\u0000\u0000\u00006,\u0001\u0000\u0000\u00007\u0007\u0001\u0000\u0000\u00008I\u0005\u000e\u0000\u00009;\u0005\f\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?C\u0005\r\u0000\u0000@B\u0005\u0012\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0007\u0002\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000I<\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000\u000b\r\u001a!%046<CGI".toCharArray());
        f25901 = c22926M18956;
        f25902 = new C7959[c22926M18956.f72145.size()];
        while (true) {
            C22926 c22926 = f25901;
            if (i >= c22926.f72145.size()) {
                return;
            }
            f25902[i] = new C7959(c22926.m51240(i), i);
            i++;
        }
    }

    @Override // p067l.AbstractC20244
    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo3737() {
        return f25900;
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ᩷ */
    public final C16889 mo3739() {
        return f25903;
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ܳ */
    public final String[] mo6483() {
        return f25905;
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ܽ */
    public final C22926 mo3738() {
        return f25901;
    }

    public C9465(C4150 c4150) {
        super(c4150);
        this.f62583 = new C24525(this, f25901, f25902, f25904);
    }

    /* JADX INFO: renamed from: ᩸ */
    public final C8124 m21985() {
        C8124 c8124 = new C8124(m45731(), this.f32154);
        mo26576((C10856) c8124, 0, 0);
        try {
            m26575(c8124);
            m45728(13);
            this.f32153.mo28299(this);
            int iMo8405 = this.f32157.mo8405(1);
            while ((iMo8405 & (-64)) == 0 && ((1 << iMo8405) & 1022) != 0) {
                m45728(10);
                m21986();
                m45728(15);
                this.f32153.mo28299(this);
                iMo8405 = this.f32157.mo8405(1);
            }
            m45728(16);
            m26586(-1);
            return c8124;
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
            return c8124;
        } finally {
            mo26585();
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m21986() {
        C13489 c13489 = new C13489(m45731(), this.f32154);
        mo26576((C10856) c13489, 2, 1);
        try {
            try {
                m45728(26);
                this.f32153.mo28299(this);
                switch (this.f32157.mo8405(1)) {
                    case 1:
                        m26575(c13489);
                        m45728(25);
                        m26586(1);
                        break;
                    case 2:
                        m26575(c13489);
                        m45728(19);
                        m26586(2);
                        break;
                    case 3:
                        m26575(c13489);
                        m45728(20);
                        m26586(3);
                        break;
                    case 4:
                        m26575(c13489);
                        m45728(21);
                        m26586(4);
                        break;
                    case 5:
                        m26575(c13489);
                        m45728(22);
                        m26586(5);
                        break;
                    case 6:
                    case 7:
                        m26575(c13489);
                        m45728(18);
                        m21984();
                        break;
                    case 8:
                        m26575(c13489);
                        m45728(23);
                        m26586(8);
                        break;
                    case 9:
                        m26575(c13489);
                        m45728(24);
                        m26586(9);
                        break;
                    default:
                        throw new C22256(this);
                }
                mo26585();
            } catch (C4821 e) {
                this.f32153.m41467(this, e);
                this.f32153.mo28298(this, e);
                mo26585();
            }
        } catch (Throwable th) {
            mo26585();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m21984() {
        C24217 c24217 = new C24217(m45731(), this.f32154);
        mo26576((C10856) c24217, 4, 2);
        try {
            m26575(c24217);
            m45728(28);
            int iMo8405 = this.f32157.mo8405(1);
            if (iMo8405 != 6 && iMo8405 != 7) {
                this.f32153.mo28297(this);
            } else {
                if (this.f32157.mo8405(1) == -1) {
                    this.f32151 = true;
                }
                this.f32153.m41465();
                mo11991();
            }
            m45728(29);
            m26586(14);
            m45728(33);
            this.f32153.mo28299(this);
            int iMo8406 = this.f32157.mo8405(1);
            while ((iMo8406 & (-64)) == 0 && ((1 << iMo8406) & 258048) != 0) {
                m45728(30);
                m21982();
                m45728(35);
                this.f32153.mo28299(this);
                iMo8406 = this.f32157.mo8405(1);
            }
            m45728(37);
            this.f32153.mo28299(this);
            int iMo8407 = this.f32157.mo8405(1);
            if (iMo8407 == 10 || iMo8407 == 11) {
                m45728(36);
                int iMo8408 = this.f32157.mo8405(1);
                if (iMo8408 != 10 && iMo8408 != 11) {
                    this.f32153.mo28297(this);
                } else {
                    if (this.f32157.mo8405(1) == -1) {
                        this.f32151 = true;
                    }
                    this.f32153.m41465();
                    mo11991();
                }
            }
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m21982() {
        C15499 c15499 = new C15499(m45731(), this.f32154);
        mo26576((C10856) c15499, 6, 3);
        try {
            try {
                m45728(54);
                this.f32153.mo28299(this);
                switch (this.f32157.mo8405(1)) {
                    case 12:
                        m26575(c15499);
                        m45728(40);
                        m26586(12);
                        break;
                    case 13:
                        m26575(c15499);
                        m45728(44);
                        m26586(13);
                        m45728(48);
                        this.f32153.mo28299(this);
                        int iMo8405 = this.f32157.mo8405(1);
                        while (iMo8405 == 18) {
                            m45728(45);
                            m26586(18);
                            m45728(50);
                            this.f32153.mo28299(this);
                            iMo8405 = this.f32157.mo8405(1);
                        }
                        m45728(52);
                        this.f32153.mo28299(this);
                        int iMo8406 = this.f32157.mo8405(1);
                        if (iMo8406 == 19 || iMo8406 == 20) {
                            m45728(51);
                            int iMo8407 = this.f32157.mo8405(1);
                            if (iMo8407 != 19 && iMo8407 != 20) {
                                this.f32153.mo28297(this);
                            } else {
                                if (this.f32157.mo8405(1) == -1) {
                                    this.f32151 = true;
                                }
                                this.f32153.m41465();
                                mo11991();
                            }
                        }
                        break;
                    case 14:
                        m26575(c15499);
                        m45728(39);
                        m21983();
                        break;
                    case 15:
                        m26575(c15499);
                        m45728(41);
                        m26586(15);
                        break;
                    case 16:
                        m26575(c15499);
                        m45728(42);
                        m26586(16);
                        break;
                    case 17:
                        m26575(c15499);
                        m45728(43);
                        m26586(17);
                        break;
                    default:
                        throw new C22256(this);
                }
                mo26585();
            } catch (C4821 e) {
                this.f32153.m41467(this, e);
                this.f32153.mo28298(this, e);
                mo26585();
            }
        } catch (Throwable th) {
            mo26585();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m21983() {
        C12148 c12148 = new C12148(m45731(), this.f32154);
        mo26576((C10856) c12148, 8, 4);
        try {
            try {
                m26575(c12148);
                m45728(56);
                m26586(14);
                m45728(73);
                this.f32153.mo28299(this);
                if (((C24525) m45729()).mo24904(10, this.f32157, this.f32154) == 1) {
                    m45728(60);
                    this.f32153.mo28299(this);
                    int iMo8405 = this.f32157.mo8405(1);
                    while (iMo8405 == 12) {
                        m45728(57);
                        m26586(12);
                        m45728(62);
                        this.f32153.mo28299(this);
                        iMo8405 = this.f32157.mo8405(1);
                    }
                    m45728(63);
                    m26586(13);
                    m45728(67);
                    this.f32153.mo28299(this);
                    int iMo8406 = this.f32157.mo8405(1);
                    while (iMo8406 == 18) {
                        m45728(64);
                        m26586(18);
                        m45728(69);
                        this.f32153.mo28299(this);
                        iMo8406 = this.f32157.mo8405(1);
                    }
                    m45728(71);
                    this.f32153.mo28299(this);
                    int iMo8407 = this.f32157.mo8405(1);
                    if (iMo8407 == 19 || iMo8407 == 20) {
                        m45728(70);
                        int iMo8408 = this.f32157.mo8405(1);
                        if (iMo8408 != 19 && iMo8408 != 20) {
                            this.f32153.mo28297(this);
                        } else {
                            if (this.f32157.mo8405(1) == -1) {
                                this.f32151 = true;
                            }
                            this.f32153.m41465();
                            mo11991();
                        }
                    }
                }
            } catch (C4821 e) {
                this.f32153.m41467(this, e);
                this.f32153.mo28298(this, e);
            }
        } finally {
            mo26585();
        }
    }
}
