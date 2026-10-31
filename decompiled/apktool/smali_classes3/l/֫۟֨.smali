.class public final Ll/֫۟֨;
.super Ll/ܳ۟֨;
.source "57L9"


# instance fields
.field public final synthetic ۬:Ll/ۤ۟֨;


# direct methods
.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V
    .locals 0

    .line 507
    iput-object p1, p0, Ll/֫۟֨;->۬:Ll/ۤ۟֨;

    .line 508
    invoke-direct {p0, p1, p2}, Ll/ܳ۟֨;-><init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 505
    check-cast p1, Ll/ۙ֨֨;

    check-cast p2, Ll/ۙ֨֨;

    .line 518
    iget-object v0, p0, Ll/֫۟֨;->۬:Ll/ۤ۟֨;

    invoke-static {v0}, Ll/ۤ۟֨;->ۧ(Ll/ۤ۟֨;)Ll/ۛ᩸֨;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۛ᩸֨;->᩶(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    sget-object v1, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    invoke-virtual {p1, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0}, Ll/ۤ۟֨;->ۧ(Ll/ۤ۟֨;)Ll/ۛ᩸֨;

    move-result-object p1

    .line 519
    invoke-virtual {p1, p2}, Ll/ۛ᩸֨;->᩶(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

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

    .line 513
    iget-object p1, p0, Ll/֫۟֨;->۬:Ll/ۤ۟֨;

    invoke-static {p1}, Ll/ۤ۟֨;->֫(Ll/ۤ۟֨;)Ll/᩷ۚ֨;

    move-result-object p2

    iget-object p2, p2, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    invoke-static {p1}, Ll/ۤ۟֨;->֫(Ll/ۤ۟֨;)Ll/᩷ۚ֨;

    move-result-object p1

    iget-object p1, p1, Ll/᩷ۚ֨;->ۜ:Ll/۟ۚ֨;

    .line 359
    new-instance v0, Ll/ܿ۟֨;

    invoke-direct {v0, p0, p2, p1}, Ll/ܿ۟֨;-><init>(Ll/ܳ۟֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)V

    invoke-virtual {p0, v0}, Ll/ܺ۟֨;->֫(Ljava/util/function/Predicate;)Ll/֨֡֨;

    move-result-object p1

    return-object p1
.end method
