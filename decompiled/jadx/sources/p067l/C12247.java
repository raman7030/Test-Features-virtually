package p067l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayDeque;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۤܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8RX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12247 {

    /* JADX INFO: renamed from: ֫ */
    public long f34227;

    /* JADX INFO: renamed from: ۧ */
    public int f34228;

    /* JADX INFO: renamed from: ܽ */
    public int f34230;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC8223 f34231;

    /* JADX INFO: renamed from: ܳ */
    public final byte[] f34229 = new byte[8];

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayDeque f34232 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩻ */
    public final C3828 f34233 = new C3828();

    /* JADX INFO: renamed from: ֫ */
    public final void m28239(InterfaceC8223 interfaceC8223) {
        this.f34231 = interfaceC8223;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28238() {
        this.f34230 = 0;
        this.f34232.clear();
        this.f34233.m7481();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28240(InterfaceC10375 interfaceC10375) throws C10998 {
        int i;
        String str;
        double dLongBitsToDouble;
        int iM7477;
        int iM7478;
        C23877.m52958(this.f34231);
        while (true) {
            ArrayDeque arrayDeque = this.f34232;
            C14258 c14258 = (C14258) arrayDeque.peek();
            if (c14258 != null && interfaceC10375.getPosition() >= c14258.f40602) {
                ((C13588) this.f34231).f38219.m35463(((C14258) arrayDeque.pop()).f40603);
                return true;
            }
            int i2 = this.f34230;
            C3828 c3828 = this.f34233;
            if (i2 == 0) {
                long jM7480 = c3828.m7480(interfaceC10375, true, false, 4);
                if (jM7480 == -2) {
                    interfaceC10375.mo24036();
                    while (true) {
                        byte[] bArr = this.f34229;
                        interfaceC10375.mo24031(0, 4, bArr);
                        iM7477 = C3828.m7477(bArr[0]);
                        if (iM7477 != -1 && iM7477 <= 4) {
                            iM7478 = (int) C3828.m7478(bArr, iM7477, false);
                            C15598 c15598 = ((C13588) this.f34231).f38219;
                            if (iM7478 == 357149030 || iM7478 == 524531317 || iM7478 == 475249515 || iM7478 == 374648427) {
                            }
                        }
                        interfaceC10375.mo24040(1);
                    }
                    interfaceC10375.mo24040(iM7477);
                    jM7480 = iM7478;
                }
                if (jM7480 == -1) {
                    return false;
                }
                this.f34228 = (int) jM7480;
                this.f34230 = 1;
            }
            if (this.f34230 == 1) {
                this.f34227 = c3828.m7480(interfaceC10375, false, true, 8);
                this.f34230 = 2;
            }
            InterfaceC8223 interfaceC8223 = this.f34231;
            int i3 = this.f34228;
            C15598 c15599 = ((C13588) interfaceC8223).f38219;
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
                    long position = interfaceC10375.getPosition();
                    arrayDeque.push(new C14258(this.f34228, this.f34227 + position));
                    ((C13588) this.f34231).f38219.m35468(position, this.f34228, this.f34227);
                    this.f34230 = 0;
                    return true;
                }
                if (i == 2) {
                    long j = this.f34227;
                    if (j > 8) {
                        throw C10998.m25387("Invalid integer size: " + this.f34227, (Throwable) null);
                    }
                    ((C13588) interfaceC8223).f38219.m35466(i3, m28237(interfaceC10375, (int) j));
                    this.f34230 = 0;
                    return true;
                }
                if (i == 3) {
                    long j2 = this.f34227;
                    if (j2 > 2147483647L) {
                        throw C10998.m25387("String element size: " + this.f34227, (Throwable) null);
                    }
                    int i4 = (int) j2;
                    if (i4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i4];
                        interfaceC10375.readFully(bArr2, 0, i4);
                        while (i4 > 0 && bArr2[i4 - 1] == 0) {
                            i4--;
                        }
                        str = new String(bArr2, 0, i4);
                    }
                    ((C13588) interfaceC8223).f38219.m35467(i3, str);
                    this.f34230 = 0;
                    return true;
                }
                if (i == 4) {
                    ((C13588) interfaceC8223).f38219.m35465(i3, (int) this.f34227, interfaceC10375);
                    this.f34230 = 0;
                    return true;
                }
                if (i == 5) {
                    long j3 = this.f34227;
                    if (j3 != 4 && j3 != 8) {
                        throw C10998.m25387("Invalid float size: " + this.f34227, (Throwable) null);
                    }
                    int i5 = (int) j3;
                    long jM28237 = m28237(interfaceC10375, i5);
                    if (i5 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jM28237);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jM28237);
                    }
                    ((C13588) interfaceC8223).f38219.m35464(i3, dLongBitsToDouble);
                    this.f34230 = 0;
                    return true;
                }
                throw C10998.m25387("Invalid element type " + i, (Throwable) null);
            }
            interfaceC10375.mo24040((int) this.f34227);
            this.f34230 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private long m28237(InterfaceC10375 interfaceC10375, int i) {
        byte[] bArr = this.f34229;
        interfaceC10375.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
