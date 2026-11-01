package p067l;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.alipay.sdk.p010m.p050t0.C0215b;
import com.google.android.material.slider.BasicLabelFormatter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V8T2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21315 implements Handler.Callback, InterfaceC22170, InterfaceC2898, InterfaceC6523, InterfaceC24488, InterfaceC11888, InterfaceC23818, InterfaceC23865 {

    /* JADX INFO: renamed from: ۡۧ */
    public static final long f67175 = C5792.m13013(10000L);

    /* JADX INFO: renamed from: ֡֫ */
    public final C17051 f67176;

    /* JADX INFO: renamed from: ֨֫ */
    public final C13899 f67177;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f67178;

    /* JADX INFO: renamed from: ֫ۧ */
    public final boolean f67179;

    /* JADX INFO: renamed from: ۖ֫ */
    public C19735 f67180;

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC14968 f67181;

    /* JADX INFO: renamed from: ۗ֫ */
    public final long f67182;

    /* JADX INFO: renamed from: ۘ֫ */
    public final C23738 f67183;

    /* JADX INFO: renamed from: ۙ */
    public final long f67184;

    /* JADX INFO: renamed from: ۙ֫ */
    public C23326 f67185;

    /* JADX INFO: renamed from: ۚ֫ */
    public final Looper f67186;

    /* JADX INFO: renamed from: ۛ */
    public int f67187;

    /* JADX INFO: renamed from: ۛ֫ */
    public long f67188;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f67189;

    /* JADX INFO: renamed from: ۜۧ */
    public final AbstractC7593 f67190;

    /* JADX INFO: renamed from: ۟ */
    public boolean f67191;

    /* JADX INFO: renamed from: ۟֫ */
    public boolean f67192;

    /* JADX INFO: renamed from: ۡ֫ */
    public final ArrayList f67194;

    /* JADX INFO: renamed from: ۢ֫ */
    public C23326 f67195;

    /* JADX INFO: renamed from: ۢۧ */
    public final C21727 f67196;

    /* JADX INFO: renamed from: ۤ */
    public final C3569 f67197;

    /* JADX INFO: renamed from: ۤ֫ */
    public long f67198;

    /* JADX INFO: renamed from: ۧۧ */
    public boolean f67200;

    /* JADX INFO: renamed from: ۨ */
    public boolean f67201;

    /* JADX INFO: renamed from: ۨ֫ */
    public final boolean[] f67202;

    /* JADX INFO: renamed from: ۫ */
    public boolean f67203;

    /* JADX INFO: renamed from: ۫֫ */
    public final InterfaceC19537[] f67204;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC17980 f67205;

    /* JADX INFO: renamed from: ۬֫ */
    public boolean f67206;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f67207;

    /* JADX INFO: renamed from: ܰ֫ */
    public int f67208;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C5182 f67209;

    /* JADX INFO: renamed from: ܳۧ */
    public boolean f67210;

    /* JADX INFO: renamed from: ܶ֫ */
    public final C15512 f67211;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f67212;

    /* JADX INFO: renamed from: ܽ֫ */
    public final InterfaceC14608 f67213;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C15770 f67215;

    /* JADX INFO: renamed from: ܿۧ */
    public C11491 f67216;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final InterfaceC11927 f67217;

    /* JADX INFO: renamed from: ᩳۧ */
    public boolean f67218;

    /* JADX INFO: renamed from: ᩴ֫ */
    public C14569 f67219;

    /* JADX INFO: renamed from: ᩵֫ */
    public C16619 f67220;

    /* JADX INFO: renamed from: ᩶ */
    public final C21807 f67221;

    /* JADX INFO: renamed from: ᩶֫ */
    public final C8534 f67222;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC20879 f67225;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC20664 f67227;

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC20664 f67229;

    /* JADX INFO: renamed from: ᩺֫ */
    public final C16183[] f67230;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f67231;

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f67232;

    /* JADX INFO: renamed from: ᩹֫ */
    public long f67228 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f67223 = false;

    /* JADX INFO: renamed from: ᩸֫ */
    public C4983 f67226 = C4983.f11351;

    /* JADX INFO: renamed from: ᩷ۧ */
    public float f67224 = 1.0f;

    /* JADX INFO: renamed from: ܽۧ */
    public C22220 f67214 = C22220.f70271;

    /* JADX INFO: renamed from: ۠֫ */
    public long f67193 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ֫ */
    public long f67199 = -9223372036854775807L;

    @Override // p067l.InterfaceC20985
    /* JADX INFO: renamed from: ֫ */
    public final void mo13095(InterfaceC2878 interfaceC2878) {
        this.f67229.mo19704(9, (InterfaceC11441) interfaceC2878).mo45367();
    }

    public C21315(Context context, InterfaceC4114[] interfaceC4114Arr, InterfaceC4114[] interfaceC4114Arr2, AbstractC7593 abstractC7593, C3569 c3569, InterfaceC11927 interfaceC11927, InterfaceC14968 interfaceC14968, int i, boolean z, InterfaceC20879 interfaceC20879, C11491 c11491, C12419 c12419, long j, Looper looper, C15849 c15849, C17051 c17051, C15512 c15512, final InterfaceC23865 interfaceC23865) {
        this.f67176 = c17051;
        this.f67190 = abstractC7593;
        this.f67197 = c3569;
        this.f67217 = interfaceC11927;
        this.f67181 = interfaceC14968;
        this.f67208 = i;
        this.f67232 = z;
        this.f67216 = c11491;
        this.f67213 = c12419;
        this.f67182 = j;
        this.f67205 = c15849;
        this.f67211 = c15512;
        this.f67225 = interfaceC20879;
        this.f67184 = interfaceC11927.mo27259();
        this.f67179 = interfaceC11927.mo27257();
        AbstractC6974 abstractC6974 = AbstractC6974.f18145;
        C14569 c14569M33310 = C14569.m33310(c3569);
        this.f67219 = c14569M33310;
        this.f67220 = new C16619(c14569M33310);
        this.f67204 = new InterfaceC19537[interfaceC4114Arr.length];
        this.f67202 = new boolean[interfaceC4114Arr.length];
        InterfaceC18195 interfaceC18195Mo17538 = abstractC7593.mo17538();
        this.f67230 = new C16183[interfaceC4114Arr.length];
        boolean z2 = false;
        for (int i2 = 0; i2 < interfaceC4114Arr.length; i2++) {
            interfaceC4114Arr[i2].mo8284(i2, c15512, c15849);
            this.f67204[i2] = interfaceC4114Arr[i2].mo8291();
            if (interfaceC18195Mo17538 != null) {
                ((AbstractC7054) this.f67204[i2]).m16255(interfaceC18195Mo17538);
            }
            InterfaceC4114 interfaceC4114 = interfaceC4114Arr2[i2];
            if (interfaceC4114 != null) {
                interfaceC4114.mo8284(i2, c15512, c15849);
                z2 = true;
            }
            this.f67230[i2] = new C16183(interfaceC4114Arr[i2], interfaceC4114Arr2[i2], i2);
        }
        this.f67207 = z2;
        this.f67215 = new C15770(this, c15849);
        this.f67194 = new ArrayList();
        this.f67196 = new C21727();
        this.f67183 = new C23738();
        abstractC7593.m17533(this, interfaceC14968);
        this.f67203 = true;
        InterfaceC20664 interfaceC20664Mo35964 = c15849.mo35964(looper, null);
        this.f67227 = interfaceC20664Mo35964;
        this.f67222 = new C8534(interfaceC20879, interfaceC20664Mo35964, new C19973(this));
        this.f67209 = new C5182(this, interfaceC20879, interfaceC20664Mo35964, c15512);
        C13899 c13899 = new C13899();
        this.f67177 = c13899;
        Looper looperM31617 = c13899.m31617();
        this.f67186 = looperM31617;
        InterfaceC20664 interfaceC20664Mo35965 = c15849.mo35964(looperM31617, this);
        this.f67229 = interfaceC20664Mo35965;
        this.f67221 = new C21807(context, looperM31617, this);
        interfaceC20664Mo35965.mo19704(35, new InterfaceC23865() { // from class: l.᩵ۙ֫
            @Override // p067l.InterfaceC23865
            /* JADX INFO: renamed from: ֫ */
            public final void mo26158(long j2, long j3, C10307 c10307, MediaFormat mediaFormat) {
                C21315 c21315 = this.f63768;
                c21315.getClass();
                interfaceC23865.mo26158(j2, j3, c10307, mediaFormat);
                c21315.mo26158(j2, j3, c10307, mediaFormat);
            }
        }).mo45367();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m48282(C13229 c13229) {
        synchronized (c13229) {
        }
        try {
            c13229.m30283().mo15338(c13229.m30285(), c13229.m30282());
        } finally {
            c13229.m30281(true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18592 m48240(C21315 c21315, C15909 c15909, long j) {
        InterfaceC19537[] interfaceC19537Arr = c21315.f67204;
        AbstractC7593 abstractC7593 = c21315.f67190;
        C14298 c14298Mo27262 = c21315.f67217.mo27262();
        C5182 c5182 = c21315.f67209;
        C3569 c3569 = c21315.f67197;
        c21315.f67226.getClass();
        return new C18592(interfaceC19537Arr, j, abstractC7593, c14298Mo27262, c5182, c15909, c3569);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m48328() {
        this.f67229.mo19701(29).mo45367();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48312(int i, int i2, boolean z) {
        this.f67229.mo19702(1, z ? 1 : 0, i | (i2 << 4)).mo45367();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48323(int i) {
        this.f67229.mo19702(11, i, 0).mo45367();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48325(boolean z) {
        this.f67229.mo19702(12, z ? 1 : 0, 0).mo45367();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48316(AbstractC6974 abstractC6974, int i, long j) {
        this.f67229.mo19704(3, new C23326(abstractC6974, i, j)).mo45367();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48324(C4963 c4963) {
        this.f67229.mo19704(4, c4963).mo45367();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48320(boolean z) {
        this.f67229.mo19704(36, Boolean.valueOf(z)).mo45367();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48319(C22220 c22220) {
        this.f67229.mo19704(38, c22220).mo45367();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m48322() {
        this.f67229.mo19701(6).mo45367();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48313(int i, long j, InterfaceC3549 interfaceC3549, ArrayList arrayList) {
        this.f67229.mo19704(17, new C7232(i, j, interfaceC3549, arrayList)).mo45367();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48314(int i, InterfaceC3549 interfaceC3549) {
        this.f67229.mo19703(20, i, interfaceC3549).mo45367();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48318(C19695 c19695) {
        this.f67229.mo19703(31, 0, c19695).mo45367();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m48291(int i) {
        C14569 c14569 = this.f67219;
        m48242(i, c14569.f41610, c14569.f41621, c14569.f41613);
    }

    /* JADX INFO: renamed from: ۖ */
    private void m48272() {
        float f = this.f67224;
        this.f67224 = f;
        float fM49175 = f * this.f67221.m49175();
        for (C16183 c16183 : this.f67230) {
            c16183.m36836(fM49175);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48265(InterfaceC23865 interfaceC23865) {
        for (C16183 c16183 : this.f67230) {
            c16183.m36848(interfaceC23865);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48317(C13229 c13229) {
        if (this.f67206 || !this.f67186.getThread().isAlive()) {
            C21334.m48351("Ignoring messages sent after release.");
            c13229.m30281(false);
        } else {
            this.f67229.mo19704(14, c13229).mo45367();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48321(long j, Object obj) {
        if (this.f67206 || !this.f67186.getThread().isAlive()) {
            return true;
        }
        C15968 c15968 = new C15968(this.f67205);
        this.f67229.mo19704(30, new Pair(obj, c15968)).mo45367();
        if (j != -9223372036854775807L) {
            return c15968.m36281(j);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m48326() {
        if (this.f67206 || !this.f67186.getThread().isAlive()) {
            return true;
        }
        this.f67206 = true;
        C15968 c15968 = new C15968(this.f67205);
        this.f67229.mo19704(7, c15968).mo45367();
        return c15968.m36281(this.f67182);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Looper m48327() {
        return this.f67186;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m48329() {
        InterfaceC20664 interfaceC20664 = this.f67229;
        interfaceC20664.mo19712(2);
        interfaceC20664.mo19710(22);
    }

    @Override // p067l.InterfaceC22170
    /* JADX INFO: renamed from: ֫ */
    public final void mo13096(InterfaceC11441 interfaceC11441) {
        this.f67229.mo19704(8, interfaceC11441).mo45367();
    }

    @Override // p067l.InterfaceC2898
    /* JADX INFO: renamed from: ֫ */
    public final void mo4671() {
        this.f67229.mo19710(10);
    }

    @Override // p067l.InterfaceC2898
    /* JADX INFO: renamed from: ۧ */
    public final void mo4672() {
        this.f67229.mo19710(26);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48315(C4963 c4963) {
        this.f67229.mo19704(16, c4963).mo45367();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m48330() {
        this.f67229.mo19710(34);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48311(int i) {
        this.f67229.mo19702(33, i, 0).mo45367();
    }

    @Override // p067l.InterfaceC23865
    /* JADX INFO: renamed from: ֫ */
    public final void mo26158(long j, long j2, C10307 c10307, MediaFormat mediaFormat) {
        if (this.f67218) {
            this.f67229.mo19701(37).mo45367();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        C17474 c17474;
        C18592 c18592M19865;
        int i2 = 1000;
        try {
            int i3 = message.what;
            C21807 c21807 = this.f67221;
            switch (i3) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.f67220.m37679(1);
                    m48242(c21807.m49176(this.f67219.f41611, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    m48290();
                    break;
                case 3:
                    m48264((C23326) message.obj, true);
                    break;
                case 4:
                    m48293((C4963) message.obj);
                    break;
                case 5:
                    m48257((C11491) message.obj);
                    break;
                case 6:
                    m48267(false, true);
                    break;
                case 7:
                    m48258((C15968) message.obj);
                    return true;
                case 8:
                    m48294((InterfaceC11441) message.obj);
                    break;
                case 9:
                    m48281((InterfaceC11441) message.obj);
                    break;
                case 10:
                    m48277();
                    break;
                case 11:
                    m48298(message.arg1);
                    break;
                case 12:
                    m48310(message.arg1 != 0);
                    break;
                case 13:
                    m48266(message.arg1 != 0, (C15968) message.obj);
                    break;
                case 14:
                    m48295((C13229) message.obj);
                    break;
                case 15:
                    m48301((C13229) message.obj);
                    break;
                case 16:
                    C4963 c4963 = (C4963) message.obj;
                    m48250(c4963, c4963.f11305, true, false);
                    break;
                case 17:
                    m48255((C7232) message.obj);
                    break;
                case 18:
                    m48256((C7232) message.obj, message.arg1);
                    break;
                case 19:
                    m48248((C3208) message.obj);
                    break;
                case 20:
                    m48244(message.arg1, message.arg2, (InterfaceC3549) message.obj);
                    break;
                case 21:
                    m48249((InterfaceC3549) message.obj);
                    break;
                case 22:
                    m48276();
                    break;
                case 23:
                    m48299(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m48279();
                    break;
                case 26:
                    m48277();
                    m48302(true);
                    break;
                case 27:
                    m48243(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m48251((C4983) message.obj);
                    break;
                case 29:
                    m48231();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m48247(pair.first, (C15968) pair.second);
                    break;
                case 31:
                    m48261((C19695) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    float fFloatValue = ((Float) message.obj).floatValue();
                    this.f67224 = fFloatValue;
                    float fM49175 = fFloatValue * c21807.m49175();
                    for (C16183 c16183 : this.f67230) {
                        c16183.m36836(fM49175);
                    }
                    break;
                case 33:
                    m48291(message.arg1);
                    break;
                case 34:
                    m48272();
                    break;
                case 35:
                    m48265((InterfaceC23865) message.obj);
                    break;
                case 36:
                    m48288(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f67218 = false;
                    C23326 c23326 = this.f67185;
                    if (c23326 != null) {
                        m48264(c23326, false);
                        this.f67185 = null;
                    }
                    break;
                case 38:
                    m48283((C22220) message.obj);
                    break;
            }
        } catch (C10998 e) {
            boolean z2 = e.f30454;
            int i5 = e.f30455;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else if (i5 == 4) {
                i2 = z2 ? 3002 : 3004;
            }
            m48246(e, i2);
        } catch (C20684 e2) {
            m48246(e2, e2.f63878);
        } catch (IOException e3) {
            m48246(e3, 2000);
        } catch (RuntimeException e4) {
            C19735 c19735M44863 = C19735.m44863(e4, ((e4 instanceof IllegalStateException) || (e4 instanceof IllegalArgumentException)) ? 1004 : 1000);
            C21334.m48348("Playback error", c19735M44863);
            m48267(true, false);
            this.f67219 = this.f67219.m33319(c19735M44863);
        } catch (C10514 e5) {
            m48246(e5, C0215b.f1000c);
        } catch (C19735 e6) {
            C19735 c19735M44865 = e6;
            int i6 = c19735M44865.f60029;
            C8534 c8534 = this.f67222;
            if (i6 == 1 && (c18592M19865 = c8534.m19865()) != null && c19735M44865.f60028 == null) {
                c19735M44865 = c19735M44865.m44865(c18592M19865.f55518.f46022);
            }
            int i7 = c19735M44865.f60029;
            InterfaceC20664 interfaceC20664 = this.f67229;
            if (i7 == 1 && (c17474 = c19735M44865.f60028) != null && m48270(c19735M44865.f60031, c17474)) {
                this.f67191 = true;
                m48278();
                C18592 c18592M19854 = c8534.m19854();
                C18592 c18592M19859 = c8534.m19859();
                if (c8534.m19859() != c18592M19854) {
                    while (c18592M19859 != null && c18592M19859.m42313() != c18592M19854) {
                        c18592M19859 = c18592M19859.m42313();
                    }
                }
                c8534.m19845(c18592M19859);
                if (this.f67219.f41611 != 4) {
                    m48304();
                    interfaceC20664.mo19710(2);
                }
            } else {
                C19735 c19735 = this.f67180;
                if (c19735 != null) {
                    c19735.addSuppressed(c19735M44865);
                    c19735M44865 = this.f67180;
                }
                C19735 c19736 = c19735M44865;
                if (c19736.f60029 == 1 && c8534.m19859() != c8534.m19865()) {
                    while (c8534.m19859() != c8534.m19865()) {
                        c8534.m19849();
                    }
                    C18592 c18592M198510 = c8534.m19859();
                    C23877.m52954(c18592M198510);
                    m48230();
                    C15909 c15909 = c18592M198510.f55518;
                    C17474 c17475 = c15909.f46022;
                    long j = c15909.f46019;
                    this.f67219 = m48239(c17475, j, c15909.f46025, j, true, 0);
                }
                if (c19736.f60033 && (this.f67180 == null || (i = c19736.f52873) == 5004 || i == 5003)) {
                    C21334.m48350("Recoverable renderer error", c19736);
                    if (this.f67180 == null) {
                        this.f67180 = c19736;
                    }
                    interfaceC20664.mo19708(interfaceC20664.mo19704(25, c19736));
                } else {
                    C21334.m48348("Playback error", c19736);
                    m48267(true, false);
                    this.f67219 = this.f67219.m33319(c19736);
                }
            }
        } catch (C23423 e7) {
            m48246(e7, e7.f74623);
        }
        m48230();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48246(IOException iOException, int i) {
        C19735 c19735M44862 = C19735.m44862(iOException, i);
        C18592 c18592M19859 = this.f67222.m19859();
        if (c18592M19859 != null) {
            c19735M44862 = c19735M44862.m44865(c18592M19859.f55518.f46022);
        }
        C21334.m48348("Playback error", c19735M44862);
        m48267(false, false);
        this.f67219 = this.f67219.m33319(c19735M44862);
    }

    /* JADX INFO: renamed from: ܳ */
    private void m48287(int i) {
        C14569 c14569 = this.f67219;
        if (c14569.f41611 != i) {
            if (i != 2) {
                this.f67193 = -9223372036854775807L;
            }
            if (i != 3 && c14569.f41618) {
                this.f67219 = c14569.m33322(false);
            }
            this.f67219 = this.f67219.m33313(i);
        }
    }

    /* JADX INFO: renamed from: ֡ */
    private void m48230() {
        this.f67220.m37680(this.f67219);
        if (this.f67220.f48858) {
            C17289.m39188(this.f67176.f50436, this.f67220);
            this.f67220 = new C16619(this.f67219);
        }
    }

    /* JADX INFO: renamed from: ֨ */
    private void m48231() {
        this.f67220.m37679(1);
        m48268(false, false, false, true);
        this.f67217.mo27256(this.f67211);
        m48287(this.f67219.f41602.m15990() ? 4 : 2);
        C14569 c14569 = this.f67219;
        boolean z = c14569.f41613;
        m48242(this.f67221.m49176(c14569.f41611, z), c14569.f41610, c14569.f41621, z);
        this.f67209.m11109(this.f67181.mo30992());
        this.f67229.mo19710(2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48255(C7232 c7232) throws Throwable {
        this.f67220.m37679(1);
        if (c7232.f18871 != -1) {
            this.f67195 = new C23326(new C15239(c7232.f18868, c7232.f18870), c7232.f18871, c7232.f18869);
        }
        m48254(this.f67209.m11106(c7232.f18868, c7232.f18870), false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48256(C7232 c7232, int i) throws Throwable {
        this.f67220.m37679(1);
        C5182 c5182 = this.f67209;
        if (i == -1) {
            i = c5182.m11113();
        }
        m48254(c5182.m11105(i, c7232.f18868, c7232.f18870), false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48248(C3208 c3208) throws Throwable {
        this.f67220.m37679(1);
        c3208.getClass();
        m48254(this.f67209.m11114(), false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48244(int i, int i2, InterfaceC3549 interfaceC3549) throws Throwable {
        this.f67220.m37679(1);
        m48254(this.f67209.m11104(i, i2, interfaceC3549), false);
    }

    /* JADX INFO: renamed from: ۚ */
    private void m48276() throws Throwable {
        m48254(this.f67209.m11102(), true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48249(InterfaceC3549 interfaceC3549) throws Throwable {
        this.f67220.m37679(1);
        m48254(this.f67209.m11107(interfaceC3549), false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48243(int i, int i2, List list) throws Throwable {
        this.f67220.m37679(1);
        m48254(this.f67209.m11103(i, i2, list), false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48261(C19695 c19695, boolean z) {
        this.f67190.mo17536(c19695);
        if (!z) {
            c19695 = null;
        }
        C21807 c21807 = this.f67221;
        c21807.m49177(c19695);
        C14569 c14569 = this.f67219;
        boolean z2 = c14569.f41613;
        m48242(c21807.m49176(c14569.f41611, z2), c14569.f41610, c14569.f41621, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48242(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        C14569 c14569 = this.f67219;
        if (c14569.f41613 == z2 && c14569.f41610 == i2 && c14569.f41621 == i3) {
            return;
        }
        this.f67219 = c14569.m33314(i3, i2, z2);
        m48284(false, false);
        C8534 c8534 = this.f67222;
        for (C18592 c18592M19859 = c8534.m19859(); c18592M19859 != null; c18592M19859 = c18592M19859.m42313()) {
            for (InterfaceC11617 interfaceC11617 : c18592M19859.m42315().f7248) {
                if (interfaceC11617 != null) {
                    interfaceC11617.mo4750(z2);
                }
            }
        }
        if (!m48308()) {
            m48306();
            m48273();
            C14569 c145610 = this.f67219;
            if (c145610.f41618) {
                this.f67219 = c145610.m33322(false);
            }
            c8534.m19852(this.f67188);
            return;
        }
        int i4 = this.f67219.f41611;
        InterfaceC20664 interfaceC20664 = this.f67229;
        if (i4 == 3) {
            this.f67215.m35840();
            m48309();
            interfaceC20664.mo19710(2);
        } else if (i4 == 2) {
            interfaceC20664.mo19710(2);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m48299(boolean z) {
        this.f67223 = z;
        m48289();
        if (this.f67212) {
            C8534 c8534 = this.f67222;
            if (c8534.m19865() != c8534.m19859()) {
                m48302(true);
                m48297(false);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m48298(int i) {
        this.f67208 = i;
        int iM19842 = this.f67222.m19842(this.f67219.f41602, i);
        if ((iM19842 & 1) != 0) {
            m48302(true);
        } else if ((iM19842 & 2) != 0) {
            m48278();
        }
        m48297(false);
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m48310(boolean z) {
        this.f67232 = z;
        int iM19844 = this.f67222.m19844(this.f67219.f41602, z);
        if ((iM19844 & 1) != 0) {
            m48302(true);
        } else if ((iM19844 & 2) != 0) {
            m48278();
        }
        m48297(false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48251(C4983 c4983) {
        this.f67226 = c4983;
        this.f67222.m19853(this.f67219.f41602, c4983);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m48302(boolean z) {
        C17474 c17474 = this.f67222.m19859().f55518.f46022;
        long jM48235 = m48235(c17474, this.f67219.f41605, true, false);
        if (jM48235 != this.f67219.f41605) {
            C14569 c14569 = this.f67219;
            this.f67219 = m48239(c17474, jM48235, c14569.f41606, c14569.f41612, z, 5);
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    private void m48309() {
        C18592 c18592M19859 = this.f67222.m19859();
        if (c18592M19859 == null) {
            return;
        }
        C3569 c3569M42315 = c18592M19859.m42315();
        int i = 0;
        while (true) {
            C16183[] c16183Arr = this.f67230;
            if (i >= c16183Arr.length) {
                return;
            }
            if (c3569M42315.m6563(i)) {
                c16183Arr[i].m36852();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    private void m48306() {
        this.f67215.m35843();
        for (C16183 c16183 : this.f67230) {
            c16183.m36850();
        }
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ۗ */
    private void m48273() {
        C18592 c18592M19859 = this.f67222.m19859();
        if (c18592M19859 == null) {
            return;
        }
        long jMo13098 = c18592M19859.f55523 ? c18592M19859.f55519.mo13098() : -9223372036854775807L;
        if (jMo13098 != -9223372036854775807L) {
            if (!c18592M19859.m42322()) {
                this.f67222.m19845(c18592M19859);
                m48297(false);
                m48304();
            }
            m48280(jMo13098);
            if (jMo13098 != this.f67219.f41605) {
                C14569 c14569 = this.f67219;
                this.f67219 = m48239(c14569.f41616, jMo13098, c14569.f41606, jMo13098, true, 5);
            }
        } else {
            long jM35839 = this.f67215.m35839(c18592M19859 != this.f67222.m19865());
            this.f67188 = jM35839;
            long jM42317 = c18592M19859.m42317(jM35839);
            long j = this.f67219.f41605;
            if (!this.f67194.isEmpty() && !this.f67219.f41616.m39842()) {
                if (this.f67203) {
                    j--;
                    this.f67203 = false;
                }
                C14569 c145610 = this.f67219;
                int iMo15978 = c145610.f41602.mo15978(c145610.f41616.f52252);
                int iMin = Math.min(this.f67231, this.f67194.size());
                C9914 c9914 = iMin > 0 ? (C9914) this.f67194.get(iMin - 1) : null;
                while (c9914 != null && (iMo15978 < 0 || (iMo15978 == 0 && 0 > j))) {
                    int i = iMin - 1;
                    c9914 = i > 0 ? (C9914) this.f67194.get(iMin - 2) : null;
                    iMin = i;
                }
                if (iMin < this.f67194.size()) {
                }
                this.f67231 = iMin;
            }
            if (this.f67215.mo15351()) {
                boolean z = !this.f67220.f48860;
                C14569 c145611 = this.f67219;
                this.f67219 = m48239(c145611.f41616, jM42317, c145611.f41606, jM42317, z, 6);
            } else {
                C14569 c145612 = this.f67219;
                c145612.f41605 = jM42317;
                c145612.f41614 = SystemClock.elapsedRealtime();
            }
        }
        this.f67219.f41604 = this.f67222.m19863().m42303();
        C14569 c145613 = this.f67219;
        c145613.f41607 = m48233(c145613.f41604);
        C14569 c145614 = this.f67219;
        if (c145614.f41613 && c145614.f41611 == 3 && m48271(c145614.f41602, c145614.f41616)) {
            C14569 c145615 = this.f67219;
            if (c145615.f41620.f11305 == 1.0f) {
                float fM28601 = ((C12419) this.f67213).m28601(m48234(c145615.f41602, c145615.f41616.f52252, c145615.f41605), this.f67219.f41607);
                if (this.f67215.mo15356().f11305 != fM28601) {
                    C4963 c4963 = new C4963(fM28601, this.f67219.f41620.f11303);
                    this.f67229.mo19712(16);
                    this.f67215.mo15343(c4963);
                    m48250(this.f67219.f41620, this.f67215.mo15356().f11305, false, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m48293(C4963 c4963) {
        this.f67229.mo19712(16);
        C15770 c15770 = this.f67215;
        c15770.mo15343(c4963);
        C4963 c4963Mo15356 = c15770.mo15356();
        m48250(c4963Mo15356, c4963Mo15356.f11305, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0203 A[LOOP:3: B:122:0x0201->B:123:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0211 A[EDGE_INSN: B:126:0x0211->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:127:0x021d A[EDGE_INSN: B:127:0x021d->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0220  */
    /* JADX WARN: Code duplicated, block: B:130:0x0225 A[LOOP:13: B:129:0x0223->B:130:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x0364  */
    /* JADX WARN: Code duplicated, block: B:286:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:288:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:294:0x04be  */
    /* JADX WARN: Code duplicated, block: B:296:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:297:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:300:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:303:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:306:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:309:0x0502  */
    /* JADX WARN: Code duplicated, block: B:312:0x0508  */
    /* JADX WARN: Code duplicated, block: B:314:0x050b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x054c  */
    /* JADX WARN: Code duplicated, block: B:321:0x0559  */
    /* JADX WARN: Code duplicated, block: B:322:0x0565  */
    /* JADX WARN: Code duplicated, block: B:325:0x056e  */
    /* JADX WARN: Code duplicated, block: B:333:0x058a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0592  */
    /* JADX WARN: Code duplicated, block: B:337:0x059c  */
    /* JADX WARN: Code duplicated, block: B:339:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:346:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:349:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:351:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:362:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:364:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:365:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:367:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:368:0x0608  */
    /* JADX WARN: Code duplicated, block: B:375:0x0626  */
    /* JADX WARN: Code duplicated, block: B:382:0x0632  */
    /* JADX WARN: Code duplicated, block: B:385:0x0639  */
    /* JADX WARN: Code duplicated, block: B:401:0x0660  */
    /* JADX WARN: Code duplicated, block: B:439:0x05d0 A[EDGE_INSN: B:439:0x05d0->B:353:0x05d0 BREAK  A[LOOP:10: B:347:0x05bd->B:352:0x05cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x015d A[EDGE_INSN: B:88:0x015d->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3 A[PHI: r2
      0x01b3: PHI (r2v48 long) = (r2v47 long), (r2v60 long) binds: [B:98:0x01b1, B:94:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x01fb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x0220, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:335:0x0592, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ܺ */
    private void m48290() {
        long j;
        ?? r0;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        C14569 c14569;
        C18592 c18592M19859;
        int i;
        C8534 c8534;
        C18592 c18592M198510;
        long jM28602;
        C18592 c18592M19863;
        boolean z5;
        boolean z6;
        boolean zMo27258;
        boolean z7;
        boolean z8;
        C14569 c145610;
        int i2;
        int i3;
        C16183[] c16183Arr;
        C14569 c145611;
        C18592 c18592M198511;
        C18592 c18592M42313;
        boolean z9;
        boolean z10;
        int i4;
        long j3;
        boolean z11;
        long jM42319;
        int i5;
        int i6;
        boolean zM6563;
        C18592 c18592M19854;
        C15909 c15909M19846;
        long jMo35965 = this.f67205.mo35965();
        this.f67229.mo19712(2);
        boolean z12 = this.f67207;
        C16183[] c16183Arr2 = this.f67230;
        C8534 c8535 = this.f67222;
        if (this.f67219.f41602.m15990() || !this.f67209.m11115()) {
            j = jMo35965;
            r0 = 0;
            z = true;
        } else {
            c8535.m19852(this.f67188);
            if (c8535.m19860() && (c15909M19846 = c8535.m19846(this.f67188, this.f67219)) != null) {
                long j4 = c15909M19846.f46019;
                C18592 c18592M19851 = c8535.m19851(c15909M19846);
                if (!c18592M19851.f55512) {
                    c18592M19851.f55512 = true;
                    c18592M19851.f55519.mo13097(this, j4);
                } else if (c18592M19851.f55523) {
                    this.f67229.mo19704(8, c18592M19851.f55519).mo45367();
                }
                if (c8535.m19859() == c18592M19851) {
                    m48280(j4);
                }
                m48297(false);
            }
            if (this.f67210) {
                this.f67210 = m48285(c8535.m19863());
                m48275();
            } else {
                m48304();
            }
            if (!this.f67212 && z12 && !this.f67191 && !m48307() && (c18592M19854 = c8535.m19854()) != null && c18592M19854 == c8535.m19865() && c18592M19854.m42313() != null && c18592M19854.m42313().f55523) {
                c8535.m19857();
                C18592 c18592M19855 = c8535.m19854();
                if (c18592M19855 != null) {
                    C3569 c3569M42315 = c18592M19855.m42315();
                    for (int i7 = 0; i7 < c16183Arr2.length; i7++) {
                        if (c3569M42315.m6563(i7) && c16183Arr2[i7].m36866() && !c16183Arr2[i7].m36859()) {
                            c16183Arr2[i7].m36861();
                            m48260(c18592M19855, i7, false, c18592M19855.m42319());
                        }
                    }
                    if (m48307()) {
                        this.f67228 = c18592M19855.f55519.mo13098();
                        if (!c18592M19855.m42322()) {
                            c8535.m19845(c18592M19855);
                            m48297(false);
                            m48304();
                        }
                    }
                }
            }
            C18592 c18592M19865 = c8535.m19865();
            if (c18592M19865 == null) {
                j = jMo35965;
                break;
            }
            if (c18592M19865.m42313() == null || this.f67212) {
                j = jMo35965;
                if (c18592M19865.f55518.f46024 || this.f67212) {
                    for (C16183 c16183 : c16183Arr2) {
                        if (c16183.m36860(c18592M19865) && c16183.m36867(c18592M19865)) {
                            long j5 = c18592M19865.f55518.f46017;
                            c16183.m36858(c18592M19865, (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? -9223372036854775807L : c18592M19865.m42316() + c18592M19865.f55518.f46017);
                        }
                    }
                }
            } else {
                C18592 c18592M19866 = c8535.m19865();
                if (!c18592M19866.f55523) {
                    j = jMo35965;
                    break;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= c16183Arr2.length) {
                        if ((!m48307() || c8535.m19854() != c8535.m19865()) && (c18592M19865.m42313().f55523 || this.f67188 >= c18592M19865.m42313().m42319())) {
                            C3569 c3569M42316 = c18592M19865.m42315();
                            C18592 c18592M19861 = c8535.m19861();
                            C3569 c3569M42317 = c18592M19861.m42315();
                            AbstractC6974 abstractC6974 = this.f67219.f41602;
                            j = jMo35965;
                            m48253(abstractC6974, c18592M19861.f55518.f46022, abstractC6974, c18592M19865.f55518.f46022, -9223372036854775807L, false);
                            if (!c18592M19861.f55523) {
                                for (C16183 c16184 : c16183Arr2) {
                                    c16184.m36841(c3569M42316, c3569M42317, c18592M19861.m42319());
                                }
                                break;
                            }
                            if (z12) {
                                j3 = -9223372036854775807L;
                                if (this.f67228 != -9223372036854775807L) {
                                    this.f67228 = j3;
                                    if (z12 || this.f67191) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        for (i6 = 0; i6 < c16183Arr2.length; i6++) {
                                            zM6563 = c3569M42317.m6563(i6);
                                            InterfaceC11617[] interfaceC11617Arr = c3569M42317.f7248;
                                            if (!zM6563 && c16183Arr2[i6].m36862() != -2 && !C11669.m26813(interfaceC11617Arr[i6].mo4753().f28528, interfaceC11617Arr[i6].mo4753().f28533) && !c16183Arr2[i6].m36859()) {
                                                z11 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z11) {
                                        jM42319 = c18592M19861.m42319();
                                        for (C16183 c16185 : c16183Arr2) {
                                            c16185.m36838(jM42319);
                                        }
                                        if (c18592M19861.m42322()) {
                                            c8535.m19845(c18592M19861);
                                            m48297(false);
                                            m48304();
                                            break;
                                        }
                                        break;
                                    }
                                    while (i4 < r1) {
                                        c16184.m36841(c3569M42316, c3569M42317, c18592M19861.m42319());
                                    }
                                    break;
                                    break;
                                }
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            if (c18592M19861.f55519.mo13098() != j3) {
                                this.f67228 = j3;
                                if (z12) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    while (i6 < c16183Arr2.length) {
                                        zM6563 = c3569M42317.m6563(i6);
                                        InterfaceC11617[] interfaceC11617Arr2 = c3569M42317.f7248;
                                        if (!zM6563) {
                                        }
                                    }
                                }
                                if (!z11) {
                                    jM42319 = c18592M19861.m42319();
                                    while (i5 < r2) {
                                        c16185.m36838(jM42319);
                                    }
                                    if (c18592M19861.m42322()) {
                                        break;
                                        break;
                                    }
                                    c8535.m19845(c18592M19861);
                                    m48297(false);
                                    m48304();
                                    break;
                                }
                                while (i4 < r1) {
                                    c16184.m36841(c3569M42316, c3569M42317, c18592M19861.m42319());
                                }
                                break;
                                break;
                            }
                            while (i4 < r1) {
                                c16184.m36841(c3569M42316, c3569M42317, c18592M19861.m42319());
                            }
                            break;
                            break;
                        }
                    } else if (c16183Arr2[i8].m36863(c18592M19866)) {
                        i8++;
                    }
                    j = jMo35965;
                    break;
                }
            }
            boolean z13 = false;
            C18592 c18592M19867 = c8535.m19865();
            if (c18592M19867 != null && c8535.m19859() != c18592M19867 && !c18592M19867.f55509) {
                C18592 c18592M19868 = c8535.m19865();
                C3569 c3569M42318 = c18592M19868.m42315();
                boolean z14 = true;
                for (int i9 = 0; i9 < c16183Arr2.length; i9++) {
                    int iM36854 = c16183Arr2[i9].m36854();
                    int iM36833 = c16183Arr2[i9].m36833(c18592M19868, c3569M42318, this.f67215);
                    if ((iM36833 & 2) != 0 && (z10 = this.f67189) && z10) {
                        this.f67189 = false;
                        if (this.f67219.f41618) {
                            this.f67229.mo19710(2);
                        }
                    }
                    this.f67187 -= iM36854 - c16183Arr2[i9].m36854();
                    z14 &= (iM36833 & 1) != 0;
                }
                if (z14) {
                    for (int i10 = 0; i10 < c16183Arr2.length; i10++) {
                        if (c3569M42318.m6563(i10) && !c16183Arr2[i10].m36860(c18592M19868)) {
                            m48260(c18592M19868, i10, false, c18592M19868.m42319());
                        }
                    }
                }
                if (z14) {
                    c8535.m19865().f55509 = true;
                }
            }
            boolean z15 = false;
            while (m48308() && !this.f67212 && (c18592M198511 = c8535.m19859()) != null && (c18592M42313 = c18592M198511.m42313()) != null && this.f67188 >= c18592M42313.m42319() && c18592M42313.f55509) {
                if (z15) {
                    m48230();
                }
                this.f67191 = z13;
                C18592 c18592M19849 = c8535.m19849();
                c18592M19849.getClass();
                if (this.f67219.f41616.f52252.equals(c18592M19849.f55518.f46022.f52252)) {
                    C17474 c17474 = this.f67219.f41616;
                    if (c17474.f52248 == -1) {
                        C17474 c17475 = c18592M19849.f55518.f46022;
                        if (c17475.f52248 != -1 || c17474.f52250 == c17475.f52250) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                C15909 c15909 = c18592M19849.f55518;
                C17474 c17476 = c15909.f46022;
                long j6 = c15909.f46019;
                this.f67219 = m48239(c17476, j6, c15909.f46025, j6, !z9, 0);
                m48289();
                m48273();
                if (m48307() && c18592M19849 == c8535.m19854()) {
                    for (C16183 c16186 : c16183Arr2) {
                        c16186.m36851();
                    }
                }
                if (this.f67219.f41611 == 3) {
                    m48309();
                }
                C3569 c3569M42319 = c8535.m19859().m42315();
                for (int i11 = 0; i11 < c16183Arr2.length; i11++) {
                    if (c3569M42319.m6563(i11)) {
                        c16183Arr2[i11].m36835();
                    }
                }
                z15 = true;
                z13 = false;
            }
            r0 = 0;
            z = true;
            this.f67226.getClass();
        }
        int i12 = this.f67219.f41611;
        if (i12 == z || i12 == 4) {
            return;
        }
        C18592 c18592M198512 = this.f67222.m19859();
        if (c18592M198512 != null) {
            long j7 = j;
            Trace.beginSection("doSomeWork");
            m48273();
            if (c18592M198512.f55523) {
                this.f67198 = C5792.m12990(this.f67205.mo35966());
                c18592M198512.f55519.mo13093(this.f67219.f41605 - this.f67184, this.f67179);
                int i13 = 0;
                z2 = true;
                z3 = true;
                while (true) {
                    C16183[] c16183Arr3 = this.f67230;
                    if (i13 >= c16183Arr3.length) {
                        break;
                    }
                    C16183 c16187 = c16183Arr3[i13];
                    if (c16187.m36854() == 0) {
                        m48245(i13, (boolean) r0);
                    } else {
                        c16187.m36856(this.f67188, this.f67198);
                        z3 = z3 && c16187.m36864();
                        boolean zM36849 = c16187.m36849(c18592M198512);
                        m48245(i13, zM36849);
                        z2 = z2 && zM36849;
                        if (!zM36849) {
                            m48300(i13);
                        }
                    }
                    i13++;
                }
            } else {
                c18592M198512.f55519.mo13100();
                z2 = true;
                z3 = true;
            }
            long j8 = c18592M198512.f55518.f46017;
            if (z3 && c18592M198512.f55523) {
                j2 = -9223372036854775807L;
                z4 = j8 == -9223372036854775807L || j8 <= this.f67219.f41605;
                if (z4 && this.f67212) {
                    this.f67212 = r0;
                    int i14 = this.f67219.f41610;
                    this.f67220.m37679((int) r0);
                    m48242(this.f67221.m49176(this.f67219.f41611, (boolean) r0), i14, 5, (boolean) r0);
                }
                if (!z4 && c18592M198512.f55518.f46024) {
                    m48287(4);
                    m48306();
                    j7 = j7;
                } else {
                    c14569 = this.f67219;
                    if (c14569.f41611 == 2) {
                        c8534 = this.f67222;
                        if (this.f67187 == 0) {
                            zMo27258 = m48274();
                        } else {
                            if (!z2) {
                                zMo27258 = false;
                            } else if (c14569.f41615) {
                                c18592M198510 = c8534.m19859();
                                if (m48271(this.f67219.f41602, c18592M198510.f55518.f46022)) {
                                    jM28602 = ((C12419) this.f67213).m28602();
                                } else {
                                    jM28602 = j2;
                                }
                                c18592M19863 = c8534.m19863();
                                if (c18592M19863.m42322() || !c18592M19863.f55518.f46024) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (c18592M19863.f55518.f46022.m39842() || c18592M19863.f55523) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                if (z5 && !z6) {
                                    long jM48233 = m48233(c18592M19863.m42303());
                                    InterfaceC11927 interfaceC11927 = this.f67217;
                                    C15512 c15512 = this.f67211;
                                    AbstractC6974 abstractC6975 = this.f67219.f41602;
                                    C17474 c17477 = c18592M198510.f55518.f46022;
                                    long jM42317 = c18592M198510.m42317(this.f67188);
                                    float f = this.f67215.mo15356().f11305;
                                    boolean z16 = this.f67219.f41613;
                                    zMo27258 = interfaceC11927.mo27258(new C13938(c15512, abstractC6975, c17477, jM42317, jM48233, f, this.f67178, jM28602));
                                }
                            }
                            if (zMo27258) {
                                m48287(3);
                                this.f67180 = null;
                                if (m48308()) {
                                    m48284(r0, r0);
                                    this.f67215.m35840();
                                    m48309();
                                }
                            }
                        }
                        if (zMo27258) {
                            m48287(3);
                            this.f67180 = null;
                            if (m48308()) {
                                m48284(r0, r0);
                                this.f67215.m35840();
                                m48309();
                            }
                        }
                    } else {
                        j7 = j7;
                    }
                    if (this.f67219.f41611 == 3 && (this.f67187 != 0 ? !z2 : !m48274())) {
                        m48284(m48308(), r0);
                        m48287(2);
                        if (this.f67178) {
                            for (c18592M19859 = this.f67222.m19859(); c18592M19859 != null; c18592M19859 = c18592M19859.m42313()) {
                                for (InterfaceC11617 interfaceC11617 : c18592M19859.m42315().f7248) {
                                    if (interfaceC11617 != null) {
                                        interfaceC11617.mo4754();
                                    }
                                }
                            }
                            ((C12419) this.f67213).m28605();
                        }
                        m48306();
                    }
                }
                if (this.f67219.f41611 == 2) {
                    i3 = 0;
                    while (true) {
                        c16183Arr = this.f67230;
                        if (i3 < c16183Arr.length) {
                            break;
                        }
                        if (c16183Arr[i3].m36860(c18592M198512)) {
                            m48300(i3);
                        }
                        i3++;
                    }
                    c145611 = this.f67219;
                    if (c145611.f41615 && c145611.f41607 < 500000 && m48285(this.f67222.m19863()) && m48308()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (!z7) {
                    this.f67193 = j2;
                } else if (this.f67193 == j2) {
                    this.f67193 = this.f67205.mo35966();
                } else if (this.f67205.mo35966() - this.f67193 >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
                if (m48308() || this.f67219.f41611 != 3) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (this.f67189 || !this.f67192 || !z8) {
                    z = false;
                }
                c145610 = this.f67219;
                if (c145610.f41618 != z) {
                    this.f67219 = c145610.m33322(z);
                }
                this.f67192 = r0;
                if (!z && (i2 = this.f67219.f41611) != 4 && (z8 || i2 == 2 || (i2 == 3 && this.f67187 != 0))) {
                    m48292(j7);
                }
                Trace.endSection();
                return;
            }
            j2 = -9223372036854775807L;
            if (z4) {
                this.f67212 = r0;
                int i15 = this.f67219.f41610;
                this.f67220.m37679((int) r0);
                m48242(this.f67221.m49176(this.f67219.f41611, (boolean) r0), i15, 5, (boolean) r0);
            }
            if (!z4) {
                c14569 = this.f67219;
                if (c14569.f41611 == 2) {
                    c8534 = this.f67222;
                    if (this.f67187 == 0) {
                        zMo27258 = m48274();
                    } else {
                        if (!z2) {
                            zMo27258 = false;
                        } else if (c14569.f41615) {
                            c18592M198510 = c8534.m19859();
                            if (m48271(this.f67219.f41602, c18592M198510.f55518.f46022)) {
                                jM28602 = ((C12419) this.f67213).m28602();
                            } else {
                                jM28602 = j2;
                            }
                            c18592M19863 = c8534.m19863();
                            if (c18592M19863.m42322()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (c18592M19863.f55518.f46022.m39842()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            zMo27258 = z5 ? true : true;
                        }
                        if (zMo27258) {
                            m48287(3);
                            this.f67180 = null;
                            if (m48308()) {
                                m48284(r0, r0);
                                this.f67215.m35840();
                                m48309();
                            }
                        }
                    }
                    if (zMo27258) {
                        m48287(3);
                        this.f67180 = null;
                        if (m48308()) {
                            m48284(r0, r0);
                            this.f67215.m35840();
                            m48309();
                        }
                    }
                } else {
                    j7 = j7;
                }
                if (this.f67219.f41611 == 3) {
                    m48284(m48308(), r0);
                    m48287(2);
                    if (this.f67178) {
                        while (c18592M19859 != null) {
                            while (i < r5) {
                                if (interfaceC11617 != null) {
                                    interfaceC11617.mo4754();
                                }
                            }
                        }
                        ((C12419) this.f67213).m28605();
                    }
                    m48306();
                }
            } else {
                c14569 = this.f67219;
                if (c14569.f41611 == 2) {
                    c8534 = this.f67222;
                    if (this.f67187 == 0) {
                        zMo27258 = m48274();
                    } else {
                        if (!z2) {
                            zMo27258 = false;
                        } else if (c14569.f41615) {
                            c18592M198510 = c8534.m19859();
                            if (m48271(this.f67219.f41602, c18592M198510.f55518.f46022)) {
                                jM28602 = ((C12419) this.f67213).m28602();
                            } else {
                                jM28602 = j2;
                            }
                            c18592M19863 = c8534.m19863();
                            if (c18592M19863.m42322()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (c18592M19863.f55518.f46022.m39842()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                            }
                        }
                        if (zMo27258) {
                            m48287(3);
                            this.f67180 = null;
                            if (m48308()) {
                                m48284(r0, r0);
                                this.f67215.m35840();
                                m48309();
                            }
                        }
                    }
                    if (zMo27258) {
                        m48287(3);
                        this.f67180 = null;
                        if (m48308()) {
                            m48284(r0, r0);
                            this.f67215.m35840();
                            m48309();
                        }
                    }
                } else {
                    j7 = j7;
                }
                if (this.f67219.f41611 == 3) {
                    m48284(m48308(), r0);
                    m48287(2);
                    if (this.f67178) {
                        while (c18592M19859 != null) {
                            while (i < r5) {
                                if (interfaceC11617 != null) {
                                    interfaceC11617.mo4754();
                                }
                            }
                        }
                        ((C12419) this.f67213).m28605();
                    }
                    m48306();
                }
            }
            if (this.f67219.f41611 == 2) {
                i3 = 0;
                while (true) {
                    c16183Arr = this.f67230;
                    if (i3 < c16183Arr.length) {
                        break;
                        break;
                    } else {
                        if (c16183Arr[i3].m36860(c18592M198512)) {
                            m48300(i3);
                        }
                        i3++;
                    }
                }
                c145611 = this.f67219;
                if (c145611.f41615) {
                    z7 = false;
                } else {
                    z7 = false;
                }
            } else {
                z7 = false;
            }
            if (!z7) {
                this.f67193 = j2;
            } else if (this.f67193 == j2) {
                this.f67193 = this.f67205.mo35966();
            } else if (this.f67205.mo35966() - this.f67193 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
            if (m48308()) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.f67189) {
                z = false;
            } else {
                z = false;
            }
            c145610 = this.f67219;
            if (c145610.f41618 != z) {
                this.f67219 = c145610.m33322(z);
            }
            this.f67192 = r0;
            if (!z) {
                m48292(j7);
            }
            Trace.endSection();
            return;
        }
        m48292(j);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48245(final int i, final boolean z) {
        boolean[] zArr = this.f67202;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f67227.mo19707(new Runnable() { // from class: l.ۖۙ֫
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    boolean z2 = z;
                    C21315 c21315 = this.f10205;
                    c21315.f67225.mo47167(i2, c21315.f67230[i2].m36862(), z2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private long m48234(AbstractC6974 abstractC6974, Object obj, long j) {
        long jElapsedRealtime;
        C23738 c23738 = this.f67183;
        int i = abstractC6974.mo15985(obj, c23738).f75532;
        C21727 c21727 = this.f67196;
        abstractC6974.m15986(i, c21727);
        if (c21727.f68438 == -9223372036854775807L || !c21727.m49010() || !c21727.f68435) {
            return -9223372036854775807L;
        }
        long j2 = c21727.f68434;
        if (j2 == -9223372036854775807L) {
            jElapsedRealtime = System.currentTimeMillis();
        } else {
            jElapsedRealtime = j2 + SystemClock.elapsedRealtime();
        }
        return C5792.m12990(jElapsedRealtime - c21727.f68438) - (j + c23738.f75530);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m48271(AbstractC6974 abstractC6974, C17474 c17474) {
        if (c17474.m39842() || abstractC6974.m15990()) {
            return false;
        }
        int i = abstractC6974.mo15985(c17474.f52252, this.f67183).f75532;
        C21727 c21727 = this.f67196;
        abstractC6974.m15986(i, c21727);
        return c21727.m49010() && c21727.f68435 && c21727.f68438 != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ֫ */
    private void m48264(C23326 c23326, boolean z) throws Throwable {
        long j;
        long j2;
        C17474 c17474;
        long j3;
        boolean z2;
        C17474 c17475;
        boolean z3;
        long jLongValue;
        boolean z4;
        long j4;
        long j5;
        boolean z5;
        C8534 c8534;
        boolean z6;
        long jM48235;
        boolean z7;
        C18592 c18592M19859;
        long jMo13091;
        C14569 c14569;
        int i;
        int i2;
        boolean z8;
        long j6;
        this.f67220.m37679(z ? 1 : 0);
        if (this.f67218) {
            this.f67185 = c23326;
            return;
        }
        Pair pairM48238 = m48238(this.f67219.f41602, c23326, true, this.f67208, this.f67232, this.f67196, this.f67183);
        try {
            if (pairM48238 == null) {
                Pair pairM48237 = m48237(this.f67219.f41602);
                c17475 = (C17474) pairM48237.first;
                jLongValue = ((Long) pairM48237.second).longValue();
                z3 = !this.f67219.f41602.m15990();
                j = -9223372036854775807L;
            } else {
                Object obj = pairM48238.first;
                long jLongValue2 = ((Long) pairM48238.second).longValue();
                long j7 = c23326.f73402 == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                C17474 c17474M19848 = this.f67222.m19848(this.f67219.f41602, obj, jLongValue2);
                if (c17474M19848.m39842()) {
                    this.f67219.f41602.mo15985(c17474M19848.f52252, this.f67183);
                    if (this.f67183.m52777(c17474M19848.f52248) == c17474M19848.f52249) {
                        this.f67183.f75526.getClass();
                    }
                    c17475 = c17474M19848;
                    z3 = true;
                    jLongValue = 0;
                    j = j7;
                } else if (c23326.f73402 == -9223372036854775807L) {
                    j = j7;
                    j2 = 0;
                    c17474 = c17474M19848;
                    j3 = jLongValue2;
                    z2 = true;
                } else {
                    j = j7;
                    j2 = 0;
                    c17474 = c17474M19848;
                    j3 = jLongValue2;
                    z2 = false;
                }
                if (this.f67219.f41602.m15990()) {
                    this.f67195 = c23326;
                } else if (pairM48238 == null) {
                    if (this.f67219.f41611 != 1) {
                        m48287(4);
                    }
                    m48268(false, true, false, true);
                } else {
                    try {
                        if (c17474.equals(this.f67219.f41616)) {
                            c18592M19859 = this.f67222.m19859();
                            if (c18592M19859 == null && c18592M19859.f55523 && j3 != j2) {
                                ?? r1 = c18592M19859.f55519;
                                long j8 = this.f67196.f68431;
                                if (this.f67200 && j8 != -9223372036854775807L) {
                                    this.f67214.getClass();
                                }
                                jMo13091 = r1.mo13091(j3, this.f67216);
                            } else {
                                jMo13091 = j3;
                            }
                            if (C5792.m13013(jMo13091) == C5792.m13013(this.f67219.f41605) || !((i = (c14569 = this.f67219).f41611) == 2 || i == 3)) {
                                j5 = jMo13091;
                            } else {
                                i2 = 2;
                                z8 = z2;
                                j6 = c14569.f41605;
                            }
                            this.f67219 = m48239(c17474, j6, j, j6, z8, i2);
                            return;
                        }
                        j5 = j3;
                        C14569 c145610 = this.f67219;
                        AbstractC6974 abstractC6974 = c145610.f41602;
                        m48253(abstractC6974, c17474, abstractC6974, c145610.f41616, j, true);
                        z2 = z4;
                        j3 = jM48235;
                    } catch (Throwable th) {
                        th = th;
                        j4 = jM48235;
                        this.f67219 = m48239(c17474, j4, j, j4, z4, 2);
                        throw th;
                    }
                    this.f67218 = this.f67200;
                    if (this.f67219.f41611 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c8534 = this.f67222;
                    if (c8534.m19859() != c8534.m19865()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    jM48235 = m48235(c17474, j5, z6, z5);
                    if (j3 != jM48235) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z4 = z2 | z7;
                }
                z8 = z2;
                j6 = j3;
                i2 = 2;
                this.f67219 = m48239(c17474, j6, j, j6, z8, i2);
                return;
            }
            if (this.f67219.f41602.m15990()) {
                this.f67195 = c23326;
            } else if (pairM48238 == null) {
                if (this.f67219.f41611 != 1) {
                    m48287(4);
                }
                m48268(false, true, false, true);
            } else {
                if (c17474.equals(this.f67219.f41616)) {
                    c18592M19859 = this.f67222.m19859();
                    if (c18592M19859 == null) {
                        jMo13091 = j3;
                    } else {
                        jMo13091 = j3;
                    }
                    if (C5792.m13013(jMo13091) == C5792.m13013(this.f67219.f41605)) {
                    }
                    j5 = jMo13091;
                } else {
                    j5 = j3;
                }
                this.f67218 = this.f67200;
                if (this.f67219.f41611 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c8534 = this.f67222;
                if (c8534.m19859() != c8534.m19865()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                jM48235 = m48235(c17474, j5, z6, z5);
                if (j3 != jM48235) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z4 = z2 | z7;
                C14569 c145611 = this.f67219;
                AbstractC6974 abstractC6975 = c145611.f41602;
                m48253(abstractC6975, c17474, abstractC6975, c145611.f41616, j, true);
                z2 = z4;
                j3 = jM48235;
            }
            z8 = z2;
            j6 = j3;
            i2 = 2;
            this.f67219 = m48239(c17474, j6, j, j6, z8, i2);
            return;
        } catch (Throwable th2) {
            th = th2;
            z4 = z2;
            j4 = j3;
        }
        j2 = 0;
        j3 = jLongValue;
        c17474 = c17475;
        z2 = z3;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ֫ */
    private long m48235(C17474 c17474, long j, boolean z, boolean z2) {
        C16183[] c16183Arr;
        m48306();
        m48284(false, true);
        if (z2 || this.f67219.f41611 == 3) {
            m48287(2);
        }
        C8534 c8534 = this.f67222;
        C18592 c18592M19859 = c8534.m19859();
        C18592 c18592M42313 = c18592M19859;
        while (c18592M42313 != null && !c17474.equals(c18592M42313.f55518.f46022)) {
            c18592M42313 = c18592M42313.m42313();
        }
        if (z || c18592M19859 != c18592M42313 || (c18592M42313 != null && c18592M42313.m42320(j) < 0)) {
            int i = 0;
            while (true) {
                c16183Arr = this.f67230;
                if (i >= c16183Arr.length) {
                    break;
                }
                int iM36854 = c16183Arr[i].m36854();
                c16183Arr[i].m36843(this.f67215);
                m48245(i, false);
                this.f67187 -= iM36854;
                i++;
            }
            this.f67228 = -9223372036854775807L;
            if (c18592M42313 != null) {
                while (c8534.m19859() != c18592M42313) {
                    c8534.m19849();
                }
                c8534.m19845(c18592M42313);
                c18592M42313.m42314(BasicLabelFormatter.TRILLION);
                m48269(new boolean[c16183Arr.length], c8534.m19865().m42319());
                c18592M42313.f55509 = true;
            }
        }
        m48278();
        if (c18592M42313 != null) {
            ?? r10 = c18592M42313.f55519;
            c8534.m19845(c18592M42313);
            if (!c18592M42313.f55523) {
                c18592M42313.f55518 = c18592M42313.f55518.m36025(j);
            } else if (c18592M42313.f55515) {
                j = r10.mo13090(j);
                r10.mo13093(j - this.f67184, this.f67179);
            }
            m48280(j);
            m48304();
        } else {
            c8534.m19864();
            m48280(j);
        }
        m48297(false);
        this.f67229.mo19710(2);
        return j;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m48280(long j) {
        C18592 c18592M19859 = this.f67222.m19859();
        long jM42320 = c18592M19859 == null ? j + BasicLabelFormatter.TRILLION : c18592M19859.m42320(j);
        this.f67188 = jM42320;
        this.f67215.m35841(jM42320);
        for (C16183 c16183 : this.f67230) {
            c16183.m36844(c18592M19859, this.f67188);
        }
        for (C18592 c18592M198510 = r0.m19859(); c18592M198510 != null; c18592M198510 = c18592M198510.m42313()) {
            for (InterfaceC11617 interfaceC11617 : c18592M198510.m42315().f7248) {
                if (interfaceC11617 != null) {
                    interfaceC11617.mo4758();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48257(C11491 c11491) {
        this.f67216 = c11491;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m48288(boolean z) throws Throwable {
        if (!z) {
            this.f67218 = false;
            this.f67229.mo19712(37);
            C23326 c23326 = this.f67185;
            if (c23326 != null) {
                m48264(c23326, false);
                this.f67185 = null;
            }
        }
        this.f67200 = z;
        for (C16183 c16183 : this.f67230) {
            c16183.m36847(this.f67200 ? this.f67214 : null);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m48283(C22220 c22220) {
        this.f67214 = c22220;
        for (C16183 c16183 : this.f67230) {
            c16183.m36847(this.f67200 ? this.f67214 : null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48266(boolean z, C15968 c15968) {
        if (this.f67201 != z) {
            this.f67201 = z;
            if (!z) {
                for (C16183 c16183 : this.f67230) {
                    c16183.m36853();
                }
            }
        }
        if (c15968 != null) {
            c15968.m36284();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48247(Object obj, C15968 c15968) {
        for (C16183 c16183 : this.f67230) {
            c16183.m36839(obj);
        }
        int i = this.f67219.f41611;
        if (i == 3 || i == 2) {
            this.f67229.mo19710(2);
        }
        if (c15968 != null) {
            c15968.m36284();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48267(boolean z, boolean z2) {
        m48268(z || !this.f67201, false, true, false);
        this.f67220.m37679(z2 ? 1 : 0);
        this.f67217.mo27263(this.f67211);
        this.f67221.m49176(1, this.f67219.f41613);
        m48287(1);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48258(C15968 c15968) {
        C13899 c13899 = this.f67177;
        InterfaceC20664 interfaceC20664 = this.f67229;
        try {
            m48268(true, false, true, false);
            C16183[] c16183Arr = this.f67230;
            for (int i = 0; i < c16183Arr.length; i++) {
                ((AbstractC7054) this.f67204[i]).m16251();
                c16183Arr[i].m36868();
            }
            this.f67217.mo27260(this.f67211);
            this.f67221.m49178();
            this.f67190.mo17539();
            m48287(1);
        } finally {
            interfaceC20664.mo19709();
            c13899.m31618();
            c15968.m36284();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e A[PHI: r0
      0x010e: PHI (r0v13 l.ۙ᩵֫) = (r0v12 l.ۙ᩵֫), (r0v12 l.ۙ᩵֫), (r0v18 l.ۙ᩵֫), (r0v18 l.ۙ᩵֫) binds: [B:39:0x00d2, B:41:0x00d6, B:43:0x00e7, B:45:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    private void m48268(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        long j2;
        long j3;
        AbstractC6974 abstractC6974;
        C17474 c17474;
        this.f67229.mo19712(2);
        this.f67218 = false;
        this.f67185 = null;
        this.f67180 = null;
        m48284(false, true);
        this.f67215.m35843();
        this.f67188 = BasicLabelFormatter.TRILLION;
        int i = 0;
        while (true) {
            try {
                C16183[] c16183Arr = this.f67230;
                if (i >= c16183Arr.length) {
                    break;
                }
                int iM36854 = c16183Arr[i].m36854();
                c16183Arr[i].m36843(this.f67215);
                m48245(i, false);
                this.f67187 -= iM36854;
                i++;
            } catch (RuntimeException | C19735 e) {
                C21334.m48348("Disable failed.", e);
            }
        }
        this.f67228 = -9223372036854775807L;
        if (z) {
            for (C16183 c16183 : this.f67230) {
                try {
                    c16183.m36853();
                } catch (RuntimeException e2) {
                    C21334.m48348("Reset failed.", e2);
                }
            }
        }
        this.f67187 = 0;
        C14569 c14569 = this.f67219;
        C17474 c17475 = c14569.f41616;
        long j4 = c14569.f41605;
        if (this.f67219.f41616.m39842()) {
            j = this.f67219.f41606;
        } else {
            C14569 c145610 = this.f67219;
            C23738 c23738 = this.f67183;
            C17474 c17476 = c145610.f41616;
            AbstractC6974 abstractC6975 = c145610.f41602;
            if (abstractC6975.m15990() || abstractC6975.mo15985(c17476.f52252, c23738).f75531) {
                j = this.f67219.f41606;
            } else {
                j = this.f67219.f41605;
            }
        }
        if (z2) {
            this.f67195 = null;
            Pair pairM48237 = m48237(this.f67219.f41602);
            c17475 = (C17474) pairM48237.first;
            long jLongValue = ((Long) pairM48237.second).longValue();
            z5 = c17475.equals(this.f67219.f41616) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            z5 = false;
            j2 = j4;
            j3 = j;
        }
        this.f67222.m19864();
        this.f67210 = false;
        AbstractC6974 abstractC6974M34688 = this.f67219.f41602;
        if (z3 && (abstractC6974M34688 instanceof C15239)) {
            abstractC6974M34688 = ((C15239) abstractC6974M34688).m34688(this.f67209.m11111());
            if (c17475.f52248 != -1) {
                abstractC6974M34688.mo15985(c17475.f52252, this.f67183);
                int i2 = this.f67183.f75532;
                C21727 c21727 = this.f67196;
                abstractC6974M34688.mo15983(i2, c21727, 0L);
                if (c21727.m49010()) {
                    abstractC6974 = abstractC6974M34688;
                    c17474 = new C17474(c17475.f52251, c17475.f52252);
                } else {
                    abstractC6974 = abstractC6974M34688;
                    c17474 = c17475;
                }
            } else {
                abstractC6974 = abstractC6974M34688;
                c17474 = c17475;
            }
        } else {
            abstractC6974 = abstractC6974M34688;
            c17474 = c17475;
        }
        C14569 c145611 = this.f67219;
        int i3 = c145611.f41611;
        C19735 c19735 = z4 ? null : c145611.f41608;
        C8243 c8243 = z5 ? C8243.f21835 : c145611.f41603;
        C3569 c3569 = z5 ? this.f67197 : c145611.f41609;
        List listM36872of = z5 ? AbstractC16192.m36872of() : c145611.f41619;
        C14569 c145612 = this.f67219;
        this.f67219 = new C14569(abstractC6974, c17474, j3, j2, i3, c19735, false, c8243, c3569, listM36872of, c17474, c145612.f41613, c145612.f41621, c145612.f41610, c145612.f41620, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f67222.m19855();
            this.f67209.m11112();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private Pair m48237(AbstractC6974 abstractC6974) {
        long j = 0;
        if (abstractC6974.m15990()) {
            return Pair.create(C14569.m33311(), 0L);
        }
        int iMo15979 = abstractC6974.mo15979(this.f67232);
        Pair pairM15980 = abstractC6974.m15980(this.f67196, this.f67183, iMo15979, -9223372036854775807L);
        C17474 c17474M19848 = this.f67222.m19848(abstractC6974, pairM15980.first, 0L);
        long jLongValue = ((Long) pairM15980.second).longValue();
        if (c17474M19848.m39842()) {
            Object obj = c17474M19848.f52252;
            C23738 c23738 = this.f67183;
            abstractC6974.mo15985(obj, c23738);
            if (c17474M19848.f52249 == c23738.m52777(c17474M19848.f52248)) {
                c23738.f75526.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(c17474M19848, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ܽ */
    private void m48295(C13229 c13229) {
        c13229.getClass();
        Looper looperM30278 = c13229.m30278();
        Looper looper = this.f67186;
        InterfaceC20664 interfaceC20664 = this.f67229;
        if (looperM30278 == looper) {
            m48282(c13229);
            int i = this.f67219.f41611;
            if (i == 3 || i == 2) {
                interfaceC20664.mo19710(2);
                return;
            }
            return;
        }
        interfaceC20664.mo19704(15, c13229).mo45367();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m48301(final C13229 c13229) {
        Looper looperM30278 = c13229.m30278();
        if (!looperM30278.getThread().isAlive()) {
            C21334.m48351("Trying to send message on a dead thread.");
            c13229.m30281(false);
        } else {
            this.f67205.mo35964(looperM30278, null).mo19707(new Runnable() { // from class: l.ۘۙ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C21315.m48263(this.f14504, c13229);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48263(C21315 c21315, C13229 c13229) {
        try {
            m48282(c13229);
        } catch (C19735 e) {
            C21334.m48348("Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48252(AbstractC6974 abstractC6974, AbstractC6974 abstractC6975) {
        if (abstractC6974.m15990() && abstractC6975.m15990()) {
            return;
        }
        ArrayList arrayList = this.f67194;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ((C9914) arrayList.get(size)).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private void m48278() {
        if (this.f67207 && m48307()) {
            for (C16183 c16183 : this.f67230) {
                int iM36854 = c16183.m36854();
                c16183.m36857(this.f67215);
                this.f67187 -= iM36854 - c16183.m36854();
            }
            this.f67228 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m48270(int i, C17474 c17474) {
        C8534 c8534 = this.f67222;
        if (c8534.m19854() == null || !c8534.m19854().f55518.f46022.equals(c17474)) {
            return false;
        }
        return this.f67230[i].m36865(c8534.m19854());
    }

    /* JADX INFO: renamed from: ۢ */
    private void m48279() {
        m48277();
        m48302(true);
    }

    /* JADX INFO: renamed from: ۠ */
    private void m48277() {
        float f = this.f67215.mo15356().f11305;
        C18592 c18592M19859 = this.f67222.m19859();
        C18592 c18592M19865 = this.f67222.m19865();
        C3569 c3569 = null;
        boolean z = true;
        while (c18592M19859 != null && c18592M19859.f55523) {
            C14569 c14569 = this.f67219;
            C3569 c3569M42312 = c18592M19859.m42312(f, c14569.f41602, c14569.f41613);
            C3569 c35610 = c18592M19859 == this.f67222.m19859() ? c3569M42312 : c3569;
            C3569 c3569M42315 = c18592M19859.m42315();
            InterfaceC11617[] interfaceC11617Arr = c3569M42312.f7248;
            if (c3569M42315 != null && c3569M42315.f7248.length == interfaceC11617Arr.length) {
                int i = 0;
                while (true) {
                    if (i < interfaceC11617Arr.length) {
                        if (c3569M42312.m6564(c3569M42315, i)) {
                            i++;
                        }
                    } else {
                        if (c18592M19859 == c18592M19865) {
                            z = false;
                        }
                        c18592M19859 = c18592M19859.m42313();
                        c3569 = c35610;
                    }
                }
            }
            if (z) {
                C18592 c18592M198510 = this.f67222.m19859();
                boolean z2 = (this.f67222.m19845(c18592M198510) & 1) != 0;
                boolean[] zArr = new boolean[this.f67230.length];
                c35610.getClass();
                long jM42305 = c18592M198510.m42305(c35610, this.f67219.f41605, z2, zArr);
                C14569 c145610 = this.f67219;
                boolean z3 = (c145610.f41611 == 4 || jM42305 == c145610.f41605) ? false : true;
                C14569 c145611 = this.f67219;
                this.f67219 = m48239(c145611.f41616, jM42305, c145611.f41606, c145611.f41612, z3, 5);
                if (z3) {
                    m48280(jM42305);
                }
                m48278();
                boolean[] zArr2 = new boolean[this.f67230.length];
                int i2 = 0;
                while (true) {
                    C16183[] c16183Arr = this.f67230;
                    if (i2 >= c16183Arr.length) {
                        break;
                    }
                    int iM36854 = c16183Arr[i2].m36854();
                    zArr2[i2] = this.f67230[i2].m36870();
                    this.f67230[i2].m36846(c18592M198510.f55517[i2], this.f67215, this.f67188, zArr[i2]);
                    if (iM36854 - this.f67230[i2].m36854() > 0) {
                        m48245(i2, false);
                    }
                    this.f67187 -= iM36854 - this.f67230[i2].m36854();
                    i2++;
                }
                m48269(zArr2, this.f67188);
                c18592M198510.f55509 = true;
            } else {
                this.f67222.m19845(c18592M19859);
                if (c18592M19859.f55523) {
                    long jMax = Math.max(c18592M19859.f55518.f46019, c18592M19859.m42317(this.f67188));
                    if (this.f67207 && m48307() && this.f67222.m19854() == c18592M19859) {
                        m48278();
                    }
                    c18592M19859.m42304(c3569M42312, jMax);
                }
            }
            m48297(true);
            if (this.f67219.f41611 != 4) {
                m48304();
                m48273();
                this.f67229.mo19710(2);
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private boolean m48274() {
        C18592 c18592M19859 = this.f67222.m19859();
        long j = c18592M19859.f55518.f46017;
        if (c18592M19859.f55523) {
            return j == -9223372036854775807L || this.f67219.f41605 < j || !m48308();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x033a  */
    /* JADX WARN: Code duplicated, block: B:169:0x033d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0352  */
    /* JADX WARN: Code duplicated, block: B:176:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0371  */
    /* JADX WARN: Code duplicated, block: B:185:0x037d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0380  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    private void m48254(AbstractC6974 abstractC6974, boolean z) throws Throwable {
        C17474 c17474;
        Object obj;
        int i;
        int iM48232;
        Object obj2;
        long jM12992;
        ?? r21;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        long j2;
        C22656 c22656;
        int i3;
        int iMo15979;
        boolean z7;
        boolean z8;
        long j3;
        ?? r8;
        int i4;
        long jM48235;
        int i5;
        long j4;
        Object obj3;
        boolean z9;
        int i6;
        C14569 c14569 = this.f67219;
        C23326 c23326 = this.f67195;
        C8534 c8534 = this.f67222;
        int i7 = this.f67208;
        boolean z10 = this.f67232;
        C21727 c21727 = this.f67196;
        C23738 c23738 = this.f67183;
        if (abstractC6974.m15990()) {
            j3 = -9223372036854775807L;
            c22656 = new C22656(C14569.m33311(), 0L, -9223372036854775807L, false, true, false);
            i = -1;
        } else {
            C17474 c17475 = c14569.f41616;
            Object obj4 = c17475.f52252;
            AbstractC6974 abstractC6975 = c14569.f41602;
            boolean z11 = abstractC6975.m15990() || abstractC6975.mo15985(c17475.f52252, c23738).f75531;
            long j5 = (c14569.f41616.m39842() || z11) ? c14569.f41606 : c14569.f41605;
            if (c23326 != null) {
                boolean z12 = false;
                Pair pairM48238 = m48238(abstractC6974, c23326, true, i7, z10, c21727, c23738);
                if (pairM48238 == null) {
                    iMo15979 = abstractC6974.mo15979(z10);
                    jM12992 = j5;
                    obj2 = obj4;
                    z7 = false;
                    z8 = true;
                } else {
                    if (c23326.f73402 == -9223372036854775807L) {
                        iMo15979 = abstractC6974.mo15985(pairM48238.first, c23738).f75532;
                        jM12992 = j5;
                        obj2 = obj4;
                        z7 = false;
                    } else {
                        obj2 = pairM48238.first;
                        jM12992 = ((Long) pairM48238.second).longValue();
                        iMo15979 = -1;
                        z7 = true;
                    }
                    z12 = c14569.f41611 == 4;
                    z8 = false;
                }
                z4 = z7;
                z3 = z8;
                z2 = z12;
                c17474 = c17475;
                i = -1;
                i2 = iMo15979;
            } else {
                c17474 = c17475;
                if (c14569.f41602.m15990()) {
                    iM48232 = abstractC6974.mo15979(z10);
                    obj = obj4;
                    i = -1;
                } else {
                    obj = obj4;
                    if (abstractC6974.mo15978(obj) == -1) {
                        i = -1;
                        iM48232 = m48232(c21727, c23738, i7, z10, obj, c14569.f41602, abstractC6974);
                        if (iM48232 == -1) {
                            iM48232 = abstractC6974.mo15979(z10);
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5;
                        c17474 = c17474;
                        i2 = iM48232;
                        z3 = z6;
                        obj2 = obj;
                        z2 = false;
                        jM12992 = j5;
                        z4 = false;
                    } else {
                        i = -1;
                        if (j5 == -9223372036854775807L) {
                            iM48232 = abstractC6974.mo15985(obj, c23738).f75532;
                        } else if (z11) {
                            c17474 = c17474;
                            c14569.f41602.mo15985(c17474.f52252, c23738);
                            if (c14569.f41602.mo15983(c23738.f75532, c21727, 0L).f68436 == c14569.f41602.mo15978(c17474.f52252)) {
                                Pair pairM15980 = abstractC6974.m15980(c21727, c23738, abstractC6974.mo15985(obj, c23738).f75532, j5 + c23738.f75530);
                                obj2 = pairM15980.first;
                                jM12992 = ((Long) pairM15980.second).longValue();
                            } else if (abstractC6974.mo15985(obj, c23738).f75527 != -9223372036854775807L) {
                                r21 = 0;
                                jM12992 = C5792.m12992(j5, 0L, c23738.f75527 - 1);
                                obj2 = obj;
                            } else {
                                obj2 = obj;
                                jM12992 = j5;
                            }
                            i2 = -1;
                            z2 = false;
                            z3 = false;
                            z4 = true;
                        } else {
                            iM48232 = -1;
                            z6 = false;
                            i2 = iM48232;
                            z3 = z6;
                            obj2 = obj;
                            z2 = false;
                            jM12992 = j5;
                            z4 = false;
                        }
                    }
                }
                z6 = false;
                i2 = iM48232;
                z3 = z6;
                obj2 = obj;
                z2 = false;
                jM12992 = j5;
                z4 = false;
            }
            if (i2 != i) {
                Pair pairM15981 = abstractC6974.m15980(c21727, c23738, i2, -9223372036854775807L);
                obj2 = pairM15981.first;
                jM12992 = ((Long) pairM15981.second).longValue();
                j = -9223372036854775807L;
            } else {
                j = jM12992;
            }
            C17474 c17474M19848 = c8534.m19848(abstractC6974, obj2, jM12992);
            int i8 = c17474M19848.f52250;
            boolean z13 = c17474.f52252.equals(obj2) && !c17474.m39842() && !c17474M19848.m39842() && (i8 == i || ((i3 = c17474.f52250) != i && i8 >= i3));
            C23738 c23738Mo15985 = abstractC6974.mo15985(obj2, c23738);
            if (!z11 && j5 == j) {
                Object obj5 = c17474.f52252;
                int i9 = c17474.f52248;
                if (obj5.equals(c17474M19848.f52252)) {
                    if (c17474.m39842()) {
                        c23738Mo15985.m52780(i9);
                    }
                    if (c17474M19848.m39842()) {
                        c23738Mo15985.m52780(c17474M19848.f52248);
                    }
                }
            }
            if (z13) {
                c17474M19848 = c17474;
            }
            if (!c17474M19848.m39842()) {
                j2 = jM12992;
            } else if (c17474M19848.equals(c17474)) {
                jM12992 = c14569.f41605;
                j2 = jM12992;
            } else {
                abstractC6974.mo15985(c17474M19848.f52252, c23738);
                if (c17474M19848.f52249 == c23738.m52777(c17474M19848.f52248)) {
                    c23738.f75526.getClass();
                }
                j2 = 0;
            }
            c22656 = new C22656(c17474M19848, j2, j, z2, z3, z4);
        }
        C17474 c17476 = c22656.f71477;
        long j6 = c22656.f71478;
        boolean z14 = c22656.f71475;
        long j7 = c22656.f71479;
        boolean z15 = (this.f67219.f41616.equals(c17476) && j7 == this.f67219.f41605) ? false : true;
        try {
            if (c22656.f71474) {
                if (this.f67219.f41611 != 1) {
                    m48287(4);
                }
                m48268(false, false, false, true);
            }
            for (C16183 c16183 : this.f67230) {
                c16183.m36842(abstractC6974);
            }
            try {
                if (z15) {
                    jM48235 = j7;
                    i4 = 2;
                    if (!abstractC6974.m15990()) {
                        for (C18592 c18592M19859 = this.f67222.m19859(); c18592M19859 != null; c18592M19859 = c18592M19859.m42313()) {
                            if (c18592M19859.f55518.f46022.equals(c17476)) {
                                c18592M19859.f55518 = this.f67222.m19847(abstractC6974, c18592M19859.f55518);
                                c18592M19859.m42311();
                            }
                        }
                        C8534 c8535 = this.f67222;
                        jM48235 = m48235(c17476, jM48235, c8535.m19859() != c8535.m19865(), z14);
                        i5 = 2;
                    }
                    C14569 c145610 = this.f67219;
                    AbstractC6974 abstractC6976 = c145610.f41602;
                    C17474 c17477 = c145610.f41616;
                    if (c22656.f71476) {
                        j4 = jM48235;
                    } else {
                        j4 = -9223372036854775807L;
                    }
                    m48253(abstractC6974, c17476, abstractC6976, c17477, j4, false);
                    if (z15 || j6 != this.f67219.f41606) {
                        C14569 c145611 = this.f67219;
                        obj3 = c145611.f41616.f52252;
                        AbstractC6974 abstractC6977 = c145611.f41602;
                        if (z15 || !z || abstractC6977.m15990() || abstractC6977.mo15985(obj3, this.f67183).f75531) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        long j8 = this.f67219.f41612;
                        if (abstractC6974.mo15978(obj3) == i) {
                            i6 = 4;
                        } else {
                            i6 = 3;
                        }
                        this.f67219 = m48239(c17476, jM48235, j6, j8, z9, i6);
                    }
                    m48289();
                    m48252(abstractC6974, this.f67219.f41602);
                    this.f67219 = this.f67219.m33316(abstractC6974);
                    if (!abstractC6974.m15990()) {
                        this.f67195 = null;
                    }
                    m48297(false);
                    this.f67229.mo19710(i5);
                }
                try {
                    i4 = 2;
                    jM48235 = j7;
                    int iM19843 = this.f67222.m19843(abstractC6974, this.f67188, this.f67222.m19865() == null ? 0L : m48236(this.f67222.m19865()), (!m48307() || this.f67222.m19854() == null) ? 0L : m48236(this.f67222.m19854()));
                    if ((iM19843 & 1) != 0) {
                        m48302(false);
                    } else if ((iM19843 & 2) != 0) {
                        m48278();
                    }
                } catch (Throwable th) {
                    th = th;
                    j3 = j7;
                    r21 = 2;
                    r8 = r21;
                    C14569 c145612 = this.f67219;
                    ?? r37 = r8;
                    m48253(abstractC6974, c17476, c145612.f41602, c145612.f41616, c22656.f71476 ? j3 : -9223372036854775807L, false);
                    if (z15 || j6 != this.f67219.f41606) {
                        C14569 c145613 = this.f67219;
                        Object obj6 = c145613.f41616.f52252;
                        AbstractC6974 abstractC6978 = c145613.f41602;
                        this.f67219 = m48239(c17476, j3, j6, this.f67219.f41612, z15 && z && !abstractC6978.m15990() && !abstractC6978.mo15985(obj6, this.f67183).f75531, abstractC6974.mo15978(obj6) == i ? 4 : 3);
                    }
                    m48289();
                    m48252(abstractC6974, this.f67219.f41602);
                    this.f67219 = this.f67219.m33316(abstractC6974);
                    if (!abstractC6974.m15990()) {
                        this.f67195 = null;
                    }
                    m48297(false);
                    this.f67229.mo19710(r37 == true ? 1 : 0);
                    throw th;
                }
                i5 = i4;
                C14569 c145614 = this.f67219;
                AbstractC6974 abstractC6979 = c145614.f41602;
                C17474 c17478 = c145614.f41616;
                if (c22656.f71476) {
                    j4 = jM48235;
                } else {
                    j4 = -9223372036854775807L;
                }
                m48253(abstractC6974, c17476, abstractC6979, c17478, j4, false);
                if (z15) {
                    C14569 c145615 = this.f67219;
                    obj3 = c145615.f41616.f52252;
                    AbstractC6974 abstractC69710 = c145615.f41602;
                    if (z15) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    long j9 = this.f67219.f41612;
                    if (abstractC6974.mo15978(obj3) == i) {
                        i6 = 4;
                    } else {
                        i6 = 3;
                    }
                    this.f67219 = m48239(c17476, jM48235, j6, j9, z9, i6);
                } else {
                    C14569 c145616 = this.f67219;
                    obj3 = c145616.f41616.f52252;
                    AbstractC6974 abstractC69711 = c145616.f41602;
                    if (z15) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    long j10 = this.f67219.f41612;
                    if (abstractC6974.mo15978(obj3) == i) {
                        i6 = 4;
                    } else {
                        i6 = 3;
                    }
                    this.f67219 = m48239(c17476, jM48235, j6, j10, z9, i6);
                }
                m48289();
                m48252(abstractC6974, this.f67219.f41602);
                this.f67219 = this.f67219.m33316(abstractC6974);
                if (!abstractC6974.m15990()) {
                    this.f67195 = null;
                }
                m48297(false);
                this.f67229.mo19710(i5);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            j3 = j7;
            r8 = 2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48253(AbstractC6974 abstractC6974, C17474 c17474, AbstractC6974 abstractC6975, C17474 c17475, long j, boolean z) {
        boolean zM48271 = m48271(abstractC6974, c17474);
        Object obj = c17474.f52252;
        if (!zM48271) {
            C4963 c4963 = c17474.m39842() ? C4963.f11302 : this.f67219.f41620;
            C15770 c15770 = this.f67215;
            if (c15770.mo15356().equals(c4963)) {
                return;
            }
            this.f67229.mo19712(16);
            c15770.mo15343(c4963);
            m48250(this.f67219.f41620, c4963.f11305, false, false);
            return;
        }
        C23738 c23738 = this.f67183;
        int i = abstractC6974.mo15985(obj, c23738).f75532;
        C21727 c21727 = this.f67196;
        abstractC6974.m15986(i, c21727);
        C8295 c8295 = c21727.f68439;
        C12419 c12419 = (C12419) this.f67213;
        c12419.m28604(c8295);
        if (j != -9223372036854775807L) {
            c12419.m28603(m48234(abstractC6974, obj, j));
            return;
        }
        if (!C12826.equals(!abstractC6975.m15990() ? abstractC6975.mo15983(abstractC6975.mo15985(c17475.f52252, c23738).f75532, c21727, 0L).f68437 : null, c21727.f68437) || z) {
            c12419.m28603(-9223372036854775807L);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private long m48236(C18592 c18592) {
        if (c18592 == null) {
            return 0L;
        }
        long jM42316 = c18592.m42316();
        if (!c18592.f55523) {
            return jM42316;
        }
        int i = 0;
        while (true) {
            C16183[] c16183Arr = this.f67230;
            if (i >= c16183Arr.length) {
                return jM42316;
            }
            if (c16183Arr[i].m36860(c18592)) {
                long jM36855 = c16183Arr[i].m36855(c18592);
                if (jM36855 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM42316 = Math.max(jM36855, jM42316);
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.֡ܽۧ, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ᩵ */
    private void m48305() {
        C8534 c8534 = this.f67222;
        c8534.m19856();
        C18592 c18592M19866 = c8534.m19866();
        if (c18592M19866 != null) {
            ?? r1 = c18592M19866.f55519;
            if ((!c18592M19866.f55512 || c18592M19866.f55523) && !r1.mo4631()) {
                AbstractC6974 abstractC6974 = this.f67219.f41602;
                if (c18592M19866.f55523) {
                    r1.mo4633();
                }
                if (this.f67217.mo27264()) {
                    if (!c18592M19866.f55512) {
                        long j = c18592M19866.f55518.f46019;
                        c18592M19866.f55512 = true;
                        r1.mo13097(this, j);
                    } else {
                        C7903 c7903 = new C7903();
                        c7903.m18255(c18592M19866.m42317(this.f67188));
                        c7903.m18253(this.f67215.mo15356().f11305);
                        c7903.m18254(this.f67199);
                        c18592M19866.m42308(new C13268(c7903));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܶ */
    private void m48289() {
        C18592 c18592M19859 = this.f67222.m19859();
        this.f67212 = c18592M19859 != null && c18592M19859.f55518.f46026 && this.f67223;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m48294(InterfaceC11441 interfaceC11441) {
        C8534 c8534 = this.f67222;
        boolean zM19858 = c8534.m19858(interfaceC11441);
        C15770 c15770 = this.f67215;
        if (zM19858) {
            C18592 c18592M19863 = c8534.m19863();
            c18592M19863.getClass();
            if (!c18592M19863.f55523) {
                float f = c15770.mo15356().f11305;
                C14569 c14569 = this.f67219;
                c18592M19863.m42306(f, c14569.f41602, c14569.f41613);
            }
            m48259(c18592M19863.f55518.f46022, c18592M19863.m42318(), c18592M19863.m42315());
            if (c18592M19863 == c8534.m19859()) {
                m48280(c18592M19863.f55518.f46019);
                m48269(new boolean[this.f67230.length], c8534.m19865().m42319());
                c18592M19863.f55509 = true;
                C14569 c145610 = this.f67219;
                C17474 c17474 = c145610.f41616;
                long j = c18592M19863.f55518.f46019;
                this.f67219 = m48239(c17474, j, c145610.f41606, j, false, 5);
            }
            m48304();
            return;
        }
        C18592 c18592M19850 = c8534.m19850(interfaceC11441);
        if (c18592M19850 != null) {
            C23877.m52960(true ^ c18592M19850.f55523);
            float f2 = c15770.mo15356().f11305;
            C14569 c145611 = this.f67219;
            c18592M19850.m42306(f2, c145611.f41602, c145611.f41613);
            if (c8534.m19862(interfaceC11441)) {
                m48305();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m48281(InterfaceC11441 interfaceC11441) {
        C8534 c8534 = this.f67222;
        if (c8534.m19858(interfaceC11441)) {
            c8534.m19852(this.f67188);
            m48304();
        } else if (c8534.m19862(interfaceC11441)) {
            m48305();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48250(C4963 c4963, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f67220.m37679(1);
            }
            this.f67219 = this.f67219.m33315(c4963);
        }
        float f2 = c4963.f11305;
        C18592 c18592M19859 = this.f67222.m19859();
        while (true) {
            i = 0;
            if (c18592M19859 == null) {
                break;
            }
            InterfaceC11617[] interfaceC11617Arr = c18592M19859.m42315().f7248;
            int length = interfaceC11617Arr.length;
            while (i < length) {
                InterfaceC11617 interfaceC11617 = interfaceC11617Arr[i];
                if (interfaceC11617 != null) {
                    interfaceC11617.mo4749(f2);
                }
                i++;
            }
            c18592M19859 = c18592M19859.m42313();
        }
        C16183[] c16183Arr = this.f67230;
        int length2 = c16183Arr.length;
        while (i < length2) {
            c16183Arr[i].m36837(f, c4963.f11305);
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ᩴ */
    private void m48304() {
        long jM42317;
        boolean zMo27261 = false;
        if (m48285(this.f67222.m19863())) {
            C18592 c18592M19863 = this.f67222.m19863();
            long jM48233 = m48233(!c18592M19863.f55523 ? 0L : c18592M19863.f55519.mo4634());
            if (c18592M19863 == this.f67222.m19859()) {
                jM42317 = c18592M19863.m42317(this.f67188);
            } else {
                jM42317 = c18592M19863.m42317(this.f67188) - c18592M19863.f55518.f46019;
            }
            long j = jM42317;
            long jM28602 = m48271(this.f67219.f41602, c18592M19863.f55518.f46022) ? ((C12419) this.f67213).m28602() : -9223372036854775807L;
            C15512 c15512 = this.f67211;
            AbstractC6974 abstractC6974 = this.f67219.f41602;
            C17474 c17474 = c18592M19863.f55518.f46022;
            float f = this.f67215.mo15356().f11305;
            boolean z = this.f67219.f41613;
            C13938 c13938 = new C13938(c15512, abstractC6974, c17474, j, jM48233, f, this.f67178, jM28602);
            boolean zMo27262 = this.f67217.mo27261(c13938);
            C18592 c18592M19859 = this.f67222.m19859();
            if (zMo27262 || !c18592M19859.f55523 || jM48233 >= 500000 || (this.f67184 <= 0 && !this.f67179)) {
                zMo27261 = zMo27262;
            } else {
                c18592M19859.f55519.mo13093(this.f67219.f41605, false);
                zMo27261 = this.f67217.mo27261(c13938);
            }
        }
        this.f67210 = zMo27261;
        if (zMo27261) {
            C18592 c18592M19864 = this.f67222.m19863();
            c18592M19864.getClass();
            C7903 c7903 = new C7903();
            c7903.m18255(c18592M19864.m42317(this.f67188));
            c7903.m18253(this.f67215.mo15356().f11305);
            c7903.m18254(this.f67199);
            c18592M19864.m42308(new C13268(c7903));
        }
        m48275();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.֡ܽۧ, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ۧ */
    public static boolean m48285(C18592 c18592) {
        if (c18592 != null) {
            try {
                ?? r1 = c18592.f55519;
                if (!c18592.f55523) {
                    r1.mo13100();
                } else {
                    for (InterfaceC20314 interfaceC20314 : c18592.f55517) {
                        if (interfaceC20314 != null) {
                            interfaceC20314.mo8568();
                        }
                    }
                }
                if ((!c18592.f55523 ? 0L : r1.mo4634()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ۙ */
    private void m48275() {
        C18592 c18592M19863 = this.f67222.m19863();
        boolean z = this.f67210 || (c18592M19863 != null && c18592M19863.f55519.mo4631());
        C14569 c14569 = this.f67219;
        if (z != c14569.f41615) {
            this.f67219 = c14569.m33320(z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14569 m48239(C17474 c17474, long j, long j2, long j3, boolean z, int i) {
        List list;
        C18592 c18592M19859;
        boolean z2;
        this.f67203 = (!this.f67203 && j == this.f67219.f41605 && c17474.equals(this.f67219.f41616)) ? false : true;
        m48289();
        C14569 c14569 = this.f67219;
        C8243 c8243M42318 = c14569.f41603;
        C3569 c3569M42315 = c14569.f41609;
        List listM36872of = c14569.f41619;
        if (this.f67209.m11115()) {
            C18592 c18592M198510 = this.f67222.m19859();
            if (c18592M198510 == null) {
                c8243M42318 = C8243.f21835;
            } else {
                c8243M42318 = c18592M198510.m42318();
            }
            if (c18592M198510 == null) {
                c3569M42315 = this.f67197;
            } else {
                c3569M42315 = c18592M198510.m42315();
            }
            InterfaceC11617[] interfaceC11617Arr = c3569M42315.f7248;
            C4123 c4123 = new C4123();
            boolean z3 = false;
            for (InterfaceC11617 interfaceC11617 : interfaceC11617Arr) {
                if (interfaceC11617 != null) {
                    C25079 c25079 = interfaceC11617.mo4748(0).f28526;
                    if (c25079 == null) {
                        c4123.m18184(new C25079(new InterfaceC16361[0]));
                    } else {
                        c4123.m18184(c25079);
                        z3 = true;
                    }
                }
            }
            AbstractC16192 abstractC16192M8329 = z3 ? c4123.m8329() : AbstractC16192.m36872of();
            if (c18592M198510 != null) {
                C15909 c15909 = c18592M198510.f55518;
                if (c15909.f46025 != j2) {
                    c18592M198510.f55518 = c15909.m36024(j2);
                }
            }
            C16183[] c16183Arr = this.f67230;
            C8534 c8534 = this.f67222;
            if (c8534.m19859() == c8534.m19865() && (c18592M19859 = c8534.m19859()) != null) {
                C3569 c3569M42316 = c18592M19859.m42315();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= c16183Arr.length) {
                        z2 = true;
                        break;
                    }
                    if (c3569M42316.m6563(i2)) {
                        if (c16183Arr[i2].m36862() != 1) {
                            z2 = false;
                            break;
                        }
                        if (c3569M42316.f7246[i2].f56351 != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f67189) {
                    this.f67189 = z5;
                    if (!z5 && this.f67219.f41618) {
                        this.f67229.mo19710(2);
                    }
                }
            }
            list = abstractC16192M8329;
        } else {
            if (!c17474.equals(this.f67219.f41616)) {
                c8243M42318 = C8243.f21835;
                c3569M42315 = this.f67197;
                listM36872of = AbstractC16192.m36872of();
            }
            list = listM36872of;
        }
        C8243 c8243 = c8243M42318;
        C3569 c3569 = c3569M42315;
        if (z) {
            this.f67220.m37681(i);
        }
        C14569 c145610 = this.f67219;
        return c145610.m33318(c17474, j, j2, j3, m48233(c145610.f41604), c8243, c3569, list);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48269(boolean[] zArr, long j) {
        C16183[] c16183Arr;
        C18592 c18592M19865 = this.f67222.m19865();
        C3569 c3569M42315 = c18592M19865.m42315();
        int i = 0;
        while (true) {
            c16183Arr = this.f67230;
            if (i >= c16183Arr.length) {
                break;
            }
            if (!c3569M42315.m6563(i)) {
                c16183Arr[i].m36853();
            }
            i++;
        }
        for (int i2 = 0; i2 < c16183Arr.length; i2++) {
            if (c3569M42315.m6563(i2) && !c16183Arr[i2].m36860(c18592M19865)) {
                m48260(c18592M19865, i2, zArr[i2], j);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48260(C18592 c18592, int i, boolean z, long j) {
        C16183 c16183 = this.f67230[i];
        if (c16183.m36870()) {
            return;
        }
        boolean z2 = c18592 == this.f67222.m19859();
        C3569 c3569M42315 = c18592.m42315();
        C18866 c18866 = c3569M42315.f7246[i];
        InterfaceC11617 interfaceC11617 = c3569M42315.f7248[i];
        boolean z3 = m48308() && this.f67219.f41611 == 3;
        boolean z4 = !z && z3;
        this.f67187++;
        c16183.m36845(c18866, interfaceC11617, c18592.f55517[i], this.f67188, z4, z2, j, c18592.m42316(), c18592.f55518.f46022, this.f67215);
        c16183.m36840(new C2537(this), c18592);
        if (z3 && z2) {
            c16183.m36852();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m48297(boolean z) {
        long jM42303;
        C18592 c18592M19863 = this.f67222.m19863();
        C17474 c17474 = c18592M19863 == null ? this.f67219.f41616 : c18592M19863.f55518.f46022;
        boolean zEquals = this.f67219.f41617.equals(c17474);
        if (!zEquals) {
            this.f67219 = this.f67219.m33317(c17474);
        }
        C14569 c14569 = this.f67219;
        if (c18592M19863 == null) {
            jM42303 = c14569.f41605;
        } else {
            jM42303 = c18592M19863.m42303();
        }
        c14569.f41604 = jM42303;
        C14569 c145610 = this.f67219;
        c145610.f41607 = m48233(c145610.f41604);
        if ((!zEquals || z) && c18592M19863 != null && c18592M19863.f55523) {
            m48259(c18592M19863.f55518.f46022, c18592M19863.m42318(), c18592M19863.m42315());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private long m48233(long j) {
        C18592 c18592M19863 = this.f67222.m19863();
        if (c18592M19863 == null) {
            return 0L;
        }
        return Math.max(0L, j - c18592M19863.m42317(this.f67188));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48259(C17474 c17474, C8243 c8243, C3569 c3569) {
        long jM42317;
        C8534 c8534 = this.f67222;
        C18592 c18592M19863 = c8534.m19863();
        c18592M19863.getClass();
        if (c18592M19863 == c8534.m19859()) {
            jM42317 = c18592M19863.m42317(this.f67188);
        } else {
            jM42317 = c18592M19863.m42317(this.f67188) - c18592M19863.f55518.f46019;
        }
        long j = jM42317;
        long jM48233 = m48233(c18592M19863.m42303());
        long jM28602 = m48271(this.f67219.f41602, c18592M19863.f55518.f46022) ? ((C12419) this.f67213).m28602() : -9223372036854775807L;
        AbstractC6974 abstractC6974 = this.f67219.f41602;
        float f = this.f67215.mo15356().f11305;
        boolean z = this.f67219.f41613;
        this.f67217.mo27255(new C13938(this.f67211, abstractC6974, c17474, j, jM48233, f, this.f67178, jM28602), c3569.f7248);
    }

    /* JADX INFO: renamed from: ᩸ */
    private boolean m48308() {
        C14569 c14569 = this.f67219;
        return c14569.f41613 && c14569.f41610 == 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m48300(int i) {
        C16183 c16183 = this.f67230[i];
        try {
            C18592 c18592M19859 = this.f67222.m19859();
            c18592M19859.getClass();
            c16183.m36869(c18592M19859);
        } catch (IOException | RuntimeException e) {
            int iM36862 = c16183.m36862();
            if (iM36862 == 3 || iM36862 == 5) {
                C3569 c3569M42315 = this.f67222.m19859().m42315();
                C21334.m48348("Disabling track due to error: " + C10307.m23917(c3569M42315.f7248[i].mo4753()), e);
                C3569 c3569 = new C3569((C18866[]) c3569M42315.f7246.clone(), (InterfaceC11617[]) c3569M42315.f7248.clone(), c3569M42315.f7247, c3569M42315.f7244);
                c3569.f7246[i] = null;
                c3569.f7248[i] = null;
                C16183[] c16183Arr = this.f67230;
                int iM36854 = c16183Arr[i].m36854();
                c16183Arr[i].m36843(this.f67215);
                m48245(i, false);
                this.f67187 -= iM36854;
                this.f67222.m19859().m42304(c3569, this.f67219.f41605);
                return;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m48307() {
        if (!this.f67207) {
            return false;
        }
        for (C16183 c16183 : this.f67230) {
            if (c16183.m36859()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m48292(long j) {
        boolean z = this.f67200;
        long jMin = 1000;
        long j2 = f67175;
        if (z && this.f67214.f70274) {
            jMin = this.f67219.f41611 != 3 ? j2 : 1000L;
            for (C16183 c16183 : this.f67230) {
                jMin = Math.min(jMin, C5792.m13013(c16183.m36834(this.f67188, this.f67198)));
            }
            if (this.f67219.m33323()) {
                C8534 c8534 = this.f67222;
                C18592 c18592M42313 = c8534.m19859() != null ? c8534.m19859().m42313() : null;
                if (c18592M42313 != null) {
                    if ((C5792.m12990(jMin) * this.f67219.f41620.f11305) + this.f67188 >= c18592M42313.m42319()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (this.f67219.f41611 != 3 || m48308()) {
            jMin = j2;
        }
        this.f67229.mo19706(j + jMin);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m48303(C21315 c21315) {
        return c21315.f67200 && c21315.f67214.f70274;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m48284(boolean z, boolean z2) {
        this.f67178 = z;
        this.f67199 = (!z || z2) ? -9223372036854775807L : this.f67205.mo35966();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Pair m48238(AbstractC6974 abstractC6974, C23326 c23326, boolean z, int i, boolean z2, C21727 c21727, C23738 c23738) {
        int iM48232;
        AbstractC6974 abstractC6975 = c23326.f73400;
        if (abstractC6974.m15990()) {
            return null;
        }
        AbstractC6974 abstractC6976 = abstractC6975.m15990() ? abstractC6974 : abstractC6975;
        try {
            Pair pairM15980 = abstractC6976.m15980(c21727, c23738, c23326.f73401, c23326.f73402);
            if (!abstractC6974.equals(abstractC6976)) {
                if (abstractC6974.mo15978(pairM15980.first) == -1) {
                    if (!z || (iM48232 = m48232(c21727, c23738, i, z2, pairM15980.first, abstractC6976, abstractC6974)) == -1) {
                        return null;
                    }
                    return abstractC6974.m15980(c21727, c23738, iM48232, -9223372036854775807L);
                }
                if (abstractC6976.mo15985(pairM15980.first, c23738).f75531 && abstractC6976.mo15983(c23738.f75532, c21727, 0L).f68436 == abstractC6976.mo15978(pairM15980.first)) {
                    return abstractC6974.m15980(c21727, c23738, abstractC6974.mo15985(pairM15980.first, c23738).f75532, c23326.f73402);
                }
            }
            return pairM15980;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m48232(C21727 c21727, C23738 c23738, int i, boolean z, Object obj, AbstractC6974 abstractC6974, AbstractC6974 abstractC6975) {
        Object obj2 = abstractC6974.mo15983(abstractC6974.mo15985(obj, c23738).f75532, c21727, 0L).f68437;
        for (int i2 = 0; i2 < abstractC6975.mo15987(); i2++) {
            if (abstractC6975.mo15983(i2, c21727, 0L).f68437.equals(obj2)) {
                return i2;
            }
        }
        int iMo15978 = abstractC6974.mo15978(obj);
        int iMo15975 = abstractC6974.mo15975();
        int iM15977 = iMo15978;
        int iMo15979 = -1;
        for (int i3 = 0; i3 < iMo15975 && iMo15979 == -1; i3++) {
            iM15977 = abstractC6974.m15977(iM15977, c23738, c21727, i, z);
            if (iM15977 == -1) {
                break;
            }
            iMo15979 = abstractC6975.mo15978(abstractC6974.mo15982(iM15977));
        }
        if (iMo15979 == -1) {
            return -1;
        }
        return abstractC6975.mo15984(iMo15979, c23738, false).f75532;
    }
}
