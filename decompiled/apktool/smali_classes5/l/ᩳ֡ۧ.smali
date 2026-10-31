.class public final Ll/ᩳ֡ۧ;
.super Ljava/lang/Object;
.source "F8S4"

# interfaces
.implements Ll/ܺ֡ۧ;


# instance fields
.field public ֫:I

.field public ۖ:I

.field public ۘ:J

.field public ۜ:Z

.field public ۡ:J

.field public final ۢ:I

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ll/ᩳ֨֫;

.field public ܺ:I

.field public ܽ:Ll/۠ᩴ֫;

.field public final ܿ:Ll/ܽ֨֫;

.field public ᩳ:Ljava/lang/String;

.field public ᩷:Ll/᩵ۢۧ;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 89
    invoke-direct {p0, v0, v1, p1}, Ll/ᩳ֡ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance v0, Ll/ܽ֨֫;

    const/16 v1, 0x80

    new-array v2, v1, [B

    .line 48
    invoke-direct {v0, v2, v1}, Ll/ܽ֨֫;-><init>([BI)V

    .line 101
    iput-object v0, p0, Ll/ᩳ֡ۧ;->ܿ:Ll/ܽ֨֫;

    .line 102
    new-instance v1, Ll/ᩳ֨֫;

    iget-object v0, v0, Ll/ܽ֨֫;->ᩳ:[B

    invoke-direct {v1, v0}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object v1, p0, Ll/ᩳ֡ۧ;->ܳ:Ll/ᩳ֨֫;

    const/4 v0, 0x0

    .line 103
    iput v0, p0, Ll/ᩳ֡ۧ;->ۖ:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 104
    iput-wide v0, p0, Ll/ᩳ֡ۧ;->ۘ:J

    .line 105
    iput-object p1, p0, Ll/ᩳ֡ۧ;->᩻:Ljava/lang/String;

    .line 106
    iput p2, p0, Ll/ᩳ֡ۧ;->ۢ:I

    .line 107
    iput-object p3, p0, Ll/ᩳ֡ۧ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 112
    iput v0, p0, Ll/ᩳ֡ۧ;->ۖ:I

    .line 113
    iput v0, p0, Ll/ᩳ֡ۧ;->֫:I

    .line 114
    iput-boolean v0, p0, Ll/ᩳ֡ۧ;->ۜ:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 115
    iput-wide v0, p0, Ll/ᩳ֡ۧ;->ۘ:J

    return-void
.end method

.method public final ֫(IJ)V
    .locals 0

    .line 127
    iput-wide p2, p0, Ll/ᩳ֡ۧ;->ۘ:J

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 12

    .line 132
    iget-object v0, p0, Ll/ᩳ֡ۧ;->᩷:Ll/᩵ۢۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 133
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-lez v0, :cond_c

    .line 134
    iget v0, p0, Ll/ᩳ֡ۧ;->ۖ:I

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ᩳ֡ۧ;->ܳ:Ll/ᩳ֨֫;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_7

    if-eq v0, v3, :cond_3

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 152
    :cond_1
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    iget v1, p0, Ll/ᩳ֡ۧ;->ܺ:I

    iget v2, p0, Ll/ᩳ֡ۧ;->֫:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 153
    iget-object v1, p0, Ll/ᩳ֡ۧ;->᩷:Ll/᩵ۢۧ;

    invoke-interface {v1, v0, p1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 154
    iget v1, p0, Ll/ᩳ֡ۧ;->֫:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ᩳ֡ۧ;->֫:I

    .line 155
    iget v0, p0, Ll/ᩳ֡ۧ;->ܺ:I

    if-ne v1, v0, :cond_0

    .line 157
    iget-wide v0, p0, Ll/ᩳ֡ۧ;->ۘ:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v5

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    .line 158
    iget-object v5, p0, Ll/ᩳ֡ۧ;->᩷:Ll/᩵ۢۧ;

    iget-wide v6, p0, Ll/ᩳ֡ۧ;->ۘ:J

    iget v9, p0, Ll/ᩳ֡ۧ;->ܺ:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x1

    invoke-interface/range {v5 .. v11}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 159
    iget-wide v0, p0, Ll/ᩳ֡ۧ;->ۘ:J

    iget-wide v2, p0, Ll/ᩳ֡ۧ;->ۡ:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ᩳ֡ۧ;->ۘ:J

    .line 160
    iput v4, p0, Ll/ᩳ֡ۧ;->ۖ:I

    goto :goto_0

    .line 144
    :cond_3
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    .line 184
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    iget v5, p0, Ll/ᩳ֡ۧ;->֫:I

    const/16 v6, 0x80

    rsub-int v5, v5, 0x80

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 185
    iget v5, p0, Ll/ᩳ֡ۧ;->֫:I

    invoke-virtual {p1, v5, v3, v0}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 186
    iget v0, p0, Ll/ᩳ֡ۧ;->֫:I

    add-int/2addr v0, v3

    iput v0, p0, Ll/ᩳ֡ۧ;->֫:I

    if-ne v0, v6, :cond_0

    .line 217
    iget-object v0, p0, Ll/ᩳ֡ۧ;->ܿ:Ll/ܽ֨֫;

    invoke-virtual {v0, v4}, Ll/ܽ֨֫;->ᩳ(I)V

    .line 218
    invoke-static {v0}, Ll/ۛۜۧ;->֫(Ll/ܽ֨֫;)Ll/ۤۜۧ;

    move-result-object v0

    iget v3, v0, Ll/ۤۜۧ;->֫:I

    iget v5, v0, Ll/ۤۜۧ;->ܳ:I

    iget v7, v0, Ll/ۤۜۧ;->ۧ:I

    iget-object v8, v0, Ll/ۤۜۧ;->ᩳ:Ljava/lang/String;

    .line 219
    iget-object v9, p0, Ll/ᩳ֡ۧ;->ܽ:Ll/۠ᩴ֫;

    if-eqz v9, :cond_4

    iget v10, v9, Ll/۠ᩴ֫;->ܿ:I

    if-ne v7, v10, :cond_4

    iget v10, v9, Ll/۠ᩴ֫;->ܽ֫:I

    if-ne v5, v10, :cond_4

    iget-object v9, v9, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 222
    invoke-static {v8, v9}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    .line 223
    :cond_4
    new-instance v9, Ll/֨ᩴ֫;

    invoke-direct {v9}, Ll/֨ᩴ֫;-><init>()V

    iget-object v10, p0, Ll/ᩳ֡ۧ;->ᩳ:Ljava/lang/String;

    .line 225
    invoke-virtual {v9, v10}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    iget-object v10, p0, Ll/ᩳ֡ۧ;->ۧ:Ljava/lang/String;

    .line 226
    invoke-virtual {v9, v10}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 227
    invoke-virtual {v9, v8}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 228
    invoke-virtual {v9, v7}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 229
    invoke-virtual {v9, v5}, Ll/֨ᩴ֫;->۠(I)V

    iget-object v5, p0, Ll/ᩳ֡ۧ;->᩻:Ljava/lang/String;

    .line 230
    invoke-virtual {v9, v5}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget v5, p0, Ll/ᩳ֡ۧ;->ۢ:I

    .line 231
    invoke-virtual {v9, v5}, Ll/֨ᩴ֫;->ۚ(I)V

    .line 232
    invoke-virtual {v9, v3}, Ll/֨ᩴ֫;->֡(I)V

    const-string v5, "audio/ac3"

    .line 234
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 235
    invoke-virtual {v9, v3}, Ll/֨ᩴ֫;->ܽ(I)V

    .line 237
    :cond_5
    invoke-virtual {v9}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v3

    iput-object v3, p0, Ll/ᩳ֡ۧ;->ܽ:Ll/۠ᩴ֫;

    .line 238
    iget-object v5, p0, Ll/ᩳ֡ۧ;->᩷:Ll/᩵ۢۧ;

    invoke-interface {v5, v3}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 240
    :cond_6
    iget v3, v0, Ll/ۤۜۧ;->ܽ:I

    iput v3, p0, Ll/ᩳ֡ۧ;->ܺ:I

    .line 243
    iget v0, v0, Ll/ۤۜۧ;->ܿ:I

    int-to-long v7, v0

    const-wide/32 v9, 0xf4240

    mul-long v7, v7, v9

    iget-object v0, p0, Ll/ᩳ֡ۧ;->ܽ:Ll/۠ᩴ֫;

    iget v0, v0, Ll/۠ᩴ֫;->ܽ֫:I

    int-to-long v9, v0

    div-long/2addr v7, v9

    iput-wide v7, p0, Ll/ᩳ֡ۧ;->ۡ:J

    .line 146
    invoke-virtual {v2, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 147
    iget-object v0, p0, Ll/ᩳ֡ۧ;->᩷:Ll/᩵ۢۧ;

    invoke-interface {v0, v6, v2}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 148
    iput v1, p0, Ll/ᩳ֡ۧ;->ۖ:I

    goto/16 :goto_0

    .line 198
    :cond_7
    :goto_2
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-lez v0, :cond_0

    .line 199
    iget-boolean v0, p0, Ll/ᩳ֡ۧ;->ۜ:Z

    const/16 v5, 0xb

    if-nez v0, :cond_9

    .line 200
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    if-ne v0, v5, :cond_8

    const/4 v0, 0x1

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Ll/ᩳ֡ۧ;->ۜ:Z

    goto :goto_2

    .line 203
    :cond_9
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    const/16 v6, 0x77

    if-ne v0, v6, :cond_a

    .line 205
    iput-boolean v4, p0, Ll/ᩳ֡ۧ;->ۜ:Z

    .line 137
    iput v3, p0, Ll/ᩳ֡ۧ;->ۖ:I

    .line 138
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    aput-byte v5, v0, v4

    .line 139
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    aput-byte v6, v0, v3

    .line 140
    iput v1, p0, Ll/ᩳ֡ۧ;->֫:I

    goto/16 :goto_0

    :cond_a
    if-ne v0, v5, :cond_b

    const/4 v0, 0x1

    goto :goto_4

    :cond_b
    const/4 v0, 0x0

    .line 208
    :goto_4
    iput-boolean v0, p0, Ll/ᩳ֡ۧ;->ۜ:Z

    goto :goto_2

    :cond_c
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 1

    .line 120
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 121
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ֡ۧ;->ᩳ:Ljava/lang/String;

    .line 122
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ֡ۧ;->᩷:Ll/᩵ۢۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method
