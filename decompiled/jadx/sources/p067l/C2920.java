package p067l;

import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.֡ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBE3 */
/* JADX INFO: loaded from: classes2.dex */
public class C2920 {

    /* JADX INFO: renamed from: ֫ */
    public int f5067;

    /* JADX INFO: renamed from: ۖ */
    public int f5068;

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC3830[] f5069;

    /* JADX INFO: renamed from: ۜ */
    public C9566 f5070;

    /* JADX INFO: renamed from: ۡ */
    public C22783 f5071;

    /* JADX INFO: renamed from: ۢ */
    public boolean f5072;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC3830[] f5073;

    /* JADX INFO: renamed from: ܳ */
    public int f5074;

    /* JADX INFO: renamed from: ܺ */
    public final C24318 f5075;

    /* JADX INFO: renamed from: ܽ */
    public C21027 f5076;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f5077;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC15405 f5078;

    /* JADX INFO: renamed from: ᩷ */
    public int f5079;

    /* JADX INFO: renamed from: ᩻ */
    public int f5080;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX INFO: renamed from: ֫ */
    public void mo4773(C14280 c14280, int i, int i2) {
        InterfaceC3830[] interfaceC3830Arr = this.f5069;
        if (i2 == 0) {
            this.f5068 = 0;
        } else if (i2 == 20) {
            m4770((InterfaceC3830) this.f5078);
        } else if (i2 == 21) {
            m4770(m4766(0));
        } else if (i2 != 171 && i2 != 172) {
            switch (i2) {
                case 0:
                case 79:
                    this.f5068 = 0;
                    break;
                case 18:
                    m4770((InterfaceC3830) this.f5078);
                    break;
                case 46:
                case 100:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case 108:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case 116:
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                case 122:
                case 124:
                case 126:
                case 128:
                case 130:
                    m4770((InterfaceC3830) this.f5070);
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    m4770(m4766(0));
                    break;
                default:
                    switch (i2) {
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                        case 88:
                            this.f5068 = 0;
                            break;
                        case 89:
                        case 90:
                        case 91:
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                        case 93:
                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                        case 95:
                            this.f5068 = 0;
                            for (int i3 = this.f5074; i3 != 0; i3 >>= 4) {
                                InterfaceC3830 interfaceC3830M4766 = m4766((i3 & 15) - 1);
                                if (interfaceC3830M4766 == null) {
                                    throw new NullPointerException("result == null");
                                }
                                int i4 = this.f5068;
                                interfaceC3830Arr[i4] = interfaceC3830M4766;
                                this.f5068 = i4 + 1;
                            }
                            break;
                        case 96:
                            m4770((InterfaceC3830) this.f5070);
                            break;
                        default:
                            switch (i2) {
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                case 136:
                                case 137:
                                case 138:
                                case 139:
                                case 140:
                                case 141:
                                case 142:
                                case 143:
                                case 144:
                                case 145:
                                case 146:
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                case 151:
                                case 152:
                                    m4770((InterfaceC3830) this.f5070);
                                    break;
                                case 153:
                                case EnumC19222.f57460 /* 154 */:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                case 161:
                                case 162:
                                case 163:
                                case 164:
                                case 165:
                                case 166:
                                case 167:
                                case 169:
                                    this.f5068 = 0;
                                    break;
                                case 168:
                                    m4770(new C12980(this.f5080));
                                    break;
                                default:
                                    switch (i2) {
                                        case 177:
                                        case 179:
                                        case 181:
                                        case 191:
                                        case 194:
                                        case 195:
                                            this.f5068 = 0;
                                            break;
                                        case 178:
                                        case 180:
                                        case 182:
                                        case 184:
                                        case 185:
                                            C9566 type = ((InterfaceC3830) this.f5078).getType();
                                            if (type == C9566.f26318) {
                                                this.f5068 = 0;
                                            } else {
                                                m4770((InterfaceC3830) type);
                                            }
                                            break;
                                        case 183:
                                            C9566 type2 = m4766(0).getType();
                                            if (type2.m22281()) {
                                                c14280.m32820(type2);
                                            }
                                            C9566 type3 = ((InterfaceC3830) this.f5078).getType();
                                            if (type3 == C9566.f26318) {
                                                this.f5068 = 0;
                                            } else {
                                                m4770((InterfaceC3830) type3);
                                            }
                                            break;
                                        case 186:
                                            C9566 c9566M54888 = ((C24989) this.f5078).m54888();
                                            if (c9566M54888 == C9566.f26318) {
                                                this.f5068 = 0;
                                            } else {
                                                m4770((InterfaceC3830) c9566M54888);
                                            }
                                            break;
                                        case 187:
                                            m4770((InterfaceC3830) ((C14260) this.f5078).m32771().m22280(i));
                                            break;
                                        case 188:
                                        case 192:
                                            m4770((InterfaceC3830) ((C14260) this.f5078).m32771());
                                            break;
                                        case 189:
                                            m4770((InterfaceC3830) ((C14260) this.f5078).m32771().m22284());
                                            break;
                                        case 190:
                                            m4770((InterfaceC3830) this.f5070);
                                            break;
                                        case 193:
                                            m4770((InterfaceC3830) C9566.f26325);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 197:
                                                    m4770((InterfaceC3830) ((C14260) this.f5078).m32771());
                                                    break;
                                                case 198:
                                                case 199:
                                                    this.f5068 = 0;
                                                    break;
                                                default:
                                                    throw new RuntimeException("shouldn't happen: ".concat(C16351.m37152(i2)));
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            this.f5068 = 0;
        }
        int i5 = this.f5068;
        if (i5 < 0) {
            throw new C4933("results never set", null);
        }
        if (i5 == 0) {
            return;
        }
        if (this.f5071 != null) {
            c14280.m32823().mo8661(m4767(false));
            return;
        }
        C14950 c14950M32824 = c14280.m32824();
        for (int i6 = 0; i6 < this.f5068; i6++) {
            if (this.f5072) {
                c14950M32824.m34217();
            }
            c14950M32824.m34211(interfaceC3830Arr[i6]);
        }
    }

    public C2920(C24318 c24318) {
        if (c24318 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f5075 = c24318;
        this.f5073 = new InterfaceC3830[10];
        this.f5069 = new InterfaceC3830[6];
        m4782();
    }

    /* JADX INFO: renamed from: ۜ */
    public final C24318 m4780() {
        return this.f5075;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4782() {
        this.f5067 = 0;
        this.f5070 = null;
        this.f5074 = 0;
        this.f5078 = null;
        this.f5080 = 0;
        this.f5076 = null;
        this.f5077 = null;
        this.f5079 = -1;
        this.f5072 = false;
        this.f5071 = null;
        this.f5068 = -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4784(C14280 c14280, int i) {
        C14950 c14950M32824 = c14280.m32824();
        m4782();
        if (i > this.f5073.length) {
            this.f5073 = new InterfaceC3830[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.f5073[i2] = c14950M32824.m34214();
        }
        this.f5067 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4777(C14280 c14280, C24318 c24318) {
        C15600 c15600M53653 = c24318.m53653();
        int size = c15600M53653.size();
        m4784(c14280, size);
        for (int i = 0; i < size; i++) {
            if (!C24158.m53417(c15600M53653.getType(i), this.f5073[i])) {
                throw new C4933("at stack depth " + ((size - 1) - i) + ", expected type " + c15600M53653.getType(i).mo4819() + " but found " + this.f5073[i].getType().mo4819(), null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4774(C14280 c14280, C9566 c9566) {
        m4784(c14280, 1);
        if (C24158.m53417(c9566, this.f5073[0])) {
            return;
        }
        throw new C4933("expected type " + c9566.mo4819() + " but found " + this.f5073[0].getType().mo4819(), null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4775(C14280 c14280, C9566 c9566, C9566 c9567) {
        m4784(c14280, 2);
        if (!C24158.m53417(c9566, this.f5073[0])) {
            throw new C4933("expected type " + c9566.mo4819() + " but found " + this.f5073[0].getType().mo4819(), null);
        }
        if (C24158.m53417(c9567, this.f5073[1])) {
            return;
        }
        throw new C4933("expected type " + c9567.mo4819() + " but found " + this.f5073[1].getType().mo4819(), null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4776(C14280 c14280, C9566 c9566, C9566 c9567, C9566 c9568) {
        m4784(c14280, 3);
        if (!C24158.m53417(c9566, this.f5073[0])) {
            throw new C4933("expected type " + c9566.mo4819() + " but found " + this.f5073[0].getType().mo4819(), null);
        }
        if (!C24158.m53417(c9567, this.f5073[1])) {
            throw new C4933("expected type " + c9567.mo4819() + " but found " + this.f5073[1].getType().mo4819(), null);
        }
        if (C24158.m53417(c9568, this.f5073[2])) {
            return;
        }
        throw new C4933("expected type " + c9568.mo4819() + " but found " + this.f5073[2].getType().mo4819(), null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4772(C14280 c14280, int i) {
        m4782();
        this.f5073[0] = c14280.m32823().get(i);
        this.f5067 = 1;
        this.f5079 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4785(boolean z) {
        this.f5072 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4771(C9566 c9566) {
        this.f5070 = c9566;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4783(int i) {
        this.f5074 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4778(AbstractC15405 abstractC15405) {
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f5078 = abstractC15405;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4788(int i) {
        this.f5080 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4779(C21027 c21027) {
        this.f5076 = c21027;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4769(ArrayList arrayList) {
        this.f5077 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4768(int i, C9566 c9566, C20101 c20101) {
        this.f5071 = C22783.m50973(i, c9566, c20101);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m4765() {
        return this.f5067;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3830 m4766(int i) {
        if (i >= this.f5067) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.f5073[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m4789() {
        return this.f5074;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC15405 m4790() {
        return this.f5078;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C21027 m4787() {
        return this.f5076;
    }

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList m4786() {
        return this.f5077;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m4792() {
        return this.f5079;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22783 m4767(boolean z) {
        if (this.f5071 == null) {
            return null;
        }
        if (this.f5068 != 1) {
            throw new C4933(C10965.m25286(new StringBuilder("local target with "), this.f5068 == 0 ? "no" : "multiple", " results"), null);
        }
        InterfaceC3830 interfaceC3830 = this.f5069[0];
        C9566 type = interfaceC3830.getType();
        C9566 type2 = this.f5071.getType();
        if (type == type2) {
            return z ? this.f5071.m50978(interfaceC3830) : this.f5071;
        }
        if (C24158.m53417(type2, type)) {
            if (type2 == C9566.f26324) {
                this.f5071 = this.f5071.m50978(interfaceC3830);
            }
            return this.f5071;
        }
        throw new C4933("local variable type mismatch: attempt to set or access a value of type " + type.mo4819() + " using a local variable of type " + type2.mo4819() + ". This is symptomatic of .class transformation tools that ignore local variable information.", null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4770(InterfaceC3830 interfaceC3830) {
        if (interfaceC3830 == null) {
            throw new NullPointerException("result == null");
        }
        this.f5069[0] = interfaceC3830;
        this.f5068 = 1;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m4781() {
        int i = this.f5068;
        if (i >= 0) {
            return i;
        }
        throw new C4933("results never set", null);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC3830 m4791() {
        if (this.f5068 <= 0) {
            throw new IllegalArgumentException("n >= resultCount");
        }
        try {
            return this.f5069[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }
}
