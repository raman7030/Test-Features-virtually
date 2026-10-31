.class public final Ll/ܳ᩹ۡ;
.super Ljava/lang/Object;
.source "34TE"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# static fields
.field public static final ᩸:Ll/ܳ᩹ۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Ll/ܳ᩹ۡ;

    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    sput-object v0, Ll/ܳ᩹ۡ;->᩸:Ll/ܳ᩹ۡ;

    return-void
.end method

.method public static ֫()Ll/ܳ᩹ۡ;
    .locals 1

    .line 28
    sget-object v0, Ll/ܳ᩹ۡ;->᩸:Ll/ܳ᩹ۡ;

    return-object v0
.end method

.method public static ֫(Landroid/widget/TextView;)V
    .locals 1

    .line 32
    invoke-static {p0}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 33
    sget-object v0, Ll/ܳ᩹ۡ;->᩸:Ll/ܳ᩹ۡ;

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    invoke-static {p0}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 33
    sget-object p1, Ll/ܳ᩹ۡ;->᩸:Ll/ܳ᩹ۡ;

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ۧ(Landroid/widget/TextView;)V
    .locals 1

    .line 37
    invoke-static {p0}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 38
    sget-object v0, Ll/ܳ᩹ۡ;->᩸:Ll/ܳ᩹ۡ;

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/ClipboardManager;

    if-eqz v0, :cond_0

    .line 94
    :try_start_0
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f120a61

    .line 95
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const p1, 0x7f1201ff

    .line 97
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_0
    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 105
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/ClipboardManager;

    if-eqz v0, :cond_0

    .line 108
    :try_start_0
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f120a61

    .line 109
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const p1, 0x7f1201ff

    .line 111
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
