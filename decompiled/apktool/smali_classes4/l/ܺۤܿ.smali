.class public final synthetic Ll/ܺۤܿ;
.super Ljava/lang/Object;
.source "964K"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩵ۤܿ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/᩵ۤܿ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۤܿ;->᩸:Ll/᩵ۤܿ;

    iput-object p2, p0, Ll/ܺۤܿ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 258
    iget-object p1, p0, Ll/ܺۤܿ;->᩸:Ll/᩵ۤܿ;

    invoke-static {p1}, Ll/᩵ۤܿ;->ۖ(Ll/᩵ۤܿ;)V

    const-string p2, "package"

    const/4 v0, 0x0

    .line 259
    iget-object v1, p0, Ll/ܺۤܿ;->᩹:Ljava/lang/String;

    invoke-static {p2, v1, v0}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 260
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.DELETE"

    invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 261
    invoke-static {p1}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1, v0}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
