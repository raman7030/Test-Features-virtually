.class public final Ll/ۧ᩵ۜ;
.super Ljava/lang/Object;
.source "W6LP"

# interfaces
.implements Ll/᩵ۖۜ;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۧ:Ll/ܿ᩵ۜ;

.field public final synthetic ܽ:Ll/ᩳܰۡ;


# direct methods
.method public constructor <init>(Ll/ᩳܰۡ;Ll/ܿ᩵ۜ;Ljava/lang/String;)V
    .locals 0

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩵ۜ;->ܽ:Ll/ᩳܰۡ;

    iput-object p2, p0, Ll/ۧ᩵ۜ;->ۧ:Ll/ܿ᩵ۜ;

    iput-object p3, p0, Ll/ۧ᩵ۜ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟ۢۜ;)V
    .locals 1

    .line 288
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 289
    iget-object v0, p0, Ll/ۧ᩵ۜ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 4

    .line 271
    :try_start_0
    iget-object v0, p0, Ll/ۧ᩵ۜ;->ܽ:Ll/ᩳܰۡ;

    iget-object v1, p0, Ll/ۧ᩵ۜ;->ۧ:Ll/ܿ᩵ۜ;

    invoke-static {v1}, Ll/ܿ᩵ۜ;->ܽ(Ll/ܿ᩵ۜ;)Ll/ۗ᩺ۡ;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۢ᩵ۜ;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ll/ۜ᩵ۜ; {:try_start_0 .. :try_end_0} :catch_0

    .line 272
    :try_start_1
    new-instance v1, Ljava/io/BufferedOutputStream;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/high16 p1, 0x10000

    :try_start_2
    new-array p1, p1, [B

    .line 275
    :cond_0
    :goto_0
    invoke-static {}, Ll/ۚ᩵ۜ;->֫()V

    .line 276
    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-gez v3, :cond_1

    .line 280
    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ll/ۜ᩵ۜ; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :cond_1
    if-lez v3, :cond_0

    .line 278
    :try_start_5
    invoke-virtual {v1, p1, v2, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 271
    :try_start_6
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_7
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_8
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    :try_start_9
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_9
    .catch Ll/ۜ᩵ۜ; {:try_start_9 .. :try_end_9} :catch_0

    :catch_0
    move-exception p1

    .line 281
    iget-object p1, p1, Ll/ۜ᩵ۜ;->᩸:Ljava/io/IOException;

    invoke-static {p1}, Ll/ۢ᩵ۜ;->֫(Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method
