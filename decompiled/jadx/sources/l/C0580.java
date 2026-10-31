package l;

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
public class C0580 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f2292;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f2293;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC1538[] f2294;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7573 f2295;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C21480 f2296;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f2297;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC1538[] f2298;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f2299;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23095 f2300;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19632 f2301;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f2302;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC13717 f2303;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f2304;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f2305;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo2402(C12533 c12533, int i, int i2) {
        InterfaceC1538[] interfaceC1538Arr = this.f2294;
        if (i2 == 0) {
            this.f2293 = 0;
        } else if (i2 == 20) {
            m2399((InterfaceC1538) this.f2303);
        } else if (i2 == 21) {
            m2399(m2395(0));
        } else if (i2 != 171 && i2 != 172) {
            switch (i2) {
                case 0:
                case 79:
                    this.f2293 = 0;
                    break;
                case 18:
                    m2399((InterfaceC1538) this.f2303);
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
                    m2399((InterfaceC1538) this.f2295);
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    m2399(m2395(0));
                    break;
                default:
                    switch (i2) {
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                        case 88:
                            this.f2293 = 0;
                            break;
                        case 89:
                        case 90:
                        case 91:
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                        case 93:
                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                        case 95:
                            this.f2293 = 0;
                            for (int i3 = this.f2299; i3 != 0; i3 >>= 4) {
                                InterfaceC1538 interfaceC1538M2395 = m2395((i3 & 15) - 1);
                                if (interfaceC1538M2395 == null) {
                                    throw new NullPointerException("result == null");
                                }
                                int i4 = this.f2293;
                                interfaceC1538Arr[i4] = interfaceC1538M2395;
                                this.f2293 = i4 + 1;
                            }
                            break;
                        case 96:
                            m2399((InterfaceC1538) this.f2295);
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
                                    m2399((InterfaceC1538) this.f2295);
                                    break;
                                case 153:
                                case EnumC17734.f54268 /* 154 */:
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
                                    this.f2293 = 0;
                                    break;
                                case 168:
                                    m2399(new C11165(this.f2305));
                                    break;
                                default:
                                    switch (i2) {
                                        case 177:
                                        case 179:
                                        case 181:
                                        case 191:
                                        case 194:
                                        case 195:
                                            this.f2293 = 0;
                                            break;
                                        case 178:
                                        case 180:
                                        case 182:
                                        case 184:
                                        case 185:
                                            C7573 type = ((InterfaceC1538) this.f2303).getType();
                                            if (type == C7573.f23406) {
                                                this.f2293 = 0;
                                            } else {
                                                m2399((InterfaceC1538) type);
                                            }
                                            break;
                                        case 183:
                                            C7573 type2 = m2395(0).getType();
                                            if (type2.m20304()) {
                                                c12533.m30748(type2);
                                            }
                                            C7573 type3 = ((InterfaceC1538) this.f2303).getType();
                                            if (type3 == C7573.f23406) {
                                                this.f2293 = 0;
                                            } else {
                                                m2399((InterfaceC1538) type3);
                                            }
                                            break;
                                        case 186:
                                            C7573 c7573M52479 = ((C23801) this.f2303).m52479();
                                            if (c7573M52479 == C7573.f23406) {
                                                this.f2293 = 0;
                                            } else {
                                                m2399((InterfaceC1538) c7573M52479);
                                            }
                                            break;
                                        case 187:
                                            m2399((InterfaceC1538) ((C12512) this.f2303).m30696().m20303(i));
                                            break;
                                        case 188:
                                        case 192:
                                            m2399((InterfaceC1538) ((C12512) this.f2303).m30696());
                                            break;
                                        case 189:
                                            m2399((InterfaceC1538) ((C12512) this.f2303).m30696().m20307());
                                            break;
                                        case 190:
                                            m2399((InterfaceC1538) this.f2295);
                                            break;
                                        case 193:
                                            m2399((InterfaceC1538) C7573.f23413);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 197:
                                                    m2399((InterfaceC1538) ((C12512) this.f2303).m30696());
                                                    break;
                                                case 198:
                                                case 199:
                                                    this.f2293 = 0;
                                                    break;
                                                default:
                                                    throw new RuntimeException("shouldn't happen: ".concat(C14712.m35005(i2)));
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
            this.f2293 = 0;
        }
        int i5 = this.f2293;
        if (i5 < 0) {
            throw new C2698("results never set", null);
        }
        if (i5 == 0) {
            return;
        }
        if (this.f2296 != null) {
            c12533.m30751().mo6519(m2396(false));
            return;
        }
        C13238 c13238M30752 = c12533.m30752();
        for (int i6 = 0; i6 < this.f2293; i6++) {
            if (this.f2297) {
                c13238M30752.m32119();
            }
            c13238M30752.m32113(interfaceC1538Arr[i6]);
        }
    }

    public C0580(C23095 c23095) {
        if (c23095 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f2300 = c23095;
        this.f2298 = new InterfaceC1538[10];
        this.f2294 = new InterfaceC1538[6];
        m2411();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23095 m2409() {
        return this.f2300;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2411() {
        this.f2292 = 0;
        this.f2295 = null;
        this.f2299 = 0;
        this.f2303 = null;
        this.f2305 = 0;
        this.f2301 = null;
        this.f2302 = null;
        this.f2304 = -1;
        this.f2297 = false;
        this.f2296 = null;
        this.f2293 = -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2413(C12533 c12533, int i) {
        C13238 c13238M30752 = c12533.m30752();
        m2411();
        if (i > this.f2298.length) {
            this.f2298 = new InterfaceC1538[i + 10];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.f2298[i2] = c13238M30752.m32116();
        }
        this.f2292 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2406(C12533 c12533, C23095 c23095) {
        C13922 c13922M51259 = c23095.m51259();
        int size = c13922M51259.size();
        m2413(c12533, size);
        for (int i = 0; i < size; i++) {
            if (!C22927.m51026(c13922M51259.getType(i), this.f2298[i])) {
                throw new C2698("at stack depth " + ((size - 1) - i) + ", expected type " + c13922M51259.getType(i).mo2463() + " but found " + this.f2298[i].getType().mo2463(), null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2403(C12533 c12533, C7573 c7573) {
        m2413(c12533, 1);
        if (C22927.m51026(c7573, this.f2298[0])) {
            return;
        }
        throw new C2698("expected type " + c7573.mo2463() + " but found " + this.f2298[0].getType().mo2463(), null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2404(C12533 c12533, C7573 c7573, C7573 c7574) {
        m2413(c12533, 2);
        if (!C22927.m51026(c7573, this.f2298[0])) {
            throw new C2698("expected type " + c7573.mo2463() + " but found " + this.f2298[0].getType().mo2463(), null);
        }
        if (C22927.m51026(c7574, this.f2298[1])) {
            return;
        }
        throw new C2698("expected type " + c7574.mo2463() + " but found " + this.f2298[1].getType().mo2463(), null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2405(C12533 c12533, C7573 c7573, C7573 c7574, C7573 c7575) {
        m2413(c12533, 3);
        if (!C22927.m51026(c7573, this.f2298[0])) {
            throw new C2698("expected type " + c7573.mo2463() + " but found " + this.f2298[0].getType().mo2463(), null);
        }
        if (!C22927.m51026(c7574, this.f2298[1])) {
            throw new C2698("expected type " + c7574.mo2463() + " but found " + this.f2298[1].getType().mo2463(), null);
        }
        if (C22927.m51026(c7575, this.f2298[2])) {
            return;
        }
        throw new C2698("expected type " + c7575.mo2463() + " but found " + this.f2298[2].getType().mo2463(), null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2401(C12533 c12533, int i) {
        m2411();
        this.f2298[0] = c12533.m30751().get(i);
        this.f2292 = 1;
        this.f2304 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2414(boolean z) {
        this.f2297 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2400(C7573 c7573) {
        this.f2295 = c7573;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2412(int i) {
        this.f2299 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2407(AbstractC13717 abstractC13717) {
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f2303 = abstractC13717;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2417(int i) {
        this.f2305 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2408(C19632 c19632) {
        this.f2301 = c19632;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2398(ArrayList arrayList) {
        this.f2302 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2397(int i, C7573 c7573, C18658 c18658) {
        this.f2296 = C21480.m48636(i, c7573, c18658);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m2394() {
        return this.f2292;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1538 m2395(int i) {
        if (i >= this.f2292) {
            throw new IllegalArgumentException("n >= argCount");
        }
        try {
            return this.f2298[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m2418() {
        return this.f2299;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 m2419() {
        return this.f2303;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19632 m2416() {
        return this.f2301;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m2415() {
        return this.f2302;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m2421() {
        return this.f2304;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m2396(boolean z) {
        if (this.f2296 == null) {
            return null;
        }
        if (this.f2293 != 1) {
            throw new C2698(C9045.m23341(new StringBuilder("local target with "), this.f2293 == 0 ? "no" : "multiple", " results"), null);
        }
        InterfaceC1538 interfaceC1538 = this.f2294[0];
        C7573 type = interfaceC1538.getType();
        C7573 type2 = this.f2296.getType();
        if (type == type2) {
            return z ? this.f2296.m48641(interfaceC1538) : this.f2296;
        }
        if (C22927.m51026(type2, type)) {
            if (type2 == C7573.f23412) {
                this.f2296 = this.f2296.m48641(interfaceC1538);
            }
            return this.f2296;
        }
        throw new C2698("local variable type mismatch: attempt to set or access a value of type " + type.mo2463() + " using a local variable of type " + type2.mo2463() + ". This is symptomatic of .class transformation tools that ignore local variable information.", null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2399(InterfaceC1538 interfaceC1538) {
        if (interfaceC1538 == null) {
            throw new NullPointerException("result == null");
        }
        this.f2294[0] = interfaceC1538;
        this.f2293 = 1;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m2410() {
        int i = this.f2293;
        if (i >= 0) {
            return i;
        }
        throw new C2698("results never set", null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC1538 m2420() {
        if (this.f2293 <= 0) {
            throw new IllegalArgumentException("n >= resultCount");
        }
        try {
            return this.f2294[0];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("n < 0");
        }
    }
}
