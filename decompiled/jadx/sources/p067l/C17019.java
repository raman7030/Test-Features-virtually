package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UR */
/* JADX INFO: loaded from: classes5.dex */
public final class C17019 extends AbstractC6962 {

    /* JADX INFO: renamed from: ֡ */
    public final int f50342;

    /* JADX INFO: renamed from: ۖ */
    public C10315 f50343;

    /* JADX INFO: renamed from: ۘ */
    public int f50344;

    /* JADX INFO: renamed from: ۡ */
    public List f50346;

    /* JADX INFO: renamed from: ۢ */
    public final C3609[] f50347;

    /* JADX INFO: renamed from: ܺ */
    public C3609 f50348;

    /* JADX INFO: renamed from: ᩴ */
    public List f50349;

    /* JADX INFO: renamed from: ᩷ */
    public final C19203 f50351 = new C19203();

    /* JADX INFO: renamed from: ۜ */
    public final C17861 f50345 = new C17861();

    /* JADX INFO: renamed from: ᩵ */
    public int f50350 = -1;

    @Override // p067l.InterfaceC3681
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo12() {
    }

    public C17019(int i, List list) {
        this.f50342 = i == -1 ? 1 : i;
        if (list != null) {
            int i2 = C19322.f57686;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f50347 = new C3609[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f50347[i3] = new C3609();
        }
        this.f50348 = this.f50347[0];
    }

    @Override // p067l.AbstractC6962, p067l.InterfaceC3681
    public final void flush() {
        super.flush();
        this.f50346 = null;
        this.f50349 = null;
        this.f50344 = 0;
        this.f50348 = this.f50347[0];
        m38622();
        this.f50343 = null;
    }

    @Override // p067l.AbstractC6962
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo15958() {
        return this.f50346 != this.f50349;
    }

    @Override // p067l.AbstractC6962
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15266 mo15957() {
        List list = this.f50346;
        this.f50349 = list;
        list.getClass();
        return new C5621(list);
    }

    @Override // p067l.AbstractC6962
    /* JADX INFO: renamed from: ֫ */
    public final void mo15954(C19703 c19703) {
        ByteBuffer byteBuffer = c19703.f72704;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C19203 c19203 = this.f50351;
        c19203.m43708(iLimit, bArrArray);
        while (c19203.m43703() >= 3) {
            int iM43702 = c19203.m43702();
            int i = iM43702 & 3;
            boolean z = (iM43702 & 4) == 4;
            byte bM43702 = (byte) c19203.m43702();
            byte bM43703 = (byte) c19203.m43702();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m38621();
                        int i2 = (bM43702 & 192) >> 6;
                        int i3 = this.f50350;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m38622();
                            C21334.m48351("Sequence number discontinuity. previous=" + this.f50350 + " current=" + i2);
                        }
                        this.f50350 = i2;
                        int i4 = bM43702 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C10315 c10315 = new C10315(i2, i4);
                        this.f50343 = c10315;
                        c10315.f28580 = 1;
                        c10315.f28581[0] = bM43703;
                    } else {
                        C23877.m52957(i == 2);
                        C10315 c10316 = this.f50343;
                        if (c10316 == null) {
                            C21334.m48347("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c10316.f28581;
                            int i5 = c10316.f28580;
                            int i6 = i5 + 1;
                            c10316.f28580 = i6;
                            bArr[i5] = bM43702;
                            c10316.f28580 = i5 + 2;
                            bArr[i6] = bM43703;
                        }
                    }
                    C10315 c10317 = this.f50343;
                    if (c10317.f28580 == (c10317.f28582 * 2) - 1) {
                        m38621();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0487  */
    /* JADX INFO: renamed from: ۜ */
    private void m38621() {
        String str;
        String str2;
        C10315 c10315 = this.f50343;
        if (c10315 == null) {
            return;
        }
        if (c10315.f28580 != (c10315.f28582 * 2) - 1) {
            StringBuilder sb = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb.append((this.f50343.f28582 * 2) - 1);
            sb.append(", but current index is ");
            sb.append(this.f50343.f28580);
            sb.append(" (sequence number ");
            sb.append(this.f50343.f28583);
            sb.append(");");
            C21334.m48345(sb.toString());
        }
        C10315 c10316 = this.f50343;
        byte[] bArr = c10316.f28581;
        int i = c10316.f28580;
        C17861 c17861 = this.f50345;
        c17861.m40565(i, bArr);
        boolean z = false;
        while (c17861.m40554() > 0) {
            int iM40558 = c17861.m40558(3);
            int iM40559 = c17861.m40558(5);
            if (iM40558 == 7) {
                c17861.m40566(2);
                iM40558 = c17861.m40558(6);
                if (iM40558 < 7) {
                    C10050.m23419(iM40558, "Invalid extended service number: ");
                }
            }
            if (iM40559 == 0) {
                if (iM40558 != 0) {
                    C21334.m48351("serviceNumber is non-zero (" + iM40558 + ") when blockSize is 0");
                }
                if (z) {
                    this.f50346 = m38623();
                }
                this.f50343 = null;
            }
            if (iM40558 != this.f50342) {
                c17861.m40562(iM40559);
            } else {
                int iM40568 = (iM40559 * 8) + c17861.m40568();
                while (c17861.m40568() < iM40568) {
                    int iM405510 = c17861.m40558(8);
                    if (iM405510 != 16) {
                        if (iM405510 > 31) {
                            if (iM405510 <= 127) {
                                if (iM405510 == 127) {
                                    this.f50348.m6764((char) 9835);
                                } else {
                                    this.f50348.m6764((char) (iM405510 & 255));
                                }
                            } else if (iM405510 <= 159) {
                                C3609[] c3609Arr = this.f50347;
                                switch (iM405510) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i2 = iM405510 + C0184a.f879g;
                                        if (this.f50344 != i2) {
                                            this.f50344 = i2;
                                            this.f50348 = c3609Arr[i2];
                                        }
                                        break;
                                    case 136:
                                        for (int i3 = 1; i3 <= 8; i3++) {
                                            if (c17861.m40567()) {
                                                c3609Arr[8 - i3].m6776();
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i4 = 1; i4 <= 8; i4++) {
                                            if (c17861.m40567()) {
                                                c3609Arr[8 - i4].m6767(true);
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (c17861.m40567()) {
                                                c3609Arr[8 - i5].m6767(false);
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (c17861.m40567()) {
                                                C3609 c3609 = c3609Arr[8 - i6];
                                                c3609.m6767(!c3609.m6777());
                                            }
                                        }
                                        break;
                                    case 140:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (c17861.m40567()) {
                                                c3609Arr[8 - i7].m6770();
                                            }
                                        }
                                        break;
                                    case 141:
                                        c17861.m40566(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        m38622();
                                        break;
                                    case 144:
                                        if (this.f50348.m6775()) {
                                            c17861.m40558(4);
                                            c17861.m40558(2);
                                            c17861.m40558(2);
                                            boolean zM40567 = c17861.m40567();
                                            boolean zM40568 = c17861.m40567();
                                            c17861.m40558(3);
                                            c17861.m40558(3);
                                            this.f50348.m6769(zM40567, zM40568);
                                        } else {
                                            c17861.m40566(16);
                                        }
                                        break;
                                    case 145:
                                        if (this.f50348.m6775()) {
                                            int iM6762 = C3609.m6762(c17861.m40558(2), c17861.m40558(2), c17861.m40558(2), c17861.m40558(2));
                                            int iM6763 = C3609.m6762(c17861.m40558(2), c17861.m40558(2), c17861.m40558(2), c17861.m40558(2));
                                            c17861.m40566(2);
                                            C3609.m6762(c17861.m40558(2), c17861.m40558(2), c17861.m40558(2), 0);
                                            this.f50348.m6766(iM6762, iM6763);
                                        } else {
                                            c17861.m40566(24);
                                        }
                                        break;
                                    case 146:
                                        if (this.f50348.m6775()) {
                                            c17861.m40566(4);
                                            int iM405511 = c17861.m40558(4);
                                            c17861.m40566(2);
                                            c17861.m40558(6);
                                            this.f50348.m6765(iM405511);
                                        } else {
                                            c17861.m40566(16);
                                        }
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        str2 = "Invalid C1 command: ";
                                        C10050.m23419(iM405510, str2);
                                        break;
                                    case 151:
                                        if (this.f50348.m6775()) {
                                            int iM6764 = C3609.m6762(c17861.m40558(2), c17861.m40558(2), c17861.m40558(2), c17861.m40558(2));
                                            c17861.m40558(2);
                                            C3609.m6762(c17861.m40558(2), c17861.m40558(2), c17861.m40558(2), 0);
                                            c17861.m40567();
                                            c17861.m40567();
                                            c17861.m40558(2);
                                            c17861.m40558(2);
                                            int iM405512 = c17861.m40558(2);
                                            c17861.m40566(8);
                                            this.f50348.m6772(iM6764, iM405512);
                                        } else {
                                            c17861.m40566(32);
                                        }
                                        break;
                                    case 152:
                                    case 153:
                                    case EnumC19222.f57460 /* 154 */:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i8 = iM405510 - 152;
                                        C3609 c36010 = c3609Arr[i8];
                                        c17861.m40566(2);
                                        boolean zM40569 = c17861.m40567();
                                        c17861.m40566(2);
                                        int iM405513 = c17861.m40558(3);
                                        boolean zM405610 = c17861.m40567();
                                        int iM405514 = c17861.m40558(7);
                                        int iM405515 = c17861.m40558(8);
                                        int iM405516 = c17861.m40558(4);
                                        int iM405517 = c17861.m40558(4);
                                        c17861.m40566(2);
                                        c17861.m40566(6);
                                        c17861.m40566(2);
                                        c36010.m6768(zM40569, iM405513, zM405610, iM405514, iM405515, iM405517, iM405516, c17861.m40558(3), c17861.m40558(3));
                                        if (this.f50344 != i8) {
                                            this.f50344 = i8;
                                            this.f50348 = c3609Arr[i8];
                                        }
                                        break;
                                }
                            } else if (iM405510 <= 255) {
                                this.f50348.m6764((char) (iM405510 & 255));
                            } else {
                                str = "Invalid base command: ";
                            }
                            z = true;
                        } else if (iM405510 != 0) {
                            if (iM405510 == 3) {
                                this.f50346 = m38623();
                            } else if (iM405510 != 8) {
                                switch (iM405510) {
                                    case 12:
                                        m38622();
                                        break;
                                    case 13:
                                        this.f50348.m6764('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (iM405510 >= 17 && iM405510 <= 23) {
                                            C21334.m48351("Currently unsupported COMMAND_EXT1 Command: " + iM405510);
                                            c17861.m40566(8);
                                        } else if (iM405510 < 24 || iM405510 > 31) {
                                            str = "Invalid C0 command: ";
                                        } else {
                                            C21334.m48351("Currently unsupported COMMAND_P16 Command: " + iM405510);
                                            c17861.m40566(16);
                                        }
                                        break;
                                }
                            } else {
                                this.f50348.m6763();
                            }
                        }
                        C10050.m23419(iM405510, str);
                    } else {
                        iM405510 = c17861.m40558(8);
                        if (iM405510 > 31) {
                            if (iM405510 <= 127) {
                                if (iM405510 == 32) {
                                    this.f50348.m6764(' ');
                                } else if (iM405510 == 33) {
                                    this.f50348.m6764((char) 160);
                                } else if (iM405510 == 37) {
                                    this.f50348.m6764((char) 8230);
                                } else if (iM405510 == 42) {
                                    this.f50348.m6764((char) 352);
                                } else if (iM405510 == 44) {
                                    this.f50348.m6764((char) 338);
                                } else if (iM405510 == 63) {
                                    this.f50348.m6764((char) 376);
                                } else if (iM405510 == 57) {
                                    this.f50348.m6764((char) 8482);
                                } else if (iM405510 == 58) {
                                    this.f50348.m6764((char) 353);
                                } else if (iM405510 == 60) {
                                    this.f50348.m6764((char) 339);
                                } else if (iM405510 != 61) {
                                    switch (iM405510) {
                                        case 48:
                                            this.f50348.m6764((char) 9608);
                                            break;
                                        case 49:
                                            this.f50348.m6764((char) 8216);
                                            break;
                                        case 50:
                                            this.f50348.m6764((char) 8217);
                                            break;
                                        case 51:
                                            this.f50348.m6764((char) 8220);
                                            break;
                                        case 52:
                                            this.f50348.m6764((char) 8221);
                                            break;
                                        case 53:
                                            this.f50348.m6764((char) 8226);
                                            break;
                                        default:
                                            switch (iM405510) {
                                                case 118:
                                                    this.f50348.m6764((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f50348.m6764((char) 8540);
                                                    break;
                                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                    this.f50348.m6764((char) 8541);
                                                    break;
                                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                    this.f50348.m6764((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f50348.m6764(UMLog.HORIZONTAL_LINE);
                                                    break;
                                                case 123:
                                                    this.f50348.m6764((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f50348.m6764(UMLog.BOTTOM_LEFT_CORNER);
                                                    break;
                                                case C0254q.f1218h /* 125 */:
                                                    this.f50348.m6764((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f50348.m6764((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f50348.m6764(UMLog.TOP_LEFT_CORNER);
                                                    break;
                                                default:
                                                    str2 = "Invalid G2 character: ";
                                                    C10050.m23419(iM405510, str2);
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f50348.m6764((char) 8480);
                                }
                            } else if (iM405510 <= 159) {
                                if (iM405510 <= 135) {
                                    c17861.m40566(32);
                                } else if (iM405510 <= 143) {
                                    c17861.m40566(40);
                                } else if (iM405510 <= 159) {
                                    c17861.m40566(2);
                                    c17861.m40566(c17861.m40558(6) * 8);
                                }
                            } else if (iM405510 > 255) {
                                str = "Invalid extended command: ";
                                C10050.m23419(iM405510, str);
                            } else if (iM405510 == 160) {
                                this.f50348.m6764((char) 13252);
                            } else {
                                C10050.m23419(iM405510, "Invalid G3 character: ");
                                this.f50348.m6764('_');
                            }
                            z = true;
                        } else if (iM405510 > 7) {
                            if (iM405510 <= 15) {
                                c17861.m40566(8);
                            } else if (iM405510 <= 23) {
                                c17861.m40566(16);
                            } else if (iM405510 <= 31) {
                                c17861.m40566(24);
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            this.f50346 = m38623();
        }
        this.f50343 = null;
    }

    /* JADX INFO: renamed from: ᩷ */
    private List m38623() {
        C7633 c7633M6771;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C3609[] c3609Arr = this.f50347;
            if (!c3609Arr[i].m6773() && c3609Arr[i].m6777() && (c7633M6771 = c3609Arr[i].m6771()) != null) {
                arrayList.add(c7633M6771);
            }
        }
        Collections.sort(arrayList, C7633.f19979);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C7633) arrayList.get(i2)).f19980);
        }
        return C21562.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۢ */
    private void m38622() {
        for (int i = 0; i < 8; i++) {
            this.f50347[i].m6770();
        }
    }
}
