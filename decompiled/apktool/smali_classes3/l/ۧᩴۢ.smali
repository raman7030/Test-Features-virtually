.class public final Ll/ۧᩴۢ;
.super Ljava/lang/Object;
.source "47AI"


# static fields
.field public static final ܽ:Ll/ۚܳܳ;


# instance fields
.field public final ֫:Ll/᩺ᩴۢ;

.field public final ۧ:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 368
    new-instance v0, Ll/ۤۘۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    sput-object v0, Ll/ۧᩴۢ;->ܽ:Ll/ۚܳܳ;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֡ۢ;Ll/᩺ᩴۢ;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p2, p0, Ll/ۧᩴۢ;->֫:Ll/᩺ᩴۢ;

    .line 48
    new-instance p1, Ll/۟ۘۢ;

    invoke-direct {p1}, Ll/۟ۘۢ;-><init>()V

    invoke-static {p1}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Ll/ۧᩴۢ;->ۧ:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/֨ᩴۢ;
    .locals 8

    .line 82
    :try_start_0
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 83
    new-instance v0, Ll/֫ᩴۢ;

    .line 384
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "basePath"

    .line 84
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/֫ᩴۢ;->ۧ:Ljava/lang/String;

    .line 85
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Ll/֫ᩴۢ;->ܽ:Ljava/util/ArrayList;

    const-string v1, "archiveName"

    .line 86
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/֫ᩴۢ;->֫:Ljava/lang/String;
    :try_end_0
    .catch Ll/᩻֡ۢ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_7

    .line 61
    iget-object p0, v0, Ll/֫ᩴۢ;->ۧ:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_7

    iget-object p0, v0, Ll/֫ᩴۢ;->ܽ:Ljava/util/ArrayList;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_7

    .line 64
    iget-object p0, v0, Ll/֫ᩴۢ;->ۧ:Ljava/lang/String;

    .line 281
    invoke-static {p0}, Ll/ۧᩴۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 282
    invoke-static {p0}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 65
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Ll/֫ᩴۢ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    iget-object v2, v0, Ll/֫ᩴۢ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 67
    invoke-static {v3}, Ll/ۧᩴۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 69
    :cond_0
    new-instance v2, Ll/֨ᩴۢ;

    iget-object v0, v0, Ll/֫ᩴۢ;->֫:Ljava/lang/String;

    .line 337
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const-string v4, "download.zip"

    if-eqz v3, :cond_1

    move-object v0, v4

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 338
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v5, 0x0

    .line 339
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v5, v6, :cond_4

    .line 340
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x1f

    if-le v6, v7, :cond_3

    const/16 v7, 0x2f

    if-eq v6, v7, :cond_3

    const/16 v7, 0x5c

    if-eq v6, v7, :cond_3

    const/16 v7, 0x3a

    if-eq v6, v7, :cond_3

    const/16 v7, 0x2a

    if-eq v6, v7, :cond_3

    const/16 v7, 0x3f

    if-eq v6, v7, :cond_3

    const/16 v7, 0x22

    if-eq v6, v7, :cond_3

    const/16 v7, 0x3c

    if-eq v6, v7, :cond_3

    const/16 v7, 0x3e

    if-eq v6, v7, :cond_3

    const/16 v7, 0x7c

    if-ne v6, v7, :cond_2

    goto :goto_4

    .line 345
    :cond_2
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_3
    :goto_4
    const/16 v6, 0x5f

    .line 343
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 348
    :cond_4
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 349
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_6

    :cond_5
    move-object v4, v0

    .line 352
    :goto_6
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, ".zip"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 353
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 72
    :cond_6
    invoke-direct {v2, p0, v4, v1}, Ll/֨ᩴۢ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 74
    invoke-static {v2}, Ll/ۧᩴۢ;->֫(Ll/֨ᩴۢ;)Ll/ۨۘۢ;

    return-object v2

    .line 62
    :cond_7
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 62
    throw p0
.end method

