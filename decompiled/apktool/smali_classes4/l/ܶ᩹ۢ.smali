.class public final synthetic Ll/ܶ᩹ۢ;
.super Ljava/lang/Object;
.source "Q1R8"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/ܶ᩵ܿ;

.field public final synthetic ۙ:I

.field public final synthetic ᩶:Landroid/content/Intent;

.field public final synthetic ᩸:Ll/ۤ᩹ۢ;

.field public final synthetic ᩹:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ll/ۤ᩹ۢ;Landroid/content/Context;Landroid/content/Intent;ILl/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ᩹ۢ;->᩸:Ll/ۤ᩹ۢ;

    iput-object p2, p0, Ll/ܶ᩹ۢ;->᩹:Landroid/content/Context;

    iput-object p3, p0, Ll/ܶ᩹ۢ;->᩶:Landroid/content/Intent;

    iput p4, p0, Ll/ܶ᩹ۢ;->ۙ:I

    iput-object p5, p0, Ll/ܶ᩹ۢ;->ۗ:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 2
    iget-object v0, p0, Ll/ܶ᩹ۢ;->᩹:Landroid/content/Context;

    .line 4
    iget-object v6, p0, Ll/ܶ᩹ۢ;->᩶:Landroid/content/Intent;

    .line 6
    sget v1, Ll/ۤ᩹ۢ;->ۢۧ:I

    .line 246
    :try_start_0
    invoke-static {v0, v6}, Ll/ܰܶۢ;->֫(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v4, v0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 254
    :goto_0
    new-instance v0, Ll/᩸᩹ۢ;

    iget-object v2, p0, Ll/ܶ᩹ۢ;->᩸:Ll/ۤ᩹ۢ;

    iget v3, p0, Ll/ܶ᩹ۢ;->ۙ:I

    iget-object v5, p0, Ll/ܶ᩹ۢ;->ۗ:Ll/ܶ᩵ܿ;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/᩸᩹ۢ;-><init>(Ll/ۤ᩹ۢ;IZLl/ܶ᩵ܿ;Landroid/content/Intent;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
