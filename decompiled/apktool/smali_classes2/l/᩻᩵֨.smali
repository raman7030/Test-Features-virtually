.class public final Ll/᩻᩵֨;
.super Ll/ۤ᩵֨;
.source "R450"


# direct methods
.method public constructor <init>(Ll/ܳ֡֨;)V
    .locals 0

    .line 1127
    invoke-direct {p0, p1}, Ll/ۤ᩵֨;-><init>(Ll/ۛ֡֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 1

    .line 573
    new-instance v0, Ll/᩶᩵֨;

    invoke-direct {v0, p0, p2, p1}, Ll/᩶᩵֨;-><init>(Ll/ۤ᩵֨;Ll/֨᩵֨;Ljava/util/function/Predicate;)V

    return-object v0
.end method

.method public final ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 1

    .line 630
    new-instance v0, Ll/ۙ᩵֨;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۙ᩵֨;-><init>(Ll/ۤ᩵֨;Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)V

    return-object v0
.end method

.method public final ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;
    .locals 0

    .line 528
    invoke-virtual {p0, p1, p2}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object p1

    iget-object p1, p1, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    return-object p1
.end method

.method public final ܽ(Ll/ۛ֡֨;)Ll/ܰ᩵֨;
    .locals 2

    .line 1130
    new-instance v0, Ll/᩻᩵֨;

    iget-object v1, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    .line 1124
    invoke-direct {v0, p0, p1, v1}, Ll/ۤ᩵֨;-><init>(Ll/᩻᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;)V

    return-object v0
.end method

.method public final ܽ(Ll/ۤܶ۠;)Ll/ܳ᩵֨;
    .locals 2

    const/4 v0, 0x0

    .line 515
    invoke-virtual {p0, p1, v0}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object p1

    .line 1137
    iget-object v1, p1, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-nez v1, :cond_0

    .line 1138
    new-instance p1, Ll/ܳ᩵֨;

    iget-object v1, p0, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    invoke-direct {p1, v1, v0, v0, v0}, Ll/ܳ᩵֨;-><init>(Ll/ۛ֡֨;Ll/ܳ᩵֨;Ll/ܳ᩵֨;Ll/ۤ᩵֨;)V

    :cond_0
    return-object p1
.end method

.method public final ᩳ(Ll/ۛ֡֨;)Ll/ܰ᩵֨;
    .locals 2

    .line 1133
    new-instance v0, Ll/᩻᩵֨;

    iget-object v1, p0, Ll/ۤ᩵֨;->᩷:[Ll/ܳ᩵֨;

    invoke-virtual {v1}, [Ll/ܳ᩵֨;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ܳ᩵֨;

    .line 1124
    invoke-direct {v0, p0, p1, v1}, Ll/ۤ᩵֨;-><init>(Ll/᩻᩵֨;Ll/ۛ֡֨;[Ll/ܳ᩵֨;)V

    return-object v0
.end method
