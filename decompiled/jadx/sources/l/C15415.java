package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UR */
/* JADX INFO: loaded from: classes5.dex */
public final class C15415 extends AbstractC4833 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f47213;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C8361 f47214;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f47215;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f47217;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C1305[] f47218;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1305 f47219;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f47220;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17714 f47222 = new C17714();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16302 f47216 = new C16302();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f47221 = -1;

    @Override // l.InterfaceC1381
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo12() {
    }

    public C15415(int i, List list) {
        this.f47213 = i == -1 ? 1 : i;
        if (list != null) {
            int i2 = C17839.f54488;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f47218 = new C1305[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f47218[i3] = new C1305();
        }
        this.f47219 = this.f47218[0];
    }

    @Override // l.AbstractC4833, l.InterfaceC1381
    public final void flush() {
        super.flush();
        this.f47217 = null;
        this.f47220 = null;
        this.f47215 = 0;
        this.f47219 = this.f47218[0];
        m36464();
        this.f47214 = null;
    }

    @Override // l.AbstractC4833
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo14078() {
        return this.f47217 != this.f47220;
    }

    @Override // l.AbstractC4833
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC13571 mo14077() {
        List list = this.f47217;
        this.f47220 = list;
        list.getClass();
        return new C3422(list);
    }

    @Override // l.AbstractC4833
    /* JADX INFO: renamed from: ֫ */
    public final void mo14074(C18239 c18239) {
        ByteBuffer byteBuffer = c18239.f69995;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C17714 c17714 = this.f47222;
        c17714.m41462(iLimit, bArrArray);
        while (c17714.m41457() >= 3) {
            int iM41456 = c17714.m41456();
            int i = iM41456 & 3;
            boolean z = (iM41456 & 4) == 4;
            byte bM41456 = (byte) c17714.m41456();
            byte bM41457 = (byte) c17714.m41456();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m36463();
                        int i2 = (bM41456 & 192) >> 6;
                        int i3 = this.f47221;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m36464();
                            C19956.m46037("Sequence number discontinuity. previous=" + this.f47221 + " current=" + i2);
                        }
                        this.f47221 = i2;
                        int i4 = bM41456 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C8361 c8361 = new C8361(i2, i4);
                        this.f47214 = c8361;
                        c8361.f25667 = 1;
                        c8361.f25668[0] = bM41457;
                    } else {
                        C22632.m50631(i == 2);
                        C8361 c8362 = this.f47214;
                        if (c8362 == null) {
                            C19956.m46033("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c8362.f25668;
                            int i5 = c8362.f25667;
                            int i6 = i5 + 1;
                            c8362.f25667 = i6;
                            bArr[i5] = bM41456;
                            c8362.f25667 = i5 + 2;
                            bArr[i6] = bM41457;
                        }
                    }
                    C8361 c8363 = this.f47214;
                    if (c8363.f25667 == (c8363.f25669 * 2) - 1) {
                        m36463();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0487  */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m36463() {
        String str;
        String str2;
        C8361 c8361 = this.f47214;
        if (c8361 == null) {
            return;
        }
        if (c8361.f25667 != (c8361.f25669 * 2) - 1) {
            StringBuilder sb = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb.append((this.f47214.f25669 * 2) - 1);
            sb.append(", but current index is ");
            sb.append(this.f47214.f25667);
            sb.append(" (sequence number ");
            sb.append(this.f47214.f25670);
            sb.append(");");
            C19956.m46031(sb.toString());
        }
        C8361 c8362 = this.f47214;
        byte[] bArr = c8362.f25668;
        int i = c8362.f25667;
        C16302 c16302 = this.f47216;
        c16302.m38350(i, bArr);
        boolean z = false;
        while (c16302.m38339() > 0) {
            int iM38343 = c16302.m38343(3);
            int iM38344 = c16302.m38343(5);
            if (iM38343 == 7) {
                c16302.m38351(2);
                iM38343 = c16302.m38343(6);
                if (iM38343 < 7) {
                    C8083.m21451(iM38343, "Invalid extended service number: ");
                }
            }
            if (iM38344 == 0) {
                if (iM38343 != 0) {
                    C19956.m46037("serviceNumber is non-zero (" + iM38343 + ") when blockSize is 0");
                }
                if (z) {
                    this.f47217 = m36465();
                }
                this.f47214 = null;
            }
            if (iM38343 != this.f47213) {
                c16302.m38347(iM38344);
            } else {
                int iM38353 = (iM38344 * 8) + c16302.m38353();
                while (c16302.m38353() < iM38353) {
                    int iM38345 = c16302.m38343(8);
                    if (iM38345 != 16) {
                        if (iM38345 > 31) {
                            if (iM38345 <= 127) {
                                if (iM38345 == 127) {
                                    this.f47219.m4532((char) 9835);
                                } else {
                                    this.f47219.m4532((char) (iM38345 & 255));
                                }
                            } else if (iM38345 <= 159) {
                                C1305[] c1305Arr = this.f47218;
                                switch (iM38345) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i2 = iM38345 + a.g;
                                        if (this.f47215 != i2) {
                                            this.f47215 = i2;
                                            this.f47219 = c1305Arr[i2];
                                        }
                                        break;
                                    case 136:
                                        for (int i3 = 1; i3 <= 8; i3++) {
                                            if (c16302.m38352()) {
                                                c1305Arr[8 - i3].m4544();
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i4 = 1; i4 <= 8; i4++) {
                                            if (c16302.m38352()) {
                                                c1305Arr[8 - i4].m4535(true);
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (c16302.m38352()) {
                                                c1305Arr[8 - i5].m4535(false);
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (c16302.m38352()) {
                                                C1305 c1305 = c1305Arr[8 - i6];
                                                c1305.m4535(!c1305.m4545());
                                            }
                                        }
                                        break;
                                    case 140:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (c16302.m38352()) {
                                                c1305Arr[8 - i7].m4538();
                                            }
                                        }
                                        break;
                                    case 141:
                                        c16302.m38351(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        m36464();
                                        break;
                                    case 144:
                                        if (this.f47219.m4543()) {
                                            c16302.m38343(4);
                                            c16302.m38343(2);
                                            c16302.m38343(2);
                                            boolean zM38352 = c16302.m38352();
                                            boolean zM38353 = c16302.m38352();
                                            c16302.m38343(3);
                                            c16302.m38343(3);
                                            this.f47219.m4537(zM38352, zM38353);
                                        } else {
                                            c16302.m38351(16);
                                        }
                                        break;
                                    case 145:
                                        if (this.f47219.m4543()) {
                                            int iM4530 = C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), c16302.m38343(2));
                                            int iM4531 = C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), c16302.m38343(2));
                                            c16302.m38351(2);
                                            C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), 0);
                                            this.f47219.m4534(iM4530, iM4531);
                                        } else {
                                            c16302.m38351(24);
                                        }
                                        break;
                                    case 146:
                                        if (this.f47219.m4543()) {
                                            c16302.m38351(4);
                                            int iM38346 = c16302.m38343(4);
                                            c16302.m38351(2);
                                            c16302.m38343(6);
                                            this.f47219.m4533(iM38346);
                                        } else {
                                            c16302.m38351(16);
                                        }
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        str2 = "Invalid C1 command: ";
                                        C8083.m21451(iM38345, str2);
                                        break;
                                    case 151:
                                        if (this.f47219.m4543()) {
                                            int iM4532 = C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), c16302.m38343(2));
                                            c16302.m38343(2);
                                            C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), 0);
                                            c16302.m38352();
                                            c16302.m38352();
                                            c16302.m38343(2);
                                            c16302.m38343(2);
                                            int iM38347 = c16302.m38343(2);
                                            c16302.m38351(8);
                                            this.f47219.m4540(iM4532, iM38347);
                                        } else {
                                            c16302.m38351(32);
                                        }
                                        break;
                                    case 152:
                                    case 153:
                                    case EnumC17734.f54268 /* 154 */:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i8 = iM38345 - 152;
                                        C1305 c1306 = c1305Arr[i8];
                                        c16302.m38351(2);
                                        boolean zM38354 = c16302.m38352();
                                        c16302.m38351(2);
                                        int iM38348 = c16302.m38343(3);
                                        boolean zM38355 = c16302.m38352();
                                        int iM38349 = c16302.m38343(7);
                                        int iM383410 = c16302.m38343(8);
                                        int iM383411 = c16302.m38343(4);
                                        int iM383412 = c16302.m38343(4);
                                        c16302.m38351(2);
                                        c16302.m38351(6);
                                        c16302.m38351(2);
                                        c1306.m4536(zM38354, iM38348, zM38355, iM38349, iM383410, iM383412, iM383411, c16302.m38343(3), c16302.m38343(3));
                                        if (this.f47215 != i8) {
                                            this.f47215 = i8;
                                            this.f47219 = c1305Arr[i8];
                                        }
                                        break;
                                }
                            } else if (iM38345 <= 255) {
                                this.f47219.m4532((char) (iM38345 & 255));
                            } else {
                                str = "Invalid base command: ";
                            }
                            z = true;
                        } else if (iM38345 != 0) {
                            if (iM38345 == 3) {
                                this.f47217 = m36465();
                            } else if (iM38345 != 8) {
                                switch (iM38345) {
                                    case 12:
                                        m36464();
                                        break;
                                    case 13:
                                        this.f47219.m4532('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (iM38345 >= 17 && iM38345 <= 23) {
                                            C19956.m46037("Currently unsupported COMMAND_EXT1 Command: " + iM38345);
                                            c16302.m38351(8);
                                        } else if (iM38345 < 24 || iM38345 > 31) {
                                            str = "Invalid C0 command: ";
                                        } else {
                                            C19956.m46037("Currently unsupported COMMAND_P16 Command: " + iM38345);
                                            c16302.m38351(16);
                                        }
                                        break;
                                }
                            } else {
                                this.f47219.m4531();
                            }
                        }
                        C8083.m21451(iM38345, str);
                    } else {
                        iM38345 = c16302.m38343(8);
                        if (iM38345 > 31) {
                            if (iM38345 <= 127) {
                                if (iM38345 == 32) {
                                    this.f47219.m4532(' ');
                                } else if (iM38345 == 33) {
                                    this.f47219.m4532((char) 160);
                                } else if (iM38345 == 37) {
                                    this.f47219.m4532((char) 8230);
                                } else if (iM38345 == 42) {
                                    this.f47219.m4532((char) 352);
                                } else if (iM38345 == 44) {
                                    this.f47219.m4532((char) 338);
                                } else if (iM38345 == 63) {
                                    this.f47219.m4532((char) 376);
                                } else if (iM38345 == 57) {
                                    this.f47219.m4532((char) 8482);
                                } else if (iM38345 == 58) {
                                    this.f47219.m4532((char) 353);
                                } else if (iM38345 == 60) {
                                    this.f47219.m4532((char) 339);
                                } else if (iM38345 != 61) {
                                    switch (iM38345) {
                                        case 48:
                                            this.f47219.m4532((char) 9608);
                                            break;
                                        case 49:
                                            this.f47219.m4532((char) 8216);
                                            break;
                                        case 50:
                                            this.f47219.m4532((char) 8217);
                                            break;
                                        case 51:
                                            this.f47219.m4532((char) 8220);
                                            break;
                                        case 52:
                                            this.f47219.m4532((char) 8221);
                                            break;
                                        case 53:
                                            this.f47219.m4532((char) 8226);
                                            break;
                                        default:
                                            switch (iM38345) {
                                                case 118:
                                                    this.f47219.m4532((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f47219.m4532((char) 8540);
                                                    break;
                                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                    this.f47219.m4532((char) 8541);
                                                    break;
                                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                    this.f47219.m4532((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f47219.m4532(UMLog.HORIZONTAL_LINE);
                                                    break;
                                                case 123:
                                                    this.f47219.m4532((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f47219.m4532(UMLog.BOTTOM_LEFT_CORNER);
                                                    break;
                                                case q.h /* 125 */:
                                                    this.f47219.m4532((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f47219.m4532((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f47219.m4532(UMLog.TOP_LEFT_CORNER);
                                                    break;
                                                default:
                                                    str2 = "Invalid G2 character: ";
                                                    C8083.m21451(iM38345, str2);
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f47219.m4532((char) 8480);
                                }
                            } else if (iM38345 <= 159) {
                                if (iM38345 <= 135) {
                                    c16302.m38351(32);
                                } else if (iM38345 <= 143) {
                                    c16302.m38351(40);
                                } else if (iM38345 <= 159) {
                                    c16302.m38351(2);
                                    c16302.m38351(c16302.m38343(6) * 8);
                                }
                            } else if (iM38345 > 255) {
                                str = "Invalid extended command: ";
                                C8083.m21451(iM38345, str);
                            } else if (iM38345 == 160) {
                                this.f47219.m4532((char) 13252);
                            } else {
                                C8083.m21451(iM38345, "Invalid G3 character: ");
                                this.f47219.m4532('_');
                            }
                            z = true;
                        } else if (iM38345 > 7) {
                            if (iM38345 <= 15) {
                                c16302.m38351(8);
                            } else if (iM38345 <= 23) {
                                c16302.m38351(16);
                            } else if (iM38345 <= 31) {
                                c16302.m38351(24);
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            this.f47217 = m36465();
        }
        this.f47214 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private List m36465() {
        C5539 c5539M4539;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C1305[] c1305Arr = this.f47218;
            if (!c1305Arr[i].m4541() && c1305Arr[i].m4545() && (c5539M4539 = c1305Arr[i].m4539()) != null) {
                arrayList.add(c5539M4539);
            }
        }
        Collections.sort(arrayList, C5539.f17138);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C5539) arrayList.get(i2)).f17139);
        }
        return C20195.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m36464() {
        for (int i = 0; i < 8; i++) {
            this.f47218[i].m4538();
        }
    }
}
