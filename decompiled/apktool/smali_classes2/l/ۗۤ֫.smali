.class public final Ll/ۗۤ֫;
.super Ljava/lang/Object;
.source "48KN"


# static fields
.field public static final ܿ:[B

.field public static final ᩳ:[B


# instance fields
.field public ֫:I

.field public ۧ:Ljava/nio/ByteBuffer;

.field public ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [B

    .line 42
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗۤ֫;->ܿ:[B

    const/16 v0, 0x2c

    new-array v0, v0, [B

    .line 47
    fill-array-data v0, :array_1

    sput-object v0, Ll/ۗۤ֫;->ᩳ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x4ft
        0x67t
        0x67t
        0x53t
        0x0t
        0x2t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x1ct
        -0x2bt
        -0x3bt
        -0x9t
        0x1t
        0x13t
        0x4ft
        0x70t
        0x75t
        0x73t
        0x48t
        0x65t
        0x61t
        0x64t
        0x1t
        0x2t
        0x38t
        0x1t
        -0x80t
        -0x45t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x4ft
        0x67t
        0x67t
        0x53t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
        0x0t
        0x0t
        0x0t
        0xbt
        -0x67t
        0x57t
        0x53t
        0x1t
        0x10t
        0x4ft
        0x70t
        0x75t
        0x73t
        0x54t
        0x61t
        0x67t
        0x73t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Ll/ۗۤ֫;->ۧ:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    .line 60
    iput v0, p0, Ll/ۗۤ֫;->֫:I

    const/4 v0, 0x2

    .line 61
    iput v0, p0, Ll/ۗۤ֫;->ܽ:I

    return-void
.end method

.method public static ֫(Ljava/nio/ByteBuffer;JIIZ)V
    .locals 1

    const/16 v0, 0x4f

    .line 248
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/16 v0, 0x67

    .line 249
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 250
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/16 v0, 0x53

    .line 251
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    .line 254
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    if-eqz p5, :cond_0

    const/4 p5, 0x2

    goto :goto_0

    :cond_0
    const/4 p5, 0x0

    .line 257
    :goto_0
    invoke-virtual {p0, p5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 260
    invoke-virtual {p0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 263
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 266
    invoke-virtual {p0, p3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 270
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    int-to-long p1, p4

    .line 273
    invoke-static {p1, p2}, Ll/ۨ᩺ܺ;->֫(J)B

    move-result p1

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 95
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Ll/ۗۤ֫;->ۧ:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    .line 96
    iput v0, p0, Ll/ۗۤ֫;->֫:I

    const/4 v0, 0x2

    .line 97
    iput v0, p0, Ll/ۗۤ֫;->ܽ:I

    return-void
.end method

.method public final ֫(Ll/᩸᩸֫;Ljava/util/List;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 76
    iget-object v2, v1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    iget-object v2, v1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    iget-object v3, v1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v3

    sub-int/2addr v2, v3

    if-nez v2, :cond_0

    return-void

    .line 83
    :cond_0
    iget v2, v0, Ll/ۗۤ֫;->ܽ:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-ne v2, v5, :cond_2

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v2, v4, :cond_1

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x3

    if-ne v2, v4, :cond_2

    :cond_1
    move-object/from16 v2, p2

    .line 84
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 86
    :goto_0
    iget-object v4, v1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 115
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v6

    .line 116
    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    move-result v7

    sub-int v8, v7, v6

    add-int/lit16 v9, v8, 0xff

    const/16 v10, 0xff

    .line 120
    div-int/2addr v9, v10

    add-int/lit8 v11, v9, 0x1b

    add-int/2addr v11, v8

    .line 128
    iget v12, v0, Ll/ۗۤ֫;->ܽ:I

    if-ne v12, v5, :cond_4

    if-eqz v2, :cond_3

    .line 131
    array-length v12, v2

    add-int/lit8 v12, v12, 0x1c

    goto :goto_1

    :cond_3
    const/16 v12, 0x2f

    :goto_1
    add-int/lit8 v13, v12, 0x2c

    add-int/2addr v11, v13

    move/from16 v17, v12

    goto :goto_2

    :cond_4
    const/4 v12, 0x0

    const/16 v17, 0x0

    .line 282
    :goto_2
    iget-object v12, v0, Ll/ۗۤ֫;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v12}, Ljava/nio/Buffer;->capacity()I

    move-result v12

    if-ge v12, v11, :cond_5

    .line 283
    invoke-static {v11}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v11

    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v11

    iput-object v11, v0, Ll/ۗۤ֫;->ۧ:Ljava/nio/ByteBuffer;

    goto :goto_3

    .line 285
    :cond_5
    iget-object v11, v0, Ll/ۗۤ֫;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 287
    :goto_3
    iget-object v15, v0, Ll/ۗۤ֫;->ۧ:Ljava/nio/ByteBuffer;

    .line 140
    iget v11, v0, Ll/ۗۤ֫;->ܽ:I

    const/16 v12, 0x16

    if-ne v11, v5, :cond_7

    if-eqz v2, :cond_6

    const/16 v22, 0x1

    const/16 v23, 0x1

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v15

    .line 213
    invoke-static/range {v18 .. v23}, Ll/ۗۤ֫;->֫(Ljava/nio/ByteBuffer;JIIZ)V

    .line 219
    array-length v5, v2

    int-to-long v13, v5

    invoke-static {v13, v14}, Ll/ۨ᩺ܺ;->֫(J)B

    move-result v5

    invoke-virtual {v15, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 220
    invoke-virtual {v15, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 223
    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    .line 224
    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v11

    array-length v13, v2

    add-int/lit8 v13, v13, 0x1c

    .line 222
    invoke-static {v11, v5, v13, v3}, Ll/ۘ֨֫;->֫(I[BII)I

    move-result v5

    .line 227
    invoke-virtual {v15, v12, v5}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 228
    array-length v2, v2

    add-int/lit8 v2, v2, 0x1c

    invoke-virtual {v15, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_4

    .line 145
    :cond_6
    sget-object v2, Ll/ۗۤ֫;->ܿ:[B

    invoke-virtual {v15, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 147
    :goto_4
    sget-object v2, Ll/ۗۤ֫;->ᩳ:[B

    invoke-virtual {v15, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 151
    :cond_7
    invoke-static {v4}, Ll/ۘ۫ۡ;->ۧ(Ljava/nio/ByteBuffer;)I

    move-result v2

    .line 152
    iget v5, v0, Ll/ۗۤ֫;->֫:I

    add-int/2addr v5, v2

    iput v5, v0, Ll/ۗۤ֫;->֫:I

    int-to-long v12, v5

    .line 154
    iget v14, v0, Ll/ۗۤ֫;->ܽ:I

    const/16 v16, 0x0

    const/16 v2, 0x16

    move-object v11, v15

    move-object v5, v15

    move v15, v9

    invoke-static/range {v11 .. v16}, Ll/ۗۤ֫;->֫(Ljava/nio/ByteBuffer;JIIZ)V

    const/4 v11, 0x0

    :goto_5
    if-ge v11, v9, :cond_9

    if-lt v8, v10, :cond_8

    const/4 v12, -0x1

    .line 161
    invoke-virtual {v5, v12}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit16 v8, v8, -0xff

    goto :goto_6

    :cond_8
    int-to-byte v8, v8

    .line 164
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/4 v8, 0x0

    :goto_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_9
    :goto_7
    if-ge v6, v7, :cond_a

    .line 171
    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    .line 174
    :cond_a
    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    move-result v6

    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 175
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 178
    iget v4, v0, Ll/ۗۤ֫;->ܽ:I

    const/4 v6, 0x2

    if-ne v4, v6, :cond_b

    .line 181
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    .line 182
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v4

    add-int v4, v4, v17

    add-int/lit8 v4, v4, 0x2c

    .line 185
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v6

    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v7

    sub-int/2addr v6, v7

    .line 180
    invoke-static {v4, v2, v6, v3}, Ll/ۘ֨֫;->֫(I[BII)I

    move-result v2

    add-int/lit8 v3, v17, 0x42

    .line 187
    invoke-virtual {v5, v3, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    goto :goto_8

    .line 192
    :cond_b
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    .line 193
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v6

    .line 194
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v7

    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v8

    sub-int/2addr v7, v8

    .line 191
    invoke-static {v6, v4, v7, v3}, Ll/ۘ֨֫;->֫(I[BII)I

    move-result v3

    .line 196
    invoke-virtual {v5, v2, v3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 200
    :goto_8
    iget v2, v0, Ll/ۗۤ֫;->ܽ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Ll/ۗۤ֫;->ܽ:I

    .line 86
    iput-object v5, v0, Ll/ۗۤ֫;->ۧ:Ljava/nio/ByteBuffer;

    .line 87
    invoke-virtual/range {p1 .. p1}, Ll/᩸᩸֫;->ۧ()V

    .line 88
    iget-object v2, v0, Ll/ۗۤ֫;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/᩸᩸֫;->ܳ(I)V

    .line 89
    iget-object v2, v1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    iget-object v3, v0, Ll/ۗۤ֫;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 90
    invoke-virtual/range {p1 .. p1}, Ll/᩸᩸֫;->ᩴ()V

    return-void
.end method
