.class public final Ll/ۘ۟ۡ;
.super Ljava/io/OutputStream;
.source "M8BF"


# instance fields
.field public ᩸:Ll/᩸ۨ᩵;

.field public final ᩹:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 13
    iput-object p1, p0, Ll/ۘ۟ۡ;->᩹:Ljava/io/OutputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۘ۟ۡ;->᩸:Ll/᩸ۨ᩵;

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {v0}, Ll/᩸ۨ᩵;->close()V

    return-void

    .line 49
    :cond_0
    iget-object v0, p0, Ll/ۘ۟ۡ;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۘ۟ۡ;->᩸:Ll/᩸ۨ᩵;

    if-eqz v0, :cond_0

    .line 38
    invoke-virtual {v0}, Ll/᩸ۨ᩵;->flush()V

    return-void

    .line 40
    :cond_0
    iget-object v0, p0, Ll/ۘ۟ۡ;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 2

    .line 18
    iget-object v0, p0, Ll/ۘ۟ۡ;->᩸:Ll/᩸ۨ᩵;

    if-nez v0, :cond_0

    .line 19
    new-instance v0, Ll/᩸ۨ᩵;

    iget-object v1, p0, Ll/ۘ۟ۡ;->᩹:Ljava/io/OutputStream;

    invoke-direct {v0, v1}, Ll/᩸ۨ᩵;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Ll/ۘ۟ۡ;->᩸:Ll/᩸ۨ᩵;

    .line 21
    :cond_0
    iget-object v0, p0, Ll/ۘ۟ۡ;->᩸:Ll/᩸ۨ᩵;

    invoke-virtual {v0, p1}, Ll/᩸ۨ᩵;->write(I)V

    return-void
.end method

.method public final write([BII)V
    .locals 2

    if-nez p3, :cond_0

    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Ll/ۘ۟ۡ;->᩸:Ll/᩸ۨ᩵;

    if-nez v0, :cond_1

    .line 30
    new-instance v0, Ll/᩸ۨ᩵;

    iget-object v1, p0, Ll/ۘ۟ۡ;->᩹:Ljava/io/OutputStream;

    invoke-direct {v0, v1}, Ll/᩸ۨ᩵;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Ll/ۘ۟ۡ;->᩸:Ll/᩸ۨ᩵;

    .line 32
    :cond_1
    iget-object v0, p0, Ll/ۘ۟ۡ;->᩸:Ll/᩸ۨ᩵;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩸ۨ᩵;->write([BII)V

    return-void
.end method
