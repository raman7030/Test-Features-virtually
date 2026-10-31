.class public final Ll/ᩳܶۖ;
.super Ll/ܶ᩶ۚ;
.source "55UE"


# direct methods
.method public constructor <init>(Ll/ܶ᩶ۚ;)V
    .locals 1

    const/high16 v0, 0x90000

    .line 33
    invoke-direct {p0, v0, p1}, Ll/ܶ᩶ۚ;-><init>(ILl/ܶ᩶ۚ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 5

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 44
    invoke-virtual {p0, p1}, Ll/ܶ᩶ۚ;->֫(I)V

    return-void

    .line 45
    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 46
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-lt v0, v1, :cond_1

    const/4 v1, 0x5

    if-gt v0, v1, :cond_1

    add-int/lit8 v0, v0, 0x3

    .line 48
    invoke-virtual {p0, v0}, Ll/ܶ᩶ۚ;->֫(I)V

    return-void

    :cond_1
    const/16 v1, 0x7f

    if-gt v0, v1, :cond_2

    const/16 v1, -0x80

    if-lt v0, v1, :cond_2

    const/16 p1, 0x10

    .line 50
    invoke-virtual {p0, p1, v0}, Ll/ܶ᩶ۚ;->ۧ(II)V

    return-void

    :cond_2
    const/16 v1, 0x7fff

    if-gt v0, v1, :cond_3

    const/16 v1, -0x8000

    if-lt v0, v1, :cond_3

    const/16 p1, 0x11

    .line 52
    invoke-virtual {p0, p1, v0}, Ll/ܶ᩶ۚ;->ۧ(II)V

    return-void

    .line 54
    :cond_3
    invoke-super {p0, p1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    return-void

    .line 56
    :cond_4
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_7

    .line 57
    move-object v0, p1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_6

    const-wide/16 v2, 0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_5

    goto :goto_0

    .line 61
    :cond_5
    invoke-super {p0, p1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    return-void

    :cond_6
    :goto_0
    long-to-int p1, v0

    add-int/lit8 p1, p1, 0x9

    .line 59
    invoke-virtual {p0, p1}, Ll/ܶ᩶ۚ;->֫(I)V

    return-void

    .line 63
    :cond_7
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_b

    .line 64
    move-object v0, p1

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-nez v1, :cond_8

    const/16 p1, 0xb

    .line 66
    invoke-virtual {p0, p1}, Ll/ܶ᩶ۚ;->֫(I)V

    return-void

    :cond_8
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v0, v1

    if-nez v1, :cond_9

    const/16 p1, 0xc

    .line 68
    invoke-virtual {p0, p1}, Ll/ܶ᩶ۚ;->֫(I)V

    return-void

    :cond_9
    const/high16 v1, 0x40000000    # 2.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_a

    const/16 p1, 0xd

    .line 70
    invoke-virtual {p0, p1}, Ll/ܶ᩶ۚ;->֫(I)V

    return-void

    .line 72
    :cond_a
    invoke-super {p0, p1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    return-void

    .line 74
    :cond_b
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_e

    .line 75
    move-object v0, p1

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-nez v4, :cond_c

    const/16 p1, 0xe

    .line 77
    invoke-virtual {p0, p1}, Ll/ܶ᩶ۚ;->֫(I)V

    return-void

    :cond_c
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v0, v2

    if-nez v4, :cond_d

    const/16 p1, 0xf

    .line 79
    invoke-virtual {p0, p1}, Ll/ܶ᩶ۚ;->֫(I)V

    return-void

    .line 81
    :cond_d
    invoke-super {p0, p1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    return-void

    .line 83
    :cond_e
    instance-of v0, p1, Ll/ۨ᩶ۚ;

    if-eqz v0, :cond_f

    .line 84
    move-object v0, p1

    check-cast v0, Ll/ۨ᩶ۚ;

    .line 85
    invoke-virtual {v0}, Ll/ۨ᩶ۚ;->ܿ()I

    move-result v0

    const-string v1, "Ljava/lang/Class;"

    const-string v2, "TYPE"

    const/16 v3, 0xb2

    packed-switch v0, :pswitch_data_0

    .line 111
    invoke-super {p0, p1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    const-string p1, "java/lang/Double"

    .line 96
    invoke-virtual {p0, p1, v3, v2, v1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_1
    const-string p1, "java/lang/Long"

    .line 105
    invoke-virtual {p0, p1, v3, v2, v1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_2
    const-string p1, "java/lang/Float"

    .line 99
    invoke-virtual {p0, p1, v3, v2, v1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_3
    const-string p1, "java/lang/Integer"

    .line 102
    invoke-virtual {p0, p1, v3, v2, v1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_4
    const-string p1, "java/lang/Short"

    .line 108
    invoke-virtual {p0, p1, v3, v2, v1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_5
    const-string p1, "java/lang/Byte"

    .line 90
    invoke-virtual {p0, p1, v3, v2, v1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_6
    const-string p1, "java/lang/Character"

    .line 93
    invoke-virtual {p0, p1, v3, v2, v1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_7
    const-string p1, "java/lang/Boolean"

    .line 87
    invoke-virtual {p0, p1, v3, v2, v1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 114
    :cond_f
    invoke-super {p0, p1}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
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
