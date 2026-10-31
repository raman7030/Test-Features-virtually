package l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayDeque;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۤܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8RX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10394 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f31262;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31263;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31265;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC6160 f31266;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f31264 = new byte[8];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f31267 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1536 f31268 = new C1536();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26210(InterfaceC6160 interfaceC6160) {
        this.f31266 = interfaceC6160;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26209() {
        this.f31265 = 0;
        this.f31267.clear();
        this.f31268.m5252();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26211(InterfaceC8424 interfaceC8424) throws C9080 {
        int i;
        String str;
        double dLongBitsToDouble;
        int iM5248;
        int iM5249;
        C22632.m50632(this.f31266);
        while (true) {
            ArrayDeque arrayDeque = this.f31267;
            C12510 c12510 = (C12510) arrayDeque.peek();
            if (c12510 != null && interfaceC8424.getPosition() >= c12510.f37578) {
                ((C11805) this.f31266).f35217.m33344(((C12510) arrayDeque.pop()).f37579);
                return true;
            }
            int i2 = this.f31265;
            C1536 c1536 = this.f31268;
            if (i2 == 0) {
                long jM5251 = c1536.m5251(interfaceC8424, true, false, 4);
                if (jM5251 == -2) {
                    interfaceC8424.mo22066();
                    while (true) {
                        byte[] bArr = this.f31264;
                        interfaceC8424.mo22061(0, 4, bArr);
                        iM5248 = C1536.m5248(bArr[0]);
                        if (iM5248 != -1 && iM5248 <= 4) {
                            iM5249 = (int) C1536.m5249(bArr, iM5248, false);
                            C13920 c13920 = ((C11805) this.f31266).f35217;
                            if (iM5249 == 357149030 || iM5249 == 524531317 || iM5249 == 475249515 || iM5249 == 374648427) {
                            }
                        }
                        interfaceC8424.mo22070(1);
                    }
                    interfaceC8424.mo22070(iM5248);
                    jM5251 = iM5249;
                }
                if (jM5251 == -1) {
                    return false;
                }
                this.f31263 = (int) jM5251;
                this.f31265 = 1;
            }
            if (this.f31265 == 1) {
                this.f31262 = c1536.m5251(interfaceC8424, false, true, 8);
                this.f31265 = 2;
            }
            InterfaceC6160 interfaceC6160 = this.f31266;
            int i3 = this.f31263;
            C13920 c13921 = ((C11805) interfaceC6160).f35217;
            switch (i3) {
                case 131:
                case 136:
                case 155:
                case 159:
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i = 3;
                    break;
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                case 166:
                case 174:
                case 183:
                case 187:
                case BERTags.FLAGS /* 224 */:
                case HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS /* 225 */:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i = 5;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0) {
                if (i == 1) {
                    long position = interfaceC8424.getPosition();
                    arrayDeque.push(new C12510(this.f31263, this.f31262 + position));
                    ((C11805) this.f31266).f35217.m33349(position, this.f31263, this.f31262);
                    this.f31265 = 0;
                    return true;
                }
                if (i == 2) {
                    long j = this.f31262;
                    if (j > 8) {
                        throw C9080.m23440("Invalid integer size: " + this.f31262, (Throwable) null);
                    }
                    ((C11805) interfaceC6160).f35217.m33347(i3, m26208(interfaceC8424, (int) j));
                    this.f31265 = 0;
                    return true;
                }
                if (i == 3) {
                    long j2 = this.f31262;
                    if (j2 > 2147483647L) {
                        throw C9080.m23440("String element size: " + this.f31262, (Throwable) null);
                    }
                    int i4 = (int) j2;
                    if (i4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i4];
                        interfaceC8424.readFully(bArr2, 0, i4);
                        while (i4 > 0 && bArr2[i4 - 1] == 0) {
                            i4--;
                        }
                        str = new String(bArr2, 0, i4);
                    }
                    ((C11805) interfaceC6160).f35217.m33348(i3, str);
                    this.f31265 = 0;
                    return true;
                }
                if (i == 4) {
                    ((C11805) interfaceC6160).f35217.m33346(i3, (int) this.f31262, interfaceC8424);
                    this.f31265 = 0;
                    return true;
                }
                if (i == 5) {
                    long j3 = this.f31262;
                    if (j3 != 4 && j3 != 8) {
                        throw C9080.m23440("Invalid float size: " + this.f31262, (Throwable) null);
                    }
                    int i5 = (int) j3;
                    long jM26208 = m26208(interfaceC8424, i5);
                    if (i5 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jM26208);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jM26208);
                    }
                    ((C11805) interfaceC6160).f35217.m33345(i3, dLongBitsToDouble);
                    this.f31265 = 0;
                    return true;
                }
                throw C9080.m23440("Invalid element type " + i, (Throwable) null);
            }
            interfaceC8424.mo22070((int) this.f31262);
            this.f31265 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m26208(InterfaceC8424 interfaceC8424, int i) {
        byte[] bArr = this.f31264;
        interfaceC8424.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
