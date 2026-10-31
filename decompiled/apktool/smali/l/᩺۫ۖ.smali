.class public final Ll/᩺۫ۖ;
.super Ljava/lang/Object;
.source "P9CH"


# instance fields
.field public final ֫:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-wide p1, p0, Ll/᩺۫ۖ;->֫:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 82
    const-class v2, Ll/᩺۫ۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 84
    :cond_1
    check-cast p1, Ll/᩺۫ۖ;

    .line 86
    iget-wide v2, p0, Ll/᩺۫ۖ;->֫:J

    iget-wide v4, p1, Ll/᩺۫ۖ;->֫:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 5

    const/16 v0, 0x20

    .line 91
    iget-wide v1, p0, Ll/᩺۫ۖ;->֫:J

    ushr-long v3, v1, v0

    xor-long v0, v1, v3

    long-to-int v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 71
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p0}, Ll/᩺۫ۖ;->ۧ()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 76
    invoke-virtual {v0}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()J
    .locals 2

    .line 55
    iget-wide v0, p0, Ll/᩺۫ۖ;->֫:J

    return-wide v0
.end method

.method public final ۧ()J
    .locals 5

    .line 59
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 63
    iget-wide v1, p0, Ll/᩺۫ۖ;->֫:J

    const-wide v3, 0x19db1ded53e8000L

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x64

    mul-long v1, v1, v3

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method
