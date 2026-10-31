.class public final Ll/ᩳۖۧ;
.super Ljava/lang/Object;
.source "I8NX"

# interfaces
.implements Ll/᩻ۖۧ;


# instance fields
.field public final ֫:J

.field public final ۧ:[J

.field public final ܽ:[J


# direct methods
.method public constructor <init>(J[J[J)V
    .locals 2

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p3, p0, Ll/ᩳۖۧ;->ۧ:[J

    .line 59
    iput-object p4, p0, Ll/ᩳۖۧ;->ܽ:[J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    array-length p1, p4

    add-int/lit8 p1, p1, -0x1

    aget-wide p1, p4, p1

    invoke-static {p1, p2}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, Ll/ᩳۖۧ;->֫:J

    return-void
.end method

.method public static ֫(J[J[J)Landroid/util/Pair;
    .locals 10

    const/4 v0, 0x1

    .line 108
    invoke-static {p2, p0, p1, v0}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v1

    .line 109
    aget-wide v2, p2, v1

    .line 110
    aget-wide v4, p3, v1

    add-int/2addr v1, v0

    .line 112
    array-length v0, p2

    if-ne v1, v0, :cond_0

    .line 113
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    .line 115
    :cond_0
    aget-wide v6, p2, v1

    .line 116
    aget-wide p2, p3, v1

    cmp-long v0, v6, v2

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_1
    long-to-double v0, p0

    long-to-double v8, v2

    sub-double/2addr v0, v8

    sub-long/2addr v6, v2

    long-to-double v2, v6

    div-double/2addr v0, v2

    :goto_0
    sub-long/2addr p2, v4

    long-to-double p2, p2

    mul-double v0, v0, p2

    double-to-long p2, v0

    add-long/2addr p2, v4

    .line 122
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(JLl/᩷ܺۧ;J)Ll/ᩳۖۧ;
    .locals 11

    .line 37
    iget-object v0, p2, Ll/᩷ܺۧ;->ܽ:[I

    array-length v1, v0

    add-int/lit8 v2, v1, 0x1

    .line 38
    new-array v3, v2, [J

    .line 39
    new-array v2, v2, [J

    const/4 v4, 0x0

    .line 40
    aput-wide p0, v3, v4

    const-wide/16 v5, 0x0

    .line 41
    aput-wide v5, v2, v4

    const/4 v4, 0x1

    :goto_0
    if-gt v4, v1, :cond_0

    .line 45
    iget v7, p2, Ll/᩷ܺۧ;->ۧ:I

    add-int/lit8 v8, v4, -0x1

    aget v9, v0, v8

    add-int/2addr v7, v9

    int-to-long v9, v7

    add-long/2addr p0, v9

    .line 46
    iget v7, p2, Ll/᩷ܺۧ;->ᩳ:I

    iget-object v9, p2, Ll/᩷ܺۧ;->ܿ:[I

    aget v8, v9, v8

    add-int/2addr v7, v8

    int-to-long v7, v7

    add-long/2addr v5, v7

    .line 47
    aput-wide p0, v3, v4

    .line 48
    aput-wide v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 50
    :cond_0
    new-instance p0, Ll/ᩳۖۧ;

    invoke-direct {p0, p3, p4, v3, v2}, Ll/ᩳۖۧ;-><init>(J[J[J)V

    return-object p0
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 6

    const-wide/16 v2, 0x0

    .line 75
    iget-wide v4, p0, Ll/ᩳۖۧ;->֫:J

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide p1

    .line 77
    invoke-static {p1, p2}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide p1

    iget-object v0, p0, Ll/ᩳۖۧ;->ܽ:[J

    iget-object v1, p0, Ll/ᩳۖۧ;->ۧ:[J

    invoke-static {p1, p2, v0, v1}, Ll/ᩳۖۧ;->֫(J[J[J)Landroid/util/Pair;

    move-result-object p1

    .line 78
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    .line 79
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    .line 80
    new-instance v2, Ll/ۜۢۧ;

    new-instance v3, Ll/ۡۢۧ;

    invoke-direct {v3, v0, v1, p1, p2}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 83
    invoke-direct {v2, v3, v3}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v2
.end method

.method public final ۜ()J
    .locals 2

    .line 92
    iget-wide v0, p0, Ll/ᩳۖۧ;->֫:J

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ۧ(J)J
    .locals 2

    .line 85
    iget-object v0, p0, Ll/ᩳۖۧ;->ۧ:[J

    iget-object v1, p0, Ll/ᩳۖۧ;->ܽ:[J

    .line 86
    invoke-static {p1, p2, v0, v1}, Ll/ᩳۖۧ;->֫(J[J[J)Landroid/util/Pair;

    move-result-object p1

    .line 87
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-static {p1, p2}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final ᩻()I
    .locals 1

    const v0, -0x7fffffff

    return v0
.end method
