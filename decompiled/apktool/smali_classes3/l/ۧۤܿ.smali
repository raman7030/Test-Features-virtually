.class public final synthetic Ll/ۧۤܿ;
.super Ljava/lang/Object;
.source "964K"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧۤܿ;->᩸:I

    iput-object p2, p0, Ll/ۧۤܿ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۧۤܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۧۤܿ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ljava/util/ArrayList;

    .line 393
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ۧۤܿ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܶ۬ܿ;

    invoke-static {p1}, Ll/ܶ۬ܿ;->֫(Ll/ܶ۬ܿ;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ll/ۧۤܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩵ۤܿ;

    invoke-static {v0, p1}, Ll/᩵ۤܿ;->֫(Ll/᩵ۤܿ;Landroid/view/View;)V

    return-void

    .line 394
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/Spanned;

    .line 395
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 397
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
