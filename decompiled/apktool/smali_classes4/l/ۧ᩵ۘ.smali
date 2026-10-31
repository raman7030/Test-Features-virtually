.class public final Ll/ۧ᩵ۘ;
.super Ll/᩻᩵ۘ;
.source "08E3"


# instance fields
.field public ܳ:Ll/۠ᩴۘ;

.field public ᩻:Ll/ۧᩴۘ;


# virtual methods
.method public final ֫(Ll/ۧᩴۘ;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/ۧ᩵ۘ;->᩻:Ll/ۧᩴۘ;

    return-void
.end method

.method public final ۧ()V
    .locals 6

    .line 38
    iget-object v0, p0, Ll/ۧ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܺᩴۘ;->֫(I)[D

    move-result-object v0

    .line 39
    iget-object v2, p0, Ll/ۧ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ll/ܺᩴۘ;->֫(I)[D

    move-result-object v2

    .line 40
    iget-object v3, p0, Ll/ۧ᩵ۘ;->᩻:Ll/ۧᩴۘ;

    if-eqz v3, :cond_0

    :goto_0
    const/16 v4, 0x8

    if-ge v1, v4, :cond_0

    .line 44
    :try_start_0
    aget-wide v4, v0, v1

    invoke-virtual {v3, v4, v5}, Ll/ۧᩴۘ;->֫(D)V

    .line 45
    aget-wide v4, v2, v1

    invoke-virtual {v3, v4, v5}, Ll/ۧᩴۘ;->֫(D)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    :cond_0
    return-void
.end method
