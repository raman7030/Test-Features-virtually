package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8JL */
/* JADX INFO: loaded from: classes2.dex */
public final class C7214 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C7214 f22068 = new C7214(new C13563[0]);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C13563 f22069 = new C13563().m32607();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f22070;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13563[] f22071;

    static {
        C3603.m11056(1);
        C3603.m11056(2);
        C3603.m11056(3);
        C3603.m11056(4);
    }

    public C7214(C13563[] c13563Arr) {
        this.f22070 = c13563Arr.length;
        this.f22071 = c13563Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13563 m19298(int i) {
        if (i < 0) {
            return f22069;
        }
        return this.f22071[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7214.class != obj.getClass()) {
            return false;
        }
        C7214 c7214 = (C7214) obj;
        return this.f22070 == c7214.f22070 && Arrays.equals(this.f22071, c7214.f22071);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22071) + (((((this.f22070 * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C13563[] c13563Arr = this.f22071;
            if (i < c13563Arr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                c13563Arr[i].getClass();
                for (int i2 = 0; i2 < c13563Arr[i].f40473.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = c13563Arr[i].f40473[i2];
                    if (i3 == 0) {
                        sb.append('_');
                    } else if (i3 == 1) {
                        sb.append('R');
                    } else if (i3 == 2) {
                        sb.append('S');
                    } else if (i3 == 3) {
                        sb.append('P');
                    } else if (i3 == 4) {
                        sb.append('!');
                    } else {
                        sb.append('?');
                    }
                    sb.append(", durationUs=");
                    sb.append(c13563Arr[i].f40472[i2]);
                    sb.append(')');
                    if (i2 < c13563Arr[i].f40473.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < c13563Arr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
