.class public final synthetic Ll/ۖ۫ۚ;
.super Ljava/lang/Object;
.source "V7E8"


# direct methods
.method public static ֫(Ll/ᩴ۫ۚ;Ll/ۖۤۚ;)V
    .locals 2

    .line 30
    sget-object v0, Ll/ۘ۫ۚ;->֫:[I

    iget-object v1, p1, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    return-void

    .line 46
    :pswitch_0
    check-cast p1, Ll/ᩴۛۚ;

    invoke-interface {p0, p1}, Ll/ᩴ۫ۚ;->֫(Ll/ᩴۛۚ;)V

    return-void

    .line 43
    :pswitch_1
    check-cast p1, Ll/ܶۛۚ;

    invoke-interface {p0, p1}, Ll/ᩴ۫ۚ;->֫(Ll/ܶۛۚ;)V

    return-void

    .line 37
    :pswitch_2
    check-cast p1, Ll/ܿۛۚ;

    invoke-interface {p0, p1}, Ll/ᩴ۫ۚ;->֫(Ll/ܿۛۚ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
