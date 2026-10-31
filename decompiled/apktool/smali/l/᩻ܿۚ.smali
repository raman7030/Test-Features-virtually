.class public final Ll/᩻ܿۚ;
.super Ljava/lang/Object;
.source "15YU"


# static fields
.field public static final ֫:Ll/᩶᩵ۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 63
    new-instance v0, Ll/ܳܿۚ;

    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 63
    sput-object v0, Ll/᩻ܿۚ;->֫:Ll/᩶᩵ۚ;

    return-void
.end method

.method public static ֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;
    .locals 1

    .line 160
    sget-object v0, Ll/᩻ܿۚ;->֫:Ll/᩶᩵ۚ;

    invoke-virtual {v0, p0}, Ll/᩶᩵ۚ;->֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ܿܿۚ;
    .locals 3

    const/4 v0, 0x0

    .line 124
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x46

    if-eq v1, v2, :cond_5

    const/16 v2, 0x4c

    if-eq v1, v2, :cond_4

    const/16 v2, 0x53

    if-eq v1, v2, :cond_3

    const/16 v2, 0x49

    if-eq v1, v2, :cond_2

    const/16 v2, 0x4a

    if-eq v1, v2, :cond_1

    const/16 v2, 0x5a

    if-eq v1, v2, :cond_0

    const/16 v2, 0x5b

    if-eq v1, v2, :cond_4

    packed-switch v1, :pswitch_data_0

    .line 145
    new-instance v1, Ll/ܶ᩵ۚ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v0

    const/4 p0, 0x0

    const-string v0, "Unrecognized type: %s"

    .line 46
    invoke-direct {v1, p0, v0, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    throw v1

    .line 140
    :pswitch_0
    new-instance p0, Ll/ᩳܿۚ;

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Ll/ᩳܿۚ;-><init>(D)V

    return-object p0

    .line 132
    :pswitch_1
    new-instance p0, Ll/ܽܿۚ;

    invoke-direct {p0, v0}, Ll/ܽܿۚ;-><init>(C)V

    return-object p0

    .line 128
    :pswitch_2
    new-instance p0, Ll/ۧܿۚ;

    invoke-direct {p0, v0}, Ll/ۧܿۚ;-><init>(B)V

    return-object p0

    .line 126
    :cond_0
    sget-object p0, Ll/֫ܿۚ;->᩹:Ll/֫ܿۚ;

    return-object p0

    .line 136
    :cond_1
    new-instance p0, Ll/ܺܿۚ;

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Ll/ܺܿۚ;-><init>(J)V

    return-object p0

    .line 134
    :cond_2
    new-instance p0, Ll/ۡܿۚ;

    invoke-direct {p0, v0}, Ll/ۡܿۚ;-><init>(I)V

    return-object p0

    .line 130
    :cond_3
    new-instance p0, Ll/֡ܿۚ;

    invoke-direct {p0, v0}, Ll/֡ܿۚ;-><init>(S)V

    return-object p0

    .line 143
    :cond_4
    sget-object p0, Ll/᩵ܿۚ;->᩸:Ll/᩵ܿۚ;

    return-object p0

    .line 138
    :cond_5
    new-instance p0, Ll/ۢܿۚ;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll/ۢܿۚ;-><init>(F)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۤܽۚ;)Ll/ܿܿۚ;
    .locals 3

    .line 79
    invoke-interface {p0}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    if-eqz v0, :cond_16

    const/4 v1, 0x6

    if-eq v0, v1, :cond_14

    const/4 v1, 0x2

    if-eq v0, v1, :cond_12

    const/4 v1, 0x3

    if-eq v0, v1, :cond_10

    const/4 v1, 0x4

    if-eq v0, v1, :cond_e

    const/16 v1, 0x10

    if-eq v0, v1, :cond_c

    const/16 v1, 0x11

    if-eq v0, v1, :cond_a

    packed-switch v0, :pswitch_data_0

    const/4 p0, 0x0

    .line 117
    invoke-static {p0}, Ll/ۘܶܺ;->֫(Z)V

    const/4 p0, 0x0

    return-object p0

    .line 111
    :pswitch_0
    check-cast p0, Ll/ۙܽۚ;

    .line 52
    invoke-interface {p0}, Ll/ۙܽۚ;->getValue()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 48
    sget-object p0, Ll/֫ܿۚ;->᩶:Ll/֫ܿۚ;

    return-object p0

    :cond_0
    sget-object p0, Ll/֫ܿۚ;->᩹:Ll/֫ܿۚ;

    return-object p0

    .line 109
    :pswitch_1
    sget-object p0, Ll/᩵ܿۚ;->᩸:Ll/᩵ܿۚ;

    return-object p0

    .line 107
    :pswitch_2
    check-cast p0, Ll/᩹ܽۚ;

    .line 66
    instance-of v0, p0, Ll/ܰᩳۚ;

    if-eqz v0, :cond_1

    .line 67
    check-cast p0, Ll/ܰᩳۚ;

    return-object p0

    .line 69
    :cond_1
    new-instance v0, Ll/ܰᩳۚ;

    .line 70
    invoke-interface {p0}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-interface {p0}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ܰᩳۚ;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    return-object v0

    .line 105
    :pswitch_3
    check-cast p0, Ll/᩶ܽۚ;

    .line 57
    instance-of v0, p0, Ll/۟ᩳۚ;

    if-eqz v0, :cond_2

    .line 58
    check-cast p0, Ll/۟ᩳۚ;

    return-object p0

    .line 60
    :cond_2
    new-instance v0, Ll/۟ᩳۚ;

    invoke-interface {p0}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/۟ᩳۚ;-><init>(Ljava/util/List;)V

    return-object v0

    .line 103
    :pswitch_4
    check-cast p0, Ll/ۛܽۚ;

    .line 49
    instance-of v0, p0, Ll/ۜܿۚ;

    if-eqz v0, :cond_3

    .line 50
    check-cast p0, Ll/ۜܿۚ;

    return-object p0

    .line 52
    :cond_3
    new-instance v0, Ll/ۜܿۚ;

    invoke-interface {p0}, Ll/ۛܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ᩳۚ;->ۧ(Ll/ᩴܽۚ;)Ll/᩶ᩳۚ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۜܿۚ;-><init>(Ll/᩶ᩳۚ;)V

    return-object v0

    .line 101
    :pswitch_5
    check-cast p0, Ll/֫ᩳۚ;

    .line 49
    instance-of v0, p0, Ll/ۖܿۚ;

    if-eqz v0, :cond_4

    .line 50
    check-cast p0, Ll/ۖܿۚ;

    return-object p0

    .line 52
    :cond_4
    new-instance v0, Ll/ۖܿۚ;

    invoke-interface {p0}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object p0

    invoke-static {p0}, Ll/۬ᩳۚ;->ۧ(Ll/ۚܽۚ;)Ll/۬ᩳۚ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۖܿۚ;-><init>(Ll/۬ᩳۚ;)V

    return-object v0

    .line 99
    :pswitch_6
    check-cast p0, Ll/ۨܽۚ;

    .line 49
    instance-of v0, p0, Ll/᩷ܿۚ;

    if-eqz v0, :cond_5

    .line 50
    check-cast p0, Ll/᩷ܿۚ;

    return-object p0

    .line 52
    :cond_5
    new-instance v0, Ll/᩷ܿۚ;

    invoke-interface {p0}, Ll/ۨܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ᩳۚ;->ۧ(Ll/ᩴܽۚ;)Ll/᩶ᩳۚ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/᩷ܿۚ;-><init>(Ll/᩶ᩳۚ;)V

    return-object v0

    .line 97
    :pswitch_7
    check-cast p0, Ll/ܳᩳۚ;

    .line 48
    instance-of v0, p0, Ll/֨ܿۚ;

    if-eqz v0, :cond_6

    .line 49
    check-cast p0, Ll/֨ܿۚ;

    return-object p0

    .line 51
    :cond_6
    new-instance v0, Ll/֨ܿۚ;

    invoke-interface {p0}, Ll/ܳᩳۚ;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/֨ܿۚ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 95
    :pswitch_8
    check-cast p0, Ll/ܿᩳۚ;

    .line 48
    instance-of v0, p0, Ll/ۚܿۚ;

    if-eqz v0, :cond_7

    .line 49
    check-cast p0, Ll/ۚܿۚ;

    return-object p0

    .line 51
    :cond_7
    new-instance v0, Ll/ۚܿۚ;

    invoke-interface {p0}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۚܿۚ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 113
    :pswitch_9
    check-cast p0, Ll/ۧᩳۚ;

    .line 50
    instance-of v0, p0, Ll/ۘܿۚ;

    if-eqz v0, :cond_8

    .line 51
    check-cast p0, Ll/ۘܿۚ;

    return-object p0

    .line 53
    :cond_8
    new-instance v0, Ll/ۘܿۚ;

    .line 54
    invoke-interface {p0}, Ll/ۧᩳۚ;->getValue()Ll/᩵ܽۚ;

    move-result-object p0

    invoke-static {p0}, Ll/ۙᩳۚ;->ۧ(Ll/᩵ܽۚ;)Ll/ۙᩳۚ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۘܿۚ;-><init>(Ll/ۙᩳۚ;)V

    return-object v0

    .line 115
    :pswitch_a
    check-cast p0, Ll/ܽᩳۚ;

    .line 50
    instance-of v0, p0, Ll/ᩴܿۚ;

    if-eqz v0, :cond_9

    .line 51
    check-cast p0, Ll/ᩴܿۚ;

    return-object p0

    .line 53
    :cond_9
    new-instance v0, Ll/ᩴܿۚ;

    .line 54
    invoke-interface {p0}, Ll/ܽᩳۚ;->getValue()Ll/֡ܽۚ;

    move-result-object p0

    invoke-static {p0}, Ll/ۗᩳۚ;->ۧ(Ll/֡ܽۚ;)Ll/ۗᩳۚ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ᩴܿۚ;-><init>(Ll/ۗᩳۚ;)V

    return-object v0

    .line 93
    :cond_a
    check-cast p0, Ll/۫ܽۚ;

    .line 45
    instance-of v0, p0, Ll/ᩳܿۚ;

    if-eqz v0, :cond_b

    .line 46
    check-cast p0, Ll/ᩳܿۚ;

    return-object p0

    .line 48
    :cond_b
    new-instance v0, Ll/ᩳܿۚ;

    invoke-interface {p0}, Ll/۫ܽۚ;->getValue()D

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ll/ᩳܿۚ;-><init>(D)V

    return-object v0

    .line 91
    :cond_c
    check-cast p0, Ll/᩺ܽۚ;

    .line 45
    instance-of v0, p0, Ll/ۢܿۚ;

    if-eqz v0, :cond_d

    .line 46
    check-cast p0, Ll/ۢܿۚ;

    return-object p0

    .line 48
    :cond_d
    new-instance v0, Ll/ۢܿۚ;

    invoke-interface {p0}, Ll/᩺ܽۚ;->getValue()F

    move-result p0

    invoke-direct {v0, p0}, Ll/ۢܿۚ;-><init>(F)V

    return-object v0

    .line 87
    :cond_e
    check-cast p0, Ll/ܰܽۚ;

    .line 45
    instance-of v0, p0, Ll/ۡܿۚ;

    if-eqz v0, :cond_f

    .line 46
    check-cast p0, Ll/ۡܿۚ;

    return-object p0

    .line 48
    :cond_f
    new-instance v0, Ll/ۡܿۚ;

    invoke-interface {p0}, Ll/ܰܽۚ;->getValue()I

    move-result p0

    invoke-direct {v0, p0}, Ll/ۡܿۚ;-><init>(I)V

    return-object v0

    .line 85
    :cond_10
    check-cast p0, Ll/۬ܽۚ;

    .line 45
    instance-of v0, p0, Ll/ܽܿۚ;

    if-eqz v0, :cond_11

    .line 46
    check-cast p0, Ll/ܽܿۚ;

    return-object p0

    .line 48
    :cond_11
    new-instance v0, Ll/ܽܿۚ;

    invoke-interface {p0}, Ll/۬ܽۚ;->getValue()C

    move-result p0

    invoke-direct {v0, p0}, Ll/ܽܿۚ;-><init>(C)V

    return-object v0

    .line 83
    :cond_12
    check-cast p0, Ll/ᩳᩳۚ;

    .line 45
    instance-of v0, p0, Ll/֡ܿۚ;

    if-eqz v0, :cond_13

    .line 46
    check-cast p0, Ll/֡ܿۚ;

    return-object p0

    .line 48
    :cond_13
    new-instance v0, Ll/֡ܿۚ;

    invoke-interface {p0}, Ll/ᩳᩳۚ;->getValue()S

    move-result p0

    invoke-direct {v0, p0}, Ll/֡ܿۚ;-><init>(S)V

    return-object v0

    .line 89
    :cond_14
    check-cast p0, Ll/۟ܽۚ;

    .line 45
    instance-of v0, p0, Ll/ܺܿۚ;

    if-eqz v0, :cond_15

    .line 46
    check-cast p0, Ll/ܺܿۚ;

    return-object p0

    .line 48
    :cond_15
    new-instance v0, Ll/ܺܿۚ;

    invoke-interface {p0}, Ll/۟ܽۚ;->getValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ll/ܺܿۚ;-><init>(J)V

    return-object v0

    .line 81
    :cond_16
    check-cast p0, Ll/ۗܽۚ;

    .line 45
    instance-of v0, p0, Ll/ۧܿۚ;

    if-eqz v0, :cond_17

    .line 46
    check-cast p0, Ll/ۧܿۚ;

    return-object p0

    .line 48
    :cond_17
    new-instance v0, Ll/ۧܿۚ;

    invoke-interface {p0}, Ll/ۗܽۚ;->getValue()B

    move-result p0

    invoke-direct {v0, p0}, Ll/ۧܿۚ;-><init>(B)V

    return-object v0

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
