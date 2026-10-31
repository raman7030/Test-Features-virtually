.class public final Ll/ۘ֡ܿ;
.super Ll/ۤ᩵ܿ;
.source "R6YJ"


# instance fields
.field public final ۧ:Ll/ܺ֡ܿ;


# direct methods
.method public constructor <init>(Ll/ܺ֡ܿ;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Ll/ۤ᩵ܿ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 25
    iput-object p1, p0, Ll/ۘ֡ܿ;->ۧ:Ll/ܺ֡ܿ;

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/io/File;)Ll/۫᩵ܿ;
    .locals 9

    .line 230
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lbin/mt/plus/Features3;->ܽ(Ljava/lang/String;)[J

    move-result-object p1
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x0

    .line 242
    aget-wide v0, p1, v0

    long-to-int v1, v0

    sget v0, Landroid/system/OsConstants;->S_IFMT:I

    and-int/2addr v0, v1

    .line 243
    sget v1, Landroid/system/OsConstants;->S_IFREG:I

    if-ne v0, v1, :cond_0

    .line 244
    sget-object v0, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    :goto_0
    move-object v3, v0

    goto :goto_1

    .line 245
    :cond_0
    sget v1, Landroid/system/OsConstants;->S_IFDIR:I

    if-ne v0, v1, :cond_1

    .line 246
    sget-object v0, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    goto :goto_0

    .line 248
    :cond_1
    sget-object v0, Ll/ۗ᩵ܿ;->ۗ:Ll/ۗ᩵ܿ;

    goto :goto_0

    .line 250
    :goto_1
    sget-object v0, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v3, v0, :cond_2

    const-wide/16 v0, -0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x1

    aget-wide v0, p1, v0

    :goto_2
    move-wide v4, v0

    const/4 v0, 0x2

    .line 251
    aget-wide v6, p1, v0

    .line 252
    new-instance p1, Ll/۫᩵ܿ;

    const/4 v8, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v1 .. v8}, Ll/۫᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ۗ᩵ܿ;JJLjava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    move-object v6, p1

    .line 237
    new-instance p1, Ll/᩹᩵ܿ;

    sget-object v1, Ll/۬᩵ܿ;->ۛ:Ll/۬᩵ܿ;

    sget-object v2, Ll/᩸᩵ܿ;->ۛ:Ll/᩸᩵ܿ;

    .line 238
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Checked file operation STAT failed for "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v0}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v5

    const/4 v4, 0x0

    move-object v0, p1

    .line 239
    invoke-direct/range {v0 .. v6}, Ll/᩹᩵ܿ;-><init>(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 232
    :goto_3
    iget v0, p1, Landroid/system/ErrnoException;->errno:I

    sget v1, Landroid/system/OsConstants;->ENOENT:I

    if-ne v0, v1, :cond_3

    .line 233
    invoke-static {p0}, Ll/۫᩵ܿ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object p0

    return-object p0

    .line 235
    :cond_3
    sget-object v0, Ll/۬᩵ܿ;->ۛ:Ll/۬᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;Landroid/system/ErrnoException;)Ll/᩹᩵ܿ;

    move-result-object p0

    throw p0
.end method

.method private ֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩹᩵ܿ;
    .locals 8

    .line 271
    new-instance v7, Ll/᩹᩵ܿ;

    sget-object v2, Ll/᩸᩵ܿ;->ۛ:Ll/᩸᩵ܿ;

    .line 272
    iget-object v0, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Checked file operation "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " failed for "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    invoke-static {v0, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v5

    move-object v0, v7

    move-object v1, p1

    move-object v4, p2

    move-object v6, p3

    .line 273
    invoke-direct/range {v0 .. v6}, Ll/᩹᩵ܿ;-><init>(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v7
.end method

.method private ֫(Ll/۫᩵ܿ;Ll/ۗ᩵ܿ;Ll/۬᩵ܿ;)V
    .locals 4

    .line 257
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    if-eq v0, v1, :cond_2

    .line 261
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object p1

    if-eq p1, p2, :cond_1

    .line 262
    sget-object p1, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne p2, p1, :cond_0

    .line 263
    sget-object p1, Ll/᩸᩵ܿ;->۬:Ll/᩸᩵ܿ;

    goto :goto_0

    .line 264
    :cond_0
    sget-object p1, Ll/᩸᩵ܿ;->ۤ:Ll/᩸᩵ܿ;

    .line 265
    :goto_0
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p1, p2, v2}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object p1

    throw p1

    :cond_1
    return-void

    .line 258
    :cond_2
    sget-object p1, Ll/᩸᩵ܿ;->۫:Ll/᩸᩵ܿ;

    .line 259
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    .line 258
    invoke-static {p3, p1, p2, v2}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object p1

    throw p1
