.class public final Ll/۠ۖ֡;
.super Ljava/io/FilterOutputStream;
.source "N399"


# instance fields
.field public final ᩸:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljava/net/Socket;Ljava/io/OutputStream;)V
    .locals 0

    .line 42
    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 43
    iput-object p1, p0, Ll/۠ۖ֡;->᩸:Ljava/net/Socket;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 53
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    .line 54
    iget-object v0, p0, Ll/۠ۖ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 68
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method
