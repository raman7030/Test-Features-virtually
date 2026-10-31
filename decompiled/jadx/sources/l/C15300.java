package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܶܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15300 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22357 f46939;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f46940;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f46941;

    public C15300(C22357 c22357, int i, int i2) {
        this.f46939 = c22357;
        this.f46941 = i;
        this.f46940 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36320(C3438 c3438, int i) throws IOException {
        this.f46939.getClass();
        int i2 = this.f46941 - this.f46940;
        if (i >= i2) {
            c3438.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            c3438.m10510(i - i2);
        } else {
            c3438.write(118);
            c3438.m10510(i);
        }
    }
}
