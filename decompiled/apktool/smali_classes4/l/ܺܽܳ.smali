.class public final Ll/ܺܽܳ;
.super Ljava/lang/Object;
.source "R70I"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:J

.field public final ۙ:J

.field public final ۤ:Ll/ۡᩳܳ;

.field public final ۫:[Ll/ᩴܽܳ;

.field public final ۬:Ll/֡ᩳܳ;

.field public final ᩶:J

.field public final ᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩹:Ll/۫֫ܳ;


# direct methods
.method public constructor <init>(JJJLl/ۡᩳܳ;Ll/۫֫ܳ;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ܺܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    iput-wide p1, p0, Ll/ܺܽܳ;->ۗ:J

    .line 27
    iput-wide p3, p0, Ll/ܺܽܳ;->᩶:J

    .line 28
    iput-wide p5, p0, Ll/ܺܽܳ;->ۙ:J

    .line 29
    iput-object p7, p0, Ll/ܺܽܳ;->ۤ:Ll/ۡᩳܳ;

    .line 30
    iput-object p8, p0, Ll/ܺܽܳ;->᩹:Ll/۫֫ܳ;

    .line 31
    invoke-static {p7}, Ll/᩵ᩳܳ;->ۢ(Ll/ۡᩳܳ;)[Ll/ᩴܽܳ;

    move-result-object p1

    iput-object p1, p0, Ll/ܺܽܳ;->۫:[Ll/ᩴܽܳ;

    .line 32
    new-instance p1, Ll/֡ᩳܳ;

    invoke-direct {p1, p7}, Ll/֡ᩳܳ;-><init>(Ll/ۡᩳܳ;)V

    iput-object p1, p0, Ll/ܺܽܳ;->۬:Ll/֡ᩳܳ;

    return-void
.end method

.method public static ֫([Ll/ᩴܽܳ;)V
    .locals 4

    .line 138
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    .line 140
    :try_start_0
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    if-nez v1, :cond_0

    move-object v1, v3

    goto :goto_1

    .line 145
    :cond_0
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    return-void

    .line 150
    :cond_2
    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 124
    iget-object v2, p0, Ll/ܺܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 127
    :cond_0
    iget-object v0, p0, Ll/ܺܽܳ;->۫:[Ll/ᩴܽܳ;

    invoke-static {v0}, Ll/ܺܽܳ;->֫([Ll/ᩴܽܳ;)V

    return-void
.end method

.method public final length()I
    .locals 2

    .line 131
    iget-object v0, p0, Ll/ܺܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Ll/ܺܽܳ;->۬:Ll/֡ᩳܳ;

    invoke-virtual {v0}, Ll/֡ᩳܳ;->֫()I

    move-result v0

    return v0

    .line 132
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "HexSnapshot is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫([BILl/ܿۖ᩷;)I
    .locals 10

    .line 67
    invoke-virtual {p0}, Ll/ܺܽܳ;->ᩳ()V

    .line 68
    iget-object v0, p0, Ll/ܺܽܳ;->۬:Ll/֡ᩳܳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "pattern"

    .line 37
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    invoke-virtual {v0}, Ll/֡ᩳܳ;->֫()I

    move-result v1

    if-ltz p2, :cond_7

    if-gt p2, v1, :cond_7

    .line 42
    array-length v2, p1

    if-nez v2, :cond_0

    goto :goto_4

    .line 45
    :cond_0
    array-length v2, p1

    sub-int v3, v1, p2

    if-le v2, v3, :cond_1

    goto :goto_3

    .line 48
    :cond_1
    invoke-static {p3}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p3

    .line 49
    invoke-static {p1}, Ll/ۡܽܳ;->֫([B)[I

    move-result-object v2

    const/high16 v4, 0x10000

    .line 50
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    new-array v4, v3, [B

    const/4 v5, 0x0

    :goto_0
    if-ge p2, v1, :cond_6

    .line 54
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    sub-int v6, v1, p2

    .line 57
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 58
    invoke-virtual {v0, p2, v6, v4}, Ll/֡ᩳܳ;->֫(II[B)V

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_5

    .line 60
    aget-byte v8, v4, v7

    :goto_2
    if-lez v5, :cond_3

    .line 61
    aget-byte v9, p1, v5

    if-eq v9, v8, :cond_3

    add-int/lit8 v5, v5, -0x1

    .line 62
    aget v5, v2, v5

    goto :goto_2

    .line 64
    :cond_3
    aget-byte v9, p1, v5

    if-ne v9, v8, :cond_4

    add-int/lit8 v5, v5, 0x1

    .line 66
    array-length v8, p1

    if-ne v5, v8, :cond_4

    add-int/2addr p2, v7

    .line 67
    array-length p1, p1

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    add-int/2addr p2, v6

    goto :goto_0

    :cond_6
    :goto_3
    const/4 p2, -0x1

    .line 69
    :goto_4
    invoke-virtual {p0}, Ll/ܺܽܳ;->ᩳ()V

    return p2

    .line 40
    :cond_7
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p3, "fromIndex="

    .line 0
    invoke-static {p2, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()J
    .locals 2

    .line 36
    iget-wide v0, p0, Ll/ܺܽܳ;->ۙ:J

    return-wide v0
.end method

.method public final ֫(Ljava/io/OutputStream;I)V
    .locals 1

    .line 93
    invoke-virtual {p0}, Ll/ܺܽܳ;->ᩳ()V

    .line 94
    iget-object v0, p0, Ll/ܺܽܳ;->۬:Ll/֡ᩳܳ;

    invoke-virtual {v0, p1, p2}, Ll/֡ᩳܳ;->֫(Ljava/io/OutputStream;I)V

    .line 95
    invoke-virtual {p0}, Ll/ܺܽܳ;->ᩳ()V

    return-void
.end method

.method public final ۧ([BILl/ܿۖ᩷;)I
    .locals 10

    .line 80
    invoke-virtual {p0}, Ll/ܺܽܳ;->ᩳ()V

    .line 81
    iget-object v0, p0, Ll/ܺܽܳ;->۬:Ll/֡ᩳܳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "pattern"

    .line 84
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    invoke-virtual {v0}, Ll/֡ᩳܳ;->֫()I

    move-result v1

    if-gez p2, :cond_0

    goto/16 :goto_4

    .line 89
    :cond_0
    array-length v2, p1

    if-nez v2, :cond_1

    .line 90
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto/16 :goto_5

    .line 92
    :cond_1
    array-length v2, p1

    sub-int/2addr v1, v2

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-gez p2, :cond_2

    goto :goto_4

    .line 96
    :cond_2
    array-length v1, p1

    new-array v2, v1, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 97
    :goto_0
    array-length v5, p1

    if-ge v4, v5, :cond_3

    .line 98
    array-length v5, p1

    sub-int/2addr v5, v4

    add-int/lit8 v5, v5, -0x1

    aget-byte v5, p1, v5

    aput-byte v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 100
    :cond_3
    invoke-static {v2}, Ll/ۡܽܳ;->֫([B)[I

    move-result-object v4

    .line 101
    invoke-static {p3}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p3

    .line 102
    array-length v5, p1

    add-int/2addr v5, p2

    const/high16 v6, 0x10000

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    new-array v6, v5, [B

    .line 104
    array-length p1, p1

    add-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x1

    const/4 p1, 0x0

    :goto_1
    if-ltz p2, :cond_8

    .line 106
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_4

    :cond_4
    sub-int v7, p2, v5

    add-int/lit8 v7, v7, 0x1

    .line 109
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    sub-int/2addr p2, v7

    add-int/lit8 v8, p2, 0x1

    .line 111
    invoke-virtual {v0, v7, v8, v6}, Ll/֡ᩳܳ;->֫(II[B)V

    :goto_2
    if-ltz p2, :cond_7

    .line 113
    aget-byte v8, v6, p2

    :goto_3
    if-lez p1, :cond_5

    .line 114
    aget-byte v9, v2, p1

    if-eq v9, v8, :cond_5

    add-int/lit8 p1, p1, -0x1

    .line 115
    aget p1, v4, p1

    goto :goto_3

    .line 117
    :cond_5
    aget-byte v9, v2, p1

    if-ne v9, v8, :cond_6

    add-int/lit8 p1, p1, 0x1

    if-ne p1, v1, :cond_6

    add-int p1, v7, p2

    goto :goto_5

    :cond_6
    add-int/lit8 p2, p2, -0x1

    goto :goto_2

    :cond_7
    add-int/lit8 p2, v7, -0x1

    goto :goto_1

    :cond_8
    :goto_4
    const/4 p1, -0x1

    .line 82
    :goto_5
    invoke-virtual {p0}, Ll/ܺܽܳ;->ᩳ()V

    return p1
.end method

.method public final ܽ()V
    .locals 2

    .line 131
    iget-object v0, p0, Ll/ܺܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 132
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "HexSnapshot is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()V
    .locals 4

    .line 131
    iget-object v0, p0, Ll/ܺܽܳ;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    .line 115
    iget-object v0, p0, Ll/ܺܽܳ;->۫:[Ll/ᩴܽܳ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 116
    invoke-interface {v3}, Ll/ᩴܽܳ;->۫()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 117
    :cond_0
    new-instance v0, Ll/ۚᩳܳ;

    invoke-direct {v0}, Ll/ۚᩳܳ;-><init>()V

    throw v0

    :cond_1
    return-void

    .line 132
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "HexSnapshot is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
