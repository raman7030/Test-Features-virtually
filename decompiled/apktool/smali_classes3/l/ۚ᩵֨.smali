.class public Ll/ۚ᩵֨;
.super Ll/ܿ᩵֨;
.source "R450"


# direct methods
.method public static ܽ(Ll/۟᩵֨;)Ll/۟᩵֨;
    .locals 4

    .line 756
    instance-of v0, p0, Ll/ᩴ᩵֨;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    move-object v1, p0

    check-cast v1, Ll/ᩴ᩵֨;

    iget-object v2, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_1

    .line 758
    invoke-virtual {v1}, Ll/ᩴ᩵֨;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 269
    new-instance v1, Ll/ۤ᩵֨;

    invoke-direct {v1, v0}, Ll/ۤ᩵֨;-><init>(Ll/ۛ֡֨;)V

    const/4 v0, 0x0

    .line 75
    sget-object v2, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    invoke-virtual {p0, v0, v2}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object p0

    .line 761
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֡֨;

    .line 762
    invoke-virtual {v1, v0}, Ll/ۤ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    goto :goto_0

    .line 765
    :cond_0
    iget-object p0, v1, Ll/۟᩵֨;->֫:Ll/ۨ᩵֨;

    new-instance v0, Ll/֡᩵֨;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 185
    iget-object v2, p0, Ll/ۨ᩵֨;->֫:Ll/ۖܶ۠;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩵֨;->֫:Ll/ۖܶ۠;

    return-object v1

    :cond_1
    return-object p0
.end method


# virtual methods
.method public ܽ()V
    .locals 2

    .line 750
    iget-object v0, p0, Ll/ܿ᩵֨;->ᩳ:Ll/ᩴܶ۠;

    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 751
    iget-object v1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/۟᩵֨;

    invoke-static {v1}, Ll/ۚ᩵֨;->ܽ(Ll/۟᩵֨;)Ll/۟᩵֨;

    move-result-object v1

    iput-object v1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    .line 750
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_0
    return-void
.end method
