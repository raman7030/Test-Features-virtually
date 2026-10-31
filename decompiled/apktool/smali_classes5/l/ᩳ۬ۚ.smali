.class public final Ll/ᩳ۬ۚ;
.super Ll/֫۬ۚ;
.source "Y7BG"


# instance fields
.field public final ᩳ:Ljava/io/InputStream;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    sget-object v0, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 32
    invoke-direct {p0}, Ll/֫۬ۚ;-><init>()V

    .line 33
    iput-object v0, p0, Ll/ᩳ۬ۚ;->ᩳ:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "stdin/stdin"

    return-object v0
.end method

.method public final ܽ()V
    .locals 5

    .line 38
    iget-object v0, p0, Ll/֫۬ۚ;->֫:[B

    if-nez v0, :cond_1

    .line 39
    iget-object v0, p0, Ll/ᩳ۬ۚ;->ᩳ:Ljava/io/InputStream;

    const v1, 0x8000

    :try_start_0
    new-array v1, v1, [B

    .line 46
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 48
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-lez v3, :cond_0

    const/4 v4, 0x0

    .line 49
    invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    iput-object v0, p0, Ll/֫۬ۚ;->֫:[B

    return-void

    :catch_0
    move-exception v0

    .line 53
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    return-void
.end method
