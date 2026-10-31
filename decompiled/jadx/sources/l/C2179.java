package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2179 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f7171 = {0, 0, 1};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f7172;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f7173;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7174;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f7175;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7194() {
        this.f7173 = false;
        this.f7174 = 0;
        this.f7175 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7196(int i, int i2) {
        if (this.f7173) {
            int i3 = this.f7174 - i2;
            this.f7174 = i3;
            if (this.f7175 == 0 && i == 181) {
                this.f7175 = i3;
            } else {
                this.f7173 = false;
                return true;
            }
        } else if (i == 179) {
            this.f7173 = true;
        }
        m7195(0, 3, f7171);
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7195(int i, int i2, byte[] bArr) {
        if (this.f7173) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f7172;
            int length = bArr2.length;
            int i4 = this.f7174 + i3;
            if (length < i4) {
                this.f7172 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f7172, this.f7174, i3);
            this.f7174 += i3;
        }
    }
}
