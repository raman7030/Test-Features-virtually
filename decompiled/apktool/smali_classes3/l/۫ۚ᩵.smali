.class public final Ll/۫ۚ᩵;
.super Ljava/lang/Object;
.source "Y9WI"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ۟:Ll/֫᩻֨;


# instance fields
.field public final ۗ:[B

.field public final ۙ:I

.field public ۛ:Ll/ۘ֨᩵;

.field public final ۤ:I

.field public final ۨ:J

.field public ۫:Z

.field public final ۬:I

.field public final ܰ:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ᩶:Ll/֨ۡ᩵;

.field public final ᩸:I

.field public final ᩹:I

.field public final ᩺:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    const-class v0, Ll/۫ۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/۫ۚ᩵;->۟:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;ILl/ۘ֨᩵;Ljava/lang/String;IIIIJ)V
    .locals 2

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p9, 0x1

    .line 46
    iput-boolean p9, p0, Ll/۫ۚ᩵;->۫:Z

    .line 50
    new-instance p9, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x1

    invoke-direct {p9, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p9, p0, Ll/۫ۚ᩵;->ܰ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 108
    iput-object p1, p0, Ll/۫ۚ᩵;->᩶:Ll/֨ۡ᩵;

    .line 109
    iput p2, p0, Ll/۫ۚ᩵;->ۙ:I

    const/4 p2, 0x0

    .line 111
    iput-object p2, p0, Ll/۫ۚ᩵;->ۗ:[B

    .line 112
    iput-object p4, p0, Ll/۫ۚ᩵;->᩺:Ljava/lang/String;

    .line 113
    iput p5, p0, Ll/۫ۚ᩵;->۬:I

    .line 114
    iput p6, p0, Ll/۫ۚ᩵;->᩸:I

    .line 115
    iput p7, p0, Ll/۫ۚ᩵;->᩹:I

    .line 116
    iput p8, p0, Ll/۫ۚ᩵;->ۤ:I

    .line 117
    invoke-virtual {p3}, Ll/ۘ֨᩵;->֫()V

    iput-object p3, p0, Ll/۫ۚ᩵;->ۛ:Ll/ۘ֨᩵;

    .line 118
    invoke-virtual {p3}, Ll/ۘ֨᩵;->᩵()J

    move-result-wide p2

    iput-wide p2, p0, Ll/۫ۚ᩵;->ۨ:J

    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;[BLl/ۘ֨᩵;Ljava/lang/String;IIJ)V
    .locals 2

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p7, 0x1

    .line 46
    iput-boolean p7, p0, Ll/۫ۚ᩵;->۫:Z

    .line 50
    new-instance p7, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x1

    invoke-direct {p7, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p7, p0, Ll/۫ۚ᩵;->ܰ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 75
    iput-object p1, p0, Ll/۫ۚ᩵;->᩶:Ll/֨ۡ᩵;

    .line 76
    iput-object p2, p0, Ll/۫ۚ᩵;->ۗ:[B

    const/4 p2, 0x0

    .line 78
    iput p2, p0, Ll/۫ۚ᩵;->ۙ:I

    .line 79
    iput-object p4, p0, Ll/۫ۚ᩵;->᩺:Ljava/lang/String;

    .line 80
    iput p5, p0, Ll/۫ۚ᩵;->۬:I

    .line 81
    iput p6, p0, Ll/۫ۚ᩵;->᩸:I

    .line 82
    iput p2, p0, Ll/۫ۚ᩵;->᩹:I

    .line 83
    iput p2, p0, Ll/۫ۚ᩵;->ۤ:I

    .line 84
    invoke-virtual {p3}, Ll/ۘ֨᩵;->֫()V

    iput-object p3, p0, Ll/۫ۚ᩵;->ۛ:Ll/ۘ֨᩵;

    .line 85
    invoke-virtual {p3}, Ll/ۘ֨᩵;->᩵()J

    move-result-wide p2

    iput-wide p2, p0, Ll/۫ۚ᩵;->ۨ:J

    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 227
    invoke-virtual {p0}, Ll/۫ۚ᩵;->ۘ()V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 324
    instance-of v0, p1, Ll/۫ۚ᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 327
    :cond_0
    check-cast p1, Ll/۫ۚ᩵;

    iget-wide v2, p1, Ll/۫ۚ᩵;->ۨ:J

    const/4 v0, 0x1

    .line 329
    iget-wide v4, p0, Ll/۫ۚ᩵;->ۨ:J

    iget-object v6, p0, Ll/۫ۚ᩵;->ۗ:[B

    if-eqz v6, :cond_2

    .line 330
    iget-object p1, p1, Ll/۫ۚ᩵;->ۗ:[B

    invoke-static {v6, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    cmp-long p1, v4, v2

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v1

    .line 332
    :cond_2
    iget v6, p0, Ll/۫ۚ᩵;->ۙ:I

    iget p1, p1, Ll/۫ۚ᩵;->ۙ:I

    if-ne v6, p1, :cond_3

    cmp-long p1, v4, v2

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public final finalize()V
    .locals 5

    .line 255
    iget-object v0, p0, Ll/۫ۚ᩵;->ܰ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-boolean v0, p0, Ll/۫ۚ᩵;->۫:Z

    if-eqz v0, :cond_0

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "File handle was not properly closed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۫ۚ᩵;->۟:Ll/֫᩻֨;

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 6

    .line 310
    iget-wide v0, p0, Ll/۫ۚ᩵;->ۨ:J

    const-wide/16 v2, 0x3

    iget-object v4, p0, Ll/۫ۚ᩵;->ۗ:[B

    if-eqz v4, :cond_0

    .line 311
    invoke-static {v4}, Ljava/util/Arrays;->hashCode([B)I

    move-result v4

    goto :goto_0

    .line 313
    :cond_0
    iget v4, p0, Ll/۫ۚ᩵;->ۙ:I

    :goto_0
    int-to-long v4, v4

    mul-long v0, v0, v2

    add-long/2addr v0, v4

    long-to-int v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    .line 294
    iget-object v1, p0, Ll/۫ۚ᩵;->ۗ:[B

    if-eqz v1, :cond_0

    .line 86
    array-length v2, v1

    invoke-static {v1, v0, v2}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 294
    :cond_0
    iget v1, p0, Ll/۫ۚ᩵;->ۙ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    iget-wide v2, p0, Ll/۫ۚ᩵;->ۨ:J

    .line 295
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget v3, p0, Ll/۫ۚ᩵;->۬:I

    .line 296
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Ll/۫ۚ᩵;->᩸:I

    .line 297
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Ll/۫ۚ᩵;->᩹:I

    .line 298
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget v6, p0, Ll/۫ۚ᩵;->ۤ:I

    .line 299
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x7

    new-array v7, v7, [Ljava/lang/Object;

    iget-object v8, p0, Ll/۫ۚ᩵;->᩺:Ljava/lang/String;

    aput-object v8, v7, v0

    const/4 v0, 0x1

    aput-object v1, v7, v0

    const/4 v0, 0x2

    aput-object v2, v7, v0

    const/4 v0, 0x3

    aput-object v3, v7, v0

    const/4 v0, 0x4

    aput-object v4, v7, v0

    const/4 v0, 0x5

    aput-object v5, v7, v0

    const/4 v0, 0x6

    aput-object v6, v7, v0

    const-string v0, "FileHandle %s [fid=%s,tree=%d,flags=%x,access=%x,attrs=%x,options=%x]"

    .line 291
    invoke-static {v0, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 4

    .line 268
    iget-object v0, p0, Ll/۫ۚ᩵;->ܰ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    .line 269
    sget-object v2, Ll/۫ۚ᩵;->۟:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 270
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v1, v3

    const/4 v3, 0x1

    aput-object v0, v1, v3

    const-string v0, "Acquire %s (%d)"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ۖ()V
    .locals 1

    const/4 v0, 0x0

    .line 280
    iput-boolean v0, p0, Ll/۫ۚ᩵;->۫:Z

    return-void
.end method

.method public final declared-synchronized ۘ()V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 239
    :try_start_0
    iget-object v1, p0, Ll/۫ۚ᩵;->ܰ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 241
    invoke-virtual {p0}, Ll/۫ۚ᩵;->ܽ()V

    goto :goto_0

    .line 242
    :cond_0
    sget-object v3, Ll/۫ۚ᩵;->۟:Ll/֫᩻֨;

    invoke-interface {v3}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "Release %s (%d)"

    .line 243
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p0, v2, v5

    const/4 v5, 0x1

    aput-object v1, v2, v5

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۜ()Z
    .locals 5

    .line 175
    iget-boolean v0, p0, Ll/۫ۚ᩵;->۫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۫ۚ᩵;->ۛ:Ll/ۘ֨᩵;

    invoke-virtual {v0}, Ll/ۘ֨᩵;->᩵()J

    move-result-wide v0

    iget-wide v2, p0, Ll/۫ۚ᩵;->ۨ:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/۫ۚ᩵;->ۛ:Ll/ۘ֨᩵;

    invoke-virtual {v0}, Ll/ۘ֨᩵;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()[B
    .locals 2

    .line 141
    invoke-virtual {p0}, Ll/۫ۚ᩵;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Ll/۫ۚ᩵;->ۗ:[B

    return-object v0

    .line 142
    :cond_0
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Descriptor is no longer valid"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()V
    .locals 7

    const-string v0, "Closing file handle "

    .line 195
    iget-object v1, p0, Ll/۫ۚ᩵;->ۛ:Ll/ۘ֨᩵;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    .line 197
    :try_start_0
    invoke-virtual {p0}, Ll/۫ۚ᩵;->ۜ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 198
    sget-object v4, Ll/۫ۚ᩵;->۟:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->֫()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 199
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 202
    :cond_0
    invoke-virtual {v1}, Ll/ۘ֨᩵;->᩸()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x1

    iget-object v5, p0, Ll/۫ۚ᩵;->᩶:Ll/֨ۡ᩵;

    if-eqz v0, :cond_1

    .line 203
    :try_start_1
    new-instance v0, Ll/ܰᩴ᩵;

    iget-object v6, p0, Ll/۫ۚ᩵;->ۗ:[B

    invoke-direct {v0, v5, v6}, Ll/ܰᩴ᩵;-><init>(Ll/֨ۡ᩵;[B)V

    new-array v4, v4, [Ll/֡ۚ᩵;

    .line 204
    sget-object v5, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v5, v4, v2

    .line 115
    invoke-virtual {v1, v0, v3, v4}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    goto :goto_0

    .line 206
    :cond_1
    new-instance v0, Ll/֫ۘ᩵;

    iget v6, p0, Ll/۫ۚ᩵;->ۙ:I

    invoke-direct {v0, v5, v6}, Ll/֫ۘ᩵;-><init>(Ll/֨ۡ᩵;I)V

    new-instance v6, Ll/۟ۖ᩵;

    invoke-direct {v6, v5}, Ll/۟ۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v4, v4, [Ll/֡ۚ᩵;

    sget-object v5, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v5, v4, v2

    invoke-virtual {v1, v0, v6, v4}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 210
    iput-boolean v2, p0, Ll/۫ۚ᩵;->۫:Z

    .line 213
    invoke-virtual {v1}, Ll/ۘ֨᩵;->᩹()V

    .line 215
    iput-object v3, p0, Ll/۫ۚ᩵;->ۛ:Ll/ۘ֨᩵;

    .line 216
    throw v0

    .line 210
    :cond_2
    :goto_0
    iput-boolean v2, p0, Ll/۫ۚ᩵;->۫:Z

    if-eqz v1, :cond_3

    .line 213
    invoke-virtual {v1}, Ll/ۘ֨᩵;->᩹()V

    .line 215
    :cond_3
    iput-object v3, p0, Ll/۫ۚ᩵;->ۛ:Ll/ۘ֨᩵;

    return-void
.end method

.method public final ᩳ()I
    .locals 2

    .line 133
    invoke-virtual {p0}, Ll/۫ۚ᩵;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    iget v0, p0, Ll/۫ۚ᩵;->ۙ:I

    return v0

    .line 134
    :cond_0
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Descriptor is no longer valid"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()Ll/ۘ֨᩵;
    .locals 1

    .line 164
    iget-object v0, p0, Ll/۫ۚ᩵;->ۛ:Ll/ۘ֨᩵;

    invoke-virtual {v0}, Ll/ۘ֨᩵;->֫()V

    return-object v0
.end method
