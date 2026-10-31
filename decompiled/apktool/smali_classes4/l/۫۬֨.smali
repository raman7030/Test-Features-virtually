.class public final Ll/۫۬֨;
.super Ll/ۢ֡۠;
.source "W7SR"


# instance fields
.field public final synthetic ܿ֫:Ll/ۢ֡۠;


# direct methods
.method public constructor <init>(Ll/ۧܺ֨;Ll/ۤܶ۠;Ll/۫᩵۠;Ll/ۖܶ۠;Ll/ۢ֡۠;)V
    .locals 0

    .line 174
    iput-object p5, p0, Ll/۫۬֨;->ܿ֫:Ll/ۢ֡۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۢ֡۠;-><init>(Ll/ۧܺ֨;Ll/ۤܶ۠;Ll/۫᩵۠;Ll/ۖܶ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۜ֡۠;)V
    .locals 3

    .line 177
    iget-object v0, p0, Ll/۫۬֨;->ܿ֫:Ll/ۢ֡۠;

    invoke-virtual {v0}, Ll/ۢ֡۠;->᩷֫()Ll/ۜ֡۠;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 178
    sget-object v2, Ll/ۜ֡۠;->᩹:Ll/ۜ֡۠;

    if-ne v1, v2, :cond_0

    goto :goto_2

    :cond_0
    if-eq v1, p1, :cond_2

    if-ne p1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 181
    :goto_1
    invoke-static {p1}, Ll/۫ۙ;->֫(Z)V

    return-void

    .line 179
    :cond_3
    :goto_2
    invoke-virtual {v0, p1}, Ll/ۢ֡۠;->֫(Ll/ۜ֡۠;)V

    return-void
.end method

.method public final ᩷֫()Ll/ۜ֡۠;
    .locals 1

    .line 187
    iget-object v0, p0, Ll/۫۬֨;->ܿ֫:Ll/ۢ֡۠;

    invoke-virtual {v0}, Ll/ۢ֡۠;->᩷֫()Ll/ۜ֡۠;

    move-result-object v0

    return-object v0
.end method
