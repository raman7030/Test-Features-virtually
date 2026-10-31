.class public final Ll/ᩳۢۧ;
.super Ljava/lang/Object;
.source "F8IP"

# interfaces
.implements Ll/ۢۢۧ;


# instance fields
.field public ֫:J

.field public final ۧ:Ll/ۙۚ֫;

.field public final ܽ:Ll/ۙۚ֫;


# direct methods
.method public constructor <init>(J[J[J)V
    .locals 6

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    array-length v0, p3

    array-length v1, p4

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 47
    array-length v0, p4

    if-lez v0, :cond_1

    .line 48
    aget-wide v1, p4, v2

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    .line 50
    new-instance v1, Ll/ۙۚ֫;

    add-int/lit8 v0, v0, 0x1

    invoke-direct {v1, v0}, Ll/ۙۚ֫;-><init>(I)V

    iput-object v1, p0, Ll/ᩳۢۧ;->ۧ:Ll/ۙۚ֫;

    .line 51
    new-instance v2, Ll/ۙۚ֫;

    invoke-direct {v2, v0}, Ll/ۙۚ֫;-><init>(I)V

    iput-object v2, p0, Ll/ᩳۢۧ;->ܽ:Ll/ۙۚ֫;

    .line 52
    invoke-virtual {v1, v3, v4}, Ll/ۙۚ֫;->֫(J)V

    .line 53
    invoke-virtual {v2, v3, v4}, Ll/ۙۚ֫;->֫(J)V

    goto :goto_1

    .line 55
    :cond_1
    new-instance v1, Ll/ۙۚ֫;

    invoke-direct {v1, v0}, Ll/ۙۚ֫;-><init>(I)V

    iput-object v1, p0, Ll/ᩳۢۧ;->ۧ:Ll/ۙۚ֫;

    .line 56
    new-instance v1, Ll/ۙۚ֫;

    invoke-direct {v1, v0}, Ll/ۙۚ֫;-><init>(I)V

    iput-object v1, p0, Ll/ᩳۢۧ;->ܽ:Ll/ۙۚ֫;

    .line 58
    :goto_1
    iget-object v0, p0, Ll/ᩳۢۧ;->ۧ:Ll/ۙۚ֫;

    invoke-virtual {v0, p3}, Ll/ۙۚ֫;->֫([J)V

    .line 59
    iget-object p3, p0, Ll/ᩳۢۧ;->ܽ:Ll/ۙۚ֫;

    invoke-virtual {p3, p4}, Ll/ۙۚ֫;->֫([J)V

    .line 60
    iput-wide p1, p0, Ll/ᩳۢۧ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 8

    .line 75
    iget-object v0, p0, Ll/ᩳۢۧ;->ܽ:Ll/ۙۚ֫;

    invoke-virtual {v0}, Ll/ۙۚ֫;->֫()I

    move-result v1

    if-nez v1, :cond_0

    .line 76
    new-instance p1, Ll/ۜۢۧ;

    sget-object p2, Ll/ۡۢۧ;->ܽ:Ll/ۡۢۧ;

    .line 83
    invoke-direct {p1, p2, p2}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p1

    .line 79
    :cond_0
    invoke-static {v0, p1, p2}, Ll/ۘ֨֫;->֫(Ll/ۙۚ֫;J)I

    move-result v1

    .line 80
    new-instance v2, Ll/ۡۢۧ;

    invoke-virtual {v0, v1}, Ll/ۙۚ֫;->֫(I)J

    move-result-wide v3

    iget-object v5, p0, Ll/ᩳۢۧ;->ۧ:Ll/ۙۚ֫;

    invoke-virtual {v5, v1}, Ll/ۙۚ֫;->֫(I)J

    move-result-wide v6

    invoke-direct {v2, v3, v4, v6, v7}, Ll/ۡۢۧ;-><init>(JJ)V

    cmp-long v6, v3, p1

    if-eqz v6, :cond_2

    .line 81
    invoke-virtual {v0}, Ll/ۙۚ֫;->֫()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-ne v1, p1, :cond_1

    goto :goto_0

    .line 84
    :cond_1
    new-instance p1, Ll/ۡۢۧ;

    add-int/lit8 v1, v1, 0x1

    .line 85
    invoke-virtual {v0, v1}, Ll/ۙۚ֫;->֫(I)J

    move-result-wide v3

    invoke-virtual {v5, v1}, Ll/ۙۚ֫;->֫(I)J

    move-result-wide v0

    invoke-direct {p1, v3, v4, v0, v1}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 86
    new-instance p2, Ll/ۜۢۧ;

    invoke-direct {p2, v2, p1}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p2

    .line 82
    :cond_2
    :goto_0
    new-instance p1, Ll/ۜۢۧ;

    .line 83
    invoke-direct {p1, v2, v2}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p1
.end method

.method public final ֫(JJ)V
    .locals 5

    .line 99
    iget-object v0, p0, Ll/ᩳۢۧ;->ܽ:Ll/ۙۚ֫;

    invoke-virtual {v0}, Ll/ۙۚ֫;->֫()I

    move-result v1

    iget-object v2, p0, Ll/ᩳۢۧ;->ۧ:Ll/ۙۚ֫;

    if-nez v1, :cond_0

    const-wide/16 v3, 0x0

    cmp-long v1, p1, v3

    if-lez v1, :cond_0

    .line 101
    invoke-virtual {v2, v3, v4}, Ll/ۙۚ֫;->֫(J)V

    .line 102
    invoke-virtual {v0, v3, v4}, Ll/ۙۚ֫;->֫(J)V

    .line 104
    :cond_0
    invoke-virtual {v2, p3, p4}, Ll/ۙۚ֫;->֫(J)V

    .line 105
    invoke-virtual {v0, p1, p2}, Ll/ۙۚ֫;->֫(J)V

    return-void
.end method

.method public final ۜ()J
    .locals 2

    .line 70
    iget-wide v0, p0, Ll/ᩳۢۧ;->֫:J

    return-wide v0
.end method

.method public final ۧ(J)J
    .locals 2

    .line 116
    iget-object v0, p0, Ll/ᩳۢۧ;->ܽ:Ll/ۙۚ֫;

    invoke-virtual {v0}, Ll/ۙۚ֫;->֫()I

    move-result v1

    if-nez v1, :cond_0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1

    .line 119
    :cond_0
    iget-object v1, p0, Ll/ᩳۢۧ;->ۧ:Ll/ۙۚ֫;

    .line 120
    invoke-static {v1, p1, p2}, Ll/ۘ֨֫;->֫(Ll/ۙۚ֫;J)I

    move-result p1

    .line 122
    invoke-virtual {v0, p1}, Ll/ۙۚ֫;->֫(I)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ܽ(J)Z
    .locals 4

    .line 137
    iget-object v0, p0, Ll/ᩳۢۧ;->ܽ:Ll/ۙۚ֫;

    invoke-virtual {v0}, Ll/ۙۚ֫;->֫()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    invoke-virtual {v0}, Ll/ۙۚ֫;->֫()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ll/ۙۚ֫;->֫(I)J

    move-result-wide v0

    sub-long/2addr p1, v0

    const-wide/32 v0, 0x186a0

    cmp-long v3, p1, v0

    if-gez v3, :cond_1

    return v2

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ()Z
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ᩳۢۧ;->ܽ:Ll/ۙۚ֫;

    invoke-virtual {v0}, Ll/ۙۚ֫;->֫()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ(J)V
    .locals 0

    .line 145
    iput-wide p1, p0, Ll/ᩳۢۧ;->֫:J

    return-void
.end method
