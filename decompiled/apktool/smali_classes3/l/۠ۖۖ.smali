.class public final Ll/۠ۖۖ;
.super Ll/֨ۖۖ;
.source "99PI"


# instance fields
.field public ۗ:Ll/ܳܺۖ;

.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Ll/ۚۖۖ;


# direct methods
.method public constructor <init>(Ll/ܳܺۖ;Ll/ۚۖۖ;Ll/᩸ۖۖ;)V
    .locals 1

    const/4 v0, 0x0

    .line 2706
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    .line 2707
    iput-object p3, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 2709
    iput-object p1, p0, Ll/۠ۖۖ;->ۗ:Ll/ܳܺۖ;

    .line 2710
    iput-object p2, p0, Ll/۠ۖۖ;->᩶:Ll/ۚۖۖ;

    .line 2713
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Ll/᩸ۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x2e

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ܳܺۖ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۠ۖۖ;->ۙ:Ljava/lang/String;

    .line 2715
    invoke-static {p2}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/᩻ۖۖ;->֫(Ll/֨ۖۖ;)V

    return-void
.end method

.method public static ֫(Ll/۠ۖۖ;)V
    .locals 1

    .line 2720
    iget-object v0, p0, Ll/۠ۖۖ;->ۗ:Ll/ܳܺۖ;

    invoke-virtual {v0}, Ll/ܳܺۖ;->ۢ()Ll/ۡܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܺۖ;->ܺ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֨ۖۖ;->֫(Ll/ۛۢۖ;)V

    return-void
.end method

.method public static ۧ(Ll/۠ۖۖ;)V
    .locals 7

    .line 2643
    iget-object v0, p0, Ll/۠ۖۖ;->᩶:Ll/ۚۖۖ;

    .line 2726
    invoke-static {v0}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object v1

    iget-object v2, p0, Ll/۠ۖۖ;->ۗ:Ll/ܳܺۖ;

    .line 2727
    invoke-virtual {v2}, Ll/ܳܺۖ;->᩷()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ll/ܳۖۖ;->ۙ:Ll/ܳۖۖ;

    invoke-virtual {v1, v3, p0, v4}, Ll/᩻ۖۖ;->֫(Ljava/lang/String;Ll/֨ۖۖ;Ll/ܳۖۖ;)Ll/֨ۖۖ;

    move-result-object v1

    .line 2728
    instance-of v1, v1, Ll/ᩳۖۖ;

    const/4 v3, 0x0

    const-string v5, "\" is not a message type."

    const-string v6, "\""

    if-eqz v1, :cond_1

    .line 2736
    invoke-static {v0}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object v0

    .line 2737
    invoke-virtual {v2}, Ll/ܳܺۖ;->ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0, v4}, Ll/᩻ۖۖ;->֫(Ljava/lang/String;Ll/֨ۖۖ;Ll/ܳۖۖ;)Ll/֨ۖۖ;

    move-result-object v0

    .line 2738
    instance-of v0, v0, Ll/ᩳۖۖ;

    if-eqz v0, :cond_0

    return-void

    .line 2739
    :cond_0
    new-instance v0, Ll/ۜۖۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2740
    invoke-virtual {v2}, Ll/ܳܺۖ;->ۡ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v3}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 2729
    :cond_1
    new-instance v0, Ll/ۜۖۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2730
    invoke-virtual {v2}, Ll/ܳܺۖ;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v3}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 2627
    iget-object v0, p0, Ll/۠ۖۖ;->ۗ:Ll/ܳܺۖ;

    invoke-virtual {v0}, Ll/ܳܺۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ll/᩻֡ۖ;
    .locals 1

    .line 2621
    iget-object v0, p0, Ll/۠ۖۖ;->ۗ:Ll/ܳܺۖ;

    return-object v0
.end method

.method public final ۧ()Ll/ۚۖۖ;
    .locals 1

    .line 2643
    iget-object v0, p0, Ll/۠ۖۖ;->᩶:Ll/ۚۖۖ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 2637
    iget-object v0, p0, Ll/۠ۖۖ;->ۙ:Ljava/lang/String;

    return-object v0
.end method
