.class public final Ll/ۗ۟᩵;
.super Ljava/lang/Object;
.source "A4CU"

# interfaces
.implements Ll/᩺ܰ᩵;


# instance fields
.field public final ֫:Ll/ᩳ֫֡;


# direct methods
.method public constructor <init>(Ll/ᩳ֫֡;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ۗ۟᩵;->֫:Ll/ᩳ֫֡;

    return-void
.end method

.method public static ֫(Ll/ᩴ۟᩵;)Ll/ᩴ۟᩵;
    .locals 1

    if-eqz p0, :cond_0

    .line 148
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 149
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ۘ()Ll/ۘ۟᩵;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/ۘ۟᩵;->֫(Ll/֡۟᩵;)V

    invoke-virtual {p0}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Connection"

    .line 248
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    .line 249
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    .line 250
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    .line 251
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    .line 252
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    .line 253
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    .line 254
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    .line 255
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;
    .locals 14

    .line 53
    iget-object v0, p0, Ll/ۗ۟᩵;->֫:Ll/ᩳ֫֡;

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ᩳ֫֡;->ۧ(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 57
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 59
    new-instance v4, Ll/۫۟᩵;

    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v5

    invoke-direct {v4, v2, v3, v5, v1}, Ll/۫۟᩵;-><init>(JLl/ۡ۟᩵;Ll/ᩴ۟᩵;)V

    invoke-virtual {v4}, Ll/۫۟᩵;->֫()Ll/ۤ۟᩵;

    move-result-object v2

    .line 60
    iget-object v3, v2, Ll/ۤ۟᩵;->ۧ:Ll/ۡ۟᩵;

    .line 61
    iget-object v4, v2, Ll/ۤ۟᩵;->֫:Ll/ᩴ۟᩵;

    if-eqz v0, :cond_1

    .line 64
    invoke-interface {v0, v2}, Ll/ᩳ֫֡;->֫(Ll/ۤ۟᩵;)V

    :cond_1
    if-eqz v1, :cond_2

    if-nez v4, :cond_2

    .line 68
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v2

    invoke-static {v2}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    :cond_2
    if-nez v3, :cond_3

    if-nez v4, :cond_3

    .line 73
    new-instance v0, Ll/ۘ۟᩵;

    invoke-direct {v0}, Ll/ۘ۟᩵;-><init>()V

    .line 74
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(Ll/ۡ۟᩵;)V

    sget-object p1, Ll/ܳ۟᩵;->ۗ:Ll/ܳ۟᩵;

    .line 75
    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(Ll/ܳ۟᩵;)V

    const/16 p1, 0x1f8

    .line 76
    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(I)V

    const-string p1, "Unsatisfiable Request (only-if-cached)"

    .line 77
    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->ۧ(Ljava/lang/String;)V

    sget-object p1, Ll/᩶۟᩵;->ܽ:Ll/֡۟᩵;

    .line 78
    invoke-virtual {v0, p1}, Ll/ۘ۟᩵;->֫(Ll/֡۟᩵;)V

    const-wide/16 v1, -0x1

    .line 79
    invoke-virtual {v0, v1, v2}, Ll/ۘ۟᩵;->ۧ(J)V

    .line 80
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۘ۟᩵;->֫(J)V

    .line 81
    invoke-virtual {v0}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1

    :cond_3
    if-nez v3, :cond_4

    .line 86
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->ۘ()Ll/ۘ۟᩵;

    move-result-object p1

    .line 87
    invoke-static {v4}, Ll/ۗ۟᩵;->֫(Ll/ᩴ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۘ۟᩵;->֫(Ll/ᩴ۟᩵;)V

    .line 88
    invoke-virtual {p1}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1

    .line 93
    :cond_4
    :try_start_0
    invoke-virtual {p1, v3}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_5

    if-eqz v1, :cond_5

    .line 97
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v1

    invoke-static {v1}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    :cond_5
    const-string v1, "Content-Type"

    if-eqz v4, :cond_f

    .line 103
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    const/16 v5, 0x130

    if-ne v2, v5, :cond_e

    .line 104
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->ۘ()Ll/ۘ۟᩵;

    move-result-object v2

    .line 105
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->᩻()Ll/ۤܰ᩵;

    move-result-object v3

    invoke-virtual {p1}, Ll/ᩴ۟᩵;->᩻()Ll/ۤܰ᩵;

    move-result-object v5

    .line 219
    new-instance v6, Ll/۫ܰ᩵;

    invoke-direct {v6}, Ll/۫ܰ᩵;-><init>()V

    .line 221
    invoke-virtual {v3}, Ll/ۤܰ᩵;->ۧ()I

    move-result v7

    const/4 v8, 0x0

    :goto_1
    const-string v9, "Content-Encoding"

    const-string v10, "Content-Length"

    if-ge v8, v7, :cond_a

    .line 222
    invoke-virtual {v3, v8}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v11

    .line 223
    invoke-virtual {v3, v8}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v12

    const-string v13, "Warning"

    .line 224
    invoke-virtual {v13, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_6

    const-string v13, "1"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_3

    .line 263
    :cond_6
    invoke-virtual {v10, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_8

    .line 264
    invoke-virtual {v9, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_8

    .line 265
    invoke-virtual {v1, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_2

    .line 227
    :cond_7
    invoke-static {v11}, Ll/ۗ۟᩵;->֫(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 228
    invoke-virtual {v5, v11}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_9

    .line 229
    :cond_8
    :goto_2
    sget-object v9, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    invoke-virtual {v9, v6, v11, v12}, Ll/۠۟᩵;->֫(Ll/۫ܰ᩵;Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 233
    :cond_a
    invoke-virtual {v5}, Ll/ۤܰ᩵;->ۧ()I

    move-result v3

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v3, :cond_d

    .line 234
    invoke-virtual {v5, v7}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v8

    .line 263
    invoke-virtual {v10, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_c

    .line 264
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_c

    .line 265
    invoke-virtual {v1, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_b

    goto :goto_5

    .line 235
    :cond_b
    invoke-static {v8}, Ll/ۗ۟᩵;->֫(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    .line 236
    sget-object v11, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    invoke-virtual {v5, v7}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v6, v8, v12}, Ll/۠۟᩵;->֫(Ll/۫ܰ᩵;Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 240
    :cond_d
    invoke-virtual {v6}, Ll/۫ܰ᩵;->֫()Ll/ۤܰ᩵;

    move-result-object v1

    .line 105
    invoke-virtual {v2, v1}, Ll/ۘ۟᩵;->֫(Ll/ۤܰ᩵;)V

    .line 106
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ܶ()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ll/ۘ۟᩵;->ۧ(J)V

    .line 107
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->᩵()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ll/ۘ۟᩵;->֫(J)V

    .line 108
    invoke-static {v4}, Ll/ۗ۟᩵;->֫(Ll/ᩴ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۘ۟᩵;->֫(Ll/ᩴ۟᩵;)V

    .line 109
    invoke-static {p1}, Ll/ۗ۟᩵;->֫(Ll/ᩴ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۘ۟᩵;->ۧ(Ll/ᩴ۟᩵;)V

    .line 110
    invoke-virtual {v2}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v1

    .line 111
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/֡۟᩵;->close()V

    .line 115
    invoke-interface {v0}, Ll/ᩳ֫֡;->֫()V

    .line 116
    invoke-interface {v0, v4, v1}, Ll/ᩳ֫֡;->֫(Ll/ᩴ۟᩵;Ll/ᩴ۟᩵;)V

    return-object v1

    .line 119
    :cond_e
    invoke-virtual {v4}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v2

    invoke-static {v2}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    .line 123
    :cond_f
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ۘ()Ll/ۘ۟᩵;

    move-result-object v2

    .line 124
    invoke-static {v4}, Ll/ۗ۟᩵;->֫(Ll/ᩴ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/ۘ۟᩵;->֫(Ll/ᩴ۟᩵;)V

    .line 125
    invoke-static {p1}, Ll/ۗ۟᩵;->֫(Ll/ᩴ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/ۘ۟᩵;->ۧ(Ll/ᩴ۟᩵;)V

    .line 126
    invoke-virtual {v2}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object p1

    if-eqz v0, :cond_13

    .line 129
    invoke-static {p1}, Ll/֨֫֡;->ۧ(Ll/ᩴ۟᩵;)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-static {v3, p1}, Ll/ۤ۟᩵;->֫(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 131
    invoke-interface {v0, p1}, Ll/ᩳ֫֡;->֫(Ll/ᩴ۟᩵;)Ll/۬۟᩵;

    move-result-object v0

    if-nez v0, :cond_10

    goto :goto_6

    .line 162
    :cond_10
    invoke-interface {v0}, Ll/۬۟᩵;->ۧ()Ll/ۚᩳ֡;

    move-result-object v2

    if-nez v2, :cond_11

    goto :goto_6

    .line 165
    :cond_11
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/֡۟᩵;->᩻()Ll/ۛܽ֡;

    move-result-object v3

    .line 166
    invoke-static {v2}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object v2

    .line 168
    new-instance v4, Ll/ۙ۟᩵;

    invoke-direct {v4, v3, v0, v2}, Ll/ۙ۟᩵;-><init>(Ll/ۛܽ֡;Ll/۬۟᩵;Ll/ۤܽ֡;)V

    .line 210
    invoke-virtual {p1, v1}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 211
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡۟᩵;->ᩳ()J

    move-result-wide v1

    .line 212
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ۘ()Ll/ۘ۟᩵;

    move-result-object p1

    new-instance v3, Ll/ܶ֫֡;

    .line 213
    invoke-static {v4}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object v4

    invoke-direct {v3, v0, v1, v2, v4}, Ll/ܶ֫֡;-><init>(Ljava/lang/String;JLl/ۛܽ֡;)V

    invoke-virtual {p1, v3}, Ll/ۘ۟᩵;->֫(Ll/֡۟᩵;)V

    .line 214
    invoke-virtual {p1}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1

    .line 135
    :cond_12
    invoke-virtual {v3}, Ll/ۡ۟᩵;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۗᩳۘ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 137
    :try_start_1
    invoke-interface {v0, v3}, Ll/ᩳ֫֡;->֫(Ll/ۡ۟᩵;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_13
    :goto_6
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_14

    .line 97
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    :cond_14
    throw p1
.end method
