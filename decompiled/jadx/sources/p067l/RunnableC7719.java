package p067l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.p066io.UncheckedIOException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7719 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20244a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20245b;

    public /* synthetic */ RunnableC7719(DirectoryStream directoryStream) {
        this.f20245b = directoryStream;
    }

    public /* synthetic */ RunnableC7719(C16435 c16435) {
        this.f20245b = c16435;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20244a) {
            case 0:
                DirectoryStream directoryStream = (DirectoryStream) this.f20245b;
                Set set = C18743.f56028a;
                try {
                    directoryStream.close();
                    return;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            default:
                ((C16435) this.f20245b).close();
                return;
        }
    }
}
