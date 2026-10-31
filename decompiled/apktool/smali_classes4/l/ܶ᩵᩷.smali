.class public Ll/ܶ᩵᩷;
.super Ljava/lang/Object;
.source "6AY4"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final ۧ:Ll/ۚ᩹᩷;


# direct methods
.method public constructor <init>(Ll/ۚ᩹᩷;)V
    .locals 0

    .line 1743
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1744
    iput-object p1, p0, Ll/ܶ᩵᩷;->ۧ:Ll/ۚ᩹᩷;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 1756
    iget-object v0, p0, Ll/ܶ᩵᩷;->ۧ:Ll/ۚ᩹᩷;

    invoke-virtual {v0}, Ll/ۚ᩹᩷;->֫()V

    return-void
.end method

.method public final ֫(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1768
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    const-class v2, Ll/᩵֡᩷;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1769
    iget-object v1, p0, Ll/ܶ᩵᩷;->֫:Ljava/lang/String;

    const-string v2, "type"

    .line 1770
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "title"

    .line 1771
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-eqz p6, :cond_0

    const-string p1, "extra"

    .line 1773
    invoke-virtual {v0, p1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    if-eqz p3, :cond_1

    const-string p1, "initPath"

    .line 1776
    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    if-eqz v1, :cond_2

    const-string p1, "initPathKey"

    .line 1779
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_2
    if-eqz p4, :cond_3

    const-string p1, "initFilename"

    .line 1782
    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    if-eqz p5, :cond_5

    .line 1784
    array-length p1, p5

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const-string p1, "suffixes"

    .line 1785
    invoke-virtual {v0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 1790
    :cond_5
    :goto_0
    iget-object p1, p0, Ll/ܶ᩵᩷;->ۧ:Ll/ۚ᩹᩷;

    invoke-virtual {p1, v0}, Ll/ۚ᩹᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 1751
    iput-object p1, p0, Ll/ܶ᩵᩷;->֫:Ljava/lang/String;

    return-void
.end method
