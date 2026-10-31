package l;

import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۘᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBG3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4109 implements InterfaceC20295 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12533 f13056 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0580 f13057;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f13058;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18926 f13059;

    public C4109(C18926 c18926) {
        this.f13059 = c18926;
        this.f13057 = c18926.f59641;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12335(C12533 c12533) {
        this.f13056 = c12533;
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫ */
    public final void mo8327(int i, int i2) {
        throw new C2698("invalid opcode ".concat(C14712.m35005(i)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x0302  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫ */
    public final void mo8331(int i, int i2, C7573 c7573) {
        C0580 c0580 = this.f13057;
        if (i == 0) {
            c0580.m2411();
        } else if (i == 190) {
            C7573 c7573M32120 = this.f13056.m30752().m32120(0);
            if (!c7573M32120.m20301() && !c7573M32120.equals(C7573.f23417)) {
                C18926.m43676(this.f13059, "type mismatch: expected array type but encountered " + c7573M32120.mo2463());
                throw null;
            }
            c0580.m2403(this.f13056, C7573.f23412);
        } else if (i != 191 && i != 194 && i != 195) {
            switch (i) {
                case 0:
                    c0580.m2411();
                    break;
                case 46:
                    C7573 c7573M43671 = C18926.m43671(c7573, this.f13056.m30752().m32120(1));
                    C7573 c7573M20310 = C7573.f23417;
                    if (c7573M43671 != c7573M20310) {
                        c7573M20310 = c7573M43671.m20310();
                    }
                    c0580.m2404(this.f13056, c7573M43671, C7573.f23413);
                    c7573 = c7573M20310;
                    break;
                case 79:
                    C13238 c13238M30752 = this.f13056.m30752();
                    int i3 = c7573.m20306() ? 2 : 3;
                    C7573 c7573M32121 = c13238M30752.m32120(i3);
                    boolean zM32118 = c13238M30752.m32118(i3);
                    C7573 c7573M43672 = C18926.m43671(c7573, c7573M32121);
                    if (zM32118 && c7573M43672 != (c7573 = C7573.f23417)) {
                        c7573 = c7573M43672.m20310();
                    }
                    c0580.m2405(this.f13056, c7573M43672, C7573.f23413, c7573);
                    break;
                case 100:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case 108:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case 126:
                case 128:
                case 130:
                    c0580.m2404(this.f13056, c7573, c7573);
                    break;
                case 116:
                    c0580.m2403(this.f13056, c7573);
                    break;
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                case 122:
                case 124:
                    c0580.m2404(this.f13056, c7573, C7573.f23413);
                    break;
                case 172:
                    C7573 c7573M32122 = c7573 == C7573.f23412 ? this.f13056.m30752().m32120(0) : c7573;
                    c0580.m2403(this.f13056, c7573);
                    m12333(c7573M32122);
                    break;
                case 177:
                    c0580.m2411();
                    m12333(C7573.f23406);
                    break;
                default:
                    int i4 = 17;
                    switch (i) {
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                            if (this.f13056.m30752().m32120(0).m20308()) {
                                throw C18926.m43670();
                            }
                            c0580.m2413(this.f13056, 1);
                            break;
                            break;
                        case 88:
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            C13238 c13238M30753 = this.f13056.m30752();
                            if (c13238M30753.m32120(0).m20308()) {
                                c0580.m2413(this.f13056, 1);
                            } else if (c13238M30753.m32120(1).m20306()) {
                                c0580.m2413(this.f13056, 2);
                                i4 = 8481;
                            } else {
                                throw C18926.m43670();
                            }
                            if (i == 92) {
                                c0580.m2412(i4);
                            }
                            break;
                        case 89:
                            if (this.f13056.m30752().m32120(0).m20308()) {
                                throw C18926.m43670();
                            }
                            c0580.m2413(this.f13056, 1);
                            c0580.m2412(17);
                            break;
                            break;
                        case 90:
                            C13238 c13238M30754 = this.f13056.m30752();
                            if (!c13238M30754.m32120(0).m20306() || !c13238M30754.m32120(1).m20306()) {
                                throw C18926.m43670();
                            }
                            c0580.m2413(this.f13056, 2);
                            c0580.m2412(530);
                            break;
                            break;
                        case 91:
                            C13238 c13238M30755 = this.f13056.m30752();
                            if (c13238M30755.m32120(0).m20308()) {
                                throw C18926.m43670();
                            }
                            if (c13238M30755.m32120(1).m20308()) {
                                c0580.m2413(this.f13056, 2);
                                c0580.m2412(530);
                            } else if (c13238M30755.m32120(2).m20306()) {
                                c0580.m2413(this.f13056, 3);
                                c0580.m2412(12819);
                            } else {
                                throw C18926.m43670();
                            }
                            break;
                            break;
                        case 93:
                            C13238 c13238M30756 = this.f13056.m30752();
                            if (c13238M30756.m32120(0).m20308()) {
                                if (c13238M30756.m32120(2).m20308()) {
                                    throw C18926.m43670();
                                }
                                c0580.m2413(this.f13056, 2);
                                c0580.m2412(530);
                            } else {
                                if (c13238M30756.m32120(1).m20308() || c13238M30756.m32120(2).m20308()) {
                                    throw C18926.m43670();
                                }
                                c0580.m2413(this.f13056, 3);
                                c0580.m2412(205106);
                            }
                            break;
                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                            C13238 c13238M30757 = this.f13056.m30752();
                            if (c13238M30757.m32120(0).m20308()) {
                                if (c13238M30757.m32120(2).m20308()) {
                                    c0580.m2413(this.f13056, 2);
                                    c0580.m2412(530);
                                } else if (c13238M30757.m32120(3).m20306()) {
                                    c0580.m2413(this.f13056, 3);
                                    c0580.m2412(12819);
                                } else {
                                    throw C18926.m43670();
                                }
                            } else if (c13238M30757.m32120(1).m20306()) {
                                if (c13238M30757.m32120(2).m20308()) {
                                    c0580.m2413(this.f13056, 3);
                                    c0580.m2412(205106);
                                } else if (c13238M30757.m32120(3).m20306()) {
                                    c0580.m2413(this.f13056, 4);
                                    c0580.m2412(4399427);
                                } else {
                                    throw C18926.m43670();
                                }
                            } else {
                                throw C18926.m43670();
                            }
                            break;
                        case 95:
                            C13238 c13238M30758 = this.f13056.m30752();
                            if (!c13238M30758.m32120(0).m20306() || !c13238M30758.m32120(1).m20306()) {
                                throw C18926.m43670();
                            }
                            c0580.m2413(this.f13056, 2);
                            c0580.m2412(18);
                            break;
                            break;
                        case 96:
                            c0580.m2404(this.f13056, c7573, c7573);
                            break;
                        default:
                            switch (i) {
                                case 133:
                                case 134:
                                case 135:
                                case 145:
                                case 146:
                                case 147:
                                    c0580.m2403(this.f13056, C7573.f23413);
                                    break;
                                case 136:
                                case 137:
                                case 138:
                                    c0580.m2403(this.f13056, C7573.f23418);
                                    break;
                                case 139:
                                case 140:
                                case 141:
                                    c0580.m2403(this.f13056, C7573.f23420);
                                    break;
                                case 142:
                                case 143:
                                case 144:
                                    c0580.m2403(this.f13056, C7573.f23411);
                                    break;
                                case 148:
                                    C12533 c12533 = this.f13056;
                                    C7573 c7574 = C7573.f23418;
                                    c0580.m2404(c12533, c7574, c7574);
                                    break;
                                case 149:
                                case 150:
                                    C12533 c12534 = this.f13056;
                                    C7573 c7575 = C7573.f23420;
                                    c0580.m2404(c12534, c7575, c7575);
                                    break;
                                case 151:
                                case 152:
                                    C12533 c12535 = this.f13056;
                                    C7573 c7576 = C7573.f23411;
                                    c0580.m2404(c12535, c7576, c7576);
                                    break;
                                default:
                                    mo8327(i, i2);
                                    throw null;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c0580.m2403(this.f13056, C7573.f23412);
        }
        c0580.m2400(c7573);
        ((C16102) c0580).mo2402(this.f13056, i2, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12333(C7573 c7573) {
        C7573 c7573M51261 = this.f13057.m2409().m51261();
        if (C22927.m51026(c7573M51261, c7573)) {
            return;
        }
        C18926.m43676(this.f13059, "return type mismatch: prototype indicates " + c7573M51261.mo2463() + ", but encountered type " + c7573.mo2463());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫ */
    public final void mo8329(int i, int i2, int i3, int i4, C7573 c7573, int i5) {
        C7573 c7573M28916;
        boolean z;
        C18658 c18658M28913;
        C11828 c11828M51308 = this.f13059.f59639.m51308(i == 54 ? i3 + i2 : i2, i4);
        if (c11828M51308 != null) {
            c7573M28916 = c11828M51308.m28916();
            if (c7573M28916.mo5256() != c7573.mo5256()) {
                c7573M28916 = c7573;
                c11828M51308 = null;
            }
        } else {
            c7573M28916 = c7573;
        }
        C0580 c0580 = this.f13057;
        if (i == 21) {
            c0580.m2401(this.f13056, i4);
            if (c11828M51308 != null) {
                z = true;
            } else {
                z = false;
            }
            c0580.m2414(z);
            c0580.m2400(c7573);
        } else if (i == 54) {
            c18658M28913 = c11828M51308 != null ? c11828M51308.m28913() : null;
            c0580.m2403(this.f13056, c7573);
            c0580.m2400(c7573);
            c0580.m2397(i4, c7573M28916, c18658M28913);
        } else if (i != 132) {
            if (i != 169) {
                mo8327(i, i2);
                throw null;
            }
            c0580.m2401(this.f13056, i4);
            if (c11828M51308 != null) {
                z = true;
            } else {
                z = false;
            }
            c0580.m2414(z);
            c0580.m2400(c7573);
        } else {
            c18658M28913 = c11828M51308 != null ? c11828M51308.m28913() : null;
            c0580.m2401(this.f13056, i4);
            c0580.m2397(i4, c7573M28916, c18658M28913);
            c0580.m2400(c7573);
            c0580.m2412(i5);
            c0580.m2407((AbstractC13717) C2635.m8291(i5));
        }
        ((C16102) c0580).mo2402(this.f13056, i2, i);
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
    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫ */
    public final void mo8330(int i, int i2, int i3, AbstractC13717 abstractC13717, int i4) {
        AbstractC13717 abstractC13717M43569;
        C18926 c18926 = this.f13059;
        C0580 c0580 = this.f13057;
        if (i == 18 || i == 19) {
            if ((abstractC13717 instanceof C21685) || (abstractC13717 instanceof C4751)) {
                C18926.m43677(c18926, abstractC13717);
            }
            c0580.m2411();
            abstractC13717M43569 = abstractC13717;
        } else if (i != 189) {
            if (i == 197) {
                C7573 c7573 = C7573.f23406;
                int i5 = C23095.f74300;
                StringBuilder sb = new StringBuilder(100);
                sb.append('(');
                for (int i6 = 0; i6 < i4; i6++) {
                    sb.append('I');
                }
                sb.append(')');
                sb.append(c7573.m20300());
                c0580.m2406(this.f13056, C23095.m51255(sb.toString()));
                abstractC13717M43569 = abstractC13717;
            } else if (i != 192 && i != 193) {
                switch (i) {
                    case 179:
                        c0580.m2403(this.f13056, ((C8985) abstractC13717).getType());
                        abstractC13717M43569 = abstractC13717;
                        break;
                    case 180:
                        c0580.m2403(this.f13056, C7573.f23412);
                        abstractC13717M43569 = abstractC13717;
                        break;
                    case 181:
                        c0580.m2404(this.f13056, C7573.f23412, ((C8985) abstractC13717).getType());
                        abstractC13717M43569 = abstractC13717;
                        break;
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                        boolean z = abstractC13717 instanceof C4046;
                        AbstractC13717 abstractC13718 = abstractC13717;
                        if (z) {
                            C22390 c22390M12144 = ((C4046) abstractC13717).m12144();
                            C18926.m43675(c18926, i, c22390M12144);
                            abstractC13718 = c22390M12144;
                        }
                        if ((abstractC13718 instanceof C22390) && ((C22390) abstractC13718).m39384()) {
                            C18926.m43680(c18926, i);
                        }
                        c0580.m2406(this.f13056, ((C22390) abstractC13718).m39385(i == 184));
                        abstractC13717M43569 = abstractC13718;
                        break;
                    case 186:
                        C18926.m43674(c18926, i);
                        C18863 c18863 = (C18863) abstractC13717;
                        c0580.m2406(this.f13056, c18863.m43564());
                        abstractC13717M43569 = c18863.m43569();
                        break;
                    default:
                        c0580.m2411();
                        abstractC13717M43569 = abstractC13717;
                        break;
                }
            } else {
                c0580.m2403(this.f13056, C7573.f23412);
                abstractC13717M43569 = abstractC13717;
            }
        } else {
            c0580.m2403(this.f13056, C7573.f23413);
            abstractC13717M43569 = abstractC13717;
        }
        c0580.m2412(i4);
        c0580.m2407(abstractC13717M43569);
        ((C16102) c0580).mo2402(this.f13056, i2, i);
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫ */
    public final void mo8328(int i, int i2, int i3, int i4) {
        C0580 c0580 = this.f13057;
        switch (i) {
            case 153:
            case EnumC17734.f54268 /* 154 */:
            case 155:
            case 156:
            case 157:
            case 158:
                c0580.m2403(this.f13056, C7573.f23413);
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
            case 159:
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
            case 161:
            case 162:
            case 163:
            case 164:
                C12533 c12533 = this.f13056;
                C7573 c7573 = C7573.f23413;
                c0580.m2404(c12533, c7573, c7573);
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
            case 165:
            case 166:
                C12533 c12534 = this.f13056;
                C7573 c7574 = C7573.f23412;
                c0580.m2404(c12534, c7574, c7574);
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
            default:
                switch (i) {
                    case 198:
                    case 199:
                        c0580.m2403(this.f13056, C7573.f23412);
                        break;
                    case 200:
                    case 201:
                        break;
                    default:
                        mo8327(i, i2);
                        throw null;
                }
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
            case 167:
            case 168:
                c0580.m2411();
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
        }
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫ */
    public final void mo8333(int i, int i2, C19632 c19632, int i3) {
        C12533 c12533 = this.f13056;
        C7573 c7573 = C7573.f23413;
        C0580 c0580 = this.f13057;
        c0580.m2403(c12533, c7573);
        c0580.m2412(i3);
        c0580.m2408(c19632);
        ((C16102) c0580).mo2402(this.f13056, i, 171);
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫ */
    public final void mo8332(int i, int i2, C12512 c12512, ArrayList arrayList) {
        C12533 c12533 = this.f13056;
        C7573 c7573 = C7573.f23413;
        C0580 c0580 = this.f13057;
        c0580.m2403(c12533, c7573);
        c0580.m2398(arrayList);
        c0580.m2407((AbstractC13717) c12512);
        ((C16102) c0580).mo2402(this.f13056, i, 188);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12334(int i) {
        this.f13058 = i;
    }

    @Override // l.InterfaceC20295
    /* JADX INFO: renamed from: ֫ */
    public final int mo8326() {
        return this.f13058;
    }
}
