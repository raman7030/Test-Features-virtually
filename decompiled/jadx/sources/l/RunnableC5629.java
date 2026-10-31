package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.DirectoryStream;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5629 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC5629(DirectoryStream directoryStream) {
        this.b = directoryStream;
    }

    public /* synthetic */ RunnableC5629(C14800 c14800) {
        this.b = c14800;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                DirectoryStream directoryStream = (DirectoryStream) this.b;
                Set set = C17229.a;
                try {
                    directoryStream.close();
                    return;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            default:
                ((C14800) this.b).close();
                return;
        }
    }
}
