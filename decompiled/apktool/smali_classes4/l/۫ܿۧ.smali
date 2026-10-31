.class public final Ll/۫ܿۧ;
.super Ljava/lang/Object;
.source "T8NF"

# interfaces
.implements Ll/᩸ܿۧ;


# instance fields
.field public ֫:I

.field public ۧ:[Ll/۠ܿۧ;

.field public final ܳ:Z

.field public ܽ:I

.field public ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Ll/۫ܿۧ;->ܳ:Z

    const/high16 v0, 0x10000

    .line 70
    iput v0, p0, Ll/۫ܿۧ;->ᩳ:I

    const/4 v0, 0x0

    .line 71
    iput v0, p0, Ll/۫ܿۧ;->ܽ:I

    const/16 v0, 0x64

    new-array v0, v0, [Ll/۠ܿۧ;

    .line 72
    iput-object v0, p0, Ll/۫ܿۧ;->ۧ:[Ll/۠ܿۧ;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()Ll/۠ܿۧ;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 100
    :try_start_0
    iget v1, p0, Ll/۫ܿۧ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۫ܿۧ;->֫:I

    .line 102
    iget v2, p0, Ll/۫ܿۧ;->ܽ:I

    if-lez v2, :cond_0

    .line 103
    iget-object v1, p0, Ll/۫ܿۧ;->ۧ:[Ll/۠ܿۧ;

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/۫ܿۧ;->ܽ:I

    aget-object v1, v1, v2

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    iget-object v2, p0, Ll/۫ܿۧ;->ۧ:[Ll/۠ܿۧ;

    iget v3, p0, Ll/۫ܿۧ;->ܽ:I

    const/4 v4, 0x0

    aput-object v4, v2, v3

    goto :goto_0

    .line 106
    :cond_0
    new-instance v2, Ll/۠ܿۧ;

    iget v3, p0, Ll/۫ܿۧ;->ᩳ:I

    new-array v3, v3, [B

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Ll/۠ܿۧ;-><init>([BI)V

    .line 107
    iget-object v3, p0, Ll/۫ܿۧ;->ۧ:[Ll/۠ܿۧ;

    array-length v4, v3

    if-le v1, v4, :cond_1

    .line 111
    array-length v1, v3

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/۠ܿۧ;

    iput-object v1, p0, Ll/۫ܿۧ;->ۧ:[Ll/۠ܿۧ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object v1, v2

    .line 114
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 91
    :try_start_0
    iget v1, p0, Ll/۫ܿۧ;->ܿ:I

    if-ge p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 92
    :goto_0
    iput p1, p0, Ll/۫ܿۧ;->ܿ:I

    if-eqz v1, :cond_1

    .line 94
    invoke-virtual {p0}, Ll/۫ܿۧ;->ܿ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    :cond_1
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

.method public final declared-synchronized ֫(Ll/۠ܿۧ;)V
    .locals 4

    move-object v0, p0

    monitor-enter v0

    .line 119
    :try_start_0
    iget-object v1, p0, Ll/۫ܿۧ;->ۧ:[Ll/۠ܿۧ;

    iget v2, p0, Ll/۫ܿۧ;->ܽ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/۫ܿۧ;->ܽ:I

    aput-object p1, v1, v2

    .line 120
    iget p1, p0, Ll/۫ܿۧ;->֫:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/۫ܿۧ;->֫:I

    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
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

.method public final declared-synchronized ֫(Ll/ܶܿۧ;)V
    .locals 4

    move-object v0, p0

    monitor-enter v0

    :goto_0
    if-eqz p1, :cond_0

    .line 128
    :try_start_0
    iget-object v1, p0, Ll/۫ܿۧ;->ۧ:[Ll/۠ܿۧ;

    iget v2, p0, Ll/۫ܿۧ;->ܽ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/۫ܿۧ;->ܽ:I

    invoke-interface {p1}, Ll/ܶܿۧ;->֫()Ll/۠ܿۧ;

    move-result-object v3

    aput-object v3, v1, v2

    .line 129
    iget v1, p0, Ll/۫ܿۧ;->֫:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/۫ܿۧ;->֫:I

    .line 130
    invoke-interface {p1}, Ll/ܶܿۧ;->next()Ll/ܶܿۧ;

    move-result-object p1

    goto :goto_0

    .line 133
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
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

.method public final ۧ()I
    .locals 1

    .line 185
    iget v0, p0, Ll/۫ܿۧ;->ᩳ:I

    return v0
.end method

.method public final declared-synchronized ܽ()I
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 180
    :try_start_0
    iget v1, p0, Ll/۫ܿۧ;->֫:I

    iget v2, p0, Ll/۫ܿۧ;->ᩳ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    mul-int v1, v1, v2

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

.method public final declared-synchronized ܿ()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 138
    :try_start_0
    iget v1, p0, Ll/۫ܿۧ;->ܿ:I

    iget v2, p0, Ll/۫ܿۧ;->ᩳ:I

    invoke-static {v1, v2}, Ll/ۘ֨֫;->֫(II)I

    move-result v1

    .line 139
    iget v2, p0, Ll/۫ܿۧ;->֫:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 140
    iget v2, p0, Ll/۫ܿۧ;->ܽ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v1, v2, :cond_0

    .line 142
    monitor-exit v0

    return-void

    .line 174
    :cond_0
    :try_start_1
    iget-object v3, p0, Ll/۫ܿۧ;->ۧ:[Ll/۠ܿۧ;

    const/4 v4, 0x0

    invoke-static {v3, v1, v2, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 175
    iput v1, p0, Ll/۫ܿۧ;->ܽ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
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

.method public final declared-synchronized ᩳ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 85
    :try_start_0
    iget-boolean v1, p0, Ll/۫ܿۧ;->ܳ:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 86
    invoke-virtual {p0, v1}, Ll/۫ܿۧ;->֫(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :cond_0
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
