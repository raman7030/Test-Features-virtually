.class public final Ll/᩸ᩳ֫;
.super Ljava/lang/Object;
.source "RB0P"


# instance fields
.field public ֫:Ll/ۧᩳ֫;

.field public final ۧ:Ll/᩺ᩳ֫;

.field public final ܽ:Ll/᩻ᩳ֫;


# direct methods
.method public constructor <init>(Ll/᩺ᩳ֫;Ll/֫ᩳ֫;Ll/ۧᩳ֫;Ljava/util/Set;)V
    .locals 7

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    iput-object p2, p0, Ll/᩸ᩳ֫;->ܽ:Ll/᩻ᩳ֫;

    .line 136
    iput-object p1, p0, Ll/᩸ᩳ֫;->ۧ:Ll/᩺ᩳ֫;

    .line 137
    iput-object p3, p0, Ll/᩸ᩳ֫;->֫:Ll/ۧᩳ֫;

    .line 144
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 147
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 148
    new-instance v1, Ljava/lang/String;

    const/4 p3, 0x0

    array-length p4, p2

    invoke-direct {v1, p2, p3, p4}, Ljava/lang/String;-><init>([III)V

    .line 149
    new-instance v6, Ll/۠ᩳ֫;

    invoke-direct {v6, v1}, Ll/۠ᩳ֫;-><init>(Ljava/lang/String;)V

    .line 150
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ll/᩸ᩳ֫;->֫(Ljava/lang/CharSequence;IIIZLl/֨ᩳ֫;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private ֫(Ljava/lang/CharSequence;IIIZLl/֨ᩳ֫;)Ljava/lang/Object;
    .locals 8

    .line 367
    new-instance v0, Ll/ܶᩳ֫;

    iget-object v1, p0, Ll/᩸ᩳ֫;->ۧ:Ll/᩺ᩳ֫;

    invoke-virtual {v1}, Ll/᩺ᩳ֫;->ᩳ()Ll/ۨᩳ֫;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܶᩳ֫;-><init>(Ll/ۨᩳ֫;)V

    .line 371
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_0
    move v5, v1

    move v1, p2

    :cond_0
    :goto_1
    if-ge v1, p3, :cond_7

    if-ge v3, p4, :cond_7

    if-eqz v4, :cond_7

    .line 375
    invoke-virtual {v0, v5}, Ll/ܶᩳ֫;->֫(I)I

    move-result v6

    if-eq v6, v2, :cond_5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_4

    const/4 v7, 0x3

    if-eq v6, v7, :cond_1

    goto :goto_1

    :cond_1
    if-nez p5, :cond_2

    .line 393
    invoke-virtual {v0}, Ll/ܶᩳ֫;->ۧ()Ll/֫ܿ֫;

    move-result-object v6

    .line 392
    invoke-direct {p0, p1, p2, v1, v6}, Ll/᩸ᩳ֫;->֫(Ljava/lang/CharSequence;IILl/֫ܿ֫;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 395
    :cond_2
    invoke-virtual {v0}, Ll/ܶᩳ֫;->ۧ()Ll/֫ܿ֫;

    move-result-object v4

    .line 394
    invoke-interface {p6, p1, p2, v1, v4}, Ll/֨ᩳ֫;->֫(Ljava/lang/CharSequence;IILl/֫ܿ֫;)Z

    move-result v4

    add-int/lit8 v3, v3, 0x1

    :cond_3
    move p2, v1

    goto :goto_2

    .line 386
    :cond_4
    invoke-static {v5}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr v1, v6

    if-ge v1, p3, :cond_0

    .line 388
    invoke-static {p1, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v5

    goto :goto_1

    .line 379
    :cond_5
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr p2, v1

    if-ge p2, p3, :cond_6

    .line 382
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    goto :goto_0

    :cond_6
    :goto_2
    move v1, v5

    goto :goto_0

    .line 407
    :cond_7
    invoke-virtual {v0}, Ll/ܶᩳ֫;->ܽ()Z

    move-result p3

    if-eqz p3, :cond_9

    if-ge v3, p4, :cond_9

    if-eqz v4, :cond_9

    if-nez p5, :cond_8

    .line 409
    invoke-virtual {v0}, Ll/ܶᩳ֫;->֫()Ll/֫ܿ֫;

    move-result-object p3

    .line 408
    invoke-direct {p0, p1, p2, v1, p3}, Ll/᩸ᩳ֫;->֫(Ljava/lang/CharSequence;IILl/֫ܿ֫;)Z

    move-result p3

    if-nez p3, :cond_9

    .line 411
    :cond_8
    invoke-virtual {v0}, Ll/ܶᩳ֫;->֫()Ll/֫ܿ֫;

    move-result-object p3

    .line 410
    invoke-interface {p6, p1, p2, v1, p3}, Ll/֨ᩳ֫;->֫(Ljava/lang/CharSequence;IILl/֫ܿ֫;)Z

    .line 416
    :cond_9
    invoke-interface {p6}, Ll/֨ᩳ֫;->֫()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 3

    const/16 v0, 0x43

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x70

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 445
    :cond_0
    invoke-static {p0, p2, v1}, Ll/᩸ᩳ֫;->֫(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z

    move-result p1

    goto :goto_0

    .line 442
    :cond_1
    invoke-static {p0, p2, v2}, Ll/᩸ᩳ֫;->֫(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_2

    .line 453
    invoke-static {p0}, Landroid/text/method/MetaKeyKeyListener;->adjustMetaAfterKeypress(Landroid/text/Spannable;)V

    return v1

    :cond_2
    return v2
.end method

.method public static ֫(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 572
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_1

    .line 466
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    .line 467
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_6

    if-eq v1, v2, :cond_6

    if-eq p1, v1, :cond_1

    goto :goto_1

    .line 472
    :cond_1
    const-class v2, Ll/᩹ᩳ֫;

    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/᩹ᩳ֫;

    if-eqz v1, :cond_6

    .line 473
    array-length v2, v1

    if-lez v2, :cond_6

    .line 474
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_6

    .line 476
    aget-object v4, v1, v3

    .line 477
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    .line 478
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v4

    if-eqz p2, :cond_2

    if-eq v5, p1, :cond_4

    :cond_2
    if-nez p2, :cond_3

    if-eq v4, p1, :cond_4

    :cond_3
    if-le p1, v5, :cond_5

    if-ge p1, v4, :cond_5

    .line 482
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    const/4 p0, 0x1

    return p0

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v0
.end method

.method private ֫(Ljava/lang/CharSequence;IILl/֫ܿ֫;)Z
    .locals 2

    .line 590
    invoke-virtual {p4}, Ll/֫ܿ֫;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    .line 592
    invoke-virtual {p4}, Ll/֫ܿ֫;->ܿ()S

    move-result v0

    .line 591
    iget-object v1, p0, Ll/᩸ᩳ֫;->֫:Ll/ۧᩳ֫;

    check-cast v1, Ll/ۛܽ֫;

    invoke-virtual {v1, p2, p3, v0, p1}, Ll/ۛܽ֫;->֫(IIILjava/lang/CharSequence;)Z

    move-result p1

    .line 593
    invoke-virtual {p4, p1}, Ll/֫ܿ֫;->֫(Z)V

    .line 596
    :cond_0
    invoke-virtual {p4}, Ll/֫ܿ֫;->ۧ()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;IIZ)Ljava/lang/CharSequence;
    .locals 8

    .line 291
    instance-of v0, p1, Ll/۟ᩳ֫;

    if-eqz v0, :cond_0

    .line 293
    move-object v1, p1

    check-cast v1, Ll/۟ᩳ֫;

    invoke-virtual {v1}, Ll/۟ᩳ֫;->֫()V

    .line 301
    :cond_0
    const-class v1, Ll/᩹ᩳ֫;

    if-nez v0, :cond_3

    :try_start_0
    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    goto :goto_0

    .line 303
    :cond_1
    instance-of v2, p1, Landroid/text/Spanned;

    if-eqz v2, :cond_2

    .line 306
    move-object v2, p1

    check-cast v2, Landroid/text/Spanned;

    add-int/lit8 v3, p2, -0x1

    add-int/lit8 v4, p3, 0x1

    invoke-interface {v2, v3, v4, v1}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v2

    if-gt v2, p3, :cond_2

    .line 310
    new-instance v2, Ll/ܳܿ֫;

    invoke-direct {v2, p1}, Ll/ܳܿ֫;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto/16 :goto_5

    .line 302
    :cond_3
    :goto_0
    new-instance v2, Ll/ܳܿ֫;

    move-object v3, p1

    check-cast v3, Landroid/text/Spannable;

    invoke-direct {v2, v3}, Ll/ܳܿ֫;-><init>(Landroid/text/Spannable;)V

    :goto_1
    if-eqz v2, :cond_5

    .line 315
    invoke-virtual {v2, p2, p3, v1}, Ll/ܳܿ֫;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/᩹ᩳ֫;

    if-eqz v1, :cond_5

    .line 316
    array-length v3, v1

    if-lez v3, :cond_5

    .line 319
    array-length v3, v1

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_5

    .line 321
    aget-object v5, v1, v4

    .line 322
    invoke-virtual {v2, v5}, Ll/ܳܿ֫;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    .line 323
    invoke-virtual {v2, v5}, Ll/ܳܿ֫;->getSpanEnd(Ljava/lang/Object;)I

    move-result v7

    if-eq v6, p3, :cond_4

    .line 329
    invoke-virtual {v2, v5}, Ll/ܳܿ֫;->removeSpan(Ljava/lang/Object;)V

    .line 331
    :cond_4
    invoke-static {v6, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 332
    invoke-static {v7, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    move v3, p2

    move v4, p3

    if-eq v3, v4, :cond_9

    .line 337
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lt v3, p2, :cond_6

    goto :goto_3

    .line 347
    :cond_6
    new-instance v7, Ll/ۚᩳ֫;

    iget-object p2, p0, Ll/᩸ᩳ֫;->ܽ:Ll/᩻ᩳ֫;

    invoke-direct {v7, v2, p2}, Ll/ۚᩳ֫;-><init>(Ll/ܳܿ֫;Ll/᩻ᩳ֫;)V

    const v5, 0x7fffffff

    move-object v1, p0

    move-object v2, p1

    move v6, p4

    invoke-direct/range {v1 .. v7}, Ll/᩸ᩳ֫;->֫(Ljava/lang/CharSequence;IIIZLl/֨ᩳ֫;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܳܿ֫;

    if-eqz p2, :cond_8

    .line 352
    invoke-virtual {p2}, Ll/ܳܿ֫;->֫()Landroid/text/Spannable;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_7

    .line 358
    check-cast p1, Ll/۟ᩳ֫;

    invoke-virtual {p1}, Ll/۟ᩳ֫;->ۧ()V

    :cond_7
    return-object p2

    :cond_8
    if-eqz v0, :cond_a

    goto :goto_4

    :cond_9
    :goto_3
    if-eqz v0, :cond_a

    :goto_4
    move-object p2, p1

    check-cast p2, Ll/۟ᩳ֫;

    invoke-virtual {p2}, Ll/۟ᩳ֫;->ۧ()V

    :cond_a
    return-object p1

    :goto_5
    if-eqz v0, :cond_b

    check-cast p1, Ll/۟ᩳ֫;

    invoke-virtual {p1}, Ll/۟ᩳ֫;->ۧ()V

    .line 360
    :cond_b
    throw p2
.end method
