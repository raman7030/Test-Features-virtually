.class public Ll/ۡ۬;
.super Ll/᩷۬;
.source "14P2"


# instance fields
.field public final ۜ:Ljava/lang/reflect/Method;

.field public final ۡ:Ljava/lang/reflect/Constructor;

.field public final ۢ:Ljava/lang/Class;

.field public final ܳ:Ljava/lang/reflect/Method;

.field public final ܺ:Ljava/lang/reflect/Method;

.field public final ᩷:Ljava/lang/reflect/Method;

.field public final ᩻:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 53
    invoke-direct {p0}, Ll/᩵۬;-><init>()V

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "android.graphics.FontFamily"

    .line 315
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 320
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    .line 84
    invoke-static {v1}, Ll/ۡ۬;->ۧ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const-string v4, "addFontFromBuffer"

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Class;

    .line 332
    const-class v6, Ljava/nio/ByteBuffer;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x1

    aput-object v6, v5, v7

    const-class v7, [Landroid/graphics/fonts/FontVariationAxis;

    const/4 v8, 0x2

    aput-object v7, v5, v8

    const/4 v7, 0x3

    aput-object v6, v5, v7

    const/4 v7, 0x4

    aput-object v6, v5, v7

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "freeze"

    .line 338
    invoke-virtual {v1, v5, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const-string v6, "abortCreation"

    .line 342
    invoke-virtual {v1, v6, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 88
    invoke-virtual {p0, v1}, Ll/ۡ۬;->֫(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v9, v1

    move-object v1, v0

    move-object v0, v9

    goto :goto_0

    :catch_0
    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    .line 100
    :goto_0
    iput-object v0, p0, Ll/ۡ۬;->ۢ:Ljava/lang/Class;

    .line 101
    iput-object v2, p0, Ll/ۡ۬;->ۡ:Ljava/lang/reflect/Constructor;

    .line 102
    iput-object v3, p0, Ll/ۡ۬;->᩻:Ljava/lang/reflect/Method;

    .line 103
    iput-object v4, p0, Ll/ۡ۬;->ۜ:Ljava/lang/reflect/Method;

    .line 104
    iput-object v5, p0, Ll/ۡ۬;->ܺ:Ljava/lang/reflect/Method;

    .line 105
    iput-object v6, p0, Ll/ۡ۬;->ܳ:Ljava/lang/reflect/Method;

    .line 106
    iput-object v1, p0, Ll/ۡ۬;->᩷:Ljava/lang/reflect/Method;

    return-void
.end method

.method private ֫(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z
    .locals 4

    const/4 v0, 0x0

    .line 139
    :try_start_0
    iget-object v1, p0, Ll/ۡ۬;->᩻:Ljava/lang/reflect/Method;

    .line 140
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    .line 141
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    const/16 v3, 0x8

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v0

    const/4 p1, 0x1

    aput-object p3, v3, p1

    const/4 p1, 0x2

    aput-object v2, v3, p1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p3, 0x3

    aput-object p1, v3, p3

    const/4 p1, 0x4

    aput-object p4, v3, p1

    const/4 p1, 0x5

    aput-object p5, v3, p1

    const/4 p1, 0x6

    aput-object p6, v3, p1

    const/4 p1, 0x7

    aput-object p7, v3, p1

    .line 139
    invoke-virtual {v1, p2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v0
.end method

.method public static ۧ(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Class;

    .line 325
    const-class v1, Landroid/content/res/AssetManager;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v0, v1

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v1, 0x4

    aput-object v2, v0, v1

    const/4 v1, 0x5

    aput-object v2, v0, v1

    const/4 v1, 0x6

    aput-object v2, v0, v1

    const-class v1, [Landroid/graphics/fonts/FontVariationAxis;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "addFontFromAssetManager"

    invoke-virtual {p0, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0
.end method

.method private ۧ(Ljava/lang/Object;)Z
    .locals 2

    .line 182
    :try_start_0
    iget-object v0, p0, Ll/ۡ۬;->ܺ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 8

    .line 113
    iget-object v0, p0, Ll/ۡ۬;->᩻:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_3

    const/4 p2, 0x0

    .line 126
    :try_start_0
    iget-object p3, p0, Ll/ۡ۬;->ۡ:Ljava/lang/reflect/Constructor;

    invoke-virtual {p3, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p3, p2

    :goto_0
    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    .line 297
    invoke-direct/range {v0 .. v7}, Ll/ۡ۬;->֫(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 193
    :try_start_1
    iget-object p1, p0, Ll/ۡ۬;->ܳ:Ljava/lang/reflect/Method;

    invoke-virtual {p1, p3, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 303
    :cond_1
    invoke-direct {p0, p3}, Ll/ۡ۬;->ۧ(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :catch_1
    :goto_1
    return-object p2

    .line 306
    :cond_2
    invoke-virtual {p0, p3}, Ll/ۡ۬;->֫(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1

    .line 291
    :cond_3
    invoke-super/range {p0 .. p5}, Ll/᩵۬;->֫(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/content/Context;Ll/ۢۗ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .locals 10

    .line 113
    iget-object v0, p0, Ll/ۡ۬;->᩻:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_4

    const/4 p3, 0x0

    .line 126
    :try_start_0
    iget-object p4, p0, Ll/ۡ۬;->ۡ:Ljava/lang/reflect/Constructor;

    invoke-virtual {p4, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p4, p3

    :goto_0
    if-nez p4, :cond_0

    goto :goto_2

    .line 209
    :cond_0
    invoke-virtual {p2}, Ll/ۢۗ;->֫()[Ll/ۡۗ;

    move-result-object p2

    array-length v8, p2

    const/4 v0, 0x0

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_2

    aget-object v0, p2, v9

    .line 210
    invoke-virtual {v0}, Ll/ۡۗ;->֫()Ljava/lang/String;

    move-result-object v3

    .line 211
    invoke-virtual {v0}, Ll/ۡۗ;->ܽ()I

    move-result v4

    invoke-virtual {v0}, Ll/ۡۗ;->ܿ()I

    move-result v5

    invoke-virtual {v0}, Ll/ۡۗ;->ܳ()Z

    move-result v6

    .line 212
    invoke-virtual {v0}, Ll/ۡۗ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/fonts/FontVariationAxis;->fromFontVariationSettings(Ljava/lang/String;)[Landroid/graphics/fonts/FontVariationAxis;

    move-result-object v7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    .line 210
    invoke-direct/range {v0 .. v7}, Ll/ۡ۬;->֫(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 193
    :try_start_1
    iget-object p1, p0, Ll/ۡ۬;->ܳ:Ljava/lang/reflect/Method;

    invoke-virtual {p1, p4, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 217
    :cond_2
    invoke-direct {p0, p4}, Ll/ۡ۬;->ۧ(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :catch_1
    :goto_2
    return-object p3

    .line 220
    :cond_3
    invoke-virtual {p0, p4}, Ll/ۡ۬;->֫(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1

    .line 203
    :cond_4
    invoke-super {p0, p1, p2, p3, p4}, Ll/᩷۬;->֫(Landroid/content/Context;Ll/ۢۗ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/content/Context;[Ll/ܿۤ;I)Landroid/graphics/Typeface;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move/from16 v2, p3

    .line 228
    array-length v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ge v3, v5, :cond_0

    :catch_0
    :goto_0
    move-object v2, v4

    goto/16 :goto_a

    .line 113
    :cond_0
    iget-object v3, v1, Ll/ۡ۬;->᩻:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_b

    .line 214
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 216
    array-length v5, v0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v5, :cond_3

    aget-object v8, v0, v7

    .line 217
    invoke-virtual {v8}, Ll/ܿۤ;->֫()I

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_2

    .line 221
    :cond_1
    invoke-virtual {v8}, Ll/ܿۤ;->ܽ()Landroid/net/Uri;

    move-result-object v8

    .line 222
    invoke-virtual {v3, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    :goto_2
    move-object/from16 v9, p1

    goto :goto_3

    :cond_2
    move-object/from16 v9, p1

    .line 226
    invoke-static {v9, v8}, Ll/֡۬;->֫(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    move-result-object v10

    .line 227
    invoke-virtual {v3, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 229
    :cond_3
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    .line 126
    :try_start_0
    iget-object v5, v1, Ll/ۡ۬;->ۡ:Ljava/lang/reflect/Constructor;

    invoke-virtual {v5, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_4

    :catch_1
    move-object v5, v4

    :goto_4
    if-nez v5, :cond_4

    goto :goto_0

    .line 256
    :cond_4
    array-length v7, v0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_5
    iget-object v10, v1, Ll/ۡ۬;->ܳ:Ljava/lang/reflect/Method;

    if-ge v8, v7, :cond_7

    aget-object v11, v0, v8

    .line 257
    invoke-virtual {v11}, Ll/ܿۤ;->ܽ()Landroid/net/Uri;

    move-result-object v12

    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/nio/ByteBuffer;

    if-nez v12, :cond_5

    goto :goto_7

    .line 262
    :cond_5
    invoke-virtual {v11}, Ll/ܿۤ;->ۧ()I

    move-result v9

    invoke-virtual {v11}, Ll/ܿۤ;->ᩳ()I

    move-result v13

    invoke-virtual {v11}, Ll/ܿۤ;->ܿ()Z

    move-result v11

    .line 154
    :try_start_1
    iget-object v14, v1, Ll/ۡ۬;->ۜ:Ljava/lang/reflect/Method;

    .line 155
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v15, 0x1

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v12, v4, v6

    aput-object v9, v4, v15

    const/4 v9, 0x2

    const/4 v12, 0x0

    aput-object v12, v4, v9

    const/4 v9, 0x3

    aput-object v13, v4, v9

    const/4 v9, 0x4

    aput-object v11, v4, v9

    .line 154
    invoke-virtual {v14, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_6

    :catch_2
    const/4 v4, 0x0

    :goto_6
    if-nez v4, :cond_6

    const/4 v4, 0x0

    .line 193
    :try_start_2
    invoke-virtual {v10, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_6
    const/4 v4, 0x0

    const/4 v9, 0x1

    :goto_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_7
    if-nez v9, :cond_8

    invoke-virtual {v10, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_9

    .line 273
    :cond_8
    invoke-direct {v1, v5}, Ll/ۡ۬;->ۧ(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_9

    .line 276
    :cond_9
    invoke-virtual {v1, v5}, Ll/ۡ۬;->֫(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object v0

    if-nez v0, :cond_a

    goto :goto_9

    .line 280
    :cond_a
    invoke-static {v0, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0

    :cond_b
    move-object/from16 v9, p1

    .line 234
    invoke-virtual {v1, v2, v0}, Ll/᩵۬;->֫(I[Ll/ܿۤ;)Ll/ܿۤ;

    move-result-object v0

    .line 235
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 237
    :try_start_3
    invoke-virtual {v0}, Ll/ܿۤ;->ܽ()Landroid/net/Uri;

    move-result-object v3

    const-string v4, "r"
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    const/4 v5, 0x0

    :try_start_4
    invoke-virtual {v2, v3, v4, v5}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    if-nez v2, :cond_c

    if-eqz v2, :cond_d

    .line 245
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    return-object v5

    .line 241
    :cond_c
    :try_start_5
    new-instance v3, Landroid/graphics/Typeface$Builder;

    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/graphics/Typeface$Builder;-><init>(Ljava/io/FileDescriptor;)V

    .line 242
    invoke-virtual {v0}, Ll/ܿۤ;->ᩳ()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/Typeface$Builder;->setWeight(I)Landroid/graphics/Typeface$Builder;

    move-result-object v3

    .line 243
    invoke-virtual {v0}, Ll/ܿۤ;->ܿ()Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/graphics/Typeface$Builder;->setItalic(Z)Landroid/graphics/Typeface$Builder;

    move-result-object v0

    .line 244
    invoke-virtual {v0}, Landroid/graphics/Typeface$Builder;->build()Landroid/graphics/Typeface;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 245
    :try_start_6
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    return-object v0

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 236
    :try_start_7
    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_8
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v3
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    :catch_3
    :cond_d
    move-object v2, v5

    goto :goto_a

    :catch_4
    :goto_9
    const/4 v2, 0x0

    :goto_a
    return-object v2
.end method

.method public ֫(Ljava/lang/Object;)Landroid/graphics/Typeface;
    .locals 6

    const/4 v0, -0x1

    .line 171
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    .line 168
    :try_start_0
    iget-object v2, p0, Ll/ۡ۬;->ۢ:Ljava/lang/Class;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x0

    .line 169
    invoke-static {v2, v4, p1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 170
    iget-object p1, p0, Ll/ۡ۬;->᩷:Ljava/lang/reflect/Method;

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v4

    aput-object v0, v5, v3

    const/4 v2, 0x2

    aput-object v0, v5, v2

    invoke-virtual {p1, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v1
.end method

.method public ֫(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3

    const/4 v0, 0x1

    .line 347
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    .line 349
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object p1, v1, v0

    const/4 v2, 0x2

    aput-object p1, v1, v2

    .line 348
    const-class p1, Landroid/graphics/Typeface;

    const-string v2, "createFromFamiliesWithDefault"

    invoke-virtual {p1, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    .line 350
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-object p1
.end method
