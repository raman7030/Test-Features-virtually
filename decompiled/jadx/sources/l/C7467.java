package l;

import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.۟۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7467 extends AbstractC9637 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C21631 f22988;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C5883[] f22989;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C17878 f22991 = new C17878();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final String[] f22992 = {"document", "part", "tag", "tagItem", AnnotationHandler.ATTRIBUTE};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C15279 f22990 = new C15279(new String[]{null, null, "'<!--'", "'<![CDATA['", "'<!'", null, null, null, null, null, "'/>'", null, null, "'='", null, "'/'"}, new String[]{null, "RawText", "Comment", "Cdata", "Declaration", "Processing", "EndOpen", "TagOpen", "Text", "Other", "SelfClose", "TagClose", "TagSpace", "Equals", "TagWord", "Slash", "BrokenQuoted", "TagOther", "ValueSpace", "QuotedValue", "BareValue"}, null);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f22987 = new String[21];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f22987;
            if (i2 >= strArr.length) {
                break;
            }
            C15279 c15279 = f22990;
            String strM36284 = c15279.m36284(i2);
            strArr[i2] = strM36284;
            if (strM36284 == null) {
                strArr[i2] = c15279.m36285(i2);
            }
            if (strArr[i2] == null) {
                strArr[i2] = "<INVALID>";
            }
            i2++;
        }
        C21631 c21631M17025 = new C6108().m17025("\u0004\u0001\u0014L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002#\t\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u00032\t\u0003\u0001\u0003\u0003\u00035\b\u0003\u0003\u00037\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004\f\u0004E\t\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0003\u0004J\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001\u0000\u0006\u0007\u0001\u0000\n\u000b\u0001\u0000\u0013\u0014[\u0000\r\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u001b\u0003\u0004\u0002\u0000\u0013\u001b\u0005\u0002\u0000\u0000\u0014\u001b\u0005\u0003\u0000\u0000\u0015\u001b\u0005\u0004\u0000\u0000\u0016\u001b\u0005\u0005\u0000\u0000\u0017\u001b\u0005\b\u0000\u0000\u0018\u001b\u0005\t\u0000\u0000\u0019\u001b\u0005\u0001\u0000\u0000\u001a\u0012\u0001\u0000\u0000\u0000\u001a\u0013\u0001\u0000\u0000\u0000\u001a\u0014\u0001\u0000\u0000\u0000\u001a\u0015\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d!\u0005\u000e\u0000\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$&\u0007\u0001\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000'7\u0003\b\u0004\u0000(7\u0005\f\u0000\u0000)7\u0005\u000f\u0000\u0000*7\u0005\u0010\u0000\u0000+7\u0005\u0011\u0000\u0000,0\u0005\r\u0000\u0000-/\u0005\u0012\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000035\u0007\u0002\u0000\u000043\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u00006'\u0001\u0000\u0000\u00006(\u0001\u0000\u0000\u00006)\u0001\u0000\u0000\u00006*\u0001\u0000\u0000\u00006+\u0001\u0000\u0000\u00006,\u0001\u0000\u0000\u00007\u0007\u0001\u0000\u0000\u00008I\u0005\u000e\u0000\u00009;\u0005\f\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?C\u0005\r\u0000\u0000@B\u0005\u0012\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0007\u0002\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000I<\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000\u000b\r\u001a!%046<CGI".toCharArray());
        f22988 = c21631M17025;
        f22989 = new C5883[c21631M17025.f69442.size()];
        while (true) {
            C21631 c21631 = f22988;
            if (i >= c21631.f69442.size()) {
                return;
            }
            f22989[i] = new C5883(c21631.m48892(i), i);
            i++;
        }
    }

    @Override // l.AbstractC18809
    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo1329() {
        return f22987;
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ᩷ */
    public final C15279 mo1331() {
        return f22990;
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ܳ */
    public final String[] mo4239() {
        return f22992;
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ܽ */
    public final C21631 mo1330() {
        return f22988;
    }

    public C7467(C1875 c1875) {
        super(c1875);
        this.f59356 = new C23313(this, f22988, f22989, f22991);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6056 m20010() {
        C6056 c6056 = new C6056(m43462(), this.f29205);
        mo24562((C8931) c6056, 0, 0);
        try {
            m24561(c6056);
            m43459(13);
            this.f29204.mo26270(this);
            int iMo6203 = this.f29208.mo6203(1);
            while ((iMo6203 & (-64)) == 0 && ((1 << iMo6203) & 1022) != 0) {
                m43459(10);
                m20011();
                m43459(15);
                this.f29204.mo26270(this);
                iMo6203 = this.f29208.mo6203(1);
            }
            m43459(16);
            m24572(-1);
            return c6056;
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
            return c6056;
        } finally {
            mo24571();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m20011() {
        C11701 c11701 = new C11701(m43462(), this.f29205);
        mo24562((C8931) c11701, 2, 1);
        try {
            try {
                m43459(26);
                this.f29204.mo26270(this);
                switch (this.f29208.mo6203(1)) {
                    case 1:
                        m24561(c11701);
                        m43459(25);
                        m24572(1);
                        break;
                    case 2:
                        m24561(c11701);
                        m43459(19);
                        m24572(2);
                        break;
                    case 3:
                        m24561(c11701);
                        m43459(20);
                        m24572(3);
                        break;
                    case 4:
                        m24561(c11701);
                        m43459(21);
                        m24572(4);
                        break;
                    case 5:
                        m24561(c11701);
                        m43459(22);
                        m24572(5);
                        break;
                    case 6:
                    case 7:
                        m24561(c11701);
                        m43459(18);
                        m20009();
                        break;
                    case 8:
                        m24561(c11701);
                        m43459(23);
                        m24572(8);
                        break;
                    case 9:
                        m24561(c11701);
                        m43459(24);
                        m24572(9);
                        break;
                    default:
                        throw new C20926(this);
                }
                mo24571();
            } catch (C2581 e) {
                this.f29204.m39231(this, e);
                this.f29204.mo26269(this, e);
                mo24571();
            }
        } catch (Throwable th) {
            mo24571();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m20009() {
        C22989 c22989 = new C22989(m43462(), this.f29205);
        mo24562((C8931) c22989, 4, 2);
        try {
            m24561(c22989);
            m43459(28);
            int iMo6203 = this.f29208.mo6203(1);
            if (iMo6203 != 6 && iMo6203 != 7) {
                this.f29204.mo26268(this);
            } else {
                if (this.f29208.mo6203(1) == -1) {
                    this.f29202 = true;
                }
                this.f29204.m39229();
                mo9958();
            }
            m43459(29);
            m24572(14);
            m43459(33);
            this.f29204.mo26270(this);
            int iMo6204 = this.f29208.mo6203(1);
            while ((iMo6204 & (-64)) == 0 && ((1 << iMo6204) & 258048) != 0) {
                m43459(30);
                m20007();
                m43459(35);
                this.f29204.mo26270(this);
                iMo6204 = this.f29208.mo6203(1);
            }
            m43459(37);
            this.f29204.mo26270(this);
            int iMo6205 = this.f29208.mo6203(1);
            if (iMo6205 == 10 || iMo6205 == 11) {
                m43459(36);
                int iMo6206 = this.f29208.mo6203(1);
                if (iMo6206 != 10 && iMo6206 != 11) {
                    this.f29204.mo26268(this);
                } else {
                    if (this.f29208.mo6203(1) == -1) {
                        this.f29202 = true;
                    }
                    this.f29204.m39229();
                    mo9958();
                }
            }
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20007() {
        C13816 c13816 = new C13816(m43462(), this.f29205);
        mo24562((C8931) c13816, 6, 3);
        try {
            try {
                m43459(54);
                this.f29204.mo26270(this);
                switch (this.f29208.mo6203(1)) {
                    case 12:
                        m24561(c13816);
                        m43459(40);
                        m24572(12);
                        break;
                    case 13:
                        m24561(c13816);
                        m43459(44);
                        m24572(13);
                        m43459(48);
                        this.f29204.mo26270(this);
                        int iMo6203 = this.f29208.mo6203(1);
                        while (iMo6203 == 18) {
                            m43459(45);
                            m24572(18);
                            m43459(50);
                            this.f29204.mo26270(this);
                            iMo6203 = this.f29208.mo6203(1);
                        }
                        m43459(52);
                        this.f29204.mo26270(this);
                        int iMo6204 = this.f29208.mo6203(1);
                        if (iMo6204 == 19 || iMo6204 == 20) {
                            m43459(51);
                            int iMo6205 = this.f29208.mo6203(1);
                            if (iMo6205 != 19 && iMo6205 != 20) {
                                this.f29204.mo26268(this);
                            } else {
                                if (this.f29208.mo6203(1) == -1) {
                                    this.f29202 = true;
                                }
                                this.f29204.m39229();
                                mo9958();
                            }
                        }
                        break;
                    case 14:
                        m24561(c13816);
                        m43459(39);
                        m20008();
                        break;
                    case 15:
                        m24561(c13816);
                        m43459(41);
                        m24572(15);
                        break;
                    case 16:
                        m24561(c13816);
                        m43459(42);
                        m24572(16);
                        break;
                    case 17:
                        m24561(c13816);
                        m43459(43);
                        m24572(17);
                        break;
                    default:
                        throw new C20926(this);
                }
                mo24571();
            } catch (C2581 e) {
                this.f29204.m39231(this, e);
                this.f29204.mo26269(this, e);
                mo24571();
            }
        } catch (Throwable th) {
            mo24571();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m20008() {
        C10290 c10290 = new C10290(m43462(), this.f29205);
        mo24562((C8931) c10290, 8, 4);
        try {
            try {
                m24561(c10290);
                m43459(56);
                m24572(14);
                m43459(73);
                this.f29204.mo26270(this);
                if (((C23313) m43460()).mo22933(10, this.f29208, this.f29205) == 1) {
                    m43459(60);
                    this.f29204.mo26270(this);
                    int iMo6203 = this.f29208.mo6203(1);
                    while (iMo6203 == 12) {
                        m43459(57);
                        m24572(12);
                        m43459(62);
                        this.f29204.mo26270(this);
                        iMo6203 = this.f29208.mo6203(1);
                    }
                    m43459(63);
                    m24572(13);
                    m43459(67);
                    this.f29204.mo26270(this);
                    int iMo6204 = this.f29208.mo6203(1);
                    while (iMo6204 == 18) {
                        m43459(64);
                        m24572(18);
                        m43459(69);
                        this.f29204.mo26270(this);
                        iMo6204 = this.f29208.mo6203(1);
                    }
                    m43459(71);
                    this.f29204.mo26270(this);
                    int iMo6205 = this.f29208.mo6203(1);
                    if (iMo6205 == 19 || iMo6205 == 20) {
                        m43459(70);
                        int iMo6206 = this.f29208.mo6203(1);
                        if (iMo6206 != 19 && iMo6206 != 20) {
                            this.f29204.mo26268(this);
                        } else {
                            if (this.f29208.mo6203(1) == -1) {
                                this.f29202 = true;
                            }
                            this.f29204.m39229();
                            mo9958();
                        }
                    }
                }
            } catch (C2581 e) {
                this.f29204.m39231(this, e);
                this.f29204.mo26269(this, e);
            }
        } finally {
            mo24571();
        }
    }
}
