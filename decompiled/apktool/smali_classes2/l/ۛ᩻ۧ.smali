.class public final Ll/ۛ᩻ۧ;
.super Ljava/lang/Object;
.source "68R4"


# instance fields
.field public final ֡:Ll/ۤ᩻ۧ;

.field public ֫:I

.field public ۖ:F

.field public ۘ:F

.field public ۜ:J

.field public ۡ:Z

.field public ۢ:F

.field public final ۧ:Ll/۫᩻ۧ;

.field public ܳ:J

.field public ܺ:Landroid/view/Surface;

.field public ܽ:F

.field public final ܿ:Ll/ۨܳۧ;

.field public ᩳ:J

.field public ᩴ:J

.field public ᩵:J

.field public ᩷:J

.field public ᩻:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    new-instance v0, Ll/ۨܳۧ;

    invoke-direct {v0}, Ll/ۨܳۧ;-><init>()V

    iput-object v0, p0, Ll/ۛ᩻ۧ;->ܿ:Ll/ۨܳۧ;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "display"

    .line 422
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/display/DisplayManager;

    if-eqz p1, :cond_1

    .line 423
    new-instance v1, Ll/۫᩻ۧ;

    invoke-direct {v1, p0, p1}, Ll/۫᩻ۧ;-><init>(Ll/ۛ᩻ۧ;Landroid/hardware/display/DisplayManager;)V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v0

    .line 134
    :goto_1
    iput-object v1, p0, Ll/ۛ᩻ۧ;->ۧ:Ll/۫᩻ۧ;

    if-eqz v1, :cond_2

    .line 135
    invoke-static {}, Ll/ۤ᩻ۧ;->ܽ()Ll/ۤ᩻ۧ;

    move-result-object v0

    :cond_2
    iput-object v0, p0, Ll/ۛ᩻ۧ;->֡:Ll/ۤ᩻ۧ;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 136
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ᩴ:J

    .line 137
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->᩵:J

    const/high16 p1, -0x40800000    # -1.0f

    .line 138
    iput p1, p0, Ll/ۛ᩻ۧ;->ܽ:F

    const/high16 p1, 0x3f800000    # 1.0f

    .line 139
    iput p1, p0, Ll/ۛ᩻ۧ;->ۢ:F

    const/4 p1, 0x0

    .line 140
    iput p1, p0, Ll/ۛ᩻ۧ;->֫:I

    return-void
.end method

