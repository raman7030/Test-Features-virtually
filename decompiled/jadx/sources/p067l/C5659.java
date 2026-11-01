package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5659 implements Serializable {

    /* JADX INFO: renamed from: ۫ */
    public static final C5659 f13765 = new C5659();

    /* JADX INFO: renamed from: ۗ */
    public final int f13766;

    /* JADX INFO: renamed from: ۙ */
    public final int f13767;

    /* JADX INFO: renamed from: ۬ */
    public final int f13768;

    /* JADX INFO: renamed from: ᩶ */
    public final int f13769;

    /* JADX INFO: renamed from: ᩸ */
    public final int f13770;

    /* JADX INFO: renamed from: ᩹ */
    public final int f13771;

    public C5659(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f13766 = i;
        this.f13767 = i2;
        this.f13768 = i3;
        this.f13771 = i4;
        this.f13770 = i5;
        this.f13769 = i6;
    }

    public C5659() {
        this.f13769 = -1;
        this.f13770 = -1;
        this.f13771 = -1;
        this.f13768 = -1;
        this.f13767 = -1;
        this.f13766 = -1;
    }

    public final String toString() {
        int i = this.f13766;
        if (i == -1) {
            return "?";
        }
        StringBuilder sb = new StringBuilder(15);
        sb.append(i + 1);
        int i2 = this.f13767;
        if (i2 != -1) {
            sb.append(':');
            sb.append(i2 + 1);
        }
        int i3 = this.f13771;
        if (i3 != -1) {
            int i4 = this.f13770;
            if (i3 != i) {
                sb.append('-');
                sb.append(i3 + 1);
                if (i4 != -1) {
                    sb.append(':');
                    sb.append(i4 + 1);
                } else if (i2 != -1) {
                    sb.append(":?");
                }
            } else if (i4 != -1 && i4 != i2) {
                sb.append('-');
                sb.append(i4 + 1);
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5659)) {
            return false;
        }
        C5659 c5659 = (C5659) obj;
        return c5659.f13766 == this.f13766 && c5659.f13767 == this.f13767 && c5659.f13768 == this.f13768 && c5659.f13771 == this.f13771 && c5659.f13770 == this.f13770 && c5659.f13769 == this.f13769;
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f13766), Integer.valueOf(this.f13767), Integer.valueOf(this.f13768), Integer.valueOf(this.f13771), Integer.valueOf(this.f13770), Integer.valueOf(this.f13769));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12608() {
        return this.f13766;
    }
}
