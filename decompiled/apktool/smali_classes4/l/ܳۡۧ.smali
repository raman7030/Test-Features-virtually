.class public final Ll/ܳۡۧ;
.super Ljava/lang/Object;
.source "J8O5"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֫:Ll/ܿۡۧ;

.field public final ۖ:Ll/ᩳ֨֫;

.field public ۘ:J

.field public ۜ:Z

.field public final ۡ:Ll/ᩳ֨֫;

.field public ۢ:I

.field public ۧ:I

.field public final ܳ:Ll/᩻ۡۧ;

.field public ܺ:I

.field public ܽ:Ll/᩸᩷ۧ;

.field public ܿ:J

.field public final ᩳ:Ll/ᩳ֨֫;

.field public ᩴ:I

.field public ᩵:Ll/ۢۡۧ;

.field public final ᩷:Ll/ᩳ֨֫;

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance v0, Ll/ᩳ֨֫;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ܳۡۧ;->᩷:Ll/ᩳ֨֫;

    .line 97
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ܳۡۧ;->ᩳ:Ll/ᩳ֨֫;

    .line 98
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ܳۡۧ;->ۖ:Ll/ᩳ֨֫;

    .line 99
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/ܳۡۧ;->ۡ:Ll/ᩳ֨֫;

    .line 100
    new-instance v0, Ll/᩻ۡۧ;

    invoke-direct {v0}, Ll/᩻ۡۧ;-><init>()V

    iput-object v0, p0, Ll/ܳۡۧ;->ܳ:Ll/᩻ۡۧ;

    const/4 v0, 0x1

    .line 101
    iput v0, p0, Ll/ܳۡۧ;->ۢ:I

    return-void
.end method

