.class public final synthetic Ll/᩷ۤܿ;
.super Ljava/lang/Object;
.source "964K"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۡۤܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۡۤܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۤܿ;->᩸:Ll/ۡۤܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget-object p1, p0, Ll/᩷ۤܿ;->᩸:Ll/ۡۤܿ;

    .line 694
    iget-object p1, p1, Ll/ۡۤܿ;->᩷:Ll/᩵ۤܿ;

    invoke-static {p1}, Ll/᩵ۤܿ;->ۖ(Ll/᩵ۤܿ;)V

    .line 695
    invoke-static {p1}, Ll/᩵ۤܿ;->ܳ(Ll/᩵ۤܿ;)Ll/ۘܶۡ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object p2

    const-string v0, "package"

    const/4 v1, 0x0

    .line 696
    invoke-static {v0, p2, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 697
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.DELETE"

    invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 698
    invoke-static {p1}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1, v0}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
