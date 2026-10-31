.class public final Ll/ۚ᩵ۧ;
.super Ljava/lang/Object;
.source "P8MF"


# instance fields
.field public ֡:F

.field public ֨:I

.field public ֫:I

.field public ۖ:Landroid/text/Layout$Alignment;

.field public ۘ:Ljava/lang/String;

.field public ۚ:Landroid/text/Layout$Alignment;

.field public ۜ:Z

.field public ۠:Ll/ۡ᩵ۧ;

.field public ۡ:I

.field public ۢ:Ljava/lang/String;

.field public ۧ:I

.field public ܳ:F

.field public ܶ:I

.field public ܺ:I

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:I

.field public ᩴ:I

.field public ᩵:I

.field public ᩷:Z

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 103
    iput v0, p0, Ll/ۚ᩵ۧ;->ܺ:I

    .line 104
    iput v0, p0, Ll/ۚ᩵ۧ;->ܶ:I

    .line 105
    iput v0, p0, Ll/ۚ᩵ۧ;->ۧ:I

    .line 106
    iput v0, p0, Ll/ۚ᩵ۧ;->ۡ:I

    .line 107
    iput v0, p0, Ll/ۚ᩵ۧ;->᩻:I

    .line 108
    iput v0, p0, Ll/ۚ᩵ۧ;->᩵:I

    .line 109
    iput v0, p0, Ll/ۚ᩵ۧ;->ᩴ:I

    .line 110
    iput v0, p0, Ll/ۚ᩵ۧ;->֨:I

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 111
    iput v0, p0, Ll/ۚ᩵ۧ;->֡:F

    return-void
.end method


# virtual methods
.method public final ֡()Z
    .locals 1

    .line 203
    iget-boolean v0, p0, Ll/ۚ᩵ۧ;->ۜ:Z

    return v0
.end method

.method public final ֨()Z
    .locals 2

    .line 128
    iget v0, p0, Ll/ۚ᩵ۧ;->ܺ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫()I
    .locals 2

    .line 189
    iget-boolean v0, p0, Ll/ۚ᩵ۧ;->ۜ:Z

    if-eqz v0, :cond_0

    .line 192
    iget v0, p0, Ll/ۚ᩵ۧ;->֫:I

    return v0

    .line 190
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Background color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(F)V
    .locals 0

    .line 376
    iput p1, p0, Ll/ۚ᩵ۧ;->ܳ:F

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 197
    iput p1, p0, Ll/ۚ᩵ۧ;->֫:I

    const/4 p1, 0x1

    .line 198
    iput-boolean p1, p0, Ll/ۚ᩵ۧ;->ۜ:Z

    return-void
.end method

