.class public final Ll/ۛ᩻ۚ;
.super Ljava/lang/Object;
.source "X4UI"


# direct methods
.method public static ֫(Ljava/io/Writer;Ll/ۤܽۚ;)V
    .locals 4

    .line 89
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    if-eqz v0, :cond_9

    const/4 v1, 0x6

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v1, 0x4

    if-eq v0, v1, :cond_5

    const/16 v1, 0x10

    if-eq v0, v1, :cond_4

    const/16 v1, 0x11

    if-eq v0, v1, :cond_3

    const/16 v1, 0x5d

    const-string v2, ", "

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    .line 147
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unknown encoded value type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 91
    :pswitch_0
    check-cast p1, Ll/ۙܽۚ;

    invoke-interface {p1}, Ll/ۙܽۚ;->getValue()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    :pswitch_1
    const-string p1, "null"

    .line 144
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 115
    :pswitch_2
    check-cast p1, Ll/᩹ܽۚ;

    const-string v0, "Annotation["

    .line 152
    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 153
    invoke-interface {p1}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 155
    invoke-interface {p1}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object p1

    .line 156
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ֫ۚ;

    .line 157
    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 158
    invoke-interface {v0}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v3, 0x3d

    .line 159
    invoke-virtual {p0, v3}, Ljava/io/Writer;->write(I)V

    .line 160
    invoke-interface {v0}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۛ᩻ۚ;->֫(Ljava/io/Writer;Ll/ۤܽۚ;)V

    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    return-void

    .line 118
    :pswitch_3
    check-cast p1, Ll/᩶ܽۚ;

    const-string v0, "Array["

    .line 167
    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 170
    invoke-interface {p1}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤܽۚ;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_2

    .line 174
    :cond_1
    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 176
    :goto_2
    invoke-static {p0, v3}, Ll/ۛ᩻ۚ;->֫(Ljava/io/Writer;Ll/ۤܽۚ;)V

    goto :goto_1

    .line 179
    :cond_2
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    return-void

    .line 129
    :pswitch_4
    check-cast p1, Ll/ۛܽۚ;

    invoke-interface {p1}, Ll/ۛܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p1

    .line 194
    invoke-static {p0, p1, v3}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ᩴܽۚ;Z)V

    return-void

    .line 132
    :pswitch_5
    check-cast p1, Ll/֫ᩳۚ;

    invoke-interface {p1}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object p1

    .line 113
    invoke-static {p0, p1, v3}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ۚܽۚ;Z)V

    return-void

    .line 126
    :pswitch_6
    check-cast p1, Ll/ۨܽۚ;

    invoke-interface {p1}, Ll/ۨܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p1

    .line 194
    invoke-static {p0, p1, v3}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ᩴܽۚ;Z)V

    return-void

    .line 135
    :pswitch_7
    check-cast p1, Ll/ܳᩳۚ;

    invoke-interface {p1}, Ll/ܳᩳۚ;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    :pswitch_8
    const/16 v0, 0x22

    .line 121
    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(I)V

    .line 122
    check-cast p1, Ll/ܿᩳۚ;

    invoke-interface {p1}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;Ljava/lang/String;)V

    .line 123
    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(I)V

    return-void

    .line 141
    :pswitch_9
    check-cast p1, Ll/ۧᩳۚ;

    invoke-interface {p1}, Ll/ۧᩳۚ;->getValue()Ll/᩵ܽۚ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/᩵ܽۚ;)V

    return-void

    .line 138
    :pswitch_a
    check-cast p1, Ll/ܽᩳۚ;

    invoke-interface {p1}, Ll/ܽᩳۚ;->getValue()Ll/֡ܽۚ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/֡ܽۚ;)V

    return-void

    .line 112
    :cond_3
    check-cast p1, Ll/۫ܽۚ;

    invoke-interface {p1}, Ll/۫ܽۚ;->getValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 109
    :cond_4
    check-cast p1, Ll/᩺ܽۚ;

    invoke-interface {p1}, Ll/᩺ܽۚ;->getValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 103
    :cond_5
    check-cast p1, Ll/ܰܽۚ;

    invoke-interface {p1}, Ll/ܰܽۚ;->getValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 97
    :cond_6
    check-cast p1, Ll/۬ܽۚ;

    invoke-interface {p1}, Ll/۬ܽۚ;->getValue()C

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 100
    :cond_7
    check-cast p1, Ll/ᩳᩳۚ;

    invoke-interface {p1}, Ll/ᩳᩳۚ;->getValue()S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->toString(S)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 106
    :cond_8
    check-cast p1, Ll/۟ܽۚ;

    invoke-interface {p1}, Ll/۟ܽۚ;->getValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 94
    :cond_9
    check-cast p1, Ll/ۗܽۚ;

    invoke-interface {p1}, Ll/ۗܽۚ;->getValue()B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->toString(B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x15
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

.method public static ֫(Ll/ۤܽۚ;)Z
    .locals 6

    .line 65
    invoke-interface {p0}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_7

    const/4 v2, 0x6

    if-eq v0, v2, :cond_6

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v2, 0x3

    if-eq v0, v2, :cond_4

    const/4 v2, 0x4

    if-eq v0, v2, :cond_3

    const/16 v2, 0x10

    if-eq v0, v2, :cond_2

    const/16 v2, 0x11

    if-eq v0, v2, :cond_1

    const/16 v2, 0x1e

    if-eq v0, v2, :cond_8

    const/16 v2, 0x1f

    if-eq v0, v2, :cond_0

    goto :goto_1

    .line 67
    :cond_0
    check-cast p0, Ll/ۙܽۚ;

    invoke-interface {p0}, Ll/ۙܽۚ;->getValue()Z

    move-result p0

    xor-int/2addr p0, v1

    return p0

    .line 73
    :cond_1
    check-cast p0, Ll/۫ܽۚ;

    invoke-interface {p0}, Ll/۫ܽۚ;->getValue()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double p0, v2, v4

    if-nez p0, :cond_9

    goto :goto_0

    .line 75
    :cond_2
    check-cast p0, Ll/᩺ܽۚ;

    invoke-interface {p0}, Ll/᩺ܽۚ;->getValue()F

    move-result p0

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-nez p0, :cond_9

    goto :goto_0

    .line 77
    :cond_3
    check-cast p0, Ll/ܰܽۚ;

    invoke-interface {p0}, Ll/ܰܽۚ;->getValue()I

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    .line 71
    :cond_4
    check-cast p0, Ll/۬ܽۚ;

    invoke-interface {p0}, Ll/۬ܽۚ;->getValue()C

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    .line 83
    :cond_5
    check-cast p0, Ll/ᩳᩳۚ;

    invoke-interface {p0}, Ll/ᩳᩳۚ;->getValue()S

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    .line 79
    :cond_6
    check-cast p0, Ll/۟ܽۚ;

    invoke-interface {p0}, Ll/۟ܽۚ;->getValue()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-nez p0, :cond_9

    goto :goto_0

    .line 69
    :cond_7
    check-cast p0, Ll/ۗܽۚ;

    invoke-interface {p0}, Ll/ۗܽۚ;->getValue()B

    move-result p0

    if-nez p0, :cond_9

    :cond_8
    :goto_0
    return v1

    :cond_9
    :goto_1
    const/4 p0, 0x0

    return p0
.end method
