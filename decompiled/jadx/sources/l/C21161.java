package l;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: l.᩷᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21161 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f68219;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        f68219 = charSequence.toString();
        C9145.m23520("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        f68219 = charSequence.toString();
        C9145.m23520("openSDK_LOG.CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            C9145.m23518("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
            f68219 = String.valueOf((char) keyEvent.getUnicodeChar());
            C9145.m23513("openSDK_LOG.CaptureInputConnection", "s: " + f68219);
        }
        C9145.m23513("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + f68219);
        return super.sendKeyEvent(keyEvent);
    }
}
