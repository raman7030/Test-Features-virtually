.class public abstract Ll/۠ۖۢ;
.super Ll/᩸ۘۢ;
.source "N5NV"


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Z)V
    .locals 9

    .line 21
    iget-object v0, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-static {v0, p1}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 27
    invoke-virtual {p0, v1}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const-string p1, "550 Invalid name or chroot violation\r\n"

    goto/16 :goto_4

    .line 31
    :cond_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p1, "451 Can\'t overwrite a directory\r\n"

    goto/16 :goto_4

    .line 35
    :cond_1
    iget-wide v4, v0, Ll/᩶ۘۢ;->ܰ:J

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-ltz v2, :cond_2

    if-eqz p2, :cond_2

    const-string p1, "555 Append can not be used after a REST command\r\n"

    goto/16 :goto_4

    .line 39
    :cond_2
    invoke-virtual {v0}, Ll/᩶ۘۢ;->ᩴ()Z

    move-result v2

    if-nez v2, :cond_3

    const-string p1, "425 Couldn\'t open data socket\r\n"

    goto/16 :goto_4

    :cond_3
    const-string v2, "150 Data socket ready\r\n"

    .line 43
    invoke-virtual {v0, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    :try_start_0
    const-string v2, "rw"

    .line 45
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz p2, :cond_4

    .line 53
    :try_start_1
    invoke-virtual {p1}, Ll/᩻ۖܽ;->length()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Ll/᩻ۖܽ;->seek(J)V

    goto :goto_0

    .line 54
    :cond_4
    iget-wide v4, v0, Ll/᩶ۘۢ;->ܰ:J

    cmp-long p2, v4, v6

    if-ltz p2, :cond_5

    .line 55
    invoke-virtual {p1, v4, v5}, Ll/᩻ۖܽ;->seek(J)V

    const-wide/16 v4, -0x1

    .line 57
    iput-wide v4, v0, Ll/᩶ۘۢ;->ܰ:J

    .line 58
    iput-wide v4, v0, Ll/᩶ۘۢ;->ۤ:J

    goto :goto_0

    .line 60
    :cond_5
    invoke-virtual {p1, v6, v7}, Ll/᩻ۖܽ;->setLength(J)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    const/high16 p2, 0x10000

    new-array p2, p2, [B

    .line 69
    :cond_6
    :goto_1
    invoke-virtual {v0, p2}, Ll/᩶ۘۢ;->֫([B)I

    move-result v2

    const/4 v4, -0x2

    if-eq v2, v4, :cond_b

    const/4 v4, -0x1

    if-eq v2, v4, :cond_c

    if-eqz v2, :cond_a

    .line 82
    :try_start_2
    invoke-virtual {v0}, Ll/᩶ۘۢ;->ܺ()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    .line 83
    invoke-virtual {p1, p2, v5, v2}, Ll/᩻ۖܽ;->write([BII)V

    goto :goto_1

    :cond_7
    const/4 v4, 0x0

    :goto_2
    if-ge v5, v2, :cond_9

    .line 88
    aget-byte v6, p2, v5

    const/16 v7, 0xd

    if-ne v6, v7, :cond_8

    sub-int v6, v5, v4

    .line 89
    invoke-virtual {p1, p2, v4, v6}, Ll/᩻ۖܽ;->write([BII)V

    add-int/lit8 v4, v5, 0x1

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    if-ge v4, v2, :cond_6

    sub-int/2addr v5, v4

    .line 97
    invoke-virtual {p1, p2, v4, v5}, Ll/᩻ۖܽ;->write([BII)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    const-string v3, "451 File IO problem\r\n"

    goto :goto_3

    :cond_a
    const-string v3, "426 Couldn\'t receive data\r\n"

    goto :goto_3

    :cond_b
    const-string v3, "425 Could not connect data socket\r\n"

    goto :goto_3

    :catch_1
    const-string v3, "451 Unable to seek in file to append\r\n"

    :cond_c
    :goto_3
    move-object v8, v3

    move-object v3, p1

    move-object p1, v8

    goto :goto_4

    :catch_2
    const-string p2, "451 Couldn\'t open file \""

    const-string v2, "\" aka \""

    .line 0
    invoke-static {p2, p1, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 48
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\" for writing\r\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_4
    if-eqz v3, :cond_d

    .line 110
    :try_start_3
    invoke-virtual {v3}, Ll/᩻ۖܽ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_5

    :catch_3
    nop

    :cond_d
    :goto_5
    if-eqz p1, :cond_e

    .line 115
    invoke-virtual {v0, p1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    goto :goto_6

    :cond_e
    const-string p1, "226 Transmission complete\r\n"

    .line 117
    invoke-virtual {v0, p1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    .line 118
    invoke-static {v1}, Ll/ܳۤܳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 120
    :goto_6
    invoke-virtual {v0}, Ll/᩶ۘۢ;->֫()V

    return-void
.end method
