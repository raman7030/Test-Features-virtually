.class public final Ll/ܰ֡֫;
.super Ljava/io/OutputStream;
.source "82VA"


# instance fields
.field public ᩸:Z

.field public final ᩹:Ljava/io/FileOutputStream;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 163
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    .line 161
    iput-boolean v0, p0, Ll/ܰ֡֫;->᩸:Z

    .line 164
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Ll/ܰ֡֫;->᩹:Ljava/io/FileOutputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 169
    iget-object v0, p0, Ll/ܰ֡֫;->᩹:Ljava/io/FileOutputStream;

    iget-boolean v1, p0, Ll/ܰ֡֫;->᩸:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 172
    iput-boolean v1, p0, Ll/ܰ֡֫;->᩸:Z

    .line 173
    invoke-virtual {p0}, Ll/ܰ֡֫;->flush()V

    .line 175
    :try_start_0
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to sync file descriptor:"

    .line 177
    invoke-static {v2, v1}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 179
    :goto_0
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 184
    iget-object v0, p0, Ll/ܰ֡֫;->᩹:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 1

    .line 189
    iget-object v0, p0, Ll/ܰ֡֫;->᩹:Ljava/io/FileOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write(I)V

    return-void
.end method

.method public final write([B)V
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ܰ֡֫;->᩹:Ljava/io/FileOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 199
    iget-object v0, p0, Ll/ܰ֡֫;->᩹:Ljava/io/FileOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/FileOutputStream;->write([BII)V

    return-void
.end method
