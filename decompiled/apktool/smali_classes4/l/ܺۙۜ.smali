.class public final Ll/ܺۙۜ;
.super Ll/֫۫ܿ;
.source "M74S"


# instance fields
.field public final synthetic ۗ:Ll/ۗܺ᩷;

.field public final synthetic ۫:Ljava/lang/Runnable;

.field public final synthetic ۬:Ll/ᩴۙۜ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ᩴۙۜ;Ll/ۗܺ᩷;Ljava/lang/Runnable;)V
    .locals 0

    .line 45
    iput-object p2, p0, Ll/ܺۙۜ;->۬:Ll/ᩴۙۜ;

    iput-object p3, p0, Ll/ܺۙۜ;->ۗ:Ll/ۗܺ᩷;

    iput-object p4, p0, Ll/ܺۙۜ;->۫:Ljava/lang/Runnable;

    const-string p2, "smur"

    invoke-direct {p0, p1, p2}, Ll/֫۫ܿ;-><init>(Ll/ۗܺ᩷;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 73
    iget-object p1, p0, Ll/ܺۙۜ;->۫:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    .line 74
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 48
    invoke-virtual {p0}, Ll/֫۫ܿ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 49
    invoke-static {v0}, Ll/ۤۙۜ;->ܿ(Ljava/lang/String;)Ll/۫ۙۜ;

    move-result-object v1

    .line 50
    sget-object v2, Ll/۫ۙۜ;->᩶:Ll/۫ۙۜ;

    if-ne v1, v2, :cond_0

    const v0, 0x7f1209f6

    .line 51
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void

    .line 54
    :cond_0
    sget-object v2, Ll/۫ۙۜ;->ۙ:Ll/۫ۙۜ;

    if-eq v1, v2, :cond_1

    const v0, 0x7f1209f4

    .line 55
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void

    .line 59
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x7d0

    if-gt v1, v2, :cond_2

    .line 60
    invoke-virtual {p0}, Ll/֫۫ܿ;->ۧ()Ll/ۚۖۡ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 61
    invoke-virtual {p0}, Ll/֫۫ܿ;->ܳ()V

    .line 63
    :cond_2
    iget-object v1, p0, Ll/ܺۙۜ;->۬:Ll/ᩴۙۜ;

    invoke-virtual {v1, v0}, Ll/ᩴۙۜ;->ۧ(Ljava/lang/String;)Ll/ܳۙۜ;

    move-result-object v1

    .line 80
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "VideoPlayerUrlArguments:"

    .line 0
    invoke-static {v3, v2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 81
    new-instance v4, Ll/ۤۙۜ;

    invoke-direct {v4, v0, v1}, Ll/ۤۙۜ;-><init>(Ljava/lang/String;Ll/ܳۙۜ;)V

    const/4 v0, 0x0

    .line 36
    invoke-static {v0, v4, v3}, Ll/ۗۖ᩷;->֫(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ۤۤۜ;

    iget-object v3, p0, Ll/ܺۙۜ;->ۗ:Ll/ۗܺ᩷;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "bin.mt.media.extra.URL_ARGUMENTS_TOKEN"

    .line 65
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 66
    invoke-virtual {v3, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    .line 67
    invoke-virtual {p0}, Ll/֫۫ܿ;->֫()V

    return-void
.end method
