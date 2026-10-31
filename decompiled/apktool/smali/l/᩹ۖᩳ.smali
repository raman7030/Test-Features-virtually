.class public final synthetic Ll/᩹ۖᩳ;
.super Ljava/lang/Object;
.source "3BK7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/᩹ۖᩳ;->᩸:I

    iput-object p1, p0, Ll/᩹ۖᩳ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩹ۖᩳ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩹ۖᩳ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/᩹ۖᩳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/᩹ۖᩳ;->ۙ:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/᩹ۖᩳ;->᩶:Ljava/lang/Object;

    .line 8
    iget-object v3, p0, Ll/᩹ۖᩳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 13
    check-cast v3, Ll/۬᩹֨;

    .line 15
    check-cast v2, Ll/֫ۤ֨;

    .line 17
    check-cast v1, Ll/۫᩵۠;

    .line 20
    invoke-static {v3, v2, v1}, Ll/۬᩹֨;->֫(Ll/۬᩹֨;Ll/֫ۤ֨;Ll/۫᩵۠;)V

    return-void

    .line 23
    :pswitch_0
    check-cast v3, Landroid/widget/EditText;

    .line 25
    check-cast v2, Landroid/widget/EditText;

    .line 27
    check-cast v1, Landroid/view/View;

    .line 29
    sget v0, Ll/֡ܳܿ;->֨ۧ:I

    .line 659
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 662
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 660
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    return-void

    .line 0
    :pswitch_1
    check-cast v3, Ll/᩶ۖᩳ;

    check-cast v2, Ll/ܶ᩹ۡ;

    check-cast v1, [F

    invoke-static {v3, v2, v1}, Ll/᩶ۖᩳ;->֫(Ll/᩶ۖᩳ;Ll/ܶ᩹ۡ;[F)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
