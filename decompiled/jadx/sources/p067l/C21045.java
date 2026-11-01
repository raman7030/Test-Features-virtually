package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩵ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21045 extends AbstractC6962 {

    /* JADX INFO: renamed from: ֡ */
    public long f66039;

    /* JADX INFO: renamed from: ֨ */
    public final int f66040;

    /* JADX INFO: renamed from: ۚ */
    public List f66044;

    /* JADX INFO: renamed from: ۜ */
    public int f66045;

    /* JADX INFO: renamed from: ۠ */
    public byte f66046;

    /* JADX INFO: renamed from: ܶ */
    public byte f66049;

    /* JADX INFO: renamed from: ܺ */
    public List f66050;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f66051;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f66052;

    /* JADX INFO: renamed from: ᩶ */
    public final int f66053;

    /* JADX INFO: renamed from: ᩷ */
    public int f66054;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f66055;

    /* JADX INFO: renamed from: ᩹ */
    public final int f66056;

    /* JADX INFO: renamed from: ۤ */
    public static final int[] f66033 = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: ۬ */
    public static final int[] f66036 = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: ܰ */
    public static final int[] f66037 = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: ۗ */
    public static final int[] f66031 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, IShizukuService.Stub.TRANSACTION_attachUserService, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, IShizukuService.Stub.TRANSACTION_isHidden, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, IShizukuService.Stub.TRANSACTION_getFlagsForUid, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 108, 109, UMErrorCode.E_UM_BE_JSON_FAILED, UMErrorCode.E_UM_BE_CREATE_FAILED, UMErrorCode.E_UM_BE_DEFLATE_FAILED, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 114, 115, 116, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 118, 119, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: ۛ */
    public static final int[] f66032 = {174, PicnicEngine.MAX_AUX_BYTES, 189, 191, 8482, 162, 163, 9834, BERTags.FLAGS, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: ۨ */
    public static final int[] f66034 = {193, 201, Primes.SMALL_FACTOR_LIMIT, 218, 220, 252, 8216, 161, 42, 39, C0719o.a.f2891C, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 249, 219, 171, 187};

    /* JADX INFO: renamed from: ᩺ */
    public static final int[] f66038 = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, C0254q.f1218h, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: ۫ */
    public static final boolean[] f66035 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: ۢ */
    public final C19203 f66048 = new C19203();

    /* JADX INFO: renamed from: ۡ */
    public final ArrayList f66047 = new ArrayList();

    /* JADX INFO: renamed from: ۘ */
    public C20374 f66042 = new C20374(0, 4);

    /* JADX INFO: renamed from: ۖ */
    public int f66041 = 0;

    /* JADX INFO: renamed from: ۙ */
    public final long f66043 = 16000000;

    @Override // p067l.InterfaceC3681
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ֫ */
    public final void mo12() {
    }

    public C21045(String str, int i) {
        this.f66040 = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f66056 = 0;
            this.f66053 = 0;
        } else if (i == 2) {
            this.f66056 = 1;
            this.f66053 = 0;
        } else if (i == 3) {
            this.f66056 = 0;
            this.f66053 = 1;
        } else if (i == 4) {
            this.f66056 = 1;
            this.f66053 = 1;
        } else {
            C21334.m48351("Invalid channel. Defaulting to CC1.");
            this.f66056 = 0;
            this.f66053 = 0;
        }
        m47464(0);
        m47466();
        this.f66052 = true;
        this.f66039 = -9223372036854775807L;
    }

    @Override // p067l.AbstractC6962, p067l.InterfaceC3681
    public final void flush() {
        super.flush();
        this.f66050 = null;
        this.f66044 = null;
        m47464(0);
        this.f66054 = 4;
        this.f66042.m45998(4);
        m47466();
        this.f66051 = false;
        this.f66055 = false;
        this.f66046 = (byte) 0;
        this.f66049 = (byte) 0;
        this.f66041 = 0;
        this.f66052 = true;
        this.f66039 = -9223372036854775807L;
    }

    @Override // p067l.AbstractC6962, p067l.InterfaceC3681
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC19032 mo7101() {
        AbstractC19032 abstractC19032M15956;
        AbstractC19032 abstractC19032Mo7101 = super.mo7101();
        if (abstractC19032Mo7101 != null) {
            return abstractC19032Mo7101;
        }
        long j = this.f66043;
        if (j == -9223372036854775807L || this.f66039 == -9223372036854775807L || m15955() - this.f66039 < j || (abstractC19032M15956 = m15956()) == null) {
            return null;
        }
        this.f66050 = Collections.EMPTY_LIST;
        this.f66039 = -9223372036854775807L;
        abstractC19032M15956.m43231(m15955(), mo15957(), C14849.FOREVER_NS);
        return abstractC19032M15956;
    }

    @Override // p067l.AbstractC6962
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo15958() {
        return this.f66050 != this.f66044;
    }

    @Override // p067l.AbstractC6962
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15266 mo15957() {
        List list = this.f66050;
        this.f66044 = list;
        list.getClass();
        return new C5621(list);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0187  */
    /* JADX WARN: Code duplicated, block: B:121:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x019e  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01da  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0200  */
    /* JADX WARN: Code duplicated, block: B:151:0x0204  */
    /* JADX WARN: Code duplicated, block: B:152:0x020a  */
    /* JADX WARN: Code duplicated, block: B:153:0x020e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0212  */
    /* JADX WARN: Code duplicated, block: B:156:0x0223  */
    /* JADX WARN: Code duplicated, block: B:175:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x011e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0122  */
    @Override // p067l.AbstractC6962
    /* JADX INFO: renamed from: ֫ */
    public final void mo15954(C19703 c19703) {
        boolean z;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer byteBuffer = c19703.f72704;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C19203 c19203 = this.f66048;
        c19203.m43708(iLimit, bArrArray);
        boolean z2 = false;
        while (true) {
            int iM43703 = c19203.m43703();
            int i6 = this.f66040;
            if (iM43703 < i6) {
                if (z2) {
                    int i7 = this.f66045;
                    if (i7 == 1 || i7 == 3) {
                        this.f66050 = m47467();
                        this.f66039 = m15955();
                        return;
                    }
                    return;
                }
                return;
            }
            int iM43702 = i6 == 2 ? -4 : c19203.m43702();
            int iM43704 = c19203.m43702();
            int iM43705 = c19203.m43702();
            if ((iM43702 & 2) == 0 && (iM43702 & 1) == this.f66053) {
                byte b = (byte) (iM43704 & 127);
                byte b2 = (byte) (iM43705 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.f66051;
                    if ((iM43702 & 4) == 4) {
                        boolean[] zArr = f66035;
                        if (zArr[iM43704] && zArr[iM43705]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.f66051 = z;
                    if (z && (b & 240) == 16) {
                        if (this.f66055 && this.f66046 == b && this.f66049 == b2) {
                            this.f66055 = false;
                        } else {
                            this.f66055 = true;
                            this.f66046 = b;
                            this.f66049 = b2;
                            if (!z) {
                                if (1 > b) {
                                    if ((b & 246) == 20) {
                                        if (b2 == 32) {
                                            this.f66052 = true;
                                        } else {
                                            this.f66052 = true;
                                        }
                                    }
                                } else if ((b & 246) == 20) {
                                    if (b2 == 32) {
                                        this.f66052 = true;
                                    } else {
                                        this.f66052 = true;
                                    }
                                }
                                if (this.f66052) {
                                    i = b & C0684bo.f2506k;
                                    if (i == 0) {
                                        this.f66041 = (b >> 3) & 1;
                                    }
                                    if (this.f66041 != this.f66056) {
                                        if (i == 0) {
                                            i2 = b & 247;
                                            if (i2 == 17) {
                                                i3 = b & 246;
                                                if (i3 != 18) {
                                                    if (i2 != 17) {
                                                        if ((b & 240) != 16) {
                                                            if (i2 != 23) {
                                                                if (i3 == 20) {
                                                                    if (b2 == 32) {
                                                                        m47464(2);
                                                                    } else if (b2 != 41) {
                                                                        switch (b2) {
                                                                            case 37:
                                                                                m47464(1);
                                                                                this.f66054 = 2;
                                                                                this.f66042.m45998(2);
                                                                                break;
                                                                            case 38:
                                                                                m47464(1);
                                                                                this.f66054 = 3;
                                                                                this.f66042.m45998(3);
                                                                                break;
                                                                            case 39:
                                                                                m47464(1);
                                                                                this.f66054 = 4;
                                                                                this.f66042.m45998(4);
                                                                                break;
                                                                            default:
                                                                                i4 = this.f66045;
                                                                                if (i4 != 0) {
                                                                                    if (b2 != 33) {
                                                                                        switch (b2) {
                                                                                            case 44:
                                                                                                this.f66050 = Collections.EMPTY_LIST;
                                                                                                if (i4 != 1) {
                                                                                                    m47466();
                                                                                                } else {
                                                                                                    m47466();
                                                                                                }
                                                                                                break;
                                                                                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                                if (i4 == 1) {
                                                                                                    this.f66042.m45996();
                                                                                                }
                                                                                                break;
                                                                                            case 46:
                                                                                                m47466();
                                                                                                break;
                                                                                            case 47:
                                                                                                this.f66050 = m47467();
                                                                                                m47466();
                                                                                                break;
                                                                                        }
                                                                                    } else {
                                                                                        this.f66042.m45991();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        m47464(3);
                                                                    }
                                                                }
                                                            } else if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m47464(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m47464(1);
                                                                            this.f66054 = 2;
                                                                            this.f66042.m45998(2);
                                                                            break;
                                                                        case 38:
                                                                            m47464(1);
                                                                            this.f66054 = 3;
                                                                            this.f66042.m45998(3);
                                                                            break;
                                                                        case 39:
                                                                            m47464(1);
                                                                            this.f66054 = 4;
                                                                            this.f66042.m45998(4);
                                                                            break;
                                                                        default:
                                                                            i4 = this.f66045;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f66050 = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m47466();
                                                                                            } else {
                                                                                                m47466();
                                                                                            }
                                                                                            break;
                                                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                this.f66042.m45996();
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m47466();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f66050 = m47467();
                                                                                            m47466();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f66042.m45991();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m47464(3);
                                                                }
                                                            }
                                                        } else if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m47464(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m47464(1);
                                                                            this.f66054 = 2;
                                                                            this.f66042.m45998(2);
                                                                            break;
                                                                        case 38:
                                                                            m47464(1);
                                                                            this.f66054 = 3;
                                                                            this.f66042.m45998(3);
                                                                            break;
                                                                        case 39:
                                                                            m47464(1);
                                                                            this.f66054 = 4;
                                                                            this.f66042.m45998(4);
                                                                            break;
                                                                        default:
                                                                            i4 = this.f66045;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f66050 = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m47466();
                                                                                            } else {
                                                                                                m47466();
                                                                                            }
                                                                                            break;
                                                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                this.f66042.m45996();
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m47466();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f66050 = m47467();
                                                                                            m47466();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f66042.m45991();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m47464(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m47464(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m47464(1);
                                                                            this.f66054 = 2;
                                                                            this.f66042.m45998(2);
                                                                            break;
                                                                        case 38:
                                                                            m47464(1);
                                                                            this.f66054 = 3;
                                                                            this.f66042.m45998(3);
                                                                            break;
                                                                        case 39:
                                                                            m47464(1);
                                                                            this.f66054 = 4;
                                                                            this.f66042.m45998(4);
                                                                            break;
                                                                        default:
                                                                            i4 = this.f66045;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f66050 = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m47466();
                                                                                            } else {
                                                                                                m47466();
                                                                                            }
                                                                                            break;
                                                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                this.f66042.m45996();
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m47466();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f66050 = m47467();
                                                                                            m47466();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f66042.m45991();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m47464(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m47464(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m47464(1);
                                                                    this.f66054 = 2;
                                                                    this.f66042.m45998(2);
                                                                    break;
                                                                case 38:
                                                                    m47464(1);
                                                                    this.f66054 = 3;
                                                                    this.f66042.m45998(3);
                                                                    break;
                                                                case 39:
                                                                    m47464(1);
                                                                    this.f66054 = 4;
                                                                    this.f66042.m45998(4);
                                                                    break;
                                                                default:
                                                                    i4 = this.f66045;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f66050 = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m47466();
                                                                                    } else {
                                                                                        m47466();
                                                                                    }
                                                                                    break;
                                                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        this.f66042.m45996();
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m47466();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f66050 = m47467();
                                                                                    m47466();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f66042.m45991();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m47464(3);
                                                        }
                                                    }
                                                } else if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m47464(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m47464(1);
                                                                            this.f66054 = 2;
                                                                            this.f66042.m45998(2);
                                                                            break;
                                                                        case 38:
                                                                            m47464(1);
                                                                            this.f66054 = 3;
                                                                            this.f66042.m45998(3);
                                                                            break;
                                                                        case 39:
                                                                            m47464(1);
                                                                            this.f66054 = 4;
                                                                            this.f66042.m45998(4);
                                                                            break;
                                                                        default:
                                                                            i4 = this.f66045;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f66050 = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m47466();
                                                                                            } else {
                                                                                                m47466();
                                                                                            }
                                                                                            break;
                                                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                this.f66042.m45996();
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m47466();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f66050 = m47467();
                                                                                            m47466();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f66042.m45991();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m47464(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m47464(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m47464(1);
                                                                    this.f66054 = 2;
                                                                    this.f66042.m45998(2);
                                                                    break;
                                                                case 38:
                                                                    m47464(1);
                                                                    this.f66054 = 3;
                                                                    this.f66042.m45998(3);
                                                                    break;
                                                                case 39:
                                                                    m47464(1);
                                                                    this.f66054 = 4;
                                                                    this.f66042.m45998(4);
                                                                    break;
                                                                default:
                                                                    i4 = this.f66045;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f66050 = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m47466();
                                                                                    } else {
                                                                                        m47466();
                                                                                    }
                                                                                    break;
                                                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        this.f66042.m45996();
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m47466();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f66050 = m47467();
                                                                                    m47466();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f66042.m45991();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m47464(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m47464(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m47464(1);
                                                                    this.f66054 = 2;
                                                                    this.f66042.m45998(2);
                                                                    break;
                                                                case 38:
                                                                    m47464(1);
                                                                    this.f66054 = 3;
                                                                    this.f66042.m45998(3);
                                                                    break;
                                                                case 39:
                                                                    m47464(1);
                                                                    this.f66054 = 4;
                                                                    this.f66042.m45998(4);
                                                                    break;
                                                                default:
                                                                    i4 = this.f66045;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f66050 = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m47466();
                                                                                    } else {
                                                                                        m47466();
                                                                                    }
                                                                                    break;
                                                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        this.f66042.m45996();
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m47466();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f66050 = m47467();
                                                                                    m47466();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f66042.m45991();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m47464(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m47464(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m47464(1);
                                                                    this.f66054 = 2;
                                                                    this.f66042.m45998(2);
                                                                    break;
                                                                case 38:
                                                                    m47464(1);
                                                                    this.f66054 = 3;
                                                                    this.f66042.m45998(3);
                                                                    break;
                                                                case 39:
                                                                    m47464(1);
                                                                    this.f66054 = 4;
                                                                    this.f66042.m45998(4);
                                                                    break;
                                                                default:
                                                                    i4 = this.f66045;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f66050 = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m47466();
                                                                                    } else {
                                                                                        m47466();
                                                                                    }
                                                                                    break;
                                                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        this.f66042.m45996();
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m47466();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f66050 = m47467();
                                                                                    m47466();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f66042.m45991();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m47464(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m47464(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m47464(1);
                                                                this.f66054 = 2;
                                                                this.f66042.m45998(2);
                                                                break;
                                                            case 38:
                                                                m47464(1);
                                                                this.f66054 = 3;
                                                                this.f66042.m45998(3);
                                                                break;
                                                            case 39:
                                                                m47464(1);
                                                                this.f66054 = 4;
                                                                this.f66042.m45998(4);
                                                                break;
                                                            default:
                                                                i4 = this.f66045;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f66050 = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m47466();
                                                                                } else {
                                                                                    m47466();
                                                                                }
                                                                                break;
                                                                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    this.f66042.m45996();
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m47466();
                                                                                break;
                                                                            case 47:
                                                                                this.f66050 = m47467();
                                                                                m47466();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f66042.m45991();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m47464(3);
                                                    }
                                                }
                                            } else {
                                                i3 = b & 246;
                                                if (i3 != 18) {
                                                    if (i2 != 17) {
                                                        if ((b & 240) != 16) {
                                                            if (i2 != 23) {
                                                                if (i3 == 20) {
                                                                    if (b2 == 32) {
                                                                        m47464(2);
                                                                    } else if (b2 != 41) {
                                                                        switch (b2) {
                                                                            case 37:
                                                                                m47464(1);
                                                                                this.f66054 = 2;
                                                                                this.f66042.m45998(2);
                                                                                break;
                                                                            case 38:
                                                                                m47464(1);
                                                                                this.f66054 = 3;
                                                                                this.f66042.m45998(3);
                                                                                break;
                                                                            case 39:
                                                                                m47464(1);
                                                                                this.f66054 = 4;
                                                                                this.f66042.m45998(4);
                                                                                break;
                                                                            default:
                                                                                i4 = this.f66045;
                                                                                if (i4 != 0) {
                                                                                    if (b2 != 33) {
                                                                                        switch (b2) {
                                                                                            case 44:
                                                                                                this.f66050 = Collections.EMPTY_LIST;
                                                                                                if (i4 != 1) {
                                                                                                    m47466();
                                                                                                } else {
                                                                                                    m47466();
                                                                                                }
                                                                                                break;
                                                                                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                                if (i4 == 1) {
                                                                                                    this.f66042.m45996();
                                                                                                }
                                                                                                break;
                                                                                            case 46:
                                                                                                m47466();
                                                                                                break;
                                                                                            case 47:
                                                                                                this.f66050 = m47467();
                                                                                                m47466();
                                                                                                break;
                                                                                        }
                                                                                    } else {
                                                                                        this.f66042.m45991();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        m47464(3);
                                                                    }
                                                                }
                                                            } else if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m47464(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m47464(1);
                                                                            this.f66054 = 2;
                                                                            this.f66042.m45998(2);
                                                                            break;
                                                                        case 38:
                                                                            m47464(1);
                                                                            this.f66054 = 3;
                                                                            this.f66042.m45998(3);
                                                                            break;
                                                                        case 39:
                                                                            m47464(1);
                                                                            this.f66054 = 4;
                                                                            this.f66042.m45998(4);
                                                                            break;
                                                                        default:
                                                                            i4 = this.f66045;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f66050 = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m47466();
                                                                                            } else {
                                                                                                m47466();
                                                                                            }
                                                                                            break;
                                                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                this.f66042.m45996();
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m47466();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f66050 = m47467();
                                                                                            m47466();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f66042.m45991();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m47464(3);
                                                                }
                                                            }
                                                        } else if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m47464(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m47464(1);
                                                                            this.f66054 = 2;
                                                                            this.f66042.m45998(2);
                                                                            break;
                                                                        case 38:
                                                                            m47464(1);
                                                                            this.f66054 = 3;
                                                                            this.f66042.m45998(3);
                                                                            break;
                                                                        case 39:
                                                                            m47464(1);
                                                                            this.f66054 = 4;
                                                                            this.f66042.m45998(4);
                                                                            break;
                                                                        default:
                                                                            i4 = this.f66045;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f66050 = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m47466();
                                                                                            } else {
                                                                                                m47466();
                                                                                            }
                                                                                            break;
                                                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                this.f66042.m45996();
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m47466();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f66050 = m47467();
                                                                                            m47466();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f66042.m45991();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m47464(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m47464(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m47464(1);
                                                                            this.f66054 = 2;
                                                                            this.f66042.m45998(2);
                                                                            break;
                                                                        case 38:
                                                                            m47464(1);
                                                                            this.f66054 = 3;
                                                                            this.f66042.m45998(3);
                                                                            break;
                                                                        case 39:
                                                                            m47464(1);
                                                                            this.f66054 = 4;
                                                                            this.f66042.m45998(4);
                                                                            break;
                                                                        default:
                                                                            i4 = this.f66045;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f66050 = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m47466();
                                                                                            } else {
                                                                                                m47466();
                                                                                            }
                                                                                            break;
                                                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                this.f66042.m45996();
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m47466();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f66050 = m47467();
                                                                                            m47466();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f66042.m45991();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m47464(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m47464(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m47464(1);
                                                                    this.f66054 = 2;
                                                                    this.f66042.m45998(2);
                                                                    break;
                                                                case 38:
                                                                    m47464(1);
                                                                    this.f66054 = 3;
                                                                    this.f66042.m45998(3);
                                                                    break;
                                                                case 39:
                                                                    m47464(1);
                                                                    this.f66054 = 4;
                                                                    this.f66042.m45998(4);
                                                                    break;
                                                                default:
                                                                    i4 = this.f66045;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f66050 = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m47466();
                                                                                    } else {
                                                                                        m47466();
                                                                                    }
                                                                                    break;
                                                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        this.f66042.m45996();
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m47466();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f66050 = m47467();
                                                                                    m47466();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f66042.m45991();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m47464(3);
                                                        }
                                                    }
                                                } else if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m47464(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            m47464(1);
                                                                            this.f66054 = 2;
                                                                            this.f66042.m45998(2);
                                                                            break;
                                                                        case 38:
                                                                            m47464(1);
                                                                            this.f66054 = 3;
                                                                            this.f66042.m45998(3);
                                                                            break;
                                                                        case 39:
                                                                            m47464(1);
                                                                            this.f66054 = 4;
                                                                            this.f66042.m45998(4);
                                                                            break;
                                                                        default:
                                                                            i4 = this.f66045;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f66050 = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m47466();
                                                                                            } else {
                                                                                                m47466();
                                                                                            }
                                                                                            break;
                                                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                this.f66042.m45996();
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m47466();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f66050 = m47467();
                                                                                            m47466();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f66042.m45991();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m47464(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m47464(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m47464(1);
                                                                    this.f66054 = 2;
                                                                    this.f66042.m45998(2);
                                                                    break;
                                                                case 38:
                                                                    m47464(1);
                                                                    this.f66054 = 3;
                                                                    this.f66042.m45998(3);
                                                                    break;
                                                                case 39:
                                                                    m47464(1);
                                                                    this.f66054 = 4;
                                                                    this.f66042.m45998(4);
                                                                    break;
                                                                default:
                                                                    i4 = this.f66045;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f66050 = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m47466();
                                                                                    } else {
                                                                                        m47466();
                                                                                    }
                                                                                    break;
                                                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        this.f66042.m45996();
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m47466();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f66050 = m47467();
                                                                                    m47466();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f66042.m45991();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m47464(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m47464(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        m47464(1);
                                                                        this.f66054 = 2;
                                                                        this.f66042.m45998(2);
                                                                        break;
                                                                    case 38:
                                                                        m47464(1);
                                                                        this.f66054 = 3;
                                                                        this.f66042.m45998(3);
                                                                        break;
                                                                    case 39:
                                                                        m47464(1);
                                                                        this.f66054 = 4;
                                                                        this.f66042.m45998(4);
                                                                        break;
                                                                    default:
                                                                        i4 = this.f66045;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f66050 = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m47466();
                                                                                        } else {
                                                                                            m47466();
                                                                                        }
                                                                                        break;
                                                                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            this.f66042.m45996();
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m47466();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f66050 = m47467();
                                                                                        m47466();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f66042.m45991();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m47464(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m47464(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m47464(1);
                                                                    this.f66054 = 2;
                                                                    this.f66042.m45998(2);
                                                                    break;
                                                                case 38:
                                                                    m47464(1);
                                                                    this.f66054 = 3;
                                                                    this.f66042.m45998(3);
                                                                    break;
                                                                case 39:
                                                                    m47464(1);
                                                                    this.f66054 = 4;
                                                                    this.f66042.m45998(4);
                                                                    break;
                                                                default:
                                                                    i4 = this.f66045;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f66050 = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m47466();
                                                                                    } else {
                                                                                        m47466();
                                                                                    }
                                                                                    break;
                                                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        this.f66042.m45996();
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m47466();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f66050 = m47467();
                                                                                    m47466();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f66042.m45991();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m47464(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m47464(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    m47464(1);
                                                                    this.f66054 = 2;
                                                                    this.f66042.m45998(2);
                                                                    break;
                                                                case 38:
                                                                    m47464(1);
                                                                    this.f66054 = 3;
                                                                    this.f66042.m45998(3);
                                                                    break;
                                                                case 39:
                                                                    m47464(1);
                                                                    this.f66054 = 4;
                                                                    this.f66042.m45998(4);
                                                                    break;
                                                                default:
                                                                    i4 = this.f66045;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f66050 = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m47466();
                                                                                    } else {
                                                                                        m47466();
                                                                                    }
                                                                                    break;
                                                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        this.f66042.m45996();
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m47466();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f66050 = m47467();
                                                                                    m47466();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f66042.m45991();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m47464(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m47464(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m47464(1);
                                                                this.f66054 = 2;
                                                                this.f66042.m45998(2);
                                                                break;
                                                            case 38:
                                                                m47464(1);
                                                                this.f66054 = 3;
                                                                this.f66042.m45998(3);
                                                                break;
                                                            case 39:
                                                                m47464(1);
                                                                this.f66054 = 4;
                                                                this.f66042.m45998(4);
                                                                break;
                                                            default:
                                                                i4 = this.f66045;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f66050 = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m47466();
                                                                                } else {
                                                                                    m47466();
                                                                                }
                                                                                break;
                                                                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    this.f66042.m45996();
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m47466();
                                                                                break;
                                                                            case 47:
                                                                                this.f66050 = m47467();
                                                                                m47466();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f66042.m45991();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m47464(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            C20374 c20374 = this.f66042;
                                            int i8 = (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) - 32;
                                            iArr = f66031;
                                            c20374.m45992((char) iArr[i8]);
                                            if ((b2 & C0684bo.f2506k) != 0) {
                                                this.f66042.m45992((char) iArr[(b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) - 32]);
                                            }
                                        }
                                        z2 = true;
                                    }
                                }
                            } else if (z3) {
                                m47466();
                                z2 = true;
                            }
                        }
                    } else {
                        this.f66055 = false;
                        if (!z) {
                            if (1 > b && b <= 15) {
                                this.f66052 = false;
                            } else if ((b & 246) == 20) {
                                if (b2 == 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case 42:
                                                case 43:
                                                    this.f66052 = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f66052 = true;
                                            break;
                                    }
                                } else {
                                    this.f66052 = true;
                                }
                            }
                            if (this.f66052) {
                                i = b & C0684bo.f2506k;
                                if (i == 0) {
                                    this.f66041 = (b >> 3) & 1;
                                }
                                if (this.f66041 != this.f66056) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17 || (b2 & 240) != 48) {
                                            i3 = b & 246;
                                            if (i3 != 18 && (b2 & C0684bo.f2506k) == 32) {
                                                this.f66042.m45991();
                                                C20374 c20375 = this.f66042;
                                                if ((b & 1) == 0) {
                                                    i5 = f66034[b2 & C0684bo.f2505j];
                                                } else {
                                                    i5 = f66038[b2 & C0684bo.f2505j];
                                                }
                                                c20375.m45992((char) i5);
                                            } else if (i2 != 17 && (b2 & 240) == 32) {
                                                this.f66042.m45992(' ');
                                                this.f66042.m45993((b2 >> 1) & 7, (b2 & 1) == 1);
                                            } else if ((b & 240) != 16 && (b2 & 192) == 64) {
                                                int i9 = f66033[b & 7];
                                                if ((b2 & UTF8.S_CS3) != 0) {
                                                    i9++;
                                                }
                                                if (i9 != this.f66042.f62986) {
                                                    if (this.f66045 != 1 && !this.f66042.m45995()) {
                                                        C20374 c20376 = new C20374(this.f66045, this.f66054);
                                                        this.f66042 = c20376;
                                                        this.f66047.add(c20376);
                                                    }
                                                    this.f66042.f62986 = i9;
                                                }
                                                boolean z4 = (b2 & 16) == 16;
                                                int i10 = (b2 >> 1) & 7;
                                                this.f66042.m45993(z4 ? 8 : i10, (b2 & 1) == 1);
                                                if (z4) {
                                                    this.f66042.f62984 = f66036[i10];
                                                }
                                            } else if (i2 != 23 && b2 >= 33 && b2 <= 35) {
                                                this.f66042.f62980 = b2 + C0684bo.f2506k;
                                            } else if (i3 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    m47464(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            m47464(1);
                                                            this.f66054 = 2;
                                                            this.f66042.m45998(2);
                                                            break;
                                                        case 38:
                                                            m47464(1);
                                                            this.f66054 = 3;
                                                            this.f66042.m45998(3);
                                                            break;
                                                        case 39:
                                                            m47464(1);
                                                            this.f66054 = 4;
                                                            this.f66042.m45998(4);
                                                            break;
                                                        default:
                                                            i4 = this.f66045;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f66050 = Collections.EMPTY_LIST;
                                                                            if (i4 != 1 || i4 == 3) {
                                                                                m47466();
                                                                            }
                                                                            break;
                                                                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                                            if (i4 == 1 && !this.f66042.m45995()) {
                                                                                this.f66042.m45996();
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m47466();
                                                                            break;
                                                                        case 47:
                                                                            this.f66050 = m47467();
                                                                            m47466();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f66042.m45991();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m47464(3);
                                                }
                                            }
                                        } else {
                                            this.f66042.m45992((char) f66032[b2 & 15]);
                                        }
                                    } else {
                                        C20374 c20377 = this.f66042;
                                        int i11 = (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) - 32;
                                        iArr = f66031;
                                        c20377.m45992((char) iArr[i11]);
                                        if ((b2 & C0684bo.f2506k) != 0) {
                                            this.f66042.m45992((char) iArr[(b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            m47466();
                            z2 = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private ArrayList m47467() {
        ArrayList arrayList = this.f66047;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            C21196 c21196M45990 = ((C20374) arrayList.get(i)).m45990(Integer.MIN_VALUE);
            arrayList2.add(c21196M45990);
            if (c21196M45990 != null) {
                iMin = Math.min(iMin, c21196M45990.f66628);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C21196 c21196M45991 = (C21196) arrayList2.get(i2);
            if (c21196M45991 != null) {
                if (c21196M45991.f66628 != iMin) {
                    c21196M45991 = ((C20374) arrayList.get(i2)).m45990(iMin);
                    c21196M45991.getClass();
                }
                arrayList3.add(c21196M45991);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47464(int i) {
        int i2 = this.f66045;
        if (i2 == i) {
            return;
        }
        this.f66045 = i;
        if (i != 3) {
            m47466();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f66050 = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f66047;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C20374) arrayList.get(i3)).m45997(i);
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private void m47466() {
        this.f66042.m45994(this.f66045);
        ArrayList arrayList = this.f66047;
        arrayList.clear();
        arrayList.add(this.f66042);
    }
}
