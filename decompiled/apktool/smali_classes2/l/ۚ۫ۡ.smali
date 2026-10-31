.class public final Ll/ۚ۫ۡ;
.super Ljava/lang/Object;
.source "WBSX"


# direct methods
.method public static ֫(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 25
    :cond_0
    instance-of v1, p0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    .line 26
    check-cast p0, Landroid/app/Activity;

    return-object p0

    .line 27
    :cond_1
    instance-of v1, p0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_2

    .line 28
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 2

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {p0, v1}, Ll/ۚ۫ۡ;->֫(IZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (API "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IZ)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/16 v0, 0x23

    if-le p0, v0, :cond_0

    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Android "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 p0, p0, -0x14

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    :pswitch_0
    const-string p0, "Android 15"

    goto/16 :goto_0

    :pswitch_1
    const-string p0, "Android 14"

    goto/16 :goto_0

    :pswitch_2
    const-string p0, "Android 13"

    goto/16 :goto_0

    :pswitch_3
    const-string p0, "Android 12L"

    goto/16 :goto_0

    :pswitch_4
    const-string p0, "Android 12"

    goto/16 :goto_0

    :pswitch_5
    const-string p0, "Android 11"

    goto/16 :goto_0

    :pswitch_6
    const-string p0, "Android 10"

    goto/16 :goto_0

    :pswitch_7
    const-string p0, "Android 9"

    goto/16 :goto_0

    :pswitch_8
    const-string p0, "Android 8.1"

    goto/16 :goto_0

    :pswitch_9
    const-string p0, "Android 8.0"

    goto/16 :goto_0

    :pswitch_a
    const-string p0, "Android 7.1"

    goto :goto_0

    :pswitch_b
    const-string p0, "Android 7.0"

    goto :goto_0

    :pswitch_c
    const-string p0, "Android 6.0"

    goto :goto_0

    :pswitch_d
    const-string p0, "Android 5.1"

    goto :goto_0

    :pswitch_e
    const-string p0, "Android 5.0"

    goto :goto_0

    :pswitch_f
    const-string p0, "Android 4.4W"

    goto :goto_0

    :pswitch_10
    const-string p0, "Android 4.4"

    goto :goto_0

    :pswitch_11
    const-string p0, "Android 4.3"

    goto :goto_0

    :pswitch_12
    const-string p0, "Android 4.2"

    goto :goto_0

    :pswitch_13
    const-string p0, "Android 4.1"

    goto :goto_0

    :pswitch_14
    const-string p0, "Android 4.0.3"

    goto :goto_0

    :pswitch_15
    const-string p0, "Android 4.0"

    goto :goto_0

    :pswitch_16
    const-string p0, "Android 3.2"

    goto :goto_0

    :pswitch_17
    const-string p0, "Android 3.1"

    goto :goto_0

    :pswitch_18
    const-string p0, "Android 3.0"

    goto :goto_0

    :pswitch_19
    const-string p0, "Android 2.3.3"

    goto :goto_0

    :pswitch_1a
    const-string p0, "Android 2.3"

    goto :goto_0

    :pswitch_1b
    const-string p0, "Android 2.2"

    goto :goto_0

    :pswitch_1c
    const-string p0, "Android 2.1"

    goto :goto_0

    :pswitch_1d
    const-string p0, "Android 2.0.1"

    goto :goto_0

    :pswitch_1e
    const-string p0, "Android 2.0"

    goto :goto_0

    :pswitch_1f
    const-string p0, "Android 1.6"

    goto :goto_0

    :pswitch_20
    const-string p0, "Android 1.5"

    goto :goto_0

    :pswitch_21
    const-string p0, "Android 1.1"

    goto :goto_0

    :pswitch_22
    const-string p0, "Android 1.0"

    goto :goto_0

    :cond_0
    const-string p0, "Unknown"

    :goto_0
    if-eqz p1, :cond_1

    const-string p1, ".0"

    .line 152
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    const/4 v0, 0x2

    .line 0
    invoke-static {v0, p1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
