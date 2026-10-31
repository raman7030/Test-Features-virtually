.class public final Ll/ܽ᩵ۘ;
.super Ll/᩻᩵ۘ;
.source "88CY"


# instance fields
.field public ۜ:Ll/ܶᩴۘ;

.field public ܳ:Ll/۠ᩴۘ;

.field public ᩻:Ll/۠ᩴۘ;


# virtual methods
.method public final ۧ()V
    .locals 7

    .line 46
    iget-object v0, p0, Ll/ܽ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 47
    iget-object v1, p0, Ll/ܽ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    .line 48
    iget-object v2, p0, Ll/ܽ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ll/ܺᩴۘ;->֫(I)[D

    move-result-object v4

    const/4 v5, 0x1

    .line 49
    invoke-virtual {v2, v5}, Ll/ܺᩴۘ;->֫(I)[D

    move-result-object v2

    :goto_0
    const/16 v5, 0x8

    if-ge v3, v5, :cond_0

    .line 52
    aget-wide v5, v0, v3

    aput-wide v5, v4, v3

    .line 53
    aget-wide v5, v1, v3

    aput-wide v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
