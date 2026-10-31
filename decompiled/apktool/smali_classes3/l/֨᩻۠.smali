.class public final Ll/֨᩻۠;
.super Ll/᩶ۚ֨;
.source "Z5U8"


# instance fields
.field public ۧ֫:Z

.field public final synthetic ܽ֫:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ܳ֡֨;)V
    .locals 0

    .line 565
    iput-object p1, p0, Ll/֨᩻۠;->ܽ֫:Ll/᩶ۜ۠;

    invoke-direct {p0, p4, p2, p3}, Ll/᩶ۚ֨;-><init>(Ll/᩶֡֨;Ll/ۙ֨֨;Ll/ۖܶ۠;)V

    const/4 p1, 0x0

    .line 566
    iput-boolean p1, p0, Ll/֨᩻۠;->ۧ֫:Z

    return-void
.end method


# virtual methods
.method public final ۫()Ll/ۙ֨֨;
    .locals 6

    .line 569
    iget-object v0, p0, Ll/֨᩻۠;->ܽ֫:Ll/᩶ۜ۠;

    iget-object v0, v0, Ll/᩶ۜ۠;->ۜ֫:Ll/ۛ᩸֨;

    iget-boolean v1, p0, Ll/֨᩻۠;->ۧ֫:Z

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 570
    iput-boolean v1, p0, Ll/֨᩻۠;->ۧ֫:Z

    .line 571
    iget-object v1, p0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->᩸()V

    .line 572
    iget-object v1, p0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ll/ۙ֨֨;->۫()Ll/ۙ֨֨;

    move-result-object v1

    .line 573
    sget-object v2, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    if-eq v1, v2, :cond_1

    .line 575
    invoke-super {p0}, Ll/᩶ۚ֨;->۫()Ll/ۙ֨֨;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v2

    .line 577
    invoke-virtual {v1}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v3

    .line 578
    invoke-virtual {v3}, Ll/ۖܶ۠;->ۧ()I

    move-result v4

    invoke-virtual {v2}, Ll/ۖܶ۠;->ۧ()I

    move-result v5

    if-eq v4, v5, :cond_0

    .line 580
    invoke-virtual {v0, v1}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    invoke-super {p0, v0}, Ll/᩶ۚ֨;->ᩳ(Ll/ۙ֨֨;)V

    goto :goto_0

    .line 582
    :cond_0
    invoke-virtual {v0, v1, v3, v2}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object v0

    invoke-super {p0, v0}, Ll/᩶ۚ֨;->ᩳ(Ll/ۙ֨֨;)V

    goto :goto_0

    .line 587
    :cond_1
    invoke-super {p0, v2}, Ll/᩶ۚ֨;->ᩳ(Ll/ۙ֨֨;)V

    .line 590
    :cond_2
    :goto_0
    invoke-super {p0}, Ll/᩶ۚ֨;->۫()Ll/ۙ֨֨;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Ll/ۙ֨֨;)V
    .locals 0

    .line 594
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
