.class public abstract Ll/ۚܺܺ;
.super Ll/֨ܺܺ;
.source "JBIA"


# instance fields
.field public final ᩸:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ll/֨ܺܺ;-><init>()V

    .line 35
    iput-wide p1, p0, Ll/ۚܺܺ;->᩸:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-eqz p1, :cond_0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    check-cast p1, Ll/ۚܺܺ;

    iget-wide v0, p1, Ll/ۚܺܺ;->᩸:J

    iget-wide v2, p0, Ll/ۚܺܺ;->᩸:J

    cmp-long p1, v2, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 53
    iget-wide v0, p0, Ll/ۚܺܺ;->᩸:J

    long-to-int v2, v0

    const/16 v3, 0x20

    shr-long/2addr v0, v3

    long-to-int v1, v0

    xor-int v0, v2, v1

    return v0
.end method

.method public final ֡()J
    .locals 2

    .line 101
    iget-wide v0, p0, Ll/ۚܺܺ;->᩸:J

    return-wide v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 4

    .line 61
    check-cast p1, Ll/ۚܺܺ;

    iget-wide v0, p1, Ll/ۚܺܺ;->᩸:J

    .line 63
    iget-wide v2, p0, Ll/ۚܺܺ;->᩸:J

    cmp-long p1, v2, v0

    if-gez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܺ()Z
    .locals 5

    .line 85
    iget-wide v0, p0, Ll/ۚܺܺ;->᩸:J

    long-to-int v2, v0

    int-to-long v2, v2

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ()I
    .locals 2

    .line 93
    iget-wide v0, p0, Ll/ۚܺܺ;->᩸:J

    long-to-int v1, v0

    return v1
.end method
