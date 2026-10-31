.class public final synthetic Ll/ۚ۫ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static $default$forEachRemaining(Ll/֨۫ᩴ;Ljava/lang/Object;)V
    .locals 1

    .line 642
    :cond_0
    invoke-interface {p0, p1}, Ll/֨۫ᩴ;->tryAdvance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public static bridge synthetic $default$trySplit(Ll/֨۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 0

    .line 605
    invoke-interface {p0}, Ll/֨۫ᩴ;->trySplit()Ll/֨۫ᩴ;

    move-result-object p0

    return-object p0
.end method
