package l;

import android.graphics.Typeface;
import bin.mt.plugin.api.editor.BufferedText;
import bin.mt.plugin.api.editor.TextEditor;
import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܿ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17351 implements TextEditor {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f53148;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21856 f53149;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12392 f53150;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f53151;

    public C17351(C12392 c12392) {
        this.f53150 = c12392;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void showCursor() {
        this.f53150.m30400();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisible(int i) {
        ensurePositionVisible(i, false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisibleInCenter(int i) {
        ensurePositionVisibleInCenter(i, false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisible() {
        ensureSelectionVisible(false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisibleInCenter() {
        ensureSelectionVisibleInCenter(false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void replaceText(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f53151) {
            C21856 c21856 = this.f53149;
            c21856.delete(i, i2);
            c21856.m49243(i, i3, i4, charSequence);
            return;
        }
        this.f53150.m30436().replace(i, i2, charSequence, i3, i4);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void deleteText(int i, int i2) {
        replaceText(i, i2, "", 0, 0);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void replaceText(int i, int i2, CharSequence charSequence) {
        replaceText(i, i2, charSequence, 0, charSequence.length());
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void insertText(int i, CharSequence charSequence) {
        replaceText(i, i, charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40673(C17351 c17351) {
        if (!c17351.f53151 || c17351.f53149.m49245() == 0) {
            return;
        }
        c17351.f53149.m49244();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisible(int i, boolean z) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        this.f53150.m30349(i, z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensurePositionVisibleInCenter(int i, boolean z) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        this.f53150.m30427(i, z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisible(boolean z) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        this.f53150.m30430(z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void ensureSelectionVisibleInCenter(boolean z) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        this.f53150.m30478(z);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getAnotherBracketPosition() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        C12392 c12392 = this.f53150;
        int iM30444 = c12392.m30444();
        if (iM30444 == c12392.m30448()) {
            return c12392.f37315.m52251(iM30444);
        }
        return -1;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int[] getBracketPositions() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        C12392 c12392 = this.f53150;
        int iM30444 = c12392.m30444();
        if (iM30444 == c12392.m30448()) {
            return c12392.f37315.m52260(iM30444);
        }
        return null;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final BufferedText getBufferedText() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        return new C18057(this);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean getLineColumnFromPosition(int i, int[] iArr) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        return this.f53150.m30350(i, iArr);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int[] getLineColumnFromPosition(int i) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        int[] iArr = new int[2];
        if (this.f53150.m30350(i, iArr)) {
            return iArr;
        }
        return null;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getPositionFromLineColumn(int i, int i2) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        return this.f53150.m30471(i, i2);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getRawSelectionEnd() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        return this.f53150.m30448();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getRawSelectionStart() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        return this.f53150.m30444();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getSelectedText() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        C12392 c12392 = this.f53150;
        int iM30444 = c12392.m30444();
        int iM30448 = c12392.m30448();
        if (iM30444 == iM30448) {
            return "";
        }
        if (iM30444 < iM30448) {
            return subText(iM30444, iM30448);
        }
        return subText(iM30448, iM30444);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getSelectionEnd() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        C12392 c12392 = this.f53150;
        return Math.max(c12392.m30444(), c12392.m30448());
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getSelectionStart() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        C12392 c12392 = this.f53150;
        return Math.min(c12392.m30444(), c12392.m30448());
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean hasTextSelected() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        C12392 c12392 = this.f53150;
        return c12392.m30444() != c12392.m30448();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int length() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        return this.f53150.m30526();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void pushSelectionToUndoBuffer() {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        this.f53150.m30501(false);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void setSelection(int i) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        this.f53150.mo25919(i);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void setSelection(int i, int i2) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        this.f53150.mo25922(i, i2);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String subText(int i, int i2) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        return this.f53150.m30436().mo26557(i, i2);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void switchToPage(int i, ResultCallback resultCallback) {
        if (this.f53151 && this.f53149.m49245() != 0) {
            this.f53149.m49244();
        }
        this.f53150.m30468().mo33116(i, resultCallback);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void startLargeBatchEditingMode() {
        if (this.f53151) {
            throw new IllegalStateException();
        }
        this.f53151 = true;
        C12392 c12392 = this.f53150;
        this.f53148 = c12392.m30436();
        this.f53149 = new C16645(this, c12392.m30436());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void finishLargeBatchEditingMode() {
        C12392 c12392 = this.f53150;
        if (!this.f53151) {
            throw new IllegalStateException();
        }
        try {
            this.f53149.m49244();
        } finally {
            this.f53149 = null;
            this.f53151 = false;
            if (c12392.m30436() == this.f53148 && c12392.f37211) {
                c12392.m30397();
            }
            this.f53148 = null;
        }
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isPaginationMode() {
        return this.f53150.m30468().mo33117();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getPageCount() {
        return this.f53150.m30468().mo33118();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getCurrentPageIndex() {
        return this.f53150.m30468().mo33115();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isReadOnly() {
        return this.f53150.m30441();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getTabSize() {
        return this.f53150.f37245.m24485();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isIndentWithTabs() {
        return this.f53150.m30529();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void showFloatingMenu() {
        this.f53150.m30299(-1);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void showFloatingMenu(int i) {
        if (i < -1) {
            i = -1;
        }
        this.f53150.m30299(i);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getHighlightColorAt(int i) {
        C12392 c12392 = this.f53150;
        int iM30526 = c12392.m30526();
        if (i < 0 || i >= iM30526) {
            throw new IndexOutOfBoundsException(C18307.m42646("Index: ", i, iM30526, ", Length: "));
        }
        return c12392.m30304(i);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getSyntaxName() {
        return this.f53150.f37235.m18573();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final Typeface getTypeface() {
        return this.f53150.f37245.f29058.getTypeface();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getFileName() {
        return this.f53150.m30468().mo8403();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final String getFilePath() {
        return this.f53150.m30468().mo22096();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isChanged() {
        return this.f53150.m30468().mo22097();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final void save(ResultCallback resultCallback) {
        this.f53150.m30468().mo22095(resultCallback);
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isFocused() {
        return this.f53150.isFocused();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean requestFocus() {
        return this.f53150.requestFocus();
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean requestFocusAndShowIME() {
        C12392 c12392 = this.f53150;
        if (!c12392.isFocusable() || !c12392.isEnabled() || c12392.m30441() || c12392.getVisibility() != 0) {
            return false;
        }
        if (c12392.isAttachedToWindow() && c12392.isLaidOut()) {
            C4925.m14334(c12392);
            return true;
        }
        C4925.m14329(c12392);
        return true;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final boolean isEditTextView() {
        return this.f53150 instanceof C10235;
    }

    @Override // bin.mt.plugin.api.editor.TextEditor
    public final int getSyntaxStyleColor(String str) {
        C12392 c12392 = this.f53150;
        C6870 c6870 = c12392.f37235;
        C22686 c22686 = c12392.f37245;
        if (c22686.f73267 && c6870.m18575()) {
            return c6870.m18601().m35651(C4900.m14260(str)).m49205();
        }
        return c22686.m24492();
    }
}
