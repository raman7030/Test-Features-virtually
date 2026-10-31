.class public final Ll/ܶ֡֫;
.super Ljava/lang/Object;
.source "T8NO"

# interfaces
.implements Ll/֡֡֫;


# instance fields
.field public ۖ:F

.field public ۘ:Ljava/nio/ShortBuffer;

.field public ۜ:J

.field public ۡ:I

.field public ۢ:Ll/ᩴ֡֫;

.field public ۧ:Ljava/nio/ByteBuffer;

.field public ܳ:Ll/ᩴ֡֫;

.field public ܺ:Z

.field public ܽ:Ll/ᩴ֡֫;

.field public ܿ:Z

.field public ᩳ:J

.field public ᩴ:Ll/۠֡֫;

.field public ᩵:F

.field public ᩷:Ll/ᩴ֡֫;

.field public ᩻:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 83
    iput v0, p0, Ll/ܶ֡֫;->᩵:F

    .line 84
    iput v0, p0, Ll/ܶ֡֫;->ۖ:F

    .line 85
    sget-object v0, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    iput-object v0, p0, Ll/ܶ֡֫;->᩷:Ll/ᩴ֡֫;

    .line 86
    iput-object v0, p0, Ll/ܶ֡֫;->ۢ:Ll/ᩴ֡֫;

    .line 87
    iput-object v0, p0, Ll/ܶ֡֫;->ܽ:Ll/ᩴ֡֫;

    .line 88
    iput-object v0, p0, Ll/ܶ֡֫;->ܳ:Ll/ᩴ֡֫;

    .line 89
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Ll/ܶ֡֫;->ۧ:Ljava/nio/ByteBuffer;

    .line 90
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ֡֫;->ۘ:Ljava/nio/ShortBuffer;

    .line 91
    iput-object v0, p0, Ll/ܶ֡֫;->᩻:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    .line 92
    iput v0, p0, Ll/ܶ֡֫;->ۡ:I

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 9

    .line 280
    invoke-virtual {p0}, Ll/ܶ֡֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 281
    iget-object v0, p0, Ll/ܶ֡֫;->᩷:Ll/ᩴ֡֫;

    iput-object v0, p0, Ll/ܶ֡֫;->ܽ:Ll/ᩴ֡֫;

    .line 282
    iget-object v1, p0, Ll/ܶ֡֫;->ۢ:Ll/ᩴ֡֫;

    iput-object v1, p0, Ll/ܶ֡֫;->ܳ:Ll/ᩴ֡֫;

    .line 283
    iget-boolean v2, p0, Ll/ܶ֡֫;->ܺ:Z

    if-eqz v2, :cond_0

    .line 284
    new-instance v2, Ll/۠֡֫;

    iget v5, v0, Ll/ᩴ֡֫;->ᩳ:I

    iget v7, v0, Ll/ᩴ֡֫;->ۧ:I

    iget v4, p0, Ll/ܶ֡֫;->᩵:F

    iget v6, p0, Ll/ܶ֡֫;->ۖ:F

    iget v8, v1, Ll/ᩴ֡֫;->ᩳ:I

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Ll/۠֡֫;-><init>(FIFII)V

    iput-object v2, p0, Ll/ܶ֡֫;->ᩴ:Ll/۠֡֫;

    goto :goto_0

    .line 291
    :cond_0
    iget-object v0, p0, Ll/ܶ֡֫;->ᩴ:Ll/۠֡֫;

    if-eqz v0, :cond_1

    .line 292
    invoke-virtual {v0}, Ll/۠֡֫;->֫()V

    .line 295
    :cond_1
    :goto_0
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Ll/ܶ֡֫;->᩻:Ljava/nio/ByteBuffer;

    const-wide/16 v0, 0x0

    .line 296
    iput-wide v0, p0, Ll/ܶ֡֫;->ᩳ:J

    .line 297
    iput-wide v0, p0, Ll/ܶ֡֫;->ۜ:J

    const/4 v0, 0x0

    .line 298
    iput-boolean v0, p0, Ll/ܶ֡֫;->ܿ:Z

    return-void
.end method

