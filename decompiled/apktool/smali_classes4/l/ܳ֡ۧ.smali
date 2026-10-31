.class public final Ll/ܳ֡ۧ;
.super Ljava/lang/Object;
.source "88JO"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public ֫:I

.field public ۖ:I

.field public ۘ:I

.field public final ۜ:Ljava/lang/String;

.field public final ۡ:I

.field public ۢ:Ll/᩵ۢۧ;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ll/ܽ֨֫;

.field public ܺ:J

.field public ܽ:Ll/۠ᩴ֫;

.field public ܿ:Z

.field public ᩳ:Ljava/lang/String;

.field public ᩴ:J

.field public ᩷:Z

.field public final ᩻:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance v0, Ll/ܽ֨֫;

    const/16 v1, 0x10

    new-array v2, v1, [B

    .line 48
    invoke-direct {v0, v2, v1}, Ll/ܽ֨֫;-><init>([BI)V

    .line 99
    iput-object v0, p0, Ll/ܳ֡ۧ;->ܳ:Ll/ܽ֨֫;

    .line 100
    new-instance v1, Ll/ᩳ֨֫;

    iget-object v0, v0, Ll/ܽ֨֫;->ᩳ:[B

    invoke-direct {v1, v0}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object v1, p0, Ll/ܳ֡ۧ;->᩻:Ll/ᩳ֨֫;

    const/4 v0, 0x0

    .line 101
    iput v0, p0, Ll/ܳ֡ۧ;->ۘ:I

    .line 102
    iput v0, p0, Ll/ܳ֡ۧ;->֫:I

    .line 103
    iput-boolean v0, p0, Ll/ܳ֡ۧ;->᩷:Z

    .line 104
    iput-boolean v0, p0, Ll/ܳ֡ۧ;->ܿ:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 105
    iput-wide v0, p0, Ll/ܳ֡ۧ;->ᩴ:J

    .line 106
    iput-object p1, p0, Ll/ܳ֡ۧ;->ۜ:Ljava/lang/String;

    .line 107
    iput p2, p0, Ll/ܳ֡ۧ;->ۡ:I

    .line 108
    iput-object p3, p0, Ll/ܳ֡ۧ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 113
    iput v0, p0, Ll/ܳ֡ۧ;->ۘ:I

    .line 114
    iput v0, p0, Ll/ܳ֡ۧ;->֫:I

    .line 115
    iput-boolean v0, p0, Ll/ܳ֡ۧ;->᩷:Z

    .line 116
    iput-boolean v0, p0, Ll/ܳ֡ۧ;->ܿ:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 117
    iput-wide v0, p0, Ll/ܳ֡ۧ;->ᩴ:J

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 129
    iput-wide p2, p0, Ll/ܳ֡ۧ;->ᩴ:J

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 12

    .line 134
    iget-object v0, p0, Ll/ܳ֡ۧ;->ۢ:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 135
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-lez v0, :cond_d

    .line 136
    iget v0, p0, Ll/ܳ֡ۧ;->ۘ:I

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ܳ֡ۧ;->᩻:Ll/ᩳ֨֫;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_6

    if-eq v0, v3, :cond_3

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 154
    :cond_1
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    iget v1, p0, Ll/ܳ֡ۧ;->ۖ:I

    iget v2, p0, Ll/ܳ֡ۧ;->֫:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 155
    iget-object v1, p0, Ll/ܳ֡ۧ;->ۢ:Ll/᩵ۢۧ;

    invoke-interface {v1, v0, p1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 156
    iget v1, p0, Ll/ܳ֡ۧ;->֫:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ܳ֡ۧ;->֫:I

    .line 157
    iget v0, p0, Ll/ܳ֡ۧ;->ۖ:I

    if-ne v1, v0, :cond_0

    .line 159
    iget-wide v0, p0, Ll/ܳ֡ۧ;->ᩴ:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v5

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    .line 160
    iget-object v5, p0, Ll/ܳ֡ۧ;->ۢ:Ll/᩵ۢۧ;

    iget-wide v6, p0, Ll/ܳ֡ۧ;->ᩴ:J

    iget v9, p0, Ll/ܳ֡ۧ;->ۖ:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x1

    invoke-interface/range {v5 .. v11}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 161
    iget-wide v0, p0, Ll/ܳ֡ۧ;->ᩴ:J

    iget-wide v2, p0, Ll/ܳ֡ۧ;->ܺ:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܳ֡ۧ;->ᩴ:J

    .line 162
    iput v4, p0, Ll/ܳ֡ۧ;->ۘ:I

    goto :goto_0

    .line 146
    :cond_3
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    .line 186
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    iget v5, p0, Ll/ܳ֡ۧ;->֫:I

    const/16 v6, 0x10

    rsub-int/lit8 v5, v5, 0x10

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 187
    iget v5, p0, Ll/ܳ֡ۧ;->֫:I

    invoke-virtual {p1, v5, v3, v0}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 188
    iget v0, p0, Ll/ܳ֡ۧ;->֫:I

    add-int/2addr v0, v3

    iput v0, p0, Ll/ܳ֡ۧ;->֫:I

    if-ne v0, v6, :cond_0

    .line 218
    iget-object v0, p0, Ll/ܳ֡ۧ;->ܳ:Ll/ܽ֨֫;

    invoke-virtual {v0, v4}, Ll/ܽ֨֫;->ᩳ(I)V

    .line 219
    invoke-static {v0}, Ll/ܰۜۧ;->֫(Ll/ܽ֨֫;)Ll/᩺ۜۧ;

    move-result-object v0

    iget v3, v0, Ll/᩺ۜۧ;->ܽ:I

    .line 220
    iget-object v5, p0, Ll/ܳ֡ۧ;->ܽ:Ll/۠ᩴ֫;

    const-string v7, "audio/ac4"

    if-eqz v5, :cond_4

    iget v8, v5, Ll/۠ᩴ֫;->ܿ:I

    if-ne v1, v8, :cond_4

    iget v8, v5, Ll/۠ᩴ֫;->ܽ֫:I

    if-ne v3, v8, :cond_4

    iget-object v5, v5, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 223
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 224
    :cond_4
    new-instance v5, Ll/֨ᩴ֫;

    invoke-direct {v5}, Ll/֨ᩴ֫;-><init>()V

    iget-object v8, p0, Ll/ܳ֡ۧ;->ᩳ:Ljava/lang/String;

    .line 226
    invoke-virtual {v5, v8}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    iget-object v8, p0, Ll/ܳ֡ۧ;->ۧ:Ljava/lang/String;

    .line 227
    invoke-virtual {v5, v8}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 228
    invoke-virtual {v5, v7}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 229
    invoke-virtual {v5, v1}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 230
    invoke-virtual {v5, v3}, Ll/֨ᩴ֫;->۠(I)V

    iget-object v3, p0, Ll/ܳ֡ۧ;->ۜ:Ljava/lang/String;

    .line 231
    invoke-virtual {v5, v3}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget v3, p0, Ll/ܳ֡ۧ;->ۡ:I

    .line 232
    invoke-virtual {v5, v3}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 233
    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v3

    iput-object v3, p0, Ll/ܳ֡ۧ;->ܽ:Ll/۠ᩴ֫;

    .line 234
    iget-object v5, p0, Ll/ܳ֡ۧ;->ۢ:Ll/᩵ۢۧ;

    invoke-interface {v5, v3}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 236
    :cond_5
    iget v3, v0, Ll/᩺ۜۧ;->֫:I

    iput v3, p0, Ll/ܳ֡ۧ;->ۖ:I

    .line 239
    iget v0, v0, Ll/᩺ۜۧ;->ۧ:I

    int-to-long v7, v0

    const-wide/32 v9, 0xf4240

    mul-long v7, v7, v9

    iget-object v0, p0, Ll/ܳ֡ۧ;->ܽ:Ll/۠ᩴ֫;

    iget v0, v0, Ll/۠ᩴ֫;->ܽ֫:I

    int-to-long v9, v0

    div-long/2addr v7, v9

    iput-wide v7, p0, Ll/ܳ֡ۧ;->ܺ:J

    .line 148
    invoke-virtual {v2, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 149
    iget-object v0, p0, Ll/ܳ֡ۧ;->ۢ:Ll/᩵ۢۧ;

    invoke-interface {v0, v6, v2}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 150
    iput v1, p0, Ll/ܳ֡ۧ;->ۘ:I

    goto/16 :goto_0

    .line 200
    :cond_6
    :goto_2
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-lez v0, :cond_0

    .line 201
    iget-boolean v0, p0, Ll/ܳ֡ۧ;->᩷:Z

    const/16 v5, 0xac

    if-nez v0, :cond_8

    .line 202
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    if-ne v0, v5, :cond_7

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Ll/ܳ֡ۧ;->᩷:Z

    goto :goto_2

    .line 205
    :cond_8
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    if-ne v0, v5, :cond_9

    const/4 v5, 0x1

    goto :goto_4

    :cond_9
    const/4 v5, 0x0

    .line 206
    :goto_4
    iput-boolean v5, p0, Ll/ܳ֡ۧ;->᩷:Z

    const/16 v5, 0x40

    const/16 v6, 0x41

    if-eq v0, v5, :cond_a

    if-ne v0, v6, :cond_6

    :cond_a
    if-ne v0, v6, :cond_b

    const/4 v0, 0x1

    goto :goto_5

    :cond_b
    const/4 v0, 0x0

    .line 208
    :goto_5
    iput-boolean v0, p0, Ll/ܳ֡ۧ;->ܿ:Z

    .line 139
    iput v3, p0, Ll/ܳ֡ۧ;->ۘ:I

    .line 140
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    const/16 v6, -0x54

    aput-byte v6, v0, v4

    .line 141
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    iget-boolean v2, p0, Ll/ܳ֡ۧ;->ܿ:Z

    if-eqz v2, :cond_c

    const/16 v5, 0x41

    :cond_c
    int-to-byte v2, v5

    aput-byte v2, v0, v3

    .line 142
    iput v1, p0, Ll/ܳ֡ۧ;->֫:I

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 1

    .line 122
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 123
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳ֡ۧ;->ᩳ:Ljava/lang/String;

    .line 124
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ֡ۧ;->ۢ:Ll/᩵ۢۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method