.method public final ֫(Landroid/text/Layout$Alignment;)V
    .locals 0

    .line 348
    iput-object p1, p0, Ll/ۚ᩵ۧ;->ۖ:Landroid/text/Layout$Alignment;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 407
    iput-object p1, p0, Ll/ۚ᩵ۧ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/ۚ᩵ۧ;)V
    .locals 3

    if-eqz p1, :cond_10

    .line 242
    iget-boolean v0, p0, Ll/ۚ᩵ۧ;->᩷:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Ll/ۚ᩵ۧ;->᩷:Z

    if-eqz v0, :cond_0

    .line 243
    iget v0, p1, Ll/ۚ᩵ۧ;->ᩳ:I

    invoke-virtual {p0, v0}, Ll/ۚ᩵ۧ;->ۧ(I)V

    .line 245
    :cond_0
    iget v0, p0, Ll/ۚ᩵ۧ;->ۧ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 246
    iget v0, p1, Ll/ۚ᩵ۧ;->ۧ:I

    iput v0, p0, Ll/ۚ᩵ۧ;->ۧ:I

    .line 248
    :cond_1
    iget v0, p0, Ll/ۚ᩵ۧ;->ۡ:I

    if-ne v0, v1, :cond_2

    .line 249
    iget v0, p1, Ll/ۚ᩵ۧ;->ۡ:I

    iput v0, p0, Ll/ۚ᩵ۧ;->ۡ:I

    .line 251
    :cond_2
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ܿ:Ljava/lang/String;

    if-nez v0, :cond_3

    iget-object v0, p1, Ll/ۚ᩵ۧ;->ܿ:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 252
    iput-object v0, p0, Ll/ۚ᩵ۧ;->ܿ:Ljava/lang/String;

    .line 254
    :cond_3
    iget v0, p0, Ll/ۚ᩵ۧ;->ܺ:I

    if-ne v0, v1, :cond_4

    .line 255
    iget v0, p1, Ll/ۚ᩵ۧ;->ܺ:I

    iput v0, p0, Ll/ۚ᩵ۧ;->ܺ:I

    .line 257
    :cond_4
    iget v0, p0, Ll/ۚ᩵ۧ;->ܶ:I

    if-ne v0, v1, :cond_5

    .line 258
    iget v0, p1, Ll/ۚ᩵ۧ;->ܶ:I

    iput v0, p0, Ll/ۚ᩵ۧ;->ܶ:I

    .line 260
    :cond_5
    iget v0, p0, Ll/ۚ᩵ۧ;->ᩴ:I

    if-ne v0, v1, :cond_6

    .line 261
    iget v0, p1, Ll/ۚ᩵ۧ;->ᩴ:I

    iput v0, p0, Ll/ۚ᩵ۧ;->ᩴ:I

    .line 263
    :cond_6
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ۚ:Landroid/text/Layout$Alignment;

    if-nez v0, :cond_7

    iget-object v0, p1, Ll/ۚ᩵ۧ;->ۚ:Landroid/text/Layout$Alignment;

    if-eqz v0, :cond_7

    .line 264
    iput-object v0, p0, Ll/ۚ᩵ۧ;->ۚ:Landroid/text/Layout$Alignment;

    .line 266
    :cond_7
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ۖ:Landroid/text/Layout$Alignment;

    if-nez v0, :cond_8

    iget-object v0, p1, Ll/ۚ᩵ۧ;->ۖ:Landroid/text/Layout$Alignment;

    if-eqz v0, :cond_8

    .line 267
    iput-object v0, p0, Ll/ۚ᩵ۧ;->ۖ:Landroid/text/Layout$Alignment;

    .line 269
    :cond_8
    iget v0, p0, Ll/ۚ᩵ۧ;->֨:I

    if-ne v0, v1, :cond_9

    .line 270
    iget v0, p1, Ll/ۚ᩵ۧ;->֨:I

    iput v0, p0, Ll/ۚ᩵ۧ;->֨:I

    .line 272
    :cond_9
    iget v0, p0, Ll/ۚ᩵ۧ;->᩻:I

    if-ne v0, v1, :cond_a

    .line 273
    iget v0, p1, Ll/ۚ᩵ۧ;->᩻:I

    iput v0, p0, Ll/ۚ᩵ۧ;->᩻:I

    .line 274
    iget v0, p1, Ll/ۚ᩵ۧ;->ܳ:F

    iput v0, p0, Ll/ۚ᩵ۧ;->ܳ:F

    .line 276
    :cond_a
    iget-object v0, p0, Ll/ۚ᩵ۧ;->۠:Ll/ۡ᩵ۧ;

    if-nez v0, :cond_b

    .line 277
    iget-object v0, p1, Ll/ۚ᩵ۧ;->۠:Ll/ۡ᩵ۧ;

    iput-object v0, p0, Ll/ۚ᩵ۧ;->۠:Ll/ۡ᩵ۧ;

    .line 279
    :cond_b
    iget v0, p0, Ll/ۚ᩵ۧ;->֡:F

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v2

    if-nez v0, :cond_c

    .line 280
    iget v0, p1, Ll/ۚ᩵ۧ;->֡:F

    iput v0, p0, Ll/ۚ᩵ۧ;->֡:F

    .line 282
    :cond_c
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ۘ:Ljava/lang/String;

    if-nez v0, :cond_d

    .line 283
    iget-object v0, p1, Ll/ۚ᩵ۧ;->ۘ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۚ᩵ۧ;->ۘ:Ljava/lang/String;

    .line 285
    :cond_d
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_e

    .line 286
    iget-object v0, p1, Ll/ۚ᩵ۧ;->ܽ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۚ᩵ۧ;->ܽ:Ljava/lang/String;

    .line 289
    :cond_e
    iget-boolean v0, p0, Ll/ۚ᩵ۧ;->ۜ:Z

    if-nez v0, :cond_f

    iget-boolean v0, p1, Ll/ۚ᩵ۧ;->ۜ:Z

    if-eqz v0, :cond_f

    .line 290
    iget v0, p1, Ll/ۚ᩵ۧ;->֫:I

    invoke-virtual {p0, v0}, Ll/ۚ᩵ۧ;->֫(I)V

    .line 292
    :cond_f
    iget v0, p0, Ll/ۚ᩵ۧ;->᩵:I

    if-ne v0, v1, :cond_10

    iget p1, p1, Ll/ۚ᩵ۧ;->᩵:I

    if-eq p1, v1, :cond_10

    .line 293
    iput p1, p0, Ll/ۚ᩵ۧ;->᩵:I

    :cond_10
    return-void
.end method

