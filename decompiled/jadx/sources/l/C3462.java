package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJN */
/* JADX INFO: loaded from: classes2.dex */
public final class C3462 implements Serializable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C3462 f10964 = new C3462();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f10965;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f10966;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f10967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10968;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f10969;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f10970;

    public C3462(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f10965 = i;
        this.f10966 = i2;
        this.f10967 = i3;
        this.f10970 = i4;
        this.f10969 = i5;
        this.f10968 = i6;
    }

    public C3462() {
        this.f10968 = -1;
        this.f10969 = -1;
        this.f10970 = -1;
        this.f10967 = -1;
        this.f10966 = -1;
        this.f10965 = -1;
    }

    public final String toString() {
        int i = this.f10965;
        if (i == -1) {
            return "?";
        }
        StringBuilder sb = new StringBuilder(15);
        sb.append(i + 1);
        int i2 = this.f10966;
        if (i2 != -1) {
            sb.append(':');
            sb.append(i2 + 1);
        }
        int i3 = this.f10970;
        if (i3 != -1) {
            int i4 = this.f10969;
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
        if (!(obj instanceof C3462)) {
            return false;
        }
        C3462 c3462 = (C3462) obj;
        return c3462.f10965 == this.f10965 && c3462.f10966 == this.f10966 && c3462.f10967 == this.f10967 && c3462.f10970 == this.f10970 && c3462.f10969 == this.f10969 && c3462.f10968 == this.f10968;
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f10965), Integer.valueOf(this.f10966), Integer.valueOf(this.f10967), Integer.valueOf(this.f10970), Integer.valueOf(this.f10969), Integer.valueOf(this.f10968));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10600() {
        return this.f10965;
    }
}
