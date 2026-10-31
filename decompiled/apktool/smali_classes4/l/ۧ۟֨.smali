.class public final Ll/ۧ۟֨;
.super Ll/ܳ۟֨;
.source "57L9"


# instance fields
.field public final synthetic ۬:Ll/ۤ۟֨;


# direct methods
.method public constructor <init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V
    .locals 0

    .line 611
    iput-object p1, p0, Ll/ۧ۟֨;->۬:Ll/ۤ۟֨;

    .line 612
    invoke-direct {p0, p1, p2}, Ll/ܳ۟֨;-><init>(Ll/ۤ۟֨;Ll/ᩴۚ۠;)V

    return-void
.end method

.method private ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/᩷۟֨;
    .locals 3

    .line 633
    invoke-virtual {p1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    .line 634
    invoke-virtual {p2}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 636
    sget-object p1, Ll/᩷۟֨;->᩶:Ll/᩷۟֨;

    return-object p1

    .line 637
    :cond_0
    iget-object v2, p0, Ll/ۧ۟֨;->۬:Ll/ۤ۟֨;

    if-eqz v0, :cond_2

    .line 638
    invoke-virtual {v2, p2}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 639
    sget-object p1, Ll/᩷۟֨;->᩶:Ll/᩷۟֨;

    return-object p1

    :cond_1
    sget-object p1, Ll/᩷۟֨;->᩹:Ll/᩷۟֨;

    return-object p1

    :cond_2
    if-eqz v1, :cond_4

    .line 641
    invoke-virtual {v2, p1}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 642
    sget-object p1, Ll/᩷۟֨;->᩶:Ll/᩷۟֨;

    return-object p1

    :cond_3
    sget-object p1, Ll/᩷۟֨;->᩹:Ll/᩷۟֨;

    return-object p1

    .line 644
    :cond_4
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܺ֫()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Ll/ۙ֨֨;->ܺ֫()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 645
    sget-object p1, Ll/᩷۟֨;->ۙ:Ll/᩷۟֨;

    return-object p1

    :cond_5
    sget-object p1, Ll/᩷۟֨;->᩹:Ll/᩷۟֨;

    return-object p1
.end method


# virtual methods
.method public final test(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 609
    check-cast p1, Ll/ۙ֨֨;

    check-cast p2, Ll/ۙ֨֨;

    .line 617
    invoke-direct {p0, p1, p2}, Ll/ۧ۟֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/᩷۟֨;

    move-result-object p1

    sget-object p2, Ll/᩷۟֨;->᩹:Ll/᩷۟֨;

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/֨֡֨;
    .locals 3

    .line 622
    invoke-direct {p0, p1, p2}, Ll/ۧ۟֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/᩷۟֨;

    move-result-object v0

    .line 623
    sget-object v1, Ll/᩷۟֨;->᩶:Ll/᩷۟֨;

    iget-object v2, p0, Ll/ۧ۟֨;->۬:Ll/ۤ۟֨;

    if-ne v0, v1, :cond_0

    .line 624
    invoke-virtual {v2, p1, p2}, Ll/ۤ۟֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    goto :goto_0

    .line 625
    :cond_0
    invoke-static {v2}, Ll/ۤ۟֨;->֫(Ll/ۤ۟֨;)Ll/᩷ۚ֨;

    move-result-object p1

    iget-object p1, p1, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    .line 359
    :goto_0
    new-instance p2, Ll/ܿ۟֨;

    invoke-direct {p2, p0, p1, p1}, Ll/ܿ۟֨;-><init>(Ll/ܳ۟֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)V

    invoke-virtual {p0, p2}, Ll/ܺ۟֨;->֫(Ljava/util/function/Predicate;)Ll/֨֡֨;

    move-result-object p1

    return-object p1
.end method
