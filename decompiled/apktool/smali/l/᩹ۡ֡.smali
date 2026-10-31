.class public final synthetic Ll/᩹ۡ֡;
.super Ljava/lang/Object;
.source "57IT"

# interfaces
.implements Ljava/util/function/BiFunction;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 2
    new-instance v0, Ll/ᩴۢ֡;

    .line 4
    check-cast p1, Ljava/lang/Integer;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    check-cast p2, Ljava/io/IOException;

    const-string v1, "Null"

    if-nez p2, :cond_0

    move-object v2, v1

    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    :goto_1
    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object p1, v3, v2

    const/4 p1, 0x2

    aput-object v1, v3, p1

    const-string p1, "%s #%,d: %s"

    .line 42
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 57
    invoke-direct {v0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method
