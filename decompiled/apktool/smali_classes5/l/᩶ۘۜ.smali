.class public final Ll/᩶ۘۜ;
.super Ljava/lang/Object;
.source "P6W3"

# interfaces
.implements Ll/ۢۖۜ;


# instance fields
.field public final synthetic ᩸:[J

.field public final synthetic ᩹:[B


# direct methods
.method public constructor <init>([J[B)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۘۜ;->᩸:[J

    iput-object p2, p0, Ll/᩶ۘۜ;->᩹:[B

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    .line 68
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    return-void
.end method

.method public final ֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V
    .locals 8

    .line 60
    iget-wide v0, p1, Ll/ܶۖۜ;->ܽ:J

    iget-object v2, p0, Ll/᩶ۘۜ;->᩸:[J

    const/4 v3, 0x0

    aput-wide v0, v2, v3

    .line 61
    iget-object v2, p0, Ll/᩶ۘۜ;->᩹:[B

    array-length v3, v2

    const-wide v4, 0x1fffffffffffffL

    sub-long/2addr v4, v0

    int-to-long v6, v3

    cmp-long v3, v4, v6

    if-ltz v3, :cond_2

    .line 62
    invoke-virtual {p1}, Ll/ܶۖۜ;->֫()Ljava/io/InputStream;

    move-result-object p1

    const/4 v3, 0x1

    .line 63
    :try_start_0
    invoke-static {p1, p2, v0, v1, v3}, Ll/᩸ܺۜ;->֫(Ljava/io/InputStream;Ljava/io/BufferedOutputStream;JZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 64
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 65
    :cond_0
    invoke-virtual {p2, v2}, Ljava/io/OutputStream;->write([B)V

    .line 66
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_1

    .line 62
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p2

    :cond_2
    const-string p1, "Appended bytes exceed the supported final file size."

    .line 63
    invoke-static {p1, v4, v5, v6, v7}, Ll/ۛᩴۜ;->֫(Ljava/lang/String;JJ)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method
