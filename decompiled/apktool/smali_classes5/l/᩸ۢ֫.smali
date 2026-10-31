.class public final Ll/᩸ۢ֫;
.super Ljava/lang/Object;
.source "Q9M2"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final ᩸:Ll/۠ۢ֫;

.field public final ᩹:Ll/ܿۡ֫;


# direct methods
.method public constructor <init>(Ll/۠ۢ֫;Ll/ܿۡ֫;)V
    .locals 1

    const-string v0, "defaultLifecycleObserver"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/᩸ۢ֫;->᩸:Ll/۠ۢ֫;

    .line 20
    iput-object p2, p0, Ll/᩸ۢ֫;->᩹:Ll/ܿۡ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 2

    .line 23
    sget-object v0, Ll/ܶۢ֫;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    iget-object v1, p0, Ll/᩸ۢ֫;->᩸:Ll/۠ۢ֫;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 31
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ON_ANY must not been send by anybody"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 29
    :pswitch_1
    invoke-interface {v1, p1}, Ll/۠ۢ֫;->ܿ(Ll/᩻ۡ֫;)V

    goto :goto_0

    .line 28
    :pswitch_2
    invoke-interface {v1, p1}, Ll/۠ۢ֫;->ᩳ(Ll/᩻ۡ֫;)V

    goto :goto_0

    .line 27
    :pswitch_3
    invoke-interface {v1, p1}, Ll/۠ۢ֫;->ܽ(Ll/᩻ۡ֫;)V

    goto :goto_0

    .line 26
    :pswitch_4
    invoke-interface {v1, p1}, Ll/۠ۢ֫;->ۧ(Ll/᩻ۡ֫;)V

    goto :goto_0

    .line 25
    :pswitch_5
    invoke-interface {v1, p1}, Ll/۠ۢ֫;->ܳ(Ll/᩻ۡ֫;)V

    goto :goto_0

    .line 24
    :pswitch_6
    invoke-interface {v1, p1}, Ll/۠ۢ֫;->֫(Ll/᩻ۡ֫;)V

    .line 33
    :goto_0
    iget-object v0, p0, Ll/᩸ۢ֫;->᩹:Ll/ܿۡ֫;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Ll/ܿۡ֫;->֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
