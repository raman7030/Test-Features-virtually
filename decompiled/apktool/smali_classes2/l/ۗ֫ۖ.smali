.class public final synthetic Ll/ۗ֫ۖ;
.super Ljava/lang/Object;
.source "17QI"

# interfaces
.implements Ll/ᩴܶܺ;


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 3

    .line 2
    check-cast p1, Ll/᩶ۡ֨;

    .line 1875
    instance-of v0, p1, Ll/ܿܺ֨;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1878
    :cond_0
    check-cast p1, Ll/ܿܺ֨;

    invoke-static {p1}, Ll/ۗۧۖ;->֫(Ll/ܿܺ֨;)Ll/ܳ᩹۠;

    move-result-object p1

    const-string v0, "parallelStream"

    const-string v1, "toBuilder"

    const-string v2, "stream"

    .line 1879
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܽ᩺ᩴ;->of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 1880
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/ᩴ᩶۠;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Ll/ᩴ᩶۠;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method
