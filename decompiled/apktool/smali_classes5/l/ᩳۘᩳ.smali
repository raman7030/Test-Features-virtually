.class public final synthetic Ll/ᩳۘᩳ;
.super Ljava/lang/Object;
.source "QB32"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳۘᩳ;->᩸:I

    iput-object p2, p0, Ll/ᩳۘᩳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ᩳۘᩳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/ᩳۘᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ᩳۘᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩶ܶۢ;

    .line 11
    iget-object v1, p0, Ll/ᩳۘᩳ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v1, Ll/֫۬ܿ;

    .line 15
    check-cast p1, Ll/ۘ۠ۢ;

    .line 18
    invoke-static {v0, v1}, Ll/᩶ܶۢ;->֫(Ll/᩶ܶۢ;Ll/֫۬ܿ;)V

    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Ll/ᩳۘᩳ;->᩹:Ljava/lang/Object;

    .line 23
    check-cast v0, Landroid/view/MenuItem;

    .line 25
    iget-object v1, p0, Ll/ᩳۘᩳ;->᩶:Ljava/lang/Object;

    .line 27
    check-cast v1, Landroid/view/MenuItem;

    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 284
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 285
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-interface {v1, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
