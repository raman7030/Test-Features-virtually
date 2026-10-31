package l;

import android.util.SparseArray;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.util.encoders.UTF8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ܰܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8R9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13920 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41496 = {49, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41497;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final UUID f41498;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41499;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final Map f41500;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41501;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23093 f41502;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f41503;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f41504;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41505;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f41506;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f41507;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f41508;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f41509;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17714 f41510;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C4433 f41511;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public long f41512;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41513;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f41514;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41515;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f41516;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f41517;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41518;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f41519;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C17714 f41520;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f41521;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f41522;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean f41523;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f41524;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f41525;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10394 f41526;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f41527;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f41528;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f41529;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f41530;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17714 f41531;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f41532;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f41533;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41534;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17714 f41535;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f41536;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f41537;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public long f41538;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f41539;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public byte f41540;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f41541;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41542;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f41543;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f41544;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4433 f41545;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public long f41546;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f41547;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f41548;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f41549;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f41550;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f41551;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ByteBuffer f41552;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final C1536 f41553;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f41554;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41555;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f41556;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f41557;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f41558;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    static {
        String str = C3603.f11424;
        f41501 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f41497 = new byte[]{68, 105, 97, 108, KeyFactorySpi.x448_type, 103, 117, 101, 58, UTF8.S_CS3, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44};
        f41499 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};
        f41498 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        C12354.m29971(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        C12354.m29971(180, map, "htc_video_rotA-180", BottomAppBarTopEdgeTreatment.ANGLE_UP, "htc_video_rotA-270");
        f41500 = C20195.unmodifiableMap(map);
    }

    public C13920(InterfaceC6950 interfaceC6950, int i) {
        C10394 c10394 = new C10394();
        this.f41512 = -1L;
        this.f41521 = -9223372036854775807L;
        this.f41514 = -9223372036854775807L;
        this.f41504 = -9223372036854775807L;
        this.f41547 = -1L;
        this.f41538 = -1L;
        this.f41508 = -9223372036854775807L;
        this.f41526 = c10394;
        c10394.m26210(new C11805(this));
        this.f41503 = interfaceC6950;
        this.f41523 = (i & 1) == 0;
        this.f41530 = (i & 2) == 0;
        this.f41553 = new C1536();
        this.f41536 = new SparseArray();
        this.f41534 = new C17714(4);
        this.f41555 = new C17714(ByteBuffer.allocate(4).putInt(-1).array());
        this.f41518 = new C17714(4);
        this.f41531 = new C17714(C16509.f50737);
        this.f41510 = new C17714(4);
        this.f41542 = new C17714();
        this.f41515 = new C17714();
        this.f41520 = new C17714(8);
        this.f41535 = new C17714();
        this.f41505 = new C17714();
        this.f41517 = new int[1];
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return new C7571().m20296((C16184) interfaceC8424);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        if (this.f41530) {
            interfaceC21830 = new C9067(interfaceC21830, this.f41503);
        }
        this.f41554 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f41508 = -9223372036854775807L;
        int i = 0;
        this.f41550 = 0;
        this.f41526.m26209();
        this.f41553.m5252();
        m33343();
        while (true) {
            SparseArray sparseArray = this.f41536;
            if (i >= sparseArray.size()) {
                return;
            }
            C0331 c0331 = ((C23093) sparseArray.valueAt(i)).f74289;
            if (c0331 != null) {
                c0331.m1750();
            }
            i++;
        }
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        int i = 0;
        this.f41549 = false;
        boolean zM26211 = true;
        while (zM26211 && !this.f41549) {
            zM26211 = this.f41526.m26211(interfaceC8424);
            if (zM26211) {
                long position = interfaceC8424.getPosition();
                if (this.f41525) {
                    this.f41538 = position;
                    c23615.f76532 = this.f41547;
                    this.f41525 = false;
                    return 1;
                }
                if (this.f41548) {
                    long j = this.f41538;
                    if (j != -1) {
                        c23615.f76532 = j;
                        this.f41538 = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (zM26211) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.f41536;
            if (i >= sparseArray.size()) {
                return -1;
            }
            C23093 c23093 = (C23093) sparseArray.valueAt(i);
            c23093.f74276.getClass();
            C0331 c0331 = c23093.f74289;
            if (c0331 != null) {
                c0331.m1753(c23093.f74276, c23093.f74266);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33347(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C9080.m23440("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C9080.m23440("ContentEncodingScope " + j + " not supported", (Throwable) null);
        }
        switch (i) {
            case 131:
                m33340(i);
                this.f41502.f74291 = (int) j;
                return;
            case 136:
                m33340(i);
                this.f41502.f74259 = j == 1;
                return;
            case 155:
                this.f41527 = m33333(j);
                return;
            case 159:
                m33340(i);
                this.f41502.f74286 = (int) j;
                return;
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                m33340(i);
                this.f41502.f74250 = (int) j;
                return;
            case 179:
                m33338(i);
                this.f41545.m13156(m33333(j));
                return;
            case 186:
                m33340(i);
                this.f41502.f74295 = (int) j;
                return;
            case 215:
                m33340(i);
                this.f41502.f74297 = (int) j;
                return;
            case 231:
                this.f41508 = m33333(j);
                return;
            case 238:
                this.f41506 = (int) j;
                return;
            case 241:
                if (this.f41509) {
                    return;
                }
                m33338(i);
                this.f41511.m13156(j);
                this.f41509 = true;
                return;
            case 251:
                this.f41541 = true;
                return;
            case 16871:
                m33340(i);
                this.f41502.f74282 = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C9080.m23440("ContentCompAlgo " + j + " not supported", (Throwable) null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw C9080.m23440("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C9080.m23440("EBMLReadVersion " + j + " not supported", (Throwable) null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C9080.m23440("ContentEncAlgo " + j + " not supported", (Throwable) null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C9080.m23440("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
            case 21420:
                this.f41551 = j + this.f41512;
                return;
            case 21432:
                int i2 = (int) j;
                m33340(i);
                if (i2 == 0) {
                    this.f41502.f74257 = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f41502.f74257 = 2;
                    return;
                } else if (i2 == 3) {
                    this.f41502.f74257 = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f41502.f74257 = 3;
                    return;
                }
            case 21680:
                m33340(i);
                this.f41502.f74288 = (int) j;
                return;
            case 21682:
                m33340(i);
                this.f41502.f74256 = (int) j;
                return;
            case 21690:
                m33340(i);
                this.f41502.f74253 = (int) j;
                return;
            case 21930:
                m33340(i);
                this.f41502.f74249 = j == 1;
                return;
            case 21938:
                m33340(i);
                C23093 c23093 = this.f41502;
                c23093.f74265 = true;
                c23093.f74271 = (int) j;
                return;
            case 21998:
                m33340(i);
                this.f41502.f74258 = (int) j;
                return;
            case 22186:
                m33340(i);
                this.f41502.f74284 = j;
                return;
            case 22203:
                m33340(i);
                this.f41502.f74254 = j;
                return;
            case 25188:
                m33340(i);
                this.f41502.f74251 = (int) j;
                return;
            case 30114:
                this.f41543 = j;
                return;
            case 30321:
                m33340(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f41502.f74269 = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f41502.f74269 = 1;
                    return;
                } else if (i3 == 2) {
                    this.f41502.f74269 = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f41502.f74269 = 3;
                    return;
                }
            case 2352003:
                m33340(i);
                this.f41502.f74280 = (int) j;
                return;
            case 2807729:
                this.f41521 = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        m33340(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f41502.f74262 = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f41502.f74262 = 1;
                            return;
                        }
                    case 21946:
                        m33340(i);
                        int iM47897 = C21054.m47897((int) j);
                        if (iM47897 != -1) {
                            this.f41502.f74268 = iM47897;
                            return;
                        }
                        return;
                    case 21947:
                        m33340(i);
                        this.f41502.f74265 = true;
                        int iM47898 = C21054.m47898((int) j);
                        if (iM47898 != -1) {
                            this.f41502.f74293 = iM47898;
                            return;
                        }
                        return;
                    case 21948:
                        m33340(i);
                        this.f41502.f74255 = (int) j;
                        return;
                    case 21949:
                        m33340(i);
                        this.f41502.f74275 = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33346(int i, int i2, InterfaceC8424 interfaceC8424) {
        C17714 c17714;
        char c;
        char c2;
        C17714 c17715;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        SparseArray sparseArray = this.f41536;
        int i7 = 1;
        int i8 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.f41550 != 2) {
                    return;
                }
                C23093 c23093 = (C23093) sparseArray.get(this.f41522);
                if (this.f41506 == 4 && "V_VP9".equals(c23093.f74277)) {
                    C17714 c17716 = this.f41505;
                    c17716.m41481(i2);
                    interfaceC8424.readFully(c17716.m41482(), 0, i2);
                    return;
                }
                interfaceC8424.mo22070(i2);
                return;
            }
            if (i == 16877) {
                m33340(i);
                C23093 c23094 = this.f41502;
                if (c23094.f74282 == 1685485123 || c23094.f74282 == 1685480259) {
                    byte[] bArr = new byte[i2];
                    c23094.f74290 = bArr;
                    interfaceC8424.readFully(bArr, 0, i2);
                    return;
                }
                interfaceC8424.mo22070(i2);
                return;
            }
            if (i == 16981) {
                m33340(i);
                byte[] bArr2 = new byte[i2];
                this.f41502.f74281 = bArr2;
                interfaceC8424.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                interfaceC8424.readFully(bArr3, 0, i2);
                m33340(i);
                this.f41502.f74266 = new C18677(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                C17714 c17717 = this.f41518;
                Arrays.fill(c17717.m41482(), (byte) 0);
                interfaceC8424.readFully(c17717.m41482(), 4 - i2, i2);
                c17717.m41484(0);
                this.f41558 = (int) c17717.m41479();
                return;
            }
            if (i == 25506) {
                m33340(i);
                byte[] bArr4 = new byte[i2];
                this.f41502.f74298 = bArr4;
                interfaceC8424.readFully(bArr4, 0, i2);
                return;
            }
            if (i == 30322) {
                m33340(i);
                byte[] bArr5 = new byte[i2];
                this.f41502.f74278 = bArr5;
                interfaceC8424.readFully(bArr5, 0, i2);
                return;
            }
            throw C9080.m23440("Unexpected id: " + i, (Throwable) null);
        }
        int i9 = this.f41550;
        int i10 = 8;
        C17714 c17718 = this.f41534;
        if (i9 == 0) {
            C1536 c1536 = this.f41553;
            this.f41522 = (int) c1536.m5251(interfaceC8424, false, true, 8);
            this.f41537 = c1536.m5250();
            this.f41527 = -9223372036854775807L;
            this.f41550 = 1;
            c17718.m41481(0);
        }
        C23093 c23095 = (C23093) sparseArray.get(this.f41522);
        if (c23095 != null) {
            c23095.f74276.getClass();
            if (this.f41550 == 1) {
                m33334(interfaceC8424, 3);
                int i11 = (c17718.m41482()[2] & 6) >> 1;
                byte b = 255;
                if (i11 == 0) {
                    this.f41533 = 1;
                    int[] iArr = this.f41517;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    this.f41517 = iArr;
                    iArr[0] = (i2 - this.f41537) - 3;
                } else {
                    m33334(interfaceC8424, 4);
                    int i12 = (c17718.m41482()[3] & 255) + 1;
                    this.f41533 = i12;
                    int[] iArr2 = this.f41517;
                    if (iArr2 == null) {
                        iArr2 = new int[i12];
                    } else if (iArr2.length < i12) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i12)];
                    }
                    this.f41517 = iArr2;
                    if (i11 == 2) {
                        int i13 = (i2 - this.f41537) - 4;
                        int i14 = this.f41533;
                        Arrays.fill(iArr2, 0, i14, i13 / i14);
                    } else {
                        if (i11 == 1) {
                            int i15 = 0;
                            int i16 = 0;
                            int i17 = 4;
                            while (true) {
                                i3 = this.f41533 - 1;
                                if (i15 >= i3) {
                                    break;
                                }
                                this.f41517[i15] = 0;
                                while (true) {
                                    i4 = i17 + 1;
                                    m33334(interfaceC8424, i4);
                                    int i18 = c17718.m41482()[i17] & 255;
                                    int[] iArr3 = this.f41517;
                                    i5 = iArr3[i15] + i18;
                                    iArr3[i15] = i5;
                                    if (i18 != 255) {
                                        break;
                                    } else {
                                        i17 = i4;
                                    }
                                }
                                i16 += i5;
                                i15++;
                                i17 = i4;
                            }
                            this.f41517[i3] = ((i2 - this.f41537) - i17) - i16;
                        } else {
                            if (i11 != 3) {
                                throw C9080.m23440("Unexpected lacing value: " + i11, (Throwable) null);
                            }
                            int i19 = 0;
                            int i20 = 0;
                            int i21 = 4;
                            while (true) {
                                int i22 = this.f41533 - i7;
                                if (i19 < i22) {
                                    this.f41517[i19] = i8;
                                    int i23 = i21 + 1;
                                    m33334(interfaceC8424, i23);
                                    if (c17718.m41482()[i21] == 0) {
                                        throw C9080.m23440("No valid varint length mask found", (Throwable) null);
                                    }
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 >= i10) {
                                            c17715 = c17718;
                                            j = 0;
                                            i21 = i23;
                                            break;
                                        }
                                        int i25 = i7 << (7 - i24);
                                        if ((c17718.m41482()[i21] & i25) != 0) {
                                            int i26 = i23 + i24;
                                            m33334(interfaceC8424, i26);
                                            j = (~i25) & c17718.m41482()[i21] & b;
                                            while (i23 < i26) {
                                                j = (j << 8) | ((long) (c17718.m41482()[i23] & 255));
                                                i23++;
                                                c17718 = c17718;
                                            }
                                            c17715 = c17718;
                                            if (i19 > 0) {
                                                j -= (1 << ((i24 * 7) + 6)) - 1;
                                            }
                                            i21 = i26;
                                            break;
                                        }
                                        i24++;
                                        i7 = 1;
                                        i10 = 8;
                                        b = 255;
                                    }
                                    if (j < -2147483648L || j > 2147483647L) {
                                        throw C9080.m23440("EBML lacing sample size out of range.", (Throwable) null);
                                    }
                                    int i27 = (int) j;
                                    int[] iArr4 = this.f41517;
                                    if (i19 != 0) {
                                        i27 += iArr4[i19 - 1];
                                    }
                                    iArr4[i19] = i27;
                                    i20 += i27;
                                    i19++;
                                    i7 = 1;
                                    i8 = 0;
                                    i10 = 8;
                                    c17718 = c17715;
                                    b = 255;
                                } else {
                                    c17714 = c17718;
                                    this.f41517[i22] = ((i2 - this.f41537) - i21) - i20;
                                    c = 1;
                                    c2 = 0;
                                    break;
                                }
                            }
                        }
                        this.f41524 = this.f41508 + m33333((c17714.m41482()[c] & 255) | (c17714.m41482()[c2] << 8));
                        if (c23095.f74291 != 2 || (i == 163 && (c17714.m41482()[2] & GCMSIVBlockCipher.MASK) == 128)) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        this.f41539 = i6;
                        this.f41550 = 2;
                        this.f41557 = 0;
                    }
                }
                c = 1;
                c2 = 0;
                c17714 = c17718;
                this.f41524 = this.f41508 + m33333((c17714.m41482()[c] & 255) | (c17714.m41482()[c2] << 8));
                if (c23095.f74291 != 2) {
                    i6 = 1;
                } else {
                    i6 = 1;
                }
                this.f41539 = i6;
                this.f41550 = 2;
                this.f41557 = 0;
            }
            if (i == 163) {
                while (true) {
                    int i28 = this.f41557;
                    if (i28 < this.f41533) {
                        m33336(c23095, ((long) ((this.f41557 * c23095.f74280) / 1000)) + this.f41524, this.f41539, m33332(interfaceC8424, c23095, this.f41517[i28], false), 0);
                        this.f41557++;
                    } else {
                        this.f41550 = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = this.f41557;
                    if (i29 >= this.f41533) {
                        return;
                    }
                    int[] iArr5 = this.f41517;
                    iArr5[i29] = m33332(interfaceC8424, c23095, iArr5[i29], true);
                    this.f41557++;
                }
            }
        } else {
            interfaceC8424.mo22070(i2 - this.f41537);
            this.f41550 = 0;
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m33340(int i) throws C9080 {
        if (this.f41502 != null) {
            return;
        }
        throw C9080.m23440("Element " + i + " must be in a TrackEntry", (Throwable) null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m33338(int i) throws C9080 {
        if (this.f41545 == null || this.f41511 == null) {
            throw C9080.m23440("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33345(int i, double d) {
        if (i == 181) {
            m33340(i);
            this.f41502.f74267 = (int) d;
            return;
        }
        if (i == 17545) {
            this.f41514 = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m33340(i);
                this.f41502.f74287 = (float) d;
                break;
            case 21970:
                m33340(i);
                this.f41502.f74285 = (float) d;
                break;
            case 21971:
                m33340(i);
                this.f41502.f74272 = (float) d;
                break;
            case 21972:
                m33340(i);
                this.f41502.f74283 = (float) d;
                break;
            case 21973:
                m33340(i);
                this.f41502.f74264 = (float) d;
                break;
            case 21974:
                m33340(i);
                this.f41502.f74252 = (float) d;
                break;
            case 21975:
                m33340(i);
                this.f41502.f74248 = (float) d;
                break;
            case 21976:
                m33340(i);
                this.f41502.f74260 = (float) d;
                break;
            case 21977:
                m33340(i);
                this.f41502.f74274 = (float) d;
                break;
            case 21978:
                m33340(i);
                this.f41502.f74270 = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m33340(i);
                        this.f41502.f74294 = (float) d;
                        break;
                    case 30324:
                        m33340(i);
                        this.f41502.f74299 = (float) d;
                        break;
                    case 30325:
                        m33340(i);
                        this.f41502.f74263 = (float) d;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33348(int i, String str) {
        if (i == 134) {
            m33340(i);
            this.f41502.f74277 = str;
            return;
        }
        if (i == 17026) {
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw C9080.m23440("DocType " + str + " not supported", (Throwable) null);
            }
            this.f41513 = str.equals("webm");
            return;
        }
        if (i == 21358) {
            m33340(i);
            this.f41502.f74273 = str;
        } else {
            if (i != 2274716) {
                return;
            }
            m33340(i);
            this.f41502.f74292 = str;
        }
    }

    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33336(C23093 c23093, long j, int i, int i2, int i3) {
        byte[] bArrM33337;
        int i4;
        int iM41483;
        C0331 c0331 = c23093.f74289;
        if (c0331 != null) {
            c0331.m1752(c23093.f74276, j, i, i2, i3, c23093.f74266);
        } else {
            if ("S_TEXT/UTF8".equals(c23093.f74277) || "S_TEXT/ASS".equals(c23093.f74277) || "S_TEXT/SSA".equals(c23093.f74277) || "S_TEXT/WEBVTT".equals(c23093.f74277)) {
                if (this.f41533 > 1) {
                    C19956.m46037("Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f41527;
                    if (j2 == -9223372036854775807L) {
                        C19956.m46037("Skipping subtitle sample with no duration.");
                    } else {
                        String str = c23093.f74277;
                        C17714 c17714 = this.f41515;
                        byte[] bArrM41482 = c17714.m41482();
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrM33337 = m33337("%01d:%02d:%02d:%02d", j2, 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrM33337 = m33337("%02d:%02d:%02d.%03d", j2, 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrM33337 = m33337("%02d:%02d:%02d,%03d", j2, 1000L);
                                i4 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrM33337, 0, bArrM41482, i4, bArrM33337.length);
                        for (int iM41485 = c17714.m41485(); iM41485 < c17714.m41483(); iM41485++) {
                            if (c17714.m41482()[iM41485] == 0) {
                                c17714.m41486(iM41485);
                                c23093.f74276.mo8453(c17714.m41483(), c17714);
                                iM41483 = c17714.m41483() + i2;
                            }
                        }
                        c23093.f74276.mo8453(c17714.m41483(), c17714);
                        iM41483 = c17714.m41483() + i2;
                    }
                }
                iM41483 = i2;
            } else {
                iM41483 = i2;
            }
            if ((i & 268435456) != 0) {
                int i5 = this.f41533;
                C17714 c17715 = this.f41505;
                if (i5 > 1) {
                    c17715.m41481(0);
                } else {
                    int iM41484 = c17715.m41483();
                    c23093.f74276.mo8457(c17715, iM41484, 2);
                    iM41483 += iM41484;
                }
            }
            c23093.f74276.mo8455(j, i, iM41483, i3, c23093.f74266);
        }
        this.f41549 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33334(InterfaceC8424 interfaceC8424, int i) {
        C17714 c17714 = this.f41534;
        if (c17714.m41483() >= i) {
            return;
        }
        if (c17714.m41472() < i) {
            c17714.m41460(Math.max(c17714.m41472() * 2, i));
        }
        interfaceC8424.readFully(c17714.m41482(), c17714.m41483(), i - c17714.m41483());
        c17714.m41486(i);
    }

    @RequiresNonNull({"#2.output"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m33332(InterfaceC8424 interfaceC8424, C23093 c23093, int i, boolean z) throws C9080 {
        int iMo8451;
        int iMo8452;
        boolean z2;
        int i2;
        if ("S_TEXT/UTF8".equals(c23093.f74277)) {
            m33335(interfaceC8424, f41496, i);
        } else if ("S_TEXT/ASS".equals(c23093.f74277) || "S_TEXT/SSA".equals(c23093.f74277)) {
            m33335(interfaceC8424, f41497, i);
        } else if ("S_TEXT/WEBVTT".equals(c23093.f74277)) {
            m33335(interfaceC8424, f41499, i);
        } else {
            InterfaceC19383 interfaceC19383 = c23093.f74276;
            boolean z3 = this.f41532;
            C17714 c17714 = this.f41542;
            if (!z3) {
                boolean z4 = c23093.f74279;
                C17714 c17715 = this.f41534;
                if (z4) {
                    this.f41539 &= -1073741825;
                    if (!this.f41544) {
                        interfaceC8424.readFully(c17715.m41482(), 0, 1);
                        this.f41516++;
                        if ((c17715.m41482()[0] & GCMSIVBlockCipher.MASK) == 128) {
                            throw C9080.m23440("Extension bit is set in signal byte", (Throwable) null);
                        }
                        this.f41540 = c17715.m41482()[0];
                        this.f41544 = true;
                    }
                    byte b = this.f41540;
                    if ((b & 1) == 1) {
                        boolean z5 = (b & 2) == 2;
                        this.f41539 |= 1073741824;
                        if (!this.f41519) {
                            C17714 c17716 = this.f41520;
                            interfaceC8424.readFully(c17716.m41482(), 0, 8);
                            this.f41516 += 8;
                            this.f41519 = true;
                            c17715.m41482()[0] = (byte) ((z5 ? 128 : 0) | 8);
                            c17715.m41484(0);
                            interfaceC19383.mo8457(c17715, 1, 1);
                            this.f41529++;
                            c17716.m41484(0);
                            interfaceC19383.mo8457(c17716, 8, 1);
                            this.f41529 += 8;
                        }
                        if (z5) {
                            if (!this.f41528) {
                                interfaceC8424.readFully(c17715.m41482(), 0, 1);
                                this.f41516++;
                                c17715.m41484(0);
                                this.f41507 = c17715.m41456();
                                this.f41528 = true;
                            }
                            int i3 = this.f41507 * 4;
                            c17715.m41481(i3);
                            interfaceC8424.readFully(c17715.m41482(), 0, i3);
                            this.f41516 += i3;
                            short s = (short) ((this.f41507 / 2) + 1);
                            int i4 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f41552;
                            if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                this.f41552 = ByteBuffer.allocate(i4);
                            }
                            this.f41552.position(0);
                            this.f41552.putShort(s);
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i2 = this.f41507;
                                if (i5 >= i2) {
                                    break;
                                }
                                int iM41492 = c17715.m41492();
                                if (i5 % 2 == 0) {
                                    this.f41552.putShort((short) (iM41492 - i6));
                                } else {
                                    this.f41552.putInt(iM41492 - i6);
                                }
                                i5++;
                                i6 = iM41492;
                            }
                            int i7 = (i - this.f41516) - i6;
                            if (i2 % 2 == 1) {
                                this.f41552.putInt(i7);
                            } else {
                                this.f41552.putShort((short) i7);
                                this.f41552.putInt(0);
                            }
                            byte[] bArrArray = this.f41552.array();
                            C17714 c17717 = this.f41535;
                            c17717.m41462(i4, bArrArray);
                            interfaceC19383.mo8457(c17717, i4, 1);
                            this.f41529 += i4;
                        }
                    }
                } else {
                    byte[] bArr = c23093.f74281;
                    if (bArr != null) {
                        c17714.m41462(bArr.length, bArr);
                    }
                }
                if ("A_OPUS".equals(c23093.f74277)) {
                    z2 = z;
                } else {
                    z2 = c23093.f74258 > 0;
                }
                if (z2) {
                    this.f41539 |= 268435456;
                    this.f41505.m41481(0);
                    int iM41483 = (c17714.m41483() + i) - this.f41516;
                    c17715.m41481(4);
                    c17715.m41482()[0] = (byte) ((iM41483 >> 24) & 255);
                    c17715.m41482()[1] = (byte) ((iM41483 >> 16) & 255);
                    c17715.m41482()[2] = (byte) ((iM41483 >> 8) & 255);
                    c17715.m41482()[3] = (byte) (iM41483 & 255);
                    interfaceC19383.mo8457(c17715, 4, 2);
                    this.f41529 += 4;
                }
                this.f41532 = true;
            }
            int iM41484 = c17714.m41483() + i;
            if ("V_MPEG4/ISO/AVC".equals(c23093.f74277) || "V_MPEGH/ISO/HEVC".equals(c23093.f74277)) {
                C17714 c17718 = this.f41510;
                byte[] bArrM41482 = c17718.m41482();
                bArrM41482[0] = 0;
                bArrM41482[1] = 0;
                bArrM41482[2] = 0;
                int i8 = c23093.f74261;
                int i9 = 4 - i8;
                while (this.f41516 < iM41484) {
                    int i10 = this.f41556;
                    if (i10 == 0) {
                        int iMin = Math.min(i8, c17714.m41457());
                        interfaceC8424.readFully(bArrM41482, i9 + iMin, i8 - iMin);
                        if (iMin > 0) {
                            c17714.m41461(i9, iMin, bArrM41482);
                        }
                        this.f41516 += i8;
                        c17718.m41484(0);
                        this.f41556 = c17718.m41492();
                        C17714 c17719 = this.f41531;
                        c17719.m41484(0);
                        interfaceC19383.mo8453(4, c17719);
                        this.f41529 += 4;
                    } else {
                        int iM41457 = c17714.m41457();
                        if (iM41457 > 0) {
                            iMo8451 = Math.min(i10, iM41457);
                            interfaceC19383.mo8453(iMo8451, c17714);
                        } else {
                            iMo8451 = interfaceC19383.mo8451((InterfaceC9765) interfaceC8424, i10, false);
                        }
                        this.f41516 += iMo8451;
                        this.f41529 += iMo8451;
                        this.f41556 -= iMo8451;
                    }
                }
            } else {
                if (c23093.f74289 != null) {
                    C22632.m50634(c17714.m41483() == 0);
                    c23093.f74289.m1751(interfaceC8424);
                }
                while (true) {
                    int i11 = this.f41516;
                    if (i11 >= iM41484) {
                        break;
                    }
                    int i12 = iM41484 - i11;
                    int iM41458 = c17714.m41457();
                    if (iM41458 > 0) {
                        iMo8452 = Math.min(i12, iM41458);
                        interfaceC19383.mo8453(iMo8452, c17714);
                    } else {
                        iMo8452 = interfaceC19383.mo8451((InterfaceC9765) interfaceC8424, i12, false);
                    }
                    this.f41516 += iMo8452;
                    this.f41529 += iMo8452;
                }
            }
            if ("A_VORBIS".equals(c23093.f74277)) {
                C17714 c177110 = this.f41555;
                c177110.m41484(0);
                interfaceC19383.mo8453(4, c177110);
                this.f41529 += 4;
            }
        }
        int i13 = this.f41529;
        m33343();
        return i13;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m33343() {
        this.f41516 = 0;
        this.f41529 = 0;
        this.f41556 = 0;
        this.f41532 = false;
        this.f41544 = false;
        this.f41528 = false;
        this.f41507 = 0;
        this.f41540 = (byte) 0;
        this.f41519 = false;
        this.f41542.m41481(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33335(InterfaceC8424 interfaceC8424, byte[] bArr, int i) {
        int length = bArr.length + i;
        C17714 c17714 = this.f41515;
        if (c17714.m41472() < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c17714.getClass();
            c17714.m41462(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, c17714.m41482(), 0, bArr.length);
        }
        interfaceC8424.readFully(c17714.m41482(), bArr.length, i);
        c17714.m41484(0);
        c17714.m41486(length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m33337(String str, long j, long j2) {
        C22632.m50631(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = C3603.f11424;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33333(long j) throws C9080 {
        long j2 = this.f41521;
        if (j2 == -9223372036854775807L) {
            throw C9080.m23440("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
        }
        String str = C3603.f11424;
        return C3603.m11017(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:227:0x0345  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33344(int i) {
        InterfaceC9505 c20794;
        int i2;
        C22632.m50632(this.f41554);
        byte b = 8;
        SparseArray sparseArray = this.f41536;
        int i3 = 0;
        if (i == 160) {
            if (this.f41550 != 2) {
                return;
            }
            C23093 c23093 = (C23093) sparseArray.get(this.f41522);
            c23093.f74276.getClass();
            if (this.f41543 > 0 && "A_OPUS".equals(c23093.f74277)) {
                byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f41543).array();
                C17714 c17714 = this.f41505;
                c17714.getClass();
                c17714.m41462(bArrArray.length, bArrArray);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f41533; i5++) {
                i4 += this.f41517[i5];
            }
            int i6 = 0;
            while (i6 < this.f41533) {
                long j = this.f41524 + ((long) ((c23093.f74280 * i6) / 1000));
                int i7 = this.f41539;
                if (i6 == 0 && !this.f41541) {
                    i7 |= 1;
                }
                int i8 = this.f41517[i6];
                int i9 = i4 - i8;
                m33336(c23093, j, i7, i8, i9);
                i6++;
                i4 = i9;
            }
            this.f41550 = 0;
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i10 = this.f41558;
                if (i10 != -1) {
                    long j2 = this.f41551;
                    if (j2 != -1) {
                        if (i10 == 475249515) {
                            this.f41547 = j2;
                            return;
                        }
                        return;
                    }
                }
                throw C9080.m23440("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            }
            if (i == 25152) {
                m33340(i);
                C23093 c23094 = this.f41502;
                if (c23094.f74279) {
                    C18677 c18677 = c23094.f74266;
                    if (c18677 == null) {
                        throw C9080.m23440("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
                    }
                    c23094.f74247 = new C19643(new C18937(C23875.f77204, null, "video/webm", c18677.f59032));
                    return;
                }
                return;
            }
            if (i == 28032) {
                m33340(i);
                C23093 c23095 = this.f41502;
                if (c23095.f74279 && c23095.f74281 != null) {
                    throw C9080.m23440("Combining encryption and compression is not supported", (Throwable) null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.f41521 == -9223372036854775807L) {
                    this.f41521 = 1000000L;
                }
                long j3 = this.f41514;
                if (j3 != -9223372036854775807L) {
                    this.f41504 = m33333(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (sparseArray.size() == 0) {
                    throw C9080.m23440("No valid tracks were found", (Throwable) null);
                }
                this.f41554.mo3431();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.f41548) {
                InterfaceC21830 interfaceC21830 = this.f41554;
                C4433 c4433 = this.f41545;
                C4433 c4434 = this.f41511;
                if (this.f41512 == -1 || this.f41504 == -9223372036854775807L || c4433 == null || c4433.m13154() == 0 || c4434 == null || c4434.m13154() != c4433.m13154()) {
                    c20794 = new C20794(this.f41504);
                } else {
                    int iM13154 = c4433.m13154();
                    int[] iArrCopyOf = new int[iM13154];
                    long[] jArrCopyOf = new long[iM13154];
                    long[] jArrCopyOf2 = new long[iM13154];
                    long[] jArrCopyOf3 = new long[iM13154];
                    for (int i11 = 0; i11 < iM13154; i11++) {
                        jArrCopyOf3[i11] = c4433.m13155(i11);
                        jArrCopyOf[i11] = c4434.m13155(i11) + this.f41512;
                    }
                    while (true) {
                        i2 = iM13154 - 1;
                        if (i3 >= i2) {
                            break;
                        }
                        int i12 = i3 + 1;
                        iArrCopyOf[i3] = (int) (jArrCopyOf[i12] - jArrCopyOf[i3]);
                        jArrCopyOf2[i3] = jArrCopyOf3[i12] - jArrCopyOf3[i3];
                        i3 = i12;
                    }
                    int i13 = i2;
                    while (i13 > 0 && jArrCopyOf3[i13] > this.f41504) {
                        i13--;
                    }
                    iArrCopyOf[i13] = (int) ((this.f41512 + this.f41546) - jArrCopyOf[i13]);
                    jArrCopyOf2[i13] = this.f41504 - jArrCopyOf3[i13];
                    if (i13 < i2) {
                        C19956.m46037("Discarding trailing cue points with timestamps greater than total duration");
                        int i14 = i13 + 1;
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i14);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i14);
                    }
                    c20794 = new C21125(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                interfaceC21830.mo3430(c20794);
                this.f41548 = true;
            }
            this.f41545 = null;
            this.f41511 = null;
            return;
        }
        C23093 c23096 = this.f41502;
        C22632.m50632(c23096);
        String str = c23096.f74277;
        if (str == null) {
            throw C9080.m23440("CodecId is missing in TrackEntry element", (Throwable) null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -933872740:
                if (!str.equals("S_DVBSUB")) {
                    b = -1;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b = cb.k;
                } else {
                    b = -1;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b = cb.f77931l;
                } else {
                    b = -1;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case 738614379:
                if (str.equals("S_TEXT/SSA")) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                } else {
                    b = -1;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b = bo.j;
                } else {
                    b = -1;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b = UTF8.S_CS3;
                } else {
                    b = -1;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
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
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                c23096.m51253(this.f41554, c23096.f74297);
                sparseArray.put(c23096.f74297, c23096);
                break;
        }
        this.f41502 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33349(long j, int i, long j2) {
        C22632.m50632(this.f41554);
        if (i == 160) {
            this.f41541 = false;
            this.f41543 = 0L;
            return;
        }
        if (i == 174) {
            C23093 c23093 = new C23093();
            this.f41502 = c23093;
            c23093.f74296 = this.f41513;
            return;
        }
        if (i == 187) {
            this.f41509 = false;
            return;
        }
        if (i == 19899) {
            this.f41558 = -1;
            this.f41551 = -1L;
            return;
        }
        if (i == 20533) {
            m33340(i);
            this.f41502.f74279 = true;
            return;
        }
        if (i == 21968) {
            m33340(i);
            this.f41502.f74265 = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f41512;
            if (j3 != -1 && j3 != j) {
                throw C9080.m23440("Multiple Segment elements not supported", (Throwable) null);
            }
            this.f41512 = j;
            this.f41546 = j2;
            return;
        }
        if (i == 475249515) {
            this.f41545 = new C4433();
            this.f41511 = new C4433();
        } else if (i == 524531317 && !this.f41548) {
            if (this.f41523 && this.f41547 != -1) {
                this.f41525 = true;
            } else {
                this.f41554.mo3430(new C20794(this.f41504));
                this.f41548 = true;
            }
        }
    }
}
