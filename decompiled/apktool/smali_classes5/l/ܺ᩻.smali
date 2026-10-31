.class public final Ll/ܺ᩻;
.super Ll/۠᩻;
.source "Y22J"

# interfaces
.implements Ll/۬۬;


# instance fields
.field public ܳ֫:I

.field public ܽ֫:Z

.field public ܿ֫:Ll/ۡ᩻;

.field public ᩳ֫:Ll/᩻᩻;

.field public ᩻֫:I


# direct methods
.method public constructor <init>(Ll/᩻᩻;Landroid/content/res/Resources;)V
    .locals 1

    .line 410
    invoke-direct {p0}, Ll/᩵᩻;-><init>()V

    const/4 v0, -0x1

    .line 105
    iput v0, p0, Ll/ܺ᩻;->᩻֫:I

    .line 107
    iput v0, p0, Ll/ܺ᩻;->ܳ֫:I

    .line 118
    new-instance v0, Ll/᩻᩻;

    invoke-direct {v0, p1, p0, p2}, Ll/᩻᩻;-><init>(Ll/᩻᩻;Ll/ܺ᩻;Landroid/content/res/Resources;)V

    .line 119
    invoke-virtual {p0, v0}, Ll/ܺ᩻;->֫(Ll/ᩴ᩻;)V

    .line 120
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ᩻;->onStateChange([I)Z

    .line 121
    invoke-virtual {p0}, Ll/ܺ᩻;->jumpToCurrentState()V

    return-void
.end method

.method public static ֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Ll/ܺ᩻;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 173
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "animated-selector"

    .line 174
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    .line 178
    new-instance v4, Ll/ܺ᩻;

    const/4 v5, 0x0

    .line 111
    invoke-direct {v4, v5, v5}, Ll/ܺ᩻;-><init>(Ll/᩻᩻;Landroid/content/res/Resources;)V

    .line 203
    sget-object v5, Ll/᩸᩻;->֫:[I

    invoke-static {v1, v3, v2, v5}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    const/4 v6, 0x1

    .line 205
    invoke-virtual {v5, v6, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    invoke-virtual {v4, v7, v6}, Ll/ܺ᩻;->setVisible(ZZ)Z

    .line 445
    iget-object v7, v4, Ll/ܺ᩻;->ᩳ֫:Ll/᩻᩻;

    .line 448
    iget v8, v7, Ll/ᩴ᩻;->ܽ:I

    invoke-static {v5}, Ll/ܶ᩻;->֫(Landroid/content/res/TypedArray;)I

    move-result v9

    or-int/2addr v8, v9

    iput v8, v7, Ll/ᩴ᩻;->ܽ:I

    .line 451
    iget-boolean v8, v7, Ll/ᩴ᩻;->ܰ:Z

    const/4 v9, 0x2

    .line 452
    invoke-virtual {v5, v9, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    .line 959
    iput-boolean v8, v7, Ll/ᩴ᩻;->ܰ:Z

    .line 454
    iget-boolean v8, v7, Ll/ᩴ᩻;->ᩴ:Z

    const/4 v10, 0x3

    .line 455
    invoke-virtual {v5, v10, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    .line 991
    iput-boolean v8, v7, Ll/ᩴ᩻;->ᩴ:Z

    .line 457
    iget v8, v7, Ll/ᩴ᩻;->ܶ:I

    const/4 v11, 0x4

    .line 458
    invoke-virtual {v5, v11, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    .line 1062
    iput v8, v7, Ll/ᩴ᩻;->ܶ:I

    const/4 v8, 0x5

    .line 460
    iget v12, v7, Ll/ᩴ᩻;->᩸:I

    .line 461
    invoke-virtual {v5, v8, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    .line 1070
    iput v8, v7, Ll/ᩴ᩻;->᩸:I

    .line 463
    iget-boolean v7, v7, Ll/ᩴ᩻;->ۚ:Z

    const/4 v8, 0x0

    invoke-virtual {v5, v8, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    invoke-virtual {v4, v7}, Ll/᩵᩻;->setDither(Z)V

    .line 208
    invoke-virtual {v4, v1}, Ll/᩵᩻;->֫(Landroid/content/res/Resources;)V

    .line 209
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 479
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v5

    add-int/2addr v5, v6

    .line 481
    :goto_0
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v7

    if-eq v7, v6, :cond_17

    .line 482
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v12

    if-ge v12, v5, :cond_0

    if-eq v7, v10, :cond_17

    :cond_0
    if-eq v7, v9, :cond_1

    goto :goto_0

    :cond_1
    if-le v12, v5, :cond_2

    goto :goto_0

    .line 490
    :cond_2
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v9, "item"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v9, -0x1

    const/4 v10, 0x0

    if-eqz v7, :cond_c

    .line 561
    sget-object v7, Ll/᩸᩻;->ۧ:[I

    invoke-static {v1, v3, v2, v7}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v7

    .line 563
    invoke-virtual {v7, v8, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v12

    .line 567
    invoke-virtual {v7, v6, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    if-lez v6, :cond_3

    .line 569
    invoke-static {}, Ll/֫ۘ;->֫()Ll/֫ۘ;

    move-result-object v9

    invoke-virtual {v9, v0, v6}, Ll/֫ۘ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    .line 571
    :cond_3
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 231
    invoke-interface/range {p3 .. p3}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v6

    .line 232
    new-array v7, v6, [I

    const/4 v9, 0x0

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v6, :cond_6

    .line 234
    invoke-interface {v2, v13}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    move-result v14

    if-eqz v14, :cond_5

    const v15, 0x10100d0

    if-eq v14, v15, :cond_5

    const v15, 0x1010199

    if-eq v14, v15, :cond_5

    add-int/lit8 v15, v9, 0x1

    .line 244
    invoke-interface {v2, v13, v8}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    move-result v16

    if-eqz v16, :cond_4

    goto :goto_2

    :cond_4
    neg-int v14, v14

    .line 245
    :goto_2
    aput v14, v7, v9

    move v9, v15

    :cond_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 248
    :cond_6
    invoke-static {v7, v9}, Landroid/util/StateSet;->trimStateSet([II)[I

    move-result-object v6

    const-string v7, ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"

    if-nez v10, :cond_a

    .line 578
    :goto_3
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v9

    if-ne v9, v11, :cond_7

    goto :goto_3

    :cond_7
    const/4 v10, 0x2

    if-ne v9, v10, :cond_9

    .line 586
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "vector"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 587
    invoke-static/range {p1 .. p4}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;

    move-result-object v10

    goto :goto_4

    .line 589
    :cond_8
    invoke-static/range {p1 .. p4}, Ll/ܶ᩻;->֫(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    goto :goto_4

    .line 582
    :cond_9
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 583
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_4
    if-eqz v10, :cond_b

    .line 598
    iget-object v7, v4, Ll/ܺ᩻;->ᩳ֫:Ll/᩻᩻;

    .line 347
    invoke-virtual {v7, v10}, Ll/ᩴ᩻;->֫(Landroid/graphics/drawable/Drawable;)I

    move-result v9

    .line 348
    iget-object v10, v7, Ll/֨᩻;->۟:[[I

    aput-object v6, v10, v9

    .line 667
    iget-object v6, v7, Ll/᩻᩻;->֫֫:Ll/۬᩵;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v9, v7}, Ll/۬᩵;->ܽ(ILjava/lang/Object;)V

    goto/16 :goto_8

    .line 595
    :cond_b
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 596
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 492
    :cond_c
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "transition"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    .line 506
    sget-object v6, Ll/᩸᩻;->ܽ:[I

    invoke-static {v1, v3, v2, v6}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    const/4 v7, 0x2

    .line 508
    invoke-virtual {v6, v7, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    const/4 v12, 0x1

    .line 510
    invoke-virtual {v6, v12, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v12

    .line 513
    invoke-virtual {v6, v8, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v13

    if-lez v13, :cond_d

    .line 516
    invoke-static {}, Ll/֫ۘ;->֫()Ll/֫ۘ;

    move-result-object v10

    invoke-virtual {v10, v0, v13}, Ll/֫ۘ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    :cond_d
    const/4 v13, 0x3

    .line 518
    invoke-virtual {v6, v13, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    .line 520
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    const-string v6, ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"

    if-nez v10, :cond_11

    .line 526
    :goto_5
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v10

    if-ne v10, v11, :cond_e

    goto :goto_5

    :cond_e
    const/4 v11, 0x2

    if-ne v10, v11, :cond_10

    .line 534
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "animated-vector"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    .line 535
    invoke-static/range {p0 .. p4}, Ll/᩷᩺ۧ;->֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Ll/᩷᩺ۧ;

    move-result-object v10

    goto :goto_6

    .line 538
    :cond_f
    invoke-static/range {p1 .. p4}, Ll/ܶ᩻;->֫(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    goto :goto_6

    .line 530
    :cond_10
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 531
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    :goto_6
    if-eqz v10, :cond_15

    if-eq v7, v9, :cond_14

    if-eq v12, v9, :cond_14

    .line 551
    iget-object v6, v4, Ll/ܺ᩻;->ᩳ֫:Ll/᩻᩻;

    .line 651
    invoke-virtual {v6, v10}, Ll/ᩴ᩻;->֫(Landroid/graphics/drawable/Drawable;)I

    move-result v9

    int-to-long v10, v7

    const/16 v7, 0x20

    shl-long v13, v10, v7

    int-to-long v0, v12

    or-long v12, v13, v0

    if-eqz v8, :cond_12

    const-wide v14, 0x200000000L

    goto :goto_7

    :cond_12
    const-wide/16 v14, 0x0

    .line 657
    :goto_7
    iget-object v7, v6, Ll/᩻᩻;->ۧ֫:Ll/ۚ᩵;

    const/16 v16, 0x20

    int-to-long v2, v9

    or-long v17, v2, v14

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v7, v12, v13, v9}, Ll/ۚ᩵;->֫(JLjava/lang/Long;)V

    if-eqz v8, :cond_13

    shl-long v0, v0, v16

    or-long/2addr v0, v10

    .line 660
    iget-object v6, v6, Ll/᩻᩻;->ۧ֫:Ll/ۚ᩵;

    const-wide v7, 0x100000000L

    or-long/2addr v2, v7

    or-long/2addr v2, v14

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v6, v0, v1, v2}, Ll/ۚ᩵;->֫(JLjava/lang/Long;)V

    :cond_13
    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x3

    const/4 v11, 0x4

    goto :goto_9

    .line 548
    :cond_14
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 549
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": <transition> tag requires \'fromId\' & \'toId\' attributes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 544
    :cond_15
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 545
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    :goto_8
    const/4 v6, 0x1

    const/4 v9, 0x2

    const/4 v10, 0x3

    :goto_9
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    goto/16 :goto_0

    .line 468
    :cond_17
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/ܺ᩻;->onStateChange([I)Z

    return-object v4

    .line 175
    :cond_18
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": invalid animated-selector tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final jumpToCurrentState()V
    .locals 1

    .line 262
    invoke-super {p0}, Ll/᩵᩻;->jumpToCurrentState()V

    .line 263
    iget-object v0, p0, Ll/ܺ᩻;->ܿ֫:Ll/ۡ᩻;

    if-eqz v0, :cond_0

    .line 264
    invoke-virtual {v0}, Ll/ۡ᩻;->ᩳ()V

    const/4 v0, 0x0

    .line 265
    iput-object v0, p0, Ll/ܺ᩻;->ܿ֫:Ll/ۡ᩻;

    .line 266
    iget v0, p0, Ll/ܺ᩻;->᩻֫:I

    invoke-virtual {p0, v0}, Ll/᩵᩻;->֫(I)Z

    const/4 v0, -0x1

    .line 267
    iput v0, p0, Ll/ܺ᩻;->᩻֫:I

    .line 268
    iput v0, p0, Ll/ܺ᩻;->ܳ֫:I

    :cond_0
    return-void
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 604
    iget-boolean v0, p0, Ll/ܺ᩻;->ܽ֫:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Ll/۠᩻;->mutate()Landroid/graphics/drawable/Drawable;

    .line 605
    iget-object v0, p0, Ll/ܺ᩻;->ᩳ֫:Ll/᩻᩻;

    invoke-virtual {v0}, Ll/᩻᩻;->ܿ()V

    const/4 v0, 0x1

    .line 606
    iput-boolean v0, p0, Ll/ܺ᩻;->ܽ֫:Z

    :cond_0
    return-object p0
.end method

.method public final onStateChange([I)Z
    .locals 14

    const-wide/16 v0, -0x1

    .line 685
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    .line 680
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 276
    iget-object v3, p0, Ll/ܺ᩻;->ᩳ֫:Ll/᩻᩻;

    .line 672
    invoke-virtual {v3, p1}, Ll/֨᩻;->֫([I)I

    move-result v4

    if-ltz v4, :cond_0

    goto :goto_0

    .line 676
    :cond_0
    sget-object v4, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {v3, v4}, Ll/֨᩻;->֫([I)I

    move-result v4

    .line 277
    :goto_0
    invoke-virtual {p0}, Ll/᩵᩻;->ۧ()I

    move-result v3

    if-eq v4, v3, :cond_d

    .line 291
    iget-object v3, p0, Ll/ܺ᩻;->ܿ֫:Ll/ۡ᩻;

    if-eqz v3, :cond_3

    .line 293
    iget v5, p0, Ll/ܺ᩻;->᩻֫:I

    if-ne v4, v5, :cond_1

    goto/16 :goto_7

    .line 296
    :cond_1
    iget v5, p0, Ll/ܺ᩻;->ܳ֫:I

    if-ne v4, v5, :cond_2

    invoke-virtual {v3}, Ll/ۡ᩻;->֫()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 298
    invoke-virtual {v3}, Ll/ۡ᩻;->ۧ()V

    .line 299
    iget v0, p0, Ll/ܺ᩻;->ܳ֫:I

    iput v0, p0, Ll/ܺ᩻;->᩻֫:I

    .line 300
    iput v4, p0, Ll/ܺ᩻;->ܳ֫:I

    goto/16 :goto_7

    .line 304
    :cond_2
    iget v5, p0, Ll/ܺ᩻;->᩻֫:I

    .line 306
    invoke-virtual {v3}, Ll/ۡ᩻;->ᩳ()V

    goto :goto_1

    .line 308
    :cond_3
    invoke-virtual {p0}, Ll/᩵᩻;->ۧ()I

    move-result v5

    :goto_1
    const/4 v3, 0x0

    .line 311
    iput-object v3, p0, Ll/ܺ᩻;->ܿ֫:Ll/ۡ᩻;

    const/4 v3, -0x1

    .line 312
    iput v3, p0, Ll/ܺ᩻;->ܳ֫:I

    .line 313
    iput v3, p0, Ll/ܺ᩻;->᩻֫:I

    .line 314
    iget-object v3, p0, Ll/ܺ᩻;->ᩳ֫:Ll/᩻᩻;

    if-gez v5, :cond_4

    .line 315
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x0

    goto :goto_2

    .line 680
    :cond_4
    iget-object v6, v3, Ll/᩻᩻;->֫֫:Ll/۬᩵;

    invoke-virtual {v6, v5, v2}, Ll/۬᩵;->֫(ILjava/lang/Integer;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :goto_2
    if-gez v4, :cond_5

    const/4 v2, 0x0

    goto :goto_3

    :cond_5
    iget-object v7, v3, Ll/᩻᩻;->֫֫:Ll/۬᩵;

    invoke-virtual {v7, v4, v2}, Ll/۬᩵;->֫(ILjava/lang/Integer;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_3
    if-eqz v2, :cond_c

    if-nez v6, :cond_6

    goto/16 :goto_6

    :cond_6
    int-to-long v6, v6

    const/16 v8, 0x20

    shl-long/2addr v6, v8

    int-to-long v8, v2

    or-long/2addr v6, v8

    .line 685
    iget-object v2, v3, Ll/᩻᩻;->ۧ֫:Ll/ۚ᩵;

    invoke-virtual {v2, v6, v7, v0}, Ll/ۚ᩵;->ۧ(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    long-to-int v2, v8

    if-gez v2, :cond_7

    goto :goto_6

    .line 695
    :cond_7
    iget-object v8, v3, Ll/᩻᩻;->ۧ֫:Ll/ۚ᩵;

    invoke-virtual {v8, v6, v7, v0}, Ll/ۚ᩵;->ۧ(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-wide v10, 0x200000000L

    and-long/2addr v8, v10

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-eqz v12, :cond_8

    const/4 v8, 0x1

    goto :goto_4

    :cond_8
    const/4 v8, 0x0

    .line 328
    :goto_4
    invoke-virtual {p0, v2}, Ll/᩵᩻;->֫(I)Z

    .line 330
    invoke-virtual {p0}, Ll/᩵᩻;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 331
    instance-of v9, v2, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v9, :cond_a

    .line 690
    iget-object v3, v3, Ll/᩻᩻;->ۧ֫:Ll/ۚ᩵;

    invoke-virtual {v3, v6, v7, v0}, Ll/ۚ᩵;->ۧ(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-wide v12, 0x100000000L

    and-long/2addr v6, v12

    cmp-long v0, v6, v10

    if-eqz v0, :cond_9

    const/4 v1, 0x1

    .line 333
    :cond_9
    new-instance v0, Ll/᩷᩻;

    check-cast v2, Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {v0, v2, v1, v8}, Ll/᩷᩻;-><init>(Landroid/graphics/drawable/AnimationDrawable;ZZ)V

    goto :goto_5

    .line 335
    :cond_a
    instance-of v0, v2, Ll/᩷᩺ۧ;

    if-eqz v0, :cond_b

    .line 337
    new-instance v0, Ll/ۜ᩻;

    check-cast v2, Ll/᩷᩺ۧ;

    invoke-direct {v0, v2}, Ll/ۜ᩻;-><init>(Ll/᩷᩺ۧ;)V

    goto :goto_5

    .line 338
    :cond_b
    instance-of v0, v2, Landroid/graphics/drawable/Animatable;

    if-eqz v0, :cond_c

    .line 339
    new-instance v0, Ll/ܳ᩻;

    check-cast v2, Landroid/graphics/drawable/Animatable;

    invoke-direct {v0, v2}, Ll/ܳ᩻;-><init>(Landroid/graphics/drawable/Animatable;)V

    .line 344
    :goto_5
    invoke-virtual {v0}, Ll/ۡ᩻;->ܽ()V

    .line 345
    iput-object v0, p0, Ll/ܺ᩻;->ܿ֫:Ll/ۡ᩻;

    .line 346
    iput v5, p0, Ll/ܺ᩻;->ܳ֫:I

    .line 347
    iput v4, p0, Ll/ܺ᩻;->᩻֫:I

    goto :goto_7

    .line 278
    :cond_c
    :goto_6
    invoke-virtual {p0, v4}, Ll/᩵᩻;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_d

    :goto_7
    const/4 v1, 0x1

    .line 282
    :cond_d
    invoke-virtual {p0}, Ll/᩵᩻;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 284
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    or-int/2addr p1, v1

    return p1

    :cond_e
    return v1
.end method

.method public final setVisible(ZZ)Z
    .locals 2

    .line 216
    invoke-super {p0, p1, p2}, Ll/᩵᩻;->setVisible(ZZ)Z

    move-result v0

    .line 217
    iget-object v1, p0, Ll/ܺ᩻;->ܿ֫:Ll/ۡ᩻;

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    if-eqz p2, :cond_2

    :cond_0
    if-eqz p1, :cond_1

    .line 219
    invoke-virtual {v1}, Ll/ۡ᩻;->ܽ()V

    return v0

    .line 222
    :cond_1
    invoke-virtual {p0}, Ll/ܺ᩻;->jumpToCurrentState()V

    :cond_2
    return v0
.end method

.method public final ֫()Ll/ᩴ᩻;
    .locals 3

    .line 613
    new-instance v0, Ll/᩻᩻;

    iget-object v1, p0, Ll/ܺ᩻;->ᩳ֫:Ll/᩻᩻;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Ll/᩻᩻;-><init>(Ll/᩻᩻;Ll/ܺ᩻;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public final ֫(Ll/ᩴ᩻;)V
    .locals 1

    .line 717
    invoke-super {p0, p1}, Ll/۠᩻;->֫(Ll/ᩴ᩻;)V

    .line 718
    instance-of v0, p1, Ll/᩻᩻;

    if-eqz v0, :cond_0

    .line 719
    check-cast p1, Ll/᩻᩻;

    iput-object p1, p0, Ll/ܺ᩻;->ᩳ֫:Ll/᩻᩻;

    :cond_0
    return-void
.end method
