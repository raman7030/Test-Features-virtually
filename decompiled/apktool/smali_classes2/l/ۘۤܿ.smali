.class public final Ll/ۘۤܿ;
.super Landroid/content/BroadcastReceiver;
.source "964K"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩵ۤܿ;)V
    .locals 1

    .line 238
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 239
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۘۤܿ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 244
    iget-object p1, p0, Ll/ۘۤܿ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۤܿ;

    if-eqz p1, :cond_2

    .line 245
    invoke-static {p1}, Ll/᩵ۤܿ;->᩷(Ll/᩵ۤܿ;)Ll/֡ۚۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "pkgName"

    .line 249
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 250
    invoke-static {p1}, Ll/᩵ۤܿ;->ܳ(Ll/᩵ۤܿ;)Ll/ۘܶۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 253
    :cond_1
    invoke-static {}, Ll/᩵ۤܿ;->ۧ()V

    .line 255
    invoke-static {p1}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120b7b

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f12005d

    .line 256
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/ܺۤܿ;

    invoke-direct {v1, p1, p2}, Ll/ܺۤܿ;-><init>(Ll/᩵ۤܿ;Ljava/lang/String;)V

    const p2, 0x7f12070a

    .line 257
    invoke-virtual {v0, p2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f12015e

    const/4 v1, 0x0

    .line 262
    invoke-virtual {v0, p2, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/ۖۤܿ;

    invoke-direct {p2, p1}, Ll/ۖۤܿ;-><init>(Ll/᩵ۤܿ;)V

    const p1, 0x7f1204b4

    .line 263
    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 264
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 265
    invoke-static {p1}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    return-void

    .line 246
    :cond_2
    :goto_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p1

    invoke-static {p1}, Ll/ۖۖ֫;->֫(Landroid/content/ContextWrapper;)Ll/ۖۖ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/ۖۖ֫;->֫(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
