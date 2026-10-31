.class public final Ll/۠ۢܽ;
.super Ljava/lang/Thread;
.source "T5RH"


# instance fields
.field public final synthetic ᩸:Ll/᩶ۢܽ;


# direct methods
.method public constructor <init>(Ll/᩶ۢܽ;)V
    .locals 0

    .line 87
    iput-object p1, p0, Ll/۠ۢܽ;->᩸:Ll/᩶ۢܽ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const/4 v1, 0x0

    .line 92
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v2, p0, Ll/۠ۢܽ;->᩸:Ll/᩶ۢܽ;

    iget-object v2, v2, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    invoke-virtual {v2}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ᩷ܽ;

    invoke-virtual {v2}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    const-string v2, "accept"

    const-string v3, "*/*"

    .line 94
    invoke-virtual {v0, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "connection"

    const-string v3, "Keep-Alive"

    .line 95
    invoke-virtual {v0, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "user-agent"

    const-string v3, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/46.0.2486.0"

    .line 96
    invoke-virtual {v0, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1388

    .line 97
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 98
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 99
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 100
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_1

    .line 102
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 103
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    invoke-direct {v3, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/16 v4, 0x400

    new-array v4, v4, [B

    .line 106
    :goto_0
    invoke-virtual {v2, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-lez v5, :cond_0

    .line 107
    invoke-virtual {v3, v4, v1, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 109
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    goto :goto_1

    :cond_1
    new-array v2, v1, [B

    .line 113
    :goto_1
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    new-array v2, v1, [B

    .line 117
    :goto_2
    iget-object v3, p0, Ll/۠ۢܽ;->᩸:Ll/᩶ۢܽ;

    move-object v0, v3

    .line 56
    monitor-enter v0

    .line 57
    :try_start_1
    iget-object v4, v3, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    if-eqz v4, :cond_2

    .line 58
    new-instance v4, Ll/ۨ᩷ܽ;

    invoke-direct {v4}, Ll/ۨ᩷ܽ;-><init>()V

    .line 59
    invoke-virtual {v4, v2}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/Object;)V

    .line 60
    iget-object v2, v3, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    invoke-virtual {v2, v4}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    .line 61
    iput-boolean v1, v3, Ll/᩶ۢܽ;->ۧ:Z

    const/4 v1, 0x0

    .line 62
    iput-object v1, v3, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    .line 64
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
