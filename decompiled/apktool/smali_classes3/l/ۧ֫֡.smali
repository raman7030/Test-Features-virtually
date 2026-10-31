.class public final Ll/ۧ֫֡;
.super Ljava/lang/Object;
.source "A4DP"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final ۜ֫:Ljava/util/regex/Pattern;


# instance fields
.field public ֫֫:J

.field public final ۗ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final ۙ:Ljava/io/File;

.field public final ۛ:Ljava/io/File;

.field public final ۟:Ljava/util/LinkedHashMap;

.field public ۤ:Z

.field public ۧ֫:Z

.field public final ۨ:Ljava/io/File;

.field public ۫:Z

.field public final ۬:Ll/ᩳܽ֡;

.field public ܰ:Ll/ۤܽ֡;

.field public ܳ֫:J

.field public ܽ֫:Z

.field public ܿ֫:I

.field public ᩳ֫:J

.field public ᩶:Z

.field public final ᩸:I

.field public final ᩹:Ljava/lang/Runnable;

.field public final ᩺:Ljava/io/File;

.field public final ᩻֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "[a-z0-9_-]{1,120}"

    .line 94
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۧ֫֡;->ۜ֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;IIJLjava/util/concurrent/ThreadPoolExecutor;)V
    .locals 6

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 148
    iput-wide v0, p0, Ll/ۧ֫֡;->ܳ֫:J

    .line 150
    new-instance v2, Ljava/util/LinkedHashMap;

    const/high16 v3, 0x3f400000    # 0.75f

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v2, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    .line 165
    iput-wide v0, p0, Ll/ۧ֫֡;->ᩳ֫:J

    .line 169
    new-instance v0, Ll/ۛ۟᩵;

    invoke-direct {v0, p0}, Ll/ۛ۟᩵;-><init>(Ll/ۧ֫֡;)V

    iput-object v0, p0, Ll/ۧ֫֡;->᩹:Ljava/lang/Runnable;

    .line 197
    sget-object v0, Ll/ᩳܽ֡;->֫:Ll/ᩳܽ֡;

    iput-object v0, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    .line 198
    iput-object p1, p0, Ll/ۧ֫֡;->ۙ:Ljava/io/File;

    .line 199
    iput p2, p0, Ll/ۧ֫֡;->᩸:I

    .line 200
    new-instance p2, Ljava/io/File;

    const-string v0, "journal"

    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p2, p0, Ll/ۧ֫֡;->ۛ:Ljava/io/File;

    .line 201
    new-instance p2, Ljava/io/File;

    const-string v0, "journal.tmp"

    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p2, p0, Ll/ۧ֫֡;->᩺:Ljava/io/File;

    .line 202
    new-instance p2, Ljava/io/File;

    const-string v0, "journal.bkp"

    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p2, p0, Ll/ۧ֫֡;->ۨ:Ljava/io/File;

    .line 203
    iput p3, p0, Ll/ۧ֫֡;->᩻֫:I

    .line 204
    iput-wide p4, p0, Ll/ۧ֫֡;->֫֫:J

    .line 205
    iput-object p6, p0, Ll/ۧ֫֡;->ۗ:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static ֫(Ljava/io/File;IIJ)Ll/ۧ֫֡;
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-lez v2, :cond_1

    if-lez p2, :cond_0

    .line 269
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-string v1, "OkHttp DiskLruCache"

    const/4 v2, 0x1

    .line 270
    invoke-static {v1, v2}, Ll/᩶۟᩵;->֫(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v10

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide/16 v6, 0x3c

    move-object v3, v0

    invoke-direct/range {v3 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 272
    new-instance v1, Ll/ۧ֫֡;

    move-object v3, v1

    move-object v4, p0

    move v5, p1

    move v6, p2

    move-wide v7, p3

    move-object v9, v0

    invoke-direct/range {v3 .. v9}, Ll/ۧ֫֡;-><init>(Ljava/io/File;IIJLjava/util/concurrent/ThreadPoolExecutor;)V

    return-object v1

    .line 265
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "valueCount <= 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 262
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "maxSize <= 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ۖ()V
    .locals 11

    const-string v0, ", "

    const-string v1, "unexpected journal header: ["

    .line 276
    iget-object v2, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v3, p0, Ll/ۧ֫֡;->ۛ:Ljava/io/File;

    invoke-interface {v2, v3}, Ll/ᩳܽ֡;->ܿ(Ljava/io/File;)Ll/֨ᩳ֡;

    move-result-object v4

    invoke-static {v4}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object v4

    .line 278
    :try_start_0
    invoke-interface {v4}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v5

    .line 279
    invoke-interface {v4}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v6

    .line 280
    invoke-interface {v4}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v7

    .line 281
    invoke-interface {v4}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v8

    .line 282
    invoke-interface {v4}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v9

    const-string v10, "libcore.io.DiskLruCache"

    .line 283
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const-string v10, "1"

    .line 284
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    iget v10, p0, Ll/ۧ֫֡;->᩸:I

    .line 285
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    iget v7, p0, Ll/ۧ֫֡;->᩻֫:I

    .line 286
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, ""

    .line 287
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_1

    const/4 v0, 0x0

    .line 295
    :goto_0
    :try_start_1
    invoke-interface {v4}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/ۧ֫֡;->ܿ(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 301
    :catch_0
    :try_start_2
    iget-object v1, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ۧ֫֡;->ܿ֫:I

    .line 304
    invoke-interface {v4}, Ll/ۛܽ֡;->ۢۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 305
    invoke-virtual {p0}, Ll/ۧ֫֡;->ᩳ()V

    goto :goto_1

    .line 315
    :cond_0
    invoke-interface {v2, v3}, Ll/ᩳܽ֡;->ܽ(Ljava/io/File;)Ll/ۚᩳ֡;

    move-result-object v0

    .line 316
    new-instance v1, Ll/ۨ۟᩵;

    invoke-direct {v1, p0, v0}, Ll/ۨ۟᩵;-><init>(Ll/ۧ֫֡;Ll/ۚᩳ֡;)V

    .line 322
    invoke-static {v1}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object v0

    .line 307
    iput-object v0, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 310
    :goto_1
    invoke-static {v4}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    return-void

    .line 288
    :cond_1
    :try_start_3
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    .line 310
    invoke-static {v4}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    throw v0
.end method

.method private ۜ()V
    .locals 10

    .line 369
    iget-object v0, p0, Ll/ۧ֫֡;->᩺:Ljava/io/File;

    iget-object v1, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    invoke-interface {v1, v0}, Ll/ᩳܽ֡;->᩻(Ljava/io/File;)V

    .line 370
    iget-object v0, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 371
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟۟᩵;

    .line 372
    iget-object v3, v2, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    iget v4, p0, Ll/ۧ֫֡;->᩻֫:I

    const/4 v5, 0x0

    if-nez v3, :cond_1

    :goto_1
    if-ge v5, v4, :cond_0

    .line 374
    iget-wide v6, p0, Ll/ۧ֫֡;->ܳ֫:J

    iget-object v3, v2, Ll/۟۟᩵;->ܿ:[J

    aget-wide v8, v3, v5

    add-long/2addr v6, v8

    iput-wide v6, p0, Ll/ۧ֫֡;->ܳ֫:J

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 377
    iput-object v3, v2, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    :goto_2
    if-ge v5, v4, :cond_2

    .line 379
    iget-object v3, v2, Ll/۟۟᩵;->֫:[Ljava/io/File;

    aget-object v3, v3, v5

    invoke-interface {v1, v3}, Ll/ᩳܽ֡;->᩻(Ljava/io/File;)V

    .line 380
    iget-object v3, v2, Ll/۟۟᩵;->ܽ:[Ljava/io/File;

    aget-object v3, v3, v5

    invoke-interface {v1, v3}, Ll/ᩳܽ֡;->᩻(Ljava/io/File;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 382
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static ܳ(Ljava/lang/String;)V
    .locals 3

    .line 713
    sget-object v0, Ll/ۧ֫֡;->ۜ֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 714
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 715
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "keys must match regex [a-z0-9_-]{1,120}: \""

    const-string v2, "\""

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 715
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܿ(Ljava/lang/String;)V
    .locals 7

    const/16 v0, 0x20

    .line 326
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const-string v2, "unexpected journal line: "

    const/4 v3, -0x1

    if-eq v1, v3, :cond_8

    add-int/lit8 v4, v1, 0x1

    .line 332
    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    .line 334
    iget-object v5, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    if-ne v0, v3, :cond_0

    .line 335
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x6

    if-ne v1, v6, :cond_1

    const-string v6, "REMOVE"

    .line 336
    invoke-virtual {p1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 337
    invoke-virtual {v5, v4}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 341
    :cond_0
    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 344
    :cond_1
    invoke-virtual {v5, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۟۟᩵;

    if-nez v6, :cond_2

    .line 346
    new-instance v6, Ll/۟۟᩵;

    invoke-direct {v6, p0, v4}, Ll/۟۟᩵;-><init>(Ll/ۧ֫֡;Ljava/lang/String;)V

    .line 347
    invoke-virtual {v5, v4, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const/4 v4, 0x5

    if-eq v0, v3, :cond_4

    if-ne v1, v4, :cond_4

    const-string v5, "CLEAN"

    .line 350
    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 351
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 352
    iput-boolean v1, v6, Ll/۟۟᩵;->ܳ:Z

    const/4 v0, 0x0

    .line 353
    iput-object v0, v6, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    .line 996
    array-length v0, p1

    iget-object v1, v6, Ll/۟۟᩵;->ۜ:Ll/ۧ֫֡;

    iget v1, v1, Ll/ۧ֫֡;->᩻֫:I

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    .line 1001
    :goto_0
    :try_start_0
    array-length v1, p1

    if-ge v0, v1, :cond_6

    .line 1002
    iget-object v1, v6, Ll/۟۟᩵;->ܿ:[J

    aget-object v3, p1, v0

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    aput-wide v3, v1, v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1017
    :catch_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-ne v0, v3, :cond_5

    if-ne v1, v4, :cond_5

    const-string v4, "DIRTY"

    .line 355
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 356
    new-instance p1, Ll/ܰ۟᩵;

    invoke-direct {p1, p0, v6}, Ll/ܰ۟᩵;-><init>(Ll/ۧ֫֡;Ll/۟۟᩵;)V

    iput-object p1, v6, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    return-void

    :cond_5
    if-ne v0, v3, :cond_7

    const/4 v0, 0x4

    if-ne v1, v0, :cond_7

    const-string v0, "READ"

    .line 357
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    return-void

    .line 360
    :cond_7
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 328
    :cond_8
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private declared-synchronized ᩻()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 650
    :try_start_0
    invoke-virtual {p0}, Ll/ۧ֫֡;->isClosed()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 653
    monitor-exit v0

    return-void

    .line 651
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "cache is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 653
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 666
    :try_start_0
    iget-boolean v1, p0, Ll/ۧ֫֡;->ۤ:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Ll/ۧ֫֡;->᩶:Z

    if-eqz v1, :cond_0

    goto :goto_1

    .line 671
    :cond_0
    iget-object v1, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    iget-object v3, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    move-result v3

    new-array v3, v3, [Ll/۟۟᩵;

    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/۟۟᩵;

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v1, v4

    .line 672
    iget-object v5, v5, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    if-eqz v5, :cond_1

    .line 673
    invoke-virtual {v5}, Ll/ܰ۟᩵;->֫()V

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 676
    :cond_2
    invoke-virtual {p0}, Ll/ۧ֫֡;->ܳ()V

    .line 677
    iget-object v1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    invoke-interface {v1}, Ll/ۚᩳ֡;->close()V

    const/4 v1, 0x0

    .line 678
    iput-object v1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    .line 679
    iput-boolean v2, p0, Ll/ۧ֫֡;->᩶:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 680
    monitor-exit v0

    return-void

    .line 667
    :cond_3
    :goto_1
    :try_start_1
    iput-boolean v2, p0, Ll/ۧ֫֡;->᩶:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 668
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized flush()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 657
    :try_start_0
    iget-boolean v1, p0, Ll/ۧ֫֡;->ۤ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    .line 659
    :cond_0
    :try_start_1
    invoke-direct {p0}, Ll/ۧ֫֡;->᩻()V

    .line 660
    invoke-virtual {p0}, Ll/ۧ֫֡;->ܳ()V

    .line 661
    iget-object v1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    invoke-interface {v1}, Ll/ۤܽ֡;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 662
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized isClosed()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 646
    :try_start_0
    iget-boolean v1, p0, Ll/ۧ֫֡;->᩶:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(JLjava/lang/String;)Ll/ܰ۟᩵;
    .locals 6

    move-object v0, p0

    monitor-enter v0

    .line 463
    :try_start_0
    invoke-virtual {p0}, Ll/ۧ֫֡;->֫()V

    .line 465
    invoke-direct {p0}, Ll/ۧ֫֡;->᩻()V

    .line 466
    invoke-static {p3}, Ll/ۧ֫֡;->ܳ(Ljava/lang/String;)V

    .line 467
    iget-object v1, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟۟᩵;

    const-wide/16 v2, -0x1

    const/4 v4, 0x0

    cmp-long v5, p1, v2

    if-eqz v5, :cond_1

    if-eqz v1, :cond_0

    .line 468
    iget-wide v2, v1, Ll/۟۟᩵;->᩻:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v5, v2, p1

    if-eqz v5, :cond_1

    .line 470
    :cond_0
    monitor-exit v0

    return-object v4

    :cond_1
    if-eqz v1, :cond_2

    .line 472
    :try_start_1
    iget-object p1, v1, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_2

    .line 473
    monitor-exit v0

    return-object v4

    .line 475
    :cond_2
    :try_start_2
    iget-boolean p1, p0, Ll/ۧ֫֡;->ܽ֫:Z

    if-nez p1, :cond_6

    iget-boolean p1, p0, Ll/ۧ֫֡;->ۧ֫:Z

    if-eqz p1, :cond_3

    goto :goto_0

    .line 486
    :cond_3
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    const-string p2, "DIRTY"

    invoke-interface {p1, p2}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    const/16 p2, 0x20

    invoke-interface {p1, p2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    invoke-interface {p1, p3}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    const/16 p2, 0xa

    invoke-interface {p1, p2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 487
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۤܽ֡;->flush()V

    .line 489
    iget-boolean p1, p0, Ll/ۧ֫֡;->۫:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_4

    .line 490
    monitor-exit v0

    return-object v4

    :cond_4
    if-nez v1, :cond_5

    .line 494
    :try_start_3
    new-instance v1, Ll/۟۟᩵;

    invoke-direct {v1, p0, p3}, Ll/۟۟᩵;-><init>(Ll/ۧ֫֡;Ljava/lang/String;)V

    .line 495
    iget-object p1, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, p3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    :cond_5
    new-instance p1, Ll/ܰ۟᩵;

    invoke-direct {p1, p0, v1}, Ll/ܰ۟᩵;-><init>(Ll/ۧ֫֡;Ll/۟۟᩵;)V

    .line 498
    iput-object p1, v1, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 499
    monitor-exit v0

    return-object p1

    .line 481
    :cond_6
    :goto_0
    :try_start_4
    iget-object p1, p0, Ll/ۧ֫֡;->ۗ:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object p2, p0, Ll/ۧ֫֡;->᩹:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 482
    monitor-exit v0

    return-object v4

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/ܰ۟᩵;
    .locals 2

    const-wide/16 v0, -0x1

    .line 459
    invoke-virtual {p0, v0, v1, p1}, Ll/ۧ֫֡;->֫(JLjava/lang/String;)Ll/ܰ۟᩵;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized ֫()V
    .locals 6

    const-string v1, "DiskLruCache "

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 211
    :try_start_0
    iget-boolean v2, p0, Ll/ۧ֫֡;->ۤ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_0

    .line 212
    monitor-exit v0

    return-void

    .line 216
    :cond_0
    :try_start_1
    iget-object v2, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v3, p0, Ll/ۧ֫֡;->ۨ:Ljava/io/File;

    invoke-interface {v2, v3}, Ll/ᩳܽ֡;->ۧ(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 218
    iget-object v2, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v3, p0, Ll/ۧ֫֡;->ۛ:Ljava/io/File;

    invoke-interface {v2, v3}, Ll/ᩳܽ֡;->ۧ(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 219
    iget-object v2, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v3, p0, Ll/ۧ֫֡;->ۨ:Ljava/io/File;

    invoke-interface {v2, v3}, Ll/ᩳܽ֡;->᩻(Ljava/io/File;)V

    goto :goto_0

    .line 221
    :cond_1
    iget-object v2, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v3, p0, Ll/ۧ֫֡;->ۨ:Ljava/io/File;

    iget-object v4, p0, Ll/ۧ֫֡;->ۛ:Ljava/io/File;

    invoke-interface {v2, v3, v4}, Ll/ᩳܽ֡;->֫(Ljava/io/File;Ljava/io/File;)V

    .line 226
    :cond_2
    :goto_0
    iget-object v2, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v3, p0, Ll/ۧ֫֡;->ۛ:Ljava/io/File;

    invoke-interface {v2, v3}, Ll/ᩳܽ֡;->ۧ(Ljava/io/File;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    .line 228
    :try_start_2
    invoke-direct {p0}, Ll/ۧ֫֡;->ۖ()V

    .line 229
    invoke-direct {p0}, Ll/ۧ֫֡;->ۜ()V

    .line 230
    iput-boolean v3, p0, Ll/ۧ֫֡;->ۤ:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 231
    monitor-exit v0

    return-void

    :catch_0
    move-exception v2

    .line 233
    :try_start_3
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۧ֫֡;->ۙ:Ljava/io/File;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is corrupt: "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", removing"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x5

    .line 233
    invoke-virtual {v4, v5, v1, v2}, Ll/ᩴܽ֡;->֫(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v1, 0x0

    .line 695
    :try_start_4
    invoke-virtual {p0}, Ll/ۧ֫֡;->close()V

    .line 696
    iget-object v2, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v4, p0, Ll/ۧ֫֡;->ۙ:Ljava/io/File;

    invoke-interface {v2, v4}, Ll/ᩳܽ֡;->֫(Ljava/io/File;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 242
    :try_start_5
    iput-boolean v1, p0, Ll/ۧ֫֡;->᩶:Z

    goto :goto_1

    :catchall_0
    move-exception v2

    iput-boolean v1, p0, Ll/ۧ֫֡;->᩶:Z

    throw v2

    .line 246
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ll/ۧ֫֡;->ᩳ()V

    .line 248
    iput-boolean v3, p0, Ll/ۧ֫֡;->ۤ:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 249
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v1
.end method

.method public final ֫(Ll/۟۟᩵;)V
    .locals 7

    .line 623
    iget-object v0, p1, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    iget-object v1, p1, Ll/۟۟᩵;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 624
    invoke-virtual {v0}, Ll/ܰ۟᩵;->ܽ()V

    :cond_0
    const/4 v0, 0x0

    .line 627
    :goto_0
    iget v2, p0, Ll/ۧ֫֡;->᩻֫:I

    if-ge v0, v2, :cond_1

    .line 628
    iget-object v2, p1, Ll/۟۟᩵;->֫:[Ljava/io/File;

    aget-object v2, v2, v0

    iget-object v3, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    invoke-interface {v3, v2}, Ll/ᩳܽ֡;->᩻(Ljava/io/File;)V

    .line 629
    iget-wide v2, p0, Ll/ۧ֫֡;->ܳ֫:J

    iget-object v4, p1, Ll/۟۟᩵;->ܿ:[J

    aget-wide v5, v4, v0

    sub-long/2addr v2, v5

    iput-wide v2, p0, Ll/ۧ֫֡;->ܳ֫:J

    const-wide/16 v2, 0x0

    .line 630
    aput-wide v2, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 633
    :cond_1
    iget p1, p0, Ll/ۧ֫֡;->ܿ֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۧ֫֡;->ܿ֫:I

    .line 634
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    const-string v0, "REMOVE"

    invoke-interface {p1, v0}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    const/16 v0, 0x20

    invoke-interface {p1, v0}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    invoke-interface {p1, v1}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    const/16 v0, 0xa

    invoke-interface {p1, v0}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 635
    iget-object p1, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    invoke-virtual {p0}, Ll/ۧ֫֡;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 638
    iget-object p1, p0, Ll/ۧ֫֡;->ۗ:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v0, p0, Ll/ۧ֫֡;->᩹:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method

.method public final declared-synchronized ֫(Ll/ܰ۟᩵;Z)V
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 535
    :try_start_0
    iget-object v1, p1, Ll/ܰ۟᩵;->ۧ:Ll/۟۟᩵;

    .line 536
    iget-object v2, v1, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    if-ne v2, p1, :cond_b

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    .line 541
    iget-boolean v3, v1, Ll/۟۟᩵;->ܳ:Z

    if-nez v3, :cond_2

    const/4 v3, 0x0

    .line 542
    :goto_0
    iget v4, p0, Ll/ۧ֫֡;->᩻֫:I

    if-ge v3, v4, :cond_2

    .line 543
    iget-object v4, p1, Ll/ܰ۟᩵;->ᩳ:[Z

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_1

    .line 547
    iget-object v4, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v5, v1, Ll/۟۟᩵;->ܽ:[Ljava/io/File;

    aget-object v5, v5, v3

    invoke-interface {v4, v5}, Ll/ᩳܽ֡;->ۧ(Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 548
    invoke-virtual {p1}, Ll/ܰ۟᩵;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 549
    monitor-exit v0

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 544
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ll/ܰ۟᩵;->֫()V

    .line 545
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Newly created entry didn\'t create value for index "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 p1, 0x0

    .line 554
    :goto_1
    iget v3, p0, Ll/ۧ֫֡;->᩻֫:I

    if-ge p1, v3, :cond_5

    .line 555
    iget-object v3, v1, Ll/۟۟᩵;->ܽ:[Ljava/io/File;

    aget-object v3, v3, p1

    if-eqz p2, :cond_3

    .line 557
    iget-object v4, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    invoke-interface {v4, v3}, Ll/ᩳܽ֡;->ۧ(Ljava/io/File;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 558
    iget-object v4, v1, Ll/۟۟᩵;->֫:[Ljava/io/File;

    aget-object v4, v4, p1

    .line 559
    iget-object v5, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    invoke-interface {v5, v3, v4}, Ll/ᩳܽ֡;->֫(Ljava/io/File;Ljava/io/File;)V

    .line 560
    iget-object v3, v1, Ll/۟۟᩵;->ܿ:[J

    aget-wide v5, v3, p1

    .line 561
    iget-object v3, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    invoke-interface {v3, v4}, Ll/ᩳܽ֡;->ᩳ(Ljava/io/File;)J

    move-result-wide v3

    .line 562
    iget-object v7, v1, Ll/۟۟᩵;->ܿ:[J

    aput-wide v3, v7, p1

    .line 563
    iget-wide v7, p0, Ll/ۧ֫֡;->ܳ֫:J

    sub-long/2addr v7, v5

    add-long/2addr v7, v3

    iput-wide v7, p0, Ll/ۧ֫֡;->ܳ֫:J

    goto :goto_2

    .line 566
    :cond_3
    iget-object v4, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    invoke-interface {v4, v3}, Ll/ᩳܽ֡;->᩻(Ljava/io/File;)V

    :cond_4
    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 570
    :cond_5
    iget p1, p0, Ll/ۧ֫֡;->ܿ֫:I

    const/4 v3, 0x1

    add-int/2addr p1, v3

    iput p1, p0, Ll/ۧ֫֡;->ܿ֫:I

    const/4 p1, 0x0

    .line 571
    iput-object p1, v1, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    .line 572
    iget-boolean p1, v1, Ll/۟۟᩵;->ܳ:Z

    or-int/2addr p1, p2

    const/16 v4, 0xa

    const/16 v5, 0x20

    if-eqz p1, :cond_7

    .line 573
    iput-boolean v3, v1, Ll/۟۟᩵;->ܳ:Z

    .line 574
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    const-string v3, "CLEAN"

    invoke-interface {p1, v3}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    invoke-interface {p1, v5}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 575
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    iget-object v3, v1, Ll/۟۟᩵;->ᩳ:Ljava/lang/String;

    invoke-interface {p1, v3}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 576
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    .line 1011
    iget-object v3, v1, Ll/۟۟᩵;->ܿ:[J

    array-length v6, v3

    :goto_3
    if-ge v2, v6, :cond_6

    aget-wide v7, v3, v2

    .line 1012
    invoke-interface {p1, v5}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    invoke-interface {p1, v7, v8}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 577
    :cond_6
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    invoke-interface {p1, v4}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    if-eqz p2, :cond_8

    .line 579
    iget-wide p1, p0, Ll/ۧ֫֡;->ᩳ֫:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, p1

    iput-wide v2, p0, Ll/ۧ֫֡;->ᩳ֫:J

    iput-wide p1, v1, Ll/۟۟᩵;->᩻:J

    goto :goto_4

    .line 582
    :cond_7
    iget-object p1, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    iget-object p2, v1, Ll/۟۟᩵;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    const-string p2, "REMOVE"

    invoke-interface {p1, p2}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    invoke-interface {p1, v5}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 584
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    iget-object p2, v1, Ll/۟۟᩵;->ᩳ:Ljava/lang/String;

    invoke-interface {p1, p2}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 585
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    invoke-interface {p1, v4}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 587
    :cond_8
    :goto_4
    iget-object p1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۤܽ֡;->flush()V

    .line 589
    iget-wide p1, p0, Ll/ۧ֫֡;->ܳ֫:J

    iget-wide v1, p0, Ll/ۧ֫֡;->֫֫:J

    cmp-long v3, p1, v1

    if-gtz v3, :cond_9

    invoke-virtual {p0}, Ll/ۧ֫֡;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 590
    :cond_9
    iget-object p1, p0, Ll/ۧ֫֡;->ۗ:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object p2, p0, Ll/ۧ֫֡;->᩹:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 592
    :cond_a
    monitor-exit v0

    return-void

    .line 537
    :cond_b
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 592
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ljava/lang/String;)Ll/֫֫֡;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 436
    :try_start_0
    invoke-virtual {p0}, Ll/ۧ֫֡;->֫()V

    .line 438
    invoke-direct {p0}, Ll/ۧ֫֡;->᩻()V

    .line 439
    invoke-static {p1}, Ll/ۧ֫֡;->ܳ(Ljava/lang/String;)V

    .line 440
    iget-object v1, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟۟᩵;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 441
    iget-boolean v3, v1, Ll/۟۟᩵;->ܳ:Z

    if-nez v3, :cond_0

    goto :goto_0

    .line 443
    :cond_0
    invoke-virtual {v1}, Ll/۟۟᩵;->֫()Ll/֫֫֡;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    .line 444
    monitor-exit v0

    return-object v2

    .line 446
    :cond_1
    :try_start_1
    iget v2, p0, Ll/ۧ֫֡;->ܿ֫:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۧ֫֡;->ܿ֫:I

    .line 447
    iget-object v2, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    const-string v3, "READ"

    invoke-interface {v2, v3}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    const/16 v3, 0x20

    invoke-interface {v2, v3}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    invoke-interface {v2, p1}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    const/16 p1, 0xa

    invoke-interface {v2, p1}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 448
    invoke-virtual {p0}, Ll/ۧ֫֡;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 449
    iget-object p1, p0, Ll/ۧ֫֡;->ۗ:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v2, p0, Ll/ۧ֫֡;->᩹:Ljava/lang/Runnable;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 452
    :cond_2
    monitor-exit v0

    return-object v1

    .line 441
    :cond_3
    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ܳ()V
    .locals 5

    .line 683
    :goto_0
    iget-wide v0, p0, Ll/ۧ֫֡;->ܳ֫:J

    iget-wide v2, p0, Ll/ۧ֫֡;->֫֫:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 684
    iget-object v0, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟۟᩵;

    .line 685
    invoke-virtual {p0, v0}, Ll/ۧ֫֡;->֫(Ll/۟۟᩵;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 687
    iput-boolean v0, p0, Ll/ۧ֫֡;->ܽ֫:Z

    return-void
.end method

.method public final ܽ()Z
    .locals 2

    .line 600
    iget v0, p0, Ll/ۧ֫֡;->ܿ֫:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    .line 601
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized ᩳ()V
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 392
    :try_start_0
    iget-object v1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    if-eqz v1, :cond_0

    .line 393
    invoke-interface {v1}, Ll/ۚᩳ֡;->close()V

    .line 396
    :cond_0
    iget-object v1, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v2, p0, Ll/ۧ֫֡;->᩺:Ljava/io/File;

    invoke-interface {v1, v2}, Ll/ᩳܽ֡;->ܳ(Ljava/io/File;)Ll/ۚᩳ֡;

    move-result-object v1

    invoke-static {v1}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "libcore.io.DiskLruCache"

    .line 398
    invoke-interface {v1, v2}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    const/16 v2, 0xa

    invoke-interface {v1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    const-string v3, "1"

    .line 399
    invoke-interface {v1, v3}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    invoke-interface {v1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 400
    iget v3, p0, Ll/ۧ֫֡;->᩸:I

    int-to-long v3, v3

    invoke-interface {v1, v3, v4}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    invoke-interface {v1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 401
    iget v3, p0, Ll/ۧ֫֡;->᩻֫:I

    int-to-long v3, v3

    invoke-interface {v1, v3, v4}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    invoke-interface {v1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 402
    invoke-interface {v1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 404
    iget-object v3, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟۟᩵;

    .line 405
    iget-object v6, v4, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    const/16 v7, 0x20

    if-eqz v6, :cond_1

    const-string v5, "DIRTY"

    .line 406
    invoke-interface {v1, v5}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    invoke-interface {v1, v7}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 407
    iget-object v4, v4, Ll/۟۟᩵;->ᩳ:Ljava/lang/String;

    invoke-interface {v1, v4}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 408
    invoke-interface {v1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    goto :goto_0

    :cond_1
    const-string v6, "CLEAN"

    .line 410
    invoke-interface {v1, v6}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    invoke-interface {v1, v7}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 411
    iget-object v6, v4, Ll/۟۟᩵;->ᩳ:Ljava/lang/String;

    invoke-interface {v1, v6}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 1011
    iget-object v4, v4, Ll/۟۟᩵;->ܿ:[J

    array-length v6, v4

    :goto_1
    if-ge v5, v6, :cond_2

    aget-wide v8, v4, v5

    .line 1012
    invoke-interface {v1, v7}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    invoke-interface {v1, v8, v9}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 413
    :cond_2
    invoke-interface {v1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 417
    :cond_3
    :try_start_2
    invoke-interface {v1}, Ll/ۚᩳ֡;->close()V

    .line 420
    iget-object v1, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v2, p0, Ll/ۧ֫֡;->ۛ:Ljava/io/File;

    invoke-interface {v1, v2}, Ll/ᩳܽ֡;->ۧ(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 421
    iget-object v1, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v2, p0, Ll/ۧ֫֡;->ۛ:Ljava/io/File;

    iget-object v3, p0, Ll/ۧ֫֡;->ۨ:Ljava/io/File;

    invoke-interface {v1, v2, v3}, Ll/ᩳܽ֡;->֫(Ljava/io/File;Ljava/io/File;)V

    .line 423
    :cond_4
    iget-object v1, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v2, p0, Ll/ۧ֫֡;->᩺:Ljava/io/File;

    iget-object v3, p0, Ll/ۧ֫֡;->ۛ:Ljava/io/File;

    invoke-interface {v1, v2, v3}, Ll/ᩳܽ֡;->֫(Ljava/io/File;Ljava/io/File;)V

    .line 424
    iget-object v1, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v2, p0, Ll/ۧ֫֡;->ۨ:Ljava/io/File;

    invoke-interface {v1, v2}, Ll/ᩳܽ֡;->᩻(Ljava/io/File;)V

    .line 315
    iget-object v1, p0, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v2, p0, Ll/ۧ֫֡;->ۛ:Ljava/io/File;

    invoke-interface {v1, v2}, Ll/ᩳܽ֡;->ܽ(Ljava/io/File;)Ll/ۚᩳ֡;

    move-result-object v1

    .line 316
    new-instance v2, Ll/ۨ۟᩵;

    invoke-direct {v2, p0, v1}, Ll/ۨ۟᩵;-><init>(Ll/ۧ֫֡;Ll/ۚᩳ֡;)V

    .line 322
    invoke-static {v2}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object v1

    .line 426
    iput-object v1, p0, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    .line 427
    iput-boolean v5, p0, Ll/ۧ֫֡;->۫:Z

    .line 428
    iput-boolean v5, p0, Ll/ۧ֫֡;->ۧ֫:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 429
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    .line 417
    :try_start_3
    invoke-interface {v1}, Ll/ۚᩳ֡;->close()V

    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final declared-synchronized ᩳ(Ljava/lang/String;)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 611
    :try_start_0
    invoke-virtual {p0}, Ll/ۧ֫֡;->֫()V

    .line 613
    invoke-direct {p0}, Ll/ۧ֫֡;->᩻()V

    .line 614
    invoke-static {p1}, Ll/ۧ֫֡;->ܳ(Ljava/lang/String;)V

    .line 615
    iget-object v1, p0, Ll/ۧ֫֡;->۟:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟۟᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 616
    monitor-exit v0

    return-void

    .line 617
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Ll/ۧ֫֡;->֫(Ll/۟۟᩵;)V

    .line 618
    iget-wide v1, p0, Ll/ۧ֫֡;->ܳ֫:J

    iget-wide v3, p0, Ll/ۧ֫֡;->֫֫:J

    cmp-long p1, v1, v3

    if-gtz p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll/ۧ֫֡;->ܽ֫:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 619
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
