.class public final Ll/۬ۚۧ;
.super Ljava/lang/Object;
.source "78HC"

# interfaces
.implements Ll/ۢۢۧ;


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܽ:J

.field public final ܿ:Ll/᩶ۚۧ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩶ۚۧ;IJJ)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/۬ۚۧ;->ܿ:Ll/᩶ۚۧ;

    .line 34
    iput p2, p0, Ll/۬ۚۧ;->ᩳ:I

    .line 35
    iput-wide p3, p0, Ll/۬ۚۧ;->ܽ:J

    sub-long/2addr p5, p3

    .line 36
    iget p1, p1, Ll/᩶ۚۧ;->ۧ:I

    int-to-long p1, p1

    div-long/2addr p5, p1

    iput-wide p5, p0, Ll/۬ۚۧ;->֫:J

    .line 37
    invoke-direct {p0, p5, p6}, Ll/۬ۚۧ;->ܽ(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/۬ۚۧ;->ۧ:J

    return-void
.end method

.method private ܽ(J)J
    .locals 9

    .line 71
    iget v0, p0, Ll/۬ۚۧ;->ᩳ:I

    int-to-long v0, v0

    mul-long v2, p1, v0

    iget-object p1, p0, Ll/۬ۚۧ;->ܿ:Ll/᩶ۚۧ;

    iget p1, p1, Ll/᩶ۚۧ;->ܿ:I

    int-to-long v6, p1

    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v8, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v4, 0xf4240

    invoke-static/range {v2 .. v8}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide p1

    return-wide p1
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 15

    move-object v0, p0

    .line 53
    iget-object v1, v0, Ll/۬ۚۧ;->ܿ:Ll/᩶ۚۧ;

    iget v2, v1, Ll/᩶ۚۧ;->ܿ:I

    int-to-long v2, v2

    mul-long v2, v2, p1

    iget v4, v0, Ll/۬ۚۧ;->ᩳ:I

    int-to-long v4, v4

    const-wide/32 v6, 0xf4240

    mul-long v4, v4, v6

    div-long v6, v2, v4

    .line 54
    iget-wide v2, v0, Ll/۬ۚۧ;->֫:J

    const-wide/16 v4, 0x1

    sub-long v10, v2, v4

    const-wide/16 v8, 0x0

    invoke-static/range {v6 .. v11}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v6

    .line 56
    iget v8, v1, Ll/᩶ۚۧ;->ۧ:I

    int-to-long v8, v8

    mul-long v8, v8, v6

    iget-wide v10, v0, Ll/۬ۚۧ;->ܽ:J

    add-long/2addr v8, v10

    .line 57
    invoke-direct {p0, v6, v7}, Ll/۬ۚۧ;->ܽ(J)J

    move-result-wide v12

    .line 58
    new-instance v14, Ll/ۡۢۧ;

    invoke-direct {v14, v12, v13, v8, v9}, Ll/ۡۢۧ;-><init>(JJ)V

    cmp-long v8, v12, p1

    if-gez v8, :cond_1

    sub-long/2addr v2, v4

    cmp-long v8, v6, v2

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    add-long/2addr v6, v4

    .line 63
    iget v1, v1, Ll/᩶ۚۧ;->ۧ:I

    int-to-long v1, v1

    mul-long v1, v1, v6

    add-long/2addr v1, v10

    .line 64
    invoke-direct {p0, v6, v7}, Ll/۬ۚۧ;->ܽ(J)J

    move-result-wide v3

    .line 65
    new-instance v5, Ll/ۡۢۧ;

    invoke-direct {v5, v3, v4, v1, v2}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 66
    new-instance v1, Ll/ۜۢۧ;

    invoke-direct {v1, v14, v5}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v1

    .line 60
    :cond_1
    :goto_0
    new-instance v1, Ll/ۜۢۧ;

    .line 83
    invoke-direct {v1, v14, v14}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v1
.end method

.method public final ۜ()J
    .locals 2

    .line 47
    iget-wide v0, p0, Ll/۬ۚۧ;->ۧ:J

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
