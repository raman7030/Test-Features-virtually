.class public final Ll/ܳۗ;
.super Ljava/lang/Object;
.source "Q216"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/lang/ThreadLocal;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ܳۗ;->ۧ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static ֫(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 4

    .line 91
    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    .line 94
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_1

    .line 103
    invoke-static {p0, p1, v0, p2}, Ll/ܳۗ;->֫(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    .line 100
    :cond_1
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 118
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "selector"

    .line 119
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    .line 133
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    const/16 v5, 0x14

    new-array v6, v5, [[I

    new-array v5, v5, [I

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 141
    :goto_0
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v9

    if-eq v9, v4, :cond_14

    .line 142
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v10

    const/4 v11, 0x3

    if-ge v10, v3, :cond_0

    if-eq v9, v11, :cond_14

    :cond_0
    const/4 v12, 0x2

    if-ne v9, v12, :cond_13

    if-gt v10, v3, :cond_13

    .line 144
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "item"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    goto/16 :goto_c

    .line 233
    :cond_1
    sget-object v9, Ll/᩻᩹;->֫:[I

    if-nez v2, :cond_2

    invoke-virtual {v0, v1, v9}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v9

    goto :goto_1

    .line 234
    :cond_2
    invoke-virtual {v2, v1, v9, v7, v7}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v9

    :goto_1
    const/4 v10, -0x1

    .line 149
    invoke-virtual {v9, v7, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v12

    const v13, -0xff01

    const/16 v14, 0x1f

    if-eq v12, v10, :cond_5

    .line 223
    sget-object v10, Ll/ܳۗ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v10}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/util/TypedValue;

    if-nez v15, :cond_3

    .line 225
    new-instance v15, Landroid/util/TypedValue;

    invoke-direct {v15}, Landroid/util/TypedValue;-><init>()V

    .line 226
    invoke-virtual {v10, v15}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 216
    :cond_3
    invoke-virtual {v0, v12, v15, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 217
    iget v10, v15, Landroid/util/TypedValue;->type:I

    const/16 v15, 0x1c

    if-lt v10, v15, :cond_4

    if-gt v10, v14, :cond_4

    goto :goto_2

    .line 153
    :cond_4
    :try_start_0
    invoke-virtual {v0, v12}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v10

    invoke-static {v0, v10, v2}, Ll/ܳۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 155
    :catch_0
    invoke-virtual {v9, v7, v13}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    goto :goto_3

    .line 159
    :cond_5
    :goto_2
    invoke-virtual {v9, v7, v13}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    .line 163
    :goto_3
    invoke-virtual {v9, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v10

    const/high16 v12, 0x3f800000    # 1.0f

    if-eqz v10, :cond_6

    .line 164
    invoke-virtual {v9, v4, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    goto :goto_4

    .line 165
    :cond_6
    invoke-virtual {v9, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 166
    invoke-virtual {v9, v11, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    goto :goto_4

    :cond_7
    const/high16 v4, 0x3f800000    # 1.0f

    .line 170
    :goto_4
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v11, 0x4

    const/high16 v12, -0x40800000    # -1.0f

    if-lt v10, v14, :cond_8

    const/4 v10, 0x2

    .line 171
    invoke-virtual {v9, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v13

    if-eqz v13, :cond_8

    .line 172
    invoke-virtual {v9, v10, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v10

    goto :goto_5

    .line 174
    :cond_8
    invoke-virtual {v9, v11, v12}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v10

    .line 177
    :goto_5
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 181
    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v9

    .line 182
    new-array v11, v9, [I

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_6
    if-ge v13, v9, :cond_b

    .line 184
    invoke-interface {v1, v13}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    move-result v15

    const v14, 0x10101a5

    if-eq v15, v14, :cond_a

    const v14, 0x101031f

    if-eq v15, v14, :cond_a

    const v14, 0x7f040034

    if-eq v15, v14, :cond_a

    const v14, 0x7f0402a7

    if-eq v15, v14, :cond_a

    add-int/lit8 v14, v12, 0x1

    const/4 v0, 0x0

    .line 190
    invoke-interface {v1, v13, v0}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_7

    :cond_9
    neg-int v15, v15

    .line 191
    :goto_7
    aput v15, v11, v12

    move v12, v14

    :cond_a
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    goto :goto_6

    .line 194
    :cond_b
    invoke-static {v11, v12}, Landroid/util/StateSet;->trimStateSet([II)[I

    move-result-object v0

    const/4 v9, 0x0

    cmpl-float v9, v10, v9

    if-ltz v9, :cond_c

    const/high16 v9, 0x42c80000    # 100.0f

    cmpg-float v9, v10, v9

    if-gtz v9, :cond_c

    const/4 v9, 0x1

    goto :goto_8

    :cond_c
    const/4 v9, 0x0

    :goto_8
    const/high16 v11, 0x3f800000    # 1.0f

    cmpl-float v11, v4, v11

    if-nez v11, :cond_d

    if-nez v9, :cond_d

    goto :goto_9

    .line 246
    :cond_d
    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v11

    int-to-float v11, v11

    mul-float v11, v11, v4

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v11, v4

    float-to-int v4, v11

    const/16 v11, 0xff

    const/4 v12, 0x0

    .line 247
    invoke-static {v4, v12, v11}, Ll/֫۫;->֫(III)I

    move-result v4

    if-eqz v9, :cond_e

    .line 250
    invoke-static {v7}, Ll/ᩳۗ;->֫(I)Ll/ᩳۗ;

    move-result-object v7

    .line 251
    invoke-virtual {v7}, Ll/ᩳۗ;->ۧ()F

    move-result v9

    invoke-virtual {v7}, Ll/ᩳۗ;->֫()F

    move-result v7

    invoke-static {v9, v7, v10}, Ll/ᩳۗ;->ۧ(FFF)I

    move-result v7

    :cond_e
    const v9, 0xffffff

    and-int/2addr v7, v9

    shl-int/lit8 v4, v4, 0x18

    or-int/2addr v7, v4

    :goto_9
    add-int/lit8 v4, v8, 0x1

    .line 56
    array-length v9, v5

    const/16 v10, 0x8

    if-le v4, v9, :cond_10

    const/4 v9, 0x4

    if-gt v8, v9, :cond_f

    const/16 v9, 0x8

    goto :goto_a

    :cond_f
    mul-int/lit8 v9, v8, 0x2

    .line 57
    :goto_a
    new-array v9, v9, [I

    const/4 v11, 0x0

    .line 58
    invoke-static {v5, v11, v9, v11, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v5, v9

    .line 61
    :cond_10
    aput v7, v5, v8

    .line 42
    array-length v7, v6

    if-le v4, v7, :cond_12

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v7

    const/4 v9, 0x4

    if-gt v8, v9, :cond_11

    goto :goto_b

    :cond_11
    mul-int/lit8 v10, v8, 0x2

    :goto_b
    invoke-static {v7, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ljava/lang/Object;

    const/4 v9, 0x0

    .line 45
    invoke-static {v6, v9, v7, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v6, v7

    .line 48
    :cond_12
    aput-object v0, v6, v8

    .line 202
    check-cast v6, [[I

    move v8, v4

    :cond_13
    :goto_c
    const/4 v4, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 206
    :cond_14
    new-array v0, v8, [I

    .line 207
    new-array v1, v8, [[I

    const/4 v2, 0x0

    .line 208
    invoke-static {v5, v2, v0, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 209
    invoke-static {v6, v2, v1, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 211
    new-instance v2, Landroid/content/res/ColorStateList;

    invoke-direct {v2, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v2

    .line 120
    :cond_15
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": invalid color state list tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
