.class public final Ll/ᩴ᩶ܿ;
.super Ljava/io/FilterOutputStream;
.source "N17O"


# instance fields
.field public final synthetic ᩸:Ll/᩵᩶ܿ;


# direct methods
.method public constructor <init>(Ll/᩵᩶ܿ;Ljava/io/BufferedOutputStream;)V
    .locals 0

    .line 546
    iput-object p1, p0, Ll/ᩴ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 585
    iget-object v0, p0, Ll/ᩴ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-virtual {v0}, Ll/᩵᩶ܿ;->ܽ()V

    .line 586
    iget-object v0, v0, Ll/᩵᩶ܿ;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 587
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 2

    .line 577
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 579
    iget-object v1, p0, Ll/ᩴ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {v1, v0}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw v0
.end method

.method public final write(I)V
    .locals 1

    .line 550
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 552
    iget-object v0, p0, Ll/ᩴ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw p1
.end method

.method public final write([B)V
    .locals 1

    .line 559
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 561
    iget-object v0, p0, Ll/ᩴ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {v0, p1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw p1
.end method

.method public final write([BII)V
    .locals 1

    .line 568
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 570
    iget-object p2, p0, Ll/ᩴ᩶ܿ;->᩸:Ll/᩵᩶ܿ;

    invoke-static {p2, p1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/io/IOException;)V

    throw p1
.end method
