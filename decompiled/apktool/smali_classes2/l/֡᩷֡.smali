.class public abstract Ll/֡᩷֡;
.super Ljava/io/FilterOutputStream;
.source "JAH8"


# instance fields
.field public final ᩶:[B

.field public ᩸:Z

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .line 94
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/4 p1, 0x1

    new-array p1, p1, [B

    .line 59
    iput-object p1, p0, Ll/֡᩷֡;->᩶:[B

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 126
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    const/4 v0, 0x1

    .line 127
    iput-boolean v0, p0, Ll/֡᩷֡;->᩸:Z

    return-void
.end method

.method public finish()V
    .locals 1

    const/4 v0, 0x1

    .line 198
    iput-boolean v0, p0, Ll/֡᩷֡;->᩹:Z

    return-void
.end method

.method public final isClosed()Z
    .locals 1

    .line 229
    iget-boolean v0, p0, Ll/֡᩷֡;->᩸:Z

    return v0
.end method

.method public final write(I)V
    .locals 2

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 265
    iget-object v0, p0, Ll/֡᩷֡;->᩶:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 266
    invoke-virtual {p0, v0, v1, p1}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 239
    iget-boolean v0, p0, Ll/֡᩷֡;->᩹:Z

    if-nez v0, :cond_0

    return-void

    .line 120
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream has already been finished."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 239
    iget-boolean v0, p0, Ll/֡᩷֡;->᩹:Z

    return v0
.end method
