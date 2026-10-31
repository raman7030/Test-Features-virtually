.class public final Ll/ܽۡ۠;
.super Ll/ۙۚ֨;
.source "945B"


# instance fields
.field public final ۨ:I


# direct methods
.method public constructor <init>(Ll/ۢ۠֨;Ll/ۙ֨֨;ILl/᩷۠֨;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2, p4}, Ll/ۙۚ֨;-><init>(Ll/ۢ۠֨;Ll/ۙ֨֨;Ll/᩷۠֨;)V

    .line 58
    iput p3, p0, Ll/ܽۡ۠;->ۨ:I

    return-void
.end method

.method public static ֫(ILl/ۙ֨֨;)Ll/ܽۡ۠;
    .locals 3

    .line 50
    new-instance v0, Ll/ܽۡ۠;

    sget-object v1, Ll/ۢ۠֨;->ܺ֫:Ll/ۢ۠֨;

    .line 51
    invoke-virtual {p1}, Ll/ۙ֨֨;->ۛ()Ll/᩷۠֨;

    move-result-object v2

    invoke-direct {v0, v1, p1, p0, v2}, Ll/ܽۡ۠;-><init>(Ll/ۢ۠֨;Ll/ۙ֨֨;ILl/᩷۠֨;)V

    return-object v0
.end method

.method public static ᩳ(Ll/ۙ֨֨;)Ll/ܽۡ۠;
    .locals 4

    .line 45
    new-instance v0, Ll/ܽۡ۠;

    sget-object v1, Ll/ۢ۠֨;->ۖ֫:Ll/ۢ۠֨;

    const/4 v2, -0x1

    .line 46
    invoke-virtual {p0}, Ll/ۙ֨֨;->ۛ()Ll/᩷۠֨;

    move-result-object v3

    invoke-direct {v0, v1, p0, v2, v3}, Ll/ܽۡ۠;-><init>(Ll/ۢ۠֨;Ll/ۙ֨֨;ILl/᩷۠֨;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 4

    .line 63
    new-instance v0, Ll/ܽۡ۠;

    iget-object v1, p0, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    iget v2, p0, Ll/ܽۡ۠;->ۨ:I

    iget-object v3, p0, Ll/ۙۚ֨;->ۛ:Ll/ۢ۠֨;

    invoke-direct {v0, v3, v1, v2, p1}, Ll/ܽۡ۠;-><init>(Ll/ۢ۠֨;Ll/ۙ֨֨;ILl/᩷۠֨;)V

    return-object v0
.end method
