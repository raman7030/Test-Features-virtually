.class public final Ll/᩹᩷ۧ;
.super Ljava/lang/Object;
.source "C8LI"


# direct methods
.method public static ֫(I)I
    .locals 1

    const/16 v0, 0x14

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1e

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    const p0, -0x7fffffff

    return p0

    :pswitch_0
    const/16 p0, 0x1b58

    return p0

    :pswitch_1
    const/16 p0, 0x3e80

    return p0

    :pswitch_2
    const p0, 0x186a0

    return p0

    :pswitch_3
    const p0, 0x9c40

    return p0

    :pswitch_4
    const p0, 0x2ee00

    return p0

    :pswitch_5
    const p0, 0x13880

    return p0

    :pswitch_6
    const p0, 0xbb800

    return p0

    :pswitch_7
    const p0, 0x52080

    return p0

    :pswitch_8
    const p0, 0x3e800

    return p0

    :pswitch_9
    const/16 p0, 0x1f40

    return p0

    :pswitch_a
    const p0, 0x2ebae4

    return p0

    :cond_0
    :pswitch_b
    const p0, 0x225510

    return p0

    :cond_1
    const p0, 0xf906

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_b
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;Z)V
    .locals 0
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 39
    invoke-static {p0, p1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0
.end method
