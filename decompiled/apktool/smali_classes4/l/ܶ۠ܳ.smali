.class public final synthetic Ll/ܶ۠ܳ;
.super Ljava/lang/Object;
.source "P4TK"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩹۠ܳ;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/᩹۠ܳ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ۠ܳ;->᩸:Ll/᩹۠ܳ;

    iput-object p2, p0, Ll/ܶ۠ܳ;->᩹:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 120
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/ۙ᩻ܳ;

    iget-object v1, p0, Ll/ܶ۠ܳ;->᩹:Ll/ۗܺ᩷;

    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 121
    iget-object v0, p0, Ll/ܶ۠ܳ;->᩸:Ll/᩹۠ܳ;

    iget-object v0, v0, Ll/᩹۠ܳ;->᩶:Ll/ۗ᩻᩻;

    if-eqz v0, :cond_0

    const-string v2, "NetworkConfigId"

    .line 122
    iget v0, v0, Ll/ۗ᩻᩻;->᩶:I

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 124
    :cond_0
    invoke-virtual {v1, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
