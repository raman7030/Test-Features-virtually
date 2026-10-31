.class public abstract Ll/ۨ۠֡;
.super Ljava/lang/Object;
.source "26A8"


# direct methods
.method public static ֫(Ll/ۗ᩵ۚ;Ll/ۤܽۚ;)V
    .locals 10

    .line 72
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    const-string v1, "0x"

    const-string v2, "-0x"

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v0, :cond_d

    const/4 v6, 0x6

    if-eq v0, v6, :cond_b

    if-eq v0, v4, :cond_9

    if-eq v0, v3, :cond_8

    const/4 v1, 0x4

    if-eq v0, v1, :cond_7

    const/16 v2, 0x10

    if-eq v0, v2, :cond_6

    const/16 v2, 0x11

    if-eq v0, v2, :cond_5

    const/4 v2, 0x0

    const/16 v3, 0xa

    packed-switch v0, :pswitch_data_0

    .line 148
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown encoded value type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 80
    :pswitch_0
    check-cast p1, Ll/ۙܽۚ;

    invoke-interface {p1}, Ll/ۙܽۚ;->getValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "true"

    .line 116
    invoke-virtual {p0, p1, v5, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x5

    const-string v0, "false"

    .line 116
    invoke-virtual {p0, v0, v5, p1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    return-void

    .line 126
    :pswitch_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "null"

    .line 116
    invoke-virtual {p0, p1, v5, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    return-void

    .line 74
    :pswitch_2
    check-cast p1, Ll/᩹ܽۚ;

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xf

    const-string v1, ".subannotation "

    .line 116
    invoke-virtual {p0, v1, v5, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 47
    invoke-interface {p1}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0, v3}, Ll/ۗ᩵ۚ;->write(I)V

    .line 50
    invoke-interface {p1}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۛ۠֡;->֫(Ll/ۗ᩵ۚ;Ljava/util/Set;)V

    const-string p1, ".end subannotation"

    const/16 v0, 0x12

    .line 116
    invoke-virtual {p0, p1, v5, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    return-void

    .line 77
    :pswitch_3
    check-cast p1, Ll/᩶ܽۚ;

    const/16 v0, 0x7b

    .line 45
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    .line 46
    invoke-interface {p1}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object p1

    .line 47
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_1

    const/16 p1, 0x7d

    .line 48
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 52
    :cond_1
    invoke-virtual {p0, v3}, Ll/ۗ᩵ۚ;->write(I)V

    .line 53
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->ܽ()V

    .line 55
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤܽۚ;

    if-nez v0, :cond_2

    const-string v0, ",\n"

    .line 116
    invoke-virtual {p0, v0, v5, v4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 61
    :cond_2
    invoke-static {p0, v1}, Ll/ۨ۠֡;->֫(Ll/ۗ᩵ۚ;Ll/ۤܽۚ;)V

    const/4 v0, 0x0

    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->֫()V

    const-string p1, "\n}"

    .line 116
    invoke-virtual {p0, p1, v5, v4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    return-void

    .line 92
    :pswitch_4
    check-cast p1, Ll/ۛܽۚ;

    .line 94
    invoke-interface {p1}, Ll/ۛܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, ".enum "

    .line 116
    invoke-virtual {p0, v1, v5, v6}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 98
    invoke-interface {p1}, Ll/ۛܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p1

    invoke-static {p0, p1, v0}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ᩴܽۚ;Z)V

    return-void

    .line 118
    :pswitch_5
    check-cast p1, Ll/֫ᩳۚ;

    .line 120
    invoke-interface {p1}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 123
    invoke-interface {p1}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object p1

    invoke-static {p0, p1, v0}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ۚܽۚ;Z)V

    return-void

    .line 101
    :pswitch_6
    check-cast p1, Ll/ۨܽۚ;

    .line 103
    invoke-interface {p1}, Ll/ۨܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 106
    invoke-interface {p1}, Ll/ۨܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p1

    invoke-static {p0, p1, v0}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ᩴܽۚ;Z)V

    return-void

    .line 139
    :pswitch_7
    check-cast p1, Ll/ܳᩳۚ;

    invoke-interface {p1}, Ll/ܳᩳۚ;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    return-void

    .line 132
    :pswitch_8
    instance-of v0, p1, Ll/֫֫ۚ;

    if-eqz v0, :cond_4

    .line 133
    check-cast p1, Ll/֫֫ۚ;

    invoke-virtual {p1, p0}, Ll/֫֫ۚ;->֫(Ll/ۗ᩵ۚ;)V

    return-void

    .line 135
    :cond_4
    check-cast p1, Ll/ܿᩳۚ;

    invoke-interface {p1}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x22

    .line 45
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    .line 46
    invoke-static {p0, p1}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 145
    :pswitch_9
    check-cast p1, Ll/ۧᩳۚ;

    invoke-interface {p1}, Ll/ۧᩳۚ;->getValue()Ll/᩵ܽۚ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/᩵ܽۚ;)V

    return-void

    .line 142
    :pswitch_a
    check-cast p1, Ll/ܽᩳۚ;

    invoke-interface {p1}, Ll/ܽᩳۚ;->getValue()Ll/֡ܽۚ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/֡ܽۚ;)V

    return-void

    .line 89
    :cond_5
    check-cast p1, Ll/۫ܽۚ;

    invoke-interface {p1}, Ll/۫ܽۚ;->getValue()D

    move-result-wide v0

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    return-void

    .line 109
    :cond_6
    check-cast p1, Ll/᩺ܽۚ;

    invoke-interface {p1}, Ll/᩺ܽۚ;->getValue()F

    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    const/16 p1, 0x66

    .line 38
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 112
    :cond_7
    check-cast p1, Ll/ܰܽۚ;

    invoke-interface {p1}, Ll/ܰܽۚ;->getValue()I

    move-result p1

    invoke-static {p0, p1}, Ll/᩶ܶ֡;->֫(Ll/ۗ᩵ۚ;I)V

    return-void

    .line 86
    :cond_8
    check-cast p1, Ll/۬ܽۚ;

    invoke-interface {p1}, Ll/۬ܽۚ;->getValue()C

    move-result p1

    const/16 v0, 0x27

    .line 38
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    .line 39
    invoke-static {p0, p1}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;C)V

    .line 40
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 129
    :cond_9
    check-cast p1, Ll/ᩳᩳۚ;

    invoke-interface {p1}, Ll/ᩳᩳۚ;->getValue()S

    move-result p1

    const/16 v0, 0x73

    if-gez p1, :cond_a

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    invoke-virtual {p0, v2, v5, v3}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    neg-int p1, p1

    int-to-long v1, p1

    .line 39
    invoke-virtual {p0, v1, v2}, Ll/ۗ᩵ۚ;->ۧ(J)V

    .line 40
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 42
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    invoke-virtual {p0, v1, v5, v4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    int-to-long v1, p1

    .line 43
    invoke-virtual {p0, v1, v2}, Ll/ۗ᩵ۚ;->ۧ(J)V

    .line 44
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 115
    :cond_b
    check-cast p1, Ll/۟ܽۚ;

    invoke-interface {p1}, Ll/۟ܽۚ;->getValue()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    const/16 p1, 0x4c

    cmp-long v0, v6, v8

    if-gez v0, :cond_c

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    invoke-virtual {p0, v2, v5, v3}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    neg-long v0, v6

    .line 39
    invoke-virtual {p0, v0, v1}, Ll/ۗ᩵ۚ;->ۧ(J)V

    .line 40
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 42
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    invoke-virtual {p0, v1, v5, v4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 43
    invoke-virtual {p0, v6, v7}, Ll/ۗ᩵ۚ;->ۧ(J)V

    .line 44
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 83
    :cond_d
    check-cast p1, Ll/ۗܽۚ;

    invoke-interface {p1}, Ll/ۗܽۚ;->getValue()B

    move-result p1

    const/16 v0, 0x74

    if-gez p1, :cond_e

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    invoke-virtual {p0, v2, v5, v3}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    neg-int p1, p1

    int-to-long v1, p1

    .line 39
    invoke-virtual {p0, v1, v2}, Ll/ۗ᩵ۚ;->ۧ(J)V

    .line 40
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 42
    :cond_e
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    invoke-virtual {p0, v1, v5, v4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    int-to-long v1, p1

    .line 43
    invoke-virtual {p0, v1, v2}, Ll/ۗ᩵ۚ;->ۧ(J)V

    .line 44
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    nop

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
