.class public final synthetic Ll/ۢۛ᩻;
.super Ljava/lang/Object;
.source "A6XJ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩵ۛ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/᩵ۛ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۛ᩻;->᩸:Ll/᩵ۛ᩻;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 2
    sget p1, Ll/᩵ۛ᩻;->۬:I

    .line 577
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-static {p1}, Ll/ܿۤ᩻;->֫(Lbin/mt/plus/Main;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 580
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "bin.mt.plus.ACTION_SHORTCUT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v0, Landroid/content/ComponentName;

    .line 581
    iget-object v1, p0, Ll/ۢۛ᩻;->᩸:Ll/᩵ۛ᩻;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "bin.mt.plus.ApkMcpActivity"

    invoke-direct {v0, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "operation"

    const-string v2, "tool-apk-mcp"

    .line 582
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x10000000

    .line 583
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    .line 584
    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
