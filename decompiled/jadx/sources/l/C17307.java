package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C17307 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f53016;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40619(long j) throws IOException {
        if (j < 0) {
            throw C18177.m42352("Negative checkpoint allocation");
        }
        long jM3495 = C1005.m3495(this.f53016, j);
        if (jM3495 > 67108864) {
            throw C18177.m42352("Checkpoint metadata exceeds memory limit");
        }
        this.f53016 = jM3495;
    }
}
