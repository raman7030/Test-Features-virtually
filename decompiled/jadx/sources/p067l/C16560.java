package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 722Z */
/* JADX INFO: loaded from: classes5.dex */
public class C16560 implements InterfaceC20585 {

    /* JADX INFO: renamed from: ᩳ */
    public int f48635 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f48632 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f48633 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f48634 = -1;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48632), Integer.valueOf(this.f48633), Integer.valueOf(this.f48635), Integer.valueOf(this.f48634)});
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof C16560)) {
            return false;
        }
        C16560 c16560 = (C16560) obj;
        if (this.f48632 == c16560.f48632) {
            int i2 = this.f48633;
            int i3 = c16560.f48633;
            int i4 = c16560.f48634;
            if (i4 == -1) {
                int i5 = c16560.f48635;
                int i6 = C5832.f14307;
                if ((i3 & 1) != 1) {
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f48635 == c16560.f48635 && this.f48634 == i4) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String strM46922;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f48634 != -1) {
            sb.append(" stream=");
            sb.append(this.f48634);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f48635;
        int i2 = C5832.f14307;
        switch (i) {
            case 0:
                strM46922 = "USAGE_UNKNOWN";
                break;
            case 1:
                strM46922 = "USAGE_MEDIA";
                break;
            case 2:
                strM46922 = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM46922 = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM46922 = "USAGE_ALARM";
                break;
            case 5:
                strM46922 = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM46922 = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM46922 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM46922 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM46922 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM46922 = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM46922 = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM46922 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM46922 = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM46922 = "USAGE_GAME";
                break;
            case 15:
            default:
                strM46922 = C20778.m46922(i, "unknown usage ");
                break;
            case 16:
                strM46922 = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM46922);
        sb.append(" content=");
        sb.append(this.f48632);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f48633).toUpperCase());
        return sb.toString();
    }
}
