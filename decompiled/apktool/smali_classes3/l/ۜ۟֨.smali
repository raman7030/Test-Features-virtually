.class public final Ll/ۜ۟֨;
.super Ll/ܳ۟֨;
.source "57L9"


# instance fields
.field public final synthetic ۬:Ll/ۤ۟֨;


# direct methods
.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V
    .locals 0

    .line 530
    iput-object p1, p0, Ll/ۜ۟֨;->۬:Ll/ۤ۟֨;

    .line 531
    invoke-direct {p0, p1, p2}, Ll/ܳ۟֨;-><init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V

    return-void
.end method

.method private ֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 3

    .line 554
    invoke-virtual {p1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    iget-object v1, p0, Ll/ۜ۟֨;->۬:Ll/ۤ۟֨;

    if-eqz v0, :cond_0

    .line 555
    invoke-virtual {v1, p1}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 556
    :cond_0
    sget-object v0, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Ll/ۢ۠֨;->۫:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v1}, Ll/ۤ۟֨;->ۧ(Ll/ۤ۟֨;)Ll/ۛ᩸֨;

    move-result-object v0

    invoke-static {v1}, Ll/ۤ۟֨;->֫(Ll/ۤ۟֨;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v2, v2, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    .line 557
    invoke-virtual {v0, p1, v2}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 559
    :cond_1
    sget-object v0, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 560
    invoke-virtual {p1}, Ll/ۙ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۜ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 562
    :cond_2
    invoke-static {v1}, Ll/ۤ۟֨;->֫(Ll/ۤ۟֨;)Ll/᩷ۚ֨;

    move-result-object p1

    iget-object p1, p1, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    :cond_3
    :goto_0
    return-object p1
.end method


# virtual methods
.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4

    .line 528
    check-cast p1, Ll/ۙ֨֨;

    check-cast p2, Ll/ۙ֨֨;

    .line 541
    iget-object v0, p0, Ll/ۜ۟֨;->۬:Ll/ۤ۟֨;

    invoke-static {v0}, Ll/ۤ۟֨;->ۧ(Ll/ۤ۟֨;)Ll/ۛ᩸֨;

    move-result-object v1

    invoke-static {v0}, Ll/ۤ۟֨;->֫(Ll/ۤ۟֨;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v2, v2, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    invoke-virtual {v1, p1, v2}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/ۤ۟֨;->ۧ(Ll/ۤ۟֨;)Ll/ۛ᩸֨;

    move-result-object v1

    invoke-static {v0}, Ll/ۤ۟֨;->֫(Ll/ۤ۟֨;)Ll/᩷ۚ֨;

    move-result-object v0

    iget-object v0, v0, Ll/᩷ۚ֨;->᩻ۧ:Ll/ۙ֨֨;

    .line 542
    invoke-virtual {v1, p2, v0}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 543
    :goto_1
    sget-object v1, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p2, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 p1, 0x1

    :goto_3
    if-eqz v0, :cond_4

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v3
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/֨֡֨;
    .locals 1

    .line 536
    invoke-direct {p0, p1}, Ll/ۜ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-direct {p0, p2}, Ll/ۜ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 359
    new-instance v0, Ll/ܿ۟֨;

    invoke-direct {v0, p0, p1, p2}, Ll/ܿ۟֨;-><init>(Ll/ܳ۟֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)V

    invoke-virtual {p0, v0}, Ll/ܺ۟֨;->֫(Ljava/util/function/Predicate;)Ll/֨֡֨;

    move-result-object p1

    return-object p1
.end method
