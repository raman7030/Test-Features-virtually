.class public final Ll/᩹᩻ۡ;
.super Ll/᩺ۛۘ;
.source "A924"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 361
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/᩹᩻ۡ;->֫:Ljava/util/HashMap;

    const v1, -0x565657

    .line 362
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "darkgray"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, -0x7f7f80

    .line 363
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "gray"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, -0x2c2c2d

    .line 364
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "lightgray"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "darkgrey"

    .line 365
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "grey"

    .line 366
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "green"

    const v2, -0xff8000

    const-string v4, "lightgrey"

    .line 0
    invoke-static {v0, v4, v3, v2, v1}, Ll/ܺ۫᩷;->֫(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 4

    .line 372
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 373
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "textsecondary"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    goto :goto_1

    :sswitch_1
    const-string v0, "divider"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    goto :goto_1

    :sswitch_2
    const-string v0, "warning"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    goto :goto_1

    :sswitch_3
    const-string v0, "error"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x3

    goto :goto_1

    :sswitch_4
    const-string v0, "text"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    goto :goto_1

    :sswitch_5
    const-string v0, "primary"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_6
    const-string v0, "accent"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    goto :goto_1

    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 389
    sget-object v0, Ll/᩹᩻ۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_7

    .line 391
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 381
    :pswitch_0
    sget p0, Ll/᩹֡᩷;->ۜ֫:I

    return p0

    .line 383
    :pswitch_1
    sget p0, Ll/᩹֡᩷;->ܳ:I

    return p0

    .line 387
    :pswitch_2
    sget p0, Ll/᩹֡᩷;->ۘ֫:I

    return p0

    .line 385
    :pswitch_3
    sget p0, Ll/᩹֡᩷;->ᩳ֫:I

    return p0

    .line 379
    :pswitch_4
    sget p0, Ll/᩹֡᩷;->ܳ֫:I

    return p0

    .line 375
    :pswitch_5
    sget p0, Ll/᩹֡᩷;->ۢ:I

    return p0

    .line 377
    :pswitch_6
    sget p0, Ll/᩹֡᩷;->֫:I

    return p0

    :cond_7
    const-string v0, "#"

    .line 394
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 395
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 396
    invoke-static {v0}, Ll/ۢ᩺ۡ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 397
    invoke-static {v0}, Ll/ۢ᩺ۡ;->᩷(Ljava/lang/String;)I

    move-result p0

    return p0

    .line 401
    :cond_8
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isLetter(C)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 403
    :try_start_0
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v3

    .line 410
    :cond_9
    :try_start_1
    invoke-static {v3, p0}, Ll/ܶ۬ۡ;->֫(ILjava/lang/CharSequence;)I

    move-result p0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return p0

    :catch_1
    return v3

    :sswitch_data_0
    .sparse-switch
        -0x54d84b36 -> :sswitch_6
        -0x12c2f1fe -> :sswitch_5
        0x36452d -> :sswitch_4
        0x5c4d208 -> :sswitch_3
        0x4305af9c -> :sswitch_2
        0x63cc1319 -> :sswitch_1
        0x6834aee7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;Ll/ܶ۬ۘ;)Ljava/lang/Object;
    .locals 7

    .line 419
    invoke-interface {p3}, Ll/ܶ۬ۘ;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v0, 0x2

    const-string v1, "color"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_1
    const-string p2, "align"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_2
    const-string p2, "font"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    const/4 p1, 0x0

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_a

    .line 490
    :pswitch_0
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 491
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p2

    const-string v1, "night"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_3

    .line 493
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-static {p2}, Ll/᩹᩻ۡ;->֫(Ljava/lang/String;)I

    move-result p2

    invoke-direct {v1, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    goto :goto_1

    :cond_3
    move-object v1, p1

    .line 495
    :goto_1
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p2

    const-string p3, "night-background"

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_6

    .line 497
    new-instance p1, Landroid/text/style/BackgroundColorSpan;

    invoke-static {p2}, Ll/᩹᩻ۡ;->֫(Ljava/lang/String;)I

    move-result p2

    invoke-direct {p1, p2}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    goto :goto_3

    .line 500
    :cond_4
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p2

    const-string v1, "day"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_5

    .line 502
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-static {p2}, Ll/᩹᩻ۡ;->֫(Ljava/lang/String;)I

    move-result p2

    invoke-direct {v1, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    goto :goto_2

    :cond_5
    move-object v1, p1

    .line 504
    :goto_2
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p2

    const-string p3, "day-background"

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_6

    .line 506
    new-instance p1, Landroid/text/style/BackgroundColorSpan;

    invoke-static {p2}, Ll/᩹᩻ۡ;->֫(Ljava/lang/String;)I

    move-result p2

    invoke-direct {p1, p2}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    :cond_6
    :goto_3
    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    new-array p2, v0, [Ljava/lang/Object;

    aput-object v1, p2, v2

    aput-object p1, p2, v3

    return-object p2

    :cond_7
    if-eqz v1, :cond_8

    return-object v1

    :cond_8
    return-object p1

    .line 520
    :pswitch_1
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p1

    const-string p2, "center"

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 521
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    goto :goto_4

    .line 522
    :cond_9
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p1

    const-string p2, "end"

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 523
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_4

    .line 526
    :cond_a
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 528
    :goto_4
    new-instance p2, Landroid/text/style/AlignmentSpan$Standard;

    invoke-direct {p2, p1}, Landroid/text/style/AlignmentSpan$Standard;-><init>(Landroid/text/Layout$Alignment;)V

    return-object p2

    .line 426
    :pswitch_2
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_b

    .line 428
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-static {p2}, Ll/᩹᩻ۡ;->֫(Ljava/lang/String;)I

    move-result p2

    invoke-direct {v0, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/4 p2, 0x1

    goto :goto_5

    :cond_b
    const/4 p2, 0x0

    move-object v0, p1

    .line 431
    :goto_5
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object v1

    const-string v4, "background-color"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_c

    .line 433
    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v1}, Ll/᩹᩻ۡ;->֫(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v4, v1}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    :cond_c
    move-object v4, p1

    .line 436
    :goto_6
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object v1

    const-string v5, "face"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_d

    .line 438
    new-instance v5, Landroid/text/style/TypefaceSpan;

    invoke-direct {v5, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_7

    :cond_d
    move-object v5, p1

    .line 441
    :goto_7
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p3

    const-string v1, "size"

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    if-eqz p3, :cond_10

    .line 443
    new-instance v1, Ll/ۜ᩺ۡ;

    invoke-direct {v1}, Ll/ۜ᩺ۡ;-><init>()V

    .line 444
    invoke-static {p3, v1}, Ll/ۢ᩺ۡ;->ۧ(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z

    move-result p3

    if-eqz p3, :cond_10

    .line 445
    iget p3, v1, Ll/ۜ᩺ۡ;->ܿ:I

    const/4 v6, 0x5

    if-ne p3, v6, :cond_e

    .line 446
    new-instance p3, Landroid/text/style/AbsoluteSizeSpan;

    iget v1, v1, Ll/ۜ᩺ۡ;->ܽ:I

    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    invoke-static {v1, v6}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v1

    invoke-direct {p3, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    goto :goto_8

    :cond_e
    const/4 v6, 0x6

    if-ne p3, v6, :cond_f

    .line 449
    new-instance p3, Landroid/text/style/RelativeSizeSpan;

    iget v1, v1, Ll/ۜ᩺ۡ;->ܽ:I

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v1, v6, v6}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v1

    invoke-direct {p3, v1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    goto :goto_8

    :cond_f
    const/4 v6, 0x4

    if-ne p3, v6, :cond_10

    .line 452
    new-instance p3, Landroid/text/style/RelativeSizeSpan;

    iget v1, v1, Ll/ۜ᩺ۡ;->ܽ:I

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-direct {p3, v1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    :goto_8
    add-int/lit8 p2, p2, 0x1

    goto :goto_9

    :cond_10
    move-object p3, p1

    :goto_9
    if-lez p2, :cond_18

    if-ne p2, v3, :cond_14

    if-eqz v0, :cond_11

    return-object v0

    :cond_11
    if-eqz v4, :cond_12

    return-object v4

    :cond_12
    if-eqz v5, :cond_13

    return-object v5

    :cond_13
    return-object p3

    .line 470
    :cond_14
    new-array p1, p2, [Ljava/lang/Object;

    if-eqz v0, :cond_15

    .line 473
    aput-object v0, p1, v2

    const/4 v2, 0x1

    :cond_15
    if-eqz v4, :cond_16

    add-int/lit8 p2, v2, 0x1

    .line 476
    aput-object v4, p1, v2

    move v2, p2

    :cond_16
    if-eqz v5, :cond_17

    add-int/lit8 p2, v2, 0x1

    .line 479
    aput-object v5, p1, v2

    move v2, p2

    :cond_17
    if-eqz p3, :cond_18

    .line 482
    aput-object p3, p1, v2

    :cond_18
    :goto_a
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x300c4f -> :sswitch_2
        0x5899705 -> :sswitch_1
        0x5a72f63 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 3

    const-string v0, "color"

    const-string v1, "align"

    const-string v2, "font"

    .line 537
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
