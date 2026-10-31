.class public abstract Ll/ۜܿᩳ;
.super Ljava/lang/Object;
.source "IO5"


# direct methods
.method public static ֫(Ll/֫ܿᩳ;)I
    .locals 3

    .line 105
    sget-object v0, Ll/᩻ܿᩳ;->ۧ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 126
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported data type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 p0, 0x1

    return p0

    :pswitch_1
    const/16 p0, 0x18

    return p0

    :pswitch_2
    const/16 p0, 0x17

    return p0

    :pswitch_3
    const/16 p0, 0x10

    return p0

    :pswitch_4
    const/16 p0, 0x11

    return p0

    :pswitch_5
    const/4 p0, 0x3

    return p0

    :pswitch_6
    const/4 p0, 0x4

    return p0

    :pswitch_7
    const/4 p0, 0x6

    return p0

    :pswitch_8
    const/4 p0, 0x2

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ܰᩳᩳ;)I
    .locals 3

    .line 131
    sget-object v0, Ll/᩻ܿᩳ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 141
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported tag class: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v1
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    const-string p0, "PRIVATE"

    return-object p0

    .line 156
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported type class: "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 156
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string p0, ""

    return-object p0

    :cond_2
    const-string p0, "APPLICATION"

    return-object p0

    :cond_3
    const-string p0, "UNIVERSAL"

    return-object p0
.end method

.method public static ֫(II)Ljava/lang/String;
    .locals 2

    .line 161
    invoke-static {p0}, Ll/ۜܿᩳ;->֫(I)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x10

    if-eq p1, v0, :cond_3

    const/16 v0, 0x11

    if-eq p1, v0, :cond_2

    const/16 v0, 0x17

    if-eq p1, v0, :cond_1

    const/16 v0, 0x18

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, p1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :pswitch_0
    const-string p1, "OBJECT IDENTIFIER"

    goto :goto_0

    :pswitch_1
    const-string p1, "NULL"

    goto :goto_0

    :pswitch_2
    const-string p1, "OCTET STRING"

    goto :goto_0

    :pswitch_3
    const-string p1, "BIT STRING"

    goto :goto_0

    :pswitch_4
    const-string p1, "INTEGER"

    goto :goto_0

    :pswitch_5
    const-string p1, "BOOLEAN"

    goto :goto_0

    :cond_0
    const-string p1, "GENERALIZED TIME"

    goto :goto_0

    :cond_1
    const-string p1, "UTC TIME"

    goto :goto_0

    :cond_2
    const-string p1, "SET"

    goto :goto_0

    :cond_3
    const-string p1, "SEQUENCE"

    .line 163
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    return-object p1

    :cond_4
    const-string v0, " "

    .line 0
    invoke-static {p0, v0, p1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
