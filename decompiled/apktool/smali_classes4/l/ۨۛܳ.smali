.class public final Ll/ۨۛܳ;
.super Ll/ܰܺܳ;
.source "X8F9"


# instance fields
.field public ۙ:Ll/۫ۛܳ;

.field public ᩶:J

.field public final ᩹:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ll/ܰܺܳ;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 30
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;
    .locals 0

    .line 75
    iget-object p1, p0, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1

    .line 77
    :try_start_0
    check-cast p2, Ll/۫ۛܳ;

    invoke-virtual {p2}, Ll/۫ۛܳ;->ᩳ()Ll/ܺۨܳ;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/ܺۨܳ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    .line 79
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 80
    throw p2
.end method

.method public final ֫(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 1

    .line 152
    iget-object p2, p0, Ll/ۨۛܳ;->ۙ:Ll/۫ۛܳ;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 153
    invoke-virtual {p0, p2}, Ll/ۨۛܳ;->֫(Z)V

    .line 155
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    iget-object v0, p0, Ll/ۨۛܳ;->ۙ:Ll/۫ۛܳ;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 157
    :cond_1
    iget-object p1, p0, Ll/ۨۛܳ;->ۙ:Ll/۫ۛܳ;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object p2
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩳۜܳ;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/ۨۛܳ;->ۙ:Ll/۫ۛܳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 135
    invoke-virtual {p0, v0}, Ll/ۨۛܳ;->֫(Z)V

    .line 137
    :cond_0
    iget-object v0, p0, Ll/ۨۛܳ;->ۙ:Ll/۫ۛܳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 138
    iget-object p1, p0, Ll/ۨۛܳ;->ۙ:Ll/۫ۛܳ;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ᩳۜܳ;)Ll/᩵ۤܳ;
    .locals 4

    .line 87
    new-instance v0, Ll/᩵ۛۡ;

    iget-object v1, p0, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ll/᩵ۛۡ;-><init>(J)V

    .line 88
    new-instance v2, Ll/ۛۛܳ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ll/ۛۛܳ;-><init>(Ljava/io/InputStream;Ll/᩵ۛۡ;)V

    .line 104
    :try_start_0
    check-cast p1, Ll/۫ۛܳ;

    invoke-virtual {p1}, Ll/۫ۛܳ;->ᩳ()Ll/ܺۨܳ;

    move-result-object p1

    invoke-virtual {p1, v2}, Ll/ܺۨܳ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    new-instance v1, Ll/᩵ۤܳ;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Ll/᩵ۤܳ;-><init>(Ljava/io/InputStream;Ll/᩵ۛۡ;Z)V

    return-object v1

    :catch_0
    move-exception p1

    .line 106
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 107
    throw p1
.end method

.method public final ֫(Ljava/security/MessageDigest;)V
    .locals 2

    const-string v0, "compress"

    .line 145
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 146
    iget-object v0, p0, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 147
    iget-wide v0, p0, Ll/ۨۛܳ;->᩶:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ۗ᩻ܳ;)V
    .locals 2

    .line 114
    invoke-virtual {p0, p2}, Ll/ۨۛܳ;->֫(Ll/ᩳۜܳ;)Ll/᩵ۤܳ;

    move-result-object p1

    .line 119
    :try_start_0
    invoke-virtual {p1}, Ll/᩵ۤܳ;->֫()Ll/᩵ۛۡ;

    move-result-object p2

    new-instance v0, Ll/ᩳۡܳ;

    invoke-direct {v0, p3}, Ll/ᩳۡܳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    const p2, 0x19000

    new-array p2, p2, [B

    .line 122
    :cond_0
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 123
    invoke-interface {p3, v0, p2}, Ll/ۗ᩻ܳ;->֫(I[B)V

    .line 124
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p2

    .line 114
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 16

    move-object/from16 v1, p0

    const-string v0, "r"

    .line 49
    iget-object v2, v1, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v3

    .line 50
    :try_start_0
    invoke-static {}, Ll/ܺۨܳ;->ۧ()[B

    move-result-object v0

    .line 169
    array-length v4, v0

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v4, v0}, Ll/᩻ۖܽ;->ۧ(II[B)I

    move-result v4

    .line 52
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v7

    .line 54
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v10

    .line 55
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v14

    .line 57
    invoke-static {}, Ll/ܺۨܳ;->values()[Ll/ܺۨܳ;

    move-result-object v6

    array-length v8, v6

    :goto_0
    if-ge v5, v8, :cond_1

    aget-object v9, v6, v5

    .line 58
    invoke-virtual {v9, v0, v4}, Ll/ܺۨܳ;->֫([BI)Z

    move-result v12

    if-eqz v12, :cond_0

    .line 60
    invoke-virtual {v9, v3}, Ll/ܺۨܳ;->֫(Ll/۠ۖܽ;)J

    move-result-wide v4

    move-object v0, v9

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const-wide/16 v4, -0x1

    const/4 v0, 0x0

    :goto_1
    move-wide v8, v4

    if-eqz v0, :cond_2

    .line 67
    new-instance v2, Ll/۫ۛܳ;

    move-object v6, v2

    move-wide v12, v14

    move-wide v4, v14

    move-object v14, v0

    invoke-direct/range {v6 .. v14}, Ll/۫ۛܳ;-><init>(Ljava/lang/String;JJJLl/ܺۨܳ;)V

    iput-object v2, v1, Ll/ۨۛܳ;->ۙ:Ll/۫ۛܳ;

    .line 68
    iput-wide v4, v1, Ll/ۨۛܳ;->᩶:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    invoke-virtual {v3}, Ll/᩻ۖܽ;->close()V

    return-void

    .line 65
    :cond_2
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unknown format file: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 49
    :try_start_2
    invoke-virtual {v3}, Ll/᩻ۖܽ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ll/۫ۛܳ;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۨۛܳ;->ۙ:Ll/۫ۛܳ;

    return-object v0
.end method

.method public final ۜ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const-string v0, "compress"

    return-object v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 179
    iget-object v0, p0, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    return v0
.end method

.method public final ᩵()Z
    .locals 5

    .line 175
    iget-wide v0, p0, Ll/ۨۛܳ;->᩶:J

    iget-object v2, p0, Ll/ۨۛܳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
