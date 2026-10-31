.class public final synthetic Ll/ۢܶۡ;
.super Ljava/lang/Object;
.source "S57O"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۢܶۡ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 2
    iget v0, p0, Ll/ۢܶۡ;->᩸:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    .line 8
    sget v0, Ll/ۛ֡ᩳ;->᩷֫:I

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f0a05a0

    .line 56
    invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 57
    new-instance v2, Landroid/content/Intent;

    const-class v3, Ll/֡ܳܿ;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v3, 0x10000000

    .line 58
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "pageIndex"

    .line 59
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p1

    .line 57
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return v1

    .line 39
    :pswitch_0
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
