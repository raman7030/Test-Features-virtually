.class public final synthetic Ll/ܽۙ֫;
.super Ljava/lang/Object;
.source "M8TF"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ܰ۬֫;

.field public final synthetic ᩶:Ll/ܺۙ֫;

.field public final synthetic ᩸:Landroid/content/Context;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLl/ܺۙ֫;Ll/ܰ۬֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۙ֫;->᩸:Landroid/content/Context;

    iput-boolean p2, p0, Ll/ܽۙ֫;->᩹:Z

    iput-object p3, p0, Ll/ܽۙ֫;->᩶:Ll/ܺۙ֫;

    iput-object p4, p0, Ll/ܽۙ֫;->ۙ:Ll/ܰ۬֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 3443
    iget-object v0, p0, Ll/ܽۙ֫;->᩸:Landroid/content/Context;

    invoke-static {v0}, Ll/ۨ۬֫;->֫(Landroid/content/Context;)Ll/ۨ۬֫;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "MediaMetricsService unavailable."

    .line 3445
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-void

    .line 3448
    :cond_0
    iget-boolean v1, p0, Ll/ܽۙ֫;->᩹:Z

    if-eqz v1, :cond_1

    .line 3449
    iget-object v1, p0, Ll/ܽۙ֫;->᩶:Ll/ܺۙ֫;

    invoke-virtual {v1, v0}, Ll/ܺۙ֫;->֫(Ll/ۨ۬֫;)V

    .line 3451
    :cond_1
    invoke-virtual {v0}, Ll/ۨ۬֫;->֫()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    iget-object v1, p0, Ll/ܽۙ֫;->ۙ:Ll/ܰ۬֫;

    invoke-virtual {v1, v0}, Ll/ܰ۬֫;->֫(Landroid/media/metrics/LogSessionId;)V

    return-void
.end method
