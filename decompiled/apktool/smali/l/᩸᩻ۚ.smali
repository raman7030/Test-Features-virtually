.class public final Ll/᩸᩻ۚ;
.super Ljava/lang/Object;
.source "C2RY"


# direct methods
.method public static ֫(Ljava/lang/Iterable;Ll/ᩳ᩻ۚ;)Ljava/lang/Iterable;
    .locals 1

    .line 125
    new-instance v0, Ll/ۘ᩻ۚ;

    invoke-direct {v0, p0, p1}, Ll/ۘ᩻ۚ;-><init>(Ljava/lang/Iterable;Ll/ᩳ᩻ۚ;)V

    return-object v0
.end method

.method public static ֫(Ll/ᩳ᩻ۚ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 73
    :cond_0
    invoke-interface {p0, p1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳ᩻ۚ;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 110
    new-instance v0, Ll/ܺ᩻ۚ;

    invoke-direct {v0, p0, p1}, Ll/ܺ᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ljava/util/List;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/Set;Ll/ᩳ᩻ۚ;)Ljava/util/Set;
    .locals 1

    .line 78
    new-instance v0, Ll/ۡ᩻ۚ;

    invoke-direct {v0, p0, p1}, Ll/ۡ᩻ۚ;-><init>(Ljava/util/Set;Ll/ᩳ᩻ۚ;)V

    return-object v0
.end method

.method public static ֫(Ll/᩵ܽۚ;Ll/ܽܳۚ;)Ll/ۖ۬֡;
    .locals 2

    .line 164
    invoke-interface {p0}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 199
    new-instance p1, Ll/ܶ᩵ۚ;

    .line 200
    invoke-interface {p0}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x0

    const-string v1, "Invalid method handle type: %d"

    .line 46
    invoke-direct {p1, p0, v1, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    throw p1

    .line 186
    :pswitch_0
    new-instance v0, Ll/֡᩻ۚ;

    invoke-direct {v0, p0, p1}, Ll/֡᩻ۚ;-><init>(Ll/᩵ܽۚ;Ll/ܽܳۚ;)V

    return-object v0

    .line 169
    :pswitch_1
    new-instance v0, Ll/᩵᩻ۚ;

    invoke-direct {v0, p0, p1}, Ll/᩵᩻ۚ;-><init>(Ll/᩵ܽۚ;Ll/ܽܳۚ;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
