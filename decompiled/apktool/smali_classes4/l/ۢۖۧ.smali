.class public final Ll/ۢۖۧ;
.super Ljava/lang/Object;
.source "78KX"

# interfaces
.implements Ll/᩻ۖۧ;


# instance fields
.field public final ֫:I

.field public final ۧ:J

.field public final ܳ:[J

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:J

.field public final ᩻:I


# direct methods
.method public constructor <init>(JIJIJ[J)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-wide p1, p0, Ll/ۢۖۧ;->ᩳ:J

    .line 78
    iput p3, p0, Ll/ۢۖۧ;->᩻:I

    .line 79
    iput-wide p4, p0, Ll/ۢۖۧ;->ܿ:J

    .line 80
    iput p6, p0, Ll/ۢۖۧ;->֫:I

    .line 81
    iput-wide p7, p0, Ll/ۢۖۧ;->ܽ:J

    .line 82
    iput-object p9, p0, Ll/ۢۖۧ;->ܳ:[J

    const-wide/16 p3, -0x1

    cmp-long p5, p7, p3

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    add-long p3, p1, p7

    .line 83
    :goto_0
    iput-wide p3, p0, Ll/ۢۖۧ;->ۧ:J

    return-void
.end method

.method public static ֫(Ll/᩷ۖۧ;J)Ll/ۢۖۧ;
    .locals 11

    .line 41
    invoke-virtual {p0}, Ll/᩷ۖۧ;->֫()J

    move-result-wide v4

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v4, v0

    if-nez v2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 45
    :cond_0
    new-instance v10, Ll/ۢۖۧ;

    iget-object v0, p0, Ll/᩷ۖۧ;->ܿ:Ll/ܿۢۧ;

    iget v3, v0, Ll/ܿۢۧ;->ܽ:I

    iget v6, v0, Ll/ܿۢۧ;->֫:I

    iget-wide v7, p0, Ll/᩷ۖۧ;->֫:J

    iget-object v9, p0, Ll/᩷ۖۧ;->ܳ:[J

    move-object v0, v10

    move-wide v1, p1

    invoke-direct/range {v0 .. v9}, Ll/ۢۖۧ;-><init>(JIJIJ[J)V

    return-object v10
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 19

    move-object/from16 v0, p0

    .line 93
    invoke-virtual/range {p0 .. p0}, Ll/ۢۖۧ;->ܿ()Z

    move-result v1

    iget v2, v0, Ll/ۢۖۧ;->᩻:I

    iget-wide v3, v0, Ll/ۢۖۧ;->ᩳ:J

    if-nez v1, :cond_0

    .line 94
    new-instance v1, Ll/ۜۢۧ;

    new-instance v5, Ll/ۡۢۧ;

    int-to-long v6, v2

    add-long/2addr v3, v6

    const-wide/16 v6, 0x0

    invoke-direct {v5, v6, v7, v3, v4}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 83
    invoke-direct {v1, v5, v5}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v1

    :cond_0
    const-wide/16 v10, 0x0

    .line 96
    iget-wide v12, v0, Ll/ۢۖۧ;->ܿ:J

    move-wide/from16 v8, p1

    invoke-static/range {v8 .. v13}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v5

    long-to-double v7, v5

    const-wide/high16 v9, 0x4059000000000000L    # 100.0

    mul-double v7, v7, v9

    .line 97
    iget-wide v11, v0, Ll/ۢۖۧ;->ܿ:J

    long-to-double v11, v11

    div-double/2addr v7, v11

    const-wide/16 v11, 0x0

    cmpg-double v1, v7, v11

    if-gtz v1, :cond_1

    const-wide/high16 v7, 0x4070000000000000L    # 256.0

    goto :goto_1

    :cond_1
    cmpl-double v1, v7, v9

    if-ltz v1, :cond_2

    const-wide/high16 v7, 0x4070000000000000L    # 256.0

    const-wide/high16 v11, 0x4070000000000000L    # 256.0

    goto :goto_1

    :cond_2
    double-to-int v1, v7

    .line 105
    iget-object v9, v0, Ll/ۢۖۧ;->ܳ:[J

    invoke-static {v9}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 106
    aget-wide v10, v9, v1

    long-to-double v10, v10

    const/16 v12, 0x63

    if-ne v1, v12, :cond_3

    const-wide/high16 v12, 0x4070000000000000L    # 256.0

    const-wide/high16 v14, 0x4070000000000000L    # 256.0

    move-wide/from16 p1, v12

    goto :goto_0

    :cond_3
    add-int/lit8 v12, v1, 0x1

    .line 107
    aget-wide v13, v9, v12

    long-to-double v14, v13

    const-wide/high16 p1, 0x4070000000000000L    # 256.0

    :goto_0
    int-to-double v12, v1

    sub-double/2addr v7, v12

    sub-double/2addr v14, v10

    mul-double v14, v14, v7

    add-double v11, v14, v10

    move-wide/from16 v7, p1

    :goto_1
    div-double/2addr v11, v7

    .line 113
    iget-wide v7, v0, Ll/ۢۖۧ;->ܽ:J

    long-to-double v9, v7

    mul-double v11, v11, v9

    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    int-to-long v1, v2

    const-wide/16 v9, 0x1

    sub-long v17, v7, v9

    move-wide v15, v1

    .line 115
    invoke-static/range {v13 .. v18}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v1

    .line 116
    new-instance v7, Ll/ۜۢۧ;

    new-instance v8, Ll/ۡۢۧ;

    add-long/2addr v3, v1

    invoke-direct {v8, v5, v6, v3, v4}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 83
    invoke-direct {v7, v8, v8}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v7
.end method

.method public final ۜ()J
    .locals 2

    .line 142
    iget-wide v0, p0, Ll/ۢۖۧ;->ܿ:J

    return-wide v0
.end method

.method public final ۧ()J
    .locals 4

    .line 147
    iget v0, p0, Ll/ۢۖۧ;->᩻:I

    int-to-long v0, v0

    iget-wide v2, p0, Ll/ۢۖۧ;->ᩳ:J

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public final ۧ(J)J
    .locals 13

    .line 121
    iget-wide v0, p0, Ll/ۢۖۧ;->ᩳ:J

    sub-long/2addr p1, v0

    .line 122
    invoke-virtual {p0}, Ll/ۢۖۧ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Ll/ۢۖۧ;->᩻:I

    int-to-long v0, v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    goto :goto_2

    .line 125
    :cond_0
    iget-object v0, p0, Ll/ۢۖۧ;->ܳ:[J

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    long-to-double p1, p1

    const-wide/high16 v1, 0x4070000000000000L    # 256.0

    mul-double p1, p1, v1

    .line 126
    iget-wide v1, p0, Ll/ۢۖۧ;->ܽ:J

    long-to-double v1, v1

    div-double/2addr p1, v1

    double-to-long v1, p1

    const/4 v3, 0x1

    .line 127
    invoke-static {v0, v1, v2, v3}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v1

    int-to-long v2, v1

    .line 167
    iget-wide v4, p0, Ll/ۢۖۧ;->ܿ:J

    mul-long v2, v2, v4

    const-wide/16 v6, 0x64

    div-long/2addr v2, v6

    .line 129
    aget-wide v8, v0, v1

    add-int/lit8 v10, v1, 0x1

    int-to-long v11, v10

    mul-long v4, v4, v11

    .line 167
    div-long/2addr v4, v6

    const/16 v6, 0x63

    if-ne v1, v6, :cond_1

    const-wide/16 v0, 0x100

    goto :goto_0

    .line 131
    :cond_1
    aget-wide v6, v0, v10

    move-wide v0, v6

    :goto_0
    cmp-long v6, v8, v0

    if-nez v6, :cond_2

    const-wide/16 p1, 0x0

    goto :goto_1

    :cond_2
    long-to-double v6, v8

    sub-double/2addr p1, v6

    sub-long/2addr v0, v8

    long-to-double v0, v0

    div-double/2addr p1, v0

    :goto_1
    sub-long/2addr v4, v2

    long-to-double v0, v4

    mul-double p1, p1, v0

    .line 137
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    add-long/2addr p1, v2

    return-wide p1

    :cond_3
    :goto_2
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final ܿ()Z
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ۢۖۧ;->ܳ:[J

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 152
    iget-wide v0, p0, Ll/ۢۖۧ;->ۧ:J

    return-wide v0
.end method

.method public final ᩻()I
    .locals 1

    .line 157
    iget v0, p0, Ll/ۢۖۧ;->֫:I

    return v0
.end method
