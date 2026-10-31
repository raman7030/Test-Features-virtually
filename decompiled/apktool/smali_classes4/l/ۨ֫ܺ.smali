.class public final Ll/ۨ֫ܺ;
.super Ljava/lang/Object;
.source "DAVS"

# interfaces
.implements Ll/ܽۧܺ;


# static fields
.field public static final ܳ:[C

.field public static final ᩻:[C


# instance fields
.field public ֫:I

.field public final ۧ:[Ll/۬֫ܺ;

.field public final ܽ:[Ll/۬֫ܺ;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [C

    .line 34
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨ֫ܺ;->᩻:[C

    const/4 v0, 0x5

    new-array v0, v0, [C

    .line 35
    fill-array-data v0, :array_1

    sput-object v0, Ll/ۨ֫ܺ;->ܳ:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x74s
        0x72s
        0x75s
        0x65s
    .end array-data

    :array_1
    .array-data 2
        0x66s
        0x61s
        0x6cs
        0x73s
        0x65s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 11

    .line 51
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 41
    iput v1, p0, Ll/ۨ֫ܺ;->֫:I

    .line 87
    const-class v2, Ll/۫۟ۡ;

    invoke-virtual {p1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Ll/۫۟ۡ;

    const/4 v4, 0x0

    if-eqz v3, :cond_8

    .line 92
    invoke-interface {v3}, Ll/۫۟ۡ;->serialzeFeatures()[Ll/᩷ۧܺ;

    move-result-object v5

    invoke-static {v5}, Ll/᩷ۧܺ;->֫([Ll/᩷ۧܺ;)I

    move-result v5

    iput v5, p0, Ll/ۨ֫ܺ;->֫:I

    .line 94
    invoke-interface {v3}, Ll/۫۟ۡ;->typeName()Ljava/lang/String;

    move-result-object v5

    .line 95
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_0

    move-object v5, v4

    move-object v7, v5

    goto :goto_4

    .line 98
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v6

    move-object v7, v4

    :goto_0
    if-eqz v6, :cond_3

    .line 99
    const-class v8, Ljava/lang/Object;

    if-eq v6, v8, :cond_3

    .line 101
    invoke-virtual {v6, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v8

    check-cast v8, Ll/۫۟ۡ;

    if-nez v8, :cond_1

    goto :goto_1

    .line 106
    :cond_1
    invoke-interface {v8}, Ll/۫۟ۡ;->typeKey()Ljava/lang/String;

    move-result-object v7

    .line 107
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_1

    .line 100
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v6

    goto :goto_0

    .line 112
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v6

    array-length v8, v6

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_5

    aget-object v10, v6, v9

    .line 113
    invoke-virtual {v10, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v10

    check-cast v10, Ll/۫۟ۡ;

    if-eqz v10, :cond_4

    .line 115
    invoke-interface {v10}, Ll/۫۟ۡ;->typeKey()Ljava/lang/String;

    move-result-object v7

    .line 116
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    if-eqz v7, :cond_6

    .line 121
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_6

    move-object v7, v4

    .line 127
    :cond_6
    :goto_4
    invoke-interface {v3}, Ll/۫۟ۡ;->naming()Ll/ۙ۟ۡ;

    move-result-object v2

    .line 128
    sget-object v6, Ll/ۙ۟ۡ;->᩹:Ll/ۙ۟ۡ;

    if-eq v2, v6, :cond_7

    goto :goto_5

    :cond_7
    move-object v2, v4

    goto :goto_5

    :cond_8
    move-object v2, v4

    move-object v5, v2

    move-object v7, v5

    .line 133
    :goto_5
    iput-object v5, p0, Ll/ۨ֫ܺ;->ܿ:Ljava/lang/String;

    .line 134
    iput-object v7, p0, Ll/ۨ֫ܺ;->ᩳ:Ljava/lang/String;

    .line 137
    invoke-static {p1, v0, v3, v1, v2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;ILl/۫۟ۡ;ZLl/ۙ۟ۡ;)Ljava/util/ArrayList;

    move-result-object v5

    .line 146
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 148
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܺۧܺ;

    .line 149
    new-instance v8, Ll/۬֫ܺ;

    invoke-direct {v8, v7}, Ll/۬֫ܺ;-><init>(Ll/ܺۧܺ;)V

    .line 151
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 154
    :cond_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v5, v5, [Ll/۬֫ܺ;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ll/۬֫ܺ;

    iput-object v5, p0, Ll/ۨ֫ܺ;->ۧ:[Ll/۬֫ܺ;

    if-eqz v3, :cond_a

    .line 160
    invoke-interface {v3}, Ll/۫۟ۡ;->orders()[Ljava/lang/String;

    move-result-object v4

    :cond_a
    if-eqz v4, :cond_c

    .line 163
    array-length v4, v4

    if-eqz v4, :cond_c

    const/4 v1, 0x1

    .line 164
    invoke-static {p1, v0, v3, v1, v2}, Ll/᩵ۧܺ;->֫(Ljava/lang/Class;ILl/۫۟ۡ;ZLl/ۙ۟ۡ;)Ljava/util/ArrayList;

    move-result-object p1

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 175
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۧܺ;

    .line 176
    new-instance v2, Ll/۬֫ܺ;

    invoke-direct {v2, v1}, Ll/۬֫ܺ;-><init>(Ll/ܺۧܺ;)V

    .line 177
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 180
    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/۬֫ܺ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/۬֫ܺ;

    iput-object p1, p0, Ll/ۨ֫ܺ;->ܽ:[Ll/۬֫ܺ;

    return-void

    .line 182
    :cond_c
    array-length p1, v5

    new-array p1, p1, [Ll/۬֫ܺ;

    .line 183
    array-length v0, v5

    invoke-static {v5, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 184
    invoke-static {p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 186
    invoke-static {p1, v5}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 187
    iput-object v5, p0, Ll/ۨ֫ܺ;->ܽ:[Ll/۬֫ܺ;

    return-void

    .line 189
    :cond_d
    iput-object p1, p0, Ll/ۨ֫ܺ;->ܽ:[Ll/۬֫ܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/util/LinkedHashMap;
    .locals 6

    .line 700
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Ll/ۨ֫ܺ;->ܽ:[Ll/۬֫ܺ;

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 702
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 703
    iget-object v5, v4, Ll/۬֫ܺ;->᩹:Ll/ܺۧܺ;

    iget-object v5, v5, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ll/۬֫ܺ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 39

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 195
    iget-object v5, v2, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    if-nez v0, :cond_0

    .line 198
    invoke-virtual {v5}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 202
    :cond_0
    iget-object v6, v2, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    if-eqz v6, :cond_1

    iget v6, v6, Ll/ܳۧܺ;->֫:I

    sget-object v7, Ll/᩷ۧܺ;->ۗ:Ll/᩷ۧܺ;

    iget v7, v7, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v6, v7

    if-nez v6, :cond_2

    :cond_1
    iget-object v6, v2, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    if-eqz v6, :cond_2

    .line 205
    invoke-virtual {v6, v0}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 206
    invoke-virtual/range {p1 .. p2}, Ll/ۛ֫ܺ;->ۧ(Ljava/lang/Object;)V

    return-void

    .line 212
    :cond_2
    iget v6, v5, Ll/ۜۧܺ;->᩶:I

    sget-object v7, Ll/᩷ۧܺ;->ܰ:Ll/᩷ۧܺ;

    iget v7, v7, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v7, v6

    if-eqz v7, :cond_3

    .line 213
    iget-object v7, v1, Ll/ۨ֫ܺ;->ܽ:[Ll/۬֫ܺ;

    goto :goto_0

    .line 215
    :cond_3
    iget-object v7, v1, Ll/ۨ֫ܺ;->ۧ:[Ll/۬֫ܺ;

    .line 218
    :goto_0
    iget-object v8, v2, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 220
    sget-object v9, Ll/᩷ۧܺ;->ۗ:Ll/᩷ۧܺ;

    iget v9, v9, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v6, v9

    if-nez v6, :cond_5

    .line 221
    new-instance v6, Ll/ܳۧܺ;

    iget v9, v1, Ll/ۨ֫ܺ;->֫:I

    invoke-direct {v6, v8, v0, v3, v9}, Ll/ܳۧܺ;-><init>(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v6, v2, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 222
    iget-object v6, v2, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    if-nez v6, :cond_4

    .line 223
    new-instance v6, Ljava/util/IdentityHashMap;

    invoke-direct {v6}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v6, v2, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    .line 225
    :cond_4
    iget-object v6, v2, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    iget-object v9, v2, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    invoke-virtual {v6, v0, v9}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    :cond_5
    iget v6, v1, Ll/ۨ֫ܺ;->֫:I

    sget-object v9, Ll/᩷ۧܺ;->᩶:Ll/᩷ۧܺ;

    iget v9, v9, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v6, v9

    const/4 v10, 0x0

    if-nez v6, :cond_7

    iget v6, v5, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v6, v9

    if-eqz v6, :cond_6

    goto :goto_1

    :cond_6
    const/4 v6, 0x0

    goto :goto_2

    :cond_7
    :goto_1
    const/4 v6, 0x1

    :goto_2
    if-eqz v6, :cond_8

    const/16 v9, 0x5b

    goto :goto_3

    :cond_8
    const/16 v9, 0x7b

    :goto_3
    if-eqz v6, :cond_9

    const/16 v11, 0x5d

    goto :goto_4

    :cond_9
    const/16 v11, 0x7d

    .line 238
    :goto_4
    :try_start_0
    iget v12, v5, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v12, v12, 0x1

    .line 239
    iget-object v13, v5, Ll/ۜۧܺ;->᩸:[C

    array-length v13, v13

    if-le v12, v13, :cond_a

    .line 241
    invoke-virtual {v5, v12}, Ll/ۜۧܺ;->ۧ(I)V

    .line 247
    :cond_a
    iget-object v13, v5, Ll/ۜۧܺ;->᩸:[C

    iget v14, v5, Ll/ۜۧܺ;->᩹:I

    aput-char v9, v13, v14

    .line 248
    iput v12, v5, Ll/ۜۧܺ;->᩹:I

    .line 251
    array-length v9, v7

    if-lez v9, :cond_b

    iget v9, v5, Ll/ۜۧܺ;->᩶:I

    sget-object v12, Ll/᩷ۧܺ;->ۛ:Ll/᩷ۧܺ;

    iget v12, v12, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v9, v12

    if-eqz v9, :cond_b

    .line 253
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->ܽ()V

    .line 254
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->ᩳ()V

    .line 260
    :cond_b
    iget v9, v1, Ll/ۨ֫ܺ;->֫:I

    sget-object v12, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v12, v12, Ll/᩷ۧܺ;->᩸:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    and-int/2addr v9, v12

    iget-object v13, v1, Ll/ۨ֫ܺ;->ᩳ:Ljava/lang/String;

    const/16 v14, 0x2c

    if-nez v9, :cond_c

    :try_start_1
    iget v9, v5, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v12, v9

    if-eqz v12, :cond_f

    if-nez v4, :cond_c

    sget-object v12, Ll/᩷ۧܺ;->ۤ:Ll/᩷ۧܺ;

    iget v12, v12, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v9, v12

    if-eqz v9, :cond_c

    iget-object v9, v2, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    if-eqz v9, :cond_f

    iget-object v9, v9, Ll/ܳۧܺ;->ᩳ:Ll/ܳۧܺ;

    if-eqz v9, :cond_f

    .line 267
    :cond_c
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    if-eq v9, v4, :cond_f

    if-eqz v13, :cond_d

    move-object v4, v13

    goto :goto_5

    .line 269
    :cond_d
    iget-object v4, v2, Ll/ۛ֫ܺ;->ܽ:Ll/᩻ۧܺ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "@type"

    :goto_5
    invoke-virtual {v5, v4, v10}, Ll/ۜۧܺ;->֫(Ljava/lang/String;Z)V

    .line 270
    iget-object v4, v1, Ll/ۨ֫ܺ;->ܿ:Ljava/lang/String;

    if-nez v4, :cond_e

    .line 272
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    .line 274
    :cond_e
    invoke-virtual {v2, v4}, Ll/ۛ֫ܺ;->֫(Ljava/lang/String;)V

    const/16 v4, 0x2c

    goto :goto_6

    :cond_f
    const/4 v4, 0x0

    .line 282
    :goto_6
    iget-object v9, v2, Ll/ۛ֫ܺ;->ۧ:Ljava/util/ArrayList;

    if-eqz v9, :cond_10

    .line 283
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۠֫ܺ;

    .line 284
    invoke-virtual {v10, v2, v0, v4}, Ll/۠֫ܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;C)C

    move-result v4

    goto :goto_7

    :cond_10
    if-ne v4, v14, :cond_11

    const/4 v4, 0x1

    goto :goto_8

    :cond_11
    const/4 v4, 0x0

    .line 289
    :goto_8
    iget v9, v5, Ll/ۜۧܺ;->᩶:I

    sget-object v10, Ll/᩷ۧܺ;->ۨ:Ll/᩷ۧܺ;

    iget v10, v10, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v10, v9

    if-eqz v10, :cond_12

    sget-object v10, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v10, v10, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v10, v9

    if-nez v10, :cond_12

    const/4 v10, 0x1

    goto :goto_9

    :cond_12
    const/4 v10, 0x0

    .line 291
    :goto_9
    sget-object v14, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v14, v14, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v14, v9

    if-eqz v14, :cond_13

    const/4 v14, 0x1

    goto :goto_a

    :cond_13
    const/4 v14, 0x0

    .line 292
    :goto_a
    sget-object v15, Ll/᩷ۧܺ;->۫:Ll/᩷ۧܺ;

    iget v15, v15, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v9, v15

    if-eqz v9, :cond_14

    const/4 v9, 0x1

    goto :goto_b

    :cond_14
    const/4 v9, 0x0

    .line 294
    :goto_b
    iget-object v15, v2, Ll/ۛ֫ܺ;->᩷:Ljava/util/ArrayList;

    .line 295
    iget-object v12, v2, Ll/ۛ֫ܺ;->᩻:Ljava/util/ArrayList;

    move/from16 v17, v4

    .line 296
    iget-object v4, v2, Ll/ۛ֫ܺ;->ۖ:Ljava/util/ArrayList;

    .line 297
    iget-object v3, v2, Ll/ۛ֫ܺ;->ۢ:Ljava/util/ArrayList;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    const/16 v18, 0x0

    move-object/from16 v19, v8

    move/from16 v20, v11

    const/4 v8, 0x0

    const/16 v18, 0x0

    .line 299
    :goto_c
    :try_start_2
    array-length v11, v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    if-ge v8, v11, :cond_5f

    .line 300
    :try_start_3
    aget-object v11, v7, v8

    move-object/from16 v21, v7

    .line 301
    iget-object v7, v11, Ll/۬֫ܺ;->᩹:Ll/ܺۧܺ;

    move/from16 p4, v8

    .line 302
    iget-object v8, v7, Ll/ܺۧܺ;->ۗ:Ljava/lang/Class;

    move/from16 v22, v14

    iget-object v14, v7, Ll/ܺۧܺ;->᩶:Ljava/lang/reflect/Field;

    move/from16 v23, v10

    .line 303
    iget-object v10, v7, Ll/ܺۧܺ;->ܰ:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 304
    :try_start_4
    iget v2, v5, Ll/ۜۧܺ;->᩶:I

    move/from16 v24, v9

    sget-object v9, Ll/᩷ۧܺ;->᩺:Ll/᩷ۧܺ;

    iget v9, v9, Ll/᩷ۧܺ;->᩸:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    and-int/2addr v2, v9

    if-eqz v2, :cond_15

    if-eqz v14, :cond_15

    .line 307
    :try_start_5
    iget-boolean v2, v7, Ll/ܺۧܺ;->۬:Z

    if-eqz v2, :cond_15

    goto :goto_e

    :cond_15
    if-eqz v13, :cond_16

    .line 313
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_e

    :catchall_0
    move-exception v0

    move-object v2, v1

    move-object/from16 v3, v19

    move-object/from16 v1, p1

    goto/16 :goto_33

    :catch_0
    move-exception v0

    move-object v2, v1

    move-object/from16 v3, v19

    move-object/from16 v1, p1

    goto/16 :goto_32

    :cond_16
    if-eqz v3, :cond_18

    .line 320
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܿۧܺ;

    .line 321
    invoke-interface {v9}, Ll/ܿۧܺ;->֫()Z

    move-result v9
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v9, :cond_17

    const/4 v2, 0x0

    goto :goto_d

    :cond_18
    const/4 v2, 0x1

    :goto_d
    if-nez v2, :cond_19

    :goto_e
    move-object/from16 v25, v3

    move-object/from16 v26, v13

    goto/16 :goto_15

    .line 339
    :cond_19
    :try_start_6
    iget-boolean v2, v7, Ll/ܺۧܺ;->ۙ:Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    move-object/from16 v25, v3

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    move-object/from16 v26, v13

    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-wide/16 v27, 0x0

    if-eqz v2, :cond_1d

    const/4 v2, 0x0

    if-ne v8, v13, :cond_1a

    .line 341
    :try_start_7
    invoke-virtual {v14, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v14

    const/16 v29, 0x0

    :goto_f
    const/16 v30, 0x0

    goto :goto_10

    :cond_1a
    if-ne v8, v3, :cond_1b

    .line 344
    invoke-virtual {v14, v0}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v27

    const/4 v14, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    goto :goto_12

    :cond_1b
    if-ne v8, v9, :cond_1c

    .line 347
    invoke-virtual {v14, v0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v29

    const/4 v14, 0x0

    goto :goto_f

    :goto_10
    const/16 v31, 0x1

    move/from16 v31, v30

    move/from16 v30, v29

    move/from16 v29, v14

    const/4 v14, 0x1

    goto :goto_12

    .line 350
    :cond_1c
    invoke-virtual {v14, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_11

    .line 354
    :cond_1d
    :try_start_8
    invoke-virtual {v11, v0}, Ll/۬֫ܺ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_11
    const/4 v14, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x1

    :goto_12
    if-eqz v15, :cond_22

    if-eqz v14, :cond_20

    if-ne v8, v13, :cond_1e

    .line 363
    :try_start_9
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_13

    :cond_1e
    if-ne v8, v3, :cond_1f

    .line 366
    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_13

    :cond_1f
    if-ne v8, v9, :cond_20

    .line 369
    invoke-static/range {v30 .. v30}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :goto_13
    const/16 v31, 0x1

    .line 374
    :cond_20
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v32

    :cond_21
    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->hasNext()Z

    move-result v33

    if-eqz v33, :cond_22

    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v33

    check-cast v33, Ll/ᩳۧܺ;

    .line 375
    invoke-interface/range {v33 .. v33}, Ll/ᩳۧܺ;->apply()Z

    move-result v33

    if-nez v33, :cond_21

    const/16 v32, 0x0

    goto :goto_14

    :cond_22
    const/16 v32, 0x1

    :goto_14
    if-nez v32, :cond_23

    :goto_15
    move-object/from16 v31, v4

    move-object/from16 v34, v12

    move-object/from16 v35, v15

    goto/16 :goto_22

    :cond_23
    if-eqz v12, :cond_28

    if-eqz v14, :cond_26

    if-nez v31, :cond_26

    if-ne v8, v13, :cond_24

    .line 392
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_16

    :cond_24
    if-ne v8, v3, :cond_25

    .line 395
    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_16

    :cond_25
    if-ne v8, v9, :cond_26

    .line 398
    invoke-static/range {v30 .. v30}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :goto_16
    const/16 v31, 0x1

    .line 403
    :cond_26
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v32

    move-object/from16 v33, v10

    :goto_17
    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->hasNext()Z

    move-result v34

    if-eqz v34, :cond_27

    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v33

    check-cast v33, Ll/֫ۧܺ;

    .line 404
    invoke-interface/range {v33 .. v33}, Ll/֫ۧܺ;->֫()Ljava/lang/String;

    move-result-object v33

    goto :goto_17

    :cond_27
    move-object/from16 v32, v2

    move-object/from16 v2, v33

    goto :goto_18

    :cond_28
    move-object/from16 v32, v2

    move-object v2, v10

    :goto_18
    if-eqz v4, :cond_2d

    if-eqz v14, :cond_2b

    if-nez v31, :cond_2b

    if-ne v8, v13, :cond_29

    .line 414
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v31

    goto :goto_19

    :cond_29
    if-ne v8, v3, :cond_2a

    .line 418
    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v31

    goto :goto_19

    :cond_2a
    if-ne v8, v9, :cond_2b

    .line 422
    invoke-static/range {v30 .. v30}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v31

    :goto_19
    const/16 v32, 0x1

    goto :goto_1a

    :cond_2b
    move-object/from16 v38, v32

    move/from16 v32, v31

    move-object/from16 v31, v38

    .line 428
    :goto_1a
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v33

    move-object/from16 v34, v31

    :goto_1b
    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->hasNext()Z

    move-result v35

    if-eqz v35, :cond_2c

    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v34

    check-cast v34, Ll/ۡۧܺ;

    .line 429
    invoke-interface/range {v34 .. v34}, Ll/ۡۧܺ;->֫()Ljava/lang/Object;

    move-result-object v34
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_1b

    :cond_2c
    move/from16 v33, v32

    move-object/from16 v32, v34

    move-object/from16 v34, v12

    move-object/from16 v38, v31

    move-object/from16 v31, v4

    move-object/from16 v4, v38

    goto :goto_1c

    :cond_2d
    move-object/from16 v34, v12

    move/from16 v33, v31

    move-object/from16 v31, v4

    move-object/from16 v4, v32

    :goto_1c
    const-string v12, ""

    move-object/from16 v35, v15

    .line 434
    const-class v15, Ljava/lang/String;

    if-eqz v33, :cond_3b

    if-nez v32, :cond_3b

    .line 435
    :try_start_a
    iget v0, v7, Ll/ܺۧܺ;->ۧ֫:I

    move-object/from16 v36, v7

    iget v7, v1, Ll/ۨ֫ܺ;->֫:I

    or-int/2addr v0, v7

    iget v7, v5, Ll/ۜۧܺ;->᩶:I

    or-int/2addr v0, v7

    move-object/from16 v37, v12

    .line 437
    const-class v12, Ljava/lang/Boolean;

    if-ne v8, v12, :cond_30

    .line 438
    sget-object v12, Ll/᩷ۧܺ;->᩻֫:Ll/᩷ۧܺ;

    iget v12, v12, Ll/᩷ۧܺ;->᩸:I

    .line 439
    sget-object v1, Ll/᩷ۧܺ;->ܿ֫:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    or-int/2addr v1, v12

    if-nez v6, :cond_2e

    and-int v18, v0, v1

    if-nez v18, :cond_2e

    and-int/2addr v1, v7

    if-nez v1, :cond_2e

    goto/16 :goto_22

    :cond_2e
    and-int/2addr v0, v12

    if-nez v0, :cond_2f

    and-int v0, v7, v12

    if-eqz v0, :cond_3c

    .line 443
    :cond_2f
    sget-object v32, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_20

    :cond_30
    if-ne v8, v15, :cond_33

    .line 446
    sget-object v1, Ll/᩷ۧܺ;->ۢ֫:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    .line 447
    sget-object v12, Ll/᩷ۧܺ;->ܿ֫:Ll/᩷ۧܺ;

    iget v12, v12, Ll/᩷ۧܺ;->᩸:I

    or-int/2addr v12, v1

    if-nez v6, :cond_31

    and-int v18, v0, v12

    if-nez v18, :cond_31

    and-int/2addr v12, v7

    if-nez v12, :cond_31

    goto/16 :goto_22

    :cond_31
    and-int/2addr v0, v1

    if-nez v0, :cond_32

    and-int v0, v7, v1

    if-eqz v0, :cond_3c

    :cond_32
    move-object/from16 v0, v37

    goto/16 :goto_21

    .line 453
    :cond_33
    const-class v1, Ljava/lang/Number;

    invoke-virtual {v1, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_36

    .line 454
    sget-object v1, Ll/᩷ۧܺ;->᩷֫:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    .line 455
    sget-object v7, Ll/᩷ۧܺ;->ܿ֫:Ll/᩷ۧܺ;

    iget v7, v7, Ll/᩷ۧܺ;->᩸:I

    or-int/2addr v7, v1

    if-nez v6, :cond_34

    and-int v12, v0, v7

    if-nez v12, :cond_34

    .line 456
    iget v12, v5, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v7, v12

    if-nez v7, :cond_34

    goto/16 :goto_22

    :cond_34
    and-int/2addr v0, v1

    if-nez v0, :cond_35

    .line 458
    iget v0, v5, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_3c

    .line 459
    :cond_35
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v32

    goto :goto_20

    .line 461
    :cond_36
    const-class v1, Ljava/util/Collection;

    invoke-virtual {v1, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_39

    .line 462
    sget-object v1, Ll/᩷ۧܺ;->ۜ֫:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    .line 463
    sget-object v7, Ll/᩷ۧܺ;->ܿ֫:Ll/᩷ۧܺ;

    iget v7, v7, Ll/᩷ۧܺ;->᩸:I

    or-int/2addr v7, v1

    if-nez v6, :cond_37

    and-int v12, v0, v7

    if-nez v12, :cond_37

    .line 464
    iget v12, v5, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v7, v12

    if-nez v7, :cond_37

    goto/16 :goto_22

    :cond_37
    and-int/2addr v0, v1

    if-nez v0, :cond_38

    .line 466
    iget v0, v5, Ll/ۜۧܺ;->᩶:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_3c

    .line 467
    :cond_38
    sget-object v32, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_20

    :cond_39
    if-nez v6, :cond_3c

    .line 469
    iget-boolean v0, v11, Ll/۬֫ܺ;->۬:Z

    if-nez v0, :cond_3c

    sget-object v0, Ll/᩷ۧܺ;->ܿ֫:Ll/᩷ۧܺ;

    .line 109
    iget v1, v5, Ll/ۜۧܺ;->᩶:I

    iget v0, v0, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_3a

    const/4 v0, 0x1

    goto :goto_1d

    :cond_3a
    const/4 v0, 0x0

    :goto_1d
    if-nez v0, :cond_3c

    goto :goto_22

    :catchall_1
    move-exception v0

    move-object/from16 v2, p0

    :goto_1e
    move-object/from16 v1, p1

    goto/16 :goto_2e

    :catch_1
    move-exception v0

    move-object/from16 v2, p0

    :goto_1f
    move-object/from16 v1, p1

    goto/16 :goto_2f

    :cond_3b
    move-object/from16 v36, v7

    move-object/from16 v37, v12

    :cond_3c
    :goto_20
    move-object/from16 v0, v32

    :goto_21
    if-eqz v33, :cond_3f

    if-eqz v0, :cond_3f

    if-eqz v24, :cond_3f

    .line 475
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v8, v1, :cond_3d

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v8, v1, :cond_3d

    if-eq v8, v13, :cond_3d

    if-eq v8, v3, :cond_3d

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v8, v1, :cond_3d

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v8, v1, :cond_3e

    :cond_3d
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_3e

    move-object v1, v0

    check-cast v1, Ljava/lang/Number;

    .line 483
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    move-result v1

    if-nez v1, :cond_3e

    goto :goto_22

    :cond_3e
    if-ne v8, v9, :cond_3f

    .line 485
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_3f

    move-object v1, v0

    check-cast v1, Ljava/lang/Boolean;

    .line 487
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_3f

    :goto_22
    move-object/from16 v2, p0

    move-object/from16 v1, p1

    const/16 v16, 0x2c

    goto/16 :goto_2b

    :cond_3f
    if-eqz v17, :cond_41

    .line 495
    iget v1, v5, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    .line 496
    iget-object v7, v5, Ll/ۜۧܺ;->᩸:[C

    array-length v7, v7

    if-le v1, v7, :cond_40

    .line 498
    invoke-virtual {v5, v1}, Ll/ۜۧܺ;->ۧ(I)V

    .line 504
    :cond_40
    iget-object v7, v5, Ll/ۜۧܺ;->᩸:[C

    iget v12, v5, Ll/ۜۧܺ;->᩹:I

    const/16 v16, 0x2c

    aput-char v16, v7, v12

    .line 505
    iput v1, v5, Ll/ۜۧܺ;->᩹:I

    .line 507
    iget v1, v5, Ll/ۜۧܺ;->᩶:I

    sget-object v7, Ll/᩷ۧܺ;->ۛ:Ll/᩷ۧܺ;

    iget v7, v7, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v1, v7

    if-eqz v1, :cond_42

    .line 508
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->ᩳ()V

    goto :goto_23

    :cond_41
    const/16 v16, 0x2c

    :cond_42
    :goto_23
    if-eq v2, v10, :cond_45

    if-nez v6, :cond_43

    const/4 v1, 0x1

    .line 514
    invoke-virtual {v5, v2, v1}, Ll/ۜۧܺ;->֫(Ljava/lang/String;Z)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :cond_43
    move-object/from16 v1, p1

    .line 517
    :try_start_b
    invoke-virtual {v1, v0}, Ll/ۛ֫ܺ;->֫(Ljava/lang/Object;)V

    :cond_44
    :goto_24
    move-object/from16 v2, p0

    goto/16 :goto_2a

    :catchall_2
    move-exception v0

    move-object/from16 v2, p0

    goto/16 :goto_2e

    :catch_2
    move-exception v0

    move-object/from16 v2, p0

    goto/16 :goto_2f

    :cond_45
    move-object/from16 v1, p1

    if-eq v4, v0, :cond_47

    if-nez v6, :cond_46

    .line 520
    invoke-virtual {v11, v1}, Ll/۬֫ܺ;->֫(Ll/ۛ֫ܺ;)V

    .line 522
    :cond_46
    invoke-virtual {v1, v0}, Ll/ۛ֫ܺ;->֫(Ljava/lang/Object;)V

    goto :goto_24

    :cond_47
    if-nez v6, :cond_4a

    if-eqz v23, :cond_49

    .line 528
    iget-object v2, v11, Ll/۬֫ܺ;->ۙ:[C

    .line 530
    array-length v4, v2

    .line 532
    iget v7, v5, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v7, v4

    .line 533
    iget-object v10, v5, Ll/ۜۧܺ;->᩸:[C

    array-length v10, v10

    if-le v7, v10, :cond_48

    .line 535
    invoke-virtual {v5, v7}, Ll/ۜۧܺ;->ۧ(I)V

    .line 548
    :cond_48
    iget-object v10, v5, Ll/ۜۧܺ;->᩸:[C

    iget v12, v5, Ll/ۜۧܺ;->᩹:I

    move-object/from16 v18, v0

    const/4 v0, 0x0

    invoke-static {v2, v0, v10, v12, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 549
    iput v7, v5, Ll/ۜۧܺ;->᩹:I

    goto :goto_25

    :cond_49
    move-object/from16 v18, v0

    .line 552
    invoke-virtual {v11, v1}, Ll/۬֫ܺ;->֫(Ll/ۛ֫ܺ;)V

    goto :goto_25

    :cond_4a
    move-object/from16 v18, v0

    :goto_25
    if-eqz v14, :cond_53

    if-nez v33, :cond_53

    if-ne v8, v13, :cond_50

    const/high16 v0, -0x80000000

    move/from16 v14, v29

    if-ne v14, v0, :cond_4b

    const-string v0, "-2147483648"

    .line 561
    invoke-virtual {v5, v0}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    goto :goto_24

    :cond_4b
    if-gez v14, :cond_4c

    neg-int v0, v14

    goto :goto_26

    :cond_4c
    move v0, v14

    :goto_26
    const/4 v2, 0x0

    .line 566
    :goto_27
    sget-object v3, Ll/ۜۧܺ;->ۨ:[I

    aget v3, v3, v2

    if-gt v0, v3, :cond_4f

    add-int/lit8 v0, v2, 0x1

    if-gez v14, :cond_4d

    add-int/lit8 v0, v2, 0x2

    .line 577
    :cond_4d
    iget v2, v5, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v2, v0

    .line 578
    iget-object v0, v5, Ll/ۜۧܺ;->᩸:[C

    array-length v0, v0

    if-le v2, v0, :cond_4e

    .line 580
    invoke-virtual {v5, v2}, Ll/ۜۧܺ;->ۧ(I)V

    :cond_4e
    int-to-long v3, v14

    .line 590
    iget-object v0, v5, Ll/ۜۧܺ;->᩸:[C

    invoke-static {v3, v4, v2, v0}, Ll/ۜۧܺ;->֫(JI[C)V

    .line 591
    iput v2, v5, Ll/ۜۧܺ;->᩹:I

    goto :goto_24

    :cond_4f
    add-int/lit8 v2, v2, 0x1

    goto :goto_27

    :cond_50
    if-ne v8, v3, :cond_51

    move-wide/from16 v2, v27

    .line 596
    invoke-virtual {v5, v2, v3}, Ll/ۜۧܺ;->ۧ(J)V

    goto/16 :goto_24

    :cond_51
    if-ne v8, v9, :cond_44

    if-eqz v30, :cond_52

    .line 599
    sget-object v0, Ll/ۨ֫ܺ;->᩻:[C

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-virtual {v5, v0, v3, v2}, Ll/ۜۧܺ;->write([CII)V

    goto/16 :goto_24

    .line 601
    :cond_52
    sget-object v0, Ll/ۨ֫ܺ;->ܳ:[C

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-virtual {v5, v0, v3, v2}, Ll/ۜۧܺ;->write([CII)V

    goto/16 :goto_24

    :cond_53
    if-nez v6, :cond_5e

    if-ne v8, v15, :cond_58

    .line 607
    iget v0, v11, Ll/۬֫ܺ;->᩸:I
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    move-object/from16 v2, p0

    :try_start_c
    iget v3, v2, Ll/ۨ֫ܺ;->֫:I

    or-int/2addr v0, v3

    if-nez v18, :cond_56

    .line 610
    iget v3, v5, Ll/ۜۧܺ;->᩶:I

    sget-object v4, Ll/᩷ۧܺ;->ۢ֫:Ll/᩷ۧܺ;

    iget v4, v4, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v3, v4

    if-nez v3, :cond_55

    and-int/2addr v0, v4

    if-eqz v0, :cond_54

    goto :goto_28

    .line 615
    :cond_54
    invoke-virtual {v5}, Ll/ۜۧܺ;->֫()V

    goto/16 :goto_2a

    :cond_55
    :goto_28
    move-object/from16 v0, v37

    .line 613
    invoke-virtual {v5, v0}, Ll/ۜۧܺ;->֫(Ljava/lang/String;)V

    goto :goto_2a

    .line 618
    :cond_56
    move-object/from16 v0, v18

    check-cast v0, Ljava/lang/String;

    if-eqz v22, :cond_57

    .line 621
    invoke-virtual {v5, v0}, Ll/ۜۧܺ;->ۧ(Ljava/lang/String;)V

    goto :goto_2a

    :cond_57
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 623
    invoke-virtual {v5, v0, v4, v3}, Ll/ۜۧܺ;->֫(Ljava/lang/String;CZ)V

    goto :goto_2a

    :cond_58
    move-object/from16 v2, p0

    move-object/from16 v0, v36

    .line 627
    iget-boolean v0, v0, Ll/ܺۧܺ;->ۨ:Z

    if-eqz v0, :cond_5d

    if-eqz v18, :cond_5c

    .line 629
    iget v0, v5, Ll/ۜۧܺ;->᩶:I

    sget-object v3, Ll/᩷ۧܺ;->ᩳ֫:Ll/᩷ۧܺ;

    iget v3, v3, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v0, v3

    if-eqz v0, :cond_5b

    .line 630
    move-object/from16 v0, v18

    check-cast v0, Ljava/lang/Enum;

    .line 632
    invoke-virtual {v0}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v0

    .line 633
    iget v3, v5, Ll/ۜۧܺ;->᩶:I

    sget-object v4, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v4, v4, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_59

    const/4 v3, 0x1

    goto :goto_29

    :cond_59
    const/4 v3, 0x0

    :goto_29
    if-eqz v3, :cond_5a

    .line 636
    invoke-virtual {v5, v0}, Ll/ۜۧܺ;->ۧ(Ljava/lang/String;)V

    goto :goto_2a

    :cond_5a
    const/4 v3, 0x0

    .line 638
    invoke-virtual {v5, v0, v3, v3}, Ll/ۜۧܺ;->֫(Ljava/lang/String;CZ)V

    goto :goto_2a

    .line 641
    :cond_5b
    move-object/from16 v0, v18

    check-cast v0, Ljava/lang/Enum;

    .line 642
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v5, v0}, Ll/ۜۧܺ;->writeInt(I)V

    goto :goto_2a

    .line 645
    :cond_5c
    invoke-virtual {v5}, Ll/ۜۧܺ;->֫()V

    goto :goto_2a

    :cond_5d
    move-object/from16 v0, v18

    .line 648
    invoke-virtual {v11, v1, v0}, Ll/۬֫ܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;)V

    goto :goto_2a

    :cond_5e
    move-object/from16 v2, p0

    move-object/from16 v0, v18

    .line 652
    invoke-virtual {v11, v1, v0}, Ll/۬֫ܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;)V

    :goto_2a
    const/4 v0, 0x1

    const/16 v17, 0x1

    :goto_2b
    add-int/lit8 v8, p4, 0x1

    const/16 v18, 0x0

    move-object/from16 v0, p2

    move-object/from16 v7, v21

    move/from16 v14, v22

    move/from16 v10, v23

    move/from16 v9, v24

    move-object/from16 v3, v25

    move-object/from16 v13, v26

    move-object/from16 v4, v31

    move-object/from16 v12, v34

    move-object/from16 v15, v35

    move-object/from16 v38, v2

    move-object v2, v1

    move-object/from16 v1, v38

    goto/16 :goto_c

    :catchall_3
    move-exception v0

    move-object v2, v1

    goto/16 :goto_1e

    :catch_3
    move-exception v0

    move-object v2, v1

    goto/16 :goto_1f

    :catchall_4
    move-exception v0

    move-object/from16 v38, v2

    move-object v2, v1

    move-object/from16 v1, v38

    goto :goto_2e

    :catch_4
    move-exception v0

    move-object/from16 v38, v2

    move-object v2, v1

    move-object/from16 v1, v38

    goto :goto_2f

    :cond_5f
    move-object/from16 v21, v7

    move-object/from16 v38, v2

    move-object v2, v1

    move-object/from16 v1, v38

    .line 661
    iget-object v0, v1, Ll/ۛ֫ܺ;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_61

    if-eqz v17, :cond_60

    const/16 v3, 0x2c

    goto :goto_2c

    :cond_60
    const/4 v3, 0x0

    .line 663
    :goto_2c
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_61

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡֫ܺ;

    move-object/from16 v6, p2

    .line 664
    invoke-virtual {v4, v1, v6, v3}, Ll/֡֫ܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;C)C

    move-result v3

    goto :goto_2d

    :cond_61
    move-object/from16 v7, v21

    .line 668
    array-length v0, v7

    if-lez v0, :cond_62

    iget v0, v5, Ll/ۜۧܺ;->᩶:I

    sget-object v3, Ll/᩷ۧܺ;->ۛ:Ll/᩷ۧܺ;

    iget v3, v3, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v0, v3

    if-eqz v0, :cond_62

    .line 669
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->֫()V

    .line 670
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->ᩳ()V

    .line 675
    :cond_62
    iget v0, v5, Ll/ۜۧܺ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    .line 676
    iget-object v3, v5, Ll/ۜۧܺ;->᩸:[C

    array-length v3, v3

    if-le v0, v3, :cond_63

    .line 678
    invoke-virtual {v5, v0}, Ll/ۜۧܺ;->ۧ(I)V

    .line 684
    :cond_63
    iget-object v3, v5, Ll/ۜۧܺ;->᩸:[C

    iget v4, v5, Ll/ۜۧܺ;->᩹:I

    aput-char v20, v3, v4

    .line 685
    iput v0, v5, Ll/ۜۧܺ;->᩹:I
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    move-object/from16 v3, v19

    .line 695
    iput-object v3, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    return-void

    :catchall_5
    move-exception v0

    :goto_2e
    move-object/from16 v3, v19

    goto :goto_33

    :catch_5
    move-exception v0

    :goto_2f
    move-object/from16 v3, v19

    goto :goto_32

    :catchall_6
    move-exception v0

    move-object/from16 v3, v19

    goto :goto_30

    :catch_6
    move-exception v0

    move-object/from16 v3, v19

    goto :goto_31

    :catchall_7
    move-exception v0

    move-object v3, v8

    :goto_30
    move-object/from16 v38, v2

    move-object v2, v1

    move-object/from16 v1, v38

    goto :goto_33

    :catch_7
    move-exception v0

    move-object v3, v8

    :goto_31
    move-object/from16 v38, v2

    move-object v2, v1

    move-object/from16 v1, v38

    :goto_32
    :try_start_d
    const-string v4, "write javaBean error, fastjson version 1.1.72"

    move-object/from16 v5, p3

    if-eqz v5, :cond_64

    .line 691
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", fieldName : "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 693
    :cond_64
    new-instance v5, Ll/ܶ۟ۡ;

    invoke-direct {v5, v4, v0}, Ll/ܶ۟ۡ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    :catchall_8
    move-exception v0

    .line 695
    :goto_33
    iput-object v3, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 696
    throw v0
.end method
