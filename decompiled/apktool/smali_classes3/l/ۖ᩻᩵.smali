.class public final Ll/ۖ᩻᩵;
.super Ll/ۘ᩻᩵;
.source "I6PU"


# instance fields
.field public ۛ:Ll/ܺ᩻᩵;


# virtual methods
.method public final ֫(I)Ll/ۗ᩻᩵;
    .locals 2

    .line 1213
    iget-object v0, p0, Ll/ۖ᩻᩵;->ۛ:Ll/ܺ᩻᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ll/ܺ᩻᩵;->֫(I)Ll/ۗ᩻᩵;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 1215
    :cond_0
    iput-object v1, p0, Ll/ۖ᩻᩵;->ۛ:Ll/ܺ᩻᩵;

    return-object p1

    :cond_1
    :goto_0
    return-object v1
.end method

.method public final ܳ()Z
    .locals 1

    .line 1220
    iget-object v0, p0, Ll/ۖ᩻᩵;->ۛ:Ll/ܺ᩻᩵;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
