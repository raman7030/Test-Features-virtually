.class public Ll/ܽ֫֡;
.super Ll/᩺ܽ֡;
.source "9443"


# instance fields
.field public ᩹:Z


# virtual methods
.method public final close()V
    .locals 1

    .line 55
    iget-boolean v0, p0, Ll/ܽ֫֡;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    .line 57
    :cond_0
    :try_start_0
    invoke-super {p0}, Ll/᩺ܽ֡;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Ll/ܽ֫֡;->᩹:Z

    .line 60
    invoke-virtual {p0}, Ll/ܽ֫֡;->֫()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 45
    iget-boolean v0, p0, Ll/ܽ֫֡;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    .line 47
    :cond_0
    :try_start_0
    invoke-super {p0}, Ll/᩺ܽ֡;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Ll/ܽ֫֡;->᩹:Z

    .line 50
    invoke-virtual {p0}, Ll/ܽ֫֡;->֫()V

    return-void
.end method

.method public ֫()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(Ll/۫ܽ֡;J)V
    .locals 1

    .line 32
    iget-boolean v0, p0, Ll/ܽ֫֡;->᩹:Z

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p1, p2, p3}, Ll/۫ܽ֡;->skip(J)V

    return-void

    .line 37
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ll/᩺ܽ֡;->֫(Ll/۫ܽ֡;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, Ll/ܽ֫֡;->᩹:Z

    .line 40
    invoke-virtual {p0}, Ll/ܽ֫֡;->֫()V

    return-void
.end method
