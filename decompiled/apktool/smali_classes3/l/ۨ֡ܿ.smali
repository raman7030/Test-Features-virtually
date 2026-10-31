.class public final Ll/ۨ֡ܿ;
.super Ljava/lang/Object;
.source "46JS"


# direct methods
.method public static ֫(Ll/ۤۚۢ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 86
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "pm list packages --user "

    const-string v1, " "

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 90
    invoke-static {p2}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    .line 89
    invoke-interface {p0, p1, v0}, Ll/ۤۚۢ;->֫(Ljava/lang/String;Z)Ll/۫ۚۢ;

    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ll/۫ۚۢ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_3

    .line 94
    iget-object p0, p0, Ll/۫ۚۢ;->ۧ:[Ljava/lang/String;

    array-length p1, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_2

    aget-object v3, p0, v2

    .line 95
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v4, "package:"

    invoke-virtual {v4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    return-void

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 103
    :cond_2
    new-instance p0, Ll/֫ۛۡ;

    new-array p1, v0, [Ljava/lang/Object;

    aput-object p2, p1, v1

    const p2, 0x7f120057

    invoke-static {p2, p1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 99
    throw p0

    .line 92
    :cond_3
    new-instance p1, Ll/֫ۛۡ;

    .line 83
    iget-object p0, p0, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    .line 16
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 92
    throw p1
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 7

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0xff

    if-lt v0, v2, :cond_0

    goto :goto_4

    :cond_0
    const/4 v0, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 39
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v2, v5, :cond_7

    .line 40
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x2e

    if-ne v5, v6, :cond_2

    if-eqz v3, :cond_1

    return v1

    :cond_1
    const/4 v3, 0x1

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/16 v6, 0x61

    if-lt v5, v6, :cond_3

    const/16 v6, 0x7a

    if-le v5, v6, :cond_5

    :cond_3
    const/16 v6, 0x41

    if-lt v5, v6, :cond_4

    const/16 v6, 0x5a

    if-gt v5, v6, :cond_4

    goto :goto_1

    :cond_4
    if-nez v3, :cond_6

    const/16 v3, 0x5f

    if-eq v5, v3, :cond_5

    const/16 v3, 0x30

    if-lt v5, v3, :cond_6

    const/16 v3, 0x39

    if-le v5, v3, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    const/4 v3, 0x0

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    :goto_3
    return v1

    :cond_7
    if-nez v3, :cond_9

    if-nez v4, :cond_8

    const-string v2, "android"

    .line 55
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    :cond_8
    return v0

    :cond_9
    :goto_4
    return v1
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 2

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Ll/ۨ֡ܿ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid installer package name"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 29
    :cond_1
    :goto_0
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "ais"

    invoke-interface {v0, v1, p0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 59
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, ""

    return-object p0

    .line 62
    :cond_0
    invoke-static {p0}, Ll/ۨ֡ܿ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-i "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 63
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid installer package name"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
