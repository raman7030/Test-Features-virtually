package bin.p000mt.plugin.api.editor;

import android.graphics.Typeface;
import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: loaded from: classes.dex */
public interface TextEditor {
    void deleteText(int i, int i2);

    void ensurePositionVisible(int i);

    void ensurePositionVisible(int i, boolean z);

    void ensurePositionVisibleInCenter(int i);

    void ensurePositionVisibleInCenter(int i, boolean z);

    void ensureSelectionVisible();

    void ensureSelectionVisible(boolean z);

    void ensureSelectionVisibleInCenter();

    void ensureSelectionVisibleInCenter(boolean z);

    void finishLargeBatchEditingMode();

    int getAnotherBracketPosition();

    int[] getBracketPositions();

    BufferedText getBufferedText();

    int getCurrentPageIndex();

    String getFileName();

    String getFilePath();

    int getHighlightColorAt(int i);

    boolean getLineColumnFromPosition(int i, int[] iArr);

    int[] getLineColumnFromPosition(int i);

    int getPageCount();

    int getPositionFromLineColumn(int i, int i2);

    int getRawSelectionEnd();

    int getRawSelectionStart();

    String getSelectedText();

    int getSelectionEnd();

    int getSelectionStart();

    String getSyntaxName();

    int getSyntaxStyleColor(String str);

    int getTabSize();

    Typeface getTypeface();

    boolean hasTextSelected();

    void insertText(int i, CharSequence charSequence);

    boolean isChanged();

    boolean isEditTextView();

    boolean isFocused();

    boolean isIndentWithTabs();

    boolean isPaginationMode();

    boolean isReadOnly();

    int length();

    void pushSelectionToUndoBuffer();

    void replaceText(int i, int i2, CharSequence charSequence);

    void replaceText(int i, int i2, CharSequence charSequence, int i3, int i4);

    boolean requestFocus();

    boolean requestFocusAndShowIME();

    void save(ResultCallback resultCallback);

    void setSelection(int i);

    void setSelection(int i, int i2);

    void showCursor();

    void showFloatingMenu();

    void showFloatingMenu(int i);

    void startLargeBatchEditingMode();

    String subText(int i, int i2);

    void switchToPage(int i, ResultCallback resultCallback);
}
