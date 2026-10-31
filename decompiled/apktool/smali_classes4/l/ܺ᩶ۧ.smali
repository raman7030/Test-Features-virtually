.class public final Ll/ܺ᩶ۧ;
.super Ljava/lang/Object;
.source "D9O0"


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIJJ)V
    .locals 0

    .line 337
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 338
    iput p1, p0, Ll/ܺ᩶ۧ;->ᩳ:I

    .line 339
    iput p2, p0, Ll/ܺ᩶ۧ;->ܽ:I

    .line 340
    iput-wide p3, p0, Ll/ܺ᩶ۧ;->ۧ:J

    .line 341
    iput-wide p5, p0, Ll/ܺ᩶ۧ;->֫:J

    return-void
.end method

.method public static ۧ(Ljava/io/File;)Ll/ܺ᩶ۧ;
    .locals 9

    .line 376
    new-instance v0, Ljava/io/DataInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 377
    :try_start_0
    new-instance p0, Ll/ܺ᩶ۧ;

    .line 378
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    .line 379
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v4

    .line 380
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v5

    .line 381
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v7

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Ll/ܺ᩶ۧ;-><init>(IIJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 383
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 376
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 347
    instance-of v2, p1, Ll/ܺ᩶ۧ;

    if-nez v2, :cond_1

    goto :goto_0

    .line 348
    :cond_1
    check-cast p1, Ll/ܺ᩶ۧ;

    .line 349
    iget v2, p0, Ll/ܺ᩶ۧ;->ܽ:I

    iget v3, p1, Ll/ܺ᩶ۧ;->ܽ:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ll/ܺ᩶ۧ;->ۧ:J

    iget-wide v4, p1, Ll/ܺ᩶ۧ;->ۧ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Ll/ܺ᩶ۧ;->ᩳ:I

    iget v3, p1, Ll/ܺ᩶ۧ;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ll/ܺ᩶ۧ;->֫:J

    iget-wide v4, p1, Ll/ܺ᩶ۧ;->֫:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 357
    iget v0, p0, Ll/ܺ᩶ۧ;->ܽ:I

    .line 358
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-wide v1, p0, Ll/ܺ᩶ۧ;->ۧ:J

    .line 359
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget v2, p0, Ll/ܺ᩶ۧ;->ᩳ:I

    .line 360
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-wide v3, p0, Ll/ܺ᩶ۧ;->֫:J

    .line 361
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    .line 357
    invoke-static {v4}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/io/File;)V
    .locals 3

    .line 366
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 367
    new-instance v0, Ljava/io/DataOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 368
    :try_start_0
    iget p1, p0, Ll/ܺ᩶ۧ;->ᩳ:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 369
    iget p1, p0, Ll/ܺ᩶ۧ;->ܽ:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 370
    iget-wide v1, p0, Ll/ܺ᩶ۧ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 371
    iget-wide v1, p0, Ll/ܺ᩶ۧ;->֫:J

    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 372
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 367
    :try_start_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method
