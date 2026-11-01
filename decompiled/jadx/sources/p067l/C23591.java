package p067l;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SurroundingText;
import android.view.inputmethod.TextAttribute;
import android.view.inputmethod.TextSnapshot;
import java.p066io.UncheckedIOException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZM */
/* JADX INFO: loaded from: classes.dex */
public final class C23591 extends BaseInputConnection {

    /* JADX INFO: renamed from: ֫ */
    public long f75104;

    /* JADX INFO: renamed from: ۜ */
    public int f75105;

    /* JADX INFO: renamed from: ۧ */
    public final C14146 f75106;

    /* JADX INFO: renamed from: ܳ */
    public long f75107;

    /* JADX INFO: renamed from: ܽ */
    public final int f75108;

    /* JADX INFO: renamed from: ܿ */
    public C12863 f75109;

    /* JADX INFO: renamed from: ᩳ */
    public long f75110;

    /* JADX INFO: renamed from: ᩻ */
    public long f75111;

    public C23591(C14146 c14146, int i) {
        super(c14146, true);
        this.f75106 = c14146;
        this.f75108 = i;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        if (!m52397()) {
            return null;
        }
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            return super.getTextBeforeCursor(Math.min(i, 10000), i2);
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        if (!m52397()) {
            return null;
        }
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            return super.getTextAfterCursor(Math.min(i, 10000), i2);
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (!m52397()) {
            return null;
        }
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            int iMin = Math.min(c14146.m32508(), c14146.m32512());
            int iMax = Math.max(c14146.m32508(), c14146.m32512());
            if (iMin < 0 || ((long) iMax) - ((long) iMin) <= 10000) {
                return super.getSelectedText(i);
            }
            int i2 = iMin + 10000;
            return (i & 1) != 0 ? interfaceC9768M32500.subSequence(iMin, i2) : TextUtils.substring(interfaceC9768M32500, iMin, i2);
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final SurroundingText getSurroundingText(int i, int i2, int i3) {
        if (!m52397()) {
            return null;
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Surrounding text lengths must be nonnegative");
        }
        C14146 c14146 = this.f75106;
        if (Math.abs(((long) c14146.m32512()) - ((long) c14146.m32508())) > 10000) {
            return null;
        }
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            return super.getSurroundingText(Math.min(i, 10000), Math.min(i2, 10000), i3);
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final TextSnapshot takeSnapshot() {
        if (!m52397()) {
            return null;
        }
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            return super.takeSnapshot();
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return new C21839(this.f75106, this.f75108);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!m52398()) {
            return false;
        }
        this.f75106.m32518();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        if (!m52397()) {
            return false;
        }
        this.f75106.m32598();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        C14146 c14146 = this.f75106;
        if (!m52398()) {
            return false;
        }
        try {
            C14146.f40186.clearMetaKeyState(c14146, getEditable(), i);
            c14146.m32464();
            c14146.invalidate();
            return true;
        } catch (AbstractMethodError unused) {
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        try {
            this.f75106.f40300.remove(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (!m52398()) {
                return false;
            }
            c14146.m32530(i);
            return !c14146.m32505();
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            ExtractedText extractedText = new ExtractedText();
            if (c14146.m32415(extractedTextRequest, extractedText)) {
                if (c14146.m32501()) {
                    InterfaceC9768 interfaceC9768M32501 = c14146.m32500();
                    this.f75109 = new C12863(extractedText.startOffset, extractedText.selectionStart, extractedText.selectionEnd, extractedText.text.length(), c14146.m32508(), c14146.m32512(), c14146.m32590(), interfaceC9768M32501, interfaceC9768M32501.mo28581());
                    this.f75107 = SystemClock.uptimeMillis();
                    return extractedText;
                }
                this.f75109 = null;
                return extractedText;
            }
            this.f75109 = null;
            return null;
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (!m52398()) {
                return false;
            }
            if (charSequence == null) {
                charSequence = "";
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f75110 = jUptimeMillis;
            if (charSequence.length() == 0 && i == 1 && c14146.m32508() != c14146.m32512()) {
                this.f75104 = jUptimeMillis;
            }
            C12863 c12863 = this.f75109;
            if (c12863 != null && c12863.f36195 > 0 && charSequence.length() == 2 && i == 1) {
                this.f75111 = jUptimeMillis;
                this.f75105 = c14146.m32508();
            }
            return super.commitText(charSequence, i);
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (m52398()) {
                return super.setComposingText(charSequence, i);
            }
            return false;
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean replaceText(int i, int i2, CharSequence charSequence, int i3, TextAttribute textAttribute) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (m52398()) {
                return super.replaceText(i, i2, charSequence, i3, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (!m52398()) {
                return false;
            }
            if (i == 1 && i2 == 0 && SystemClock.uptimeMillis() - this.f75104 < 100) {
                return false;
            }
            return super.deleteSurroundingText(i, i2);
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (m52398()) {
                return super.deleteSurroundingTextInCodePoints(i, i2);
            }
            return false;
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (!m52398()) {
                return false;
            }
            int iM52396 = m52396(i, i2);
            if (iM52396 != 0) {
                i += iM52396;
                i2 += iM52396;
            }
            return super.setComposingRegion(i, i2);
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!m52397()) {
            return false;
        }
        Editable editable = getEditable();
        C14146 c14146 = this.f75106;
        c14146.m32518();
        try {
            BaseInputConnection.removeComposingSpans(editable);
            return true;
        } finally {
            c14146.m32598();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        if (m52398()) {
            return super.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        if (m52398()) {
            return super.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        int iM32590 = i;
        int iM32591 = i2;
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (!m52398()) {
                return false;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (iM32590 == 1 && iM32591 == 1 && jUptimeMillis - this.f75111 < 100) {
                iM32590 = this.f75105 + 1;
                iM32591 = iM32590;
            } else {
                C12863 c12863 = this.f75109;
                if (c12863 != null && jUptimeMillis - this.f75107 < 100) {
                    int i3 = c12863.f36197;
                    int i4 = c12863.f36198;
                    int i5 = c12863.f36195;
                    int i6 = c12863.f36193;
                    if (i5 != 0 && (Math.abs(iM32590 - i3) < 10 || Math.abs(iM32590 - i4) < 10)) {
                        iM32590 += i5;
                    } else if (iM32590 == i5 + i6 || iM32590 == i6) {
                        iM32590 = c14146.m32590();
                    }
                    if (i5 != 0 && (Math.abs(iM32591 - i3) < 10 || Math.abs(iM32591 - i4) < 10)) {
                        iM32591 += i5;
                    } else if (iM32591 == i5 + i6 || iM32591 == i6) {
                        iM32591 = c14146.m32590();
                    }
                }
            }
            if (!super.setSelection(iM32590, iM32591)) {
                return false;
            }
            if (iM32590 == iM32591) {
                c14146.m32464();
            }
            c14146.m32413(iM32591, false);
            if (jUptimeMillis - this.f75110 >= 100) {
                return true;
            }
            c14146.m32565(false);
            return true;
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        if (m52398()) {
            return super.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (m52398()) {
            return super.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        if (m52398()) {
            return super.reportFullscreenMode(z);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        if (m52398()) {
            return super.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        if (!m52397() || i < 0 || i > 3) {
            return false;
        }
        this.f75106.m32604(i, 0);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (m52398()) {
            return super.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (m52398()) {
                return super.setComposingText(charSequence, i, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2, TextAttribute textAttribute) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (m52398()) {
                return setComposingRegion(i, i2);
            }
            return false;
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (m52398()) {
                return super.commitText(charSequence, i, textAttribute);
            }
            return false;
        } catch (UncheckedIOException | C6138 e) {
            if (c14146.m32421(interfaceC9768M32500, e)) {
                return false;
            }
            throw e;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performSpellCheck() {
        if (m52398()) {
            return super.performSpellCheck();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (m52398()) {
            super.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (m52398()) {
            return super.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i, int i2) {
        if (!m52397() || i < 0 || i > 3) {
            return false;
        }
        this.f75106.m32604(i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void requestTextBoundsInfo(RectF rectF, Executor executor, Consumer consumer) {
        if (m52398()) {
            super.requestTextBoundsInfo(rectF, executor, consumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setImeConsumesInput(boolean z) {
        if (m52398()) {
            return super.setImeConsumesInput(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m52396(int i, int i2) {
        C12863 c12863 = this.f75109;
        if (c12863 == null) {
            return 0;
        }
        C14146 c14146 = this.f75106;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        return c12863.m29483(i, i2, c14146.m32508(), c14146.m32512(), c14146.m32590(), interfaceC9768M32500, interfaceC9768M32500.mo28581());
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m52398() {
        return this.f75106.m32552(this.f75108);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m52397() {
        return this.f75106.m32566(this.f75108);
    }
}
