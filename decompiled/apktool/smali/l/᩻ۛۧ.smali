.class public Ll/᩻ۛۧ;
.super Ll/ܽۨۧ;
.source "A65W"


# static fields
.field public static final ۗ:Landroid/util/Property;

.field public static final ۙ:Landroid/util/Property;

.field public static final ۤ:[Ljava/lang/String;

.field public static final ۫:Ll/֨ۛۧ;

.field public static final ۬:Landroid/util/Property;

.field public static final ᩶:Landroid/util/Property;

.field public static final ᩹:Landroid/util/Property;


# instance fields
.field public ᩸:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "android:changeBounds:windowX"

    const-string v1, "android:changeBounds:windowY"

    const-string v2, "android:changeBounds:bounds"

    const-string v3, "android:changeBounds:clip"

    const-string v4, "android:changeBounds:parent"

    .line 54
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩻ۛۧ;->ۤ:[Ljava/lang/String;

    .line 62
    new-instance v0, Ll/᩺ۤۧ;

    .line 63
    const-class v1, Landroid/graphics/PointF;

    const-string v2, "topLeft"

    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 62
    sput-object v0, Ll/᩻ۛۧ;->۬:Landroid/util/Property;

    .line 75
    new-instance v0, Ll/ܰۤۧ;

    const-string v3, "bottomRight"

    .line 76
    invoke-direct {v0, v1, v3}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 75
    sput-object v0, Ll/᩻ۛۧ;->᩶:Landroid/util/Property;

    .line 88
    new-instance v0, Ll/۟ۤۧ;

    .line 89
    invoke-direct {v0, v1, v3}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 88
    sput-object v0, Ll/᩻ۛۧ;->᩹:Landroid/util/Property;

    .line 105
    new-instance v0, Ll/֫ۛۧ;

    .line 106
    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 105
    sput-object v0, Ll/᩻ۛۧ;->ۗ:Landroid/util/Property;

    .line 122
    new-instance v0, Ll/ۧۛۧ;

    const-string v2, "position"

    .line 123
    invoke-direct {v0, v1, v2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 122
    sput-object v0, Ll/᩻ۛۧ;->ۙ:Landroid/util/Property;

    .line 141
    new-instance v0, Ll/֨ۛۧ;

    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 141
    sput-object v0, Ll/᩻ۛۧ;->۫:Ll/֨ۛۧ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 143
    invoke-direct {p0}, Ll/ܽۨۧ;-><init>()V

    const/4 v0, 0x0

    .line 139
    iput-boolean v0, p0, Ll/᩻ۛۧ;->᩸:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 147
    invoke-direct {p0, p1, p2}, Ll/ܽۨۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 139
    iput-boolean v0, p0, Ll/᩻ۛۧ;->᩸:Z

    .line 149
    sget-object v1, Ll/ܶۛۧ;->ۧ:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 150
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v1, "resizeClip"

    .line 86
    invoke-static {p2, v1}, Ll/ۗۗ;->֫(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 152
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 181
    iput-boolean v0, p0, Ll/᩻ۛۧ;->᩸:Z

    return-void
.end method

.method private captureValues(Ll/᩵ۨۧ;)V
    .locals 7

    .line 196
    iget-object v0, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    iget-object v1, p1, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    .line 198
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    if-eqz v2, :cond_1

    .line 199
    :cond_0
    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    .line 200
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v6

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    const-string v3, "android:changeBounds:bounds"

    .line 199
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    iget-object p1, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    const-string v2, "android:changeBounds:parent"

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    iget-boolean p1, p0, Ll/᩻ۛۧ;->᩸:Z

    if-eqz p1, :cond_1

    const-string p1, "android:changeBounds:clip"

    .line 203
    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method


# virtual methods
.method public final captureEndValues(Ll/᩵ۨۧ;)V
    .locals 0

    .line 222
    invoke-direct {p0, p1}, Ll/᩻ۛۧ;->captureValues(Ll/᩵ۨۧ;)V

    return-void
.end method

.method public final captureStartValues(Ll/᩵ۨۧ;)V
    .locals 2

    .line 210
    invoke-direct {p0, p1}, Ll/᩻ۛۧ;->captureValues(Ll/᩵ۨۧ;)V

    .line 211
    iget-boolean v0, p0, Ll/᩻ۛۧ;->᩸:Z

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    const v1, 0x7f0a0646

    .line 213
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    .line 215
    iget-object p1, p1, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    const-string v1, "android:changeBounds:clip"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final createAnimator(Landroid/view/ViewGroup;Ll/᩵ۨۧ;Ll/᩵ۨۧ;)Landroid/animation/Animator;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    if-eqz v1, :cond_1b

    .line 229
    iget-object v1, v1, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    if-nez v2, :cond_0

    goto/16 :goto_e

    :cond_0
    iget-object v3, v2, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    const-string v4, "android:changeBounds:parent"

    .line 234
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    .line 235
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    if-eqz v5, :cond_1b

    if-nez v4, :cond_1

    goto/16 :goto_e

    .line 239
    :cond_1
    iget-object v2, v2, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    const-string v4, "android:changeBounds:bounds"

    .line 240
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    .line 241
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Rect;

    .line 242
    iget v12, v5, Landroid/graphics/Rect;->left:I

    .line 243
    iget v15, v4, Landroid/graphics/Rect;->left:I

    .line 244
    iget v13, v5, Landroid/graphics/Rect;->top:I

    .line 245
    iget v14, v4, Landroid/graphics/Rect;->top:I

    .line 246
    iget v11, v5, Landroid/graphics/Rect;->right:I

    .line 247
    iget v10, v4, Landroid/graphics/Rect;->right:I

    .line 248
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 249
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    sub-int v6, v11, v12

    sub-int v7, v5, v13

    sub-int v8, v10, v15

    sub-int v9, v4, v14

    move-object/from16 p2, v2

    const-string v2, "android:changeBounds:clip"

    .line 254
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    .line 255
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    if-eqz v6, :cond_2

    if-nez v7, :cond_3

    :cond_2
    if-eqz v8, :cond_7

    if-eqz v9, :cond_7

    :cond_3
    if-ne v12, v15, :cond_5

    if-eq v13, v14, :cond_4

    goto :goto_0

    :cond_4
    const/16 v16, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/16 v16, 0x1

    :goto_1
    if-ne v11, v10, :cond_6

    if-eq v5, v4, :cond_8

    :cond_6
    add-int/lit8 v16, v16, 0x1

    goto :goto_2

    :cond_7
    const/16 v16, 0x0

    :cond_8
    :goto_2
    if-eqz v1, :cond_9

    .line 261
    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_a

    :cond_9
    if-nez v1, :cond_b

    if-eqz v2, :cond_b

    :cond_a
    add-int/lit8 v16, v16, 0x1

    :cond_b
    move/from16 v3, v16

    const/16 v16, 0x0

    if-lez v3, :cond_1b

    move-object/from16 v17, v2

    .line 267
    iget-boolean v2, v0, Ll/᩻ۛۧ;->᩸:Z

    sget-object v0, Ll/᩻ۛۧ;->ۙ:Landroid/util/Property;

    if-nez v2, :cond_10

    move-object/from16 v2, p2

    .line 268
    invoke-static {v2, v12, v13, v11, v5}, Ll/᩸ۨۧ;->֫(Landroid/view/View;IIII)V

    const/4 v1, 0x2

    if-ne v3, v1, :cond_d

    if-ne v6, v8, :cond_c

    if-ne v7, v9, :cond_c

    .line 272
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getPathMotion()Ll/֡ۛۧ;

    move-result-object v1

    int-to-float v3, v12

    int-to-float v4, v13

    int-to-float v5, v15

    int-to-float v6, v14

    invoke-virtual {v1, v3, v4, v5, v6}, Ll/֡ۛۧ;->getPath(FFFF)Landroid/graphics/Path;

    move-result-object v1

    .line 32
    invoke-static {v2, v0, v1}, Ll/᩵ۛۧ;->֫(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    goto :goto_5

    .line 277
    :cond_c
    new-instance v0, Ll/ܳۛۧ;

    invoke-direct {v0, v2}, Ll/ܳۛۧ;-><init>(Landroid/view/View;)V

    .line 278
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getPathMotion()Ll/֡ۛۧ;

    move-result-object v1

    int-to-float v3, v12

    int-to-float v6, v13

    int-to-float v7, v15

    int-to-float v8, v14

    invoke-virtual {v1, v3, v6, v7, v8}, Ll/֡ۛۧ;->getPath(FFFF)Landroid/graphics/Path;

    move-result-object v1

    .line 280
    sget-object v3, Ll/᩻ۛۧ;->۬:Landroid/util/Property;

    .line 32
    invoke-static {v0, v3, v1}, Ll/᩵ۛۧ;->֫(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 283
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getPathMotion()Ll/֡ۛۧ;

    move-result-object v3

    int-to-float v6, v11

    int-to-float v5, v5

    int-to-float v7, v10

    int-to-float v4, v4

    invoke-virtual {v3, v6, v5, v7, v4}, Ll/֡ۛۧ;->getPath(FFFF)Landroid/graphics/Path;

    move-result-object v3

    .line 285
    sget-object v4, Ll/᩻ۛۧ;->᩶:Landroid/util/Property;

    .line 32
    invoke-static {v0, v4, v3}, Ll/᩵ۛۧ;->֫(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 287
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v5, 0x2

    new-array v5, v5, [Landroid/animation/Animator;

    aput-object v1, v5, v16

    const/4 v1, 0x1

    aput-object v3, v5, v1

    .line 288
    invoke-virtual {v4, v5}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 290
    new-instance v1, Ll/ܽۛۧ;

    invoke-direct {v1, v0}, Ll/ܽۛۧ;-><init>(Ll/ܳۛۧ;)V

    invoke-virtual {v4, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object/from16 v1, p0

    move-object/from16 p2, v2

    move-object v0, v4

    goto/16 :goto_d

    :cond_d
    if-ne v12, v15, :cond_f

    if-eq v13, v14, :cond_e

    goto :goto_3

    .line 303
    :cond_e
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getPathMotion()Ll/֡ۛۧ;

    move-result-object v0

    int-to-float v1, v11

    int-to-float v3, v5

    int-to-float v5, v10

    int-to-float v4, v4

    invoke-virtual {v0, v1, v3, v5, v4}, Ll/֡ۛۧ;->getPath(FFFF)Landroid/graphics/Path;

    move-result-object v0

    .line 305
    sget-object v1, Ll/᩻ۛۧ;->᩹:Landroid/util/Property;

    goto :goto_4

    .line 298
    :cond_f
    :goto_3
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getPathMotion()Ll/֡ۛۧ;

    move-result-object v0

    int-to-float v1, v12

    int-to-float v3, v13

    int-to-float v4, v15

    int-to-float v5, v14

    invoke-virtual {v0, v1, v3, v4, v5}, Ll/֡ۛۧ;->getPath(FFFF)Landroid/graphics/Path;

    move-result-object v0

    .line 300
    sget-object v1, Ll/᩻ۛۧ;->ۗ:Landroid/util/Property;

    .line 32
    :goto_4
    invoke-static {v2, v1, v0}, Ll/᩵ۛۧ;->֫(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    :goto_5
    move-object/from16 v1, p0

    move-object/from16 p2, v2

    goto/16 :goto_d

    :cond_10
    move-object/from16 v2, p2

    .line 309
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 310
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v16

    add-int/2addr v3, v12

    move/from16 v18, v10

    add-int v10, v13, v16

    .line 312
    invoke-static {v2, v12, v13, v3, v10}, Ll/᩸ۨۧ;->֫(Landroid/view/View;IIII)V

    if-ne v12, v15, :cond_12

    if-eq v13, v14, :cond_11

    goto :goto_6

    :cond_11
    move/from16 v19, v4

    move/from16 v16, v11

    move/from16 p2, v15

    const/4 v0, 0x0

    goto :goto_7

    .line 317
    :cond_12
    :goto_6
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getPathMotion()Ll/֡ۛۧ;

    move-result-object v3

    int-to-float v10, v12

    move/from16 v16, v11

    int-to-float v11, v13

    move/from16 v19, v4

    int-to-float v4, v15

    move/from16 p2, v15

    int-to-float v15, v14

    invoke-virtual {v3, v10, v11, v4, v15}, Ll/֡ۛۧ;->getPath(FFFF)Landroid/graphics/Path;

    move-result-object v3

    .line 32
    invoke-static {v2, v0, v3}, Ll/᩵ۛۧ;->֫(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    :goto_7
    if-nez v1, :cond_13

    const/4 v3, 0x1

    goto :goto_8

    :cond_13
    const/4 v3, 0x0

    :goto_8
    if-eqz v3, :cond_14

    .line 324
    new-instance v1, Landroid/graphics/Rect;

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_9

    :cond_14
    const/4 v4, 0x0

    :goto_9
    if-nez v17, :cond_15

    const/4 v6, 0x1

    const/4 v11, 0x1

    goto :goto_a

    :cond_15
    const/4 v6, 0x0

    const/4 v11, 0x0

    :goto_a
    if-eqz v11, :cond_16

    .line 328
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6, v4, v4, v8, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v10, v6

    goto :goto_b

    :cond_16
    move-object/from16 v10, v17

    .line 331
    :goto_b
    invoke-virtual {v1, v10}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_17

    .line 332
    invoke-virtual {v2, v1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    .line 333
    aput-object v1, v6, v4

    const/4 v4, 0x1

    aput-object v10, v6, v4

    const-string v4, "clipBounds"

    sget-object v7, Ll/᩻ۛۧ;->۫:Ll/֨ۛۧ;

    invoke-static {v2, v4, v7, v6}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 335
    new-instance v15, Ll/ᩳۛۧ;

    move-object v6, v15

    move-object v7, v2

    move-object v8, v1

    move v9, v3

    move/from16 v1, v18

    move/from16 v3, v16

    move/from16 v17, v14

    move v14, v3

    move/from16 v3, p2

    move-object/from16 p2, v2

    move-object v2, v15

    move v15, v5

    move/from16 v16, v3

    invoke-direct/range {v6 .. v19}, Ll/ᩳۛۧ;-><init>(Landroid/view/View;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZIIIIIIII)V

    .line 340
    invoke-virtual {v4, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object/from16 v1, p0

    .line 341
    invoke-virtual {v1, v2}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    move-object v9, v4

    goto :goto_c

    :cond_17
    move-object/from16 v1, p0

    move-object/from16 p2, v2

    const/4 v9, 0x0

    .line 343
    :goto_c
    sget v2, Ll/ᩴۨۧ;->֫:I

    if-nez v0, :cond_18

    move-object v0, v9

    goto :goto_d

    :cond_18
    if-nez v9, :cond_19

    goto :goto_d

    .line 146
    :cond_19
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/animation/Animator;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v9, v3, v0

    .line 147
    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    move-object v0, v2

    .line 346
    :goto_d
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v2, v2, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1a

    .line 347
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v3, 0x1

    .line 348
    invoke-static {v2, v3}, Ll/֨ۨۧ;->֫(Landroid/view/ViewGroup;Z)V

    .line 349
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getRootTransition()Ll/ܽۨۧ;

    move-result-object v3

    new-instance v4, Ll/ܿۛۧ;

    invoke-direct {v4, v2}, Ll/ܿۛۧ;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v3, v4}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    :cond_1a
    return-object v0

    :cond_1b
    :goto_e
    move-object v1, v0

    const/4 v9, 0x0

    return-object v9
.end method

.method public final getTransitionProperties()[Ljava/lang/String;
    .locals 1

    .line 164
    sget-object v0, Ll/᩻ۛۧ;->ۤ:[Ljava/lang/String;

    return-object v0
.end method

.method public final isSeekingSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
