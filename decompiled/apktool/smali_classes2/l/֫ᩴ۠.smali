.class public final Ll/֫ᩴ۠;
.super Ljava/lang/Object;
.source "A7L5"


# direct methods
.method public static ֫(Ljava/lang/String;)Ll/ۛۘ۠;
    .locals 4

    const-string v0, ":"

    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 46
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, p0

    :goto_0
    if-eq v0, v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_1
    const-string p0, ""

    .line 49
    :goto_1
    const-class v0, Ll/ܺۡ۠;

    .line 50
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-class v2, Ll/᩺ۘ۠;

    invoke-static {v2, v0}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    .line 52
    invoke-static {v0}, Ll/᩶֨ᩴ;->spliterator(Ljava/lang/Iterable;)Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܰۘ۠;

    invoke-direct {v1, v3}, Ll/ܰۘ۠;-><init>(Ljava/lang/String;)V

    .line 53
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 57
    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩻ۛ᩷;

    invoke-direct {v1, v3, p0}, Ll/᩻ۛ᩷;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v0, v1}, Ll/ܽ۫ᩴ;->flatMap(Ljava/util/function/Function;)Ll/ܽ۫ᩴ;

    move-result-object p0

    const/4 v0, 0x0

    .line 65
    invoke-virtual {p0, v0}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۛۘ۠;

    return-object p0
.end method

.method public static synthetic ֫(Ljava/lang/String;Ll/᩺ۘ۠;)Z
    .locals 1

    .line 53
    invoke-interface {p1}, Ll/᩺ۘ۠;->ۧ()Ljava/lang/Iterable;

    move-result-object p1

    .line 54
    invoke-static {p1}, Ll/᩶֨ᩴ;->spliterator(Ljava/lang/Iterable;)Ll/ܶ۫ᩴ;

    move-result-object p1

    const/4 v0, 0x0

    .line 53
    invoke-static {p1, v0}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 56
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/۟ۘ۠;

    invoke-direct {v0, p0}, Ll/۟ۘ۠;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p0

    return p0
.end method
