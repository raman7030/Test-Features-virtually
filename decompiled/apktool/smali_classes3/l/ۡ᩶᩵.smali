.class public abstract Ll/ۡ᩶᩵;
.super Ll/᩵᩶᩵;
.source "PAX3"


# virtual methods
.method public final ֫()I
    .locals 1

    .line 41
    invoke-virtual {p0}, Ll/ۡ᩶᩵;->ᩳ()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 2

    const/high16 v0, 0x7fff0000

    .line 42
    invoke-virtual {p0}, Ll/ۡ᩶᩵;->ᩳ()Ljava/util/Random;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    return v0
.end method

.method public abstract ᩳ()Ljava/util/Random;
.end method