.method private ۧ(Ll/۠᩷ۧ;)Ll/ᩳ֨֫;
    .locals 4

    .line 300
    iget v0, p0, Ll/ܳۡۧ;->ܺ:I

    iget-object v1, p0, Ll/ܳۡۧ;->ۡ:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ll/ᩳ֨֫;->ۧ()I

    move-result v2

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    .line 301
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ۧ()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    iget v2, p0, Ll/ܳۡۧ;->ܺ:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {v1, v3, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    goto :goto_0

    .line 303
    :cond_0
    invoke-virtual {v1, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 305
    :goto_0
    iget v0, p0, Ll/ܳۡۧ;->ܺ:I

    invoke-virtual {v1, v0}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 306
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    iget v2, p0, Ll/ܳۡۧ;->ܺ:I

    invoke-interface {p1, v0, v3, v2}, Ll/۠᩷ۧ;->readFully([BII)V

    return-object v1
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 13

    .line 158
    iget-object p2, p0, Ll/ܳۡۧ;->ܽ:Ll/᩸᩷ۧ;

    invoke-static {p2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 160
    :cond_0
    :goto_0
    iget p2, p0, Ll/ܳۡۧ;->ۢ:I

    const/16 v0, 0x9

    const/16 v1, 0x8

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq p2, v4, :cond_f

    const/4 v6, 0x3

    if-eq p2, v3, :cond_e

    if-eq p2, v6, :cond_c

    if-ne p2, v2, :cond_b

    .line 319
    iget-boolean p2, p0, Ll/ܳۡۧ;->᩻:Z

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v8, p0, Ll/ܳۡۧ;->ܳ:Ll/᩻ۡۧ;

    if-eqz p2, :cond_1

    .line 320
    iget-wide v9, p0, Ll/ܳۡۧ;->ܿ:J

    iget-wide v11, p0, Ll/ܳۡۧ;->ۘ:J

    add-long/2addr v9, v11

    goto :goto_1

    .line 321
    :cond_1
    invoke-virtual {v8}, Ll/᩻ۡۧ;->֫()J

    move-result-wide v9

    cmp-long p2, v9, v6

    if-nez p2, :cond_2

    const-wide/16 v9, 0x0

    goto :goto_1

    :cond_2
    iget-wide v9, p0, Ll/ܳۡۧ;->ۘ:J

    .line 268
    :goto_1
    iget p2, p0, Ll/ܳۡۧ;->ᩴ:I

    if-ne p2, v1, :cond_4

    iget-object v1, p0, Ll/ܳۡۧ;->֫:Ll/ܿۡۧ;

    if-eqz v1, :cond_4

    .line 312
    iget-boolean p2, p0, Ll/ܳۡۧ;->ۜ:Z

    if-nez p2, :cond_3

    .line 313
    iget-object p2, p0, Ll/ܳۡۧ;->ܽ:Ll/᩸᩷ۧ;

    new-instance v0, Ll/᩷ۢۧ;

    invoke-direct {v0, v6, v7}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {p2, v0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 314
    iput-boolean v4, p0, Ll/ܳۡۧ;->ۜ:Z

    .line 270
    :cond_3
    iget-object p2, p0, Ll/ܳۡۧ;->֫:Ll/ܿۡۧ;

    invoke-direct {p0, p1}, Ll/ܳۡۧ;->ۧ(Ll/۠᩷ۧ;)Ll/ᩳ֨֫;

    move-result-object v0

    .line 61
    invoke-virtual {p2, v0}, Ll/ܿۡۧ;->֫(Ll/ᩳ֨֫;)Z

    invoke-virtual {p2, v9, v10, v0}, Ll/ܿۡۧ;->֫(JLl/ᩳ֨֫;)Z

    move-result p2

    goto :goto_2

    :cond_4
    if-ne p2, v0, :cond_6

    .line 271
    iget-object v0, p0, Ll/ܳۡۧ;->᩵:Ll/ۢۡۧ;

    if-eqz v0, :cond_6

    .line 312
    iget-boolean p2, p0, Ll/ܳۡۧ;->ۜ:Z

    if-nez p2, :cond_5

    .line 313
    iget-object p2, p0, Ll/ܳۡۧ;->ܽ:Ll/᩸᩷ۧ;

    new-instance v0, Ll/᩷ۢۧ;

    invoke-direct {v0, v6, v7}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {p2, v0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 314
    iput-boolean v4, p0, Ll/ܳۡۧ;->ۜ:Z

    .line 273
    :cond_5
    iget-object p2, p0, Ll/ܳۡۧ;->᩵:Ll/ۢۡۧ;

    invoke-direct {p0, p1}, Ll/ܳۡۧ;->ۧ(Ll/۠᩷ۧ;)Ll/ᩳ֨֫;

    move-result-object v0

    .line 61
    invoke-virtual {p2, v0}, Ll/ۢۡۧ;->֫(Ll/ᩳ֨֫;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p2, v9, v10, v0}, Ll/ۢۡۧ;->֫(JLl/ᩳ֨֫;)Z

    move-result p2

    if-eqz p2, :cond_7

    const/4 p2, 0x1

    goto :goto_2

    :cond_6
    const/16 v0, 0x12

    if-ne p2, v0, :cond_8

    .line 274
    iget-boolean p2, p0, Ll/ܳۡۧ;->ۜ:Z

    if-nez p2, :cond_8

    .line 275
    invoke-direct {p0, p1}, Ll/ܳۡۧ;->ۧ(Ll/۠᩷ۧ;)Ll/ᩳ֨֫;

    move-result-object p2

    .line 61
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8, v9, v10, p2}, Ll/᩻ۡۧ;->֫(JLl/ᩳ֨֫;)Z

    .line 276
    invoke-virtual {v8}, Ll/᩻ۡۧ;->֫()J

    move-result-wide v0

    cmp-long p2, v0, v6

    if-eqz p2, :cond_7

    .line 278
    iget-object p2, p0, Ll/ܳۡۧ;->ܽ:Ll/᩸᩷ۧ;

    new-instance v9, Ll/ᩳۢۧ;

    .line 280
    invoke-virtual {v8}, Ll/᩻ۡۧ;->ۧ()[J

    move-result-object v10

    .line 281
    invoke-virtual {v8}, Ll/᩻ۡۧ;->ܽ()[J

    move-result-object v11

    invoke-direct {v9, v0, v1, v10, v11}, Ll/ᩳۢۧ;-><init>(J[J[J)V

    .line 278
    invoke-interface {p2, v9}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 283
    iput-boolean v4, p0, Ll/ܳۡۧ;->ۜ:Z

    :cond_7
    const/4 p2, 0x0

    :goto_2
    const/4 v0, 0x1

    goto :goto_3

    .line 286
    :cond_8
    iget p2, p0, Ll/ܳۡۧ;->ܺ:I

    invoke-interface {p1, p2}, Ll/۠᩷ۧ;->ܽ(I)V

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 289
    :goto_3
    iget-boolean v1, p0, Ll/ܳۡۧ;->᩻:Z

    if-nez v1, :cond_a

    if-eqz p2, :cond_a

    .line 290
    iput-boolean v4, p0, Ll/ܳۡۧ;->᩻:Z

    .line 292
    invoke-virtual {v8}, Ll/᩻ۡۧ;->֫()J

    move-result-wide v8

    cmp-long p2, v8, v6

    if-nez p2, :cond_9

    iget-wide v6, p0, Ll/ܳۡۧ;->ۘ:J

    neg-long v6, v6

    goto :goto_4

    :cond_9
    const-wide/16 v6, 0x0

    :goto_4
    iput-wide v6, p0, Ll/ܳۡۧ;->ܿ:J

    .line 294
    :cond_a
    iput v2, p0, Ll/ܳۡۧ;->ۧ:I

    .line 295
    iput v3, p0, Ll/ܳۡۧ;->ۢ:I

    if-eqz v0, :cond_0

    return v5

    .line 181
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 241
    :cond_c
    iget-object p2, p0, Ll/ܳۡۧ;->ۖ:Ll/ᩳ֨֫;

    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    const/16 v1, 0xb

    invoke-interface {p1, v4, v5, v1, v0}, Ll/۠᩷ۧ;->֫(ZII[B)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_5

    .line 246
    :cond_d
    invoke-virtual {p2, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 247
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    iput v0, p0, Ll/ܳۡۧ;->ᩴ:I

    .line 248
    invoke-virtual {p2}, Ll/ᩳ֨֫;->᩸()I

    move-result v0

    iput v0, p0, Ll/ܳۡۧ;->ܺ:I

    .line 249
    invoke-virtual {p2}, Ll/ᩳ֨֫;->᩸()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Ll/ܳۡۧ;->ۘ:J

    .line 250
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    int-to-long v0, v0

    iget-wide v3, p0, Ll/ܳۡۧ;->ۘ:J

    or-long/2addr v0, v3

    const-wide/16 v3, 0x3e8

    mul-long v0, v0, v3

    iput-wide v0, p0, Ll/ܳۡۧ;->ۘ:J

    .line 251
    invoke-virtual {p2, v6}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 252
    iput v2, p0, Ll/ܳۡۧ;->ۢ:I

    goto/16 :goto_0

    .line 228
    :cond_e
    iget p2, p0, Ll/ܳۡۧ;->ۧ:I

    invoke-interface {p1, p2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 229
    iput v5, p0, Ll/ܳۡۧ;->ۧ:I

    .line 230
    iput v6, p0, Ll/ܳۡۧ;->ۢ:I

    goto/16 :goto_0

    .line 195
    :cond_f
    iget-object p2, p0, Ll/ܳۡۧ;->ᩳ:Ll/ᩳ֨֫;

    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    invoke-interface {p1, v4, v5, v0, v6}, Ll/۠᩷ۧ;->֫(ZII[B)Z

    move-result v6

    if-nez v6, :cond_10

    :goto_5
    const/4 p1, -0x1

    return p1

    .line 200
    :cond_10
    invoke-virtual {p2, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 201
    invoke-virtual {p2, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 202
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    and-int/lit8 v6, v2, 0x4

    if-eqz v6, :cond_11

    const/4 v6, 0x1

    goto :goto_6

    :cond_11
    const/4 v6, 0x0

    :goto_6
    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_12

    const/4 v5, 0x1

    :cond_12
    if-eqz v6, :cond_13

    .line 205
    iget-object v2, p0, Ll/ܳۡۧ;->֫:Ll/ܿۡۧ;

    if-nez v2, :cond_13

    .line 206
    new-instance v2, Ll/ܿۡۧ;

    iget-object v6, p0, Ll/ܳۡۧ;->ܽ:Ll/᩸᩷ۧ;

    .line 207
    invoke-interface {v6, v1, v4}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v1

    .line 46
    invoke-direct {v2, v1}, Ll/᩷ۡۧ;-><init>(Ll/᩵ۢۧ;)V

    .line 207
    iput-object v2, p0, Ll/ܳۡۧ;->֫:Ll/ܿۡۧ;

    :cond_13
    if-eqz v5, :cond_14

    .line 209
    iget-object v1, p0, Ll/ܳۡۧ;->᩵:Ll/ۢۡۧ;

    if-nez v1, :cond_14

    .line 210
    new-instance v1, Ll/ۢۡۧ;

    iget-object v2, p0, Ll/ܳۡۧ;->ܽ:Ll/᩸᩷ۧ;

    .line 211
    invoke-interface {v2, v0, v3}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ۢۡۧ;-><init>(Ll/᩵ۢۧ;)V

    iput-object v1, p0, Ll/ܳۡۧ;->᩵:Ll/ۢۡۧ;

    .line 213
    :cond_14
    iget-object v0, p0, Ll/ܳۡۧ;->ܽ:Ll/᩸᩷ۧ;

    invoke-interface {v0}, Ll/᩸᩷ۧ;->ܳ()V

    .line 216
    invoke-virtual {p2}, Ll/ᩳ֨֫;->᩻()I

    move-result p2

    add-int/lit8 p2, p2, -0x5

    iput p2, p0, Ll/ܳۡۧ;->ۧ:I

    .line 217
    iput v3, p0, Ll/ܳۡۧ;->ۢ:I

    goto/16 :goto_0
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 2

    const-wide/16 p3, 0x0

    const/4 v0, 0x0

    cmp-long v1, p1, p3

    if-nez v1, :cond_0

    const/4 p1, 0x1

    .line 143
    iput p1, p0, Ll/ܳۡۧ;->ۢ:I

    .line 144
    iput-boolean v0, p0, Ll/ܳۡۧ;->᩻:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    .line 146
    iput p1, p0, Ll/ܳۡۧ;->ۢ:I

    .line 148
    :goto_0
    iput v0, p0, Ll/ܳۡۧ;->ۧ:I

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 0

    .line 137
    iput-object p1, p0, Ll/ܳۡۧ;->ܽ:Ll/᩸᩷ۧ;

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 4

    .line 107
    iget-object v0, p0, Ll/ܳۡۧ;->᩷:Ll/ᩳ֨֫;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    check-cast p1, Ll/ܺ᩷ۧ;

    const/4 v2, 0x0

    const/4 v3, 0x3

    .line 157
    invoke-virtual {p1, v2, v2, v3, v1}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 108
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 109
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩸()I

    move-result v1

    const v3, 0x464c56

    if-eq v1, v3, :cond_0

    goto :goto_0

    .line 114
    :cond_0
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    const/4 v3, 0x2

    .line 157
    invoke-virtual {p1, v2, v2, v3, v1}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 115
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 116
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    and-int/lit16 v1, v1, 0xfa

    if-eqz v1, :cond_1

    goto :goto_0

    .line 121
    :cond_1
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    const/4 v3, 0x4

    .line 157
    invoke-virtual {p1, v2, v2, v3, v1}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 122
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 123
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    .line 125
    invoke-virtual {p1}, Ll/ܺ᩷ۧ;->ۧ()V

    .line 178
    invoke-virtual {p1, v1, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    .line 129
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    .line 157
    invoke-virtual {p1, v2, v2, v3, v1}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 130
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 132
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
