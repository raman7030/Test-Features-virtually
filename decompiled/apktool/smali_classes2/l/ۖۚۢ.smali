.class public final Ll/ۖۚۢ;
.super Ljava/lang/Object;
.source "A7BS"


# direct methods
.method public static ֫(Ljava/util/Locale;)Ljava/lang/String;
    .locals 4

    const-string v0, "en"

    if-nez p0, :cond_0

    return-object v0

    .line 45
    :cond_0
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 49
    :cond_1
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "zh"

    .line 50
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 51
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    const-string p0, ""

    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string v0, "CN"

    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "zh-rCN"

    if-nez v0, :cond_6

    const-string v0, "SG"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "TW"

    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "HK"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "MO"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    return-object v1

    :cond_5
    :goto_1
    const-string p0, "zh-rTW"

    return-object p0

    :cond_6
    :goto_2
    return-object v1

    :cond_7
    const-string p0, "id"

    .line 61
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const-string v2, "in"

    if-nez p0, :cond_11

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto/16 :goto_4

    .line 64
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result p0

    const/4 v2, -0x1

    sparse-switch p0, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string p0, "uk"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_3

    :cond_9
    const/4 v2, 0x7

    goto :goto_3

    :sswitch_1
    const-string p0, "tr"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_3

    :cond_a
    const/4 v2, 0x6

    goto :goto_3

    :sswitch_2
    const-string p0, "ru"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_3

    :cond_b
    const/4 v2, 0x5

    goto :goto_3

    :sswitch_3
    const-string p0, "it"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_3

    :cond_c
    const/4 v2, 0x4

    goto :goto_3

    :sswitch_4
    const-string p0, "es"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_3

    :cond_d
    const/4 v2, 0x3

    goto :goto_3

    :sswitch_5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto :goto_3

    :cond_e
    const/4 v2, 0x2

    goto :goto_3

    :sswitch_6
    const-string p0, "be"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto :goto_3

    :cond_f
    const/4 v2, 0x1

    goto :goto_3

    :sswitch_7
    const-string p0, "az"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto :goto_3

    :cond_10
    const/4 v2, 0x0

    :goto_3
    packed-switch v2, :pswitch_data_0

    return-object v0

    :pswitch_0
    return-object v1

    :cond_11
    :goto_4
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xc39 -> :sswitch_7
        0xc43 -> :sswitch_6
        0xca9 -> :sswitch_5
        0xcae -> :sswitch_4
        0xd2b -> :sswitch_3
        0xe43 -> :sswitch_2
        0xe7e -> :sswitch_1
        0xe96 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
