package l;

import com.alipay.sdk.m.u0.b;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.֫۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1823 extends AbstractC3254 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C21631 f6250;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C5883[] f6252;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C17878 f6251 = new C17878();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String[] f6253 = {"document", b.d, "object", "member", "array"};

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C15279 f6255 = new C15279(new String[]{null, null, null, null, null, null, null, null, "'break'", "'case'", "'catch'", "'class'", "'const'", "'continue'", "'debugger'", "'default'", "'delete'", "'do'", "'else'", "'export'", "'extends'", "'finally'", "'for'", "'function'", "'if'", "'import'", "'in'", "'instanceof'", "'new'", "'return'", "'super'", "'switch'", "'this'", "'throw'", "'try'", "'typeof'", "'var'", "'void'", "'while'", "'with'", "'yield'", "'let'", "'static'", "'enum'", "'await'", "'async'", "'of'", "'from'", "'get'", "'set'", "'type'", "'interface'", "'namespace'", "'module'", "'declare'", "'abstract'", "'public'", "'private'", "'protected'", "'readonly'", "'override'", "'accessor'", "'implements'", "'constructor'", "'as'", "'satisfies'", "'asserts'", "'is'", "'keyof'", "'infer'", "'unique'", "'unknown'", "'never'", "'any'", "'number'", "'string'", "'boolean'", "'symbol'", "'object'", "'undefined'", "'global'", "'require'", "'out'", "'using'", "'null'", "'true'", "'false'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "':'", "'...'", "'?.'", "'.'", "'=>'", "'++'", "'--'", "'**='", "'**'", "'&&='", "'||='", "'??='", "'&&'", "'||'", "'??'", "'==='", "'!=='", "'=='", "'!='", "'<='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", "'='", "'?'", "'@'"}, new String[]{null, "Hashbang", "HtmlComment", "LineComment", "BlockComment", "Regex", "StringLiteral", "TemplateStart", "Break", "Case", "Catch", "Class", "Const", "Continue", "Debugger", "Default", "Delete", "Do", "Else", "Export", "Extends", "Finally", "For", "Function", "If", "Import", "In", "Instanceof", "New", "Return", "Super", "Switch", "This", "Throw", "Try", "Typeof", "Var", "Void", "While", "With", "Yield", "Let", "Static", "Enum", "Await", "Async", "Of", "From", "Get", "Set", "Type", "Interface", "Namespace", "Module", "Declare", "Abstract", "Public", "Private", "Protected", "Readonly", "Override", "Accessor", "Implements", "Constructor", "As", "Satisfies", "Asserts", "Is", "Keyof", "Infer", "Unique", "Unknown", "Never", "Any", "Number", "String", "Boolean", "Symbol", "Object", "Undefined", "Global", "Require", "Out", "Using", "Null", "True", "False", "LParen", "RParen", "LBracket", "RBracket", "LBrace", "RBrace", "Semi", "Comma", "Colon", "Ellipsis", "OptionalDot", "Dot", "Arrow", "PlusPlus", "MinusMinus", "PowerAssign", "Power", "AndAssign", "OrAssign", "NullAssign", "And", "Or", "Nullish", "StrictEqual", "StrictNotEqual", "Equal", "NotEqual", "LessEqual", "Less", "Greater", "PlusAssign", "MinusAssign", "MultiplyAssign", "DivideAssign", "ModAssign", "BitAndAssign", "BitOrAssign", "BitXorAssign", "Plus", "Minus", "Multiply", "Divide", "Mod", "BitAnd", "BitOr", "BitXor", "Not", "BitNot", "Assign", "Question", "At", "NumberLiteral", "PrivateIdentifier", "Identifier", "Whitespace", "Unexpected", "TemplateEnd", "TemplateExpression", "TemplateText"}, null);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f6254 = new String[146];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f6254;
            if (i2 >= strArr.length) {
                break;
            }
            C15279 c15279 = f6255;
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
        C21631 c21631M17025 = new C6108().m17025("\u0004\u0001\u0091>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0011\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002\u0003\u0002$\b\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0001\u0004\u0003\u00048\b\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000E\u0000\n\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u0018\u0003\u0004\u0002\u0000\u000e\u0018\u0003\b\u0004\u0000\u000f\u0011\u0005~\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0018\u0005\u008a\u0000\u0000\u0013\u0018\u0005\u0006\u0000\u0000\u0014\u0018\u0005U\u0000\u0000\u0015\u0018\u0005V\u0000\u0000\u0016\u0018\u0005T\u0000\u0000\u0017\r\u0001\u0000\u0000\u0000\u0017\u000e\u0001\u0000\u0000\u0000\u0017\u0010\u0001\u0000\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019%\u0005[\u0000\u0000\u001a\u001f\u0003\u0006\u0003\u0000\u001b\u001c\u0005^\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"$\u0005^\u0000\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%\u001a\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&'\u0001\u0000\u0000\u0000'(\u0005\\\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0005_\u0000\u0000+,\u0003\u0002\u0001\u0000,\u0007\u0001\u0000\u0000\u0000-9\u0005Y\u0000\u0000.3\u0003\u0002\u0001\u0000/0\u0005^\u0000\u000002\u0003\u0002\u0001\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000068\u0005^\u0000\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u00009.\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005Z\u0000\u0000<\t\u0001\u0000\u0000\u0000\b\u0010\u0017\u001f#%379".toCharArray());
        f6250 = c21631M17025;
        f6252 = new C5883[c21631M17025.f69442.size()];
        while (true) {
            C21631 c21631 = f6250;
            if (i >= c21631.f69442.size()) {
                return;
            }
            f6252[i] = new C5883(c21631.m48892(i), i);
            i++;
        }
    }

    @Override // l.AbstractC18809
    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public final String[] mo1329() {
        return f6254;
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ᩷ */
    public final C15279 mo1331() {
        return f6255;
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ܳ */
    public final String[] mo4239() {
        return f6253;
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ܽ */
    public final C21631 mo1330() {
        return f6250;
    }

    public C1823(C1875 c1875) {
        super(c1875);
        this.f59356 = new C23313(this, f6250, f6252, f6251);
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final void m6048() {
        C11721 c11721 = new C11721(m43462(), this.f29205);
        mo24562((C8931) c11721, 0, 0);
        try {
            m24561(c11721);
            m43459(10);
            m6045();
            m43459(11);
            m24572(-1);
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final void m6045() {
        C7487 c7487 = new C7487(m43462(), this.f29205);
        mo24562((C8931) c7487, 2, 1);
        try {
            try {
                m43459(23);
                this.f29204.mo26270(this);
                int iMo6203 = this.f29208.mo6203(1);
                if (iMo6203 == 6) {
                    m24561(c7487);
                    m43459(19);
                    m24572(6);
                } else if (iMo6203 == 89) {
                    m24561(c7487);
                    m43459(14);
                    m6046();
                } else if (iMo6203 == 91) {
                    m24561(c7487);
                    m43459(13);
                    m6047();
                } else if (iMo6203 == 126 || iMo6203 == 138) {
                    m24561(c7487);
                    m43459(16);
                    this.f29204.mo26270(this);
                    if (this.f29208.mo6203(1) == 126) {
                        m43459(15);
                        m24572(126);
                    }
                    m43459(18);
                    m24572(138);
                } else {
                    switch (iMo6203) {
                        case 84:
                            m24561(c7487);
                            m43459(22);
                            m24572(84);
                            break;
                        case 85:
                            m24561(c7487);
                            m43459(20);
                            m24572(85);
                            break;
                        case HRSS1373Polynomial.K /* 86 */:
                            m24561(c7487);
                            m43459(21);
                            m24572(86);
                            break;
                        default:
                            throw new C20926(this);
                    }
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

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final void m6047() {
        C13836 c13836 = new C13836(m43462(), this.f29205);
        mo24562((C8931) c13836, 4, 2);
        try {
            m24561(c13836);
            m43459(25);
            m24572(91);
            m43459(37);
            this.f29204.mo26270(this);
            if (this.f29208.mo6203(1) == 6) {
                m43459(26);
                m6044();
                m43459(31);
                this.f29204.mo26270(this);
                int iMo22933 = ((C23313) m43460()).mo22933(2, this.f29208, this.f29205);
                while (iMo22933 != 2 && iMo22933 != 0) {
                    if (iMo22933 == 1) {
                        m43459(27);
                        m24572(94);
                        m43459(28);
                        m6044();
                    }
                    m43459(33);
                    this.f29204.mo26270(this);
                    iMo22933 = ((C23313) m43460()).mo22933(2, this.f29208, this.f29205);
                }
                m43459(35);
                this.f29204.mo26270(this);
                if (this.f29208.mo6203(1) == 94) {
                    m43459(34);
                    m24572(94);
                }
            }
            m43459(39);
            m24572(92);
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final void m6044() {
        C23009 c23009 = new C23009(m43462(), this.f29205);
        mo24562((C8931) c23009, 6, 3);
        try {
            m24561(c23009);
            m43459(41);
            m24572(6);
            m43459(42);
            m24572(95);
            m43459(43);
            m6045();
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071 A[Catch: all -> 0x00c2, ۖܳ֡ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ۖܳ֡ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00ac A[Catch: all -> 0x00c2, ۖܳ֡ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ۖܳ֡ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0047 A[Catch: all -> 0x00c2, ۖܳ֡ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ۖܳ֡ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final void m6046() {
        int iMo22933;
        C6076 c6076 = new C6076(m43462(), this.f29205);
        mo24562((C8931) c6076, 8, 4);
        try {
            m24561(c6076);
            m43459(45);
            m24572(89);
            m43459(57);
            this.f29204.mo26270(this);
            int iMo6203 = this.f29208.mo6203(1);
            if (iMo6203 != 6) {
                int i = iMo6203 - 84;
                if ((i & (-64)) == 0 && ((1 << i) & 18018796555993255L) != 0) {
                    m43459(46);
                    m6045();
                    m43459(51);
                    this.f29204.mo26270(this);
                    iMo22933 = ((C23313) m43460()).mo22933(5, this.f29208, this.f29205);
                    while (iMo22933 != 2 && iMo22933 != 0) {
                        if (iMo22933 == 1) {
                            m43459(47);
                            m24572(94);
                            m43459(48);
                            m6045();
                        }
                        m43459(53);
                        this.f29204.mo26270(this);
                        iMo22933 = ((C23313) m43460()).mo22933(5, this.f29208, this.f29205);
                    }
                    m43459(55);
                    this.f29204.mo26270(this);
                    if (this.f29208.mo6203(1) == 94) {
                        m43459(54);
                        m24572(94);
                    }
                }
            } else {
                m43459(46);
                m6045();
                m43459(51);
                this.f29204.mo26270(this);
                iMo22933 = ((C23313) m43460()).mo22933(5, this.f29208, this.f29205);
                while (iMo22933 != 2) {
                    if (iMo22933 == 1) {
                        m43459(47);
                        m24572(94);
                        m43459(48);
                        m6045();
                    }
                    m43459(53);
                    this.f29204.mo26270(this);
                    iMo22933 = ((C23313) m43460()).mo22933(5, this.f29208, this.f29205);
                }
                m43459(55);
                this.f29204.mo26270(this);
                if (this.f29208.mo6203(1) == 94) {
                    m43459(54);
                    m24572(94);
                }
            }
            m43459(59);
            m24572(90);
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }
}
