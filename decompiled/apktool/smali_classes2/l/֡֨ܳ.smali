.class public final Ll/֡֨ܳ;
.super Ljava/lang/Object;
.source "Z1XC"


# instance fields
.field public ֫:Landroid/content/ClipboardManager;

.field public ۧ:Ll/۬ۗܿ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    iput-object v0, p0, Ll/֡֨ܳ;->֫:Landroid/content/ClipboardManager;

    .line 19
    new-instance v0, Ll/᩵֨ܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/᩵֨ܳ;-><init>(Lbin/mt/plus/Main;Ll/ܽۢܳ;)V

    const v1, 0x7f1204cb

    .line 39
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۡ(I)V

    .line 40
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x7d0

    invoke-static {v1, p1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    .line 41
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 42
    invoke-virtual {v0}, Ll/۬ۗܿ;->᩵()V

    iput-object v0, p0, Ll/֡֨ܳ;->ۧ:Ll/۬ۗܿ;

    return-void
.end method

.method public static synthetic ֫(Ll/֡֨ܳ;)V
    .locals 2

    .line 49
    iget-object v0, p0, Ll/֡֨ܳ;->֫:Landroid/content/ClipboardManager;

    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 51
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 52
    iget-object p0, p0, Ll/֡֨ܳ;->ۧ:Ll/۬ۗܿ;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Ll/۬ۗܿ;->֡()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x1

    .line 205
    iget-object v1, p0, Ll/֡֨ܳ;->ۧ:Ll/۬ۗܿ;

    invoke-virtual {v1, v0}, Ll/۬ۗܿ;->ۧ(Z)V

    .line 48
    invoke-virtual {v1}, Ll/۬ۗܿ;->᩷()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ᩴ֨ܳ;

    invoke-direct {v1, p0}, Ll/ᩴ֨ܳ;-><init>(Ll/֡֨ܳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
