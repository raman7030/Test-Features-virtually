package l;

import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: l.ᩳ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17728 extends FileLock {
    public final FileLock a;

    public C17728(FileLock fileLock, C16316 c16316) {
        super(c16316, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() throws IOException {
        this.a.release();
    }
}
