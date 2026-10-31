.class public final synthetic Ll/ᩳۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/۫ۨᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۨᩳ;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ᩳۛᩳ;->᩸:I

    iput-object p1, p0, Ll/ᩳۛᩳ;->᩹:Ll/۫ۨᩳ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 0
    iget v0, p0, Ll/ᩳۛᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ᩳۛᩳ;->᩹:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ᩳۛᩳ;->᩹:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
