.class public final Ll/ۖۛܳ;
.super Ll/ܰܺܳ;
.source "HAIH"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ljava/util/concurrent/atomic/AtomicLong;

.field public volatile ۙ:Ll/ܺۛܳ;

.field public ۛ:Ll/۬ۤܳ;

.field public ۤ:J

.field public ۨ:Z

.field public ۫:Ljava/util/Map;

.field public ۬:Ljava/util/List;

.field public final ᩶:Ll/ܶ᩵ܿ;

.field public ᩹:Lnet/sf/sevenzipjbinding/IInArchive;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Collection;)V
    .locals 2

    .line 74
    invoke-direct {p0}, Ll/ܰܺܳ;-><init>()V

    .line 58
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/ۖۛܳ;->ۗ:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 75
    invoke-static {p1, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    .line 137
    new-instance v1, Ll/ܺۛܳ;

    invoke-direct {v1, p1, p2, v0}, Ll/ܺۛܳ;-><init>(Ll/ܶ᩵ܿ;Ljava/util/Collection;Ljava/util/concurrent/atomic/AtomicLong;)V

    iput-object v1, p0, Ll/ۖۛܳ;->ۙ:Ll/ܺۛܳ;

    return-void
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/ۖۛܳ;
    .locals 5

    .line 98
    invoke-static {p0}, Ll/ۖۛܳ;->ۧ(Ll/۬ۜܽ;)Ll/ۖۛܳ;

    move-result-object v0

    .line 99
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p0, v1, v3

    if-nez p0, :cond_0

    return-object v0

    .line 100
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Trailing archive source files metadata"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۖۛܳ;Lnet/sf/sevenzipjbinding/IInArchive;Ll/ܺۛܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۖۛܳ;->֫(Lnet/sf/sevenzipjbinding/IInArchive;Ll/ܺۛܳ;)V

    return-void
.end method

.method private ֫(Lnet/sf/sevenzipjbinding/IInArchive;Ll/ܺۛܳ;)V
    .locals 7

    .line 207
    invoke-interface {p1}, Lnet/sf/sevenzipjbinding/IInArchive;->getNumberOfItems()I

    move-result v0

    .line 208
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_0

    .line 211
    invoke-static {p1, v4}, Ll/ۘܳᩳ;->֫(Lnet/sf/sevenzipjbinding/IInArchive;I)Ll/ۘܳᩳ;

    move-result-object v5

    .line 212
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    invoke-virtual {v5}, Ll/ۘܳᩳ;->ܿ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 215
    :cond_0
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 216
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 217
    new-instance v5, Ll/۬ۤܳ;

    .line 11
    invoke-direct {v5, v1}, Ll/֨᩺ۡ;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 13
    sget-object v0, Lnet/sf/sevenzipjbinding/PropID;->SOLID:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {p1, v0}, Lnet/sf/sevenzipjbinding/IInArchive;->getArchiveProperty(Lnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v0

    .line 14
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    .line 219
    :cond_1
    iget-object v0, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    .line 221
    iget-object v6, p0, Ll/ۖۛܳ;->᩹:Lnet/sf/sevenzipjbinding/IInArchive;

    .line 222
    iput-object v4, p0, Ll/ۖۛܳ;->۬:Ljava/util/List;

    .line 223
    iput-object v2, p0, Ll/ۖۛܳ;->۫:Ljava/util/Map;

    .line 224
    iput-object v5, p0, Ll/ۖۛܳ;->ۛ:Ll/۬ۤܳ;

    .line 225
    iput-object p1, p0, Ll/ۖۛܳ;->᩹:Lnet/sf/sevenzipjbinding/IInArchive;

    .line 226
    iput-boolean v3, p0, Ll/ۖۛܳ;->ۨ:Z

    .line 227
    iput-wide v0, p0, Ll/ۖۛܳ;->ۤ:J

    if-eqz p2, :cond_2

    .line 229
    iput-object p2, p0, Ll/ۖۛܳ;->ۙ:Ll/ܺۛܳ;

    :cond_2
    if-eqz v6, :cond_3

    .line 232
    invoke-static {v6}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_3
    return-void
.end method

.method public static ۧ(Ll/۬ۜܽ;)Ll/ۖۛܳ;
    .locals 8

    .line 107
    new-instance v0, Ll/ۖۛܳ;

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    .line 68
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ll/ۖۛܳ;-><init>(Ljava/lang/String;Ljava/util/Collection;)V

    .line 108
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    .line 109
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 685
    iget-object v2, v0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ll/ۤܺܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    :cond_0
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v3, 0x4

    cmp-long v5, v1, v3

    if-ltz v5, :cond_4

    invoke-virtual {p0}, Ll/۬ۜܽ;->ܽ()I

    move-result v1

    const v2, 0x53465241

    if-ne v1, v2, :cond_4

    .line 114
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v3, 0x8

    const-string v5, "Truncated archive source files metadata"

    cmp-long v6, v1, v3

    if-ltz v6, :cond_3

    .line 117
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    .line 118
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    if-lez v1, :cond_2

    const/16 v2, 0x2710

    if-gt v1, v2, :cond_2

    .line 122
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    .line 125
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v6

    new-array v7, v3, [Ljava/lang/String;

    invoke-static {v6, v7}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    .line 128
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v5, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 137
    :cond_1
    new-instance p0, Ll/ܺۛܳ;

    iget-object v1, v0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    iget-object v3, v0, Ll/ۖۛܳ;->ۗ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p0, v1, v2, v3}, Ll/ܺۛܳ;-><init>(Ll/ܶ᩵ܿ;Ljava/util/Collection;Ljava/util/concurrent/atomic/AtomicLong;)V

    iput-object p0, v0, Ll/ۖۛܳ;->ۙ:Ll/ܺۛܳ;

    return-object v0

    .line 120
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid archive source file count: "

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 120
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 115
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 694
    iget-object v0, p0, Ll/ۖۛܳ;->᩹:Lnet/sf/sevenzipjbinding/IInArchive;

    if-eqz v0, :cond_0

    .line 695
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    const/4 v0, 0x0

    .line 696
    iput-object v0, p0, Ll/ۖۛܳ;->᩹:Lnet/sf/sevenzipjbinding/IInArchive;

    :cond_0
    return-void
.end method

.method public final getEntry(Ljava/lang/String;)Ll/ۘܳᩳ;
    .locals 2

    .line 575
    iget-object v0, p0, Ll/ۖۛܳ;->۫:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 579
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘܳᩳ;

    if-nez v0, :cond_1

    const-string v1, "/"

    .line 580
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 581
    iget-object v0, p0, Ll/ۖۛܳ;->ۛ:Ll/۬ۤܳ;

    invoke-virtual {v0, p1}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘܳᩳ;

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final ֡()Z
    .locals 1

    .line 681
    iget-object v0, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;
    .locals 9

    .line 239
    move-object v0, p2

    check-cast v0, Ll/ۤۤܳ;

    invoke-virtual {v0}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v4

    const-wide/32 v0, 0x100000

    .line 240
    invoke-interface {p2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p2, v0

    const/16 v0, 0x400

    if-ge p2, v0, :cond_0

    const/16 p2, 0x400

    .line 244
    :cond_0
    new-instance v0, Ll/ۢᩳ֡;

    int-to-long v1, p2

    invoke-direct {v0, v1, v2}, Ll/ۢᩳ֡;-><init>(J)V

    .line 245
    invoke-virtual {v0}, Ll/ۢᩳ֡;->֫()Ll/ۚᩳ֡;

    move-result-object p2

    invoke-static {p2}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object v6

    .line 252
    new-instance p2, Ll/ᩳۛܳ;

    .line 246
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 253
    sget-object v7, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v8, Ll/֫ۛܳ;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Ll/֫ۛܳ;-><init>(Ll/ۖۛܳ;Ll/ۗܺ᩷;Ll/ۘܳᩳ;Ll/ᩳۛܳ;Ll/ۤܽ֡;)V

    invoke-interface {v7, v8}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 301
    :cond_1
    iget-boolean p1, p2, Ll/ᩳۛܳ;->ᩳ:Z

    if-nez p1, :cond_4

    .line 302
    iget-object p1, p2, Ll/ᩳۛܳ;->ۧ:Ljava/io/IOException;

    if-nez p1, :cond_3

    .line 304
    iget-boolean p1, p2, Ll/ᩳۛܳ;->֫:Z

    if-eqz p1, :cond_2

    goto :goto_1

    .line 306
    :cond_2
    iget-boolean p1, p2, Ll/ᩳۛܳ;->ܽ:Z

    if-eqz p1, :cond_1

    goto :goto_0

    .line 303
    :cond_3
    throw p1

    .line 310
    :cond_4
    :goto_0
    iget-object p1, p2, Ll/ᩳۛܳ;->ۧ:Ljava/io/IOException;

    if-nez p1, :cond_6

    .line 312
    iget-boolean p1, p2, Ll/ᩳۛܳ;->֫:Z

    if-eqz p1, :cond_5

    :goto_1
    const/4 p1, 0x0

    return-object p1

    .line 315
    :cond_5
    invoke-virtual {v0}, Ll/ۢᩳ֡;->ۧ()Ll/֨ᩳ֡;

    move-result-object p1

    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object p1

    invoke-interface {p1}, Ll/ۛܽ֡;->ۡܽ()Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 311
    :cond_6
    throw p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 2

    .line 523
    iget-object p2, p0, Ll/ۖۛܳ;->۫:Ljava/util/Map;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 524
    invoke-virtual {p0, p2}, Ll/ۖۛܳ;->֫(Z)V

    .line 526
    :cond_0
    sget-boolean p2, Ll/ۖܰۡ;->֫:Z

    if-eqz p2, :cond_1

    const-string p2, "/7z/"

    .line 0
    invoke-static {p1, p2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 529
    :cond_1
    iget-object p2, p0, Ll/ۖۛܳ;->ۛ:Ll/۬ۤܳ;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/֨᩺ۡ;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 530
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 531
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘܳᩳ;

    .line 532
    new-instance v1, Ll/ۤۤܳ;

    invoke-direct {v1, v0}, Ll/ۤۤܳ;-><init>(Ll/ۘܳᩳ;)V

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p2
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩳۜܳ;
    .locals 1

    .line 507
    iget-object v0, p0, Ll/ۖۛܳ;->۫:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 508
    invoke-virtual {p0, v0}, Ll/ۖۛܳ;->֫(Z)V

    :cond_0
    const/4 v0, 0x1

    .line 510
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۖۛܳ;->getEntry(Ljava/lang/String;)Ll/ۘܳᩳ;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 511
    :cond_1
    new-instance v0, Ll/ۤۤܳ;

    invoke-direct {v0, p1}, Ll/ۤۤܳ;-><init>(Ll/ۘܳᩳ;)V

    return-object v0
.end method

.method public final ֫(Ljava/security/MessageDigest;)V
    .locals 2

    const-string v0, "archive"

    .line 516
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 587
    iget-object v0, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 517
    invoke-static {p1, v0}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 518
    iget-wide v0, p0, Ll/ۖۛܳ;->ۤ:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final ֫(Ljava/util/Set;Ll/᩺ܺܳ;)V
    .locals 5

    .line 321
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 322
    new-instance v1, Ll/ۙۜᩴ;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ll/ۙۜᩴ;-><init>(I)V

    .line 323
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 324
    move-object v3, v2

    check-cast v3, Ll/ۤۤܳ;

    invoke-virtual {v3}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v3

    .line 325
    invoke-virtual {v3}, Ll/ۘܳᩳ;->ۢ()Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v3, 0x0

    .line 327
    :try_start_0
    invoke-interface {p2, v2, v3}, Ll/᩺ܺܳ;->֫(Ll/ᩳۜܳ;Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 330
    instance-of v3, v2, Ljava/io/IOException;

    if-eqz v3, :cond_1

    check-cast v2, Ljava/io/IOException;

    goto :goto_1

    .line 333
    :cond_1
    new-instance v3, Ljava/io/IOException;

    invoke-direct {v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    move-object v2, v3

    .line 335
    :goto_1
    invoke-interface {p2, v2}, Ll/᩺ܺܳ;->֫(Ljava/io/IOException;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 340
    :cond_2
    invoke-virtual {v3}, Ll/ۘܳᩳ;->ܽ()I

    move-result v3

    invoke-virtual {v1, v3, v2}, Ll/ۙۜᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 343
    :cond_3
    new-instance p1, Ll/᩷ۛܳ;

    invoke-direct {p1, p0, v1, v0, p2}, Ll/᩷ۛܳ;-><init>(Ll/ۖۛܳ;Ll/ۙۜᩴ;Ljava/util/concurrent/ExecutorService;Ll/᩺ܺܳ;)V

    .line 448
    invoke-virtual {p1}, Ll/᩷ۛܳ;->run()V

    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ۗ᩻ܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 453
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/ۖۛܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ۗ᩻ܳ;Z)V

    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;Ll/ۗ᩻ܳ;Z)V
    .locals 1

    .line 459
    check-cast p2, Ll/ۤۤܳ;

    invoke-virtual {p2}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object p2

    .line 460
    invoke-virtual {p2}, Ll/ۘܳᩳ;->ܽ()I

    move-result p2

    new-instance v0, Ll/ۢۛܳ;

    invoke-direct {v0, p0, p4, p3}, Ll/ۢۛܳ;-><init>(Ll/ۖۛܳ;ZLl/ۗ᩻ܳ;)V

    .line 40
    filled-new-array {p2}, [I

    move-result-object p2

    invoke-static {p1, p2, v0}, Ll/ᩳ᩻ᩳ;->֫(Ll/ۗܺ᩷;[ILl/ܰܳᩳ;)V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    .line 606
    iget-object v0, p0, Ll/ۖۛܳ;->ۙ:Ll/ܺۛܳ;

    invoke-static {v0}, Ll/ܺۛܳ;->֫(Ll/ܺۛܳ;)Ljava/util/List;

    move-result-object v0

    .line 587
    iget-object v1, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    .line 87
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 689
    iget-object v1, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۤܺܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    const v1, 0x53465241

    .line 89
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 90
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 91
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡۛܳ;

    .line 92
    invoke-virtual {v1}, Ll/ۡۛܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ۖۛܳ;->ۙ:Ll/ܺۛܳ;

    invoke-static {v0, p1}, Ll/ܺۛܳ;->֫(Ll/ܺۛܳ;Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public final ֫(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 1

    const/4 v0, 0x0

    .line 202
    invoke-direct {p0, p1, v0}, Ll/ۖۛܳ;->֫(Lnet/sf/sevenzipjbinding/IInArchive;Ll/ܺۛܳ;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    .line 149
    new-instance p1, Ll/ܺۛܳ;

    .line 150
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iget-object v1, p0, Ll/ۖۛܳ;->ۗ:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v2, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    invoke-direct {p1, v2, v0, v1}, Ll/ܺۛܳ;-><init>(Ll/ܶ᩵ܿ;Ljava/util/Collection;Ljava/util/concurrent/atomic/AtomicLong;)V

    .line 151
    new-instance v0, Ll/ۧۛܳ;

    invoke-direct {v0, p1}, Ll/ۧۛܳ;-><init>(Ll/ܺۛܳ;)V

    .line 545
    invoke-static {v2, v0}, Ll/ۢ᩻ᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/util/function/Consumer;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    .line 154
    :try_start_0
    invoke-direct {p0, v0, p1}, Ll/ۖۛܳ;->֫(Lnet/sf/sevenzipjbinding/IInArchive;Ll/ܺۛܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 159
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 161
    throw p1
.end method

.method public final ֫(Ll/۠᩵ܳ;)Z
    .locals 4

    .line 166
    new-instance v0, Ll/ܺۛܳ;

    .line 167
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iget-object v2, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    iget-object v3, p0, Ll/ۖۛܳ;->ۗ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0, v2, v1, v3}, Ll/ܺۛܳ;-><init>(Ll/ܶ᩵ܿ;Ljava/util/Collection;Ljava/util/concurrent/atomic/AtomicLong;)V

    .line 168
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 169
    new-instance v3, Ll/ܽۛܳ;

    invoke-direct {v3, p0, v0, v1, p1}, Ll/ܽۛܳ;-><init>(Ll/ۖۛܳ;Ll/ܺۛܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/۠᩵ܳ;)V

    const/4 p1, 0x0

    invoke-static {p1, v2, v3}, Ll/ۢ᩻ᩳ;->֫(Lbin/mt/plus/Main;Ll/ܶ᩵ܿ;Ll/᩷᩻ᩳ;)V

    .line 198
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ۖ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 591
    iget-object v0, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ۘ()Ljava/util/List;
    .locals 1

    .line 606
    iget-object v0, p0, Ll/ۖۛܳ;->ۙ:Ll/ܺۛܳ;

    invoke-static {v0}, Ll/ܺۛܳ;->֫(Ll/ܺۛܳ;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 587
    iget-object v0, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-nez p1, :cond_0

    .line 559
    monitor-exit v0

    return-void

    .line 561
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/ۖۛܳ;->᩹:Lnet/sf/sevenzipjbinding/IInArchive;

    if-eqz v1, :cond_1

    if-eq v1, p1, :cond_2

    .line 563
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto :goto_0

    .line 566
    :cond_1
    iput-object p1, p0, Ll/ۖۛܳ;->᩹:Lnet/sf/sevenzipjbinding/IInArchive;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 568
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ܳ()Z
    .locals 1

    .line 666
    iget-object v0, p0, Ll/ۖۛܳ;->۫:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 668
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ۖۛܳ;->֫(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 673
    :catch_0
    :cond_0
    iget-boolean v0, p0, Ll/ۖۛܳ;->ۨ:Z

    return v0
.end method

.method public final ܶ()Z
    .locals 5

    .line 677
    iget-wide v0, p0, Ll/ۖۛܳ;->ۤ:J

    iget-object v2, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

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

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const-string v0, "archive"

    return-object v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 596
    iget-object v0, p0, Ll/ۖۛܳ;->ۙ:Ll/ܺۛܳ;

    invoke-static {v0}, Ll/ܺۛܳ;->ۧ(Ll/ܺۛܳ;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()J
    .locals 2

    .line 601
    iget-object v0, p0, Ll/ۖۛܳ;->ۙ:Ll/ܺۛܳ;

    invoke-static {v0}, Ll/ܺۛܳ;->ܽ(Ll/ܺۛܳ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩶ۧ()Ljava/util/List;
    .locals 1

    .line 571
    iget-object v0, p0, Ll/ۖۛܳ;->۬:Ljava/util/List;

    return-object v0
.end method

.method public final ᩸()Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 2

    .line 539
    iget-object v0, p0, Ll/ۖۛܳ;->ۙ:Ll/ܺۛܳ;

    .line 540
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/ۧۛܳ;

    invoke-direct {v1, v0}, Ll/ۧۛܳ;-><init>(Ll/ܺۛܳ;)V

    .line 545
    iget-object v0, p0, Ll/ۖۛܳ;->᩶:Ll/ܶ᩵ܿ;

    invoke-static {v0, v1}, Ll/ۢ᩻ᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/util/function/Consumer;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized ᩹()Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 549
    :try_start_0
    iget-object v1, p0, Ll/ۖۛܳ;->᩹:Lnet/sf/sevenzipjbinding/IInArchive;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 551
    iput-object v2, p0, Ll/ۖۛܳ;->᩹:Lnet/sf/sevenzipjbinding/IInArchive;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 552
    monitor-exit v0

    return-object v1

    .line 554
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ll/ۖۛܳ;->᩸()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
