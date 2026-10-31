package l;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.tencent.open.c;

/* JADX INFO: renamed from: l.ܳ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14788 extends WebChromeClient {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ c f45158;

    public C14788(c cVar) {
        this.f45158 = cVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null) {
            return false;
        }
        C9145.m23518("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + consoleMessage.message() + " -- From  111 line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
        this.f45158.mo924(consoleMessage.message());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        C9145.m23518("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + str + " -- From 222 line " + i + " of " + str2);
    }
}
