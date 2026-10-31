.class public final synthetic Ll/֡ܿ۠;
.super Ljava/lang/Object;
.source "X44P"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/util/List;

    .line 1055
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
