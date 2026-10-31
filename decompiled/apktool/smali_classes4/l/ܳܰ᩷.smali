.class public final synthetic Ll/ܳܰ᩷;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Landroid/os/Bundle;

.field public final synthetic ᩸:Ll/᩸ܰ᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ܰ᩷;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳܰ᩷;->᩸:Ll/᩸ܰ᩷;

    iput-object p2, p0, Ll/ܳܰ᩷;->᩹:Ljava/lang/String;

    iput-object p3, p0, Ll/ܳܰ᩷;->᩶:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ܳܰ᩷;->᩶:Landroid/os/Bundle;

    const-string v1, "path"

    .line 851
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 852
    iget-object v1, p0, Ll/ܳܰ᩷;->᩸:Ll/᩸ܰ᩷;

    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v2

    check-cast v2, Ll/ۗܺ᩷;

    .line 853
    new-instance v3, Ll/֡ܰ᩷;

    iget-object v4, p0, Ll/ܳܰ᩷;->᩹:Ljava/lang/String;

    invoke-direct {v3, v1, v2, v4, v0}, Ll/֡ܰ᩷;-><init>(Ll/᩸ܰ᩷;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;)V

    .line 882
    invoke-virtual {v3}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
