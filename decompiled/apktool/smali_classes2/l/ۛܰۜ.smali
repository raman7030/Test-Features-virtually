.class public final Ll/ۛܰۜ;
.super Ljava/lang/Object;
.source "B6MI"


# instance fields
.field public final ֫:D

.field public final ۧ:D

.field public final ܳ:F

.field public final ܽ:I

.field public final ܿ:D

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIDDDF)V
    .locals 0

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    iput p1, p0, Ll/ۛܰۜ;->ᩳ:I

    .line 192
    iput p2, p0, Ll/ۛܰۜ;->ܽ:I

    .line 193
    iput-wide p3, p0, Ll/ۛܰۜ;->ܿ:D

    .line 194
    iput-wide p5, p0, Ll/ۛܰۜ;->֫:D

    .line 195
    iput-wide p7, p0, Ll/ۛܰۜ;->ۧ:D

    .line 196
    iput p9, p0, Ll/ۛܰۜ;->ܳ:F

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 8

    .line 201
    iget v0, p0, Ll/ۛܰۜ;->ᩳ:I

    if-lez v0, :cond_0

    iget v1, p0, Ll/ۛܰۜ;->ܽ:I

    if-lez v1, :cond_0

    const-wide/16 v2, 0x0

    iget-wide v4, p0, Ll/ۛܰۜ;->ܿ:D

    cmpl-double v6, v4, v2

    if-lez v6, :cond_0

    .line 208
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_0

    .line 201
    iget-wide v2, p0, Ll/ۛܰۜ;->֫:D

    int-to-double v4, v0

    mul-double v2, v2, v4

    const-wide/high16 v4, 0x4020000000000000L    # 8.0

    mul-double v2, v2, v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    mul-double v2, v2, v6

    .line 208
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    iget-wide v2, p0, Ll/ۛܰۜ;->ۧ:D

    int-to-double v0, v1

    mul-double v2, v2, v0

    mul-double v2, v2, v4

    mul-double v2, v2, v6

    .line 208
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    const/high16 v0, -0x3ccc0000    # -180.0f

    .line 203
    iget v1, p0, Ll/ۛܰۜ;->ܳ:F

    cmpl-float v0, v1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x43340000    # 180.0f

    cmpg-float v0, v1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
