package l;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: l.ۢ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public class C9851 extends C7028 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f29812;

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C9145.m23513("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: " + f29812);
        if (!f29812) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyCode == 66) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyCode == 67) {
                String str = C21161.f68219;
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getUnicodeChar() == 0) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C9145.m23513("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: " + f29812);
        if (!f29812) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4) {
                return super.onKeyDown(i, keyEvent);
            }
            if (keyCode == 66) {
                return super.onKeyDown(i, keyEvent);
            }
            if (keyCode == 67) {
                String str = C21161.f68219;
                return super.onKeyDown(i, keyEvent);
            }
            if (keyEvent.getUnicodeChar() == 0) {
                return super.onKeyDown(i, keyEvent);
            }
            return super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C9145.m23518("openSDK_LOG.SecureWebView", "-->create input connection, is edit: false");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C9145.m23520("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is " + inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection != null) {
            f29812 = true;
            return new C21161(super.onCreateInputConnection(editorInfo), false);
        }
        f29812 = false;
        return inputConnectionOnCreateInputConnection;
    }
}
