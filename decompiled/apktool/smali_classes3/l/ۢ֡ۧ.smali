.class public final Ll/ۢ֡ۧ;
.super Ljava/lang/Object;
.source "X8NN"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public ֡:I

.field public ֫:I

.field public ۖ:I

.field public ۘ:I

.field public final ۜ:Ljava/lang/String;

.field public ۡ:J

.field public final ۢ:I

.field public final ۧ:Ljava/lang/String;

.field public ܳ:I

.field public ܺ:I

.field public ܽ:I

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ll/۠ᩴ֫;

.field public ᩴ:J

.field public final ᩵:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ᩷:Ll/᩵ۢۧ;

.field public final ᩻:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    new-instance v0, Ll/ᩳ֨֫;

    new-array p3, p3, [B

    invoke-direct {v0, p3}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object v0, p0, Ll/ۢ֡ۧ;->᩻:Ll/ᩳ֨֫;

    const/4 p3, 0x0

    .line 109
    iput p3, p0, Ll/ۢ֡ۧ;->ۖ:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 110
    iput-wide v0, p0, Ll/ۢ֡ۧ;->ᩴ:J

    .line 111
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p3, p0, Ll/ۢ֡ۧ;->᩵:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p3, -0x1

    .line 112
    iput p3, p0, Ll/ۢ֡ۧ;->ܽ:I

    .line 113
    iput p3, p0, Ll/ۢ֡ۧ;->֡:I

    .line 114
    iput-object p1, p0, Ll/ۢ֡ۧ;->ۜ:Ljava/lang/String;

    .line 115
    iput p2, p0, Ll/ۢ֡ۧ;->ۢ:I

    const-string p1, "video/mp2t"

    .line 116
    iput-object p1, p0, Ll/ۢ֡ۧ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method private ֫(Ll/֡᩷ۧ;)V
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 314
    iget v0, p1, Ll/֡᩷ۧ;->ܿ:I

    iget-object v1, p1, Ll/֡᩷ۧ;->ᩳ:Ljava/lang/String;

    iget p1, p1, Ll/֡᩷ۧ;->֫:I

    const v2, -0x7fffffff

    if-eq v0, v2, :cond_3

    const/4 v2, -0x1

    if-ne p1, v2, :cond_0

    goto :goto_1

    .line 317
    :cond_0
    iget-object v2, p0, Ll/ۢ֡ۧ;->ᩳ:Ll/۠ᩴ֫;

    if-eqz v2, :cond_1

    iget v3, v2, Ll/۠ᩴ֫;->ܿ:I

    if-ne p1, v3, :cond_1

    iget v3, v2, Ll/۠ᩴ֫;->ܽ֫:I

    if-ne v0, v3, :cond_1

    iget-object v2, v2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 320
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 321
    :cond_1
    iget-object v2, p0, Ll/ۢ֡ۧ;->ᩳ:Ll/۠ᩴ֫;

    if-nez v2, :cond_2

    new-instance v2, Ll/֨ᩴ֫;

    invoke-direct {v2}, Ll/֨ᩴ֫;-><init>()V

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v2

    .line 322
    :goto_0
    iget-object v3, p0, Ll/ۢ֡ۧ;->ܿ:Ljava/lang/String;

    .line 324
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۢ֡ۧ;->ۧ:Ljava/lang/String;

    .line 325
    invoke-virtual {v2, v3}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 326
    invoke-virtual {v2, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 327
    invoke-virtual {v2, p1}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 328
    invoke-virtual {v2, v0}, Ll/֨ᩴ֫;->۠(I)V

    iget-object p1, p0, Ll/ۢ֡ۧ;->ۜ:Ljava/lang/String;

    .line 329
    invoke-virtual {v2, p1}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget p1, p0, Ll/ۢ֡ۧ;->ۢ:I

    .line 330
    invoke-virtual {v2, p1}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 331
    invoke-virtual {v2}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ֡ۧ;->ᩳ:Ll/۠ᩴ֫;

    .line 332
    iget-object v0, p0, Ll/ۢ֡ۧ;->᩷:Ll/᩵ۢۧ;

    invoke-interface {v0, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private ֫(Ll/ᩳ֨֫;[BI)Z
    .locals 2

    .line 240
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    iget v1, p0, Ll/ۢ֡ۧ;->֫:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 241
    iget v1, p0, Ll/ۢ֡ۧ;->֫:I

    invoke-virtual {p1, v1, v0, p2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 242
    iget p1, p0, Ll/ۢ֡ۧ;->֫:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۢ֡ۧ;->֫:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    const/4 v0, 0x0

    .line 121
    iput v0, p0, Ll/ۢ֡ۧ;->ۖ:I

    .line 122
    iput v0, p0, Ll/ۢ֡ۧ;->֫:I

    .line 123
    iput v0, p0, Ll/ۢ֡ۧ;->ۘ:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 124
    iput-wide v1, p0, Ll/ۢ֡ۧ;->ᩴ:J

    .line 125
    iget-object v1, p0, Ll/ۢ֡ۧ;->᩵:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 137
    iput-wide p2, p0, Ll/ۢ֡ۧ;->ᩴ:J

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 142
    iget-object v2, v0, Ll/ۢ֡ۧ;->᩷:Ll/᩵ۢۧ;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 143
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    if-lez v2, :cond_1b

    .line 144
    iget v2, v0, Ll/ۢ֡ۧ;->ۖ:I

    const/4 v3, 0x7

    const/4 v4, 0x5

    const/4 v7, 0x2

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, 0x6

    const/4 v11, 0x3

    const/4 v12, 0x4

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/16 v15, 0x8

    iget-object v5, v0, Ll/ۢ֡ۧ;->᩻:Ll/ᩳ֨֫;

    packed-switch v2, :pswitch_data_0

    .line 220
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 203
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    iget v3, v0, Ll/ۢ֡ۧ;->ܺ:I

    iget v4, v0, Ll/ۢ֡ۧ;->֫:I

    sub-int/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 204
    iget-object v3, v0, Ll/ۢ֡ۧ;->᩷:Ll/᩵ۢۧ;

    invoke-interface {v3, v2, v1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 205
    iget v3, v0, Ll/ۢ֡ۧ;->֫:I

    add-int/2addr v3, v2

    iput v3, v0, Ll/ۢ֡ۧ;->֫:I

    .line 206
    iget v2, v0, Ll/ۢ֡ۧ;->ܺ:I

    if-ne v3, v2, :cond_0

    .line 208
    iget-wide v2, v0, Ll/ۢ֡ۧ;->ᩴ:J

    cmp-long v4, v2, v8

    if-eqz v4, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    .line 209
    iget-object v3, v0, Ll/ۢ֡ۧ;->᩷:Ll/᩵ۢۧ;

    iget-wide v4, v0, Ll/ۢ֡ۧ;->ᩴ:J

    .line 211
    iget v2, v0, Ll/ۢ֡ۧ;->ܳ:I

    if-ne v2, v12, :cond_2

    const/4 v2, 0x0

    const/4 v6, 0x0

    goto :goto_2

    :cond_2
    const/4 v2, 0x1

    const/4 v6, 0x1

    :goto_2
    iget v7, v0, Ll/ۢ֡ۧ;->ܺ:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 209
    invoke-interface/range {v3 .. v9}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 215
    iget-wide v2, v0, Ll/ۢ֡ۧ;->ᩴ:J

    iget-wide v4, v0, Ll/ۢ֡ۧ;->ۡ:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Ll/ۢ֡ۧ;->ᩴ:J

    .line 216
    iput v14, v0, Ll/ۢ֡ۧ;->ۖ:I

    goto :goto_0

    .line 195
    :pswitch_1
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    iget v3, v0, Ll/ۢ֡ۧ;->֡:I

    invoke-direct {v0, v1, v2, v3}, Ll/ۢ֡ۧ;->֫(Ll/ᩳ֨֫;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 303
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    iget-object v3, v0, Ll/ۢ֡ۧ;->᩵:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v2, v3}, Ll/ۚ᩷ۧ;->֫([BLjava/util/concurrent/atomic/AtomicInteger;)Ll/֡᩷ۧ;

    move-result-object v2

    .line 305
    iget v3, v0, Ll/ۢ֡ۧ;->ܳ:I

    if-ne v3, v11, :cond_3

    .line 306
    invoke-direct {v0, v2}, Ll/ۢ֡ۧ;->֫(Ll/֡᩷ۧ;)V

    .line 308
    :cond_3
    iget v3, v2, Ll/֡᩷ۧ;->ܽ:I

    iput v3, v0, Ll/ۢ֡ۧ;->ܺ:I

    .line 309
    iget-wide v2, v2, Ll/֡᩷ۧ;->ۧ:J

    cmp-long v4, v2, v8

    if-nez v4, :cond_4

    const-wide/16 v2, 0x0

    :cond_4
    iput-wide v2, v0, Ll/ۢ֡ۧ;->ۡ:J

    .line 197
    invoke-virtual {v5, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 198
    iget-object v2, v0, Ll/ۢ֡ۧ;->᩷:Ll/᩵ۢۧ;

    iget v3, v0, Ll/ۢ֡ۧ;->֡:I

    invoke-interface {v2, v3, v5}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 199
    iput v10, v0, Ll/ۢ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 183
    :pswitch_2
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-direct {v0, v1, v2, v10}, Ll/ۢ֡ۧ;->֫(Ll/ᩳ֨֫;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 184
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-static {v2}, Ll/ۚ᩷ۧ;->ᩳ([B)I

    move-result v2

    iput v2, v0, Ll/ۢ֡ۧ;->֡:I

    .line 186
    iget v3, v0, Ll/ۢ֡ۧ;->֫:I

    if-le v3, v2, :cond_5

    sub-int v2, v3, v2

    sub-int/2addr v3, v2

    .line 188
    iput v3, v0, Ll/ۢ֡ۧ;->֫:I

    .line 189
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {v1, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 191
    :cond_5
    iput v4, v0, Ll/ۢ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 174
    :pswitch_3
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    iget v3, v0, Ll/ۢ֡ۧ;->ܽ:I

    invoke-direct {v0, v1, v2, v3}, Ll/ۢ֡ۧ;->֫(Ll/ᩳ֨֫;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 293
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-static {v2}, Ll/ۚ᩷ۧ;->ۧ([B)Ll/֡᩷ۧ;

    move-result-object v2

    .line 294
    invoke-direct {v0, v2}, Ll/ۢ֡ۧ;->֫(Ll/֡᩷ۧ;)V

    .line 295
    iget v3, v2, Ll/֡᩷ۧ;->ܽ:I

    iput v3, v0, Ll/ۢ֡ۧ;->ܺ:I

    .line 296
    iget-wide v2, v2, Ll/֡᩷ۧ;->ۧ:J

    cmp-long v4, v2, v8

    if-nez v4, :cond_6

    const-wide/16 v2, 0x0

    :cond_6
    iput-wide v2, v0, Ll/ۢ֡ۧ;->ۡ:J

    .line 176
    invoke-virtual {v5, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 177
    iget-object v2, v0, Ll/ۢ֡ۧ;->᩷:Ll/᩵ۢۧ;

    iget v3, v0, Ll/ۢ֡ۧ;->ܽ:I

    invoke-interface {v2, v3, v5}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 178
    iput v10, v0, Ll/ۢ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 167
    :pswitch_4
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-direct {v0, v1, v2, v3}, Ll/ۢ֡ۧ;->֫(Ll/ᩳ֨֫;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 169
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-static {v2}, Ll/ۚ᩷ۧ;->ܽ([B)I

    move-result v2

    iput v2, v0, Ll/ۢ֡ۧ;->ܽ:I

    .line 170
    iput v11, v0, Ll/ۢ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 158
    :pswitch_5
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    const/16 v3, 0x12

    invoke-direct {v0, v1, v2, v3}, Ll/ۢ֡ۧ;->֫(Ll/ᩳ֨֫;[BI)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 275
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    .line 276
    iget-object v6, v0, Ll/ۢ֡ۧ;->ᩳ:Ll/۠ᩴ֫;

    if-nez v6, :cond_7

    .line 277
    iget-object v6, v0, Ll/ۢ֡ۧ;->ܿ:Ljava/lang/String;

    iget v8, v0, Ll/ۢ֡ۧ;->ۢ:I

    iget-object v9, v0, Ll/ۢ֡ۧ;->ۧ:Ljava/lang/String;

    const/16 v16, 0x7

    .line 278
    iget-object v3, v0, Ll/ۢ֡ۧ;->ۜ:Ljava/lang/String;

    invoke-static {v8, v6, v3, v9, v2}, Ll/ۚ᩷ۧ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Ll/۠ᩴ֫;

    move-result-object v3

    iput-object v3, v0, Ll/ۢ֡ۧ;->ᩳ:Ll/۠ᩴ֫;

    .line 279
    iget-object v6, v0, Ll/ۢ֡ۧ;->᩷:Ll/᩵ۢۧ;

    invoke-interface {v6, v3}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    goto :goto_3

    :cond_7
    const/16 v16, 0x7

    .line 375
    :goto_3
    aget-byte v3, v2, v14

    const/16 v6, 0x1f

    const/4 v8, -0x1

    const/4 v9, -0x2

    if-eq v3, v9, :cond_a

    if-eq v3, v8, :cond_9

    if-eq v3, v6, :cond_8

    .line 389
    aget-byte v4, v2, v4

    and-int/lit8 v4, v4, 0x3

    shl-int/lit8 v4, v4, 0xc

    const/4 v11, 0x5

    aget-byte v15, v2, v10

    and-int/lit16 v15, v15, 0xff

    shl-int/2addr v15, v12

    or-int/2addr v4, v15

    aget-byte v15, v2, v16

    goto :goto_5

    .line 377
    :cond_8
    aget-byte v17, v2, v10

    and-int/lit8 v11, v17, 0x3

    shl-int/lit8 v11, v11, 0xc

    aget-byte v4, v2, v16

    and-int/lit16 v4, v4, 0xff

    shl-int/2addr v4, v12

    or-int/2addr v4, v11

    aget-byte v11, v2, v15

    goto :goto_4

    :cond_9
    const/4 v4, 0x5

    .line 384
    aget-byte v15, v2, v16

    and-int/2addr v11, v15

    shl-int/lit8 v11, v11, 0xc

    aget-byte v15, v2, v10

    and-int/lit16 v15, v15, 0xff

    shl-int/2addr v15, v12

    or-int/2addr v11, v15

    const/16 v15, 0x9

    aget-byte v15, v2, v15

    move v4, v11

    move v11, v15

    :goto_4
    const/16 v17, 0x5

    and-int/lit8 v11, v11, 0x3c

    shr-int/2addr v11, v7

    or-int/2addr v4, v11

    add-int/2addr v4, v13

    const/4 v11, 0x1

    goto :goto_6

    :cond_a
    const/4 v4, 0x5

    .line 381
    aget-byte v15, v2, v12

    and-int/2addr v11, v15

    shl-int/lit8 v11, v11, 0xc

    aget-byte v15, v2, v16

    and-int/lit16 v15, v15, 0xff

    shl-int/2addr v15, v12

    or-int/2addr v11, v15

    aget-byte v15, v2, v10

    move v4, v11

    const/4 v11, 0x5

    :goto_5
    and-int/lit16 v15, v15, 0xf0

    shr-int/2addr v15, v12

    or-int/2addr v4, v15

    add-int/2addr v4, v13

    const/4 v15, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    :goto_6
    if-eqz v11, :cond_b

    mul-int/lit8 v4, v4, 0x10

    .line 393
    div-int/lit8 v4, v4, 0xe

    .line 281
    :cond_b
    iput v4, v0, Ll/ۢ֡ۧ;->ܺ:I

    if-eq v3, v9, :cond_e

    if-eq v3, v8, :cond_d

    if-eq v3, v6, :cond_c

    .line 322
    aget-byte v3, v2, v12

    and-int/2addr v3, v13

    shl-int/2addr v3, v10

    aget-byte v2, v2, v17

    goto :goto_8

    .line 318
    :cond_c
    aget-byte v3, v2, v17

    and-int/lit8 v3, v3, 0x7

    shl-int/2addr v3, v12

    aget-byte v2, v2, v10

    goto :goto_7

    .line 315
    :cond_d
    aget-byte v3, v2, v12

    and-int/lit8 v3, v3, 0x7

    shl-int/2addr v3, v12

    aget-byte v2, v2, v16

    :goto_7
    and-int/lit8 v2, v2, 0x3c

    goto :goto_9

    .line 312
    :cond_e
    aget-byte v3, v2, v17

    and-int/2addr v3, v13

    shl-int/2addr v3, v10

    aget-byte v2, v2, v12

    :goto_8
    and-int/lit16 v2, v2, 0xfc

    :goto_9
    shr-int/2addr v2, v7

    or-int/2addr v2, v3

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x20

    int-to-long v2, v2

    .line 287
    iget-object v4, v0, Ll/ۢ֡ۧ;->ᩳ:Ll/۠ᩴ֫;

    iget v4, v4, Ll/۠ᩴ֫;->ܽ֫:I

    .line 286
    invoke-static {v4, v2, v3}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v2

    .line 285
    invoke-static {v2, v3}, Ll/۬᩺ܺ;->֫(J)I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, v0, Ll/ۢ֡ۧ;->ۡ:J

    .line 160
    invoke-virtual {v5, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 161
    iget-object v2, v0, Ll/ۢ֡ۧ;->᩷:Ll/᩵ۢۧ;

    const/16 v3, 0x12

    invoke-interface {v2, v3, v5}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 162
    iput v10, v0, Ll/ۢ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 254
    :cond_f
    :pswitch_6
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    if-lez v2, :cond_0

    .line 255
    iget v2, v0, Ll/ۢ֡ۧ;->ۘ:I

    shl-int/lit8 v2, v2, 0x8

    iput v2, v0, Ll/ۢ֡ۧ;->ۘ:I

    .line 256
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    or-int/2addr v2, v3

    iput v2, v0, Ll/ۢ֡ۧ;->ۘ:I

    const v3, 0x7ffe8001

    if-eq v2, v3, :cond_17

    const v3, -0x180fe80

    if-eq v2, v3, :cond_17

    const v3, 0x1fffe800

    if-eq v2, v3, :cond_17

    const v3, -0xe0ff18

    if-ne v2, v3, :cond_10

    goto :goto_d

    :cond_10
    const v3, 0x64582025

    if-eq v2, v3, :cond_16

    const v3, 0x25205864

    if-ne v2, v3, :cond_11

    goto :goto_c

    :cond_11
    const v3, 0x40411bf2

    if-eq v2, v3, :cond_15

    const v3, -0xde4bec0

    if-ne v2, v3, :cond_12

    goto :goto_b

    :cond_12
    const v3, 0x71c442e8

    if-eq v2, v3, :cond_14

    const v3, -0x17bd3b8f

    if-ne v2, v3, :cond_13

    goto :goto_a

    :cond_13
    const/4 v2, 0x0

    goto :goto_e

    :cond_14
    :goto_a
    const/4 v2, 0x4

    goto :goto_e

    :cond_15
    :goto_b
    const/4 v2, 0x3

    goto :goto_e

    :cond_16
    :goto_c
    const/4 v2, 0x2

    goto :goto_e

    :cond_17
    :goto_d
    const/4 v2, 0x1

    .line 257
    :goto_e
    iput v2, v0, Ll/ۢ֡ۧ;->ܳ:I

    if-eqz v2, :cond_f

    .line 259
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    .line 260
    iget v3, v0, Ll/ۢ֡ۧ;->ۘ:I

    shr-int/lit8 v4, v3, 0x18

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v2, v14

    shr-int/lit8 v4, v3, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    .line 261
    aput-byte v4, v2, v13

    shr-int/lit8 v4, v3, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    .line 262
    aput-byte v4, v2, v7

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    .line 263
    aput-byte v3, v2, v11

    .line 264
    iput v12, v0, Ll/ۢ֡ۧ;->֫:I

    .line 265
    iput v14, v0, Ll/ۢ֡ۧ;->ۘ:I

    .line 147
    iget v2, v0, Ll/ۢ֡ۧ;->ܳ:I

    if-eq v2, v11, :cond_1a

    if-ne v2, v12, :cond_18

    goto :goto_f

    :cond_18
    if-ne v2, v13, :cond_19

    .line 151
    iput v13, v0, Ll/ۢ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 153
    :cond_19
    iput v7, v0, Ll/ۢ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 149
    :cond_1a
    :goto_f
    iput v12, v0, Ll/ۢ֡ۧ;->ۖ:I

    goto/16 :goto_0

    :cond_1b
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 1

    .line 130
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 131
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ֡ۧ;->ܿ:Ljava/lang/String;

    .line 132
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ֡ۧ;->᩷:Ll/᩵ۢۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method
