.class public final Ll/ܺ᩵ۢ;
.super Ljava/lang/Object;
.source "6782"


# direct methods
.method public static ֫(Ljava/lang/String;)Ll/ۡ᩵ۢ;
    .locals 3

    .line 90
    sget-object v0, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "local:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 90
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 94
    :cond_0
    new-instance v0, Ll/ۡ᩵ۢ;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ll/۟۬ܳ;->֫(I)I

    move-result v1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result p0

    invoke-direct {v0, v1, p0}, Ll/ۡ᩵ۢ;-><init>(IZ)V

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v0, "date"

    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const-string v0, "size"

    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    const-string v0, "type"

    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x3

    return p0

    .line 57
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid sort method"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0
.end method
