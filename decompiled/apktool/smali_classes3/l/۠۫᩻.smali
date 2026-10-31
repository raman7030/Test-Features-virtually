.class public final synthetic Ll/۠۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠۫᩻;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/۠۫᩻;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget p1, p0, Ll/۠۫᩻;->᩸:I

    packed-switch p1, :pswitch_data_0

    const p1, 0x7f1202c5

    const/4 v0, 0x0

    .line 92
    invoke-static {p1, v0}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۚۢ;->ۧ()V

    return-void

    .line 0
    :pswitch_0
    sget p1, Ll/᩻ܺ᩷;->ۖ֫:I

    return-void

    .line 135
    :pswitch_1
    invoke-static {}, Ll/᩵ۛ᩻;->᩷()Z

    move-result p1

    const-class v0, Ll/᩵ۛ᩻;

    if-eqz p1, :cond_0

    .line 124
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p1

    .line 125
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    goto :goto_0

    .line 116
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p1

    .line 117
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p1, v1}, Ll/֨ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
