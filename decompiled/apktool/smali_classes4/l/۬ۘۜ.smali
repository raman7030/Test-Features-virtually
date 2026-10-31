.class public final Ll/۬ۘۜ;
.super Ljava/lang/Object;
.source "D6WS"

# interfaces
.implements Ll/ۢۖۜ;


# instance fields
.field public final synthetic ۙ:[B

.field public final synthetic ᩶:Ljava/io/ByteArrayOutputStream;

.field public final synthetic ᩸:[Ll/ܶܺۜ;

.field public final synthetic ᩹:Ll/ܿۘۜ;


# direct methods
.method public constructor <init>([BLjava/io/ByteArrayOutputStream;[Ll/ܶܺۜ;Ll/ܿۘۜ;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۘۜ;->ۙ:[B

    iput-object p2, p0, Ll/۬ۘۜ;->᩶:Ljava/io/ByteArrayOutputStream;

    iput-object p3, p0, Ll/۬ۘۜ;->᩸:[Ll/ܶܺۜ;

    iput-object p4, p0, Ll/۬ۘۜ;->᩹:Ll/ܿۘۜ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    .line 108
    invoke-static {}, Ll/᩸ܺۜ;->֫()V

    return-void
.end method

.method public final ֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V
    .locals 8

    .line 88
    iget-wide v0, p1, Ll/ܶۖۜ;->ܽ:J

    iget-object v7, p0, Ll/۬ۘۜ;->ۙ:[B

    array-length v2, v7

    const-wide v3, 0x1fffffffffffffL

    sub-long/2addr v3, v0

    int-to-long v0, v2

    cmp-long v2, v3, v0

    if-ltz v2, :cond_2

    .line 89
    :try_start_0
    invoke-virtual {p1}, Ll/ܶۖۜ;->֫()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ll/֨ܺۜ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    :try_start_1
    new-instance v3, Ll/ۗۘۜ;

    invoke-direct {v3, p0, p2}, Ll/ۗۘۜ;-><init>(Ll/۬ۘۜ;Ljava/io/BufferedOutputStream;)V

    .line 101
    iget-object p2, p0, Ll/۬ۘۜ;->᩸:[Ll/ܶܺۜ;

    iget-wide v4, p1, Ll/ܶۖۜ;->ܽ:J

    iget-object v6, p0, Ll/۬ۘۜ;->᩹:Ll/ܿۘۜ;

    move-object v2, v0

    invoke-static/range {v2 .. v7}, Ll/᩸ܺۜ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ܿۘۜ;[B)Ll/ܶܺۜ;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, p2, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    .line 102
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ll/֨ܺۜ; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_1

    .line 89
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
    :try_end_4
    .catch Ll/֨ܺۜ; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    const/4 p1, 0x0

    .line 53
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string v0, "FILE_TEXT_DECODE_FAILED"

    const-string v1, "The original file is not valid complete text in the selected encoding."

    const-string v2, "warning"

    .line 52
    invoke-static {v0, v1, v2, p1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 105
    throw p1

    :catch_1
    move-exception p1

    .line 103
    iget-object p1, p1, Ll/֨ܺۜ;->᩸:Ll/ۗۛ᩻;

    throw p1

    :cond_2
    const-string p1, "Appended bytes exceed the supported final file size."

    .line 63
    invoke-static {p1, v3, v4, v0, v1}, Ll/ۛᩴۜ;->֫(Ljava/lang/String;JJ)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method
