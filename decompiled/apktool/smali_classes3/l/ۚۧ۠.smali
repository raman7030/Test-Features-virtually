.class public final Ll/ۚۧ۠;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public ᩸:Z


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 6

    .line 1794
    check-cast p1, Ll/ۛ֡֨;

    .line 1804
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    .line 1805
    iget-object p1, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne p1, v2, :cond_1

    const-wide/16 v2, 0x1000

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/ۚۧ۠;->᩸:Z

    if-nez p1, :cond_0

    const-wide v2, 0x80000000000L

    and-long/2addr v2, v0

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    const-wide/16 v2, 0x400

    and-long/2addr v0, v2

    cmp-long p1, v0, v4

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
