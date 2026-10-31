.class public final synthetic Ll/ۨۖܳ;
.super Ljava/lang/Object;
.source "J26J"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۨۖܳ;->᩸:I

    iput-object p2, p0, Ll/ۨۖܳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 2
    iget v0, p0, Ll/ۨۖܳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ۨۖܳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/᩵֡᩷;

    .line 12
    invoke-static {v1}, Ll/᩵֡᩷;->ܽ(Ll/᩵֡᩷;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/ܶۧ᩷;

    .line 17
    sget p1, Ll/ܶۧ᩷;->ܿۧ:I

    .line 42
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, [Landroid/widget/RadioButton;

    .line 233
    array-length v0, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, v1, v2

    if-ne v3, p1, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 234
    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 0
    :pswitch_2
    check-cast v1, Ll/᩶ۛܽ;

    invoke-static {v1}, Ll/᩶ۛܽ;->ۧ(Ll/᩶ۛܽ;)V

    return-void

    :pswitch_3
    check-cast v1, Ll/ۢۘܳ;

    invoke-static {v1}, Ll/ۢۘܳ;->ܽ(Ll/ۢۘܳ;)V

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