.method public final ֫(Ll/ۡ᩵ۧ;)V
    .locals 0

    .line 370
    iput-object p1, p0, Ll/ۚ᩵ۧ;->۠:Ll/ۡ᩵ۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 149
    iput p1, p0, Ll/ۚ᩵ۧ;->ۧ:I

    return-void
.end method

.method public final ۖ()I
    .locals 4

    .line 121
    iget v0, p0, Ll/ۚ᩵ۧ;->ۧ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Ll/ۚ᩵ۧ;->ۡ:I

    if-ne v2, v1, :cond_0

    return v1

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 124
    :goto_0
    iget v3, p0, Ll/ۚ᩵ۧ;->ۡ:I

    if-ne v3, v2, :cond_2

    const/4 v1, 0x2

    :cond_2
    or-int/2addr v0, v1

    return v0
.end method

.method public final ۘ()Landroid/text/Layout$Alignment;
    .locals 1

    .line 332
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ۚ:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public final ۚ()Z
    .locals 1

    .line 185
    iget-boolean v0, p0, Ll/ۚ᩵ۧ;->᩷:Z

    return v0
.end method

.method public final ۜ()Landroid/text/Layout$Alignment;
    .locals 1

    .line 343
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ۖ:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public final ۠()Z
    .locals 2

    .line 138
    iget v0, p0, Ll/ۚ᩵ۧ;->ܶ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()I
    .locals 1

    .line 317
    iget v0, p0, Ll/ۚ᩵ۧ;->᩵:I

    return v0
.end method

.method public final ۢ()I
    .locals 1

    .line 327
    iget v0, p0, Ll/ۚ᩵ۧ;->ᩴ:I

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 413
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(F)V
    .locals 0

    .line 208
    iput p1, p0, Ll/ۚ᩵ۧ;->֡:F

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 179
    iput p1, p0, Ll/ۚ᩵ۧ;->ᩳ:I

    const/4 p1, 0x1

    .line 180
    iput-boolean p1, p0, Ll/ۚ᩵ۧ;->᩷:Z

    return-void
.end method

.method public final ۧ(Landroid/text/Layout$Alignment;)V
    .locals 0

    .line 337
    iput-object p1, p0, Ll/ۚ᩵ۧ;->ۚ:Landroid/text/Layout$Alignment;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 166
    iput-object p1, p0, Ll/ۚ᩵ۧ;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 155
    iput p1, p0, Ll/ۚ᩵ۧ;->ۡ:I

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 387
    iget v0, p0, Ll/ۚ᩵ۧ;->᩻:I

    return v0
.end method

.method public final ܺ()F
    .locals 1

    .line 213
    iget v0, p0, Ll/ۚ᩵ۧ;->֡:F

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 171
    iget-boolean v0, p0, Ll/ۚ᩵ۧ;->᩷:Z

    if-eqz v0, :cond_0

    .line 174
    iget v0, p0, Ll/ۚ᩵ۧ;->ᩳ:I

    return v0

    .line 172
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Font color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 382
    iput p1, p0, Ll/ۚ᩵ۧ;->᩻:I

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 301
    iput-object p1, p0, Ll/ۚ᩵ۧ;->ۢ:Ljava/lang/String;

    return-void
.end method

.method public final ܽ(Z)V
    .locals 0

    .line 133
    iput p1, p0, Ll/ۚ᩵ۧ;->ܺ:I

    return-void
.end method

.method public final ܿ()F
    .locals 1

    .line 391
    iget v0, p0, Ll/ۚ᩵ۧ;->ܳ:F

    return v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 312
    iput p1, p0, Ll/ۚ᩵ۧ;->᩵:I

    return-void
.end method

.method public final ܿ(Z)V
    .locals 0

    .line 143
    iput p1, p0, Ll/ۚ᩵ۧ;->ܶ:I

    return-void
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 322
    iput p1, p0, Ll/ۚ᩵ۧ;->ᩴ:I

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 396
    iput-object p1, p0, Ll/ۚ᩵ۧ;->ۘ:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ(Z)V
    .locals 0

    .line 359
    iput p1, p0, Ll/ۚ᩵ۧ;->֨:I

    return-void
.end method

.method public final ᩴ()Z
    .locals 2

    .line 354
    iget v0, p0, Ll/ۚ᩵ۧ;->֨:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()Ll/ۡ᩵ۧ;
    .locals 1

    .line 365
    iget-object v0, p0, Ll/ۚ᩵ۧ;->۠:Ll/ۡ᩵ۧ;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 402
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ۘ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 307
    iget-object v0, p0, Ll/ۚ᩵ۧ;->ۢ:Ljava/lang/String;

    return-object v0
.end method
