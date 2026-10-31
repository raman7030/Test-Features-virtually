.class public final Ll/ۖᩳۜ;
.super Ljava/lang/Object;
.source "177I"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    if-lez v0, :cond_1

    add-int/lit8 v1, v0, -0x1

    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-lt v1, v2, :cond_1

    const/16 v2, 0x39

    if-le v1, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 27
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_2

    return-object p0

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;
    .locals 1

    .line 34
    invoke-interface {p0}, Ll/ۜ᩻ܽ;->ۘۧ()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, "default"

    return-object p0
.end method
