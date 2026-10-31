.class public final Ll/ᩴ᩵֨;
.super Ll/۟᩵֨;
.source "R450"


# instance fields
.field public final ۜ:Ll/ۛ᩸֨;

.field public final ܳ:Ll/ۧ֡۠;

.field public final ܽ:Ljava/util/function/BiConsumer;

.field public final ܿ:Ll/ۤܶ۠;

.field public final ᩳ:Ll/᩵᩵֨;

.field public final ᩻:Ll/۟᩵֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;Ll/۟᩵֨;Ll/ۤܶ۠;Ll/᩵᩵֨;Ll/ۧ֡۠;Ljava/util/function/BiConsumer;)V
    .locals 1

    .line 923
    iget-object v0, p2, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    invoke-direct {p0, v0}, Ll/۟᩵֨;-><init>(Ll/ۛ֡֨;)V

    .line 924
    iput-object p1, p0, Ll/ᩴ᩵֨;->ۜ:Ll/ۛ᩸֨;

    .line 925
    iput-object p2, p0, Ll/ᩴ᩵֨;->᩻:Ll/۟᩵֨;

    .line 926
    iput-object p3, p0, Ll/ᩴ᩵֨;->ܿ:Ll/ۤܶ۠;

    .line 927
    iput-object p4, p0, Ll/ᩴ᩵֨;->ᩳ:Ll/᩵᩵֨;

    .line 928
    iput-object p5, p0, Ll/ᩴ᩵֨;->ܳ:Ll/ۧ֡۠;

    .line 929
    iput-object p6, p0, Ll/ᩴ᩵֨;->ܽ:Ljava/util/function/BiConsumer;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴ᩵֨;)Ll/᩵᩵֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩵֨;->ᩳ:Ll/᩵᩵֨;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ᩴ᩵֨;Ll/ۛ֡֨;)Z
    .locals 1

    .line 947
    iget-object v0, p0, Ll/ᩴ᩵֨;->ᩳ:Ll/᩵᩵֨;

    iget-object p0, p0, Ll/ᩴ᩵֨;->᩻:Ll/۟᩵֨;

    invoke-interface {v0, p0, p1}, Ll/᩵᩵֨;->֫(Ll/۟᩵֨;Ll/ۛ֡֨;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴ᩵֨;)Ll/ۧ֡۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩵֨;->ܳ:Ll/ۧ֡۠;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ᩴ᩵֨;Ll/ۛ֡֨;)Z
    .locals 1

    .line 971
    iget-object v0, p0, Ll/ᩴ᩵֨;->ᩳ:Ll/᩵᩵֨;

    iget-object p0, p0, Ll/ᩴ᩵֨;->᩻:Ll/۟᩵֨;

    invoke-interface {v0, p0, p1}, Ll/᩵᩵֨;->֫(Ll/۟᩵֨;Ll/ۛ֡֨;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴ᩵֨;)Ll/۟᩵֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩵֨;->᩻:Ll/۟᩵֨;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴ᩵֨;)Ll/ۛ᩸֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩵֨;->ۜ:Ll/ۛ᩸֨;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 3

    .line 934
    iget-object v0, p0, Ll/ᩴ᩵֨;->ܳ:Ll/ۧ֡۠;

    iget-object v1, p0, Ll/ᩴ᩵֨;->ܿ:Ll/ۤܶ۠;

    if-eqz v1, :cond_0

    .line 935
    invoke-virtual {p0, v1, p1, p2}, Ll/ᩴ᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1

    .line 937
    :cond_0
    :try_start_0
    new-instance v1, Ll/ܺ᩵֨;

    iget-boolean v2, v0, Ll/ۧ֡۠;->۫:Z

    invoke-direct {v1, p0, v2, p1, p2}, Ll/ܺ᩵֨;-><init>(Ll/ᩴ᩵֨;ZLjava/util/function/Predicate;Ll/֨᩵֨;)V

    .line 943
    iget-object p1, p0, Ll/ᩴ᩵֨;->᩻:Ll/۟᩵֨;

    iget-object p1, p1, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    check-cast p1, Ll/᩶֡֨;

    .line 944
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Ll/ۘ᩵֨;->֫(Ll/᩶֡֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 945
    new-instance p2, Ll/᩷᩵֨;

    invoke-direct {p2, p0, p1}, Ll/᩷᩵֨;-><init>(Ll/ᩴ᩵֨;Ll/ۖܶ۠;)V
    :try_end_0
    .catch Ll/᩷֡֨; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 949
    iget-object p2, p0, Ll/ᩴ᩵֨;->ܽ:Ljava/util/function/BiConsumer;

    invoke-interface {p2, v0, p1}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 950
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final ֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;
    .locals 8

    .line 958
    iget-object v0, p0, Ll/ᩴ᩵֨;->ܳ:Ll/ۧ֡۠;

    iget-object v1, p0, Ll/ᩴ᩵֨;->ܿ:Ll/ۤܶ۠;

    if-eqz v1, :cond_0

    if-eq v1, p1, :cond_0

    .line 959
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 961
    :cond_0
    :try_start_0
    new-instance v7, Ll/ۖ᩵֨;

    iget-boolean v3, v0, Ll/ۧ֡۠;->۫:Z

    move-object v1, v7

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Ll/ۖ᩵֨;-><init>(Ll/ᩴ᩵֨;ZLl/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)V

    .line 967
    iget-object p1, p0, Ll/ᩴ᩵֨;->᩻:Ll/۟᩵֨;

    iget-object p1, p1, Ll/۟᩵֨;->ۧ:Ll/ۛ֡֨;

    check-cast p1, Ll/᩶֡֨;

    .line 968
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {v7, p1, p2}, Ll/ۘ᩵֨;->֫(Ll/᩶֡֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 969
    new-instance p2, Ll/ۜ᩵֨;

    invoke-direct {p2, p0, p1}, Ll/ۜ᩵֨;-><init>(Ll/ᩴ᩵֨;Ll/ۖܶ۠;)V
    :try_end_0
    .catch Ll/᩷֡֨; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 973
    iget-object p2, p0, Ll/ᩴ᩵֨;->ܽ:Ljava/util/function/BiConsumer;

    invoke-interface {p2, v0, p1}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 974
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final ֫(Ll/ۛ֡֨;)Ll/۟᩵֨;
    .locals 0

    .line 980
    iget-object p1, p0, Ll/ᩴ᩵֨;->᩻:Ll/۟᩵֨;

    return-object p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 989
    iget-object v0, p0, Ll/ᩴ᩵֨;->ܳ:Ll/ۧ֡۠;

    iget-boolean v0, v0, Ll/ۧ֡۠;->۫:Z

    return v0
.end method
