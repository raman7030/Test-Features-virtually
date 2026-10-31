.class public final synthetic Ll/۟ۤᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۟ۤᩳ;->᩸:I

    iput-object p2, p0, Ll/۟ۤᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/۟ۤᩳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/۟ۤᩳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/֨ۚ᩷;

    .line 12
    invoke-static {v1}, Ll/֨ۚ᩷;->ۧ(Ll/֨ۚ᩷;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/᩻۬ۜ;

    .line 17
    sget v0, Ll/ۤۤۜ;->᩻ܿ:I

    if-eqz v1, :cond_0

    .line 5476
    invoke-virtual {v1}, Ll/᩻۬ۜ;->close()V

    :cond_0
    return-void

    .line 0
    :pswitch_1
    check-cast v1, Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    return-void

    :pswitch_2
    check-cast v1, Ll/ܶ۬ܿ;

    invoke-static {v1}, Ll/ܶ۬ܿ;->ۧ(Ll/ܶ۬ܿ;)V

    return-void

    :pswitch_3
    check-cast v1, Ll/֡۟ᩳ;

    invoke-virtual {v1}, Ll/֡۟ᩳ;->close()V

    return-void

    :pswitch_4
    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v1}, Ll/ۙ۬ᩳ;->֫(Ljava/lang/Runnable;)V

    return-void

    :pswitch_5
    check-cast v1, Ll/ۢᩴ;

    invoke-virtual {v1}, Ll/ۢᩴ;->collapseActionView()V

    return-void

    :pswitch_6
    check-cast v1, Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ܽ(Ll/۫ۨᩳ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
