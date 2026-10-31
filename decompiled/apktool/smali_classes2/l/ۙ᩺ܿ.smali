.class public final Ll/ۙ᩺ܿ;
.super Ljava/io/FilterOutputStream;
.source "P70J"


# instance fields
.field public final ᩶:Ll/ۛܰܿ;

.field public ᩸:Z

.field public final ᩹:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Ljava/io/BufferedOutputStream;Ll/ۛܰܿ;)V
    .locals 0

    .line 480
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 469
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Ll/ۙ᩺ܿ;->᩹:Ljava/util/zip/CRC32;

    const/4 p1, 0x1

    .line 471
    iput-boolean p1, p0, Ll/ۙ᩺ܿ;->᩸:Z

    .line 481
    iput-object p2, p0, Ll/ۙ᩺ܿ;->᩶:Ll/ۛܰܿ;

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 1

    .line 512
    iget-object v0, p0, Ll/ۙ᩺ܿ;->᩶:Ll/ۛܰܿ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 515
    :cond_0
    invoke-virtual {v0}, Ll/ۛܰܿ;->ܿ()V

    .line 487
    :goto_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 488
    iget-boolean v0, p0, Ll/ۙ᩺ܿ;->᩸:Z

    if-eqz v0, :cond_1

    .line 489
    iget-object v0, p0, Ll/ۙ᩺ܿ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1}, Ljava/util/zip/CRC32;->update(I)V

    :cond_1
    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 512
    iget-object v0, p0, Ll/ۙ᩺ܿ;->᩶:Ll/ۛܰܿ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 515
    :cond_0
    invoke-virtual {v0}, Ll/ۛܰܿ;->ܿ()V

    .line 496
    :goto_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 497
    iget-boolean v0, p0, Ll/ۙ᩺ܿ;->᩸:Z

    if-eqz v0, :cond_1

    .line 498
    iget-object v0, p0, Ll/ۙ᩺ܿ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    :cond_1
    return-void
.end method

.method public final ֫()J
    .locals 2

    .line 503
    iget-object v0, p0, Ll/ۙ᩺ܿ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 507
    iput-boolean v0, p0, Ll/ۙ᩺ܿ;->᩸:Z

    return-void
.end method