.end method

.method private ֫(Ll/ܺ֡ܿ;Ll/۬᩵ܿ;)V
    .locals 5

    .line 192
    iget-object v0, p0, Ll/ۘ֡ܿ;->ۧ:Ll/ܺ֡ܿ;

    invoke-virtual {v0, p1}, Ll/ܺ֡ܿ;->ܽ(Ll/ܶ᩵ܿ;)J

    move-result-wide v1

    .line 202
    :try_start_0
    iget-object v0, v0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p1, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/system/Os;->rename(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 208
    iget-object p1, p1, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-gez p2, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    :try_start_1
    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setLastModified(J)Z

    move-result p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p2, :cond_1

    :goto_0
    return-void

    .line 46
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return-void

    .line 43
    :catch_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-void

    :catch_1
    move-exception v0

    .line 206
    invoke-virtual {p1}, Ll/ܺ֡ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1, v0}, Ll/ۘ֡ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩹᩵ܿ;

    move-result-object p1

    throw p1

    :catch_2
    move-exception v0

    .line 204
    iget-object v1, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܺ֡ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v1, p1, v0}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;Landroid/system/ErrnoException;)Ll/᩹᩵ܿ;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;
    .locals 1

    .line 30
    sget-object v0, Ll/ۖ֡ܿ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p1}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p1

    .line 35
    :pswitch_0
    sget-object p1, Ll/ۙ᩵ܿ;->᩶:Ll/ۙ᩵ܿ;

    return-object p1

    .line 32
    :pswitch_1
    sget-object p1, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    return-object p1

    .line 31
    :pswitch_2
    sget-object p1, Ll/ۙ᩵ܿ;->ۙ:Ll/ۙ᩵ܿ;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 6

    .line 160
    sget-object v0, Ll/۬᩵ܿ;->۫:Ll/۬᩵ܿ;

    .line 184
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    iget-object v2, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    if-eqz v1, :cond_2

    .line 188
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩷()Ll/ܺ֡ܿ;

    move-result-object v1

    .line 161
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    .line 177
    invoke-virtual {p0}, Ll/ۘ֡ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v4

    sget-object v5, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-eq v4, v5, :cond_1

    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    new-instance v3, Ll/ۘ֡ܿ;

    invoke-direct {v3, v1}, Ll/ۘ֡ܿ;-><init>(Ll/ܺ֡ܿ;)V

    .line 162
    invoke-virtual {v3}, Ll/ۘ֡ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    if-ne v3, v5, :cond_0

    .line 166
    invoke-direct {p0, v1, v0}, Ll/ۘ֡ܿ;->֫(Ll/ܺ֡ܿ;Ll/۬᩵ܿ;)V

    return-void

    .line 163
    :cond_0
    sget-object v1, Ll/᩸᩵ܿ;->᩹:Ll/᩸᩵ܿ;

    .line 164
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    .line 163
    invoke-static {v0, v1, v2, p1}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object p1

    throw p1

    .line 178
    :cond_1
    sget-object p1, Ll/᩸᩵ܿ;->۫:Ll/᩸᩵ܿ;

    .line 179
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    .line 178
    invoke-static {v0, p1, v1, v3}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object p1

    throw p1

    .line 185
    :cond_2
    sget-object v1, Ll/᩸᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    .line 186
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    .line 185
    invoke-static {v0, v1, v2, p1}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object p1

    throw p1
