.class public final synthetic Ll/ۤ۫ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܰ۫ۜ;

.field public final synthetic ᩹:Ll/ᩳۜܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܰ۫ۜ;Ll/ᩳۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ۫ۜ;->᩸:Ll/ܰ۫ۜ;

    iput-object p2, p0, Ll/ۤ۫ۜ;->᩹:Ll/ᩳۜܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 658
    iget-object p1, p0, Ll/ۤ۫ۜ;->᩸:Ll/ܰ۫ۜ;

    iget-object p1, p1, Ll/ܰ۫ۜ;->᩸:Ll/ۤۤۜ;

    new-instance p2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 659
    iget-object v0, p0, Ll/ۤ۫ۜ;->᩹:Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۨ᩵ܿ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "video/*"

    .line 660
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    .line 661
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 662
    invoke-static {p2, v0}, Ll/ۖ᩺ۘ;->֫(Landroid/content/Intent;Landroid/net/Uri;)V

    .line 664
    :try_start_0
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    const/4 v0, 0x0

    .line 546
    invoke-virtual {p1, p2, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
