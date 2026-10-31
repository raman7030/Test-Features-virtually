.class public final Ll/ܳ֡۠;
.super Ll/᩺᩵۠;
.source "H44W"

# interfaces
.implements Ll/۟ۡ֨;


# instance fields
.field public ۛ:Ll/ܿ֡۠;

.field public ۤ:Z

.field public ۨ:Ll/ۖܶ۠;

.field public ۫:Ll/ۚۚ۠;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final ֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2011
    invoke-interface {p1, p0, p2}, Ll/۫ܺ֨;->֫(Ll/ܳ֡۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֨;
    .locals 1

    .line 2015
    sget-object v0, Ll/ۗܺ֨;->ܿۧ:Ll/ۗܺ֨;

    return-object v0
.end method

.method public final ֫(Ll/ۙ֨֨;)Ll/۫᩵۠;
    .locals 0

    .line 471
    iput-object p1, p0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    return-object p0
.end method

.method public final ֫(Ll/֡ۚ۠;)V
    .locals 0

    .line 2007
    invoke-virtual {p1, p0}, Ll/֡ۚ۠;->֫(Ll/ܳ֡۠;)V

    return-void
.end method

.method public final ܽ֫()Ll/ᩴۚ۠;
    .locals 1

    .line 2003
    sget-object v0, Ll/ᩴۚ۠;->ۤ֫:Ll/ᩴۚ۠;

    return-object v0
.end method

.method public final ᩷֫()Ll/ܰۡ֨;
    .locals 2

    .line 2032
    iget-object v0, p0, Ll/ܳ֡۠;->۫:Ll/ۚۚ۠;

    sget-object v1, Ll/ᩴۚ۠;->ܽ֫:Ll/ᩴۚ۠;

    invoke-virtual {v0, v1}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2033
    sget-object v0, Ll/ܰۡ֨;->᩶:Ll/ܰۡ֨;

    return-object v0

    .line 2034
    :cond_0
    sget-object v0, Ll/ܰۡ֨;->᩹:Ll/ܰۡ֨;

    return-object v0
.end method
