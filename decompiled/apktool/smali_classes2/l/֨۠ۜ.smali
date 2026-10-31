.class public final Ll/֨۠ۜ;
.super Ljava/lang/Object;
.source "4748"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ۬:Ljava/util/regex/Pattern;


# instance fields
.field public ۗ:Z

.field public final ۙ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public ᩶:Ll/᩵۠ۜ;

.field public ᩸:Ll/᩵۠ۜ;

.field public final ᩹:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(?i)^bytes\\s+0-0/(\\d+)$"

    .line 28
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/֨۠ۜ;->۬:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 41
    invoke-static {}, Ll/ۧۙۜ;->֫()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/֨۠ۜ;->᩹:Ljava/util/HashMap;

    .line 51
    iput-object v0, p0, Ll/֨۠ۜ;->ۙ:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)J
    .locals 6

    const-wide/16 v0, -0x1

    if-nez p0, :cond_0

    return-wide v0

    .line 282
    :cond_0
    sget-object v2, Ll/֨۠ۜ;->۬:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 283
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-nez v2, :cond_1

    return-wide v0

    :cond_1
    const/4 v2, 0x1

    .line 287
    :try_start_0
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-lez p0, :cond_2

    return-wide v2

    :catch_0
    :cond_2
    return-wide v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 2

    .line 297
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 298
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 299
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 300
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/᩸۠֫;Landroid/net/Uri;)Ll/֡۠ۜ;
    .locals 12

    const/4 v0, 0x0

    const-wide/16 v1, -0x1

    .line 250
    :try_start_0
    new-instance v3, Ll/ۙ۠֫;

    invoke-direct {v3}, Ll/ۙ۠֫;-><init>()V

    .line 251
    invoke-virtual {v3, p1}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    const-wide/16 v4, 0x0

    .line 252
    invoke-virtual {v3, v4, v5}, Ll/ۙ۠֫;->ۧ(J)V

    const-wide/16 v6, 0x1

    .line 253
    invoke-virtual {v3, v6, v7}, Ll/ۙ۠֫;->֫(J)V

    .line 254
    invoke-virtual {v3}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object p1

    .line 250
    invoke-interface {p0, p1}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v8

    .line 255
    invoke-interface {p0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object p1

    const-string v3, "Content-Range"

    .line 256
    invoke-static {v3, p1}, Ll/֨۠ۜ;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    .line 257
    instance-of v10, p0, Ll/᩷ܶ֫;

    if-eqz v10, :cond_0

    .line 258
    check-cast p0, Ll/᩷ܶ֫;

    invoke-interface {p0}, Ll/᩷ܶ֫;->ᩳ()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    const/16 v10, 0xce

    if-ne p0, v10, :cond_1

    .line 260
    invoke-static {v3}, Ll/֨۠ۜ;->֫(Ljava/lang/String;)J

    move-result-wide v10

    goto :goto_1

    :cond_1
    move-wide v10, v1

    :goto_1
    cmp-long p0, v10, v1

    if-eqz p0, :cond_2

    .line 262
    new-instance p0, Ll/֡۠ۜ;

    const/4 p1, 0x1

    invoke-direct {p0, v10, v11, p1}, Ll/֡۠ۜ;-><init>(JZ)V

    return-object p0

    :cond_2
    const-string p0, "Content-Length"

    .line 264
    invoke-static {p0, p1}, Ll/֨۠ۜ;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ll/᩻ܶ֫; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p0, :cond_3

    .line 309
    :try_start_1
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ll/᩻ܶ֫; {:try_start_1 .. :try_end_1} :catch_1

    cmp-long v3, p0, v4

    if-ltz v3, :cond_3

    goto :goto_2

    :catch_0
    :cond_3
    move-wide p0, v1

    :goto_2
    cmp-long v3, p0, v1

    if-nez v3, :cond_4

    cmp-long v3, v8, v6

    if-lez v3, :cond_4

    goto :goto_3

    :cond_4
    move-wide v8, p0

    .line 268
    :goto_3
    :try_start_2
    new-instance p0, Ll/֡۠ۜ;

    invoke-direct {p0, v8, v9, v0}, Ll/֡۠ۜ;-><init>(JZ)V
    :try_end_2
    .catch Ll/᩻ܶ֫; {:try_start_2 .. :try_end_2} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    .line 270
    iget p1, p0, Ll/᩻ܶ֫;->۬:I

    const/16 v3, 0x1a0

    if-ne p1, v3, :cond_5

    .line 271
    new-instance p0, Ll/֡۠ۜ;

    invoke-direct {p0, v1, v2, v0}, Ll/֡۠ۜ;-><init>(JZ)V

    return-object p0

    .line 273
    :cond_5
    throw p0
.end method

.method public static ֫(Ll/֨۠ۜ;Ll/᩵۠ۜ;Landroid/net/Uri;)V
    .locals 4

    const/4 v1, 0x0

    .line 212
    :try_start_0
    invoke-direct {p0}, Ll/֨۠ۜ;->ܽ()V

    .line 213
    invoke-static {p1}, Ll/᩵۠ۜ;->ܿ(Ll/᩵۠ۜ;)Ll/᩸۠֫;

    move-result-object v0

    invoke-static {v0, p2}, Ll/֨۠ۜ;->֫(Ll/᩸۠֫;Landroid/net/Uri;)Ll/֡۠ۜ;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 218
    :try_start_1
    invoke-static {p1}, Ll/᩵۠ۜ;->ܿ(Ll/᩵۠ۜ;)Ll/᩸۠֫;

    move-result-object v0

    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 222
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    move-object v0, p0

    .line 223
    monitor-enter v0

    .line 224
    :try_start_2
    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-ne v3, p1, :cond_0

    .line 225
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 227
    :cond_0
    iget-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-ne v3, p1, :cond_1

    .line 228
    iput-object v1, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    .line 231
    :cond_1
    iget-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-nez v3, :cond_2

    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-eqz v3, :cond_2

    invoke-static {v3}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 233
    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    iput-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    .line 234
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 236
    :cond_2
    invoke-static {p1, p2}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Ll/֡۠ۜ;)V

    .line 237
    invoke-static {p1, v1}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Ljava/lang/Throwable;)V

    .line 238
    invoke-static {p1, v2}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Z)V

    .line 239
    invoke-static {p1}, Ll/᩵۠ۜ;->ۜ(Ll/᩵۠ۜ;)V

    .line 240
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 241
    monitor-exit v0

    goto/16 :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    .line 222
    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    move-object v0, p0

    .line 223
    monitor-enter v0

    .line 224
    :try_start_3
    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-ne v3, p1, :cond_3

    .line 225
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 227
    :cond_3
    iget-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-ne v3, p1, :cond_4

    .line 228
    iput-object v1, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    .line 231
    :cond_4
    iget-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-nez v3, :cond_5

    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-eqz v3, :cond_5

    invoke-static {v3}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 233
    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    iput-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    .line 234
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 236
    :cond_5
    invoke-static {p1, p2}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Ll/֡۠ۜ;)V

    .line 237
    invoke-static {p1, v1}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Ljava/lang/Throwable;)V

    .line 238
    invoke-static {p1, v2}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Z)V

    .line 239
    invoke-static {p1}, Ll/᩵۠ۜ;->ۜ(Ll/᩵۠ۜ;)V

    .line 240
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 241
    monitor-exit v0

    goto/16 :goto_0

    :catchall_2
    move-exception p0

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p0

    :catchall_3
    move-exception p2

    .line 218
    :try_start_4
    invoke-static {p1}, Ll/᩵۠ۜ;->ܿ(Ll/᩵۠ۜ;)Ll/᩸۠֫;

    move-result-object v0

    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 222
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    move-object v0, p0

    .line 223
    monitor-enter v0

    .line 224
    :try_start_5
    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-ne v3, p1, :cond_6

    .line 225
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 227
    :cond_6
    iget-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-ne v3, p1, :cond_7

    .line 228
    iput-object v1, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    .line 231
    :cond_7
    iget-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-nez v3, :cond_8

    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-eqz v3, :cond_8

    invoke-static {v3}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 233
    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    iput-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    .line 234
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 236
    :cond_8
    invoke-static {p1, v1}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Ll/֡۠ۜ;)V

    .line 237
    invoke-static {p1, p2}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Ljava/lang/Throwable;)V

    .line 238
    invoke-static {p1, v2}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Z)V

    .line 239
    invoke-static {p1}, Ll/᩵۠ۜ;->ۜ(Ll/᩵۠ۜ;)V

    .line 240
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 241
    monitor-exit v0

    goto :goto_0

    :catchall_4
    move-exception p0

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw p0

    .line 222
    :catchall_5
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    move-object v0, p0

    .line 223
    monitor-enter v0

    .line 224
    :try_start_6
    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-ne v3, p1, :cond_9

    .line 225
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 227
    :cond_9
    iget-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-ne v3, p1, :cond_a

    .line 228
    iput-object v1, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    .line 231
    :cond_a
    iget-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-nez v3, :cond_b

    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-eqz v3, :cond_b

    invoke-static {v3}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 233
    iget-object v3, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    iput-object v3, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    .line 234
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 236
    :cond_b
    invoke-static {p1, v1}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Ll/֡۠ۜ;)V

    .line 237
    invoke-static {p1, p2}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Ljava/lang/Throwable;)V

    .line 238
    invoke-static {p1, v2}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Z)V

    .line 239
    invoke-static {p1}, Ll/᩵۠ۜ;->ۜ(Ll/᩵۠ۜ;)V

    .line 240
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 241
    monitor-exit v0

    :goto_0
    return-void

    :catchall_6
    move-exception p0

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    throw p0
.end method