.method public final reset()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    .line 303
    iput v0, p0, Ll/ܶ֡֫;->᩵:F

    .line 304
    iput v0, p0, Ll/ܶ֡֫;->ۖ:F

    .line 305
    sget-object v0, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    iput-object v0, p0, Ll/ܶ֡֫;->᩷:Ll/ᩴ֡֫;

    .line 306
    iput-object v0, p0, Ll/ܶ֡֫;->ۢ:Ll/ᩴ֡֫;

    .line 307
    iput-object v0, p0, Ll/ܶ֡֫;->ܽ:Ll/ᩴ֡֫;

    .line 308
    iput-object v0, p0, Ll/ܶ֡֫;->ܳ:Ll/ᩴ֡֫;

    .line 309
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Ll/ܶ֡֫;->ۧ:Ljava/nio/ByteBuffer;

    .line 310
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ֡֫;->ۘ:Ljava/nio/ShortBuffer;

    .line 311
    iput-object v0, p0, Ll/ܶ֡֫;->᩻:Ljava/nio/ByteBuffer;

    const/4 v0, -0x1

    .line 312
    iput v0, p0, Ll/ܶ֡֫;->ۡ:I

    const/4 v0, 0x0

    .line 313
    iput-boolean v0, p0, Ll/ܶ֡֫;->ܺ:Z

    const/4 v1, 0x0

    .line 314
    iput-object v1, p0, Ll/ܶ֡֫;->ᩴ:Ll/۠֡֫;

    const-wide/16 v1, 0x0

    .line 315
    iput-wide v1, p0, Ll/ܶ֡֫;->ᩳ:J

    .line 316
    iput-wide v1, p0, Ll/ܶ֡֫;->ۜ:J

    .line 317
    iput-boolean v0, p0, Ll/ܶ֡֫;->ܿ:Z

    return-void
.end method

.method public final ֫(J)J
    .locals 16

    move-object/from16 v0, p0

    .line 151
    iget-wide v1, v0, Ll/ܶ֡֫;->ۜ:J

    const-wide/16 v3, 0x400

    cmp-long v5, v1, v3

    if-ltz v5, :cond_1

    .line 152
    iget-wide v1, v0, Ll/ܶ֡֫;->ᩳ:J

    iget-object v3, v0, Ll/ܶ֡֫;->ᩴ:Ll/۠֡֫;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    invoke-virtual {v3}, Ll/۠֡֫;->ܽ()I

    move-result v3

    int-to-long v3, v3

    sub-long v7, v1, v3

    .line 153
    iget-object v1, v0, Ll/ܶ֡֫;->ܳ:Ll/ᩴ֡֫;

    iget v1, v1, Ll/ᩴ֡֫;->ᩳ:I

    iget-object v2, v0, Ll/ܶ֡֫;->ܽ:Ll/ᩴ֡֫;

    iget v2, v2, Ll/ᩴ֡֫;->ᩳ:I

    if-ne v1, v2, :cond_0

    .line 154
    iget-wide v9, v0, Ll/ܶ֡֫;->ۜ:J

    .line 1955
    sget-object v11, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v5, p1

    invoke-static/range {v5 .. v11}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    return-wide v1

    :cond_0
    int-to-long v3, v1

    mul-long v11, v7, v3

    .line 155
    iget-wide v3, v0, Ll/ܶ֡֫;->ۜ:J

    int-to-long v1, v2

    mul-long v13, v3, v1

    .line 1955
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v9, p1

    invoke-static/range {v9 .. v15}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    return-wide v1

    .line 160
    :cond_1
    iget v1, v0, Ll/ܶ֡֫;->᩵:F

    float-to-double v1, v1

    move-wide/from16 v3, p1

    long-to-double v3, v3

    mul-double v1, v1, v3

    double-to-long v1, v1

    return-wide v1
.end method

