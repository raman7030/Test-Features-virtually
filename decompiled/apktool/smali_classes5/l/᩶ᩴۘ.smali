.class public final Ll/᩶ᩴۘ;
.super Ll/ᩳ᩵ۘ;
.source "88BR"


# virtual methods
.method public final ۧ()V
    .locals 8

    .line 39
    iget-object v0, p0, Ll/ᩳ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 40
    iget-object v1, p0, Ll/ᩳ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    .line 41
    iget-object v2, p0, Ll/ᩳ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    invoke-virtual {v2}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x8

    if-ge v3, v4, :cond_0

    .line 46
    aget-wide v4, v0, v3

    aget-wide v6, v1, v3

    add-double/2addr v4, v6

    aput-wide v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
