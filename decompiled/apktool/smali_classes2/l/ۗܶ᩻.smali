.class public final Ll/ۗܶ᩻;
.super Ll/֨᩺ۡ;
.source "37T7"


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;)J
    .locals 2

    .line 9
    check-cast p1, Ll/֨᩷֡;

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final bridge synthetic ֫(JLjava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p3, Ll/֨᩷֡;

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 9
    check-cast p1, Ll/֨᩷֡;

    .line 17
    invoke-virtual {p1}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Ll/֨᩷֡;->᩸()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ۧ(JLjava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p3, Ll/֨᩷֡;

    .line 46
    invoke-virtual {p3, p1, p2}, Ll/֨᩷֡;->ۧ(J)V

    return-void
.end method

.method public final ܽ(Ljava/lang/Object;)J
    .locals 2

    .line 9
    check-cast p1, Ll/֨᩷֡;

    .line 36
    invoke-virtual {p1}, Ll/֨᩷֡;->᩵()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 56
    new-instance v0, Ll/֨᩷֡;

    .line 624
    invoke-direct {v0, p1}, Ll/֨᩷֡;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ܽ(JLjava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p3, Ll/֨᩷֡;

    .line 31
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1882
    invoke-static {p1, p2}, Ll/ۙ۠ᩴ;->fromMillis(J)Ll/ۙ۠ᩴ;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/֨᩷֡;->֫(Ll/ۙ۠ᩴ;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/Object;)J
    .locals 2

    .line 9
    check-cast p1, Ll/֨᩷֡;

    .line 26
    invoke-virtual {p1}, Ll/֨᩷֡;->ܺ()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method
