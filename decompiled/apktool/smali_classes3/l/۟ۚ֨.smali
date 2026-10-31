.class public Ll/۟ۚ֨;
.super Ll/ۙ֨֨;
.source "34PY"


# instance fields
.field public ۤ:Ll/ۢ۠֨;


# direct methods
.method public constructor <init>(Ll/ۢ۠֨;)V
    .locals 2

    const/4 v0, 0x0

    .line 691
    sget-object v1, Ll/᩷۠֨;->ۧ:Ll/᩷۠֨;

    invoke-direct {p0, p1, v0, v1}, Ll/۟ۚ֨;-><init>(Ll/ۢ۠֨;Ll/᩶֡֨;Ll/᩷۠֨;)V

    return-void
.end method

.method public constructor <init>(Ll/ۢ۠֨;Ll/᩶֡֨;Ll/᩷۠֨;)V
    .locals 0

    .line 695
    invoke-direct {p0, p2, p3}, Ll/ۙ֨֨;-><init>(Ll/᩶֡֨;Ll/᩷۠֨;)V

    .line 696
    iput-object p1, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    .line 697
    iget-boolean p1, p1, Ll/ۢ۠֨;->᩸:Z

    invoke-static {p1}, Ll/۫ۙ;->֫(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۢ۠֨;Ll/᩶֡֨;Ll/᩷۠֨;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/۟ۚ֨;-><init>(Ll/ۢ۠֨;Ll/᩶֡֨;Ll/᩷۠֨;)V

    return-void
.end method


# virtual methods
.method public final ֡֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫()Ll/֡᩹۠;
    .locals 2

    .line 804
    sget-object v0, Ll/ᩴۚ֨;->֫:[I

    iget-object v1, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 814
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 812
    :pswitch_0
    sget-object v0, Ll/֡᩹۠;->᩶:Ll/֡᩹۠;

    return-object v0

    .line 811
    :pswitch_1
    sget-object v0, Ll/֡᩹۠;->۫:Ll/֡᩹۠;

    return-object v0

    .line 810
    :pswitch_2
    sget-object v0, Ll/֡᩹۠;->ۨ:Ll/֡᩹۠;

    return-object v0

    .line 809
    :pswitch_3
    sget-object v0, Ll/֡᩹۠;->۟:Ll/֡᩹۠;

    return-object v0

    .line 808
    :pswitch_4
    sget-object v0, Ll/֡᩹۠;->᩺:Ll/֡᩹۠;

    return-object v0

    .line 807
    :pswitch_5
    sget-object v0, Ll/֡᩹۠;->ܳ֫:Ll/֡᩹۠;

    return-object v0

    .line 805
    :pswitch_6
    sget-object v0, Ll/֡᩹۠;->ۙ:Ll/֡᩹۠;

    return-object v0

    .line 806
    :pswitch_7
    sget-object v0, Ll/֡᩹۠;->ۗ:Ll/֡᩹۠;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ljava/lang/Object;)Ll/ۙ֨֨;
    .locals 4

    .line 748
    new-instance v0, Ll/ܰۚ֨;

    iget-object v1, p0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v2, p0, Ll/ۙ֨֨;->᩸:Ll/᩷۠֨;

    iget-object v3, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    invoke-direct {v0, v3, v1, v2, p1}, Ll/ܰۚ֨;-><init>(Ll/ۢ۠֨;Ll/᩶֡֨;Ll/᩷۠֨;Ljava/lang/Object;)V

    return-object v0
.end method

.method public ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 3

    .line 702
    new-instance v0, Ll/᩺ۚ֨;

    iget-object v1, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    iget-object v2, p0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-direct {v0, p0, v1, v2, p1}, Ll/᩺ۚ֨;-><init>(Ll/۟ۚ֨;Ll/ۢ۠֨;Ll/᩶֡֨;Ll/᩷۠֨;)V

    return-object v0
.end method

.method public final ֫֫()Ll/ۢ۠֨;
    .locals 1

    .line 734
    iget-object v0, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    return-object v0
.end method

.method public final ۖ֫()Z
    .locals 2

    .line 710
    iget-object v0, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    sget-object v1, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ֫()Z
    .locals 3

    .line 715
    sget-object v0, Ll/ᩴۚ֨;->֫:[I

    iget-object v1, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    const/4 v2, 0x5

    if-eq v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v1
.end method

.method public final ܶ֫()Z
    .locals 2

    .line 791
    iget-object v0, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    sget-object v1, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    if-ne v0, v1, :cond_0

    .line 793
    invoke-virtual {p0}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 794
    invoke-virtual {p0}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩶֫()Ljava/lang/String;
    .locals 3

    .line 765
    invoke-virtual {p0}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 766
    sget-object v1, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    iget-object v2, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    if-ne v2, v1, :cond_1

    .line 767
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "false"

    return-object v0

    :cond_0
    const-string v0, "true"

    return-object v0

    .line 769
    :cond_1
    sget-object v1, Ll/ۢ۠֨;->ۛ:Ll/ۢ۠֨;

    if-ne v2, v1, :cond_2

    .line 770
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-char v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 773
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷֫()Z
    .locals 2

    .line 781
    iget-object v0, p0, Ll/۟ۚ֨;->ۤ:Ll/ۢ۠֨;

    sget-object v1, Ll/ۢ۠֨;->۬:Ll/ۢ۠֨;

    if-ne v0, v1, :cond_0

    .line 783
    invoke-virtual {p0}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 784
    invoke-virtual {p0}, Ll/ۙ֨֨;->ۗ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
