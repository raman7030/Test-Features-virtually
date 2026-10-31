.class public final Ll/ۘ᩹ᩳ;
.super Ljava/lang/Object;
.source "K6QN"


# direct methods
.method public static ֫(Ljava/lang/Object;)J
    .locals 7

    .line 17
    instance-of v0, p0, Ll/۠۬ᩳ;

    const-wide/16 v1, 0x70

    if-eqz v0, :cond_0

    check-cast p0, Ll/۠۬ᩳ;

    iget-wide v3, p0, Ll/۠۬ᩳ;->֫:J

    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p0, Ll/ۧ۫ᩳ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ۧ۫ᩳ;

    const-wide/16 v0, 0x30

    invoke-virtual {p0}, Ll/ۧ۫ᩳ;->֫()J

    move-result-wide v2

    add-long/2addr v2, v0

    return-wide v2

    .line 19
    :cond_1
    instance-of v0, p0, Ll/᩻᩹ᩳ;

    if-eqz v0, :cond_2

    check-cast p0, Ll/᩻᩹ᩳ;

    iget-object p0, p0, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length p0, p0

    int-to-long v3, p0

    const-wide/16 v5, 0x8

    mul-long v3, v3, v5

    :goto_0
    add-long/2addr v3, v1

    return-wide v3

    .line 20
    :cond_2
    instance-of v0, p0, Ll/᩸᩹ᩳ;

    if-eqz v0, :cond_3

    return-wide v1

    .line 21
    :cond_3
    instance-of p0, p0, Ll/ۨ᩹ᩳ;

    if-eqz p0, :cond_4

    const-wide/16 v0, 0x58

    return-wide v0

    .line 22
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported text budget object"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/util/function/Consumer;)V
    .locals 3

    .line 25
    instance-of v0, p0, Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۨ᩹ᩳ;

    iget-object p0, p0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    .line 26
    :cond_0
    instance-of v0, p0, Ll/᩻᩹ᩳ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/᩻᩹ᩳ;

    .line 27
    iget-object p0, p0, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p0, v1

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 28
    :cond_1
    instance-of v0, p0, Ll/᩸᩹ᩳ;

    if-eqz v0, :cond_2

    check-cast p0, Ll/᩸᩹ᩳ;

    invoke-virtual {p0}, Ll/᩸᩹ᩳ;->ᩳ()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
