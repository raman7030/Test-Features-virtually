.class public final Ll/ܰܿ֫;
.super Ll/ۤܿ֫;
.source "057Y"


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 8000
    invoke-direct {p0, p1}, Ll/ۤܿ֫;-><init>(Ljava/io/InputStream;)V

    .line 8001
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8009
    iget-object p1, p0, Ll/ۤܿ֫;->᩹:Ljava/io/DataInputStream;

    const v0, 0x7fffffff

    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    return-void

    .line 8002
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 7989
    invoke-direct {p0, p1}, Ll/ۤܿ֫;-><init>([B)V

    .line 7992
    iget-object p1, p0, Ll/ۤܿ֫;->᩹:Ljava/io/DataInputStream;

    const v0, 0x7fffffff

    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    return-void
.end method


# virtual methods
.method public final seek(J)V
    .locals 4

    .line 8017
    iget v0, p0, Ll/ۤܿ֫;->ۙ:I

    int-to-long v1, v0

    cmp-long v3, v1, p1

    if-lez v3, :cond_0

    const/4 v0, 0x0

    .line 8018
    iput v0, p0, Ll/ۤܿ֫;->ۙ:I

    .line 8019
    iget-object v0, p0, Ll/ۤܿ֫;->᩹:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    goto :goto_0

    :cond_0
    int-to-long v0, v0

    sub-long/2addr p1, v0

    :goto_0
    long-to-int p2, p1

    .line 8023
    invoke-virtual {p0, p2}, Ll/ۤܿ֫;->֫(I)V

    return-void
.end method
