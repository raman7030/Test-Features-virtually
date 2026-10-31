.class public final Ll/ܳ۠ۖ;
.super Ljava/lang/Object;
.source "L9QC"


# direct methods
.method public static ֫(Ll/۟ۜۖ;Ll/۟֨ۖ;Ll/ܿ۠ۖ;)Ljava/lang/Object;
    .locals 1

    .line 204
    sget-object v0, Ll/ۤ֨ۖ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 246
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "There is no way to get here, but the compiler thinks otherwise."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 243
    :pswitch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "readPrimitiveField() cannot handle enums."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 239
    :pswitch_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "readPrimitiveField() cannot handle embedded messages."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 237
    :pswitch_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "readPrimitiveField() cannot handle nested groups."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 235
    :pswitch_3
    invoke-virtual {p2, p0}, Ll/ܿ۠ۖ;->֫(Ll/۟ۜۖ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 232
    :pswitch_4
    invoke-virtual {p0}, Ll/۟ۜۖ;->ۚ()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 230
    :pswitch_5
    invoke-virtual {p0}, Ll/۟ۜۖ;->֡()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 228
    :pswitch_6
    invoke-virtual {p0}, Ll/۟ۜۖ;->᩵()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 226
    :pswitch_7
    invoke-virtual {p0}, Ll/۟ۜۖ;->ᩴ()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 224
    :pswitch_8
    invoke-virtual {p0}, Ll/۟ۜۖ;->᩸()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 222
    :pswitch_9
    invoke-virtual {p0}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object p0

    return-object p0

    .line 220
    :pswitch_a
    invoke-virtual {p0}, Ll/۟ۜۖ;->ܿ()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 218
    :pswitch_b
    invoke-virtual {p0}, Ll/۟ۜۖ;->᩷()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 216
    :pswitch_c
    invoke-virtual {p0}, Ll/۟ۜۖ;->ۢ()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 214
    :pswitch_d
    invoke-virtual {p0}, Ll/۟ۜۖ;->ܺ()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 212
    :pswitch_e
    invoke-virtual {p0}, Ll/۟ۜۖ;->᩹()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 210
    :pswitch_f
    invoke-virtual {p0}, Ll/۟ۜۖ;->ۖ()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 208
    :pswitch_10
    invoke-virtual {p0}, Ll/۟ۜۖ;->ۡ()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    .line 206
    :pswitch_11
    invoke-virtual {p0}, Ll/۟ۜۖ;->᩻()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
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
