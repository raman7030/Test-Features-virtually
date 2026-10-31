.class public final Ll/ۜۖۧ;
.super Ljava/lang/Object;
.source "Q8H3"

# interfaces
.implements Ll/᩻ۖۧ;


# instance fields
.field public final ֫:I

.field public final ۧ:J

.field public final ܳ:[J

.field public final ܽ:J

.field public final ܿ:[J

.field public final ᩳ:J


# direct methods
.method public constructor <init>([J[JJJJI)V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-object p1, p0, Ll/ۜۖۧ;->ܳ:[J

    .line 128
    iput-object p2, p0, Ll/ۜۖۧ;->ܿ:[J

    .line 129
    iput-wide p3, p0, Ll/ۜۖۧ;->ᩳ:J

    .line 130
    iput-wide p5, p0, Ll/ۜۖۧ;->ܽ:J

    .line 131
    iput-wide p7, p0, Ll/ۜۖۧ;->ۧ:J

    .line 132
    iput p9, p0, Ll/ۜۖۧ;->֫:I

    return-void
.end method

.method public static ֫(JJLl/ܿۢۧ;Ll/ᩳ֨֫;)Ll/ۜۖۧ;
    .locals 22

    move-wide/from16 v0, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const/4 v4, 0x6

    .line 52
    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 53
    invoke-virtual/range {p5 .. p5}, Ll/ᩳ֨֫;->᩻()I

    move-result v4

    .line 54
    iget v5, v2, Ll/ܿۢۧ;->ܽ:I

    int-to-long v5, v5

    add-long v12, p2, v5

    int-to-long v4, v4

    add-long/2addr v4, v12

    .line 56
    invoke-virtual/range {p5 .. p5}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    if-gtz v6, :cond_0

    goto :goto_1

    .line 60
    :cond_0
    iget v7, v2, Ll/ܿۢۧ;->ܿ:I

    int-to-long v8, v6

    .line 61
    iget v6, v2, Ll/ܿۢۧ;->ܳ:I

    int-to-long v10, v6

    mul-long v8, v8, v10

    const-wide/16 v10, 0x1

    sub-long/2addr v8, v10

    .line 62
    invoke-static {v7, v8, v9}, Ll/ۘ֨֫;->֫(IJ)J

    move-result-wide v10

    .line 64
    invoke-virtual/range {p5 .. p5}, Ll/ᩳ֨֫;->ۗ()I

    move-result v6

    .line 65
    invoke-virtual/range {p5 .. p5}, Ll/ᩳ֨֫;->ۗ()I

    move-result v7

    .line 66
    invoke-virtual/range {p5 .. p5}, Ll/ᩳ֨֫;->ۗ()I

    move-result v8

    const/4 v9, 0x2

    .line 67
    invoke-virtual {v3, v9}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 69
    iget v9, v2, Ll/ܿۢۧ;->ܽ:I

    int-to-long v14, v9

    add-long v14, p2, v14

    .line 71
    new-array v9, v6, [J

    .line 72
    new-array v3, v6, [J

    const/16 v16, 0x0

    move-wide/from16 v16, v12

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v6, :cond_5

    move-wide/from16 v18, v4

    int-to-long v4, v12

    mul-long v4, v4, v10

    move-wide/from16 v20, v10

    int-to-long v10, v6

    .line 74
    div-long/2addr v4, v10

    aput-wide v4, v9, v12

    .line 75
    aput-wide v14, v3, v12

    const/4 v4, 0x1

    if-eq v8, v4, :cond_4

    const/4 v4, 0x2

    if-eq v8, v4, :cond_3

    const/4 v4, 0x3

    if-eq v8, v4, :cond_2

    const/4 v4, 0x4

    if-eq v8, v4, :cond_1

    :goto_1
    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_1
    invoke-virtual/range {p5 .. p5}, Ll/ᩳ֨֫;->᩹()I

    move-result v4

    goto :goto_2

    .line 85
    :cond_2
    invoke-virtual/range {p5 .. p5}, Ll/ᩳ֨֫;->᩸()I

    move-result v4

    goto :goto_2

    .line 82
    :cond_3
    invoke-virtual/range {p5 .. p5}, Ll/ᩳ֨֫;->ۗ()I

    move-result v4

    goto :goto_2

    .line 79
    :cond_4
    invoke-virtual/range {p5 .. p5}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    :goto_2
    int-to-long v4, v4

    int-to-long v10, v7

    mul-long v4, v4, v10

    add-long/2addr v14, v4

    add-int/lit8 v12, v12, 0x1

    move-wide/from16 v4, v18

    move-wide/from16 v10, v20

    goto :goto_0

    :cond_5
    move-wide/from16 v18, v4

    move-wide/from16 v20, v10

    const-wide/16 v4, -0x1

    const-string v6, ", "

    cmp-long v7, v0, v4

    if-eqz v7, :cond_6

    cmp-long v4, v0, v18

    if-eqz v4, :cond_6

    const-string v4, "VBRI data size mismatch: "

    .line 0
    invoke-static {v4, v6, v0, v1}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v4, v18

    .line 96
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    move-wide/from16 v4, v18

    :goto_3
    cmp-long v0, v4, v14

    if-eqz v0, :cond_7

    const-string v0, "VBRI bytes and ToC mismatch (using max): "

    .line 0
    invoke-static {v0, v6, v4, v5}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 99
    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\nSeeking will be inaccurate."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 106
    invoke-static {v4, v5, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    move-wide v14, v0

    goto :goto_4

    :cond_7
    move-wide v14, v4

    .line 109
    :goto_4
    new-instance v0, Ll/ۜۖۧ;

    iget v1, v2, Ll/ܿۢۧ;->֫:I

    move-object v7, v0

    move-object v8, v9

    move-object v9, v3

    move-wide/from16 v10, v20

    move-wide/from16 v12, v16

    move/from16 v16, v1

    invoke-direct/range {v7 .. v16}, Ll/ۜۖۧ;-><init>([J[JJJJI)V

    return-object v0
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 9

    .line 142
    iget-object v0, p0, Ll/ۜۖۧ;->ܳ:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v2

    .line 143
    new-instance v3, Ll/ۡۢۧ;

    aget-wide v4, v0, v2

    iget-object v6, p0, Ll/ۜۖۧ;->ܿ:[J

    aget-wide v7, v6, v2

    invoke-direct {v3, v4, v5, v7, v8}, Ll/ۡۢۧ;-><init>(JJ)V

    cmp-long v7, v4, p1

    if-gez v7, :cond_1

    .line 144
    array-length p1, v0

    sub-int/2addr p1, v1

    if-ne v2, p1, :cond_0

    goto :goto_0

    .line 147
    :cond_0
    new-instance p1, Ll/ۡۢۧ;

    add-int/2addr v2, v1

    aget-wide v4, v0, v2

    aget-wide v0, v6, v2

    invoke-direct {p1, v4, v5, v0, v1}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 148
    new-instance p2, Ll/ۜۢۧ;

    invoke-direct {p2, v3, p1}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p2

    .line 145
    :cond_1
    :goto_0
    new-instance p1, Ll/ۜۢۧ;

    .line 83
    invoke-direct {p1, v3, v3}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p1
.end method

.method public final ۜ()J
    .locals 2

    .line 159
    iget-wide v0, p0, Ll/ۜۖۧ;->ᩳ:J

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    .line 164
    iget-wide v0, p0, Ll/ۜۖۧ;->ܽ:J

    return-wide v0
.end method

.method public final ۧ(J)J
    .locals 2

    .line 154
    iget-object v0, p0, Ll/ۜۖۧ;->ܿ:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result p1

    iget-object p2, p0, Ll/ۜۖۧ;->ܳ:[J

    aget-wide p1, p2, p1

    return-wide p1
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 169
    iget-wide v0, p0, Ll/ۜۖۧ;->ۧ:J

    return-wide v0
.end method

.method public final ᩻()I
    .locals 1

    .line 174
    iget v0, p0, Ll/ۜۖۧ;->֫:I

    return v0
.end method
