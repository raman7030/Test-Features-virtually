package p067l;

import android.util.SparseArray;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
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
public final class C15598 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ۗ֫ */
    public static final byte[] f44577 = {49, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};

    /* JADX INFO: renamed from: ۙ֫ */
    public static final byte[] f44578;

    /* JADX INFO: renamed from: ۤ֫ */
    public static final UUID f44579;

    /* JADX INFO: renamed from: ۫֫ */
    public static final byte[] f44580;

    /* JADX INFO: renamed from: ۬֫ */
    public static final Map f44581;

    /* JADX INFO: renamed from: ᩶֫ */
    public static final byte[] f44582;

    /* JADX INFO: renamed from: ֡ */
    public C24316 f44583;

    /* JADX INFO: renamed from: ֡֫ */
    public final InterfaceC8974 f44584;

    /* JADX INFO: renamed from: ֨ */
    public long f44585;

    /* JADX INFO: renamed from: ֨֫ */
    public final C19203 f44586;

    /* JADX INFO: renamed from: ֫ */
    public int f44587;

    /* JADX INFO: renamed from: ֫֫ */
    public int f44588;

    /* JADX INFO: renamed from: ۖ */
    public long f44589;

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f44590;

    /* JADX INFO: renamed from: ۗ */
    public final C19203 f44591;

    /* JADX INFO: renamed from: ۘ */
    public C6581 f44592;

    /* JADX INFO: renamed from: ۘ֫ */
    public long f44593;

    /* JADX INFO: renamed from: ۙ */
    public boolean f44594;

    /* JADX INFO: renamed from: ۚ */
    public long f44595;

    /* JADX INFO: renamed from: ۚ֫ */
    public final C19203 f44596;

    /* JADX INFO: renamed from: ۛ */
    public int f44597;

    /* JADX INFO: renamed from: ۜ */
    public int[] f44598;

    /* JADX INFO: renamed from: ۜ֫ */
    public final C19203 f44599;

    /* JADX INFO: renamed from: ۟ */
    public boolean f44600;

    /* JADX INFO: renamed from: ۠ */
    public final C19203 f44601;

    /* JADX INFO: renamed from: ۠֫ */
    public long f44602;

    /* JADX INFO: renamed from: ۡ */
    public int f44603;

    /* JADX INFO: renamed from: ۡ֫ */
    public final boolean f44604;

    /* JADX INFO: renamed from: ۢ */
    public long f44605;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f44606;

    /* JADX INFO: renamed from: ۤ */
    public final C12247 f44607;

    /* JADX INFO: renamed from: ۧ */
    public long f44608;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f44609;

    /* JADX INFO: renamed from: ۨ */
    public int f44610;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f44611;

    /* JADX INFO: renamed from: ۬ */
    public final C19203 f44612;

    /* JADX INFO: renamed from: ܰ */
    public boolean f44613;

    /* JADX INFO: renamed from: ܳ */
    public int f44614;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C19203 f44615;

    /* JADX INFO: renamed from: ܶ */
    public final C19203 f44616;

    /* JADX INFO: renamed from: ܶ֫ */
    public final SparseArray f44617;

    /* JADX INFO: renamed from: ܺ */
    public int f44618;

    /* JADX INFO: renamed from: ܺ֫ */
    public long f44619;

    /* JADX INFO: renamed from: ܽ */
    public int f44620;

    /* JADX INFO: renamed from: ܽ֫ */
    public byte f44621;

    /* JADX INFO: renamed from: ܿ */
    public boolean f44622;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C19203 f44623;

    /* JADX INFO: renamed from: ᩳ */
    public long f44624;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f44625;

    /* JADX INFO: renamed from: ᩴ */
    public C6581 f44626;

    /* JADX INFO: renamed from: ᩴ֫ */
    public long f44627;

    /* JADX INFO: renamed from: ᩵ */
    public long f44628;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f44629;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f44630;

    /* JADX INFO: renamed from: ᩷ */
    public int f44631;

    /* JADX INFO: renamed from: ᩷֫ */
    public long f44632;

    /* JADX INFO: renamed from: ᩸ */
    public ByteBuffer f44633;

    /* JADX INFO: renamed from: ᩸֫ */
    public final C3828 f44634;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC23116 f44635;

    /* JADX INFO: renamed from: ᩹֫ */
    public final C19203 f44636;

    /* JADX INFO: renamed from: ᩺ */
    public int f44637;

    /* JADX INFO: renamed from: ᩻ */
    public int f44638;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f44639;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    static {
        String str = C5792.f14228;
        f44582 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f44578 = new byte[]{68, 105, 97, 108, KeyFactorySpi.x448_type, 103, 117, 101, 58, UTF8.S_CS3, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44};
        f44580 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};
        f44579 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        C14110.m32032(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        C14110.m32032(180, map, "htc_video_rotA-180", BottomAppBarTopEdgeTreatment.ANGLE_UP, "htc_video_rotA-270");
        f44581 = C21562.unmodifiableMap(map);
    }

    public C15598(InterfaceC8974 interfaceC8974, int i) {
        C12247 c12247 = new C12247();
        this.f44593 = -1L;
        this.f44602 = -9223372036854775807L;
        this.f44595 = -9223372036854775807L;
        this.f44585 = -9223372036854775807L;
        this.f44628 = -1L;
        this.f44619 = -1L;
        this.f44589 = -9223372036854775807L;
        this.f44607 = c12247;
        c12247.m28239(new C13588(this));
        this.f44584 = interfaceC8974;
        this.f44604 = (i & 1) == 0;
        this.f44611 = (i & 2) == 0;
        this.f44634 = new C3828();
        this.f44617 = new SparseArray();
        this.f44615 = new C19203(4);
        this.f44636 = new C19203(ByteBuffer.allocate(4).putInt(-1).array());
        this.f44599 = new C19203(4);
        this.f44612 = new C19203(C18058.f53916);
        this.f44591 = new C19203(4);
        this.f44623 = new C19203();
        this.f44596 = new C19203();
        this.f44601 = new C19203(8);
        this.f44616 = new C19203();
        this.f44586 = new C19203();
        this.f44598 = new int[1];
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        return new C9564().m22273((C17750) interfaceC10375);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        if (this.f44611) {
            interfaceC23116 = new C10986(interfaceC23116, this.f44584);
        }
        this.f44635 = interfaceC23116;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f44589 = -9223372036854775807L;
        int i = 0;
        this.f44631 = 0;
        this.f44607.m28238();
        this.f44634.m7481();
        m35462();
        while (true) {
            SparseArray sparseArray = this.f44617;
            if (i >= sparseArray.size()) {
                return;
            }
            C2683 c2683 = ((C24316) sparseArray.valueAt(i)).f77035;
            if (c2683 != null) {
                c2683.m4148();
            }
            i++;
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        int i = 0;
        this.f44630 = false;
        boolean zM28240 = true;
        while (zM28240 && !this.f44630) {
            zM28240 = this.f44607.m28240(interfaceC10375);
            if (zM28240) {
                long position = interfaceC10375.getPosition();
                if (this.f44606) {
                    this.f44619 = position;
                    c24812.f79276 = this.f44628;
                    this.f44606 = false;
                    return 1;
                }
                if (this.f44629) {
                    long j = this.f44619;
                    if (j != -1) {
                        c24812.f79276 = j;
                        this.f44619 = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (zM28240) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.f44617;
            if (i >= sparseArray.size()) {
                return -1;
            }
            C24316 c24316 = (C24316) sparseArray.valueAt(i);
            c24316.f77022.getClass();
            C2683 c2683 = c24316.f77035;
            if (c2683 != null) {
                c2683.m4151(c24316.f77022, c24316.f77012);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35466(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C10998.m25387("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C10998.m25387("ContentEncodingScope " + j + " not supported", (Throwable) null);
        }
        switch (i) {
            case 131:
                m35459(i);
                this.f44583.f77037 = (int) j;
                return;
            case 136:
                m35459(i);
                this.f44583.f77005 = j == 1;
                return;
            case 155:
                this.f44608 = m35452(j);
                return;
            case 159:
                m35459(i);
                this.f44583.f77032 = (int) j;
                return;
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                m35459(i);
                this.f44583.f76996 = (int) j;
                return;
            case 179:
                m35457(i);
                this.f44626.m15037(m35452(j));
                return;
            case 186:
                m35459(i);
                this.f44583.f77041 = (int) j;
                return;
            case 215:
                m35459(i);
                this.f44583.f77043 = (int) j;
                return;
            case 231:
                this.f44589 = m35452(j);
                return;
            case 238:
                this.f44587 = (int) j;
                return;
            case 241:
                if (this.f44590) {
                    return;
                }
                m35457(i);
                this.f44592.m15037(j);
                this.f44590 = true;
                return;
            case 251:
                this.f44622 = true;
                return;
            case 16871:
                m35459(i);
                this.f44583.f77028 = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C10998.m25387("ContentCompAlgo " + j + " not supported", (Throwable) null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw C10998.m25387("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C10998.m25387("EBMLReadVersion " + j + " not supported", (Throwable) null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C10998.m25387("ContentEncAlgo " + j + " not supported", (Throwable) null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C10998.m25387("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
            case 21420:
                this.f44632 = j + this.f44593;
                return;
            case 21432:
                int i2 = (int) j;
                m35459(i);
                if (i2 == 0) {
                    this.f44583.f77003 = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f44583.f77003 = 2;
                    return;
                } else if (i2 == 3) {
                    this.f44583.f77003 = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f44583.f77003 = 3;
                    return;
                }
            case 21680:
                m35459(i);
                this.f44583.f77034 = (int) j;
                return;
            case 21682:
                m35459(i);
                this.f44583.f77002 = (int) j;
                return;
            case 21690:
                m35459(i);
                this.f44583.f76999 = (int) j;
                return;
            case 21930:
                m35459(i);
                this.f44583.f76995 = j == 1;
                return;
            case 21938:
                m35459(i);
                C24316 c24316 = this.f44583;
                c24316.f77011 = true;
                c24316.f77017 = (int) j;
                return;
            case 21998:
                m35459(i);
                this.f44583.f77004 = (int) j;
                return;
            case 22186:
                m35459(i);
                this.f44583.f77030 = j;
                return;
            case 22203:
                m35459(i);
                this.f44583.f77000 = j;
                return;
            case 25188:
                m35459(i);
                this.f44583.f76997 = (int) j;
                return;
            case 30114:
                this.f44624 = j;
                return;
            case 30321:
                m35459(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f44583.f77015 = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f44583.f77015 = 1;
                    return;
                } else if (i3 == 2) {
                    this.f44583.f77015 = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f44583.f77015 = 3;
                    return;
                }
            case 2352003:
                m35459(i);
                this.f44583.f77026 = (int) j;
                return;
            case 2807729:
                this.f44602 = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        m35459(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f44583.f77008 = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f44583.f77008 = 1;
                            return;
                        }
                    case 21946:
                        m35459(i);
                        int iM50227 = C22378.m50227((int) j);
                        if (iM50227 != -1) {
                            this.f44583.f77014 = iM50227;
                            return;
                        }
                        return;
                    case 21947:
                        m35459(i);
                        this.f44583.f77011 = true;
                        int iM50228 = C22378.m50228((int) j);
                        if (iM50228 != -1) {
                            this.f44583.f77039 = iM50228;
                            return;
                        }
                        return;
                    case 21948:
                        m35459(i);
                        this.f44583.f77001 = (int) j;
                        return;
                    case 21949:
                        m35459(i);
                        this.f44583.f77021 = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX INFO: renamed from: ֫ */
    public final void m35465(int i, int i2, InterfaceC10375 interfaceC10375) {
        C19203 c19203;
        char c;
        char c2;
        C19203 c19204;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        SparseArray sparseArray = this.f44617;
        int i7 = 1;
        int i8 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.f44631 != 2) {
                    return;
                }
                C24316 c24316 = (C24316) sparseArray.get(this.f44603);
                if (this.f44587 == 4 && "V_VP9".equals(c24316.f77023)) {
                    C19203 c19205 = this.f44586;
                    c19205.m43727(i2);
                    interfaceC10375.readFully(c19205.m43728(), 0, i2);
                    return;
                }
                interfaceC10375.mo24040(i2);
                return;
            }
            if (i == 16877) {
                m35459(i);
                C24316 c24317 = this.f44583;
                if (c24317.f77028 == 1685485123 || c24317.f77028 == 1685480259) {
                    byte[] bArr = new byte[i2];
                    c24317.f77036 = bArr;
                    interfaceC10375.readFully(bArr, 0, i2);
                    return;
                }
                interfaceC10375.mo24040(i2);
                return;
            }
            if (i == 16981) {
                m35459(i);
                byte[] bArr2 = new byte[i2];
                this.f44583.f77027 = bArr2;
                interfaceC10375.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                interfaceC10375.readFully(bArr3, 0, i2);
                m35459(i);
                this.f44583.f77012 = new C20119(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                C19203 c19206 = this.f44599;
                Arrays.fill(c19206.m43728(), (byte) 0);
                interfaceC10375.readFully(c19206.m43728(), 4 - i2, i2);
                c19206.m43730(0);
                this.f44639 = (int) c19206.m43725();
                return;
            }
            if (i == 25506) {
                m35459(i);
                byte[] bArr4 = new byte[i2];
                this.f44583.f77044 = bArr4;
                interfaceC10375.readFully(bArr4, 0, i2);
                return;
            }
            if (i == 30322) {
                m35459(i);
                byte[] bArr5 = new byte[i2];
                this.f44583.f77024 = bArr5;
                interfaceC10375.readFully(bArr5, 0, i2);
                return;
            }
            throw C10998.m25387("Unexpected id: " + i, (Throwable) null);
        }
        int i9 = this.f44631;
        int i10 = 8;
        C19203 c19207 = this.f44615;
        if (i9 == 0) {
            C3828 c3828 = this.f44634;
            this.f44603 = (int) c3828.m7480(interfaceC10375, false, true, 8);
            this.f44618 = c3828.m7479();
            this.f44608 = -9223372036854775807L;
            this.f44631 = 1;
            c19207.m43727(0);
        }
        C24316 c24318 = (C24316) sparseArray.get(this.f44603);
        if (c24318 != null) {
            c24318.f77022.getClass();
            if (this.f44631 == 1) {
                m35453(interfaceC10375, 3);
                int i11 = (c19207.m43728()[2] & 6) >> 1;
                byte b = 255;
                if (i11 == 0) {
                    this.f44614 = 1;
                    int[] iArr = this.f44598;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    this.f44598 = iArr;
                    iArr[0] = (i2 - this.f44618) - 3;
                } else {
                    m35453(interfaceC10375, 4);
                    int i12 = (c19207.m43728()[3] & 255) + 1;
                    this.f44614 = i12;
                    int[] iArr2 = this.f44598;
                    if (iArr2 == null) {
                        iArr2 = new int[i12];
                    } else if (iArr2.length < i12) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i12)];
                    }
                    this.f44598 = iArr2;
                    if (i11 == 2) {
                        int i13 = (i2 - this.f44618) - 4;
                        int i14 = this.f44614;
                        Arrays.fill(iArr2, 0, i14, i13 / i14);
                    } else {
                        if (i11 == 1) {
                            int i15 = 0;
                            int i16 = 0;
                            int i17 = 4;
                            while (true) {
                                i3 = this.f44614 - 1;
                                if (i15 >= i3) {
                                    break;
                                }
                                this.f44598[i15] = 0;
                                while (true) {
                                    i4 = i17 + 1;
                                    m35453(interfaceC10375, i4);
                                    int i18 = c19207.m43728()[i17] & 255;
                                    int[] iArr3 = this.f44598;
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
                            this.f44598[i3] = ((i2 - this.f44618) - i17) - i16;
                        } else {
                            if (i11 != 3) {
                                throw C10998.m25387("Unexpected lacing value: " + i11, (Throwable) null);
                            }
                            int i19 = 0;
                            int i20 = 0;
                            int i21 = 4;
                            while (true) {
                                int i22 = this.f44614 - i7;
                                if (i19 < i22) {
                                    this.f44598[i19] = i8;
                                    int i23 = i21 + 1;
                                    m35453(interfaceC10375, i23);
                                    if (c19207.m43728()[i21] == 0) {
                                        throw C10998.m25387("No valid varint length mask found", (Throwable) null);
                                    }
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 >= i10) {
                                            c19204 = c19207;
                                            j = 0;
                                            i21 = i23;
                                            break;
                                        }
                                        int i25 = i7 << (7 - i24);
                                        if ((c19207.m43728()[i21] & i25) != 0) {
                                            int i26 = i23 + i24;
                                            m35453(interfaceC10375, i26);
                                            j = (~i25) & c19207.m43728()[i21] & b;
                                            while (i23 < i26) {
                                                j = (j << 8) | ((long) (c19207.m43728()[i23] & 255));
                                                i23++;
                                                c19207 = c19207;
                                            }
                                            c19204 = c19207;
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
                                        throw C10998.m25387("EBML lacing sample size out of range.", (Throwable) null);
                                    }
                                    int i27 = (int) j;
                                    int[] iArr4 = this.f44598;
                                    if (i19 != 0) {
                                        i27 += iArr4[i19 - 1];
                                    }
                                    iArr4[i19] = i27;
                                    i20 += i27;
                                    i19++;
                                    i7 = 1;
                                    i8 = 0;
                                    i10 = 8;
                                    c19207 = c19204;
                                    b = 255;
                                } else {
                                    c19203 = c19207;
                                    this.f44598[i22] = ((i2 - this.f44618) - i21) - i20;
                                    c = 1;
                                    c2 = 0;
                                    break;
                                }
                            }
                        }
                        this.f44605 = this.f44589 + m35452((c19203.m43728()[c] & 255) | (c19203.m43728()[c2] << 8));
                        if (c24318.f77037 != 2 || (i == 163 && (c19203.m43728()[2] & GCMSIVBlockCipher.MASK) == 128)) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        this.f44620 = i6;
                        this.f44631 = 2;
                        this.f44638 = 0;
                    }
                }
                c = 1;
                c2 = 0;
                c19203 = c19207;
                this.f44605 = this.f44589 + m35452((c19203.m43728()[c] & 255) | (c19203.m43728()[c2] << 8));
                if (c24318.f77037 != 2) {
                    i6 = 1;
                } else {
                    i6 = 1;
                }
                this.f44620 = i6;
                this.f44631 = 2;
                this.f44638 = 0;
            }
            if (i == 163) {
                while (true) {
                    int i28 = this.f44638;
                    if (i28 < this.f44614) {
                        m35455(c24318, ((long) ((this.f44638 * c24318.f77026) / 1000)) + this.f44605, this.f44620, m35451(interfaceC10375, c24318, this.f44598[i28], false), 0);
                        this.f44638++;
                    } else {
                        this.f44631 = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = this.f44638;
                    if (i29 >= this.f44614) {
                        return;
                    }
                    int[] iArr5 = this.f44598;
                    iArr5[i29] = m35451(interfaceC10375, c24318, iArr5[i29], true);
                    this.f44638++;
                }
            }
        } else {
            interfaceC10375.mo24040(i2 - this.f44618);
            this.f44631 = 0;
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: ܽ */
    private void m35459(int i) throws C10998 {
        if (this.f44583 != null) {
            return;
        }
        throw C10998.m25387("Element " + i + " must be in a TrackEntry", (Throwable) null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: ۧ */
    private void m35457(int i) throws C10998 {
        if (this.f44626 == null || this.f44592 == null) {
            throw C10998.m25387("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35464(int i, double d) {
        if (i == 181) {
            m35459(i);
            this.f44583.f77013 = (int) d;
            return;
        }
        if (i == 17545) {
            this.f44595 = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m35459(i);
                this.f44583.f77033 = (float) d;
                break;
            case 21970:
                m35459(i);
                this.f44583.f77031 = (float) d;
                break;
            case 21971:
                m35459(i);
                this.f44583.f77018 = (float) d;
                break;
            case 21972:
                m35459(i);
                this.f44583.f77029 = (float) d;
                break;
            case 21973:
                m35459(i);
                this.f44583.f77010 = (float) d;
                break;
            case 21974:
                m35459(i);
                this.f44583.f76998 = (float) d;
                break;
            case 21975:
                m35459(i);
                this.f44583.f76994 = (float) d;
                break;
            case 21976:
                m35459(i);
                this.f44583.f77006 = (float) d;
                break;
            case 21977:
                m35459(i);
                this.f44583.f77020 = (float) d;
                break;
            case 21978:
                m35459(i);
                this.f44583.f77016 = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m35459(i);
                        this.f44583.f77040 = (float) d;
                        break;
                    case 30324:
                        m35459(i);
                        this.f44583.f77045 = (float) d;
                        break;
                    case 30325:
                        m35459(i);
                        this.f44583.f77009 = (float) d;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35467(int i, String str) {
        if (i == 134) {
            m35459(i);
            this.f44583.f77023 = str;
            return;
        }
        if (i == 17026) {
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw C10998.m25387("DocType " + str + " not supported", (Throwable) null);
            }
            this.f44594 = str.equals("webm");
            return;
        }
        if (i == 21358) {
            m35459(i);
            this.f44583.f77019 = str;
        } else {
            if (i != 2274716) {
                return;
            }
            m35459(i);
            this.f44583.f77038 = str;
        }
    }

    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: ֫ */
    private void m35455(C24316 c24316, long j, int i, int i2, int i3) {
        byte[] bArrM35456;
        int i4;
        int iM43729;
        C2683 c2683 = c24316.f77035;
        if (c2683 != null) {
            c2683.m4150(c24316.f77022, j, i, i2, i3, c24316.f77012);
        } else {
            if ("S_TEXT/UTF8".equals(c24316.f77023) || "S_TEXT/ASS".equals(c24316.f77023) || "S_TEXT/SSA".equals(c24316.f77023) || "S_TEXT/WEBVTT".equals(c24316.f77023)) {
                if (this.f44614 > 1) {
                    C21334.m48351("Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f44608;
                    if (j2 == -9223372036854775807L) {
                        C21334.m48351("Skipping subtitle sample with no duration.");
                    } else {
                        String str = c24316.f77023;
                        C19203 c19203 = this.f44596;
                        byte[] bArrM43728 = c19203.m43728();
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrM35456 = m35456("%01d:%02d:%02d:%02d", j2, 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrM35456 = m35456("%02d:%02d:%02d.%03d", j2, 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrM35456 = m35456("%02d:%02d:%02d,%03d", j2, 1000L);
                                i4 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrM35456, 0, bArrM43728, i4, bArrM35456.length);
                        for (int iM43731 = c19203.m43731(); iM43731 < c19203.m43729(); iM43731++) {
                            if (c19203.m43728()[iM43731] == 0) {
                                c19203.m43732(iM43731);
                                c24316.f77022.mo10500(c19203.m43729(), c19203);
                                iM43729 = c19203.m43729() + i2;
                            }
                        }
                        c24316.f77022.mo10500(c19203.m43729(), c19203);
                        iM43729 = c19203.m43729() + i2;
                    }
                }
                iM43729 = i2;
            } else {
                iM43729 = i2;
            }
            if ((i & 268435456) != 0) {
                int i5 = this.f44614;
                C19203 c19204 = this.f44586;
                if (i5 > 1) {
                    c19204.m43727(0);
                } else {
                    int iM437210 = c19204.m43729();
                    c24316.f77022.mo10504(c19204, iM437210, 2);
                    iM43729 += iM437210;
                }
            }
            c24316.f77022.mo10502(j, i, iM43729, i3, c24316.f77012);
        }
        this.f44630 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35453(InterfaceC10375 interfaceC10375, int i) {
        C19203 c19203 = this.f44615;
        if (c19203.m43729() >= i) {
            return;
        }
        if (c19203.m43718() < i) {
            c19203.m43706(Math.max(c19203.m43718() * 2, i));
        }
        interfaceC10375.readFully(c19203.m43728(), c19203.m43729(), i - c19203.m43729());
        c19203.m43732(i);
    }

    @RequiresNonNull({"#2.output"})
    /* JADX INFO: renamed from: ֫ */
    private int m35451(InterfaceC10375 interfaceC10375, C24316 c24316, int i, boolean z) throws C10998 {
        int iMo10498;
        int iMo10499;
        boolean z2;
        int i2;
        if ("S_TEXT/UTF8".equals(c24316.f77023)) {
            m35454(interfaceC10375, f44577, i);
        } else if ("S_TEXT/ASS".equals(c24316.f77023) || "S_TEXT/SSA".equals(c24316.f77023)) {
            m35454(interfaceC10375, f44578, i);
        } else if ("S_TEXT/WEBVTT".equals(c24316.f77023)) {
            m35454(interfaceC10375, f44580, i);
        } else {
            InterfaceC20790 interfaceC20790 = c24316.f77022;
            boolean z3 = this.f44613;
            C19203 c19203 = this.f44623;
            if (!z3) {
                boolean z4 = c24316.f77025;
                C19203 c19204 = this.f44615;
                if (z4) {
                    this.f44620 &= -1073741825;
                    if (!this.f44625) {
                        interfaceC10375.readFully(c19204.m43728(), 0, 1);
                        this.f44597++;
                        if ((c19204.m43728()[0] & GCMSIVBlockCipher.MASK) == 128) {
                            throw C10998.m25387("Extension bit is set in signal byte", (Throwable) null);
                        }
                        this.f44621 = c19204.m43728()[0];
                        this.f44625 = true;
                    }
                    byte b = this.f44621;
                    if ((b & 1) == 1) {
                        boolean z5 = (b & 2) == 2;
                        this.f44620 |= 1073741824;
                        if (!this.f44600) {
                            C19203 c19205 = this.f44601;
                            interfaceC10375.readFully(c19205.m43728(), 0, 8);
                            this.f44597 += 8;
                            this.f44600 = true;
                            c19204.m43728()[0] = (byte) ((z5 ? 128 : 0) | 8);
                            c19204.m43730(0);
                            interfaceC20790.mo10504(c19204, 1, 1);
                            this.f44610++;
                            c19205.m43730(0);
                            interfaceC20790.mo10504(c19205, 8, 1);
                            this.f44610 += 8;
                        }
                        if (z5) {
                            if (!this.f44609) {
                                interfaceC10375.readFully(c19204.m43728(), 0, 1);
                                this.f44597++;
                                c19204.m43730(0);
                                this.f44588 = c19204.m43702();
                                this.f44609 = true;
                            }
                            int i3 = this.f44588 * 4;
                            c19204.m43727(i3);
                            interfaceC10375.readFully(c19204.m43728(), 0, i3);
                            this.f44597 += i3;
                            short s = (short) ((this.f44588 / 2) + 1);
                            int i4 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f44633;
                            if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                this.f44633 = ByteBuffer.allocate(i4);
                            }
                            this.f44633.position(0);
                            this.f44633.putShort(s);
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i2 = this.f44588;
                                if (i5 >= i2) {
                                    break;
                                }
                                int iM43738 = c19204.m43738();
                                if (i5 % 2 == 0) {
                                    this.f44633.putShort((short) (iM43738 - i6));
                                } else {
                                    this.f44633.putInt(iM43738 - i6);
                                }
                                i5++;
                                i6 = iM43738;
                            }
                            int i7 = (i - this.f44597) - i6;
                            if (i2 % 2 == 1) {
                                this.f44633.putInt(i7);
                            } else {
                                this.f44633.putShort((short) i7);
                                this.f44633.putInt(0);
                            }
                            byte[] bArrArray = this.f44633.array();
                            C19203 c19206 = this.f44616;
                            c19206.m43708(i4, bArrArray);
                            interfaceC20790.mo10504(c19206, i4, 1);
                            this.f44610 += i4;
                        }
                    }
                } else {
                    byte[] bArr = c24316.f77027;
                    if (bArr != null) {
                        c19203.m43708(bArr.length, bArr);
                    }
                }
                if ("A_OPUS".equals(c24316.f77023)) {
                    z2 = z;
                } else {
                    z2 = c24316.f77004 > 0;
                }
                if (z2) {
                    this.f44620 |= 268435456;
                    this.f44586.m43727(0);
                    int iM43729 = (c19203.m43729() + i) - this.f44597;
                    c19204.m43727(4);
                    c19204.m43728()[0] = (byte) ((iM43729 >> 24) & 255);
                    c19204.m43728()[1] = (byte) ((iM43729 >> 16) & 255);
                    c19204.m43728()[2] = (byte) ((iM43729 >> 8) & 255);
                    c19204.m43728()[3] = (byte) (iM43729 & 255);
                    interfaceC20790.mo10504(c19204, 4, 2);
                    this.f44610 += 4;
                }
                this.f44613 = true;
            }
            int iM437210 = c19203.m43729() + i;
            if ("V_MPEG4/ISO/AVC".equals(c24316.f77023) || "V_MPEGH/ISO/HEVC".equals(c24316.f77023)) {
                C19203 c19207 = this.f44591;
                byte[] bArrM43728 = c19207.m43728();
                bArrM43728[0] = 0;
                bArrM43728[1] = 0;
                bArrM43728[2] = 0;
                int i8 = c24316.f77007;
                int i9 = 4 - i8;
                while (this.f44597 < iM437210) {
                    int i10 = this.f44637;
                    if (i10 == 0) {
                        int iMin = Math.min(i8, c19203.m43703());
                        interfaceC10375.readFully(bArrM43728, i9 + iMin, i8 - iMin);
                        if (iMin > 0) {
                            c19203.m43707(i9, iMin, bArrM43728);
                        }
                        this.f44597 += i8;
                        c19207.m43730(0);
                        this.f44637 = c19207.m43738();
                        C19203 c19208 = this.f44612;
                        c19208.m43730(0);
                        interfaceC20790.mo10500(4, c19208);
                        this.f44610 += 4;
                    } else {
                        int iM43703 = c19203.m43703();
                        if (iM43703 > 0) {
                            iMo10498 = Math.min(i10, iM43703);
                            interfaceC20790.mo10500(iMo10498, c19203);
                        } else {
                            iMo10498 = interfaceC20790.mo10498((InterfaceC11649) interfaceC10375, i10, false);
                        }
                        this.f44597 += iMo10498;
                        this.f44610 += iMo10498;
                        this.f44637 -= iMo10498;
                    }
                }
            } else {
                if (c24316.f77035 != null) {
                    C23877.m52960(c19203.m43729() == 0);
                    c24316.f77035.m4149(interfaceC10375);
                }
                while (true) {
                    int i11 = this.f44597;
                    if (i11 >= iM437210) {
                        break;
                    }
                    int i12 = iM437210 - i11;
                    int iM43704 = c19203.m43703();
                    if (iM43704 > 0) {
                        iMo10499 = Math.min(i12, iM43704);
                        interfaceC20790.mo10500(iMo10499, c19203);
                    } else {
                        iMo10499 = interfaceC20790.mo10498((InterfaceC11649) interfaceC10375, i12, false);
                    }
                    this.f44597 += iMo10499;
                    this.f44610 += iMo10499;
                }
            }
            if ("A_VORBIS".equals(c24316.f77023)) {
                C19203 c19209 = this.f44636;
                c19209.m43730(0);
                interfaceC20790.mo10500(4, c19209);
                this.f44610 += 4;
            }
        }
        int i13 = this.f44610;
        m35462();
        return i13;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m35462() {
        this.f44597 = 0;
        this.f44610 = 0;
        this.f44637 = 0;
        this.f44613 = false;
        this.f44625 = false;
        this.f44609 = false;
        this.f44588 = 0;
        this.f44621 = (byte) 0;
        this.f44600 = false;
        this.f44623.m43727(0);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35454(InterfaceC10375 interfaceC10375, byte[] bArr, int i) {
        int length = bArr.length + i;
        C19203 c19203 = this.f44596;
        if (c19203.m43718() < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c19203.getClass();
            c19203.m43708(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, c19203.m43728(), 0, bArr.length);
        }
        interfaceC10375.readFully(c19203.m43728(), bArr.length, i);
        c19203.m43730(0);
        c19203.m43732(length);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m35456(String str, long j, long j2) {
        C23877.m52957(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = C5792.f14228;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫ */
    private long m35452(long j) throws C10998 {
        long j2 = this.f44602;
        if (j2 == -9223372036854775807L) {
            throw C10998.m25387("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
        }
        String str = C5792.f14228;
        return C5792.m12993(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:227:0x0345  */
    /* JADX INFO: renamed from: ֫ */
    public final void m35463(int i) {
        InterfaceC11402 c22131;
        int i2;
        C23877.m52958(this.f44635);
        byte b = 8;
        SparseArray sparseArray = this.f44617;
        int i3 = 0;
        if (i == 160) {
            if (this.f44631 != 2) {
                return;
            }
            C24316 c24316 = (C24316) sparseArray.get(this.f44603);
            c24316.f77022.getClass();
            if (this.f44624 > 0 && "A_OPUS".equals(c24316.f77023)) {
                byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f44624).array();
                C19203 c19203 = this.f44586;
                c19203.getClass();
                c19203.m43708(bArrArray.length, bArrArray);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f44614; i5++) {
                i4 += this.f44598[i5];
            }
            int i6 = 0;
            while (i6 < this.f44614) {
                long j = this.f44605 + ((long) ((c24316.f77026 * i6) / 1000));
                int i7 = this.f44620;
                if (i6 == 0 && !this.f44622) {
                    i7 |= 1;
                }
                int i8 = this.f44598[i6];
                int i9 = i4 - i8;
                m35455(c24316, j, i7, i8, i9);
                i6++;
                i4 = i9;
            }
            this.f44631 = 0;
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i10 = this.f44639;
                if (i10 != -1) {
                    long j2 = this.f44632;
                    if (j2 != -1) {
                        if (i10 == 475249515) {
                            this.f44628 = j2;
                            return;
                        }
                        return;
                    }
                }
                throw C10998.m25387("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            }
            if (i == 25152) {
                m35459(i);
                C24316 c24317 = this.f44583;
                if (c24317.f77025) {
                    C20119 c20119 = c24317.f77012;
                    if (c20119 == null) {
                        throw C10998.m25387("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
                    }
                    c24317.f76993 = new C21037(new C20366(C25059.f79956, null, "video/webm", c20119.f62255));
                    return;
                }
                return;
            }
            if (i == 28032) {
                m35459(i);
                C24316 c24318 = this.f44583;
                if (c24318.f77025 && c24318.f77027 != null) {
                    throw C10998.m25387("Combining encryption and compression is not supported", (Throwable) null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.f44602 == -9223372036854775807L) {
                    this.f44602 = 1000000L;
                }
                long j3 = this.f44595;
                if (j3 != -9223372036854775807L) {
                    this.f44585 = m35452(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (sparseArray.size() == 0) {
                    throw C10998.m25387("No valid tracks were found", (Throwable) null);
                }
                this.f44635.mo5734();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.f44629) {
                InterfaceC23116 interfaceC23116 = this.f44635;
                C6581 c6581 = this.f44626;
                C6581 c6582 = this.f44592;
                if (this.f44593 == -1 || this.f44585 == -9223372036854775807L || c6581 == null || c6581.m15035() == 0 || c6582 == null || c6582.m15035() != c6581.m15035()) {
                    c22131 = new C22131(this.f44585);
                } else {
                    int iM15035 = c6581.m15035();
                    int[] iArrCopyOf = new int[iM15035];
                    long[] jArrCopyOf = new long[iM15035];
                    long[] jArrCopyOf2 = new long[iM15035];
                    long[] jArrCopyOf3 = new long[iM15035];
                    for (int i11 = 0; i11 < iM15035; i11++) {
                        jArrCopyOf3[i11] = c6581.m15036(i11);
                        jArrCopyOf[i11] = c6582.m15036(i11) + this.f44593;
                    }
                    while (true) {
                        i2 = iM15035 - 1;
                        if (i3 >= i2) {
                            break;
                        }
                        int i12 = i3 + 1;
                        iArrCopyOf[i3] = (int) (jArrCopyOf[i12] - jArrCopyOf[i3]);
                        jArrCopyOf2[i3] = jArrCopyOf3[i12] - jArrCopyOf3[i3];
                        i3 = i12;
                    }
                    int i13 = i2;
                    while (i13 > 0 && jArrCopyOf3[i13] > this.f44585) {
                        i13--;
                    }
                    iArrCopyOf[i13] = (int) ((this.f44593 + this.f44627) - jArrCopyOf[i13]);
                    jArrCopyOf2[i13] = this.f44585 - jArrCopyOf3[i13];
                    if (i13 < i2) {
                        C21334.m48351("Discarding trailing cue points with timestamps greater than total duration");
                        int i14 = i13 + 1;
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i14);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i14);
                    }
                    c22131 = new C22446(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                interfaceC23116.mo5733(c22131);
                this.f44629 = true;
            }
            this.f44626 = null;
            this.f44592 = null;
            return;
        }
        C24316 c24319 = this.f44583;
        C23877.m52958(c24319);
        String str = c24319.f77023;
        if (str == null) {
            throw C10998.m25387("CodecId is missing in TrackEntry element", (Throwable) null);
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
                    b = C0698cb.f2569k;
                } else {
                    b = -1;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b = C0698cb.f2570l;
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
                    b = C0684bo.f2505j;
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
                c24319.m53647(this.f44635, c24319.f77043);
                sparseArray.put(c24319.f77043, c24319);
                break;
        }
        this.f44583 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35468(long j, int i, long j2) {
        C23877.m52958(this.f44635);
        if (i == 160) {
            this.f44622 = false;
            this.f44624 = 0L;
            return;
        }
        if (i == 174) {
            C24316 c24316 = new C24316();
            this.f44583 = c24316;
            c24316.f77042 = this.f44594;
            return;
        }
        if (i == 187) {
            this.f44590 = false;
            return;
        }
        if (i == 19899) {
            this.f44639 = -1;
            this.f44632 = -1L;
            return;
        }
        if (i == 20533) {
            m35459(i);
            this.f44583.f77025 = true;
            return;
        }
        if (i == 21968) {
            m35459(i);
            this.f44583.f77011 = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f44593;
            if (j3 != -1 && j3 != j) {
                throw C10998.m25387("Multiple Segment elements not supported", (Throwable) null);
            }
            this.f44593 = j;
            this.f44627 = j2;
            return;
        }
        if (i == 475249515) {
            this.f44626 = new C6581();
            this.f44592 = new C6581();
        } else if (i == 524531317 && !this.f44629) {
            if (this.f44604 && this.f44628 != -1) {
                this.f44606 = true;
            } else {
                this.f44635.mo5733(new C22131(this.f44585));
                this.f44629 = true;
            }
        }
    }
}
