.class public final synthetic Ll/ۡۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ۡۗܳ;->᩸:I

    iput-object p1, p0, Ll/ۡۗܳ;->᩹:Ll/ۗܺ᩷;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget p1, p0, Ll/ۡۗܳ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۡۗܳ;->᩹:Ll/ۗܺ᩷;

    const/4 v0, 0x1

    .line 33
    invoke-static {p1, v0}, Lbin/mt/plus/ShortcutActivity;->֫(Ll/ۗܺ᩷;Z)V

    return-void

    .line 276
    :pswitch_0
    invoke-static {}, Ll/ۢۤۡ;->ۧ()Z

    move-result p1

    iget-object v0, p0, Ll/ۡۗܳ;->᩹:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 277
    invoke-static {}, Ll/᩻᩹ۡ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v1}, Ll/ۧۖ᩷;->֫(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_0

    .line 279
    :cond_0
    invoke-static {}, Ll/᩻᩹ۡ;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v1}, Ll/ۧۖ᩷;->֫(Landroid/content/Context;Ljava/lang/String;Z)V

    :goto_0
    return-void

    .line 222
    :pswitch_1
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/᩹ۙܽ;

    iget-object v1, p0, Ll/ۡۗܳ;->᩹:Ll/ۗܺ᩷;

    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "fromDialog"

    const/4 v2, 0x1

    .line 223
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 224
    invoke-virtual {v1, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
