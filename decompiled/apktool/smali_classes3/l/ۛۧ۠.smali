.class public final synthetic Ll/ۛۧ۠;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ljava/util/function/BiPredicate;


# instance fields
.field public final synthetic ᩸:Ll/ۨۧ۠;


# direct methods
.method public synthetic constructor <init>(Ll/ۨۧ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۧ۠;->᩸:Ll/ۨۧ۠;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۛᩴ;->$default$and(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/BiPredicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ܳۛᩴ;->$default$negate(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۛᩴ;->$default$or(Ljava/util/function/BiPredicate;Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    .line 2
    check-cast p2, Ll/ۖܶ۠;

    .line 4826
    instance-of v0, p1, Ll/ۙ֨֨;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۙ֨֨;

    .line 4827
    invoke-virtual {p1, p2}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result p1

    return p1

    .line 4828
    :cond_0
    instance-of v0, p1, Ll/ܽܶ۠;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ܽܶ۠;

    .line 4836
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/ܽ᩺ᩴ;->of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۨ᩶֨;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۛۧ۠;->᩸:Ll/ۨۧ۠;

    invoke-direct {v0, v1, v2, p2}, Ll/ۨ᩶֨;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 4837
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
