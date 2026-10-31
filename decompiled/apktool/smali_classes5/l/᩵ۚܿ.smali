.class public final Ll/᩵ۚܿ;
.super Ll/۟ܶۡ;
.source "LAQJ"


# instance fields
.field public final synthetic ۜ:Ll/ۧ֨ܿ;

.field public ܳ:Ll/ܶ᩵ܿ;

.field public final synthetic ᩻:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Ll/ۧ֨ܿ;Landroid/content/Intent;)V
    .locals 0

    .line 842
    iput-object p1, p0, Ll/᩵ۚܿ;->ۜ:Ll/ۧ֨ܿ;

    iput-object p2, p0, Ll/᩵ۚܿ;->᩻:Landroid/content/Intent;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 843
    sget-object p1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    const-string p2, "Android/mt_install_tmp.apk"

    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۚܿ;->ܳ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static ֫(Ll/᩵ۚܿ;)V
    .locals 1

    .line 847
    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/᩵ۚܿ;)Z
    .locals 0

    .line 852
    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 857
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    iget-object v1, p0, Ll/᩵ۚܿ;->ܳ:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 858
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۫()Z

    return-void

    .line 860
    :cond_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܶۧ()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "application/vnd.android.package-archive"

    iget-object v2, p0, Ll/᩵ۚܿ;->᩻:Landroid/content/Intent;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 861
    iget-object v0, p0, Ll/᩵ۚܿ;->ۜ:Ll/ۧ֨ܿ;

    invoke-virtual {v0, v2}, Ll/ۧ֨ܿ;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 867
    iget-object v0, p0, Ll/᩵ۚܿ;->ۜ:Ll/ۧ֨ܿ;

    invoke-virtual {v0, p1}, Ll/ۧ֨ܿ;->֫(Ljava/lang/Exception;)V

    .line 868
    iget-object p1, p0, Ll/᩵ۚܿ;->ܳ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۫()Z

    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 847
    iget-object v0, p0, Ll/᩵ۚܿ;->ۜ:Ll/ۧ֨ܿ;

    invoke-static {v0}, Ll/ۧ֨ܿ;->֫(Ll/ۧ֨ܿ;)Ll/ۗܺ᩷;

    move-result-object v0

    new-instance v1, Ll/ᩴۚܿ;

    invoke-direct {v1, p0}, Ll/ᩴۚܿ;-><init>(Ll/᩵ۚܿ;)V

    const v2, 0x7f1204bd

    const/16 v3, 0x12c

    invoke-virtual {p0, v0, v2, v3, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;IILjava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 852
    iget-object v0, p0, Ll/᩵ۚܿ;->ۜ:Ll/ۧ֨ܿ;

    invoke-static {v0}, Ll/ۧ֨ܿ;->ۧ(Ll/ۧ֨ܿ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ll/ۘۚܿ;

    invoke-direct {v1, p0}, Ll/ۘۚܿ;-><init>(Ll/᩵ۚܿ;)V

    const/4 v2, 0x0

    .line 523
    iget-object v3, p0, Ll/᩵ۚܿ;->ܳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v3, v2, v1}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;Ll/ۚ᩸ܿ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 873
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
