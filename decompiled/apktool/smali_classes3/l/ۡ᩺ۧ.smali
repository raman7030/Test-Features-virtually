.class public final Ll/ۡ᩺ۧ;
.super Ljava/lang/Object;
.source "84NK"


# direct methods
.method public static ֫(Landroid/content/Context;I)Landroid/animation/Animator;
    .locals 9

    .line 100
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 101
    invoke-static {p0, p1}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object p0

    return-object p0

    .line 103
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const-string v7, "Can\'t load animation resource ID #0x"

    const/4 v0, 0x0

    .line 131
    :try_start_0
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getAnimation(I)Landroid/content/res/XmlResourceParser;

    move-result-object v8
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 501
    :try_start_1
    invoke-static {v8}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v3, v8

    invoke-static/range {v0 .. v6}, Ll/ۡ᩺ۧ;->֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;I)Landroid/animation/Animator;

    move-result-object p0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    invoke-interface {v8}, Landroid/content/res/XmlResourceParser;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    move-object v0, v8

    goto :goto_2

    :catch_0
    move-exception p0

    move-object v0, v8

    goto :goto_0

    :catch_1
    move-exception p0

    move-object v0, v8

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_2
    move-exception p0

    .line 141
    :goto_0
    :try_start_2
    new-instance v1, Landroid/content/res/Resources$NotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 145
    throw v1

    :catch_3
    move-exception p0

    .line 135
    :goto_1
    new-instance v1, Landroid/content/res/Resources$NotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 138
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 139
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    if-eqz v0, :cond_1

    .line 147
    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->close()V

    .line 148
    :cond_1
    throw p0
.end method

