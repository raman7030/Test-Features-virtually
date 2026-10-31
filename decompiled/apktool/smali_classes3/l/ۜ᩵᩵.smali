.class public final Ll/ۜ᩵᩵;
.super Ll/۫ᩴ᩵;
.source "LA0A"


# virtual methods
.method public final ۧ(I[B)I
    .locals 0

    .line 59
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    return p2

    .line 61
    :cond_0
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Expected structureSize = 2"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1
.end method

.method public final ᩳ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
