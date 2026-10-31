.class public final Ll/ۗܶۘ;
.super Ljava/lang/Object;
.source "51RR"


# direct methods
.method public static ֫(Landroid/app/Dialog;Landroid/os/Handler;)V
    .locals 3

    .line 54
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u7f51\u9875\u52a0\u8f7d\u5f02\u5e38\uff0c\u8bf7\u81ea\u884c\u4e0b\u8f7d\u5e76\u5b89\u88c5QQ\u540e\uff0c\u518d\u91cd\u65b0\u767b\u5f55\u3002"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 59
    new-instance v0, Ll/֡ܶۘ;

    invoke-direct {v0, p0}, Ll/֡ܶۘ;-><init>(Landroid/app/Dialog;)V

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Landroid/view/Window;)V
    .locals 3

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x400

    .line 30
    invoke-virtual {p0, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x500

    .line 34
    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v1, -0x80000000

    .line 37
    invoke-virtual {p0, v1}, Landroid/view/Window;->addFlags(I)V

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    .line 41
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/4 v1, 0x1

    .line 42
    invoke-static {v0, v1}, Ll/ۧ۬֫;->֫(Landroid/view/WindowManager$LayoutParams;I)V

    .line 43
    invoke-virtual {p0, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_1
    :goto_0
    return-void
.end method