.end method

.method public final ۜ()Ll/۫᩵ܿ;
    .locals 2

    .line 60
    iget-object v0, p0, Ll/ۘ֡ܿ;->ۧ:Ll/ܺ֡ܿ;

    iget-object v1, v0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-static {v0, v1}, Ll/ۘ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/io/File;)Ll/۫᩵ܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 4

    const/4 v0, 0x0

    .line 107
    :try_start_0
    iget-object v1, p0, Ll/ۘ֡ܿ;->ۧ:Ll/ܺ֡ܿ;

    iget-object v1, v1, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x1ff

    invoke-static {v1, v2}, Landroid/system/Os;->mkdir(Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 112
    sget-object v2, Ll/۬᩵ܿ;->᩹:Ll/۬᩵ܿ;

    invoke-direct {p0, v2, v0, v1}, Ll/ۘ֡ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v1

    .line 109
    sget-object v2, Ll/۬᩵ܿ;->᩹:Ll/۬᩵ܿ;

    iget-object v3, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    .line 110
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    .line 109
    invoke-static {v2, v3, v0, v1}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;Landroid/system/ErrnoException;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)V
    .locals 5

    .line 171
    sget-object v0, Ll/۬᩵ܿ;->ۤ:Ll/۬᩵ܿ;

    .line 184
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    iget-object v2, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    if-eqz v1, :cond_1

    .line 188
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩷()Ll/ܺ֡ܿ;

    move-result-object v1

    .line 172
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    .line 177
    invoke-virtual {p0}, Ll/ۘ֡ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    sget-object v4, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-eq v3, v4, :cond_0

    .line 173
    invoke-direct {p0, v1, v0}, Ll/ۘ֡ܿ;->֫(Ll/ܺ֡ܿ;Ll/۬᩵ܿ;)V

    return-void

    .line 178
    :cond_0
    sget-object v1, Ll/᩸᩵ܿ;->۫:Ll/᩸᩵ܿ;

    .line 179
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 178
    invoke-static {v0, v1, v2, p1}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object p1

    throw p1

    .line 185
    :cond_1
    sget-object v1, Ll/᩸᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    .line 186
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    .line 185
    invoke-static {v0, v1, v2, p1}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object p1

    throw p1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 9

    .line 65
    iget-object v0, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ۘ֡ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    sget-object v3, Ll/۬᩵ܿ;->۬:Ll/۬᩵ܿ;

    invoke-direct {p0, v1, v2, v3}, Ll/ۘ֡ܿ;->֫(Ll/۫᩵ܿ;Ll/ۗ᩵ܿ;Ll/۬᩵ܿ;)V

    .line 68
    :try_start_0
    iget-object v1, p0, Ll/ۘ֡ܿ;->ۧ:Ll/ܺ֡ܿ;

    iget-object v1, v1, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_2

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 83
    invoke-static {v4}, Ll/ܿ֡ܿ;->֫(Ljava/io/File;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 84
    invoke-static {v5, v4}, Ll/ۘ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/io/File;)Ll/۫᩵ܿ;

    move-result-object v4

    .line 86
    invoke-virtual {v4}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v5

    sget-object v6, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-eq v5, v6, :cond_0

    .line 87
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    .line 75
    :cond_2
    sget-object v1, Ll/᩸᩵ܿ;->ۗ:Ll/᩸᩵ܿ;

    .line 76
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 75
    invoke-static {v3, v1, v0, v2}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0

    :catch_0
    move-exception v1

    move-object v8, v1

    .line 70
    new-instance v1, Ll/᩹᩵ܿ;

    sget-object v3, Ll/۬᩵ܿ;->۬:Ll/۬᩵ܿ;

    sget-object v4, Ll/᩸᩵ܿ;->ۛ:Ll/᩸᩵ܿ;

    .line 71
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "Checked file operation LIST failed for "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v2}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v7

    const/4 v6, 0x0

    move-object v2, v1

    .line 72
    invoke-direct/range {v2 .. v8}, Ll/᩹᩵ܿ;-><init>(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ܽ()V
    .locals 5

    .line 43
    iget-object v0, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Ll/ۘ֡ܿ;->ۧ:Ll/ܺ֡ܿ;

    iget-object v2, v2, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 44
    :cond_0
    sget-object v2, Ll/۬᩵ܿ;->᩶:Ll/۬᩵ܿ;

    sget-object v3, Ll/᩸᩵ܿ;->᩹:Ll/᩸᩵ܿ;

    .line 45
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    .line 44
    invoke-static {v2, v3, v4, v1}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object v2

    throw v2
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 54
    sget-object v2, Ll/۬᩵ܿ;->᩶:Ll/۬᩵ܿ;

    invoke-direct {p0, v2, v1, v0}, Ll/ۘ֡ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v2

    .line 51
    sget-object v3, Ll/۬᩵ܿ;->᩶:Ll/۬᩵ܿ;

    .line 52
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 51
    invoke-static {v3, v0, v1, v2}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/io/IOException;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    .line 49
    throw v0
.end method

.method public final ܿ()V
    .locals 5

    .line 118
    invoke-virtual {p0}, Ll/ۘ֡ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    iget-object v3, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    const/4 v4, 0x0

    if-eq v1, v2, :cond_1

    .line 123
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v0, v1, :cond_0

    .line 132
    :try_start_0
    iget-object v0, p0, Ll/ۘ֡ܿ;->ۧ:Ll/ܺ֡ܿ;

    iget-object v0, v0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/system/Os;->remove(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 137
    sget-object v1, Ll/۬᩵ܿ;->ۗ:Ll/۬᩵ܿ;

    invoke-direct {p0, v1, v4, v0}, Ll/ۘ֡ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 134
    sget-object v1, Ll/۬᩵ܿ;->ۗ:Ll/۬᩵ܿ;

    .line 135
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 134
    invoke-static {v1, v2, v4, v0}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;Landroid/system/ErrnoException;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0

    .line 124
    :cond_0
    sget-object v0, Ll/۬᩵ܿ;->ۗ:Ll/۬᩵ܿ;

    sget-object v1, Ll/᩸᩵ܿ;->ۤ:Ll/᩸᩵ܿ;

    .line 125
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 124
    invoke-static {v0, v1, v2, v4}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0

    .line 120
    :cond_1
    sget-object v0, Ll/۬᩵ܿ;->ۗ:Ll/۬᩵ܿ;

    sget-object v1, Ll/᩸᩵ܿ;->۫:Ll/᩸᩵ܿ;

    .line 121
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 120
    invoke-static {v0, v1, v2, v4}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0
.end method

.method public final ᩳ()V
    .locals 4

    .line 143
    invoke-virtual {p0}, Ll/ۘ֡ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    sget-object v2, Ll/۬᩵ܿ;->ۙ:Ll/۬᩵ܿ;

    invoke-direct {p0, v0, v1, v2}, Ll/ۘ֡ܿ;->֫(Ll/۫᩵ܿ;Ll/ۗ᩵ܿ;Ll/۬᩵ܿ;)V

    const/4 v0, 0x0

    .line 149
    :try_start_0
    iget-object v1, p0, Ll/ۘ֡ܿ;->ۧ:Ll/ܺ֡ܿ;

    iget-object v1, v1, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/system/Os;->remove(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 154
    sget-object v2, Ll/۬᩵ܿ;->ۙ:Ll/۬᩵ܿ;

    invoke-direct {p0, v2, v0, v1}, Ll/ۘ֡ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/SecurityException;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v1

    .line 151
    sget-object v2, Ll/۬᩵ܿ;->ۙ:Ll/۬᩵ܿ;

    iget-object v3, p0, Ll/ۤ᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    .line 152
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    .line 151
    invoke-static {v2, v3, v0, v1}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;Landroid/system/ErrnoException;)Ll/᩹᩵ܿ;

    move-result-object v0

    throw v0
.end method
