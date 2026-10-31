.class public final Ll/֫ۧܳ;
.super Ljava/lang/Object;
.source "M70P"


# instance fields
.field public final ֫:J

.field public final ۧ:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 18
    iput-wide p1, p0, Ll/֫ۧܳ;->ۧ:J

    .line 19
    iput-wide p3, p0, Ll/֫ۧܳ;->֫:J

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "length < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 47
    :cond_0
    instance-of v1, p1, Ll/֫ۧܳ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ll/֫ۧܳ;

    .line 50
    iget-wide v3, p0, Ll/֫ۧܳ;->ۧ:J

    iget-wide v5, p1, Ll/֫ۧܳ;->ۧ:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-wide v3, p0, Ll/֫ۧܳ;->֫:J

    iget-wide v5, p1, Ll/֫ۧܳ;->֫:J

    cmp-long p1, v3, v5

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 55
    iget-wide v0, p0, Ll/֫ۧܳ;->ۧ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Ll/֫ۧܳ;->֫:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FileRevision{length="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/֫ۧܳ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", lastModified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/֫ۧܳ;->֫:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()J
    .locals 2

    .line 32
    iget-wide v0, p0, Ll/֫ۧܳ;->֫:J

    return-wide v0
.end method

.method public final ֫(Ll/ܺ֡ܿ;)Z
    .locals 5

    .line 37
    invoke-virtual {p1}, Ll/ܺ֡ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/֫ۧܳ;->ۧ:J

    .line 38
    invoke-virtual {p1}, Ll/ܺ֡ܿ;->᩺֫()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/֫ۧܳ;->֫:J

    .line 39
    invoke-virtual {p1}, Ll/ܺ֡ܿ;->ۛ֫()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()J
    .locals 2

    .line 28
    iget-wide v0, p0, Ll/֫ۧܳ;->ۧ:J

    return-wide v0
.end method
