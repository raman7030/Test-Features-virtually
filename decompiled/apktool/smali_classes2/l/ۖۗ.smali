.class public final Ll/ۖۗ;
.super Ljava/lang/Object;
.source "X63W"


# direct methods
.method public static ֫(Landroid/content/res/Resources;I)Ljava/util/List;
    .locals 8

    if-nez p1, :cond_0

    .line 274
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 276
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 278
    :try_start_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 279
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-object p0

    .line 282
    :cond_1
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 255
    invoke-static {v0, v2}, Ll/ۜۗ;->֫(Landroid/content/res/TypedArray;I)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_4

    const/4 p1, 0x0

    .line 286
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    move-result v3

    if-ge p1, v3, :cond_6

    .line 287
    invoke-virtual {v0, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_3

    .line 289
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v3

    .line 303
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 304
    array-length v5, v3

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_2

    aget-object v7, v3, v6

    .line 305
    invoke-static {v7, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 289
    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 293
    :cond_4
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p0

    .line 303
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 304
    array-length v3, p0

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_5

    aget-object v5, p0, v4

    .line 305
    invoke-static {v5, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 293
    :cond_5
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 297
    :cond_6
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v1

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 298
    throw p0
.end method

.method public static ֫(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Ll/᩷ۗ;
    .locals 23

    move-object/from16 v0, p1

    .line 183
    :goto_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    if-ne v1, v3, :cond_f

    const/4 v1, 0x0

    const-string v4, "font-family"

    move-object/from16 v5, p0

    .line 196
    invoke-interface {v5, v3, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 197
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    .line 198
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 208
    invoke-static/range {p0 .. p0}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v4

    .line 209
    sget-object v6, Ll/᩻᩹;->ۧ:[I

    invoke-virtual {v0, v4, v6}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    const/4 v6, 0x0

    .line 210
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x4

    .line 211
    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x5

    .line 212
    invoke-virtual {v4, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 213
    invoke-virtual {v4, v2, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    .line 214
    invoke-virtual {v4, v3, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v12

    const/16 v13, 0x1f4

    const/4 v14, 0x3

    .line 216
    invoke-virtual {v4, v14, v13}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v13

    const/4 v15, 0x6

    .line 219
    invoke-virtual {v4, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 221
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v7, :cond_2

    if-eqz v8, :cond_2

    if-eqz v10, :cond_2

    .line 223
    :goto_1
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    if-eq v2, v14, :cond_1

    .line 224
    invoke-static/range {p0 .. p0}, Ll/ۖۗ;->֫(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_1

    .line 226
    :cond_1
    invoke-static {v0, v11}, Ll/ۖۗ;->֫(Landroid/content/res/Resources;I)Ljava/util/List;

    move-result-object v0

    .line 227
    new-instance v2, Ll/ܺۗ;

    new-instance v3, Ll/ۨ۫;

    invoke-direct {v3, v7, v8, v10, v0}, Ll/ۨ۫;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-direct {v2, v3, v12, v13, v1}, Ll/ܺۗ;-><init>(Ll/ۨ۫;IILjava/lang/String;)V

    return-object v2

    .line 234
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 235
    :goto_2
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    if-eq v4, v14, :cond_c

    .line 236
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v4

    if-eq v4, v3, :cond_3

    goto :goto_2

    .line 237
    :cond_3
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v7, "font"

    .line 238
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 312
    invoke-static/range {p0 .. p0}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v4

    .line 313
    sget-object v7, Ll/᩻᩹;->ܽ:[I

    invoke-virtual {v0, v4, v7}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    const/16 v7, 0x8

    .line 314
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_3

    :cond_4
    const/4 v7, 0x1

    :goto_3
    const/16 v8, 0x190

    .line 317
    invoke-virtual {v4, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v17

    .line 318
    invoke-virtual {v4, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_5

    const/4 v7, 0x6

    goto :goto_4

    :cond_5
    const/4 v7, 0x2

    .line 321
    :goto_4
    invoke-virtual {v4, v7, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v2, v7, :cond_6

    const/4 v7, 0x1

    const/16 v22, 0x1

    goto :goto_5

    :cond_6
    const/4 v7, 0x0

    const/16 v22, 0x0

    :goto_5
    const/16 v7, 0x9

    .line 322
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_6

    :cond_7
    const/4 v7, 0x3

    :goto_6
    const/4 v8, 0x7

    .line 326
    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_7

    :cond_8
    const/4 v8, 0x4

    .line 329
    :goto_7
    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v21

    .line 330
    invoke-virtual {v4, v7, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v18

    .line 331
    invoke-virtual {v4, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_9

    const/4 v7, 0x5

    goto :goto_8

    :cond_9
    const/4 v7, 0x0

    .line 334
    :goto_8
    invoke-virtual {v4, v7, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v19

    .line 335
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v20

    .line 336
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 337
    :goto_9
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    if-eq v4, v14, :cond_a

    .line 338
    invoke-static/range {p0 .. p0}, Ll/ۖۗ;->֫(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_9

    .line 340
    :cond_a
    new-instance v4, Ll/ۡۗ;

    move-object/from16 v16, v4

    invoke-direct/range {v16 .. v22}, Ll/ۡۗ;-><init>(IIILjava/lang/String;Ljava/lang/String;Z)V

    .line 239
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 241
    :cond_b
    invoke-static/range {p0 .. p0}, Ll/ۖۗ;->֫(Lorg/xmlpull/v1/XmlPullParser;)V

    goto/16 :goto_2

    .line 244
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, 0x0

    return-object v0

    .line 248
    :cond_d
    new-instance v0, Ll/ۢۗ;

    new-array v2, v6, [Ll/ۡۗ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ۡۗ;

    invoke-direct {v0, v1}, Ll/ۢۗ;-><init>([Ll/ۡۗ;)V

    return-object v0

    :cond_e
    move-object v0, v1

    .line 201
    invoke-static/range {p0 .. p0}, Ll/ۖۗ;->֫(Lorg/xmlpull/v1/XmlPullParser;)V

    return-object v0

    .line 189
    :cond_f
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    const/4 v0, 0x1

    :goto_0
    if-lez v0, :cond_2

    .line 347
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
