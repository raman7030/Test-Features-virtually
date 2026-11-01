package p067l;

import com.rosan.dhizuku.shared.DhizukuVariables;

/* JADX INFO: renamed from: l.ۢۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6QF */
/* JADX INFO: loaded from: classes4.dex */
public final class C11263 extends AbstractC11527 {

    /* JADX INFO: renamed from: ۖ */
    public static final C22926 f31364;

    /* JADX INFO: renamed from: ۘ */
    public static final C7959[] f31365;

    /* JADX INFO: renamed from: ᩴ */
    public static final C19359 f31367 = new C19359();

    /* JADX INFO: renamed from: ᩵ */
    public static final String[] f31368 = {"stylesheet", "declarationList", "componentValues", "orphanCloser", DhizukuVariables.PARAM_COMPONENT, "block", "function", "parentheses", "brackets", "atom"};

    /* JADX INFO: renamed from: ܺ */
    public static final C16889 f31366 = new C16889(new String[]{null, null, null, null, "'<!--'", "'-->'", null, null, null, null, null, null, null, null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "':'", "';'", "','"}, new String[]{null, "Url", "Comment", "Whitespace", "Cdo", "Cdc", "StringLiteral", "BadString", "Function", "AtKeyword", "Hash", "Dimension", "Percentage", "Number", "Ident", "LBrace", "RBrace", "LBracket", "RBracket", "LParen", "RParen", "Colon", "Semicolon", "Comma", "Delim"}, null);