.method public static ֫(Ll/֨ᩴۢ;)Ll/ۨۘۢ;
    .locals 8

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 146
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 147
    iget-object v2, p0, Ll/֨ᩴۢ;->ܽ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 148
    iget-object v4, p0, Ll/֨ᩴۢ;->ۧ:Ljava/lang/String;

    const-string v5, "/"

    .line 304
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 305
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v6, 0x1

    if-le v4, v6, :cond_0

    .line 308
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    .line 306
    :cond_0
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 306
    throw p0

    .line 310
    :cond_1
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 312
    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    if-le v6, v7, :cond_8

    .line 315
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 317
    :goto_2
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_7

    .line 320
    invoke-static {v4}, Ll/ۧᩴۢ;->ܽ(Ljava/lang/String;)V

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/String;

    .line 149
    invoke-static {v3, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 160
    invoke-static {v4}, Ll/ۧᩴۢ;->ܽ(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v6

    if-nez v6, :cond_6

    .line 165
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 177
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_4
    :goto_3
    move-object v5, v4

    .line 171
    :goto_4
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 167
    new-instance v5, Ll/ܰۘۢ;

    invoke-direct {v5, v3, v4}, Ll/ܰۘۢ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 172
    :cond_5
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 172
    throw p0

    .line 163
    :cond_6
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 163
    throw p0

    .line 318
    :cond_7
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 318
    throw p0

    .line 313
    :cond_8
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 313
    throw p0

    .line 152
    :cond_9
    new-instance v1, Ll/ۨۘۢ;

    iget-object p0, p0, Ll/֨ᩴۢ;->֫:Ljava/lang/String;

    invoke-direct {v1, p0, v0}, Ll/ۨۘۢ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v1
.end method

.method public static ֫(Ljava/util/zip/ZipOutputStream;Ljava/util/HashSet;Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 6

    .line 275
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    const-string v1, "Archive stream interrupted"

    if-nez v0, :cond_b

    .line 209
    invoke-static {p3}, Ll/ۧᩴۢ;->ܽ(Ljava/lang/String;)V

    .line 210
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_a

    .line 214
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_4

    const-string v0, "/"

    .line 177
    invoke-virtual {p3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 216
    :goto_0
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    .line 171
    invoke-virtual {p1, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 241
    new-instance v4, Ljava/util/zip/ZipEntry;

    invoke-direct {v4, p3}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    cmp-long v5, v0, v2

    if-lez v5, :cond_1

    .line 243
    invoke-virtual {v4, v0, v1}, Ljava/util/zip/ZipEntry;->setTime(J)V

    .line 245
    :cond_1
    invoke-virtual {p0, v4}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 217
    invoke-virtual {p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 218
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 219
    new-instance p2, Ll/۟᩵ܿ;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Ll/۟᩵ܿ;-><init>(I)V

    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-static {p2, v1}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p2

    new-instance v1, Ll/۟᩵ܿ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/۟᩵ܿ;-><init>(I)V

    invoke-static {p2, v1}, Ll/ܶ۬ᩴ;->thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p2

    invoke-static {v0, p2}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 220
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 0
    invoke-static {p3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 221
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, v0, v1}, Ll/ۧᩴۢ;->֫(Ljava/util/zip/ZipOutputStream;Ljava/util/HashSet;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    return-void

    .line 172
    :cond_3
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 172
    throw p0

    .line 225
    :cond_4
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v4

    .line 171
    invoke-virtual {p1, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 241
    new-instance p1, Ljava/util/zip/ZipEntry;

    invoke-direct {p1, p3}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    cmp-long p3, v4, v2

    if-lez p3, :cond_5

    .line 243
    invoke-virtual {p1, v4, v5}, Ljava/util/zip/ZipEntry;->setTime(J)V

    .line 245
    :cond_5
    invoke-virtual {p0, p1}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 227
    :try_start_0
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 p2, 0x2000

    :try_start_1
    new-array p2, p2, [B

    .line 265
    :goto_2
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result p3

    const/4 v0, -0x1

    if-eq p3, v0, :cond_7

    .line 275
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_6

    const/4 v0, 0x0

    .line 267
    invoke-virtual {p0, p2, v0, p3}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_2

    .line 276
    :cond_6
    new-instance p2, Ljava/io/InterruptedIOException;

    invoke-direct {p2, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 229
    :cond_7
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 231
    invoke-virtual {p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_8

    .line 227
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 231
    invoke-virtual {p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 232
    throw p1

    .line 172
    :cond_9
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 172
    throw p0

    .line 212
    :cond_a
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 212
    throw p0

    .line 276
    :cond_b
    new-instance p0, Ljava/io/InterruptedIOException;

    invoke-direct {p0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۧᩴۢ;Ll/ۨۘۢ;Ljava/io/PipedOutputStream;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    .line 249
    :try_start_0
    new-instance v0, Ll/ۛۘۢ;

    .line 416
    invoke-direct {v0, p2}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/᩺ۘۢ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 p0, 0x1

    .line 185
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/util/zip/ZipOutputStream;->setLevel(I)V

    .line 186
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 187
    iget-object p1, p1, Ll/ۨۘۢ;->ۧ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۘۢ;

    .line 188
    iget-object v2, v1, Ll/ܰۘۢ;->ۧ:Ll/ܶ᩵ܿ;

    iget-object v1, v1, Ll/ܰۘۢ;->֫:Ljava/lang/String;

    invoke-static {v0, p0, v2, v1}, Ll/ۧᩴۢ;->֫(Ljava/util/zip/ZipOutputStream;Ljava/util/HashSet;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    goto :goto_0

    .line 191
    :cond_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ll/᩺ۘۢ; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    move-object p1, p0

    move-object p0, v0

    goto :goto_1

    :catch_0
    move-object p0, v0

    goto :goto_3

    :catchall_1
    move-exception p1

    .line 361
    :goto_1
    :try_start_2
    invoke-virtual {p2}, Ljava/io/PipedOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    nop

    :goto_2
    if-eqz p0, :cond_1

    .line 258
    invoke-static {p0}, Ll/ۛۘۢ;->֫(Ll/ۛۘۢ;)V

    .line 200
    :cond_1
    throw p1

    .line 361
    :catch_2
    :goto_3
    :try_start_3
    invoke-virtual {p2}, Ljava/io/PipedOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_4

    :catch_3
    nop

    :goto_4
    if-eqz p0, :cond_2

    .line 258
    invoke-static {p0}, Ll/ۛۘۢ;->֫(Ll/ۛۘۢ;)V

    :cond_2
    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 286
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const/16 v0, 0x5c

    const/16 v1, 0x2f

    .line 289
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    const-string v0, "/"

    .line 290
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 291
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 293
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 0
    invoke-static {v2, v1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-string v0, "\u0000"

    .line 296
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object p0

    .line 297
    :cond_2
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 297
    throw p0

    .line 287
    :cond_3
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 287
    throw p0
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 4

    .line 325
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "\\"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "//"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 328
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 329
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    .line 330
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "."

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".."

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 331
    :cond_0
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 331
    throw p0

    :cond_1
    return-void

    .line 326
    :cond_2
    new-instance p0, Ll/᩺ۘۢ;

    .line 381
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 326
    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;Ll/ܶᩴۢ;)Ll/۠ܳܳ;
    .locals 5

    .line 94
    sget-object v0, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 95
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const p2, 0x7f120824

    new-array v0, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {p2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "range"

    .line 97
    invoke-static {p1, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "text/plain"

    const-string p2, ""

    .line 76
    sget-object v0, Ll/ۧᩴۢ;->ܽ:Ll/ۚܳܳ;

    invoke-static {v0, p1, p2}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    if-nez p2, :cond_2

    move-object v0, p1

    goto :goto_0

    .line 100
    :cond_2
    iget-object v0, p2, Ll/ܶᩴۢ;->֫:Ll/֨ᩴۢ;

    :goto_0
    const v2, 0x7f12080b

    if-nez v0, :cond_3

    .line 102
    sget-object p1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    new-array p2, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, p2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 107
    :cond_3
    :try_start_0
    invoke-static {v0}, Ll/ۧᩴۢ;->֫(Ll/֨ᩴۢ;)Ll/ۨۘۢ;

    move-result-object v0
    :try_end_0
    .catch Ll/᩺ۘۢ; {:try_start_0 .. :try_end_0} :catch_5

    .line 111
    iget-object v3, p0, Ll/ۧᩴۢ;->֫:Ll/᩺ᩴۢ;

    iget-object p2, p2, Ll/ܶᩴۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ll/᩺ᩴۢ;->ۧ(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 112
    sget-object p1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    new-array p2, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {v2, p2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 118
    :cond_4
    :try_start_1
    new-instance p2, Ljava/io/PipedInputStream;

    const/high16 v2, 0x40000

    invoke-direct {p2, v2}, Ljava/io/PipedInputStream;-><init>(I)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 119
    :try_start_2
    new-instance v2, Ljava/io/PipedOutputStream;

    invoke-direct {v2, p2}, Ljava/io/PipedOutputStream;-><init>(Ljava/io/PipedInputStream;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 121
    :try_start_3
    iget-object p1, p0, Ll/ۧᩴۢ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/۫ۘۢ;

    invoke-direct {v3, p0, v0, v2}, Ll/۫ۘۢ;-><init>(Ll/ۧᩴۢ;Ll/ۨۘۢ;Ljava/io/PipedOutputStream;)V

    invoke-interface {p1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 122
    sget-object p1, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    .line 90
    invoke-static {p1, p2}, Ll/ۙܳܳ;->֫(Ll/֨ܳܳ;Ljava/io/PipedInputStream;)Ll/۠ܳܳ;

    move-result-object p1

    const-string v3, "Content-Disposition"

    .line 123
    iget-object v0, v0, Ll/ۨۘۢ;->֫:Ljava/lang/String;

    const-string v4, "attachment"

    .line 124
    invoke-static {v0, v4}, Ll/ۧ᩵ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 123
    invoke-virtual {p1, v3, v0}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Referrer-Policy"

    const-string v3, "no-referrer"

    .line 125
    invoke-virtual {p1, v0, v3}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    :catch_0
    move-object p1, v2

    goto :goto_1

    :catch_1
    nop

    goto :goto_1

    :catch_2
    move-object p2, p1

    :goto_1
    if-nez p1, :cond_5

    goto :goto_2

    .line 361
    :cond_5
    :try_start_4
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_2

    :catch_3
    nop

    :goto_2
    if-nez p2, :cond_6

    goto :goto_3

    :cond_6
    :try_start_5
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 130
    :catch_4
    :goto_3
    sget-object p1, Ll/֨ܳܳ;->ܰ:Ll/֨ܳܳ;

    const p2, 0x7f12082e

    new-array v0, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {p2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 109
    :catch_5
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const p2, 0x7f12080c

    new-array v0, v1, [Ljava/lang/Object;

    .line 62
    invoke-static {p2, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۧᩴۢ;->ۧ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void
.end method
