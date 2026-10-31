.class public final Ll/᩹ܰᩳ;
.super Landroid/view/inputmethod/BaseInputConnection;
.source "05ZM"


# instance fields
.field public ֫:J

.field public ۜ:I

.field public final ۧ:Ll/۫ۨᩳ;

.field public ܳ:J

.field public final ܽ:I

.field public ܿ:Ll/ۧܰᩳ;

.field public ᩳ:J

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;I)V
    .locals 1

    const/4 v0, 0x1

    .line 45
    invoke-direct {p0, p1, v0}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 46
    iput-object p1, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    .line 47
    iput p2, p0, Ll/᩹ܰᩳ;->ܽ:I

    return-void
.end method

.method private ֫(II)I
    .locals 8

    .line 615
    iget-object v0, p0, Ll/᩹ܰᩳ;->ܿ:Ll/ۧܰᩳ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 619
    :cond_0
    iget-object v1, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v6

    .line 623
    invoke-virtual {v1}, Ll/۫ۨᩳ;->۫֫()I

    move-result v3

    .line 624
    invoke-virtual {v1}, Ll/۫ۨᩳ;->۬֫()I

    move-result v4

    .line 625
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v5

    .line 627
    invoke-interface {v6}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v7

    move v1, p1

    move v2, p2

    .line 620
    invoke-virtual/range {v0 .. v7}, Ll/ۧܰᩳ;->֫(IIIIILl/۟᩺ᩳ;I)I

    move-result p1

    return p1
.end method

.method private ֫()Z
    .locals 2

    .line 636
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    iget v1, p0, Ll/᩹ܰᩳ;->ܽ:I

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ᩳ(I)Z

    move-result v0

    return v0
.end method

.method private ۧ()Z
    .locals 2

    .line 632
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    iget v1, p0, Ll/᩹ܰᩳ;->ܽ:I

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ܿ(I)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final beginBatchEdit()Z
    .locals 1

    .line 137
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 140
    :cond_0
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܳ()V

    const/4 v0, 0x1

    return v0
.end method

.method public final clearMetaKeyStates(I)Z
    .locals 3

    .line 156
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 159
    :cond_0
    invoke-virtual {p0}, Ll/᩹ܰᩳ;->getEditable()Landroid/text/Editable;

    move-result-object v1

    .line 162
    sget-object v2, Ll/۫ۨᩳ;->᩻ܿ:Landroid/text/method/TextKeyListener;

    .line 164
    :try_start_0
    invoke-interface {v2, v0, v1, p1}, Landroid/text/method/KeyListener;->clearMetaKeyState(Landroid/view/View;Landroid/text/Editable;I)V

    .line 165
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۟ܽ()V

    .line 166
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x1

    return p1
.end method

.method public final closeConnection()V
    .locals 1

    .line 176
    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->closeConnection()V

    .line 178
    :try_start_0
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    iget-object v0, v0, Ll/۫ۨᩳ;->ᩳ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 1

    .line 387
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 390
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z

    move-result p1

    return p1
.end method

.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 1

    .line 502
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 505
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/BaseInputConnection;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 1

    .line 395
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 398
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z

    move-result p1

    return p1
.end method

