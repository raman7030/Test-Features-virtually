package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֫۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N7S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1691 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5859;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f5860;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream f5861;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5703() throws IOException {
        int i;
        int i2 = this.f5859;
        int i3 = this.f5860;
        if (i3 > 0) {
            i = i3 - 1;
        } else {
            int i4 = this.f5861.read();
            if (i4 < 0) {
                throw new C23563("Insufficient data");
            }
            i2 = (i2 << 8) | i4;
            i = i3 + 7;
            this.f5859 = i2;
        }
        this.f5860 = i;
        return (i2 & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m5704() throws IOException {
        int i = this.f5859;
        int i2 = this.f5860;
        int i3 = 0;
        while (true) {
            if (i2 <= 0) {
                int i4 = this.f5861.read();
                if (i4 < 0) {
                    throw new C23563("Insufficient data");
                }
                i = (i << 8) | i4;
                i2 += 7;
            } else {
                i2--;
            }
            if (((1 << i2) & i) == 0) {
                this.f5859 = i;
                this.f5860 = i2;
                return i3;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5702(int i) throws IOException {
        int i2 = this.f5859;
        int i3 = this.f5860;
        if (i3 < i) {
            while (i3 < i) {
                int i4 = this.f5861.read();
                if (i4 < 0) {
                    throw new C23563("Insufficient data");
                }
                i2 = (i2 << 8) | i4;
                i3 += 8;
            }
            this.f5859 = i2;
        }
        int i5 = i3 - i;
        this.f5860 = i5;
        return ((1 << i) - 1) & (i2 >>> i5);
    }

    public C1691(InputStream inputStream) {
        this.f5861 = inputStream;
    }
}
