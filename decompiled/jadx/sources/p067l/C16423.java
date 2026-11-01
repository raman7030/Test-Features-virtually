package p067l;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.tencent.open.AbstractDialogC0627c;

/* JADX INFO: renamed from: l.ܳ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16423 extends WebChromeClient {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractDialogC0627c f48272;

    public C16423(AbstractDialogC0627c abstractDialogC0627c) {
        this.f48272 = abstractDialogC0627c;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null) {
            return false;
        }
        C11060.m25469("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + consoleMessage.message() + " -- From  111 line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
        this.f48272.mo2039(consoleMessage.message());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        C11060.m25469("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + str + " -- From 222 line " + i + " of " + str2);
    }
}
