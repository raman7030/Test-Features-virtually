.class public final Ll/ܽ۟֨;
.super Ll/ܳ۟֨;
.source "57L9"


# instance fields
.field public final synthetic ۫:Ll/ۤ۟֨;

.field public ۬:Ljava/util/function/Predicate;


# direct methods
.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V
    .locals 2

    .line 480
    new-instance v0, Ll/֨ܿܽ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/֨ܿܽ;-><init>(I)V

    invoke-direct {p0, p1, p2, v0}, Ll/ܽ۟֨;-><init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;Ljava/util/function/Predicate;)V

    return-void
.end method

.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;Ljava/util/function/Predicate;)V
    .locals 0

    .line 483
    iput-object p1, p0, Ll/ܽ۟֨;->۫:Ll/ۤ۟֨;

    .line 484
    invoke-direct {p0, p1, p2}, Ll/ܳ۟֨;-><init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V

    .line 485
    iput-object p3, p0, Ll/ܽ۟֨;->۬:Ljava/util/function/Predicate;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 475
    check-cast p1, Ll/ۙ֨֨;

    check-cast p2, Ll/ۙ֨֨;

    .line 496
    iget-object v0, p0, Ll/ܽ۟֨;->۫:Ll/ۤ۟֨;

    invoke-virtual {v0, p1}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    iget-object v1, p0, Ll/ܽ۟֨;->۬:Ljava/util/function/Predicate;

    invoke-interface {v1, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 497
    invoke-virtual {v0, p2}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/֨֡֨;
    .locals 1

    .line 490
    iget-object v0, p0, Ll/ܽ۟֨;->۫:Ll/ۤ۟֨;

    invoke-virtual {v0, p1, p2}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    .line 359
    new-instance p2, Ll/ܿ۟֨;

    invoke-direct {p2, p0, p1, p1}, Ll/ܿ۟֨;-><init>(Ll/ܳ۟֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)V

    invoke-virtual {p0, p2}, Ll/ܺ۟֨;->֫(Ljava/util/function/Predicate;)Ll/֨֡֨;

    move-result-object p1

    return-object p1
.end method
