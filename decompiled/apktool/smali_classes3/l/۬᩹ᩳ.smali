.class public Ll/۬᩹ᩳ;
.super Ljava/lang/Object;
.source "P6UO"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public volatile ᩸:Ll/ۨ᩹ᩳ;


# direct methods
.method public constructor <init>(Ll/ۨ᩹ᩳ;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iget-object v0, p1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩺ۧ()V

    .line 14
    :cond_0
    iput-object p1, p0, Ll/۬᩹ᩳ;->᩸:Ll/ۨ᩹ᩳ;

    return-void
.end method

.method public static ֫([CII)V
    .locals 0

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    .line 59
    array-length p0, p0

    sub-int/2addr p0, p1

    if-gt p2, p0, :cond_0

    return-void

    .line 60
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string p1, "Invalid destination range"

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public charAt(I)C
    .locals 2

    .line 33
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    if-ltz p1, :cond_0

    .line 34
    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 35
    invoke-virtual {v0, p1}, Ll/ۨ᩹ᩳ;->֫(I)C

    move-result p1

    return p1

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid character index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 3

    move-object v0, p0

    .line 103
    monitor-enter v0

    .line 104
    :try_start_0
    iget-object v1, p0, Ll/۬᩹ᩳ;->᩸:Ll/ۨ᩹ᩳ;

    const/4 v2, 0x0

    .line 105
    iput-object v2, p0, Ll/۬᩹ᩳ;->᩸:Ll/ۨ᩹ᩳ;

    .line 106
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 107
    iget-object v0, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 106
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getChars(II[CI)V
    .locals 4

    .line 49
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    invoke-static {p1, p2, v1}, Ll/ۨ᩹ᩳ;->֫(III)V

    sub-int/2addr p2, p1

    .line 51
    invoke-static {p3, p4, p2}, Ll/۬᩹ᩳ;->֫([CII)V

    .line 52
    new-instance v1, Ll/᩷᩹ᩳ;

    const/4 v2, 0x0

    .line 24
    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v3

    invoke-direct {v1, v0, v2, v3, p1}, Ll/᩷᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;III)V

    .line 53
    :try_start_0
    invoke-virtual {v1, p3, p4, p2}, Ll/᩷᩹ᩳ;->֫([CII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    invoke-virtual {v1}, Ll/᩷᩹ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 52
    :try_start_1
    invoke-virtual {v1}, Ll/᩷᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public length()I
    .locals 1

    .line 28
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    return v0
.end method

.method public bridge synthetic subSequence(II)Ljava/lang/CharSequence;
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Ll/۬᩹ᩳ;->subSequence(II)Ll/۬᩹ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public subSequence(II)Ll/۬᩹ᩳ;
    .locals 2

    .line 41
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    invoke-static {p1, p2, v1}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 43
    iget-object v1, v0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ll/ۧ᩹ᩳ;

    invoke-direct {v1, v0, p1, p2}, Ll/ۧ᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;II)V

    return-object v1

    .line 44
    :cond_0
    new-instance v1, Ll/۬᩹ᩳ;

    invoke-virtual {v0, p1, p2}, Ll/ۨ᩹ᩳ;->֫(II)Ll/ۨ᩹ᩳ;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/۬᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 92
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    new-array v2, v1, [C

    .line 94
    new-instance v3, Ll/᩷᩹ᩳ;

    .line 24
    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v4

    const/4 v5, 0x0

    invoke-direct {v3, v0, v5, v4, v5}, Ll/᩷᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;III)V

    .line 95
    :try_start_0
    invoke-virtual {v3, v2, v5, v1}, Ll/᩷᩹ᩳ;->֫([CII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    invoke-virtual {v3}, Ll/᩷᩹ᩳ;->close()V

    .line 97
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    return-object v0

    :catchall_0
    move-exception v0

    .line 94
    :try_start_1
    invoke-virtual {v3}, Ll/᩷᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
.end method

.method public ֫()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۧ(I)Ll/᩷᩹ᩳ;
    .locals 4

    .line 66
    new-instance v0, Ll/᩷᩹ᩳ;

    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v3

    invoke-direct {v0, v1, v2, v3, p1}, Ll/᩷᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;III)V

    return-object v0
.end method

.method public final ܳ()Ll/ۨ᩹ᩳ;
    .locals 2

    .line 19
    iget-object v0, p0, Ll/۬᩹ᩳ;->᩸:Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_0

    return-object v0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text handle is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(I)I
    .locals 7

    .line 77
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    invoke-static {p1, p1, v1}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 295
    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    if-nez p1, :cond_0

    goto :goto_4

    .line 296
    :cond_0
    iget v1, v0, Ll/᩶᩹ᩳ;->ۧ:I

    if-ne p1, v1, :cond_1

    iget p1, v0, Ll/᩶᩹ᩳ;->ܽ:I

    return p1

    :cond_1
    const/4 v1, 0x0

    .line 299
    :cond_2
    :goto_0
    instance-of v2, v0, Ll/᩻᩹ᩳ;

    if-eqz v2, :cond_6

    .line 301
    iget v2, v0, Ll/᩶᩹ᩳ;->ܽ:I

    if-nez v2, :cond_3

    goto :goto_3

    .line 302
    :cond_3
    move-object v2, v0

    check-cast v2, Ll/᩻᩹ᩳ;

    iget-object v2, v2, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    const/4 v3, 0x0

    .line 303
    :goto_1
    array-length v4, v2

    if-ge v3, v4, :cond_2

    .line 304
    aget-object v4, v2, v3

    .line 305
    iget v5, v4, Ll/᩶᩹ᩳ;->ۧ:I

    if-lt p1, v5, :cond_5

    array-length v6, v2

    add-int/lit8 v6, v6, -0x1

    if-ne v3, v6, :cond_4

    goto :goto_2

    :cond_4
    sub-int/2addr p1, v5

    .line 310
    iget v4, v4, Ll/᩶᩹ᩳ;->ܽ:I

    add-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    move-object v0, v4

    goto :goto_0

    .line 313
    :cond_6
    iget v2, v0, Ll/᩶᩹ᩳ;->ܽ:I

    if-nez v2, :cond_7

    :goto_3
    return v1

    :cond_7
    check-cast v0, Ll/᩸᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩹ᩳ;->ۧ(I)I

    move-result p1

    add-int/2addr v1, p1

    :cond_8
    :goto_4
    return v1
.end method

.method public final ᩳ(I)I
    .locals 7

    .line 84
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 85
    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget v2, v0, Ll/᩶᩹ᩳ;->ܽ:I

    :goto_0
    if-ltz p1, :cond_5

    if-gt p1, v2, :cond_5

    if-nez p1, :cond_1

    return v1

    :cond_1
    add-int/lit8 p1, p1, -0x1

    const/4 v1, 0x0

    .line 319
    :cond_2
    :goto_1
    instance-of v2, v0, Ll/᩻᩹ᩳ;

    if-eqz v2, :cond_4

    .line 320
    move-object v2, v0

    check-cast v2, Ll/᩻᩹ᩳ;

    iget-object v2, v2, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 321
    iget v6, v5, Ll/᩶᩹ᩳ;->ܽ:I

    if-ge p1, v6, :cond_3

    move-object v0, v5

    goto :goto_1

    :cond_3
    sub-int/2addr p1, v6

    .line 326
    iget v5, v5, Ll/᩶᩹ᩳ;->ۧ:I

    add-int/2addr v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 329
    :cond_4
    check-cast v0, Ll/᩸᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩹ᩳ;->ܽ(I)I

    move-result p1

    add-int/2addr v1, p1

    add-int/lit8 v1, v1, 0x1

    return v1

    .line 86
    :cond_5
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid line index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ()J
    .locals 4

    .line 71
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 72
    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, v0, Ll/᩶᩹ᩳ;->ܽ:I

    :goto_0
    int-to-long v0, v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    return-wide v0
.end method
