.class public final Ll/ܺۚ۠;
.super Ll/۫᩵۠;
.source "H44W"

# interfaces
.implements Ll/ܽۖ֨;


# instance fields
.field public ۗ:Ll/ۚۚ۠;

.field public ۬:Ll/᩵ۚ۠;


# virtual methods
.method public final ֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2896
    invoke-interface {p1, p0, p2}, Ll/۫ܺ֨;->֫(Ll/ܺۚ۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֨;
    .locals 3

    .line 2881
    sget-object v0, Ll/ܽ᩵۠;->֫:[I

    iget-object v1, p0, Ll/ܺۚ۠;->۬:Ll/᩵ۚ۠;

    iget-object v1, v1, Ll/᩵ۚ۠;->ۗ:Ll/ܺۘ֨;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 2887
    sget-object v0, Ll/ۗܺ֨;->᩵ܽ:Ll/ۗܺ֨;

    return-object v0

    .line 2889
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown wildcard bound "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܺۚ۠;->۬:Ll/᩵ۚ۠;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 2885
    :cond_1
    sget-object v0, Ll/ۗܺ֨;->ۙ֫:Ll/ۗܺ֨;

    return-object v0

    .line 2883
    :cond_2
    sget-object v0, Ll/ۗܺ֨;->۬ܽ:Ll/ۗܺ֨;

    return-object v0
.end method

.method public final ֫(Ll/֡ۚ۠;)V
    .locals 0

    .line 2877
    invoke-virtual {p1, p0}, Ll/֡ۚ۠;->֫(Ll/ܺۚ۠;)V

    return-void
.end method

.method public final ܽ֫()Ll/ᩴۚ۠;
    .locals 1

    .line 2900
    sget-object v0, Ll/ᩴۚ۠;->ۙܽ:Ll/ᩴۚ۠;

    return-object v0
.end method
