.class public final Ll/᩶ܰᩳ;
.super Ljava/lang/Object;
.source "PAQN"

# interfaces
.implements Landroid/view/inputmethod/InputConnection;


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩹ܰᩳ;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final beginBatchEdit()Z
    .locals 2

    .line 123
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 251
    invoke-interface {v1}, Landroid/view/inputmethod/InputConnection;->beginBatchEdit()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 123
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final clearMetaKeyStates(I)Z
    .locals 2

    .line 138
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 138
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->clearMetaKeyStates(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final closeConnection()V
    .locals 1

    .line 257
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 259
    invoke-interface {v0}, Landroid/view/inputmethod/InputConnection;->closeConnection()V

    :cond_0
    return-void
.end method

.method public final commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 2

    .line 98
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 98
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 2

    .line 171
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 171
    invoke-interface {v1, p1, p2, p3}, Landroid/view/inputmethod/InputConnection;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 2

    .line 103
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 103
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 93
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 93
    invoke-interface {v1, p1, p2}, Landroid/view/inputmethod/InputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final commitText(Ljava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z
    .locals 2

    .line 196
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 196
    invoke-interface {v1, p1, p2, p3}, Landroid/view/inputmethod/InputConnection;->commitText(Ljava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final deleteSurroundingText(II)Z
    .locals 2

    .line 67
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 67
    invoke-interface {v1, p1, p2}, Landroid/view/inputmethod/InputConnection;->deleteSurroundingText(II)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 2

    .line 73
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 73
    invoke-interface {v1, p1, p2}, Landroid/view/inputmethod/InputConnection;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final endBatchEdit()Z
    .locals 2

    .line 128
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 251
    invoke-interface {v1}, Landroid/view/inputmethod/InputConnection;->endBatchEdit()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 128
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final finishComposingText()Z
    .locals 2

    .line 88
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 251
    invoke-interface {v1}, Landroid/view/inputmethod/InputConnection;->finishComposingText()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 88
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getCursorCapsMode(I)I
    .locals 2

    const/4 v0, 0x0

    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 57
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->getCursorCapsMode(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 62
    invoke-interface {v0, p1, p2}, Landroid/view/inputmethod/InputConnection;->getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getHandler()Landroid/os/Handler;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 251
    invoke-interface {v0}, Landroid/view/inputmethod/InputConnection;->getHandler()Landroid/os/Handler;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getSelectedText(I)Ljava/lang/CharSequence;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 52
    invoke-interface {v0, p1}, Landroid/view/inputmethod/InputConnection;->getSelectedText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    return-object p1
.end method

.method public final getSurroundingText(III)Landroid/view/inputmethod/SurroundingText;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 178
    invoke-interface {v0, p1, p2, p3}, Landroid/view/inputmethod/InputConnection;->getSurroundingText(III)Landroid/view/inputmethod/SurroundingText;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 47
    invoke-interface {v0, p1, p2}, Landroid/view/inputmethod/InputConnection;->getTextAfterCursor(II)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    return-object p1
.end method

.method public final getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 41
    invoke-interface {v0, p1, p2}, Landroid/view/inputmethod/InputConnection;->getTextBeforeCursor(II)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    return-object p1
.end method

.method public final performContextMenuAction(I)Z
    .locals 2

    .line 118
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 118
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->performContextMenuAction(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final performEditorAction(I)Z
    .locals 2

    .line 113
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 113
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->performEditorAction(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 257
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 208
    invoke-interface {v0, p1, p2, p3}, Landroid/view/inputmethod/InputConnection;->performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V

    :cond_0
    return-void
.end method

.method public final performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 2

    .line 148
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 148
    invoke-interface {v1, p1, p2}, Landroid/view/inputmethod/InputConnection;->performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final performSpellCheck()Z
    .locals 2

    .line 202
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 251
    invoke-interface {v1}, Landroid/view/inputmethod/InputConnection;->performSpellCheck()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 202
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 2

    .line 214
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 214
    invoke-interface {v1, p1, p2}, Landroid/view/inputmethod/InputConnection;->previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final replaceText(IILjava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z
    .locals 8

    .line 245
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/view/inputmethod/InputConnection;

    if-eqz v2, :cond_0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move-object v7, p5

    .line 245
    invoke-interface/range {v2 .. v7}, Landroid/view/inputmethod/InputConnection;->replaceText(IILjava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final reportFullscreenMode(Z)Z
    .locals 2

    .line 143
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 143
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->reportFullscreenMode(Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final requestCursorUpdates(I)Z
    .locals 2

    .line 153
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 153
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->requestCursorUpdates(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final requestCursorUpdates(II)Z
    .locals 2

    .line 220
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 220
    invoke-interface {v1, p1, p2}, Landroid/view/inputmethod/InputConnection;->requestCursorUpdates(II)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final requestTextBoundsInfo(Landroid/graphics/RectF;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V
    .locals 1

    .line 257
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 226
    invoke-interface {v0, p1, p2, p3}, Landroid/view/inputmethod/InputConnection;->requestTextBoundsInfo(Landroid/graphics/RectF;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 133
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 133
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final setComposingRegion(II)Z
    .locals 2

    .line 83
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 83
    invoke-interface {v1, p1, p2}, Landroid/view/inputmethod/InputConnection;->setComposingRegion(II)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final setComposingRegion(IILandroid/view/inputmethod/TextAttribute;)Z
    .locals 2

    .line 190
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 190
    invoke-interface {v1, p1, p2, p3}, Landroid/view/inputmethod/InputConnection;->setComposingRegion(IILandroid/view/inputmethod/TextAttribute;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 78
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 78
    invoke-interface {v1, p1, p2}, Landroid/view/inputmethod/InputConnection;->setComposingText(Ljava/lang/CharSequence;I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final setComposingText(Ljava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z
    .locals 2

    .line 184
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 184
    invoke-interface {v1, p1, p2, p3}, Landroid/view/inputmethod/InputConnection;->setComposingText(Ljava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final setImeConsumesInput(Z)Z
    .locals 2

    .line 232
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 232
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->setImeConsumesInput(Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final setSelection(II)Z
    .locals 2

    .line 108
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    iget-object v1, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v1, :cond_0

    .line 108
    invoke-interface {v1, p1, p2}, Landroid/view/inputmethod/InputConnection;->setSelection(II)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final takeSnapshot()Landroid/view/inputmethod/TextSnapshot;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/᩶ܰᩳ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputConnection;

    if-eqz v0, :cond_0

    .line 251
    invoke-interface {v0}, Landroid/view/inputmethod/InputConnection;->takeSnapshot()Landroid/view/inputmethod/TextSnapshot;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
