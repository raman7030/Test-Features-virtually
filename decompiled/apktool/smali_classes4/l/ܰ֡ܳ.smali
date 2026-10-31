.class public Ll/ܰ֡ܳ;
.super Ll/ۛܶۢ;
.source "698T"


# instance fields
.field public ۖ֫:Ljava/lang/String;

.field public ܺ֫:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 121
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    return-void
.end method

.method public static ֫([BLjava/lang/String;[B)Ljava/lang/String;
    .locals 1

    .line 173
    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    .line 174
    invoke-static {p2}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p2

    .line 175
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n\u2714 "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 178
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n\u2718 "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 1

    .line 184
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 185
    iget-boolean p2, p0, Ll/ܰ֡ܳ;->ܺ֫:Z

    if-eqz p2, :cond_0

    .line 186
    iget-object p2, p0, Ll/ܰ֡ܳ;->ۖ֫:Ljava/lang/String;

    const-string p3, "title"

    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string p4, "saveAsPath"

    invoke-virtual {p0, p4}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const/4 v0, 0x0

    .line 323
    invoke-static {p1, p2, p3, p4, v0}, Ll/ܶۖᩳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const p1, 0x7f1206ed

    .line 188
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "saveAsPath"

    .line 132
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2d

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 127
    sget-object v0, Ll/᩻ܶۢ;->ܽ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 14

    const-string v0, "inputPath1"

    .line 144
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "inputPath2"

    .line 145
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 146
    new-instance v2, Ll/᩵ۛۡ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v5

    add-long/2addr v5, v3

    invoke-direct {v2, v5, v6}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v3, Ll/ۘ᩹ܽ;

    const/4 v4, 0x5

    invoke-direct {v3, v4, p0}, Ll/ۘ᩹ܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 147
    invoke-static {}, Ll/۠ܺܽ;->ۧ()Ll/ܶܺܽ;

    move-result-object v3

    invoke-static {}, Ll/۠ܺܽ;->ܽ()Ll/ܶܺܽ;

    move-result-object v4

    invoke-static {}, Ll/۠ܺܽ;->ᩳ()Ll/ܶܺܽ;

    move-result-object v5

    invoke-static {}, Ll/۠ܺܽ;->֫()Ll/ܶܺܽ;

    move-result-object v6

    const/4 v7, 0x4

    new-array v8, v7, [Ll/ܶܺܽ;

    const/4 v9, 0x0

    aput-object v3, v8, v9

    const/4 v3, 0x1

    aput-object v4, v8, v3

    const/4 v4, 0x2

    aput-object v5, v8, v4

    const/4 v5, 0x3

    aput-object v6, v8, v5

    .line 148
    new-instance v6, Ll/ۚܺܽ;

    invoke-direct {v6, v8}, Ll/ۚܺܽ;-><init>([Ll/ܶܺܽ;)V

    .line 149
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 150
    :try_start_1
    invoke-virtual {v6, v10, v2}, Ll/ۚܺܽ;->֫(Ljava/io/InputStream;Ll/᩵ۛۡ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    if-eqz v10, :cond_0

    .line 151
    :try_start_2
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    :cond_0
    invoke-virtual {v6}, Ll/ۚܺܽ;->close()V

    .line 152
    invoke-static {}, Ll/۠ܺܽ;->ۧ()Ll/ܶܺܽ;

    move-result-object v6

    invoke-static {}, Ll/۠ܺܽ;->ܽ()Ll/ܶܺܽ;

    move-result-object v10

    invoke-static {}, Ll/۠ܺܽ;->ᩳ()Ll/ܶܺܽ;

    move-result-object v11

    invoke-static {}, Ll/۠ܺܽ;->֫()Ll/ܶܺܽ;

    move-result-object v12

    new-array v13, v7, [Ll/ܶܺܽ;

    aput-object v6, v13, v9

    aput-object v10, v13, v3

    aput-object v11, v13, v4

    aput-object v12, v13, v5

    .line 153
    new-instance v6, Ll/ۚܺܽ;

    invoke-direct {v6, v13}, Ll/ۚܺܽ;-><init>([Ll/ܶܺܽ;)V

    .line 154
    :try_start_3
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 155
    :try_start_4
    invoke-virtual {v6, v10, v2}, Ll/ۚܺܽ;->֫(Ljava/io/InputStream;Ll/᩵ۛۡ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v10, :cond_1

    .line 156
    :try_start_5
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_1
    invoke-virtual {v6}, Ll/ۚܺܽ;->close()V

    .line 157
    aget-object v2, v8, v9

    invoke-interface {v2}, Ll/ܶܺܽ;->֫()[B

    move-result-object v2

    aget-object v6, v8, v3

    invoke-interface {v6}, Ll/ܶܺܽ;->֫()[B

    move-result-object v6

    aget-object v10, v8, v4

    invoke-interface {v10}, Ll/ܶܺܽ;->֫()[B

    move-result-object v10

    aget-object v8, v8, v5

    invoke-interface {v8}, Ll/ܶܺܽ;->֫()[B

    move-result-object v8

    new-array v11, v7, [[B

    aput-object v2, v11, v9

    aput-object v6, v11, v3

    aput-object v10, v11, v4

    aput-object v8, v11, v5

    .line 158
    aget-object v2, v13, v9

    invoke-interface {v2}, Ll/ܶܺܽ;->֫()[B

    move-result-object v2

    aget-object v6, v13, v3

    invoke-interface {v6}, Ll/ܶܺܽ;->֫()[B

    move-result-object v6

    aget-object v8, v13, v4

    invoke-interface {v8}, Ll/ܶܺܽ;->֫()[B

    move-result-object v8

    aget-object v10, v13, v5

    invoke-interface {v10}, Ll/ܶܺܽ;->֫()[B

    move-result-object v10

    new-array v7, v7, [[B

    aput-object v2, v7, v9

    aput-object v6, v7, v3

    aput-object v8, v7, v4

    aput-object v10, v7, v5

    .line 159
    invoke-static {v11, v7}, Ljava/util/Arrays;->deepEquals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v6, v2, 0x1

    iput-boolean v6, p0, Ll/ܰ֡ܳ;->ܺ֫:Z

    if-nez v2, :cond_2

    .line 161
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v1, v11, v9

    aget-object v6, v7, v9

    const-string v8, "[MD5]"

    .line 163
    invoke-static {v1, v8, v6}, Ll/ܰ֡ܳ;->֫([BLjava/lang/String;[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v1, v11, v3

    aget-object v3, v7, v3

    const-string v6, "[SHA1]"

    .line 164
    invoke-static {v1, v6, v3}, Ll/ܰ֡ܳ;->֫([BLjava/lang/String;[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v1, v11, v4

    aget-object v3, v7, v4

    const-string v4, "[SHA256]"

    .line 165
    invoke-static {v1, v4, v3}, Ll/ܰ֡ܳ;->֫([BLjava/lang/String;[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v11, v5

    aget-object v1, v7, v5

    const-string v3, "[CRC32]"

    .line 166
    invoke-static {v0, v3, v1}, Ll/ܰ֡ܳ;->֫([BLjava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܰ֡ܳ;->ۖ֫:Ljava/lang/String;

    .line 169
    :cond_2
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    if-eqz v10, :cond_3

    .line 153
    :try_start_6
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_7
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_8
    invoke-virtual {v6}, Ll/ۚܺܽ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0

    :catchall_4
    move-exception v0

    if-eqz v10, :cond_4

    .line 148
    :try_start_9
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception v1

    :try_start_a
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    move-exception v0

    :try_start_b
    invoke-virtual {v6}, Ll/ۚܺܽ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    goto :goto_3

    :catchall_7
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 195
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const-string v0, "title"

    .line 137
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    const v0, 0x7f1207a7

    .line 138
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܿ(I)V

    return-void
.end method
