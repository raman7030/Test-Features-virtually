.class public final synthetic Ll/ۢۗܿ;
.super Ljava/lang/Object;
.source "192I"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 87
    instance-of p2, p1, Landroid/widget/EditText;

    if-eqz p2, :cond_0

    check-cast p1, Landroid/widget/EditText;

    .line 88
    new-instance p2, Ll/۠ۛᩳ;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p1}, Ll/۠ۛᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
