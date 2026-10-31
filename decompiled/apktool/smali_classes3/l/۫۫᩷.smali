.class public final synthetic Ll/۫۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۫۫᩷;->᩸:I

    iput-object p2, p0, Ll/۫۫᩷;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/۫۫᩷;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 2
    iget p1, p0, Ll/۫۫᩷;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/۫۫᩷;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ljava/lang/String;

    .line 11
    iget-object p2, p0, Ll/۫۫᩷;->᩶:Ljava/lang/Object;

    .line 13
    check-cast p2, Ll/۬ܺ᩷;

    .line 104
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 v1, 0xc3

    .line 105
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 109
    invoke-static {}, Ll/ۧܶܿ;->ܽ()Ljava/lang/String;

    move-result-object v1

    .line 110
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x1

    invoke-static {p1, v2}, Ll/ܳܶܿ;->֫(Ljava/lang/String;Z)Landroid/net/Uri;

    move-result-object p1

    const-string v2, "android.provider.extra.INITIAL_URI"

    .line 112
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/۫۫᩷;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/֡ܳܿ;

    iget-object p2, p0, Ll/۫۫᩷;->᩶:Ljava/lang/Object;

    check-cast p2, [Z

    invoke-static {p1, p2}, Ll/֡ܳܿ;->֫(Ll/֡ܳܿ;[Z)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ll/۫۫᩷;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܿۛ᩷;

    iget-object p2, p0, Ll/۫۫᩷;->᩶:Ljava/lang/Object;

    check-cast p2, Landroid/widget/CheckBox;

    invoke-static {p1, p2}, Ll/ܿۛ᩷;->֫(Ll/ܿۛ᩷;Landroid/widget/CheckBox;)V

    return-void

    .line 114
    :goto_0
    :try_start_0
    invoke-interface {p2, v0}, Ll/۬ܺ᩷;->֫(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    if-nez v1, :cond_0

    .line 117
    invoke-interface {p2, p1}, Ll/۬ܺ᩷;->֫(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 119
    :cond_0
    invoke-interface {p2, v1}, Ll/۬ܺ᩷;->֫(Ljava/lang/String;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
