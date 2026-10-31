.class public final Ll/ܽۘ֫;
.super Ll/۟ۖ֫;
.source "X6AW"


# instance fields
.field public final synthetic ᩹:Ll/ᩳۘ֫;


# direct methods
.method public constructor <init>(Ll/ᩳۘ֫;Landroid/content/Context;)V
    .locals 0

    .line 642
    iput-object p1, p0, Ll/ܽۘ֫;->᩹:Ll/ᩳۘ֫;

    .line 643
    invoke-direct {p0, p1, p2}, Ll/۟ۖ֫;-><init>(Ll/֫ۘ֫;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;Landroid/os/Bundle;)V
    .locals 3

    .line 649
    invoke-static {p3}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 650
    iget-object v0, p0, Ll/ܽۘ֫;->᩹:Ll/ᩳۘ֫;

    iget-object v1, v0, Ll/ᩳۘ֫;->ܳ:Ll/ܶۘ֫;

    .line 651
    new-instance v2, Ll/᩻ۘ֫;

    invoke-direct {v2, p2}, Ll/᩻ۘ֫;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    .line 587
    new-instance p2, Ll/ۧۘ֫;

    invoke-direct {p2, v0, p1, v2, p3}, Ll/ۧۘ֫;-><init>(Ll/ᩳۘ֫;Ljava/lang/String;Ll/᩻ۘ֫;Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 1362
    invoke-virtual {p2, p1}, Ll/ܳۘ֫;->֫(I)V

    .line 1363
    invoke-virtual {v1}, Ll/ܶۘ֫;->ۧ()V

    return-void
.end method
