.class public final Ll/᩺֡ۧ;
.super Ljava/lang/Object;
.source "68HB"

# interfaces
.implements Ll/֡ۚۧ;


# instance fields
.field public ֫:I

.field public final ۜ:Ll/ܺ֡ۧ;

.field public ۡ:J

.field public ۢ:I

.field public ۧ:Z

.field public final ܳ:Ll/ܽ֨֫;

.field public ܺ:Ll/ۢ֨֫;

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܺ֡ۧ;)V
    .locals 2

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Ll/᩺֡ۧ;->ۜ:Ll/ܺ֡ۧ;

    .line 65
    new-instance p1, Ll/ܽ֨֫;

    const/16 v0, 0xa

    new-array v1, v0, [B

    .line 48
    invoke-direct {p1, v1, v0}, Ll/ܽ֨֫;-><init>([BI)V

    .line 65
    iput-object p1, p0, Ll/᩺֡ۧ;->ܳ:Ll/ܽ֨֫;

    const/4 p1, 0x0

    .line 66
    iput p1, p0, Ll/᩺֡ۧ;->ۢ:I

    return-void
.end method

.method private ֫(Ll/ᩳ֨֫;[BI)Z
    .locals 3

    .line 200
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    iget v1, p0, Ll/᩺֡ۧ;->֫:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x1

    if-gtz v0, :cond_0

    return v1

    :cond_0
    if-nez p2, :cond_1

    .line 204
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    goto :goto_0

    .line 206
    :cond_1
    iget v2, p0, Ll/᩺֡ۧ;->֫:I

    invoke-virtual {p1, v2, v0, p2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 208
    :goto_0
    iget p1, p0, Ll/᩺֡ۧ;->֫:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/᩺֡ۧ;->֫:I

    if-ne p1, p3, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ()Z
    .locals 6

    .line 215
    iget-object v0, p0, Ll/᩺֡ۧ;->ܳ:Ll/ܽ֨֫;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ᩳ(I)V

    const/16 v2, 0x18

    .line 216
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-eq v2, v4, :cond_0

    const-string v0, "Unexpected start code prefix: "

    .line 0
    invoke-static {v2, v0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    .line 219
    iput v3, p0, Ll/᩺֡ۧ;->ܿ:I

    return v1

    :cond_0
    const/16 v1, 0x8

    .line 223
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v2, 0x10

    .line 224
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    const/4 v5, 0x5

    .line 225
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 226
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    iput-boolean v5, p0, Ll/᩺֡ۧ;->ۧ:Z

    const/4 v5, 0x2

    .line 227
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 228
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    iput-boolean v5, p0, Ll/᩺֡ۧ;->᩻:Z

    .line 229
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    iput-boolean v5, p0, Ll/᩺֡ۧ;->ܽ:Z

    const/4 v5, 0x6

    .line 232
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 233
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    iput v0, p0, Ll/᩺֡ۧ;->ᩳ:I

    if-nez v2, :cond_1

    .line 236
    iput v3, p0, Ll/᩺֡ۧ;->ܿ:I

    return v4

    :cond_1
    add-int/lit8 v2, v2, -0x3

    sub-int/2addr v2, v0

    .line 238
    iput v2, p0, Ll/᩺֡ۧ;->ܿ:I

    if-gez v2, :cond_2

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Found negative packet payload size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩺֡ۧ;->ܿ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 245
    iput v3, p0, Ll/᩺֡ۧ;->ܿ:I

    :cond_2
    return v4
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 82
    iput v0, p0, Ll/᩺֡ۧ;->ۢ:I

    .line 83
    iput v0, p0, Ll/᩺֡ۧ;->֫:I

    .line 84
    iput-boolean v0, p0, Ll/᩺֡ۧ;->᩷:Z

    .line 85
    iget-object v0, p0, Ll/᩺֡ۧ;->ۜ:Ll/ܺ֡ۧ;

    invoke-interface {v0}, Ll/ܺ֡ۧ;->֫()V

    return-void
.end method

.method public final ֫(ILl/ᩳ֨֫;)V
    .locals 12

    .line 90
    iget-object v0, p0, Ll/᩺֡ۧ;->ܺ:Ll/ۢ֨֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x2

    .line 92
    iget-object v3, p0, Ll/᩺֡ۧ;->ۜ:Ll/ܺ֡ۧ;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v0, :cond_5

    .line 93
    iget v0, p0, Ll/᩺֡ۧ;->ۢ:I

    if-eqz v0, :cond_4

    if-eq v0, v6, :cond_4

    if-eq v0, v2, :cond_3

    if-ne v0, v4, :cond_2

    .line 106
    iget v0, p0, Ll/᩺֡ۧ;->ܿ:I

    if-eq v0, v1, :cond_0

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v7, "Unexpected start indicator: expected "

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v7, p0, Ll/᩺֡ۧ;->ܿ:I

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " more bytes"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 110
    :cond_0
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܿ()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 111
    :goto_0
    invoke-interface {v3, v0}, Ll/ܺ֡ۧ;->֫(Z)V

    goto :goto_1

    .line 114
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_3
    const-string v0, "Unexpected start indicator reading extended header"

    .line 99
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 185
    :cond_4
    :goto_1
    iput v6, p0, Ll/᩺֡ۧ;->ۢ:I

    .line 186
    iput v5, p0, Ll/᩺֡ۧ;->֫:I

    .line 119
    :cond_5
    :goto_2
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-lez v0, :cond_11

    .line 120
    iget v0, p0, Ll/᩺֡ۧ;->ۢ:I

    if-eqz v0, :cond_f

    iget-object v7, p0, Ll/᩺֡ۧ;->ܳ:Ll/ܽ֨֫;

    if-eq v0, v6, :cond_d

    if-eq v0, v2, :cond_9

    if-ne v0, v4, :cond_8

    .line 141
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    .line 142
    iget v2, p0, Ll/᩺֡ۧ;->ܿ:I

    if-ne v2, v1, :cond_6

    const/4 v2, 0x0

    goto :goto_3

    :cond_6
    sub-int v2, v0, v2

    :goto_3
    if-lez v2, :cond_7

    sub-int/2addr v0, v2

    .line 145
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p2, v2}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 147
    :cond_7
    invoke-interface {v3, p2}, Ll/ܺ֡ۧ;->֫(Ll/ᩳ֨֫;)V

    .line 148
    iget v2, p0, Ll/᩺֡ۧ;->ܿ:I

    if-eq v2, v1, :cond_10

    sub-int/2addr v2, v0

    .line 149
    iput v2, p0, Ll/᩺֡ۧ;->ܿ:I

    if-nez v2, :cond_10

    .line 152
    invoke-interface {v3, v5}, Ll/ܺ֡ۧ;->֫(Z)V

    .line 185
    iput v6, p0, Ll/᩺֡ۧ;->ۢ:I

    goto/16 :goto_5

    .line 158
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_9
    const/16 v0, 0xa

    .line 130
    iget v1, p0, Ll/᩺֡ۧ;->ᩳ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 132
    iget-object v1, v7, Ll/ܽ֨֫;->ᩳ:[B

    invoke-direct {p0, p2, v1, v0}, Ll/᩺֡ۧ;->֫(Ll/ᩳ֨֫;[BI)Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x0

    iget v1, p0, Ll/᩺֡ۧ;->ᩳ:I

    .line 133
    invoke-direct {p0, p2, v0, v1}, Ll/᩺֡ۧ;->֫(Ll/ᩳ֨֫;[BI)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 253
    invoke-virtual {v7, v5}, Ll/ܽ֨֫;->ᩳ(I)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 254
    iput-wide v0, p0, Ll/᩺֡ۧ;->ۡ:J

    .line 255
    iget-boolean v0, p0, Ll/᩺֡ۧ;->᩻:Z

    const/4 v1, 0x4

    if-eqz v0, :cond_b

    .line 256
    invoke-virtual {v7, v1}, Ll/ܽ֨֫;->ܿ(I)V

    .line 257
    invoke-virtual {v7, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    int-to-long v8, v0

    const/16 v0, 0x1e

    shl-long/2addr v8, v0

    .line 258
    invoke-virtual {v7, v6}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v2, 0xf

    .line 259
    invoke-virtual {v7, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    shl-int/2addr v10, v2

    int-to-long v10, v10

    or-long/2addr v8, v10

    .line 260
    invoke-virtual {v7, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 261
    invoke-virtual {v7, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    int-to-long v10, v10

    or-long/2addr v8, v10

    .line 262
    invoke-virtual {v7, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 263
    iget-boolean v10, p0, Ll/᩺֡ۧ;->᩷:Z

    if-nez v10, :cond_a

    iget-boolean v10, p0, Ll/᩺֡ۧ;->ܽ:Z

    if-eqz v10, :cond_a

    .line 264
    invoke-virtual {v7, v1}, Ll/ܽ֨֫;->ܿ(I)V

    .line 265
    invoke-virtual {v7, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    int-to-long v10, v1

    shl-long v0, v10, v0

    .line 266
    invoke-virtual {v7, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 267
    invoke-virtual {v7, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    shl-int/2addr v10, v2

    int-to-long v10, v10

    or-long/2addr v0, v10

    .line 268
    invoke-virtual {v7, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 269
    invoke-virtual {v7, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    int-to-long v10, v2

    or-long/2addr v0, v10

    .line 270
    invoke-virtual {v7, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 276
    iget-object v2, p0, Ll/᩺֡ۧ;->ܺ:Ll/ۢ֨֫;

    invoke-virtual {v2, v0, v1}, Ll/ۢ֨֫;->ۧ(J)J

    .line 277
    iput-boolean v6, p0, Ll/᩺֡ۧ;->᩷:Z

    .line 279
    :cond_a
    iget-object v0, p0, Ll/᩺֡ۧ;->ܺ:Ll/ۢ֨֫;

    invoke-virtual {v0, v8, v9}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩺֡ۧ;->ۡ:J

    .line 135
    :cond_b
    iget-boolean v0, p0, Ll/᩺֡ۧ;->ۧ:Z

    if-eqz v0, :cond_c

    const/4 v0, 0x4

    goto :goto_4

    :cond_c
    const/4 v0, 0x0

    :goto_4
    or-int/2addr p1, v0

    .line 136
    iget-wide v0, p0, Ll/᩺֡ۧ;->ۡ:J

    invoke-interface {v3, p1, v0, v1}, Ll/ܺ֡ۧ;->֫(IJ)V

    .line 185
    iput v4, p0, Ll/᩺֡ۧ;->ۢ:I

    .line 186
    :goto_5
    iput v5, p0, Ll/᩺֡ۧ;->֫:I

    goto :goto_7

    .line 125
    :cond_d
    iget-object v0, v7, Ll/ܽ֨֫;->ᩳ:[B

    const/16 v1, 0x9

    invoke-direct {p0, p2, v0, v1}, Ll/᩺֡ۧ;->֫(Ll/ᩳ֨֫;[BI)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 126
    invoke-direct {p0}, Ll/᩺֡ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x2

    goto :goto_6

    :cond_e
    const/4 v0, 0x0

    .line 185
    :goto_6
    iput v0, p0, Ll/᩺֡ۧ;->ۢ:I

    goto :goto_5

    .line 122
    :cond_f
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    invoke-virtual {p2, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    :cond_10
    :goto_7
    const/4 v1, -0x1

    const/4 v2, 0x2

    goto/16 :goto_2

    :cond_11
    return-void
.end method

.method public final ֫(Ll/ۢ֨֫;Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 0

    .line 74
    iput-object p1, p0, Ll/᩺֡ۧ;->ܺ:Ll/ۢ֨֫;

    .line 75
    iget-object p1, p0, Ll/᩺֡ۧ;->ۜ:Ll/ܺ֡ۧ;

    invoke-interface {p1, p2, p3}, Ll/ܺ֡ۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    return-void
.end method

.method public final ֫(Z)Z
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 177
    invoke-direct {p0}, Ll/᩺֡ۧ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 178
    :goto_1
    iget v3, p0, Ll/᩺֡ۧ;->ۢ:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_3

    iget v3, p0, Ll/᩺֡ۧ;->ܿ:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/᩺֡ۧ;->ۜ:Ll/ܺ֡ۧ;

    instance-of p1, p1, Ll/ۘ֡ۧ;

    if-nez p1, :cond_3

    :cond_2
    if-eqz v2, :cond_3

    return v0

    :cond_3
    return v1
.end method
