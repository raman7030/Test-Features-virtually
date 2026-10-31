.class public final synthetic Ll/ۙۙ᩷;
.super Ljava/lang/Object;
.source "8AHX"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۙۙ᩷;->᩸:I

    iput-object p2, p0, Ll/ۙۙ᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 2
    iget p1, p0, Ll/ۙۙ᩷;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۙۙ᩷;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/۫۟ܽ;

    .line 12
    invoke-static {p1}, Ll/۫۟ܽ;->ܿ(Ll/۫۟ܽ;)V

    return-void

    .line 15
    :pswitch_0
    iget-object p1, p0, Ll/ۙۙ᩷;->᩹:Ljava/lang/Object;

    .line 17
    check-cast p1, Landroid/widget/EditText;

    .line 839
    invoke-static {}, Ll/ۙ᩸᩷;->ܳ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 841
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 842
    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_0
    return-void

    .line 0
    :pswitch_1
    iget-object p1, p0, Ll/ۙۙ᩷;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۛۙ᩷;

    invoke-static {p1}, Ll/ۛۙ᩷;->ܽ(Ll/ۛۙ᩷;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
