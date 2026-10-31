.class public final Ll/᩺۫᩵;
.super Ll/۫۫᩵;
.source "1ALL"


# instance fields
.field public volatile synthetic size:I

.field public ۧ:[Ljava/lang/Object;

.field public final ܳ:Ll/ܰ۫᩵;

.field public final ܽ:I

.field public final ܿ:Ljava/util/concurrent/locks/ReentrantLock;

.field public ᩳ:I


# direct methods
.method public constructor <init>(ILl/ܰ۫᩵;)V
    .locals 2

    .line 517
    invoke-direct {p0}, Ll/ۛ۫᩵;-><init>()V

    .line 26
    iput p1, p0, Ll/᩺۫᩵;->ܽ:I

    .line 27
    iput-object p2, p0, Ll/᩺۫᩵;->ܳ:Ll/ܰ۫᩵;

    const/4 p2, 0x1

    if-lt p1, p2, :cond_0

    .line 36
    new-instance p2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p2, p0, Ll/᩺۫᩵;->ܿ:Ljava/util/concurrent/locks/ReentrantLock;

    const/16 p2, 0x8

    .line 42
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    new-array p2, p1, [Ljava/lang/Object;

    sget-object v0, Ll/ۤ۫᩵;->֫:Ll/ܶۛ᩵;

    const/4 v1, 0x0

    .line 1555
    invoke-static {p2, v1, p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 42
    iput-object p2, p0, Ll/᩺۫᩵;->ۧ:[Ljava/lang/Object;

    .line 45
    iput v1, p0, Ll/᩺۫᩵;->size:I

    return-void

    :cond_0
    const-string p2, "ArrayChannel capacity must be at least 1, but "

    const-string v0, " was specified"

    .line 0
    invoke-static {p1, p2, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 33
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final ֫(ILl/ܿܽܽ;)V
    .locals 7

    .line 150
    iget v0, p0, Ll/᩺۫᩵;->ܽ:I

    if-ge p1, v0, :cond_2

    .line 164
    iget-object v1, p0, Ll/᩺۫᩵;->ۧ:[Ljava/lang/Object;

    array-length v2, v1

    if-lt p1, v2, :cond_1

    .line 165
    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 166
    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_0

    .line 168
    iget-object v4, p0, Ll/᩺۫᩵;->ۧ:[Ljava/lang/Object;

    iget v5, p0, Ll/᩺۫᩵;->ᩳ:I

    add-int/2addr v5, v3

    array-length v6, v4

    rem-int/2addr v5, v6

    aget-object v4, v4, v5

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 170
    :cond_0
    sget-object v3, Ll/ۤ۫᩵;->֫:Ll/ܶۛ᩵;

    .line 1555
    invoke-static {v1, p1, v0, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 171
    iput-object v1, p0, Ll/᩺۫᩵;->ۧ:[Ljava/lang/Object;

    .line 172
    iput v2, p0, Ll/᩺۫᩵;->ᩳ:I

    .line 152
    :cond_1
    iget-object v0, p0, Ll/᩺۫᩵;->ۧ:[Ljava/lang/Object;

    iget v1, p0, Ll/᩺۫᩵;->ᩳ:I

    add-int/2addr v1, p1

    array-length p1, v0

    rem-int/2addr v1, p1

    aput-object p2, v0, v1

    return-void

    .line 156
    :cond_2
    iget-object v0, p0, Ll/᩺۫᩵;->ۧ:[Ljava/lang/Object;

    iget v1, p0, Ll/᩺۫᩵;->ᩳ:I

    array-length v2, v0

    rem-int v2, v1, v2

    const/4 v3, 0x0

    aput-object v3, v0, v2

    add-int/2addr p1, v1

    .line 157
    array-length v2, v0

    rem-int/2addr p1, v2

    aput-object p2, v0, p1

    add-int/lit8 v1, v1, 0x1

    .line 158
    array-length p1, v0

    rem-int/2addr v1, p1

    iput v1, p0, Ll/᩺۫᩵;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿܽܽ;)Ljava/lang/Object;
    .locals 6

    .line 57
    sget-object v0, Ll/ۤ۫᩵;->ܽ:Ll/ܶۛ᩵;

    .line 58
    iget-object v1, p0, Ll/᩺۫᩵;->ܿ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 17
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 59
    :try_start_0
    iget v2, p0, Ll/᩺۫᩵;->size:I

    .line 60
    invoke-virtual {p0}, Ll/ۛ۫᩵;->ۧ()Ll/ᩳۤ᩵;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v3

    .line 136
    :cond_0
    :try_start_1
    iget v3, p0, Ll/᩺۫᩵;->ܽ:I

    const/4 v4, 0x0

    if-ge v2, v3, :cond_1

    add-int/lit8 v3, v2, 0x1

    .line 137
    iput v3, p0, Ll/᩺۫᩵;->size:I

    goto :goto_0

    .line 141
    :cond_1
    iget-object v3, p0, Ll/᩺۫᩵;->ܳ:Ll/ܰ۫᩵;

    sget-object v5, Ll/ۨ۫᩵;->֫:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    const/4 v5, 0x1

    if-eq v3, v5, :cond_4

    const/4 v5, 0x2

    if-eq v3, v5, :cond_3

    const/4 v5, 0x3

    if-ne v3, v5, :cond_2

    goto :goto_0

    .line 144
    :cond_2
    new-instance p1, Ll/ۡ۠᩵;

    .line 9
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 144
    throw p1

    :cond_3
    move-object v4, v0

    goto :goto_0

    .line 142
    :cond_4
    sget-object v4, Ll/ۤ۫᩵;->ۧ:Ll/ܶۛ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v4, :cond_5

    .line 62
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v4

    :cond_5
    if-nez v2, :cond_9

    .line 66
    :cond_6
    :try_start_2
    invoke-virtual {p0}, Ll/ۛ۫᩵;->ᩳ()Ll/ۜۤ᩵;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_1

    .line 67
    :cond_7
    instance-of v4, v3, Ll/ᩳۤ᩵;

    if-eqz v4, :cond_8

    .line 68
    iput v2, p0, Ll/᩺۫᩵;->size:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v3

    .line 71
    :cond_8
    :try_start_3
    invoke-interface {v3, p1}, Ll/ۜۤ᩵;->ۧ(Ll/ܿܽܽ;)Ll/ܶۛ᩵;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 74
    iput v2, p0, Ll/᩺۫᩵;->size:I

    .line 80
    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 83
    invoke-interface {v3, p1}, Ll/ۜۤ᩵;->֫(Ll/ܿܽܽ;)V

    .line 84
    invoke-interface {v3}, Ll/ۜۤ᩵;->ۧ()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 79
    :cond_9
    :goto_1
    :try_start_4
    invoke-direct {p0, v2, p1}, Ll/᩺۫᩵;->֫(ILl/ܿܽܽ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 80
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "(buffer:capacity="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩺۫᩵;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩺۫᩵;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩻ۤ᩵;)Z
    .locals 1

    .line 17
    iget-object v0, p0, Ll/᩺۫᩵;->ܿ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 278
    :try_start_0
    invoke-super {p0, p1}, Ll/۫۫᩵;->֫(Ll/᩻ۤ᩵;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ljava/lang/Object;
    .locals 8

    .line 178
    sget-object v0, Ll/ۤ۫᩵;->ᩳ:Ll/ܶۛ᩵;

    .line 181
    iget-object v1, p0, Ll/᩺۫᩵;->ܿ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 17
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 182
    :try_start_0
    iget v2, p0, Ll/᩺۫᩵;->size:I

    if-nez v2, :cond_1

    .line 183
    invoke-virtual {p0}, Ll/ۛ۫᩵;->ۧ()Ll/ᩳۤ᩵;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v0

    .line 185
    :cond_1
    :try_start_1
    iget-object v3, p0, Ll/᩺۫᩵;->ۧ:[Ljava/lang/Object;

    iget v4, p0, Ll/᩺۫᩵;->ᩳ:I

    aget-object v5, v3, v4

    const/4 v6, 0x0

    .line 186
    aput-object v6, v3, v4

    add-int/lit8 v3, v2, -0x1

    .line 187
    iput v3, p0, Ll/᩺۫᩵;->size:I

    .line 190
    iget v3, p0, Ll/᩺۫᩵;->ܽ:I

    const/4 v4, 0x0

    if-ne v2, v3, :cond_3

    .line 192
    invoke-virtual {p0}, Ll/ۛ۫᩵;->ܿ()Ll/᩷ۤ᩵;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_1

    .line 197
    :cond_2
    invoke-virtual {v3}, Ll/᩷ۤ᩵;->ۘ()Ljava/lang/Object;

    move-result-object v4

    const/4 v6, 0x1

    goto :goto_2

    :cond_3
    :goto_1
    move-object v4, v0

    move-object v3, v6

    const/4 v6, 0x0

    :goto_2
    if-eq v4, v0, :cond_4

    .line 204
    instance-of v0, v4, Ll/ᩳۤ᩵;

    if-nez v0, :cond_4

    .line 205
    iput v2, p0, Ll/᩺۫᩵;->size:I

    .line 206
    iget-object v0, p0, Ll/᩺۫᩵;->ۧ:[Ljava/lang/Object;

    iget v7, p0, Ll/᩺۫᩵;->ᩳ:I

    add-int/2addr v7, v2

    array-length v2, v0

    rem-int/2addr v7, v2

    aput-object v4, v0, v7

    .line 208
    :cond_4
    iget v0, p0, Ll/᩺۫᩵;->ᩳ:I

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Ll/᩺۫᩵;->ۧ:[Ljava/lang/Object;

    array-length v2, v2

    rem-int/2addr v0, v2

    iput v0, p0, Ll/᩺۫᩵;->ᩳ:I

    .line 209
    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    if-eqz v6, :cond_5

    .line 212
    invoke-static {v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    :cond_5
    return-object v5

    :catchall_0
    move-exception v0

    .line 209
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 48
    iget v0, p0, Ll/᩺۫᩵;->size:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
