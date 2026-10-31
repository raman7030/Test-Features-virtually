.class public final Ll/᩵᩶ۢ;
.super Landroid/view/inputmethod/BaseInputConnection;
.source "81UC"


# instance fields
.field public ֫:I

.field public ۜ:Z

.field public ۧ:Z

.field public ܳ:Z

.field public ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public ᩳ:Z

.field public final synthetic ᩷:Ll/֡᩶ۢ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/֡᩶ۢ;)V
    .locals 1

    .line 448
    iput-object p1, p0, Ll/᩵᩶ۢ;->᩷:Ll/֡᩶ۢ;

    const/4 v0, 0x1

    .line 449
    invoke-direct {p0, p1, v0}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 439
    invoke-static {p1}, Ll/֡᩶ۢ;->ܳ(Ll/֡᩶ۢ;)I

    move-result p1

    iput p1, p0, Ll/᩵᩶ۢ;->ܿ:I

    const-string p1, ""

    .line 441
    iput-object p1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method private ֫(ILjava/lang/String;)V
    .locals 7

    .line 501
    iget-object v0, p0, Ll/᩵᩶ۢ;->᩷:Ll/֡᩶ۢ;

    invoke-static {v0}, Ll/֡᩶ۢ;->ܿ(Ll/֡᩶ۢ;)Ll/᩵᩶ۢ;

    move-result-object v1

    if-eq v1, p0, :cond_0

    goto/16 :goto_9

    .line 503
    :cond_0
    iget-object v1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 504
    iget-object v4, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v4, v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-lez v3, :cond_2

    .line 505
    iget-object v1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    add-int/lit8 v4, v3, -0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 v3, v3, -0x1

    .line 506
    :cond_2
    invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    .line 507
    iput-boolean v4, p0, Ll/᩵᩶ۢ;->ۜ:Z

    .line 508
    iput-boolean v2, p0, Ll/᩵᩶ۢ;->ܳ:Z

    .line 509
    iput-boolean v4, p0, Ll/᩵᩶ۢ;->ᩳ:Z

    .line 511
    :try_start_0
    iget-object v5, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v5, v3, v6}, Ljava/lang/String;->codePointCount(II)I

    move-result v3

    add-int/2addr v3, p1

    const/4 p1, 0x0

    :goto_1
    if-ge p1, v3, :cond_3

    const/16 v5, 0x43

    .line 512
    invoke-virtual {v0, v5, v2}, Ll/֡᩶ۢ;->֫(II)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 688
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, p1, :cond_9

    .line 691
    invoke-static {v0}, Ll/֡᩶ۢ;->ܿ(Ll/֡᩶ۢ;)Ll/᩵᩶ۢ;

    move-result-object v5

    if-eq v5, p0, :cond_4

    goto :goto_6

    .line 692
    :cond_4
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 694
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_6

    add-int/lit8 v3, v3, 0x1

    if-ge v3, p1, :cond_5

    .line 696
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v5

    goto :goto_3

    :cond_5
    const v5, 0xfffd

    :cond_6
    :goto_3
    const/16 v6, 0x1f

    if-gt v5, v6, :cond_8

    const/16 v6, 0x1b

    if-eq v5, v6, :cond_8

    const/16 v6, 0xa

    if-ne v5, v6, :cond_7

    const/16 v5, 0xd

    :cond_7
    packed-switch v5, :pswitch_data_0

    add-int/lit8 v5, v5, 0x60

    goto :goto_4

    :pswitch_0
    const/16 v5, 0x5f

    goto :goto_4

    :pswitch_1
    const/16 v5, 0x5e

    goto :goto_4

    :pswitch_2
    const/16 v5, 0x5d

    goto :goto_4

    :pswitch_3
    const/16 v5, 0x5c

    :goto_4
    const/4 v6, 0x1

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    .line 736
    :goto_5
    invoke-static {v0, v5, v6}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v3, v4

    goto :goto_2

    .line 515
    :cond_9
    :goto_6
    iput-boolean v2, p0, Ll/᩵᩶ۢ;->ۜ:Z

    .line 516
    iput-boolean v2, p0, Ll/᩵᩶ۢ;->ᩳ:Z

    .line 518
    invoke-static {v0}, Ll/֡᩶ۢ;->ܿ(Ll/֡᩶ۢ;)Ll/᩵᩶ۢ;

    move-result-object p1

    if-eq p1, p0, :cond_a

    goto :goto_9

    .line 519
    :cond_a
    iput-object p2, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    .line 520
    iget-boolean p1, p0, Ll/᩵᩶ۢ;->ܳ:Z

    if-eqz p1, :cond_b

    .line 521
    invoke-direct {p0}, Ll/᩵᩶ۢ;->ۧ()V

    return-void

    :cond_b
    const/4 p1, 0x0

    .line 525
    :goto_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p2

    if-ge p1, p2, :cond_e

    .line 526
    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v0, 0x20

    if-lt p2, v0, :cond_d

    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v0, 0x7f

    if-ne p2, v0, :cond_c

    goto :goto_8

    :cond_c
    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    .line 527
    :cond_d
    :goto_8
    invoke-direct {p0}, Ll/᩵᩶ۢ;->ۧ()V

    return-void

    .line 532
    :cond_e
    iget-object p1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit16 p2, p1, -0x800

    if-lez p2, :cond_10

    .line 533
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v0

    if-gez v0, :cond_10

    .line 534
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v0

    if-eqz v0, :cond_f

    add-int/lit16 p2, p1, -0x7ff

    .line 535
    :cond_f
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1, v2, p2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 536
    iget-object p1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    :cond_10
    :goto_9
    return-void

    :catchall_0
    move-exception p1

    .line 515
    iput-boolean v2, p0, Ll/᩵᩶ۢ;->ۜ:Z

    .line 516
    iput-boolean v2, p0, Ll/᩵᩶ۢ;->ᩳ:Z

    .line 517
    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/᩵᩶ۢ;II)V
    .locals 1

    .line 484
    iget-boolean v0, p0, Ll/᩵᩶ۢ;->ᩳ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x43

    if-ne p1, v0, :cond_2

    if-nez p2, :cond_2

    .line 485
    iget-object p1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    .line 486
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object p1

    iget-object p2, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/4 v0, -0x1

    invoke-static {p1, p2, v0}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    move-result p1

    .line 487
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object p2

    iget-object v0, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p2, p1, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 488
    iget-object p2, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    .line 489
    iget p1, p0, Ll/᩵᩶ۢ;->֫:I

    if-nez p1, :cond_1

    invoke-direct {p0}, Ll/᩵᩶ۢ;->ᩳ()V

    :cond_1
    :goto_0
    return-void

    .line 491
    :cond_2
    invoke-direct {p0}, Ll/᩵᩶ۢ;->ۧ()V

    return-void
