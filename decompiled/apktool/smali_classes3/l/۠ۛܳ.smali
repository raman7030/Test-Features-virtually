.class public final synthetic Ll/۠ۛܳ;
.super Ljava/lang/Object;
.source "NB79"

# interfaces
.implements Ljava/util/function/Function;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 2
    check-cast p1, Ll/ۘܳᩳ;

    .line 44
    invoke-static {p1}, Ll/۫ۤܳ;->ۧ(Ll/ۘܳᩳ;)I

    move-result v5

    if-nez v5, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 47
    :cond_0
    new-instance v6, Ll/ۙۛܳ;

    invoke-virtual {p1}, Ll/ۘܳᩳ;->ܽ()I

    move-result v2

    invoke-virtual {p1}, Ll/ۘܳᩳ;->ܿ()Ljava/lang/String;

    move-result-object v1

    .line 48
    invoke-static {p1}, Ll/۫ۤܳ;->֫(Ll/ۘܳᩳ;)Ljava/lang/String;

    move-result-object v3

    .line 49
    invoke-virtual {p1}, Ll/ۘܳᩳ;->ۜ()J

    move-result-wide v7

    long-to-int v4, v7

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۙۛܳ;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    return-object v6
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
