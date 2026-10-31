package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B60R */
/* JADX INFO: loaded from: classes4.dex */
public class C11069 extends AbstractC8246 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0225 f33243 = new C0225(1000);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1190 f33244;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC22677 f33245;

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ۧ */
    public final double mo1619() {
        return 100.0d;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11069 m27455(C1190 c1190, int i, InterfaceC22677 interfaceC22677) {
        C11069 c11069 = (C11069) f33243.m1479();
        if (c11069 != null) {
            c11069.f25384 = i;
            c11069.f33244 = c1190;
            c11069.f33245 = interfaceC22677;
            return c11069;
        }
        return new C11069(c1190, i, interfaceC22677);
    }

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ܿ */
    public void mo12088() {
        this.f33245 = null;
        this.f33244 = null;
        f33243.m1477(this);
    }

    public C11069(C1190 c1190, int i, InterfaceC22677 interfaceC22677) {
        super(i);
        this.f33244 = c1190;
        this.f33245 = interfaceC22677;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27457(C3438 c3438, InterfaceC8293 interfaceC8293, int i, String str) throws IOException {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c3438.write(str);
                    return;
                }
                throw new RuntimeException();
            }
            InterfaceC4060 interfaceC4060 = (InterfaceC4060) interfaceC8293;
            c3438.write(interfaceC4060.getName());
            c3438.write(40);
            c3438.write(34);
            C14020.m33624(c3438, interfaceC4060.mo12183());
            c3438.write(34);
            c3438.write(", ", 0, 2);
            C14354.m34252(c3438, interfaceC4060.mo12182());
            for (InterfaceC10410 interfaceC10410 : interfaceC4060.mo12181()) {
                c3438.write(", ", 0, 2);
                AbstractC11569.m28462(c3438, interfaceC10410);
            }
            c3438.write(")@", 0, 2);
            if (interfaceC4060.mo12184().mo2849() != 4) {
                throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
            }
            C14354.m34253((Writer) c3438, (InterfaceC5471) interfaceC4060.mo12184().mo2850(), false);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC15347) {
            InterfaceC15347 interfaceC15347 = (InterfaceC15347) interfaceC8293;
            c3438.write(34);
            if (interfaceC15347 instanceof C13143) {
                C13143 c13143 = (C13143) interfaceC15347;
                c13143.f39302.m31406(c13143.f39303, c3438, true);
            } else {
                C14020.m33624(c3438, interfaceC15347.getString());
            }
            c3438.write(34);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC21699) {
            InterfaceC21699 interfaceC21699 = (InterfaceC21699) interfaceC8293;
            if (interfaceC21699 instanceof C12438) {
                C12438 c12438 = (C12438) interfaceC21699;
                c12438.f37432.m31386(c3438, c12438.f37433);
                return;
            } else {
                c3438.write(interfaceC21699.getType());
                return;
            }
        }
        if (interfaceC8293 instanceof InterfaceC18877) {
            C14354.m34254((Writer) c3438, (InterfaceC18877) interfaceC8293, false);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC5471) {
            C14354.m34253((Writer) c3438, (InterfaceC5471) interfaceC8293, false);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC0531) {
            C14354.m34252(c3438, (InterfaceC0531) interfaceC8293);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC19583) {
            C14354.m34255(c3438, (InterfaceC19583) interfaceC8293);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC4060) {
            InterfaceC4060 interfaceC4061 = (InterfaceC4060) interfaceC8293;
            c3438.write(interfaceC4061.getName());
            c3438.write(40);
            c3438.write(34);
            C14020.m33624(c3438, interfaceC4061.mo12183());
            c3438.write(34);
            c3438.write(", ");
            C14354.m34252(c3438, interfaceC4061.mo12182());
            for (InterfaceC10410 interfaceC10411 : interfaceC4061.mo12181()) {
                c3438.write(", ");
                C6385.m17700(c3438, interfaceC10411);
            }
            c3438.write(")@");
            if (interfaceC4061.mo12184().mo2849() == 4) {
                C14354.m34253((Writer) c3438, (InterfaceC5471) interfaceC4061.mo12184().mo2850(), false);
                return;
            }
            throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
        }
        throw new IOException("Unknown reference: " + interfaceC8293);
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
    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1618(C3438 c3438) throws IOException {
        String str;
        ?? r8;
        String strM4075;
        InterfaceC8293 interfaceC8293;
        String str2;
        boolean z;
        InterfaceC8293 interfaceC8293Mo9710;
        ?? r9;
        int i;
        boolean z2;
        String strM4076;
        InterfaceC22677 interfaceC22677;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ?? r10;
        InterfaceC8293 reference;
        ?? r11;
        String str3;
        EnumC0841 enumC0841Mo3975 = this.f33245.mo3975();
        InterfaceC22677 interfaceC22678 = this.f33245;
        if (interfaceC22678 instanceof InterfaceC0367) {
            int iMo1819 = ((InterfaceC0367) interfaceC22678).mo1819();
            int i8 = C22009.f70561;
            str = "generic-error";
            switch (iMo1819) {
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
                c3438.getClass();
                c3438.write("#was invalid verification error type: ", 0, 38);
                c3438.m10510(iMo1819);
                c3438.write("\n", 0, 1);
            } else {
                str = str3;
            }
        } else {
            str = null;
        }
        InterfaceC22677 interfaceC22679 = this.f33245;
        if (interfaceC22679 instanceof InterfaceC10952) {
            InterfaceC10952 interfaceC10952 = (InterfaceC10952) interfaceC22679;
            this.f33244.f4289.getClass();
            try {
                reference = interfaceC10952.getReference();
                try {
                    reference.mo10018();
                    strM4075 = null;
                    interfaceC8293 = reference;
                    r11 = reference instanceof InterfaceC4060;
                    z = false;
                } catch (C1237 e) {
                    e = e;
                    c3438.getClass();
                    c3438.write("#", 0, 1);
                    c3438.write(e.getMessage());
                    c3438.write("\n", 0, 1);
                    strM4075 = e.m4075();
                    z = true;
                    interfaceC8293 = reference;
                    r11 = 2;
                }
            } catch (C1237 e2) {
                e = e2;
                reference = null;
            }
            InterfaceC22677 interfaceC226710 = this.f33245;
            if (interfaceC226710 instanceof InterfaceC12799) {
                try {
                    interfaceC8293Mo9710 = ((InterfaceC12799) interfaceC226710).mo9710();
                    try {
                        interfaceC8293Mo9710.mo10018();
                        str2 = null;
                        r10 = r11;
                        i = 0;
                        String str4 = str2;
                        z2 = z;
                        strM4076 = str4;
                        r9 = r10;
                    } catch (C1237 e3) {
                        e = e3;
                        c3438.getClass();
                        c3438.write("#", 0, 1);
                        c3438.write(e.getMessage());
                        c3438.write("\n", 0, 1);
                        strM4076 = e.m4075();
                        z2 = true;
                        i = 2;
                        r9 = r11;
                    }
                } catch (C1237 e4) {
                    e = e4;
                    interfaceC8293Mo9710 = null;
                }
            } else {
                str2 = null;
                r8 = r11;
            }
            interfaceC22677 = this.f33245;
            if (interfaceC22677 instanceof InterfaceC7423) {
                i7 = C1896.f6409[interfaceC22677.mo3975().ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            throw new C15431(null, "Invalid 31t opcode: %s", this.f33245.mo3975());
                        }
                        try {
                            this.f33244.m4013(m21833() + ((InterfaceC7423) this.f33245).mo2818(), EnumC0841.f3177);
                        } catch (C0484 unused) {
                            c3438.getClass();
                            c3438.write("#invalid payload reference\n", 0, 27);
                            z2 = true;
                        }
                    } else if (this.f33244.m4016(((InterfaceC7423) this.f33245).mo2818() + m21833()) == -1) {
                        c3438.getClass();
                        c3438.write("#invalid payload reference\n", 0, 27);
                        z2 = true;
                    }
                } else if (this.f33244.m4012(((InterfaceC7423) this.f33245).mo2818() + m21833()) == -1) {
                    c3438.getClass();
                    c3438.write("#invalid payload reference\n", 0, 27);
                    z2 = true;
                }
            }
            if (enumC0841Mo3975.m3137()) {
                this.f33244.f4289.getClass();
                if (this.f33244.f4289.f72435 >= 14 || (!enumC0841Mo3975.m3134() && enumC0841Mo3975 != EnumC0841.f3211)) {
                    c3438.getClass();
                    c3438.write("#disallowed odex opcode\n", 0, 24);
                    z2 = true;
                }
            }
            if (z2) {
                c3438.getClass();
                c3438.write("#", i2, 1);
            }
            switch (C1896.f6408[this.f33245.mo3975().f3316.ordinal()]) {
                case 1:
                    m27464(c3438);
                    c3438.write(32);
                    mo27466(c3438);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241 || this.f33245.mo3975() == EnumC0841.f3209) {
                        c3438.getClass();
                        c3438.write("\nreturn-void", 0, 12);
                        return true;
                    }
                    c3438.getClass();
                    c3438.write("\nnop", 0, 4);
                    return true;
                case 2:
                    if (this.f33245 instanceof InterfaceC2649) {
                        c3438.getClass();
                        c3438.write("#unknown opcode: 0x", 0, 19);
                        c3438.mo10511(((InterfaceC2649) this.f33245).mo2002());
                        c3438.write(10);
                    }
                    m27464(c3438);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 3:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    C4718.m13817(c3438, ((InterfaceC9541) this.f33245).mo4920());
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 4:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 5:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    m27462(c3438);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 6:
                    m27464(c3438);
                    c3438.write(32);
                    c3438.write(str);
                    c3438.write(", ", 0, 2);
                    m27457(c3438, interfaceC8293, r9, strM4075);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 7:
                case 8:
                    m27464(c3438);
                    c3438.write(32);
                    mo27466(c3438);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 9:
                case 10:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    m27457(c3438, interfaceC8293, r9, strM4075);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    C4718.m13817(c3438, ((InterfaceC9541) this.f33245).mo4920());
                    if (this.f33244.f4289.f72438) {
                        if (this.f33245.mo3975().m3133()) {
                            m27456(c3438, ((InterfaceC9541) this.f33245).mo4920());
                        } else if (!m27459(c3438, ((InterfaceC13504) this.f33245).mo4919())) {
                            m27458(c3438, ((InterfaceC13504) this.f33245).mo4919());
                        }
                    }
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 16:
                case 17:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    mo27466(c3438);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 18:
                case 19:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    m27462(c3438);
                    c3438.write(", ", 0, 2);
                    C4718.m13817(c3438, ((InterfaceC9541) this.f33245).mo4920());
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 20:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    m27462(c3438);
                    c3438.write(", ", 0, 2);
                    m27457(c3438, interfaceC8293, r9, strM4075);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 21:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    m27462(c3438);
                    c3438.write(", ", 0, 2);
                    c3438.write("field@0x", 0, 8);
                    c3438.mo10511(((InterfaceC12094) this.f33245).mo14389());
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 22:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    m27462(c3438);
                    c3438.write(", ", 0, 2);
                    mo27466(c3438);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 23:
                case 24:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    m27462(c3438);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 25:
                    m27464(c3438);
                    c3438.write(32);
                    m27460(c3438);
                    c3438.write(", ", 0, 2);
                    m27462(c3438);
                    c3438.write(", ", 0, 2);
                    m27461(c3438, ((InterfaceC14478) this.f33245).mo7931());
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 26:
                    m27464(c3438);
                    c3438.write(32);
                    m27465(c3438);
                    c3438.write(", ", 0, 2);
                    m27457(c3438, interfaceC8293, r9, strM4075);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 27:
                    i3 = 0;
                    i4 = 2;
                    m27464(c3438);
                    c3438.write(32);
                    m27465(c3438);
                    c3438.write(", ", i3, i4);
                    c3438.write("inline@", i3, 7);
                    c3438.m10510(((InterfaceC11389) this.f33245).mo21537());
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 28:
                    i5 = 0;
                    i6 = 2;
                    m27464(c3438);
                    c3438.write(32);
                    m27465(c3438);
                    c3438.write(", ", i5, i6);
                    c3438.write("vtable@", i5, 7);
                    c3438.m10510(((InterfaceC20830) this.f33245).mo34743());
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 29:
                    m27464(c3438);
                    c3438.write(32);
                    m27463(c3438);
                    c3438.write(", ", 0, 2);
                    m27457(c3438, interfaceC8293, r9, strM4075);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 30:
                    i3 = 0;
                    i4 = 2;
                    m27464(c3438);
                    c3438.write(32);
                    m27463(c3438);
                    c3438.write(", ", i3, i4);
                    c3438.write("inline@", i3, 7);
                    c3438.m10510(((InterfaceC11389) this.f33245).mo21537());
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 31:
                    i5 = 0;
                    i6 = 2;
                    m27464(c3438);
                    c3438.write(32);
                    m27463(c3438);
                    c3438.write(", ", i5, i6);
                    c3438.write("vtable@", i5, 7);
                    c3438.m10510(((InterfaceC20830) this.f33245).mo34743());
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 32:
                    m27464(c3438);
                    c3438.write(32);
                    m27465(c3438);
                    c3438.write(", ", 0, 2);
                    m27457(c3438, interfaceC8293, r9, strM4075);
                    c3438.write(", ", 0, 2);
                    m27457(c3438, interfaceC8293Mo9710, i, strM4076);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                case 33:
                    m27464(c3438);
                    c3438.write(32);
                    m27463(c3438);
                    c3438.write(", ", 0, 2);
                    m27457(c3438, interfaceC8293, r9, strM4075);
                    c3438.write(", ", 0, 2);
                    m27457(c3438, interfaceC8293Mo9710, i, strM4076);
                    if (z2) {
                        return true;
                    }
                    if (this.f33245.mo3975() != EnumC0841.f3241) {
                        break;
                    }
                    c3438.getClass();
                    c3438.write("\nreturn-void", 0, 12);
                    return true;
                default:
                    return false;
            }
        }
        r8 = 0;
        strM4075 = null;
        interfaceC8293 = null;
        str2 = null;
        z = false;
        interfaceC8293Mo9710 = null;
        r10 = r8;
        i = 0;
        String str5 = str2;
        z2 = z;
        strM4076 = str5;
        r9 = r10;
        interfaceC22677 = this.f33245;
        if (interfaceC22677 instanceof InterfaceC7423) {
            i7 = C1896.f6409[interfaceC22677.mo3975().ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        throw new C15431(null, "Invalid 31t opcode: %s", this.f33245.mo3975());
                    }
                    this.f33244.m4013(m21833() + ((InterfaceC7423) this.f33245).mo2818(), EnumC0841.f3177);
                } else if (this.f33244.m4016(((InterfaceC7423) this.f33245).mo2818() + m21833()) == -1) {
                    c3438.getClass();
                    c3438.write("#invalid payload reference\n", 0, 27);
                    z2 = true;
                }
            } else if (this.f33244.m4012(((InterfaceC7423) this.f33245).mo2818() + m21833()) == -1) {
                c3438.getClass();
                c3438.write("#invalid payload reference\n", 0, 27);
                z2 = true;
            }
        }
        if (enumC0841Mo3975.m3137()) {
            this.f33244.f4289.getClass();
            i2 = this.f33244.f4289.f72435 >= 14 ? 0 : 0;
            c3438.getClass();
            c3438.write("#disallowed odex opcode\n", 0, 24);
            z2 = true;
        }
        if (z2) {
            c3438.getClass();
            c3438.write("#", i2, 1);
        }
        switch (C1896.f6408[this.f33245.mo3975().f3316.ordinal()]) {
            case 1:
                m27464(c3438);
                c3438.write(32);
                mo27466(c3438);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 2:
                if (this.f33245 instanceof InterfaceC2649) {
                    c3438.getClass();
                    c3438.write("#unknown opcode: 0x", 0, 19);
                    c3438.mo10511(((InterfaceC2649) this.f33245).mo2002());
                    c3438.write(10);
                }
                m27464(c3438);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 3:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                C4718.m13817(c3438, ((InterfaceC9541) this.f33245).mo4920());
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 4:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 5:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                m27462(c3438);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 6:
                m27464(c3438);
                c3438.write(32);
                c3438.write(str);
                c3438.write(", ", 0, 2);
                m27457(c3438, interfaceC8293, r9, strM4075);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 7:
            case 8:
                m27464(c3438);
                c3438.write(32);
                mo27466(c3438);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 9:
            case 10:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                m27457(c3438, interfaceC8293, r9, strM4075);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                C4718.m13817(c3438, ((InterfaceC9541) this.f33245).mo4920());
                if (this.f33244.f4289.f72438) {
                    if (this.f33245.mo3975().m3133()) {
                        m27456(c3438, ((InterfaceC9541) this.f33245).mo4920());
                    } else if (!m27459(c3438, ((InterfaceC13504) this.f33245).mo4919())) {
                        m27458(c3438, ((InterfaceC13504) this.f33245).mo4919());
                    }
                }
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 16:
            case 17:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                mo27466(c3438);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 18:
            case 19:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                m27462(c3438);
                c3438.write(", ", 0, 2);
                C4718.m13817(c3438, ((InterfaceC9541) this.f33245).mo4920());
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 20:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                m27462(c3438);
                c3438.write(", ", 0, 2);
                m27457(c3438, interfaceC8293, r9, strM4075);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 21:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                m27462(c3438);
                c3438.write(", ", 0, 2);
                c3438.write("field@0x", 0, 8);
                c3438.mo10511(((InterfaceC12094) this.f33245).mo14389());
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 22:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                m27462(c3438);
                c3438.write(", ", 0, 2);
                mo27466(c3438);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 23:
            case 24:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                m27462(c3438);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 25:
                m27464(c3438);
                c3438.write(32);
                m27460(c3438);
                c3438.write(", ", 0, 2);
                m27462(c3438);
                c3438.write(", ", 0, 2);
                m27461(c3438, ((InterfaceC14478) this.f33245).mo7931());
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 26:
                m27464(c3438);
                c3438.write(32);
                m27465(c3438);
                c3438.write(", ", 0, 2);
                m27457(c3438, interfaceC8293, r9, strM4075);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 27:
                i3 = 0;
                i4 = 2;
                m27464(c3438);
                c3438.write(32);
                m27465(c3438);
                c3438.write(", ", i3, i4);
                c3438.write("inline@", i3, 7);
                c3438.m10510(((InterfaceC11389) this.f33245).mo21537());
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 28:
                i5 = 0;
                i6 = 2;
                m27464(c3438);
                c3438.write(32);
                m27465(c3438);
                c3438.write(", ", i5, i6);
                c3438.write("vtable@", i5, 7);
                c3438.m10510(((InterfaceC20830) this.f33245).mo34743());
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 29:
                m27464(c3438);
                c3438.write(32);
                m27463(c3438);
                c3438.write(", ", 0, 2);
                m27457(c3438, interfaceC8293, r9, strM4075);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 30:
                i3 = 0;
                i4 = 2;
                m27464(c3438);
                c3438.write(32);
                m27463(c3438);
                c3438.write(", ", i3, i4);
                c3438.write("inline@", i3, 7);
                c3438.m10510(((InterfaceC11389) this.f33245).mo21537());
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 31:
                i5 = 0;
                i6 = 2;
                m27464(c3438);
                c3438.write(32);
                m27463(c3438);
                c3438.write(", ", i5, i6);
                c3438.write("vtable@", i5, 7);
                c3438.m10510(((InterfaceC20830) this.f33245).mo34743());
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 32:
                m27464(c3438);
                c3438.write(32);
                m27465(c3438);
                c3438.write(", ", 0, 2);
                m27457(c3438, interfaceC8293, r9, strM4075);
                c3438.write(", ", 0, 2);
                m27457(c3438, interfaceC8293Mo9710, i, strM4076);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            case 33:
                m27464(c3438);
                c3438.write(32);
                m27463(c3438);
                c3438.write(", ", 0, 2);
                m27457(c3438, interfaceC8293, r9, strM4075);
                c3438.write(", ", 0, 2);
                m27457(c3438, interfaceC8293Mo9710, i, strM4076);
                if (z2) {
                    return true;
                }
                if (this.f33245.mo3975() != EnumC0841.f3241) {
                    break;
                }
                c3438.getClass();
                c3438.write("\nreturn-void", 0, 12);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m27464(C3438 c3438) throws IOException {
        c3438.mo10509(this.f33245.mo3975());
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo27466(C3438 c3438) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27461(C3438 c3438, int i) throws IOException {
        this.f33244.f4291.m36320(c3438, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27460(C3438 c3438) throws IOException {
        m27461(c3438, ((InterfaceC1779) this.f33245).mo1790());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m27462(C3438 c3438) throws IOException {
        m27461(c3438, ((InterfaceC23651) this.f33245).mo7930());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m27465(C3438 c3438) throws IOException {
        InterfaceC9978 interfaceC9978 = (InterfaceC9978) this.f33245;
        int iMo3615 = interfaceC9978.mo3615();
        c3438.write(123);
        if (iMo3615 == 1) {
            m27461(c3438, interfaceC9978.mo3614());
        } else if (iMo3615 == 2) {
            m27461(c3438, interfaceC9978.mo3614());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3612());
        } else if (iMo3615 == 3) {
            m27461(c3438, interfaceC9978.mo3614());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3612());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3611());
        } else if (iMo3615 == 4) {
            m27461(c3438, interfaceC9978.mo3614());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3612());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3611());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3613());
        } else if (iMo3615 == 5) {
            m27461(c3438, interfaceC9978.mo3614());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3612());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3611());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3613());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3610());
        }
        c3438.write(q.h);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27463(C3438 c3438) throws IOException {
        InterfaceC16595 interfaceC16595 = (InterfaceC16595) this.f33245;
        int iMo3615 = interfaceC16595.mo3615();
        if (iMo3615 == 0) {
            c3438.getClass();
            c3438.write("{}", 0, 2);
            return;
        }
        int iMo9712 = interfaceC16595.mo9712();
        C15300 c15300 = this.f33244.f4291;
        int i = (iMo3615 + iMo9712) - 1;
        int i2 = c15300.f46940;
        int i3 = c15300.f46941;
        c15300.f46939.getClass();
        int i4 = i3 - i2;
        if (iMo9712 >= i4) {
            c3438.getClass();
            c3438.write("{p", 0, 2);
            c3438.m10510(iMo9712 - i4);
            c3438.write(" .. p", 0, 5);
            c3438.m10510(i - i4);
            c3438.write(q.h);
            return;
        }
        c3438.getClass();
        c3438.write("{v", 0, 2);
        c3438.m10510(iMo9712);
        c3438.write(" .. v", 0, 5);
        c3438.m10510(i);
        c3438.write(q.h);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27458(C3438 c3438, int i) throws IOException {
        if (C6260.m17271(i)) {
            c3438.getClass();
            c3438.write("  # ", 0, 4);
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            if (fIntBitsToFloat == Float.POSITIVE_INFINITY) {
                c3438.write("Float.POSITIVE_INFINITY", 0, 23);
                return;
            }
            if (fIntBitsToFloat == Float.NEGATIVE_INFINITY) {
                c3438.write("Float.NEGATIVE_INFINITY", 0, 23);
                return;
            }
            if (Float.isNaN(fIntBitsToFloat)) {
                c3438.write("Float.NaN", 0, 9);
                return;
            }
            if (fIntBitsToFloat == Float.MAX_VALUE) {
                c3438.write("Float.MAX_VALUE", 0, 15);
                return;
            }
            if (fIntBitsToFloat == 3.1415927f) {
                c3438.write("(float)Math.PI", 0, 14);
            } else if (fIntBitsToFloat == 2.7182817f) {
                c3438.write("(float)Math.E", 0, 13);
            } else {
                c3438.write(Float.toString(fIntBitsToFloat));
                c3438.write(IShizukuService.Stub.TRANSACTION_attachUserService);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27456(C3438 c3438, long j) throws IOException {
        if (C6260.m17272(j)) {
            c3438.getClass();
            c3438.write("  # ", 0, 4);
            double dLongBitsToDouble = Double.longBitsToDouble(j);
            if (dLongBitsToDouble == Double.POSITIVE_INFINITY) {
                c3438.write("Double.POSITIVE_INFINITY", 0, 24);
                return;
            }
            if (dLongBitsToDouble == Double.NEGATIVE_INFINITY) {
                c3438.write("Double.NEGATIVE_INFINITY", 0, 24);
                return;
            }
            if (Double.isNaN(dLongBitsToDouble)) {
                c3438.write("Double.NaN", 0, 10);
                return;
            }
            if (dLongBitsToDouble == Double.MAX_VALUE) {
                c3438.write("Double.MAX_VALUE", 0, 16);
                return;
            }
            if (dLongBitsToDouble == 3.141592653589793d) {
                c3438.write("Math.PI", 0, 7);
            } else if (dLongBitsToDouble == 2.718281828459045d) {
                c3438.write("Math.E", 0, 6);
            } else {
                c3438.write(Double.toString(dLongBitsToDouble));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27459(C3438 c3438, int i) throws IOException {
        String str = (String) this.f33244.f4289.f72436.get(i);
        if (str == null) {
            return false;
        }
        c3438.getClass();
        c3438.write("    # ", 0, 6);
        c3438.write(str, 0, str.length());
        return true;
    }
}
