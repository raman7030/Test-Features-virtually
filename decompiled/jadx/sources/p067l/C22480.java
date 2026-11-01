package p067l;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: l.᩷᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C22480 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ֫ */
    public static String f70902;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        f70902 = charSequence.toString();
        C11060.m25471("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        f70902 = charSequence.toString();
        C11060.m25471("openSDK_LOG.CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            C11060.m25469("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
            f70902 = String.valueOf((char) keyEvent.getUnicodeChar());
            C11060.m25464("openSDK_LOG.CaptureInputConnection", "s: " + f70902);
        }
        C11060.m25464("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + f70902);
        return super.sendKeyEvent(keyEvent);
    }
}