.method public static ֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;I)Landroid/animation/Animator;
    .locals 22

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p5

    .line 514
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v11

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v12, v1

    .line 516
    :goto_0
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x3

    const/4 v13, 0x0

    if-ne v1, v2, :cond_0

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    if-le v3, v11, :cond_37

    :cond_0
    const/4 v3, 0x1

    if-eq v1, v3, :cond_37

    const/4 v4, 0x2

    if-eq v1, v4, :cond_1

    goto :goto_0

    .line 523
    :cond_1
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v5, "objectAnimator"

    .line 526
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 872
    new-instance v6, Landroid/animation/ObjectAnimator;

    invoke-direct {v6}, Landroid/animation/ObjectAnimator;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object v4, v6

    move-object/from16 v5, p3

    .line 874
    invoke-static/range {v0 .. v5}, Ll/ۡ᩺ۧ;->֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ObjectAnimator;Lorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator;

    goto :goto_1

    :cond_2
    const-string v5, "animator"

    .line 528
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v5, p3

    .line 529
    invoke-static/range {v0 .. v5}, Ll/ۡ᩺ۧ;->֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ObjectAnimator;Lorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator;

    move-result-object v6

    :goto_1
    move-object/from16 v15, p4

    goto :goto_3

    :cond_3
    const-string v5, "set"

    .line 530
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "http://schemas.android.com/apk/res/android"

    if-eqz v5, :cond_5

    .line 531
    new-instance v14, Landroid/animation/AnimatorSet;

    invoke-direct {v14}, Landroid/animation/AnimatorSet;-><init>()V

    .line 532
    sget-object v0, Ll/ۧ᩺ۧ;->ᩳ:[I

    move-object/from16 v15, p4

    invoke-static {v7, v8, v15, v0}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    const-string v0, "ordering"

    .line 57
    invoke-interface {v9, v6, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 107
    invoke-virtual {v5, v13, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    move v6, v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    const/4 v6, 0x0

    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v16, v5

    move-object v5, v14

    .line 538
    invoke-static/range {v0 .. v6}, Ll/ۡ᩺ۧ;->֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;I)Landroid/animation/Animator;

    .line 540
    invoke-virtual/range {v16 .. v16}, Landroid/content/res/TypedArray;->recycle()V

    move-object v6, v14

    :goto_3
    move-object v0, v6

    move/from16 v18, v11

    move-object/from16 v20, v12

    goto/16 :goto_1f

    :cond_5
    move-object/from16 v15, p4

    const-string v5, "propertyValuesHolder"

    .line 541
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_36

    .line 543
    invoke-static/range {p3 .. p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    const/4 v13, 0x0

    .line 579
    :goto_4
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v14

    if-eq v14, v2, :cond_30

    if-eq v14, v3, :cond_30

    if-eq v14, v4, :cond_6

    .line 583
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    goto :goto_4

    .line 587
    :cond_6
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 589
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2f

    .line 590
    sget-object v3, Ll/ۧ᩺ۧ;->᩻:[I

    invoke-static {v7, v8, v1, v3}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    const-string v14, "propertyName"

    .line 593
    invoke-static {v3, v9, v14, v2}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    const-string v14, "valueType"

    .line 57
    invoke-interface {v9, v6, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v16, v1

    const/4 v1, 0x4

    if-eqz v14, :cond_7

    .line 107
    invoke-virtual {v3, v4, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    goto :goto_5

    :cond_7
    const/4 v1, 0x4

    :goto_5
    const/4 v4, 0x0

    move v14, v1

    move-object/from16 v17, v5

    .line 696
    :goto_6
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    move/from16 v18, v11

    const/4 v11, 0x3

    if-eq v5, v11, :cond_1b

    const/4 v11, 0x1

    if-eq v5, v11, :cond_1b

    .line 698
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v11, "keyframe"

    .line 699
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1a

    const-string v5, "value"

    .line 700
    sget-object v11, Ll/ۧ᩺ۧ;->ܿ:[I

    const/4 v15, 0x4

    if-ne v14, v15, :cond_a

    .line 701
    invoke-static/range {p3 .. p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v14

    .line 636
    invoke-static {v7, v8, v14, v11}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v14

    .line 236
    invoke-static {v9, v5}, Ll/ۗۗ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_8

    const/4 v15, 0x0

    goto :goto_7

    :cond_8
    const/4 v15, 0x0

    .line 240
    invoke-virtual {v14, v15}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v15

    :goto_7
    if-eqz v15, :cond_9

    .line 644
    iget v15, v15, Landroid/util/TypedValue;->type:I

    invoke-static {v15}, Ll/ۡ᩺ۧ;->֫(I)Z

    move-result v15

    if-eqz v15, :cond_9

    const/4 v15, 0x3

    goto :goto_8

    :cond_9
    const/4 v15, 0x0

    .line 649
    :goto_8
    invoke-virtual {v14}, Landroid/content/res/TypedArray;->recycle()V

    move v14, v15

    .line 704
    :cond_a
    invoke-static/range {p3 .. p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v15

    .line 818
    invoke-static {v7, v8, v15, v11}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v11

    const-string v15, "fraction"

    .line 69
    invoke-static {v9, v15}, Ll/ۗۗ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v15

    const/high16 v7, -0x40800000    # -1.0f

    if-nez v15, :cond_b

    goto :goto_9

    :cond_b
    const/4 v15, 0x3

    .line 73
    invoke-virtual {v11, v15, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    .line 236
    :goto_9
    invoke-static {v9, v5}, Ll/ۗۗ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_c

    const/4 v15, 0x0

    goto :goto_a

    :cond_c
    const/4 v15, 0x0

    .line 240
    invoke-virtual {v11, v15}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v15

    :goto_a
    if-eqz v15, :cond_d

    const/16 v19, 0x1

    goto :goto_b

    :cond_d
    const/16 v19, 0x0

    :goto_b
    const/4 v8, 0x4

    if-ne v14, v8, :cond_f

    if-eqz v19, :cond_e

    .line 832
    iget v8, v15, Landroid/util/TypedValue;->type:I

    invoke-static {v8}, Ll/ۡ᩺ۧ;->֫(I)Z

    move-result v8

    if-eqz v8, :cond_e

    const/4 v8, 0x3

    goto :goto_c

    :cond_e
    const/4 v8, 0x0

    goto :goto_c

    :cond_f
    move v8, v14

    :goto_c
    if-eqz v19, :cond_14

    if-eqz v8, :cond_12

    const/4 v15, 0x1

    if-eq v8, v15, :cond_10

    const/4 v15, 0x3

    if-eq v8, v15, :cond_10

    const/4 v5, 0x0

    goto :goto_f

    .line 57
    :cond_10
    invoke-interface {v9, v6, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_11

    const/4 v5, 0x0

    .line 107
    invoke-virtual {v11, v5, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    goto :goto_d

    :cond_11
    const/4 v5, 0x0

    .line 850
    :goto_d
    invoke-static {v7, v5}, Landroid/animation/Keyframe;->ofInt(FI)Landroid/animation/Keyframe;

    move-result-object v5

    goto :goto_f

    :cond_12
    const/4 v8, 0x0

    .line 57
    invoke-interface {v9, v6, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_13

    const/4 v5, 0x0

    .line 73
    invoke-virtual {v11, v8, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    goto :goto_e

    :cond_13
    const/4 v5, 0x0

    .line 844
    :goto_e
    invoke-static {v7, v5}, Landroid/animation/Keyframe;->ofFloat(FF)Landroid/animation/Keyframe;

    move-result-object v5

    goto :goto_f

    :cond_14
    if-nez v8, :cond_15

    .line 854
    invoke-static {v7}, Landroid/animation/Keyframe;->ofFloat(F)Landroid/animation/Keyframe;

    move-result-object v5

    goto :goto_f

    .line 855
    :cond_15
    invoke-static {v7}, Landroid/animation/Keyframe;->ofInt(F)Landroid/animation/Keyframe;

    move-result-object v5

    :goto_f
    const-string v7, "interpolator"

    .line 57
    invoke-interface {v9, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_16

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 206
    invoke-virtual {v11, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    goto :goto_10

    :cond_16
    const/4 v7, 0x0

    :goto_10
    move-object/from16 v8, p0

    if-lez v7, :cond_17

    .line 68
    invoke-static {v8, v7}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v7

    .line 862
    invoke-virtual {v5, v7}, Landroid/animation/Keyframe;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 864
    :cond_17
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v5, :cond_19

    if-nez v4, :cond_18

    .line 708
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 710
    :cond_18
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 712
    :cond_19
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    goto :goto_11

    :cond_1a
    move-object/from16 v8, p0

    :goto_11
    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v15, p4

    move/from16 v11, v18

    goto/16 :goto_6

    :cond_1b
    move-object/from16 v8, p0

    if-eqz v4, :cond_2a

    .line 717
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_2a

    const/4 v7, 0x0

    .line 723
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/animation/Keyframe;

    add-int/lit8 v11, v5, -0x1

    .line 724
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/animation/Keyframe;

    .line 725
    invoke-virtual {v11}, Landroid/animation/Keyframe;->getFraction()F

    move-result v15

    move-object/from16 v19, v6

    .line 726
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const/high16 v9, 0x3f800000    # 1.0f

    cmpg-float v20, v15, v9

    if-gez v20, :cond_1f

    const/16 v20, 0x0

    cmpg-float v15, v15, v20

    if-gez v15, :cond_1c

    .line 728
    invoke-virtual {v11, v9}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_13

    :cond_1c
    const/high16 v9, 0x3f800000    # 1.0f

    .line 730
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v15

    move-object/from16 v20, v12

    .line 779
    invoke-virtual {v11}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;

    move-result-object v12

    if-ne v12, v8, :cond_1d

    .line 780
    invoke-static {v9}, Landroid/animation/Keyframe;->ofFloat(F)Landroid/animation/Keyframe;

    move-result-object v9

    goto :goto_12

    .line 781
    :cond_1d
    invoke-virtual {v11}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;

    move-result-object v11

    if-ne v11, v6, :cond_1e

    .line 782
    invoke-static {v9}, Landroid/animation/Keyframe;->ofInt(F)Landroid/animation/Keyframe;

    move-result-object v9

    goto :goto_12

    .line 783
    :cond_1e
    invoke-static {v9}, Landroid/animation/Keyframe;->ofObject(F)Landroid/animation/Keyframe;

    move-result-object v9

    .line 730
    :goto_12
    invoke-virtual {v4, v15, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_14

    :cond_1f
    :goto_13
    move-object/from16 v20, v12

    .line 734
    :goto_14
    invoke-virtual {v7}, Landroid/animation/Keyframe;->getFraction()F

    move-result v9

    const/4 v11, 0x0

    cmpl-float v12, v9, v11

    if-eqz v12, :cond_23

    cmpg-float v9, v9, v11

    if-gez v9, :cond_20

    .line 737
    invoke-virtual {v7, v11}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_16

    .line 779
    :cond_20
    invoke-virtual {v7}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;

    move-result-object v9

    if-ne v9, v8, :cond_21

    .line 780
    invoke-static {v11}, Landroid/animation/Keyframe;->ofFloat(F)Landroid/animation/Keyframe;

    move-result-object v6

    goto :goto_15

    .line 781
    :cond_21
    invoke-virtual {v7}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;

    move-result-object v7

    if-ne v7, v6, :cond_22

    .line 782
    invoke-static {v11}, Landroid/animation/Keyframe;->ofInt(F)Landroid/animation/Keyframe;

    move-result-object v6

    goto :goto_15

    .line 783
    :cond_22
    invoke-static {v11}, Landroid/animation/Keyframe;->ofObject(F)Landroid/animation/Keyframe;

    move-result-object v6

    :goto_15
    const/4 v7, 0x0

    .line 739
    invoke-virtual {v4, v7, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    .line 743
    :cond_23
    :goto_16
    new-array v6, v5, [Landroid/animation/Keyframe;

    .line 744
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    const/4 v4, 0x0

    :goto_17
    if-ge v4, v5, :cond_29

    .line 746
    aget-object v7, v6, v4

    .line 747
    invoke-virtual {v7}, Landroid/animation/Keyframe;->getFraction()F

    move-result v8

    const/4 v9, 0x0

    cmpg-float v8, v8, v9

    if-gez v8, :cond_28

    if-nez v4, :cond_24

    .line 749
    invoke-virtual {v7, v9}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_1b

    :cond_24
    add-int/lit8 v8, v5, -0x1

    if-ne v4, v8, :cond_25

    const/high16 v8, 0x3f800000    # 1.0f

    .line 751
    invoke-virtual {v7, v8}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_1b

    :cond_25
    add-int/lit8 v7, v4, 0x1

    move v9, v4

    :goto_18
    if-ge v7, v8, :cond_27

    .line 758
    aget-object v11, v6, v7

    invoke-virtual {v11}, Landroid/animation/Keyframe;->getFraction()F

    move-result v11

    const/4 v12, 0x0

    cmpl-float v11, v11, v12

    if-ltz v11, :cond_26

    goto :goto_19

    :cond_26
    add-int/lit8 v9, v7, 0x1

    move/from16 v21, v9

    move v9, v7

    move/from16 v7, v21

    goto :goto_18

    :cond_27
    :goto_19
    add-int/lit8 v7, v9, 0x1

    .line 763
    aget-object v7, v6, v7

    invoke-virtual {v7}, Landroid/animation/Keyframe;->getFraction()F

    move-result v7

    add-int/lit8 v8, v4, -0x1

    aget-object v8, v6, v8

    .line 764
    invoke-virtual {v8}, Landroid/animation/Keyframe;->getFraction()F

    move-result v8

    sub-float/2addr v7, v8

    sub-int v8, v9, v4

    add-int/lit8 v8, v8, 0x2

    int-to-float v8, v8

    div-float/2addr v7, v8

    move v8, v4

    :goto_1a
    if-gt v8, v9, :cond_28

    .line 809
    aget-object v11, v6, v8

    add-int/lit8 v12, v8, -0x1

    aget-object v12, v6, v12

    invoke-virtual {v12}, Landroid/animation/Keyframe;->getFraction()F

    move-result v12

    add-float/2addr v12, v7

    invoke-virtual {v11, v12}, Landroid/animation/Keyframe;->setFraction(F)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1a

    :cond_28
    :goto_1b
    add-int/lit8 v4, v4, 0x1

    goto :goto_17

    .line 769
    :cond_29
    invoke-static {v2, v6}, Landroid/animation/PropertyValuesHolder;->ofKeyframe(Ljava/lang/String;[Landroid/animation/Keyframe;)Landroid/animation/PropertyValuesHolder;

    move-result-object v4

    const/4 v5, 0x3

    if-ne v14, v5, :cond_2b

    .line 771
    invoke-static {}, Ll/ܺ᩺ۧ;->֫()Ll/ܺ᩺ۧ;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/animation/PropertyValuesHolder;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    goto :goto_1c

    :cond_2a
    move-object/from16 v19, v6

    move-object/from16 v20, v12

    const/4 v4, 0x0

    :cond_2b
    :goto_1c
    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_2c

    .line 602
    invoke-static {v3, v1, v5, v6, v2}, Ll/ۡ᩺ۧ;->֫(Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;

    move-result-object v4

    :cond_2c
    if-eqz v4, :cond_2e

    if-nez v13, :cond_2d

    .line 609
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v13, v1

    .line 611
    :cond_2d
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    :cond_2e
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_1d

    :cond_2f
    move-object/from16 v16, v1

    move-object/from16 v17, v5

    move-object/from16 v19, v6

    move/from16 v18, v11

    move-object/from16 v20, v12

    .line 616
    :goto_1d
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v15, p4

    move-object/from16 v1, v16

    move-object/from16 v5, v17

    move/from16 v11, v18

    move-object/from16 v6, v19

    move-object/from16 v12, v20

    goto/16 :goto_4

    :cond_30
    move/from16 v18, v11

    move-object/from16 v20, v12

    if-eqz v13, :cond_31

    .line 621
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 622
    new-array v2, v1, [Landroid/animation/PropertyValuesHolder;

    const/4 v3, 0x0

    :goto_1e
    if-ge v3, v1, :cond_32

    .line 624
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/PropertyValuesHolder;

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1e

    :cond_31
    const/4 v2, 0x0

    :cond_32
    if-eqz v2, :cond_33

    .line 544
    instance-of v1, v0, Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_33

    .line 545
    move-object v1, v0

    check-cast v1, Landroid/animation/ValueAnimator;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    :cond_33
    const/4 v13, 0x1

    :goto_1f
    if-eqz v10, :cond_35

    if-nez v13, :cond_35

    if-nez v20, :cond_34

    .line 554
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    goto :goto_20

    :cond_34
    move-object/from16 v12, v20

    .line 556
    :goto_20
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_21

    :cond_35
    move-object/from16 v12, v20

    :goto_21
    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move/from16 v11, v18

    goto/16 :goto_0

    .line 549
    :cond_36
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown animator name: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    move-object/from16 v20, v12

    if-eqz v10, :cond_3a

    if-eqz v20, :cond_3a

    .line 560
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Landroid/animation/Animator;

    .line 562
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_22
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_38

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    add-int/lit8 v5, v3, 0x1

    .line 563
    aput-object v4, v1, v3

    move v3, v5

    goto :goto_22

    :cond_38
    if-nez p6, :cond_39

    .line 566
    invoke-virtual {v10, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-object v0

    .line 568
    :cond_39
    invoke-virtual {v10, v1}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    :cond_3a
    return-object v0
.end method

.method public static ֫(Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;
    .locals 11

    .line 207
    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    .line 209
    iget v0, v0, Landroid/util/TypedValue;->type:I

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 210
    :goto_1
    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    if-eqz v4, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_3

    .line 212
    iget v4, v4, Landroid/util/TypedValue;->type:I

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    const/4 v6, 0x4

    const/4 v7, 0x3

    if-ne p1, v6, :cond_7

    if-eqz v3, :cond_4

    .line 216
    invoke-static {v0}, Ll/ۡ᩺ۧ;->֫(I)Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    if-eqz v5, :cond_6

    invoke-static {v4}, Ll/ۡ᩺ۧ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    const/4 p1, 0x3

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :cond_7
    :goto_4
    if-nez p1, :cond_8

    const/4 v6, 0x1

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    const/4 v8, 0x2

    const/4 v9, 0x0

    if-ne p1, v8, :cond_e

    .line 228
    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 229
    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 232
    invoke-static {p1}, Ll/ܳ۬;->֫(Ljava/lang/String;)[Ll/ܿ۬;

    move-result-object p2

    .line 234
    invoke-static {p0}, Ll/ܳ۬;->֫(Ljava/lang/String;)[Ll/ܿ۬;

    move-result-object p3

    if-nez p2, :cond_9

    if-eqz p3, :cond_d

    :cond_9
    if-eqz p2, :cond_c

    .line 237
    new-instance v0, Ll/ۢ᩺ۧ;

    .line 166
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_b

    .line 239
    invoke-static {p2, p3}, Ll/ܳ۬;->֫([Ll/ܿ۬;[Ll/ܿ۬;)Z

    move-result v3

    if-eqz v3, :cond_a

    new-array p0, v8, [Ljava/lang/Object;

    aput-object p2, p0, v2

    aput-object p3, p0, v1

    .line 243
    invoke-static {p4, v0, p0}, Landroid/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    return-object p0

    .line 240
    :cond_a
    new-instance p2, Landroid/view/InflateException;

    const-string p3, " Can\'t morph from "

    const-string p4, " to "

    .line 0
    invoke-static {p3, p1, p4, p0}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 240
    invoke-direct {p2, p0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    new-array p0, v1, [Ljava/lang/Object;

    aput-object p2, p0, v2

    .line 246
    invoke-static {p4, v0, p0}, Landroid/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    return-object p0

    :cond_c
    if-eqz p3, :cond_d

    .line 250
    new-instance p0, Ll/ۢ᩺ۧ;

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, v1, [Ljava/lang/Object;

    aput-object p3, p1, v2

    .line 251
    invoke-static {p4, p0, p1}, Landroid/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    return-object p0

    :cond_d
    return-object v9

    :cond_e
    if-ne p1, v7, :cond_f

    .line 260
    invoke-static {}, Ll/ܺ᩺ۧ;->֫()Ll/ܺ᩺ۧ;

    move-result-object p1

    goto :goto_6

    :cond_f
    move-object p1, v9

    :goto_6
    const/4 v7, 0x5

    const/4 v10, 0x0

    if-eqz v6, :cond_15

    if-eqz v3, :cond_13

    if-ne v0, v7, :cond_10

    .line 267
    invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    goto :goto_7

    .line 269
    :cond_10
    invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    :goto_7
    if-eqz v5, :cond_12

    if-ne v4, v7, :cond_11

    .line 273
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    goto :goto_8

    .line 275
    :cond_11
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p0

    :goto_8
    new-array p3, v8, [F

    aput p2, p3, v2

    aput p0, p3, v1

    .line 277
    invoke-static {p4, p3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    goto :goto_a

    :cond_12
    new-array p0, v1, [F

    aput p2, p0, v2

    .line 280
    invoke-static {p4, p0}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    goto :goto_a

    :cond_13
    if-ne v4, v7, :cond_14

    .line 284
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    goto :goto_9

    .line 286
    :cond_14
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p0

    :goto_9
    new-array p2, v1, [F

    aput p0, p2, v2

    .line 288
    invoke-static {p4, p2}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    :goto_a
    move-object v9, p0

    goto/16 :goto_e

    :cond_15
    if-eqz v3, :cond_1b

    if-ne v0, v7, :cond_16

    .line 295
    invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    goto :goto_b

    .line 296
    :cond_16
    invoke-static {v0}, Ll/ۡ᩺ۧ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 297
    invoke-virtual {p0, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    goto :goto_b

    .line 299
    :cond_17
    invoke-virtual {p0, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    :goto_b
    if-eqz v5, :cond_1a

    if-ne v4, v7, :cond_18

    .line 303
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    float-to-int p0, p0

    goto :goto_c

    .line 304
    :cond_18
    invoke-static {v4}, Ll/ۡ᩺ۧ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 305
    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p0

    goto :goto_c

    .line 307
    :cond_19
    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    .line 309
    :goto_c
    filled-new-array {p2, p0}, [I

    move-result-object p0

    invoke-static {p4, p0}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    goto :goto_e

    .line 311
    :cond_1a
    filled-new-array {p2}, [I

    move-result-object p0

    invoke-static {p4, p0}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    goto :goto_e

    :cond_1b
    if-eqz v5, :cond_1e

    if-ne v4, v7, :cond_1c

    .line 316
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    float-to-int p0, p0

    goto :goto_d

    .line 317
    :cond_1c
    invoke-static {v4}, Ll/ۡ᩺ۧ;->֫(I)Z

    move-result p2

    if-eqz p2, :cond_1d

    .line 318
    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p0

    goto :goto_d

    .line 320
    :cond_1d
    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    .line 322
    :goto_d
    filled-new-array {p0}, [I

    move-result-object p0

    invoke-static {p4, p0}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    :cond_1e
    :goto_e
    if-eqz v9, :cond_1f

    if-eqz p1, :cond_1f

    .line 327
    invoke-virtual {v9, p1}, Landroid/animation/PropertyValuesHolder;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    :cond_1f
    return-object v9
.end method

.method public static ֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ObjectAnimator;Lorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    .line 890
    sget-object v4, Ll/ۧ᩺ۧ;->ܽ:[I

    invoke-static {v0, v1, v2, v4}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    .line 892
    sget-object v5, Ll/ۧ᩺ۧ;->ܳ:[I

    invoke-static {v0, v1, v2, v5}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    if-nez p4, :cond_0

    .line 896
    new-instance v1, Landroid/animation/ValueAnimator;

    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p4

    :goto_0
    const-string v2, "duration"

    const/16 v5, 0x12c

    const/4 v6, 0x1

    .line 345
    invoke-static {v4, v3, v2, v6, v5}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v2

    int-to-long v7, v2

    const-string v2, "startOffset"

    const-string v5, "http://schemas.android.com/apk/res/android"

    .line 57
    invoke-interface {v3, v5, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v9, 0x2

    const/4 v10, 0x0

    if-eqz v2, :cond_1

    .line 107
    invoke-virtual {v4, v9, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    int-to-long v11, v2

    const-string v2, "valueType"

    .line 57
    invoke-interface {v3, v5, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v9, 0x4

    if-eqz v2, :cond_2

    const/4 v2, 0x7

    .line 107
    invoke-virtual {v4, v2, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x4

    :goto_2
    const-string v13, "valueFrom"

    .line 57
    invoke-interface {v3, v5, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_b

    const-string v13, "valueTo"

    invoke-interface {v3, v5, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_b

    const/4 v13, 0x6

    const/4 v15, 0x5

    if-ne v2, v9, :cond_a

    .line 655
    invoke-virtual {v4, v15}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v2

    if-eqz v2, :cond_3

    const/4 v9, 0x1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    :goto_3
    if-eqz v9, :cond_4

    .line 657
    iget v2, v2, Landroid/util/TypedValue;->type:I

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    .line 658
    :goto_4
    invoke-virtual {v4, v13}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v14

    if-eqz v14, :cond_5

    const/16 v16, 0x1

    goto :goto_5

    :cond_5
    const/16 v16, 0x0

    :goto_5
    if-eqz v16, :cond_6

    .line 660
    iget v14, v14, Landroid/util/TypedValue;->type:I

    goto :goto_6

    :cond_6
    const/4 v14, 0x0

    :goto_6
    if-eqz v9, :cond_7

    .line 664
    invoke-static {v2}, Ll/ۡ᩺ۧ;->֫(I)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    if-eqz v16, :cond_9

    invoke-static {v14}, Ll/ۡ᩺ۧ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    const/4 v2, 0x3

    goto :goto_7

    :cond_9
    const/4 v2, 0x0

    :cond_a
    :goto_7
    const-string v9, ""

    .line 360
    invoke-static {v4, v2, v15, v13, v9}, Ll/ۡ᩺ۧ;->֫(Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    if-eqz v9, :cond_b

    new-array v13, v6, [Landroid/animation/PropertyValuesHolder;

    aput-object v9, v13, v10

    .line 364
    invoke-virtual {v1, v13}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    .line 367
    :cond_b
    invoke-virtual {v1, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 368
    invoke-virtual {v1, v11, v12}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    const-string v7, "repeatCount"

    .line 57
    invoke-interface {v3, v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_c

    const/4 v7, 0x3

    .line 107
    invoke-virtual {v4, v7, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    goto :goto_8

    :cond_c
    const/4 v8, 0x0

    .line 370
    :goto_8
    invoke-virtual {v1, v8}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-string v7, "repeatMode"

    .line 57
    invoke-interface {v3, v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_d

    const/4 v7, 0x4

    .line 107
    invoke-virtual {v4, v7, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    goto :goto_9

    :cond_d
    const/4 v7, 0x1

    .line 372
    :goto_9
    invoke-virtual {v1, v7}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    if-eqz v0, :cond_18

    .line 390
    move-object v7, v1

    check-cast v7, Landroid/animation/ObjectAnimator;

    const-string v8, "pathData"

    .line 391
    invoke-static {v0, v3, v8, v6}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_17

    const-string v9, "propertyXName"

    const/4 v11, 0x2

    .line 403
    invoke-static {v0, v3, v9, v11}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v9

    const-string v12, "propertyYName"

    const/4 v13, 0x3

    .line 405
    invoke-static {v0, v3, v12, v13}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v12

    if-nez v9, :cond_f

    if-eqz v12, :cond_e

    goto :goto_a

    .line 415
    :cond_e
    new-instance v1, Landroid/view/InflateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " propertyXName or propertyYName is needed for PathData"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 418
    :cond_f
    :goto_a
    invoke-static {v8}, Ll/ܳ۬;->ۧ(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object v2

    .line 436
    new-instance v8, Landroid/graphics/PathMeasure;

    invoke-direct {v8, v2, v10}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 440
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    .line 441
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v13, 0x0

    .line 443
    :goto_b
    invoke-virtual {v8}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v14

    add-float/2addr v13, v14

    .line 445
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    invoke-virtual {v8}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v14

    if-nez v14, :cond_16

    .line 450
    new-instance v8, Landroid/graphics/PathMeasure;

    invoke-direct {v8, v2, v10}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    const/high16 v2, 0x3f000000    # 0.5f

    div-float v2, v13, v2

    float-to-int v2, v2

    add-int/2addr v2, v6

    const/16 v6, 0x64

    .line 452
    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 454
    new-array v6, v2, [F

    .line 455
    new-array v10, v2, [F

    const/4 v15, 0x2

    new-array v15, v15, [F

    add-int/lit8 v14, v2, -0x1

    int-to-float v14, v14

    div-float/2addr v13, v14

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 p3, v5

    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_c
    const/4 v5, 0x0

    if-ge v1, v2, :cond_11

    .line 466
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/Float;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Float;->floatValue()F

    move-result v18

    move/from16 p4, v2

    sub-float v2, v14, v18

    invoke-virtual {v8, v2, v15, v5}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    const/4 v2, 0x0

    .line 469
    aget v5, v15, v2

    aput v5, v6, v1

    const/4 v2, 0x1

    .line 470
    aget v5, v15, v2

    aput v5, v10, v1

    add-float/2addr v14, v13

    add-int/lit8 v5, v4, 0x1

    .line 472
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v5, v2, :cond_10

    .line 473
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    cmpl-float v2, v14, v2

    if-lez v2, :cond_10

    .line 475
    invoke-virtual {v8}, Landroid/graphics/PathMeasure;->nextContour()Z

    move v4, v5

    :cond_10
    add-int/lit8 v1, v1, 0x1

    move/from16 v2, p4

    goto :goto_c

    :cond_11
    if-eqz v9, :cond_12

    .line 483
    invoke-static {v9, v6}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    goto :goto_d

    :cond_12
    move-object v1, v5

    :goto_d
    if-eqz v12, :cond_13

    .line 486
    invoke-static {v12, v10}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v5

    :cond_13
    if-nez v1, :cond_14

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/animation/PropertyValuesHolder;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    .line 489
    invoke-virtual {v7, v1}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    goto :goto_e

    :cond_14
    const/4 v2, 0x0

    const/4 v4, 0x1

    if-nez v5, :cond_15

    new-array v4, v4, [Landroid/animation/PropertyValuesHolder;

    aput-object v1, v4, v2

    .line 491
    invoke-virtual {v7, v4}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    goto :goto_e

    :cond_15
    const/4 v6, 0x2

    new-array v6, v6, [Landroid/animation/PropertyValuesHolder;

    aput-object v1, v6, v2

    aput-object v5, v6, v4

    .line 493
    invoke-virtual {v7, v6}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    goto :goto_e

    :cond_16
    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 p3, v5

    const/4 v10, 0x0

    goto/16 :goto_b

    :cond_17
    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 p3, v5

    const-string v1, "propertyName"

    const/4 v2, 0x0

    .line 423
    invoke-static {v0, v3, v1, v2}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    .line 425
    invoke-virtual {v7, v1}, Landroid/animation/ObjectAnimator;->setPropertyName(Ljava/lang/String;)V

    goto :goto_f

    :cond_18
    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 p3, v5

    :goto_e
    const/4 v2, 0x0

    :goto_f
    const-string v1, "interpolator"

    move-object/from16 v4, p3

    .line 57
    invoke-interface {v3, v4, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_19

    move-object/from16 v1, v17

    .line 206
    invoke-virtual {v1, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    goto :goto_10

    :cond_19
    move-object/from16 v1, v17

    const/4 v2, 0x0

    :goto_10
    if-lez v2, :cond_1a

    move-object/from16 v3, p0

    .line 68
    invoke-static {v3, v2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v2

    move-object/from16 v3, v16

    .line 906
    invoke-virtual {v3, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    goto :goto_11

    :cond_1a
    move-object/from16 v3, v16

    .line 909
    :goto_11
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v0, :cond_1b

    .line 911
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1b
    return-object v3
.end method

.method public static ֫(I)Z
    .locals 1

    const/16 v0, 0x1c

    if-lt p0, v0, :cond_0

    const/16 v0, 0x1f

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
