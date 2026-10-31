.class public final Ll/ۡܺܺ;
.super Ll/ܶܺܺ;
.source "EBG3"


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Ll/ܶܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    return-void
.end method

.method public static ֫(Ll/۟ܺܺ;)Ll/ۡܺܺ;
    .locals 3

    .line 36
    new-instance v0, Ll/ۡܺܺ;

    sget-object v1, Ll/۫ܺܺ;->ܿ֫:Ll/۫ܺܺ;

    .line 191
    invoke-virtual {p0}, Ll/۟ܺܺ;->ܿ()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 212
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "not primitive: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 207
    :pswitch_0
    sget-object p0, Ll/۫ܺܺ;->ܳ֫:Ll/۫ܺܺ;

    goto :goto_0

    .line 205
    :pswitch_1
    sget-object p0, Ll/۫ܺܺ;->ۧ֫:Ll/۫ܺܺ;

    goto :goto_0

    .line 203
    :pswitch_2
    sget-object p0, Ll/۫ܺܺ;->۟:Ll/۫ܺܺ;

    goto :goto_0

    .line 201
    :pswitch_3
    sget-object p0, Ll/۫ܺܺ;->᩺:Ll/۫ܺܺ;

    goto :goto_0

    .line 199
    :pswitch_4
    sget-object p0, Ll/۫ܺܺ;->ۛ:Ll/۫ܺܺ;

    goto :goto_0

    .line 197
    :pswitch_5
    sget-object p0, Ll/۫ܺܺ;->۫:Ll/۫ܺܺ;

    goto :goto_0

    .line 195
    :pswitch_6
    sget-object p0, Ll/۫ܺܺ;->ۗ:Ll/۫ܺܺ;

    goto :goto_0

    .line 193
    :pswitch_7
    sget-object p0, Ll/۫ܺܺ;->᩶:Ll/۫ܺܺ;

    goto :goto_0

    .line 209
    :pswitch_8
    sget-object p0, Ll/۫ܺܺ;->᩷֫:Ll/۫ܺܺ;

    .line 36
    :goto_0
    sget-object v1, Ll/᩶ܺܺ;->᩶:Ll/᩶ܺܺ;

    .line 47
    invoke-direct {v0, p0, v1}, Ll/ܶܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 65
    invoke-virtual {p0}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ܺܺ;->ᩴ()Ll/۟ܺܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 1

    .line 73
    invoke-super {p0, p1}, Ll/ܶܺܺ;->ۧ(Ll/ܰۡܺ;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 79
    :cond_0
    check-cast p1, Ll/ۡܺܺ;

    .line 80
    invoke-virtual {p0}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ܺܺ;->ܺ()Ll/۬ܺܺ;

    move-result-object v0

    .line 81
    invoke-virtual {p1}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩶ܺܺ;->ܺ()Ll/۬ܺܺ;

    move-result-object p1

    .line 82
    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "field"

    return-object v0
.end method