.method public final ֫(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;
    .locals 3

    .line 201
    iget v0, p1, Ll/ᩴ֡֫;->ܽ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 205
    iget v0, p0, Ll/ܶ֡֫;->ۡ:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    .line 206
    iget v0, p1, Ll/ᩴ֡֫;->ᩳ:I

    .line 208
    :cond_0
    iput-object p1, p0, Ll/ܶ֡֫;->᩷:Ll/ᩴ֡֫;

    .line 209
    new-instance v2, Ll/ᩴ֡֫;

    iget p1, p1, Ll/ᩴ֡֫;->ۧ:I

    invoke-direct {v2, v0, p1, v1}, Ll/ᩴ֡֫;-><init>(III)V

    iput-object v2, p0, Ll/ܶ֡֫;->ۢ:Ll/ᩴ֡֫;

    const/4 p1, 0x1

    .line 211
    iput-boolean p1, p0, Ll/ܶ֡֫;->ܺ:Z

    return-object v2

    .line 202
    :cond_1
    new-instance v0, Ll/᩵֡֫;

    invoke-direct {v0, p1}, Ll/᩵֡֫;-><init>(Ll/ᩴ֡֫;)V

    throw v0
.end method

.method public final ֫(F)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 119
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 120
    iget v0, p0, Ll/ܶ֡֫;->ۖ:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_1

    .line 121
    iput p1, p0, Ll/ܶ֡֫;->ۖ:F

    .line 122
    iput-boolean v1, p0, Ll/ܶ֡֫;->ܺ:Z

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/nio/ByteBuffer;)V
    .locals 7

    .line 229
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 232
    :cond_0
    iget-object v0, p0, Ll/ܶ֡֫;->ᩴ:Ll/۠֡֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    .line 234
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    .line 235
    iget-wide v3, p0, Ll/ܶ֡֫;->ᩳ:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/ܶ֡֫;->ᩳ:J

    .line 236
    invoke-virtual {v0, v1}, Ll/۠֡֫;->ۧ(Ljava/nio/ShortBuffer;)V

    .line 237
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public final ۧ(F)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 104
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 105
    iget v0, p0, Ll/ܶ֡֫;->᩵:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_1

    .line 106
    iput p1, p0, Ll/ܶ֡֫;->᩵:F

    .line 107
    iput-boolean v1, p0, Ll/ܶ֡֫;->ܺ:Z

    :cond_1
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 275
    iget-boolean v0, p0, Ll/ܶ֡֫;->ܿ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܶ֡֫;->ᩴ:Ll/۠֡֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۠֡֫;->ۧ()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 3

    .line 217
    iget-object v0, p0, Ll/ܶ֡֫;->ۢ:Ll/ᩴ֡֫;

    iget v0, v0, Ll/ᩴ֡֫;->ᩳ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 222
    iget v0, p0, Ll/ܶ֡֫;->᩵:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v2, 0x38d1b717    # 1.0E-4f

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    iget v0, p0, Ll/ܶ֡֫;->ۖ:F

    sub-float/2addr v0, v1

    .line 223
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Ll/ܶ֡֫;->ۢ:Ll/ᩴ֡֫;

    iget v0, v0, Ll/ᩴ֡֫;->ᩳ:I

    iget-object v1, p0, Ll/ܶ֡֫;->᩷:Ll/ᩴ֡֫;

    iget v1, v1, Ll/ᩴ֡֫;->ᩳ:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()V
    .locals 1

    .line 243
    iget-object v0, p0, Ll/ܶ֡֫;->ᩴ:Ll/۠֡֫;

    if-eqz v0, :cond_0

    .line 244
    invoke-virtual {v0}, Ll/۠֡֫;->ᩳ()V

    :cond_0
    const/4 v0, 0x1

    .line 246
    iput-boolean v0, p0, Ll/ܶ֡֫;->ܿ:Z

    return-void
.end method

.method public final ᩳ()Ljava/nio/ByteBuffer;
    .locals 6

    .line 251
    iget-object v0, p0, Ll/ܶ֡֫;->ᩴ:Ll/۠֡֫;

    if-eqz v0, :cond_1

    .line 253
    invoke-virtual {v0}, Ll/۠֡֫;->ۧ()I

    move-result v1

    if-lez v1, :cond_1

    .line 255
    iget-object v2, p0, Ll/ܶ֡֫;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    move-result v2

    if-ge v2, v1, :cond_0

    .line 256
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Ll/ܶ֡֫;->ۧ:Ljava/nio/ByteBuffer;

    .line 257
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v2

    iput-object v2, p0, Ll/ܶ֡֫;->ۘ:Ljava/nio/ShortBuffer;

    goto :goto_0

    .line 259
    :cond_0
    iget-object v2, p0, Ll/ܶ֡֫;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 260
    iget-object v2, p0, Ll/ܶ֡֫;->ۘ:Ljava/nio/ShortBuffer;

    invoke-virtual {v2}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    .line 262
    :goto_0
    iget-object v2, p0, Ll/ܶ֡֫;->ۘ:Ljava/nio/ShortBuffer;

    invoke-virtual {v0, v2}, Ll/۠֡֫;->֫(Ljava/nio/ShortBuffer;)V

    .line 263
    iget-wide v2, p0, Ll/ܶ֡֫;->ۜ:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/ܶ֡֫;->ۜ:J

    .line 264
    iget-object v0, p0, Ll/ܶ֡֫;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 265
    iget-object v0, p0, Ll/ܶ֡֫;->ۧ:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Ll/ܶ֡֫;->᩻:Ljava/nio/ByteBuffer;

    .line 268
    :cond_1
    iget-object v0, p0, Ll/ܶ֡֫;->᩻:Ljava/nio/ByteBuffer;

    .line 269
    sget-object v1, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Ll/ܶ֡֫;->᩻:Ljava/nio/ByteBuffer;

    return-object v0
.end method
