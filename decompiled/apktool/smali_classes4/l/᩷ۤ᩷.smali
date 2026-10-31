.class public final synthetic Ll/᩷ۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۖۤ᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۤ᩷;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۤ᩷;->᩸:Ll/ۖۤ᩷;

    iput-object p2, p0, Ll/᩷ۤ᩷;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget-object p1, p0, Ll/᩷ۤ᩷;->᩸:Ll/ۖۤ᩷;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2360
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    const-string v0, "path"

    .line 2361
    iget-object v1, p0, Ll/᩷ۤ᩷;->᩹:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2362
    iget-object p1, p1, Ll/ۖۤ᩷;->ۜ:Ll/ܿۛ᩷;

    const/4 v0, -0x1

    invoke-virtual {p1, v0, p2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 2363
    invoke-virtual {p1}, Ll/ܿۛ᩷;->finish()V

    return-void
.end method