    /* JADX INFO: renamed from: ֡ */
    @Deprecated
    public static final String[] f31363 = new String[25];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f31363;
            if (i2 >= strArr.length) {
                break;
            }
            C16889 c16889 = f31366;
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
        C22926 c22926M18956 = new C8173().m18956("\u0004\u0001\u0018_\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005\u0000\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002\n\u0002\f\u0002,\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00047\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005;\b\u0005\n\u0005\f\u0005>\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007M\b\u0007\n\u0007\f\u0007P\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bV\b\b\n\b\f\bY\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0003\u0000\u0010\u0010\u0012\u0012\u0014\u0014\u0002\u0000\b\b\u000f\u0014b\u0000\u0018\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010S\u0001\u0000\u0000\u0000\u0012\\\u0001\u0000\u0000\u0000\u0014\u0017\u0003\b\u0004\u0000\u0015\u0017\u0003\u0006\u0003\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d \u0003\b\u0004\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0003\u0001\u0000\u0000\u0000&)\u0003\b\u0004\u0000')\u0003\u0006\u0003\u0000(&\u0001\u0000\u0000\u0000('\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001.\u0005\u0001\u0000\u0000\u0000/0\u0007\u0000\u0000\u00000\u0007\u0001\u0000\u0000\u000017\u0003\n\u0005\u000027\u0003\f\u0006\u000037\u0003\u000e\u0007\u000047\u0003\u0010\b\u000057\u0003\u0012\t\u000061\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u00008<\u0005\u000f\u0000\u00009;\u0003\b\u0004\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005\u0010\u0000\u0000@\u000b\u0001\u0000\u0000\u0000AE\u0005\b\u0000\u0000BD\u0003\b\u0004\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0014\u0000\u0000I\r\u0001\u0000\u0000\u0000JN\u0005\u0013\u0000\u0000KM\u0003\b\u0004\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0014\u0000\u0000R\u000f\u0001\u0000\u0000\u0000SW\u0005\u0011\u0000\u0000TV\u0003\b\u0004\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u0012\u0000\u0000[\u0011\u0001\u0000\u0000\u0000\\]\b\u0001\u0000\u0000]\u0013\u0001\u0000\u0000\u0000\u000b\u0016\u0018\u001f!(*6<ENW".toCharArray());
        f31364 = c22926M18956;
        f31365 = new C7959[c22926M18956.f72145.size()];
        while (true) {
            C22926 c22926 = f31364;
            if (i >= c22926.f72145.size()) {
                return;
            }
            f31365[i] = new C7959(c22926.m51240(i), i);
            i++;
        }
    }

    @Override // p067l.AbstractC20244
    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo3737() {
        return f31363;
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ᩷ */
    public final C16889 mo3739() {
        return f31366;
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ܳ */
    public final String[] mo6483() {
        return f31368;
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ܽ */
    public final C22926 mo3738() {
        return f31364;
    }

    public C11263(C4150 c4150) {
        super(c4150);
        this.f62583 = new C24525(this, f31364, f31365, f31367);
    }

    /* JADX INFO: renamed from: ۛ */
    public final C21992 m26182() {
        C21992 c21992 = new C21992(m45731(), this.f32154);
        mo26576((C10856) c21992, 0, 0);
        try {
            try {
                m26575(c21992);
                m45728(24);
                this.f32153.mo28299(this);
                int iMo8405 = this.f32157.mo8405(1);
                while ((iMo8405 & (-64)) == 0 && ((1 << iMo8405) & 33554430) != 0) {
                    m45728(22);
                    this.f32153.mo28299(this);
                    switch (this.f32157.mo8405(1)) {
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
                            m45728(20);
                            m26187();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m45728(21);
                            m26184();
                            break;
                        default:
                            throw new C22256(this);
                    }
                    m45728(26);
                    this.f32153.mo28299(this);
                    iMo8405 = this.f32157.mo8405(1);
                }
                m45728(27);
                m26586(-1);
                mo26585();
                return c21992;
            } catch (C4821 e) {
                this.f32153.m41467(this, e);
                this.f32153.mo28298(this, e);
                mo26585();
                return c21992;
            }
        } catch (Throwable th) {
            mo26585();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۗ */
    public final C18638 m26180() {
        C18638 c18638 = new C18638(m45731(), this.f32154);
        mo26576((C10856) c18638, 2, 1);
        try {
            try {
                m26575(c18638);
                m45728(33);
                this.f32153.mo28299(this);
                int iMo8405 = this.f32157.mo8405(1);
                while ((iMo8405 & (-64)) == 0 && ((1 << iMo8405) & 33554430) != 0) {
                    m45728(31);
                    this.f32153.mo28299(this);
                    switch (this.f32157.mo8405(1)) {
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
                            m45728(29);
                            m26187();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m45728(30);
                            m26184();
                            break;
                        default:
                            throw new C22256(this);
                    }
                    m45728(35);
                    this.f32153.mo28299(this);
                    iMo8405 = this.f32157.mo8405(1);
                }
                m45728(36);
                m26586(-1);
                mo26585();
                return c18638;
            } catch (C4821 e) {
                this.f32153.m41467(this, e);
                this.f32153.mo28298(this, e);
                mo26585();
                return c18638;
            }
        } catch (Throwable th) {
            mo26585();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public final C19309 m26181() {
        C19309 c19309 = new C19309(m45731(), this.f32154);
        mo26576((C10856) c19309, 4, 2);
        try {
            try {
                m26575(c19309);
                m45728(42);
                this.f32153.mo28299(this);
                int iMo8405 = this.f32157.mo8405(1);
                while ((iMo8405 & (-64)) == 0 && ((1 << iMo8405) & 33554430) != 0) {
                    m45728(40);
                    this.f32153.mo28299(this);
                    switch (this.f32157.mo8405(1)) {
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
                            m45728(38);
                            m26187();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m45728(39);
                            m26184();
                            break;
                        default:
                            throw new C22256(this);
                    }
                    m45728(44);
                    this.f32153.mo28299(this);
                    iMo8405 = this.f32157.mo8405(1);
                }
                m45728(45);
                m26586(-1);
                mo26585();
                return c19309;
            } catch (C4821 e) {
                this.f32153.m41467(this, e);
                this.f32153.mo28298(this, e);
                mo26585();
                return c19309;
            }
        } catch (Throwable th) {
            mo26585();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۫ */
    public final void m26184() {
        C24673 c24673 = new C24673(m45731(), this.f32154);
        mo26576((C10856) c24673, 6, 3);
        try {
            m26575(c24673);
            m45728(47);
            int iMo8405 = this.f32157.mo8405(1);
            if ((iMo8405 & (-64)) != 0 || ((1 << iMo8405) & 1376256) == 0) {
                this.f32153.mo28297(this);
            } else {
                if (this.f32157.mo8405(1) == -1) {
                    this.f32151 = true;
                }
                this.f32153.m41465();
                mo11991();
            }
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m26187() {
        C17967 c17967 = new C17967(m45731(), this.f32154);
        mo26576((C10856) c17967, 8, 4);
        try {
            try {
                m45728(54);
                this.f32153.mo28299(this);
                switch (this.f32157.mo8405(1)) {
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
                        m26575(c17967);
                        m45728(53);
                        m26186();
                        break;
                    case 8:
                        m26575(c17967);
                        m45728(50);
                        m26185();
                        break;
                    case 15:
                        m26575(c17967);
                        m45728(49);
                        m26188();
                        break;
                    case 16:
                    case 18:
                    case 20:
                    default:
                        throw new C22256(this);
                    case 17:
                        m26575(c17967);
                        m45728(52);
                        m26189();
                        break;
                    case 19:
                        m26575(c17967);
                        m45728(51);
                        m26183();
                        break;
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

    /* JADX INFO: renamed from: ᩸ */
    public final void m26188() {
        C3886 c3886 = new C3886(m45731(), this.f32154);
        mo26576((C10856) c3886, 10, 5);
        try {
            m26575(c3886);
            m45728(56);
            m26586(15);
            m45728(60);
            this.f32153.mo28299(this);
            int iMo8405 = this.f32157.mo8405(1);
            while ((iMo8405 & (-64)) == 0 && ((1 << iMo8405) & 32178174) != 0) {
                m45728(57);
                m26187();
                m45728(62);
                this.f32153.mo28299(this);
                iMo8405 = this.f32157.mo8405(1);
            }
            m45728(63);
            m26586(16);
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }

    /* JADX INFO: renamed from: ۬ */
    public final void m26185() {
        C15955 c15955 = new C15955(m45731(), this.f32154);
        mo26576((C10856) c15955, 12, 6);
        try {
            m26575(c15955);
            m45728(65);
            m26586(8);
            m45728(69);
            this.f32153.mo28299(this);
            int iMo8405 = this.f32157.mo8405(1);
            while ((iMo8405 & (-64)) == 0 && ((1 << iMo8405) & 32178174) != 0) {
                m45728(66);
                m26187();
                m45728(71);
                this.f32153.mo28299(this);
                iMo8405 = this.f32157.mo8405(1);
            }
            m45728(72);
            m26586(20);
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public final void m26183() {
        C8580 c8580 = new C8580(m45731(), this.f32154);
        mo26576((C10856) c8580, 14, 7);
        try {
            m26575(c8580);
            m45728(74);
            m26586(19);
            m45728(78);
            this.f32153.mo28299(this);
            int iMo8405 = this.f32157.mo8405(1);
            while ((iMo8405 & (-64)) == 0 && ((1 << iMo8405) & 32178174) != 0) {
                m45728(75);
                m26187();
                m45728(80);
                this.f32153.mo28299(this);
                iMo8405 = this.f32157.mo8405(1);
            }
            m45728(81);
            m26586(20);
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m26189() {
        C12604 c12604 = new C12604(m45731(), this.f32154);
        mo26576((C10856) c12604, 16, 8);
        try {
            m26575(c12604);
            m45728(83);
            m26586(17);
            m45728(87);
            this.f32153.mo28299(this);
            int iMo8405 = this.f32157.mo8405(1);
            while ((iMo8405 & (-64)) == 0 && ((1 << iMo8405) & 32178174) != 0) {
                m45728(84);
                m26187();
                m45728(89);
                this.f32153.mo28299(this);
                iMo8405 = this.f32157.mo8405(1);
            }
            m45728(90);
            m26586(18);
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m26186() {
        C9683 c9683 = new C9683(m45731(), this.f32154);
        mo26576((C10856) c9683, 18, 9);
        try {
            m26575(c9683);
            m45728(92);
            int iMo8405 = this.f32157.mo8405(1);
            if (iMo8405 <= 0 || ((iMo8405 & (-64)) == 0 && ((1 << iMo8405) & 2064640) != 0)) {
                this.f32153.mo28297(this);
            } else {
                if (this.f32157.mo8405(1) == -1) {
                    this.f32151 = true;
                }
                this.f32153.m41465();
                mo11991();
            }
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }
}
