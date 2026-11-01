package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C19061 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C6991 f56870;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C22415 f56871;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f56872;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ int f56873;

    public C19061(C6991 c6991, C22415 c22415, String str, int i) {
        this.f56870 = c6991;
        this.f56871 = c22415;
        this.f56872 = str;
        this.f56873 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43300(long j) throws IOException {
        C6991 c6991 = this.f56870;
        c6991.m16076();
        c6991.m16087();
        try {
            this.f56871.f70699 = c6991.m16093(this.f56872, j == 0);
            return C6991.m16063(this.f56873, c6991.f18204.f34481.m54567());
        } catch (C3406 e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
