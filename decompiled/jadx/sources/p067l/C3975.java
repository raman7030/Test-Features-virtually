package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֫۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N7S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3975 {

    /* JADX INFO: renamed from: ֫ */
    public int f8638;

    /* JADX INFO: renamed from: ۧ */
    public int f8639;

    /* JADX INFO: renamed from: ܽ */
    public final InputStream f8640;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m7936() throws IOException {
        int i;
        int i2 = this.f8638;
        int i3 = this.f8639;
        if (i3 > 0) {
            i = i3 - 1;
        } else {
            int i4 = this.f8640.read();
            if (i4 < 0) {
                throw new C24762("Insufficient data");
            }
            i2 = (i2 << 8) | i4;
            i = i3 + 7;
            this.f8638 = i2;
        }
        this.f8639 = i;
        return (i2 & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m7937() throws IOException {
        int i = this.f8638;
        int i2 = this.f8639;
        int i3 = 0;
        while (true) {
            if (i2 <= 0) {
                int i4 = this.f8640.read();
                if (i4 < 0) {
                    throw new C24762("Insufficient data");
                }
                i = (i << 8) | i4;
                i2 += 7;
            } else {
                i2--;
            }
            if (((1 << i2) & i) == 0) {
                this.f8638 = i;
                this.f8639 = i2;
                return i3;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7935(int i) throws IOException {
        int i2 = this.f8638;
        int i3 = this.f8639;
        if (i3 < i) {
            while (i3 < i) {
                int i4 = this.f8640.read();
                if (i4 < 0) {
                    throw new C24762("Insufficient data");
                }
                i2 = (i2 << 8) | i4;
                i3 += 8;
            }
            this.f8638 = i2;
        }
        int i5 = i3 - i;
        this.f8639 = i5;
        return ((1 << i) - 1) & (i2 >>> i5);
    }

    public C3975(InputStream inputStream) {
        this.f8640 = inputStream;
    }
}
