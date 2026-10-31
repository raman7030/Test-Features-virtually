.class public final Ll/ܰۡ֡;
.super Ljava/io/OutputStream;
.source "J2K4"


# static fields
.field public static final ᩸:Ll/ܰۡ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Ll/ܰۡ֡;

    .line 51
    invoke-direct {v0}, Ljava/io/OutputStream;-><init>()V

    .line 38
    sput-object v0, Ll/ܰۡ֡;->᩸:Ll/ܰۡ֡;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 2

    .line 62
    new-instance v0, Ljava/io/IOException;

    const-string v1, "flush() failed: stream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final write(I)V
    .locals 1

    .line 86
    new-instance p1, Ljava/io/IOException;

    const-string v0, "write(int) failed: stream is closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)V
    .locals 0

    .line 75
    new-instance p1, Ljava/io/IOException;

    const-string p2, "write(byte[], int, int) failed: stream is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
