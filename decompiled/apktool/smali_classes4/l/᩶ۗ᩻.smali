.class public final Ll/᩶ۗ᩻;
.super Ljava/lang/Object;
.source "179R"


# direct methods
.method public static ֫()I
    .locals 3

    .line 33
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "amsl"

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    const/16 v1, 0x64

    if-gt v0, v1, :cond_0

    return v0

    :cond_0
    return v2
.end method

.method public static ֫(Ll/ܽ᩺ܽ;)Ll/ܽ᩺ܽ;
    .locals 4

    .line 80
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    goto :goto_0

    .line 83
    :cond_0
    invoke-static {}, Ll/ܶܿᩳ;->ۚ()Ll/ܶܿᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, 0x7f120aa3

    .line 25
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    move-object v0, v2

    .line 86
    :cond_1
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 87
    :goto_1
    new-instance v2, Ll/ܽ᩺ܽ;

    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ᩳ()Ll/۠ۧᩳ;

    move-result-object v3

    .line 88
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->֫()Z

    move-result p0

    invoke-direct {v2, v0, v3, v1, p0}, Ll/ܽ᩺ܽ;-><init>(Ljava/lang/String;Ll/۠ۧᩳ;Ljava/lang/String;Z)V

    return-object v2
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 3

    .line 113
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 117
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x1

    if-lt p0, v0, :cond_1

    const/16 v2, 0x64

    if-gt p0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 118
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 25
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    const-string v0, "amsl"

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p0, v1, v0}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    :cond_3
    return-void
.end method

.method public static ۧ()Ll/ܽ᩺ܽ;
    .locals 7

    .line 41
    new-instance v0, Ll/ܽ᩺ܽ;

    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "amsk"

    const-string v3, ""

    .line 42
    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    sget-object v3, Ll/۠ۧᩳ;->ۤ:Ll/۠ۧᩳ;

    .line 44
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const-string v5, "amss"

    .line 43
    invoke-interface {v2, v5, v4}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 102
    invoke-static {}, Ll/۠ۧᩳ;->values()[Ll/۠ۧᩳ;

    move-result-object v4

    if-ltz v2, :cond_1

    .line 103
    array-length v5, v4

    if-lt v2, v5, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    aget-object v3, v4, v2

    .line 43
    :cond_1
    :goto_0
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "amv1sf"

    const/4 v5, 0x0

    .line 45
    invoke-interface {v2, v4, v5}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v5, "amkv1sd"

    const/4 v6, 0x0

    .line 46
    invoke-interface {v4, v5, v6}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-direct {v0, v1, v3, v2, v4}, Ll/ܽ᩺ܽ;-><init>(Ljava/lang/String;Ll/۠ۧᩳ;Ljava/lang/String;Z)V

    .line 41
    invoke-static {v0}, Ll/᩶ۗ᩻;->֫(Ll/ܽ᩺ܽ;)Ll/ܽ᩺ܽ;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ll/ܽ᩺ܽ;)V
    .locals 3

    .line 60
    invoke-static {p0}, Ll/᩶ۗ᩻;->֫(Ll/ܽ᩺ܽ;)Ll/ܽ᩺ܽ;

    move-result-object p0

    .line 61
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "amsk"

    .line 62
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    .line 63
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ᩳ()Ll/۠ۧᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const-string v2, "amss"

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "amkv1sd"

    .line 64
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->֫()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    .line 65
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "amv1sf"

    if-nez v1, :cond_0

    .line 66
    invoke-interface {v0, v2}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v2, p0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    .line 70
    :goto_0
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
