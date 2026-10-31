.class public final Ll/۬ۘ֡;
.super Ljava/lang/Object;
.source "YAHK"


# direct methods
.method public static ֫(Ll/ۖ᩹ᩴ;Ll/ۖ᩹ᩴ;)Ll/ۖ᩹ᩴ;
    .locals 0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "defaultValue"

    .line 219
    invoke-static {p1, p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object p1
.end method

.method public static ֫(Ll/ۖ᩹ᩴ;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 156
    invoke-virtual {p0}, Ll/ۖ᩹ᩴ;->isNegative()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ۖ᩹ᩴ;->isZero()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
