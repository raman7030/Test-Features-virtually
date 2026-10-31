.class public final Ll/ۨۨۜ;
.super Ljava/lang/Object;
.source "66M9"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:J

.field public final ܽ:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 2

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۨۨۜ;->֫:Ljava/lang/String;

    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-ltz p1, :cond_0

    .line 156
    iput-wide p2, p0, Ll/ۨۨۜ;->ܽ:J

    .line 157
    iput-wide p4, p0, Ll/ۨۨۜ;->ۧ:J

    return-void

    .line 155
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid source size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 162
    instance-of v0, p1, Ll/ۨۨۜ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 163
    :cond_0
    check-cast p1, Ll/ۨۨۜ;

    .line 164
    iget-wide v2, p0, Ll/ۨۨۜ;->ܽ:J

    iget-wide v4, p1, Ll/ۨۨۜ;->ܽ:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Ll/ۨۨۜ;->ۧ:J

    iget-wide v4, p1, Ll/ۨۨۜ;->ۧ:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۨۨۜ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۨۨۜ;->֫:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 169
    iget-wide v0, p0, Ll/ۨۨۜ;->ܽ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Ll/ۨۨۜ;->ۧ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/ۨۨۜ;->֫:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    invoke-static {v2}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
