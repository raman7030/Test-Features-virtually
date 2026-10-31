.class public final Ll/᩻ᩴۧ;
.super Ljava/lang/Object;
.source "58LM"

# interfaces
.implements Ll/ۜᩴۧ;


# virtual methods
.method public final ֫(Ll/۠ᩴ֫;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/۠ᩴ֫;)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ܽ(Ll/۠ᩴ֫;)Ll/ۢᩴۧ;
    .locals 1

    .line 55
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This SubtitleParser.Factory doesn\'t support any formats."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
