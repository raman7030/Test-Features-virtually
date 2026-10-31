.class public final synthetic Ll/ۡ᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡ᩶ܳ;->᩸:I

    iput-object p2, p0, Ll/ۡ᩶ܳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۡ᩶ܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 2
    iget v0, p0, Ll/ۡ᩶ܳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۡ᩶ܳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, [Landroid/widget/RadioButton;

    .line 11
    iget-object v1, p0, Ll/ۡ᩶ܳ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v1, [I

    .line 375
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ۡ᩶ܳ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܳۙܳ;

    iget-object v0, p0, Ll/ۡ᩶ܳ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/֡ۚۢ;

    invoke-static {p1, v0}, Ll/ܳۙܳ;->֫(Ll/ܳۙܳ;Ll/֡ۚۢ;)V

    return-void

    :goto_0
    if-ge v4, v2, :cond_1

    .line 376
    aget-object v5, v0, v4

    if-ne v5, p1, :cond_0

    const/4 v6, 0x1

    .line 378
    invoke-virtual {v5, v6}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 379
    aput v4, v1, v3

    goto :goto_1

    .line 381
    :cond_0
    invoke-virtual {v5, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
