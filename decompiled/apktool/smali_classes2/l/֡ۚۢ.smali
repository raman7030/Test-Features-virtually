.class public final Ll/֡ۚۢ;
.super Ljava/lang/Object;
.source "K1Z9"

# interfaces
.implements Landroid/content/DialogInterface;
.implements Ll/᩻ۡ֫;


# static fields
.field public static final ᩶:Ljava/lang/reflect/Field;

.field public static final synthetic ᩹:I


# instance fields
.field public final ᩸:Ll/᩵ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 37
    :try_start_0
    const-class v0, Ll/۠ܳ;

    const-string v1, "mKeyDispatcher"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    sput-object v0, Ll/֡ۚۢ;->᩶:Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 41
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(Ll/᩵ܿ;)V
    .locals 3

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    .line 50
    :try_start_0
    sget-object v0, Ll/֡ۚۢ;->᩶:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ۛ;

    if-eqz v1, :cond_0

    .line 52
    new-instance v2, Ll/ᩴۚۢ;

    invoke-direct {v2, v1}, Ll/ᩴۚۢ;-><init>(Ll/۠ۛ;)V

    .line 60
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public static ֫(Landroid/view/View;)Z
    .locals 5

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    .line 112
    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    .line 114
    :cond_0
    instance-of v1, p0, Landroid/view/ViewGroup;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    .line 115
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 117
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Ll/֡ۚۢ;->֫(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 82
    :try_start_0
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final dismiss()V
    .locals 1

    .line 91
    :try_start_0
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0}, Ll/۠ܳ;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final getLifecycle()Ll/۟ۢ֫;
    .locals 1

    .line 402
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0}, Ll/ۜܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Landroid/content/Context;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Landroid/view/View;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1}, Ll/۠ܳ;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 178
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩵ܿ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public final ֫(Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    .line 142
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-void
.end method

.method public final ֫(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 138
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ֫(Landroid/content/DialogInterface$OnKeyListener;)V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    return-void
.end method

.method public final ֫(Landroid/content/DialogInterface$OnShowListener;)V
    .locals 1

    .line 150
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    return-void
.end method

.method public final ֫(Landroid/view/ViewGroup;)V
    .locals 1

    .line 158
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1}, Ll/᩵ܿ;->֫(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 162
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1}, Ll/᩵ܿ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 174
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 154
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method public final ۧ()Ll/ۖܿ;
    .locals 1

    .line 182
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0}, Ll/᩵ܿ;->֫()Ll/ۖܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 170
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0, p1}, Ll/᩵ܿ;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܳ()Landroid/view/Window;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Landroid/widget/Button;
    .locals 2

    .line 130
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Ll/᩵ܿ;->֫(I)Landroid/widget/Button;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Landroid/widget/Button;
    .locals 2

    .line 126
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Ll/᩵ܿ;->֫(I)Landroid/widget/Button;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Landroid/widget/Button;
    .locals 2

    .line 134
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Ll/᩵ܿ;->֫(I)Landroid/widget/Button;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()V
    .locals 2

    .line 99
    iget-object v0, p0, Ll/֡ۚۢ;->᩸:Ll/᩵ܿ;

    :try_start_0
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    const v1, 0x7f0a0120

    .line 100
    invoke-virtual {v0, v1}, Ll/۠ܳ;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Ll/֡ۚۢ;->֫(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 101
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x10

    .line 103
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
