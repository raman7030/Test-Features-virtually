.class public final synthetic Ll/᩷ۗܿ;
.super Ljava/lang/Object;
.source "192I"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩷ۗܿ;->᩸:I

    iput-object p2, p0, Ll/᩷ۗܿ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    .line 2
    iget v0, p0, Ll/᩷ۗܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/᩷ۗܿ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Landroid/widget/EditText;

    .line 12
    invoke-static {p1, p2}, Ll/ۚۚ᩻;->֫(Landroid/widget/EditText;Z)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/᩷ۗܿ;->᩹:Ljava/lang/Object;

    .line 17
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz p2, :cond_0

    .line 65
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
