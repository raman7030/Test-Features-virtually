.class public final Ll/֨ۖ֡;
.super Ljava/io/FilterInputStream;
.source "131S"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩸:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljava/net/Socket;Ljava/io/InputStream;)V
    .locals 0

    .line 42
    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 43
    iput-object p1, p0, Ll/֨ۖ֡;->᩸:Ljava/net/Socket;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 53
    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V

    .line 54
    iget-object v0, p0, Ll/֨ۖ֡;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
