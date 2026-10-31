.class public Ll/۫ۛ᩵;
.super Ljava/lang/Object;
.source "AAYE"


# instance fields
.field public volatile synthetic _size:I

.field public ֫:[Ll/ۤۛ᩵;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 27
    iput v0, p0, Ll/۫ۛ᩵;->_size:I

    return-void
.end method

.method private final ֫(II)V
    .locals 3

    .line 159
    iget-object v0, p0, Ll/۫ۛ᩵;->֫:[Ll/ۤۛ᩵;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 160
    aget-object v1, v0, p2

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 161
    aget-object v2, v0, p1

    invoke-static {v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 162
    aput-object v1, v0, p1

    .line 163
    aput-object v2, v0, p2

    .line 164
    invoke-interface {v1, p1}, Ll/ۤۛ᩵;->֫(I)V

    .line 165
    invoke-interface {v2, p2}, Ll/ۤۛ᩵;->֫(I)V

    return-void
.end method

.method private final ۧ(I)V
    .locals 3

    :goto_0
    if-gtz p1, :cond_0

    goto :goto_1

    .line 131
    :cond_0
    iget-object v0, p0, Ll/۫ۛ᩵;->֫:[Ll/ۤۛ᩵;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    add-int/lit8 v1, p1, -0x1

    .line 132
    div-int/lit8 v1, v1, 0x2

    .line 133
    aget-object v2, v0, v1

    invoke-static {v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Comparable;

    aget-object v0, v0, p1

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v2, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_1

    :goto_1
    return-void

    .line 134
    :cond_1
    invoke-direct {p0, p1, v1}, Ll/۫ۛ᩵;->֫(II)V

    move p1, v1

    goto :goto_0
.end method


# virtual methods
.method public final ֫()Ll/ۤۛ᩵;
    .locals 2

    .line 93
    iget-object v0, p0, Ll/۫ۛ᩵;->֫:[Ll/ۤۛ᩵;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(I)Ll/ۤۛ᩵;
    .locals 7

    .line 98
    iget-object v0, p0, Ll/۫ۛ᩵;->֫:[Ll/ۤۛ᩵;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 30
    iget v1, p0, Ll/۫ۛ᩵;->_size:I

    const/4 v2, -0x1

    add-int/2addr v1, v2

    .line 31
    iput v1, p0, Ll/۫ۛ᩵;->_size:I

    .line 30
    iget v1, p0, Ll/۫ۛ᩵;->_size:I

    if-ge p1, v1, :cond_4

    iget v1, p0, Ll/۫ۛ᩵;->_size:I

    .line 101
    invoke-direct {p0, p1, v1}, Ll/۫ۛ᩵;->֫(II)V

    add-int/lit8 v1, p1, -0x1

    .line 102
    div-int/lit8 v1, v1, 0x2

    if-lez p1, :cond_0

    .line 103
    aget-object v3, v0, p1

    invoke-static {v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Comparable;

    aget-object v4, v0, v1

    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_0

    .line 104
    invoke-direct {p0, p1, v1}, Ll/۫ۛ᩵;->֫(II)V

    .line 105
    invoke-direct {p0, v1}, Ll/۫ۛ᩵;->ۧ(I)V

    goto :goto_2

    :cond_0
    :goto_0
    mul-int/lit8 v1, p1, 0x2

    add-int/lit8 v3, v1, 0x1

    .line 30
    iget v4, p0, Ll/۫ۛ᩵;->_size:I

    if-lt v3, v4, :cond_1

    goto :goto_2

    .line 141
    :cond_1
    iget-object v4, p0, Ll/۫ۛ᩵;->֫:[Ll/ۤۛ᩵;

    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x2

    .line 30
    iget v5, p0, Ll/۫ۛ᩵;->_size:I

    if-ge v1, v5, :cond_2

    .line 142
    aget-object v5, v4, v1

    invoke-static {v5}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v5, Ljava/lang/Comparable;

    aget-object v6, v4, v3

    invoke-static {v6}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v5, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_2

    goto :goto_1

    :cond_2
    move v1, v3

    .line 143
    :goto_1
    aget-object v3, v4, p1

    invoke-static {v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Comparable;

    aget-object v4, v4, v1

    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gtz v3, :cond_3

    goto :goto_2

    .line 144
    :cond_3
    invoke-direct {p0, p1, v1}, Ll/۫ۛ᩵;->֫(II)V

    move p1, v1

    goto :goto_0

    .line 30
    :cond_4
    :goto_2
    iget p1, p0, Ll/۫ۛ᩵;->_size:I

    .line 110
    aget-object p1, v0, p1

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 112
    invoke-interface {p1, v1}, Ll/ۤۛ᩵;->֫(Ll/۫ۛ᩵;)V

    .line 113
    invoke-interface {p1, v2}, Ll/ۤۛ᩵;->֫(I)V

    .line 30
    iget v2, p0, Ll/۫ۛ᩵;->_size:I

    .line 114
    aput-object v1, v0, v2

    return-object p1
.end method

.method public final ֫(Ll/ۘ۬᩵;)V
    .locals 3

    .line 121
    invoke-virtual {p1, p0}, Ll/ۘ۬᩵;->֫(Ll/۫ۛ᩵;)V

    .line 150
    iget-object v0, p0, Ll/۫ۛ᩵;->֫:[Ll/ۤۛ᩵;

    if-nez v0, :cond_0

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ۤۛ᩵;

    .line 152
    iput-object v0, p0, Ll/۫ۛ᩵;->֫:[Ll/ۤۛ᩵;

    goto :goto_0

    .line 30
    :cond_0
    iget v1, p0, Ll/۫ۛ᩵;->_size:I

    .line 153
    array-length v2, v0

    if-lt v1, v2, :cond_1

    .line 30
    iget v1, p0, Ll/۫ۛ᩵;->_size:I

    mul-int/lit8 v1, v1, 0x2

    .line 153
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(this, newSize)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ll/ۤۛ᩵;

    iput-object v0, p0, Ll/۫ۛ᩵;->֫:[Ll/ۤۛ᩵;

    .line 30
    :cond_1
    :goto_0
    iget v1, p0, Ll/۫ۛ᩵;->_size:I

    add-int/lit8 v2, v1, 0x1

    .line 31
    iput v2, p0, Ll/۫ۛ᩵;->_size:I

    .line 124
    aput-object p1, v0, v1

    .line 125
    invoke-virtual {p1, v1}, Ll/ۘ۬᩵;->֫(I)V

    .line 126
    invoke-direct {p0, v1}, Ll/۫ۛ᩵;->ۧ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۘ۬᩵;)V
    .locals 2

    move-object v0, p0

    .line 20
    monitor-enter v0

    .line 82
    :try_start_0
    invoke-virtual {p1}, Ll/ۘ۬᩵;->֫()Ll/۫ۛ᩵;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {p1}, Ll/ۘ۬᩵;->ۧ()I

    move-result p1

    .line 87
    invoke-virtual {p0, p1}, Ll/۫ۛ᩵;->֫(I)Ll/ۤۛ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 30
    iget v0, p0, Ll/۫ۛ᩵;->_size:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ll/ۤۛ᩵;
    .locals 2

    move-object v0, p0

    .line 20
    monitor-enter v0

    .line 50
    :try_start_0
    invoke-virtual {p0}, Ll/۫ۛ᩵;->֫()Ll/ۤۛ᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ᩳ()Ll/ۤۛ᩵;
    .locals 2

    move-object v0, p0

    .line 20
    monitor-enter v0

    .line 30
    :try_start_0
    iget v1, p0, Ll/۫ۛ᩵;->_size:I

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 54
    invoke-virtual {p0, v1}, Ll/۫ۛ᩵;->֫(I)Ll/ۤۛ᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 53
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
