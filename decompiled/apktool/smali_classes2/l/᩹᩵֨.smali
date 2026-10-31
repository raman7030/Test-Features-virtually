.class public final Ll/᩹᩵֨;
.super Ll/ۚ᩵֨;
.source "R450"


# instance fields
.field public final ܿ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;)V
    .locals 0

    .line 743
    invoke-direct {p0, p1}, Ll/ܿ᩵֨;-><init>(Ll/ۛ֡֨;)V

    .line 793
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/᩹᩵֨;->ܿ:Ljava/util/HashMap;

    return-void
.end method

.method private ֫(Ll/۟᩵֨;Ll/ۤܶ۠;)V
    .locals 4

    .line 808
    invoke-virtual {p0, p1}, Ll/ܿ᩵֨;->֫(Ll/۟᩵֨;)V

    .line 809
    iget-object v0, p0, Ll/᩹᩵֨;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/۟᩵֨;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 811
    array-length v3, v1

    add-int/2addr v3, v2

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/۟᩵֨;

    goto :goto_0

    :cond_0
    new-array v1, v2, [Ll/۟᩵֨;

    .line 814
    :goto_0
    array-length v3, v1

    sub-int/2addr v3, v2

    aput-object p1, v1, v3

    .line 815
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 2

    .line 821
    iget-object v0, p0, Ll/᩹᩵֨;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۟᩵֨;

    if-nez v0, :cond_0

    .line 823
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 824
    :cond_0
    new-instance v1, Ll/۠᩵֨;

    invoke-direct {v1, v0, p1, p2, p3}, Ll/۠᩵֨;-><init>([Ll/۟᩵֨;Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)V

    return-object v1
.end method

.method public final ֫(Ll/ۛ᩸֨;Ll/ܰ᩵֨;Ll/ۤܶ۠;Ll/ۗᩳ۠;Ll/ۧ֡۠;Ll/ۙᩳ۠;)Ll/۟᩵֨;
    .locals 8

    .line 800
    new-instance v7, Ll/ᩴ᩵֨;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ll/ᩴ᩵֨;-><init>(Ll/ۛ᩸֨;Ll/۟᩵֨;Ll/ۤܶ۠;Ll/᩵᩵֨;Ll/ۧ֡۠;Ljava/util/function/BiConsumer;)V

    invoke-direct {p0, v7, p3}, Ll/᩹᩵֨;->֫(Ll/۟᩵֨;Ll/ۤܶ۠;)V

    return-object v7
.end method

.method public final ֫(Ll/ܰ᩵֨;Ll/ܰ᩵֨;Ll/᩶֡֨;)Ll/۟᩵֨;
    .locals 1

    .line 804
    new-instance v0, Ll/᩸᩵֨;

    iget-object p1, p1, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    invoke-direct {v0, p1, p3, p2}, Ll/᩸᩵֨;-><init>(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/۟᩵֨;)V

    iget-object p1, p3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-direct {p0, v0, p1}, Ll/᩹᩵֨;->֫(Ll/۟᩵֨;Ll/ۤܶ۠;)V

    return-object v0
.end method

.method public final ܽ()V
    .locals 4

    .line 831
    invoke-super {p0}, Ll/ۚ᩵֨;->ܽ()V

    .line 832
    iget-object v0, p0, Ll/᩹᩵֨;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/۟᩵֨;

    const/4 v2, 0x0

    .line 833
    :goto_0
    array-length v3, v1

    if-ge v2, v3, :cond_0

    .line 834
    aget-object v3, v1, v2

    invoke-static {v3}, Ll/ۚ᩵֨;->ܽ(Ll/۟᩵֨;)Ll/۟᩵֨;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
