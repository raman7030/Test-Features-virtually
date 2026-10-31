.class public final synthetic Ll/ܳ۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(ILandroid/view/View;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳ۫᩷;->᩸:I

    iput-object p2, p0, Ll/ܳ۫᩷;->᩹:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ܳ۫᩷;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ܳ۫᩷;->᩹:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ܳ۫᩷;->᩹:Landroid/view/View;

    check-cast v0, Ll/ۢᩴ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/ۢᩴ;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
