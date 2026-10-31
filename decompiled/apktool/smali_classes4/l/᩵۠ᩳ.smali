.class public final synthetic Ll/᩵۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/᩵۠ᩳ;->᩸:I

    iput-object p1, p0, Ll/᩵۠ᩳ;->᩹:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 2
    iget v0, p0, Ll/᩵۠ᩳ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩵۠ᩳ;->᩹:Landroid/view/KeyEvent$Callback;

    .line 9
    check-cast v0, Ll/ۛ᩺ܽ;

    .line 12
    invoke-static {v0, p1, p2}, Ll/ۛ᩺ܽ;->֫(Ll/ۛ᩺ܽ;Landroid/widget/CompoundButton;Z)V

    return-void

    .line 15
    :pswitch_0
    iget-object p1, p0, Ll/᩵۠ᩳ;->᩹:Landroid/view/KeyEvent$Callback;

    .line 17
    check-cast p1, Landroid/widget/Button;

    if-eqz p2, :cond_0

    const p2, 0x7f120319

    goto :goto_0

    :cond_0
    const p2, 0x7f1202c2

    .line 2047
    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
