.class public final Ll/ۗ֡ۧ;
.super Ljava/lang/Object;
.source "D8M7"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public ֡:I

.field public ֨:D

.field public ֫:Z

.field public ۖ:I

.field public ۘ:Z

.field public ۚ:I

.field public ۜ:Z

.field public ۠:D

.field public ۡ:J

.field public final ۢ:Ll/ᩳ֨֫;

.field public ۧ:Z

.field public ܳ:I

.field public ܶ:I

.field public ܺ:Ll/᩵ۢۧ;

.field public final ܽ:Ll/ᩳ֨֫;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:I

.field public ᩴ:I

.field public ᩵:I

.field public final ᩷:Ll/ܽ֨֫;

.field public ᩻:Ll/۬֡ۧ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 100
    iput v0, p0, Ll/ۗ֡ۧ;->֡:I

    .line 101
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0xf

    new-array v1, v1, [B

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ᩳ֨֫;-><init>([BI)V

    iput-object v0, p0, Ll/ۗ֡ۧ;->ۢ:Ll/ᩳ֨֫;

    .line 103
    new-instance v0, Ll/ܽ֨֫;

    invoke-direct {v0}, Ll/ܽ֨֫;-><init>()V

    iput-object v0, p0, Ll/ۗ֡ۧ;->᩷:Ll/ܽ֨֫;

    .line 104
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/ۗ֡ۧ;->ܽ:Ll/ᩳ֨֫;

    .line 105
    new-instance v0, Ll/۬֡ۧ;

    .line 647
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object v0, p0, Ll/ۗ֡ۧ;->᩻:Ll/۬֡ۧ;

    const v0, -0x7fffffff

    .line 106
    iput v0, p0, Ll/ۗ֡ۧ;->ᩴ:I

    const/4 v0, -0x1

    .line 107
    iput v0, p0, Ll/ۗ֡ۧ;->᩵:I

    const-wide/16 v0, -0x1

    .line 108
    iput-wide v0, p0, Ll/ۗ֡ۧ;->ۡ:J

    const/4 v0, 0x1

    .line 109
    iput-boolean v0, p0, Ll/ۗ֡ۧ;->ۘ:Z

    .line 110
    iput-boolean v0, p0, Ll/ۗ֡ۧ;->ۜ:Z

    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 111
    iput-wide v0, p0, Ll/ۗ֡ۧ;->֨:D

    .line 112
    iput-wide v0, p0, Ll/ۗ֡ۧ;->۠:D

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;Ll/ᩳ֨֫;Z)V
    .locals 4

    .line 237
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    .line 238
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 239
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    invoke-virtual {p0, v3, v1, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 240
    invoke-virtual {p1, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    if-eqz p2, :cond_0

    .line 242
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    const/4 v0, 0x0

    .line 117
    iput v0, p0, Ll/ۗ֡ۧ;->֡:I

    .line 118
    iput v0, p0, Ll/ۗ֡ۧ;->ۚ:I

    .line 119
    iget-object v1, p0, Ll/ۗ֡ۧ;->ۢ:Ll/ᩳ֨֫;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 120
    iput v0, p0, Ll/ۗ֡ۧ;->ۖ:I

    .line 121
    iput v0, p0, Ll/ۗ֡ۧ;->ܳ:I

    const v1, -0x7fffffff

    .line 122
    iput v1, p0, Ll/ۗ֡ۧ;->ᩴ:I

    const/4 v1, -0x1

    .line 123
    iput v1, p0, Ll/ۗ֡ۧ;->᩵:I

    .line 124
    iput v0, p0, Ll/ۗ֡ۧ;->ܶ:I

    const-wide/16 v1, -0x1

    .line 125
    iput-wide v1, p0, Ll/ۗ֡ۧ;->ۡ:J

    .line 126
    iput-boolean v0, p0, Ll/ۗ֡ۧ;->֫:Z

    .line 127
    iput-boolean v0, p0, Ll/ۗ֡ۧ;->ۧ:Z

    const/4 v0, 0x1

    .line 128
    iput-boolean v0, p0, Ll/ۗ֡ۧ;->ۜ:Z

    .line 129
    iput-boolean v0, p0, Ll/ۗ֡ۧ;->ۘ:Z

    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 130
    iput-wide v0, p0, Ll/ۗ֡ۧ;->֨:D

    .line 131
    iput-wide v0, p0, Ll/ۗ֡ۧ;->۠:D

    return-void
.end method

.method public final ֫(IJ)V
    .locals 2

    .line 144
    iput p1, p0, Ll/ۗ֡ۧ;->ᩳ:I

    .line 147
    iget-boolean p1, p0, Ll/ۗ֡ۧ;->ۘ:Z

    if-nez p1, :cond_1

    iget p1, p0, Ll/ۗ֡ۧ;->ܳ:I

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ll/ۗ֡ۧ;->ۜ:Z

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    .line 148
    iput-boolean p1, p0, Ll/ۗ֡ۧ;->ۧ:Z

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    .line 152
    iget-boolean p1, p0, Ll/ۗ֡ۧ;->ۧ:Z

    if-eqz p1, :cond_2

    long-to-double p1, p2

    .line 153
    iput-wide p1, p0, Ll/ۗ֡ۧ;->۠:D

    return-void

    :cond_2
    long-to-double p1, p2

    .line 155
    iput-wide p1, p0, Ll/ۗ֡ۧ;->֨:D

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 11

    .line 162
    iget-object v0, p0, Ll/ۗ֡ۧ;->ܺ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 164
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-lez v0, :cond_15

    .line 165
    iget v0, p0, Ll/ۗ֡ۧ;->֡:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_11

    iget-object v3, p0, Ll/ۗ֡ۧ;->ܽ:Ll/ᩳ֨֫;

    iget-object v4, p0, Ll/ۗ֡ۧ;->᩻:Ll/۬֡ۧ;

    const/4 v5, 0x2

    if-eq v0, v2, :cond_d

    if-ne v0, v5, :cond_c

    .line 198
    iget v0, v4, Ll/۬֡ۧ;->ܽ:I

    const/16 v6, 0x11

    if-eq v0, v2, :cond_1

    if-ne v0, v6, :cond_2

    .line 199
    :cond_1
    invoke-static {p1, v3, v2}, Ll/ۗ֡ۧ;->֫(Ll/ᩳ֨֫;Ll/ᩳ֨֫;Z)V

    .line 319
    :cond_2
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    iget v7, v4, Ll/۬֡ۧ;->ۧ:I

    iget v8, p0, Ll/ۗ֡ۧ;->ۖ:I

    sub-int/2addr v7, v8

    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 320
    iget-object v7, p0, Ll/ۗ֡ۧ;->ܺ:Ll/᩵ۢۧ;

    invoke-interface {v7, v0, p1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 321
    iget v7, p0, Ll/ۗ֡ۧ;->ۖ:I

    add-int/2addr v7, v0

    iput v7, p0, Ll/ۗ֡ۧ;->ۖ:I

    .line 202
    iget v0, v4, Ll/۬֡ۧ;->ۧ:I

    if-ne v7, v0, :cond_0

    .line 203
    iget v0, v4, Ll/۬֡ۧ;->ܽ:I

    if-ne v0, v2, :cond_6

    .line 204
    new-instance v0, Ll/ܽ֨֫;

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 48
    array-length v5, v3

    invoke-direct {v0, v3, v5}, Ll/ܽ֨֫;-><init>([BI)V

    .line 333
    invoke-static {v0}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;)Ll/۫֡ۧ;

    move-result-object v0

    .line 334
    iget v3, v0, Ll/۫֡ۧ;->ܽ:I

    iput v3, p0, Ll/ۗ֡ۧ;->ᩴ:I

    .line 335
    iget v3, v0, Ll/۫֡ۧ;->ᩳ:I

    iput v3, p0, Ll/ۗ֡ۧ;->᩵:I

    .line 336
    iget-wide v5, p0, Ll/ۗ֡ۧ;->ۡ:J

    iget-wide v3, v4, Ll/۬֡ۧ;->֫:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_5

    .line 337
    iput-wide v3, p0, Ll/ۗ֡ۧ;->ۡ:J

    .line 340
    iget v3, v0, Ll/۫֡ۧ;->ۧ:I

    const/4 v4, -0x1

    const-string v5, "mhm1"

    if-eq v3, v4, :cond_3

    .line 341
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v3, v4, v1

    const-string v1, ".%02X"

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 344
    :cond_3
    iget-object v0, v0, Ll/۫֡ۧ;->֫:[B

    if-eqz v0, :cond_4

    array-length v1, v0

    if-lez v1, :cond_4

    .line 347
    sget-object v1, Ll/ۘ֨֫;->ܿ:[B

    .line 348
    invoke-static {v1, v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    .line 350
    :goto_1
    new-instance v1, Ll/֨ᩴ֫;

    invoke-direct {v1}, Ll/֨ᩴ֫;-><init>()V

    iget-object v3, p0, Ll/ۗ֡ۧ;->ܿ:Ljava/lang/String;

    .line 352
    invoke-virtual {v1, v3}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v3, "video/mp2t"

    .line 353
    invoke-virtual {v1, v3}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    const-string v3, "audio/mhm1"

    .line 354
    invoke-virtual {v1, v3}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget v3, p0, Ll/ۗ֡ۧ;->ᩴ:I

    .line 355
    invoke-virtual {v1, v3}, Ll/֨ᩴ֫;->۠(I)V

    .line 356
    invoke-virtual {v1, v5}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    .line 357
    invoke-virtual {v1, v0}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 358
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 359
    iget-object v1, p0, Ll/ۗ֡ۧ;->ܺ:Ll/᩵ۢۧ;

    invoke-interface {v1, v0}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 361
    :cond_5
    iput-boolean v2, p0, Ll/ۗ֡ۧ;->֫:Z

    goto :goto_4

    :cond_6
    if-ne v0, v6, :cond_8

    .line 206
    new-instance v0, Ll/ܽ֨֫;

    .line 208
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 48
    array-length v4, v3

    invoke-direct {v0, v3, v4}, Ll/ܽ֨֫;-><init>([BI)V

    .line 318
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 319
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v1, 0xd

    .line 320
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    .line 207
    :cond_7
    iput v1, p0, Ll/ۗ֡ۧ;->ܶ:I

    goto :goto_4

    :cond_8
    if-ne v0, v5, :cond_b

    .line 369
    iget-boolean v0, p0, Ll/ۗ֡ۧ;->֫:Z

    if-eqz v0, :cond_9

    .line 371
    iput-boolean v1, p0, Ll/ۗ֡ۧ;->ۘ:Z

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_2

    :cond_9
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 373
    :goto_2
    iget v0, p0, Ll/ۗ֡ۧ;->᩵:I

    iget v3, p0, Ll/ۗ֡ۧ;->ܶ:I

    sub-int/2addr v0, v3

    int-to-double v3, v0

    const-wide v7, 0x412e848000000000L    # 1000000.0

    mul-double v3, v3, v7

    iget v0, p0, Ll/ۗ֡ۧ;->ᩴ:I

    int-to-double v7, v0

    div-double/2addr v3, v7

    .line 375
    iget-wide v7, p0, Ll/ۗ֡ۧ;->֨:D

    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    move-result-wide v7

    .line 376
    iget-boolean v0, p0, Ll/ۗ֡ۧ;->ۧ:Z

    if-eqz v0, :cond_a

    .line 377
    iput-boolean v1, p0, Ll/ۗ֡ۧ;->ۧ:Z

    .line 378
    iget-wide v3, p0, Ll/ۗ֡ۧ;->۠:D

    iput-wide v3, p0, Ll/ۗ֡ۧ;->֨:D

    goto :goto_3

    .line 380
    :cond_a
    iget-wide v9, p0, Ll/ۗ֡ۧ;->֨:D

    add-double/2addr v9, v3

    iput-wide v9, p0, Ll/ۗ֡ۧ;->֨:D

    .line 382
    :goto_3
    iget-object v3, p0, Ll/ۗ֡ۧ;->ܺ:Ll/᩵ۢۧ;

    iget v0, p0, Ll/ۗ֡ۧ;->ܳ:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide v4, v7

    move v7, v0

    move v8, v9

    move-object v9, v10

    invoke-interface/range {v3 .. v9}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 383
    iput-boolean v1, p0, Ll/ۗ֡ۧ;->֫:Z

    .line 384
    iput v1, p0, Ll/ۗ֡ۧ;->ܶ:I

    .line 385
    iput v1, p0, Ll/ۗ֡ۧ;->ܳ:I

    .line 213
    :cond_b
    :goto_4
    iput v2, p0, Ll/ۗ֡ۧ;->֡:I

    goto/16 :goto_0

    .line 217
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 172
    :cond_d
    iget-object v0, p0, Ll/ۗ֡ۧ;->ۢ:Ll/ᩳ֨֫;

    invoke-static {p1, v0, v1}, Ll/ۗ֡ۧ;->֫(Ll/ᩳ֨֫;Ll/ᩳ֨֫;Z)V

    .line 173
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֫()I

    move-result v6

    if-nez v6, :cond_10

    .line 284
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v6

    .line 285
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v7

    iget-object v8, p0, Ll/ۗ֡ۧ;->᩷:Ll/ܽ֨֫;

    invoke-virtual {v8, v6, v7}, Ll/ܽ֨֫;->ܽ(I[B)V

    .line 288
    invoke-static {v8, v4}, Ll/ۤ֡ۧ;->֫(Ll/ܽ֨֫;Ll/۬֡ۧ;)Z

    move-result v7

    if-eqz v7, :cond_e

    .line 291
    iput v1, p0, Ll/ۗ֡ۧ;->ۖ:I

    .line 292
    iget v8, p0, Ll/ۗ֡ۧ;->ܳ:I

    iget v9, v4, Ll/۬֡ۧ;->ۧ:I

    add-int/2addr v9, v6

    add-int/2addr v9, v8

    iput v9, p0, Ll/ۗ֡ۧ;->ܳ:I

    :cond_e
    if-eqz v7, :cond_f

    .line 176
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 177
    iget-object v1, p0, Ll/ۗ֡ۧ;->ܺ:Ll/᩵ۢۧ;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v6

    invoke-interface {v1, v6, v0}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 180
    invoke-virtual {v0, v5}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 183
    iget v0, v4, Ll/۬֡ۧ;->ۧ:I

    invoke-virtual {v3, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 185
    iput-boolean v2, p0, Ll/ۗ֡ۧ;->ۜ:Z

    .line 188
    iput v5, p0, Ll/ۗ֡ۧ;->֡:I

    goto/16 :goto_0

    .line 189
    :cond_f
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    const/16 v4, 0xf

    if-ge v3, v4, :cond_0

    .line 190
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v0, v3}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 191
    iput-boolean v1, p0, Ll/ۗ֡ۧ;->ۜ:Z

    goto/16 :goto_0

    .line 194
    :cond_10
    iput-boolean v1, p0, Ll/ۗ֡ۧ;->ۜ:Z

    goto/16 :goto_0

    .line 254
    :cond_11
    iget v0, p0, Ll/ۗ֡ۧ;->ᩳ:I

    and-int/lit8 v3, v0, 0x2

    if-nez v3, :cond_12

    .line 256
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_0

    :cond_12
    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_14

    .line 262
    :cond_13
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-lez v0, :cond_0

    .line 263
    iget v0, p0, Ll/ۗ֡ۧ;->ۚ:I

    shl-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/ۗ֡ۧ;->ۚ:I

    .line 264
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    or-int/2addr v0, v3

    iput v0, p0, Ll/ۗ֡ۧ;->ۚ:I

    const v3, 0xffffff

    and-int/2addr v0, v3

    const v3, 0xc001a5

    if-ne v0, v3, :cond_13

    .line 266
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 267
    iput v1, p0, Ll/ۗ֡ۧ;->ۚ:I

    .line 168
    :cond_14
    iput v2, p0, Ll/ۗ֡ۧ;->֡:I

    goto/16 :goto_0

    :cond_15
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 1

    .line 137
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 138
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۗ֡ۧ;->ܿ:Ljava/lang/String;

    .line 139
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ֡ۧ;->ܺ:Ll/᩵ۢۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method
