package l;

import android.os.StrictMode;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* JADX INFO: renamed from: l.ۨۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11503 {
    public static final AbstractC13389 a;

    static {
        AbstractC13389 c10568;
        if (AbstractC5858.b) {
            FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i = C10568.f;
            if (fileSystemProviderProvider == null) {
                c10568 = null;
            } else {
                c10568 = fileSystemProviderProvider instanceof C6334 ? ((C6334) fileSystemProviderProvider).a : new C10568(fileSystemProviderProvider);
            }
        } else {
            if (AbstractC5858.c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            c10568 = AbstractC10673.a;
        }
        a = c10568;
        c10568.getFileSystem(URI.create("file:///"));
    }
}
