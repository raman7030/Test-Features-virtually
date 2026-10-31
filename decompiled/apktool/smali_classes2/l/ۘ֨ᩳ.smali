.class public final synthetic Ll/ۘ֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/᩹ܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/ۘ֨ᩳ;->᩸:I

    iput-object p1, p0, Ll/ۘ֨ᩳ;->᩹:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ۘ֨ᩳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 2
    iget p1, p0, Ll/ۘ֨ᩳ;->᩸:I

    const/4 p2, 0x0

    .line 5
    iget-object v0, p0, Ll/ۘ֨ᩳ;->᩶:Ljava/lang/Object;

    .line 7
    iget-object v1, p0, Ll/ۘ֨ᩳ;->᩹:Ll/᩹ܶᩳ;

    packed-switch p1, :pswitch_data_0

    .line 12
    check-cast v0, [I

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2564
    aget p1, v0, p2

    .line 413
    invoke-virtual {v1, p1, p2, p2}, Ll/᩹ܶᩳ;->֫(IZZ)V

    return-void

    .line 0
    :pswitch_0
    check-cast v0, Landroid/view/MenuItem;

    .line 874
    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result p1

    const/4 v2, 0x1

    xor-int/2addr p1, v2

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 875
    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result p1

    sget v0, Ll/ܽ֨ᩳ;->᩶ۧ:I

    .line 1513
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "axml_id_2_name"

    .line 0
    invoke-static {v0, v3, p1}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    const/4 p1, -0x1

    .line 876
    invoke-virtual {v1, p1, p2, v2}, Ll/᩹ܶᩳ;->֫(IZZ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
