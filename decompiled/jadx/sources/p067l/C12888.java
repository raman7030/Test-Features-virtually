package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.io.IOException;
import java.io.Writer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B60R */
/* JADX INFO: loaded from: classes4.dex */
public class C12888 extends AbstractC10205 {

    /* JADX INFO: renamed from: ۙ */
    public static final C2582 f36245 = new C2582(1000);

    /* JADX INFO: renamed from: ᩶ */
    public C3499 f36246;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC23920 f36247;

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ۧ */
    public final double mo4019() {
        return 100.0d;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12888 m29517(C3499 c3499, int i, InterfaceC23920 interfaceC23920) {
        C12888 c12888 = (C12888) f36245.m3892();
        if (c12888 != null) {
            c12888.f28294 = i;
            c12888.f36246 = c3499;
            c12888.f36247 = interfaceC23920;
            return c12888;
        }
        return new C12888(c3499, i, interfaceC23920);
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ܿ */
    public void mo14008() {
        this.f36247 = null;
        this.f36246 = null;
        f36245.m3890(this);
    }

    public C12888(C3499 c3499, int i, InterfaceC23920 interfaceC23920) {
        super(i);
        this.f36246 = c3499;
        this.f36247 = interfaceC23920;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29519(C5636 c5636, InterfaceC10250 interfaceC10250, int i, String str) throws IOException {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c5636.write(str);
                    return;
                }
                throw new RuntimeException();
            }
            InterfaceC6227 interfaceC6227 = (InterfaceC6227) interfaceC10250;
            c5636.write(interfaceC6227.getName());
            c5636.write(40);
            c5636.write(34);
            C15693.m35744(c5636, interfaceC6227.mo14104());
            c5636.write(34);
            c5636.write(", ", 0, 2);
            C16010.m36385(c5636, interfaceC6227.mo14103());
            for (InterfaceC12262 interfaceC12262 : interfaceC6227.mo14102()) {
                c5636.write(", ", 0, 2);
                AbstractC13363.m30508(c5636, interfaceC12262);
            }
            c5636.write(")@", 0, 2);
            if (interfaceC6227.mo14105().mo5178() != 4) {
                throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
            }
            C16010.m36386((Writer) c5636, (InterfaceC7568) interfaceC6227.mo14105().mo5179(), false);
            return;
        }
        if (interfaceC10250 instanceof InterfaceC16954) {
            InterfaceC16954 interfaceC16954 = (InterfaceC16954) interfaceC10250;
            c5636.write(34);
            if (interfaceC16954 instanceof C14859) {
                C14859 c14859 = (C14859) interfaceC16954;
                c14859.f42357.m33492(c14859.f42358, c5636, true);
            } else {
                C15693.m35744(c5636, interfaceC16954.getString());
            }
            c5636.write(34);
            return;
        }
        if (interfaceC10250 instanceof InterfaceC22991) {
            InterfaceC22991 interfaceC22991 = (InterfaceC22991) interfaceC10250;
            if (interfaceC22991 instanceof C14189) {
                C14189 c14189 = (C14189) interfaceC22991;
                c14189.f40449.m33472(c5636, c14189.f40450);
                return;
            } else {
                c5636.write(interfaceC22991.getType());
                return;
            }
        }
        if (interfaceC10250 instanceof InterfaceC20309) {
            C16010.m36387((Writer) c5636, (InterfaceC20309) interfaceC10250, false);
            return;
        }
        if (interfaceC10250 instanceof InterfaceC7568) {
            C16010.m36386((Writer) c5636, (InterfaceC7568) interfaceC10250, false);
            return;
        }
        if (interfaceC10250 instanceof InterfaceC2873) {
            C16010.m36385(c5636, (InterfaceC2873) interfaceC10250);
            return;
        }
        if (interfaceC10250 instanceof InterfaceC20980) {
            C16010.m36388(c5636, (InterfaceC20980) interfaceC10250);
            return;
        }
        if (interfaceC10250 instanceof InterfaceC6227) {
            InterfaceC6227 interfaceC6228 = (InterfaceC6227) interfaceC10250;
            c5636.write(interfaceC6228.getName());
            c5636.write(40);
            c5636.write(34);
            C15693.m35744(c5636, interfaceC6228.mo14104());
            c5636.write(34);
            c5636.write(", ");
            C16010.m36385(c5636, interfaceC6228.mo14103());
            for (InterfaceC12262 interfaceC12263 : interfaceC6228.mo14102()) {
                c5636.write(", ");
                C8437.m19647(c5636, interfaceC12263);
            }
            c5636.write(")@");
            if (interfaceC6228.mo14105().mo5178() == 4) {
                C16010.m36386((Writer) c5636, (InterfaceC7568) interfaceC6228.mo14105().mo5179(), false);
                return;
            }
            throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
        }
        throw new IOException("Unknown reference: " + interfaceC10250);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0325  */
    /* JADX WARN: Code duplicated, block: B:102:0x0331  */
    /* JADX WARN: Code duplicated, block: B:103:0x033e  */
    /* JADX WARN: Code duplicated, block: B:105:0x034c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0359  */
    /* JADX WARN: Code duplicated, block: B:107:0x036c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0377  */
    /* JADX WARN: Code duplicated, block: B:109:0x0389  */
    /* JADX WARN: Code duplicated, block: B:110:0x039b  */
    /* JADX WARN: Code duplicated, block: B:111:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:113:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:115:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:117:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:119:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:121:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:137:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:76:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0239  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:92:0x026d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0280  */
    /* JADX WARN: Code duplicated, block: B:94:0x0299  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x02db  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0304  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public boolean mo4018(C5636 c5636) throws IOException {
        String str;
        ?? r8;
        String strM6319;
        InterfaceC10250 interfaceC10250;
        String str2;
        boolean z;
        InterfaceC10250 interfaceC10250Mo11754;
        ?? r9;
        int i;
        boolean z2;
        String strM63110;
        InterfaceC23920 interfaceC23920;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ?? r10;
        InterfaceC10250 reference;
        ?? r11;
        String str3;
        EnumC3167 enumC3167Mo6217 = this.f36247.mo6217();
        InterfaceC23920 interfaceC23921 = this.f36247;
        if (interfaceC23921 instanceof InterfaceC2717) {
            int iMo4220 = ((InterfaceC2717) interfaceC23921).mo4220();
            int i8 = C23285.f73274;
            str = "generic-error";
            switch (iMo4220) {
                case 1:
                    str3 = "generic-error";
                    break;
                case 2:
                    str3 = "no-such-class";
                    break;
                case 3:
                    str3 = "no-such-field";
                    break;
                case 4:
                    str3 = "no-such-method";
                    break;
                case 5:
                    str3 = "illegal-class-access";
                    break;
                case 6:
                    str3 = "illegal-field-access";
                    break;
                case 7:
                    str3 = "illegal-method-access";
                    break;
                case 8:
                    str3 = "class-change-error";
                    break;
                case 9:
                    str3 = "instantiation-error";
                    break;
                default:
                    str3 = null;
                    break;
            }
            if (str3 == null) {
                c5636.getClass();
                c5636.write("#was invalid verification error type: ", 0, 38);
                c5636.m12534(iMo4220);
                c5636.write("\n", 0, 1);
            } else {
                str = str3;
            }
        } else {
            str = null;
        }
        InterfaceC23920 interfaceC23922 = this.f36247;
        if (interfaceC23922 instanceof InterfaceC12777) {
            InterfaceC12777 interfaceC12777 = (InterfaceC12777) interfaceC23922;
            this.f36246.f7058.getClass();
            try {
                reference = interfaceC12777.getReference();
                try {
                    reference.mo12051();
                    strM6319 = null;
                    interfaceC10250 = reference;
                    r11 = reference instanceof InterfaceC6227;
                    z = false;
                } catch (C3544 e) {
                    e = e;
                    c5636.getClass();
                    c5636.write("#", 0, 1);
                    c5636.write(e.getMessage());
                    c5636.write("\n", 0, 1);
                    strM6319 = e.m6319();
                    z = true;
                    interfaceC10250 = reference;
                    r11 = 2;
                }
            } catch (C3544 e2) {
                e = e2;
                reference = null;
            }
            InterfaceC23920 interfaceC23923 = this.f36247;
            if (interfaceC23923 instanceof InterfaceC14532) {
                try {
                    interfaceC10250Mo11754 = ((InterfaceC14532) interfaceC23923).mo11754();
                    try {
                        interfaceC10250Mo11754.mo12051();
                        str2 = null;
                        r10 = r11;
                        i = 0;
                        String str4 = str2;
                        z2 = z;
                        strM63110 = str4;
                        r9 = r10;
                    } catch (C3544 e3) {
                        e = e3;
                        c5636.getClass();
                        c5636.write("#", 0, 1);
                        c5636.write(e.getMessage());
                        c5636.write("\n", 0, 1);
                        strM63110 = e.m6319();
                        z2 = true;
                        i = 2;
                        r9 = r11;
                    }
                } catch (C3544 e4) {
                    e = e4;
                    interfaceC10250Mo11754 = null;
                }
            } else {
                str2 = null;
                r8 = r11;
            }
            interfaceC23920 = this.f36247;
            if (interfaceC23920 instanceof InterfaceC9423) {
                i7 = C4170.f9190[interfaceC23920.mo6217().ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            throw new C17034(null, "Invalid 31t opcode: %s", this.f36247.mo6217());
                        }
                        try {
                            this.f36246.m6255(m23803() + ((InterfaceC9423) this.f36247).mo5147(), EnumC3167.f5951);
                        } catch (C2828 unused) {
                            c5636.getClass();
                            c5636.write("#invalid payload reference\n", 0, 27);
                            z2 = true;
                        }
                    } else if (this.f36246.m6258(((InterfaceC9423) this.f36247).mo5147() + m23803()) == -1) {
                        c5636.getClass();
                        c5636.write("#invalid payload reference\n", 0, 27);
                        z2 = true;
                    }
                } else if (this.f36246.m6254(((InterfaceC9423) this.f36247).mo5147() + m23803()) == -1) {
                    c5636.getClass();
                    c5636.write("#invalid payload reference\n", 0, 27);
                    z2 = true;
                }
            }
            if (enumC3167Mo6217.m5451()) {
                this.f36246.f7058.getClass();
                if (this.f36246.f7058.f75161 >= 14 || (!enumC3167Mo6217.m5448() && enumC3167Mo6217 != EnumC3167.f5985)) {
                    c5636.getClass();
                    c5636.write("#disallowed odex opcode\n", 0, 24);
                    z2 = true;
                }
            }
            if (z2) {
                c5636.getClass();
                c5636.write("#", i2, 1);
            }
            switch (C4170.f9189[this.f36247.mo6217().f6090.ordinal()]) {
                case 1:
                    m29526(c5636);
                    c5636.write(32);
                    mo29528(c5636);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015 || this.f36247.mo6217() == EnumC3167.f5983) {
                        c5636.getClass();
                        c5636.write("\nreturn-void", 0, 12);
                        return true;
                    }
                    c5636.getClass();
                    c5636.write("\nnop", 0, 4);
                    return true;
                case 2:
                    if (this.f36247 instanceof InterfaceC4886) {
                        c5636.getClass();
                        c5636.write("#unknown opcode: 0x", 0, 19);
                        c5636.mo12535(((InterfaceC4886) this.f36247).mo4378());
                        c5636.write(10);
                    }
                    m29526(c5636);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 3:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    C6852.m15693(c5636, ((InterfaceC11436) this.f36247).mo7162());
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 4:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 5:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    m29524(c5636);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 6:
                    m29526(c5636);
                    c5636.write(32);
                    c5636.write(str);
                    c5636.write(", ", 0, 2);
                    m29519(c5636, interfaceC10250, r9, strM6319);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 7:
                case 8:
                    m29526(c5636);
                    c5636.write(32);
                    mo29528(c5636);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 9:
                case 10:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    m29519(c5636, interfaceC10250, r9, strM6319);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    C6852.m15693(c5636, ((InterfaceC11436) this.f36247).mo7162());
                    if (this.f36246.f7058.f75164) {
                        if (this.f36247.mo6217().m5447()) {
                            m29518(c5636, ((InterfaceC11436) this.f36247).mo7162());
                        } else if (!m29521(c5636, ((InterfaceC15202) this.f36247).mo7161())) {
                            m29520(c5636, ((InterfaceC15202) this.f36247).mo7161());
                        }
                    }
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 16:
                case 17:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    mo29528(c5636);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 18:
                case 19:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    m29524(c5636);
                    c5636.write(", ", 0, 2);
                    C6852.m15693(c5636, ((InterfaceC11436) this.f36247).mo7162());
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 20:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    m29524(c5636);
                    c5636.write(", ", 0, 2);
                    m29519(c5636, interfaceC10250, r9, strM6319);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 21:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    m29524(c5636);
                    c5636.write(", ", 0, 2);
                    c5636.write("field@0x", 0, 8);
                    c5636.mo12535(((InterfaceC13862) this.f36247).mo16292());
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 22:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    m29524(c5636);
                    c5636.write(", ", 0, 2);
                    mo29528(c5636);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 23:
                case 24:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    m29524(c5636);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 25:
                    m29526(c5636);
                    c5636.write(32);
                    m29522(c5636);
                    c5636.write(", ", 0, 2);
                    m29524(c5636);
                    c5636.write(", ", 0, 2);
                    m29523(c5636, ((InterfaceC16128) this.f36247).mo9979());
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 26:
                    m29526(c5636);
                    c5636.write(32);
                    m29527(c5636);
                    c5636.write(", ", 0, 2);
                    m29519(c5636, interfaceC10250, r9, strM6319);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 27:
                    i3 = 0;
                    i4 = 2;
                    m29526(c5636);
                    c5636.write(32);
                    m29527(c5636);
                    c5636.write(", ", i3, i4);
                    c5636.write("inline@", i3, 7);
                    c5636.m12534(((InterfaceC13192) this.f36247).mo23505());
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 28:
                    i5 = 0;
                    i6 = 2;
                    m29526(c5636);
                    c5636.write(32);
                    m29527(c5636);
                    c5636.write(", ", i5, i6);
                    c5636.write("vtable@", i5, 7);
                    c5636.m12534(((InterfaceC22165) this.f36247).mo36892());
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 29:
                    m29526(c5636);
                    c5636.write(32);
                    m29525(c5636);
                    c5636.write(", ", 0, 2);
                    m29519(c5636, interfaceC10250, r9, strM6319);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 30:
                    i3 = 0;
                    i4 = 2;
                    m29526(c5636);
                    c5636.write(32);
                    m29525(c5636);
                    c5636.write(", ", i3, i4);
                    c5636.write("inline@", i3, 7);
                    c5636.m12534(((InterfaceC13192) this.f36247).mo23505());
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 31:
                    i5 = 0;
                    i6 = 2;
                    m29526(c5636);
                    c5636.write(32);
                    m29525(c5636);
                    c5636.write(", ", i5, i6);
                    c5636.write("vtable@", i5, 7);
                    c5636.m12534(((InterfaceC22165) this.f36247).mo36892());
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 32:
                    m29526(c5636);
                    c5636.write(32);
                    m29527(c5636);
                    c5636.write(", ", 0, 2);
                    m29519(c5636, interfaceC10250, r9, strM6319);
                    c5636.write(", ", 0, 2);
                    m29519(c5636, interfaceC10250Mo11754, i, strM63110);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                case 33:
                    m29526(c5636);
                    c5636.write(32);
                    m29525(c5636);
                    c5636.write(", ", 0, 2);
                    m29519(c5636, interfaceC10250, r9, strM6319);
                    c5636.write(", ", 0, 2);
                    m29519(c5636, interfaceC10250Mo11754, i, strM63110);
                    if (z2) {
                        return true;
                    }
                    if (this.f36247.mo6217() != EnumC3167.f6015) {
                        break;
                    }
                    c5636.getClass();
                    c5636.write("\nreturn-void", 0, 12);
                    return true;
                default:
                    return false;
            }
        }
        r8 = 0;
        strM6319 = null;
        interfaceC10250 = null;
        str2 = null;
        z = false;
        interfaceC10250Mo11754 = null;
        r10 = r8;
        i = 0;
        String str5 = str2;
        z2 = z;
        strM63110 = str5;
        r9 = r10;
        interfaceC23920 = this.f36247;
        if (interfaceC23920 instanceof InterfaceC9423) {
            i7 = C4170.f9190[interfaceC23920.mo6217().ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        throw new C17034(null, "Invalid 31t opcode: %s", this.f36247.mo6217());
                    }
                    this.f36246.m6255(m23803() + ((InterfaceC9423) this.f36247).mo5147(), EnumC3167.f5951);
                } else if (this.f36246.m6258(((InterfaceC9423) this.f36247).mo5147() + m23803()) == -1) {
                    c5636.getClass();
                    c5636.write("#invalid payload reference\n", 0, 27);
                    z2 = true;
                }
            } else if (this.f36246.m6254(((InterfaceC9423) this.f36247).mo5147() + m23803()) == -1) {
                c5636.getClass();
                c5636.write("#invalid payload reference\n", 0, 27);
                z2 = true;
            }
        }
        if (enumC3167Mo6217.m5451()) {
            this.f36246.f7058.getClass();
            i2 = this.f36246.f7058.f75161 >= 14 ? 0 : 0;
            c5636.getClass();
            c5636.write("#disallowed odex opcode\n", 0, 24);
            z2 = true;
        }
        if (z2) {
            c5636.getClass();
            c5636.write("#", i2, 1);
        }
        switch (C4170.f9189[this.f36247.mo6217().f6090.ordinal()]) {
            case 1:
                m29526(c5636);
                c5636.write(32);
                mo29528(c5636);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 2:
                if (this.f36247 instanceof InterfaceC4886) {
                    c5636.getClass();
                    c5636.write("#unknown opcode: 0x", 0, 19);
                    c5636.mo12535(((InterfaceC4886) this.f36247).mo4378());
                    c5636.write(10);
                }
                m29526(c5636);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 3:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                C6852.m15693(c5636, ((InterfaceC11436) this.f36247).mo7162());
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 4:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 5:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                m29524(c5636);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 6:
                m29526(c5636);
                c5636.write(32);
                c5636.write(str);
                c5636.write(", ", 0, 2);
                m29519(c5636, interfaceC10250, r9, strM6319);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 7:
            case 8:
                m29526(c5636);
                c5636.write(32);
                mo29528(c5636);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 9:
            case 10:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                m29519(c5636, interfaceC10250, r9, strM6319);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                C6852.m15693(c5636, ((InterfaceC11436) this.f36247).mo7162());
                if (this.f36246.f7058.f75164) {
                    if (this.f36247.mo6217().m5447()) {
                        m29518(c5636, ((InterfaceC11436) this.f36247).mo7162());
                    } else if (!m29521(c5636, ((InterfaceC15202) this.f36247).mo7161())) {
                        m29520(c5636, ((InterfaceC15202) this.f36247).mo7161());
                    }
                }
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 16:
            case 17:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                mo29528(c5636);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 18:
            case 19:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                m29524(c5636);
                c5636.write(", ", 0, 2);
                C6852.m15693(c5636, ((InterfaceC11436) this.f36247).mo7162());
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 20:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                m29524(c5636);
                c5636.write(", ", 0, 2);
                m29519(c5636, interfaceC10250, r9, strM6319);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 21:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                m29524(c5636);
                c5636.write(", ", 0, 2);
                c5636.write("field@0x", 0, 8);
                c5636.mo12535(((InterfaceC13862) this.f36247).mo16292());
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 22:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                m29524(c5636);
                c5636.write(", ", 0, 2);
                mo29528(c5636);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 23:
            case 24:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                m29524(c5636);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 25:
                m29526(c5636);
                c5636.write(32);
                m29522(c5636);
                c5636.write(", ", 0, 2);
                m29524(c5636);
                c5636.write(", ", 0, 2);
                m29523(c5636, ((InterfaceC16128) this.f36247).mo9979());
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 26:
                m29526(c5636);
                c5636.write(32);
                m29527(c5636);
                c5636.write(", ", 0, 2);
                m29519(c5636, interfaceC10250, r9, strM6319);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 27:
                i3 = 0;
                i4 = 2;
                m29526(c5636);
                c5636.write(32);
                m29527(c5636);
                c5636.write(", ", i3, i4);
                c5636.write("inline@", i3, 7);
                c5636.m12534(((InterfaceC13192) this.f36247).mo23505());
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 28:
                i5 = 0;
                i6 = 2;
                m29526(c5636);
                c5636.write(32);
                m29527(c5636);
                c5636.write(", ", i5, i6);
                c5636.write("vtable@", i5, 7);
                c5636.m12534(((InterfaceC22165) this.f36247).mo36892());
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 29:
                m29526(c5636);
                c5636.write(32);
                m29525(c5636);
                c5636.write(", ", 0, 2);
                m29519(c5636, interfaceC10250, r9, strM6319);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 30:
                i3 = 0;
                i4 = 2;
                m29526(c5636);
                c5636.write(32);
                m29525(c5636);
                c5636.write(", ", i3, i4);
                c5636.write("inline@", i3, 7);
                c5636.m12534(((InterfaceC13192) this.f36247).mo23505());
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 31:
                i5 = 0;
                i6 = 2;
                m29526(c5636);
                c5636.write(32);
                m29525(c5636);
                c5636.write(", ", i5, i6);
                c5636.write("vtable@", i5, 7);
                c5636.m12534(((InterfaceC22165) this.f36247).mo36892());
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 32:
                m29526(c5636);
                c5636.write(32);
                m29527(c5636);
                c5636.write(", ", 0, 2);
                m29519(c5636, interfaceC10250, r9, strM6319);
                c5636.write(", ", 0, 2);
                m29519(c5636, interfaceC10250Mo11754, i, strM63110);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            case 33:
                m29526(c5636);
                c5636.write(32);
                m29525(c5636);
                c5636.write(", ", 0, 2);
                m29519(c5636, interfaceC10250, r9, strM6319);
                c5636.write(", ", 0, 2);
                m29519(c5636, interfaceC10250Mo11754, i, strM63110);
                if (z2) {
                    return true;
                }
                if (this.f36247.mo6217() != EnumC3167.f6015) {
                    break;
                }
                c5636.getClass();
                c5636.write("\nreturn-void", 0, 12);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m29526(C5636 c5636) throws IOException {
        c5636.mo12533(this.f36247.mo6217());
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo29528(C5636 c5636) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29523(C5636 c5636, int i) throws IOException {
        this.f36246.f7060.m38481(c5636, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29522(C5636 c5636) throws IOException {
        m29523(c5636, ((InterfaceC4059) this.f36247).mo4189());
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m29524(C5636 c5636) throws IOException {
        m29523(c5636, ((InterfaceC24846) this.f36247).mo9978());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m29527(C5636 c5636) throws IOException {
        InterfaceC11851 interfaceC11851 = (InterfaceC11851) this.f36247;
        int iMo5886 = interfaceC11851.mo5886();
        c5636.write(123);
        if (iMo5886 == 1) {
            m29523(c5636, interfaceC11851.mo5885());
        } else if (iMo5886 == 2) {
            m29523(c5636, interfaceC11851.mo5885());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5883());
        } else if (iMo5886 == 3) {
            m29523(c5636, interfaceC11851.mo5885());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5883());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5882());
        } else if (iMo5886 == 4) {
            m29523(c5636, interfaceC11851.mo5885());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5883());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5882());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5884());
        } else if (iMo5886 == 5) {
            m29523(c5636, interfaceC11851.mo5885());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5883());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5882());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5884());
            c5636.write(", ", 0, 2);
            m29523(c5636, interfaceC11851.mo5881());
        }
        c5636.write(C0254q.f1218h);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m29525(C5636 c5636) throws IOException {
        InterfaceC18140 interfaceC18140 = (InterfaceC18140) this.f36247;
        int iMo5886 = interfaceC18140.mo5886();
        if (iMo5886 == 0) {
            c5636.getClass();
            c5636.write("{}", 0, 2);
            return;
        }
        int iMo11756 = interfaceC18140.mo11756();
        C16909 c16909 = this.f36246.f7060;
        int i = (iMo5886 + iMo11756) - 1;
        int i2 = c16909.f50066;
        int i3 = c16909.f50067;
        c16909.f50065.getClass();
        int i4 = i3 - i2;
        if (iMo11756 >= i4) {
            c5636.getClass();
            c5636.write("{p", 0, 2);
            c5636.m12534(iMo11756 - i4);
            c5636.write(" .. p", 0, 5);
            c5636.m12534(i - i4);
            c5636.write(C0254q.f1218h);
            return;
        }
        c5636.getClass();
        c5636.write("{v", 0, 2);
        c5636.m12534(iMo11756);
        c5636.write(" .. v", 0, 5);
        c5636.m12534(i);
        c5636.write(C0254q.f1218h);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m29520(C5636 c5636, int i) throws IOException {
        if (C8318.m19209(i)) {
            c5636.getClass();
            c5636.write("  # ", 0, 4);
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            if (fIntBitsToFloat == Float.POSITIVE_INFINITY) {
                c5636.write("Float.POSITIVE_INFINITY", 0, 23);
                return;
            }
            if (fIntBitsToFloat == Float.NEGATIVE_INFINITY) {
                c5636.write("Float.NEGATIVE_INFINITY", 0, 23);
                return;
            }
            if (Float.isNaN(fIntBitsToFloat)) {
                c5636.write("Float.NaN", 0, 9);
                return;
            }
            if (fIntBitsToFloat == Float.MAX_VALUE) {
                c5636.write("Float.MAX_VALUE", 0, 15);
                return;
            }
            if (fIntBitsToFloat == 3.1415927f) {
                c5636.write("(float)Math.PI", 0, 14);
            } else if (fIntBitsToFloat == 2.7182817f) {
                c5636.write("(float)Math.E", 0, 13);
            } else {
                c5636.write(Float.toString(fIntBitsToFloat));
                c5636.write(IShizukuService.Stub.TRANSACTION_attachUserService);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29518(C5636 c5636, long j) throws IOException {
        if (C8318.m19210(j)) {
            c5636.getClass();
            c5636.write("  # ", 0, 4);
            double dLongBitsToDouble = Double.longBitsToDouble(j);
            if (dLongBitsToDouble == Double.POSITIVE_INFINITY) {
                c5636.write("Double.POSITIVE_INFINITY", 0, 24);
                return;
            }
            if (dLongBitsToDouble == Double.NEGATIVE_INFINITY) {
                c5636.write("Double.NEGATIVE_INFINITY", 0, 24);
                return;
            }
            if (Double.isNaN(dLongBitsToDouble)) {
                c5636.write("Double.NaN", 0, 10);
                return;
            }
            if (dLongBitsToDouble == Double.MAX_VALUE) {
                c5636.write("Double.MAX_VALUE", 0, 16);
                return;
            }
            if (dLongBitsToDouble == 3.141592653589793d) {
                c5636.write("Math.PI", 0, 7);
            } else if (dLongBitsToDouble == 2.718281828459045d) {
                c5636.write("Math.E", 0, 6);
            } else {
                c5636.write(Double.toString(dLongBitsToDouble));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29521(C5636 c5636, int i) throws IOException {
        String str = (String) this.f36246.f7058.f75162.get(i);
        if (str == null) {
            return false;
        }
        c5636.getClass();
        c5636.write("    # ", 0, 6);
        c5636.write(str, 0, str.length());
        return true;
    }
}
