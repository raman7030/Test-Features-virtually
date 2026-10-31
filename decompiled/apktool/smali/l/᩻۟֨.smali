.class public final Ll/᩻۟֨;
.super Ll/ܳ۟֨;
.source "57L9"


# instance fields
.field public final synthetic ۬:Ll/ۤ۟֨;


# direct methods
.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V
    .locals 0

    .line 573
    iput-object p1, p0, Ll/᩻۟֨;->۬:Ll/ۤ۟֨;

    .line 574
    invoke-direct {p0, p1, p2}, Ll/ܳ۟֨;-><init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 571
    check-cast p1, Ll/ۙ֨֨;

    check-cast p2, Ll/ۙ֨֨;

    .line 584
    iget-object v0, p0, Ll/᩻۟֨;->۬:Ll/ۤ۟֨;

    invoke-virtual {v0, p1}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object p1

    .line 585
    invoke-virtual {v0, p2}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object p2

    .line 586
    sget-object v0, Ll/ۢ۠֨;->ᩳ֫:Ll/ۢ۠֨;

    if-eq p1, v0, :cond_0

    sget-object v1, Ll/ۢ۠֨;->ܽ֫:Ll/ۢ۠֨;

    if-ne p1, v1, :cond_1

    :cond_0
    if-eq p2, v0, :cond_2

    sget-object p1, Ll/ۢ۠֨;->ܽ֫:Ll/ۢ۠֨;

    if-ne p2, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/֨֡֨;
    .locals 1

    .line 579
    iget-object v0, p0, Ll/᩻۟֨;->۬:Ll/ۤ۟֨;

    invoke-virtual {v0, p1}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {v0, p2}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 359
    new-instance v0, Ll/ܿ۟֨;

    invoke-direct {v0, p0, p1, p2}, Ll/ܿ۟֨;-><init>(Ll/ܳ۟֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)V

    invoke-virtual {p0, v0}, Ll/ܺ۟֨;->֫(Ljava/util/function/Predicate;)Ll/֨֡֨;

    move-result-object p1

    return-object p1
.end method
