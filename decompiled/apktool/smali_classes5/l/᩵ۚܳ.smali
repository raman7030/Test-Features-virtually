.class public final synthetic Ll/᩵ۚܳ;
.super Ljava/lang/Object;
.source "X1Y5"

# interfaces
.implements Ljava/util/function/BinaryOperator;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 4
    check-cast p2, Ljava/lang/String;

    .line 122
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/16 v0, 0x2f

    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 126
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ne v1, v0, :cond_1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    .line 128
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    .line 129
    invoke-virtual {p2, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 130
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "*"

    .line 131
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "*/*"

    return-object p1
.end method
