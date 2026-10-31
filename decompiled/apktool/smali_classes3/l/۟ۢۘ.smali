.class public final Ll/۟ۢۘ;
.super Ljava/lang/Object;
.source "HAFC"


# static fields
.field public static final ֫ۧ:[B

.field public static ۧۧ:Ll/᩹ۢۘ;


# instance fields
.field public final ֡:Ljava/util/ArrayList;

.field public ֡֫:Ll/᩻ۜۘ;

.field public ֨:[I

.field public ֨֫:Ll/֨ۢۘ;

.field public ֫:[B

.field public ֫֫:Ll/᩷ۜۘ;

.field public ۖ:Ll/ܺ᩻ۘ;

.field public ۖ֫:Ll/۠ۢۘ;

.field public ۗ:Z

.field public ۗ֫:[B

.field public ۘ:Ll/᩻ۜۘ;

.field public ۘ֫:[B

.field public volatile ۙ:Z

.field public volatile ۙ֫:[Ljava/lang/String;

.field public final ۚ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public ۚ֫:I

.field public ۛ:[Ljava/lang/String;

.field public ۛ֫:Ll/ۛۢۘ;

.field public ۜ:[B

.field public volatile ۜ֫:J

.field public volatile ۟:Z

.field public ۟֫:Z

.field public ۠:Ljava/util/Hashtable;

.field public ۠֫:[B

.field public ۡ:Z

.field public ۡ֫:I

.field public ۢ:[B

.field public ۢ֫:Ljava/lang/Runnable;

.field public ۤ:Ll/ܰۢۘ;

.field public ۤ֫:Ll/ۨۢۘ;

.field public ۧ:[B

.field public volatile ۧ֫:Z

.field public ۨ:Ljava/lang/String;

.field public ۨ֫:[I

.field public ۫:Z

.field public volatile ۫֫:Z

.field public ۬:Z

.field public ۬֫:Ljava/net/Socket;

.field public volatile ܰ:Z

.field public ܰ֫:Ljava/lang/String;

.field public ܳ:[B

.field public ܳ֫:Ll/᩶᩷ۘ;

.field public ܶ:Ljava/lang/Thread;

.field public ܶ֫:[B

.field public ܺ:I

.field public volatile ܺ֫:[Ljava/lang/String;

.field public ܽ:[B

.field public ܽ֫:Ll/᩵᩷ۘ;

.field public ܿ:[B

.field public volatile ܿ֫:Z

.field public ᩳ:[B

.field public volatile ᩳ֫:Z

.field public ᩴ:I

.field public ᩴ֫:I

.field public ᩵:Ll/֨ۢۘ;

.field public ᩵֫:Z

.field public volatile ᩶:Z

.field public ᩶֫:I

.field public ᩷:[B

.field public ᩷֫:Ljava/lang/Object;

.field public ᩸:Ll/᩷ۜۘ;

.field public ᩸֫:I

.field public ᩹:Z

.field public ᩹֫:I

.field public ᩺:Ll/ۘ᩷ۘ;

.field public ᩺֫:Ll/ᩴۡۘ;

.field public ᩻:[B

.field public ᩻֫:Ll/۟ۢۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 3054
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "keepalive@jcraft.com"

    .line 393
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 3054
    sput-object v0, Ll/۟ۢۘ;->֫ۧ:[B

    const-string v0, "no-more-sessions@openssh.com"

    .line 3066
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    return-void
.end method

.method public constructor <init>(Ll/᩶᩷ۘ;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SSH-2.0-JSCH_2.27.6"

    .line 397
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 87
    iput-object v0, p0, Ll/۟ۢۘ;->᩷:[B

    const/4 v0, 0x0

    .line 104
    iput v0, p0, Ll/۟ۢۘ;->᩸֫:I

    .line 105
    iput v0, p0, Ll/۟ۢۘ;->᩹֫:I

    const/4 v1, 0x0

    .line 107
    iput-object v1, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    .line 123
    iput-boolean v0, p0, Ll/۟ۢۘ;->ܿ֫:Z

    .line 125
    iput-boolean v0, p0, Ll/۟ۢۘ;->᩶:Z

    const/4 v2, 0x1

    .line 126
    iput-boolean v2, p0, Ll/۟ۢۘ;->۬:Z

    .line 127
    iput-boolean v2, p0, Ll/۟ۢۘ;->ۗ:Z

    .line 129
    iput-boolean v2, p0, Ll/۟ۢۘ;->ۧ֫:Z

    .line 130
    iput-boolean v0, p0, Ll/۟ۢۘ;->ۙ:Z

    .line 131
    iput-boolean v2, p0, Ll/۟ۢۘ;->۫:Z

    .line 132
    iput-boolean v0, p0, Ll/۟ۢۘ;->᩵֫:Z

    .line 134
    iput-boolean v0, p0, Ll/۟ۢۘ;->ᩳ֫:Z

    .line 136
    iput-object v1, p0, Ll/۟ۢۘ;->ܶ:Ljava/lang/Thread;

    .line 137
    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Ll/۟ۢۘ;->᩷֫:Ljava/lang/Object;

    .line 139
    iput-boolean v0, p0, Ll/۟ۢۘ;->۟֫:Z

    .line 140
    iput-boolean v0, p0, Ll/۟ۢۘ;->ۡ:Z

    .line 152
    iput-object v1, p0, Ll/۟ۢۘ;->۠:Ljava/util/Hashtable;

    .line 159
    iput v2, p0, Ll/۟ۢۘ;->᩶֫:I

    .line 163
    iput-object v1, p0, Ll/۟ۢۘ;->ۙ֫:[Ljava/lang/String;

    .line 164
    iput-boolean v0, p0, Ll/۟ۢۘ;->۫֫:Z

    const-wide/16 v3, 0x0

    .line 168
    iput-wide v3, p0, Ll/۟ۢۘ;->ۜ֫:J

    const/4 v3, 0x6

    .line 170
    iput v3, p0, Ll/۟ۢۘ;->ۡ֫:I

    .line 171
    iput v0, p0, Ll/۟ۢۘ;->ܺ:I

    const-string v3, "127.0.0.1"

    .line 173
    iput-object v3, p0, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    const/16 v3, 0x16

    .line 175
    iput v3, p0, Ll/۟ۢۘ;->ᩴ֫:I

    .line 177
    iput-object v1, p0, Ll/۟ۢۘ;->ܰ֫:Ljava/lang/String;

    .line 178
    iput-object v1, p0, Ll/۟ۢۘ;->ۘ֫:[B

    .line 188
    new-instance v3, Ll/ۛۢۘ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Ll/۟ۢۘ;->ۛ֫:Ll/ۛۢۘ;

    .line 190
    iput-boolean v0, p0, Ll/۟ۢۘ;->᩹:Z

    .line 191
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Ll/۟ۢۘ;->֡:Ljava/util/ArrayList;

    .line 192
    new-instance v3, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v3, p0, Ll/۟ۢۘ;->ۚ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 722
    iput-boolean v0, p0, Ll/۟ۢۘ;->ܰ:Z

    .line 723
    iput-boolean v0, p0, Ll/۟ۢۘ;->۟:Z

    .line 724
    iput-object v1, p0, Ll/۟ۢۘ;->ܺ֫:[Ljava/lang/String;

    new-array v0, v2, [I

    .line 1171
    iput-object v0, p0, Ll/۟ۢۘ;->ۨ֫:[I

    new-array v0, v2, [I

    .line 1172
    iput-object v0, p0, Ll/۟ۢۘ;->֨:[I

    const/16 v0, 0x8

    .line 1174
    iput v0, p0, Ll/۟ۢۘ;->ۚ֫:I

    .line 1175
    iput v0, p0, Ll/۟ۢۘ;->ᩴ:I

    .line 2704
    new-instance v0, Ll/ܰۢۘ;

    invoke-direct {v0}, Ll/ܰۢۘ;-><init>()V

    iput-object v0, p0, Ll/۟ۢۘ;->ۤ:Ll/ܰۢۘ;

    .line 3078
    iput-object v1, p0, Ll/۟ۢۘ;->᩺:Ll/ۘ᩷ۘ;

    .line 205
    iput-object p1, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    .line 206
    new-instance p1, Ll/ܺ᩻ۘ;

    invoke-direct {p1}, Ll/ܺ᩻ۘ;-><init>()V

    iput-object p1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    .line 207
    new-instance v0, Ll/۠ۢۘ;

    invoke-direct {v0, p1}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    iput-object v0, p0, Ll/۟ۢۘ;->ۖ֫:Ll/۠ۢۘ;

    .line 208
    iput-object p2, p0, Ll/۟ۢۘ;->ܰ֫:Ljava/lang/String;

    .line 209
    iput-object p3, p0, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    .line 210
    iput p4, p0, Ll/۟ۢۘ;->ᩴ֫:I

    if-nez p2, :cond_0

    const-string p1, "user.name"

    .line 516
    :try_start_0
    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    :catch_0
    iput-object v1, p0, Ll/۟ۢۘ;->ܰ֫:Ljava/lang/String;

    .line 218
    :cond_0
    iget-object p1, p0, Ll/۟ۢۘ;->ܰ֫:Ljava/lang/String;

    if-eqz p1, :cond_1

    return-void

    .line 219
    :cond_1
    new-instance p1, Ll/۫᩷ۘ;

    const-string p2, "username is not given."

    .line 39
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 219
    throw p1
.end method

.method private ֫(I)Ll/᩵᩻ۘ;
    .locals 4

    .line 1178
    iget-object v0, p0, Ll/۟ۢۘ;->ۚ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    .line 1179
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 1181
    :try_start_0
    iget-object v1, p0, Ll/۟ۢۘ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵᩻ۘ;

    .line 1182
    iget v3, v2, Ll/᩵᩻ۘ;->ܿ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, p1, :cond_0

    .line 1187
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v2

    :cond_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 1188
    throw p1
.end method

.method private ֫(Ljava/lang/String;ILl/ܽۢۘ;)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p2

    move-object/from16 v2, p3

    const-string v3, "StrictHostKeyChecking"

    .line 955
    invoke-virtual {v1, v3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 232
    iget-object v11, v2, Ll/ܽۢۘ;->ܽ:[B

    .line 964
    invoke-virtual/range {p3 .. p3}, Ll/ܽۢۘ;->ۧ()Ljava/lang/String;

    move-result-object v12

    const/4 v4, 0x0

    .line 203
    :try_start_0
    iget-object v5, v2, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    const-string v6, "FingerprintHash"

    invoke-virtual {v5, v6}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    .line 204
    iget-object v6, v2, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    invoke-virtual {v6, v5}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const-class v6, Ll/ۖ᩷ۘ;

    invoke-virtual {v5, v6}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v5

    .line 205
    invoke-virtual {v5, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۖ᩷ۘ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v5

    goto :goto_0

    .line 207
    :catch_0
    iget-object v5, v2, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object v5, v5, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v5}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v5

    .line 207
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    :goto_0
    iget-object v5, v2, Ll/ܽۢۘ;->ܽ:[B

    .line 211
    invoke-static {v4, v5}, Ll/᩵ۡۘ;->֫(Ll/ۖ᩷ۘ;[B)Ljava/lang/String;

    move-result-object v13

    const/16 v4, 0x16

    if-eq v0, v4, :cond_0

    .line 968
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v5, p1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    move-object/from16 v5, p1

    move-object v0, v5

    .line 3355
    :goto_1
    iget-object v4, v1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v4}, Ll/᩶᩷ۘ;->֫()Ll/ᩴ᩷ۘ;

    move-result-object v14

    const-string v4, "HashKnownHosts"

    .line 973
    invoke-virtual {v1, v4}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "yes"

    .line 974
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v15, 0x0

    if-eqz v4, :cond_1

    invoke-static {v14}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 975
    move-object v5, v14

    check-cast v5, Ll/᩵ۢۘ;

    .line 552
    new-instance v10, Ll/ᩴۢۘ;

    const-string v6, ""

    const/16 v16, 0x0

    const/4 v8, 0x0

    move-object v4, v10

    move-object v7, v0

    move-object v9, v11

    move-object/from16 p1, v10

    move-object/from16 v10, v16

    .line 570
    invoke-direct/range {v4 .. v10}, Ll/ᩴۢۘ;-><init>(Ll/᩵ۢۘ;Ljava/lang/String;Ljava/lang/String;I[BLjava/lang/String;)V

    .line 553
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۢۘ;->ۧ()V

    move-object/from16 v4, p1

    .line 975
    iput-object v4, v1, Ll/۟ۢۘ;->᩺:Ll/ۘ᩷ۘ;

    goto :goto_2

    .line 977
    :cond_1
    new-instance v4, Ll/ۘ᩷ۘ;

    .line 55
    invoke-direct {v4, v0, v15, v11}, Ll/ۘ᩷ۘ;-><init>(Ljava/lang/String;I[B)V

    .line 977
    iput-object v4, v1, Ll/۟ۢۘ;->᩺:Ll/ۘ᩷ۘ;

    :goto_2
    move-object/from16 v16, v14

    .line 981
    monitor-enter v16

    .line 982
    :try_start_1
    move-object v4, v14

    check-cast v4, Ll/᩵ۢۘ;

    invoke-virtual {v4, v0, v11}, Ll/᩵ۢۘ;->֫(Ljava/lang/String;[B)I

    move-result v5

    .line 983
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const-string v6, "ask"

    .line 986
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-nez v6, :cond_2

    const-string v6, "yes"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    :cond_2
    const/4 v6, 0x2

    if-ne v5, v6, :cond_5

    move-object/from16 v16, v14

    .line 988
    monitor-enter v16

    .line 990
    :try_start_2
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 997
    iget-object v6, v1, Ll/۟ۢۘ;->᩺֫:Ll/ᩴۡۘ;

    if-eqz v6, :cond_4

    const-string v6, "ask"

    .line 1006
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 1007
    iget-object v6, v1, Ll/۟ۢۘ;->᩺֫:Ll/ᩴۡۘ;

    .line 1008
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v16, v14

    .line 1018
    monitor-enter v16

    .line 1019
    :try_start_3
    invoke-virtual/range {p3 .. p3}, Ll/ܽۢۘ;->֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v0, v6}, Ll/᩵ۢۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1021
    monitor-exit v16

    const/4 v6, 0x1

    goto :goto_3

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 1010
    :cond_3
    iget-object v2, v1, Ll/۟ۢۘ;->᩺֫:Ll/ᩴۡۘ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    :cond_4
    new-instance v2, Ll/۬᩷ۘ;

    const-string v3, "HostKey has been changed: "

    .line 0
    invoke-static {v3, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1015
    throw v2

    :catchall_1
    move-exception v0

    .line 990
    :try_start_4
    monitor-exit v14
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_5
    const/4 v6, 0x0

    :goto_3
    const-string v8, "ask"

    .line 1024
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    const-string v8, "yes"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    :cond_6
    if-eqz v5, :cond_a

    if-nez v6, :cond_a

    const-string v6, "yes"

    .line 1025
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    .line 1029
    iget-object v6, v1, Ll/۟ۢۘ;->᩺֫:Ll/ᩴۡۘ;

    if-eqz v6, :cond_7

    const/4 v6, 0x1

    goto :goto_4

    :cond_7
    if-ne v5, v7, :cond_8

    .line 1039
    new-instance v2, Ll/۟᩷ۘ;

    const-string v3, "UnknownHostKey: "

    const-string v4, ". "

    const-string v5, " key fingerprint is "

    .line 0
    invoke-static {v3, v0, v4, v12, v5}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1039
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1039
    throw v2

    .line 1042
    :cond_8
    new-instance v2, Ll/۬᩷ۘ;

    const-string v3, "HostKey has been changed: "

    .line 0
    invoke-static {v3, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1042
    throw v2

    .line 1026
    :cond_9
    new-instance v2, Ll/۟᩷ۘ;

    const-string v3, "reject HostKey: "

    .line 0
    invoke-static {v3, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1026
    throw v2

    :cond_a
    :goto_4
    const-string v8, "no"

    .line 1046
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    if-ne v7, v5, :cond_b

    const/4 v6, 0x1

    :cond_b
    if-nez v5, :cond_e

    .line 1051
    invoke-virtual/range {p3 .. p3}, Ll/ܽۢۘ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v0, v2}, Ll/᩵ۢۘ;->֫(Ljava/lang/String;Ljava/lang/String;)[Ll/ۘ᩷ۘ;

    move-result-object v2

    .line 1052
    array-length v3, v11

    invoke-static {v11, v3, v7}, Ll/᩵ۡۘ;->֫([BIZ)[B

    move-result-object v3

    .line 409
    array-length v8, v3

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v3, v15, v8, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const/4 v3, 0x0

    .line 1053
    :goto_5
    array-length v8, v2

    if-ge v3, v8, :cond_e

    .line 1054
    aget-object v8, v2, v3

    .line 117
    iget-object v8, v8, Ll/ۘ᩷ۘ;->ۧ:[B

    array-length v9, v8

    invoke-static {v8, v9, v7}, Ll/᩵ۡۘ;->֫([BIZ)[B

    move-result-object v8

    .line 409
    array-length v9, v8

    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v12, Ljava/lang/String;

    invoke-direct {v12, v8, v15, v9, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 1054
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    aget-object v8, v2, v3

    .line 139
    iget-object v8, v8, Ll/ۘ᩷ۘ;->ܽ:Ljava/lang/String;

    const-string v9, "@revoked"

    .line 1054
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_6

    .line 3560
    :cond_c
    iget-object v2, v1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 1060
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1063
    new-instance v2, Ll/ۨ᩷ۘ;

    const-string v3, "revoked HostKey: "

    .line 0
    invoke-static {v3, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1063
    throw v2

    :cond_d
    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_e
    if-nez v5, :cond_f

    .line 3560
    iget-object v0, v1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 1068
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_f
    if-eqz v6, :cond_10

    .line 3560
    iget-object v0, v1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 1073
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_10
    if-eqz v6, :cond_11

    move-object/from16 v16, v14

    .line 1079
    monitor-enter v16

    .line 1080
    :try_start_5
    iget-object v0, v1, Ll/۟ۢۘ;->᩺:Ll/ۘ᩷ۘ;

    iget-object v2, v1, Ll/۟ۢۘ;->᩺֫:Ll/ᩴۡۘ;

    invoke-virtual {v4, v0, v2}, Ll/᩵ۢۘ;->֫(Ll/ۘ᩷ۘ;Ll/ᩴۡۘ;)V

    .line 1081
    monitor-exit v16

    goto :goto_7

    :catchall_2
    move-exception v0

    monitor-exit v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0

    :cond_11
    :goto_7
    return-void

    :catchall_3
    move-exception v0

    .line 983
    :try_start_6
    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v0
.end method

.method private ֫(Ll/ܺ᩻ۘ;Ll/᩻ۜۘ;Ll/֨ۢۘ;II)V
    .locals 3

    .line 1479
    invoke-interface {p2}, Ll/᩻ۜۘ;->֫()Z

    move-result p2

    const-string v0, "Packet corrupt"

    if-eqz p2, :cond_7

    if-eqz p3, :cond_0

    invoke-interface {p3}, Ll/֨ۢۘ;->֫()Z

    move-result p2

    if-nez p2, :cond_7

    :cond_0
    if-eqz p3, :cond_1

    .line 1484
    iget p2, p0, Ll/۟ۢۘ;->᩸֫:I

    invoke-interface {p3, p2}, Ll/֨ۢۘ;->֫(I)V

    .line 1485
    iget-object p2, p1, Ll/ܺ᩻ۘ;->֫:[B

    invoke-interface {p3, p4, p2}, Ll/֨ۢۘ;->֫(I[B)V

    :cond_1
    :goto_0
    const/4 p2, 0x0

    if-lez p5, :cond_4

    .line 1491
    :try_start_0
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ۡ()V

    .line 1492
    iget-object p4, p1, Ll/ܺ᩻ۘ;->֫:[B

    array-length v1, p4

    if-le p5, v1, :cond_2

    array-length v1, p4

    goto :goto_1

    :cond_2
    move v1, p5

    .line 1493
    :goto_1
    iget-object v2, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    invoke-virtual {v2, p2, v1, p4}, Ll/᩵᩷ۘ;->֫(II[B)V

    if-eqz p3, :cond_3

    .line 1495
    iget-object p4, p1, Ll/ܺ᩻ۘ;->֫:[B

    invoke-interface {p3, v1, p4}, Ll/֨ۢۘ;->֫(I[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    sub-int/2addr p5, v1

    goto :goto_0

    :catch_0
    move-exception p4

    .line 3560
    iget-object p5, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p5}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p5

    .line 1501
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_4
    const/4 p4, 0x0

    :goto_2
    if-eqz p3, :cond_5

    .line 1507
    iget-object p1, p1, Ll/ܺ᩻ۘ;->֫:[B

    invoke-interface {p3, p2, p1}, Ll/֨ۢۘ;->ۧ(I[B)V

    .line 1510
    :cond_5
    new-instance p1, Ll/۫᩷ۘ;

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    if-eqz p4, :cond_6

    .line 1512
    invoke-virtual {p1, p4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1514
    :cond_6
    throw p1

    .line 1480
    :cond_7
    new-instance p1, Ll/۫᩷ۘ;

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1480
    throw p1
.end method

.method private ֫(Ll/ܽۢۘ;)V
    .locals 3

    const/4 v0, 0x0

    .line 1523
    :try_start_0
    invoke-direct {p0, p1}, Ll/۟ۢۘ;->ۧ(Ll/ܽۢۘ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    iget-object v1, p1, Ll/ܽۢۘ;->ۧ:[B

    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 220
    iput-object v0, p1, Ll/ܽۢۘ;->ۧ:[B

    const/4 p1, 0x0

    .line 1527
    iput-boolean p1, p0, Ll/۟ۢۘ;->ܰ:Z

    .line 1528
    iget-boolean v0, p0, Ll/۟ۢۘ;->ۙ:Z

    if-eqz v0, :cond_0

    .line 1529
    iput p1, p0, Ll/۟ۢۘ;->᩸֫:I

    .line 3560
    iget-object p1, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 1530
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 219
    iget-object v2, p1, Ll/ܽۢۘ;->ۧ:[B

    invoke-static {v2}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 220
    iput-object v0, p1, Ll/ܽۢۘ;->ۧ:[B

    .line 1526
    throw v1
.end method

.method public static ֫(Ll/ܺ᩻ۘ;[B[B[BLl/ۖ᩷ۘ;I)[B
    .locals 5

    .line 1669
    invoke-interface {p4}, Ll/ۖ᩷ۘ;->getBlockSize()I

    move-result v0

    .line 1670
    :goto_0
    array-length v1, p3

    if-ge v1, p5, :cond_0

    .line 1671
    invoke-virtual {p0}, Ll/ܺ᩻ۘ;->ۡ()V

    .line 1672
    invoke-virtual {p0, p1}, Ll/ܺ᩻ۘ;->ۧ([B)V

    .line 1673
    invoke-virtual {p0, p2}, Ll/ܺ᩻ۘ;->ۧ([B)V

    .line 56
    array-length v1, p3

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p3}, Ll/ܺ᩻ۘ;->ۧ(II[B)V

    .line 1675
    iget-object v1, p0, Ll/ܺ᩻ۘ;->֫:[B

    iget v3, p0, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {p4, v3, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 1676
    array-length v1, p3

    add-int/2addr v1, v0

    new-array v1, v1, [B

    .line 1677
    array-length v3, p3

    invoke-static {p3, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1678
    invoke-interface {p4}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v3

    array-length v4, p3

    invoke-static {v3, v2, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1679
    invoke-static {p3}, Ll/᩵ۡۘ;->ۧ([B)V

    move-object p3, v1

    goto :goto_0

    :cond_0
    return-object p3
.end method

.method private ۖ()V
    .locals 4

    .line 942
    iget-object v0, p0, Ll/۟ۢۘ;->ۖ֫:Ll/۠ۢۘ;

    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    .line 943
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 944
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 945
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    .line 397
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v3, "ext-info-in-auth@openssh.com"

    invoke-static {v3, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 945
    invoke-virtual {v1, v3}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 946
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    const-string v3, "0"

    .line 397
    invoke-static {v3, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 946
    invoke-virtual {v1, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 947
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 3560
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 949
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method private ۘ()V
    .locals 17

    move-object/from16 v7, p0

    .line 735
    iget-boolean v0, v7, Ll/۟ۢۘ;->ܰ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "cipher.c2s"

    .line 738
    invoke-virtual {v7, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "cipher.s2c"

    .line 739
    invoke-virtual {v7, v1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "CheckCiphers"

    .line 740
    invoke-virtual {v7, v2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3151
    iget-object v3, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    const/4 v4, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_1

    goto :goto_2

    .line 3560
    :cond_1
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v5

    .line 3154
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "cipher.c2s"

    .line 3158
    invoke-virtual {v7, v5}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "cipher.s2c"

    .line 3159
    invoke-virtual {v7, v6}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 3161
    new-instance v10, Ljava/util/Vector;

    invoke-direct {v10}, Ljava/util/Vector;-><init>()V

    .line 3162
    invoke-static {v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v11, 0x0

    .line 3163
    :goto_0
    array-length v12, v2

    if-ge v11, v12, :cond_4

    .line 3164
    aget-object v12, v2, v11

    .line 3165
    invoke-virtual {v6, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v13

    if-ne v13, v4, :cond_2

    invoke-virtual {v5, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v13

    if-ne v13, v4, :cond_2

    goto :goto_1

    .line 3167
    :cond_2
    invoke-virtual {v7, v12}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ll/۟ۢۘ;->ᩳ(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_3

    .line 3168
    invoke-virtual {v10, v12}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 3171
    :cond_4
    invoke-virtual {v10}, Ljava/util/Vector;->size()I

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    .line 3173
    :cond_5
    invoke-virtual {v10}, Ljava/util/Vector;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    .line 3174
    invoke-virtual {v10}, Ljava/util/Vector;->toArray()[Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v10}, Ljava/util/Vector;->size()I

    move-result v6

    invoke-static {v5, v9, v2, v9, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v3

    .line 3176
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_6
    :goto_2
    move-object v2, v8

    :goto_3
    if-eqz v2, :cond_8

    .line 741
    array-length v3, v2

    if-lez v3, :cond_8

    .line 3560
    iget-object v3, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v3

    .line 742
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    invoke-static {v0, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 750
    invoke-static {v1, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_7

    if-eqz v1, :cond_7

    .line 3560
    iget-object v2, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 755
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    .line 752
    :cond_7
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "There are not any available ciphers."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 752
    throw v0

    :cond_8
    :goto_4
    move-object v10, v1

    const-string v1, "mac.c2s"

    .line 763
    invoke-virtual {v7, v1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mac.s2c"

    .line 764
    invoke-virtual {v7, v2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "CheckMacs"

    .line 765
    invoke-virtual {v7, v3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 3197
    iget-object v5, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_9

    goto/16 :goto_7

    .line 3560
    :cond_9
    invoke-virtual {v5}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v6

    .line 3200
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "mac.c2s"

    .line 3204
    invoke-virtual {v7, v6}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v11, "mac.s2c"

    .line 3205
    invoke-virtual {v7, v11}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 3207
    new-instance v12, Ljava/util/Vector;

    invoke-direct {v12}, Ljava/util/Vector;-><init>()V

    .line 3208
    invoke-static {v3}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v13, 0x0

    .line 3209
    :goto_5
    array-length v14, v3

    if-ge v13, v14, :cond_b

    .line 3210
    aget-object v14, v3, v13

    .line 3211
    invoke-virtual {v11, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v15

    if-ne v15, v4, :cond_a

    invoke-virtual {v6, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v15

    if-ne v15, v4, :cond_a

    goto :goto_6

    .line 3213
    :cond_a
    invoke-virtual {v7, v14}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 3233
    :try_start_0
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-class v15, Ll/֨ۢۘ;

    invoke-virtual {v4, v15}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 3234
    invoke-virtual {v4, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֨ۢۘ;

    .line 3235
    invoke-interface {v4}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v15

    new-array v15, v15, [B

    invoke-interface {v4, v15}, Ll/֨ۢۘ;->init([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    .line 3214
    :catch_0
    invoke-virtual {v12, v14}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :goto_6
    add-int/lit8 v13, v13, 0x1

    const/4 v4, -0x1

    goto :goto_5

    .line 3217
    :cond_b
    invoke-virtual {v12}, Ljava/util/Vector;->size()I

    move-result v3

    if-nez v3, :cond_c

    goto :goto_7

    .line 3219
    :cond_c
    invoke-virtual {v12}, Ljava/util/Vector;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/String;

    .line 3220
    invoke-virtual {v12}, Ljava/util/Vector;->toArray()[Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v12}, Ljava/util/Vector;->size()I

    move-result v6

    invoke-static {v4, v9, v3, v9, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3560
    invoke-virtual {v5}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v4

    .line 3222
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_8

    :cond_d
    :goto_7
    move-object v3, v8

    :goto_8
    if-eqz v3, :cond_f

    .line 766
    array-length v4, v3

    if-lez v4, :cond_f

    .line 3560
    iget-object v4, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v4}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v4

    .line 767
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    invoke-static {v1, v3}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 775
    invoke-static {v2, v3}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_e

    if-eqz v2, :cond_e

    .line 3560
    iget-object v1, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v1

    .line 780
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_9

    .line 777
    :cond_e
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "There are not any available macs."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 777
    throw v0

    :cond_f
    :goto_9
    const-string v1, "kex"

    .line 788
    invoke-virtual {v7, v1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v1, "CheckKexes"

    .line 789
    invoke-virtual {v7, v1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3243
    iget-object v12, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    if-eqz v1, :cond_13

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_10

    goto :goto_c

    .line 3560
    :cond_10
    invoke-virtual {v12}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 3246
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3250
    new-instance v13, Ljava/util/Vector;

    invoke-direct {v13}, Ljava/util/Vector;-><init>()V

    .line 3251
    invoke-static {v1}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    const/4 v1, 0x0

    const/4 v15, 0x0

    .line 3252
    :goto_a
    array-length v1, v14

    if-ge v15, v1, :cond_11

    .line 3253
    aget-object v1, v14, v15

    invoke-virtual {v7, v1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3273
    :try_start_1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ܽۢۘ;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 3274
    invoke-virtual {v1, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۢۘ;

    .line 76
    iput-object v7, v1, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p0

    .line 77
    invoke-virtual/range {v1 .. v6}, Ll/ܽۢۘ;->֫(Ll/۟ۢۘ;[B[B[B[B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_b

    .line 3254
    :catch_1
    aget-object v1, v14, v15

    invoke-virtual {v13, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :goto_b
    add-int/lit8 v15, v15, 0x1

    goto :goto_a

    .line 3257
    :cond_11
    invoke-virtual {v13}, Ljava/util/Vector;->size()I

    move-result v1

    if-nez v1, :cond_12

    goto :goto_c

    .line 3259
    :cond_12
    invoke-virtual {v13}, Ljava/util/Vector;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    .line 3260
    invoke-virtual {v13}, Ljava/util/Vector;->toArray()[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v13}, Ljava/util/Vector;->size()I

    move-result v3

    invoke-static {v2, v9, v1, v9, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3560
    invoke-virtual {v12}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 3262
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_d

    :cond_13
    :goto_c
    move-object v1, v8

    :goto_d
    if-eqz v1, :cond_15

    .line 790
    array-length v2, v1

    if-lez v2, :cond_15

    .line 3560
    iget-object v2, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 791
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    invoke-static {v11, v1}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_14

    .line 3560
    iget-object v1, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v1

    .line 800
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_e

    .line 797
    :cond_14
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "There are not any available kexes."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 797
    throw v0

    .line 805
    :cond_15
    :goto_e
    iget-boolean v1, v7, Ll/۟ۢۘ;->۬:Z

    if-eqz v1, :cond_16

    iget-boolean v1, v7, Ll/۟ۢۘ;->ᩳ֫:Z

    if-nez v1, :cond_16

    const-string v1, ",ext-info-c"

    .line 0
    invoke-static {v11, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 809
    :cond_16
    iget-boolean v1, v7, Ll/۟ۢۘ;->۫:Z

    if-nez v1, :cond_17

    iget-boolean v1, v7, Ll/۟ۢۘ;->᩵֫:Z

    if-eqz v1, :cond_18

    :cond_17
    iget-boolean v1, v7, Ll/۟ۢۘ;->ۧ֫:Z

    if-eqz v1, :cond_18

    const-string v1, ",kex-strict-c-v00@openssh.com"

    .line 0
    invoke-static {v11, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    :cond_18
    const-string v1, "server_host_key"

    .line 813
    invoke-virtual {v7, v1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "CheckSignatures"

    .line 814
    invoke-virtual {v7, v2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3283
    iget-object v3, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_19

    goto :goto_11

    .line 3560
    :cond_19
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v4

    .line 3286
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3290
    new-instance v4, Ljava/util/Vector;

    invoke-direct {v4}, Ljava/util/Vector;-><init>()V

    .line 3291
    invoke-static {v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    .line 3292
    :goto_f
    array-length v6, v2

    if-ge v5, v6, :cond_1a

    .line 3294
    :try_start_2
    aget-object v6, v2, v5

    .line 3295
    invoke-static {v6}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-class v12, Ll/ᩳۡۘ;

    invoke-virtual {v6, v12}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v6

    .line 3296
    invoke-virtual {v6, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۡۘ;

    .line 3297
    invoke-interface {v6}, Ll/ᩳۡۘ;->init()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/LinkageError; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_10

    .line 3299
    :catch_2
    aget-object v6, v2, v5

    invoke-virtual {v4, v6}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :goto_10
    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    .line 3302
    :cond_1a
    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_11

    .line 3304
    :cond_1b
    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    .line 3305
    invoke-virtual {v4}, Ljava/util/Vector;->toArray()[Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v4

    invoke-static {v5, v9, v2, v9, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3560
    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v3

    .line 3306
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_12

    :cond_1c
    :goto_11
    move-object v2, v8

    .line 816
    :goto_12
    iput-object v2, v7, Ll/۟ۢۘ;->ܺ֫:[Ljava/lang/String;

    if-eqz v2, :cond_1e

    .line 817
    array-length v3, v2

    if-lez v3, :cond_1e

    .line 3560
    iget-object v3, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v3

    .line 818
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    invoke-static {v1, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1d

    .line 3560
    iget-object v2, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 828
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_13

    .line 825
    :cond_1d
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "There are not any available sig algorithm."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 825
    throw v0

    :cond_1e
    :goto_13
    const-string v2, "prefer_known_host_key_types"

    .line 834
    invoke-virtual {v7, v2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "yes"

    .line 835
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    .line 3560
    iget-object v2, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 836
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3355
    iget-object v2, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v2}, Ll/᩶᩷ۘ;->֫()Ll/ᩴ᩷ۘ;

    move-result-object v2

    .line 842
    iget-object v3, v7, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    .line 846
    iget v4, v7, Ll/۟ۢۘ;->ᩴ֫:I

    const/16 v5, 0x16

    if-eq v4, v5, :cond_1f

    const-string v4, "["

    const-string v5, "]:"

    .line 0
    invoke-static {v4, v3, v5}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 847
    iget v4, v7, Ll/۟ۢۘ;->ᩴ֫:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 849
    :cond_1f
    check-cast v2, Ll/᩵ۢۘ;

    invoke-virtual {v2, v3, v8}, Ll/᩵ۢۘ;->֫(Ljava/lang/String;Ljava/lang/String;)[Ll/ۘ᩷ۘ;

    move-result-object v2

    .line 850
    array-length v3, v2

    if-lez v3, :cond_26

    .line 851
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 852
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 853
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 854
    :cond_20
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_24

    .line 855
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v8, "rsa-sha2-256"

    .line 857
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    const-string v8, "rsa-sha2-512"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    const-string v8, "ssh-rsa-sha224@ssh.com"

    .line 858
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    const-string v8, "ssh-rsa-sha256@ssh.com"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    const-string v8, "ssh-rsa-sha384@ssh.com"

    .line 859
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    const-string v8, "ssh-rsa-sha512@ssh.com"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_21

    goto :goto_15

    :cond_21
    move-object v8, v6

    goto :goto_16

    :cond_22
    :goto_15
    const-string v8, "ssh-rsa"

    .line 862
    :goto_16
    array-length v12, v2

    const/4 v13, 0x0

    :goto_17
    if-ge v13, v12, :cond_20

    aget-object v14, v2, v13

    .line 863
    invoke-virtual {v14}, Ll/ۘ᩷ۘ;->֫()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_23

    .line 864
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 865
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_14

    :cond_23
    add-int/lit8 v13, v13, 0x1

    goto :goto_17

    .line 870
    :cond_24
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_26

    .line 871
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const-string v1, ","

    .line 0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_25

    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_18

    :cond_25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3560
    :cond_26
    iget-object v2, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 876
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    :cond_27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v7, Ll/۟ۢۘ;->ۜ֫:J

    const/4 v2, 0x1

    .line 883
    iput-boolean v2, v7, Ll/۟ۢۘ;->ܰ:Z

    .line 897
    new-instance v2, Ll/ܺ᩻ۘ;

    invoke-direct {v2}, Ll/ܺ᩻ۘ;-><init>()V

    .line 898
    new-instance v3, Ll/۠ۢۘ;

    invoke-direct {v3, v2}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 899
    invoke-virtual {v3}, Ll/۠ۢۘ;->֫()V

    const/16 v4, 0x14

    .line 900
    invoke-virtual {v2, v4}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 901
    sget-object v4, Ll/۟ۢۘ;->ۧۧ:Ll/᩹ۢۘ;

    move-object/from16 v16, v4

    monitor-enter v16

    .line 902
    :try_start_3
    sget-object v4, Ll/۟ۢۘ;->ۧۧ:Ll/᩹ۢۘ;

    iget-object v5, v2, Ll/ܺ᩻ۘ;->֫:[B

    iget v6, v2, Ll/ܺ᩻ۘ;->ۧ:I

    const/16 v8, 0x10

    invoke-interface {v4, v6, v8, v5}, Ll/᩹ۢۘ;->֫(II[B)V

    .line 903
    invoke-virtual {v2, v8}, Ll/ܺ᩻ۘ;->ܽ(I)V

    .line 904
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 397
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v11, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v5

    .line 905
    invoke-virtual {v2, v5}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 397
    invoke-static {v1, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 906
    invoke-virtual {v2, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 397
    invoke-static {v0, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 907
    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 397
    invoke-static {v10, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 908
    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    const-string v0, "mac.c2s"

    .line 909
    invoke-virtual {v7, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 397
    invoke-static {v0, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 909
    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    const-string v0, "mac.s2c"

    .line 910
    invoke-virtual {v7, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 397
    invoke-static {v0, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 910
    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    const-string v0, "compression.c2s"

    .line 911
    invoke-virtual {v7, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 397
    invoke-static {v0, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 911
    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    const-string v0, "compression.s2c"

    .line 912
    invoke-virtual {v7, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 397
    invoke-static {v0, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 912
    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    const-string v0, "lang.c2s"

    .line 913
    invoke-virtual {v7, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 397
    invoke-static {v0, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 913
    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    const-string v0, "lang.s2c"

    .line 914
    invoke-virtual {v7, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 397
    invoke-static {v0, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 914
    invoke-virtual {v2, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 915
    invoke-virtual {v2, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 916
    invoke-virtual {v2, v9}, Ll/ܺ᩻ۘ;->ۧ(I)V

    const/4 v0, 0x5

    .line 128
    iput v0, v2, Ll/ܺ᩻ۘ;->ܽ:I

    .line 919
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ᩳ()I

    move-result v0

    new-array v1, v0, [B

    iput-object v1, v7, Ll/۟ۢۘ;->ܿ:[B

    .line 165
    invoke-virtual {v2, v9, v0, v1}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 922
    invoke-virtual {v7, v3}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 3560
    iget-object v0, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 924
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception v0

    .line 904
    :try_start_4
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method private ۧ(Ll/ܺ᩻ۘ;)Ll/ܽۢۘ;
    .locals 14

    .line 611
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 612
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ᩳ()I

    move-result v1

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    .line 613
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    .line 614
    iget v0, p1, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/lit8 v0, v0, -0x5

    new-array v0, v0, [B

    iput-object v0, p0, Ll/۟ۢۘ;->ܳ:[B

    goto :goto_0

    :cond_0
    sub-int/2addr v0, v2

    .line 616
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v1

    sub-int/2addr v0, v1

    new-array v0, v0, [B

    iput-object v0, p0, Ll/۟ۢۘ;->ܳ:[B

    .line 618
    :goto_0
    iget-object v0, p1, Ll/ܺ᩻ۘ;->֫:[B

    iget p1, p1, Ll/ܺ᩻ۘ;->ܽ:I

    iget-object v1, p0, Ll/۟ۢۘ;->ܳ:[B

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v0, p1, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 620
    iget-boolean p1, p0, Ll/۟ۢۘ;->ۧ֫:Z

    const-string v0, "ext-info-s"

    const-string v1, "kex-strict-s-v00@openssh.com"

    const/16 v3, 0x2c

    const/16 v5, 0x11

    if-eqz p1, :cond_e

    .line 621
    iget-boolean p1, p0, Ll/۟ۢۘ;->۫:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/۟ۢۘ;->᩵֫:Z

    if-eqz p1, :cond_8

    .line 677
    :cond_1
    new-instance p1, Ll/ܺ᩻ۘ;

    iget-object v6, p0, Ll/۟ۢۘ;->ܳ:[B

    invoke-direct {p1, v6}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 128
    iput v5, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 679
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 683
    :goto_1
    array-length v8, p1

    if-ge v6, v8, :cond_5

    .line 684
    :goto_2
    array-length v8, p1

    if-ge v6, v8, :cond_2

    aget-byte v8, p1, v6

    if-eq v8, v3, :cond_2

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    if-ne v7, v6, :cond_3

    goto :goto_3

    :cond_3
    sub-int v8, v6, v7

    .line 691
    invoke-static {v7, v8, p1}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/4 p1, 0x1

    goto :goto_4

    :cond_4
    :goto_3
    add-int/lit8 v7, v6, 0x1

    move v6, v7

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    .line 622
    :goto_4
    iput-boolean p1, p0, Ll/۟ۢۘ;->ۙ:Z

    .line 623
    iget-boolean p1, p0, Ll/۟ۢۘ;->ۙ:Z

    if-eqz p1, :cond_7

    .line 3560
    iget-object p1, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 624
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    iget p1, p0, Ll/۟ۢۘ;->᩸֫:I

    if-ne p1, v2, :cond_6

    goto :goto_5

    .line 629
    :cond_6
    new-instance p1, Ll/ܰ᩷ۘ;

    const-string v0, "KEXINIT not first packet from server"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 629
    throw p1

    .line 631
    :cond_7
    iget-boolean p1, p0, Ll/۟ۢۘ;->᩵֫:Z

    if-nez p1, :cond_d

    .line 636
    :cond_8
    :goto_5
    iget-boolean p1, p0, Ll/۟ۢۘ;->۬:Z

    if-eqz p1, :cond_e

    .line 701
    new-instance p1, Ll/ܺ᩻ۘ;

    iget-object v6, p0, Ll/۟ۢۘ;->ܳ:[B

    invoke-direct {p1, v6}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 128
    iput v5, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 703
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 707
    :goto_6
    array-length v8, p1

    if-ge v6, v8, :cond_c

    .line 708
    :goto_7
    array-length v8, p1

    if-ge v6, v8, :cond_9

    aget-byte v8, p1, v6

    if-eq v8, v3, :cond_9

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_9
    if-ne v7, v6, :cond_a

    goto :goto_6

    :cond_a
    sub-int v8, v6, v7

    .line 712
    invoke-static {v7, v8, p1}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_8

    :cond_b
    add-int/lit8 v7, v6, 0x1

    move v6, v7

    goto :goto_6

    :cond_c
    const/4 v2, 0x0

    .line 637
    :goto_8
    iput-boolean v2, p0, Ll/۟ۢۘ;->᩶:Z

    .line 638
    iget-boolean p1, p0, Ll/۟ۢۘ;->᩶:Z

    if-eqz p1, :cond_e

    .line 3560
    iget-object p1, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 638
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_9

    .line 632
    :cond_d
    new-instance p1, Ll/ܰ᩷ۘ;

    const-string v0, "Strict KEX not supported by server"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 632
    throw p1

    .line 644
    :cond_e
    :goto_9
    iget-boolean p1, p0, Ll/۟ۢۘ;->ܰ:Z

    if-nez p1, :cond_f

    .line 645
    invoke-direct {p0}, Ll/۟ۢۘ;->ۘ()V

    .line 648
    :cond_f
    iget-object p1, p0, Ll/۟ۢۘ;->ܳ:[B

    iget-object v2, p0, Ll/۟ۢۘ;->ܿ:[B

    .line 106
    const-class v6, Ll/᩻ۜۘ;

    const/16 v7, 0xa

    new-array v8, v7, [Ljava/lang/String;

    .line 107
    new-instance v9, Ll/ܺ᩻ۘ;

    invoke-direct {v9, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 128
    iput v5, v9, Ll/ܺ᩻ۘ;->ܽ:I

    .line 109
    new-instance p1, Ll/ܺ᩻ۘ;

    invoke-direct {p1, v2}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 128
    iput v5, p1, Ll/ܺ᩻ۘ;->ܽ:I

    .line 3560
    iget-object v2, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v2

    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    :goto_a
    if-ge v2, v7, :cond_19

    .line 126
    invoke-virtual {v9}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v5

    .line 127
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v7

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 131
    :goto_b
    array-length v12, v7

    if-ge v10, v12, :cond_16

    .line 132
    :goto_c
    array-length v12, v7

    if-ge v10, v12, :cond_10

    aget-byte v12, v7, v10

    if-eq v12, v3, :cond_10

    add-int/lit8 v10, v10, 0x1

    goto :goto_c

    :cond_10
    if-eq v11, v10, :cond_15

    sub-int v4, v10, v11

    .line 136
    invoke-static {v11, v4, v7}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v4

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 139
    :goto_d
    array-length v13, v5

    if-ge v12, v13, :cond_14

    .line 140
    :goto_e
    array-length v13, v5

    if-ge v12, v13, :cond_11

    aget-byte v13, v5, v12

    if-eq v13, v3, :cond_11

    add-int/lit8 v12, v12, 0x1

    goto :goto_e

    :cond_11
    if-eq v11, v12, :cond_13

    sub-int v13, v12, v11

    .line 144
    invoke-static {v11, v13, v5}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_12

    .line 145
    aput-object v4, v8, v2

    goto :goto_f

    :cond_12
    add-int/lit8 v12, v12, 0x1

    move v11, v12

    goto :goto_d

    .line 143
    :cond_13
    new-instance p1, Ll/ۙ᩷ۘ;

    .line 409
    array-length v0, v7

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v3, v7, v4, v0, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 409
    array-length v0, v5

    .line 405
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v5, v4, v0, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 143
    invoke-direct {p1, v2, v3, v6}, Ll/ۙ᩷ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    throw p1

    :cond_14
    const/4 v4, 0x0

    add-int/lit8 v11, v10, 0x1

    move v10, v11

    goto :goto_b

    .line 135
    :cond_15
    new-instance p1, Ll/ۙ᩷ۘ;

    .line 409
    array-length v0, v7

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v7, v4, v0, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 409
    array-length v0, v5

    .line 405
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v5, v4, v0, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 135
    invoke-direct {p1, v2, v3, v6}, Ll/ۙ᩷ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    throw p1

    :cond_16
    :goto_f
    if-nez v10, :cond_17

    const-string v4, ""

    .line 155
    aput-object v4, v8, v2

    goto :goto_10

    .line 156
    :cond_17
    aget-object v4, v8, v2

    if-eqz v4, :cond_18

    :goto_10
    add-int/lit8 v2, v2, 0x1

    const/4 v4, 0x0

    const/16 v7, 0xa

    goto/16 :goto_a

    .line 157
    :cond_18
    new-instance p1, Ll/ۙ᩷ۘ;

    .line 409
    array-length v0, v7

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v3, v7, v4, v0, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 409
    array-length v0, v5

    .line 405
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v5, v4, v0, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 157
    invoke-direct {p1, v2, v3, v6}, Ll/ۙ᩷ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    throw p1

    :cond_19
    const/4 p1, 0x5

    const/4 v2, 0x3

    .line 164
    :try_start_0
    aget-object v3, v8, v2

    .line 165
    invoke-virtual {p0, v3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v3

    const/4 v4, 0x0

    .line 166
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۜۘ;

    .line 167
    invoke-interface {v3}, Ll/᩻ۜۘ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_1a

    aput-object v4, v8, p1

    :cond_1a
    const/4 p1, 0x2

    .line 172
    aget-object v3, v8, p1

    .line 173
    invoke-virtual {p0, v3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v3

    .line 174
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۜۘ;

    .line 175
    invoke-interface {v3}, Ll/᩻ۜۘ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_1b

    const/4 v3, 0x4

    aput-object v4, v8, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_2

    .line 3560
    :cond_1b
    iget-object v3, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v3}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v3

    .line 183
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    iput-object v8, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v3, 0x0

    .line 650
    aget-object v5, v8, v3

    const-string v6, "ext-info-c"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    iget-object v5, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    aget-object v5, v5, v3

    .line 651
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    aget-object v0, v0, v3

    const-string v5, "kex-strict-c-v00@openssh.com"

    .line 652
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    aget-object v0, v0, v3

    .line 653
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    .line 657
    iget-boolean v0, p0, Ll/۟ۢۘ;->ᩳ֫:Z

    if-nez v0, :cond_1d

    iget-object v0, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    aget-object p1, v0, p1

    const-string v0, "none"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    iget-object p1, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    aget-object p1, p1, v2

    .line 658
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    goto :goto_11

    .line 659
    :cond_1c
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "NONE Cipher should not be chosen before authentification is successed."

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 659
    throw p1

    .line 665
    :cond_1d
    :goto_11
    :try_start_1
    iget-object p1, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 666
    invoke-virtual {p0, p1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ll/ܽۢۘ;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    .line 667
    invoke-virtual {p1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۢۘ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_0

    .line 672
    iget-object v2, p0, Ll/۟ۢۘ;->ۢ:[B

    iget-object v3, p0, Ll/۟ۢۘ;->᩷:[B

    iget-object v4, p0, Ll/۟ۢۘ;->ܳ:[B

    iget-object v5, p0, Ll/۟ۢۘ;->ܿ:[B

    .line 76
    iput-object p0, p1, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    move-object v0, p1

    move-object v1, p0

    .line 77
    invoke-virtual/range {v0 .. v5}, Ll/ܽۢۘ;->֫(Ll/۟ۢۘ;[B[B[B[B)V

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_12

    :catch_1
    move-exception p1

    .line 669
    :goto_12
    new-instance v0, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 669
    throw v0

    .line 654
    :cond_1e
    new-instance p1, Ll/۫᩷ۘ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid Kex negotiated: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 654
    throw p1

    :catch_2
    move-exception p1

    goto :goto_13

    :catch_3
    move-exception p1

    .line 180
    :goto_13
    new-instance v0, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 180
    throw v0
.end method

.method private ۧ(Ll/ܽۢۘ;)V
    .locals 12

    .line 1538
    const-class v0, Ll/᩻ۜۘ;

    .line 215
    iget-object v7, p1, Ll/ܽۢۘ;->ۧ:[B

    .line 224
    iget-object v8, p1, Ll/ܽۢۘ;->֫:[B

    .line 228
    iget-object p1, p1, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    .line 1542
    iget-object v1, p0, Ll/۟ۢۘ;->ۗ֫:[B

    const/4 v9, 0x0

    if-nez v1, :cond_0

    .line 1543
    array-length v1, v8

    new-array v1, v1, [B

    iput-object v1, p0, Ll/۟ۢۘ;->ۗ֫:[B

    .line 1544
    array-length v2, v8

    invoke-static {v8, v9, v1, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1555
    :cond_0
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۡ()V

    .line 1556
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v1, v7}, Ll/ܺ᩻ۘ;->ۧ([B)V

    .line 1557
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v1, v8}, Ll/ܺ᩻ۘ;->ۧ([B)V

    .line 1558
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    const/16 v2, 0x41

    invoke-virtual {v1, v2}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 1559
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v2, p0, Ll/۟ۢۘ;->ۗ֫:[B

    invoke-virtual {v1, v2}, Ll/ܺ᩻ۘ;->ۧ([B)V

    .line 1560
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v2, v1, Ll/ܺ᩻ۘ;->֫:[B

    iget v1, v1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {p1, v1, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 1561
    invoke-interface {p1}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v1

    iput-object v1, p0, Ll/۟ۢۘ;->ܽ:[B

    .line 1563
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget v2, v1, Ll/ܺ᩻ۘ;->ۧ:I

    iget-object v3, p0, Ll/۟ۢۘ;->ۗ֫:[B

    array-length v3, v3

    sub-int v3, v2, v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    .line 1565
    iget-object v1, v1, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v5, v1, v3

    add-int/2addr v5, v4

    int-to-byte v5, v5

    aput-byte v5, v1, v3

    .line 1566
    invoke-interface {p1, v2, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 1567
    invoke-interface {p1}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v1

    iput-object v1, p0, Ll/۟ۢۘ;->ᩳ:[B

    .line 1569
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v2, v1, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v5, v2, v3

    add-int/2addr v5, v4

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    .line 1570
    iget v1, v1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {p1, v1, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 1571
    invoke-interface {p1}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v1

    iput-object v1, p0, Ll/۟ۢۘ;->֫:[B

    .line 1573
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v2, v1, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v5, v2, v3

    add-int/2addr v5, v4

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    .line 1574
    iget v1, v1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {p1, v1, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 1575
    invoke-interface {p1}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v1

    iput-object v1, p0, Ll/۟ۢۘ;->ۧ:[B

    .line 1577
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v2, v1, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v5, v2, v3

    add-int/2addr v5, v4

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    .line 1578
    iget v1, v1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {p1, v1, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 1579
    invoke-interface {p1}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v1

    iput-object v1, p0, Ll/۟ۢۘ;->᩻:[B

    .line 1581
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v2, v1, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v5, v2, v3

    add-int/2addr v5, v4

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    .line 1582
    iget v1, v1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {p1, v1, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 1583
    invoke-interface {p1}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v1

    iput-object v1, p0, Ll/۟ۢۘ;->ۜ:[B

    .line 1590
    :try_start_0
    iget-object v1, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    .line 1591
    invoke-virtual {p0, v1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    const/4 v10, 0x0

    .line 1592
    invoke-virtual {v1, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۜۘ;

    iput-object v1, p0, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    .line 1593
    :goto_0
    iget-object v1, p0, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    invoke-interface {v1}, Ll/᩻ۜۘ;->getBlockSize()I

    move-result v1

    iget-object v2, p0, Ll/۟ۢۘ;->ۧ:[B

    array-length v3, v2

    if-le v1, v3, :cond_1

    .line 1594
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۡ()V

    .line 1595
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    array-length v2, v7

    invoke-virtual {v1, v9, v2, v7}, Ll/ܺ᩻ۘ;->ۧ(II[B)V

    .line 1596
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    array-length v2, v8

    invoke-virtual {v1, v9, v2, v8}, Ll/ܺ᩻ۘ;->ۧ(II[B)V

    .line 1597
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v2, p0, Ll/۟ۢۘ;->ۧ:[B

    invoke-virtual {v1, v2}, Ll/ܺ᩻ۘ;->ۧ([B)V

    .line 1598
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v2, v1, Ll/ܺ᩻ۘ;->֫:[B

    iget v1, v1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {p1, v1, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 1599
    invoke-interface {p1}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v1

    .line 1600
    iget-object v2, p0, Ll/۟ۢۘ;->ۧ:[B

    array-length v3, v2

    array-length v5, v1

    add-int/2addr v3, v5

    new-array v3, v3, [B

    .line 1601
    array-length v5, v2

    invoke-static {v2, v9, v3, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1602
    iget-object v2, p0, Ll/۟ۢۘ;->ۧ:[B

    array-length v2, v2

    array-length v5, v1

    invoke-static {v1, v9, v3, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1603
    iput-object v3, p0, Ll/۟ۢۘ;->ۧ:[B

    goto :goto_0

    .line 1605
    :cond_1
    iget-object v1, p0, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v3, p0, Ll/۟ۢۘ;->ᩳ:[B

    invoke-interface {v1, v4, v2, v3}, Ll/᩻ۜۘ;->֫(I[B[B)V

    .line 1606
    iget-object v1, p0, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    invoke-interface {v1}, Ll/᩻ۜۘ;->ᩳ()I

    move-result v1

    iput v1, p0, Ll/۟ۢۘ;->ۚ֫:I

    .line 1608
    iget-object v1, p0, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    invoke-interface {v1}, Ll/᩻ۜۘ;->ܿ()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    const-class v11, Ll/֨ۢۘ;

    if-nez v1, :cond_2

    .line 1609
    :try_start_1
    iget-object v1, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    .line 1610
    invoke-virtual {p0, v1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 1611
    invoke-virtual {v1, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۢۘ;

    iput-object v1, p0, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    .line 1612
    iget-object v2, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v4, p0, Ll/۟ۢۘ;->ۜ:[B

    invoke-interface {v1}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v6

    move-object v1, v2

    move-object v2, v7

    move-object v3, v8

    move-object v5, p1

    invoke-static/range {v1 .. v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;[B[B[BLl/ۖ᩷ۘ;I)[B

    move-result-object v1

    iput-object v1, p0, Ll/۟ۢۘ;->ۜ:[B

    .line 1613
    iget-object v2, p0, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    invoke-interface {v2, v1}, Ll/֨ۢۘ;->init([B)V

    .line 1615
    iget-object v1, p0, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    invoke-interface {v1}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, p0, Ll/۟ۢۘ;->۠֫:[B

    .line 1616
    iget-object v1, p0, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    invoke-interface {v1}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, p0, Ll/۟ۢۘ;->ܶ֫:[B

    .line 1619
    :cond_2
    iget-object v1, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    .line 1620
    invoke-virtual {p0, v1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 1621
    invoke-virtual {v0, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ۜۘ;

    iput-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    .line 1622
    :goto_1
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    invoke-interface {v0}, Ll/᩻ۜۘ;->getBlockSize()I

    move-result v0

    iget-object v1, p0, Ll/۟ۢۘ;->֫:[B

    array-length v2, v1

    if-le v0, v2, :cond_3

    .line 1623
    iget-object v0, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ۡ()V

    .line 1624
    iget-object v0, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    array-length v1, v7

    invoke-virtual {v0, v9, v1, v7}, Ll/ܺ᩻ۘ;->ۧ(II[B)V

    .line 1625
    iget-object v0, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    array-length v1, v8

    invoke-virtual {v0, v9, v1, v8}, Ll/ܺ᩻ۘ;->ۧ(II[B)V

    .line 1626
    iget-object v0, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v1, p0, Ll/۟ۢۘ;->֫:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ۧ([B)V

    .line 1627
    iget-object v0, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v1, v0, Ll/ܺ᩻ۘ;->֫:[B

    iget v0, v0, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {p1, v0, v1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 1628
    invoke-interface {p1}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v0

    .line 1629
    iget-object v1, p0, Ll/۟ۢۘ;->֫:[B

    array-length v2, v1

    array-length v3, v0

    add-int/2addr v2, v3

    new-array v2, v2, [B

    .line 1630
    array-length v3, v1

    invoke-static {v1, v9, v2, v9, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1631
    iget-object v1, p0, Ll/۟ۢۘ;->֫:[B

    array-length v1, v1

    array-length v3, v0

    invoke-static {v0, v9, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1632
    iput-object v2, p0, Ll/۟ۢۘ;->֫:[B

    goto :goto_1

    .line 1634
    :cond_3
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    iget-object v2, p0, Ll/۟ۢۘ;->ܽ:[B

    invoke-interface {v0, v9, v1, v2}, Ll/᩻ۜۘ;->֫(I[B[B)V

    .line 1635
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    invoke-interface {v0}, Ll/᩻ۜۘ;->ᩳ()I

    move-result v0

    iput v0, p0, Ll/۟ۢۘ;->ᩴ:I

    .line 1637
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    invoke-interface {v0}, Ll/᩻ۜۘ;->ܿ()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1638
    iget-object v0, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    .line 1639
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 1640
    invoke-virtual {v0, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۢۘ;

    iput-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    .line 1641
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v4, p0, Ll/۟ۢۘ;->᩻:[B

    invoke-interface {v0}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v6

    move-object v2, v7

    move-object v3, v8

    move-object v5, p1

    invoke-static/range {v1 .. v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;[B[B[BLl/ۖ᩷ۘ;I)[B

    move-result-object p1

    iput-object p1, p0, Ll/۟ۢۘ;->᩻:[B

    .line 1642
    iget-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    invoke-interface {v0, p1}, Ll/֨ۢۘ;->init([B)V

    .line 1645
    :cond_4
    iget-object p1, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v0, 0x6

    aget-object p1, p1, v0

    .line 1646
    invoke-direct {p0, p1}, Ll/۟ۢۘ;->ܳ(Ljava/lang/String;)V

    .line 1648
    iget-object p1, p0, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v0, 0x7

    aget-object p1, p1, v0

    .line 1649
    invoke-direct {p0, p1}, Ll/۟ۢۘ;->᩻(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 1651
    :goto_2
    instance-of v0, p1, Ll/۫᩷ۘ;

    if-eqz v0, :cond_5

    .line 1652
    throw p1

    .line 1653
    :cond_5
    new-instance v0, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1653
    throw v0
.end method

.method private ܳ(Ljava/lang/String;)V
    .locals 4

    .line 2774
    iget-object v0, p0, Ll/۟ۢۘ;->᩸:Ll/᩷ۜۘ;

    const-string v1, "none"

    .line 2775
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 2776
    iput-object v2, p0, Ll/۟ۢۘ;->᩸:Ll/᩷ۜۘ;

    if-eqz v0, :cond_3

    .line 2778
    invoke-interface {v0}, Ll/᩷ۜۘ;->end()V

    return-void

    .line 2782
    :cond_0
    invoke-virtual {p0, p1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v3, "zlib"

    .line 2784
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-boolean v3, p0, Ll/۟ۢۘ;->ᩳ֫:Z

    if-eqz v3, :cond_3

    const-string v3, "zlib@openssh.com"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2786
    :cond_1
    :try_start_0
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class v1, Ll/᩷ۜۘ;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    .line 2787
    invoke-virtual {p1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۘ;

    iput-object p1, p0, Ll/۟ۢۘ;->᩸:Ll/᩷ۜۘ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string p1, "compression_level"

    .line 2790
    invoke-virtual {p0, p1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x6

    .line 2793
    :goto_0
    :try_start_2
    iget-object v1, p0, Ll/۟ۢۘ;->᩸:Ll/᩷ۜۘ;

    const/4 v2, 0x1

    invoke-interface {v1, v2, p1, p0}, Ll/᩷ۜۘ;->֫(IILl/۟ۢۘ;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_3

    .line 2799
    invoke-interface {v0}, Ll/᩷ۜۘ;->end()V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 2795
    :try_start_3
    new-instance v1, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 43
    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2795
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    if-eqz v0, :cond_2

    .line 2799
    invoke-interface {v0}, Ll/᩷ۜۘ;->end()V

    .line 2801
    :cond_2
    throw p1

    :cond_3
    :goto_2
    return-void
.end method

.method private ܺ()V
    .locals 2

    const-string v0, "ClearAllForwardings"

    .line 3517
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "yes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3520
    :cond_0
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method private ܽ(Ll/۠ۢۘ;)V
    .locals 9

    .line 1799
    iget-boolean v1, p0, Ll/۟ۢۘ;->ۧ֫:Z

    .line 1800
    iget-boolean v0, p0, Ll/۟ۢۘ;->ۙ:Z

    .line 1801
    iget-boolean v2, p0, Ll/۟ۢۘ;->۫:Z

    .line 1802
    iget-boolean v3, p0, Ll/۟ۢۘ;->᩵֫:Z

    .line 1803
    iget-object v4, p1, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    .line 242
    iget-object v4, v4, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v5, 0x5

    aget-byte v4, v4, v5

    const/16 v5, 0x15

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 1805
    :goto_0
    iget-object v0, p0, Ll/۟ۢۘ;->᩷֫:Ljava/lang/Object;

    monitor-enter v0

    .line 1806
    :try_start_0
    invoke-virtual {p0, p1}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;)V

    .line 1807
    iget-object v5, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    if-eqz v5, :cond_4

    .line 71
    iget-object v7, v5, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    iget-object p1, p1, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    iget-object v8, p1, Ll/ܺ᩻ۘ;->֫:[B

    iget p1, p1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-virtual {v7, v8, v6, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 72
    iget-object p1, v5, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 1809
    iget p1, p0, Ll/۟ۢۘ;->᩹֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۟ۢۘ;->᩹֫:I

    if-nez p1, :cond_3

    if-nez v2, :cond_1

    if-eqz v3, :cond_3

    :cond_1
    if-nez v1, :cond_2

    goto :goto_1

    .line 1810
    :cond_2
    new-instance p1, Ll/ܰ᩷ۘ;

    const-string v1, "outgoing sequence number wrapped during initial KEX"

    .line 39
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1810
    throw p1

    :cond_3
    :goto_1
    if-eqz v4, :cond_4

    .line 1813
    iput v6, p0, Ll/۟ۢۘ;->᩹֫:I

    .line 1816
    :cond_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_5

    .line 1818
    iget-object p1, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    if-eqz p1, :cond_5

    .line 3560
    iget-object p1, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 1818
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    .line 1816
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ܿ(Ljava/lang/String;)Ll/᩵᩻ۘ;
    .locals 4

    const-string v0, "session"

    .line 2836
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2837
    new-instance v0, Ll/۬᩻ۘ;

    invoke-direct {v0}, Ll/۬᩻ۘ;-><init>()V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const-string v2, "shell"

    .line 2839
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2840
    new-instance v0, Ll/ܽۜۘ;

    .line 32
    invoke-direct {v0}, Ll/۬᩻ۘ;-><init>()V

    const/4 v2, 0x1

    .line 33
    iput-boolean v2, v0, Ll/۬᩻ۘ;->۠:Z

    :cond_1
    const-string v2, "exec"

    .line 2842
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2843
    new-instance v0, Ll/᩸᩻ۘ;

    invoke-direct {v0}, Ll/᩸᩻ۘ;-><init>()V

    :cond_2
    const-string v2, "x11"

    .line 2845
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 2846
    new-instance v0, Ll/ܳۜۘ;

    invoke-direct {v0}, Ll/ܳۜۘ;-><init>()V

    :cond_3
    const-string v2, "auth-agent@openssh.com"

    .line 2848
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2849
    new-instance v0, Ll/֡᩻ۘ;

    invoke-direct {v0}, Ll/֡᩻ۘ;-><init>()V

    :cond_4
    const-string v2, "direct-tcpip"

    .line 2851
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 2852
    new-instance v0, Ll/۠᩻ۘ;

    invoke-direct {v0}, Ll/۠᩻ۘ;-><init>()V

    :cond_5
    const-string v2, "forwarded-tcpip"

    .line 2854
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2855
    new-instance v0, Ll/ۗ᩻ۘ;

    invoke-direct {v0}, Ll/ۗ᩻ۘ;-><init>()V

    :cond_6
    const-string v2, "sftp"

    .line 2857
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 2858
    new-instance v0, Ll/֫ۜۘ;

    invoke-direct {v0}, Ll/֫ۜۘ;-><init>()V

    const-string v2, "use_sftp_write_flush_workaround"

    .line 2859
    invoke-virtual {p0, v2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "yes"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 2860
    invoke-virtual {v0, v2}, Ll/֫ۜۘ;->֫(Z)V

    :cond_7
    const-string v2, "subsystem"

    .line 2863
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 2864
    new-instance v0, Ll/ܿۜۘ;

    .line 33
    invoke-direct {v0}, Ll/۬᩻ۘ;-><init>()V

    const/4 v2, 0x1

    .line 34
    iput-boolean v2, v0, Ll/ܿۜۘ;->۫:Z

    const-string v2, ""

    .line 35
    iput-object v2, v0, Ll/ܿۜۘ;->۬:Ljava/lang/String;

    :cond_8
    const-string v2, "direct-streamlocal@openssh.com"

    .line 2866
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 2867
    new-instance v0, Ll/ۚ᩻ۘ;

    invoke-direct {v0}, Ll/ۚ᩻ۘ;-><init>()V

    :cond_9
    if-nez v0, :cond_a

    return-object v1

    .line 2876
    :cond_a
    iget-object p1, p0, Ll/۟ۢۘ;->ۚ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    .line 2877
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 2879
    :try_start_0
    iget-boolean v2, p0, Ll/۟ۢۘ;->᩹:Z

    if-nez v2, :cond_b

    iget-boolean v2, p0, Ll/۟ۢۘ;->ܿ֫:Z

    if-eqz v2, :cond_b

    .line 663
    iput-object p0, v0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    .line 2881
    iget-object v1, p0, Ll/۟ۢۘ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2887
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :cond_b
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v1

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 2888
    throw v0
.end method

.method public static ᩳ(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    .line 3187
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const-class v1, Ll/᩻ۜۘ;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0

    const/4 v1, 0x0

    .line 3188
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻ۜۘ;

    .line 3189
    invoke-interface {p0}, Ll/᩻ۜۘ;->getBlockSize()I

    move-result v1

    new-array v1, v1, [B

    invoke-interface {p0}, Ll/᩻ۜۘ;->ᩳ()I

    move-result v2

    new-array v2, v2, [B

    invoke-interface {p0, v0, v1, v2}, Ll/᩻ۜۘ;->֫(I[B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    return v0
.end method

.method private ᩻(Ljava/lang/String;)V
    .locals 4

    .line 2807
    iget-object v0, p0, Ll/۟ۢۘ;->֫֫:Ll/᩷ۜۘ;

    const-string v1, "none"

    .line 2808
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 2809
    iput-object v2, p0, Ll/۟ۢۘ;->֫֫:Ll/᩷ۜۘ;

    if-eqz v0, :cond_3

    .line 2811
    invoke-interface {v0}, Ll/᩷ۜۘ;->end()V

    return-void

    .line 2815
    :cond_0
    invoke-virtual {p0, p1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v3, "zlib"

    .line 2817
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-boolean v3, p0, Ll/۟ۢۘ;->ᩳ֫:Z

    if-eqz v3, :cond_3

    const-string v3, "zlib@openssh.com"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2819
    :cond_1
    :try_start_0
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class v1, Ll/᩷ۜۘ;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    .line 2820
    invoke-virtual {p1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۜۘ;

    iput-object p1, p0, Ll/۟ۢۘ;->֫֫:Ll/᩷ۜۘ;

    const/4 v1, 0x0

    .line 2821
    invoke-interface {p1, v1, v1, p0}, Ll/᩷ۜۘ;->֫(IILl/۟ۢۘ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_3

    .line 2827
    invoke-interface {v0}, Ll/᩷ۜۘ;->end()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2823
    :try_start_1
    new-instance v1, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 43
    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2823
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v0, :cond_2

    .line 2827
    invoke-interface {v0}, Ll/᩷ۜۘ;->end()V

    .line 2829
    :cond_2
    throw p1

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;IILjava/lang/String;)I
    .locals 1

    .line 2368
    invoke-static {p0, p1, p2, p4, p3}, Ll/᩸ۢۘ;->֫(Ll/۟ۢۘ;Ljava/lang/String;ILjava/lang/String;I)Ll/᩸ۢۘ;

    move-result-object p1

    .line 2370
    new-instance p2, Ll/ܶۢۘ;

    invoke-direct {p2, p1}, Ll/ܶۢۘ;-><init>(Ll/᩸ۢۘ;)V

    iget-object p3, p0, Ll/۟ۢۘ;->ۛ֫:Ll/ۛۢۘ;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Ljava/lang/Thread;

    invoke-direct {p3, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2371
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "PortWatcher Thread for "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 2375
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    .line 2376
    iget p1, p1, Ll/᩸ۢۘ;->ܽ:I

    return p1
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "PubkeyAcceptedKeyTypes"

    .line 2991
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "PubkeyAcceptedAlgorithms"

    .line 2995
    :cond_0
    iget-object v0, p0, Ll/۟ۢۘ;->۠:Ljava/util/Hashtable;

    if-eqz v0, :cond_1

    .line 2996
    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2997
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 2998
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 3000
    :cond_1
    invoke-static {p1}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()V
    .locals 14

    .line 232
    iget-boolean v0, p0, Ll/۟ۢۘ;->ܿ֫:Z

    if-nez v0, :cond_24

    const/4 v1, 0x1

    .line 235
    iput-boolean v1, p0, Ll/۟ۢۘ;->ۧ֫:Z

    .line 237
    new-instance v0, Ll/᩵᩷ۘ;

    invoke-direct {v0}, Ll/᩵᩷ۘ;-><init>()V

    iput-object v0, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    .line 238
    sget-object v0, Ll/۟ۢۘ;->ۧۧ:Ll/᩹ۢۘ;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "random"

    .line 240
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v3, Ll/᩹ۢۘ;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 241
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ۢۘ;

    sput-object v0, Ll/۟ۢۘ;->ۧۧ:Ll/᩹ۢۘ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 243
    new-instance v1, Ll/۫᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 246
    :cond_0
    :goto_0
    sget-object v0, Ll/۟ۢۘ;->ۧۧ:Ll/᩹ۢۘ;

    invoke-static {v0}, Ll/۠ۢۘ;->֫(Ll/᩹ۢۘ;)V

    .line 248
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x3

    const/4 v4, 0x0

    .line 259
    :try_start_1
    iget-object v0, p0, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    iget v5, p0, Ll/۟ۢۘ;->ᩴ֫:I

    const/16 v6, 0x4e20

    invoke-static {v5, v6, v0}, Ll/᩵ۡۘ;->֫(IILjava/lang/String;)Ljava/net/Socket;

    move-result-object v0

    iput-object v0, p0, Ll/۟ۢۘ;->۬֫:Ljava/net/Socket;

    .line 260
    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    .line 261
    iget-object v5, p0, Ll/۟ۢۘ;->۬֫:Ljava/net/Socket;

    invoke-virtual {v5}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5

    .line 268
    iget-object v7, p0, Ll/۟ۢۘ;->۬֫:Ljava/net/Socket;

    invoke-virtual {v7, v1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 269
    iget-object v7, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    invoke-virtual {v7, v0}, Ll/᩵᩷ۘ;->֫(Ljava/io/InputStream;)V

    .line 270
    iget-object v0, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    invoke-virtual {v0, v5}, Ll/᩵᩷ۘ;->֫(Ljava/io/OutputStream;)V

    .line 280
    iget-object v0, p0, Ll/۟ۢۘ;->۬֫:Ljava/net/Socket;

    if-eqz v0, :cond_1

    .line 281
    invoke-virtual {v0, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 284
    :cond_1
    iput-boolean v1, p0, Ll/۟ۢۘ;->ܿ֫:Z

    .line 286
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0, p0}, Ll/᩶᩷ۘ;->֫(Ll/۟ۢۘ;)V

    .line 294
    iget-object v0, p0, Ll/۟ۢۘ;->᩷:[B

    array-length v5, v0

    add-int/lit8 v6, v5, 0x2

    new-array v7, v6, [B

    .line 295
    array-length v8, v0

    invoke-static {v0, v4, v7, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v0, 0xd

    .line 296
    aput-byte v0, v7, v5

    add-int/2addr v5, v1

    const/16 v8, 0xa

    .line 297
    aput-byte v8, v7, v5

    .line 298
    iget-object v5, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    .line 76
    iget-object v9, v5, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    invoke-virtual {v9, v7, v4, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 77
    iget-object v5, v5, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    invoke-virtual {v5}, Ljava/io/OutputStream;->flush()V

    :cond_2
    :goto_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 304
    :cond_3
    iget-object v7, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v7, v7, Ll/ܺ᩻ۘ;->֫:[B

    array-length v7, v7

    if-ge v5, v7, :cond_5

    .line 305
    iget-object v6, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    invoke-virtual {v6}, Ll/᩵᩷ۘ;->ۧ()I

    move-result v6

    if-gez v6, :cond_4

    goto :goto_2

    .line 308
    :cond_4
    iget-object v7, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v7, v7, Ll/ܺ᩻ۘ;->֫:[B

    int-to-byte v9, v6

    aput-byte v9, v7, v5

    add-int/lit8 v5, v5, 0x1

    if-ne v6, v8, :cond_3

    :cond_5
    :goto_2
    if-ltz v6, :cond_20

    .line 317
    iget-object v6, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    iget-object v6, v6, Ll/ܺ᩻ۘ;->֫:[B

    add-int/lit8 v7, v5, -0x1

    aget-byte v7, v6, v7

    if-ne v7, v8, :cond_7

    add-int/lit8 v7, v5, -0x1

    if-lez v7, :cond_6

    add-int/lit8 v5, v5, -0x2

    .line 319
    aget-byte v9, v6, v5

    if-ne v9, v0, :cond_6

    goto :goto_3

    :cond_6
    move v5, v7

    :cond_7
    :goto_3
    if-le v5, v3, :cond_2

    .line 324
    array-length v7, v6

    if-eq v5, v7, :cond_8

    aget-byte v7, v6, v4

    const/16 v9, 0x53

    if-ne v7, v9, :cond_2

    aget-byte v7, v6, v1

    if-ne v7, v9, :cond_2

    const/4 v7, 0x2

    aget-byte v7, v6, v7

    const/16 v9, 0x48

    if-ne v7, v9, :cond_2

    aget-byte v7, v6, v3

    const/16 v9, 0x2d

    if-eq v7, v9, :cond_8

    goto :goto_1

    .line 331
    :cond_8
    array-length v0, v6

    if-eq v5, v0, :cond_1f

    const/4 v0, 0x7

    if-lt v5, v0, :cond_1f

    const/4 v0, 0x4

    aget-byte v0, v6, v0

    const/16 v7, 0x31

    if-ne v0, v7, :cond_9

    const/4 v0, 0x6

    aget-byte v0, v6, v0

    const/16 v7, 0x39

    if-ne v0, v7, :cond_1f

    .line 339
    :cond_9
    new-array v0, v5, [B

    iput-object v0, p0, Ll/۟ۢۘ;->ۢ:[B

    .line 340
    invoke-static {v6, v4, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 342
    iget-object v0, p0, Ll/۟ۢۘ;->ۢ:[B

    invoke-static {v0}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object v0

    const-string v5, "SSH-2.0-OpenSSH_7.4"

    .line 343
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Ll/۟ۢۘ;->۫֫:Z

    .line 345
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    iget-object v0, p0, Ll/۟ۢۘ;->ۢ֫:Ljava/lang/Runnable;

    if-eqz v0, :cond_a

    .line 351
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_a
    const-string v0, "enable_server_sig_algs"

    .line 354
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "yes"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Ll/۟ۢۘ;->۬:Z

    const-string v0, "enable_ext_info_in_auth"

    .line 355
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "yes"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Ll/۟ۢۘ;->ۗ:Z

    const-string v0, "enable_strict_kex"

    .line 356
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "yes"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Ll/۟ۢۘ;->۫:Z

    const-string v0, "require_strict_kex"

    .line 357
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "yes"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Ll/۟ۢۘ;->᩵֫:Z

    .line 358
    invoke-direct {p0}, Ll/۟ۢۘ;->ۘ()V

    .line 360
    iget-object v0, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V

    iput-object v0, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    .line 361
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ۧ()B

    move-result v0

    const/16 v5, 0x14

    if-ne v0, v5, :cond_1e

    .line 366
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    iget-object v0, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-direct {p0, v0}, Ll/۟ۢۘ;->ۧ(Ll/ܺ᩻ۘ;)Ll/ܽۢۘ;

    move-result-object v0

    .line 373
    :cond_b
    iget-object v5, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {p0, v5}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V

    iput-object v5, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    .line 374
    invoke-virtual {v0}, Ll/ܽۢۘ;->ܽ()I

    move-result v5

    iget-object v6, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->ۧ()B

    move-result v6

    if-ne v5, v6, :cond_1d

    .line 375
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iput-wide v5, p0, Ll/۟ۢۘ;->ۜ֫:J

    .line 376
    iget-object v5, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v0, v5}, Ll/ܽۢۘ;->֫(Ll/ܺ᩻ۘ;)Z

    move-result v5

    if-eqz v5, :cond_1c

    .line 386
    invoke-virtual {v0}, Ll/ܽۢۘ;->ܽ()I

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_a
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v5, :cond_b

    .line 392
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 393
    iput-boolean v1, p0, Ll/۟ۢۘ;->۟:Z

    .line 394
    iget-object v7, p0, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    iget v8, p0, Ll/۟ۢۘ;->ᩴ֫:I

    invoke-direct {p0, v7, v8, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;ILl/ܽۢۘ;)V

    .line 395
    iput-boolean v4, p0, Ll/۟ۢۘ;->۟:Z

    .line 396
    iget-wide v7, p0, Ll/۟ۢۘ;->ۜ֫:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v5

    add-long/2addr v9, v7

    iput-wide v9, p0, Ll/۟ۢۘ;->ۜ֫:J
    :try_end_2
    .catch Ll/۫᩷ۘ; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_a
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 931
    :try_start_3
    iget-object v5, p0, Ll/۟ۢۘ;->ۖ֫:Ll/۠ۢۘ;

    invoke-virtual {v5}, Ll/۠ۢۘ;->֫()V

    .line 932
    iget-object v6, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    const/16 v7, 0x15

    invoke-virtual {v6, v7}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 933
    invoke-virtual {p0, v5}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 3560
    iget-object v5, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v5}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v5

    .line 935
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    iget-object v5, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {p0, v5}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V

    iput-object v5, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    .line 408
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->ۧ()B

    move-result v5

    if-ne v5, v7, :cond_1b

    .line 410
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(Ll/ܽۢۘ;)V

    .line 415
    iput-boolean v4, p0, Ll/۟ۢۘ;->ۧ֫:Z

    .line 421
    iget-boolean v0, p0, Ll/۟ۢۘ;->۬:Z

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Ll/۟ۢۘ;->ۗ:Z

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Ll/۟ۢۘ;->᩶:Z

    if-eqz v0, :cond_c

    .line 422
    invoke-direct {p0}, Ll/۟ۢۘ;->ۖ()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_c
    :try_start_4
    const-string v0, "MaxAuthTries"

    .line 426
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 428
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/۟ۢۘ;->ۡ֫:I
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_a
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_d
    :try_start_5
    const-string v0, "userauth.none"

    .line 440
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v5, Ll/ܺۡۘ;

    invoke-virtual {v0, v5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 441
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۡۘ;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 446
    :try_start_6
    invoke-virtual {v0, p0}, Ll/ܺۡۘ;->֫(Ll/۟ۢۘ;)Z

    move-result v5

    const-string v6, "PreferredAuthentications"

    .line 448
    invoke-virtual {p0, v6}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 450
    invoke-static {v6}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    if-nez v5, :cond_e

    .line 454
    invoke-virtual {v0}, Ll/ܺۡۘ;->֫()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 456
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_e
    move-object v6, v2

    .line 464
    :cond_f
    :goto_4
    invoke-static {v6}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v8, 0x0

    :goto_5
    const/4 v9, 0x0

    :goto_6
    if-nez v5, :cond_15

    if-eqz v7, :cond_15

    .line 470
    array-length v10, v7

    if-ge v8, v10, :cond_15

    add-int/lit8 v10, v8, 0x1

    .line 472
    aget-object v8, v7, v8

    const/4 v11, 0x0

    .line 474
    :goto_7
    array-length v12, v0

    if-ge v11, v12, :cond_14

    .line 475
    aget-object v12, v0, v11

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_13

    .line 486
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_a
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 500
    :try_start_7
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "userauth."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p0, v11}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_10

    .line 501
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "userauth."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const-class v11, Ll/ۢۡۘ;

    invoke-virtual {v8, v11}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v8

    .line 502
    invoke-virtual {v8, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۢۡۘ;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_8

    .line 505
    :catch_1
    :try_start_8
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_a
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :cond_10
    move-object v8, v2

    :goto_8
    if-eqz v8, :cond_14

    .line 513
    :try_start_9
    invoke-virtual {v8, p0}, Ll/ۢۡۘ;->֫(Ll/۟ۢۘ;)Z

    move-result v5

    if-eqz v5, :cond_11

    .line 514
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_9
    .catch Ll/ۗ᩷ۘ; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ll/ۛ᩷ۘ; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ll/۫᩷ۘ; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :cond_11
    const/4 v8, 0x0

    const/4 v9, 0x0

    goto :goto_a

    .line 536
    :catch_2
    :try_start_a
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x0

    goto :goto_b

    :catch_3
    move-exception v0

    .line 532
    throw v0

    :catch_4
    move-exception v0

    .line 530
    throw v0

    :catch_5
    move-exception v0

    .line 521
    invoke-virtual {v0}, Ll/ۛ᩷ۘ;->֫()Ljava/lang/String;

    move-result-object v0

    .line 522
    invoke-static {v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 523
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    const/4 v6, 0x0

    goto :goto_9

    :cond_12
    move v6, v10

    :goto_9
    move v13, v6

    move-object v6, v0

    move-object v0, v8

    move v8, v13

    goto/16 :goto_5

    :catch_6
    const/4 v8, 0x1

    const/4 v9, 0x1

    goto :goto_a

    :cond_13
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_7

    :cond_14
    :goto_a
    move v8, v10

    goto/16 :goto_6

    :cond_15
    :goto_b
    if-nez v5, :cond_18

    .line 548
    iget v0, p0, Ll/۟ۢۘ;->ܺ:I

    iget v5, p0, Ll/۟ۢۘ;->ۡ֫:I

    if-lt v0, v5, :cond_16

    .line 549
    invoke-virtual {p0}, Ll/۟ۢۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    :cond_16
    new-instance v0, Ll/۫᩷ۘ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v9, :cond_17

    const-string v7, "Auth cancel"

    goto :goto_c

    :cond_17
    const-string v7, "Auth fail"

    .line 554
    :goto_c
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " for methods \'"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 557
    :cond_18
    iget-object v0, p0, Ll/۟ۢۘ;->۬֫:Ljava/net/Socket;

    if-eqz v0, :cond_19

    .line 558
    invoke-virtual {v0, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 561
    :cond_19
    iput-boolean v1, p0, Ll/۟ۢۘ;->ᩳ֫:Z

    .line 563
    iget-object v0, p0, Ll/۟ۢۘ;->᩷֫:Ljava/lang/Object;

    monitor-enter v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 564
    :try_start_b
    iget-boolean v5, p0, Ll/۟ۢۘ;->ܿ֫:Z

    if-eqz v5, :cond_1a

    .line 565
    invoke-virtual {p0}, Ll/۟ۢۘ;->᩻()Ll/ۛۢۘ;

    move-result-object v5

    new-instance v6, Ll/ۨۢۘ;

    invoke-direct {v6, p0}, Ll/ۨۢۘ;-><init>(Ll/۟ۢۘ;)V

    invoke-virtual {v5, v6}, Ll/ۛۢۘ;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v5

    iput-object v5, p0, Ll/۟ۢۘ;->ܶ:Ljava/lang/Thread;

    .line 566
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Connect thread "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " session"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 570
    iget-object v5, p0, Ll/۟ۢۘ;->ܶ:Ljava/lang/Thread;

    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    .line 572
    invoke-direct {p0}, Ll/۟ۢۘ;->ܺ()V

    .line 577
    :cond_1a
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 605
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ֫:[B

    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 606
    iput-object v2, p0, Ll/۟ۢۘ;->ۘ֫:[B

    return-void

    :catchall_0
    move-exception v5

    .line 577
    :try_start_c
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :try_start_d
    throw v5

    :catch_7
    move-exception v0

    .line 443
    new-instance v5, Ll/۫᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v0}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v5

    :catch_8
    move-exception v0

    .line 431
    new-instance v5, Ll/۫᩷ۘ;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "MaxAuthTries: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "MaxAuthTries"

    invoke-virtual {p0, v7}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v0}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v5

    .line 417
    :cond_1b
    iput-boolean v4, p0, Ll/۟ۢۘ;->ܰ:Z

    .line 418
    new-instance v0, Ll/۫᩷ۘ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "invalid protocol(newkeys): "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->ۧ()B

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_9
    move-exception v0

    .line 398
    iput-boolean v4, p0, Ll/۟ۢۘ;->ܰ:Z

    .line 399
    iput-boolean v4, p0, Ll/۟ۢۘ;->۟:Z

    .line 400
    throw v0

    .line 379
    :cond_1c
    iput-boolean v4, p0, Ll/۟ۢۘ;->ܰ:Z

    .line 380
    new-instance v0, Ll/۫᩷ۘ;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "verify: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 383
    :cond_1d
    iput-boolean v4, p0, Ll/۟ۢۘ;->ܰ:Z

    .line 384
    new-instance v0, Ll/۫᩷ۘ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "invalid protocol(kex): "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->ۧ()B

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 362
    :cond_1e
    iput-boolean v4, p0, Ll/۟ۢۘ;->ܰ:Z

    .line 363
    new-instance v0, Ll/۫᩷ۘ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "invalid protocol: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->ۧ()B

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 334
    :cond_1f
    new-instance v0, Ll/۫᩷ۘ;

    const-string v5, "invalid server\'s version string"

    invoke-direct {v0, v5}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 314
    :cond_20
    new-instance v0, Ll/۫᩷ۘ;

    const-string v5, "connection is closed by foreign host"

    invoke-direct {v0, v5}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_a
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_d

    :catch_a
    move-exception v0

    .line 579
    :try_start_e
    iput-boolean v4, p0, Ll/۟ۢۘ;->ܰ:Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 581
    :try_start_f
    iget-boolean v5, p0, Ll/۟ۢۘ;->ܿ֫:Z

    if-eqz v5, :cond_21

    .line 582
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 583
    iget-object v6, p0, Ll/۟ۢۘ;->ۖ֫:Ll/۠ۢۘ;

    invoke-virtual {v6}, Ll/۠ۢۘ;->֫()V

    .line 584
    iget-object v6, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0xf

    invoke-virtual {p0}, Ll/۟ۢۘ;->ܽ()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v6, v7}, Ll/ܺ᩻ۘ;->֫(I)V

    .line 585
    iget-object v6, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v6, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 586
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v1, v3}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 587
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-static {v5}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 588
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    const-string v3, "en"

    invoke-static {v3}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 589
    iget-object v1, p0, Ll/۟ۢۘ;->ۖ֫:Ll/۠ۢۘ;

    invoke-virtual {p0, v1}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_b
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 594
    :catch_b
    :cond_21
    :try_start_10
    invoke-virtual {p0}, Ll/۟ۢۘ;->ۧ()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_c
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 597
    :catch_c
    :try_start_11
    iput-boolean v4, p0, Ll/۟ۢۘ;->ܿ֫:Z

    .line 599
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_23

    .line 601
    instance-of v1, v0, Ll/۫᩷ۘ;

    if-eqz v1, :cond_22

    .line 602
    check-cast v0, Ll/۫᩷ۘ;

    throw v0

    .line 603
    :cond_22
    new-instance v1, Ll/۫᩷ۘ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Session.connect: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v0}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 600
    :cond_23
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 605
    :goto_d
    iget-object v1, p0, Ll/۟ۢۘ;->ۘ֫:[B

    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 606
    iput-object v2, p0, Ll/۟ۢۘ;->ۘ֫:[B

    .line 607
    throw v0

    .line 233
    :cond_24
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "session is already connected"

    invoke-direct {v0, v1}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 0

    .line 224
    iput-object p1, p0, Ll/۟ۢۘ;->ۢ֫:Ljava/lang/Runnable;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 2940
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    .line 492
    :goto_0
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    iget-object v1, v0, Ll/᩶᩷ۘ;->ۧ:Ll/᩹᩷ۘ;

    const-string v2, "builtin"

    invoke-static {v1, v2, p1}, Ll/ۚ᩷ۘ;->֫(Ll/᩹᩷ۘ;Ljava/lang/String;[B)Ll/ۚ᩷ۘ;

    move-result-object p1

    .line 493
    invoke-virtual {v0, p1, p2}, Ll/᩶᩷ۘ;->֫(Ll/֡᩷ۘ;[B)V

    return-void
.end method

.method public final ֫(Ll/۟ۢۘ;)V
    .locals 0

    .line 200
    iput-object p1, p0, Ll/۟ۢۘ;->᩻֫:Ll/۟ۢۘ;

    return-void
.end method

.method public final ֫(Ll/۠ۢۘ;)V
    .locals 11

    .line 1121
    iget-object v0, p0, Ll/۟ۢۘ;->᩸:Ll/᩷ۜۘ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1122
    iget-object v2, p1, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    iget v3, v2, Ll/ܺ᩻ۘ;->ۧ:I

    iget-object v4, p0, Ll/۟ۢۘ;->֨:[I

    aput v3, v4, v1

    .line 1123
    iget-object v3, v2, Ll/ܺ᩻ۘ;->֫:[B

    invoke-interface {v0, v3, v4}, Ll/᩷ۜۘ;->ۧ([B[I)[B

    move-result-object v0

    iput-object v0, v2, Ll/ܺ᩻ۘ;->֫:[B

    .line 1124
    iget-object v0, p1, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    aget v2, v4, v1

    iput v2, v0, Ll/ܺ᩻ۘ;->ۧ:I

    .line 1127
    :cond_0
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    if-eqz v0, :cond_1

    .line 1129
    iget v2, p0, Ll/۟ۢۘ;->ᩴ:I

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    :goto_0
    if-eqz v0, :cond_2

    .line 1131
    invoke-interface {v0}, Ll/᩻ۜۘ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 1132
    :goto_1
    iget-object v3, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ll/᩻ۜۘ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    if-nez v0, :cond_4

    if-nez v3, :cond_4

    .line 1133
    iget-object v4, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    if-eqz v4, :cond_4

    iget-object v4, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    if-eqz v4, :cond_4

    .line 1134
    invoke-interface {v4}, Ll/֨ۢۘ;->֫()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    if-nez v0, :cond_5

    if-nez v3, :cond_5

    if-nez v4, :cond_5

    const/4 v1, 0x1

    .line 1135
    :cond_5
    invoke-virtual {p1, v2, v1}, Ll/۠ۢۘ;->֫(IZ)V

    iget-object p1, p1, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    .line 1137
    iget-object v1, p1, Ll/ܺ᩻ۘ;->֫:[B

    if-eqz v0, :cond_6

    .line 1140
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    iget v2, p0, Ll/۟ۢۘ;->᩹֫:I

    invoke-interface {v0, v2}, Ll/᩻ۜۘ;->֫(I)V

    .line 1142
    iget-object v5, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    const/4 v8, 0x4

    const/4 v0, 0x0

    const/4 v2, 0x0

    move v6, v2

    move-object v7, v1

    move-object v9, v1

    move v10, v0

    invoke-interface/range {v5 .. v10}, Ll/᩻ۜۘ;->֫(I[BI[BI)V

    .line 1144
    iget-object v5, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    iget v8, p1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface/range {v5 .. v10}, Ll/᩻ۜۘ;->ۧ(I[BI[BI)V

    .line 1145
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    invoke-interface {v0}, Ll/᩻ۜۘ;->ۧ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ܽ(I)V

    return-void

    :cond_6
    if-eqz v3, :cond_7

    .line 1147
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    invoke-interface {v0, v1}, Ll/᩻ۜۘ;->֫([B)V

    .line 1148
    iget-object v5, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    iget v0, p1, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/lit8 v8, v0, -0x4

    const/4 v10, 0x4

    const/4 v6, 0x4

    move-object v7, v1

    move-object v9, v1

    invoke-interface/range {v5 .. v10}, Ll/᩻ۜۘ;->ۧ(I[BI[BI)V

    .line 1149
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    invoke-interface {v0}, Ll/᩻ۜۘ;->ۧ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ܽ(I)V

    return-void

    :cond_7
    if-eqz v4, :cond_8

    .line 1151
    iget-object v5, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    iget v0, p1, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/lit8 v8, v0, -0x4

    const/4 v10, 0x4

    const/4 v6, 0x4

    move-object v7, v1

    move-object v9, v1

    invoke-interface/range {v5 .. v10}, Ll/᩻ۜۘ;->֫(I[BI[BI)V

    .line 1152
    iget-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    iget v1, p0, Ll/۟ۢۘ;->᩹֫:I

    invoke-interface {v0, v1}, Ll/֨ۢۘ;->֫(I)V

    .line 1153
    iget-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    iget-object v1, p1, Ll/ܺ᩻ۘ;->֫:[B

    iget v2, p1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {v0, v2, v1}, Ll/֨ۢۘ;->֫(I[B)V

    .line 1154
    iget-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    iget-object v1, p1, Ll/ܺ᩻ۘ;->֫:[B

    iget v2, p1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {v0, v2, v1}, Ll/֨ۢۘ;->ۧ(I[B)V

    .line 1155
    iget-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    invoke-interface {v0}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ܽ(I)V

    return-void

    .line 1157
    :cond_8
    iget-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    if-eqz v0, :cond_9

    .line 1158
    iget v2, p0, Ll/۟ۢۘ;->᩹֫:I

    invoke-interface {v0, v2}, Ll/֨ۢۘ;->֫(I)V

    .line 1159
    iget-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    iget-object v2, p1, Ll/ܺ᩻ۘ;->֫:[B

    iget v3, p1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {v0, v3, v2}, Ll/֨ۢۘ;->֫(I[B)V

    .line 1160
    iget-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    iget-object v2, p1, Ll/ܺ᩻ۘ;->֫:[B

    iget v3, p1, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {v0, v3, v2}, Ll/֨ۢۘ;->ۧ(I[B)V

    .line 1162
    :cond_9
    iget-object v5, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    if-eqz v5, :cond_a

    .line 1163
    iget v8, p1, Ll/ܺ᩻ۘ;->ۧ:I

    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object v7, v1

    move-object v9, v1

    invoke-interface/range {v5 .. v10}, Ll/᩻ۜۘ;->֫(I[BI[BI)V

    .line 1165
    :cond_a
    iget-object v0, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    if-eqz v0, :cond_b

    .line 1166
    invoke-interface {v0}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ܺ᩻ۘ;->ܽ(I)V

    :cond_b
    return-void
.end method

.method public final ֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    int-to-long v4, v3

    move/from16 v6, p3

    .line 1688
    :goto_0
    iget-boolean v7, v1, Ll/۟ۢۘ;->ܰ:Z

    const-wide/16 v8, 0x0

    if-eqz v7, :cond_2

    cmp-long v7, v4, v8

    if-lez v7, :cond_1

    .line 1689
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-wide v9, v1, Ll/۟ۢۘ;->ۜ֫:J

    sub-long/2addr v7, v9

    cmp-long v9, v7, v4

    if-gtz v9, :cond_0

    goto :goto_1

    .line 1690
    :cond_0
    new-instance v0, Ll/۫᩷ۘ;

    const-string v2, "timeout in waiting for rekeying process."

    .line 39
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1690
    throw v0

    :cond_1
    :goto_1
    const-wide/16 v7, 0xa

    .line 1693
    :try_start_0
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_2
    move-object/from16 v16, p2

    .line 1698
    monitor-enter v16

    .line 1699
    :try_start_1
    iget-wide v10, v2, Ll/᩵᩻ۘ;->ᩴ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    int-to-long v12, v6

    cmp-long v7, v10, v12

    if-gez v7, :cond_3

    .line 1701
    :try_start_2
    iget v7, v2, Ll/᩵᩻ۘ;->ۢ:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Ll/᩵᩻ۘ;->ۢ:I

    const-wide/16 v10, 0x64

    .line 1702
    invoke-virtual {v2, v10, v11}, Ljava/lang/Object;->wait(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 1705
    :try_start_3
    iget v3, v2, Ll/᩵᩻ۘ;->ۢ:I

    add-int/lit8 v3, v3, -0x1

    iput v3, v2, Ll/᩵᩻ۘ;->ۢ:I

    .line 1706
    throw v0

    .line 1705
    :catch_1
    :goto_2
    iget v7, v2, Ll/᩵᩻ۘ;->ۢ:I

    add-int/lit8 v7, v7, -0x1

    iput v7, v2, Ll/᩵᩻ۘ;->ۢ:I

    .line 1709
    :cond_3
    iget-boolean v7, v1, Ll/۟ۢۘ;->ܰ:Z

    if-eqz v7, :cond_4

    .line 1710
    monitor-exit v16

    goto :goto_0

    .line 1713
    :cond_4
    iget-wide v10, v2, Ll/᩵᩻ۘ;->ᩴ:J

    cmp-long v7, v10, v12

    if-ltz v7, :cond_5

    .line 1714
    iget-wide v3, v2, Ll/᩵᩻ۘ;->ᩴ:J

    sub-long/2addr v3, v12

    iput-wide v3, v2, Ll/᩵᩻ۘ;->ᩴ:J

    .line 1715
    monitor-exit v16

    goto/16 :goto_7

    .line 1717
    :cond_5
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1718
    iget-boolean v7, v2, Ll/᩵᩻ۘ;->֫:Z

    if-nez v7, :cond_11

    invoke-virtual/range {p2 .. p2}, Ll/᩵᩻ۘ;->ۢ()Z

    move-result v7

    if-eqz v7, :cond_11

    move-object/from16 v16, p2

    .line 1726
    monitor-enter v16

    .line 1727
    :try_start_4
    iget-wide v10, v2, Ll/᩵᩻ۘ;->ᩴ:J

    cmp-long v7, v10, v8

    if-lez v7, :cond_c

    .line 1728
    iget-wide v7, v2, Ll/᩵᩻ۘ;->ᩴ:J

    cmp-long v9, v7, v12

    if-lez v9, :cond_6

    move-wide v7, v12

    :cond_6
    cmp-long v9, v7, v12

    if-eqz v9, :cond_b

    long-to-int v9, v7

    .line 1733
    iget-object v10, v1, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    if-eqz v10, :cond_7

    iget v10, v1, Ll/۟ۢۘ;->ᩴ:I

    goto :goto_3

    :cond_7
    const/16 v10, 0x8

    .line 1734
    :goto_3
    iget-object v11, v1, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    if-eqz v11, :cond_8

    invoke-interface {v11}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v11

    goto :goto_4

    :cond_8
    const/4 v11, 0x0

    .line 79
    :goto_4
    iget-object v12, v0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    add-int/lit8 v13, v9, 0xe

    neg-int v15, v13

    add-int/lit8 v17, v10, -0x1

    and-int v15, v15, v17

    if-ge v15, v10, :cond_9

    add-int/2addr v15, v10

    :cond_9
    const/16 v10, 0x20

    .line 85
    invoke-static {v13, v15, v11, v10}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result v10

    .line 88
    iget-object v11, v12, Ll/ܺ᩻ۘ;->֫:[B

    array-length v15, v11

    iget v14, v12, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v14, v10

    add-int/lit8 v14, v14, -0xe

    sub-int/2addr v14, v9

    if-ge v15, v14, :cond_a

    .line 89
    new-array v14, v14, [B

    .line 90
    array-length v15, v11

    invoke-static {v11, v3, v14, v3, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    iput-object v14, v12, Ll/ܺ᩻ۘ;->֫:[B

    .line 101
    :cond_a
    iget-object v11, v12, Ll/ܺ᩻ۘ;->֫:[B

    iget v14, v12, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/lit8 v14, v14, -0xe

    sub-int/2addr v14, v9

    invoke-static {v11, v13, v11, v10, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v11, 0xa

    .line 103
    iput v11, v12, Ll/ܺ᩻ۘ;->ۧ:I

    .line 104
    invoke-virtual {v12, v9}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 105
    iput v13, v12, Ll/ܺ᩻ۘ;->ۧ:I

    const/4 v14, 0x5

    goto :goto_5

    :cond_b
    const/4 v14, 0x5

    const/4 v10, 0x0

    .line 1736
    :goto_5
    iget-object v9, v0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    .line 242
    iget-object v9, v9, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v9, v9, v14

    .line 94
    iget v11, v2, Ll/᩵᩻ۘ;->ܺ:I

    long-to-int v12, v7

    sub-int/2addr v6, v12

    .line 1739
    iget-wide v12, v2, Ll/᩵᩻ۘ;->ᩴ:J

    sub-long/2addr v12, v7

    iput-wide v12, v2, Ll/᩵᩻ۘ;->ᩴ:J

    const/4 v7, 0x1

    goto :goto_6

    :cond_c
    const/4 v14, 0x5

    const/4 v11, -0x1

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 1742
    :goto_6
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v7, :cond_e

    .line 1744
    invoke-direct/range {p0 .. p1}, Ll/۟ۢۘ;->ܽ(Ll/۠ۢۘ;)V

    if-nez v6, :cond_d

    return-void

    .line 110
    :cond_d
    iget-object v7, v0, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    iget-object v8, v7, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v12, 0xe

    invoke-static {v8, v10, v8, v12, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    iget-object v8, v7, Ll/ܺ᩻ۘ;->֫:[B

    aput-byte v9, v8, v14

    const/4 v8, 0x6

    .line 112
    iput v8, v7, Ll/ܺ᩻ۘ;->ۧ:I

    .line 113
    invoke-virtual {v7, v11}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 114
    invoke-virtual {v7, v6}, Ll/ܺ᩻ۘ;->ۧ(I)V

    add-int/lit8 v8, v6, 0xe

    .line 115
    iput v8, v7, Ll/ܺ᩻ۘ;->ۧ:I

    :cond_e
    move-object/from16 v16, p2

    .line 1751
    monitor-enter v16

    .line 1752
    :try_start_5
    iget-boolean v7, v1, Ll/۟ۢۘ;->ܰ:Z

    if-eqz v7, :cond_f

    .line 1753
    monitor-exit v16

    goto/16 :goto_0

    .line 1755
    :cond_f
    iget-wide v7, v2, Ll/᩵᩻ۘ;->ᩴ:J

    int-to-long v9, v6

    cmp-long v11, v7, v9

    if-ltz v11, :cond_10

    .line 1756
    iget-wide v3, v2, Ll/᩵᩻ۘ;->ᩴ:J

    sub-long/2addr v3, v9

    iput-wide v3, v2, Ll/᩵᩻ۘ;->ᩴ:J

    .line 1757
    monitor-exit v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1772
    :goto_7
    invoke-direct/range {p0 .. p1}, Ll/۟ۢۘ;->ܽ(Ll/۠ۢۘ;)V

    return-void

    .line 1770
    :cond_10
    :try_start_6
    monitor-exit v16

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0

    :catchall_2
    move-exception v0

    .line 1742
    :try_start_7
    monitor-exit v16
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v0

    .line 1719
    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v2, "channel is broken"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_3
    move-exception v0

    .line 1717
    :try_start_8
    monitor-exit v16
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw v0
.end method

.method public final ֫(Ll/ܺ᩻ۘ;)V
    .locals 26

    move-object/from16 v7, p0

    .line 1194
    iget-object v0, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/᩻ۜۘ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1195
    :goto_0
    iget-object v3, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ll/᩻ۜۘ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v0, :cond_2

    if-nez v3, :cond_2

    .line 1196
    iget-object v4, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    if-eqz v4, :cond_2

    iget-object v4, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    if-eqz v4, :cond_2

    .line 1197
    invoke-interface {v4}, Ll/֨ۢۘ;->֫()Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    move-object/from16 v4, p1

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    move-object/from16 v4, p1

    const/4 v5, 0x0

    .line 1199
    :goto_2
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ۡ()V

    const-string v6, "Packet corrupt"

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x5

    const/4 v13, 0x4

    if-eqz v0, :cond_6

    const v14, 0xff00

    .line 1202
    iget-object v15, v7, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    const/high16 v16, 0xff0000

    iget-object v12, v4, Ll/ܺ᩻ۘ;->֫:[B

    const/high16 v18, -0x1000000

    iget v11, v4, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-virtual {v15, v11, v13, v12}, Ll/᩵᩷ۘ;->֫(II[B)V

    .line 1203
    iget v11, v4, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v11, v13

    iput v11, v4, Ll/ܺ᩻ۘ;->ۧ:I

    .line 1205
    iget-object v11, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget v12, v7, Ll/۟ۢۘ;->᩸֫:I

    invoke-interface {v11, v12}, Ll/᩻ۜۘ;->֫(I)V

    new-array v11, v13, [B

    .line 1208
    iget-object v12, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v15, v4, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v23, 0x4

    const/16 v25, 0x0

    const/16 v21, 0x0

    move-object/from16 v20, v12

    move-object/from16 v22, v15

    move-object/from16 v24, v11

    invoke-interface/range {v20 .. v25}, Ll/᩻ۜۘ;->֫(I[BI[BI)V

    .line 1209
    aget-byte v12, v11, v2

    shl-int/lit8 v12, v12, 0x18

    and-int v12, v12, v18

    aget-byte v1, v11, v1

    shl-int/lit8 v1, v1, 0x10

    and-int v1, v1, v16

    or-int/2addr v1, v12

    aget-byte v9, v11, v9

    shl-int/lit8 v9, v9, 0x8

    and-int/2addr v9, v14

    or-int/2addr v1, v9

    aget-byte v8, v11, v8

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v1, v8

    if-lt v1, v10, :cond_5

    const/high16 v8, 0x40000

    if-gt v1, v8, :cond_5

    .line 1215
    iget-object v8, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    invoke-interface {v8}, Ll/᩻ۜۘ;->ۧ()I

    move-result v8

    add-int/2addr v8, v1

    .line 1216
    iget v1, v4, Ll/ܺ᩻ۘ;->ۧ:I

    add-int v9, v1, v8

    iget-object v12, v4, Ll/ܺ᩻ۘ;->֫:[B

    array-length v14, v12

    if-le v9, v14, :cond_3

    .line 1217
    new-array v9, v9, [B

    .line 1218
    invoke-static {v12, v2, v9, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1219
    iput-object v9, v4, Ll/ܺ᩻ۘ;->֫:[B

    .line 1222
    :cond_3
    iget v1, v7, Ll/۟ۢۘ;->ۚ֫:I

    rem-int v1, v8, v1

    if-nez v1, :cond_4

    .line 1230
    iget-object v1, v7, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    iget-object v9, v4, Ll/ܺ᩻ۘ;->֫:[B

    iget v12, v4, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-virtual {v1, v12, v8, v9}, Ll/᩵᩷ۘ;->֫(II[B)V

    .line 1232
    iget-object v1, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    invoke-interface {v1}, Ll/᩻ۜۘ;->ۧ()I

    move-result v1

    sub-int/2addr v8, v1

    .line 1233
    iget v1, v4, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v1, v8

    iput v1, v4, Ll/ܺ᩻ۘ;->ۧ:I

    .line 1235
    :try_start_0
    iget-object v14, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v1, v4, Ll/ܺ᩻ۘ;->֫:[B

    add-int/lit8 v17, v8, 0x4

    const/16 v19, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v1

    move-object/from16 v18, v1

    invoke-interface/range {v14 .. v19}, Ll/᩻ۜۘ;->ۧ(I[BI[BI)V
    :try_end_0
    .catch Ljavax/crypto/AEADBadTagException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1240
    iget-object v1, v4, Ll/ܺ᩻ۘ;->֫:[B

    invoke-static {v11, v2, v1, v2, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_4

    :catch_0
    move-exception v0

    .line 1237
    new-instance v1, Ll/۫᩷ۘ;

    .line 43
    invoke-direct {v1, v6, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1237
    throw v1

    .line 3560
    :cond_4
    iget-object v0, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 1224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1227
    iget-object v3, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v0, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    iget v1, v7, Ll/۟ۢۘ;->ۚ֫:I

    const/high16 v2, 0x40000

    sub-int v6, v2, v1

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v4, v0

    invoke-direct/range {v1 .. v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;Ll/᩻ۜۘ;Ll/֨ۢۘ;II)V

    const/4 v0, 0x0

    throw v0

    .line 1213
    :cond_5
    iget-object v3, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v4, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    const/4 v5, 0x0

    const/high16 v6, 0x40000

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;Ll/᩻ۜۘ;Ll/֨ۢۘ;II)V

    const/4 v0, 0x0

    throw v0

    :cond_6
    const v1, 0xff00

    const/high16 v8, 0xff0000

    const/high16 v9, -0x1000000

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v14, 0x1

    if-nez v3, :cond_f

    if-eqz v5, :cond_7

    goto/16 :goto_3

    .line 1291
    :cond_7
    iget-object v6, v7, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    iget-object v15, v4, Ll/ܺ᩻ۘ;->֫:[B

    iget v13, v4, Ll/ܺ᩻ۘ;->ۧ:I

    iget v10, v7, Ll/۟ۢۘ;->ۚ֫:I

    invoke-virtual {v6, v13, v10, v15}, Ll/᩵᩷ۘ;->֫(II[B)V

    .line 1292
    iget v6, v4, Ll/ܺ᩻ۘ;->ۧ:I

    iget v10, v7, Ll/۟ۢۘ;->ۚ֫:I

    add-int/2addr v6, v10

    iput v6, v4, Ll/ܺ᩻ۘ;->ۧ:I

    .line 1293
    iget-object v6, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    if-eqz v6, :cond_8

    .line 1294
    iget-object v13, v4, Ll/ܺ᩻ۘ;->֫:[B

    const/16 v21, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v6

    move-object/from16 v22, v13

    move/from16 v23, v10

    move-object/from16 v24, v13

    invoke-interface/range {v20 .. v25}, Ll/᩻ۜۘ;->֫(I[BI[BI)V

    .line 1296
    :cond_8
    iget-object v6, v4, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v10, v6, v2

    shl-int/lit8 v10, v10, 0x18

    and-int/2addr v9, v10

    aget-byte v10, v6, v14

    shl-int/lit8 v10, v10, 0x10

    and-int/2addr v8, v10

    or-int/2addr v8, v9

    aget-byte v9, v6, v12

    shl-int/lit8 v9, v9, 0x8

    and-int/2addr v1, v9

    or-int/2addr v1, v8

    aget-byte v8, v6, v11

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v1, v8

    const/4 v8, 0x5

    if-lt v1, v8, :cond_e

    const/high16 v8, 0x40000

    if-gt v1, v8, :cond_e

    add-int/lit8 v1, v1, 0x4

    .line 1302
    iget v8, v7, Ll/۟ۢۘ;->ۚ֫:I

    sub-int/2addr v1, v8

    .line 1306
    iget v8, v4, Ll/ܺ᩻ۘ;->ۧ:I

    add-int v9, v8, v1

    array-length v10, v6

    if-le v9, v10, :cond_9

    .line 1307
    new-array v9, v9, [B

    .line 1308
    invoke-static {v6, v2, v9, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1309
    iput-object v9, v4, Ll/ܺ᩻ۘ;->֫:[B

    .line 1312
    :cond_9
    iget v6, v7, Ll/۟ۢۘ;->ۚ֫:I

    rem-int v6, v1, v6

    if-nez v6, :cond_d

    if-lez v1, :cond_a

    .line 1321
    iget-object v6, v7, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    iget-object v8, v4, Ll/ܺ᩻ۘ;->֫:[B

    iget v9, v4, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-virtual {v6, v9, v1, v8}, Ll/᩵᩷ۘ;->֫(II[B)V

    .line 1322
    iget v6, v4, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v6, v1

    iput v6, v4, Ll/ܺ᩻ۘ;->ۧ:I

    .line 1323
    iget-object v9, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    if-eqz v9, :cond_a

    .line 1324
    iget-object v13, v4, Ll/ܺ᩻ۘ;->֫:[B

    iget v14, v7, Ll/۟ۢۘ;->ۚ֫:I

    move v10, v14

    move-object v11, v13

    move v12, v1

    invoke-interface/range {v9 .. v14}, Ll/᩻ۜۘ;->֫(I[BI[BI)V

    .line 1328
    :cond_a
    iget-object v6, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    if-eqz v6, :cond_c

    .line 1329
    iget v8, v7, Ll/۟ۢۘ;->᩸֫:I

    invoke-interface {v6, v8}, Ll/֨ۢۘ;->֫(I)V

    .line 1330
    iget-object v6, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    iget-object v8, v4, Ll/ܺ᩻ۘ;->֫:[B

    iget v9, v4, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {v6, v9, v8}, Ll/֨ۢۘ;->֫(I[B)V

    .line 1331
    iget-object v6, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    iget-object v8, v7, Ll/۟ۢۘ;->۠֫:[B

    invoke-interface {v6, v2, v8}, Ll/֨ۢۘ;->ۧ(I[B)V

    .line 1333
    iget-object v6, v7, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    iget-object v8, v7, Ll/۟ۢۘ;->ܶ֫:[B

    array-length v9, v8

    invoke-virtual {v6, v2, v9, v8}, Ll/᩵᩷ۘ;->֫(II[B)V

    .line 1334
    iget-object v6, v7, Ll/۟ۢۘ;->۠֫:[B

    iget-object v8, v7, Ll/۟ۢۘ;->ܶ֫:[B

    invoke-static {v6, v8}, Ll/᩵ۡۘ;->ۧ([B[B)Z

    move-result v6

    if-nez v6, :cond_c

    .line 1335
    iget v0, v7, Ll/۟ۢۘ;->ۚ֫:I

    add-int v2, v1, v0

    const/high16 v3, 0x40000

    if-le v2, v3, :cond_b

    .line 1336
    new-instance v0, Ljava/io/IOException;

    const-string v1, "MAC Error"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1338
    :cond_b
    iget-object v5, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v6, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    iget v8, v4, Ll/ܺ᩻ۘ;->ۧ:I

    sub-int v11, v3, v1

    sub-int v0, v11, v0

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move v5, v8

    move v6, v0

    invoke-direct/range {v1 .. v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;Ll/᩻ۜۘ;Ll/֨ۢۘ;II)V

    const/4 v0, 0x0

    throw v0

    :cond_c
    move-object/from16 v4, p1

    goto/16 :goto_4

    .line 3560
    :cond_d
    iget-object v0, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 1314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1317
    iget-object v3, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v4, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    iget v0, v7, Ll/۟ۢۘ;->ۚ֫:I

    const/high16 v1, 0x40000

    sub-int v6, v1, v0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;Ll/᩻ۜۘ;Ll/֨ۢۘ;II)V

    const/4 v0, 0x0

    throw v0

    .line 1300
    :cond_e
    iget-object v3, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v4, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    const/4 v5, 0x0

    const/high16 v6, 0x40000

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;Ll/᩻ۜۘ;Ll/֨ۢۘ;II)V

    const/4 v0, 0x0

    throw v0

    .line 1242
    :cond_f
    :goto_3
    iget-object v10, v7, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    iget-object v13, v4, Ll/ܺ᩻ۘ;->֫:[B

    iget v15, v4, Ll/ܺ᩻ۘ;->ۧ:I

    const/4 v11, 0x4

    invoke-virtual {v10, v15, v11, v13}, Ll/᩵᩷ۘ;->֫(II[B)V

    .line 1243
    iget v10, v4, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v10, v11

    iput v10, v4, Ll/ܺ᩻ۘ;->ۧ:I

    .line 1244
    iget-object v10, v4, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v11, v10, v2

    shl-int/lit8 v11, v11, 0x18

    and-int/2addr v9, v11

    aget-byte v11, v10, v14

    shl-int/lit8 v11, v11, 0x10

    and-int/2addr v8, v11

    or-int/2addr v8, v9

    aget-byte v9, v10, v12

    shl-int/lit8 v9, v9, 0x8

    and-int/2addr v1, v9

    or-int/2addr v1, v8

    const/4 v8, 0x3

    aget-byte v8, v10, v8

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v1, v8

    const/4 v8, 0x5

    if-lt v1, v8, :cond_29

    const/high16 v8, 0x40000

    if-gt v1, v8, :cond_29

    if-eqz v3, :cond_10

    .line 1251
    iget-object v8, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    invoke-interface {v8}, Ll/᩻ۜۘ;->ۧ()I

    move-result v8

    add-int/2addr v1, v8

    :cond_10
    move v11, v1

    .line 1253
    iget v1, v4, Ll/ܺ᩻ۘ;->ۧ:I

    add-int v8, v1, v11

    iget-object v9, v4, Ll/ܺ᩻ۘ;->֫:[B

    array-length v10, v9

    if-le v8, v10, :cond_11

    .line 1254
    new-array v8, v8, [B

    .line 1255
    invoke-static {v9, v2, v8, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1256
    iput-object v8, v4, Ll/ܺ᩻ۘ;->֫:[B

    .line 1259
    :cond_11
    iget v1, v7, Ll/۟ۢۘ;->ۚ֫:I

    rem-int v1, v11, v1

    if-nez v1, :cond_28

    .line 1267
    iget-object v1, v7, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    iget-object v8, v4, Ll/ܺ᩻ۘ;->֫:[B

    iget v9, v4, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-virtual {v1, v9, v11, v8}, Ll/᩵᩷ۘ;->֫(II[B)V

    .line 1268
    iget v1, v4, Ll/ܺ᩻ۘ;->ۧ:I

    add-int/2addr v1, v11

    iput v1, v4, Ll/ܺ᩻ۘ;->ۧ:I

    if-eqz v3, :cond_12

    .line 1272
    :try_start_1
    iget-object v1, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v8, v4, Ll/ܺ᩻ۘ;->֫:[B

    invoke-interface {v1, v8}, Ll/᩻ۜۘ;->֫([B)V

    .line 1273
    iget-object v8, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v12, v4, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v9, 0x4

    const/4 v13, 0x4

    move-object v10, v12

    invoke-interface/range {v8 .. v13}, Ll/᩻ۜۘ;->ۧ(I[BI[BI)V
    :try_end_1
    .catch Ljavax/crypto/AEADBadTagException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1278
    iget v1, v4, Ll/ܺ᩻ۘ;->ۧ:I

    iget-object v6, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    invoke-interface {v6}, Ll/᩻ۜۘ;->ۧ()I

    move-result v6

    sub-int/2addr v1, v6

    iput v1, v4, Ll/ܺ᩻ۘ;->ۧ:I

    goto :goto_4

    :catch_1
    move-exception v0

    .line 1275
    new-instance v1, Ll/۫᩷ۘ;

    .line 43
    invoke-direct {v1, v6, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1275
    throw v1

    .line 1280
    :cond_12
    iget-object v1, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    iget v8, v7, Ll/۟ۢۘ;->᩸֫:I

    invoke-interface {v1, v8}, Ll/֨ۢۘ;->֫(I)V

    .line 1281
    iget-object v1, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    iget-object v8, v4, Ll/ܺ᩻ۘ;->֫:[B

    iget v9, v4, Ll/ܺ᩻ۘ;->ۧ:I

    invoke-interface {v1, v9, v8}, Ll/֨ۢۘ;->֫(I[B)V

    .line 1282
    iget-object v1, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    iget-object v8, v7, Ll/۟ۢۘ;->۠֫:[B

    invoke-interface {v1, v2, v8}, Ll/֨ۢۘ;->ۧ(I[B)V

    .line 1284
    iget-object v1, v7, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    iget-object v8, v7, Ll/۟ۢۘ;->ܶ֫:[B

    array-length v9, v8

    invoke-virtual {v1, v2, v9, v8}, Ll/᩵᩷ۘ;->֫(II[B)V

    .line 1285
    iget-object v1, v7, Ll/۟ۢۘ;->۠֫:[B

    iget-object v8, v7, Ll/۟ۢۘ;->ܶ֫:[B

    invoke-static {v1, v8}, Ll/᩵ۡۘ;->ۧ([B[B)Z

    move-result v1

    if-eqz v1, :cond_27

    .line 1288
    iget-object v8, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v12, v4, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v9, 0x4

    const/4 v13, 0x4

    move-object v10, v12

    invoke-interface/range {v8 .. v13}, Ll/᩻ۜۘ;->֫(I[BI[BI)V

    .line 1345
    :goto_4
    iget v1, v7, Ll/۟ۢۘ;->᩸֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v7, Ll/۟ۢۘ;->᩸֫:I

    if-nez v1, :cond_15

    iget-boolean v1, v7, Ll/۟ۢۘ;->۫:Z

    if-nez v1, :cond_13

    iget-boolean v1, v7, Ll/۟ۢۘ;->᩵֫:Z

    if-eqz v1, :cond_15

    :cond_13
    iget-boolean v1, v7, Ll/۟ۢۘ;->ۧ֫:Z

    if-nez v1, :cond_14

    goto :goto_5

    .line 1346
    :cond_14
    new-instance v0, Ll/ܰ᩷ۘ;

    const-string v1, "incoming sequence number wrapped during initial KEX"

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1346
    throw v0

    .line 1349
    :cond_15
    :goto_5
    iget-object v1, v7, Ll/۟ۢۘ;->֫֫:Ll/᩷ۜۘ;

    if-eqz v1, :cond_17

    .line 1351
    iget-object v6, v4, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v8, 0x4

    aget-byte v9, v6, v8

    .line 1352
    iget-object v8, v7, Ll/۟ۢۘ;->ۨ֫:[I

    iget v10, v4, Ll/ܺ᩻ۘ;->ۧ:I

    const/4 v11, 0x5

    sub-int/2addr v10, v11

    sub-int/2addr v10, v9

    aput v10, v8, v2

    .line 1353
    invoke-interface {v1, v6, v8}, Ll/᩷ۜۘ;->֫([B[I)[B

    move-result-object v1

    if-eqz v1, :cond_16

    .line 1355
    iput-object v1, v4, Ll/ܺ᩻ۘ;->֫:[B

    .line 1356
    iget-object v1, v7, Ll/۟ۢۘ;->ۨ֫:[I

    aget v1, v1, v2

    add-int/2addr v1, v11

    iput v1, v4, Ll/ܺ᩻ۘ;->ۧ:I

    goto :goto_6

    .line 3560
    :cond_16
    iget-object v0, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 1358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_c

    :cond_17
    const/4 v11, 0x5

    .line 242
    :goto_6
    iget-object v1, v4, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v1, v1, v11

    and-int/lit16 v1, v1, 0xff

    const/4 v6, 0x1

    if-eq v1, v6, :cond_26

    .line 1380
    iget-boolean v6, v7, Ll/۟ۢۘ;->ۧ֫:Z

    if-eqz v6, :cond_18

    iget-boolean v6, v7, Ll/۟ۢۘ;->ۙ:Z

    if-eqz v6, :cond_18

    goto/16 :goto_c

    :cond_18
    const/4 v6, 0x2

    if-ne v1, v6, :cond_19

    goto/16 :goto_b

    :cond_19
    const/4 v6, 0x3

    if-ne v1, v6, :cond_1a

    .line 238
    iput v2, v4, Ll/ܺ᩻ۘ;->ܽ:I

    .line 1385
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1386
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 1387
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 3560
    iget-object v1, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v1

    .line 1388
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_b

    :cond_1a
    const/4 v6, 0x4

    if-ne v1, v6, :cond_1b

    .line 238
    iput v2, v4, Ll/ܺ᩻ۘ;->ܽ:I

    .line 1393
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1394
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ۜ()I

    goto/16 :goto_b

    :cond_1b
    const/16 v6, 0x5d

    if-ne v1, v6, :cond_1c

    .line 238
    iput v2, v4, Ll/ܺ᩻ۘ;->ܽ:I

    .line 1402
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1403
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 1404
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    invoke-direct {v7, v1}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v1

    if-eqz v1, :cond_23

    .line 1406
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ۢ()J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Ll/᩵᩻ۘ;->֫(J)V

    goto/16 :goto_b

    :cond_1c
    const/4 v6, 0x7

    if-ne v1, v6, :cond_24

    .line 238
    iput v2, v4, Ll/ܺ᩻ۘ;->ܽ:I

    .line 1410
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1411
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 1413
    iget-boolean v1, v7, Ll/۟ۢۘ;->۬:Z

    if-nez v1, :cond_1d

    .line 3560
    iget-object v1, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v1

    .line 1415
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_7

    .line 1419
    :cond_1d
    iget-boolean v1, v7, Ll/۟ۢۘ;->ᩳ֫:Z

    if-eqz v1, :cond_1e

    .line 3560
    iget-object v1, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v1

    .line 1421
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_7

    .line 1425
    :cond_1e
    iget-boolean v1, v7, Ll/۟ۢۘ;->ܰ:Z

    if-eqz v1, :cond_1f

    .line 3560
    iget-object v1, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v1

    .line 1427
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_7
    const/4 v1, 0x1

    goto :goto_8

    .line 3560
    :cond_1f
    iget-object v1, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v1

    .line 1432
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 1436
    :goto_8
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ۢ()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    :goto_9
    cmp-long v6, v10, v8

    if-gez v6, :cond_23

    .line 1438
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v6

    .line 1439
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v12

    if-nez v1, :cond_22

    .line 409
    array-length v13, v6

    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v15, Ljava/lang/String;

    invoke-direct {v15, v6, v2, v13, v14}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const-string v6, "server-sig-algs"

    .line 1440
    invoke-virtual {v15, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_22

    .line 409
    array-length v6, v12

    .line 405
    new-instance v13, Ljava/lang/String;

    invoke-direct {v13, v12, v2, v6, v14}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 3560
    iget-object v6, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v6}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v6

    .line 1442
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1445
    iget-boolean v6, v7, Ll/۟ۢۘ;->۫֫:Z

    if-eqz v6, :cond_21

    .line 1446
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_20

    const-string v6, ",rsa-sha2-256,rsa-sha2-512"

    .line 1447
    invoke-virtual {v13, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_a

    :cond_20
    const-string v6, "rsa-sha2-256,rsa-sha2-512"

    :goto_a
    move-object v13, v6

    .line 3560
    iget-object v6, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v6}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v6

    .line 1451
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1456
    :cond_21
    invoke-static {v13}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    iput-object v6, v7, Ll/۟ۢۘ;->ۙ֫:[Ljava/lang/String;

    :cond_22
    const-wide/16 v12, 0x1

    add-long/2addr v10, v12

    goto :goto_9

    :cond_23
    :goto_b
    const/4 v1, 0x1

    goto/16 :goto_2

    :cond_24
    const/16 v0, 0x34

    if-ne v1, v0, :cond_25

    const/4 v0, 0x1

    .line 1460
    iput-boolean v0, v7, Ll/۟ۢۘ;->ᩳ֫:Z

    .line 1461
    iget-object v0, v7, Ll/۟ۢۘ;->֫֫:Ll/᩷ۜۘ;

    if-nez v0, :cond_25

    iget-object v0, v7, Ll/۟ۢۘ;->᩸:Ll/᩷ۜۘ;

    if-nez v0, :cond_25

    .line 1463
    iget-object v0, v7, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    .line 1464
    invoke-direct {v7, v0}, Ll/۟ۢۘ;->ܳ(Ljava/lang/String;)V

    .line 1465
    iget-object v0, v7, Ll/۟ۢۘ;->ۛ:[Ljava/lang/String;

    aget-object v0, v0, v6

    .line 1466
    invoke-direct {v7, v0}, Ll/۟ۢۘ;->᩻(Ljava/lang/String;)V

    .line 238
    :cond_25
    :goto_c
    iput v2, v4, Ll/ܺ᩻ۘ;->ܽ:I

    return-void

    :cond_26
    iput v2, v4, Ll/ܺ᩻ۘ;->ܽ:I

    .line 1369
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1370
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 1371
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1372
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v1

    .line 1373
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v3

    .line 409
    array-length v4, v1

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v1, v2, v4, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 409
    array-length v1, v3

    .line 405
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3, v2, v1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 1376
    new-instance v1, Ll/᩺᩷ۘ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SSH_MSG_DISCONNECT: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1376
    throw v1

    .line 1286
    :cond_27
    new-instance v0, Ll/۫᩷ۘ;

    .line 39
    invoke-direct {v0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1286
    throw v0

    .line 3560
    :cond_28
    iget-object v0, v7, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 1261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1264
    iget-object v3, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v0, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    iget v1, v7, Ll/۟ۢۘ;->ۚ֫:I

    const/high16 v2, 0x40000

    sub-int v6, v2, v1

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v4, v0

    invoke-direct/range {v1 .. v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;Ll/᩻ۜۘ;Ll/֨ۢۘ;II)V

    const/4 v0, 0x0

    throw v0

    .line 1248
    :cond_29
    iget-object v3, v7, Ll/۟ۢۘ;->֡֫:Ll/᩻ۜۘ;

    iget-object v4, v7, Ll/۟ۢۘ;->֨֫:Ll/֨ۢۘ;

    const/4 v5, 0x0

    const/high16 v6, 0x40000

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v6}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;Ll/᩻ۜۘ;Ll/֨ۢۘ;II)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(Ll/ᩴۡۘ;)V
    .locals 0

    .line 2912
    iput-object p1, p0, Ll/۟ۢۘ;->᩺֫:Ll/ᩴۡۘ;

    return-void
.end method

.method public final ֫(Ll/᩵᩻ۘ;)V
    .locals 2

    .line 2159
    iget-object v0, p0, Ll/۟ۢۘ;->ۚ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    .line 2160
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 2162
    :try_start_0
    iget-object v1, p0, Ll/۟ۢۘ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2164
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 2165
    throw p1
.end method

.method public final ۜ()[Ljava/lang/String;
    .locals 1

    .line 727
    iget-object v0, p0, Ll/۟ۢۘ;->ܺ֫:[Ljava/lang/String;

    return-object v0
.end method

.method public final ۡ()V
    .locals 14

    .line 1827
    new-instance v0, Ll/ۨۢۘ;

    invoke-direct {v0, p0}, Ll/ۨۢۘ;-><init>(Ll/۟ۢۘ;)V

    iput-object v0, p0, Ll/۟ۢۘ;->ۤ֫:Ll/ۨۢۘ;

    .line 1830
    new-instance v1, Ll/ܺ᩻ۘ;

    invoke-direct {v1}, Ll/ܺ᩻ۘ;-><init>()V

    .line 1831
    new-instance v2, Ll/۠ۢۘ;

    invoke-direct {v2, v1}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    const/4 v3, 0x1

    new-array v4, v3, [I

    new-array v5, v3, [I

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    move-object v8, v6

    :catch_0
    :cond_0
    :goto_1
    const/4 v0, 0x0

    .line 1840
    :goto_2
    :try_start_0
    iget-boolean v9, p0, Ll/۟ۢۘ;->ܿ֫:Z

    if-eqz v9, :cond_17

    iget-object v9, p0, Ll/۟ۢۘ;->ۤ֫:Ll/ۨۢۘ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    if-eqz v9, :cond_17

    .line 1842
    :try_start_1
    invoke-virtual {p0, v1}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V
    :try_end_1
    .catch Ljava/io/InterruptedIOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 242
    :try_start_2
    iget-object v0, v1, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v9, 0x5

    aget-byte v0, v0, v9

    and-int/lit16 v0, v0, 0xff

    if-eqz v8, :cond_2

    .line 1858
    invoke-virtual {v8}, Ll/ܽۢۘ;->ܽ()I

    move-result v9

    if-ne v9, v0, :cond_2

    .line 1859
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, p0, Ll/۟ۢۘ;->ۜ֫:J

    .line 1860
    invoke-virtual {v8, v1}, Ll/ܽۢۘ;->֫(Ll/ܺ᩻ۘ;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 1862
    :cond_1
    new-instance v1, Ll/۫᩷ۘ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "verify: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1862
    throw v1

    :cond_2
    const/16 v9, 0x14

    if-eq v0, v9, :cond_14

    const/16 v9, 0x15

    if-eq v0, v9, :cond_13

    packed-switch v0, :pswitch_data_0

    const/16 v9, 0x5d

    packed-switch v0, :pswitch_data_1

    .line 2134
    new-instance v1, Ljava/io/IOException;

    goto/16 :goto_6

    .line 2121
    :pswitch_0
    iget-object v9, p0, Ll/۟ۢۘ;->ۤ:Ll/ܰۢۘ;

    invoke-virtual {v9}, Ll/ܰۢۘ;->ۧ()Ljava/lang/Thread;

    move-result-object v9

    if-eqz v9, :cond_0

    .line 2123
    iget-object v10, p0, Ll/۟ۢۘ;->ۤ:Ll/ܰۢۘ;

    const/16 v11, 0x51

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne v0, v11, :cond_3

    .line 2124
    iget-object v0, p0, Ll/۟ۢۘ;->ۤ:Ll/ܰۢۘ;

    invoke-virtual {v0}, Ll/ܰۢۘ;->֫()I

    move-result v0

    if-nez v0, :cond_3

    .line 2125
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2126
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 2127
    iget-object v0, p0, Ll/۟ۢۘ;->ۤ:Ll/ܰۢۘ;

    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v10

    invoke-virtual {v0, v10}, Ll/ܰۢۘ;->֫(I)V

    .line 2129
    :cond_3
    invoke-virtual {v9}, Ljava/lang/Thread;->interrupt()V

    goto :goto_1

    .line 2109
    :pswitch_1
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2110
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 2111
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 2112
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2114
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    const/16 v0, 0x52

    .line 2115
    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 2116
    invoke-virtual {p0, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    goto/16 :goto_1

    .line 2099
    :pswitch_2
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2100
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 2101
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 2102
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v0

    if-nez v0, :cond_4

    goto/16 :goto_1

    .line 2106
    :cond_4
    iput v7, v0, Ll/᩵᩻ۘ;->ۖ:I

    goto/16 :goto_1

    .line 2089
    :pswitch_3
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2090
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 2091
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 2092
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v0

    if-nez v0, :cond_5

    goto/16 :goto_1

    .line 2096
    :cond_5
    iput v3, v0, Ll/᩵᩻ۘ;->ۖ:I

    goto/16 :goto_1

    .line 2023
    :pswitch_4
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2024
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 2025
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 2026
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v9

    .line 2027
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->֫()I

    move-result v10

    if-eqz v10, :cond_6

    const/4 v10, 0x1

    goto :goto_3

    :cond_6
    const/4 v10, 0x0

    .line 2028
    :goto_3
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 409
    array-length v11, v9

    sget-object v12, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v13, Ljava/lang/String;

    invoke-direct {v13, v9, v7, v11, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const-string v9, "exit-status"

    .line 2031
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 2032
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    const/16 v9, 0x63

    goto :goto_4

    :cond_7
    const/16 v9, 0x64

    :goto_4
    if-eqz v10, :cond_0

    .line 2037
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    .line 2038
    invoke-virtual {v1, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 94
    iget v0, v0, Ll/᩵᩻ۘ;->ܺ:I

    .line 2039
    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2040
    invoke-virtual {p0, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    goto/16 :goto_1

    .line 1980
    :pswitch_5
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1981
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 1982
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1983
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1986
    invoke-virtual {v0}, Ll/᩵᩻ۘ;->ۧ()V

    goto/16 :goto_1

    .line 1965
    :pswitch_6
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1966
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 1967
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1968
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1972
    invoke-virtual {v0}, Ll/᩵᩻ۘ;->ᩳ()V

    goto/16 :goto_1

    .line 1921
    :pswitch_7
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1922
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 1923
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1924
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v10

    .line 1925
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 218
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 174
    iget v11, v1, Ll/ܺ᩻ۘ;->ܽ:I

    add-int v12, v11, v0

    .line 175
    iput v12, v1, Ll/ܺ᩻ۘ;->ܽ:I

    aput v11, v4, v7

    aput v0, v5, v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    if-nez v10, :cond_8

    goto/16 :goto_1

    :cond_8
    if-nez v0, :cond_9

    goto/16 :goto_1

    .line 449
    :cond_9
    :try_start_3
    iget-object v0, v10, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    throw v6
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 1938
    :catch_1
    :try_start_4
    aget v0, v5, v7

    .line 1939
    iget v11, v10, Ll/᩵᩻ۘ;->ۜ:I

    sub-int/2addr v11, v0

    .line 413
    iput v11, v10, Ll/᩵᩻ۘ;->ۜ:I

    .line 1940
    iget v0, v10, Ll/᩵᩻ۘ;->ۜ:I

    iget v11, v10, Ll/᩵᩻ۘ;->᩷:I

    div-int/lit8 v11, v11, 0x2

    if-ge v0, v11, :cond_0

    .line 1941
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    .line 1942
    invoke-virtual {v1, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 94
    iget v0, v10, Ll/᩵᩻ۘ;->ܺ:I

    .line 1943
    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 1944
    iget v0, v10, Ll/᩵᩻ۘ;->᩷:I

    iget v9, v10, Ll/᩵᩻ۘ;->ۜ:I

    sub-int/2addr v0, v9

    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    move-object v0, v10

    .line 1945
    monitor-enter v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 1946
    :try_start_5
    iget-boolean v9, v10, Ll/᩵᩻ۘ;->֫:Z

    if-nez v9, :cond_a

    .line 1947
    invoke-virtual {p0, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 1948
    :cond_a
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1949
    :try_start_6
    iget v0, v10, Ll/᩵᩻ۘ;->᩷:I

    .line 413
    :goto_5
    iput v0, v10, Ll/᩵᩻ۘ;->ۜ:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    goto/16 :goto_1

    :catchall_0
    move-exception v1

    .line 1948
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    throw v1

    .line 1881
    :pswitch_8
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1882
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->֫()I

    .line 1883
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->֫()I

    .line 1884
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1885
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v10

    .line 218
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 174
    iget v11, v1, Ll/ܺ᩻ۘ;->ܽ:I

    add-int v12, v11, v0

    .line 175
    iput v12, v1, Ll/ܺ᩻ۘ;->ܽ:I

    aput v11, v4, v7

    aput v0, v5, v7

    .line 221
    iget-object v11, v1, Ll/ܺ᩻ۘ;->֫:[B
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    if-nez v10, :cond_b

    goto/16 :goto_1

    :cond_b
    if-nez v0, :cond_c

    goto/16 :goto_1

    .line 1896
    :cond_c
    :try_start_9
    aget v12, v4, v7

    invoke-virtual {v10, v11, v12, v0}, Ll/᩵᩻ۘ;->֫([BII)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 1905
    :try_start_a
    aget v0, v5, v7

    .line 1906
    iget v11, v10, Ll/᩵᩻ۘ;->ۜ:I

    sub-int/2addr v11, v0

    .line 413
    iput v11, v10, Ll/᩵᩻ۘ;->ۜ:I

    .line 1907
    iget v0, v10, Ll/᩵᩻ۘ;->ۜ:I

    iget v11, v10, Ll/᩵᩻ۘ;->᩷:I

    div-int/lit8 v11, v11, 0x2

    if-ge v0, v11, :cond_0

    .line 1908
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    .line 1909
    invoke-virtual {v1, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 94
    iget v0, v10, Ll/᩵᩻ۘ;->ܺ:I

    .line 1910
    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 1911
    iget v0, v10, Ll/᩵᩻ۘ;->᩷:I

    iget v9, v10, Ll/᩵᩻ۘ;->ۜ:I

    sub-int/2addr v0, v9

    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    move-object v0, v10

    .line 1912
    monitor-enter v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    .line 1913
    :try_start_b
    iget-boolean v9, v10, Ll/᩵᩻ۘ;->֫:Z

    if-nez v9, :cond_d

    .line 1914
    invoke-virtual {p0, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 1915
    :cond_d
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 1916
    :try_start_c
    iget v0, v10, Ll/᩵᩻ۘ;->᩷:I
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    goto :goto_5

    :catchall_1
    move-exception v1

    .line 1915
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :try_start_e
    throw v1
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4

    .line 1900
    :catch_2
    :try_start_f
    invoke-virtual {v10}, Ll/᩵᩻ۘ;->ۧ()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    goto/16 :goto_1

    .line 1954
    :pswitch_9
    :try_start_10
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1955
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 1956
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1957
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v0

    if-nez v0, :cond_e

    goto/16 :goto_1

    .line 1961
    :cond_e
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۢ()J

    move-result-wide v9

    invoke-virtual {v0, v9, v10}, Ll/᩵᩻ۘ;->֫(J)V

    goto/16 :goto_1

    .line 2008
    :pswitch_a
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2009
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 2010
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 2011
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2013
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2017
    iput-boolean v3, v0, Ll/᩵᩻ۘ;->֫:Z

    .line 2019
    invoke-virtual {v0, v7}, Ll/᩵᩻ۘ;->ۧ(I)V

    goto/16 :goto_1

    .line 1993
    :pswitch_b
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1994
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 1995
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 1996
    invoke-direct {p0, v0}, Ll/۟ۢۘ;->֫(I)Ll/᩵᩻ۘ;

    move-result-object v0

    .line 1997
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v9

    .line 1998
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۢ()J

    move-result-wide v10

    .line 1999
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v12

    if-eqz v0, :cond_0

    .line 2001
    invoke-virtual {v0, v10, v11}, Ll/᩵᩻ۘ;->ۧ(J)V

    .line 431
    iput v12, v0, Ll/᩵᩻ۘ;->ۘ:I

    .line 2003
    iput-boolean v3, v0, Ll/᩵᩻ۘ;->ۡ:Z

    .line 2004
    invoke-virtual {v0, v9}, Ll/᩵᩻ۘ;->ۧ(I)V

    goto/16 :goto_1

    .line 2046
    :pswitch_c
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 2047
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ۜ()I

    .line 2048
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v0

    .line 409
    array-length v9, v0

    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v11, Ljava/lang/String;

    invoke-direct {v11, v0, v7, v9, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const-string v0, "forwarded-tcpip"

    .line 2050
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v9, 0x5c

    if-nez v0, :cond_11

    const-string v0, "x11"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-boolean v0, p0, Ll/۟ۢۘ;->۟֫:Z

    if-nez v0, :cond_11

    :cond_f
    const-string v0, "auth-agent@openssh.com"

    .line 2051
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-boolean v0, p0, Ll/۟ۢۘ;->ۡ:Z

    if-nez v0, :cond_11

    .line 3560
    :cond_10
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 2052
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2056
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    .line 2057
    invoke-virtual {v1, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 2058
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2059
    invoke-virtual {v1, v3}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2060
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 65
    array-length v9, v0

    invoke-virtual {v1, v7, v9, v0}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2062
    invoke-virtual {p0, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    goto/16 :goto_1

    .line 2064
    :cond_11
    invoke-virtual {p0, v11}, Ll/۟ۢۘ;->ۧ(Ljava/lang/String;)Ll/᩵᩻ۘ;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 2066
    invoke-virtual {v0, v1}, Ll/᩵᩻ۘ;->֫(Ll/ܺ᩻ۘ;)V

    .line 2293
    iget-object v9, p0, Ll/۟ۢۘ;->ۛ֫:Ll/ۛۢۘ;

    .line 2067
    new-instance v10, Ll/᩺ۢۘ;

    invoke-direct {v10, v0}, Ll/᩺ۢۘ;-><init>(Ll/᩵᩻ۘ;)V

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, v10}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2068
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Channel "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, p0, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 2072
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_1

    .line 3560
    :cond_12
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 2074
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2078
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    .line 2079
    invoke-virtual {v1, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 2080
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    const/4 v0, 0x4

    .line 2081
    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 2082
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 65
    array-length v9, v0

    invoke-virtual {v1, v7, v9, v0}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 2084
    invoke-virtual {p0, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    goto/16 :goto_1

    .line 2134
    :goto_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown SSH message type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 931
    :cond_13
    iget-object v0, p0, Ll/۟ۢۘ;->ۖ֫:Ll/۠ۢۘ;

    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    .line 932
    iget-object v10, p0, Ll/۟ۢۘ;->ۖ:Ll/ܺ᩻ۘ;

    invoke-virtual {v10, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 933
    invoke-virtual {p0, v0}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 3560
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 935
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1876
    invoke-direct {p0, v8}, Ll/۟ۢۘ;->֫(Ll/ܽۢۘ;)V

    goto/16 :goto_0

    .line 1870
    :cond_14
    invoke-direct {p0, v1}, Ll/۟ۢۘ;->ۧ(Ll/ܺ᩻ۘ;)Ll/ܽۢۘ;

    move-result-object v8

    goto/16 :goto_1

    :catch_3
    move-exception v9

    .line 1845
    iget-boolean v10, p0, Ll/۟ۢۘ;->ܰ:Z

    if-nez v10, :cond_15

    iget v10, p0, Ll/۟ۢۘ;->᩶֫:I

    if-ge v0, v10, :cond_15

    .line 3057
    new-instance v9, Ll/ܺ᩻ۘ;

    invoke-direct {v9}, Ll/ܺ᩻ۘ;-><init>()V

    .line 3058
    new-instance v10, Ll/۠ۢۘ;

    invoke-direct {v10, v9}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 3059
    invoke-virtual {v10}, Ll/۠ۢۘ;->֫()V

    const/16 v11, 0x50

    .line 3060
    invoke-virtual {v9, v11}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 3061
    sget-object v11, Ll/۟ۢۘ;->֫ۧ:[B

    invoke-virtual {v9, v11}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 3062
    invoke-virtual {v9, v3}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 3063
    invoke-virtual {p0, v10}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    goto :goto_7

    .line 1849
    :cond_15
    iget-boolean v10, p0, Ll/۟ۢۘ;->ܰ:Z

    if-eqz v10, :cond_16

    iget v10, p0, Ll/۟ۢۘ;->᩶֫:I

    if-ge v0, v10, :cond_16

    :goto_7
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_2

    .line 1853
    :cond_16
    throw v9
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4

    .line 2138
    :catch_4
    iput-boolean v7, p0, Ll/۟ۢۘ;->ܰ:Z

    .line 3560
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 2139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2147
    :cond_17
    :try_start_11
    invoke-virtual {p0}, Ll/۟ۢۘ;->ۧ()V
    :try_end_11
    .catch Ljava/lang/NullPointerException; {:try_start_11 .. :try_end_11} :catch_5
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5

    .line 2155
    :catch_5
    iput-boolean v7, p0, Ll/۟ۢۘ;->ܿ֫:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x50
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x5a
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final ۢ()Z
    .locals 1

    .line 3011
    iget-boolean v0, p0, Ll/۟ۢۘ;->ܿ֫:Z

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)Ll/᩵᩻ۘ;
    .locals 1

    .line 1088
    iget-boolean v0, p0, Ll/۟ۢۘ;->ܿ֫:Z

    if-eqz v0, :cond_2

    .line 1092
    :try_start_0
    invoke-direct {p0, p1}, Ll/۟ۢۘ;->ܿ(Ljava/lang/String;)Ll/᩵᩻ۘ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1094
    invoke-virtual {p1}, Ll/᩵᩻ۘ;->ۜ()V

    .line 1095
    instance-of v0, p1, Ll/۬᩻ۘ;

    if-eqz v0, :cond_0

    .line 1096
    move-object v0, p1

    check-cast v0, Ll/۬᩻ۘ;

    .line 3495
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-object p1

    .line 3560
    :cond_1
    iget-object p1, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 1100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3560
    :catch_0
    iget-object p1, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 1106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 1089
    :cond_2
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "session is down"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1089
    throw p1
.end method

.method public final ۧ()V
    .locals 6

    .line 2177
    iget-boolean v0, p0, Ll/۟ۢۘ;->ܿ֫:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 3560
    :cond_0
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 2181
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2191
    iget-object v0, p0, Ll/۟ۢۘ;->ۚ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    .line 2192
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v3, 0x1

    .line 2194
    :try_start_0
    iput-boolean v3, p0, Ll/۟ۢۘ;->᩹:Z

    .line 2195
    new-instance v0, Ljava/util/ArrayList;

    iget-object v4, p0, Ll/۟ۢۘ;->֡:Ljava/util/ArrayList;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 2197
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 2200
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵᩻ۘ;

    .line 2202
    :try_start_1
    invoke-virtual {v4}, Ll/᩵᩻ۘ;->ۧ()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 3560
    :catch_0
    iget-object v4, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v4}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v4

    .line 2204
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 2211
    iput-boolean v4, p0, Ll/۟ۢۘ;->ܿ֫:Z

    .line 2213
    invoke-static {p0}, Ll/᩸ۢۘ;->֫(Ll/۟ۢۘ;)V

    .line 2214
    invoke-static {p0}, Ll/ۗ᩻ۘ;->֫(Ll/۟ۢۘ;)V

    .line 2215
    invoke-static {p0}, Ll/ܳۜۘ;->֫(Ll/۟ۢۘ;)V

    .line 2217
    iget-object v0, p0, Ll/۟ۢۘ;->᩷֫:Ljava/lang/Object;

    monitor-enter v0

    .line 2218
    :try_start_2
    iget-object v5, p0, Ll/۟ۢۘ;->ܶ:Ljava/lang/Thread;

    if-eqz v5, :cond_2

    .line 2219
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 2220
    iget-object v5, p0, Ll/۟ۢۘ;->ܶ:Ljava/lang/Thread;

    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    .line 2221
    iput-object v1, p0, Ll/۟ۢۘ;->ܶ:Ljava/lang/Thread;

    .line 2223
    :cond_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2224
    iput-object v1, p0, Ll/۟ۢۘ;->ۤ֫:Ll/ۨۢۘ;

    .line 2226
    :try_start_3
    iget-object v0, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    if-eqz v0, :cond_5

    .line 2227
    iget-object v0, v0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    if-eqz v0, :cond_3

    .line 2228
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 2229
    :cond_3
    iget-object v0, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    iget-object v0, v0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    if-eqz v0, :cond_4

    .line 2230
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 2231
    :cond_4
    iget-object v0, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2235
    :cond_5
    iget-object v0, p0, Ll/۟ۢۘ;->۬֫:Ljava/net/Socket;

    if-eqz v0, :cond_6

    .line 2236
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 2246
    :catch_1
    :cond_6
    iput-object v1, p0, Ll/۟ۢۘ;->ܽ֫:Ll/᩵᩷ۘ;

    .line 2247
    iput-object v1, p0, Ll/۟ۢۘ;->۬֫:Ljava/net/Socket;

    .line 2248
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 2250
    :try_start_4
    iput-boolean v4, p0, Ll/۟ۢۘ;->᩹:Z

    .line 2251
    iget-object v0, p0, Ll/۟ۢۘ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 2253
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 2259
    iput v4, p0, Ll/۟ۢۘ;->᩸֫:I

    .line 2260
    iput v4, p0, Ll/۟ۢۘ;->᩹֫:I

    .line 2261
    iput-boolean v3, p0, Ll/۟ۢۘ;->ۧ֫:Z

    .line 2262
    iput-boolean v4, p0, Ll/۟ۢۘ;->ۙ:Z

    .line 2263
    iput-boolean v4, p0, Ll/۟ۢۘ;->᩶:Z

    .line 2264
    iput-object v1, p0, Ll/۟ۢۘ;->ۙ֫:[Ljava/lang/String;

    .line 2270
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0, p0}, Ll/᩶᩷ۘ;->ۧ(Ll/۟ۢۘ;)V

    .line 2170
    :goto_1
    iget-object v0, p0, Ll/۟ۢۘ;->᩻֫:Ll/۟ۢۘ;

    if-eqz v0, :cond_7

    .line 2171
    invoke-virtual {v0}, Ll/۟ۢۘ;->ۧ()V

    .line 2172
    iput-object v1, p0, Ll/۟ۢۘ;->᩻֫:Ll/۟ۢۘ;

    :cond_7
    return-void

    :catchall_0
    move-exception v0

    .line 2253
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 2254
    throw v0

    :catchall_1
    move-exception v1

    .line 2223
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1

    :catchall_2
    move-exception v0

    .line 2197
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 2198
    throw v0
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 2978
    iget-object v0, p0, Ll/۟ۢۘ;->᩷֫:Ljava/lang/Object;

    monitor-enter v0

    .line 2979
    :try_start_0
    iget-object v1, p0, Ll/۟ۢۘ;->۠:Ljava/util/Hashtable;

    if-nez v1, :cond_0

    .line 2980
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iput-object v1, p0, Ll/۟ۢۘ;->۠:Ljava/util/Hashtable;

    :cond_0
    const-string v1, "PubkeyAcceptedKeyTypes"

    .line 2982
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2983
    iget-object p1, p0, Ll/۟ۢۘ;->۠:Ljava/util/Hashtable;

    const-string v1, "PubkeyAcceptedAlgorithms"

    invoke-virtual {p1, v1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 2985
    :cond_1
    iget-object v1, p0, Ll/۟ۢۘ;->۠:Ljava/util/Hashtable;

    invoke-virtual {v1, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2987
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ(Ll/۠ۢۘ;)V
    .locals 6

    const/4 v0, 0x0

    int-to-long v0, v0

    .line 1778
    :goto_0
    iget-boolean v2, p0, Ll/۟ۢۘ;->ܰ:Z

    if-eqz v2, :cond_3

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 1779
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Ll/۟ۢۘ;->ۜ֫:J

    sub-long/2addr v2, v4

    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    iget-boolean v2, p0, Ll/۟ۢۘ;->۟:Z

    if-eqz v2, :cond_0

    goto :goto_1

    .line 1780
    :cond_0
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "timeout in waiting for rekeying process."

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1780
    throw p1

    .line 1782
    :cond_1
    :goto_1
    iget-object v2, p1, Ll/۠ۢۘ;->ۧ:Ll/ܺ᩻ۘ;

    .line 242
    iget-object v2, v2, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v3, 0x5

    aget-byte v2, v2, v3

    const/16 v3, 0x14

    if-eq v2, v3, :cond_3

    const/16 v3, 0x15

    if-eq v2, v3, :cond_3

    const/16 v3, 0x1e

    if-eq v2, v3, :cond_3

    const/16 v3, 0x1f

    if-eq v2, v3, :cond_3

    if-eq v2, v3, :cond_3

    const/16 v3, 0x20

    if-eq v2, v3, :cond_3

    const/16 v3, 0x21

    if-eq v2, v3, :cond_3

    const/16 v3, 0x22

    if-eq v2, v3, :cond_3

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    goto :goto_2

    :cond_2
    const-wide/16 v2, 0xa

    .line 1791
    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 1795
    :cond_3
    :goto_2
    invoke-direct {p0, p1}, Ll/۟ۢۘ;->ܽ(Ll/۠ۢۘ;)V

    return-void
.end method

.method public final ܳ()[B
    .locals 1

    .line 1518
    iget-object v0, p0, Ll/۟ۢۘ;->ۗ֫:[B

    return-object v0
.end method

.method public final ܽ()I
    .locals 4

    .line 3577
    iget-object v0, p0, Ll/۟ۢۘ;->ۘ:Ll/᩻ۜۘ;

    .line 3578
    iget-object v1, p0, Ll/۟ۢۘ;->᩵:Ll/֨ۢۘ;

    const/16 v2, 0x14

    if-eqz v0, :cond_1

    .line 3582
    invoke-interface {v0}, Ll/᩻ۜۘ;->ܽ()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v0}, Ll/᩻ۜۘ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 3583
    :cond_0
    invoke-interface {v0}, Ll/᩻ۜۘ;->ۧ()I

    move-result v1

    if-le v1, v2, :cond_2

    .line 3584
    invoke-interface {v0}, Ll/᩻ۜۘ;->ۧ()I

    move-result v2

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    .line 3587
    invoke-interface {v1}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v0

    if-le v0, v2, :cond_2

    .line 3588
    invoke-interface {v1}, Ll/֨ۢۘ;->getBlockSize()I

    move-result v2

    :cond_2
    :goto_0
    add-int/lit8 v2, v2, 0x40

    return v2
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2945
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 2945
    iput-object p1, p0, Ll/۟ۢۘ;->ۘ֫:[B

    :cond_0
    return-void
.end method

.method public final ܿ()[Ljava/lang/String;
    .locals 1

    .line 2892
    iget-object v0, p0, Ll/۟ۢۘ;->ۙ֫:[Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ll/ۚۢۘ;
    .locals 1

    .line 3560
    iget-object v0, p0, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/ᩴۡۘ;
    .locals 1

    .line 2916
    iget-object v0, p0, Ll/۟ۢۘ;->᩺֫:Ll/ᩴۡۘ;

    return-object v0
.end method

.method public final ᩻()Ll/ۛۢۘ;
    .locals 1

    .line 2293
    iget-object v0, p0, Ll/۟ۢۘ;->ۛ֫:Ll/ۛۢۘ;

    return-object v0
.end method
