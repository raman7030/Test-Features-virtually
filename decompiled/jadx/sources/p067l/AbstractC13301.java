package p067l;

import android.os.StrictMode;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* JADX INFO: renamed from: l.ۨۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13301 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC15094 f37357a;

    static {
        AbstractC15094 c12413;
        if (AbstractC7936.f20817b) {
            FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i = C12413.f34683f;
            if (fileSystemProviderProvider == null) {
                c12413 = null;
            } else {
                c12413 = fileSystemProviderProvider instanceof C8389 ? ((C8389) fileSystemProviderProvider).f22502a : new C12413(fileSystemProviderProvider);
            }
        } else {
            if (AbstractC7936.f20818c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            c12413 = AbstractC12512.f35071a;
        }
        f37357a = c12413;
        c12413.getFileSystem(URI.create("file:///"));
    }
}
