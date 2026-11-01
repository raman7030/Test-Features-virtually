package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܶܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16909 {

    /* JADX INFO: renamed from: ֫ */
    public final C23616 f50065;

    /* JADX INFO: renamed from: ۧ */
    public final int f50066;

    /* JADX INFO: renamed from: ܽ */
    public final int f50067;

    public C16909(C23616 c23616, int i, int i2) {
        this.f50065 = c23616;
        this.f50067 = i;
        this.f50066 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38481(C5636 c5636, int i) throws IOException {
        this.f50065.getClass();
        int i2 = this.f50067 - this.f50066;
        if (i >= i2) {
            c5636.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            c5636.m12534(i - i2);
        } else {
            c5636.write(118);
            c5636.m12534(i);
        }
    }
}
