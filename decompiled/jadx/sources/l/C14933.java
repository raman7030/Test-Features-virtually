package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 722Z */
/* JADX INFO: loaded from: classes5.dex */
public class C14933 implements InterfaceC19168 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f45520 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f45517 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f45518 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f45519 = -1;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45517), Integer.valueOf(this.f45518), Integer.valueOf(this.f45520), Integer.valueOf(this.f45519)});
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof C14933)) {
            return false;
        }
        C14933 c14933 = (C14933) obj;
        if (this.f45517 == c14933.f45517) {
            int i2 = this.f45518;
            int i3 = c14933.f45518;
            int i4 = c14933.f45519;
            if (i4 == -1) {
                int i5 = c14933.f45520;
                int i6 = C3645.f11501;
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
            if (i2 == (i3 & 273) && this.f45520 == c14933.f45520 && this.f45519 == i4) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String strM44628;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f45519 != -1) {
            sb.append(" stream=");
            sb.append(this.f45519);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f45520;
        int i2 = C3645.f11501;
        switch (i) {
            case 0:
                strM44628 = "USAGE_UNKNOWN";
                break;
            case 1:
                strM44628 = "USAGE_MEDIA";
                break;
            case 2:
                strM44628 = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM44628 = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM44628 = "USAGE_ALARM";
                break;
            case 5:
                strM44628 = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM44628 = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM44628 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM44628 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM44628 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM44628 = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM44628 = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM44628 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM44628 = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM44628 = "USAGE_GAME";
                break;
            case 15:
            default:
                strM44628 = C19370.m44628(i, "unknown usage ");
                break;
            case 16:
                strM44628 = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM44628);
        sb.append(" content=");
        sb.append(this.f45517);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f45518).toUpperCase());
        return sb.toString();
    }
}
