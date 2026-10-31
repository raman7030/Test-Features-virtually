.class public final synthetic Ll/ܳ᩸ܽ;
.super Ljava/lang/Object;
.source "G1PO"

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
    .locals 1

    .line 0
    check-cast p1, Ljava/lang/String;

    new-instance v0, Ll/ܽ᩸ܽ;

    invoke-direct {v0, p1}, Ll/ܽ᩸ܽ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
