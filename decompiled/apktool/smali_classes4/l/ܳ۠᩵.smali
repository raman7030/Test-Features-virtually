.class public final Ll/ܳ۠᩵;
.super Ll/ۜ۠᩵;


# direct methods
.method public static ֫(Ll/֫᩹᩵;)Ll/ܿ۠᩵;
    .locals 1

    .line 26
    new-instance v0, Ll/֡۠᩵;

    invoke-direct {v0, p0}, Ll/֡۠᩵;-><init>(Ll/֫᩹᩵;)V

    return-object v0
.end method

.method public static ֫(Ll/᩷۠᩵;Ll/֫᩹᩵;)Ll/ܿ۠᩵;
    .locals 1

    const-string v0, "mode"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    sget-object v0, Ll/᩻۠᩵;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 45
    new-instance p0, Ll/ܶ۠᩵;

    invoke-direct {p0, p1}, Ll/ܶ۠᩵;-><init>(Ll/֫᩹᩵;)V

    return-object p0

    .line 42
    :cond_0
    new-instance p0, Ll/ۡ۠᩵;

    .line 9
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 42
    throw p0

    .line 44
    :cond_1
    new-instance p0, Ll/᩵۠᩵;

    invoke-direct {p0, p1}, Ll/᩵۠᩵;-><init>(Ll/֫᩹᩵;)V

    return-object p0

    .line 43
    :cond_2
    new-instance p0, Ll/֡۠᩵;

    invoke-direct {p0, p1}, Ll/֡۠᩵;-><init>(Ll/֫᩹᩵;)V

    return-object p0
.end method
