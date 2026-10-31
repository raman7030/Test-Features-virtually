.class public final Ll/᩸᩵֨;
.super Ll/۟᩵֨;
.source "R450"


# instance fields
.field public final ܽ:Ll/ۖܶ۠;

.field public final ܿ:Ll/᩶֡֨;

.field public final ᩳ:Ll/۟᩵֨;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/۟᩵֨;)V
    .locals 0

    .line 846
    invoke-direct {p0, p1}, Ll/۟᩵֨;-><init>(Ll/ۛ֡֨;)V

    .line 847
    iput-object p2, p0, Ll/᩸᩵֨;->ܿ:Ll/᩶֡֨;

    .line 848
    invoke-static {p2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/᩸᩵֨;->ܽ:Ll/ۖܶ۠;

    .line 849
    iput-object p3, p0, Ll/᩸᩵֨;->ᩳ:Ll/۟᩵֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 0

    if-eqz p1, :cond_1

    .line 854
    iget-object p2, p0, Ll/᩸᩵֨;->ܿ:Ll/᩶֡֨;

    invoke-interface {p1, p2}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_1
    :goto_0
    iget-object p1, p0, Ll/᩸᩵֨;->ܽ:Ll/ۖܶ۠;

    return-object p1
.end method

.method public final ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 1

    .line 861
    iget-object p3, p0, Ll/᩸᩵֨;->ܿ:Ll/᩶֡֨;

    iget-object v0, p3, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-ne v0, p1, :cond_1

    if-eqz p2, :cond_0

    .line 862
    invoke-interface {p2, p3}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    iget-object p1, p0, Ll/᩸᩵֨;->ܽ:Ll/ۖܶ۠;

    return-object p1

    :cond_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final ֫(Ll/ۛ֡֨;)Ll/۟᩵֨;
    .locals 1

    .line 867
    iget-object v0, p0, Ll/᩸᩵֨;->ܿ:Ll/᩶֡֨;

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Ll/᩸᩵֨;->ᩳ:Ll/۟᩵֨;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
