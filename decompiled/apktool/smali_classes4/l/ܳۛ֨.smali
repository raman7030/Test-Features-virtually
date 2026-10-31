.class public Ll/ܳۛ֨;
.super Ll/᩸ۛ֨;
.source "M43N"


# instance fields
.field public final synthetic ܳ:Ll/ۜۨ֨;

.field public ܿ:Ljava/util/function/BiPredicate;

.field public ᩳ:Ll/᩵֨֨;

.field public ᩻:Ljava/util/function/BiFunction;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ljava/util/function/BiFunction;Ljava/util/function/BiPredicate;Ll/᩵֨֨;)V
    .locals 0

    .line 740
    iput-object p1, p0, Ll/ܳۛ֨;->ܳ:Ll/ۜۨ֨;

    .line 741
    invoke-direct {p0, p1, p2, p3}, Ll/᩸ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;)V

    .line 742
    iput-object p6, p0, Ll/ܳۛ֨;->ᩳ:Ll/᩵֨֨;

    .line 743
    iput-object p4, p0, Ll/ܳۛ֨;->᩻:Ljava/util/function/BiFunction;

    .line 744
    iput-object p5, p0, Ll/ܳۛ֨;->ܿ:Ljava/util/function/BiPredicate;

    return-void
.end method

.method public constructor <init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ll/᩵֨֨;)V
    .locals 7

    .line 736
    new-instance v4, Ll/ܿۛ֨;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Ll/ܳۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ljava/util/function/BiFunction;Ljava/util/function/BiPredicate;Ll/᩵֨֨;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 806
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    iget-object v1, v1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    iget-object v2, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const/4 v0, 0x3

    iget-object v1, p0, Ll/ܳۛ֨;->ᩳ:Ll/᩵֨֨;

    aput-object v1, v3, v0

    const-string v0, "%s[undet=%s,t=%s,bound=%s]"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Ljava/util/EnumSet;
    .locals 2

    .line 772
    sget-object v0, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    iget-object v1, p0, Ll/ܳۛ֨;->ᩳ:Ll/᩵֨֨;

    if-ne v1, v0, :cond_0

    .line 773
    const-class v0, Ll/᩵֨֨;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0

    .line 774
    :cond_0
    invoke-static {v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/EnumSet;->complementOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/֨֨֨;)Ll/᩸ۛ֨;
    .locals 8

    .line 749
    new-instance v7, Ll/ܳۛ֨;

    iget-object v3, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    iget-object v5, p0, Ll/ܳۛ֨;->ܿ:Ljava/util/function/BiPredicate;

    iget-object v6, p0, Ll/ܳۛ֨;->ᩳ:Ll/᩵֨֨;

    iget-object v1, p0, Ll/ܳۛ֨;->ܳ:Ll/ۜۨ֨;

    iget-object v4, p0, Ll/ܳۛ֨;->᩻:Ljava/util/function/BiFunction;

    move-object v0, v7

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ll/ܳۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ljava/util/function/BiFunction;Ljava/util/function/BiPredicate;Ll/᩵֨֨;)V

    return-object v7
.end method

.method public ֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V
    .locals 11

    .line 754
    iget-object v0, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    iget-object v1, p0, Ll/ܳۛ֨;->᩻:Ljava/util/function/BiFunction;

    invoke-interface {v1, p1, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    iput-object v0, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    .line 755
    iget-object v2, p0, Ll/ܳۛ֨;->ܿ:Ljava/util/function/BiPredicate;

    if-eqz v2, :cond_0

    invoke-interface {v2, p1, v0}, Ljava/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 756
    :cond_0
    invoke-virtual {p0}, Ll/ܳۛ֨;->֫()Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵֨֨;

    const/4 v4, 0x1

    new-array v4, v4, [Ll/᩵֨֨;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    .line 757
    iget-object v5, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    invoke-virtual {v5, v4}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ֨֨;

    .line 758
    invoke-interface {v1, p1, v5}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ֨֨;

    if-eqz v2, :cond_3

    .line 759
    invoke-interface {v2, p1, v5}, Ljava/util/function/BiPredicate;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_0

    .line 760
    :cond_3
    iget-object v6, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    .line 781
    iget-object v7, p0, Ll/ܳۛ֨;->ᩳ:Ll/᩵֨֨;

    invoke-virtual {v7, v3}, Ll/᩵֨֨;->֫(Ll/᩵֨֨;)Z

    move-result v8

    iget-object v9, p0, Ll/᩸ۛ֨;->ۧ:Ll/ۜۨ֨;

    if-eqz v8, :cond_4

    .line 709
    sget-object v8, Ll/ۗۛ֨;->᩶:Ll/ۗۛ֨;

    invoke-virtual {v9, v8, v6, v5, p2}, Ll/ۜۨ֨;->֫(Ll/ۗۛ֨;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v5

    goto :goto_1

    .line 783
    :cond_4
    invoke-virtual {v3, v7}, Ll/᩵֨֨;->֫(Ll/᩵֨֨;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 709
    sget-object v8, Ll/ۗۛ֨;->᩶:Ll/ۗۛ֨;

    invoke-virtual {v9, v8, v5, v6, p2}, Ll/ۜۨ֨;->֫(Ll/ۗۛ֨;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v5

    goto :goto_1

    .line 716
    :cond_5
    sget-object v8, Ll/ۗۛ֨;->᩹:Ll/ۗۛ֨;

    const/4 v10, 0x0

    invoke-virtual {v9, v8, v6, v5, v10}, Ll/ۜۨ֨;->֫(Ll/ۗۛ֨;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v5

    :goto_1
    if-nez v5, :cond_2

    .line 762
    invoke-virtual {p0, v7, v3}, Ll/ܳۛ֨;->֫(Ll/᩵֨֨;Ll/᩵֨֨;)V

    goto :goto_0

    :cond_6
    :goto_2
    return-void
.end method

.method public ֫(Ll/᩵֨֨;Ll/᩵֨֨;)V
    .locals 4

    .line 795
    iget-object v0, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    iget-object v1, p0, Ll/ܳۛ֨;->ܳ:Ll/ۜۨ֨;

    if-ne p1, p2, :cond_0

    .line 796
    invoke-virtual {v1, v0, p1}, Ll/ۜۨ֨;->֫(Ll/֨֨֨;Ll/᩵֨֨;)V

    return-void

    .line 797
    :cond_0
    sget-object v2, Ll/᩵֨֨;->᩶:Ll/᩵֨֨;

    const/4 v3, 0x0

    if-eq p1, v2, :cond_2

    sget-object v2, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    if-ne p2, v2, :cond_1

    goto :goto_0

    .line 800
    :cond_1
    invoke-virtual {v1, v0, p1, p2}, Ll/ۜۨ֨;->֫(Ll/֨֨֨;Ll/᩵֨֨;Ll/᩵֨֨;)V

    throw v3

    .line 798
    :cond_2
    :goto_0
    invoke-virtual {v1, v0, p2, p1}, Ll/ۜۨ֨;->֫(Ll/֨֨֨;Ll/᩵֨֨;Ll/᩵֨֨;)V

    throw v3
.end method
