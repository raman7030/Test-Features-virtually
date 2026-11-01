package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.֫۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4101 extends AbstractC5461 {

    /* JADX INFO: renamed from: ֡ */
    public static final C22926 f9030;

    /* JADX INFO: renamed from: ۚ */
    public static final C7959[] f9032;

    /* JADX INFO: renamed from: ֨ */
    public static final C19359 f9031 = new C19359();

    /* JADX INFO: renamed from: ۠ */
    public static final String[] f9033 = {"document", C0226b.f1011d, "object", "member", "array"};

    /* JADX INFO: renamed from: ᩵ */
    public static final C16889 f9035 = new C16889(new String[]{null, null, null, null, null, null, null, null, "'break'", "'case'", "'catch'", "'class'", "'const'", "'continue'", "'debugger'", "'default'", "'delete'", "'do'", "'else'", "'export'", "'extends'", "'finally'", "'for'", "'function'", "'if'", "'import'", "'in'", "'instanceof'", "'new'", "'return'", "'super'", "'switch'", "'this'", "'throw'", "'try'", "'typeof'", "'var'", "'void'", "'while'", "'with'", "'yield'", "'let'", "'static'", "'enum'", "'await'", "'async'", "'of'", "'from'", "'get'", "'set'", "'type'", "'interface'", "'namespace'", "'module'", "'declare'", "'abstract'", "'public'", "'private'", "'protected'", "'readonly'", "'override'", "'accessor'", "'implements'", "'constructor'", "'as'", "'satisfies'", "'asserts'", "'is'", "'keyof'", "'infer'", "'unique'", "'unknown'", "'never'", "'any'", "'number'", "'string'", "'boolean'", "'symbol'", "'object'", "'undefined'", "'global'", "'require'", "'out'", "'using'", "'null'", "'true'", "'false'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "':'", "'...'", "'?.'", "'.'", "'=>'", "'++'", "'--'", "'**='", "'**'", "'&&='", "'||='", "'??='", "'&&'", "'||'", "'??'", "'==='", "'!=='", "'=='", "'!='", "'<='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", "'='", "'?'", "'@'"}, new String[]{null, "Hashbang", "HtmlComment", "LineComment", "BlockComment", "Regex", "StringLiteral", "TemplateStart", "Break", "Case", "Catch", "Class", "Const", "Continue", "Debugger", "Default", "Delete", "Do", "Else", "Export", "Extends", "Finally", "For", "Function", "If", "Import", "In", "Instanceof", "New", "Return", "Super", "Switch", "This", "Throw", "Try", "Typeof", "Var", "Void", "While", "With", "Yield", "Let", "Static", "Enum", "Await", "Async", "Of", "From", "Get", "Set", "Type", "Interface", "Namespace", "Module", "Declare", "Abstract", "Public", "Private", "Protected", "Readonly", "Override", "Accessor", "Implements", "Constructor", "As", "Satisfies", "Asserts", "Is", "Keyof", "Infer", "Unique", "Unknown", "Never", "Any", "Number", "String", "Boolean", "Symbol", "Object", "Undefined", "Global", "Require", "Out", "Using", "Null", "True", "False", "LParen", "RParen", "LBracket", "RBracket", "LBrace", "RBrace", "Semi", "Comma", "Colon", "Ellipsis", "OptionalDot", "Dot", "Arrow", "PlusPlus", "MinusMinus", "PowerAssign", "Power", "AndAssign", "OrAssign", "NullAssign", "And", "Or", "Nullish", "StrictEqual", "StrictNotEqual", "Equal", "NotEqual", "LessEqual", "Less", "Greater", "PlusAssign", "MinusAssign", "MultiplyAssign", "DivideAssign", "ModAssign", "BitAndAssign", "BitOrAssign", "BitXorAssign", "Plus", "Minus", "Multiply", "Divide", "Mod", "BitAnd", "BitOr", "BitXor", "Not", "BitNot", "Assign", "Question", "At", "NumberLiteral", "PrivateIdentifier", "Identifier", "Whitespace", "Unexpected", "TemplateEnd", "TemplateExpression", "TemplateText"}, null);

    /* JADX INFO: renamed from: ܶ */
    @Deprecated
    public static final String[] f9034 = new String[146];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f9034;
            if (i2 >= strArr.length) {
                break;
            }
            C16889 c16889 = f9035;
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
        C22926 c22926M18956 = new C8173().m18956("\u0004\u0001\u0091>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0011\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002\u0003\u0002$\b\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0001\u0004\u0003\u00048\b\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000E\u0000\n\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u0018\u0003\u0004\u0002\u0000\u000e\u0018\u0003\b\u0004\u0000\u000f\u0011\u0005~\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0018\u0005\u008a\u0000\u0000\u0013\u0018\u0005\u0006\u0000\u0000\u0014\u0018\u0005U\u0000\u0000\u0015\u0018\u0005V\u0000\u0000\u0016\u0018\u0005T\u0000\u0000\u0017\r\u0001\u0000\u0000\u0000\u0017\u000e\u0001\u0000\u0000\u0000\u0017\u0010\u0001\u0000\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019%\u0005[\u0000\u0000\u001a\u001f\u0003\u0006\u0003\u0000\u001b\u001c\u0005^\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"$\u0005^\u0000\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%\u001a\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&'\u0001\u0000\u0000\u0000'(\u0005\\\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0005_\u0000\u0000+,\u0003\u0002\u0001\u0000,\u0007\u0001\u0000\u0000\u0000-9\u0005Y\u0000\u0000.3\u0003\u0002\u0001\u0000/0\u0005^\u0000\u000002\u0003\u0002\u0001\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000068\u0005^\u0000\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u00009.\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005Z\u0000\u0000<\t\u0001\u0000\u0000\u0000\b\u0010\u0017\u001f#%379".toCharArray());
        f9030 = c22926M18956;
        f9032 = new C7959[c22926M18956.f72145.size()];
        while (true) {
            C22926 c22926 = f9030;
            if (i >= c22926.f72145.size()) {
                return;
            }
            f9032[i] = new C7959(c22926.m51240(i), i);
            i++;
        }
    }

    @Override // p067l.AbstractC20244
    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo3737() {
        return f9034;
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ᩷ */
    public final C16889 mo3739() {
        return f9035;
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ܳ */
    public final String[] mo6483() {
        return f9033;
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ܽ */
    public final C22926 mo3738() {
        return f9030;
    }

    public C4101(C4150 c4150) {
        super(c4150);
        this.f62583 = new C24525(this, f9030, f9032, f9031);
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final void m8246() {
        C13508 c13508 = new C13508(m45731(), this.f32154);
        mo26576((C10856) c13508, 0, 0);
        try {
            m26575(c13508);
            m45728(10);
            m8243();
            m45728(11);
            m26586(-1);
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final void m8243() {
        C9484 c9484 = new C9484(m45731(), this.f32154);
        mo26576((C10856) c9484, 2, 1);
        try {
            try {
                m45728(23);
                this.f32153.mo28299(this);
                int iMo8405 = this.f32157.mo8405(1);
                if (iMo8405 == 6) {
                    m26575(c9484);
                    m45728(19);
                    m26586(6);
                } else if (iMo8405 == 89) {
                    m26575(c9484);
                    m45728(14);
                    m8244();
                } else if (iMo8405 == 91) {
                    m26575(c9484);
                    m45728(13);
                    m8245();
                } else if (iMo8405 == 126 || iMo8405 == 138) {
                    m26575(c9484);
                    m45728(16);
                    this.f32153.mo28299(this);
                    if (this.f32157.mo8405(1) == 126) {
                        m45728(15);
                        m26586(126);
                    }
                    m45728(18);
                    m26586(138);
                } else {
                    switch (iMo8405) {
                        case 84:
                            m26575(c9484);
                            m45728(22);
                            m26586(84);
                            break;
                        case 85:
                            m26575(c9484);
                            m45728(20);
                            m26586(85);
                            break;
                        case HRSS1373Polynomial.f81792K /* 86 */:
                            m26575(c9484);
                            m45728(21);
                            m26586(86);
                            break;
                        default:
                            throw new C22256(this);
                    }
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

    /* JADX INFO: renamed from: ᩷֫ */
    public final void m8245() {
        C15518 c15518 = new C15518(m45731(), this.f32154);
        mo26576((C10856) c15518, 4, 2);
        try {
            m26575(c15518);
            m45728(25);
            m26586(91);
            m45728(37);
            this.f32153.mo28299(this);
            if (this.f32157.mo8405(1) == 6) {
                m45728(26);
                m8242();
                m45728(31);
                this.f32153.mo28299(this);
                int iMo24904 = ((C24525) m45729()).mo24904(2, this.f32157, this.f32154);
                while (iMo24904 != 2 && iMo24904 != 0) {
                    if (iMo24904 == 1) {
                        m45728(27);
                        m26586(94);
                        m45728(28);
                        m8242();
                    }
                    m45728(33);
                    this.f32153.mo28299(this);
                    iMo24904 = ((C24525) m45729()).mo24904(2, this.f32157, this.f32154);
                }
                m45728(35);
                this.f32153.mo28299(this);
                if (this.f32157.mo8405(1) == 94) {
                    m45728(34);
                    m26586(94);
                }
            }
            m45728(39);
            m26586(92);
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final void m8242() {
        C24236 c24236 = new C24236(m45731(), this.f32154);
        mo26576((C10856) c24236, 6, 3);
        try {
            m26575(c24236);
            m45728(41);
            m26586(6);
            m45728(42);
            m26586(95);
            m45728(43);
            m8243();
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071 A[Catch: all -> 0x00c2, ۖܳ֡ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ۖܳ֡ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00ac A[Catch: all -> 0x00c2, ۖܳ֡ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ۖܳ֡ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0047 A[Catch: all -> 0x00c2, ۖܳ֡ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ۖܳ֡ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX INFO: renamed from: ܳ֫ */
    public final void m8244() {
        int iMo24904;
        C8143 c8143 = new C8143(m45731(), this.f32154);
        mo26576((C10856) c8143, 8, 4);
        try {
            m26575(c8143);
            m45728(45);
            m26586(89);
            m45728(57);
            this.f32153.mo28299(this);
            int iMo8405 = this.f32157.mo8405(1);
            if (iMo8405 != 6) {
                int i = iMo8405 - 84;
                if ((i & (-64)) == 0 && ((1 << i) & 18018796555993255L) != 0) {
                    m45728(46);
                    m8243();
                    m45728(51);
                    this.f32153.mo28299(this);
                    iMo24904 = ((C24525) m45729()).mo24904(5, this.f32157, this.f32154);
                    while (iMo24904 != 2 && iMo24904 != 0) {
                        if (iMo24904 == 1) {
                            m45728(47);
                            m26586(94);
                            m45728(48);
                            m8243();
                        }
                        m45728(53);
                        this.f32153.mo28299(this);
                        iMo24904 = ((C24525) m45729()).mo24904(5, this.f32157, this.f32154);
                    }
                    m45728(55);
                    this.f32153.mo28299(this);
                    if (this.f32157.mo8405(1) == 94) {
                        m45728(54);
                        m26586(94);
                    }
                }
            } else {
                m45728(46);
                m8243();
                m45728(51);
                this.f32153.mo28299(this);
                iMo24904 = ((C24525) m45729()).mo24904(5, this.f32157, this.f32154);
                while (iMo24904 != 2) {
                    if (iMo24904 == 1) {
                        m45728(47);
                        m26586(94);
                        m45728(48);
                        m8243();
                    }
                    m45728(53);
                    this.f32153.mo28299(this);
                    iMo24904 = ((C24525) m45729()).mo24904(5, this.f32157, this.f32154);
                }
                m45728(55);
                this.f32153.mo28299(this);
                if (this.f32157.mo8405(1) == 94) {
                    m45728(54);
                    m26586(94);
                }
            }
            m45728(59);
            m26586(90);
        } catch (C4821 e) {
            this.f32153.m41467(this, e);
            this.f32153.mo28298(this, e);
        } finally {
            mo26585();
        }
    }
}
