.class public final Ll/᩻ۗ;
.super Ljava/lang/Object;
.source "J204"


# instance fields
.field public ֫:I

.field public final ۧ:Landroid/content/res/ColorStateList;

.field public final ܽ:Landroid/graphics/Shader;


# direct methods
.method public constructor <init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Ll/᩻ۗ;->ܽ:Landroid/graphics/Shader;

    .line 62
    iput-object p2, p0, Ll/᩻ۗ;->ۧ:Landroid/content/res/ColorStateList;

    .line 63
    iput p3, p0, Ll/᩻ۗ;->֫:I

    return-void
.end method

.method public static ֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩻ۗ;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 151
    invoke-virtual/range {p0 .. p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    .line 152
    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    .line 154
    :goto_0
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eq v4, v6, :cond_0

    if-eq v4, v5, :cond_0

    goto :goto_0

    :cond_0
    if-ne v4, v6, :cond_22

    .line 161
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 162
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "gradient"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_2

    const-string v5, "selector"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 164
    invoke-static {v0, v2, v3, v1}, Ll/ܳۗ;->֫(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 71
    new-instance v1, Ll/᩻ۗ;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-direct {v1, v8, v0, v2}, Ll/᩻ۗ;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v1

    .line 170
    :cond_1
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": unsupported complex color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_2
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 90
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    .line 95
    sget-object v4, Ll/᩻᩹;->ᩳ:[I

    invoke-static {v0, v1, v3, v4}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    const-string v5, "http://schemas.android.com/apk/res/android"

    const-string v7, "startX"

    .line 57
    invoke-interface {v2, v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_3

    const/16 v7, 0x8

    .line 73
    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v10, v7

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    const/4 v10, 0x0

    :goto_1
    const-string v7, "startY"

    .line 57
    invoke-interface {v2, v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    const/16 v7, 0x9

    .line 73
    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v11, v7

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    const/4 v11, 0x0

    :goto_2
    const-string v7, "endX"

    .line 57
    invoke-interface {v2, v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    const/16 v7, 0xa

    .line 73
    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v12, v7

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    const/4 v12, 0x0

    :goto_3
    const-string v7, "endY"

    .line 57
    invoke-interface {v2, v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    const/16 v7, 0xb

    .line 73
    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v13, v7

    goto :goto_4

    :cond_6
    const/4 v7, 0x0

    const/4 v13, 0x0

    :goto_4
    const-string v7, "centerX"

    .line 57
    invoke-interface {v2, v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x3

    if-eqz v7, :cond_7

    .line 73
    invoke-virtual {v4, v9, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v15, v7

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    const/4 v15, 0x0

    :goto_5
    const-string v7, "centerY"

    .line 57
    invoke-interface {v2, v5, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    const/4 v7, 0x4

    .line 73
    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    goto :goto_6

    :cond_8
    const/4 v7, 0x0

    :goto_6
    const-string v8, "type"

    .line 57
    invoke-interface {v2, v5, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_9

    .line 107
    invoke-virtual {v4, v6, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    goto :goto_7

    :cond_9
    const/4 v6, 0x0

    :goto_7
    const-string v8, "startColor"

    .line 57
    invoke-interface {v2, v5, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_a

    .line 125
    invoke-virtual {v4, v9, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    goto :goto_8

    :cond_a
    const/4 v8, 0x0

    :goto_8
    const-string v14, "centerColor"

    .line 57
    invoke-interface {v2, v5, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_b

    const/16 v16, 0x1

    goto :goto_9

    :cond_b
    const/16 v16, 0x0

    :goto_9
    invoke-interface {v2, v5, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_c

    const/4 v14, 0x7

    .line 125
    invoke-virtual {v4, v14, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    goto :goto_a

    :cond_c
    const/4 v9, 0x0

    :goto_a
    const-string v14, "endColor"

    .line 57
    invoke-interface {v2, v5, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_d

    const/4 v14, 0x0

    move/from16 v17, v7

    const/4 v7, 0x1

    .line 125
    invoke-virtual {v4, v7, v14}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    goto :goto_b

    :cond_d
    move/from16 v17, v7

    const/4 v7, 0x0

    :goto_b
    const-string v14, "tileMode"

    .line 57
    invoke-interface {v2, v5, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_e

    const/4 v14, 0x6

    move/from16 v18, v15

    const/4 v15, 0x0

    .line 107
    invoke-virtual {v4, v14, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v14

    goto :goto_c

    :cond_e
    move/from16 v18, v15

    const/4 v14, 0x0

    :goto_c
    const-string v15, "gradientRadius"

    .line 57
    invoke-interface {v2, v5, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_f

    const/4 v5, 0x5

    const/4 v15, 0x0

    .line 73
    invoke-virtual {v4, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    goto :goto_d

    :cond_f
    const/4 v5, 0x0

    .line 122
    :goto_d
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 149
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    .line 153
    new-instance v15, Ljava/util/ArrayList;

    move/from16 p1, v5

    const/16 v5, 0x14

    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v19, v13

    .line 154
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    :goto_e
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    move/from16 v20, v12

    const/4 v12, 0x1

    if-eq v5, v12, :cond_15

    .line 157
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v12

    move/from16 v21, v11

    if-ge v12, v4, :cond_10

    const/4 v11, 0x3

    if-eq v5, v11, :cond_16

    :cond_10
    const/4 v11, 0x2

    if-eq v5, v11, :cond_11

    goto :goto_f

    :cond_11
    if-gt v12, v4, :cond_14

    .line 162
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v11, "item"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_f

    .line 166
    :cond_12
    sget-object v5, Ll/᩻᩹;->ܿ:[I

    invoke-static {v0, v1, v3, v5}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    const/4 v11, 0x0

    .line 168
    invoke-virtual {v5, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v11

    const/4 v12, 0x1

    .line 169
    invoke-virtual {v5, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v22

    if-eqz v11, :cond_13

    if-eqz v22, :cond_13

    const/4 v11, 0x0

    .line 177
    invoke-virtual {v5, v11, v11}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v11

    const/4 v0, 0x0

    .line 178
    invoke-virtual {v5, v12, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 179
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 181
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 171
    :cond_13
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": <item> tag requires a \'color\' attribute and a \'offset\' attribute!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    :goto_f
    move-object/from16 v0, p0

    move/from16 v12, v20

    move/from16 v11, v21

    goto :goto_e

    :cond_15
    move/from16 v21, v11

    .line 184
    :cond_16
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_17

    new-instance v0, Ll/ۘۗ;

    invoke-direct {v0, v13, v15}, Ll/ۘۗ;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    goto :goto_10

    :cond_17
    const/4 v0, 0x0

    :goto_10
    if-eqz v0, :cond_18

    goto :goto_11

    :cond_18
    if-eqz v16, :cond_19

    .line 194
    new-instance v0, Ll/ۘۗ;

    invoke-direct {v0, v8, v9, v7}, Ll/ۘۗ;-><init>(III)V

    goto :goto_11

    .line 196
    :cond_19
    new-instance v0, Ll/ۘۗ;

    invoke-direct {v0, v8, v7}, Ll/ۘۗ;-><init>(II)V

    :goto_11
    const/4 v1, 0x1

    if-eq v6, v1, :cond_1d

    const/4 v2, 0x2

    if-eq v6, v2, :cond_1c

    .line 140
    new-instance v3, Landroid/graphics/LinearGradient;

    iget-object v4, v0, Ll/ۘۗ;->֫:[I

    iget-object v15, v0, Ll/ۘۗ;->ۧ:[F

    if-eq v14, v1, :cond_1b

    if-eq v14, v2, :cond_1a

    .line 208
    sget-object v0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    goto :goto_12

    .line 205
    :cond_1a
    sget-object v0, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_12

    .line 203
    :cond_1b
    sget-object v0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    :goto_12
    move-object/from16 v16, v0

    move-object v9, v3

    move/from16 v11, v21

    move/from16 v12, v20

    move/from16 v13, v19

    move-object v14, v4

    .line 141
    invoke-direct/range {v9 .. v16}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    goto :goto_14

    .line 136
    :cond_1c
    new-instance v3, Landroid/graphics/SweepGradient;

    iget-object v1, v0, Ll/ۘۗ;->֫:[I

    iget-object v0, v0, Ll/ۘۗ;->ۧ:[F

    move/from16 v2, v17

    move/from16 v7, v18

    invoke-direct {v3, v7, v2, v1, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    goto :goto_14

    :cond_1d
    move/from16 v2, v17

    move/from16 v7, v18

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    if-lez v1, :cond_20

    .line 133
    new-instance v3, Landroid/graphics/RadialGradient;

    iget-object v1, v0, Ll/ۘۗ;->֫:[I

    iget-object v0, v0, Ll/ۘۗ;->ۧ:[F

    const/4 v4, 0x1

    if-eq v14, v4, :cond_1f

    const/4 v4, 0x2

    if-eq v14, v4, :cond_1e

    .line 208
    sget-object v4, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    goto :goto_13

    .line 205
    :cond_1e
    sget-object v4, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_13

    .line 203
    :cond_1f
    sget-object v4, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    :goto_13
    move-object/from16 v20, v4

    move-object v14, v3

    move v15, v7

    move/from16 v16, v2

    move/from16 v17, p1

    move-object/from16 v18, v1

    move-object/from16 v19, v0

    .line 134
    invoke-direct/range {v14 .. v20}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 67
    :goto_14
    new-instance v0, Ll/᩻ۗ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v3, v1, v2}, Ll/᩻ۗ;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v0

    .line 130
    :cond_20
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "<gradient> tag requires \'gradientRadius\' attribute with radial type"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_21
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": invalid gradient color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 159
    :cond_22
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(I)Ll/᩻ۗ;
    .locals 2

    .line 75
    new-instance v0, Ll/᩻ۗ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p0}, Ll/᩻ۗ;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v0
.end method

.method public static ۧ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩻ۗ;
    .locals 0

    .line 139
    :try_start_0
    invoke-static {p0, p1, p2}, Ll/᩻ۗ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩻ۗ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 85
    iget v0, p0, Ll/᩻ۗ;->֫:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 89
    iput p1, p0, Ll/᩻ۗ;->֫:I

    return-void
.end method

.method public final ֫([I)Z
    .locals 2

    .line 108
    invoke-virtual {p0}, Ll/᩻ۗ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Ll/᩻ۗ;->ۧ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    .line 109
    invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    .line 111
    iget v0, p0, Ll/᩻ۗ;->֫:I

    if-eq p1, v0, :cond_0

    .line 113
    iput p1, p0, Ll/᩻ۗ;->֫:I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Landroid/graphics/Shader;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/᩻ۗ;->ܽ:Landroid/graphics/Shader;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 93
    iget-object v0, p0, Ll/᩻ۗ;->ܽ:Landroid/graphics/Shader;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 123
    invoke-virtual {p0}, Ll/᩻ۗ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Ll/᩻ۗ;->֫:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 97
    iget-object v0, p0, Ll/᩻ۗ;->ܽ:Landroid/graphics/Shader;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩻ۗ;->ۧ:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
