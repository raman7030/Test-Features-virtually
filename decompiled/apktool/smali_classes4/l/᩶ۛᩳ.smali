.class public final synthetic Ll/᩶ۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/᩶ۛᩳ;->᩸:I

    iput-object p1, p0, Ll/᩶ۛᩳ;->᩹:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 0
    iget v0, p0, Ll/᩶ۛᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/᩶ۛᩳ;->᩹:Landroid/view/KeyEvent$Callback;

    check-cast v0, Ll/᩹᩶᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/᩶ۛᩳ;->᩹:Landroid/view/KeyEvent$Callback;

    check-cast v0, Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۚܽ()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
