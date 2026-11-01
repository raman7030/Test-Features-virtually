package p067l;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SurroundingText;
import android.view.inputmethod.TextAttribute;
import android.view.inputmethod.TextSnapshot;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩶ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAQN */
/* JADX INFO: loaded from: classes4.dex */
public final class InputConnectionC21580 implements InputConnection {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f68051;

    public InputConnectionC21580(C23591 c23591) {
        this.f68051 = new WeakReference(c23591);
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        return (inputConnection != null ? Integer.valueOf(inputConnection.getCursorCapsMode(i)) : 0).intValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.deleteSurroundingText(i, i2));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.deleteSurroundingTextInCodePoints(i, i2));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.setComposingText(charSequence, i));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.setComposingRegion(i, i2));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.finishComposingText());
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.commitText(charSequence, i));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.commitCompletion(completionInfo));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.commitCorrection(correctionInfo));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.setSelection(i, i2));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.performEditorAction(i));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.performContextMenuAction(i));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.beginBatchEdit());
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.endBatchEdit());
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.sendKeyEvent(keyEvent));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.clearMetaKeyStates(i));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.reportFullscreenMode(z));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.performPrivateCommand(str, bundle));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.requestCursorUpdates(i));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.commitContent(inputContentInfo, i, bundle));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.setComposingText(charSequence, i, textAttribute));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2, TextAttribute textAttribute) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.setComposingRegion(i, i2, textAttribute));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.commitText(charSequence, i, textAttribute));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performSpellCheck() {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.performSpellCheck());
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i, int i2) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.requestCursorUpdates(i, i2));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setImeConsumesInput(boolean z) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.setImeConsumesInput(z));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean replaceText(int i, int i2, CharSequence charSequence, int i3, TextAttribute textAttribute) {
        Boolean boolValueOf = Boolean.FALSE;
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            boolValueOf = Boolean.valueOf(inputConnection.replaceText(i, i2, charSequence, i3, textAttribute));
        }
        return boolValueOf.booleanValue();
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        return inputConnection != null ? inputConnection.getSelectedText(i) : "";
    }

    @Override // android.view.inputmethod.InputConnection
    public final SurroundingText getSurroundingText(int i, int i2, int i3) {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            return inputConnection.getSurroundingText(i, i2, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        return inputConnection != null ? inputConnection.getTextAfterCursor(i, i2) : "";
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        return inputConnection != null ? inputConnection.getTextBeforeCursor(i, i2) : "";
    }

    @Override // android.view.inputmethod.InputConnection
    public final TextSnapshot takeSnapshot() {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            return inputConnection.takeSnapshot();
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            inputConnection.closeConnection();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            inputConnection.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final void requestTextBoundsInfo(RectF rectF, Executor executor, Consumer consumer) {
        InputConnection inputConnection = (InputConnection) this.f68051.get();
        if (inputConnection != null) {
            inputConnection.requestTextBoundsInfo(rectF, executor, consumer);
        }
    }
}
