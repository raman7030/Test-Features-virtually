.class public final Ll/ܺ֨᩵;
.super Ljava/lang/Object;
.source "09UO"

# interfaces
.implements Ll/ۨۡ᩵;


# static fields
.field public static final ܿ:Ll/֫᩻֨;


# instance fields
.field public final ֫:Ljava/util/LinkedList;

.field public final ۧ:Ll/ۧۤᩴ;

.field public final ܽ:Ljava/util/LinkedList;

.field public final ᩳ:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 50
    const-class v0, Ll/ܺ֨᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܺ֨᩵;->ܿ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    .line 53
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/ܺ֨᩵;->ܽ:Ljava/util/LinkedList;

    .line 54
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Ll/ܺ֨᩵;->ᩳ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 55
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ܺ֨᩵;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method

.method private ֫(Ll/ᩴۡ᩵;Ll/ۘۡ᩵;ILjava/lang/String;ZZ)Ll/᩷֨᩵;
    .locals 5

    .line 120
    sget-object v0, Ll/ܺ֨᩵;->ܿ:Ll/֫᩻֨;

    iget-object v1, p0, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷֨᩵;

    .line 121
    invoke-virtual {v2, p2, p3, p4}, Ll/᩷֨᩵;->֫(Ll/ۘۡ᩵;ILjava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 122
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    check-cast v3, Ll/ܰۡ᩵;

    invoke-virtual {v3}, Ll/ܰۡ᩵;->۟()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ll/᩷֨᩵;->᩹()I

    move-result v3

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    check-cast v4, Ll/ܰۡ᩵;

    invoke-virtual {v4}, Ll/ܰۡ᩵;->۟()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 124
    :cond_1
    :try_start_0
    invoke-virtual {v2}, Ll/᩷֨᩵;->ۜ()Z

    move-result v3

    if-nez v3, :cond_0

    if-eqz p6, :cond_2

    invoke-virtual {v2}, Ll/᩷֨᩵;->᩻()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    if-eqz p5, :cond_3

    .line 128
    invoke-virtual {v2}, Ll/᩷֨᩵;->ۤ()Z

    move-result v3

    if-nez v3, :cond_3

    .line 130
    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 131
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot reuse, signing enforced but connection does not have it enabled "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    if-nez p5, :cond_4

    .line 136
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ll/᩷֨᩵;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 137
    invoke-virtual {v2}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v3

    invoke-interface {v3}, Ll/᩷ۖ᩵;->ۖ()Z

    move-result v3

    if-nez v3, :cond_4

    .line 140
    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 141
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot reuse, signing enforced on connection "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 146
    :cond_4
    invoke-virtual {v2}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v3

    invoke-interface {v3, p1}, Ll/᩷ۖ᩵;->֫(Ll/ᩴۡ᩵;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 147
    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 148
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot reuse, different config "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 157
    :cond_5
    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 158
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Reusing transport connection "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 278
    :cond_6
    invoke-virtual {v2}, Ll/۟֨᩵;->֫()V

    return-object v2

    :catch_0
    move-exception v2

    const-string v3, "Error while checking for reuse"

    .line 153
    invoke-interface {v0, v3, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    goto/16 :goto_0

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method

.method private ۧ()V
    .locals 5

    .line 265
    iget-object v0, p0, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    monitor-enter v0

    .line 267
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/ܺ֨᩵;->ᩳ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷֨᩵;

    if-eqz v1, :cond_1

    .line 269
    sget-object v2, Ll/ܺ֨᩵;->ܿ:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 270
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Removing transport connection "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 272
    :cond_0
    iget-object v2, p0, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 273
    iget-object v2, p0, Ll/ܺ֨᩵;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 275
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(Ll/ᩴۡ᩵;Ljava/lang/String;IZZ)Ll/ۢ֨᩵;
    .locals 15

    move-object v8, p0

    move-object/from16 v0, p2

    .line 171
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܽ()Ll/᩶ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ۢ֡᩵;

    const/4 v9, 0x1

    .line 53
    invoke-virtual {v1, v0, v9}, Ll/ۢ֡᩵;->֫(Ljava/lang/String;Z)[Ll/֡֡᩵;

    move-result-object v10

    .line 173
    array-length v1, v10

    if-eqz v1, :cond_6

    .line 177
    new-instance v1, Ll/ۡ֨᩵;

    invoke-direct {v1, p0}, Ll/ۡ֨᩵;-><init>(Ll/ܺ֨᩵;)V

    invoke-static {v10, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 194
    iget-object v1, v8, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    move-object v14, v1

    monitor-enter v14

    .line 195
    :try_start_0
    array-length v11, v10

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v11, :cond_1

    aget-object v3, v10, v13

    .line 200
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x1

    move-object v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p2

    move/from16 v6, p5

    .line 196
    invoke-direct/range {v1 .. v7}, Ll/ܺ֨᩵;->֫(Ll/ᩴۡ᩵;Ll/ۘۡ᩵;ILjava/lang/String;ZZ)Ll/᩷֨᩵;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 206
    monitor-exit v14

    return-object v1

    :cond_0
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 209
    :cond_1
    monitor-exit v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 212
    array-length v7, v10

    const/4 v0, 0x0

    :goto_1
    if-ge v12, v7, :cond_4

    aget-object v11, v10, v12

    .line 213
    sget-object v0, Ll/ܺ֨᩵;->ܿ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Trying address {}"

    .line 214
    invoke-interface {v0, v11, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    move-object v1, p0

    move-object/from16 v2, p1

    move-object v3, v11

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    .line 216
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Ll/ܺ֨᩵;->֫(Ll/ᩴۡ᩵;Ll/֡֡᩵;IZZ)Ll/᩷֨᩵;

    move-result-object v1

    const-class v0, Ll/᩷֨᩵;

    invoke-virtual {v1, v0}, Ll/᩷֨᩵;->֫(Ljava/lang/Class;)Ll/ۢ֨᩵;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 218
    :try_start_2
    invoke-virtual {v1}, Ll/᩷֨᩵;->ᩴ()Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 278
    :try_start_3
    invoke-virtual {v1}, Ll/۟֨᩵;->֫()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 122
    :try_start_4
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    return-object v1

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 220
    :try_start_5
    invoke-virtual {p0, v1}, Ll/ܺ֨᩵;->֫(Ll/ۢ֨᩵;)V

    .line 221
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 122
    :goto_2
    :try_start_6
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, v0

    .line 216
    :try_start_7
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    :catch_1
    move-exception v0

    .line 225
    invoke-virtual {v11}, Ll/֡֡᩵;->֫()Ljava/lang/String;

    move-result-object v1

    .line 226
    iget-object v2, v8, Ll/ܺ֨᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v2, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_3

    .line 228
    iget-object v2, v8, Ll/ܺ֨᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 230
    :cond_3
    iget-object v3, v8, Ll/ܺ֨᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v2, v9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    .line 237
    throw v0

    .line 239
    :cond_5
    new-instance v0, Ll/֫۠᩵;

    const-string v1, "All connection attempts failed"

    .line 58
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 239
    throw v0

    :catchall_2
    move-exception v0

    .line 209
    :try_start_8
    monitor-exit v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v0

    .line 174
    :cond_6
    new-instance v1, Ljava/net/UnknownHostException;

    invoke-direct {v1, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(Ll/ᩴۡ᩵;Ll/֡֡᩵;IZZ)Ll/᩷֨᩵;
    .locals 14

    move-object v8, p0

    move/from16 v0, p4

    move/from16 v9, p5

    .line 66
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "New transport connection "

    const-string v1, "Exclusive "

    if-gtz p3, :cond_0

    const/16 v2, 0x1bd

    const/16 v11, 0x1bd

    goto :goto_0

    :cond_0
    move/from16 v11, p3

    .line 83
    :goto_0
    iget-object v2, v8, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    move-object v13, v2

    monitor-enter v13

    .line 84
    :try_start_0
    invoke-direct {p0}, Ll/ܺ֨᩵;->ۧ()V

    .line 85
    sget-object v12, Ll/ܺ֨᩵;->ܿ:Ll/֫᩻֨;

    invoke-interface {v12}, Ll/֫᩻֨;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " enforced signing "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v12, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 88
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->۟()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move v4, v11

    move/from16 v6, p5

    .line 89
    invoke-direct/range {v1 .. v7}, Ll/ܺ֨᩵;->֫(Ll/ᩴۡ᩵;Ll/ۘۡ᩵;ILjava/lang/String;ZZ)Ll/᩷֨᩵;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 91
    monitor-exit v13

    return-object v1

    .line 94
    :cond_2
    new-instance v1, Ll/᩷֨᩵;

    move-object v2, p1

    move-object/from16 v3, p2

    invoke-direct {v1, p1, v3, v11, v9}, Ll/᩷֨᩵;-><init>(Ll/ᩴۡ᩵;Ll/ۘۡ᩵;IZ)V

    .line 95
    invoke-interface {v12}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v12, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_3
    if-eqz v0, :cond_4

    .line 99
    iget-object v0, v8, Ll/ܺ֨᩵;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 101
    :cond_4
    iget-object v0, v8, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/LinkedList;->add(ILjava/lang/Object;)V

    .line 103
    :goto_2
    monitor-exit v13

    return-object v1

    .line 104
    :goto_3
    monitor-exit v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final ֫(Ll/ۢ֨᩵;)V
    .locals 3

    .line 257
    sget-object v0, Ll/ܺ֨᩵;->ܿ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 258
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Scheduling transport connection for removal "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 260
    :cond_0
    iget-object v0, p0, Ll/ܺ֨᩵;->ᩳ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    check-cast p1, Ll/᩷֨᩵;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫()Z
    .locals 6

    .line 289
    iget-object v0, p0, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    monitor-enter v0

    .line 290
    :try_start_0
    invoke-direct {p0}, Ll/ܺ֨᩵;->ۧ()V

    .line 291
    sget-object v1, Ll/ܺ֨᩵;->ܿ:Ll/֫᩻֨;

    const-string v2, "Closing pool"

    invoke-interface {v1, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 292
    new-instance v1, Ljava/util/LinkedList;

    iget-object v2, p0, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    invoke-direct {v1, v2}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 293
    iget-object v2, p0, Ll/ܺ֨᩵;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 294
    iget-object v2, p0, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->clear()V

    .line 295
    iget-object v2, p0, Ll/ܺ֨᩵;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->clear()V

    .line 296
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 297
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷֨᩵;

    .line 299
    :try_start_1
    invoke-virtual {v3, v1, v1}, Ll/۟֨᩵;->֫(ZZ)Z

    move-result v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    or-int/2addr v2, v3

    goto :goto_0

    :catch_0
    move-exception v3

    .line 301
    sget-object v4, Ll/ܺ֨᩵;->ܿ:Ll/֫᩻֨;

    const-string v5, "Failed to close connection"

    invoke-interface {v4, v5, v3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 304
    :cond_0
    iget-object v0, p0, Ll/ܺ֨᩵;->֫:Ljava/util/LinkedList;

    monitor-enter v0

    .line 305
    :try_start_2
    invoke-direct {p0}, Ll/ܺ֨᩵;->ۧ()V

    .line 306
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 296
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method
