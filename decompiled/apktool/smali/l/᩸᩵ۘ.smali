.class public final Ll/᩸᩵ۘ;
.super Ljava/lang/Object;
.source "E8DU"


# instance fields
.field public ֫:I

.field public ۧ:Ll/۟ۘۘ;

.field public ܽ:J

.field public ᩳ:[Ll/ܶ᩵ۘ;


# direct methods
.method public constructor <init>([Ll/᩷᩵ۘ;)V
    .locals 3

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    array-length v0, p1

    iput v0, p0, Ll/᩸᩵ۘ;->֫:I

    .line 47
    new-array v0, v0, [Ll/ܶ᩵ۘ;

    iput-object v0, p0, Ll/᩸᩵ۘ;->ᩳ:[Ll/ܶ᩵ۘ;

    const/4 v0, 0x0

    .line 48
    :goto_0
    iget v1, p0, Ll/᩸᩵ۘ;->֫:I

    if-ge v0, v1, :cond_0

    .line 49
    iget-object v1, p0, Ll/᩸᩵ۘ;->ᩳ:[Ll/ܶ᩵ۘ;

    new-instance v2, Ll/ܶ᩵ۘ;

    invoke-direct {v2, p0}, Ll/ܶ᩵ۘ;-><init>(Ll/᩸᩵ۘ;)V

    aput-object v2, v1, v0

    .line 50
    aget-object v1, p1, v0

    iput-object v1, v2, Ll/ܶ᩵ۘ;->ᩳ:Ll/᩷᩵ۘ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩸᩵ۘ;I)Ll/ܶ᩵ۘ;
    .locals 11

    .line 135
    invoke-direct {p0, p1}, Ll/᩸᩵ۘ;->ۧ(I)Ll/ܶ᩵ۘ;

    move-result-object v0

    if-nez v0, :cond_7

    .line 93
    iget-object v0, p0, Ll/᩸᩵ۘ;->ᩳ:[Ll/ܶ᩵ۘ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_5

    aget-object v5, v0, v4

    .line 94
    iget-object v6, v5, Ll/ܶ᩵ۘ;->ᩳ:Ll/᩷᩵ۘ;

    if-nez v6, :cond_0

    move-object v0, v5

    goto :goto_4

    :cond_0
    if-eqz v2, :cond_1

    .line 100
    iget-boolean v6, v5, Ll/ܶ᩵ۘ;->֫:Z

    if-nez v6, :cond_4

    iget-wide v6, v5, Ll/ܶ᩵ۘ;->ܿ:J

    iget-wide v8, v2, Ll/ܶ᩵ۘ;->ܿ:J

    cmp-long v10, v6, v8

    if-gez v10, :cond_4

    goto :goto_2

    .line 103
    :cond_1
    iget-boolean v6, v5, Ll/ܶ᩵ۘ;->֫:Z

    if-eqz v6, :cond_3

    if-nez v3, :cond_2

    goto :goto_1

    .line 106
    :cond_2
    iget-wide v6, v5, Ll/ܶ᩵ۘ;->ܿ:J

    iget-wide v8, v3, Ll/ܶ᩵ۘ;->ܿ:J

    cmp-long v10, v6, v8

    if-gez v10, :cond_4

    :goto_1
    move-object v3, v5

    goto :goto_3

    :cond_3
    :goto_2
    move-object v2, v5

    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    if-eqz v2, :cond_6

    move-object v0, v2

    goto :goto_4

    :cond_6
    move-object v0, v3

    .line 139
    :cond_7
    :goto_4
    iput p1, v0, Ll/ܶ᩵ۘ;->ۧ:I

    .line 140
    iget-wide v1, p0, Ll/᩸᩵ۘ;->ܽ:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Ll/᩸᩵ۘ;->ܽ:J

    iput-wide v1, v0, Ll/ܶ᩵ۘ;->ܿ:J

    const/4 p0, 0x1

    .line 141
    iput-boolean p0, v0, Ll/ܶ᩵ۘ;->֫:Z

    return-object v0
.end method

.method private ۧ(I)Ll/ܶ᩵ۘ;
    .locals 5

    .line 82
    iget-object v0, p0, Ll/᩸᩵ۘ;->ᩳ:[Ll/ܶ᩵ۘ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 83
    iget v4, v3, Ll/ܶ᩵ۘ;->ۧ:I

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic ۧ(Ll/᩸᩵ۘ;I)Ll/ܶ᩵ۘ;
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Ll/᩸᩵ۘ;->ۧ(I)Ll/ܶ᩵ۘ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ۙۘۘ;
    .locals 2

    .line 55
    iget-object v0, p0, Ll/᩸᩵ۘ;->ۧ:Ll/۟ۘۘ;

    if-nez v0, :cond_0

    .line 56
    iget-object v0, p0, Ll/᩸᩵ۘ;->ᩳ:[Ll/ܶ᩵ۘ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Ll/ܶ᩵ۘ;->ᩳ:Ll/᩷᩵ۘ;

    check-cast v0, Ll/᩻᩵ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ll/᩻᩵ۘ;->ܳ()Ll/۟ۘۘ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸᩵ۘ;->ۧ:Ll/۟ۘۘ;

    .line 58
    :cond_0
    iget-object v0, p0, Ll/᩸᩵ۘ;->ۧ:Ll/۟ۘۘ;

    return-object v0
.end method

.method public final declared-synchronized ֫(I)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 154
    :try_start_0
    invoke-direct {p0, p1}, Ll/᩸᩵ۘ;->ۧ(I)Ll/ܶ᩵ۘ;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    .line 69
    iput-boolean v1, p1, Ll/ܶ᩵ۘ;->֫:Z

    .line 70
    iget-object v1, p1, Ll/ܶ᩵ۘ;->ܽ:Ll/᩸᩵ۘ;

    .line 31
    iget-wide v2, v1, Ll/᩸᩵ۘ;->ܽ:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v2

    iput-wide v4, v1, Ll/᩸᩵ۘ;->ܽ:J

    .line 70
    iput-wide v2, p1, Ll/ܶ᩵ۘ;->ܿ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    monitor-exit v0

    return-void

    .line 159
    :cond_0
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
