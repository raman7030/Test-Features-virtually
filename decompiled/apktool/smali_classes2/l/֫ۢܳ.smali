.class public final synthetic Ll/֫ۢܳ;
.super Ljava/lang/Object;
.source "123V"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p2, p0, Ll/֫ۢܳ;->᩸:I

    iput-object p3, p0, Ll/֫ۢܳ;->᩹:Ljava/lang/Object;

    iput p1, p0, Ll/֫ۢܳ;->᩶:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/֫ۢܳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֫ۢܳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/֡۫֫;

    .line 11
    iget v1, p0, Ll/֫ۢܳ;->᩶:I

    .line 14
    invoke-static {v0, v1}, Ll/֡۫֫;->֫(Ll/֡۫֫;I)V

    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Ll/֫ۢܳ;->᩹:Ljava/lang/Object;

    .line 19
    check-cast v0, Landroid/widget/TextView;

    .line 1741
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 1742
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1744
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Ll/֫ۢܳ;->᩶:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
