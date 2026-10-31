.class public final synthetic Ll/ܳ۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳ۫᩻;->᩸:I

    iput-object p2, p0, Ll/ܳ۫᩻;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/ܳ۫᩻;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܳ۫᩻;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Landroid/content/Context;

    .line 128
    invoke-static {v0}, Ll/ۙᩴܺ;->֫(Landroid/content/Context;)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܳ۫᩻;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܳ۬ܳ;

    const/4 v1, -0x1

    .line 353
    invoke-interface {v0, v1}, Ll/ܳ۬ܳ;->ۧ(I)V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ܳ۫᩻;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/۬۬ܿ;

    invoke-static {v0}, Ll/᩵ۤܿ;->֫(Ll/۬۬ܿ;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Ll/ܳ۫᩻;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Ll/ܿۤ᩻;->֫(Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
