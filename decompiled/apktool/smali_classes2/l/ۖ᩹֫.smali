.class public final Ll/ۖ᩹֫;
.super Ljava/lang/Object;
.source "I8C0"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ۗ:Ll/ᩳ֨֫;

.field public ۙ:I

.field public ۛ:J

.field public final ۤ:I

.field public final ۨ:Ll/ᩳ֨֫;

.field public final ۫:Ll/ۛۤᩳ;

.field public final ۬:Ljava/util/ArrayList;

.field public ᩶:J

.field public final ᩸:Ll/ۘ᩹֫;

.field public final ᩹:I


# direct methods
.method public constructor <init>(IILl/ᩳ֨֫;Ll/ۛۤᩳ;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput p1, p0, Ll/ۖ᩹֫;->᩹:I

    .line 64
    iput p2, p0, Ll/ۖ᩹֫;->ۤ:I

    .line 65
    iput-object p3, p0, Ll/ۖ᩹֫;->ۨ:Ll/ᩳ֨֫;

    .line 66
    iput-object p4, p0, Ll/ۖ᩹֫;->۫:Ll/ۛۤᩳ;

    .line 67
    new-instance p1, Ll/ᩳ֨֫;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ۖ᩹֫;->ۗ:Ll/ᩳ֨֫;

    .line 68
    new-instance p1, Ll/ۘ᩹֫;

    .line 57
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-virtual {p1}, Ll/ۘ᩹֫;->ۧ()V

    .line 68
    iput-object p1, p0, Ll/ۖ᩹֫;->᩸:Ll/ۘ᩹֫;

    .line 69
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۖ᩹֫;->۬:Ljava/util/ArrayList;

    const/high16 p2, -0x80000000

    .line 70
    iput p2, p0, Ll/ۖ᩹֫;->ۙ:I

    const-wide/16 p2, 0x0

    .line 71
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const/16 p3, 0x78

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p2, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;JJI)J
    .locals 17

    move/from16 v0, p5

    .line 218
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const-wide/16 v2, 0x0

    move v5, v1

    move-wide v6, v2

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    :goto_0
    const-wide/32 v8, 0x3938700

    if-ltz v5, :cond_1

    move-object/from16 v10, p0

    .line 219
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/util/Pair;

    .line 220
    iget-object v12, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    const-wide/16 v14, 0x0

    sub-long v12, v3, v12

    invoke-static {v1, v2, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    cmp-long v16, v12, v14

    if-ltz v16, :cond_0

    const/4 v14, 0x1

    goto :goto_1

    :cond_0
    const/4 v14, 0x0

    .line 221
    :goto_1
    invoke-static {v14}, Ll/᩺֡֫;->ۧ(Z)V

    .line 222
    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    mul-long v8, v8, v12

    int-to-long v14, v11

    int-to-long v10, v0

    mul-long v14, v14, v10

    .line 231
    div-long/2addr v8, v14

    add-long/2addr v6, v8

    sub-long/2addr v1, v12

    sub-long/2addr v3, v12

    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 226
    :cond_1
    invoke-static/range {p0 .. p0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-long v1, v1, v8

    int-to-long v3, v3

    int-to-long v8, v0

    mul-long v3, v3, v8

    .line 231
    div-long/2addr v1, v3

    add-long/2addr v1, v6

    return-wide v1
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 6

    .line 30
    check-cast p1, Ll/ۖ᩹֫;

    .line 187
    invoke-virtual {p0}, Ll/ۖ᩹֫;->֫()J

    move-result-wide v0

    .line 188
    invoke-virtual {p1}, Ll/ۖ᩹֫;->֫()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v4

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    const/4 p1, -0x1

    return p1

    .line 197
    :cond_2
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method

.method public final ֫()J
    .locals 9

    .line 79
    iget-object v0, p0, Ll/ۖ᩹֫;->᩸:Ll/ۘ᩹֫;

    invoke-virtual {v0}, Ll/ۘ᩹֫;->֫()Z

    move-result v1

    if-nez v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    .line 83
    :cond_0
    iget-wide v1, p0, Ll/ۖ᩹֫;->᩶:J

    iget-wide v4, v0, Ll/ۘ᩹֫;->ܽ:J

    iget-wide v6, p0, Ll/ۖ᩹֫;->ۛ:J

    iget v8, p0, Ll/ۖ᩹֫;->ۤ:I

    .line 84
    iget-object v3, p0, Ll/ۖ᩹֫;->۬:Ljava/util/ArrayList;

    invoke-static/range {v3 .. v8}, Ll/ۖ᩹֫;->֫(Ljava/util/ArrayList;JJI)J

    move-result-wide v3

    add-long/2addr v1, v3

    return-wide v1
.end method

.method public final ֫(Ll/᩵ۢۧ;Z)V
    .locals 18

    move-object/from16 v0, p0

    .line 98
    iget-object v1, v0, Ll/ۖ᩹֫;->᩸:Ll/ۘ᩹֫;

    invoke-virtual {v1}, Ll/ۘ᩹֫;->֫()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 101
    :cond_0
    iget-wide v2, v0, Ll/ۖ᩹֫;->᩶:J

    iget-wide v5, v1, Ll/ۘ᩹֫;->ܽ:J

    iget-wide v7, v0, Ll/ۖ᩹֫;->ۛ:J

    iget v9, v0, Ll/ۖ᩹֫;->ۤ:I

    .line 102
    iget-object v10, v0, Ll/ۖ᩹֫;->۬:Ljava/util/ArrayList;

    move-object v4, v10

    invoke-static/range {v4 .. v9}, Ll/ۖ᩹֫;->֫(Ljava/util/ArrayList;JJI)J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, v0, Ll/ۖ᩹֫;->᩶:J

    const/16 v2, 0xf0

    const/16 v3, 0xff

    .line 107
    iget-object v4, v0, Ll/ۖ᩹֫;->ۨ:Ll/ᩳ֨֫;

    if-eqz p2, :cond_2

    .line 161
    iget v5, v1, Ll/ۘ᩹֫;->᩻:I

    ushr-int/lit8 v6, v5, 0x4

    if-eq v5, v3, :cond_2

    if-eq v5, v2, :cond_2

    const/16 v5, 0x8

    if-eq v6, v5, :cond_1

    const/16 v5, 0x9

    if-ne v6, v5, :cond_2

    .line 108
    :cond_1
    iget v2, v1, Ll/ۘ᩹֫;->ܿ:I

    invoke-virtual {v4, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 109
    iget v2, v1, Ll/ۘ᩹֫;->᩻:I

    iput v2, v0, Ll/ۖ᩹֫;->ۙ:I

    .line 110
    invoke-virtual {v1}, Ll/ۘ᩹֫;->ۧ()V

    return-void

    .line 115
    :cond_2
    iget v5, v1, Ll/ۘ᩹֫;->ܿ:I

    iget v6, v1, Ll/ۘ᩹֫;->ۜ:I

    sub-int/2addr v5, v6

    .line 117
    invoke-virtual {v4, v6}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 157
    iget v6, v1, Ll/ۘ᩹֫;->᩻:I

    if-eq v6, v3, :cond_3

    if-eq v6, v2, :cond_3

    .line 120
    invoke-virtual {v4, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    const/4 v2, 0x0

    .line 121
    iget-object v4, v0, Ll/ۖ᩹֫;->ۗ:Ll/ᩳ֨֫;

    invoke-virtual {v4, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 122
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۘ᩹֫;->֫([B)V

    .line 127
    iget v5, v1, Ll/ۘ᩹֫;->ᩳ:I

    goto :goto_0

    :cond_3
    if-ne v6, v3, :cond_5

    .line 129
    iget-wide v2, v1, Ll/ۘ᩹֫;->᩷:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v8, v2, v6

    if-eqz v8, :cond_5

    const-wide/32 v6, 0x3938700

    .line 130
    div-long/2addr v6, v2

    long-to-int v2, v6

    .line 131
    iget-wide v6, v0, Ll/ۖ᩹֫;->ۛ:J

    .line 205
    iget v3, v0, Ll/ۖ᩹֫;->᩹:I

    const/4 v8, 0x2

    if-ne v3, v8, :cond_4

    .line 206
    invoke-virtual {v0, v2, v6, v7}, Ll/ۖ᩹֫;->ۧ(IJ)V

    goto :goto_0

    .line 208
    :cond_4
    iget-object v3, v0, Ll/ۖ᩹֫;->۫:Ll/ۛۤᩳ;

    iget-object v3, v3, Ll/ۛۤᩳ;->᩹:Ljava/lang/Object;

    check-cast v3, Ll/ܿ᩹֫;

    invoke-static {v3, v2, v6, v7}, Ll/ܿ᩹֫;->֫(Ll/ܿ᩹֫;IJ)V

    :cond_5
    :goto_0
    move v15, v5

    move-object/from16 v2, p1

    .line 135
    invoke-interface {v2, v15, v4}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 136
    iget-wide v12, v0, Ll/ۖ᩹֫;->᩶:J

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v14, 0x0

    move-object/from16 v11, p1

    invoke-interface/range {v11 .. v17}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 143
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_6

    .line 146
    invoke-static {v10}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    .line 147
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 148
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    :cond_6
    iget v2, v1, Ll/ۘ᩹֫;->᩻:I

    iput v2, v0, Ll/ۖ᩹֫;->ۙ:I

    .line 152
    invoke-virtual {v1}, Ll/ۘ᩹֫;->ۧ()V

    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 159
    iget-object v0, p0, Ll/ۖ᩹֫;->᩸:Ll/ۘ᩹֫;

    invoke-virtual {v0}, Ll/ۘ᩹֫;->֫()Z

    move-result v1

    if-nez v1, :cond_0

    .line 160
    iget-object v1, p0, Ll/ۖ᩹֫;->ۨ:Ll/ᩳ֨֫;

    iget v2, p0, Ll/ۖ᩹֫;->ۙ:I

    .line 161
    invoke-virtual {v0, v2, v1}, Ll/ۘ᩹֫;->֫(ILl/ᩳ֨֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 163
    iget-wide v1, p0, Ll/ۖ᩹֫;->ۛ:J

    iget-wide v3, v0, Ll/ۘ᩹֫;->ܽ:J

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۖ᩹֫;->ۛ:J

    :cond_0
    return-void
.end method

.method public final ۧ(IJ)V
    .locals 0

    .line 170
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    iget-object p2, p0, Ll/ۖ᩹֫;->۬:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܿ()V
    .locals 4

    const-wide/16 v0, 0x0

    .line 175
    iput-wide v0, p0, Ll/ۖ᩹֫;->᩶:J

    .line 176
    iput-wide v0, p0, Ll/ۖ᩹֫;->ۛ:J

    const/high16 v2, -0x80000000

    .line 177
    iput v2, p0, Ll/ۖ᩹֫;->ۙ:I

    .line 178
    iget-object v2, p0, Ll/ۖ᩹֫;->ۨ:Ll/ᩳ֨֫;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 179
    iget-object v2, p0, Ll/ۖ᩹֫;->ۗ:Ll/ᩳ֨֫;

    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 180
    iget-object v2, p0, Ll/ۖ᩹֫;->᩸:Ll/ۘ᩹֫;

    invoke-virtual {v2}, Ll/ۘ᩹֫;->ۧ()V

    .line 181
    iget-object v2, p0, Ll/ۖ᩹֫;->۬:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 182
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x78

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
