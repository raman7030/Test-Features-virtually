.class public Ll/᩸ۜۡ;
.super Ll/ۗܺ᩷;
.source "J8WQ"


# static fields
.field public static final synthetic ᩳۧ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 21
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d0058

    .line 22
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 23
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 24
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 25
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 26
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/ᩴ۫ܳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ᩴ۫ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "title"

    .line 29
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "markdown"

    .line 30
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object p1

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/ۘۤۡ;->֫([B)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 46
    invoke-static {p0, v0}, Ll/᩶᩻ۡ;->֫(Landroid/content/Context;Z)Ll/ܺ᩶ۘ;

    move-result-object v0

    const v1, 0x7f0a05e2

    .line 47
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v0, v1, p1}, Ll/ܺ᩶ۘ;->֫(Landroid/widget/TextView;Ljava/lang/String;)V

    return-void

    .line 42
    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "TutorialMarkdownActivity"

    return-object v0
.end method
