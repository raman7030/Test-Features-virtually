.class public final Ll/ۗۘۜ;
.super Ljava/io/FilterOutputStream;
.source "D6WS"


# instance fields
.field public final synthetic ᩸:Ll/۬ۘۜ;


# direct methods
.method public constructor <init>(Ll/۬ۘۜ;Ljava/io/BufferedOutputStream;)V
    .locals 0

    .line 91
    iput-object p1, p0, Ll/ۗۘۜ;->᩸:Ll/۬ۘۜ;

    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 3

    .line 97
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 98
    iget-object v0, p0, Ll/ۗۘۜ;->᩸:Ll/۬ۘۜ;

    iget-object v1, v0, Ll/۬ۘۜ;->᩶:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    const v2, 0x8000

    if-ge v1, v2, :cond_0

    iget-object v0, v0, Ll/۬ۘۜ;->᩶:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :cond_0
    return-void
.end method

.method public final write([BII)V
    .locals 3

    .line 93
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 94
    iget-object v0, p0, Ll/ۗۘۜ;->᩸:Ll/۬ۘۜ;

    iget-object v0, v0, Ll/۬ۘۜ;->᩶:Ljava/io/ByteArrayOutputStream;

    const v1, 0x8000

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    return-void
.end method