.method public final commitText(Ljava/lang/CharSequence;I)Z
    .locals 8

    .line 255
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    .line 257
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    if-nez p1, :cond_1

    const-string p1, ""

    .line 264
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    .line 265
    iput-wide v3, p0, Ll/᩹ܰᩳ;->ᩳ:J

    .line 266
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_2

    if-ne p2, v6, :cond_2

    .line 267
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v5

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v7

    if-eq v5, v7, :cond_2

    .line 269
    iput-wide v3, p0, Ll/᩹ܰᩳ;->֫:J

    .line 272
    :cond_2
    iget-object v5, p0, Ll/᩹ܰᩳ;->ܿ:Ll/ۧܰᩳ;

    if-eqz v5, :cond_3

    iget v5, v5, Ll/ۧܰᩳ;->ܳ:I

    if-lez v5, :cond_3

    .line 274
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v7, 0x2

    if-ne v5, v7, :cond_3

    if-ne p2, v6, :cond_3

    .line 276
    iput-wide v3, p0, Ll/᩹ܰᩳ;->᩻:J

    .line 277
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v3

    iput v3, p0, Ll/᩹ܰᩳ;->ۜ:I

    .line 279
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 281
    :goto_0
    invoke-virtual {v0, v1, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_4

    return v2

    :cond_4
    throw p1
.end method

.method public final commitText(Ljava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z
    .locals 4

    .line 542
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    .line 544
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    return v2

    .line 547
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/BaseInputConnection;->commitText(Ljava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 549
    :goto_0
    invoke-virtual {v0, v1, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_1

    return v2

    :cond_1
    throw p1
.end method

.method public final deleteSurroundingText(II)Z
    .locals 8

    .line 316
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    .line 318
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    if-nez p2, :cond_1

    .line 321
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Ll/᩹ܰᩳ;->֫:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x64

    cmp-long v7, v3, v5

    if-gez v7, :cond_1

    return v2

    .line 325
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingText(II)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 327
    :goto_0
    invoke-virtual {v0, v1, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_2

    return v2

    :cond_2
    throw p1
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 4

    .line 335
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    .line 337
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    return v2

    .line 340
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 342
    :goto_0
    invoke-virtual {v0, v1, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_1

    return v2

    :cond_1
    throw p1
.end method

.method public final endBatchEdit()Z
    .locals 1

    .line 147
    invoke-direct {p0}, Ll/᩹ܰᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 150
    :cond_0
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩺()V

    const/4 v0, 0x1

    return v0
.end method

.method public final finishComposingText()Z
    .locals 2

    .line 369
    invoke-direct {p0}, Ll/᩹ܰᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 372
    :cond_0
    invoke-virtual {p0}, Ll/᩹ܰᩳ;->getEditable()Landroid/text/Editable;

    move-result-object v0

    .line 375
    iget-object v1, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܳ()V

    .line 377
    :try_start_0
    invoke-static {v0}, Landroid/view/inputmethod/BaseInputConnection;->removeComposingSpans(Landroid/text/Spannable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 379
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩺()V

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩺()V

    .line 380
    throw v0
.end method

.method public final getEditable()Landroid/text/Editable;
    .locals 3

    .line 132
    new-instance v0, Ll/᩶᩺ᩳ;

    iget-object v1, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    iget v2, p0, Ll/᩹ܰᩳ;->ܽ:I

    invoke-direct {v0, v1, v2}, Ll/᩶᩺ᩳ;-><init>(Ll/۫ۨᩳ;I)V

    return-object v0
.end method

.method public final getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 13

    .line 208
    iget-object p2, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    const/4 v1, 0x0

    .line 210
    :try_start_0
    new-instance v2, Landroid/view/inputmethod/ExtractedText;

    invoke-direct {v2}, Landroid/view/inputmethod/ExtractedText;-><init>()V

    .line 211
    invoke-virtual {p2, p1, v2}, Ll/۫ۨᩳ;->֫(Landroid/view/inputmethod/ExtractedTextRequest;Landroid/view/inputmethod/ExtractedText;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 212
    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۧܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 213
    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v11

    .line 214
    new-instance p1, Ll/ۧܰᩳ;

    iget v4, v2, Landroid/view/inputmethod/ExtractedText;->startOffset:I

    iget v5, v2, Landroid/view/inputmethod/ExtractedText;->selectionStart:I

    iget v6, v2, Landroid/view/inputmethod/ExtractedText;->selectionEnd:I

    iget-object v3, v2, Landroid/view/inputmethod/ExtractedText;->text:Ljava/lang/CharSequence;

    .line 218
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v7

    .line 219
    invoke-virtual {p2}, Ll/۫ۨᩳ;->۫֫()I

    move-result v8

    .line 220
    invoke-virtual {p2}, Ll/۫ۨᩳ;->۬֫()I

    move-result v9

    .line 221
    invoke-virtual {p2}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v10

    .line 223
    invoke-interface {v11}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v12

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Ll/ۧܰᩳ;-><init>(IIIIIIILl/۟᩺ᩳ;I)V

    iput-object p1, p0, Ll/᩹ܰᩳ;->ܿ:Ll/ۧܰᩳ;

    .line 225
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, p0, Ll/᩹ܰᩳ;->ܳ:J

    return-object v2

    .line 227
    :cond_0
    iput-object v1, p0, Ll/᩹ܰᩳ;->ܿ:Ll/ۧܰᩳ;

    return-object v2

    .line 231
    :cond_1
    iput-object v1, p0, Ll/᩹ܰᩳ;->ܿ:Ll/ۧܰᩳ;
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 235
    :goto_0
    invoke-virtual {p2, v0, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_2

    return-object v1

    :cond_2
    throw p1
.end method

.method public final getSelectedText(I)Ljava/lang/CharSequence;
    .locals 9

    .line 74
    invoke-direct {p0}, Ll/᩹ܰᩳ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 75
    :cond_0
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    .line 77
    :try_start_0
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v3

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 78
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v4

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-ltz v3, :cond_2

    int-to-long v4, v4

    int-to-long v6, v3

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x2710

    cmp-long v8, v4, v6

    if-lez v8, :cond_2

    add-int/lit16 v4, v3, 0x2710

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_1

    .line 84
    invoke-interface {v2, v3, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v2, v3, v4}, Landroid/text/TextUtils;->substring(Ljava/lang/CharSequence;II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 86
    :cond_2
    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->getSelectedText(I)Ljava/lang/CharSequence;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 88
    :goto_0
    invoke-virtual {v0, v2, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-object v1

    :cond_3
    throw p1
.end method

.method public final getSurroundingText(III)Landroid/view/inputmethod/SurroundingText;
    .locals 7

    .line 96
    invoke-direct {p0}, Ll/᩹ܰᩳ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-ltz p1, :cond_3

    if-ltz p2, :cond_3

    .line 114
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v4

    int-to-long v4, v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/16 v4, 0x2710

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    return-object v1

    .line 102
    :cond_1
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    const/16 v3, 0x2710

    .line 104
    :try_start_0
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 105
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 104
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/BaseInputConnection;->getSurroundingText(III)Landroid/view/inputmethod/SurroundingText;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 107
    :goto_0
    invoke-virtual {v0, v2, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_2

    return-object v1

    :cond_2
    throw p1

    .line 98
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Surrounding text lengths must be nonnegative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 4

    .line 63
    invoke-direct {p0}, Ll/᩹ܰᩳ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 64
    :cond_0
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    const/16 v3, 0x2710

    .line 65
    :try_start_0
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->getTextAfterCursor(II)Ljava/lang/CharSequence;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 67
    :goto_0
    invoke-virtual {v0, v2, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object v1

    :cond_1
    throw p1
.end method

.method public final getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 4

    .line 52
    invoke-direct {p0}, Ll/᩹ܰᩳ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 53
    :cond_0
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    const/16 v3, 0x2710

    .line 54
    :try_start_0
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->getTextBeforeCursor(II)Ljava/lang/CharSequence;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 56
    :goto_0
    invoke-virtual {v0, v2, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object v1

    :cond_1
    throw p1
.end method

.method public final performContextMenuAction(I)Z
    .locals 4

    .line 186
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    .line 188
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    return v2

    .line 191
    :cond_0
    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܺ(I)V

    .line 192
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/lit8 p1, p1, 0x1

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 194
    :goto_0
    invoke-virtual {v0, v1, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    throw p1
.end method

.method public final performEditorAction(I)Z
    .locals 1

    .line 457
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 460
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->performEditorAction(I)Z

    move-result p1

    return p1
.end method

.method public final performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 566
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 569
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/BaseInputConnection;->performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 1

    .line 481
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 484
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final performSpellCheck()Z
    .locals 1

    .line 557
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 560
    :cond_0
    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->performSpellCheck()Z

    move-result v0

    return v0
.end method

.method public final previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 1

    .line 575
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 578
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z

    move-result p1

    return p1
.end method

.method public final replaceText(IILjava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z
    .locals 4

    .line 302
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    .line 304
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    return v2

    .line 307
    :cond_0
    invoke-super/range {p0 .. p5}, Landroid/view/inputmethod/BaseInputConnection;->replaceText(IILjava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 309
    :goto_0
    invoke-virtual {v0, v1, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_1

    return v2

    :cond_1
    throw p1
.end method

.method public final reportFullscreenMode(Z)Z
    .locals 1

    .line 473
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 476
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->reportFullscreenMode(Z)Z

    move-result p1

    return p1
.end method

.method public final requestCursorUpdates(I)Z
    .locals 2

    .line 489
    invoke-direct {p0}, Ll/᩹ܰᩳ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-ltz p1, :cond_1

    const/4 v0, 0x3

    if-gt p1, v0, :cond_1

    .line 493
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1, v1}, Ll/۫ۨᩳ;->᩻(II)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final requestCursorUpdates(II)Z
    .locals 2

    .line 583
    invoke-direct {p0}, Ll/᩹ܰᩳ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-ltz p1, :cond_1

    const/4 v0, 0x3

    if-gt p1, v0, :cond_1

    .line 587
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1, p2}, Ll/۫ۨᩳ;->᩻(II)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final requestTextBoundsInfo(Landroid/graphics/RectF;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V
    .locals 1

    .line 596
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 599
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/BaseInputConnection;->requestTextBoundsInfo(Landroid/graphics/RectF;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 465
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 468
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final setComposingRegion(II)Z
    .locals 3

    .line 349
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    .line 351
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 354
    :cond_0
    invoke-direct {p0, p1, p2}, Ll/᩹ܰᩳ;->֫(II)I

    move-result v2

    if-eqz v2, :cond_1

    add-int/2addr p1, v2

    add-int/2addr p2, v2

    .line 360
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setComposingRegion(II)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 362
    :goto_0
    invoke-virtual {v0, v1, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_2

    :goto_1
    const/4 p1, 0x0

    return p1

    :cond_2
    throw p1
.end method

.method public final setComposingRegion(IILandroid/view/inputmethod/TextAttribute;)Z
    .locals 3

    .line 526
    iget-object p3, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {p3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    const/4 v1, 0x0

    .line 528
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v2

    if-nez v2, :cond_0

    return v1

    .line 532
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/᩹ܰᩳ;->setComposingRegion(II)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 534
    :goto_0
    invoke-virtual {p3, v0, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_1

    return v1

    :cond_1
    throw p1
.end method

.method public final setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 4

    .line 288
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    .line 290
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    return v2

    .line 293
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setComposingText(Ljava/lang/CharSequence;I)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 295
    :goto_0
    invoke-virtual {v0, v1, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_1

    return v2

    :cond_1
    throw p1
.end method

.method public final setComposingText(Ljava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z
    .locals 4

    .line 511
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    .line 513
    :try_start_0
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    return v2

    .line 516
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/BaseInputConnection;->setComposingText(Ljava/lang/CharSequence;ILandroid/view/inputmethod/TextAttribute;)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 518
    :goto_0
    invoke-virtual {v0, v1, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_1

    return v2

    :cond_1
    throw p1
.end method

.method public final setImeConsumesInput(Z)Z
    .locals 1

    .line 605
    invoke-direct {p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 608
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->setImeConsumesInput(Z)Z

    move-result p1

    return p1
.end method

.method public final setSelection(II)Z
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    .line 403
    iget-object v3, v1, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v4

    const/4 v5, 0x0

    .line 405
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/᩹ܰᩳ;->ۧ()Z

    move-result v6

    if-nez v6, :cond_0

    return v5

    .line 408
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    const-wide/16 v8, 0x64

    const/4 v10, 0x1

    if-ne v0, v10, :cond_1

    if-ne v2, v10, :cond_1

    .line 409
    iget-wide v11, v1, Ll/᩹ܰᩳ;->᩻:J

    sub-long v11, v6, v11

    cmp-long v13, v11, v8

    if-gez v13, :cond_1

    .line 410
    iget v0, v1, Ll/᩹ܰᩳ;->ۜ:I

    add-int/2addr v0, v10

    move v2, v0

    goto :goto_1

    .line 412
    :cond_1
    iget-object v11, v1, Ll/᩹ܰᩳ;->ܿ:Ll/ۧܰᩳ;

    if-eqz v11, :cond_9

    iget-wide v12, v1, Ll/᩹ܰᩳ;->ܳ:J

    sub-long v12, v6, v12

    cmp-long v14, v12, v8

    if-gez v14, :cond_9

    .line 414
    iget v12, v11, Ll/ۧܰᩳ;->ܿ:I

    .line 415
    iget v13, v11, Ll/ۧܰᩳ;->ᩳ:I

    .line 416
    iget v14, v11, Ll/ۧܰᩳ;->ܳ:I

    .line 417
    iget v11, v11, Ll/ۧܰᩳ;->ۜ:I

    const/16 v15, 0xa

    if-eqz v14, :cond_3

    sub-int v16, v0, v12

    .line 420
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(I)I

    move-result v10

    if-lt v10, v15, :cond_2

    sub-int v10, v0, v13

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v10

    if-ge v10, v15, :cond_3

    :cond_2
    add-int/2addr v0, v14

    goto :goto_0

    :cond_3
    add-int v10, v14, v11

    if-eq v0, v10, :cond_4

    if-ne v0, v11, :cond_5

    .line 424
    :cond_4
    invoke-virtual {v3}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v0

    :cond_5
    :goto_0
    if-eqz v14, :cond_7

    sub-int v10, v2, v12

    .line 427
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v10

    if-lt v10, v15, :cond_6

    sub-int v10, v2, v13

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v10

    if-ge v10, v15, :cond_7

    :cond_6
    add-int/2addr v2, v14

    goto :goto_1

    :cond_7
    add-int/2addr v14, v11

    if-eq v2, v14, :cond_8

    if-ne v2, v11, :cond_9

    .line 431
    :cond_8
    invoke-virtual {v3}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v2

    .line 438
    :cond_9
    :goto_1
    invoke-super {v1, v0, v2}, Landroid/view/inputmethod/BaseInputConnection;->setSelection(II)Z

    move-result v10

    if-eqz v10, :cond_c

    if-ne v0, v2, :cond_a

    .line 440
    invoke-virtual {v3}, Ll/۫ۨᩳ;->۟ܽ()V

    .line 1357
    :cond_a
    invoke-virtual {v3, v2, v5}, Ll/۫ۨᩳ;->֫(IZ)Z

    .line 443
    iget-wide v10, v1, Ll/᩹ܰᩳ;->ᩳ:J

    sub-long/2addr v6, v10

    cmp-long v0, v6, v8

    if-gez v0, :cond_b

    .line 1040
    invoke-virtual {v3, v5}, Ll/۫ۨᩳ;->ᩳ(Z)V
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    :cond_b
    const/4 v0, 0x1

    return v0

    :cond_c
    return v5

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 450
    :goto_2
    invoke-virtual {v3, v4, v0}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result v2

    if-eqz v2, :cond_d

    return v5

    :cond_d
    throw v0
.end method

.method public final takeSnapshot()Landroid/view/inputmethod/TextSnapshot;
    .locals 4

    .line 121
    invoke-direct {p0}, Ll/᩹ܰᩳ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 122
    :cond_0
    iget-object v0, p0, Ll/᩹ܰᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    .line 123
    :try_start_0
    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->takeSnapshot()Landroid/view/inputmethod/TextSnapshot;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v3

    goto :goto_0

    :catch_1
    move-exception v3

    .line 125
    :goto_0
    invoke-virtual {v0, v2, v3}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    throw v3
.end method
