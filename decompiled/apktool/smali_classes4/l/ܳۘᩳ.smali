.class public final synthetic Ll/ܳۘᩳ;
.super Ljava/lang/Object;
.source "QB32"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳۘᩳ;->᩸:I

    iput-object p2, p0, Ll/ܳۘᩳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ܳۘᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܳۘᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩸᩻ۢ;

    .line 11
    check-cast p1, Ll/۫ۧۢ;

    .line 14
    invoke-static {v0, p1}, Ll/᩸᩻ۢ;->֫(Ll/᩸᩻ۢ;Ll/۫ۧۢ;)V

    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Ll/ܳۘᩳ;->᩹:Ljava/lang/Object;

    .line 19
    check-cast v0, Ll/ܰܰ᩷;

    .line 21
    check-cast p1, Ll/᩵ۨ᩷;

    .line 24
    invoke-static {v0, p1}, Ll/ܰܰ᩷;->֫(Ll/ܰܰ᩷;Ll/᩵ۨ᩷;)V

    return-void

    .line 27
    :pswitch_1
    iget-object v0, p0, Ll/ܳۘᩳ;->᩹:Ljava/lang/Object;

    .line 29
    check-cast v0, Ll/ۚ᩵ܳ;

    .line 31
    check-cast p1, Ljava/util/List;

    .line 34
    invoke-static {v0}, Ll/ۚ᩵ܳ;->֫(Ll/ۚ᩵ܳ;)V

    return-void

    .line 37
    :pswitch_2
    iget-object v0, p0, Ll/ܳۘᩳ;->᩹:Ljava/lang/Object;

    .line 39
    check-cast v0, Landroid/widget/ProgressBar;

    .line 41
    check-cast p1, Ljava/lang/Boolean;

    .line 93
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 101
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eq v1, p1, :cond_1

    .line 102
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
