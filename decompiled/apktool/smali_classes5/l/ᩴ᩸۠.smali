.class public final Ll/ᩴ᩸۠;
.super Ll/۫ܶ۠;
.source "143Z"


# static fields
.field public static ܳ:Ll/ۖܶ۠;


# instance fields
.field public ۧ:[B

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:[Ll/ۘ᩸۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩸۠;->ܳ:Ll/ۖܶ۠;

    return-void
.end method

.method public static declared-synchronized ֫(Ll/ۛܶ۠;)Ll/ᩴ᩸۠;
    .locals 3

    .line 2
    const-class v0, Ll/ᩴ᩸۠;

    .line 3
    monitor-enter v0

    .line 47
    :cond_0
    :try_start_0
    sget-object v1, Ll/ᩴ᩸۠;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 48
    sget-object v1, Ll/ᩴ᩸۠;->ܳ:Ll/ۖܶ۠;

    iget-object v1, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/SoftReference;

    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ᩸۠;

    .line 49
    sget-object v2, Ll/ᩴ᩸۠;->ܳ:Ll/ۖܶ۠;

    iget-object v2, v2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    sput-object v2, Ll/ᩴ᩸۠;->ܳ:Ll/ۖܶ۠;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 51
    monitor-exit v0

    return-object v1

    .line 54
    :cond_1
    :try_start_1
    new-instance v1, Ll/ᩴ᩸۠;

    .line 84
    invoke-direct {v1, p0}, Ll/۫ܶ۠;-><init>(Ll/ۛܶ۠;)V

    const/4 p0, 0x0

    .line 75
    iput p0, v1, Ll/ᩴ᩸۠;->ܿ:I

    const/16 p0, 0x7fff

    .line 85
    iput p0, v1, Ll/ᩴ᩸۠;->ܽ:I

    const p0, 0x8000

    new-array p0, p0, [Ll/ۘ᩸۠;

    .line 86
    iput-object p0, v1, Ll/ᩴ᩸۠;->ᩳ:[Ll/ۘ᩸۠;

    const/high16 p0, 0x20000

    new-array p0, p0, [B

    .line 87
    iput-object p0, v1, Ll/ᩴ᩸۠;->ۧ:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫(II[B)Ll/ۤܶ۠;
    .locals 5

    .line 123
    invoke-static {p1, p2, p3}, Ll/۫ܶ۠;->ۧ(II[B)I

    move-result v0

    iget v1, p0, Ll/ᩴ᩸۠;->ܽ:I

    and-int/2addr v0, v1

    .line 124
    iget-object v1, p0, Ll/ᩴ᩸۠;->ᩳ:[Ll/ۘ᩸۠;

    aget-object v2, v1, v0

    .line 125
    iget-object v3, p0, Ll/ᩴ᩸۠;->ۧ:[B

    :goto_0
    if-eqz v2, :cond_1

    .line 177
    iget v4, v2, Ll/ۘ᩸۠;->᩶:I

    if-ne v4, p2, :cond_0

    .line 127
    iget v4, v2, Ll/ۘ᩸۠;->᩹:I

    invoke-static {v4, v3, p1, p3, p2}, Ll/۫ܶ۠;->֫(I[BI[BI)Z

    move-result v4

    if-nez v4, :cond_1

    .line 128
    :cond_0
    iget-object v2, v2, Ll/ۘ᩸۠;->ۙ:Ll/ۘ᩸۠;

    goto :goto_0

    :cond_1
    if-nez v2, :cond_3

    .line 131
    iget v2, p0, Ll/ᩴ᩸۠;->ܿ:I

    add-int v4, v2, p2

    .line 132
    invoke-static {v4, v3}, Ll/ۛ᩸ۘ;->֫(I[B)[B

    move-result-object v3

    iput-object v3, p0, Ll/ᩴ᩸۠;->ۧ:[B

    .line 133
    invoke-static {p3, p1, v3, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 134
    new-instance p1, Ll/ۘ᩸۠;

    .line 167
    invoke-direct {p1, p0}, Ll/ۤܶ۠;-><init>(Ll/۫ܶ۠;)V

    .line 135
    iput v2, p1, Ll/ۘ᩸۠;->᩹:I

    .line 136
    iput p2, p1, Ll/ۘ᩸۠;->᩶:I

    .line 137
    aget-object p3, v1, v0

    iput-object p3, p1, Ll/ۘ᩸۠;->ۙ:Ll/ۘ᩸۠;

    .line 138
    aput-object p1, v1, v0

    .line 139
    iput v4, p0, Ll/ᩴ᩸۠;->ܿ:I

    if-nez p2, :cond_2

    add-int/lit8 v4, v4, 0x1

    .line 141
    iput v4, p0, Ll/ᩴ᩸۠;->ܿ:I

    :cond_2
    return-object p1

    :cond_3
    return-object v2
.end method

.method public final ֫([CI)Ll/ۤܶ۠;
    .locals 5

    .line 97
    iget v0, p0, Ll/ᩴ᩸۠;->ܿ:I

    .line 98
    iget-object v1, p0, Ll/ᩴ᩸۠;->ۧ:[B

    mul-int/lit8 v2, p2, 0x3

    add-int/2addr v2, v0

    invoke-static {v2, v1}, Ll/ۛ᩸ۘ;->֫(I[B)[B

    move-result-object v1

    iput-object v1, p0, Ll/ᩴ᩸۠;->ۧ:[B

    .line 99
    invoke-static {v1, v0, p2, p1}, Ll/۬֨۠;->֫([BII[C)I

    move-result p1

    sub-int/2addr p1, v0

    .line 100
    invoke-static {v0, p1, v1}, Ll/۫ܶ۠;->ۧ(II[B)I

    move-result p2

    iget v2, p0, Ll/ᩴ᩸۠;->ܽ:I

    and-int/2addr p2, v2

    .line 101
    iget-object v2, p0, Ll/ᩴ᩸۠;->ᩳ:[Ll/ۘ᩸۠;

    aget-object v3, v2, p2

    :goto_0
    if-eqz v3, :cond_1

    .line 177
    iget v4, v3, Ll/ۘ᩸۠;->᩶:I

    if-ne v4, p1, :cond_0

    .line 103
    iget v4, v3, Ll/ۘ᩸۠;->᩹:I

    .line 104
    invoke-static {v4, v1, v0, v1, p1}, Ll/۫ܶ۠;->֫(I[BI[BI)Z

    move-result v4

    if-nez v4, :cond_1

    .line 105
    :cond_0
    iget-object v3, v3, Ll/ۘ᩸۠;->ۙ:Ll/ۘ᩸۠;

    goto :goto_0

    :cond_1
    if-nez v3, :cond_3

    .line 108
    new-instance v1, Ll/ۘ᩸۠;

    .line 167
    invoke-direct {v1, p0}, Ll/ۤܶ۠;-><init>(Ll/۫ܶ۠;)V

    .line 109
    iput v0, v1, Ll/ۘ᩸۠;->᩹:I

    .line 110
    iput p1, v1, Ll/ۘ᩸۠;->᩶:I

    .line 111
    aget-object v3, v2, p2

    iput-object v3, v1, Ll/ۘ᩸۠;->ۙ:Ll/ۘ᩸۠;

    .line 112
    aput-object v1, v2, p2

    add-int/2addr v0, p1

    .line 113
    iput v0, p0, Ll/ᩴ᩸۠;->ܿ:I

    if-nez p1, :cond_2

    add-int/lit8 v0, v0, 0x1

    .line 115
    iput v0, p0, Ll/ᩴ᩸۠;->ܿ:I

    :cond_2
    return-object v1

    :cond_3
    return-object v3
.end method

.method public final ֫()V
    .locals 4

    .line 0
    const-class v0, Ll/ᩴ᩸۠;

    monitor-enter v0

    .line 58
    :try_start_0
    sget-object v1, Ll/ᩴ᩸۠;->ܳ:Ll/ۖܶ۠;

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v3, Ll/ۖܶ۠;

    invoke-direct {v3, v2, v1}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    .line 58
    sput-object v3, Ll/ᩴ᩸۠;->ܳ:Ll/ۖܶ۠;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
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
