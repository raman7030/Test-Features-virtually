.class public final Ll/ۢ᩹ۖ;
.super Ljava/lang/Object;
.source "058F"


# instance fields
.field public final ֡:Ljava/nio/ByteBuffer;

.field public final ֨:I

.field public final ֫:Ljava/nio/ByteBuffer;

.field public final ۖ:Ljava/nio/ByteBuffer;

.field public final ۗ:[Ljava/lang/String;

.field public final ۘ:Ljava/nio/ByteBuffer;

.field public final ۙ:I

.field public final ۚ:Ljava/nio/ByteBuffer;

.field public final ۜ:Ljava/nio/ByteBuffer;

.field public final ۠:Ljava/nio/ByteBuffer;

.field public final ۡ:Ljava/nio/ByteBuffer;

.field public final ۢ:Ljava/nio/ByteBuffer;

.field public final ۤ:I

.field public final ۧ:Ljava/nio/ByteBuffer;

.field public final ۫:Ljava/nio/ByteBuffer;

.field public final ۬:Ljava/nio/ByteBuffer;

.field public final ܳ:I

.field public final ܶ:I

.field public final ܺ:I

.field public final ܽ:Ljava/nio/ByteBuffer;

.field public final ܿ:Ljava/nio/ByteBuffer;

.field public final ᩳ:Ljava/nio/ByteBuffer;

.field public final ᩴ:I

.field public final ᩵:Ll/֡ۛۡ;

.field public final ᩶:Ljava/nio/ByteBuffer;

.field public final ᩷:I

.field public final ᩸:Ll/֡ۛۡ;

.field public final ᩹:Ljava/nio/ByteBuffer;

.field public final ᩻:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 18

    move-object/from16 v0, p0

    .line 184
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 822
    new-instance v1, Ll/֡ۛۡ;

    sget v2, Ll/ܿ᩸ۡ;->֫:I

    mul-int/lit8 v2, v2, 0x3

    invoke-direct {v1, v2}, Ll/֡ۛۡ;-><init>(I)V

    iput-object v1, v0, Ll/ۢ᩹ۖ;->᩵:Ll/֡ۛۡ;

    .line 1041
    new-instance v1, Ll/֡ۛۡ;

    invoke-direct {v1}, Ll/֡ۛۡ;-><init>()V

    iput-object v1, v0, Ll/ۢ᩹ۖ;->᩸:Ll/֡ۛۡ;

    const/4 v1, 0x0

    move-object/from16 v2, p1

    .line 185
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 186
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 187
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    and-int/lit16 v2, v2, -0x100

    const v3, 0x64657800

    if-ne v2, v3, :cond_7

    .line 199
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    const/16 v3, 0x8

    shr-int/2addr v2, v3

    const v4, 0x303335

    if-lt v2, v4, :cond_0

    const v4, 0x303340

    if-le v2, v4, :cond_1

    .line 201
    :cond_0
    sget-object v4, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v5, "Unknown DEX version. Trying anyway..."

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 203
    :cond_1
    iput v2, v0, Ll/ۢ᩹ۖ;->ܺ:I

    .line 204
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 344
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/lit8 v4, v4, 0x20

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 212
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    const v5, 0x12345678

    if-ne v4, v5, :cond_6

    .line 344
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 221
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    .line 223
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    iput v5, v0, Ll/ۢ᩹ۖ;->ۙ:I

    .line 224
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6

    .line 225
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v7

    iput v7, v0, Ll/ۢ᩹ۖ;->ۤ:I

    .line 226
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v7

    .line 227
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    iput v8, v0, Ll/ۢ᩹ۖ;->ܶ:I

    .line 228
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    .line 229
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    iput v9, v0, Ll/ۢ᩹ۖ;->ᩴ:I

    .line 230
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    .line 231
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v10

    iput v10, v0, Ll/ۢ᩹ۖ;->֨:I

    .line 232
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v10

    .line 233
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v11

    iput v11, v0, Ll/ۢ᩹ۖ;->᩷:I

    .line 234
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v11

    .line 236
    new-array v5, v5, [Ljava/lang/String;

    iput-object v5, v0, Ll/ۢ᩹ۖ;->ۗ:[Ljava/lang/String;

    const v5, 0x303338

    if-lt v2, v5, :cond_4

    .line 243
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 244
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    if-ge v4, v2, :cond_5

    .line 246
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v15

    const v16, 0xffff

    and-int v15, v15, v16

    .line 247
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 248
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v16

    .line 249
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v17

    move/from16 p1, v2

    const/4 v2, 0x7

    if-eq v15, v2, :cond_3

    if-eq v15, v3, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v12, v16

    move/from16 v5, v17

    goto :goto_1

    :cond_3
    move/from16 v14, v16

    move/from16 v13, v17

    :goto_1
    add-int/lit8 v4, v4, 0x1

    move/from16 v2, p1

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 264
    :cond_5
    iput v14, v0, Ll/ۢ᩹ۖ;->ܳ:I

    .line 267
    iget v2, v0, Ll/ۢ᩹ۖ;->ۙ:I

    mul-int/lit8 v2, v2, 0x4

    invoke-static {v1, v6, v2}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->᩶:Ljava/nio/ByteBuffer;

    .line 268
    iget v2, v0, Ll/ۢ᩹ۖ;->ۤ:I

    mul-int/lit8 v2, v2, 0x4

    invoke-static {v1, v7, v2}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->۬:Ljava/nio/ByteBuffer;

    .line 269
    iget v2, v0, Ll/ۢ᩹ۖ;->ܶ:I

    mul-int/lit8 v2, v2, 0xc

    invoke-static {v1, v8, v2}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->۠:Ljava/nio/ByteBuffer;

    .line 270
    iget v2, v0, Ll/ۢ᩹ۖ;->ᩴ:I

    mul-int/lit8 v2, v2, 0x8

    invoke-static {v1, v9, v2}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->ۘ:Ljava/nio/ByteBuffer;

    .line 271
    iget v2, v0, Ll/ۢ᩹ۖ;->֨:I

    mul-int/lit8 v2, v2, 0x8

    invoke-static {v1, v10, v2}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->֡:Ljava/nio/ByteBuffer;

    .line 272
    iget v2, v0, Ll/ۢ᩹ۖ;->᩷:I

    mul-int/lit8 v2, v2, 0x20

    invoke-static {v1, v11, v2}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->ۜ:Ljava/nio/ByteBuffer;

    mul-int/lit8 v14, v14, 0x4

    .line 273
    invoke-static {v1, v13, v14}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->ܿ:Ljava/nio/ByteBuffer;

    mul-int/lit8 v12, v12, 0x8

    .line 274
    invoke-static {v1, v5, v12}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->ۚ:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    .line 276
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 277
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->ᩳ:Ljava/nio/ByteBuffer;

    .line 278
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->ۧ:Ljava/nio/ByteBuffer;

    .line 279
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->֫:Ljava/nio/ByteBuffer;

    .line 280
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->ܽ:Ljava/nio/ByteBuffer;

    .line 281
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->᩻:Ljava/nio/ByteBuffer;

    .line 282
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->ۢ:Ljava/nio/ByteBuffer;

    .line 283
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->᩹:Ljava/nio/ByteBuffer;

    .line 284
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->ۖ:Ljava/nio/ByteBuffer;

    .line 285
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/ۢ᩹ۖ;->۫:Ljava/nio/ByteBuffer;

    .line 286
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, v0, Ll/ۢ᩹ۖ;->ۡ:Ljava/nio/ByteBuffer;

    return-void

    .line 214
    :cond_6
    new-instance v1, Ll/ۛ۠ۖ;

    const-string v2, "Endian_tag unsupported"

    .line 40
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 214
    throw v1

    :cond_7
    const v1, 0x64657900

    if-ne v2, v1, :cond_8

    .line 195
    new-instance v1, Ll/ۛ۠ۖ;

    const-string v2, "Odex unsupported."

    .line 40
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 195
    throw v1

    .line 197
    :cond_8
    new-instance v1, Ll/ۛ۠ۖ;

    const-string v2, "Magic unsupported."

    .line 40
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 197
    throw v1
.end method

.method public static ֫(I[B)I
    .locals 2

    add-int/lit8 v0, p0, 0x3

    .line 405
    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method private ֫(Ljava/nio/ByteBuffer;ILl/ܽ᩸ۖ;Ljava/util/Map;Ljava/lang/Object;I)I
    .locals 2

    .line 1087
    invoke-static {p1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 1088
    invoke-static {p1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result p1

    add-int/2addr p2, v0

    .line 1090
    invoke-direct {p0, p2}, Ll/ۢ᩹ۖ;->ۧ(I)Ll/ܰ۠ۖ;

    move-result-object v0

    .line 102
    iget-object v1, p3, Ll/ܽ᩸ۖ;->ۙ:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 103
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p3, Ll/ܽ᩸ۖ;->ۙ:Ljava/util/ArrayList;

    .line 105
    :cond_0
    new-instance v1, Ll/ۖ᩸ۖ;

    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 47
    iput p1, v1, Ll/ۖ᩸ۖ;->᩸:I

    .line 48
    iput-object v0, v1, Ll/ۖ᩸ۖ;->ۙ:Ll/ܰ۠ۖ;

    .line 49
    iput-object p5, v1, Ll/ۖ᩸ۖ;->᩶:Ljava/lang/Object;

    .line 106
    iget-object p1, p3, Ll/ܽ᩸ۖ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    and-int/lit8 p1, p6, 0x8

    if-nez p1, :cond_1

    .line 1095
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 1098
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, p1, v1}, Ll/ۢ᩹ۖ;->֫(ILl/ᩴ᩹ۖ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p2

    :catch_0
    move-exception p1

    .line 1100
    new-instance p2, Ll/ۛ۠ۖ;

    invoke-virtual {v0}, Ll/ܰ۠ۖ;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x1

    new-array p4, p4, [Ljava/lang/Object;

    const/4 p5, 0x0

    aput-object p3, p4, p5

    const-string p3, "while accept annotation in field:%s."

    invoke-direct {p2, p1, p3, p4}, Ll/ۛ۠ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p2

    :cond_1
    return p2
.end method

.method private ֫(Ljava/nio/ByteBuffer;ILl/ܽ᩸ۖ;Ljava/util/Map;Ljava/util/Map;IZ)I
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v0, p3

    move/from16 v4, p6

    .line 1112
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    .line 1113
    invoke-static/range {p1 .. p1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v2

    .line 1114
    invoke-static/range {p1 .. p1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 1115
    invoke-static/range {p1 .. p1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v8

    add-int v9, p2, v2

    .line 1117
    invoke-direct {v7, v9}, Ll/ۢ᩹ۖ;->ܽ(I)Ll/۟۠ۖ;

    move-result-object v10

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-nez p7, :cond_0

    if-nez v2, :cond_0

    .line 1121
    invoke-virtual {v10}, Ll/۟۠ۖ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v6, v11, [Ljava/lang/Object;

    aput-object v2, v6, v13

    aput-object v5, v6, v12

    const-string v2, "GLITCH: duplicated method %s @%08x"

    invoke-static {v2, v6}, Ll/ۢ᩹ۖ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    and-int/lit8 v2, v4, 0x40

    if-nez v2, :cond_0

    .line 1123
    invoke-virtual {v10}, Ll/۟۠ۖ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v11, [Ljava/lang/Object;

    aput-object v0, v2, v13

    aput-object v1, v2, v12

    const-string v0, "WARN: skip method %s @%08x"

    invoke-static {v0, v2}, Ll/ۢ᩹ۖ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return v9

    :cond_0
    const/high16 v2, 0x10000

    and-int/2addr v2, v3

    const-string v5, "<clinit>"

    if-nez v2, :cond_2

    .line 1130
    invoke-virtual {v10}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v2

    const-string v6, "<init>"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v10}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1131
    :cond_1
    invoke-virtual {v10}, Ll/۟۠ۖ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v6, v11, [Ljava/lang/Object;

    aput-object v2, v6, v13

    aput-object v1, v6, v12

    const-string v1, "GLITCH: method %s @%08x not marked as ACC_CONSTRUCTOR"

    invoke-static {v1, v6}, Ll/ۢ᩹ۖ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    :cond_2
    :try_start_0
    iget-object v1, v0, Ll/ܽ᩸ۖ;->۬:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    .line 113
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Ll/ܽ᩸ۖ;->۬:Ljava/util/ArrayList;

    .line 115
    :cond_3
    new-instance v1, Ll/᩵᩸ۖ;

    .line 28
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 45
    iput v3, v1, Ll/᩵᩸ۖ;->᩸:I

    .line 46
    iput-object v10, v1, Ll/᩵᩸ۖ;->ۙ:Ll/۟۠ۖ;

    .line 116
    iget-object v0, v0, Ll/ܽ᩸ۖ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_7

    .line 1138
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v2, p4

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    if-eqz v0, :cond_4

    .line 1141
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v7, v0, v1}, Ll/ۢ᩹ۖ;->֫(ILl/ᩴ᩹ۖ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1143
    :try_start_2
    new-instance v1, Ll/ۛ۠ۖ;

    const-string v2, "while accept annotation in method:%s."

    invoke-virtual {v10}, Ll/۟۠ۖ;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v12, [Ljava/lang/Object;

    aput-object v3, v4, v13

    invoke-direct {v1, v0, v2, v4}, Ll/ۛ۠ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    .line 1146
    :cond_4
    :goto_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v2, p5

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    if-eqz v0, :cond_7

    .line 1149
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1184
    iget-object v2, v7, Ll/ۢ᩹ۖ;->ܽ:Ljava/nio/ByteBuffer;

    .line 1185
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1187
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v0, :cond_7

    .line 1189
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v14

    if-nez v14, :cond_5

    goto :goto_2

    .line 1193
    :cond_5
    invoke-virtual {v1, v6}, Ll/᩵᩸ۖ;->֫(I)Ll/ᩴ᩹ۖ;

    move-result-object v15
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz v15, :cond_6

    .line 1196
    :try_start_4
    invoke-direct {v7, v14, v15}, Ll/ۢ᩹ۖ;->֫(ILl/ᩴ᩹ۖ;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v1, v0

    .line 1199
    :try_start_5
    new-instance v0, Ll/ۛ۠ۖ;

    const-string v2, "While accepting parameter annotation in parameter: [%d]"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v12, [Ljava/lang/Object;

    aput-object v3, v4, v13

    invoke-direct {v0, v1, v2, v4}, Ll/ۛ۠ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    :cond_6
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catch_2
    move-exception v0

    .line 1151
    :try_start_6
    new-instance v1, Ll/ۛ۠ۖ;

    const-string v2, "while accept parameter annotation in method:%s."

    .line 1152
    invoke-virtual {v10}, Ll/۟۠ۖ;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v12, [Ljava/lang/Object;

    aput-object v3, v4, v13

    invoke-direct {v1, v0, v2, v4}, Ll/ۛ۠ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :cond_7
    if-eqz v8, :cond_a

    and-int/lit8 v0, v4, 0x4

    if-eqz v0, :cond_8

    and-int/lit16 v0, v4, 0x80

    if-eqz v0, :cond_a

    .line 1159
    invoke-virtual {v10}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 95
    :cond_8
    new-instance v0, Ll/ᩳ᩸ۖ;

    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Ll/ᩳ᩸ۖ;->ۧ:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 53
    iput-object v2, v0, Ll/ᩳ᩸ۖ;->ᩳ:Ljava/util/ArrayList;

    const/4 v2, -0x1

    .line 55
    iput v2, v0, Ll/ᩳ᩸ۖ;->ܽ:I

    .line 96
    iput-object v0, v1, Ll/᩵᩸ۖ;->᩶:Ll/ᩳ᩸ۖ;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    and-int/lit8 v1, v3, 0x8

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    const/4 v5, 0x1

    goto :goto_3

    :cond_9
    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_3
    move-object/from16 v1, p0

    move v2, v8

    move-object v3, v0

    move/from16 v4, p6

    move-object v6, v10

    .line 1165
    :try_start_7
    invoke-virtual/range {v1 .. v6}, Ll/ۢ᩹ۖ;->֫(ILl/ᩳ᩸ۖ;IZLl/۟۠ۖ;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    return v9

    :catch_3
    move-exception v0

    move-object v1, v0

    .line 1168
    :try_start_8
    new-instance v0, Ll/ۛ۠ۖ;

    const-string v2, "while accept code in method:[%s] @%08x"

    invoke-virtual {v10}, Ll/۟۠ۖ;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1169
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v11, [Ljava/lang/Object;

    aput-object v3, v5, v13

    aput-object v4, v5, v12

    invoke-direct {v0, v1, v2, v5}, Ll/ۛ۠ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    :cond_a
    return v9

    :catch_4
    move-exception v0

    .line 1177
    new-instance v1, Ll/ۛ۠ۖ;

    invoke-virtual {v10}, Ll/۟۠ۖ;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v12, [Ljava/lang/Object;

    aput-object v2, v3, v13

    const-string v2, "while accept method:[%s]"

    invoke-direct {v1, v0, v2, v3}, Ll/ۛ۠ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1
.end method

.method public static ֫(Ljava/nio/ByteBuffer;I)J
    .locals 6

    shr-int/lit8 p1, p1, 0x5

    and-int/lit8 p1, p1, 0x7

    add-int/lit8 p1, p1, 0x1

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 390
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    mul-int/lit8 v5, v2, 0x8

    shl-long/2addr v3, v5

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    rsub-int/lit8 p0, p1, 0x8

    int-to-long p0, p0

    const-wide/16 v2, 0x8

    mul-long p0, p0, v2

    long-to-int p1, p0

    shl-long p0, v0, p1

    return-wide p0
.end method

.method private ֫(Ljava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 4

    .line 735
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit16 v1, v0, 0xff

    and-int/lit8 v0, v0, 0x1f

    if-eqz v0, :cond_8

    const/4 v2, 0x6

    if-eq v0, v2, :cond_7

    const/4 v2, 0x2

    if-eq v0, v2, :cond_6

    const/4 v2, 0x3

    if-eq v0, v2, :cond_5

    const/4 v3, 0x4

    if-eq v0, v3, :cond_4

    const/16 v3, 0x10

    if-eq v0, v3, :cond_3

    const/16 v3, 0x11

    if-eq v0, v3, :cond_2

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    .line 794
    new-instance p1, Ll/ۛ۠ۖ;

    const-string v0, "Not support yet."

    .line 40
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 794
    throw p1

    :pswitch_0
    shr-int/lit8 p1, v1, 0x5

    and-int/2addr p1, v2

    if-eqz p1, :cond_0

    const/4 v3, 0x1

    .line 791
    :cond_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    const/4 p1, 0x0

    return-object p1

    .line 786
    :pswitch_2
    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->ᩳ(Ljava/nio/ByteBuffer;)Ll/ۧ᩸ۖ;

    move-result-object p1

    return-object p1

    .line 956
    :pswitch_3
    invoke-static {p1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 957
    new-array v1, v0, [Ljava/lang/Object;

    :goto_0
    if-ge v3, v0, :cond_1

    .line 959
    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    .line 780
    :pswitch_4
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->ۧ(I)Ll/ܰ۠ۖ;

    move-result-object p1

    return-object p1

    .line 775
    :pswitch_5
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    .line 776
    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->ܽ(I)Ll/۟۠ۖ;

    move-result-object p1

    return-object p1

    .line 771
    :pswitch_6
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    .line 772
    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->ۧ(I)Ll/ܰ۠ۖ;

    move-result-object p1

    return-object p1

    .line 767
    :pswitch_7
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    .line 768
    new-instance v0, Ll/᩺۠ۖ;

    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/᩺۠ۖ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 764
    :pswitch_8
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 761
    :pswitch_9
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->ᩳ(I)Ll/֫ܶۖ;

    move-result-object p1

    return-object p1

    .line 759
    :pswitch_a
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->ܿ(I)Ll/ۧܶۖ;

    move-result-object p1

    return-object p1

    .line 757
    :cond_2
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 754
    :cond_3
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    const/16 p1, 0x20

    shr-long/2addr v0, p1

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    .line 748
    :cond_4
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ۧ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 745
    :cond_5
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    int-to-char p1, p1

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    return-object p1

    .line 742
    :cond_6
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ۧ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    int-to-short p1, p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1

    .line 751
    :cond_7
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ۧ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 739
    :cond_8
    invoke-static {p1, v1}, Ll/ۢ᩹ۖ;->ۧ(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    long-to-int p1, v0

    int-to-byte p1, p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;
    .locals 0

    .line 336
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 337
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 338
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 339
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method private ֫(I)Ll/ۤ۠ۖ;
    .locals 6

    mul-int/lit8 v0, p1, 0x4

    .line 1889
    iget-object v1, p0, Ll/ۢ᩹ۖ;->ܿ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1890
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    .line 951
    iget-object v1, p0, Ll/ۢ᩹ۖ;->ۖ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 956
    invoke-static {v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 957
    new-array v2, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_0

    .line 959
    invoke-direct {p0, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 1895
    invoke-static {v2, v1, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-array v0, v3, [Ljava/lang/Object;

    .line 1900
    :goto_1
    new-instance v1, Ll/ۤ۠ۖ;

    .line 1901
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    aput-object p1, v5, v3

    const-string p1, "call_site_%d"

    invoke-static {p1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    aget-object p1, v2, v3

    check-cast p1, Ll/֫ܶۖ;

    aget-object v3, v2, v4

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v2, v2, v4

    check-cast v2, Ll/ۧܶۖ;

    invoke-direct {v1, p1, v3, v2, v0}, Ll/ۤ۠ۖ;-><init>(Ll/֫ܶۖ;Ljava/lang/String;Ll/ۧܶۖ;[Ljava/lang/Object;)V

    return-object v1
.end method

.method private ֫(IIZLl/۟۠ۖ;Ljava/util/TreeMap;Ll/ۘ۠ۡ;)V
    .locals 15

    move-object v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p5

    move-object/from16 v9, p6

    .line 468
    iget-object v10, v0, Ll/ۢ᩹ۖ;->ۡ:Ljava/nio/ByteBuffer;

    move/from16 v3, p1

    invoke-virtual {v10, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 470
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 471
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v4

    .line 472
    new-array v11, v1, [Ll/ۜ᩹ۖ;

    .line 474
    invoke-virtual/range {p4 .. p4}, Ll/۟۠ۖ;->ᩳ()[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    const-string v12, "D"

    const-string v13, "J"

    if-ge v7, v6, :cond_2

    aget-object v14, v5, v7

    .line 475
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v8, v8, 0x2

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    sub-int/2addr v1, v8

    if-nez p3, :cond_3

    .line 484
    new-instance v5, Ll/ۜ᩹ۖ;

    .line 1919
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    add-int/lit8 v6, v1, -0x1

    .line 485
    aput-object v5, v11, v6

    .line 490
    :cond_3
    invoke-virtual/range {p4 .. p4}, Ll/۟۠ۖ;->ᩳ()[Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v4, :cond_7

    .line 492
    aget-object v7, v5, v6

    .line 322
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    .line 496
    invoke-direct {p0, v8}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v8

    .line 497
    new-instance v14, Ll/ۜ᩹ۖ;

    .line 1914
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 498
    aput-object v14, v11, v1

    if-eqz v8, :cond_4

    .line 500
    invoke-virtual {v9, v6, v8}, Ll/ۘ۠ۡ;->֫(ILjava/lang/String;)V

    :cond_4
    add-int/lit8 v8, v1, 0x1

    .line 504
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_4

    :cond_5
    move v1, v8

    goto :goto_5

    :cond_6
    :goto_4
    add-int/lit8 v1, v1, 0x2

    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    :goto_6
    move v12, v3

    .line 510
    :goto_7
    :pswitch_0
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    const-string v4, "Encountered RESTART_LOCAL on new v"

    packed-switch v3, :pswitch_data_0

    const/16 v4, 0xa

    if-lt v3, v4, :cond_a

    add-int/lit8 v3, v3, -0xa

    .line 606
    div-int/lit8 v4, v3, 0xf

    add-int/2addr v4, v1

    .line 607
    rem-int/lit8 v3, v3, 0xf

    add-int/lit8 v3, v3, -0x4

    add-int/2addr v3, v12

    .line 609
    invoke-static {v2, v4}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    .line 610
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v3, v1}, Ll/ۘ۠ۡ;->ۧ(ILl/ۨ۠ۖ;)V

    move v12, v3

    move v1, v4

    goto :goto_7

    .line 592
    :pswitch_1
    invoke-static {v2, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    .line 593
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v3}, Ll/ۘ۠ۡ;->֫(Ll/ۨ۠ۖ;)V

    goto :goto_7

    .line 588
    :pswitch_2
    invoke-static {v2, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    .line 589
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v3}, Ll/ۘ۠ۡ;->ۧ(Ll/ۨ۠ۖ;)V

    goto :goto_7

    .line 544
    :pswitch_3
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 545
    aget-object v5, v11, v3

    if-eqz v5, :cond_8

    .line 554
    invoke-static {v2, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    .line 555
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v3, v4}, Ll/ۘ۠ۡ;->ܽ(ILl/ۨ۠ۖ;)V

    goto :goto_7

    .line 547
    :cond_8
    new-instance v1, Ljava/lang/RuntimeException;

    .line 0
    invoke-static {v3, v4}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 547
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 560
    :pswitch_4
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 561
    aget-object v5, v11, v3

    if-eqz v5, :cond_9

    .line 570
    invoke-static {v2, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    .line 571
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v3, v4}, Ll/ۘ۠ۡ;->֫(ILl/ۨ۠ۖ;)V

    goto/16 :goto_7

    .line 563
    :cond_9
    new-instance v1, Ljava/lang/RuntimeException;

    .line 0
    invoke-static {v3, v4}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 563
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 528
    :pswitch_5
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v13

    .line 322
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    .line 532
    invoke-direct {p0, v3}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v6

    .line 533
    invoke-direct {p0, v4}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v7

    .line 534
    invoke-direct {p0, v5}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v8

    .line 536
    new-instance v14, Ll/ۜ᩹ۖ;

    .line 1919
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 537
    invoke-static {v2, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    .line 538
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ll/ۨ۠ۖ;

    move-object/from16 v3, p6

    move v4, v13

    invoke-virtual/range {v3 .. v8}, Ll/ۘ۠ۡ;->֫(ILl/ۨ۠ۖ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    aput-object v14, v11, v13

    goto/16 :goto_7

    .line 514
    :pswitch_6
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v4

    .line 322
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    .line 517
    invoke-direct {p0, v3}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v6

    .line 518
    invoke-direct {p0, v5}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v7

    .line 520
    new-instance v3, Ll/ۜ᩹ۖ;

    .line 1914
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 521
    aput-object v3, v11, v4

    .line 522
    invoke-static {v2, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    .line 523
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ll/ۨ۠ۖ;

    const/4 v8, 0x0

    move-object/from16 v3, p6

    invoke-virtual/range {v3 .. v8}, Ll/ۘ۠ۡ;->֫(ILl/ۨ۠ۖ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    .line 584
    :pswitch_7
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ۧ(Ljava/nio/ByteBuffer;)I

    move-result v3

    add-int/2addr v3, v12

    goto/16 :goto_6

    .line 580
    :pswitch_8
    invoke-static {v10}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v3

    add-int/2addr v3, v1

    move v1, v3

    goto/16 :goto_7

    :pswitch_9
    return-void

    .line 601
    :cond_a
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Invalid extended opcode encountered "

    .line 0
    invoke-static {v3, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 601
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(ILjava/lang/Throwable;)V
    .locals 3

    .line 348
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, p0, 0x1

    if-ge v1, v2, :cond_0

    const-string v2, "."

    .line 350
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 p0, 0x20

    .line 352
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 353
    instance-of p0, p1, Ll/ۛ۠ۖ;

    if-eqz p0, :cond_1

    .line 354
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 356
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 357
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {v2, p0}, Ll/ۢ᩹ۖ;->֫(ILjava/lang/Throwable;)V

    return-void

    :cond_1
    if-eqz p1, :cond_2

    .line 361
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "ROOT cause:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 362
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :cond_2
    return-void
.end method

.method private ֫(ILl/ᩴ᩹ۖ;)V
    .locals 6

    .line 966
    iget-object v0, p0, Ll/ۢ᩹ۖ;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 967
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    .line 969
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 976
    iget-object v3, p0, Ll/ۢ᩹ۖ;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 977
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    .line 978
    invoke-direct {p0, v3}, Ll/ۢ᩹ۖ;->ᩳ(Ljava/nio/ByteBuffer;)Ll/ۧ᩸ۖ;

    move-result-object v3

    .line 979
    invoke-static {}, Ll/ܽܶۖ;->values()[Ll/ܽܶۖ;

    move-result-object v4

    aget-object v2, v4, v2

    iput-object v2, v3, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    .line 124
    iget-object v4, v3, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    invoke-interface {p2, v4, v2}, Ll/ᩴ᩹ۖ;->֫(Ljava/lang/String;Ll/ܽܶۖ;)Ll/ۧ᩸ۖ;

    move-result-object v2

    .line 126
    iget-object v3, v3, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫᩸ۖ;

    .line 127
    iget-object v5, v4, Ll/֫᩸ۖ;->֫:Ljava/lang/String;

    iget-object v4, v4, Ll/֫᩸ۖ;->ۧ:Ljava/lang/Object;

    invoke-static {v2, v5, v4}, Ll/ۧ᩸ۖ;->֫(Ll/ۛ᩸ۘ;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 414
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "%n"

    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    return-void
.end method

.method public static ֫(Ljava/util/TreeMap;I)V
    .locals 2

    .line 426
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 427
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll/ۨ۠ۖ;

    invoke-direct {v1, p1}, Ll/ۨ۠ۖ;-><init>(I)V

    invoke-virtual {p0, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private ֫(Ljava/util/TreeMap;Ljava/util/LinkedList;[BI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    mul-int/lit8 v4, p4, 0x2

    .line 1249
    array-length v5, v3

    if-ge v4, v5, :cond_19

    .line 1252
    aget-byte v5, v3, v4

    and-int/lit16 v5, v5, 0xff

    .line 1253
    sget-object v6, Ll/ۖ᩹ۖ;->᩵᩻:[Ll/ۖ᩹ۖ;

    aget-object v6, v6, v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_18

    .line 1254
    iget-object v9, v6, Ll/ۖ᩹ۖ;->ۙ:Ll/ۡ᩹ۖ;

    if-eqz v9, :cond_18

    .line 1259
    invoke-virtual {v6}, Ll/ۖ᩹ۖ;->֫()Z

    move-result v5

    const-string v9, "jump out of insns %s -> %04x"

    const/4 v10, 0x2

    if-eqz v5, :cond_5

    .line 1260
    sget-object v5, Ll/ܳ᩹ۖ;->֫:[I

    iget-object v11, v6, Ll/ۖ᩹ۖ;->ۙ:Ll/ۡ᩹ۖ;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v5, v5, v11

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    add-int/lit8 v5, v4, 0x2

    .line 1312
    invoke-static {v5, v3}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v5

    add-int v5, p4, v5

    if-ltz v5, :cond_0

    mul-int/lit8 v11, v5, 0x2

    .line 1313
    array-length v12, v3

    if-gt v11, v12, :cond_0

    .line 1316
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1317
    invoke-static {v1, v5}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    goto/16 :goto_3

    .line 1314
    :cond_0
    new-instance v1, Ll/᩻᩹ۖ;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v6, v3, v7

    aput-object v2, v3, v8

    invoke-direct {v1, v9, v3}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :pswitch_1
    add-int/lit8 v5, v4, 0x2

    .line 1279
    invoke-static {v5, v3}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v5

    add-int v5, p4, v5

    add-int/lit8 v11, v4, 0x1

    .line 418
    aget-byte v11, v3, v11

    and-int/lit16 v12, v11, 0xff

    and-int/lit8 v11, v11, 0xf

    shr-int/lit8 v12, v12, 0x4

    and-int/lit8 v12, v12, 0xf

    if-ne v11, v12, :cond_1

    .line 1285
    sget-object v11, Ll/ܳ᩹ۖ;->ܽ:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v11, v11, v12

    packed-switch v11, :pswitch_data_1

    goto :goto_0

    :pswitch_2
    const/4 v11, 0x1

    goto :goto_1

    :pswitch_3
    const/4 v11, 0x0

    const/4 v12, 0x0

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v11, 0x0

    :goto_1
    const/4 v12, 0x1

    :goto_2
    if-nez v11, :cond_6

    if-ltz v5, :cond_2

    mul-int/lit8 v11, v5, 0x2

    .line 1303
    array-length v13, v3

    if-gt v11, v13, :cond_2

    .line 1306
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1307
    invoke-static {v1, v5}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    goto :goto_4

    .line 1304
    :cond_2
    new-instance v1, Ll/᩻᩹ۖ;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v6, v3, v7

    aput-object v2, v3, v8

    invoke-direct {v1, v9, v3}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :pswitch_4
    add-int/lit8 v5, v4, 0x2

    .line 1271
    invoke-static {v5, v3}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v5

    add-int v5, p4, v5

    if-ltz v5, :cond_3

    mul-int/lit8 v11, v5, 0x2

    .line 1272
    array-length v12, v3

    if-gt v11, v12, :cond_3

    .line 1275
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1276
    invoke-static {v1, v5}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    goto :goto_3

    .line 1273
    :cond_3
    new-instance v1, Ll/᩻᩹ۖ;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v6, v3, v7

    aput-object v2, v3, v8

    invoke-direct {v1, v9, v3}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :pswitch_5
    add-int/lit8 v5, v4, 0x1

    .line 1262
    aget-byte v5, v3, v5

    add-int v5, p4, v5

    if-ltz v5, :cond_4

    mul-int/lit8 v11, v5, 0x2

    .line 1263
    array-length v12, v3

    if-gt v11, v12, :cond_4

    .line 1266
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1267
    invoke-static {v1, v5}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    goto :goto_3

    .line 1264
    :cond_4
    new-instance v1, Ll/᩻᩹ۖ;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v6, v3, v7

    aput-object v2, v3, v8

    invoke-direct {v1, v9, v3}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :cond_5
    :goto_3
    const/4 v12, 0x1

    .line 1323
    :cond_6
    :goto_4
    invoke-virtual {v6}, Ll/ۖ᩹ۖ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_c

    .line 1324
    iget-object v5, v6, Ll/ۖ᩹ۖ;->ۙ:Ll/ۡ᩹ۖ;

    iget v5, v5, Ll/ۡ᩹ۖ;->᩸:I

    add-int v5, p4, v5

    invoke-static {v1, v5}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    add-int/lit8 v5, v4, 0x2

    .line 1325
    invoke-static {v5, v3}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v5

    add-int v5, p4, v5

    mul-int/lit8 v5, v5, 0x2

    add-int/lit8 v7, v5, 0x2

    .line 1326
    array-length v11, v3

    if-ge v7, v11, :cond_b

    add-int/lit8 v11, v5, 0x1

    .line 1328
    aget-byte v11, v3, v11

    if-eq v11, v8, :cond_9

    if-ne v11, v10, :cond_8

    .line 1345
    invoke-static {v7, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v7

    add-int/lit8 v5, v5, 0x4

    mul-int/lit8 v11, v7, 0x4

    add-int/2addr v11, v5

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v7, :cond_c

    mul-int/lit8 v13, v5, 0x4

    add-int/2addr v13, v11

    .line 1348
    invoke-static {v13, v3}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v13

    add-int v13, p4, v13

    if-ltz v13, :cond_7

    mul-int/lit8 v14, v13, 0x2

    .line 1349
    array-length v15, v3

    if-gt v14, v15, :cond_7

    .line 1352
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v2, v14}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1353
    invoke-static {v1, v13}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_7
    const/4 v15, 0x0

    .line 1350
    new-instance v1, Ll/᩻᩹ۖ;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v6, v3, v15

    aput-object v2, v3, v8

    invoke-direct {v1, v9, v3}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :cond_8
    const/4 v1, 0x0

    .line 1358
    new-instance v2, Ll/᩻᩹ۖ;

    new-array v3, v8, [Ljava/lang/Object;

    aput-object v6, v3, v1

    const-string v1, "bad payload for %s"

    invoke-direct {v2, v1, v3}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_9
    const/4 v11, 0x0

    .line 1331
    invoke-static {v7, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v7

    add-int/lit8 v5, v5, 0x8

    const/4 v13, 0x0

    :goto_6
    if-ge v13, v7, :cond_d

    mul-int/lit8 v14, v13, 0x4

    add-int/2addr v14, v5

    .line 1334
    invoke-static {v14, v3}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v14

    add-int v14, p4, v14

    if-ltz v14, :cond_a

    mul-int/lit8 v15, v14, 0x2

    .line 1335
    array-length v8, v3

    if-gt v15, v8, :cond_a

    .line 1338
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1339
    invoke-static {v1, v14}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    add-int/lit8 v13, v13, 0x1

    const/4 v8, 0x1

    goto :goto_6

    .line 1336
    :cond_a
    new-instance v1, Ll/᩻᩹ۖ;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v6, v3, v11

    const/4 v5, 0x1

    aput-object v2, v3, v5

    invoke-direct {v1, v9, v3}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :cond_b
    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 1361
    new-instance v2, Ll/᩻᩹ۖ;

    new-array v3, v5, [Ljava/lang/Object;

    aput-object v6, v3, v1

    const-string v1, "bad payload offset for %s"

    invoke-direct {v2, v1, v3}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_c
    const/4 v11, 0x0

    :cond_d
    if-eqz v12, :cond_11

    .line 1367
    sget-object v1, Ll/ܳ᩹ۖ;->ۧ:[I

    iget-object v5, v6, Ll/ۖ᩹ۖ;->ۗ:Ll/ܺ᩹ۖ;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v1, v1, v5

    iget v5, v0, Ll/ۢ᩹ۖ;->֨:I

    packed-switch v1, :pswitch_data_2

    const v1, 0x7fffffff

    goto :goto_9

    :pswitch_6
    add-int/lit8 v1, v4, 0x2

    .line 1393
    invoke-static {v1, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    add-int/lit8 v7, v4, 0x6

    .line 1394
    invoke-static {v7, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v7

    if-ge v1, v5, :cond_f

    .line 1395
    iget v5, v0, Ll/ۢ᩹ۖ;->ܶ:I

    if-ge v7, v5, :cond_f

    goto :goto_8

    :pswitch_7
    add-int/lit8 v1, v4, 0x2

    .line 1389
    invoke-static {v1, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    .line 1390
    iget v5, v0, Ll/ۢ᩹ۖ;->ܳ:I

    if-ge v1, v5, :cond_f

    goto :goto_8

    :pswitch_8
    add-int/lit8 v1, v4, 0x2

    .line 1385
    invoke-static {v1, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    .line 1386
    iget v5, v0, Ll/ۢ᩹ۖ;->ᩴ:I

    if-ge v1, v5, :cond_f

    goto :goto_8

    :pswitch_9
    add-int/lit8 v1, v4, 0x2

    .line 1381
    invoke-static {v1, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    if-ge v1, v5, :cond_f

    goto :goto_8

    :pswitch_a
    add-int/lit8 v1, v4, 0x2

    .line 1377
    invoke-static {v1, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    .line 1378
    iget v5, v0, Ll/ۢ᩹ۖ;->ۤ:I

    if-ge v1, v5, :cond_f

    goto :goto_8

    .line 1369
    :pswitch_b
    iget-object v1, v6, Ll/ۖ᩹ۖ;->ۙ:Ll/ۡ᩹ۖ;

    sget-object v5, Ll/ۡ᩹ۖ;->᩻֫:Ll/ۡ᩹ۖ;

    if-ne v1, v5, :cond_e

    add-int/lit8 v1, v4, 0x2

    .line 410
    invoke-static {v1, v3}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v1

    goto :goto_7

    :cond_e
    add-int/lit8 v1, v4, 0x2

    .line 1372
    invoke-static {v1, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    :goto_7
    if-ltz v1, :cond_f

    .line 1374
    iget v5, v0, Ll/ۢ᩹ۖ;->ۙ:I

    if-ge v1, v5, :cond_f

    :goto_8
    const/4 v12, 0x1

    goto :goto_9

    :cond_f
    const/4 v12, 0x0

    :goto_9
    if-eqz v12, :cond_10

    goto :goto_a

    .line 1400
    :cond_10
    new-instance v2, Ll/᩻᩹ۖ;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v6, v3, v11

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const-string v1, "index-out-of-range for %s index: %d"

    invoke-direct {v2, v1, v3}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_11
    :goto_a
    if-eqz v12, :cond_17

    .line 1404
    invoke-virtual {v6}, Ll/ۖ᩹ۖ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_17

    .line 1405
    sget-object v1, Ll/ۖ᩹ۖ;->ۖܿ:Ll/ۖ᩹ۖ;

    if-ne v6, v1, :cond_16

    add-int/lit8 v5, v4, 0x1

    .line 1406
    aget-byte v5, v3, v5

    if-eqz v5, :cond_15

    const/4 v6, 0x1

    if-eq v5, v6, :cond_14

    if-eq v5, v10, :cond_13

    const/4 v1, 0x3

    if-eq v5, v1, :cond_12

    goto :goto_b

    :cond_12
    add-int/lit8 v1, v4, 0x2

    .line 1421
    invoke-static {v1, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    add-int/lit8 v4, v4, 0x4

    .line 410
    invoke-static {v4, v3}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v3

    mul-int v3, v3, v1

    const/4 v1, 0x1

    add-int/2addr v3, v1

    .line 1423
    div-int/2addr v3, v10

    add-int v3, v3, p4

    add-int/lit8 v3, v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_13
    add-int/2addr v4, v10

    .line 1416
    invoke-static {v4, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    add-int v1, v1, p4

    add-int/2addr v1, v10

    .line 1417
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_14
    add-int/2addr v4, v10

    .line 1411
    invoke-static {v4, v3}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    add-int v1, v1, p4

    add-int/lit8 v1, v1, 0x4

    .line 1412
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void

    .line 1408
    :cond_15
    iget-object v1, v1, Ll/ۖ᩹ۖ;->ۙ:Ll/ۡ᩹ۖ;

    iget v1, v1, Ll/ۡ᩹ۖ;->᩸:I

    add-int v1, p4, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void

    .line 1428
    :cond_16
    iget-object v1, v6, Ll/ۖ᩹ۖ;->ۙ:Ll/ۡ᩹ۖ;

    iget v1, v1, Ll/ۡ᩹ۖ;->᩸:I

    add-int v1, p4, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_17
    :goto_b
    return-void

    :cond_18
    const/4 v1, 0x0

    .line 1255
    new-instance v2, Ll/᩻᩹ۖ;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    const-string v1, "zero-width instruction op=0x%02x"

    invoke-direct {v2, v1, v4}, Ll/᩻᩹ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 1250
    :cond_19
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method private ֫(Ll/ܽ᩸ۖ;IIIII)V
    .locals 19

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    and-int/lit8 v5, p6, 0x1

    if-nez v5, :cond_0

    const/4 v5, -0x1

    if-eq v1, v5, :cond_0

    .line 830
    invoke-direct {v9, v1}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    .line 122
    iput-object v1, v0, Ll/ܽ᩸ۖ;->۫:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, p6, 0x8

    .line 837
    iget-object v10, v9, Ll/ۢ᩹ۖ;->᩵:Ll/֡ۛۡ;

    if-nez v1, :cond_7

    .line 839
    invoke-virtual {v10}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 840
    invoke-virtual {v10}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    .line 841
    invoke-virtual {v10}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    if-nez v1, :cond_1

    .line 843
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :cond_1
    if-nez v5, :cond_2

    .line 846
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_2
    if-nez v6, :cond_3

    .line 849
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_3
    if-eqz v2, :cond_8

    .line 853
    iget-object v7, v9, Ll/ۢ᩹ۖ;->ᩳ:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 855
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 856
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    .line 857
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v11

    .line 858
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v12

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v8, :cond_4

    .line 861
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v14

    .line 862
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v15

    .line 863
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v1, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_4
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v11, :cond_5

    .line 866
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v13

    .line 867
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v14

    .line 868
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v5, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    const/4 v8, 0x0

    :goto_2
    if-ge v8, v12, :cond_6

    .line 871
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v11

    .line 872
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v13

    .line 873
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v6, v11, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_6
    if-eqz v2, :cond_8

    .line 878
    :try_start_0
    invoke-direct {v9, v2, v0}, Ll/ۢ᩹ۖ;->֫(ILl/ᩴ᩹ۖ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 880
    new-instance v0, Ll/ۛ۠ۖ;

    const-string v2, "error on reading Annotation of class "

    .line 55
    invoke-direct {v0, v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 880
    throw v0

    :cond_7
    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :cond_8
    :goto_3
    move-object v11, v1

    move-object v12, v5

    move-object v13, v6

    if-eqz v3, :cond_f

    .line 892
    iget-object v14, v9, Ll/ۢ᩹ۖ;->᩻:Ljava/nio/ByteBuffer;

    invoke-virtual {v14, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 894
    invoke-static {v14}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v8

    .line 895
    invoke-static {v14}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v15

    .line 896
    invoke-static {v14}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v7

    .line 897
    invoke-static {v14}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v6

    and-int/lit8 v1, p6, 0x10

    if-nez v1, :cond_9

    if-eqz v4, :cond_9

    .line 951
    iget-object v1, v9, Ll/ۢ᩹ۖ;->ۖ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 956
    invoke-static {v1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v2

    .line 957
    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    :goto_4
    if-ge v4, v2, :cond_a

    .line 959
    invoke-direct {v9, v1}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    :cond_a
    move-object v5, v3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v8, :cond_c

    if-eqz v5, :cond_b

    .line 909
    array-length v1, v5

    if-ge v4, v1, :cond_b

    .line 910
    aget-object v1, v5, v4

    goto :goto_6

    :cond_b
    const/4 v1, 0x0

    :goto_6
    move-object/from16 v16, v1

    move-object/from16 v1, p0

    move-object v2, v14

    move/from16 v17, v4

    move-object/from16 v4, p1

    move-object/from16 v18, v5

    move-object v5, v11

    move v0, v6

    move-object/from16 v6, v16

    move v9, v7

    move/from16 v7, p6

    .line 912
    invoke-direct/range {v1 .. v7}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;ILl/ܽ᩸ۖ;Ljava/util/Map;Ljava/lang/Object;I)I

    move-result v3

    add-int/lit8 v4, v17, 0x1

    move v6, v0

    move v7, v9

    move-object/from16 v5, v18

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    goto :goto_5

    :cond_c
    move v0, v6

    move v9, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    :goto_7
    if-ge v8, v15, :cond_d

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object v2, v14

    move-object/from16 v4, p1

    move-object v5, v11

    move/from16 v7, p6

    .line 917
    invoke-direct/range {v1 .. v7}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;ILl/ܽ᩸ۖ;Ljava/util/Map;Ljava/lang/Object;I)I

    move-result v3

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_d
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x1

    const/4 v15, 0x0

    :goto_8
    if-ge v15, v9, :cond_e

    move-object/from16 v1, p0

    move-object v2, v14

    move-object/from16 v4, p1

    move-object v5, v12

    move-object v6, v13

    move/from16 v7, p6

    .line 922
    invoke-direct/range {v1 .. v8}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;ILl/ܽ᩸ۖ;Ljava/util/Map;Ljava/util/Map;IZ)I

    move-result v3

    add-int/lit8 v15, v15, 0x1

    const/4 v8, 0x0

    goto :goto_8

    :cond_e
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v3, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    :goto_9
    if-ge v9, v0, :cond_f

    move-object/from16 v1, p0

    move-object v2, v14

    move-object/from16 v4, p1

    move-object v5, v12

    move-object v6, v13

    move/from16 v7, p6

    .line 929
    invoke-direct/range {v1 .. v8}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;ILl/ܽ᩸ۖ;Ljava/util/Map;Ljava/util/Map;IZ)I

    move-result v3

    add-int/lit8 v9, v9, 0x1

    const/4 v8, 0x0

    goto :goto_9

    :cond_f
    if-eqz v11, :cond_10

    .line 937
    invoke-interface {v11}, Ljava/util/Map;->clear()V

    .line 938
    invoke-virtual {v10, v11}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    :cond_10
    if-eqz v12, :cond_11

    .line 941
    invoke-interface {v12}, Ljava/util/Map;->clear()V

    .line 942
    invoke-virtual {v10, v12}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    :cond_11
    if-eqz v13, :cond_12

    .line 945
    invoke-interface {v13}, Ljava/util/Map;->clear()V

    .line 946
    invoke-virtual {v10, v13}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    :cond_12
    return-void
.end method

.method private ۜ(I)[Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-array p1, v0, [Ljava/lang/String;

    return-object p1

    .line 1009
    :cond_0
    iget-object v1, p0, Ll/ۢ᩹ۖ;->۫:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1010
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    .line 1011
    new-array v2, p1, [Ljava/lang/String;

    :goto_0
    if-ge v0, p1, :cond_1

    const v3, 0xffff

    .line 1013
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v4

    and-int/2addr v3, v4

    invoke-direct {p0, v3}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public static ۧ(I[B)I
    .locals 1

    add-int/lit8 v0, p0, 0x1

    .line 397
    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x8

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static ۧ(Ljava/nio/ByteBuffer;)I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 448
    :goto_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    and-int/lit8 v3, v2, 0x7f

    shl-int/2addr v3, v1

    or-int/2addr v0, v3

    add-int/lit8 v3, v1, 0x7

    and-int/lit16 v2, v2, 0x80

    if-nez v2, :cond_1

    add-int/lit8 v1, v1, 0x6

    const-wide/16 v4, 0x1

    shl-long v1, v4, v1

    int-to-long v6, v0

    and-long/2addr v1, v6

    const-wide/16 v8, 0x0

    cmp-long p0, v1, v8

    if-eqz p0, :cond_0

    shl-long v0, v4, v3

    sub-long/2addr v6, v0

    long-to-int p0, v6

    return p0

    :cond_0
    return v0

    :cond_1
    move v1, v3

    goto :goto_0
.end method

.method public static ۧ(Ljava/nio/ByteBuffer;I)J
    .locals 6

    shr-int/lit8 p1, p1, 0x5

    and-int/lit8 p1, p1, 0x7

    add-int/lit8 p1, p1, 0x1

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 371
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    mul-int/lit8 v5, v2, 0x8

    shl-long/2addr v3, v5

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    rsub-int/lit8 p0, p1, 0x8

    mul-int/lit8 p0, p0, 0x8

    shl-long/2addr v0, p0

    shr-long p0, v0, p0

    return-wide p0
.end method

.method private ۧ(I)Ll/ܰ۠ۖ;
    .locals 3

    mul-int/lit8 p1, p1, 0x8

    .line 998
    iget-object v0, p0, Ll/ۢ᩹ۖ;->ۘ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 999
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    const v1, 0xffff

    and-int/2addr p1, v1

    .line 1000
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    and-int/2addr v1, v2

    .line 1001
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    .line 1002
    new-instance v2, Ll/ܰ۠ۖ;

    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, p1, v0, v1}, Ll/ܰ۠ۖ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method private ܳ(I)Ljava/lang/String;
    .locals 11

    if-ltz p1, :cond_4

    .line 1046
    iget-object v0, p0, Ll/ۢ᩹ۖ;->ۗ:[Ljava/lang/String;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 1049
    :cond_0
    aget-object v1, v0, p1

    if-eqz v1, :cond_1

    return-object v1

    .line 1059
    :cond_1
    iget-object v1, p0, Ll/ۢ᩹ۖ;->᩸:Ll/֡ۛۡ;

    mul-int/lit8 v2, p1, 0x4

    iget-object v3, p0, Ll/ۢ᩹ۖ;->᩶:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    .line 1060
    iget-object v3, p0, Ll/ۢ᩹ۖ;->᩹:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1061
    invoke-static {v3}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v4

    const/4 v5, 0x0

    .line 1063
    :try_start_0
    invoke-virtual {v1}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/StringBuilder;

    if-nez v6, :cond_2

    .line 1065
    new-instance v6, Ljava/lang/StringBuilder;

    int-to-double v7, v4

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    mul-double v7, v7, v9

    double-to-int v4, v7

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1067
    :cond_2
    invoke-static {v3, v6}, Ll/ۘ᩹ۖ;->֫(Ljava/nio/ByteBuffer;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v3

    .line 1068
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    const/16 v7, 0x64

    if-ge v4, v7, :cond_3

    .line 1069
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1070
    invoke-virtual {v1, v6}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/UTFDataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1054
    :cond_3
    aput-object v3, v0, p1

    return-object v3

    :catch_0
    move-exception v0

    .line 1074
    new-instance v1, Ll/ۛ۠ۖ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v5

    const/4 p1, 0x1

    aput-object v2, v3, p1

    const-string p1, "fail to load string %d@%08x"

    invoke-direct {v1, v0, p1, v3}, Ll/ۛ۠ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static ܽ(I[B)I
    .locals 1

    add-int/lit8 v0, p0, 0x1

    .line 401
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static ܽ(Ljava/nio/ByteBuffer;)I
    .locals 4

    .line 434
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    and-int/lit16 v3, v0, 0x80

    if-eqz v3, :cond_0

    and-int/lit8 v0, v0, 0x7f

    shl-int/2addr v0, v2

    or-int/2addr v1, v0

    add-int/lit8 v2, v2, 0x7

    .line 438
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    goto :goto_0

    :cond_0
    and-int/lit8 p0, v0, 0x7f

    shl-int/2addr p0, v2

    or-int/2addr p0, v1

    return p0
.end method

.method public static ܽ(Ljava/nio/ByteBuffer;I)J
    .locals 6

    shr-int/lit8 p1, p1, 0x5

    and-int/lit8 p1, p1, 0x7

    add-int/lit8 p1, p1, 0x1

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 381
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    mul-int/lit8 v5, v2, 0x8

    shl-long/2addr v3, v5

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method private ܽ(I)Ll/۟۠ۖ;
    .locals 3

    mul-int/lit8 p1, p1, 0x8

    .line 1034
    iget-object v0, p0, Ll/ۢ᩹ۖ;->֡:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1035
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    const v1, 0xffff

    and-int/2addr p1, v1

    .line 1036
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    and-int/2addr v1, v2

    .line 1037
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    .line 1038
    new-instance v2, Ll/۟۠ۖ;

    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1}, Ll/ۢ᩹ۖ;->ܿ(I)Ll/ۧܶۖ;

    move-result-object v1

    invoke-direct {v2, p1, v0, v1}, Ll/۟۠ۖ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ۧܶۖ;)V

    return-object v2
.end method

.method private ܿ(I)Ll/ۧܶۖ;
    .locals 2

    mul-int/lit8 p1, p1, 0xc

    add-int/lit8 p1, p1, 0x4

    .line 1022
    iget-object v0, p0, Ll/ۢ᩹ۖ;->۠:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1024
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    .line 1025
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    .line 1027
    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object p1

    .line 1029
    invoke-direct {p0, v0}, Ll/ۢ᩹ۖ;->ۜ(I)[Ljava/lang/String;

    move-result-object v0

    .line 1030
    new-instance v1, Ll/ۧܶۖ;

    invoke-direct {v1, p1, v0}, Ll/ۧܶۖ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-object v1
.end method

.method private ᩳ(I)Ll/֫ܶۖ;
    .locals 2

    mul-int/lit8 p1, p1, 0x8

    .line 799
    iget-object v0, p0, Ll/ۢ᩹ۖ;->ۚ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 800
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    const v1, 0xffff

    and-int/2addr p1, v1

    .line 801
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 802
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    and-int/2addr v0, v1

    packed-switch p1, :pswitch_data_0

    .line 818
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 816
    :pswitch_0
    new-instance v1, Ll/֫ܶۖ;

    invoke-direct {p0, v0}, Ll/ۢ᩹ۖ;->ܽ(I)Ll/۟۠ۖ;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ll/֫ܶۖ;-><init>(ILl/۟۠ۖ;)V

    return-object v1

    .line 809
    :pswitch_1
    new-instance v1, Ll/֫ܶۖ;

    invoke-direct {p0, v0}, Ll/ۢ᩹ۖ;->ۧ(I)Ll/ܰ۠ۖ;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ll/֫ܶۖ;-><init>(ILl/ܰ۠ۖ;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ᩳ(Ljava/nio/ByteBuffer;)Ll/ۧ᩸ۖ;
    .locals 7

    .line 984
    invoke-static {p1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 985
    invoke-static {p1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v1

    .line 986
    invoke-direct {p0, v0}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v0

    .line 987
    new-instance v2, Ll/ۧ᩸ۖ;

    sget-object v3, Ll/ܽܶۖ;->ۙ:Ll/ܽܶۖ;

    invoke-direct {v2, v0, v3}, Ll/ۧ᩸ۖ;-><init>(Ljava/lang/String;Ll/ܽܶۖ;)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 989
    invoke-static {p1}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 990
    invoke-direct {p0, v3}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v3

    .line 991
    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->֫(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v4

    .line 992
    iget-object v5, v2, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    new-instance v6, Ll/֫᩸ۖ;

    invoke-direct {v6, v3, v4}, Ll/֫᩸ۖ;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method private ᩻(I)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    mul-int/lit8 p1, p1, 0x4

    .line 1082
    iget-object v0, p0, Ll/ۢ᩹ۖ;->۬:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 1210
    iget v0, p0, Ll/ۢ᩹ۖ;->᩷:I

    return v0
.end method

.method public final ֫(ILl/ᩳ᩸ۖ;IZLl/۟۠ۖ;)V
    .locals 26

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    move/from16 v0, p3

    .line 1480
    iget-object v1, v8, Ll/ۢ᩹ۖ;->ۢ:Ljava/nio/ByteBuffer;

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1481
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    const v3, 0xffff

    and-int v4, v2, v3

    .line 1482
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 1483
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 1484
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    and-int/2addr v2, v3

    .line 1485
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 1486
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    mul-int/lit8 v6, v5, 0x2

    .line 1488
    new-array v10, v6, [B

    .line 1489
    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 150
    iput v4, v9, Ll/ᩳ᩸ۖ;->ܽ:I

    .line 1491
    new-instance v11, Ljava/util/BitSet;

    invoke-direct {v11}, Ljava/util/BitSet;-><init>()V

    .line 1492
    new-instance v12, Ljava/util/TreeMap;

    invoke-direct {v12}, Ljava/util/TreeMap;-><init>()V

    .line 1493
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    if-lez v2, :cond_6

    and-int/lit8 v6, v5, 0x1

    if-eqz v6, :cond_0

    .line 1497
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    :cond_0
    const v6, 0xffff

    and-int/lit16 v7, v0, 0x100

    if-nez v7, :cond_6

    .line 1435
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v7

    mul-int/lit8 v14, v2, 0x8

    add-int/2addr v14, v7

    .line 1436
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v7

    sget-object v15, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v7, v15}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v7

    const/4 v15, 0x0

    :goto_0
    if-ge v15, v2, :cond_6

    move/from16 v16, v2

    .line 1438
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 1439
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v17

    and-int v17, v17, v6

    .line 1440
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v18

    and-int v18, v18, v6

    if-le v2, v5, :cond_1

    move-object/from16 v17, v1

    move/from16 v24, v4

    move/from16 v18, v5

    move-object/from16 v23, v10

    move-object/from16 v22, v11

    move/from16 v21, v14

    goto/16 :goto_3

    .line 1444
    :cond_1
    invoke-static {v12, v2}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    add-int v6, v2, v17

    .line 1446
    invoke-static {v12, v6}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    move-object/from16 v17, v1

    add-int v1, v14, v18

    .line 1448
    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1451
    invoke-static {v7}, Ll/ۢ᩹ۖ;->ۧ(Ljava/nio/ByteBuffer;)I

    move-result v1

    if-gtz v1, :cond_2

    neg-int v1, v1

    add-int/lit8 v18, v1, 0x1

    const/16 v20, 0x1

    move/from16 v25, v5

    move v5, v1

    move/from16 v1, v18

    move/from16 v18, v25

    goto :goto_1

    :cond_2
    const/16 v20, 0x0

    move/from16 v18, v5

    move v5, v1

    :goto_1
    move/from16 v21, v14

    .line 1458
    new-array v14, v1, [Ll/ۨ۠ۖ;

    .line 1459
    new-array v1, v1, [Ljava/lang/String;

    const/16 v22, 0x0

    move-object/from16 v23, v10

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v5, :cond_3

    move-object/from16 v22, v11

    .line 1461
    invoke-static {v7}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v11

    move/from16 v24, v4

    .line 1462
    invoke-static {v7}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v4

    .line 1463
    invoke-static {v12, v4}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    .line 1464
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1465
    invoke-direct {v8, v11}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v10

    .line 1466
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۠ۖ;

    aput-object v0, v14, v10

    add-int/lit8 v10, v10, 0x1

    move/from16 v0, p3

    move-object/from16 v11, v22

    move/from16 v4, v24

    goto :goto_2

    :cond_3
    move/from16 v24, v4

    move-object/from16 v22, v11

    if-eqz v20, :cond_4

    .line 1469
    invoke-static {v7}, Ll/ۢ᩹ۖ;->ܽ(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 1470
    invoke-static {v12, v0}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;I)V

    .line 1471
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v13, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1472
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۠ۖ;

    aput-object v0, v14, v5

    .line 1474
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۠ۖ;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ۠ۖ;

    .line 185
    iget-object v4, v9, Ll/ᩳ᩸ۖ;->ᩳ:Ljava/util/ArrayList;

    if-nez v4, :cond_5

    .line 186
    new-instance v4, Ljava/util/ArrayList;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v4, v9, Ll/ᩳ᩸ۖ;->ᩳ:Ljava/util/ArrayList;

    .line 188
    :cond_5
    iget-object v4, v9, Ll/ᩳ᩸ۖ;->ᩳ:Ljava/util/ArrayList;

    new-instance v5, Ll/֡᩸ۖ;

    invoke-direct {v5, v0, v2, v14, v1}, Ll/֡᩸ۖ;-><init>(Ll/ۨ۠ۖ;Ll/ۨ۠ۖ;[Ll/ۨ۠ۖ;[Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v15, v15, 0x1

    move/from16 v0, p3

    move/from16 v2, v16

    move-object/from16 v1, v17

    move/from16 v5, v18

    move/from16 v14, v21

    move-object/from16 v11, v22

    move-object/from16 v10, v23

    move/from16 v4, v24

    const v6, 0xffff

    goto/16 :goto_0

    :cond_6
    move/from16 v24, v4

    move-object/from16 v23, v10

    move-object/from16 v22, v11

    const/4 v15, 0x1

    const/4 v10, 0x0

    if-eqz v3, :cond_7

    and-int/lit8 v0, p3, 0x1

    if-nez v0, :cond_7

    .line 1505
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    new-instance v7, Ll/ܺ᩸ۖ;

    .line 24
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v7, Ll/ܺ᩸ۖ;->ۢ:Ljava/util/ArrayList;

    .line 199
    iput-object v7, v9, Ll/ᩳ᩸ۖ;->֫:Ll/ܺ᩸ۖ;

    move-object/from16 v1, p0

    move v2, v3

    move/from16 v3, v24

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object v6, v12

    .line 1508
    :try_start_0
    invoke-direct/range {v1 .. v7}, Ll/ۢ᩹ۖ;->֫(IIZLl/۟۠ۖ;Ljava/util/TreeMap;Ll/ۘ۠ۡ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1515
    :catch_0
    :cond_7
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 1224
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 1225
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1226
    invoke-virtual {v2, v13}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 1227
    invoke-virtual {v13}, Ljava/util/HashSet;->clear()V

    .line 1228
    :goto_4
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v3, 0x2

    if-nez v0, :cond_9

    .line 1229
    invoke-virtual {v2}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object/from16 v6, v22

    .line 1230
    invoke-virtual {v6, v5}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object/from16 v22, v6

    goto :goto_4

    .line 1233
    :cond_8
    invoke-virtual {v6, v5}, Ljava/util/BitSet;->set(I)V

    move-object/from16 v7, v23

    .line 1236
    :try_start_1
    invoke-direct {v8, v12, v2, v7, v5}, Ll/ۢ᩹ۖ;->֫(Ljava/util/TreeMap;Ljava/util/LinkedList;[BI)V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ll/᩻᩹ۖ; {:try_start_1 .. :try_end_1} :catch_1

    :goto_5
    move-object/from16 v22, v6

    move-object/from16 v23, v7

    goto :goto_4

    :catch_1
    move-exception v0

    move-object v11, v0

    .line 1241
    invoke-virtual {v1, v5}, Ljava/util/BitSet;->set(I)V

    .line 1242
    invoke-virtual/range {p5 .. p5}, Ll/۟۠ۖ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x3

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v4, v11, v10

    aput-object v0, v11, v15

    aput-object v5, v11, v3

    const-string v0, "GLITCH: %04x %s | %s"

    invoke-static {v0, v11}, Ll/ۢ᩹ۖ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    .line 1238
    :catch_2
    invoke-virtual {v1, v5}, Ljava/util/BitSet;->set(I)V

    .line 1239
    invoke-virtual/range {p5 .. p5}, Ll/۟۠ۖ;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v4, v3, v10

    aput-object v0, v3, v15

    const-string v0, "GLITCH: %04x %s | not enough space for reading instruction"

    invoke-static {v0, v3}, Ll/ۢ᩹ۖ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    move-object/from16 v6, v22

    move-object/from16 v7, v23

    .line 1523
    invoke-virtual {v12}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 1524
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    goto :goto_6

    :cond_a
    const/4 v2, 0x0

    .line 1525
    :goto_6
    sget-object v3, Ll/ۖ᩹ۖ;->᩵᩻:[Ll/ۖ᩹ۖ;

    const/4 v4, 0x0

    .line 1526
    invoke-virtual {v6, v4}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v4

    :goto_7
    if-ltz v4, :cond_37

    :goto_8
    if-eqz v2, :cond_c

    .line 1530
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gt v5, v4, :cond_c

    .line 1531
    invoke-virtual {v12, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۨ۠ۖ;)V

    .line 1532
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    goto :goto_8

    :cond_b
    const/4 v2, 0x0

    goto :goto_8

    .line 1539
    :cond_c
    invoke-virtual {v1, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 1540
    sget-object v5, Ll/ۖ᩹ۖ;->ۗ֫:Ll/ۖ᩹ۖ;

    invoke-virtual {v9, v5}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;)V

    :goto_9
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    :goto_a
    move-object/from16 v17, v3

    move v15, v4

    move-object/from16 v22, v6

    goto/16 :goto_18

    :cond_d
    mul-int/lit8 v5, v4, 0x2

    .line 1545
    aget-byte v10, v7, v5

    and-int/lit16 v10, v10, 0xff

    .line 1547
    aget-object v10, v3, v10

    .line 1550
    sget-object v11, Ll/ܳ᩹ۖ;->֫:[I

    iget-object v13, v10, Ll/ۖ᩹ۖ;->ۙ:Ll/ۡ᩹ۖ;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v11, v11, v13

    packed-switch v11, :pswitch_data_0

    goto :goto_9

    :pswitch_0
    add-int/lit8 v11, v5, 0x1

    .line 418
    aget-byte v11, v7, v11

    and-int/lit16 v11, v11, 0xff

    add-int/lit8 v14, v5, 0x2

    .line 1869
    invoke-static {v14, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v14

    int-to-long v13, v14

    add-int/lit8 v15, v5, 0x4

    .line 1870
    invoke-static {v15, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v15

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    int-to-long v1, v15

    const/16 v15, 0x10

    shl-long/2addr v1, v15

    or-long/2addr v1, v13

    add-int/lit8 v13, v5, 0x6

    .line 1871
    invoke-static {v13, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v13

    int-to-long v13, v13

    const/16 v15, 0x20

    shl-long/2addr v13, v15

    or-long/2addr v1, v13

    add-int/lit8 v5, v5, 0x8

    .line 1872
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v5

    int-to-long v13, v5

    const/16 v5, 0x30

    shl-long/2addr v13, v5

    or-long/2addr v1, v13

    .line 1873
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v9, v10, v11, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_1
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x1

    .line 418
    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v5, v5, 0x2

    .line 1859
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v2

    .line 1860
    sget-object v5, Ll/ۖ᩹ۖ;->ܰ֫:Ll/ۖ᩹ۖ;

    if-ne v10, v5, :cond_e

    .line 1861
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v9, v10, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_c

    :cond_e
    int-to-long v13, v2

    .line 1863
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v9, v10, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_2
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x1

    .line 418
    aget-byte v1, v7, v1

    and-int/lit16 v2, v1, 0xff

    add-int/lit8 v5, v5, 0x2

    .line 1853
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v5

    and-int/lit8 v1, v1, 0xf

    shr-int/lit8 v2, v2, 0x4

    .line 1854
    invoke-virtual {v9, v10, v1, v2, v5}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;III)V

    goto/16 :goto_c

    :pswitch_3
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x1

    .line 418
    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, v5, 0x2

    aget-byte v2, v7, v2

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v5, v5, 0x3

    .line 422
    aget-byte v5, v7, v5

    .line 1849
    invoke-virtual {v9, v10, v1, v2, v5}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;III)V

    goto/16 :goto_c

    :pswitch_4
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x1

    .line 418
    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v5, v5, 0x2

    .line 1838
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v2

    .line 1839
    sget-object v5, Ll/ۖ᩹ۖ;->۟֫:Ll/ۖ᩹ۖ;

    if-ne v10, v5, :cond_f

    .line 1840
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v9, v10, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_c

    :cond_f
    int-to-long v13, v2

    .line 1842
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v9, v10, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_5
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x1

    .line 418
    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v5, v5, 0x2

    .line 1829
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v2

    .line 1830
    sget-object v5, Ll/ۖ᩹ۖ;->ܽۧ:Ll/ۖ᩹ۖ;

    if-ne v10, v5, :cond_10

    shl-int/lit8 v2, v2, 0x10

    .line 1831
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v9, v10, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_c

    :cond_10
    int-to-long v13, v2

    const/16 v2, 0x30

    shl-long/2addr v13, v2

    .line 1833
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v9, v10, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_6
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v5, v5, 0x1

    .line 1824
    aget-byte v1, v7, v5

    and-int/lit8 v2, v1, 0xf

    shr-int/lit8 v1, v1, 0x4

    .line 1825
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v10, v2, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_7
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x2

    .line 1819
    invoke-static {v1, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    add-int/lit8 v5, v5, 0x4

    .line 1820
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v2

    .line 1821
    invoke-virtual {v9, v10, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;II)V

    goto :goto_c

    :pswitch_8
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x1

    .line 418
    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, v5, 0x2

    aget-byte v2, v7, v2

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v5, v5, 0x3

    aget-byte v5, v7, v5

    and-int/lit16 v5, v5, 0xff

    .line 1816
    invoke-virtual {v9, v10, v1, v2, v5}, Ll/ᩳ᩸ۖ;->ۧ(Ll/ۖ᩹ۖ;III)V

    goto :goto_c

    :pswitch_9
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x1

    .line 418
    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v5, v5, 0x2

    .line 1809
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v2

    .line 1810
    invoke-virtual {v9, v10, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;II)V

    goto :goto_c

    :pswitch_a
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x1

    .line 418
    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, v5, 0x2

    .line 1797
    invoke-static {v2, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v2

    add-int/lit8 v11, v5, 0x4

    .line 1798
    invoke-static {v11, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v11

    add-int/lit8 v5, v5, 0x6

    .line 1799
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v5

    .line 1800
    new-array v13, v1, [I

    const/4 v14, 0x0

    :goto_b
    if-ge v14, v1, :cond_11

    add-int v15, v11, v14

    .line 1802
    aput v15, v13, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_b

    .line 1804
    :cond_11
    invoke-direct {v8, v2}, Ll/ۢ᩹ۖ;->ܽ(I)Ll/۟۠ۖ;

    move-result-object v1

    invoke-direct {v8, v5}, Ll/ۢ᩹ۖ;->ܿ(I)Ll/ۧܶۖ;

    move-result-object v2

    invoke-virtual {v9, v10, v13, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;[ILl/۟۠ۖ;Ll/ۧܶۖ;)V

    :goto_c
    move-object/from16 v18, v0

    goto/16 :goto_a

    :pswitch_b
    move-object/from16 v16, v1

    move-object/from16 p5, v2

    add-int/lit8 v1, v5, 0x1

    .line 418
    aget-byte v1, v7, v1

    and-int/lit16 v2, v1, 0xff

    add-int/lit8 v11, v5, 0x2

    .line 1774
    invoke-static {v11, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v11

    add-int/lit8 v13, v5, 0x4

    .line 418
    aget-byte v13, v7, v13

    and-int/lit16 v14, v13, 0xff

    add-int/lit8 v15, v5, 0x5

    aget-byte v15, v7, v15

    move-object/from16 v17, v3

    and-int/lit16 v3, v15, 0xff

    add-int/lit8 v5, v5, 0x6

    .line 1777
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v5

    shr-int/lit8 v2, v2, 0x4

    move-object/from16 v18, v0

    .line 1779
    new-array v0, v2, [I

    move-object/from16 v22, v6

    const/4 v6, 0x1

    if-eq v2, v6, :cond_16

    const/4 v6, 0x2

    if-eq v2, v6, :cond_15

    const/4 v6, 0x3

    if-eq v2, v6, :cond_14

    const/4 v6, 0x4

    const/16 v19, 0x3

    if-eq v2, v6, :cond_13

    const/4 v6, 0x5

    const/16 v20, 0x4

    if-eq v2, v6, :cond_12

    goto :goto_d

    :cond_12
    and-int/lit8 v1, v1, 0xf

    .line 1782
    aput v1, v0, v20

    :cond_13
    shr-int/lit8 v1, v3, 0x4

    and-int/lit8 v1, v1, 0xf

    .line 1784
    aput v1, v0, v19

    :cond_14
    and-int/lit8 v1, v15, 0xf

    const/4 v2, 0x2

    .line 1786
    aput v1, v0, v2

    :cond_15
    shr-int/lit8 v1, v14, 0x4

    and-int/lit8 v1, v1, 0xf

    const/4 v2, 0x1

    .line 1788
    aput v1, v0, v2

    :cond_16
    and-int/lit8 v1, v13, 0xf

    const/4 v2, 0x0

    .line 1790
    aput v1, v0, v2

    .line 1792
    :goto_d
    invoke-direct {v8, v11}, Ll/ۢ᩹ۖ;->ܽ(I)Ll/۟۠ۖ;

    move-result-object v1

    invoke-direct {v8, v5}, Ll/ۢ᩹ۖ;->ܿ(I)Ll/ۧܶۖ;

    move-result-object v2

    invoke-virtual {v9, v10, v0, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;[ILl/۟۠ۖ;Ll/ۧܶۖ;)V

    goto/16 :goto_10

    :pswitch_c
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move-object/from16 v22, v6

    add-int/lit8 v0, v5, 0x1

    .line 418
    aget-byte v0, v7, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, v5, 0x2

    .line 1757
    invoke-static {v1, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    add-int/lit8 v5, v5, 0x4

    .line 1758
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v2

    .line 1759
    new-array v3, v0, [I

    const/4 v5, 0x0

    :goto_e
    if-ge v5, v0, :cond_17

    add-int v6, v2, v5

    .line 1761
    aput v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_e

    .line 1763
    :cond_17
    iget-object v0, v10, Ll/ۖ᩹ۖ;->ۗ:Ll/ܺ᩹ۖ;

    sget-object v2, Ll/ܺ᩹ۖ;->ܰ:Ll/ܺ᩹ۖ;

    if-ne v0, v2, :cond_18

    .line 1764
    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v10, v3, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;[ILjava/lang/String;)V

    goto/16 :goto_10

    .line 1765
    :cond_18
    sget-object v2, Ll/ܺ᩹ۖ;->᩹:Ll/ܺ᩹ۖ;

    if-ne v0, v2, :cond_19

    .line 1766
    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->֫(I)Ll/ۤ۠ۖ;

    move-result-object v0

    invoke-virtual {v9, v10, v3, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;[ILl/ۤ۠ۖ;)V

    goto/16 :goto_10

    .line 1768
    :cond_19
    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->ܽ(I)Ll/۟۠ۖ;

    move-result-object v0

    invoke-virtual {v9, v10, v3, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;[ILl/۟۠ۖ;)V

    goto/16 :goto_10

    :pswitch_d
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move-object/from16 v22, v6

    add-int/lit8 v0, v5, 0x1

    .line 418
    aget-byte v0, v7, v0

    and-int/lit16 v1, v0, 0xff

    add-int/lit8 v2, v5, 0x2

    .line 1729
    invoke-static {v2, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v2

    add-int/lit8 v3, v5, 0x4

    .line 418
    aget-byte v3, v7, v3

    and-int/lit16 v6, v3, 0xff

    add-int/lit8 v5, v5, 0x5

    aget-byte v5, v7, v5

    and-int/lit16 v11, v5, 0xff

    shr-int/lit8 v1, v1, 0x4

    .line 1733
    new-array v13, v1, [I

    const/4 v14, 0x1

    if-eq v1, v14, :cond_1e

    const/4 v14, 0x2

    if-eq v1, v14, :cond_1d

    const/4 v14, 0x3

    if-eq v1, v14, :cond_1c

    const/4 v14, 0x4

    const/4 v15, 0x3

    if-eq v1, v14, :cond_1b

    const/4 v14, 0x5

    const/16 v19, 0x4

    if-eq v1, v14, :cond_1a

    goto :goto_f

    :cond_1a
    and-int/lit8 v0, v0, 0xf

    .line 1736
    aput v0, v13, v19

    :cond_1b
    shr-int/lit8 v0, v11, 0x4

    and-int/lit8 v0, v0, 0xf

    .line 1738
    aput v0, v13, v15

    :cond_1c
    and-int/lit8 v0, v5, 0xf

    const/4 v1, 0x2

    .line 1740
    aput v0, v13, v1

    :cond_1d
    shr-int/lit8 v0, v6, 0x4

    and-int/lit8 v0, v0, 0xf

    const/4 v1, 0x1

    .line 1742
    aput v0, v13, v1

    :cond_1e
    and-int/lit8 v0, v3, 0xf

    const/4 v1, 0x0

    .line 1744
    aput v0, v13, v1

    .line 1746
    :goto_f
    iget-object v0, v10, Ll/ۖ᩹ۖ;->ۗ:Ll/ܺ᩹ۖ;

    sget-object v1, Ll/ܺ᩹ۖ;->ܰ:Ll/ܺ᩹ۖ;

    if-ne v0, v1, :cond_1f

    .line 1747
    invoke-direct {v8, v2}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v10, v13, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;[ILjava/lang/String;)V

    goto/16 :goto_10

    .line 1748
    :cond_1f
    sget-object v1, Ll/ܺ᩹ۖ;->᩹:Ll/ܺ᩹ۖ;

    if-ne v0, v1, :cond_20

    .line 1749
    invoke-direct {v8, v2}, Ll/ۢ᩹ۖ;->֫(I)Ll/ۤ۠ۖ;

    move-result-object v0

    invoke-virtual {v9, v10, v13, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;[ILl/ۤ۠ۖ;)V

    goto/16 :goto_10

    .line 1751
    :cond_20
    invoke-direct {v8, v2}, Ll/ۢ᩹ۖ;->ܽ(I)Ll/۟۠ۖ;

    move-result-object v0

    invoke-virtual {v9, v10, v13, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;[ILl/۟۠ۖ;)V

    goto/16 :goto_10

    :pswitch_e
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move-object/from16 v22, v6

    .line 1721
    iget-object v0, v10, Ll/ۖ᩹ۖ;->ۗ:Ll/ܺ᩹ۖ;

    sget-object v1, Ll/ܺ᩹ۖ;->᩺:Ll/ܺ᩹ۖ;

    if-ne v0, v1, :cond_29

    add-int/lit8 v0, v5, 0x1

    .line 418
    aget-byte v0, v7, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v5, v5, 0x2

    .line 410
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v1

    .line 1724
    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v10, v0, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_10

    :pswitch_f
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move-object/from16 v22, v6

    add-int/lit8 v0, v5, 0x1

    .line 418
    aget-byte v0, v7, v0

    and-int/lit16 v1, v0, 0xff

    add-int/lit8 v5, v5, 0x2

    .line 1708
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v2

    .line 1709
    sget-object v3, Ll/ܳ᩹ۖ;->ۧ:[I

    iget-object v5, v10, Ll/ۖ᩹ۖ;->ۗ:Ll/ܺ᩹ۖ;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v3, v3, v5

    const/4 v5, 0x2

    if-eq v3, v5, :cond_22

    const/4 v5, 0x4

    if-eq v3, v5, :cond_21

    goto/16 :goto_10

    :cond_21
    and-int/lit8 v0, v0, 0xf

    shr-int/lit8 v1, v1, 0x4

    .line 1711
    invoke-direct {v8, v2}, Ll/ۢ᩹ۖ;->ۧ(I)Ll/ܰ۠ۖ;

    move-result-object v2

    invoke-virtual {v9, v10, v0, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILl/ܰ۠ۖ;)V

    goto/16 :goto_10

    :cond_22
    and-int/lit8 v0, v0, 0xf

    shr-int/lit8 v1, v1, 0x4

    .line 1714
    invoke-direct {v8, v2}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v10, v0, v1, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILjava/lang/String;)V

    goto/16 :goto_10

    :pswitch_10
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move-object/from16 v22, v6

    add-int/lit8 v0, v5, 0x1

    .line 418
    aget-byte v0, v7, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v5, v5, 0x2

    .line 1681
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v1

    .line 1682
    sget-object v2, Ll/ܳ᩹ۖ;->ۧ:[I

    iget-object v3, v10, Ll/ۖ᩹ۖ;->ۗ:Ll/ܺ᩹ۖ;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_28

    const/4 v3, 0x2

    if-eq v2, v3, :cond_26

    const/4 v3, 0x4

    if-eq v2, v3, :cond_25

    const/4 v3, 0x7

    if-eq v2, v3, :cond_24

    const/16 v3, 0x8

    if-eq v2, v3, :cond_23

    goto/16 :goto_10

    .line 1700
    :cond_23
    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->ܿ(I)Ll/ۧܶۖ;

    move-result-object v1

    invoke-virtual {v9, v10, v0, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_10

    .line 1697
    :cond_24
    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->ᩳ(I)Ll/֫ܶۖ;

    move-result-object v1

    invoke-virtual {v9, v10, v0, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_10

    .line 1687
    :cond_25
    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->ۧ(I)Ll/ܰ۠ۖ;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v9, v10, v0, v2, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILl/ܰ۠ۖ;)V

    goto :goto_10

    :cond_26
    const/4 v2, -0x1

    .line 1690
    sget-object v3, Ll/ۖ᩹ۖ;->ۧۧ:Ll/ۖ᩹ۖ;

    if-ne v10, v3, :cond_27

    .line 1691
    new-instance v2, Ll/᩺۠ۖ;

    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ll/᩺۠ۖ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v10, v0, v2}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto :goto_10

    .line 1693
    :cond_27
    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v10, v0, v2, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILjava/lang/String;)V

    goto :goto_10

    .line 1684
    :cond_28
    invoke-direct {v8, v1}, Ll/ۢ᩹ۖ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v10, v0, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto :goto_10

    :pswitch_11
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move-object/from16 v22, v6

    add-int/lit8 v5, v5, 0x1

    .line 418
    aget-byte v0, v7, v5

    and-int/lit16 v1, v0, 0xff

    and-int/lit8 v0, v0, 0xf

    shr-int/lit8 v1, v1, 0x4

    .line 1561
    invoke-virtual {v9, v10, v0, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;II)V

    goto :goto_10

    :pswitch_12
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move-object/from16 v22, v6

    add-int/lit8 v5, v5, 0x1

    .line 1557
    aget-byte v0, v7, v5

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {v9, v10, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;I)V

    goto :goto_10

    :pswitch_13
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move-object/from16 v22, v6

    .line 1553
    invoke-virtual {v9, v10}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;)V

    :cond_29
    :goto_10
    move v15, v4

    goto/16 :goto_18

    :pswitch_14
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move-object/from16 v22, v6

    add-int/lit8 v0, v5, 0x2

    .line 1610
    invoke-static {v0, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v0

    add-int/2addr v0, v4

    add-int/lit8 v5, v5, 0x1

    .line 418
    aget-byte v1, v7, v5

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x2

    mul-int/lit8 v0, v0, 0x2

    .line 1613
    sget-object v3, Ll/ۖ᩹ۖ;->۬ۧ:Ll/ۖ᩹ۖ;

    if-ne v10, v3, :cond_31

    add-int/lit8 v3, v0, 0x2

    .line 1614
    invoke-static {v3, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v3

    add-int/lit8 v5, v0, 0x4

    .line 410
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v5

    const/4 v6, 0x1

    if-eq v3, v6, :cond_30

    if-eq v3, v2, :cond_2e

    const/4 v2, 0x4

    if-eq v3, v2, :cond_2c

    const/16 v2, 0x8

    if-eq v3, v2, :cond_2a

    goto :goto_10

    .line 1640
    :cond_2a
    new-array v2, v5, [J

    const/4 v3, 0x0

    :goto_11
    if-ge v3, v5, :cond_2b

    add-int/lit8 v6, v0, 0x8

    mul-int/lit8 v11, v3, 0x8

    add-int/2addr v11, v6

    .line 1644
    invoke-static {v11, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v6

    int-to-long v13, v6

    add-int/lit8 v6, v11, 0x2

    .line 1645
    invoke-static {v6, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v6

    move v15, v4

    move/from16 v19, v5

    int-to-long v4, v6

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v4, v13

    add-int/lit8 v13, v11, 0x4

    .line 1646
    invoke-static {v13, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v13

    int-to-long v13, v13

    const/16 v20, 0x20

    shl-long v13, v13, v20

    or-long/2addr v4, v13

    add-int/lit8 v11, v11, 0x6

    .line 1647
    invoke-static {v11, v7}, Ll/ۢ᩹ۖ;->ܽ(I[B)I

    move-result v11

    int-to-long v13, v11

    const/16 v11, 0x30

    shl-long/2addr v13, v11

    or-long/2addr v4, v13

    .line 1648
    aput-wide v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    move v4, v15

    move/from16 v5, v19

    goto :goto_11

    :cond_2b
    move v15, v4

    .line 1650
    invoke-virtual {v9, v10, v1, v2}, Ll/ᩳ᩸ۖ;->ۧ(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_18

    :cond_2c
    move v15, v4

    move v2, v5

    .line 1632
    new-array v3, v2, [I

    const/4 v4, 0x0

    :goto_12
    if-ge v4, v2, :cond_2d

    add-int/lit8 v5, v0, 0x8

    mul-int/lit8 v6, v4, 0x4

    add-int/2addr v6, v5

    .line 1634
    invoke-static {v6, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v5

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    .line 1636
    :cond_2d
    invoke-virtual {v9, v10, v1, v3}, Ll/ᩳ᩸ۖ;->ۧ(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_18

    :cond_2e
    move v15, v4

    move v2, v5

    .line 1624
    new-array v3, v2, [S

    const/4 v4, 0x0

    :goto_13
    if-ge v4, v2, :cond_2f

    add-int/lit8 v5, v0, 0x8

    mul-int/lit8 v6, v4, 0x2

    add-int/2addr v6, v5

    .line 1626
    invoke-static {v6, v7}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v5

    int-to-short v5, v5

    aput-short v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_13

    .line 1628
    :cond_2f
    invoke-virtual {v9, v10, v1, v3}, Ll/ᩳ᩸ۖ;->ۧ(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_18

    :cond_30
    move v15, v4

    move v2, v5

    .line 1618
    new-array v3, v2, [B

    add-int/lit8 v0, v0, 0x8

    const/4 v4, 0x0

    .line 1619
    invoke-static {v7, v0, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1620
    invoke-virtual {v9, v10, v1, v3}, Ll/ᩳ᩸ۖ;->ۧ(Ll/ۖ᩹ۖ;ILjava/lang/Object;)V

    goto/16 :goto_18

    :cond_31
    move v15, v4

    .line 1654
    sget-object v2, Ll/ۖ᩹ۖ;->᩸ܳ:Ll/ۖ᩹ۖ;

    if-ne v10, v2, :cond_34

    add-int/lit8 v2, v0, 0x2

    .line 1655
    invoke-static {v2, v7}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v2

    .line 1656
    new-array v3, v2, [I

    .line 1657
    new-array v4, v2, [Ll/ۨ۠ۖ;

    add-int/lit8 v0, v0, 0x4

    const/4 v5, 0x0

    :goto_14
    if-ge v5, v2, :cond_32

    mul-int/lit8 v6, v5, 0x4

    add-int/2addr v6, v0

    .line 1660
    invoke-static {v6, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v6

    aput v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_14

    :cond_32
    mul-int/lit8 v5, v2, 0x4

    add-int/2addr v5, v0

    const/4 v0, 0x0

    :goto_15
    if-ge v0, v2, :cond_33

    mul-int/lit8 v6, v0, 0x4

    add-int/2addr v6, v5

    .line 1664
    invoke-static {v6, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v6

    add-int/2addr v6, v15

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v12, v6}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۨ۠ۖ;

    aput-object v6, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_15

    .line 1666
    :cond_33
    invoke-virtual {v9, v10, v1, v3, v4}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;I[I[Ll/ۨ۠ۖ;)V

    goto/16 :goto_18

    :cond_34
    add-int/lit8 v2, v0, 0x2

    .line 1668
    invoke-static {v2, v7}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v2

    add-int/lit8 v3, v0, 0x4

    .line 1669
    invoke-static {v3, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v3

    .line 1670
    new-array v4, v2, [Ll/ۨ۠ۖ;

    add-int/lit8 v0, v0, 0x8

    const/4 v5, 0x0

    :goto_16
    if-ge v5, v2, :cond_35

    .line 1673
    invoke-static {v0, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v6

    add-int/2addr v6, v15

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v12, v6}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۨ۠ۖ;

    aput-object v6, v4, v5

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v5, v5, 0x1

    goto :goto_16

    .line 1676
    :cond_35
    invoke-virtual {v9, v10, v1, v3, v4}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;II[Ll/ۨ۠ۖ;)V

    goto/16 :goto_18

    :pswitch_15
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move v15, v4

    move-object/from16 v22, v6

    add-int/lit8 v5, v5, 0x2

    .line 1606
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->֫(I[B)I

    move-result v0

    add-int/2addr v0, v15

    .line 1607
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۠ۖ;

    const/4 v1, -0x1

    invoke-virtual {v9, v10, v1, v1, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILl/ۨ۠ۖ;)V

    goto/16 :goto_18

    :pswitch_16
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move v15, v4

    move-object/from16 v22, v6

    add-int/lit8 v0, v5, 0x2

    .line 1577
    invoke-static {v0, v7}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v0

    add-int/2addr v0, v15

    add-int/lit8 v5, v5, 0x1

    .line 418
    aget-byte v1, v7, v5

    and-int/lit16 v2, v1, 0xff

    and-int/lit8 v1, v1, 0xf

    shr-int/lit8 v2, v2, 0x4

    if-ne v1, v2, :cond_36

    .line 1583
    sget-object v3, Ll/ܳ᩹ۖ;->ܽ:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_1

    goto :goto_17

    .line 1588
    :pswitch_17
    sget-object v1, Ll/ۖ᩹ۖ;->ۨۧ:Ll/ۖ᩹ۖ;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۠ۖ;

    const/4 v2, 0x0

    invoke-virtual {v9, v1, v2, v2, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILl/ۨ۠ۖ;)V

    goto/16 :goto_18

    .line 1602
    :cond_36
    :goto_17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v10, v1, v2, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILl/ۨ۠ۖ;)V

    goto/16 :goto_18

    :pswitch_18
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move v15, v4

    move-object/from16 v22, v6

    add-int/lit8 v0, v5, 0x2

    .line 1573
    invoke-static {v0, v7}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v0

    add-int/2addr v0, v15

    add-int/lit8 v5, v5, 0x1

    .line 418
    aget-byte v1, v7, v5

    and-int/lit16 v1, v1, 0xff

    .line 1574
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۠ۖ;

    const/4 v2, -0x1

    invoke-virtual {v9, v10, v1, v2, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILl/ۨ۠ۖ;)V

    goto :goto_18

    :pswitch_19
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move v15, v4

    move-object/from16 v22, v6

    const/4 v0, -0x1

    add-int/lit8 v5, v5, 0x2

    .line 1569
    invoke-static {v5, v7}, Ll/ۢ᩹ۖ;->ۧ(I[B)I

    move-result v1

    add-int/2addr v1, v15

    .line 1570
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v10, v0, v0, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILl/ۨ۠ۖ;)V

    goto :goto_18

    :pswitch_1a
    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 p5, v2

    move-object/from16 v17, v3

    move v15, v4

    move-object/from16 v22, v6

    const/4 v0, -0x1

    add-int/lit8 v5, v5, 0x1

    .line 1565
    aget-byte v1, v7, v5

    add-int/2addr v1, v15

    .line 1566
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v10, v0, v0, v1}, Ll/ᩳ᩸ۖ;->֫(Ll/ۖ᩹ۖ;IILl/ۨ۠ۖ;)V

    :goto_18
    :pswitch_1b
    add-int/lit8 v4, v15, 0x1

    move-object/from16 v1, v22

    .line 1526
    invoke-virtual {v1, v4}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v4

    move-object/from16 v2, p5

    move-object v6, v1

    move-object/from16 v1, v16

    move-object/from16 v3, v17

    move-object/from16 v0, v18

    goto/16 :goto_7

    :cond_37
    move-object/from16 v18, v0

    :goto_19
    if-eqz v2, :cond_38

    .line 1879
    invoke-virtual {v12, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ۠ۖ;

    invoke-virtual {v9, v0}, Ll/ᩳ᩸ۖ;->֫(Ll/ۨ۠ۖ;)V

    .line 1880
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_38

    .line 1881
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    goto :goto_19

    :cond_38
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
    .end packed-switch
.end method

.method public final ֫(Ll/᩵᩹ۖ;I)V
    .locals 6

    .line 655
    iget v0, p0, Ll/ۢ᩹ۖ;->ܺ:I

    invoke-virtual {p1, v0}, Ll/᩵᩹ۖ;->֫(I)V

    .line 656
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Ll/ۢ᩹ۖ;->᩷:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    mul-int/lit8 v4, v3, 0x20

    .line 658
    iget-object v5, p0, Ll/ۢ᩹ۖ;->ۜ:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 659
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    invoke-direct {p0, v4}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v4

    .line 660
    new-instance v5, Ll/᩷᩹ۖ;

    invoke-direct {v5, v4, v3}, Ll/᩷᩹ۖ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 662
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    :goto_1
    if-ge v2, v1, :cond_1

    .line 664
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷᩹ۖ;

    .line 665
    iget v3, v3, Ll/᩷᩹ۖ;->᩸:I

    invoke-virtual {p0, p1, v3, p2}, Ll/ۢ᩹ۖ;->֫(Ll/᩵᩹ۖ;II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 667
    :cond_1
    invoke-virtual {p1}, Ll/᩵᩹ۖ;->֫()V

    return-void
.end method

.method public final ֫(Ll/᩵᩹ۖ;II)V
    .locals 11

    mul-int/lit8 p2, p2, 0x20

    .line 699
    iget-object v0, p0, Ll/ۢ᩹ۖ;->ۜ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 700
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    .line 701
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 702
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 703
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 704
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6

    .line 705
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v7

    .line 706
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    .line 707
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    .line 709
    invoke-direct {p0, p2}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v0

    .line 711
    invoke-direct {p0, v2}, Ll/ۢ᩹ۖ;->᩻(I)Ljava/lang/String;

    move-result-object v2

    .line 712
    invoke-direct {p0, v3}, Ll/ۢ᩹ۖ;->ۜ(I)[Ljava/lang/String;

    move-result-object v3

    .line 714
    :try_start_0
    invoke-virtual {p1, v0, v2, v3, v1}, Ll/᩵᩹ۖ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/ܽ᩸ۖ;

    move-result-object v5

    if-eqz v5, :cond_0

    move-object v4, p0

    move v10, p3

    .line 717
    invoke-direct/range {v4 .. v10}, Ll/ۢ᩹ۖ;->֫(Ll/ܽ᩸ۖ;IIIII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    .line 721
    :goto_0
    new-instance v1, Ll/ۛ۠ۖ;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 p2, 0x1

    aput-object v0, v2, p2

    const-string p2, "Error process class: [%d]%s"

    invoke-direct {v1, p1, p2, v2}, Ll/ۛ۠ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    and-int/lit8 p1, p3, 0x20

    if-eqz p1, :cond_1

    .line 723
    invoke-static {v3, v1}, Ll/ۢ᩹ۖ;->֫(ILjava/lang/Throwable;)V

    return-void

    .line 725
    :cond_1
    throw v1
.end method

.method public final ۧ()I
    .locals 1

    .line 619
    iget v0, p0, Ll/ۢ᩹ۖ;->ܺ:I

    return v0
.end method
