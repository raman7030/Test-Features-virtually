package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.֨᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3666 {

    /* JADX INFO: renamed from: ۧ֫ */
    public static final /* synthetic */ int f7732 = 0;

    /* JADX INFO: renamed from: ֨ */
    public final C5771 f7734;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f7736;

    /* JADX INFO: renamed from: ۖ */
    public boolean f7737;

    /* JADX INFO: renamed from: ۗ */
    public EnumC21102 f7738;

    /* JADX INFO: renamed from: ۙ */
    public final C14080 f7740;

    /* JADX INFO: renamed from: ۛ */
    public C7690 f7742;

    /* JADX INFO: renamed from: ۟ */
    public int f7744;

    /* JADX INFO: renamed from: ۠ */
    public final boolean f7745;

    /* JADX INFO: renamed from: ۨ */
    public final C22004 f7750;

    /* JADX INFO: renamed from: ܰ */
    public C17747[] f7753;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f7754;

    /* JADX INFO: renamed from: ܿ */
    public C13134 f7758;

    /* JADX INFO: renamed from: ᩴ */
    public InterfaceC15575 f7760;

    /* JADX INFO: renamed from: ᩵ */
    public C17747[] f7761;

    /* JADX INFO: renamed from: ᩺ */
    public final C8374 f7766;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f7767;

    /* JADX INFO: renamed from: ۚ */
    public int f7741 = 0;

    /* JADX INFO: renamed from: ֡ */
    public int f7733 = 0;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f7757 = new byte[64];

    /* JADX INFO: renamed from: ᩳ */
    public int f7759 = 0;

    /* JADX INFO: renamed from: ۧ */
    public C20271 f7749 = new C20271();

    /* JADX INFO: renamed from: ۘ */
    public C4848 f7739 = C4848.m10283();

    /* JADX INFO: renamed from: ֫ */
    public boolean f7735 = true;

    /* JADX INFO: renamed from: ۜ */
    public boolean f7743 = false;

    /* JADX INFO: renamed from: ܶ */
    public int f7755 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public C11714 f7764 = null;

    /* JADX INFO: renamed from: ᩶ */
    public int f7762 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f7765 = false;

    /* JADX INFO: renamed from: ܺ */
    public int f7756 = 0;

    /* JADX INFO: renamed from: ۬ */
    public C2995[] f7752 = null;

    /* JADX INFO: renamed from: ۤ */
    public AbstractC4337[] f7748 = null;

    /* JADX INFO: renamed from: ۫ */
    public int f7751 = 0;

    /* JADX INFO: renamed from: ۡ */
    public int f7746 = -1;

    /* JADX INFO: renamed from: ۢ */
    public C2995 f7747 = null;

    /* JADX INFO: renamed from: ᩷ */
    public C2995 f7763 = null;

    /* JADX INFO: renamed from: ۘ */
    public static int m7025(int i) {
        if (i == 198) {
            return 199;
        }
        if (i == 199) {
            return 198;
        }
        return ((i + 1) ^ 1) - 1;
    }

    /* JADX INFO: renamed from: ᩴ */
    public static int m7033(int i) {
        if (i == 5 || i == 6 || i == 7) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩵ */
    public static int m7034(int i) {
        if (i == 1 || i == 3) {
            return 2;
        }
        return i != 8 ? 1 : 0;
    }

    public C3666(C5771 c5771, boolean z, InterfaceC15575 interfaceC15575, boolean z2, EnumC21102 enumC21102, boolean z3, C13134 c13134, C22004 c22004, C8374 c8374, C14080 c14080) {
        this.f7734 = c5771;
        this.f7767 = z;
        this.f7760 = interfaceC15575;
        this.f7737 = interfaceC15575 != null;
        this.f7736 = z2;
        this.f7758 = c13134;
        this.f7750 = c22004;
        this.f7766 = c8374;
        this.f7740 = c14080;
        this.f7754 = z3;
        this.f7738 = enumC21102;
        int iOrdinal = enumC21102.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.f7745 = true;
        } else {
            this.f7745 = false;
        }
        this.f7742 = new C7690(this);
        this.f7761 = new C17747[20];
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m7020(AbstractC6462 abstractC6462) {
        switch (C22443.f70811[abstractC6462.mo5577().ordinal()]) {
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 6;
            case 4:
                return 0;
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 3;
            case 8:
                return 5;
            case 9:
                return 8;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return 4;
            default:
                throw new AssertionError("typecode " + abstractC6462.mo5577());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m7029(AbstractC6462 abstractC6462) {
        if (abstractC6462 == null) {
            return 1;
        }
        return m7034(m7020(abstractC6462));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m7019(C4848 c4848) {
        int iM7029 = 0;
        while (c4848.m10293()) {
            iM7029 += m7029((AbstractC6462) c4848.f11034);
            c4848 = c4848.f11035;
        }
        return iM7029;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m7054() {
        if (this.f7764 != null) {
            m7070();
        }
        if (this.f7762 != -1) {
            m7072();
        }
        this.f7743 = true;
        return this.f7759;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m7028(int i) {
        if (this.f7735) {
            byte[] bArrM19514 = C8377.m19514(this.f7759, this.f7757);
            this.f7757 = bArrM19514;
            int i2 = this.f7759;
            this.f7759 = i2 + 1;
            bArrM19514[i2] = (byte) i;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private void m7026(int i) {
        if (this.f7735) {
            int i2 = this.f7759;
            int i3 = i2 + 2;
            byte[] bArr = this.f7757;
            if (i3 > bArr.length) {
                m7028(i >> 8);
                m7028(i);
                return;
            }
            int i4 = i2 + 1;
            this.f7759 = i4;
            bArr[i2] = (byte) (i >> 8);
            this.f7759 = i3;
            bArr[i4] = (byte) i;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7055(int i) {
        if (this.f7735) {
            int i2 = this.f7759;
            int i3 = i2 + 4;
            byte[] bArr = this.f7757;
            if (i3 > bArr.length) {
                m7028(i >> 24);
                m7028(i >> 16);
                m7028(i >> 8);
                m7028(i);
                return;
            }
            int i4 = i2 + 1;
            this.f7759 = i4;
            bArr[i2] = (byte) (i >> 24);
            int i5 = i2 + 2;
            this.f7759 = i5;
            bArr[i4] = (byte) (i >> 16);
            int i6 = i2 + 3;
            this.f7759 = i6;
            bArr[i5] = (byte) (i >> 8);
            this.f7759 = i3;
            bArr[i6] = (byte) i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c2  */
    /* JADX INFO: renamed from: ܺ */
    private void m7031(int i) {
        C17747 c17747;
        AbstractC4337 c13331;
        AbstractC4337 c15341;
        C17747 c17748;
        int i2;
        if (this.f7764 != null) {
            m7070();
        }
        if (this.f7735) {
            if (this.f7762 != -1) {
                m7072();
            }
            boolean z = this.f7765;
            boolean z2 = this.f7754;
            if (z) {
                int i3 = 0;
                this.f7765 = false;
                int iM7054 = m7054();
                if (this.f7745) {
                    int iOrdinal = this.f7738.ordinal();
                    C8374 c8374 = this.f7766;
                    if (iOrdinal == 1) {
                        int iM7027 = m7027();
                        if (this.f7746 == iM7054) {
                            C2995[] c2995Arr = this.f7752;
                            int i4 = this.f7751 - 1;
                            this.f7751 = i4;
                            c2995Arr[i4] = null;
                        }
                        this.f7746 = iM7054;
                        C2995[] c2995Arr2 = this.f7752;
                        if (c2995Arr2 == null) {
                            this.f7752 = new C2995[20];
                        } else {
                            this.f7752 = (C2995[]) C8377.m19515(this.f7751, c2995Arr2);
                        }
                        C2995[] c2995Arr3 = this.f7752;
                        int i5 = this.f7751;
                        this.f7751 = i5 + 1;
                        C2995 c2995 = new C2995();
                        c2995Arr3[i5] = c2995;
                        c2995.f5327 = iM7054;
                        c2995.f5326 = new AbstractC6462[iM7027];
                        for (int i6 = 0; i6 < iM7027; i6++) {
                            if (this.f7742.f20161.m22915(i6) && (c17747 = this.f7761[i6]) != null) {
                                AbstractC6462 abstractC6462M19459 = c17747.f53006.f20406;
                                if (!(abstractC6462M19459 instanceof C18083)) {
                                    abstractC6462M19459 = c8374.m19459(abstractC6462M19459);
                                }
                                c2995.f5326[i6] = abstractC6462M19459;
                            }
                        }
                        c2995.f5328 = new AbstractC6462[this.f7742.f20157];
                        while (true) {
                            C7690 c7690 = this.f7742;
                            if (i3 >= c7690.f20157) {
                                break;
                            }
                            c2995.f5328[i3] = c7690.f20158[i3];
                            i3++;
                        }
                    } else if (iOrdinal == 2) {
                        int iM7028 = m7027();
                        C2995 c2996 = this.f7747;
                        if (c2996 != null) {
                            if (c2996.f5327 == iM7054) {
                                AbstractC4337[] abstractC4337Arr = this.f7748;
                                int i7 = this.f7751 - 1;
                                this.f7751 = i7;
                                abstractC4337Arr[i7] = null;
                                this.f7747 = this.f7763;
                                this.f7763 = null;
                            }
                        } else {
                            C2995 c2997 = new C2995();
                            C5771 c5771 = this.f7734;
                            C4848 c4848 = ((C12497) c5771.m18015(c8374)).f35030;
                            int iM10289 = c4848.m10289();
                            if (!c5771.mo17483()) {
                                AbstractC6462 abstractC6462 = c5771.f20407.f20406;
                                c2997.f5326 = new AbstractC6462[iM10289 + 1];
                                if (c5771.m17994() && abstractC6462 != this.f7750.f69208) {
                                    c2997.f5326[0] = C18083.m41136(abstractC6462);
                                } else {
                                    c2997.f5326[0] = c8374.m19459(abstractC6462);
                                }
                                i2 = 1;
                            } else {
                                c2997.f5326 = new AbstractC6462[iM10289];
                                i2 = 0;
                            }
                            Iterator it = c4848.iterator();
                            while (it.hasNext()) {
                                c2997.f5326[i2] = c8374.m19459((AbstractC6462) it.next());
                                i2++;
                            }
                            c2997.f5327 = -1;
                            c2997.f5328 = null;
                            this.f7747 = c2997;
                        }
                        C2995 c2998 = new C2995();
                        c2998.f5327 = iM7054;
                        AbstractC6462[] abstractC6462Arr = new AbstractC6462[iM7028];
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < iM7028) {
                            if (this.f7742.f20161.m22915(i8) && (c17748 = this.f7761[i8]) != null) {
                                AbstractC6462 abstractC6462M194510 = c17748.f53006.f20406;
                                if (!(abstractC6462M194510 instanceof C18083)) {
                                    abstractC6462M194510 = c8374.m19459(abstractC6462M194510);
                                }
                                abstractC6462Arr[i8] = abstractC6462M194510;
                                if (m7029(abstractC6462M194510) > 1) {
                                    i8++;
                                }
                            }
                            i8++;
                            i9++;
                        }
                        c2998.f5326 = new AbstractC6462[i9];
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < iM7028) {
                            C1446.m31704(i11 < i9);
                            c2998.f5326[i11] = abstractC6462Arr[i10];
                            if (m7029(abstractC6462Arr[i10]) > 1) {
                                i10++;
                            }
                            i10++;
                            i11++;
                        }
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            C7690 c7691 = this.f7742;
                            if (i12 >= c7691.f20157) {
                                break;
                            }
                            if (c7691.f20158[i12] != null) {
                                i13++;
                            }
                            i12++;
                        }
                        c2998.f5328 = new AbstractC6462[i13];
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            C7690 c7692 = this.f7742;
                            if (i14 >= c7692.f20157) {
                                break;
                            }
                            AbstractC6462 abstractC6463 = c7692.f20158[i14];
                            if (abstractC6463 != null) {
                                c2998.f5328[i15] = c8374.m19459(abstractC6463);
                                i15++;
                            }
                            i14++;
                        }
                        AbstractC4337[] abstractC4337Arr2 = this.f7748;
                        if (abstractC4337Arr2 == null) {
                            this.f7748 = new AbstractC4337[20];
                        } else {
                            this.f7748 = (AbstractC4337[]) C8377.m19515(this.f7751, abstractC4337Arr2);
                        }
                        AbstractC4337[] abstractC4337Arr3 = this.f7748;
                        int i16 = this.f7751;
                        this.f7751 = i16 + 1;
                        C2995 c2999 = this.f7747;
                        int i17 = c2999.f5327;
                        AbstractC6462[] abstractC6462Arr2 = c2999.f5326;
                        AbstractC6462[] abstractC6462Arr3 = c2998.f5326;
                        AbstractC6462[] abstractC6462Arr4 = c2998.f5328;
                        int i18 = (c2998.f5327 - i17) - 1;
                        if (abstractC6462Arr4.length == 1) {
                            if (abstractC6462Arr3.length == abstractC6462Arr2.length && AbstractC4337.m8936(abstractC6462Arr2, abstractC6462Arr3, c8374) == 0) {
                                c15341 = new C9307(i18, abstractC6462Arr4[0]);
                            } else {
                                c15341 = new C24059(i18, abstractC6462Arr3, abstractC6462Arr4);
                            }
                        } else if (abstractC6462Arr4.length == 0) {
                            int iM8936 = AbstractC4337.m8936(abstractC6462Arr2, abstractC6462Arr3, c8374);
                            if (iM8936 == 0) {
                                c15341 = new C15341(i18);
                            } else {
                                if (-4 < iM8936 && iM8936 < 0) {
                                    AbstractC6462[] abstractC6462Arr5 = new AbstractC6462[-iM8936];
                                    int length = abstractC6462Arr2.length;
                                    while (length < abstractC6462Arr3.length) {
                                        abstractC6462Arr5[i3] = abstractC6462Arr3[length];
                                        length++;
                                        i3++;
                                    }
                                    c13331 = new C7966(251 - iM8936, i18, abstractC6462Arr5);
                                } else if (iM8936 > 0 && iM8936 < 4) {
                                    c13331 = new C13331(251 - iM8936, i18);
                                } else {
                                    c15341 = new C24059(i18, abstractC6462Arr3, abstractC6462Arr4);
                                }
                                c15341 = c13331;
                            }
                        } else {
                            c15341 = new C24059(i18, abstractC6462Arr3, abstractC6462Arr4);
                        }
                        abstractC4337Arr3[i16] = c15341;
                        this.f7763 = this.f7747;
                        this.f7747 = c2998;
                    } else {
                        throw new AssertionError("Should have chosen a stackmap format");
                    }
                    if (z2) {
                        this.f7742.m17804(iM7054);
                    }
                }
            }
            if (z2) {
                System.err.println("emit@" + this.f7759 + " stack=" + this.f7742.f20157 + ": " + C5008.f11448[i]);
            }
            m7028(i);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m7053() {
        C1446.m31704(this.f7735 || m7066());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7047(InterfaceC10057 interfaceC10057) {
        int iM31951 = this.f7740.m31951(interfaceC10057);
        if (iM31951 <= 255) {
            m7042(18, iM31951, interfaceC10057);
        } else {
            m7043(19, iM31951, (InterfaceC22798) interfaceC10057);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7041(int i, int i2, AbstractC6462 abstractC6462) {
        m7031(197);
        if (this.f7735) {
            m7026(i2);
            m7028(i);
            this.f7742.m17808(i);
            this.f7742.m17806(abstractC6462);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7057(int i, AbstractC6462 abstractC6462) {
        m7031(188);
        if (this.f7735) {
            m7028(i);
            this.f7742.m17808(1);
            this.f7742.m17806(abstractC6462);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7044(int i, AbstractC6462 abstractC6462) {
        m7031(189);
        if (this.f7735) {
            m7026(i);
            this.f7742.m17808(1);
            this.f7742.m17806(abstractC6462);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX INFO: renamed from: ܽ */
    public final void m7062(int i) {
        m7031(i);
        if (this.f7735) {
            if (i != 167) {
                C22004 c22004 = this.f7750;
                if (i == 190) {
                    this.f7742.m17808(1);
                    this.f7742.m17806(c22004.f69134);
                } else {
                    if (i != 191) {
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                this.f7742.m17806(c22004.f69204);
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.f7742.m17806(c22004.f69134);
                                break;
                            case 9:
                            case 10:
                                this.f7742.m17806(c22004.f69152);
                                break;
                            case 11:
                            case 12:
                            case 13:
                                this.f7742.m17806(c22004.f69165);
                                break;
                            case 14:
                            case 15:
                                this.f7742.m17806(c22004.f69181);
                                break;
                            default:
                                switch (i) {
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                        this.f7742.m17806(c22004.f69134);
                                        break;
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                        this.f7742.m17806(c22004.f69152);
                                        break;
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                        this.f7742.m17806(c22004.f69165);
                                        break;
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                        this.f7742.m17806(c22004.f69181);
                                        break;
                                    case 42:
                                        this.f7742.m17806(this.f7761[0].f53006.f20406);
                                        break;
                                    case 43:
                                        this.f7742.m17806(this.f7761[1].f53006.f20406);
                                        break;
                                    case 44:
                                        this.f7742.m17806(this.f7761[2].f53006.f20406);
                                        break;
                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                        this.f7742.m17806(this.f7761[3].f53006.f20406);
                                        break;
                                    case 46:
                                    case 51:
                                    case 52:
                                    case 53:
                                        this.f7742.m17808(2);
                                        this.f7742.m17806(c22004.f69134);
                                        break;
                                    case 47:
                                        this.f7742.m17808(2);
                                        this.f7742.m17806(c22004.f69152);
                                        break;
                                    case 48:
                                        this.f7742.m17808(2);
                                        this.f7742.m17806(c22004.f69165);
                                        break;
                                    case 49:
                                        this.f7742.m17808(2);
                                        this.f7742.m17806(c22004.f69181);
                                        break;
                                    case 50:
                                        this.f7742.m17808(1);
                                        C7690 c7690 = this.f7742;
                                        AbstractC6462 abstractC6462 = c7690.f20158[c7690.f20157 - 1];
                                        C1446.m31704(!abstractC6462.m14777(EnumC11353.BOT));
                                        this.f7742.m17808(1);
                                        C7690 c7691 = this.f7742;
                                        C8374 c8374 = this.f7766;
                                        c7691.m17806(c8374.m19459(c8374.m19455(abstractC6462)));
                                        break;
                                    default:
                                        switch (i) {
                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 67:
                                            case 68:
                                            case 69:
                                            case 70:
                                            case 75:
                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                            case 77:
                                            case 78:
                                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                            case 123:
                                            case C0254q.f1218h /* 125 */:
                                                this.f7742.m17808(1);
                                                break;
                                            case 63:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case 71:
                                            case 72:
                                            case 73:
                                            case 74:
                                            case 88:
                                                this.f7742.m17808(2);
                                                break;
                                            case 79:
                                            case 81:
                                            case 85:
                                            case HRSS1373Polynomial.f81792K /* 86 */:
                                                this.f7742.m17808(3);
                                                break;
                                            case 80:
                                            case 82:
                                                this.f7742.m17808(4);
                                                break;
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                this.f7742.m17808(3);
                                                break;
                                            case 84:
                                                this.f7742.m17808(3);
                                                break;
                                            case 89:
                                                C7690 c7692 = this.f7742;
                                                c7692.m17806(c7692.f20158[c7692.f20157 - 1]);
                                                break;
                                            case 90:
                                                AbstractC6462 abstractC6462M17807 = this.f7742.m17807();
                                                AbstractC6462 abstractC6462M17808 = this.f7742.m17807();
                                                this.f7742.m17806(abstractC6462M17807);
                                                this.f7742.m17806(abstractC6462M17808);
                                                this.f7742.m17806(abstractC6462M17807);
                                                break;
                                            case 91:
                                                AbstractC6462 abstractC6462M17809 = this.f7742.m17807();
                                                C7690 c7693 = this.f7742;
                                                if (c7693.f20158[c7693.f20157 - 1] != null) {
                                                    AbstractC6462 abstractC6462M178010 = c7693.m17807();
                                                    AbstractC6462 abstractC6462M178011 = this.f7742.m17807();
                                                    this.f7742.m17806(abstractC6462M17809);
                                                    this.f7742.m17806(abstractC6462M178011);
                                                    this.f7742.m17806(abstractC6462M178010);
                                                    this.f7742.m17806(abstractC6462M17809);
                                                } else {
                                                    AbstractC6462 abstractC6462M178012 = c7693.m17809();
                                                    this.f7742.m17806(abstractC6462M17809);
                                                    this.f7742.m17806(abstractC6462M178012);
                                                    this.f7742.m17806(abstractC6462M17809);
                                                }
                                                break;
                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                C7690 c7694 = this.f7742;
                                                if (c7694.f20158[c7694.f20157 - 1] != null) {
                                                    AbstractC6462 abstractC6462M178013 = c7694.m17807();
                                                    AbstractC6462 abstractC6462M178014 = this.f7742.m17807();
                                                    this.f7742.m17806(abstractC6462M178014);
                                                    this.f7742.m17806(abstractC6462M178013);
                                                    this.f7742.m17806(abstractC6462M178014);
                                                    this.f7742.m17806(abstractC6462M178013);
                                                } else {
                                                    AbstractC6462 abstractC6462M178015 = c7694.m17809();
                                                    this.f7742.m17806(abstractC6462M178015);
                                                    this.f7742.m17806(abstractC6462M178015);
                                                }
                                                break;
                                            case 93:
                                                C7690 c7695 = this.f7742;
                                                if (c7695.f20158[c7695.f20157 - 1] != null) {
                                                    AbstractC6462 abstractC6462M178016 = c7695.m17807();
                                                    AbstractC6462 abstractC6462M178017 = this.f7742.m17807();
                                                    AbstractC6462 abstractC6462M178018 = this.f7742.m17807();
                                                    this.f7742.m17806(abstractC6462M178017);
                                                    this.f7742.m17806(abstractC6462M178016);
                                                    this.f7742.m17806(abstractC6462M178018);
                                                    this.f7742.m17806(abstractC6462M178017);
                                                    this.f7742.m17806(abstractC6462M178016);
                                                } else {
                                                    AbstractC6462 abstractC6462M178019 = c7695.m17809();
                                                    AbstractC6462 abstractC6462M178020 = this.f7742.m17807();
                                                    this.f7742.m17806(abstractC6462M178019);
                                                    this.f7742.m17806(abstractC6462M178020);
                                                    this.f7742.m17806(abstractC6462M178019);
                                                }
                                                break;
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                C7690 c7696 = this.f7742;
                                                if (c7696.f20158[c7696.f20157 - 1] != null) {
                                                    AbstractC6462 abstractC6462M178021 = c7696.m17807();
                                                    AbstractC6462 abstractC6462M178022 = this.f7742.m17807();
                                                    C7690 c7697 = this.f7742;
                                                    if (c7697.f20158[c7697.f20157 - 1] != null) {
                                                        AbstractC6462 abstractC6462M178023 = c7697.m17807();
                                                        AbstractC6462 abstractC6462M178024 = this.f7742.m17807();
                                                        this.f7742.m17806(abstractC6462M178022);
                                                        this.f7742.m17806(abstractC6462M178021);
                                                        this.f7742.m17806(abstractC6462M178024);
                                                        this.f7742.m17806(abstractC6462M178023);
                                                        this.f7742.m17806(abstractC6462M178022);
                                                        this.f7742.m17806(abstractC6462M178021);
                                                    } else {
                                                        AbstractC6462 abstractC6462M178025 = c7697.m17809();
                                                        this.f7742.m17806(abstractC6462M178022);
                                                        this.f7742.m17806(abstractC6462M178021);
                                                        this.f7742.m17806(abstractC6462M178025);
                                                        this.f7742.m17806(abstractC6462M178022);
                                                        this.f7742.m17806(abstractC6462M178021);
                                                    }
                                                } else {
                                                    AbstractC6462 abstractC6462M178026 = c7696.m17809();
                                                    C7690 c7698 = this.f7742;
                                                    if (c7698.f20158[c7698.f20157 - 1] != null) {
                                                        AbstractC6462 abstractC6462M178027 = c7698.m17807();
                                                        AbstractC6462 abstractC6462M178028 = this.f7742.m17807();
                                                        this.f7742.m17806(abstractC6462M178026);
                                                        this.f7742.m17806(abstractC6462M178028);
                                                        this.f7742.m17806(abstractC6462M178027);
                                                        this.f7742.m17806(abstractC6462M178026);
                                                    } else {
                                                        AbstractC6462 abstractC6462M178029 = c7698.m17809();
                                                        this.f7742.m17806(abstractC6462M178026);
                                                        this.f7742.m17806(abstractC6462M178029);
                                                        this.f7742.m17806(abstractC6462M178026);
                                                    }
                                                }
                                                break;
                                            case 95:
                                                AbstractC6462 abstractC6462M178030 = this.f7742.m17807();
                                                AbstractC6462 abstractC6462M178031 = this.f7742.m17807();
                                                this.f7742.m17806(abstractC6462M178030);
                                                this.f7742.m17806(abstractC6462M178031);
                                                break;
                                            case 96:
                                            case 100:
                                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                            case 108:
                                            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                            case 122:
                                            case 124:
                                            case 126:
                                            case 128:
                                            case 130:
                                                this.f7742.m17808(1);
                                                break;
                                            case 97:
                                            case 101:
                                            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                            case 109:
                                            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                            case 127:
                                            case 129:
                                            case 131:
                                                this.f7742.m17808(2);
                                                break;
                                            case 98:
                                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                            case 114:
                                                this.f7742.m17808(1);
                                                break;
                                            case C0254q.f1216f /* 99 */:
                                            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                            case 115:
                                                this.f7742.m17808(2);
                                                break;
                                            case 116:
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                            case 118:
                                            case 119:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 133:
                                                        this.f7742.m17808(1);
                                                        this.f7742.m17806(c22004.f69152);
                                                        break;
                                                    case 134:
                                                        this.f7742.m17808(1);
                                                        this.f7742.m17806(c22004.f69165);
                                                        break;
                                                    case 135:
                                                        this.f7742.m17808(1);
                                                        this.f7742.m17806(c22004.f69181);
                                                        break;
                                                    case 136:
                                                        this.f7742.m17808(2);
                                                        this.f7742.m17806(c22004.f69134);
                                                        break;
                                                    case 137:
                                                        this.f7742.m17808(2);
                                                        this.f7742.m17806(c22004.f69165);
                                                        break;
                                                    case 138:
                                                        this.f7742.m17808(2);
                                                        this.f7742.m17806(c22004.f69181);
                                                        break;
                                                    case 139:
                                                        this.f7742.m17808(1);
                                                        this.f7742.m17806(c22004.f69134);
                                                        break;
                                                    case 140:
                                                        this.f7742.m17808(1);
                                                        this.f7742.m17806(c22004.f69152);
                                                        break;
                                                    case 141:
                                                        this.f7742.m17808(1);
                                                        this.f7742.m17806(c22004.f69181);
                                                        break;
                                                    case 142:
                                                        this.f7742.m17808(2);
                                                        this.f7742.m17806(c22004.f69134);
                                                        break;
                                                    case 143:
                                                        this.f7742.m17808(2);
                                                        this.f7742.m17806(c22004.f69152);
                                                        break;
                                                    case 144:
                                                        this.f7742.m17808(2);
                                                        this.f7742.m17806(c22004.f69165);
                                                        break;
                                                    case 145:
                                                    case 146:
                                                    case 147:
                                                        break;
                                                    case 148:
                                                        this.f7742.m17808(4);
                                                        this.f7742.m17806(c22004.f69134);
                                                        break;
                                                    case 149:
                                                    case 150:
                                                        this.f7742.m17808(2);
                                                        this.f7742.m17806(c22004.f69134);
                                                        break;
                                                    case 151:
                                                    case 152:
                                                        this.f7742.m17808(4);
                                                        this.f7742.m17806(c22004.f69134);
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 169:
                                                                break;
                                                            case 170:
                                                            case 171:
                                                                this.f7742.m17808(1);
                                                                break;
                                                            case 172:
                                                            case 174:
                                                            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                                                                C1446.m31704(this.f7742.f20160 == 0);
                                                                this.f7742.m17808(1);
                                                                break;
                                                            case 173:
                                                            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                                                                C1446.m31704(this.f7742.f20160 == 0);
                                                                this.f7742.m17808(2);
                                                                break;
                                                            case 177:
                                                                C1446.m31704(this.f7742.f20160 == 0);
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 194:
                                                                    case 195:
                                                                        this.f7742.m17808(1);
                                                                        break;
                                                                    case 196:
                                                                        return;
                                                                    default:
                                                                        throw new AssertionError(C5008.f11448[i]);
                                                                }
                                                                break;
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
                        this.f7742.m17808(1);
                    }
                    this.f7735 = false;
                }
            } else {
                this.f7735 = false;
            }
            m7053();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7042(int i, int i2, InterfaceC10057 interfaceC10057) {
        m7031(i);
        if (this.f7735) {
            m7028(i2);
            if (i == 16) {
                this.f7742.m17806(this.f7750.f69134);
            } else if (i == 18) {
                this.f7742.m17806(this.f7766.m19431(interfaceC10057));
            } else {
                throw new AssertionError(C5008.f11448[i]);
            }
            m7053();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7040(int i, int i2) {
        if (i2 > 255) {
            m7031(196);
            m7031(i);
            m7026(i2);
        } else {
            m7031(i);
            m7028(i2);
        }
        if (this.f7735) {
            if (i != 169) {
                C22004 c22004 = this.f7750;
                switch (i) {
                    case 21:
                        this.f7742.m17806(c22004.f69134);
                        break;
                    case 22:
                        this.f7742.m17806(c22004.f69152);
                        break;
                    case 23:
                        this.f7742.m17806(c22004.f69165);
                        break;
                    case 24:
                        this.f7742.m17806(c22004.f69181);
                        break;
                    case 25:
                        this.f7742.m17806(this.f7761[i2].f53006.f20406);
                        break;
                    default:
                        switch (i) {
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            case 56:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f7742.m17808(1);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            case 57:
                                this.f7742.m17808(2);
                                break;
                            default:
                                throw new AssertionError(C5008.f11448[i]);
                        }
                        break;
                }
            } else {
                this.f7735 = false;
            }
            m7053();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7056(int i, int i2) {
        if (i > 255 || i2 < -128 || i2 > 127) {
            m7031(196);
            m7031(132);
            m7026(i);
            m7026(i2);
            return;
        }
        m7031(132);
        m7028(i);
        m7028(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7043(int i, int i2, InterfaceC22798 interfaceC22798) {
        m7031(i);
        if (this.f7735) {
            m7026(i2);
            C22004 c22004 = this.f7750;
            if (i == 17) {
                this.f7742.m17806(c22004.f69134);
                return;
            }
            C8374 c8374 = this.f7766;
            if (i == 187) {
                this.f7742.m17806(C18083.m41135(this.f7759 - 3, ((AbstractC6462) interfaceC22798).f16705.mo18010(c8374)));
                return;
            }
            if (i == 19) {
                this.f7742.m17806(c8374.m19431((InterfaceC10057) interfaceC22798));
                return;
            }
            if (i == 20) {
                this.f7742.m17806(c8374.m19431((InterfaceC10057) interfaceC22798));
                return;
            }
            if (i == 192) {
                this.f7742.m17808(1);
                this.f7742.m17806(c8374.m19459((AbstractC6462) interfaceC22798));
                return;
            }
            if (i != 193) {
                if (i != 198 && i != 199) {
                    switch (i) {
                        case 153:
                        case EnumC19222.f57460 /* 154 */:
                        case 155:
                        case 156:
                        case 157:
                        case 158:
                            break;
                        case 159:
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                        case 161:
                        case 162:
                        case 163:
                        case 164:
                        case 165:
                        case 166:
                            this.f7742.m17808(2);
                            return;
                        case 167:
                            this.f7735 = false;
                            return;
                        case 168:
                            return;
                        default:
                            switch (i) {
                                case 178:
                                    this.f7742.m17806(((AbstractC7783) interfaceC22798).mo18010(c8374));
                                    return;
                                case 179:
                                    C7690 c7690 = this.f7742;
                                    AbstractC6462 abstractC6462Mo18010 = ((AbstractC7783) interfaceC22798).mo18010(c8374);
                                    c7690.getClass();
                                    c7690.m17808(m7029(abstractC6462Mo18010));
                                    return;
                                case 180:
                                    this.f7742.m17808(1);
                                    this.f7742.m17806(((AbstractC7783) interfaceC22798).mo18010(c8374));
                                    return;
                                case 181:
                                    C7690 c7691 = this.f7742;
                                    AbstractC6462 abstractC6462Mo18011 = ((AbstractC7783) interfaceC22798).mo18010(c8374);
                                    c7691.getClass();
                                    c7691.m17808(m7029(abstractC6462Mo18011));
                                    this.f7742.m17808(1);
                                    return;
                                default:
                                    throw new AssertionError(C5008.f11448[i]);
                            }
                    }
                }
                this.f7742.m17808(1);
                return;
            }
            this.f7742.m17808(1);
            this.f7742.m17806(c22004.f69134);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7067(int i) {
        m7031(i);
        if (this.f7735) {
            m7055(0);
            if (i == 200) {
                this.f7735 = false;
            } else if (i != 201) {
                throw new AssertionError(C5008.f11448[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7039() {
        if (this.f7735) {
            while (this.f7759 % 4 != 0) {
                m7062(0);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m7032(int i, int i2) {
        this.f7757[i] = (byte) i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7063(int i, int i2) {
        m7032(i, i2 >> 24);
        m7032(i + 1, i2 >> 16);
        m7032(i + 2, i2 >> 8);
        m7032(i + 3, i2);
    }

    /* JADX INFO: renamed from: ۖ */
    private int m7024(int i) {
        return this.f7757[i] & 255;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m7059(int i) {
        return m7024(i + 3) | (m7024(i) << 24) | (m7024(i + 1) << 16) | (m7024(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m7069() {
        return this.f7735 || this.f7764 != null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m7060() {
        this.f7735 = false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m7061() {
        int iM7054 = m7054();
        this.f7735 = true;
        this.f7765 = this.f7745;
        return iM7054;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7035(C7690 c7690) {
        int iM7054 = m7054();
        this.f7735 = true;
        C7690 c7690M17803 = c7690.m17803();
        m7046(c7690M17803.f20161);
        this.f7742 = c7690M17803;
        C1446.m31704(c7690.f20157 <= this.f7741);
        if (this.f7754) {
            System.err.println("entry point " + c7690);
        }
        this.f7765 = this.f7745;
        return iM7054;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7036(C7690 c7690, AbstractC6462 abstractC6462) {
        int iM7054 = m7054();
        this.f7735 = true;
        C7690 c7690M17803 = c7690.m17803();
        m7046(c7690M17803.f20161);
        this.f7742 = c7690M17803;
        C1446.m31704(c7690.f20157 <= this.f7741);
        this.f7742.m17806(abstractC6462);
        if (this.f7754) {
            System.err.println("entry point " + c7690);
        }
        this.f7765 = this.f7745;
        return iM7054;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m7052(int i) {
        int i2 = this.f7756;
        this.f7756 = i;
        return i2;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m7066() {
        return !this.f7735 || this.f7742.f20157 == this.f7756;
    }

    /* JADX INFO: renamed from: ۢ */
    private int m7027() {
        C17747 c17747;
        int i = this.f7733;
        while (true) {
            i--;
            if (i < 0) {
                return 0;
            }
            if (this.f7742.f20161.m22915(i) && (c17747 = this.f7761[i]) != null) {
                return m7029(c17747.f53006.mo18010(this.f7766)) + i;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11714 m7038(int i) {
        C11714 c11714;
        int i2;
        if (i == 167) {
            c11714 = this.f7764;
            this.f7764 = null;
        } else {
            c11714 = null;
        }
        if (i == 168 || !m7069()) {
            return c11714;
        }
        if (!this.f7767) {
            m7043(i, 0, (InterfaceC22798) null);
            i2 = this.f7759 - 3;
        } else {
            if (i != 167 && i != 168) {
                m7043(m7025(i), 8, (InterfaceC22798) null);
                m7067(200);
                this.f7735 = true;
                this.f7765 = this.f7745;
            } else {
                m7067(i + 33);
            }
            i2 = this.f7759 - 5;
        }
        C11714 c11715 = new C11714(i2, c11714, this.f7742.m17803());
        this.f7743 = this.f7767;
        if (i == 167) {
            this.f7735 = false;
        }
        return c11715;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7050(C11714 c11714, int i) {
        int i2;
        char c;
        C7690 c7690 = this.f7742;
        boolean z = false;
        while (c11714 != null) {
            C11714 c11715 = c11714.f32668;
            int i3 = c11714.f32669;
            C7690 c7691 = c11714.f32670;
            C1446.m31704(this.f7742 != c7691 && (i > i3 || m7066()));
            int i4 = this.f7759;
            if (i >= i4) {
                i = i4;
            } else if (m7024(i) == 167) {
                i += this.f7767 ? m7059(i + 1) : (m7024(i + 1) << 8) | m7024(i + 2);
            }
            if (m7024(i3) == 167 && i3 + 3 == i && i == (i2 = this.f7759) && !this.f7743) {
                if (this.f7736) {
                    for (C17747 c17747 : this.f7761) {
                        if (c17747 != null) {
                            for (C11043 c11043 : c17747.f53004) {
                                char c2 = c11043.f30588;
                                if (c2 != 65535 && (c = c11043.f30587) != 65535 && c2 + c >= i2) {
                                    c11043.f30587 = (char) (c - 3);
                                }
                            }
                        }
                    }
                }
                this.f7759 -= 3;
                i -= 3;
                if (c11715 == null) {
                    this.f7735 = true;
                    break;
                }
            } else {
                if (this.f7767) {
                    m7063(i3 + 1, i - i3);
                } else {
                    int i5 = i - i3;
                    if (i5 >= -32768 && i5 <= 32767) {
                        m7032(i3 + 1, i5 >> 8);
                        m7032(i3 + 2, i5);
                    } else {
                        this.f7767 = true;
                    }
                }
                C1446.m31704(!this.f7735 || (c7691.f20157 == c7690.f20157 && c7691.f20160 == c7690.f20160));
            }
            this.f7743 = true;
            if (this.f7759 == i) {
                if (this.f7754) {
                    System.err.println("resolving chain state=" + c7691);
                }
                if (!this.f7735) {
                    this.f7735 = true;
                } else {
                    C8374 c8374 = c7691.f20159.f7766;
                    c7691.f20161.m22903(c7690.f20161);
                    C1446.m31704(c7691.f20157 == c7690.f20157 && c7691.f20160 == c7690.f20160);
                    int i6 = 0;
                    while (i6 < c7691.f20157) {
                        AbstractC6462 abstractC6462 = c7691.f20158[i6];
                        AbstractC6462 abstractC6463 = c7690.f20158[i6];
                        if (abstractC6462 != abstractC6463) {
                            if (c8374.m19486(abstractC6462, abstractC6463, true)) {
                                abstractC6462 = abstractC6463;
                            } else if (!c8374.m19486(abstractC6463, abstractC6462, true)) {
                                throw new AssertionError("inconsistent stack types at join point");
                            }
                        }
                        int iM7029 = m7029(abstractC6462);
                        AbstractC6462[] abstractC6462Arr = c7691.f20158;
                        abstractC6462Arr[i6] = abstractC6462;
                        if (iM7029 == 2) {
                            C1446.m31706(abstractC6462Arr[i6 + 1]);
                        }
                        i6 += iM7029;
                    }
                }
                c7690 = c7691;
                z = true;
            }
            c11714 = c11715;
        }
        C1446.m31704((z && this.f7742 == c7690) ? false : true);
        if (this.f7742 != c7690) {
            m7046(c7690.f20161);
            this.f7742 = c7690;
            this.f7765 = this.f7745;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7045(AbstractC7783 abstractC7783, C12497 c12497) {
        int iM7019 = m7019(c12497.f35030);
        m7031(185);
        if (this.f7735) {
            m7026(C14750.m33698(this.f7740.f39897, abstractC7783));
            int i = iM7019 + 1;
            m7028(i);
            m7028(0);
            this.f7742.m17808(i);
            this.f7742.m17806(c12497.mo14787());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7048(C11136 c11136, C12497 c12497) {
        int iM7019 = m7019(c12497.f35030);
        m7031(186);
        if (this.f7735) {
            m7026(C14750.m33698(this.f7740.f39897, c11136));
            m7026(0);
            this.f7742.m17808(iM7019);
            this.f7742.m17806(c12497.mo14787());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7058(AbstractC7783 abstractC7783, C12497 c12497) {
        int iM7019 = m7019(c12497.f35030);
        m7031(183);
        if (this.f7735) {
            m7026(C14750.m33698(this.f7740.f39897, abstractC7783));
            this.f7742.m17808(iM7019);
            if (abstractC7783.m17994()) {
                C7690 c7690 = this.f7742;
                C18083 c18083 = (C18083) c7690.f20158[c7690.f20157 - 1];
                C3666 c3666 = c7690.f20159;
                AbstractC6462 abstractC6462 = c18083.f16992;
                int i = 0;
                for (int i2 = 0; i2 < c7690.f20157; i2++) {
                    AbstractC6462[] abstractC6462Arr = c7690.f20158;
                    if (abstractC6462Arr[i2] == c18083) {
                        abstractC6462Arr[i2] = abstractC6462;
                    }
                }
                while (true) {
                    C17747[] c17747Arr = c3666.f7761;
                    if (i >= c17747Arr.length) {
                        break;
                    }
                    C17747 c17747 = c17747Arr[i];
                    if (c17747 != null) {
                        C13818 c13818 = c17747.f53006;
                        if (c13818.f20406 == c18083) {
                            C13818 c13818Mo9256 = c13818.mo9256(c13818.f20407);
                            c13818Mo9256.f20406 = abstractC6462;
                            C17747[] c17747Arr2 = c3666.f7761;
                            C17747 c17748 = new C17747(c13818Mo9256);
                            c17747Arr2[i] = c17748;
                            c17748.f53004 = c17747.f53004;
                        }
                    }
                    i++;
                }
            }
            this.f7742.m17808(1);
            this.f7742.m17806(c12497.mo14787());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7064(AbstractC7783 abstractC7783, C12497 c12497) {
        int iM7019 = m7019(c12497.f35030);
        m7031(184);
        if (this.f7735) {
            m7026(C14750.m33698(this.f7740.f39897, abstractC7783));
            this.f7742.m17808(iM7019);
            this.f7742.m17806(c12497.mo14787());
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7068(AbstractC7783 abstractC7783, C12497 c12497) {
        int iM7019 = m7019(c12497.f35030);
        m7031(182);
        if (this.f7735) {
            m7026(C14750.m33698(this.f7740.f39897, abstractC7783));
            this.f7742.m17808(iM7019 + 1);
            this.f7742.m17806(c12497.mo14787());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX INFO: renamed from: ֫ */
    public final void m7049(C11714 c11714) {
        boolean z;
        if (!this.f7735 || c11714 == null) {
            z = true;
        } else {
            C7690 c7690 = this.f7742;
            int i = c7690.f20157;
            C7690 c7691 = c11714.f32670;
            if (i == c7691.f20157 && c7690.f20160 == c7691.f20160) {
                z = true;
            } else {
                z = false;
            }
        }
        C1446.m31704(z);
        this.f7764 = m7021(c11714, this.f7764);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m7070() {
        C11714 c11714 = this.f7764;
        this.f7764 = null;
        m7050(c11714, this.f7759);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11714 m7021(C11714 c11714, C11714 c11715) {
        if (c11715 == null) {
            return c11714;
        }
        C7690 c7690 = c11715.f32670;
        if (c11714 == null) {
            return c11715;
        }
        C7690 c7691 = c11714.f32670;
        C1446.m31704(c7691.f20157 == c7690.f20157 && c7691.f20160 == c7690.f20160);
        int i = c11714.f32669;
        int i2 = c11715.f32669;
        if (i < i2) {
            return new C11714(i2, m7021(c11714, c11715.f32668), c7690);
        }
        return new C11714(i, m7021(c11714.f32668, c11715), c7691);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m7071(int i) {
        if (i != -1) {
            this.f7762 = i;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m7072() {
        boolean z;
        if (this.f7735 && (z = this.f7737)) {
            int iMo22240 = this.f7760.mo22240(this.f7762);
            int i = this.f7759;
            char c = (char) i;
            char c2 = (char) iMo22240;
            if (c == i && c2 == iMo22240 && z) {
                if (this.f7739.m10293()) {
                    C4848 c4848 = this.f7739;
                    if (((char[]) c4848.f11034)[0] == c) {
                        this.f7739 = c4848.f11035;
                    }
                }
                if (this.f7739.isEmpty() || ((char[]) this.f7739.f11034)[1] != c2) {
                    this.f7739 = this.f7739.m10290(new char[]{c, c2});
                }
            }
        }
        this.f7762 = -1;
    }

    static {
        new C9262(EnumC11353.INT);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7046(C9820 c9820) {
        C9820 c9821;
        C17747 c17747;
        if (!this.f7735 || c9820 == (c9821 = this.f7742.f20161)) {
            return;
        }
        C9820 c9822 = new C9820(c9821);
        c9822.m22908(c9820);
        for (int iM22912 = c9822.m22912(0); iM22912 >= 0; iM22912 = c9822.m22912(iM22912 + 1)) {
            if (iM22912 >= this.f7755) {
                this.f7742.f20161.m22901(iM22912);
            } else if (!this.f7742.f20161.m22915(iM22912)) {
                m7073(iM22912);
            } else {
                this.f7742.f20161.m22901(iM22912);
                C17747[] c17747Arr = this.f7761;
                if (iM22912 < c17747Arr.length && (c17747 = c17747Arr[iM22912]) != null && c17747.m40330()) {
                    C17747 c17748 = this.f7761[iM22912];
                    char cM7054 = (char) (m7054() - c17748.m40331().f30588);
                    if (cM7054 >= 65535) {
                        C11043 c11043M40331 = c17748.m40331();
                        if (c11043M40331 != null) {
                            c17748.f53004.remove(c11043M40331);
                        }
                    } else {
                        this.f7761[iM22912] = new C17747(c17748.f53006);
                        if (!c17748.m40330() || cM7054 <= 0) {
                            C11043 c11043M40332 = c17748.m40331();
                            if (c11043M40332 != null) {
                                c17748.f53004.remove(c11043M40332);
                            }
                        } else {
                            C11043 c11043M40333 = c17748.m40331();
                            if (c11043M40333 != null && c11043M40333.f30587 == 65535) {
                                c11043M40333.f30587 = cM7054;
                            }
                        }
                        m7051(c17748);
                        m7030(c17748);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m7073(int i) {
        C17747 c17747 = this.f7761[i];
        if (c17747 == null) {
            this.f7742.f20161.m22901(i);
            return;
        }
        this.f7742.f20161.m22910(i);
        int i2 = this.f7759;
        if (i2 < 65535) {
            char c = (char) i2;
            if (!c17747.f53004.isEmpty() && c17747.m40331().f30587 == 65535) {
                return;
            }
            List list = c17747.f53004;
            C11043 c11043 = new C11043();
            c11043.f30587 = (char) 65535;
            c11043.f30588 = c;
            list.add(c11043);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m7030(final C17747 c17747) {
        C13818 c13818 = c17747.f53006;
        if (c13818 == null || c13818.m31485() || !c13818.m18026()) {
            return;
        }
        C11043[] c11043Arr = (C11043[]) C7480.stream(c17747.f53004).filter(new C19760()).toArray(new C19089());
        if (c11043Arr.length == 0) {
            return;
        }
        int[] array = C23573.stream(c11043Arr).mapToInt(new C16406()).toArray();
        int[] array2 = C23573.stream(c11043Arr).mapToInt(new C25124()).toArray();
        int[] array3 = C23573.stream(c11043Arr).mapToInt(new ToIntFunction() { // from class: l.ۜ᩷۠
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return c17747.f53005;
            }
        }).toArray();
        Iterator it = c13818.mo18000().iterator();
        while (it.hasNext()) {
            C11827 c11827 = ((C8552) it.next()).f53587;
            c11827.f33004 = m7023(c11827.f33004, array);
            c11827.f33014 = m7023(c11827.f33014, array2);
            c11827.f33008 = m7023(c11827.f33008, array3);
            c11827.f33012 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m7023(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2;
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7051(C17747 c17747) {
        C13818 c13818 = c17747.f53006;
        if (this.f7736 || (c13818.m31485() && c13818.m18026())) {
            if ((c13818.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || !((c13818.f20407.mo18003() & 562949953421312L) == 0 || (c13818.f20409 & 8589934592L) == 0)) {
                C17747[] c17747Arr = this.f7753;
                if (c17747Arr == null) {
                    this.f7753 = new C17747[20];
                } else {
                    this.f7753 = (C17747[]) C8377.m19515(this.f7744, c17747Arr);
                }
                C17747[] c17747Arr2 = this.f7753;
                int i = this.f7744;
                this.f7744 = i + 1;
                c17747Arr2[i] = c17747;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7037(C13818 c13818) {
        int iM7020 = m7020(c13818.mo18010(this.f7766));
        int i = this.f7755;
        int iM7034 = m7034(iM7020) + i;
        this.f7755 = iM7034;
        if (iM7034 > this.f7733) {
            this.f7733 = iM7034;
        }
        c13818.f39049 = i;
        C17747[] c17747Arr = (C17747[]) C8377.m19515(i + 1, this.f7761);
        this.f7761 = c17747Arr;
        C1446.m31706(c17747Arr[i]);
        if (this.f7764 != null) {
            m7070();
        }
        this.f7761[i] = new C17747(c13818);
        this.f7742.f20161.m22901(i);
        return i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m7065(int i) {
        char cM7054;
        int i2 = this.f7755;
        this.f7755 = i;
        while (i < i2) {
            C17747 c17747 = this.f7761[i];
            if (c17747 != null) {
                if (c17747.m40330() && (cM7054 = (char) (m7054() - c17747.m40331().f30588)) < 65535) {
                    if (!c17747.m40330() || cM7054 <= 0) {
                        C11043 c11043M40331 = c17747.m40331();
                        if (c11043M40331 != null) {
                            c17747.f53004.remove(c11043M40331);
                        }
                    } else {
                        C11043 c11043M40332 = c17747.m40331();
                        if (c11043M40332 != null && c11043M40332.f30587 == 65535) {
                            c11043M40332.f30587 = cM7054;
                        }
                    }
                    m7051(c17747);
                    m7030(c17747);
                }
                this.f7761[i] = null;
            }
            this.f7742.f20161.m22901(i);
            i++;
        }
    }
}
