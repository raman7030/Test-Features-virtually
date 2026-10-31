.class public final Ll/ۙۚ᩵;
.super Ljava/lang/Object;
.source "A9ZK"


# static fields
.field public static final ֫:Ll/֫᩻֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 59
    const-class v0, Ll/ۙۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۙۚ᩵;->֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/۬ۚ᩵;)Ll/ۚۡ᩵;
    .locals 11

    .line 607
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    .line 190
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۢ()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    sget-object v2, Ll/ۙۚ᩵;->֫:Ll/֫᩻֨;

    if-eqz v1, :cond_4

    .line 194
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->֫()Ll/ۘۡ᩵;

    move-result-object v0
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_2

    .line 202
    invoke-interface {v0}, Ll/ۘۡ᩵;->֫()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 614
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_2

    .line 617
    new-instance v1, Ll/۬ۚ᩵;

    invoke-direct {v1, p0, v0}, Ll/۬ۚ᩵;-><init>(Ll/۬ۚ᩵;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0

    .line 203
    :try_start_2
    invoke-virtual {v1}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 204
    :try_start_3
    invoke-virtual {v0}, Ll/ۘ֨᩵;->᩸()Z

    move-result v2

    if-nez v2, :cond_0

    .line 207
    new-instance v2, Ll/ۢۚ᩵;

    new-instance v3, Ll/᩷ۚ᩵;

    invoke-direct {v3, p0, v0}, Ll/᩷ۚ᩵;-><init>(Ll/۬ۚ᩵;Ll/ۘ֨᩵;)V

    .line 36
    invoke-direct {v2, p0, v3}, Ll/᩻ۚ᩵;-><init>(Ll/۬ۚ᩵;Ll/ۚۡ᩵;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 208
    :try_start_4
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 209
    invoke-virtual {v1}, Ll/۬ۚ᩵;->close()V

    return-object v2

    .line 205
    :cond_0
    :try_start_5
    new-instance p0, Ll/֡֨᩵;

    invoke-direct {p0}, Ll/֡֨᩵;-><init>()V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_1

    .line 203
    :try_start_6
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_7
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p0

    .line 202
    :try_start_8
    invoke-virtual {v1}, Ll/۬ۚ᩵;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0

    .line 615
    :cond_2
    :try_start_9
    new-instance p0, Ll/ۗۚ᩵;

    const-string v0, "Name must not be empty"

    invoke-direct {p0, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_9
    .catch Ljava/net/MalformedURLException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/net/UnknownHostException; {:try_start_9 .. :try_end_9} :catch_0

    :catch_0
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    .line 622
    :goto_2
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Failed to resolve child element"

    invoke-direct {v0, v1, p0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :catch_2
    move-exception p0

    .line 196
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_3

    const-string v0, "Failed to find master browser"

    .line 197
    invoke-interface {v2, v0, p0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 198
    new-instance p0, Ll/֡֨᩵;

    invoke-direct {p0}, Ll/֡֨᩵;-><init>()V

    throw p0

    .line 200
    :cond_3
    throw p0

    .line 210
    :cond_4
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۜ()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_7

    .line 211
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v0

    .line 212
    :try_start_a
    invoke-virtual {v0}, Ll/ۘ֨᩵;->᩸()Z

    move-result v1

    if-nez v1, :cond_5

    .line 215
    new-instance v1, Ll/ۢۚ᩵;

    new-instance v2, Ll/᩷ۚ᩵;

    invoke-direct {v2, p0, v0}, Ll/᩷ۚ᩵;-><init>(Ll/۬ۚ᩵;Ll/ۘ֨᩵;)V

    .line 36
    invoke-direct {v1, p0, v2}, Ll/᩻ۚ᩵;-><init>(Ll/۬ۚ᩵;Ll/ۚۡ᩵;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 216
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V

    return-object v1

    .line 213
    :cond_5
    :try_start_b
    new-instance p0, Ll/֡֨᩵;

    invoke-direct {p0}, Ll/֡֨᩵;-><init>()V

    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception p0

    if-eqz v0, :cond_6

    .line 211
    :try_start_c
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_3
    throw p0

    .line 570
    :cond_7
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_11

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x1

    if-gt v1, v3, :cond_11

    .line 118
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->clone()Ll/ᩳ֨᩵;

    move-result-object v0

    .line 119
    invoke-virtual {p0}, Ll/۬ۚ᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v1

    .line 120
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۢ()Ljava/net/URL;

    move-result-object v4

    .line 124
    invoke-virtual {v4}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x2f

    invoke-virtual {v5, v6}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    invoke-virtual {v4}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v3

    if-ne v5, v6, :cond_10

    .line 127
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۜ()I

    move-result v5

    const/4 v6, 0x4

    if-ne v5, v6, :cond_f

    .line 130
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 132
    invoke-interface {v1}, Ll/ᩴۡ᩵;->ᩳ()Ll/ܶۡ᩵;

    move-result-object v6

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object v7

    check-cast v6, Ll/ܰ֡᩵;

    invoke-virtual {v6, v7, v1}, Ll/ܰ֡᩵;->ۧ(Ljava/lang/String;Ll/ᩴۡ᩵;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_9

    .line 138
    :try_start_d
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->֫()Ll/ۘۡ᩵;

    move-result-object v6

    invoke-static {v1, v0, v6}, Ll/ۙۚ᩵;->֫(Ll/ᩴۡ᩵;Ll/ۛۡ᩵;Ll/ۘۡ᩵;)[Ll/ܳۚ᩵;

    move-result-object v6

    const/4 v8, 0x0

    .line 139
    :goto_4
    array-length v9, v6

    if-ge v8, v9, :cond_9

    .line 140
    aget-object v9, v6, v8

    .line 141
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    .line 142
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3

    :cond_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :catch_3
    move-exception v6

    const-string v8, "DS enumeration failed"

    .line 146
    invoke-interface {v2, v8, v6}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 150
    :cond_9
    sget v6, Ll/ۖ֨᩵;->ۜ:I

    .line 91
    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    new-instance v6, Ll/ۖ֨᩵;

    invoke-direct {v6, v1}, Ll/ۖ֨᩵;-><init>(Ll/ᩴۡ᩵;)V

    .line 151
    :try_start_e
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ܿ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v0, v8}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ljava/lang/String;)Ll/ۘ֨᩵;

    move-result-object v6
    :try_end_e
    .catch Ll/ۗۚ᩵; {:try_start_e .. :try_end_e} :catch_6
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_5

    .line 152
    :try_start_f
    invoke-virtual {v6}, Ll/ۘ֨᩵;->ᩴ()Ll/᩻֨᩵;

    move-result-object v8
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    .line 153
    :try_start_10
    invoke-virtual {v8}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v9
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 155
    :try_start_11
    invoke-virtual {v9}, Ll/᩷֨᩵;->ۙ()Ll/ۘۡ᩵;

    move-result-object v10

    invoke-static {v1, v0, v10}, Ll/ۙۚ᩵;->ۧ(Ll/ᩴۡ᩵;Ll/ۛۡ᩵;Ll/ۘۡ᩵;)[Ll/ܳۚ᩵;

    move-result-object v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_4
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    goto :goto_5

    :catchall_6
    move-exception p0

    goto :goto_6

    :catch_4
    move-exception v0

    .line 157
    :try_start_12
    invoke-virtual {v6}, Ll/ۘ֨᩵;->᩸()Z

    move-result v1

    if-nez v1, :cond_d

    const-string v1, "doMsrpcShareEnum failed"

    .line 160
    invoke-interface {v2, v1, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 105
    new-instance v0, Ll/֫ᩴ᩵;

    invoke-virtual {v6}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 106
    new-instance v1, Ll/ۧᩴ᩵;

    invoke-virtual {v6}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v10

    invoke-direct {v1, v10}, Ll/ۧᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v10, v7, [Ll/֡ۚ᩵;

    .line 107
    invoke-virtual {v6, v0, v1, v10}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 108
    invoke-virtual {v1}, Ll/ܿᩴ᩵;->ۘ֫()I

    move-result v0

    if-nez v0, :cond_c

    .line 111
    invoke-virtual {v1}, Ll/ܿᩴ᩵;->ۖ֫()[Ll/ܳۚ᩵;

    move-result-object v0

    .line 163
    :goto_5
    array-length v1, v0

    if-ge v7, v1, :cond_b

    .line 164
    aget-object v1, v0, v7

    .line 165
    invoke-virtual {v5, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 166
    invoke-virtual {v5, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 122
    :cond_b
    :try_start_13
    invoke-virtual {v9}, Ll/۟֨᩵;->ۘ()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 213
    :try_start_14
    invoke-virtual {v8}, Ll/᩻֨᩵;->᩸()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 170
    :try_start_15
    invoke-virtual {v6}, Ll/ۘ֨᩵;->close()V
    :try_end_15
    .catch Ll/ۗۚ᩵; {:try_start_15 .. :try_end_15} :catch_6
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_5

    .line 176
    new-instance v0, Ll/᩸ۚ᩵;

    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/᩸ۚ᩵;-><init>(Ll/۬ۚ᩵;Ljava/util/Iterator;)V

    return-object v0

    .line 109
    :cond_c
    :try_start_16
    new-instance p0, Ll/ۗۚ᩵;

    invoke-virtual {v1}, Ll/ܿᩴ᩵;->ۘ֫()I

    move-result v0

    invoke-direct {p0, v0, v3}, Ll/ۗۚ᩵;-><init>(IZ)V

    throw p0

    .line 158
    :cond_d
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 122
    :goto_6
    :try_start_17
    invoke-virtual {v9}, Ll/۟֨᩵;->ۘ()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_7

    goto :goto_7

    :catchall_7
    move-exception v0

    .line 151
    :try_start_18
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw p0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_8

    :catchall_8
    move-exception p0

    if-eqz v8, :cond_e

    .line 213
    :try_start_19
    invoke-virtual {v8}, Ll/᩻֨᩵;->᩸()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    goto :goto_8

    :catchall_9
    move-exception v0

    .line 151
    :try_start_1a
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_e
    :goto_8
    throw p0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_a

    :catchall_a
    move-exception p0

    :try_start_1b
    invoke-virtual {v6}, Ll/ۘ֨᩵;->close()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_b

    goto :goto_9

    :catchall_b
    move-exception v0

    :try_start_1c
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw p0
    :try_end_1c
    .catch Ll/ۗۚ᩵; {:try_start_1c .. :try_end_1c} :catch_6
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_5

    :catch_5
    move-exception p0

    const-string v0, "doNetShareEnum failed"

    .line 173
    invoke-interface {v2, v0, p0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 174
    new-instance v0, Ll/ۗۚ᩵;

    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :catch_6
    move-exception p0

    .line 171
    throw p0

    .line 128
    :cond_f
    new-instance p0, Ll/ۗۚ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "The requested list operations is invalid: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p0

    .line 125
    :cond_10
    new-instance p0, Ll/ۗۚ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " directory must end with \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p0

    .line 221
    :cond_11
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v0

    .line 222
    :try_start_1d
    invoke-virtual {v0}, Ll/ۘ֨᩵;->᩸()Z

    move-result v1

    if-eqz v1, :cond_12

    .line 223
    new-instance v1, Ll/֫ۚ᩵;

    new-instance v2, Ll/ܽۚ᩵;

    .line 56
    invoke-direct {v2, p0, v0}, Ll/ᩳۚ᩵;-><init>(Ll/۬ۚ᩵;Ll/ۘ֨᩵;)V

    .line 37
    invoke-direct {v1, p0, v2}, Ll/᩻ۚ᩵;-><init>(Ll/۬ۚ᩵;Ll/ۚۡ᩵;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_c

    .line 226
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V

    return-object v1

    .line 225
    :cond_12
    :try_start_1e
    new-instance v1, Ll/֫ۚ᩵;

    new-instance v2, Ll/ۧۚ᩵;

    .line 47
    invoke-direct {v2, p0, v0}, Ll/ᩳۚ᩵;-><init>(Ll/۬ۚ᩵;Ll/ۘ֨᩵;)V

    .line 37
    invoke-direct {v1, p0, v2}, Ll/᩻ۚ᩵;-><init>(Ll/۬ۚ᩵;Ll/ۚۡ᩵;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_c

    .line 226
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V

    return-object v1

    :catchall_c
    move-exception p0

    if-eqz v0, :cond_13

    .line 221
    :try_start_1f
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_d

    goto :goto_a

    :catchall_d
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_13
    :goto_a
    throw p0
.end method

.method public static ֫(Ll/ᩴۡ᩵;Ll/ۛۡ᩵;Ll/ۘۡ᩵;Ljava/lang/String;)Ll/ܺܺ᩵;
    .locals 3

    .line 71
    check-cast p1, Ll/ᩳ֨᩵;

    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 72
    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ܽ()I

    move-result p1

    const/16 v1, 0x1bd

    if-eq p1, v1, :cond_0

    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 76
    :cond_0
    invoke-interface {p2}, Ll/ۘۡ᩵;->֫()Ljava/lang/String;

    move-result-object p1

    const-string p2, "[endpoint="

    const-string v1, ",address="

    const-string v2, "ncacn_np:"

    .line 0
    invoke-static {v2, v0, p2, p3, v1}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, "]"

    invoke-static {p2, p1, p3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 76
    sget p2, Ll/ܺܺ᩵;->ۤ:I

    .line 203
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 204
    new-instance p2, Ll/ܺܺ᩵;

    invoke-direct {p2, p1, p0}, Ll/ܺܺ᩵;-><init>(Ljava/lang/String;Ll/ᩴۡ᩵;)V

    return-object p2

    .line 206
    :cond_1
    new-instance p0, Ll/ۢܺ᩵;

    const-string p2, "DCERPC transport not supported: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 58
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 206
    throw p0
.end method

.method public static ֫(Ll/ᩴۡ᩵;Ll/ۛۡ᩵;Ll/ۘۡ᩵;)[Ll/ܳۚ᩵;
    .locals 3

    const-string v0, "\\PIPE\\netdfs"

    .line 81
    invoke-static {p0, p1, p2, v0}, Ll/ۙۚ᩵;->֫(Ll/ᩴۡ᩵;Ll/ۛۡ᩵;Ll/ۘۡ᩵;Ljava/lang/String;)Ll/ܺܺ᩵;

    move-result-object p0

    .line 82
    :try_start_0
    new-instance p2, Ll/ۘܺ᩵;

    check-cast p1, Ll/ᩳ֨᩵;

    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ۘܺ᩵;-><init>(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0, p2}, Ll/ܺܺ᩵;->֫(Ll/ۡܺ᩵;)V

    .line 84
    iget p1, p2, Ll/ۘܺ᩵;->᩺:I

    if-nez p1, :cond_1

    .line 40
    iget-object p1, p2, Ll/ۘܺ᩵;->ۤ:Ll/֨ܺ᩵;

    iget-object p1, p1, Ll/֨ܺ᩵;->֫:Ll/ۛܺ᩵;

    check-cast p1, Ll/ۚܺ᩵;

    .line 41
    iget p2, p1, Ll/ۚܺ᩵;->֫:I

    new-array p2, p2, [Ll/ܽᩴ᩵;

    const/4 v0, 0x0

    .line 42
    :goto_0
    iget v1, p1, Ll/ۚܺ᩵;->֫:I

    if-ge v0, v1, :cond_0

    .line 43
    new-instance v1, Ll/ܽᩴ᩵;

    iget-object v2, p1, Ll/ۚܺ᩵;->ۧ:[Ll/ܶܺ᩵;

    aget-object v2, v2, v0

    iget-object v2, v2, Ll/ܶܺ᩵;->֫:Ljava/lang/String;

    invoke-direct {v1, v2}, Ll/ܽᩴ᩵;-><init>(Ljava/lang/String;)V

    aput-object v1, p2, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p0}, Ll/ܺܺ᩵;->close()V

    return-object p2

    .line 85
    :cond_1
    :try_start_1
    new-instance p1, Ll/ۗۚ᩵;

    iget p2, p2, Ll/ۘܺ᩵;->᩺:I

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Ll/ۗۚ᩵;-><init>(IZ)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 81
    :try_start_2
    invoke-virtual {p0}, Ll/ܺܺ᩵;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public static ۧ(Ll/ᩴۡ᩵;Ll/ۛۡ᩵;Ll/ۘۡ᩵;)[Ll/ܳۚ᩵;
    .locals 1

    const-string v0, "\\PIPE\\srvsvc"

    .line 93
    invoke-static {p0, p1, p2, v0}, Ll/ۙۚ᩵;->֫(Ll/ᩴۡ᩵;Ll/ۛۡ᩵;Ll/ۘۡ᩵;Ljava/lang/String;)Ll/ܺܺ᩵;

    move-result-object p0

    .line 94
    :try_start_0
    new-instance p2, Ll/᩵ܺ᩵;

    check-cast p1, Ll/ᩳ֨᩵;

    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/᩵ܺ᩵;-><init>(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p0, p2}, Ll/ܺܺ᩵;->֫(Ll/ۡܺ᩵;)V

    .line 96
    iget p1, p2, Ll/᩸ܺ᩵;->᩺:I

    if-nez p1, :cond_0

    .line 99
    invoke-virtual {p2}, Ll/᩵ܺ᩵;->ܽ()[Ll/ܳۚ᩵;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    invoke-virtual {p0}, Ll/ܺܺ᩵;->close()V

    return-object p1

    .line 97
    :cond_0
    :try_start_1
    new-instance p1, Ll/ۗۚ᩵;

    iget p2, p2, Ll/᩸ܺ᩵;->᩺:I

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Ll/ۗۚ᩵;-><init>(IZ)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 93
    :try_start_2
    invoke-virtual {p0}, Ll/ܺܺ᩵;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method
