package p067l;

import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۘᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBG3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6274 implements InterfaceC21657 {

    /* JADX INFO: renamed from: ֫ */
    public C14280 f15870 = null;

    /* JADX INFO: renamed from: ۧ */
    public final C2920 f15871;

    /* JADX INFO: renamed from: ܽ */
    public int f15872;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C20356 f15873;

    public C6274(C20356 c20356) {
        this.f15873 = c20356;
        this.f15871 = c20356.f62872;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14240(C14280 c14280) {
        this.f15870 = c14280;
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10371(int i, int i2) {
        throw new C4933("invalid opcode ".concat(C16351.m37152(i)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x0302  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10375(int i, int i2, C9566 c9566) {
        C2920 c2920 = this.f15871;
        if (i == 0) {
            c2920.m4782();
        } else if (i == 190) {
            C9566 c9566M34218 = this.f15870.m32824().m34218(0);
            if (!c9566M34218.m22278() && !c9566M34218.equals(C9566.f26329)) {
                C20356.m45942(this.f15873, "type mismatch: expected array type but encountered " + c9566M34218.mo4819());
                throw null;
            }
            c2920.m4774(this.f15870, C9566.f26324);
        } else if (i != 191 && i != 194 && i != 195) {
            switch (i) {
                case 0:
                    c2920.m4782();
                    break;
                case 46:
                    C9566 c9566M45937 = C20356.m45937(c9566, this.f15870.m32824().m34218(1));
                    C9566 c9566M22287 = C9566.f26329;
                    if (c9566M45937 != c9566M22287) {
                        c9566M22287 = c9566M45937.m22287();
                    }
                    c2920.m4775(this.f15870, c9566M45937, C9566.f26325);
                    c9566 = c9566M22287;
                    break;
                case 79:
                    C14950 c14950M32824 = this.f15870.m32824();
                    int i3 = c9566.m22283() ? 2 : 3;
                    C9566 c9566M34219 = c14950M32824.m34218(i3);
                    boolean zM34216 = c14950M32824.m34216(i3);
                    C9566 c9566M45938 = C20356.m45937(c9566, c9566M34219);
                    if (zM34216 && c9566M45938 != (c9566 = C9566.f26329)) {
                        c9566 = c9566M45938.m22287();
                    }
                    c2920.m4776(this.f15870, c9566M45938, C9566.f26325, c9566);
                    break;
                case 100:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case 108:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case 126:
                case 128:
                case 130:
                    c2920.m4775(this.f15870, c9566, c9566);
                    break;
                case 116:
                    c2920.m4774(this.f15870, c9566);
                    break;
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                case 122:
                case 124:
                    c2920.m4775(this.f15870, c9566, C9566.f26325);
                    break;
                case 172:
                    C9566 c9566M342110 = c9566 == C9566.f26324 ? this.f15870.m32824().m34218(0) : c9566;
                    c2920.m4774(this.f15870, c9566);
                    m14238(c9566M342110);
                    break;
                case 177:
                    c2920.m4782();
                    m14238(C9566.f26318);
                    break;
                default:
                    int i4 = 17;
                    switch (i) {
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                            if (this.f15870.m32824().m34218(0).m22285()) {
                                throw C20356.m45936();
                            }
                            c2920.m4784(this.f15870, 1);
                            break;
                            break;
                        case 88:
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            C14950 c14950M32825 = this.f15870.m32824();
                            if (c14950M32825.m34218(0).m22285()) {
                                c2920.m4784(this.f15870, 1);
                            } else if (c14950M32825.m34218(1).m22283()) {
                                c2920.m4784(this.f15870, 2);
                                i4 = 8481;
                            } else {
                                throw C20356.m45936();
                            }
                            if (i == 92) {
                                c2920.m4783(i4);
                            }
                            break;
                        case 89:
                            if (this.f15870.m32824().m34218(0).m22285()) {
                                throw C20356.m45936();
                            }
                            c2920.m4784(this.f15870, 1);
                            c2920.m4783(17);
                            break;
                            break;
                        case 90:
                            C14950 c14950M32826 = this.f15870.m32824();
                            if (!c14950M32826.m34218(0).m22283() || !c14950M32826.m34218(1).m22283()) {
                                throw C20356.m45936();
                            }
                            c2920.m4784(this.f15870, 2);
                            c2920.m4783(530);
                            break;
                            break;
                        case 91:
                            C14950 c14950M32827 = this.f15870.m32824();
                            if (c14950M32827.m34218(0).m22285()) {
                                throw C20356.m45936();
                            }
                            if (c14950M32827.m34218(1).m22285()) {
                                c2920.m4784(this.f15870, 2);
                                c2920.m4783(530);
                            } else if (c14950M32827.m34218(2).m22283()) {
                                c2920.m4784(this.f15870, 3);
                                c2920.m4783(12819);
                            } else {
                                throw C20356.m45936();
                            }
                            break;
                            break;
                        case 93:
                            C14950 c14950M32828 = this.f15870.m32824();
                            if (c14950M32828.m34218(0).m22285()) {
                                if (c14950M32828.m34218(2).m22285()) {
                                    throw C20356.m45936();
                                }
                                c2920.m4784(this.f15870, 2);
                                c2920.m4783(530);
                            } else {
                                if (c14950M32828.m34218(1).m22285() || c14950M32828.m34218(2).m22285()) {
                                    throw C20356.m45936();
                                }
                                c2920.m4784(this.f15870, 3);
                                c2920.m4783(205106);
                            }
                            break;
                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                            C14950 c14950M32829 = this.f15870.m32824();
                            if (c14950M32829.m34218(0).m22285()) {
                                if (c14950M32829.m34218(2).m22285()) {
                                    c2920.m4784(this.f15870, 2);
                                    c2920.m4783(530);
                                } else if (c14950M32829.m34218(3).m22283()) {
                                    c2920.m4784(this.f15870, 3);
                                    c2920.m4783(12819);
                                } else {
                                    throw C20356.m45936();
                                }
                            } else if (c14950M32829.m34218(1).m22283()) {
                                if (c14950M32829.m34218(2).m22285()) {
                                    c2920.m4784(this.f15870, 3);
                                    c2920.m4783(205106);
                                } else if (c14950M32829.m34218(3).m22283()) {
                                    c2920.m4784(this.f15870, 4);
                                    c2920.m4783(4399427);
                                } else {
                                    throw C20356.m45936();
                                }
                            } else {
                                throw C20356.m45936();
                            }
                            break;
                        case 95:
                            C14950 c14950M328210 = this.f15870.m32824();
                            if (!c14950M328210.m34218(0).m22283() || !c14950M328210.m34218(1).m22283()) {
                                throw C20356.m45936();
                            }
                            c2920.m4784(this.f15870, 2);
                            c2920.m4783(18);
                            break;
                            break;
                        case 96:
                            c2920.m4775(this.f15870, c9566, c9566);
                            break;
                        default:
                            switch (i) {
                                case 133:
                                case 134:
                                case 135:
                                case 145:
                                case 146:
                                case 147:
                                    c2920.m4774(this.f15870, C9566.f26325);
                                    break;
                                case 136:
                                case 137:
                                case 138:
                                    c2920.m4774(this.f15870, C9566.f26330);
                                    break;
                                case 139:
                                case 140:
                                case 141:
                                    c2920.m4774(this.f15870, C9566.f26332);
                                    break;
                                case 142:
                                case 143:
                                case 144:
                                    c2920.m4774(this.f15870, C9566.f26323);
                                    break;
                                case 148:
                                    C14280 c14280 = this.f15870;
                                    C9566 c9567 = C9566.f26330;
                                    c2920.m4775(c14280, c9567, c9567);
                                    break;
                                case 149:
                                case 150:
                                    C14280 c14281 = this.f15870;
                                    C9566 c9568 = C9566.f26332;
                                    c2920.m4775(c14281, c9568, c9568);
                                    break;
                                case 151:
                                case 152:
                                    C14280 c14282 = this.f15870;
                                    C9566 c9569 = C9566.f26323;
                                    c2920.m4775(c14282, c9569, c9569);
                                    break;
                                default:
                                    mo10371(i, i2);
                                    throw null;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c2920.m4774(this.f15870, C9566.f26324);
        }
        c2920.m4771(c9566);
        ((C17672) c2920).mo4773(this.f15870, i2, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14238(C9566 c9566) {
        C9566 c9566M53655 = this.f15871.m4780().m53655();
        if (C24158.m53417(c9566M53655, c9566)) {
            return;
        }
        C20356.m45942(this.f15873, "return type mismatch: prototype indicates " + c9566M53655.mo4819() + ", but encountered type " + c9566.mo4819());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10373(int i, int i2, int i3, int i4, C9566 c9566, int i5) {
        C9566 c9566M30966;
        boolean z;
        C20101 c20101M30963;
        C13610 c13610M53702 = this.f15873.f62870.m53702(i == 54 ? i3 + i2 : i2, i4);
        if (c13610M53702 != null) {
            c9566M30966 = c13610M53702.m30966();
            if (c9566M30966.mo7485() != c9566.mo7485()) {
                c9566M30966 = c9566;
                c13610M53702 = null;
            }
        } else {
            c9566M30966 = c9566;
        }
        C2920 c2920 = this.f15871;
        if (i == 21) {
            c2920.m4772(this.f15870, i4);
            if (c13610M53702 != null) {
                z = true;
            } else {
                z = false;
            }
            c2920.m4785(z);
            c2920.m4771(c9566);
        } else if (i == 54) {
            c20101M30963 = c13610M53702 != null ? c13610M53702.m30963() : null;
            c2920.m4774(this.f15870, c9566);
            c2920.m4771(c9566);
            c2920.m4768(i4, c9566M30966, c20101M30963);
        } else if (i != 132) {
            if (i != 169) {
                mo10371(i, i2);
                throw null;
            }
            c2920.m4772(this.f15870, i4);
            if (c13610M53702 != null) {
                z = true;
            } else {
                z = false;
            }
            c2920.m4785(z);
            c2920.m4771(c9566);
        } else {
            c20101M30963 = c13610M53702 != null ? c13610M53702.m30963() : null;
            c2920.m4772(this.f15870, i4);
            c2920.m4768(i4, c9566M30966, c20101M30963);
            c2920.m4771(c9566);
            c2920.m4783(i5);
            c2920.m4778((AbstractC15405) C4873.m10335(i5));
        }
        ((C17672) c2920).mo4773(this.f15870, i2, i);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10374(int i, int i2, int i3, AbstractC15405 abstractC15405, int i4) {
        AbstractC15405 abstractC15405M45835;
        C20356 c20356 = this.f15873;
        C2920 c2920 = this.f15871;
        if (i == 18 || i == 19) {
            if ((abstractC15405 instanceof C22978) || (abstractC15405 instanceof C6884)) {
                C20356.m45943(c20356, abstractC15405);
            }
            c2920.m4782();
            abstractC15405M45835 = abstractC15405;
        } else if (i != 189) {
            if (i == 197) {
                C9566 c9566 = C9566.f26318;
                int i5 = C24318.f77046;
                StringBuilder sb = new StringBuilder(100);
                sb.append('(');
                for (int i6 = 0; i6 < i4; i6++) {
                    sb.append('I');
                }
                sb.append(')');
                sb.append(c9566.m22277());
                c2920.m4777(this.f15870, C24318.m53649(sb.toString()));
                abstractC15405M45835 = abstractC15405;
            } else if (i != 192 && i != 193) {
                switch (i) {
                    case 179:
                        c2920.m4774(this.f15870, ((C10908) abstractC15405).getType());
                        abstractC15405M45835 = abstractC15405;
                        break;
                    case 180:
                        c2920.m4774(this.f15870, C9566.f26324);
                        abstractC15405M45835 = abstractC15405;
                        break;
                    case 181:
                        c2920.m4775(this.f15870, C9566.f26324, ((C10908) abstractC15405).getType());
                        abstractC15405M45835 = abstractC15405;
                        break;
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                        boolean z = abstractC15405 instanceof C6214;
                        AbstractC15405 abstractC15406 = abstractC15405;
                        if (z) {
                            C23648 c23648M14065 = ((C6214) abstractC15405).m14065();
                            C20356.m45941(c20356, i, c23648M14065);
                            abstractC15406 = c23648M14065;
                        }
                        if ((abstractC15406 instanceof C23648) && ((C23648) abstractC15406).m41620()) {
                            C20356.m45946(c20356, i);
                        }
                        c2920.m4777(this.f15870, ((C23648) abstractC15406).m41621(i == 184));
                        abstractC15405M45835 = abstractC15406;
                        break;
                    case 186:
                        C20356.m45940(c20356, i);
                        C20296 c20296 = (C20296) abstractC15405;
                        c2920.m4777(this.f15870, c20296.m45830());
                        abstractC15405M45835 = c20296.m45835();
                        break;
                    default:
                        c2920.m4782();
                        abstractC15405M45835 = abstractC15405;
                        break;
                }
            } else {
                c2920.m4774(this.f15870, C9566.f26324);
                abstractC15405M45835 = abstractC15405;
            }
        } else {
            c2920.m4774(this.f15870, C9566.f26325);
            abstractC15405M45835 = abstractC15405;
        }
        c2920.m4783(i4);
        c2920.m4778(abstractC15405M45835);
        ((C17672) c2920).mo4773(this.f15870, i2, i);
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10372(int i, int i2, int i3, int i4) {
        C2920 c2920 = this.f15871;
        switch (i) {
            case 153:
            case EnumC19222.f57460 /* 154 */:
            case 155:
            case 156:
            case 157:
            case 158:
                c2920.m4774(this.f15870, C9566.f26325);
                c2920.m4788(i4);
                ((C17672) c2920).mo4773(this.f15870, i2, i);
                return;
            case 159:
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
            case 161:
            case 162:
            case 163:
            case 164:
                C14280 c14280 = this.f15870;
                C9566 c9566 = C9566.f26325;
                c2920.m4775(c14280, c9566, c9566);
                c2920.m4788(i4);
                ((C17672) c2920).mo4773(this.f15870, i2, i);
                return;
            case 165:
            case 166:
                C14280 c14281 = this.f15870;
                C9566 c9567 = C9566.f26324;
                c2920.m4775(c14281, c9567, c9567);
                c2920.m4788(i4);
                ((C17672) c2920).mo4773(this.f15870, i2, i);
                return;
            default:
                switch (i) {
                    case 198:
                    case 199:
                        c2920.m4774(this.f15870, C9566.f26324);
                        break;
                    case 200:
                    case 201:
                        break;
                    default:
                        mo10371(i, i2);
                        throw null;
                }
                c2920.m4788(i4);
                ((C17672) c2920).mo4773(this.f15870, i2, i);
                return;
            case 167:
            case 168:
                c2920.m4782();
                c2920.m4788(i4);
                ((C17672) c2920).mo4773(this.f15870, i2, i);
                return;
        }
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10377(int i, int i2, C21027 c21027, int i3) {
        C14280 c14280 = this.f15870;
        C9566 c9566 = C9566.f26325;
        C2920 c2920 = this.f15871;
        c2920.m4774(c14280, c9566);
        c2920.m4783(i3);
        c2920.m4779(c21027);
        ((C17672) c2920).mo4773(this.f15870, i, 171);
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final void mo10376(int i, int i2, C14260 c14260, ArrayList arrayList) {
        C14280 c14280 = this.f15870;
        C9566 c9566 = C9566.f26325;
        C2920 c2920 = this.f15871;
        c2920.m4774(c14280, c9566);
        c2920.m4769(arrayList);
        c2920.m4778((AbstractC15405) c14260);
        ((C17672) c2920).mo4773(this.f15870, i, 188);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14239(int i) {
        this.f15872 = i;
    }

    @Override // p067l.InterfaceC21657
    /* JADX INFO: renamed from: ֫ */
    public final int mo10370() {
        return this.f15872;
    }
}
