.class public final synthetic Ll/֫۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֫۫᩻;->᩸:I

    iput-object p2, p0, Ll/֫۫᩻;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/֫۫᩻;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/֫۫᩻;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/ۗܺ᩷;

    .line 110
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/֫۫᩻;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܺۙ᩷;

    invoke-static {p1}, Ll/ܺۙ᩷;->֫(Ll/ܺۙ᩷;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ll/֫۫᩻;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/᩹ۖ᩷;

    invoke-static {p1}, Ll/᩹ۖ᩷;->֫(Ll/᩹ۖ᩷;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Ll/֫۫᩻;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܳۨܿ;

    invoke-static {v0, p1}, Ll/ܳۨܿ;->֫(Ll/ܳۨܿ;Landroid/view/View;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Ll/֫۫᩻;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/۟۬᩻;

    .line 546
    invoke-virtual {p1}, Ll/۟۬᩻;->run()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
