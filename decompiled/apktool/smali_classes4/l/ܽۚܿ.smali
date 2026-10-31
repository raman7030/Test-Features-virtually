.class public final synthetic Ll/ܽۚܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۧ֨ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۧ֨ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۚܿ;->᩸:Ll/ۧ֨ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget-object p1, p0, Ll/ܽۚܿ;->᩸:Ll/ۧ֨ܿ;

    .line 263
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.APPLICATION_DEVELOPMENT_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    .line 264
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 265
    invoke-virtual {p1, v0}, Ll/ۧ֨ܿ;->֫(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 267
    invoke-virtual {p1, v0}, Ll/ۧ֨ܿ;->֫(Ljava/lang/Exception;)V

    return-void
.end method
