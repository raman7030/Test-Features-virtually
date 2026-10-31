.class public final Ll/ۗ۬ܿ;
.super Ljava/lang/Object;
.source "55FS"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Runnable;

.field public ᩸:J

.field public final synthetic ᩹:Ll/۬۬ܿ;


# direct methods
.method public constructor <init>(Ll/۬۬ܿ;Ljava/lang/Runnable;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ۬ܿ;->᩹:Ll/۬۬ܿ;

    iput-object p2, p0, Ll/ۗ۬ܿ;->᩶:Ljava/lang/Runnable;

    const-wide/16 p1, 0x0

    .line 49
    iput-wide p1, p0, Ll/ۗ۬ܿ;->᩸:J

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 53
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x4

    if-ne p2, p1, :cond_2

    .line 54
    iget-object p1, p0, Ll/ۗ۬ܿ;->᩹:Ll/۬۬ܿ;

    invoke-static {p1}, Ll/۬۬ܿ;->ۧ(Ll/۬۬ܿ;)Z

    move-result p2

    const/4 p3, 0x1

    if-nez p2, :cond_1

    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۗ۬ܿ;->᩸:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    .line 56
    invoke-static {p1}, Ll/۬۬ܿ;->ܽ(Ll/۬۬ܿ;)V

    .line 57
    iget-object p1, p0, Ll/ۗ۬ܿ;->᩶:Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    .line 58
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return p3

    :cond_0
    const p1, 0x7f12015f

    .line 60
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۗ۬ܿ;->᩸:J

    :cond_1
    return p3

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
