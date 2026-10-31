.class public abstract Ll/ܶۘۧ;
.super Ljava/lang/Object;
.source "VA9Z"


# instance fields
.field public ֫:J

.field public ۖ:Ll/᩵ۢۧ;

.field public ۜ:I

.field public ۡ:I

.field public ۢ:Ll/֨ۘۧ;

.field public ۧ:Ll/᩸᩷ۧ;

.field public ܳ:Ll/֡ۘۧ;

.field public ܺ:J

.field public ܽ:Z

.field public final ܿ:Ll/ᩴۘۧ;

.field public ᩳ:J

.field public ᩷:Z

.field public ᩻:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ll/ᩴۘۧ;

    invoke-direct {v0}, Ll/ᩴۘۧ;-><init>()V

    iput-object v0, p0, Ll/ܶۘۧ;->ܿ:Ll/ᩴۘۧ;

    .line 67
    new-instance v0, Ll/֨ۘۧ;

    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object v0, p0, Ll/ܶۘۧ;->ۢ:Ll/֨ۘۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 21

    move-object/from16 v11, p0

    move-object/from16 v0, p1

    .line 134
    iget-object v1, v11, Ll/ܶۘۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 135
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 114
    iget v1, v11, Ll/ܶۘۧ;->ۡ:I

    const-wide/16 v2, -0x1

    iget-object v12, v11, Ll/ܶۘۧ;->ܿ:Ll/ᩴۘۧ;

    const/4 v13, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x3

    const/4 v14, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_9

    if-eq v1, v6, :cond_8

    if-eq v1, v14, :cond_1

    if-ne v1, v5, :cond_0

    return v4

    .line 128
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 122
    :cond_1
    iget-object v1, v11, Ll/ܶۘۧ;->ܳ:Ll/֡ۘۧ;

    .line 200
    invoke-interface {v1, v0}, Ll/֡ۘۧ;->֫(Ll/۠᩷ۧ;)J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v1, v7, v9

    if-ltz v1, :cond_2

    move-object/from16 v1, p2

    .line 202
    iput-wide v7, v1, Ll/᩻ۢۧ;->֫:J

    return v6

    :cond_2
    cmp-long v1, v7, v2

    if-gez v1, :cond_3

    const-wide/16 v14, 0x2

    add-long/2addr v7, v14

    neg-long v7, v7

    .line 205
    invoke-virtual {v11, v7, v8}, Ll/ܶۘۧ;->ܽ(J)V

    .line 208
    :cond_3
    iget-boolean v1, v11, Ll/ܶۘۧ;->᩷:Z

    if-nez v1, :cond_4

    .line 209
    iget-object v1, v11, Ll/ܶۘۧ;->ܳ:Ll/֡ۘۧ;

    invoke-interface {v1}, Ll/֡ۘۧ;->֫()Ll/ۢۢۧ;

    move-result-object v1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 210
    iget-object v7, v11, Ll/ܶۘۧ;->ۧ:Ll/᩸᩷ۧ;

    invoke-interface {v7, v1}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 211
    iget-object v7, v11, Ll/ܶۘۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-interface {v1}, Ll/ۢۢۧ;->ۜ()J

    move-result-wide v14

    invoke-interface {v7, v14, v15}, Ll/᩵ۢۧ;->֫(J)V

    .line 212
    iput-boolean v6, v11, Ll/ܶۘۧ;->᩷:Z

    .line 215
    :cond_4
    iget-wide v6, v11, Ll/ܶۘۧ;->ᩳ:J

    cmp-long v1, v6, v9

    if-gtz v1, :cond_6

    invoke-virtual {v12, v0}, Ll/ᩴۘۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    .line 228
    :cond_5
    iput v5, v11, Ll/ܶۘۧ;->ۡ:I

    return v4

    .line 216
    :cond_6
    :goto_0
    iput-wide v9, v11, Ll/ܶۘۧ;->ᩳ:J

    .line 217
    invoke-virtual {v12}, Ll/ᩴۘۧ;->ۧ()Ll/ᩳ֨֫;

    move-result-object v0

    .line 218
    invoke-virtual {v11, v0}, Ll/ܶۘۧ;->֫(Ll/ᩳ֨֫;)J

    move-result-wide v4

    cmp-long v1, v4, v9

    if-ltz v1, :cond_7

    .line 219
    iget-wide v6, v11, Ll/ܶۘۧ;->֫:J

    add-long v8, v6, v4

    iget-wide v14, v11, Ll/ܶۘۧ;->ܺ:J

    cmp-long v1, v8, v14

    if-ltz v1, :cond_7

    .line 221
    invoke-virtual {v11, v6, v7}, Ll/ܶۘۧ;->֫(J)J

    move-result-wide v15

    .line 222
    iget-object v1, v11, Ll/ܶۘۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v6

    invoke-interface {v1, v6, v0}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 223
    iget-object v14, v11, Ll/ܶۘۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v17, 0x1

    invoke-interface/range {v14 .. v20}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 224
    iput-wide v2, v11, Ll/ܶۘۧ;->ܺ:J

    .line 226
    :cond_7
    iget-wide v0, v11, Ll/ܶۘۧ;->֫:J

    add-long/2addr v0, v4

    iput-wide v0, v11, Ll/ܶۘۧ;->֫:J

    return v13

    .line 118
    :cond_8
    iget-wide v1, v11, Ll/ܶۘۧ;->᩻:J

    long-to-int v2, v1

    invoke-interface {v0, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 119
    iput v14, v11, Ll/ܶۘۧ;->ۡ:I

    return v13

    .line 149
    :cond_9
    :goto_1
    invoke-virtual {v12, v0}, Ll/ᩴۘۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 150
    iput v5, v11, Ll/ܶۘۧ;->ۡ:I

    return v4

    .line 153
    :cond_a
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v7

    iget-wide v9, v11, Ll/ܶۘۧ;->᩻:J

    sub-long/2addr v7, v9

    iput-wide v7, v11, Ll/ܶۘۧ;->ᩳ:J

    .line 155
    invoke-virtual {v12}, Ll/ᩴۘۧ;->ۧ()Ll/ᩳ֨֫;

    move-result-object v1

    iget-wide v7, v11, Ll/ܶۘۧ;->᩻:J

    iget-object v9, v11, Ll/ܶۘۧ;->ۢ:Ll/֨ۘۧ;

    invoke-virtual {v11, v1, v7, v8, v9}, Ll/ܶۘۧ;->֫(Ll/ᩳ֨֫;JLl/֨ۘۧ;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 156
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v7

    iput-wide v7, v11, Ll/ܶۘۧ;->᩻:J

    goto :goto_1

    .line 169
    :cond_b
    iget-object v1, v11, Ll/ܶۘۧ;->ۢ:Ll/֨ۘۧ;

    iget-object v1, v1, Ll/֨ۘۧ;->֫:Ll/۠ᩴ֫;

    iget v4, v1, Ll/۠ᩴ֫;->ܽ֫:I

    iput v4, v11, Ll/ܶۘۧ;->ۜ:I

    .line 170
    iget-boolean v4, v11, Ll/ܶۘۧ;->ܽ:Z

    if-nez v4, :cond_c

    .line 171
    iget-object v4, v11, Ll/ܶۘۧ;->ۖ:Ll/᩵ۢۧ;

    invoke-interface {v4, v1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 172
    iput-boolean v6, v11, Ll/ܶۘۧ;->ܽ:Z

    .line 175
    :cond_c
    iget-object v1, v11, Ll/ܶۘۧ;->ۢ:Ll/֨ۘۧ;

    iget-object v1, v1, Ll/֨ۘۧ;->ۧ:Ll/ܺۘۧ;

    if-eqz v1, :cond_d

    .line 176
    iput-object v1, v11, Ll/ܶۘۧ;->ܳ:Ll/֡ۘۧ;

    goto :goto_3

    .line 177
    :cond_d
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-nez v1, :cond_e

    .line 178
    new-instance v0, Ll/۠ۘۧ;

    .line 284
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 178
    iput-object v0, v11, Ll/ܶۘۧ;->ܳ:Ll/֡ۘۧ;

    goto :goto_3

    .line 180
    :cond_e
    invoke-virtual {v12}, Ll/ᩴۘۧ;->֫()Ll/᩵ۘۧ;

    move-result-object v1

    .line 181
    iget v2, v1, Ll/᩵ۘۧ;->᩻:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_f

    const/4 v2, 0x1

    const/4 v10, 0x1

    goto :goto_2

    :cond_f
    const/4 v2, 0x0

    const/4 v10, 0x0

    .line 182
    :goto_2
    new-instance v15, Ll/ۡۘۧ;

    iget-wide v2, v11, Ll/ܶۘۧ;->᩻:J

    .line 186
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v4

    iget v0, v1, Ll/᩵ۘۧ;->ܽ:I

    iget v6, v1, Ll/᩵ۘۧ;->֫:I

    add-int/2addr v0, v6

    int-to-long v6, v0

    iget-wide v8, v1, Ll/᩵ۘۧ;->ۧ:J

    move-object v0, v15

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v10}, Ll/ۡۘۧ;-><init>(Ll/ܶۘۧ;JJJJZ)V

    iput-object v15, v11, Ll/ܶۘۧ;->ܳ:Ll/֡ۘۧ;

    .line 192
    :goto_3
    iput v14, v11, Ll/ܶۘۧ;->ۡ:I

    .line 194
    invoke-virtual {v12}, Ll/ᩴۘۧ;->ᩳ()V

    return v13
.end method

.method public final ֫(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    .line 241
    iget v0, p0, Ll/ܶۘۧ;->ۜ:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public abstract ֫(Ll/ᩳ֨֫;)J
.end method

.method public final ֫(JJ)V
    .locals 3

    .line 97
    iget-object v0, p0, Ll/ܶۘۧ;->ܿ:Ll/ᩴۘۧ;

    invoke-virtual {v0}, Ll/ᩴۘۧ;->ܽ()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 99
    iget-boolean p1, p0, Ll/ܶۘۧ;->᩷:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Ll/ܶۘۧ;->֫(Z)V

    return-void

    .line 101
    :cond_0
    iget p1, p0, Ll/ܶۘۧ;->ۡ:I

    if-eqz p1, :cond_1

    .line 102
    invoke-virtual {p0, p3, p4}, Ll/ܶۘۧ;->ۧ(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ܶۘۧ;->ܺ:J

    .line 103
    iget-object p3, p0, Ll/ܶۘۧ;->ܳ:Ll/֡ۘۧ;

    sget-object p4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p3, p1, p2}, Ll/֡ۘۧ;->֫(J)V

    const/4 p1, 0x2

    .line 104
    iput p1, p0, Ll/ܶۘۧ;->ۡ:I

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۢۧ;)V
    .locals 0

    .line 71
    iput-object p1, p0, Ll/ܶۘۧ;->ۧ:Ll/᩸᩷ۧ;

    .line 72
    iput-object p2, p0, Ll/ܶۘۧ;->ۖ:Ll/᩵ۢۧ;

    const/4 p1, 0x1

    .line 73
    invoke-virtual {p0, p1}, Ll/ܶۘۧ;->֫(Z)V

    return-void
.end method

.method public ֫(Z)V
    .locals 4

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_0

    .line 83
    new-instance p1, Ll/֨ۘۧ;

    .line 45
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Ll/ܶۘۧ;->ۢ:Ll/֨ۘۧ;

    .line 84
    iput-wide v0, p0, Ll/ܶۘۧ;->᩻:J

    const/4 p1, 0x0

    .line 85
    iput p1, p0, Ll/ܶۘۧ;->ۡ:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 87
    iput p1, p0, Ll/ܶۘۧ;->ۡ:I

    :goto_0
    const-wide/16 v2, -0x1

    .line 89
    iput-wide v2, p0, Ll/ܶۘۧ;->ܺ:J

    .line 90
    iput-wide v0, p0, Ll/ܶۘۧ;->֫:J

    return-void
.end method

.method public abstract ֫(Ll/ᩳ֨֫;JLl/֨ۘۧ;)Z
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "#3.format"
        }
        result = false
    .end annotation
.end method

.method public final ۧ(J)J
    .locals 2

    .line 251
    iget v0, p0, Ll/ܶۘۧ;->ۜ:I

    int-to-long v0, v0

    mul-long v0, v0, p1

    const-wide/32 p1, 0xf4240

    div-long/2addr v0, p1

    return-wide v0
.end method

.method public ܽ(J)V
    .locals 0

    .line 281
    iput-wide p1, p0, Ll/ܶۘۧ;->֫:J

    return-void
.end method
