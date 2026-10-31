package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17563 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4863 f53680;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21092 f53681;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f53682;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53683;

    public C17563(C4863 c4863, C21092 c21092, String str, int i) {
        this.f53680 = c4863;
        this.f53681 = c21092;
        this.f53682 = str;
        this.f53683 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41054(long j) throws IOException {
        C4863 c4863 = this.f53680;
        c4863.m14195();
        c4863.m14206();
        try {
            this.f53681.f68017 = c4863.m14212(this.f53682, j == 0);
            return C4863.m14182(this.f53683, c4863.f15373.f31519.m52164());
        } catch (C1092 e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
