.class public final Ll/۫᩷ۧ;
.super Ljava/lang/Object;
.source "38RU"

# interfaces
.implements Ll/ۢۢۧ;


# instance fields
.field public final ֫:J

.field public final ۧ:Ll/ۛ᩷ۧ;


# direct methods
.method public constructor <init>(Ll/ۛ᩷ۧ;J)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/۫᩷ۧ;->ۧ:Ll/ۛ᩷ۧ;

    .line 41
    iput-wide p2, p0, Ll/۫᩷ۧ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 13

    .line 56
    iget-object v0, p0, Ll/۫᩷ۧ;->ۧ:Ll/ۛ᩷ۧ;

    iget-object v1, v0, Ll/ۛ᩷ۧ;->ۡ:Ll/ۤ᩷ۧ;

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 57
    iget-object v1, v0, Ll/ۛ᩷ۧ;->ۡ:Ll/ۤ᩷ۧ;

    iget-object v2, v1, Ll/ۤ᩷ۧ;->ۧ:[J

    .line 58
    iget-object v1, v1, Ll/ۤ᩷ۧ;->֫:[J

    .line 218
    iget v3, v0, Ll/ۛ᩷ۧ;->᩷:I

    int-to-long v3, v3

    mul-long v3, v3, p1

    const-wide/32 v5, 0xf4240

    div-long v7, v3, v5

    .line 219
    iget-wide v3, v0, Ll/ۛ᩷ۧ;->ܺ:J

    const-wide/16 v9, 0x1

    sub-long v11, v3, v9

    const-wide/16 v9, 0x0

    invoke-static/range {v7 .. v12}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v3

    const/4 v7, 0x0

    .line 62
    invoke-static {v2, v3, v4, v7}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v3

    const-wide/16 v7, 0x0

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    move-wide v9, v7

    goto :goto_0

    .line 68
    :cond_0
    aget-wide v9, v2, v3

    :goto_0
    if-ne v3, v4, :cond_1

    goto :goto_1

    .line 69
    :cond_1
    aget-wide v7, v1, v3

    :goto_1
    mul-long v9, v9, v5

    .line 81
    iget v0, v0, Ll/ۛ᩷ۧ;->᩷:I

    int-to-long v11, v0

    div-long/2addr v9, v11

    .line 82
    iget-wide v11, p0, Ll/۫᩷ۧ;->֫:J

    add-long/2addr v7, v11

    .line 83
    new-instance v4, Ll/ۡۢۧ;

    invoke-direct {v4, v9, v10, v7, v8}, Ll/ۡۢۧ;-><init>(JJ)V

    cmp-long v7, v9, p1

    if-eqz v7, :cond_3

    .line 71
    array-length p1, v2

    add-int/lit8 p1, p1, -0x1

    if-ne v3, p1, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 74
    aget-wide p1, v2, v3

    aget-wide v2, v1, v3

    mul-long p1, p1, v5

    int-to-long v0, v0

    .line 81
    div-long/2addr p1, v0

    add-long/2addr v11, v2

    .line 83
    new-instance v0, Ll/ۡۢۧ;

    invoke-direct {v0, p1, p2, v11, v12}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 76
    new-instance p1, Ll/ۜۢۧ;

    invoke-direct {p1, v4, v0}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p1

    .line 72
    :cond_3
    :goto_2
    new-instance p1, Ll/ۜۢۧ;

    .line 83
    invoke-direct {p1, v4, v4}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p1
.end method

.method public final ۜ()J
    .locals 2

    .line 51
    iget-object v0, p0, Ll/۫᩷ۧ;->ۧ:Ll/ۛ᩷ۧ;

    invoke-virtual {v0}, Ll/ۛ᩷ۧ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
