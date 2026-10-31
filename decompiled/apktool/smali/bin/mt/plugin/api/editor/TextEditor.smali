.class public interface abstract Lbin/mt/plugin/api/editor/TextEditor;
.super Ljava/lang/Object;
.source "TextEditor.java"


# virtual methods
.method public abstract deleteText(II)V
.end method

.method public abstract ensurePositionVisible(I)V
.end method

.method public abstract ensurePositionVisible(IZ)V
.end method

.method public abstract ensurePositionVisibleInCenter(I)V
.end method

.method public abstract ensurePositionVisibleInCenter(IZ)V
.end method

.method public abstract ensureSelectionVisible()V
.end method

.method public abstract ensureSelectionVisible(Z)V
.end method

.method public abstract ensureSelectionVisibleInCenter()V
.end method

.method public abstract ensureSelectionVisibleInCenter(Z)V
.end method

.method public abstract finishLargeBatchEditingMode()V
.end method

.method public abstract getAnotherBracketPosition()I
.end method

.method public abstract getBracketPositions()[I
.end method

.method public abstract getBufferedText()Lbin/mt/plugin/api/editor/BufferedText;
.end method

.method public abstract getCurrentPageIndex()I
.end method

.method public abstract getFileName()Ljava/lang/String;
.end method

.method public abstract getFilePath()Ljava/lang/String;
.end method

.method public abstract getHighlightColorAt(I)I
.end method

.method public abstract getLineColumnFromPosition(I[I)Z
.end method

.method public abstract getLineColumnFromPosition(I)[I
.end method

.method public abstract getPageCount()I
.end method

.method public abstract getPositionFromLineColumn(II)I
.end method

.method public abstract getRawSelectionEnd()I
.end method

.method public abstract getRawSelectionStart()I
.end method

.method public abstract getSelectedText()Ljava/lang/String;
.end method

.method public abstract getSelectionEnd()I
.end method

.method public abstract getSelectionStart()I
.end method

.method public abstract getSyntaxName()Ljava/lang/String;
.end method

.method public abstract getSyntaxStyleColor(Ljava/lang/String;)I
.end method

.method public abstract getTabSize()I
.end method

.method public abstract getTypeface()Landroid/graphics/Typeface;
.end method

.method public abstract hasTextSelected()Z
.end method

.method public abstract insertText(ILjava/lang/CharSequence;)V
.end method

.method public abstract isChanged()Z
.end method

.method public abstract isEditTextView()Z
.end method

.method public abstract isFocused()Z
.end method

.method public abstract isIndentWithTabs()Z
.end method

.method public abstract isPaginationMode()Z
.end method

.method public abstract isReadOnly()Z
.end method

.method public abstract length()I
.end method

.method public abstract pushSelectionToUndoBuffer()V
.end method

.method public abstract replaceText(IILjava/lang/CharSequence;)V
.end method

.method public abstract replaceText(IILjava/lang/CharSequence;II)V
.end method

.method public abstract requestFocus()Z
.end method

.method public abstract requestFocusAndShowIME()Z
.end method

.method public abstract save(Lbin/mt/plugin/api/util/ResultCallback;)V
.end method

.method public abstract setSelection(I)V
.end method

.method public abstract setSelection(II)V
.end method

.method public abstract showCursor()V
.end method

.method public abstract showFloatingMenu()V
.end method

.method public abstract showFloatingMenu(I)V
.end method

.method public abstract startLargeBatchEditingMode()V
.end method

.method public abstract subText(II)Ljava/lang/String;
.end method

.method public abstract switchToPage(ILbin/mt/plugin/api/util/ResultCallback;)V
.end method
