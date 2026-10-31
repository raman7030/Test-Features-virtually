.class public final Ll/ۚۙᩳ;
.super Ljava/lang/Object;
.source "E6TU"


# static fields
.field public static final ۡ:Ll/ۚۙᩳ;


# instance fields
.field public final ֫:I

.field public final ۜ:J

.field public final ۢ:Ll/֡ۙᩳ;

.field public final ۧ:J

.field public final ܳ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:Ll/᩵ۙᩳ;

.field public final ᩷:Ll/ۜ۬ᩳ;

.field public final ᩻:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 14
    new-instance v13, Ll/ۚۙᩳ;

    sget-object v1, Ll/֡ۙᩳ;->᩶:Ll/֡ۙᩳ;

    sget-object v2, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    const/16 v0, 0x20

    new-array v10, v0, [B

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Ll/ۚۙᩳ;-><init>(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ll/ۜ۬ᩳ;Ljava/lang/String;IJJ[BIZ)V

    sput-object v13, Ll/ۚۙᩳ;->ۡ:Ll/ۚۙᩳ;

    return-void
.end method

.method public constructor <init>(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ll/ۜ۬ᩳ;Ljava/lang/String;IJJ[BIZ)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p5

    move-wide/from16 v5, p6

    move-wide/from16 v7, p8

    move-object/from16 v9, p10

    move/from16 v10, p11

    move/from16 v11, p12

    .line 27
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static/range {p1 .. p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v1, v0, Ll/ۚۙᩳ;->ۢ:Ll/֡ۙᩳ;

    .line 29
    invoke-static/range {p2 .. p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v2, v0, Ll/ۚۙᩳ;->ᩳ:Ll/᩵ۙᩳ;

    .line 30
    invoke-static/range {p4 .. p4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, p4

    iput-object v12, v0, Ll/ۚۙᩳ;->ܽ:Ljava/lang/String;

    const-wide/16 v13, 0x0

    cmp-long v15, v5, v13

    if-ltz v15, :cond_e

    cmp-long v16, v7, v13

    if-ltz v16, :cond_e

    .line 31
    array-length v13, v9

    const/16 v14, 0x20

    if-ne v13, v14, :cond_e

    if-ltz v10, :cond_e

    const/4 v13, 0x3

    if-gt v10, v13, :cond_e

    .line 32
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    move-result v13

    const/16 v14, 0x50

    if-gt v13, v14, :cond_e

    sget-object v13, Ll/֡ۙᩳ;->᩶:Ll/֡ۙᩳ;

    if-ne v1, v13, :cond_0

    if-nez v11, :cond_e

    if-eqz v10, :cond_e

    :cond_0
    const/4 v14, 0x1

    if-nez v3, :cond_2

    if-ne v1, v13, :cond_1

    .line 36
    sget-object v13, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    if-ne v2, v13, :cond_1

    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_1

    if-nez v4, :cond_1

    if-nez v15, :cond_1

    if-nez v16, :cond_1

    if-ne v10, v14, :cond_1

    const/16 v12, 0x20

    new-array v12, v12, [B

    .line 38
    invoke-static {v9, v12}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v12

    if-eqz v12, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid empty load state"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 39
    :cond_2
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_d

    if-lt v4, v14, :cond_d

    const v12, 0x8000

    if-gt v4, v12, :cond_d

    if-eq v1, v13, :cond_3

    int-to-long v12, v4

    rem-long v12, v5, v12

    const-wide/16 v16, 0x0

    cmp-long v14, v12, v16

    if-nez v14, :cond_d

    .line 43
    :cond_3
    :goto_0
    sget-object v12, Ll/֡ۙᩳ;->ۙ:Ll/֡ۙᩳ;

    if-eq v1, v12, :cond_5

    sget-object v12, Ll/֡ۙᩳ;->ۗ:Ll/֡ۙᩳ;

    if-ne v1, v12, :cond_4

    goto :goto_1

    :cond_4
    const/4 v12, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v12, 0x1

    .line 44
    :goto_2
    sget-object v13, Ll/᩵ۙᩳ;->᩹:Ll/᩵ۙᩳ;

    if-eq v2, v13, :cond_7

    sget-object v13, Ll/᩵ۙᩳ;->᩶:Ll/᩵ۙᩳ;

    if-ne v2, v13, :cond_6

    goto :goto_3

    :cond_6
    const/4 v13, 0x0

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v13, 0x1

    .line 45
    :goto_4
    sget-object v14, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    if-eq v2, v14, :cond_8

    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    :goto_5
    if-ne v12, v2, :cond_c

    sget-object v2, Ll/֡ۙᩳ;->ۗ:Ll/֡ۙᩳ;

    if-ne v1, v2, :cond_9

    const/4 v1, 0x1

    goto :goto_6

    :cond_9
    const/4 v1, 0x0

    :goto_6
    if-ne v13, v1, :cond_c

    if-nez v15, :cond_b

    const/16 v1, 0x20

    new-array v1, v1, [B

    .line 48
    invoke-static {v9, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_7

    .line 49
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid empty text prefix hash"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 51
    :cond_b
    :goto_7
    iput-object v3, v0, Ll/ۚۙᩳ;->᩷:Ll/ۜ۬ᩳ;

    .line 52
    iput v4, v0, Ll/ۚۙᩳ;->֫:I

    .line 53
    iput-wide v5, v0, Ll/ۚۙᩳ;->ۜ:J

    .line 54
    iput-wide v7, v0, Ll/ۚۙᩳ;->ۧ:J

    .line 55
    invoke-virtual/range {p10 .. p10}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    iput-object v1, v0, Ll/ۚۙᩳ;->᩻:[B

    .line 56
    iput v10, v0, Ll/ۚۙᩳ;->ܿ:I

    .line 57
    iput-boolean v11, v0, Ll/ۚۙᩳ;->ܳ:Z

    return-void

    .line 46
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid text load failure state"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 41
    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid text load source checkpoint"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 33
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid text load checkpoint"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 78
    iget v0, p0, Ll/ۚۙᩳ;->֫:I

    return v0
.end method

.method public final ֫(IJ[BIZZ)Ll/ۚۙᩳ;
    .locals 15

    move-object v0, p0

    .line 69
    new-instance v14, Ll/ۚۙᩳ;

    if-eqz p7, :cond_0

    sget-object v1, Ll/֡ۙᩳ;->᩶:Ll/֡ۙᩳ;

    goto :goto_0

    :cond_0
    sget-object v1, Ll/֡ۙᩳ;->۬:Ll/֡ۙᩳ;

    :goto_0
    move-object v2, v1

    sget-object v3, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    move/from16 v1, p1

    int-to-long v4, v1

    .line 0
    iget-wide v6, v0, Ll/ۚۙᩳ;->ۜ:J

    add-long v8, v6, v4

    xor-long/2addr v4, v6

    const/4 v1, 0x0

    const-wide/16 v10, 0x0

    cmp-long v12, v4, v10

    if-gez v12, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    xor-long v5, v6, v8

    cmp-long v7, v5, v10

    if-ltz v7, :cond_2

    const/4 v1, 0x1

    :cond_2
    or-int/2addr v1, v4

    if-eqz v1, :cond_3

    .line 70
    iget-wide v4, v0, Ll/ۚۙᩳ;->ۧ:J

    move-wide/from16 v6, p2

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    iget-object v4, v0, Ll/ۚۙᩳ;->᩷:Ll/ۜ۬ᩳ;

    iget-object v5, v0, Ll/ۚۙᩳ;->ܽ:Ljava/lang/String;

    iget v6, v0, Ll/ۚۙᩳ;->֫:I

    move-object v1, v14

    move-wide v7, v8

    move-wide v9, v10

    move-object/from16 v11, p4

    move/from16 v12, p5

    move/from16 v13, p6

    invoke-direct/range {v1 .. v13}, Ll/ۚۙᩳ;-><init>(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ll/ۜ۬ᩳ;Ljava/lang/String;IJJ[BIZ)V

    return-object v14

    .line 0
    :cond_3
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1
.end method

.method public final ֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;)Ll/ۚۙᩳ;
    .locals 15

    move-object v0, p0

    .line 65
    new-instance v14, Ll/ۚۙᩳ;

    iget v12, v0, Ll/ۚۙᩳ;->ܿ:I

    iget-boolean v13, v0, Ll/ۚۙᩳ;->ܳ:Z

    iget-object v4, v0, Ll/ۚۙᩳ;->᩷:Ll/ۜ۬ᩳ;

    iget-object v5, v0, Ll/ۚۙᩳ;->ܽ:Ljava/lang/String;

    iget v6, v0, Ll/ۚۙᩳ;->֫:I

    iget-wide v7, v0, Ll/ۚۙᩳ;->ۜ:J

    iget-wide v9, v0, Ll/ۚۙᩳ;->ۧ:J

    iget-object v11, v0, Ll/ۚۙᩳ;->᩻:[B

    move-object v1, v14

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v13}, Ll/ۚۙᩳ;-><init>(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ll/ۜ۬ᩳ;Ljava/lang/String;IJJ[BIZ)V

    return-object v14
.end method

.method public final ۜ()[B
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ۚۙᩳ;->᩻:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public final ۡ()Ll/ۜ۬ᩳ;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۚۙᩳ;->᩷:Ll/ۜ۬ᩳ;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x2

    .line 87
    iget v1, p0, Ll/ۚۙᩳ;->ܿ:I

    if-eq v1, v0, :cond_1

    const/4 v0, 0x3

    if-eq v1, v0, :cond_0

    const-string v0, "\n"

    return-object v0

    :cond_0
    const-string v0, "\r\n"

    return-object v0

    :cond_1
    const-string v0, "\r"

    return-object v0
.end method

.method public final ۧ()J
    .locals 2

    .line 81
    iget-wide v0, p0, Ll/ۚۙᩳ;->ۧ:J

    return-wide v0
.end method

.method public final ܳ()I
    .locals 1

    .line 83
    iget v0, p0, Ll/ۚۙᩳ;->ܿ:I

    return v0
.end method

.method public final ܺ()Ll/֡ۙᩳ;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ۚۙᩳ;->ۢ:Ll/֡ۙᩳ;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۚۙᩳ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 75
    iget-object v0, p0, Ll/ۚۙᩳ;->ۢ:Ll/֡ۙᩳ;

    sget-object v1, Ll/֡ۙᩳ;->᩶:Ll/֡ۙᩳ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Ll/᩵ۙᩳ;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ۚۙᩳ;->ᩳ:Ll/᩵ۙᩳ;

    return-object v0
.end method

.method public final ᩷()J
    .locals 2

    .line 79
    iget-wide v0, p0, Ll/ۚۙᩳ;->ۜ:J

    return-wide v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Ll/ۚۙᩳ;->ܳ:Z

    return v0
.end method
