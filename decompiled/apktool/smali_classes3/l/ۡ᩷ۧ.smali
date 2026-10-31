.class public Ll/ۡ᩷ۧ;
.super Ljava/lang/Object;
.source "28JD"

# interfaces
.implements Ll/ۢۢۧ;


# instance fields
.field public final ֫:Z

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:J

.field public final ᩻:J


# direct methods
.method public constructor <init>(IIJJZ)V
    .locals 2

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-wide p3, p0, Ll/ۡ᩷ۧ;->᩻:J

    .line 77
    iput-wide p5, p0, Ll/ۡ᩷ۧ;->ܿ:J

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    .line 78
    :cond_0
    iput p2, p0, Ll/ۡ᩷ۧ;->ܳ:I

    .line 79
    iput p1, p0, Ll/ۡ᩷ۧ;->ۧ:I

    .line 80
    iput-boolean p7, p0, Ll/ۡ᩷ۧ;->֫:Z

    const-wide/16 v0, -0x1

    cmp-long p2, p3, v0

    if-nez p2, :cond_1

    .line 83
    iput-wide v0, p0, Ll/ۡ᩷ۧ;->ܽ:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 84
    iput-wide p1, p0, Ll/ۡ᩷ۧ;->ᩳ:J

    return-void

    :cond_1
    sub-long/2addr p3, p5

    .line 86
    iput-wide p3, p0, Ll/ۡ᩷ۧ;->ܽ:J

    const-wide/16 p5, 0x0

    .line 145
    invoke-static {p5, p6, p3, p4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    const-wide/32 p4, 0x7a1200

    mul-long p2, p2, p4

    int-to-long p4, p1

    div-long/2addr p2, p4

    .line 87
    iput-wide p2, p0, Ll/ۡ᩷ۧ;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 15

    move-object v0, p0

    .line 98
    iget-wide v1, v0, Ll/ۡ᩷ۧ;->ܿ:J

    const-wide/16 v3, 0x0

    iget-wide v5, v0, Ll/ۡ᩷ۧ;->ܽ:J

    const-wide/16 v7, -0x1

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    iget-boolean v9, v0, Ll/ۡ᩷ۧ;->֫:Z

    if-nez v9, :cond_0

    .line 99
    new-instance v5, Ll/ۜۢۧ;

    new-instance v6, Ll/ۡۢۧ;

    invoke-direct {v6, v3, v4, v1, v2}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 83
    invoke-direct {v5, v6, v6}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v5

    .line 152
    :cond_0
    iget v9, v0, Ll/ۡ᩷ۧ;->ۧ:I

    int-to-long v9, v9

    mul-long v9, v9, p1

    const-wide/32 v11, 0x7a1200

    div-long/2addr v9, v11

    .line 154
    iget v11, v0, Ll/ۡ᩷ۧ;->ܳ:I

    int-to-long v12, v11

    div-long/2addr v9, v12

    mul-long v9, v9, v12

    cmp-long v14, v5, v7

    if-eqz v14, :cond_1

    sub-long v12, v5, v12

    .line 156
    invoke-static {v9, v10, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    .line 158
    :cond_1
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    add-long/2addr v1, v3

    .line 102
    invoke-virtual {p0, v1, v2}, Ll/ۡ᩷ۧ;->ܽ(J)J

    move-result-wide v3

    .line 103
    new-instance v9, Ll/ۡۢۧ;

    invoke-direct {v9, v3, v4, v1, v2}, Ll/ۡۢۧ;-><init>(JJ)V

    cmp-long v10, v5, v7

    if-eqz v10, :cond_3

    cmp-long v5, v3, p1

    if-gez v5, :cond_3

    int-to-long v3, v11

    add-long/2addr v3, v1

    .line 107
    iget-wide v5, v0, Ll/ۡ᩷ۧ;->᩻:J

    cmp-long v7, v3, v5

    if-ltz v7, :cond_2

    goto :goto_0

    :cond_2
    int-to-long v3, v11

    add-long/2addr v1, v3

    .line 113
    invoke-virtual {p0, v1, v2}, Ll/ۡ᩷ۧ;->ܽ(J)J

    move-result-wide v3

    .line 114
    new-instance v5, Ll/ۡۢۧ;

    invoke-direct {v5, v3, v4, v1, v2}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 115
    new-instance v1, Ll/ۜۢۧ;

    invoke-direct {v1, v9, v5}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v1

    .line 110
    :cond_3
    :goto_0
    new-instance v1, Ll/ۜۢۧ;

    .line 83
    invoke-direct {v1, v9, v9}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v1
.end method

.method public final ۜ()J
    .locals 2

    .line 121
    iget-wide v0, p0, Ll/ۡ᩷ۧ;->ᩳ:J

    return-wide v0
.end method

.method public ۧ(J)J
    .locals 0

    .line 75
    invoke-virtual {p0, p1, p2}, Ll/ۡ᩷ۧ;->ܽ(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ܽ(J)J
    .locals 4

    const-wide/16 v0, 0x0

    .line 145
    iget-wide v2, p0, Ll/ۡ᩷ۧ;->ܿ:J

    sub-long/2addr p1, v2

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    const-wide/32 v0, 0x7a1200

    mul-long p1, p1, v0

    iget v0, p0, Ll/ۡ᩷ۧ;->ۧ:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public final ܿ()Z
    .locals 5

    .line 93
    iget-wide v0, p0, Ll/ۡ᩷ۧ;->ܽ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    iget-boolean v0, p0, Ll/ۡ᩷ۧ;->֫:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
