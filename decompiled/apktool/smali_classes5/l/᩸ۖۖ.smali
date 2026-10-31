.class public final Ll/᩸ۖۖ;
.super Ll/֨ۖۖ;
.source "99PI"


# instance fields
.field public ۗ:[Ll/۠ۖۖ;

.field public final ۙ:Ljava/lang/String;

.field public ۬:Ll/۠ܺۖ;

.field public final ᩶:Ll/ۚۖۖ;


# direct methods
.method public constructor <init>(Ll/۠ܺۖ;Ll/ۚۖۖ;)V
    .locals 4

    const/4 v0, 0x0

    .line 2565
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    .line 2566
    iput-object p2, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 2568
    iput-object p1, p0, Ll/᩸ۖۖ;->۬:Ll/۠ܺۖ;

    .line 2569
    invoke-virtual {p1}, Ll/۠ܺۖ;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p2, v2, v1}, Ll/᩹ۖۖ;->֫(Ll/ۚۖۖ;Ll/ᩳۖۖ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/᩸ۖۖ;->ۙ:Ljava/lang/String;

    .line 2570
    iput-object p2, p0, Ll/᩸ۖۖ;->᩶:Ll/ۚۖۖ;

    .line 2572
    invoke-virtual {p1}, Ll/۠ܺۖ;->ۜ()I

    move-result v1

    new-array v1, v1, [Ll/۠ۖۖ;

    iput-object v1, p0, Ll/᩸ۖۖ;->ۗ:[Ll/۠ۖۖ;

    .line 2573
    :goto_0
    invoke-virtual {p1}, Ll/۠ܺۖ;->ۜ()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2574
    iget-object v1, p0, Ll/᩸ۖۖ;->ۗ:[Ll/۠ۖۖ;

    new-instance v2, Ll/۠ۖۖ;

    invoke-virtual {p1, v0}, Ll/۠ܺۖ;->֫(I)Ll/ܳܺۖ;

    move-result-object v3

    invoke-direct {v2, v3, p2, p0}, Ll/۠ۖۖ;-><init>(Ll/ܳܺۖ;Ll/ۚۖۖ;Ll/᩸ۖۖ;)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2577
    :cond_0
    invoke-static {p2}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/᩻ۖۖ;->֫(Ll/֨ۖۖ;)V

    return-void
.end method

.method public static ֫(Ll/᩸ۖۖ;)V
    .locals 3

    .line 2582
    iget-object v0, p0, Ll/᩸ۖۖ;->۬:Ll/۠ܺۖ;

    invoke-virtual {v0}, Ll/۠ܺۖ;->᩷()Ll/᩹ܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܺۖ;->ܺ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֨ۖۖ;->֫(Ll/ۛۢۖ;)V

    .line 2584
    iget-object p0, p0, Ll/᩸ۖۖ;->ۗ:[Ll/۠ۖۖ;

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    .line 2585
    invoke-static {v2}, Ll/۠ۖۖ;->֫(Ll/۠ۖۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/᩸ۖۖ;)V
    .locals 3

    .line 2590
    iget-object p0, p0, Ll/᩸ۖۖ;->ۗ:[Ll/۠ۖۖ;

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    .line 2591
    invoke-static {v2}, Ll/۠ۖۖ;->ۧ(Ll/۠ۖۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 2498
    iget-object v0, p0, Ll/᩸ۖۖ;->۬:Ll/۠ܺۖ;

    invoke-virtual {v0}, Ll/۠ܺۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ll/᩻֡ۖ;
    .locals 1

    .line 2492
    iget-object v0, p0, Ll/᩸ۖۖ;->۬:Ll/۠ܺۖ;

    return-object v0
.end method

.method public final ۧ()Ll/ۚۖۖ;
    .locals 1

    .line 2514
    iget-object v0, p0, Ll/᩸ۖۖ;->᩶:Ll/ۚۖۖ;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 2508
    iget-object v0, p0, Ll/᩸ۖۖ;->ۙ:Ljava/lang/String;

    return-object v0
.end method
