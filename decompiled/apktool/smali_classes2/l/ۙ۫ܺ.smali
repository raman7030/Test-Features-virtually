.class public final Ll/ۙ۫ܺ;
.super Ljava/lang/Object;
.source "I5ZF"


# direct methods
.method public static ֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 894
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static ֫(Ljava/util/Iterator;Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 2

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/util/Iterator;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    .line 469
    new-instance p0, Ll/ۖ۫ܺ;

    invoke-direct {p0, v0}, Ll/ۖ۫ܺ;-><init>([Ljava/util/Iterator;)V

    .line 572
    new-instance p1, Ll/ۚ۫ܺ;

    invoke-direct {p1, p0}, Ll/ۚ۫ܺ;-><init>(Ljava/util/Iterator;)V

    return-object p1
.end method

.method public static ֫(Ljava/util/Iterator;Ll/ܽܶܺ;)Ljava/util/Iterator;
    .locals 1

    .line 824
    new-instance v0, Ll/ᩴ۫ܺ;

    invoke-direct {v0, p0, p1}, Ll/ᩴ۫ܺ;-><init>(Ljava/util/Iterator;Ll/ܽܶܺ;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/Iterator;)Ll/ۛۤܺ;
    .locals 1

    .line 1265
    instance-of v0, p0, Ll/᩹۫ܺ;

    if-eqz v0, :cond_0

    .line 1269
    check-cast p0, Ll/᩹۫ܺ;

    return-object p0

    .line 1272
    :cond_0
    new-instance v0, Ll/᩹۫ܺ;

    invoke-direct {v0, p0}, Ll/᩹۫ܺ;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/util/Comparator;)Ll/᩶ۨܺ;
    .locals 1

    const-string v0, "iterators"

    .line 1305
    invoke-static {p0, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparator"

    .line 1306
    invoke-static {p1, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1308
    new-instance v0, Ll/᩸۫ܺ;

    invoke-direct {v0, p0, p1}, Ll/᩸۫ܺ;-><init>(Ljava/lang/Iterable;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/Collection;Ljava/util/Iterator;)Z
    .locals 2

    .line 902
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 369
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 370
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static ۧ(Ljava/util/Iterator;)Ljava/lang/Object;
    .locals 1

    .line 1025
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1026
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 1027
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(Ljava/util/Iterator;)I
    .locals 4

    const-wide/16 v0, 0x0

    .line 172
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 173
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    goto :goto_0

    .line 176
    :cond_0
    invoke-static {v0, v1}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result p0

    return p0
.end method
