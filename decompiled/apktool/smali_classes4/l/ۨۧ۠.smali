.class public final Ll/ۨۧ۠;
.super Ll/۟ۧ۠;
.source "A451"


# instance fields
.field public ܽ:Ll/ۛۧ۠;


# virtual methods
.method public final ֫(Ljava/lang/Object;)Z
    .locals 3

    .line 4816
    invoke-super {p0, p1}, Ll/۟ۧ۠;->֫(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 4819
    :cond_0
    check-cast p1, Ll/ܽܶ۠;

    .line 4821
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v0

    aget-object v0, v0, v1

    check-cast v0, Ll/ۖܶ۠;

    .line 4836
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/ܽ᩺ᩴ;->of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v1, Ll/ۨ᩶֨;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, v0}, Ll/ۨ᩶֨;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 4837
    invoke-interface {p1, v1}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
