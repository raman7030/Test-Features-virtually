package p067l;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: l.ᩳ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19217 extends FileLock {

    /* JADX INFO: renamed from: a */
    public final FileLock f57420a;

    public C19217(FileLock fileLock, C17875 c17875) {
        super(c17875, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.f57420a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.f57420a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() throws IOException {
        this.f57420a.release();
    }
}