.method private ֫(Ll/᩵۠ۜ;Ljava/io/IOException;)V
    .locals 2

    move-object v0, p0

    .line 186
    monitor-enter v0

    .line 187
    :try_start_0
    iget-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-ne v1, p1, :cond_0

    const/4 v1, 0x0

    .line 188
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 190
    :cond_0
    invoke-static {p1, p2}, Ll/᩵۠ۜ;->֫(Ll/᩵۠ۜ;Ljava/lang/Throwable;)V

    .line 191
    invoke-static {p1}, Ll/᩵۠ۜ;->ۜ(Ll/᩵۠ۜ;)V

    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 193
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 195
    :try_start_1
    invoke-static {p1}, Ll/᩵۠ۜ;->ܿ(Ll/᩵۠ۜ;)Ll/᩸۠֫;

    move-result-object p1

    invoke-interface {p1}, Ll/᩸۠֫;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 197
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    return-void

    :catchall_1
    move-exception p1

    .line 193
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method private ۧ(Landroid/net/Uri;Ll/ܶ۠֫;)Ll/֡۠ۜ;
    .locals 5

    move-object v0, p0

    .line 116
    monitor-enter v0

    .line 167
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    .line 168
    :goto_1
    iget-object v4, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-nez v4, :cond_1

    const/4 v2, 0x0

    :cond_1
    add-int/2addr v3, v2

    if-nez v1, :cond_2

    const/4 v1, 0x2

    if-ge v3, v1, :cond_2

    goto :goto_2

    .line 117
    :cond_2
    iget-boolean v1, p0, Ll/֨۠ۜ;->ۗ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_3

    .line 119
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 121
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 122
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "Interrupted while waiting for HTTP range open"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 125
    :cond_3
    :goto_2
    invoke-direct {p0}, Ll/֨۠ۜ;->ܽ()V

    .line 127
    new-instance v1, Ll/᩵۠ۜ;

    invoke-interface {p2}, Ll/ܶ۠֫;->֫()Ll/᩸۠֫;

    move-result-object p2

    invoke-direct {v1, p2}, Ll/᩵۠ۜ;-><init>(Ll/᩸۠֫;)V

    .line 128
    iput-object v1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 129
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    :try_start_3
    iget-object p2, p0, Ll/֨۠ۜ;->ۙ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v0, Ll/ۘ۠ۜ;

    invoke-direct {v0, p0, v1, p1}, Ll/ۘ۠ۜ;-><init>(Ll/֨۠ۜ;Ll/᩵۠ۜ;Landroid/net/Uri;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    move-object v0, p0

    .line 137
    monitor-enter v0

    .line 138
    :goto_3
    :try_start_4
    invoke-static {v1}, Ll/᩵۠ۜ;->ܽ(Ll/᩵۠ۜ;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-boolean p1, p0, Ll/֨۠ۜ;->ۗ:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_5

    .line 140
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    .line 142
    :catch_1
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 176
    invoke-static {v1}, Ll/᩵۠ۜ;->᩻(Ll/᩵۠ۜ;)V

    .line 177
    iget-object p1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    if-ne p1, v1, :cond_4

    iget-object p1, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    if-nez p1, :cond_4

    const/4 p1, 0x0

    .line 178
    iput-object p1, p0, Ll/֨۠ۜ;->᩶:Ll/᩵۠ۜ;

    .line 179
    iput-object v1, p0, Ll/֨۠ۜ;->᩸:Ll/᩵۠ۜ;

    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 144
    :cond_4
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "Interrupted while opening HTTP range probe"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 148
    :cond_5
    invoke-direct {p0}, Ll/֨۠ۜ;->ܽ()V

    .line 149
    invoke-static {v1}, Ll/᩵۠ۜ;->ܳ(Ll/᩵۠ۜ;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 150
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 152
    :cond_6
    invoke-static {v1}, Ll/᩵۠ۜ;->ۧ(Ll/᩵۠ۜ;)Ljava/lang/Throwable;

    move-result-object p1

    instance-of p2, p1, Ljava/io/IOException;

    if-nez p2, :cond_9

    .line 155
    invoke-static {v1}, Ll/᩵۠ۜ;->ۧ(Ll/᩵۠ۜ;)Ljava/lang/Throwable;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/RuntimeException;

    if-nez p2, :cond_8

    .line 158
    invoke-static {v1}, Ll/᩵۠ۜ;->ۧ(Ll/᩵۠ۜ;)Ljava/lang/Throwable;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/Error;

    if-nez p2, :cond_7

    .line 161
    invoke-static {v1}, Ll/᩵۠ۜ;->ᩳ(Ll/᩵۠ۜ;)Ll/֡۠ۜ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 158
    :cond_7
    check-cast p1, Ljava/lang/Error;

    .line 159
    throw p1

    .line 155
    :cond_8
    check-cast p1, Ljava/lang/RuntimeException;

    .line 156
    throw p1

    .line 152
    :cond_9
    check-cast p1, Ljava/io/IOException;

    .line 153
    throw p1

    :catchall_0
    move-exception p1

    .line 162
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1

    :catch_2
    move-exception p1

    .line 133
    new-instance p2, Ljava/io/IOException;

    const-string v0, "Unable to schedule HTTP range probe"

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 134
    invoke-direct {p0, v1, p2}, Ll/֨۠ۜ;->֫(Ll/᩵۠ۜ;Ljava/io/IOException;)V

    .line 135
    throw p2

    :catchall_1
    move-exception p1

    .line 129
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw p1
.end method

.method private declared-synchronized ܽ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 318
    :try_start_0
    iget-boolean v1, p0, Ll/֨۠ۜ;->ۗ:Z

    if-nez v1, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 321
    monitor-exit v0

    return-void

    .line 319
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/InterruptedIOException;

    const-string v2, "HTTP range probe was canceled"

    invoke-direct {v1, v2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 2

    move-object v0, p0

    .line 336
    monitor-enter v0

    const/4 v1, 0x1

    .line 337
    :try_start_0
    iput-boolean v1, p0, Ll/֨۠ۜ;->ۗ:Z

    .line 338
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 339
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Landroid/net/Uri;Ll/ܶ۠֫;)Ll/֡۠ۜ;
    .locals 4

    .line 58
    invoke-static {p1, p2}, Ll/᩷۬ۜ;->֫(Landroid/net/Uri;Ll/ܶ۠֫;)Ljava/lang/String;

    move-result-object v1

    move-object v0, p0

    .line 60
    monitor-enter v0

    .line 61
    :try_start_0
    iget-object v2, p0, Ll/֨۠ۜ;->᩹:Ljava/util/HashMap;

    new-instance v3, Ll/ۖ۠ۜ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, v1, v3}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ۠ۜ;

    .line 62
    :goto_0
    iget-object v2, v1, Ll/ᩴ۠ۜ;->ܽ:Ll/ۚ۠ۜ;

    sget-object v3, Ll/ۚ۠ۜ;->᩶:Ll/ۚ۠ۜ;

    if-ne v2, v3, :cond_0

    iget-boolean v2, p0, Ll/֨۠ۜ;->ۗ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v2, :cond_0

    .line 64
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 66
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 67
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "Interrupted while waiting for HTTP range probe"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_0
    invoke-direct {p0}, Ll/֨۠ۜ;->ܽ()V

    .line 71
    iget-object v2, v1, Ll/ᩴ۠ۜ;->ۧ:Ll/֡۠ۜ;

    if-eqz v2, :cond_1

    .line 72
    monitor-exit v0

    return-object v2

    .line 74
    :cond_1
    iget-object v2, v1, Ll/ᩴ۠ۜ;->֫:Ljava/io/IOException;

    if-nez v2, :cond_7

    .line 77
    iput-object v3, v1, Ll/ᩴ۠ۜ;->ܽ:Ll/ۚ۠ۜ;

    .line 78
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v0, 0x0

    .line 83
    :try_start_3
    invoke-direct {p0, p1, p2}, Ll/֨۠ۜ;->ۧ(Landroid/net/Uri;Ll/ܶ۠֫;)Ll/֡۠ۜ;

    move-result-object p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    move-object p2, p1

    move-object p1, v0

    goto :goto_1

    :catch_1
    move-exception p1

    move-object p2, v0

    :goto_1
    move-object v0, p0

    .line 87
    monitor-enter v0

    .line 88
    :try_start_4
    iget-boolean v2, p0, Ll/֨۠ۜ;->ۗ:Z

    if-nez v2, :cond_6

    if-nez p1, :cond_3

    .line 93
    iput-object p2, v1, Ll/ᩴ۠ۜ;->ۧ:Ll/֡۠ۜ;

    .line 94
    invoke-static {p2}, Ll/֡۠ۜ;->֫(Ll/֡۠ۜ;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Ll/ۚ۠ۜ;->ۙ:Ll/ۚ۠ۜ;

    goto :goto_2

    :cond_2
    sget-object v2, Ll/ۚ۠ۜ;->۬:Ll/ۚ۠ۜ;

    :goto_2
    iput-object v2, v1, Ll/ᩴ۠ۜ;->ܽ:Ll/ۚ۠ۜ;

    goto :goto_3

    .line 95
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 97
    sget-object v2, Ll/ۚ۠ۜ;->ۗ:Ll/ۚ۠ۜ;

    iput-object v2, v1, Ll/ᩴ۠ۜ;->ܽ:Ll/ۚ۠ۜ;

    goto :goto_3

    .line 99
    :cond_4
    iput-object p1, v1, Ll/ᩴ۠ۜ;->֫:Ljava/io/IOException;

    .line 100
    sget-object v2, Ll/ۚ۠ۜ;->᩹:Ll/ۚ۠ۜ;

    iput-object v2, v1, Ll/ᩴ۠ۜ;->ܽ:Ll/ۚ۠ۜ;

    .line 102
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 103
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_5

    return-object p2

    .line 105
    :cond_5
    throw p1

    .line 89
    :cond_6
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 90
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "HTTP range probe was canceled"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 103
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1

    .line 75
    :cond_7
    :try_start_6
    throw v2

    :catchall_1
    move-exception p1

    .line 78
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public final ֫()V
    .locals 2

    move-object v0, p0

    .line 336
    monitor-enter v0

    const/4 v1, 0x1

    .line 337
    :try_start_0
    iput-boolean v1, p0, Ll/֨۠ۜ;->ۗ:Z

    .line 338
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 339
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
