.class public final Ll/ۢۤۡ;
.super Ljava/lang/Object;
.source "XALX"

# interfaces
.implements Ll/ᩴܽۧ;


# static fields
.field public static ֫:Ljava/util/Locale;


# direct methods
.method public static ֫(I)Ljava/lang/String;
    .locals 10

    ushr-int/lit8 v0, p0, 0x1c

    and-int/lit8 v0, v0, 0xf

    const-string v1, "0123456789abcdef"

    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    ushr-int/lit8 v2, p0, 0x18

    and-int/lit8 v2, v2, 0xf

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    ushr-int/lit8 v3, p0, 0x14

    and-int/lit8 v3, v3, 0xf

    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    ushr-int/lit8 v4, p0, 0x10

    and-int/lit8 v4, v4, 0xf

    .line 29
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    ushr-int/lit8 v5, p0, 0xc

    and-int/lit8 v5, v5, 0xf

    .line 30
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    ushr-int/lit8 v6, p0, 0x8

    and-int/lit8 v6, v6, 0xf

    .line 31
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    ushr-int/lit8 v7, p0, 0x4

    and-int/lit8 v7, v7, 0xf

    .line 32
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    and-int/lit8 p0, p0, 0xf

    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v1, 0xa

    new-array v1, v1, [C

    const/16 v8, 0x30

    const/4 v9, 0x0

    aput-char v8, v1, v9

    const/16 v8, 0x78

    const/4 v9, 0x1

    aput-char v8, v1, v9

    const/4 v8, 0x2

    aput-char v0, v1, v8

    const/4 v0, 0x3

    aput-char v2, v1, v0

    const/4 v0, 0x4

    aput-char v3, v1, v0

    const/4 v0, 0x5

    aput-char v4, v1, v0

    const/4 v0, 0x6

    aput-char v5, v1, v0

    const/4 v0, 0x7

    aput-char v6, v1, v0

    const/16 v0, 0x8

    aput-char v7, v1, v0

    const/16 v0, 0x9

    aput-char p0, v1, v0

    .line 34
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 116
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    .line 118
    invoke-static {p0}, Ll/ܿ᩹ۧ;->֫(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    :cond_0
    const-string p0, "auto"

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    const-string v1, "custom_language"

    .line 124
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "/"

    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const p0, 0x7f1208bf

    .line 47
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 49
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 0
    invoke-static {v2, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 52
    :cond_1
    invoke-static {p0}, Ll/ۙ᩸ܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 54
    invoke-static {p0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "/"

    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 34
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 36
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object p1

    .line 39
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 0
    invoke-static {p0, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 41
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2f

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/app/Application;)Ljava/util/Locale;
    .locals 1

    const/4 v0, 0x0

    .line 132
    invoke-static {p0, v0}, Ll/ۢۤۡ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Locale;
    .locals 1

    if-nez p1, :cond_0

    .line 256
    invoke-static {p0}, Ll/ۢۤۡ;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 231
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p0

    const/4 v0, -0x1

    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string p0, "auto"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v0, 0xb

    goto/16 :goto_0

    :sswitch_1
    const-string p0, "uk"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v0, 0xa

    goto/16 :goto_0

    :sswitch_2
    const-string p0, "tr"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v0, 0x9

    goto/16 :goto_0

    :sswitch_3
    const-string p0, "ru"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v0, 0x8

    goto/16 :goto_0

    :sswitch_4
    const-string p0, "it"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x7

    goto :goto_0

    :sswitch_5
    const-string p0, "in"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v0, 0x6

    goto :goto_0

    :sswitch_6
    const-string p0, "es"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v0, 0x5

    goto :goto_0

    :sswitch_7
    const-string p0, "en"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_8
    const-string p0, "be"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_9
    const-string p0, "az"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_a
    const-string p0, "zh-rTW"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_b
    const-string p0, "zh-rCN"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_0

    :cond_c
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    .line 250
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown language name: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 233
    :pswitch_0
    sget-object p0, Ll/ۢۤۡ;->֫:Ljava/util/Locale;

    if-eqz p0, :cond_d

    return-object p0

    :cond_d
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    return-object p0

    .line 235
    :pswitch_1
    sget-object p0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    return-object p0

    .line 244
    :pswitch_2
    new-instance p0, Ljava/util/Locale;

    invoke-direct {p0, p1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    return-object p0

    .line 248
    :pswitch_3
    sget-object p0, Ljava/util/Locale;->TRADITIONAL_CHINESE:Ljava/util/Locale;

    return-object p0

    .line 246
    :pswitch_4
    sget-object p0, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x2a010ec2 -> :sswitch_b
        -0x2a010caa -> :sswitch_a
        0xc39 -> :sswitch_9
        0xc43 -> :sswitch_8
        0xca9 -> :sswitch_7
        0xcae -> :sswitch_6
        0xd25 -> :sswitch_5
        0xd2b -> :sswitch_4
        0xe43 -> :sswitch_3
        0xe7e -> :sswitch_2
        0xe96 -> :sswitch_1
        0x2dddaf -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Landroid/content/res/Resources;)Ljava/util/Locale;
    .locals 2

    .line 136
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-static {v0}, Ll/᩷۫;->֫(Landroid/content/res/Configuration;)Ll/ۘ۫;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 140
    :cond_0
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget-object p0, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    if-eqz p0, :cond_1

    return-object p0

    .line 141
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/ContextWrapper;)V
    .locals 1

    const/4 v0, 0x0

    .line 132
    invoke-static {p0, v0}, Ll/ۢۤۡ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    .line 74
    invoke-static {p0, v0}, Ll/ۢۤۡ;->֫(Landroid/content/ContextWrapper;Ljava/util/Locale;)V

    return-void
.end method

.method public static ֫(Landroid/content/ContextWrapper;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    .line 256
    invoke-static {p0}, Ll/ۢۤۡ;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const-string v0, "auto"

    .line 223
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    invoke-static {}, Ll/ۘ۫;->ܿ()Ll/ۘ۫;

    move-result-object p0

    goto :goto_0

    .line 226
    :cond_1
    invoke-static {p0, p1}, Ll/ۢۤۡ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/util/Locale;

    const/4 v0, 0x0

    aput-object p0, p1, v0

    invoke-static {p1}, Ll/ۘ۫;->֫([Ljava/util/Locale;)Ll/ۘ۫;

    move-result-object p0

    .line 101
    :goto_0
    invoke-virtual {p0}, Ll/ۘ۫;->ܽ()Ljava/lang/String;

    move-result-object p1

    .line 102
    invoke-static {}, Ll/۬ܿ;->ᩴ()Ll/ۘ۫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۘ۫;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 103
    invoke-static {p0}, Ll/۬ܿ;->֫(Ll/ۘ۫;)V

    :cond_2
    return-void
.end method

.method public static ֫(Landroid/content/ContextWrapper;Ljava/util/Locale;)V
    .locals 1

    .line 180
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢۤۡ;->֫(Landroid/content/res/Resources;Ljava/util/Locale;)V

    .line 181
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    .line 193
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 195
    invoke-static {v0, p1}, Ll/ۢۤۡ;->֫(Landroid/content/res/Resources;Ljava/util/Locale;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    :catchall_0
    :cond_0
    invoke-static {p1}, Ll/ᩳᩴۡ;->֫(Ljava/util/Locale;)V

    .line 183
    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܶܳ᩷;->ܽ(Ljava/lang/String;)V

    .line 184
    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܶܳ᩷;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Landroid/content/res/Resources;Ljava/util/Locale;)V
    .locals 2

    .line 205
    invoke-static {p0}, Ll/ۢۤۡ;->֫(Landroid/content/res/Resources;)Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 208
    :cond_0
    new-instance v0, Landroid/content/res/Configuration;

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 217
    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 218
    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 210
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    return-void
.end method

.method public static ֫(Ljava/lang/StringBuilder;I)V
    .locals 3

    if-ltz p1, :cond_1

    const/16 v0, 0x3e8

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    div-int/lit8 v0, p1, 0x64

    rem-int/lit8 v0, v0, 0xa

    .line 43
    div-int/lit8 v1, p1, 0xa

    rem-int/lit8 v1, v1, 0xa

    .line 44
    rem-int/lit8 p1, p1, 0xa

    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-void

    .line 39
    :cond_1
    :goto_0
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "%03d"

    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ֫(Ll/ۤ۠᩷;Ljava/lang/String;)V
    .locals 1

    .line 82
    invoke-static {p0, p1}, Ll/ۢۤۡ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    .line 83
    invoke-static {p0, p1}, Ll/ۢۤۡ;->֫(Landroid/content/ContextWrapper;Ljava/lang/String;)V

    .line 84
    invoke-static {p0, v0}, Ll/ۢۤۡ;->֫(Landroid/content/ContextWrapper;Ljava/util/Locale;)V

    return-void
.end method

.method public static ۧ(Landroid/content/Context;)Landroid/content/Context;
    .locals 3

    .line 161
    sget-object v0, Ll/ۢۤۡ;->֫:Ljava/util/Locale;

    if-nez v0, :cond_0

    .line 172
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Ll/ۢۤۡ;->֫(Landroid/content/res/Resources;)Ljava/util/Locale;

    move-result-object v0

    .line 162
    sput-object v0, Ll/ۢۤۡ;->֫:Ljava/util/Locale;

    :cond_0
    const/4 v0, 0x0

    .line 132
    invoke-static {p0, v0}, Ll/ۢۤۡ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    .line 60
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1}, Ll/ۢۤۡ;->֫(Landroid/content/res/Resources;)Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object p0

    .line 63
    :cond_1
    new-instance v1, Landroid/content/res/Configuration;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 217
    invoke-virtual {v1, v0}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 218
    invoke-virtual {v1, v0}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 65
    invoke-virtual {p0, v1}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 60
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "/"

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 0
    invoke-static {v2, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 63
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x2f

    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    return-object p0

    :cond_2
    add-int/2addr v0, v2

    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static ۧ()Z
    .locals 2

    const/4 v0, 0x0

    .line 132
    invoke-static {v0, v0}, Ll/ۢۤۡ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "zh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, "/"

    const/4 v3, 0x1

    if-le v0, v3, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 0
    invoke-static {v3, v1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 18
    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v4, 0x0

    if-nez v0, :cond_3

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x2f

    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    return-object v4

    :cond_2
    add-int/2addr v0, v3

    .line 28
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    return-object v4
.end method

.method public static ܽ()Z
    .locals 3

    const/4 v0, 0x0

    .line 132
    invoke-static {v0, v0}, Ll/ۢۤۡ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "zh"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    .line 0
    invoke-static {v0, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ()V
    .locals 1

    .line 172
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Ll/ۢۤۡ;->֫(Landroid/content/res/Resources;)Ljava/util/Locale;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 41
    sput-object v0, Ll/ۢۤۡ;->֫:Ljava/util/Locale;

    :cond_0
    return-void
.end method


# virtual methods
.method public ֫(J)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public ֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I
    .locals 0

    const/4 p1, 0x4

    .line 40
    invoke-virtual {p2, p1}, Ll/ۘ᩸֫;->ܿ(I)V

    const/4 p1, -0x4

    return p1
.end method

.method public ֫()V
    .locals 0

    return-void
.end method

.method public ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
