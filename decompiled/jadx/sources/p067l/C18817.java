package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C18817 {

    /* JADX INFO: renamed from: ֫ */
    public long f56197;

    /* JADX INFO: renamed from: ֫ */
    public final void m42870(long j) throws IOException {
        if (j < 0) {
            throw C19644.m44613("Negative checkpoint allocation");
        }
        long jM55743 = C0892.m55743(this.f56197, j);
        if (jM55743 > 67108864) {
            throw C19644.m44613("Checkpoint metadata exceeds memory limit");
        }
        this.f56197 = jM55743;
    }
}
