.class public final Ll/ۗۙۜ;
.super Ljava/lang/Object;
.source "N74D"

# interfaces
.implements Ll/ܿܰ֫;


# instance fields
.field public final ᩸:Ll/ᩴ᩺֫;

.field public final synthetic ᩹:Ll/۬ۙۜ;


# direct methods
.method public constructor <init>(Ll/۬ۙۜ;Ll/ᩴ᩺֫;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۙۜ;->᩹:Ll/۬ۙۜ;

    .line 53
    iput-object p2, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    return-void
.end method

.method public static ֫(Ll/ۗۙۜ;Ll/ᩳܰ֫;Ll/ۙ᩺֫;)V
    .locals 5

    .line 98
    iget-object v0, p0, Ll/ۗۙۜ;->᩹:Ll/۬ۙۜ;

    invoke-static {v0}, Ll/۬ۙۜ;->ۧ(Ll/۬ۙۜ;)Ll/ܶ֨ۜ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 100
    invoke-virtual {v1, p2}, Ll/ܶ֨ۜ;->֫(Ll/ۙ᩺֫;)V

    .line 62
    :cond_0
    iget-object p0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {p0}, Ll/ᩴ᩺֫;->ۧ()Ll/۫᩺֫;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 64
    iget-object v1, v1, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩺֫;

    .line 65
    iget-object v3, v2, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    const/4 v4, 0x0

    invoke-virtual {p0, v3, v4}, Ll/ᩴ᩺֫;->֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;

    move-result-object v3

    .line 98
    invoke-static {v0}, Ll/۬ۙۜ;->ۧ(Ll/۬ۙۜ;)Ll/ܶ֨ۜ;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 100
    invoke-virtual {v4, v3}, Ll/ܶ֨ۜ;->֫(Ll/ۙ᩺֫;)V

    .line 67
    :cond_1
    invoke-static {v0}, Ll/۬ۙۜ;->֫(Ll/۬ۙۜ;)Ll/᩵֨ۜ;

    move-result-object v4

    iget-object v2, v2, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    invoke-virtual {v4, v2, v3}, Ll/᩵֨ۜ;->֫(Landroid/net/Uri;Ll/ۙ᩺֫;)V

    goto :goto_0

    .line 70
    :cond_2
    invoke-interface {p1, p2}, Ll/ᩳܰ֫;->֫(Ll/ۙ᩺֫;)V

    return-void
.end method


# virtual methods
.method public final stop()V
    .locals 2

    .line 77
    iget-object v0, p0, Ll/ۗۙۜ;->᩹:Ll/۬ۙۜ;

    :try_start_0
    iget-object v1, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v1}, Ll/ᩴ᩺֫;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    invoke-static {v0}, Ll/۬ۙۜ;->֫(Ll/۬ۙۜ;)Ll/᩵֨ۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵֨ۜ;->֫()V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Ll/۬ۙۜ;->֫(Ll/۬ۙۜ;)Ll/᩵֨ۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵֨ۜ;->֫()V

    .line 80
    throw v1
.end method

.method public final ֫()J
    .locals 2

    .line 104
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0}, Ll/ᩴ᩺֫;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;
    .locals 2

    .line 90
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0, p1, p2}, Ll/ᩴ᩺֫;->֫(Landroid/net/Uri;Z)Ll/ۙ᩺֫;

    move-result-object p2

    .line 98
    iget-object v0, p0, Ll/ۗۙۜ;->᩹:Ll/۬ۙۜ;

    invoke-static {v0}, Ll/۬ۙۜ;->ۧ(Ll/۬ۙۜ;)Ll/ܶ֨ۜ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 100
    invoke-virtual {v1, p2}, Ll/ܶ֨ۜ;->֫(Ll/ۙ᩺֫;)V

    .line 92
    :cond_0
    invoke-static {v0}, Ll/۬ۙۜ;->֫(Ll/۬ۙۜ;)Ll/᩵֨ۜ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/᩵֨ۜ;->֫(Landroid/net/Uri;Ll/ۙ᩺֫;)V

    return-object p2
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 1

    .line 111
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0, p1}, Ll/ᩴ᩺֫;->֫(Landroid/net/Uri;)V

    return-void
.end method

.method public final ֫(Landroid/net/Uri;Ll/۠ۧۧ;Ll/ᩳܰ֫;)V
    .locals 1

    .line 60
    new-instance v0, Ll/ܰ۬ۜ;

    invoke-direct {v0, p0, p3}, Ll/ܰ۬ۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p3, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {p3, p1, p2, v0}, Ll/ᩴ᩺֫;->֫(Landroid/net/Uri;Ll/۠ۧۧ;Ll/ᩳܰ֫;)V

    return-void
.end method

.method public final ֫(Ll/֫ܰ֫;)V
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0, p1}, Ll/ᩴ᩺֫;->֫(Ll/֫ܰ֫;)V

    return-void
.end method

.method public final ֫(Landroid/net/Uri;J)Z
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩴ᩺֫;->֫(Landroid/net/Uri;J)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Ll/۫᩺֫;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0}, Ll/ᩴ᩺֫;->ۧ()Ll/۫᩺֫;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Landroid/net/Uri;)V
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0, p1}, Ll/ᩴ᩺֫;->ۧ(Landroid/net/Uri;)V

    return-void
.end method

.method public final ۧ(Ll/֫ܰ֫;)V
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0, p1}, Ll/ᩴ᩺֫;->ۧ(Ll/֫ܰ֫;)V

    return-void
.end method

.method public final ܽ(Landroid/net/Uri;)V
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0, p1}, Ll/ᩴ᩺֫;->ܽ(Landroid/net/Uri;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0}, Ll/ᩴ᩺֫;->ܽ()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0}, Ll/ᩴ᩺֫;->ᩳ()V

    return-void
.end method

.method public final ᩳ(Landroid/net/Uri;)Z
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۗۙۜ;->᩸:Ll/ᩴ᩺֫;

    invoke-virtual {v0, p1}, Ll/ᩴ᩺֫;->ᩳ(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method
