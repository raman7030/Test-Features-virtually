.class public final Ll/᩸ᩴ֨;
.super Ljava/lang/Object;
.source "O416"


# direct methods
.method public static ֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;
    .locals 4

    .line 273
    sget-object v0, Ll/֡ᩴ֨;->ۧ:[I

    invoke-virtual {p0}, Ll/ۛ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 315
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected kind: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۛ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 312
    :pswitch_0
    sget-object p0, Ll/۠ᩴ֨;->ۤ:Ll/۠ᩴ֨;

    return-object p0

    .line 310
    :pswitch_1
    sget-object p0, Ll/۠ᩴ֨;->ܽ֫:Ll/۠ᩴ֨;

    return-object p0

    .line 308
    :pswitch_2
    sget-object p0, Ll/۠ᩴ֨;->ۨ:Ll/۠ᩴ֨;

    return-object p0

    .line 305
    :pswitch_3
    sget-object p0, Ll/۠ᩴ֨;->۬:Ll/۠ᩴ֨;

    return-object p0

    .line 302
    :pswitch_4
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x2000000000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-eqz p0, :cond_0

    sget-object p0, Ll/۠ᩴ֨;->֫֫:Ll/۠ᩴ֨;

    return-object p0

    :cond_0
    sget-object p0, Ll/۠ᩴ֨;->ܳ֫:Ll/۠ᩴ֨;

    return-object p0

    .line 299
    :pswitch_5
    sget-object p0, Ll/۠ᩴ֨;->ܳ֫:Ll/۠ᩴ֨;

    return-object p0

    .line 291
    :pswitch_6
    sget-object p0, Ll/۠ᩴ֨;->ᩳ֫:Ll/۠ᩴ֨;

    return-object p0

    .line 288
    :pswitch_7
    sget-object p0, Ll/۠ᩴ֨;->ۛ:Ll/۠ᩴ֨;

    return-object p0

    .line 285
    :pswitch_8
    sget-object p0, Ll/۠ᩴ֨;->۟:Ll/۠ᩴ֨;

    return-object p0

    .line 282
    :pswitch_9
    sget-object p0, Ll/۠ᩴ֨;->ۗ:Ll/۠ᩴ֨;

    return-object p0

    .line 278
    :pswitch_a
    sget-object p0, Ll/۠ᩴ֨;->۫:Ll/۠ᩴ֨;

    return-object p0

    .line 275
    :pswitch_b
    sget-object p0, Ll/۠ᩴ֨;->ܰ:Ll/۠ᩴ֨;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۧܺ֨;)Ll/۠ᩴ֨;
    .locals 3

    .line 263
    sget-object v0, Ll/֡ᩴ֨;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 265
    sget-object p0, Ll/۠ᩴ֨;->۬:Ll/۠ᩴ֨;

    return-object p0

    .line 266
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected mode: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 264
    :cond_1
    sget-object p0, Ll/۠ᩴ֨;->ۨ:Ll/۠ᩴ֨;

    return-object p0
.end method
