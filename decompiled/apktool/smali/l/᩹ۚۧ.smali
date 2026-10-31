.class public final Ll/᩹ۚۧ;
.super Ljava/lang/Object;
.source "P8OA"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֫:J

.field public ۧ:I

.field public ܳ:I

.field public ܽ:Ll/᩸᩷ۧ;

.field public ܿ:J

.field public ᩳ:Ll/ܶۚۧ;

.field public ᩻:Ll/᩵ۢۧ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 93
    iput v0, p0, Ll/᩹ۚۧ;->ܳ:I

    const-wide/16 v0, -0x1

    .line 94
    iput-wide v0, p0, Ll/᩹ۚۧ;->ܿ:J

    const/4 v2, -0x1

    .line 95
    iput v2, p0, Ll/᩹ۚۧ;->ۧ:I

    .line 96
    iput-wide v0, p0, Ll/᩹ۚۧ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 150
    iget-object v2, v0, Ll/᩹ۚۧ;->᩻:Ll/᩵ۢۧ;

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 151
    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 128
    iget v2, v0, Ll/᩹ۚۧ;->ܳ:I

    const/4 v3, -0x1

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_10

    const/4 v7, 0x2

    const-wide/16 v8, -0x1

    if-eq v2, v5, :cond_e

    const/4 v10, 0x3

    if-eq v2, v7, :cond_6

    if-eq v2, v10, :cond_3

    if-ne v2, v4, :cond_2

    .line 231
    iget-wide v10, v0, Ll/᩹ۚۧ;->֫:J

    cmp-long v2, v10, v8

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-static {v5}, Ll/᩺֡֫;->ۧ(Z)V

    .line 232
    iget-wide v4, v0, Ll/᩹ۚۧ;->֫:J

    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v7

    sub-long/2addr v4, v7

    .line 233
    iget-object v2, v0, Ll/᩹ۚۧ;->ᩳ:Ll/ܶۚۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    invoke-interface {v2, v1, v4, v5}, Ll/ܶۚۧ;->֫(Ll/۠᩷ۧ;J)Z

    move-result v1

    if-eqz v1, :cond_1

    return v3

    :cond_1
    return v6

    .line 144
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 212
    :cond_3
    invoke-static/range {p1 .. p1}, Ll/ۗۚۧ;->ܽ(Ll/۠᩷ۧ;)Landroid/util/Pair;

    move-result-object v2

    .line 213
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    move-result v3

    iput v3, v0, Ll/᩹ۚۧ;->ۧ:I

    .line 214
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 215
    iget-wide v10, v0, Ll/᩹ۚۧ;->ܿ:J

    cmp-long v5, v10, v8

    if-eqz v5, :cond_4

    const-wide v12, 0xffffffffL

    cmp-long v5, v2, v12

    if-nez v5, :cond_4

    move-wide v2, v10

    .line 220
    :cond_4
    iget v5, v0, Ll/᩹ۚۧ;->ۧ:I

    int-to-long v10, v5

    add-long/2addr v10, v2

    iput-wide v10, v0, Ll/᩹ۚۧ;->֫:J

    .line 221
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v1

    cmp-long v3, v1, v8

    if-eqz v3, :cond_5

    .line 222
    iget-wide v7, v0, Ll/᩹ۚۧ;->֫:J

    cmp-long v3, v7, v1

    if-lez v3, :cond_5

    .line 223
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Data exceeds input length: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v7, v0, Ll/᩹ۚۧ;->֫:J

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 224
    iput-wide v1, v0, Ll/᩹ۚۧ;->֫:J

    .line 226
    :cond_5
    iget-object v1, v0, Ll/᩹ۚۧ;->ᩳ:Ll/ܶۚۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    iget v2, v0, Ll/᩹ۚۧ;->ۧ:I

    iget-wide v7, v0, Ll/᩹ۚۧ;->֫:J

    invoke-interface {v1, v2, v7, v8}, Ll/ܶۚۧ;->֫(IJ)V

    .line 227
    iput v4, v0, Ll/᩹ۚۧ;->ܳ:I

    return v6

    .line 177
    :cond_6
    invoke-static/range {p1 .. p1}, Ll/ۗۚۧ;->ۧ(Ll/۠᩷ۧ;)Ll/᩶ۚۧ;

    move-result-object v14

    .line 178
    iget v1, v14, Ll/᩶ۚۧ;->ᩳ:I

    const/16 v2, 0x11

    if-ne v1, v2, :cond_7

    .line 179
    new-instance v1, Ll/۠ۚۧ;

    iget-object v2, v0, Ll/᩹ۚۧ;->ܽ:Ll/᩸᩷ۧ;

    iget-object v3, v0, Ll/᩹ۚۧ;->᩻:Ll/᩵ۢۧ;

    invoke-direct {v1, v2, v3, v14}, Ll/۠ۚۧ;-><init>(Ll/᩸᩷ۧ;Ll/᩵ۢۧ;Ll/᩶ۚۧ;)V

    iput-object v1, v0, Ll/᩹ۚۧ;->ᩳ:Ll/ܶۚۧ;

    goto :goto_3

    :cond_7
    const/4 v2, 0x6

    if-ne v1, v2, :cond_8

    .line 181
    new-instance v1, Ll/᩸ۚۧ;

    iget-object v12, v0, Ll/᩹ۚۧ;->ܽ:Ll/᩸᩷ۧ;

    iget-object v13, v0, Ll/᩹ۚۧ;->᩻:Ll/᩵ۢۧ;

    const-string v15, "audio/g711-alaw"

    const/16 v16, -0x1

    move-object v11, v1

    invoke-direct/range {v11 .. v16}, Ll/᩸ۚۧ;-><init>(Ll/᩸᩷ۧ;Ll/᩵ۢۧ;Ll/᩶ۚۧ;Ljava/lang/String;I)V

    iput-object v1, v0, Ll/᩹ۚۧ;->ᩳ:Ll/ܶۚۧ;

    goto :goto_3

    :cond_8
    const/4 v2, 0x7

    if-ne v1, v2, :cond_9

    .line 189
    new-instance v1, Ll/᩸ۚۧ;

    iget-object v12, v0, Ll/᩹ۚۧ;->ܽ:Ll/᩸᩷ۧ;

    iget-object v13, v0, Ll/᩹ۚۧ;->᩻:Ll/᩵ۢۧ;

    const-string v15, "audio/g711-mlaw"

    const/16 v16, -0x1

    move-object v11, v1

    invoke-direct/range {v11 .. v16}, Ll/᩸ۚۧ;-><init>(Ll/᩸᩷ۧ;Ll/᩵ۢۧ;Ll/᩶ۚۧ;Ljava/lang/String;I)V

    iput-object v1, v0, Ll/᩹ۚۧ;->ᩳ:Ll/ܶۚۧ;

    goto :goto_3

    .line 198
    :cond_9
    iget v2, v14, Ll/᩶ۚۧ;->֫:I

    if-eq v1, v5, :cond_c

    if-eq v1, v10, :cond_a

    const v3, 0xfffe

    if-eq v1, v3, :cond_c

    goto :goto_1

    :cond_a
    const/16 v3, 0x20

    if-ne v2, v3, :cond_b

    const/4 v2, 0x4

    const/16 v16, 0x4

    goto :goto_2

    :cond_b
    :goto_1
    const/4 v2, 0x0

    const/16 v16, 0x0

    goto :goto_2

    .line 2233
    :cond_c
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v2, v3}, Ll/ۘ֨֫;->֫(ILjava/nio/ByteOrder;)I

    move-result v2

    move/from16 v16, v2

    :goto_2
    if-eqz v16, :cond_d

    .line 204
    new-instance v1, Ll/᩸ۚۧ;

    iget-object v12, v0, Ll/᩹ۚۧ;->ܽ:Ll/᩸᩷ۧ;

    iget-object v13, v0, Ll/᩹ۚۧ;->᩻:Ll/᩵ۢۧ;

    const-string v15, "audio/raw"

    move-object v11, v1

    invoke-direct/range {v11 .. v16}, Ll/᩸ۚۧ;-><init>(Ll/᩸᩷ۧ;Ll/᩵ۢۧ;Ll/᩶ۚۧ;Ljava/lang/String;I)V

    iput-object v1, v0, Ll/᩹ۚۧ;->ᩳ:Ll/ܶۚۧ;

    .line 208
    :goto_3
    iput v10, v0, Ll/᩹ۚۧ;->ܳ:I

    return v6

    .line 201
    :cond_d
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported WAV format type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 88
    :cond_e
    new-instance v2, Ll/ᩳ֨֫;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Ll/ᩳ֨֫;-><init>(I)V

    .line 89
    invoke-static {v1, v2}, Ll/ۙۚۧ;->֫(Ll/۠᩷ۧ;Ll/ᩳ֨֫;)Ll/ۙۚۧ;

    move-result-object v4

    .line 90
    iget v5, v4, Ll/ۙۚۧ;->֫:I

    const v10, 0x64733634

    if-eq v5, v10, :cond_f

    .line 91
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    goto :goto_4

    .line 94
    :cond_f
    invoke-interface {v1, v3}, Ll/۠᩷ۧ;->֫(I)V

    .line 95
    invoke-virtual {v2, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 96
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    invoke-interface {v1, v6, v3, v5}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 97
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۢ()J

    move-result-wide v8

    .line 98
    iget-wide v4, v4, Ll/ۙۚۧ;->ۧ:J

    long-to-int v2, v4

    add-int/2addr v2, v3

    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 171
    :goto_4
    iput-wide v8, v0, Ll/᩹ۚۧ;->ܿ:J

    .line 172
    iput v7, v0, Ll/᩹ۚۧ;->ܳ:I

    return v6

    .line 155
    :cond_10
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v2, v7, v9

    if-nez v2, :cond_11

    const/4 v2, 0x1

    goto :goto_5

    :cond_11
    const/4 v2, 0x0

    :goto_5
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    .line 156
    iget v2, v0, Ll/᩹ۚۧ;->ۧ:I

    if-eq v2, v3, :cond_12

    .line 157
    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 158
    iput v4, v0, Ll/᩹ۚۧ;->ܳ:I

    return v6

    .line 161
    :cond_12
    invoke-static/range {p1 .. p1}, Ll/ۗۚۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 166
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v2

    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v7

    sub-long/2addr v2, v7

    long-to-int v3, v2

    invoke-interface {v1, v3}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 167
    iput v5, v0, Ll/᩹ۚۧ;->ܳ:I

    return v6

    :cond_13
    const-string v1, "Unsupported or unrecognized wav file type."

    const/4 v2, 0x0

    .line 163
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    .line 113
    :goto_0
    iput p1, p0, Ll/᩹ۚۧ;->ܳ:I

    .line 114
    iget-object p1, p0, Ll/᩹ۚۧ;->ᩳ:Ll/ܶۚۧ;

    if-eqz p1, :cond_1

    .line 115
    invoke-interface {p1, p3, p4}, Ll/ܶۚۧ;->֫(J)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 2

    .line 106
    iput-object p1, p0, Ll/᩹ۚۧ;->ܽ:Ll/᩸᩷ۧ;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 107
    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ۚۧ;->᩻:Ll/᩵ۢۧ;

    .line 108
    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 0

    .line 101
    invoke-static {p1}, Ll/ۗۚۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result p1

    return p1
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