.method public static ֫(Ll/ۛ᩻ۧ;Landroid/view/Display;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 389
    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    move-result p1

    float-to-double v0, p1

    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v2, v0

    double-to-long v0, v2

    .line 390
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ᩴ:J

    const-wide/16 v2, 0x50

    mul-long v0, v0, v2

    const-wide/16 v2, 0x64

    .line 391
    div-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۛ᩻ۧ;->᩵:J

    return-void

    :cond_0
    const-string p1, "Unable to query display refresh rate"

    .line 393
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 394
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ᩴ:J

    .line 395
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->᩵:J

    return-void
.end method

.method private ֫(Z)V
    .locals 3

    .line 349
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Ll/ۛ᩻ۧ;->ܺ:Landroid/view/Surface;

    if-eqz v0, :cond_3

    iget v1, p0, Ll/ۛ᩻ۧ;->֫:I

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 356
    :cond_0
    iget-boolean v1, p0, Ll/ۛ᩻ۧ;->ۡ:Z

    if-eqz v1, :cond_1

    iget v1, p0, Ll/ۛ᩻ۧ;->ۖ:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_1

    .line 357
    iget v2, p0, Ll/ۛ᩻ۧ;->ۢ:F

    mul-float v1, v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez p1, :cond_2

    .line 361
    iget p1, p0, Ll/ۛ᩻ۧ;->ۘ:F

    cmpl-float p1, p1, v1

    if-nez p1, :cond_2

    goto :goto_1

    .line 364
    :cond_2
    iput v1, p0, Ll/ۛ᩻ۧ;->ۘ:F

    .line 365
    invoke-static {v0, v1}, Ll/۬᩻ۧ;->֫(Landroid/view/Surface;F)V

    :cond_3
    :goto_1
    return-void
.end method

.method private ܿ()V
    .locals 6

    .line 301
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_6

    iget-object v0, p0, Ll/ۛ᩻ۧ;->ܺ:Landroid/view/Surface;

    if-nez v0, :cond_0

    goto :goto_3

    .line 306
    :cond_0
    iget-object v0, p0, Ll/ۛ᩻ۧ;->ܿ:Ll/ۨܳۧ;

    invoke-virtual {v0}, Ll/ۨܳۧ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ll/ۨܳۧ;->ۧ()F

    move-result v2

    goto :goto_0

    :cond_1
    iget v2, p0, Ll/ۛ᩻ۧ;->ܽ:F

    .line 307
    :goto_0
    iget v3, p0, Ll/ۛ᩻ۧ;->ۖ:F

    cmpl-float v4, v2, v3

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v5, v2, v4

    if-eqz v5, :cond_4

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_4

    .line 316
    invoke-virtual {v0}, Ll/ۨܳۧ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 317
    invoke-virtual {v0}, Ll/ۨܳۧ;->ᩳ()J

    move-result-wide v0

    const-wide v3, 0x12a05f200L

    cmp-long v5, v0, v3

    if-ltz v5, :cond_3

    const v0, 0x3ca3d70a    # 0.02f

    goto :goto_1

    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 323
    :goto_1
    iget v1, p0, Ll/ۛ᩻ۧ;->ۖ:F

    sub-float v1, v2, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v1, v0

    if-ltz v0, :cond_6

    goto :goto_2

    :cond_4
    if-eqz v5, :cond_5

    goto :goto_2

    .line 328
    :cond_5
    invoke-virtual {v0}, Ll/ۨܳۧ;->ܽ()I

    move-result v0

    if-lt v0, v1, :cond_6

    .line 333
    :goto_2
    iput v2, p0, Ll/ۛ᩻ۧ;->ۖ:F

    const/4 v0, 0x0

    .line 334
    invoke-direct {p0, v0}, Ll/ۛ᩻ۧ;->֫(Z)V

    :cond_6
    :goto_3
    return-void
.end method

.method private ᩳ()V
    .locals 3

    .line 375
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Ll/ۛ᩻ۧ;->ܺ:Landroid/view/Surface;

    if-eqz v0, :cond_1

    iget v1, p0, Ll/ۛ᩻ۧ;->֫:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    iget v1, p0, Ll/ۛ᩻ۧ;->ۘ:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    .line 381
    :cond_0
    iput v2, p0, Ll/ۛ᩻ۧ;->ۘ:F

    .line 382
    invoke-static {v0, v2}, Ll/۬᩻ۧ;->֫(Landroid/view/Surface;F)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫(J)J
    .locals 10

    .line 255
    iget-wide v0, p0, Ll/ۛ᩻ۧ;->ܳ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-object v0, p0, Ll/ۛ᩻ۧ;->ܿ:Ll/ۨܳۧ;

    invoke-virtual {v0}, Ll/ۨܳۧ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 256
    iget-object v0, p0, Ll/ۛ᩻ۧ;->ܿ:Ll/ۨܳۧ;

    invoke-virtual {v0}, Ll/ۨܳۧ;->֫()J

    move-result-wide v0

    .line 257
    iget-wide v4, p0, Ll/ۛ᩻ۧ;->᩻:J

    iget-wide v6, p0, Ll/ۛ᩻ۧ;->ᩳ:J

    iget-wide v8, p0, Ll/ۛ᩻ۧ;->ܳ:J

    sub-long/2addr v6, v8

    mul-long v6, v6, v0

    long-to-float v0, v6

    iget v1, p0, Ll/ۛ᩻ۧ;->ۢ:F

    div-float/2addr v0, v1

    float-to-long v0, v0

    add-long/2addr v4, v0

    sub-long v0, p1, v4

    .line 290
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v6, 0x1312d00

    cmp-long v8, v0, v6

    if-gtz v8, :cond_0

    move-wide p1, v4

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    .line 283
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ᩳ:J

    .line 284
    iput-wide v2, p0, Ll/ۛ᩻ۧ;->ܳ:J

    .line 285
    iput-wide v2, p0, Ll/ۛ᩻ۧ;->ۜ:J

    .line 266
    :cond_1
    :goto_0
    iget-wide v0, p0, Ll/ۛ᩻ۧ;->ᩳ:J

    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ۜ:J

    .line 267
    iput-wide p1, p0, Ll/ۛ᩻ۧ;->᩷:J

    .line 269
    iget-object v0, p0, Ll/ۛ᩻ۧ;->֡:Ll/ۤ᩻ۧ;

    if-eqz v0, :cond_6

    iget-wide v1, p0, Ll/ۛ᩻ۧ;->ᩴ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_2

    goto :goto_3

    .line 272
    :cond_2
    iget-wide v0, v0, Ll/ۤ᩻ۧ;->ۙ:J

    cmp-long v2, v0, v3

    if-nez v2, :cond_3

    goto :goto_3

    .line 277
    :cond_3
    iget-wide v2, p0, Ll/ۛ᩻ۧ;->ᩴ:J

    sub-long v4, p1, v0

    .line 400
    div-long/2addr v4, v2

    mul-long v4, v4, v2

    add-long/2addr v4, v0

    cmp-long v0, p1, v4

    if-gtz v0, :cond_4

    sub-long v0, v4, v2

    goto :goto_1

    :cond_4
    add-long/2addr v2, v4

    move-wide v0, v4

    move-wide v4, v2

    :goto_1
    sub-long v2, v4, p1

    sub-long/2addr p1, v0

    cmp-long v6, v2, p1

    if-gez v6, :cond_5

    goto :goto_2

    :cond_5
    move-wide v4, v0

    .line 279
    :goto_2
    iget-wide p1, p0, Ll/ۛ᩻ۧ;->᩵:J

    sub-long/2addr v4, p1

    return-wide v4

    :cond_6
    :goto_3
    return-wide p1
.end method

.method public final ֫()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 283
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ᩳ:J

    const-wide/16 v0, -0x1

    .line 284
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ܳ:J

    .line 285
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ۜ:J

    return-void
.end method

.method public final ֫(F)V
    .locals 0

    .line 205
    iput p1, p0, Ll/ۛ᩻ۧ;->ܽ:F

    .line 206
    iget-object p1, p0, Ll/ۛ᩻ۧ;->ܿ:Ll/ۨܳۧ;

    invoke-virtual {p1}, Ll/ۨܳۧ;->ܳ()V

    .line 207
    invoke-direct {p0}, Ll/ۛ᩻ۧ;->ܿ()V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 151
    iget v0, p0, Ll/ۛ᩻ۧ;->֫:I

    if-ne v0, p1, :cond_0

    return-void

    .line 154
    :cond_0
    iput p1, p0, Ll/ۛ᩻ۧ;->֫:I

    const/4 p1, 0x1

    .line 155
    invoke-direct {p0, p1}, Ll/ۛ᩻ۧ;->֫(Z)V

    return-void
.end method

.method public final ֫(Landroid/view/Surface;)V
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ۛ᩻ۧ;->ܺ:Landroid/view/Surface;

    if-ne v0, p1, :cond_0

    return-void

    .line 178
    :cond_0
    invoke-direct {p0}, Ll/ۛ᩻ۧ;->ᩳ()V

    .line 179
    iput-object p1, p0, Ll/ۛ᩻ۧ;->ܺ:Landroid/view/Surface;

    const/4 p1, 0x1

    .line 180
    invoke-direct {p0, p1}, Ll/ۛ᩻ۧ;->֫(Z)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, 0x1

    .line 160
    iput-boolean v0, p0, Ll/ۛ᩻ۧ;->ۡ:Z

    const-wide/16 v0, 0x0

    .line 283
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ᩳ:J

    const-wide/16 v0, -0x1

    .line 284
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ܳ:J

    .line 285
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ۜ:J

    .line 162
    iget-object v0, p0, Ll/ۛ᩻ۧ;->ۧ:Ll/۫᩻ۧ;

    if-eqz v0, :cond_0

    .line 155
    iget-object v1, p0, Ll/ۛ᩻ۧ;->֡:Ll/ۤ᩻ۧ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    invoke-virtual {v1}, Ll/ۤ᩻ۧ;->֫()V

    .line 164
    invoke-virtual {v0}, Ll/۫᩻ۧ;->֫()V

    :cond_0
    const/4 v0, 0x0

    .line 166
    invoke-direct {p0, v0}, Ll/ۛ᩻ۧ;->֫(Z)V

    return-void
.end method

.method public final ۧ(F)V
    .locals 2

    .line 194
    iput p1, p0, Ll/ۛ᩻ۧ;->ۢ:F

    const-wide/16 v0, 0x0

    .line 283
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ᩳ:J

    const-wide/16 v0, -0x1

    .line 284
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ܳ:J

    .line 285
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ۜ:J

    const/4 p1, 0x0

    .line 196
    invoke-direct {p0, p1}, Ll/ۛ᩻ۧ;->֫(Z)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 5

    .line 216
    iget-wide v0, p0, Ll/ۛ᩻ۧ;->ۜ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 217
    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ܳ:J

    .line 218
    iget-wide v0, p0, Ll/ۛ᩻ۧ;->᩷:J

    iput-wide v0, p0, Ll/ۛ᩻ۧ;->᩻:J

    .line 220
    :cond_0
    iget-wide v0, p0, Ll/ۛ᩻ۧ;->ᩳ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۛ᩻ۧ;->ᩳ:J

    const-wide/16 v0, 0x3e8

    mul-long p1, p1, v0

    .line 221
    iget-object v0, p0, Ll/ۛ᩻ۧ;->ܿ:Ll/ۨܳۧ;

    invoke-virtual {v0, p1, p2}, Ll/ۨܳۧ;->֫(J)V

    .line 222
    invoke-direct {p0}, Ll/ۛ᩻ۧ;->ܿ()V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 227
    iput-boolean v0, p0, Ll/ۛ᩻ۧ;->ۡ:Z

    .line 228
    iget-object v0, p0, Ll/ۛ᩻ۧ;->ۧ:Ll/۫᩻ۧ;

    if-eqz v0, :cond_0

    .line 229
    invoke-virtual {v0}, Ll/۫᩻ۧ;->ۧ()V

    .line 155
    iget-object v0, p0, Ll/ۛ᩻ۧ;->֡:Ll/ۤ᩻ۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    invoke-virtual {v0}, Ll/ۤ᩻ۧ;->ۧ()V

    .line 232
    :cond_0
    invoke-direct {p0}, Ll/ۛ᩻ۧ;->ᩳ()V

    return-void
.end method
