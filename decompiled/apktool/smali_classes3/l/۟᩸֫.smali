.class public final Ll/۟᩸֫;
.super Ljava/lang/Object;
.source "H77X"


# static fields
.field public static final ۖ:[I

.field public static final ۘ:[I

.field public static final ۜ:[I

.field public static final ۡ:[I

.field public static final ۢ:[I

.field public static final ܺ:[I

.field public static final ᩷:[I

.field public static final ᩻:[I


# instance fields
.field public final ֫:I

.field public ۧ:J

.field public ܳ:J

.field public ܽ:Ljava/nio/ByteBuffer;

.field public ܿ:I

.field public ᩳ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xf

    new-array v1, v0, [I

    .line 30
    fill-array-data v1, :array_0

    sput-object v1, Ll/۟᩸֫;->᩻:[I

    new-array v1, v0, [I

    .line 32
    fill-array-data v1, :array_1

    sput-object v1, Ll/۟᩸֫;->ۜ:[I

    new-array v1, v0, [I

    .line 34
    fill-array-data v1, :array_2

    sput-object v1, Ll/۟᩸֫;->᩷:[I

    new-array v1, v0, [I

    .line 36
    fill-array-data v1, :array_3

    sput-object v1, Ll/۟᩸֫;->ۡ:[I

    new-array v0, v0, [I

    .line 38
    fill-array-data v0, :array_4

    sput-object v0, Ll/۟᩸֫;->ۢ:[I

    const v0, 0xbb80

    const/16 v1, 0x7d00

    const v2, 0xac44

    .line 41
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/۟᩸֫;->ܺ:[I

    const/16 v0, 0x5dc0

    const/16 v1, 0x3e80

    const/16 v2, 0x5622

    .line 42
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/۟᩸֫;->ۖ:[I

    const/16 v0, 0x2ee0

    const/16 v1, 0x1f40

    const/16 v2, 0x2b11

    .line 43
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/۟᩸֫;->ۘ:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0x20
        0x40
        0x60
        0x80
        0xa0
        0xc0
        0xe0
        0x100
        0x120
        0x140
        0x160
        0x180
        0x1a0
        0x1c0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x20
        0x30
        0x38
        0x40
        0x50
        0x60
        0x70
        0x80
        0xa0
        0xc0
        0xe0
        0x100
        0x140
        0x180
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x20
        0x28
        0x30
        0x38
        0x40
        0x50
        0x60
        0x70
        0x80
        0xa0
        0xc0
        0xe0
        0x100
        0x140
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x20
        0x30
        0x38
        0x40
        0x50
        0x60
        0x70
        0x80
        0x90
        0xa0
        0xb0
        0xc0
        0xe0
        0x100
    .end array-data

    :array_4
    .array-data 4
        0x0
        0x8
        0x10
        0x18
        0x20
        0x28
        0x30
        0x38
        0x40
        0x50
        0x60
        0x70
        0x80
        0x90
        0xa0
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    .line 46
    iput-object v0, p0, Ll/۟᩸֫;->ᩳ:[B

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    iput-wide v0, p0, Ll/۟᩸֫;->ܳ:J

    .line 49
    iput-wide v0, p0, Ll/۟᩸֫;->ۧ:J

    const/4 v0, 0x0

    .line 50
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    .line 59
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/۟᩸֫;->֫:I

    return-void
.end method

.method public static ֫(I[B)Ll/ܰ᩸֫;
    .locals 7

    .line 197
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    const/4 v1, 0x3

    add-int/2addr p0, v1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    const/high16 p1, -0x200000

    and-int v0, p0, p1

    if-eq v0, p1, :cond_0

    goto/16 :goto_3

    :cond_0
    ushr-int/lit8 p1, p0, 0x13

    and-int/2addr p1, v1

    ushr-int/lit8 v0, p0, 0x11

    and-int/2addr v0, v1

    ushr-int/lit8 v2, p0, 0xc

    const/16 v3, 0xf

    and-int/2addr v2, v3

    ushr-int/lit8 v4, p0, 0xa

    and-int/2addr v4, v1

    ushr-int/lit8 p0, p0, 0x9

    const/4 v5, 0x1

    and-int/2addr p0, v5

    if-eq p1, v5, :cond_b

    if-eqz v0, :cond_b

    if-eqz v2, :cond_b

    if-eq v2, v3, :cond_b

    if-ne v4, v1, :cond_1

    goto :goto_3

    :cond_1
    const/4 v3, 0x2

    if-ne p1, v1, :cond_4

    if-ne v0, v1, :cond_2

    .line 239
    sget-object v6, Ll/۟᩸֫;->᩻:[I

    aget v2, v6, v2

    goto :goto_0

    :cond_2
    if-ne v0, v3, :cond_3

    .line 241
    sget-object v6, Ll/۟᩸֫;->ۜ:[I

    aget v2, v6, v2

    goto :goto_0

    .line 243
    :cond_3
    sget-object v6, Ll/۟᩸֫;->᩷:[I

    aget v2, v6, v2

    goto :goto_0

    :cond_4
    if-ne v0, v1, :cond_5

    .line 246
    sget-object v6, Ll/۟᩸֫;->ۡ:[I

    aget v2, v6, v2

    goto :goto_0

    :cond_5
    sget-object v6, Ll/۟᩸֫;->ۢ:[I

    aget v2, v6, v2

    :goto_0
    if-ne p1, v1, :cond_6

    .line 251
    sget-object v3, Ll/۟᩸֫;->ܺ:[I

    aget v3, v3, v4

    goto :goto_1

    :cond_6
    if-ne p1, v3, :cond_7

    .line 253
    sget-object v3, Ll/۟᩸֫;->ۖ:[I

    aget v3, v3, v4

    goto :goto_1

    .line 255
    :cond_7
    sget-object v3, Ll/۟᩸֫;->ۘ:[I

    aget v3, v3, v4

    :goto_1
    const/4 v4, 0x4

    if-ne v0, v1, :cond_8

    mul-int/lit16 v2, v2, 0x2ee0

    .line 221
    div-int/2addr v2, v3

    add-int/2addr v2, p0

    mul-int/lit8 v2, v2, 0x4

    const/16 p0, 0x180

    goto :goto_2

    :cond_8
    if-ne v0, v5, :cond_9

    if-eq p1, v1, :cond_9

    const p1, 0x11940

    .line 0
    invoke-static {v2, p1, v3, p0}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v2

    const/16 p0, 0x240

    goto :goto_2

    :cond_9
    const p1, 0x23280

    invoke-static {v2, p1, v3, p0}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v2

    const/16 p0, 0x480

    :goto_2
    if-gt v2, v4, :cond_a

    goto :goto_3

    .line 233
    :cond_a
    new-instance p1, Ll/ܰ᩸֫;

    invoke-direct {p1, v2, v3, p0}, Ll/ܰ᩸֫;-><init>(III)V

    return-object p1

    :cond_b
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫(J)J
    .locals 5

    .line 124
    iget-wide v0, p0, Ll/۟᩸֫;->ۧ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide p1

    :cond_0
    return-wide v0
.end method

.method public final ֫(JLjava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 73
    iput-wide v1, v0, Ll/۟᩸֫;->ۧ:J

    .line 74
    iget v3, v0, Ll/۟᩸֫;->ܿ:I

    if-nez v3, :cond_0

    .line 75
    iput-wide v1, v0, Ll/۟᩸֫;->ܳ:J

    .line 128
    :cond_0
    invoke-virtual/range {p3 .. p3}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v3

    const/4 v4, 0x0

    .line 129
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 130
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    .line 131
    iget v6, v0, Ll/۟᩸֫;->ܿ:I

    add-int/2addr v6, v5

    .line 137
    iget-object v7, v0, Ll/۟᩸֫;->ᩳ:[B

    array-length v8, v7

    if-lt v8, v6, :cond_1

    goto :goto_1

    .line 140
    :cond_1
    array-length v7, v7

    :goto_0
    if-ge v7, v6, :cond_2

    mul-int/lit8 v7, v7, 0x2

    goto :goto_0

    .line 144
    :cond_2
    iget-object v6, v0, Ll/۟᩸֫;->ᩳ:[B

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v6

    iput-object v6, v0, Ll/۟᩸֫;->ᩳ:[B

    .line 132
    :goto_1
    iget-object v6, v0, Ll/۟᩸֫;->ᩳ:[B

    iget v7, v0, Ll/۟᩸֫;->ܿ:I

    invoke-virtual {v3, v6, v7, v5}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 133
    iget v3, v0, Ll/۟᩸֫;->ܿ:I

    add-int/2addr v3, v5

    iput v3, v0, Ll/۟᩸֫;->ܿ:I

    .line 83
    iget-wide v5, v0, Ll/۟᩸֫;->ܳ:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v9, v5, v7

    if-eqz v9, :cond_3

    move-wide v1, v5

    .line 148
    :cond_3
    iget v5, v0, Ll/۟᩸֫;->֫:I

    add-int/2addr v3, v5

    .line 149
    iget-object v6, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v6}, Ljava/nio/Buffer;->capacity()I

    move-result v6

    if-lt v6, v3, :cond_4

    goto :goto_2

    .line 152
    :cond_4
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    iput-object v3, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    .line 86
    :goto_2
    iget-object v3, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    const-wide/16 v6, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_3
    add-int/lit8 v11, v3, 0x4

    .line 88
    iget v12, v0, Ll/۟᩸֫;->ܿ:I

    if-gt v11, v12, :cond_b

    .line 89
    iget-object v11, v0, Ll/۟᩸֫;->ᩳ:[B

    invoke-static {v3, v11}, Ll/۟᩸֫;->֫(I[B)Ll/ܰ᩸֫;

    move-result-object v11

    if-eqz v11, :cond_a

    .line 90
    iget v12, v11, Ll/ܰ᩸֫;->֫:I

    add-int v13, v3, v12

    .line 185
    iget v14, v0, Ll/۟᩸֫;->ܿ:I

    if-le v13, v14, :cond_5

    goto :goto_4

    :cond_5
    if-eq v13, v14, :cond_7

    add-int/lit8 v15, v13, 0x4

    if-le v15, v14, :cond_6

    goto :goto_4

    .line 192
    :cond_6
    iget-object v14, v0, Ll/۟᩸֫;->ᩳ:[B

    invoke-static {v13, v14}, Ll/۟᩸֫;->֫(I[B)Ll/ܰ᩸֫;

    move-result-object v14

    if-eqz v14, :cond_a

    .line 94
    :cond_7
    :goto_4
    iget v14, v0, Ll/۟᩸֫;->ܿ:I

    if-le v13, v14, :cond_8

    goto :goto_5

    :cond_8
    if-nez v8, :cond_9

    add-long/2addr v1, v6

    const/4 v8, 0x1

    .line 101
    :cond_9
    iget-object v10, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    iget-object v14, v0, Ll/۟᩸֫;->ᩳ:[B

    invoke-virtual {v10, v14, v3, v12}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    add-int/2addr v9, v12

    .line 104
    iget v3, v11, Ll/ܰ᩸֫;->ܽ:I

    int-to-long v14, v3

    const-wide/32 v16, 0xf4240

    mul-long v14, v14, v16

    iget v3, v11, Ll/ܰ᩸֫;->ۧ:I

    int-to-long v10, v3

    div-long/2addr v14, v10

    add-long/2addr v6, v14

    move v3, v13

    move v10, v3

    goto :goto_3

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_b
    :goto_5
    if-nez v9, :cond_10

    if-gtz v3, :cond_c

    goto :goto_6

    .line 173
    :cond_c
    iget v1, v0, Ll/۟᩸֫;->ܿ:I

    sub-int/2addr v1, v3

    if-lez v1, :cond_d

    .line 175
    iget-object v2, v0, Ll/۟᩸֫;->ᩳ:[B

    invoke-static {v2, v3, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 177
    :cond_d
    iput v1, v0, Ll/۟᩸֫;->ܿ:I

    if-nez v1, :cond_e

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 179
    iput-wide v1, v0, Ll/۟᩸֫;->ܳ:J

    .line 149
    :cond_e
    :goto_6
    iget-object v1, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    if-lt v1, v5, :cond_f

    goto :goto_7

    .line 152
    :cond_f
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    .line 157
    :goto_7
    iget-object v1, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 158
    iget-object v1, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 159
    iget-object v1, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    return-object v1

    .line 113
    :cond_10
    iput-wide v1, v0, Ll/۟᩸֫;->ۧ:J

    .line 163
    iget-object v3, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    add-int/2addr v5, v9

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    move v5, v9

    :goto_8
    if-ge v5, v3, :cond_11

    .line 165
    iget-object v8, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v8, v5, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    .line 115
    :cond_11
    iget-object v3, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 116
    iget-object v3, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    if-gtz v10, :cond_12

    goto :goto_9

    .line 173
    :cond_12
    iget v3, v0, Ll/۟᩸֫;->ܿ:I

    sub-int/2addr v3, v10

    if-lez v3, :cond_13

    .line 175
    iget-object v5, v0, Ll/۟᩸֫;->ᩳ:[B

    invoke-static {v5, v10, v5, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 177
    :cond_13
    iput v3, v0, Ll/۟᩸֫;->ܿ:I

    if-nez v3, :cond_14

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 179
    iput-wide v3, v0, Ll/۟᩸֫;->ܳ:J

    goto :goto_a

    :cond_14
    :goto_9
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 118
    :goto_a
    iget v5, v0, Ll/۟᩸֫;->ܿ:I

    if-nez v5, :cond_15

    goto :goto_b

    :cond_15
    add-long v3, v1, v6

    :goto_b
    iput-wide v3, v0, Ll/۟᩸֫;->ܳ:J

    .line 119
    iget-object v1, v0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    return-object v1
.end method

.method public final ֫()V
    .locals 3

    const/4 v0, 0x0

    .line 64
    iput v0, p0, Ll/۟᩸֫;->ܿ:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    iput-wide v1, p0, Ll/۟᩸֫;->ܳ:J

    .line 66
    iput-wide v1, p0, Ll/۟᩸֫;->ۧ:J

    .line 67
    iget-object v1, p0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 68
    iget-object v1, p0, Ll/۟᩸֫;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-void
.end method
