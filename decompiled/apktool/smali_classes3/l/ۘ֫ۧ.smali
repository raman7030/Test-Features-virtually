.class public final Ll/ۘ֫ۧ;
.super Ljava/lang/Object;
.source "H8LH"

# interfaces
.implements Ll/ۢۧۧ;
.implements Ll/᩷ۧۧ;


# instance fields
.field public ۗ:J

.field public final ۙ:Ll/ۢۧۧ;

.field public ۫:J

.field public ۬:[Ll/ۖ֫ۧ;

.field public ᩶:J

.field public ᩸:Ll/᩷ۧۧ;

.field public ᩹:Ll/֡֫ۧ;


# direct methods
.method public constructor <init>(Ll/ۢۧۧ;ZJJ)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    const/4 p1, 0x0

    new-array p1, p1, [Ll/ۖ֫ۧ;

    .line 73
    iput-object p1, p0, Ll/ۘ֫ۧ;->۬:[Ll/ۖ֫ۧ;

    if-eqz p2, :cond_0

    move-wide p1, p3

    goto :goto_0

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    :goto_0
    iput-wide p1, p0, Ll/ۘ֫ۧ;->ۗ:J

    .line 75
    iput-wide p3, p0, Ll/ۘ֫ۧ;->۫:J

    .line 76
    iput-wide p5, p0, Ll/ۘ֫ۧ;->᩶:J

    return-void
.end method


# virtual methods
.method public final ֫(J)J
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 197
    iput-wide v0, p0, Ll/ۘ֫ۧ;->ۗ:J

    .line 198
    iget-object v0, p0, Ll/ۘ֫ۧ;->۬:[Ll/ۖ֫ۧ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    .line 200
    invoke-virtual {v3}, Ll/ۖ֫ۧ;->ۧ()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 203
    :cond_1
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0, p1, p2}, Ll/ۢۧۧ;->֫(J)J

    move-result-wide p1

    iget-wide v0, p0, Ll/ۘ֫ۧ;->۫:J

    iget-wide v2, p0, Ll/ۘ֫ۧ;->᩶:J

    .line 305
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    .line 307
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    :cond_2
    return-wide p1
.end method

.method public final ֫(JLl/ۢ۬֫;)J
    .locals 9

    .line 208
    iget-wide v0, p0, Ll/ۘ֫ۧ;->۫:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-wide v0

    .line 256
    :cond_0
    iget-wide v3, p3, Ll/ۢ۬֫;->ۧ:J

    const-wide/16 v5, 0x0

    sub-long v7, p1, v0

    .line 257
    invoke-static/range {v3 .. v8}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v0

    .line 259
    iget-wide v2, p3, Ll/ۢ۬֫;->֫:J

    .line 263
    iget-wide v4, p0, Ll/ۘ֫ۧ;->᩶:J

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, v4, v6

    if-nez v8, :cond_1

    const-wide v4, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    sub-long/2addr v4, p1

    :goto_0
    move-wide v6, v4

    const-wide/16 v4, 0x0

    .line 260
    invoke-static/range {v2 .. v7}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v2

    .line 264
    iget-wide v4, p3, Ll/ۢ۬֫;->ۧ:J

    cmp-long v6, v0, v4

    if-nez v6, :cond_2

    iget-wide v4, p3, Ll/ۢ۬֫;->֫:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    goto :goto_1

    .line 268
    :cond_2
    new-instance p3, Ll/ۢ۬֫;

    invoke-direct {p3, v0, v1, v2, v3}, Ll/ۢ۬֫;-><init>(JJ)V

    .line 213
    :goto_1
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢۧۧ;->֫(JLl/ۢ۬֫;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J
    .locals 9

    .line 132
    array-length v0, p3

    new-array v0, v0, [Ll/ۖ֫ۧ;

    iput-object v0, p0, Ll/ۘ֫ۧ;->۬:[Ll/ۖ֫ۧ;

    .line 133
    array-length v0, p3

    new-array v0, v0, [Ll/ᩴܽۧ;

    const/4 v1, 0x0

    .line 134
    :goto_0
    array-length v2, p3

    if-ge v1, v2, :cond_1

    .line 135
    iget-object v2, p0, Ll/ۘ֫ۧ;->۬:[Ll/ۖ֫ۧ;

    aget-object v3, p3, v1

    check-cast v3, Ll/ۖ֫ۧ;

    aput-object v3, v2, v1

    if-eqz v3, :cond_0

    .line 136
    iget-object v2, v3, Ll/ۖ֫ۧ;->֫:Ll/ᩴܽۧ;

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 138
    :cond_1
    iget-object v1, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    move-object v2, p1

    move-object v3, p2

    move-object v4, v0

    move-object v5, p4

    move-wide v6, p5

    .line 139
    invoke-interface/range {v1 .. v7}, Ll/ۢۧۧ;->֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J

    move-result-wide v1

    .line 141
    iget-wide v3, p0, Ll/ۘ֫ۧ;->᩶:J

    const/4 p2, 0x0

    .line 305
    invoke-static {v1, v2, p5, p6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    const-wide/high16 v7, -0x8000000000000000L

    cmp-long p4, v3, v7

    if-eqz p4, :cond_2

    .line 307
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    .line 144
    :cond_2
    invoke-virtual {p0}, Ll/ۘ֫ۧ;->ᩳ()Z

    move-result p4

    if-eqz p4, :cond_5

    cmp-long p4, v1, p5

    if-gez p4, :cond_3

    goto :goto_3

    :cond_3
    const-wide/16 p4, 0x0

    cmp-long p6, v1, p4

    if-eqz p6, :cond_5

    .line 290
    array-length p4, p1

    const/4 p5, 0x0

    :goto_2
    if-ge p5, p4, :cond_5

    aget-object p6, p1, p5

    if-eqz p6, :cond_4

    .line 292
    invoke-interface {p6}, Ll/ۢܿۧ;->ۜ()Ll/۠ᩴ֫;

    move-result-object p6

    .line 293
    iget-object v1, p6, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object p6, p6, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    invoke-static {v1, p6}, Ll/ۢ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p6

    if-nez p6, :cond_4

    :goto_3
    move-wide p4, v5

    goto :goto_4

    :cond_4
    add-int/lit8 p5, p5, 0x1

    goto :goto_2

    :cond_5
    const-wide p4, -0x7fffffffffffffffL    # -4.9E-324

    .line 147
    :goto_4
    iput-wide p4, p0, Ll/ۘ֫ۧ;->ۗ:J

    const/4 p1, 0x0

    .line 148
    :goto_5
    array-length p4, p3

    if-ge p1, p4, :cond_9

    .line 149
    aget-object p4, v0, p1

    if-nez p4, :cond_6

    .line 150
    iget-object p4, p0, Ll/ۘ֫ۧ;->۬:[Ll/ۖ֫ۧ;

    aput-object p2, p4, p1

    goto :goto_6

    .line 151
    :cond_6
    iget-object p5, p0, Ll/ۘ֫ۧ;->۬:[Ll/ۖ֫ۧ;

    aget-object p6, p5, p1

    if-eqz p6, :cond_7

    iget-object p6, p6, Ll/ۖ֫ۧ;->֫:Ll/ᩴܽۧ;

    if-eq p6, p4, :cond_8

    .line 152
    :cond_7
    new-instance p6, Ll/ۖ֫ۧ;

    invoke-direct {p6, p0, p4}, Ll/ۖ֫ۧ;-><init>(Ll/ۘ֫ۧ;Ll/ᩴܽۧ;)V

    aput-object p6, p5, p1

    .line 154
    :cond_8
    :goto_6
    iget-object p4, p0, Ll/ۘ֫ۧ;->۬:[Ll/ۖ֫ۧ;

    aget-object p4, p4, p1

    aput-object p4, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    :cond_9
    return-wide v5
.end method

.method public final ֫(JZ)V
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢۧۧ;->֫(JZ)V

    return-void
.end method

.method public final ֫(Ll/֡֫ۧ;)V
    .locals 0

    .line 98
    iput-object p1, p0, Ll/ۘ֫ۧ;->᩹:Ll/֡֫ۧ;

    return-void
.end method

.method public final ֫(Ll/֡ܽۧ;)V
    .locals 0

    .line 43
    check-cast p1, Ll/ۢۧۧ;

    .line 248
    iget-object p1, p0, Ll/ۘ֫ۧ;->᩸:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    invoke-interface {p1, p0}, Ll/᩵ܽۧ;->֫(Ll/֡ܽۧ;)V

    return-void
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 0

    .line 240
    iget-object p1, p0, Ll/ۘ֫ۧ;->᩹:Ll/֡֫ۧ;

    if-eqz p1, :cond_0

    return-void

    .line 243
    :cond_0
    iget-object p1, p0, Ll/ۘ֫ۧ;->᩸:Ll/᩷ۧۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    invoke-interface {p1, p0}, Ll/᩷ۧۧ;->֫(Ll/ۢۧۧ;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۧۧ;J)V
    .locals 0

    .line 103
    iput-object p1, p0, Ll/ۘ֫ۧ;->᩸:Ll/᩷ۧۧ;

    .line 104
    iget-object p1, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {p1, p0, p2, p3}, Ll/ۢۧۧ;->֫(Ll/᩷ۧۧ;J)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 233
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/֡ܽۧ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۨۙ֫;)Z
    .locals 1

    .line 228
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0, p1}, Ll/֡ܽۧ;->֫(Ll/ۨۙ֫;)Z

    move-result p1

    return p1
.end method

.method public final ۜ()J
    .locals 7

    .line 187
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/֡ܽۧ;->ۜ()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 188
    iget-wide v4, p0, Ll/ۘ֫ۧ;->᩶:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    cmp-long v6, v0, v4

    if-ltz v6, :cond_0

    goto :goto_0

    :cond_0
    return-wide v0

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final ۧ()J
    .locals 7

    .line 218
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/֡ܽۧ;->ۧ()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 219
    iget-wide v4, p0, Ll/ۘ֫ۧ;->᩶:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    cmp-long v6, v0, v4

    if-ltz v6, :cond_0

    goto :goto_0

    :cond_0
    return-wide v0

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final ۧ(J)V
    .locals 1

    .line 166
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0, p1, p2}, Ll/֡ܽۧ;->ۧ(J)V

    return-void
.end method

.method public final ܽ()J
    .locals 7

    .line 171
    invoke-virtual {p0}, Ll/ۘ֫ۧ;->ᩳ()Z

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_1

    .line 172
    iget-wide v3, p0, Ll/ۘ֫ۧ;->ۗ:J

    .line 173
    iput-wide v1, p0, Ll/ۘ֫ۧ;->ۗ:J

    .line 175
    invoke-virtual {p0}, Ll/ۘ֫ۧ;->ܽ()J

    move-result-wide v5

    cmp-long v0, v5, v1

    if-eqz v0, :cond_0

    return-wide v5

    :cond_0
    return-wide v3

    .line 178
    :cond_1
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/ۢۧۧ;->ܽ()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    return-wide v1

    .line 182
    :cond_2
    iget-wide v0, p0, Ll/ۘ֫ۧ;->۫:J

    iget-wide v5, p0, Ll/ۘ֫ۧ;->᩶:J

    .line 305
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v5, v2

    if-eqz v4, :cond_3

    .line 307
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_3
    return-wide v0
.end method

.method public final ܽ(J)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 87
    iput-wide v0, p0, Ll/ۘ֫ۧ;->۫:J

    .line 88
    iput-wide p1, p0, Ll/ۘ֫ۧ;->᩶:J

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ۘ֫ۧ;->᩹:Ll/֡֫ۧ;

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/ۢۧۧ;->ܿ()V

    return-void

    .line 110
    :cond_0
    throw v0
.end method

.method public final ᩳ()Z
    .locals 5

    .line 252
    iget-wide v0, p0, Ll/ۘ֫ۧ;->ۗ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Ll/ۛܽۧ;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0}, Ll/ۢۧۧ;->᩻()Ll/ۛܽۧ;

    move-result-object v0

    return-object v0
.end method
