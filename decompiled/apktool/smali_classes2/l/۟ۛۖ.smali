.class public final Ll/۟ۛۖ;
.super Ljava/lang/Object;
.source "69GV"


# static fields
.field public static final ֫:Ll/֫᩻֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    const-class v0, Ll/۟ۛۖ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/۟ۛۖ;->֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/֨֫ۘ;Ll/ᩳۨۖ;)Ll/ܽۨۖ;
    .locals 7

    .line 54
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object v0

    .line 55
    sget-object v1, Ll/ܰۛۖ;->֫:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v1, v2

    packed-switch v2, :pswitch_data_0

    .line 94
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Unknown SMB2 Message Command type: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v1, Ll/۟ۛۖ;->֫:Ll/֫᩻֨;

    invoke-interface {v1, p0}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 95
    new-instance p0, Ll/ۧۧۘ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 38
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 95
    throw p0

    .line 91
    :pswitch_0
    new-instance v0, Ll/ۤۨۖ;

    .line 25
    invoke-direct {v0}, Ll/ܽۨۖ;-><init>()V

    goto/16 :goto_0

    .line 89
    :pswitch_1
    new-instance v0, Ll/۠ۨۖ;

    .line 30
    invoke-direct {v0}, Ll/ܽۨۖ;-><init>()V

    goto/16 :goto_0

    .line 87
    :pswitch_2
    new-instance v0, Ll/ۢ᩺ۖ;

    .line 25
    invoke-direct {v0}, Ll/ܽۨۖ;-><init>()V

    goto :goto_0

    .line 85
    :pswitch_3
    new-instance v0, Ll/ۧ᩺ۖ;

    .line 27
    invoke-direct {v0}, Ll/ܽۨۖ;-><init>()V

    goto :goto_0

    .line 83
    :pswitch_4
    new-instance v0, Ll/۫ۨۖ;

    invoke-direct {v0}, Ll/۫ۨۖ;-><init>()V

    goto :goto_0

    .line 81
    :pswitch_5
    new-instance v0, Ll/ᩴ᩺ۖ;

    invoke-direct {v0}, Ll/ᩴ᩺ۖ;-><init>()V

    goto :goto_0

    .line 79
    :pswitch_6
    new-instance v0, Ll/ۗۨۖ;

    .line 32
    invoke-direct {v0}, Ll/ܽۨۖ;-><init>()V

    goto :goto_0

    .line 77
    :pswitch_7
    new-instance v0, Ll/᩸ۨۖ;

    .line 41
    invoke-direct {v0}, Ll/ܽۨۖ;-><init>()V

    goto :goto_0

    .line 75
    :pswitch_8
    new-instance v0, Ll/ᩳ᩺ۖ;

    invoke-direct {v0}, Ll/ᩳ᩺ۖ;-><init>()V

    goto :goto_0

    .line 73
    :pswitch_9
    new-instance v0, Ll/ۙۨۖ;

    .line 30
    invoke-direct {v0}, Ll/ܽۨۖ;-><init>()V

    goto :goto_0

    .line 71
    :pswitch_a
    new-instance v0, Ll/֫᩺ۖ;

    invoke-direct {v0}, Ll/֫᩺ۖ;-><init>()V

    goto :goto_0

    .line 69
    :pswitch_b
    new-instance v0, Ll/ܶۨۖ;

    .line 29
    invoke-direct {v0}, Ll/ܽۨۖ;-><init>()V

    .line 31
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    .line 67
    :pswitch_c
    new-instance v0, Ll/᩶ۨۖ;

    invoke-direct {v0}, Ll/᩶ۨۖ;-><init>()V

    goto :goto_0

    .line 65
    :pswitch_d
    new-instance v0, Ll/ۛۨۖ;

    invoke-direct {v0}, Ll/ۛۨۖ;-><init>()V

    goto :goto_0

    .line 63
    :pswitch_e
    new-instance v0, Ll/ۖ᩺ۖ;

    .line 30
    invoke-direct {v0}, Ll/ܽۨۖ;-><init>()V

    goto :goto_0

    .line 61
    :pswitch_f
    new-instance v0, Ll/ܺ᩺ۖ;

    invoke-direct {v0}, Ll/ܺ᩺ۖ;-><init>()V

    goto :goto_0

    .line 59
    :pswitch_10
    new-instance v0, Ll/᩻᩺ۖ;

    invoke-direct {v0}, Ll/᩻᩺ۖ;-><init>()V

    goto :goto_0

    .line 57
    :pswitch_11
    new-instance v0, Ll/᩺ۨۖ;

    invoke-direct {v0}, Ll/᩺ۨۖ;-><init>()V

    .line 52
    :goto_0
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v2

    check-cast v2, Ll/᩻ۨۖ;

    invoke-virtual {v2}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v2

    .line 53
    invoke-static {v2, v3}, Ll/۟۫ۖ;->ܽ(J)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Ll/۟۫ۖ;->ۘۧ:Ll/۟۫ۖ;

    invoke-virtual {v4}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    goto/16 :goto_2

    .line 117
    :cond_0
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v2

    check-cast v2, Ll/᩻ۨۖ;

    invoke-virtual {v2}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object v2

    .line 118
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v3

    check-cast v3, Ll/᩻ۨۖ;

    invoke-virtual {v3}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v3

    .line 119
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_7

    const/4 v2, 0x7

    if-eq v1, v2, :cond_6

    const/16 v2, 0xa

    if-eq v1, v2, :cond_5

    const/16 v2, 0xe

    if-eq v1, v2, :cond_1

    const/16 p0, 0xf

    if-eq v1, p0, :cond_5

    goto :goto_3

    .line 128
    :cond_1
    check-cast p0, Ll/۬ۨۖ;

    .line 129
    invoke-virtual {p0}, Ll/۬ۨۖ;->᩷()J

    move-result-wide v1

    const-wide/32 v5, 0x11400c

    cmp-long p0, v1, v5

    if-eqz p0, :cond_4

    const-wide/32 v5, 0x11c017

    cmp-long p0, v1, v5

    if-eqz p0, :cond_4

    const-wide/32 v5, 0x60194

    cmp-long p0, v1, v5

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    const-wide/32 v5, 0x1440f2

    cmp-long p0, v1, v5

    if-eqz p0, :cond_3

    const-wide/32 v5, 0x1480f2

    cmp-long p0, v1, v5

    if-nez p0, :cond_8

    .line 134
    :cond_3
    sget-object p0, Ll/۟۫ۖ;->ۚ֫:Ll/۟۫ۖ;

    invoke-virtual {p0}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v1

    cmp-long p0, v3, v1

    if-nez p0, :cond_8

    goto :goto_2

    .line 131
    :cond_4
    :goto_1
    sget-object p0, Ll/۟۫ۖ;->۫:Ll/۟۫ۖ;

    invoke-virtual {p0}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v1

    cmp-long p0, v3, v1

    if-nez p0, :cond_8

    goto :goto_2

    .line 126
    :cond_5
    sget-object p0, Ll/۟۫ۖ;->۫:Ll/۟۫ۖ;

    invoke-virtual {p0}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v1

    cmp-long p0, v3, v1

    if-nez p0, :cond_8

    goto :goto_2

    .line 123
    :cond_6
    sget-object p0, Ll/۟۫ۖ;->ۨ֫:Ll/۟۫ۖ;

    invoke-virtual {p0}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v1

    cmp-long p0, v3, v1

    if-nez p0, :cond_8

    goto :goto_2

    .line 121
    :cond_7
    sget-object p0, Ll/۟۫ۖ;->ۙ֫:Ll/۟۫ۖ;

    invoke-virtual {p0}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v1

    cmp-long p0, v3, v1

    if-nez p0, :cond_8

    .line 103
    :goto_2
    invoke-virtual {v0, p1}, Ll/ܽۨۖ;->֫(Ll/ᩳۨۖ;)V

    return-object v0

    .line 105
    :cond_8
    :goto_3
    invoke-virtual {v0, p1}, Ll/ܽۨۖ;->ۧ(Ll/ᩳۨۖ;)V

    return-object v0

    nop

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
