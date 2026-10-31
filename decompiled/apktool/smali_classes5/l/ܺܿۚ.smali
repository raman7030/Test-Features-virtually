.class public Ll/ܺܿۚ;
.super Ljava/lang/Object;
.source "M5S5"

# interfaces
.implements Ll/ܿܿۚ;
.implements Ll/۟ܽۚ;


# instance fields
.field public final ᩸:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-wide p1, p0, Ll/ܺܿۚ;->᩸:J

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 44
    check-cast p1, Ll/ۤܽۚ;

    const/4 v0, 0x6

    .line 62
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 64
    :cond_0
    check-cast p1, Ll/۟ܽۚ;

    invoke-interface {p1}, Ll/۟ܽۚ;->getValue()J

    move-result-wide v0

    .line 94
    iget-wide v2, p0, Ll/ܺܿۚ;->᩸:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 54
    instance-of v0, p1, Ll/۟ܽۚ;

    if-eqz v0, :cond_0

    .line 55
    check-cast p1, Ll/۟ܽۚ;

    invoke-interface {p1}, Ll/۟ܽۚ;->getValue()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ܺܿۚ;->᩸:J

    cmp-long p1, v2, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getValue()J
    .locals 2

    .line 53
    iget-wide v0, p0, Ll/ܺܿۚ;->᩸:J

    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    .line 48
    iget-wide v0, p0, Ll/ܺܿۚ;->᩸:J

    long-to-int v2, v0

    mul-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x20

    ushr-long/2addr v0, v3

    long-to-int v1, v0

    add-int/2addr v2, v1

    return v2
.end method

.method public final ۖ()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method
