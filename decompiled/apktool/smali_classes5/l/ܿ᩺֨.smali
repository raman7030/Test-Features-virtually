.class public final Ll/ܿ᩺֨;
.super Ll/᩻᩺֨;
.source "Y7SB"


# instance fields
.field public final synthetic ۜ:Ll/ۜ᩺֨;

.field public final ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۜ᩺֨;Ll/ۢ֡۠;)V
    .locals 0

    .line 2265
    iput-object p1, p0, Ll/ܿ᩺֨;->ۜ:Ll/ۜ᩺֨;

    .line 2266
    invoke-direct {p0, p1, p2}, Ll/᩻᩺֨;-><init>(Ll/ۜ᩺֨;Ll/᩺᩵۠;)V

    .line 2267
    sget-object p1, Ll/᩷֡۠;->ۤ:Ll/᩷֡۠;

    .line 2586
    iget-object p2, p2, Ll/ۢ֡۠;->ۤ:Ll/᩷֡۠;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2267
    :goto_0
    iput-boolean p1, p0, Ll/ܿ᩺֨;->᩻:Z

    return-void
.end method

.method public static ֫(Ll/ۙ֨֨;)Z
    .locals 3

    .line 2317
    sget-object v0, Ll/ۙۨ֨;->ܽ:[I

    invoke-virtual {p0}, Ll/ۙ֨֨;->֫()Ll/֡᩹۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 2322
    :cond_0
    check-cast p0, Ll/ۡ֨֨;

    .line 2323
    invoke-virtual {p0}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p0

    invoke-static {p0}, Ll/ܿ᩺֨;->֫(Ll/ۙ֨֨;)Z

    move-result p0

    return p0

    :cond_1
    return v1
.end method
