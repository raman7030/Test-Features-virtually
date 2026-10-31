.class public final Ll/ܿۧ۠;
.super Ll/ۡܽ۠;
.source "A451"


# instance fields
.field public final synthetic ۜ:Ll/᩹ܽ۠;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۢ֡۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ܽܽ۠;)V
    .locals 7

    .line 3656
    iput-object p1, p0, Ll/ܿۧ۠;->ۜ:Ll/᩹ܽ۠;

    .line 3657
    iget-object p1, p1, Ll/᩹ܽ۠;->۬:Ll/ۛܶ۠;

    iget-object v6, p1, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    move-object v0, p0

    move-object v1, p3

    move-object v2, p6

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Ll/ۡܽ۠;-><init>(Ll/ۙ֨֨;Ll/ܽܽ۠;Ll/ۢ֡۠;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ۤܶ۠;)V

    .line 3658
    invoke-virtual {p3}, Ll/ۙ֨֨;->ۚ֫()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3659
    new-instance p1, Ll/᩶ۚ֨;

    invoke-virtual {p3}, Ll/ۙ֨֨;->۫()Ll/ۙ֨֨;

    move-result-object p2

    .line 3660
    iget-object p4, p3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p4}, Ll/ۛ֡֨;->ۖ֫()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-virtual {p3}, Ll/ۙ֨֨;->۫()Ll/ۙ֨֨;

    move-result-object p4

    invoke-virtual {p4}, Ll/ۙ֨֨;->ۚ֫()Z

    move-result p4

    if-nez p4, :cond_0

    goto :goto_0

    .line 3661
    :cond_0
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p4

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p4, p3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object p4, p4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p4}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object p4

    :goto_1
    iget-object p5, p3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p3}, Ll/ۙ֨֨;->ۛ()Ll/᩷۠֨;

    move-result-object p3

    invoke-direct {p1, p2, p4, p5, p3}, Ll/᩶ۚ֨;-><init>(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;Ll/᩷۠֨;)V

    iput-object p1, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    const/4 p1, 0x1

    .line 3662
    iput-boolean p1, p0, Ll/ܿۧ۠;->᩻:Z

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;Ll/ܽܽ۠;)Ll/ۛ֡֨;
    .locals 9

    .line 3668
    iget-boolean v0, p0, Ll/ܿۧ۠;->᩻:Z

    iget-object v8, p0, Ll/ܿۧ۠;->ۜ:Ll/᩹ܽ۠;

    if-eqz v0, :cond_0

    .line 3669
    iget-object v3, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    invoke-virtual {p2}, Ll/ܽܽ۠;->֫()Z

    invoke-virtual {p2}, Ll/ܽܽ۠;->ۧ()Z

    move-result v6

    iget-object v4, p0, Ll/֨ۧ۠;->֫:Ll/ۖܶ۠;

    iget-object v5, p0, Ll/֨ۧ۠;->ܿ:Ll/ۖܶ۠;

    move-object v1, v8

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Ll/᩹ܽ۠;->֫(Ll/᩹ܽ۠;Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Z)Ll/ۛ֡֨;

    move-result-object p2

    goto :goto_0

    .line 3670
    :cond_0
    iget-object v3, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    .line 3671
    invoke-virtual {p2}, Ll/ܽܽ۠;->֫()Z

    invoke-virtual {p2}, Ll/ܽܽ۠;->ۧ()Z

    move-result v7

    .line 3670
    iget-object v4, p0, Ll/֨ۧ۠;->ܽ:Ll/ۤܶ۠;

    iget-object v5, p0, Ll/֨ۧ۠;->֫:Ll/ۖܶ۠;

    iget-object v6, p0, Ll/֨ۧ۠;->ܿ:Ll/ۖܶ۠;

    move-object v1, v8

    move-object v2, p1

    invoke-virtual/range {v1 .. v7}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;Z)Ll/ۛ֡֨;

    move-result-object p2

    .line 3672
    :goto_0
    iget-object v0, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    invoke-virtual {v8, p1, v0}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/ۙ֨֨;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ll/۟֫۠;

    invoke-direct {p1, p2, v8}, Ll/۟֫۠;-><init>(Ll/ۛ֡֨;Ll/᩹ܽ۠;)V

    return-object p1

    :cond_1
    return-object p2
.end method

.method public final ֫(Ll/ۛ֡֨;)Ll/᩷֡۠;
    .locals 1

    .line 3677
    iget-object p1, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    invoke-virtual {p1}, Ll/ۙ֨֨;->۫()Ll/ۙ֨֨;

    move-result-object p1

    sget-object v0, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3678
    sget-object p1, Ll/᩷֡۠;->ۛ:Ll/᩷֡۠;

    return-object p1

    :cond_0
    sget-object p1, Ll/᩷֡۠;->۬:Ll/᩷֡۠;

    return-object p1
.end method
