package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8JL */
/* JADX INFO: loaded from: classes2.dex */
public final class C9224 {

    /* JADX INFO: renamed from: ܽ */
    public static final C9224 f24953 = new C9224(new C15258[0]);

    /* JADX INFO: renamed from: ᩳ */
    public static final C15258 f24954 = new C15258().m34718();

    /* JADX INFO: renamed from: ֫ */
    public final int f24955;

    /* JADX INFO: renamed from: ۧ */
    public final C15258[] f24956;

    static {
        C5792.m13032(1);
        C5792.m13032(2);
        C5792.m13032(3);
        C5792.m13032(4);
    }

    public C9224(C15258[] c15258Arr) {
        this.f24955 = c15258Arr.length;
        this.f24956 = c15258Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15258 m21246(int i) {
        if (i < 0) {
            return f24954;
        }
        return this.f24956[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9224.class != obj.getClass()) {
            return false;
        }
        C9224 c9224 = (C9224) obj;
        return this.f24955 == c9224.f24955 && Arrays.equals(this.f24956, c9224.f24956);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24956) + (((((this.f24955 * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C15258[] c15258Arr = this.f24956;
            if (i < c15258Arr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                c15258Arr[i].getClass();
                for (int i2 = 0; i2 < c15258Arr[i].f43551.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = c15258Arr[i].f43551[i2];
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
                    sb.append(c15258Arr[i].f43550[i2]);
                    sb.append(')');
                    if (i2 < c15258Arr[i].f43551.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < c15258Arr.length - 1) {
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
