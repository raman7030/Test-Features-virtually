.class public final Ll/ۙ֡ۧ;
.super Ljava/lang/Object;
.source "G8K6"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public ۖ:I

.field public ۘ:J

.field public final ۜ:Ll/ᩳ֨֫;

.field public ۡ:Ll/᩵ۢۧ;

.field public ۢ:Z

.field public ۧ:Ljava/lang/String;

.field public ܳ:Z

.field public final ܺ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:J

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:Ll/ܿۢۧ;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 73
    iput v0, p0, Ll/ۙ֡ۧ;->ۖ:I

    .line 75
    new-instance v1, Ll/ᩳ֨֫;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v1, p0, Ll/ۙ֡ۧ;->ۜ:Ll/ᩳ֨֫;

    .line 76
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    const/4 v2, -0x1

    aput-byte v2, v1, v0

    .line 77
    new-instance v0, Ll/ܿۢۧ;

    .line 52
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object v0, p0, Ll/ۙ֡ۧ;->᩻:Ll/ܿۢۧ;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    iput-wide v0, p0, Ll/ۙ֡ۧ;->ۘ:J

    .line 79
    iput-object p1, p0, Ll/ۙ֡ۧ;->᩷:Ljava/lang/String;

    .line 80
    iput p2, p0, Ll/ۙ֡ۧ;->ܺ:I

    .line 81
    iput-object p3, p0, Ll/ۙ֡ۧ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 86
    iput v0, p0, Ll/ۙ֡ۧ;->ۖ:I

    .line 87
    iput v0, p0, Ll/ۙ֡ۧ;->ܽ:I

    .line 88
    iput-boolean v0, p0, Ll/ۙ֡ۧ;->ۢ:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 89
    iput-wide v0, p0, Ll/ۙ֡ۧ;->ۘ:J

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 101
    iput-wide p2, p0, Ll/ۙ֡ۧ;->ۘ:J

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 12

    .line 106
    iget-object v0, p0, Ll/ۙ֡ۧ;->ۡ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 107
    :goto_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-lez v0, :cond_c

    .line 108
    iget v0, p0, Ll/ۙ֡ۧ;->ۖ:I

    iget-object v1, p0, Ll/ۙ֡ۧ;->ۜ:Ll/ᩳ֨֫;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_7

    if-eq v0, v4, :cond_3

    if-ne v0, v3, :cond_2

    .line 234
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    iget v1, p0, Ll/ۙ֡ۧ;->ܿ:I

    iget v3, p0, Ll/ۙ֡ۧ;->ܽ:I

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 235
    iget-object v1, p0, Ll/ۙ֡ۧ;->ۡ:Ll/᩵ۢۧ;

    invoke-interface {v1, v0, p1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 236
    iget v1, p0, Ll/ۙ֡ۧ;->ܽ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۙ֡ۧ;->ܽ:I

    .line 237
    iget v0, p0, Ll/ۙ֡ۧ;->ܿ:I

    if-ge v1, v0, :cond_0

    goto :goto_0

    .line 243
    :cond_0
    iget-wide v0, p0, Ll/ۙ֡ۧ;->ۘ:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v0, v5

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    invoke-static {v4}, Ll/᩺֡֫;->ۧ(Z)V

    .line 244
    iget-object v5, p0, Ll/ۙ֡ۧ;->ۡ:Ll/᩵ۢۧ;

    iget-wide v6, p0, Ll/ۙ֡ۧ;->ۘ:J

    iget v9, p0, Ll/ۙ֡ۧ;->ܿ:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x1

    invoke-interface/range {v5 .. v11}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 245
    iget-wide v0, p0, Ll/ۙ֡ۧ;->ۘ:J

    iget-wide v3, p0, Ll/ۙ֡ۧ;->ᩳ:J

    add-long/2addr v0, v3

    iput-wide v0, p0, Ll/ۙ֡ۧ;->ۘ:J

    .line 246
    iput v2, p0, Ll/ۙ֡ۧ;->ܽ:I

    .line 247
    iput v2, p0, Ll/ۙ֡ۧ;->ۖ:I

    goto :goto_0

    .line 119
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 180
    :cond_3
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    iget v5, p0, Ll/ۙ֡ۧ;->ܽ:I

    const/4 v6, 0x4

    rsub-int/lit8 v5, v5, 0x4

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 181
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    iget v7, p0, Ll/ۙ֡ۧ;->ܽ:I

    invoke-virtual {p1, v7, v0, v5}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 182
    iget v5, p0, Ll/ۙ֡ۧ;->ܽ:I

    add-int/2addr v5, v0

    iput v5, p0, Ll/ۙ֡ۧ;->ܽ:I

    if-ge v5, v6, :cond_4

    goto :goto_0

    .line 188
    :cond_4
    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 189
    invoke-virtual {v1}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    iget-object v5, p0, Ll/ۙ֡ۧ;->᩻:Ll/ܿۢۧ;

    invoke-virtual {v5, v0}, Ll/ܿۢۧ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_5

    .line 192
    iput v2, p0, Ll/ۙ֡ۧ;->ܽ:I

    .line 193
    iput v4, p0, Ll/ۙ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 197
    :cond_5
    iget v0, v5, Ll/ܿۢۧ;->ܽ:I

    iput v0, p0, Ll/ۙ֡ۧ;->ܿ:I

    .line 198
    iget-boolean v0, p0, Ll/ۙ֡ۧ;->ܳ:Z

    if-nez v0, :cond_6

    .line 199
    iget v0, v5, Ll/ܿۢۧ;->ܳ:I

    int-to-long v7, v0

    const-wide/32 v9, 0xf4240

    mul-long v7, v7, v9

    iget v0, v5, Ll/ܿۢۧ;->ܿ:I

    int-to-long v9, v0

    div-long/2addr v7, v9

    iput-wide v7, p0, Ll/ۙ֡ۧ;->ᩳ:J

    .line 200
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    iget-object v7, p0, Ll/ۙ֡ۧ;->ۧ:Ljava/lang/String;

    .line 202
    invoke-virtual {v0, v7}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    iget-object v7, p0, Ll/ۙ֡ۧ;->֫:Ljava/lang/String;

    .line 203
    invoke-virtual {v0, v7}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    iget-object v7, v5, Ll/ܿۢۧ;->ᩳ:Ljava/lang/String;

    .line 204
    invoke-virtual {v0, v7}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    const/16 v7, 0x1000

    .line 205
    invoke-virtual {v0, v7}, Ll/֨ᩴ֫;->ۖ(I)V

    iget v7, v5, Ll/ܿۢۧ;->ۧ:I

    .line 206
    invoke-virtual {v0, v7}, Ll/֨ᩴ֫;->ᩳ(I)V

    iget v5, v5, Ll/ܿۢۧ;->ܿ:I

    .line 207
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->۠(I)V

    iget-object v5, p0, Ll/ۙ֡ۧ;->᩷:Ljava/lang/String;

    .line 208
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget v5, p0, Ll/ۙ֡ۧ;->ܺ:I

    .line 209
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 210
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 211
    iget-object v5, p0, Ll/ۙ֡ۧ;->ۡ:Ll/᩵ۢۧ;

    invoke-interface {v5, v0}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 212
    iput-boolean v4, p0, Ll/ۙ֡ۧ;->ܳ:Z

    .line 215
    :cond_6
    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 216
    iget-object v0, p0, Ll/ۙ֡ۧ;->ۡ:Ll/᩵ۢۧ;

    invoke-interface {v0, v6, v1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 217
    iput v3, p0, Ll/ۙ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 142
    :cond_7
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    .line 143
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v5

    .line 144
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v6

    :goto_2
    if-ge v5, v6, :cond_b

    .line 146
    aget-byte v7, v0, v5

    and-int/lit16 v8, v7, 0xff

    const/16 v9, 0xff

    if-ne v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_3

    :cond_8
    const/4 v8, 0x0

    .line 147
    :goto_3
    iget-boolean v9, p0, Ll/ۙ֡ۧ;->ۢ:Z

    if-eqz v9, :cond_9

    and-int/lit16 v7, v7, 0xe0

    const/16 v9, 0xe0

    if-ne v7, v9, :cond_9

    const/4 v7, 0x1

    goto :goto_4

    :cond_9
    const/4 v7, 0x0

    .line 148
    :goto_4
    iput-boolean v8, p0, Ll/ۙ֡ۧ;->ۢ:Z

    if-eqz v7, :cond_a

    add-int/lit8 v6, v5, 0x1

    .line 150
    invoke-virtual {p1, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 152
    iput-boolean v2, p0, Ll/ۙ֡ۧ;->ۢ:Z

    .line 153
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    aget-byte v0, v0, v5

    aput-byte v0, v1, v4

    .line 154
    iput v3, p0, Ll/ۙ֡ۧ;->ܽ:I

    .line 155
    iput v4, p0, Ll/ۙ֡ۧ;->ۖ:I

    goto/16 :goto_0

    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 159
    :cond_b
    invoke-virtual {p1, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_0

    :cond_c
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 1

    .line 94
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 95
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۙ֡ۧ;->ۧ:Ljava/lang/String;

    .line 96
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ֡ۧ;->ۡ:Ll/᩵ۢۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method
