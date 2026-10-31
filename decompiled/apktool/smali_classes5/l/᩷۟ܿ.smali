.class public final Ll/᩷۟ܿ;
.super Ll/۟ܶۡ;
.source "M70U"


# instance fields
.field public final synthetic ۜ:Ll/ۜܰܿ;

.field public final synthetic ܳ:Ll/ۢ۟ܿ;

.field public final synthetic ᩷:Ll/ۡ۟ܿ;

.field public final synthetic ᩻:Ll/ܽܰܿ;


# direct methods
.method public constructor <init>(Ll/ۡ۟ܿ;Ll/ۜܰܿ;Ll/ۢ۟ܿ;Ll/ܽܰܿ;)V
    .locals 0

    .line 32
    iput-object p1, p0, Ll/᩷۟ܿ;->᩷:Ll/ۡ۟ܿ;

    iput-object p2, p0, Ll/᩷۟ܿ;->ۜ:Ll/ۜܰܿ;

    iput-object p3, p0, Ll/᩷۟ܿ;->ܳ:Ll/ۢ۟ܿ;

    iput-object p4, p0, Ll/᩷۟ܿ;->᩻:Ll/ܽܰܿ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩷۟ܿ;Ll/ۢ۟ܿ;)V
    .locals 1

    .line 39
    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    new-instance v0, Ll/ܿ۟ܿ;

    invoke-direct {v0, p1}, Ll/ܿ۟ܿ;-><init>(Ll/ۢ۟ܿ;)V

    invoke-virtual {p0, v0}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ll/᩷۟ܿ;)Z
    .locals 1

    .line 45
    iget-object v0, p0, Ll/᩷۟ܿ;->ܳ:Ll/ۢ۟ܿ;

    invoke-virtual {v0}, Ll/ۢ۟ܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    if-eqz p0, :cond_0

    .line 46
    invoke-virtual {p0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩷۟ܿ;->᩻:Ll/ܽܰܿ;

    invoke-virtual {v0}, Ll/ܽܰܿ;->ܳ()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 3

    .line 73
    instance-of v0, p1, Ll/᩻ܽܳ;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 76
    :cond_0
    iget-object v0, p0, Ll/᩷۟ܿ;->ۜ:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    iget-object v2, p0, Ll/᩷۟ܿ;->᩷:Ll/ۡ۟ܿ;

    invoke-static {v2}, Ll/ۡ۟ܿ;->֫(Ll/ۡ۟ܿ;)Ll/֫ܰܿ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۧܰܿ;->֫(Ll/֫ܰܿ;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 109
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 111
    instance-of v2, v1, Ll/ۗܺ᩷;

    if-eqz v2, :cond_2

    .line 110
    check-cast v1, Ll/ۗܺ᩷;

    .line 111
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 80
    :cond_2
    :goto_0
    instance-of v1, p1, Ll/۟֫ܳ;

    if-eqz v1, :cond_3

    const p1, 0x7f12030d

    .line 81
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 82
    :cond_3
    instance-of v1, p1, Ljava/io/IOException;

    if-eqz v1, :cond_4

    .line 83
    check-cast p1, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    return-void

    .line 85
    :cond_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unable to paste hex range"

    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 35
    iget-object v0, p0, Ll/᩷۟ܿ;->ۜ:Ll/ۜܰܿ;

    iget-object v1, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ᩴ()Ll/֫ܰܿ;

    move-result-object v1

    iget-object v2, p0, Ll/᩷۟ܿ;->᩷:Ll/ۡ۟ܿ;

    invoke-static {v2, v1}, Ll/ۡ۟ܿ;->֫(Ll/ۡ۟ܿ;Ll/֫ܰܿ;)V

    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 37
    invoke-static {v2}, Ll/ۡ۟ܿ;->֫(Ll/ۡ۟ܿ;)Ll/֫ܰܿ;

    move-result-object v1

    if-eqz v1, :cond_0

    instance-of v1, v0, Ll/ۗܺ᩷;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ۗܺ᩷;

    .line 38
    new-instance v1, Ll/ۜ۟ܿ;

    iget-object v2, p0, Ll/᩷۟ܿ;->ܳ:Ll/ۢ۟ܿ;

    invoke-direct {v1, p0, v2}, Ll/ۜ۟ܿ;-><init>(Ll/᩷۟ܿ;Ll/ۢ۟ܿ;)V

    const v2, 0x7f1207a7

    const/16 v3, 0xc8

    invoke-virtual {p0, v0, v2, v3, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;IILjava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 51
    iget-object v0, p0, Ll/᩷۟ܿ;->᩷:Ll/ۡ۟ܿ;

    iget-object v1, p0, Ll/᩷۟ܿ;->᩻:Ll/ܽܰܿ;

    invoke-virtual {v1}, Ll/ܽܰܿ;->֫()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 55
    :cond_0
    :try_start_0
    invoke-static {v0}, Ll/ۡ۟ܿ;->֫(Ll/ۡ۟ܿ;)Ll/֫ܰܿ;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 45
    iget-object v2, p0, Ll/᩷۟ܿ;->ܳ:Ll/ۢ۟ܿ;

    invoke-virtual {v2}, Ll/ۢ۟ܿ;->᩻()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    if-eqz v2, :cond_1

    .line 46
    invoke-virtual {v2}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-nez v2, :cond_3

    .line 56
    iget-object v2, p0, Ll/᩷۟ܿ;->ۜ:Ll/ۜܰܿ;

    iget-object v2, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-static {v0}, Ll/ۡ۟ܿ;->֫(Ll/ۡ۟ܿ;)Ll/֫ܰܿ;

    move-result-object v3

    new-instance v4, Ll/᩻۟ܿ;

    invoke-direct {v4, p0}, Ll/᩻۟ܿ;-><init>(Ll/᩷۟ܿ;)V

    invoke-virtual {v2, v3, v4}, Ll/ۧܰܿ;->֫(Ll/֫ܰܿ;Ll/᩻۟ܿ;)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Ll/ۡ۟ܿ;->֫(Ll/ۡ۟ܿ;J)V

    .line 58
    invoke-static {v0}, Ll/ۡ۟ܿ;->ۧ(Ll/ۡ۟ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :cond_3
    invoke-virtual {v1}, Ll/ܽܰܿ;->ᩳ()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ll/ܽܰܿ;->ᩳ()V

    .line 62
    throw v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 91
    iget-object v0, p0, Ll/᩷۟ܿ;->᩻:Ll/ܽܰܿ;

    invoke-virtual {v0}, Ll/ܽܰܿ;->ᩳ()V

    .line 92
    invoke-virtual {v0}, Ll/ܽܰܿ;->ܳ()V

    .line 93
    iget-object v1, p0, Ll/᩷۟ܿ;->᩷:Ll/ۡ۟ܿ;

    invoke-static {v1}, Ll/ۡ۟ܿ;->֫(Ll/ۡ۟ܿ;)Ll/֫ܰܿ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 95
    :try_start_0
    invoke-static {v1}, Ll/ۡ۟ܿ;->֫(Ll/ۡ۟ܿ;)Ll/֫ܰܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ܰܿ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    :catch_0
    :cond_0
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 102
    invoke-virtual {v0}, Ll/ܽܰܿ;->close()V

    return-void
.end method
