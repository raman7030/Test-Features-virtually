package p067l;

import android.graphics.Typeface;
import bin.p000mt.plugin.api.editor.BufferedText;
import bin.p000mt.plugin.api.editor.TextEditor;
import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܿ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C18859 implements TextEditor {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9768 f56332;

    /* JADX INFO: renamed from: ۧ */
    public C23141 f56333;

    /* JADX INFO: renamed from: ܽ */
    public final C14146 f56334;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f56335;

    public C18859(C14146 c14146) {
        this.f56334 = c14146;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void showCursor() {
        this.f56334.m32464();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisible(int i) {
        ensurePositionVisible(i, false);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisibleInCenter(int i) {
        ensurePositionVisibleInCenter(i, false);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisible() {
        ensureSelectionVisible(false);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisibleInCenter() {
        ensureSelectionVisibleInCenter(false);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void replaceText(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f56335) {
            C23141 c23141 = this.f56333;
            c23141.delete(i, i2);
            c23141.m51594(i, i3, i4, charSequence);
            return;
        }
        this.f56334.m32500().replace(i, i2, charSequence, i3, i4);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void deleteText(int i, int i2) {
        replaceText(i, i2, "", 0, 0);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void replaceText(int i, int i2, CharSequence charSequence) {
        replaceText(i, i2, charSequence, 0, charSequence.length());
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void insertText(int i, CharSequence charSequence) {
        replaceText(i, i, charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m42925(C18859 c18859) {
        if (!c18859.f56335 || c18859.f56333.m51596() == 0) {
            return;
        }
        c18859.f56333.m51595();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisible(int i, boolean z) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        this.f56334.m32413(i, z);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisibleInCenter(int i, boolean z) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        this.f56334.m32491(i, z);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisible(boolean z) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        this.f56334.m32494(z);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisibleInCenter(boolean z) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        this.f56334.m32542(z);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getAnotherBracketPosition() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        C14146 c14146 = this.f56334;
        int iM32508 = c14146.m32508();
        if (iM32508 == c14146.m32512()) {
            return c14146.f40332.m54655(iM32508);
        }
        return -1;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int[] getBracketPositions() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        C14146 c14146 = this.f56334;
        int iM32508 = c14146.m32508();
        if (iM32508 == c14146.m32512()) {
            return c14146.f40332.m54664(iM32508);
        }
        return null;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final BufferedText getBufferedText() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        return new C19530(this);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean getLineColumnFromPosition(int i, int[] iArr) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        return this.f56334.m32414(i, iArr);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int[] getLineColumnFromPosition(int i) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        int[] iArr = new int[2];
        if (this.f56334.m32414(i, iArr)) {
            return iArr;
        }
        return null;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getPositionFromLineColumn(int i, int i2) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        return this.f56334.m32535(i, i2);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getRawSelectionEnd() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        return this.f56334.m32512();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getRawSelectionStart() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        return this.f56334.m32508();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final String getSelectedText() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        C14146 c14146 = this.f56334;
        int iM32508 = c14146.m32508();
        int iM32512 = c14146.m32512();
        if (iM32508 == iM32512) {
            return "";
        }
        if (iM32508 < iM32512) {
            return subText(iM32508, iM32512);
        }
        return subText(iM32512, iM32508);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getSelectionEnd() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        C14146 c14146 = this.f56334;
        return Math.max(c14146.m32508(), c14146.m32512());
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getSelectionStart() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        C14146 c14146 = this.f56334;
        return Math.min(c14146.m32508(), c14146.m32512());
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean hasTextSelected() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        C14146 c14146 = this.f56334;
        return c14146.m32508() != c14146.m32512();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int length() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        return this.f56334.m32590();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void pushSelectionToUndoBuffer() {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        this.f56334.m32565(false);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void setSelection(int i) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        this.f56334.mo27941(i);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void setSelection(int i, int i2) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        this.f56334.mo27944(i, i2);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final String subText(int i, int i2) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        return this.f56334.m32500().mo28590(i, i2);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void switchToPage(int i, ResultCallback resultCallback) {
        if (this.f56335 && this.f56333.m51596() != 0) {
            this.f56333.m51595();
        }
        this.f56334.m32532().mo35232(i, resultCallback);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void startLargeBatchEditingMode() {
        if (this.f56335) {
            throw new IllegalStateException();
        }
        this.f56335 = true;
        C14146 c14146 = this.f56334;
        this.f56332 = c14146.m32500();
        this.f56333 = new C18188(this, c14146.m32500());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void finishLargeBatchEditingMode() {
        C14146 c14146 = this.f56334;
        if (!this.f56335) {
            throw new IllegalStateException();
        }
        try {
            this.f56333.m51595();
        } finally {
            this.f56333 = null;
            this.f56335 = false;
            if (c14146.m32500() == this.f56332 && c14146.f40228) {
                c14146.m32461();
            }
            this.f56332 = null;
        }
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean isPaginationMode() {
        return this.f56334.m32532().mo35233();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getPageCount() {
        return this.f56334.m32532().mo35234();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getCurrentPageIndex() {
        return this.f56334.m32532().mo35231();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean isReadOnly() {
        return this.f56334.m32505();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getTabSize() {
        return this.f56334.f40262.m26497();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean isIndentWithTabs() {
        return this.f56334.m32593();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void showFloatingMenu() {
        this.f56334.m32363(-1);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void showFloatingMenu(int i) {
        if (i < -1) {
            i = -1;
        }
        this.f56334.m32363(i);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getHighlightColorAt(int i) {
        C14146 c14146 = this.f56334;
        int iM32590 = c14146.m32590();
        if (i < 0 || i >= iM32590) {
            throw new IndexOutOfBoundsException(C19768.m44907("Index: ", i, iM32590, ", Length: "));
        }
        return c14146.m32368(i);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final String getSyntaxName() {
        return this.f56334.f40252.m20522();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final Typeface getTypeface() {
        return this.f56334.f40262.f32005.getTypeface();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final String getFileName() {
        return this.f56334.m32532().mo10449();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final String getFilePath() {
        return this.f56334.m32532().mo24066();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean isChanged() {
        return this.f56334.m32532().mo24067();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final void save(ResultCallback resultCallback) {
        this.f56334.m32532().mo24065(resultCallback);
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean isFocused() {
        return this.f56334.isFocused();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean requestFocus() {
        return this.f56334.requestFocus();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean requestFocusAndShowIME() {
        C14146 c14146 = this.f56334;
        if (!c14146.isFocusable() || !c14146.isEnabled() || c14146.m32505() || c14146.getVisibility() != 0) {
            return false;
        }
        if (c14146.isAttachedToWindow() && c14146.isLaidOut()) {
            C7050.m16231(c14146);
            return true;
        }
        C7050.m16226(c14146);
        return true;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final boolean isEditTextView() {
        return this.f56334 instanceof C12096;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditor
    public final int getSyntaxStyleColor(String str) {
        C14146 c14146 = this.f56334;
        C8898 c8898 = c14146.f40252;
        C23929 c23929 = c14146.f40262;
        if (c23929.f75992 && c8898.m20524()) {
            return c8898.m20550().m37809(C7026.m16157(str)).m51556();
        }
        return c23929.m26504();
    }
}
