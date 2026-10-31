.class public final Ll/ܰᩴۘ;
.super Ll/᩻᩵ۘ;
.source "H8DC"


# instance fields
.field public ۜ:Ll/۠ᩴۘ;

.field public ܳ:Ll/۠ᩴۘ;

.field public ᩻:Ll/ܶᩴۘ;


# virtual methods
.method public final ۧ()V
    .locals 11

    .line 50
    iget-object v0, p0, Ll/ܰᩴۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v0

    .line 51
    iget-object v1, p0, Ll/ܰᩴۘ;->ۜ:Ll/۠ᩴۘ;

    invoke-virtual {v1}, Ll/ܺᩴۘ;->ܿ()[D

    move-result-object v1

    .line 52
    iget-object v2, p0, Ll/ܰᩴۘ;->᩻:Ll/ܶᩴۘ;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ll/ܺᩴۘ;->֫(I)[D

    move-result-object v4

    const/4 v5, 0x1

    .line 53
    invoke-virtual {v2, v5}, Ll/ܺᩴۘ;->֫(I)[D

    move-result-object v2

    :goto_0
    const/16 v5, 0x8

    if-ge v3, v5, :cond_0

    .line 56
    aget-wide v5, v1, v3

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    mul-double v5, v5, v7

    add-double/2addr v5, v7

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v7, v5

    .line 60
    aget-wide v9, v0, v3

    mul-double v7, v7, v9

    .line 61
    aput-wide v7, v4, v3

    mul-double v9, v9, v5

    .line 62
    aput-wide v9, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
