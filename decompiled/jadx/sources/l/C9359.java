package l;

import com.rosan.dhizuku.shared.DhizukuVariables;

/* JADX INFO: renamed from: l.ۢۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6QF */
/* JADX INFO: loaded from: classes4.dex */
public final class C9359 extends AbstractC9637 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C21631 f28415;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C5883[] f28416;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C17878 f28418 = new C17878();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final String[] f28419 = {"stylesheet", "declarationList", "componentValues", "orphanCloser", DhizukuVariables.PARAM_COMPONENT, "block", "function", "parentheses", "brackets", "atom"};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C15279 f28417 = new C15279(new String[]{null, null, null, null, "'<!--'", "'-->'", null, null, null, null, null, null, null, null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "':'", "';'", "','"}, new String[]{null, "Url", "Comment", "Whitespace", "Cdo", "Cdc", "StringLiteral", "BadString", "Function", "AtKeyword", "Hash", "Dimension", "Percentage", "Number", "Ident", "LBrace", "RBrace", "LBracket", "RBracket", "LParen", "RParen", "Colon", "Semicolon", "Comma", "Delim"}, null);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f28414 = new String[25];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f28414;
            if (i2 >= strArr.length) {
                break;
            }
            C15279 c15279 = f28417;
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
        C21631 c21631M17025 = new C6108().m17025("\u0004\u0001\u0018_\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005\u0000\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002\n\u0002\f\u0002,\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00047\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005;\b\u0005\n\u0005\f\u0005>\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007M\b\u0007\n\u0007\f\u0007P\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bV\b\b\n\b\f\bY\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0003\u0000\u0010\u0010\u0012\u0012\u0014\u0014\u0002\u0000\b\b\u000f\u0014b\u0000\u0018\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010S\u0001\u0000\u0000\u0000\u0012\\\u0001\u0000\u0000\u0000\u0014\u0017\u0003\b\u0004\u0000\u0015\u0017\u0003\u0006\u0003\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d \u0003\b\u0004\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0003\u0001\u0000\u0000\u0000&)\u0003\b\u0004\u0000')\u0003\u0006\u0003\u0000(&\u0001\u0000\u0000\u0000('\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001.\u0005\u0001\u0000\u0000\u0000/0\u0007\u0000\u0000\u00000\u0007\u0001\u0000\u0000\u000017\u0003\n\u0005\u000027\u0003\f\u0006\u000037\u0003\u000e\u0007\u000047\u0003\u0010\b\u000057\u0003\u0012\t\u000061\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u00008<\u0005\u000f\u0000\u00009;\u0003\b\u0004\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005\u0010\u0000\u0000@\u000b\u0001\u0000\u0000\u0000AE\u0005\b\u0000\u0000BD\u0003\b\u0004\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0014\u0000\u0000I\r\u0001\u0000\u0000\u0000JN\u0005\u0013\u0000\u0000KM\u0003\b\u0004\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0014\u0000\u0000R\u000f\u0001\u0000\u0000\u0000SW\u0005\u0011\u0000\u0000TV\u0003\b\u0004\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u0012\u0000\u0000[\u0011\u0001\u0000\u0000\u0000\\]\b\u0001\u0000\u0000]\u0013\u0001\u0000\u0000\u0000\u000b\u0016\u0018\u001f!(*6<ENW".toCharArray());
        f28415 = c21631M17025;
        f28416 = new C5883[c21631M17025.f69442.size()];
        while (true) {
            C21631 c21631 = f28415;
            if (i >= c21631.f69442.size()) {
                return;
            }
            f28416[i] = new C5883(c21631.m48892(i), i);
            i++;
        }
    }

    @Override // l.AbstractC18809
    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo1329() {
        return f28414;
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ᩷ */
    public final C15279 mo1331() {
        return f28417;
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ܳ */
    public final String[] mo4239() {
        return f28419;
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ܽ */
    public final C21631 mo1330() {
        return f28415;
    }

    public C9359(C1875 c1875) {
        super(c1875);
        this.f59356 = new C23313(this, f28415, f28416, f28418);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C20648 m24172() {
        C20648 c20648 = new C20648(m43462(), this.f29205);
        mo24562((C8931) c20648, 0, 0);
        try {
            try {
                m24561(c20648);
                m43459(24);
                this.f29204.mo26270(this);
                int iMo6203 = this.f29208.mo6203(1);
                while ((iMo6203 & (-64)) == 0 && ((1 << iMo6203) & 33554430) != 0) {
                    m43459(22);
                    this.f29204.mo26270(this);
                    switch (this.f29208.mo6203(1)) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 17:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            m43459(20);
                            m24177();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m43459(21);
                            m24174();
                            break;
                        default:
                            throw new C20926(this);
                    }
                    m43459(26);
                    this.f29204.mo26270(this);
                    iMo6203 = this.f29208.mo6203(1);
                }
                m43459(27);
                m24572(-1);
                mo24571();
                return c20648;
            } catch (C2581 e) {
                this.f29204.m39231(this, e);
                this.f29204.mo26269(this, e);
                mo24571();
                return c20648;
            }
        } catch (Throwable th) {
            mo24571();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17119 m24170() {
        C17119 c17119 = new C17119(m43462(), this.f29205);
        mo24562((C8931) c17119, 2, 1);
        try {
            try {
                m24561(c17119);
                m43459(33);
                this.f29204.mo26270(this);
                int iMo6203 = this.f29208.mo6203(1);
                while ((iMo6203 & (-64)) == 0 && ((1 << iMo6203) & 33554430) != 0) {
                    m43459(31);
                    this.f29204.mo26270(this);
                    switch (this.f29208.mo6203(1)) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 17:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            m43459(29);
                            m24177();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m43459(30);
                            m24174();
                            break;
                        default:
                            throw new C20926(this);
                    }
                    m43459(35);
                    this.f29204.mo26270(this);
                    iMo6203 = this.f29208.mo6203(1);
                }
                m43459(36);
                m24572(-1);
                mo24571();
                return c17119;
            } catch (C2581 e) {
                this.f29204.m39231(this, e);
                this.f29204.mo26269(this, e);
                mo24571();
                return c17119;
            }
        } catch (Throwable th) {
            mo24571();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17825 m24171() {
        C17825 c17825 = new C17825(m43462(), this.f29205);
        mo24562((C8931) c17825, 4, 2);
        try {
            try {
                m24561(c17825);
                m43459(42);
                this.f29204.mo26270(this);
                int iMo6203 = this.f29208.mo6203(1);
                while ((iMo6203 & (-64)) == 0 && ((1 << iMo6203) & 33554430) != 0) {
                    m43459(40);
                    this.f29204.mo26270(this);
                    switch (this.f29208.mo6203(1)) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 17:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            m43459(38);
                            m24177();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m43459(39);
                            m24174();
                            break;
                        default:
                            throw new C20926(this);
                    }
                    m43459(44);
                    this.f29204.mo26270(this);
                    iMo6203 = this.f29208.mo6203(1);
                }
                m43459(45);
                m24572(-1);
                mo24571();
                return c17825;
            } catch (C2581 e) {
                this.f29204.m39231(this, e);
                this.f29204.mo26269(this, e);
                mo24571();
                return c17825;
            }
        } catch (Throwable th) {
            mo24571();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m24174() {
        C23469 c23469 = new C23469(m43462(), this.f29205);
        mo24562((C8931) c23469, 6, 3);
        try {
            m24561(c23469);
            m43459(47);
            int iMo6203 = this.f29208.mo6203(1);
            if ((iMo6203 & (-64)) != 0 || ((1 << iMo6203) & 1376256) == 0) {
                this.f29204.mo26268(this);
            } else {
                if (this.f29208.mo6203(1) == -1) {
                    this.f29202 = true;
                }
                this.f29204.m39229();
                mo9958();
            }
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m24177() {
        C16413 c16413 = new C16413(m43462(), this.f29205);
        mo24562((C8931) c16413, 8, 4);
        try {
            try {
                m43459(54);
                this.f29204.mo26270(this);
                switch (this.f29208.mo6203(1)) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        m24561(c16413);
                        m43459(53);
                        m24176();
                        break;
                    case 8:
                        m24561(c16413);
                        m43459(50);
                        m24175();
                        break;
                    case 15:
                        m24561(c16413);
                        m43459(49);
                        m24178();
                        break;
                    case 16:
                    case 18:
                    case 20:
                    default:
                        throw new C20926(this);
                    case 17:
                        m24561(c16413);
                        m43459(52);
                        m24179();
                        break;
                    case 19:
                        m24561(c16413);
                        m43459(51);
                        m24173();
                        break;
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24178() {
        C1597 c1597 = new C1597(m43462(), this.f29205);
        mo24562((C8931) c1597, 10, 5);
        try {
            m24561(c1597);
            m43459(56);
            m24572(15);
            m43459(60);
            this.f29204.mo26270(this);
            int iMo6203 = this.f29208.mo6203(1);
            while ((iMo6203 & (-64)) == 0 && ((1 << iMo6203) & 32178174) != 0) {
                m43459(57);
                m24177();
                m43459(62);
                this.f29204.mo26270(this);
                iMo6203 = this.f29208.mo6203(1);
            }
            m43459(63);
            m24572(16);
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m24175() {
        C14296 c14296 = new C14296(m43462(), this.f29205);
        mo24562((C8931) c14296, 12, 6);
        try {
            m24561(c14296);
            m43459(65);
            m24572(8);
            m43459(69);
            this.f29204.mo26270(this);
            int iMo6203 = this.f29208.mo6203(1);
            while ((iMo6203 & (-64)) == 0 && ((1 << iMo6203) & 32178174) != 0) {
                m43459(66);
                m24177();
                m43459(71);
                this.f29204.mo26270(this);
                iMo6203 = this.f29208.mo6203(1);
            }
            m43459(72);
            m24572(20);
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m24173() {
        C6536 c6536 = new C6536(m43462(), this.f29205);
        mo24562((C8931) c6536, 14, 7);
        try {
            m24561(c6536);
            m43459(74);
            m24572(19);
            m43459(78);
            this.f29204.mo26270(this);
            int iMo6203 = this.f29208.mo6203(1);
            while ((iMo6203 & (-64)) == 0 && ((1 << iMo6203) & 32178174) != 0) {
                m43459(75);
                m24177();
                m43459(80);
                this.f29204.mo26270(this);
                iMo6203 = this.f29208.mo6203(1);
            }
            m43459(81);
            m24572(20);
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24179() {
        C10770 c10770 = new C10770(m43462(), this.f29205);
        mo24562((C8931) c10770, 16, 8);
        try {
            m24561(c10770);
            m43459(83);
            m24572(17);
            m43459(87);
            this.f29204.mo26270(this);
            int iMo6203 = this.f29208.mo6203(1);
            while ((iMo6203 & (-64)) == 0 && ((1 << iMo6203) & 32178174) != 0) {
                m43459(84);
                m24177();
                m43459(89);
                this.f29204.mo26270(this);
                iMo6203 = this.f29208.mo6203(1);
            }
            m43459(90);
            m24572(18);
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m24176() {
        C7696 c7696 = new C7696(m43462(), this.f29205);
        mo24562((C8931) c7696, 18, 9);
        try {
            m24561(c7696);
            m43459(92);
            int iMo6203 = this.f29208.mo6203(1);
            if (iMo6203 <= 0 || ((iMo6203 & (-64)) == 0 && ((1 << iMo6203) & 2064640) != 0)) {
                this.f29204.mo26268(this);
            } else {
                if (this.f29208.mo6203(1) == -1) {
                    this.f29202 = true;
                }
                this.f29204.m39229();
                mo9958();
            }
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }
}
