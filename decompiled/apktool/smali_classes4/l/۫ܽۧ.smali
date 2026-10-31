.class public final Ll/۫ܽۧ;
.super Ljava/lang/Object;
.source "K8M4"

# interfaces
.implements Ll/ۢۧۧ;
.implements Ll/᩷ۧۧ;


# instance fields
.field public final ᩶:J

.field public ᩸:Ll/᩷ۧۧ;

.field public final ᩹:Ll/ۢۧۧ;


# direct methods
.method public constructor <init>(Ll/ۢۧۧ;J)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    .line 49
    iput-wide p2, p0, Ll/۫ܽۧ;->᩶:J

    return-void
.end method


# virtual methods
.method public final ֫(J)J
    .locals 3

    .line 124
    iget-wide v0, p0, Ll/۫ܽۧ;->᩶:J

    sub-long/2addr p1, v0

    iget-object v2, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v2, p1, p2}, Ll/ۢۧۧ;->֫(J)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final ֫(JLl/ۢ۬֫;)J
    .locals 3

    .line 129
    iget-wide v0, p0, Ll/۫ܽۧ;->᩶:J

    sub-long/2addr p1, v0

    iget-object v2, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v2, p1, p2, p3}, Ll/ۢۧۧ;->֫(JLl/ۢ۬֫;)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final ֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J
    .locals 14

    move-object v0, p0

    move-object/from16 v1, p3

    .line 85
    array-length v2, v1

    new-array v2, v2, [Ll/ᩴܽۧ;

    const/4 v10, 0x0

    const/4 v3, 0x0

    .line 86
    :goto_0
    array-length v4, v1

    const/4 v11, 0x0

    if-ge v3, v4, :cond_1

    .line 87
    aget-object v4, v1, v3

    check-cast v4, Ll/۬ܽۧ;

    if-eqz v4, :cond_0

    .line 88
    invoke-virtual {v4}, Ll/۬ܽۧ;->ۧ()Ll/ᩴܽۧ;

    move-result-object v11

    :cond_0
    aput-object v11, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 90
    :cond_1
    iget-object v3, v0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    iget-wide v12, v0, Ll/۫ܽۧ;->᩶:J

    sub-long v8, p5, v12

    move-object v4, p1

    move-object/from16 v5, p2

    move-object v6, v2

    move-object/from16 v7, p4

    .line 91
    invoke-interface/range {v3 .. v9}, Ll/ۢۧۧ;->֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J

    move-result-wide v3

    .line 97
    :goto_1
    array-length v5, v1

    if-ge v10, v5, :cond_5

    .line 98
    aget-object v5, v2, v10

    if-nez v5, :cond_2

    .line 100
    aput-object v11, v1, v10

    goto :goto_2

    .line 101
    :cond_2
    aget-object v6, v1, v10

    if-eqz v6, :cond_3

    check-cast v6, Ll/۬ܽۧ;

    .line 102
    invoke-virtual {v6}, Ll/۬ܽۧ;->ۧ()Ll/ᩴܽۧ;

    move-result-object v6

    if-eq v6, v5, :cond_4

    .line 103
    :cond_3
    new-instance v6, Ll/۬ܽۧ;

    invoke-direct {v6, v5, v12, v13}, Ll/۬ܽۧ;-><init>(Ll/ᩴܽۧ;J)V

    aput-object v6, v1, v10

    :cond_4
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_5
    add-long/2addr v3, v12

    return-wide v3
.end method

.method public final ֫(JZ)V
    .locals 2

    .line 111
    iget-wide v0, p0, Ll/۫ܽۧ;->᩶:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢۧۧ;->֫(JZ)V

    return-void
.end method

.method public final ֫(Ll/֡ܽۧ;)V
    .locals 0

    .line 33
    check-cast p1, Ll/ۢۧۧ;

    .line 175
    iget-object p1, p0, Ll/۫ܽۧ;->᩸:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    invoke-interface {p1, p0}, Ll/᩵ܽۧ;->֫(Ll/֡ܽۧ;)V

    return-void
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 0

    .line 170
    iget-object p1, p0, Ll/۫ܽۧ;->᩸:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    invoke-interface {p1, p0}, Ll/᩷ۧۧ;->֫(Ll/ۢۧۧ;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۧۧ;J)V
    .locals 2

    .line 59
    iput-object p1, p0, Ll/۫ܽۧ;->᩸:Ll/᩷ۧۧ;

    .line 60
    iget-wide v0, p0, Ll/۫ܽۧ;->᩶:J

    sub-long/2addr p2, v0

    iget-object p1, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {p1, p0, p2, p3}, Ll/ۢۧۧ;->֫(Ll/᩷ۧۧ;J)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 160
    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/֡ܽۧ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۨۙ֫;)Z
    .locals 5

    .line 153
    invoke-virtual {p1}, Ll/ۨۙ֫;->֫()Ll/ۛۙ֫;

    move-result-object v0

    iget-wide v1, p1, Ll/ۨۙ֫;->ۧ:J

    iget-wide v3, p0, Ll/۫ܽۧ;->᩶:J

    sub-long/2addr v1, v3

    .line 154
    invoke-virtual {v0, v1, v2}, Ll/ۛۙ֫;->ۧ(J)V

    .line 155
    invoke-virtual {v0}, Ll/ۛۙ֫;->֫()Ll/ۨۙ֫;

    move-result-object p1

    .line 151
    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v0, p1}, Ll/֡ܽۧ;->֫(Ll/ۨۙ֫;)Z

    move-result p1

    return p1
.end method

.method public final ۜ()J
    .locals 5

    .line 135
    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/֡ܽۧ;->ۜ()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    .line 138
    :cond_0
    iget-wide v2, p0, Ll/۫ܽۧ;->᩶:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ۧ()J
    .locals 5

    .line 143
    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/֡ܽۧ;->ۧ()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    .line 146
    :cond_0
    iget-wide v2, p0, Ll/۫ܽۧ;->᩶:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ۧ(J)V
    .locals 2

    .line 165
    iget-wide v0, p0, Ll/۫ܽۧ;->᩶:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v0, p1, p2}, Ll/֡ܽۧ;->ۧ(J)V

    return-void
.end method

.method public final ܽ()J
    .locals 5

    .line 116
    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/ۢۧۧ;->ܽ()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    .line 119
    :cond_0
    iget-wide v2, p0, Ll/۫ܽۧ;->᩶:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܿ()V
    .locals 1

    .line 65
    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/ۢۧۧ;->ܿ()V

    return-void
.end method

.method public final ᩳ()Ll/ۢۧۧ;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    return-object v0
.end method

.method public final ᩻()Ll/ۛܽۧ;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/۫ܽۧ;->᩹:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/ۢۧۧ;->᩻()Ll/ۛܽۧ;

    move-result-object v0

    return-object v0
.end method