.end method

.method private ֫()Z
    .locals 3

    .line 454
    iget-boolean v0, p0, Ll/᩵᩶ۢ;->ۧ:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/᩵᩶ۢ;->ܿ:I

    iget-object v1, p0, Ll/᩵᩶ۢ;->᩷:Ll/֡᩶ۢ;

    invoke-static {v1}, Ll/֡᩶ۢ;->ܳ(Ll/֡᩶ۢ;)I

    move-result v2

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 455
    :cond_0
    invoke-static {v1, p0}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;Ll/᩵᩶ۢ;)V

    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private ֫(IIZ)Z
    .locals 6

    const/4 v0, 0x0

    if-ltz p1, :cond_5

    if-gez p2, :cond_0

    goto :goto_1

    .line 662
    :cond_0
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->beginBatchEdit()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 663
    :cond_1
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object v1

    .line 664
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 665
    iget-object v3, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    iget-object v4, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x11

    invoke-interface {v1, v2, v3, v4, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 666
    invoke-static {v1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 667
    invoke-static {v1}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v4

    if-ltz v4, :cond_2

    .line 668
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_2
    if-eqz p3, :cond_3

    .line 669
    invoke-static {v1, v0, v3}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    move-result v3

    :cond_3
    if-eqz p3, :cond_4

    .line 672
    :try_start_0
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt p3, v4, :cond_4

    .line 673
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingTextInCodePoints(II)Z

    move-result p2

    goto :goto_0

    .line 675
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingText(II)Z

    move-result p2

    .line 677
    :goto_0
    invoke-interface {v1, v2}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p3

    .line 678
    invoke-interface {v1, v0, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p3

    sub-int/2addr p1, v3

    .line 679
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-direct {p0, p1, p3}, Ll/᩵᩶ۢ;->֫(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 682
    invoke-interface {v1, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 683
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    return p2

    :catchall_0
    move-exception p1

    .line 682
    invoke-interface {v1, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 683
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    .line 684
    throw p1

    :cond_5
    :goto_1
    return v0
.end method

.method public static bridge synthetic ֫(Ll/᩵᩶ۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩵᩶ۢ;->ۜ:Z

    return p0
.end method

.method private ۧ()V
    .locals 3

    .line 476
    iget-object v0, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 477
    :cond_0
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object v0

    iget-object v1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    const-string v0, ""

    .line 478
    iput-object v0, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    .line 479
    iput-boolean v2, p0, Ll/᩵᩶ۢ;->᩻:Z

    .line 480
    iget v0, p0, Ll/᩵᩶ۢ;->֫:I

    if-nez v0, :cond_1

    invoke-direct {p0}, Ll/᩵᩶ۢ;->ᩳ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩵᩶ۢ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/᩵᩶ۢ;->ܳ:Z

    return-void
.end method

.method private ܽ()I
    .locals 2

    .line 576
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v0

    if-gez v0, :cond_0

    .line 577
    iget-object v0, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0

    :cond_0
    iget-object v1, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public static bridge synthetic ܽ(Ll/᩵᩶ۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩵᩶ۢ;->ۧ()V

    return-void
.end method

.method private ᩳ()V
    .locals 7

    .line 542
    iget-object v1, p0, Ll/᩵᩶ۢ;->᩷:Ll/֡᩶ۢ;

    invoke-static {v1}, Ll/֡᩶ۢ;->ܿ(Ll/֡᩶ۢ;)Ll/᩵᩶ۢ;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    .line 543
    :cond_0
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object v0

    .line 544
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "input_method"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v2, :cond_1

    .line 547
    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v4

    .line 548
    invoke-static {v0}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result v5

    invoke-static {v0}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanEnd(Landroid/text/Spannable;)I

    move-result v6

    move-object v0, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    .line 546
    invoke-virtual/range {v0 .. v5}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final beginBatchEdit()Z
    .locals 2

    .line 598
    invoke-direct {p0}, Ll/᩵᩶ۢ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 599
    :cond_0
    iget v0, p0, Ll/᩵᩶ۢ;->֫:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩵᩶ۢ;->֫:I

    return v1
.end method

.method public final closeConnection()V
    .locals 6

    .line 461
    iget-object v0, p0, Ll/᩵᩶ۢ;->᩷:Ll/֡᩶ۢ;

    iget-boolean v1, p0, Ll/᩵᩶ۢ;->ۧ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x18

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 464
    :try_start_0
    invoke-static {v0}, Ll/֡᩶ۢ;->ܿ(Ll/֡᩶ۢ;)Ll/᩵᩶ۢ;

    move-result-object v4

    if-ne v4, p0, :cond_1

    iget v4, p0, Ll/᩵᩶ۢ;->ܿ:I

    invoke-static {v0}, Ll/֡᩶ۢ;->ܳ(Ll/֡᩶ۢ;)I

    move-result v5

    if-ne v4, v5, :cond_1

    .line 465
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->finishComposingText()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 468
    :cond_1
    iput-boolean v3, p0, Ll/᩵᩶ۢ;->ۧ:Z

    .line 469
    invoke-static {v0}, Ll/֡᩶ۢ;->ܿ(Ll/֡᩶ۢ;)Ll/᩵᩶ۢ;

    move-result-object v3

    if-ne v3, p0, :cond_2

    invoke-static {v0, v2}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;Ll/᩵᩶ۢ;)V

    .line 470
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_3

    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->closeConnection()V

    :cond_3
    :goto_0
    return-void

    :catchall_0
    move-exception v4

    .line 468
    iput-boolean v3, p0, Ll/᩵᩶ۢ;->ۧ:Z

    .line 469
    invoke-static {v0}, Ll/֡᩶ۢ;->ܿ(Ll/֡᩶ۢ;)Ll/᩵᩶ۢ;

    move-result-object v3

    if-ne v3, p0, :cond_4

    invoke-static {v0, v2}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;Ll/᩵᩶ۢ;)V

    .line 470
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_5

    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->closeConnection()V

    .line 471
    :cond_5
    throw v4
.end method

.method public final commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 640
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->beginBatchEdit()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 642
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    .line 643
    iput-boolean v1, p0, Ll/᩵᩶ۢ;->᩻:Z

    .line 645
    iget-object p1, p0, Ll/᩵᩶ۢ;->᩷:Ll/֡᩶ۢ;

    invoke-static {p1}, Ll/֡᩶ۢ;->ᩳ(Ll/֡᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, 0x1

    if-nez p1, :cond_1

    .line 650
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    return p2

    .line 496
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Ll/᩵᩶ۢ;->֫(ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 650
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    return p2

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    .line 651
    throw p1
.end method

.method public final deleteSurroundingText(II)Z
    .locals 1

    const/4 v0, 0x0

    .line 656
    invoke-direct {p0, p1, p2, v0}, Ll/᩵᩶ۢ;->֫(IIZ)Z

    move-result p1

    return p1
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 2

    .line 621
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    .line 622
    invoke-direct {p0, p1, p2, v0}, Ll/᩵᩶ۢ;->֫(IIZ)Z

    move-result p1

    return p1
.end method

.method public final endBatchEdit()Z
    .locals 4

    .line 605
    iget-boolean v0, p0, Ll/᩵᩶ۢ;->ۧ:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Ll/᩵᩶ۢ;->᩷:Ll/֡᩶ۢ;

    invoke-static {v0}, Ll/֡᩶ۢ;->ܳ(Ll/֡᩶ۢ;)I

    move-result v0

    iget v1, p0, Ll/᩵᩶ۢ;->ܿ:I

    if-eq v1, v0, :cond_0

    goto :goto_0

    .line 606
    :cond_0
    iget v0, p0, Ll/᩵᩶ۢ;->֫:I

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    sub-int/2addr v0, v1

    .line 607
    iput v0, p0, Ll/᩵᩶ۢ;->֫:I

    if-nez v0, :cond_4

    .line 608
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object v0

    .line 609
    invoke-direct {p0}, Ll/᩵᩶ۢ;->ܽ()I

    move-result v2

    .line 610
    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v3

    if-lt v3, v2, :cond_2

    .line 611
    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v3

    if-ge v3, v2, :cond_3

    .line 612
    :cond_2
    invoke-static {v0, v2}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 614
    :cond_3
    invoke-direct {p0}, Ll/᩵᩶ۢ;->ᩳ()V

    .line 616
    :cond_4
    iget v0, p0, Ll/᩵᩶ۢ;->֫:I

    if-lez v0, :cond_5

    return v1

    :cond_5
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final finishComposingText()Z
    .locals 2

    .line 627
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->beginBatchEdit()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 629
    :cond_0
    :try_start_0
    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->finishComposingText()Z

    .line 630
    iput-boolean v1, p0, Ll/᩵᩶ۢ;->᩻:Z

    .line 496
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Ll/᩵᩶ۢ;->֫(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 634
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    .line 635
    throw v0
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 592
    invoke-direct {p0}, Ll/᩵᩶ۢ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 593
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final setComposingRegion(II)Z
    .locals 2

    .line 568
    invoke-direct {p0}, Ll/᩵᩶ۢ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 569
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setComposingRegion(II)Z

    move-result p1

    .line 570
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object p2

    invoke-static {p2}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result p2

    if-ltz p2, :cond_1

    .line 571
    iget-object v0, p0, Ll/᩵᩶ۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p2, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, p0, Ll/᩵᩶ۢ;->᩻:Z

    return p1
.end method

.method public final setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 554
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->beginBatchEdit()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 556
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setComposingText(Ljava/lang/CharSequence;I)Z

    move-result p1

    .line 558
    iget-boolean p2, p0, Ll/᩵᩶ۢ;->᩻:Z

    if-eqz p2, :cond_1

    .line 496
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v1, p2}, Ll/᩵᩶ۢ;->֫(ILjava/lang/String;)V

    .line 559
    :cond_1
    invoke-virtual {p0}, Landroid/view/inputmethod/BaseInputConnection;->getEditable()Landroid/text/Editable;

    move-result-object p2

    invoke-static {p2}, Landroid/view/inputmethod/BaseInputConnection;->getComposingSpanStart(Landroid/text/Spannable;)I

    move-result p2

    if-gez p2, :cond_2

    iput-boolean v1, p0, Ll/᩵᩶ۢ;->᩻:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 562
    :cond_2
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    .line 563
    throw p1
.end method

.method public final setSelection(II)Z
    .locals 1

    .line 582
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->beginBatchEdit()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 584
    :cond_0
    :try_start_0
    invoke-direct {p0}, Ll/᩵᩶ۢ;->ܽ()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-direct {p0}, Ll/᩵᩶ۢ;->ܽ()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->setSelection(II)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 586
    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ll/᩵᩶ۢ;->endBatchEdit()Z

    .line 587
    throw p1
.end method
