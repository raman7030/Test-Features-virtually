.class public final Ll/ܳۜۘ;
.super Ll/᩵᩻ۘ;
.source "O7WV"


# static fields
.field public static ᩶:Ljava/util/Hashtable;

.field public static ᩹:Ljava/util/Hashtable;


# instance fields
.field public ۠:[B

.field public ܶ:Z

.field public ᩸:Ljava/net/Socket;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Ll/ܳۜۘ;->᩶:Ljava/util/Hashtable;

    .line 49
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Ll/ܳۜۘ;->᩹:Ljava/util/Hashtable;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 115
    invoke-direct {p0}, Ll/᩵᩻ۘ;-><init>()V

    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Ll/ܳۜۘ;->ܶ:Z

    const/4 v1, 0x0

    .line 54
    iput-object v1, p0, Ll/ܳۜۘ;->᩸:Ljava/net/Socket;

    const/4 v1, 0x0

    new-array v1, v1, [B

    .line 175
    iput-object v1, p0, Ll/ܳۜۘ;->۠:[B

    const/high16 v1, 0x20000

    .line 117
    iput v1, p0, Ll/᩵᩻ۘ;->᩷:I

    .line 118
    iput v1, p0, Ll/᩵᩻ۘ;->ۜ:I

    const/16 v1, 0x4000

    .line 119
    iput v1, p0, Ll/᩵᩻ۘ;->᩻:I

    .line 121
    sget-object v1, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "x11"

    invoke-static {v2, v1}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 121
    iput-object v1, p0, Ll/᩵᩻ۘ;->ۚ:[B

    .line 123
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ܽ:Z

    return-void
.end method

.method public static ֫(Ll/۟ۢۘ;)V
    .locals 2

    .line 108
    sget-object v1, Ll/ܳۜۘ;->᩹:Ljava/util/Hashtable;

    move-object v0, v1

    monitor-enter v0

    .line 109
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    sget-object v1, Ll/ܳۜۘ;->᩶:Ljava/util/Hashtable;

    invoke-virtual {v1, p0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫([BII)V
    .locals 7

    .line 190
    iget-boolean v0, p0, Ll/ܳۜۘ;->ܶ:Z

    if-eqz v0, :cond_8

    .line 194
    :try_start_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v1
    :try_end_0
    .catch Ll/۫᩷ۘ; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    iget-object v0, p0, Ll/ܳۜۘ;->۠:[B

    array-length v2, v0

    add-int/2addr v2, p3

    new-array v3, v2, [B

    .line 179
    array-length v0, v0

    invoke-static {p1, p2, v3, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 180
    iget-object p1, p0, Ll/ܳۜۘ;->۠:[B

    array-length p2, p1

    const/4 p3, 0x0

    if-lez p2, :cond_0

    .line 181
    array-length p2, p1

    invoke-static {p1, p3, v3, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 182
    :cond_0
    iput-object v3, p0, Ll/ܳۜۘ;->۠:[B

    const/16 p1, 0x9

    if-ge v2, p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x6

    .line 206
    aget-byte p2, v3, p2

    and-int/lit16 p2, p2, 0xff

    mul-int/lit16 p2, p2, 0x100

    const/4 v0, 0x7

    aget-byte v0, v3, v0

    and-int/lit16 v0, v0, 0xff

    add-int/2addr p2, v0

    const/16 v0, 0x8

    .line 207
    aget-byte v0, v3, v0

    and-int/lit16 v0, v0, 0xff

    mul-int/lit16 v0, v0, 0x100

    aget-byte p1, v3, p1

    and-int/lit16 p1, p1, 0xff

    add-int/2addr v0, p1

    .line 209
    aget-byte p1, v3, p3

    and-int/lit16 p1, p1, 0xff

    const/16 v4, 0x42

    if-ne p1, v4, :cond_2

    goto :goto_0

    :cond_2
    const/16 v4, 0x6c

    if-ne p1, v4, :cond_3

    ushr-int/lit8 p1, p2, 0x8

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p2, p2, 0x8

    const v4, 0xff00

    and-int/2addr p2, v4

    or-int/2addr p2, p1

    ushr-int/lit8 p1, v0, 0x8

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 v0, v0, 0x8

    and-int/2addr v0, v4

    or-int/2addr v0, p1

    :cond_3
    :goto_0
    move p1, v0

    add-int/lit8 v0, p2, 0xc

    neg-int p2, p2

    and-int/lit8 p2, p2, 0x3

    add-int/2addr v0, p2

    add-int p2, v0, p1

    if-ge v2, p2, :cond_4

    :goto_1
    return-void

    .line 220
    :cond_4
    new-array p2, p1, [B

    .line 221
    invoke-static {v3, v0, p2, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 224
    sget-object v4, Ll/ܳۜۘ;->᩶:Ljava/util/Hashtable;

    move-object v0, v4

    monitor-enter v0

    .line 225
    :try_start_1
    invoke-virtual {v4, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 226
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 254
    array-length v0, v1

    const/4 v4, 0x0

    if-eq p1, v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-ge v0, p1, :cond_7

    .line 257
    aget-byte v5, p2, v0

    aget-byte v6, v1, v0

    if-eq v5, v6, :cond_6

    .line 240
    :goto_3
    iput-object v4, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    .line 241
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܽ()V

    .line 242
    iget-object p1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    invoke-virtual {p1}, Ll/᩵᩷ۘ;->֫()V

    .line 243
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۧ()V

    goto :goto_4

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 245
    :cond_7
    :goto_4
    iput-boolean p3, p0, Ll/ܳۜۘ;->ܶ:Z

    .line 246
    iget-object p1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    .line 76
    iget-object p2, p1, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    invoke-virtual {p2, v3, p3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 77
    iget-object p1, p1, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 247
    iput-object v4, p0, Ll/ܳۜۘ;->۠:[B

    return-void

    :catchall_0
    move-exception p1

    .line 226
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catch_0
    move-exception p1

    .line 196
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 250
    :cond_8
    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    .line 76
    iget-object v1, v0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 77
    iget-object p1, v0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final ۡ()V
    .locals 8

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "127.0.0.1"

    const/16 v2, 0x1770

    const/16 v3, 0x2710

    .line 135
    invoke-static {v2, v3, v1}, Ll/᩵ۡۘ;->֫(IILjava/lang/String;)Ljava/net/Socket;

    move-result-object v1

    iput-object v1, p0, Ll/ܳۜۘ;->᩸:Ljava/net/Socket;

    .line 136
    invoke-virtual {v1, v0}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 137
    new-instance v1, Ll/᩵᩷ۘ;

    .line 34
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 137
    iput-object v1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    .line 138
    iget-object v2, p0, Ll/ܳۜۘ;->᩸:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 62
    iput-object v2, v1, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    .line 139
    iget-object v1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    iget-object v2, p0, Ll/ܳۜۘ;->᩸:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    .line 44
    iput-object v2, v1, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    .line 140
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۖ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 148
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    .line 149
    new-instance v0, Ll/ܺ᩻ۘ;

    iget v1, p0, Ll/᩵᩻ۘ;->ۘ:I

    invoke-direct {v0, v1}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 150
    new-instance v1, Ll/۠ۢۘ;

    invoke-direct {v1, v0}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 153
    :try_start_1
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v2

    .line 154
    :goto_0
    iget-object v3, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    if-eqz v3, :cond_2

    iget-object v3, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    if-eqz v3, :cond_2

    iget-object v3, v3, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    if-eqz v3, :cond_2

    .line 155
    iget-object v4, v0, Ll/ܺ᩻ۘ;->֫:[B

    array-length v5, v4

    const/16 v6, 0xe

    sub-int/2addr v5, v6

    invoke-virtual {v2}, Ll/۟ۢۘ;->ܽ()I

    move-result v7

    sub-int/2addr v5, v7

    invoke-virtual {v3, v4, v6, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-gtz v3, :cond_0

    .line 157
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܽ()V

    goto :goto_1

    .line 160
    :cond_0
    iget-boolean v4, p0, Ll/᩵᩻ۘ;->֫:Z

    if-eqz v4, :cond_1

    goto :goto_1

    .line 162
    :cond_1
    invoke-virtual {v1}, Ll/۠ۢۘ;->֫()V

    const/16 v4, 0x5e

    .line 163
    invoke-virtual {v0, v4}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 164
    iget v4, p0, Ll/᩵᩻ۘ;->ܺ:I

    invoke-virtual {v0, v4}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 165
    invoke-virtual {v0, v3}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 166
    invoke-virtual {v0, v3}, Ll/ܺ᩻ۘ;->ܽ(I)V

    .line 167
    invoke-virtual {v2, v1, p0, v3}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 172
    :catch_0
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۧ()V

    return-void

    .line 142
    :catch_1
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۘ()V

    .line 143
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->֫:Z

    .line 144
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۧ()V

    return-void
.end method
