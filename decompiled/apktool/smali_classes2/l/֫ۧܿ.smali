.class public final Ll/֫ۧܿ;
.super Ljava/lang/Object;
.source "L6R5"


# instance fields
.field public ֫:Ll/ۗ᩻᩵;

.field public final ۧ:Ljava/lang/Object;

.field public ܳ:Z

.field public ܽ:I

.field public final ܿ:Ll/۟֫ܿ;

.field public ᩳ:I

.field public ᩻:Ll/֫ۛᩳ;


# direct methods
.method public constructor <init>(Ll/۟֫ܿ;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    .line 18
    iput-object p1, p0, Ll/֫ۧܿ;->ܿ:Ll/۟֫ܿ;

    return-void
.end method

.method public static synthetic ֫(Ll/֫ۧܿ;IILjava/lang/CharSequence;II)V
    .locals 6

    .line 91
    iget-object v0, p0, Ll/֫ۧܿ;->ܿ:Ll/۟֫ܿ;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Ll/۟֫ܿ;->֫(IILjava/lang/CharSequence;II)V

    return-void
.end method

.method private ܳ()V
    .locals 4

    .line 55
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 56
    :try_start_0
    iget-object v1, p0, Ll/֫ۧܿ;->֫:Ll/ۗ᩻᩵;

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Ll/֫ۧܿ;->ܳ:Z

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ll/֫ۧܿ;->֫()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 57
    :cond_0
    iget-object v1, p0, Ll/֫ۧܿ;->֫:Ll/ۗ᩻᩵;

    const/4 v2, 0x0

    .line 58
    iput-object v2, p0, Ll/֫ۧܿ;->֫:Ll/ۗ᩻᩵;

    .line 59
    iget-boolean v3, p0, Ll/֫ۧܿ;->ܳ:Z

    .line 60
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    .line 61
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Text owner is closed"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void

    .line 62
    :cond_1
    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    .line 56
    :cond_2
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 60
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private ܿ()V
    .locals 3

    .line 107
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 108
    :try_start_0
    iget v1, p0, Ll/֫ۧܿ;->ᩳ:I

    if-nez v1, :cond_2

    iget v1, p0, Ll/֫ۧܿ;->ܽ:I

    if-eqz v1, :cond_0

    goto :goto_0

    .line 109
    :cond_0
    iget-object v1, p0, Ll/֫ۧܿ;->᩻:Ll/֫ۛᩳ;

    const/4 v2, 0x0

    .line 110
    iput-object v2, p0, Ll/֫ۧܿ;->᩻:Ll/֫ۛᩳ;

    .line 111
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 112
    invoke-virtual {v1}, Ll/֫ۛᩳ;->run()V

    :cond_1
    return-void

    .line 108
    :cond_2
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 111
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;
    .locals 2

    .line 68
    :try_start_0
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 69
    :try_start_1
    iget-boolean v1, p0, Ll/֫ۧܿ;->ܳ:Z

    if-eqz v1, :cond_0

    .line 71
    monitor-exit v0

    goto :goto_0

    .line 73
    :cond_0
    iget p1, p0, Ll/֫ۧܿ;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֫ۧܿ;->ܽ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    :try_start_2
    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    :try_start_3
    iget p2, p0, Ll/֫ۧܿ;->ܽ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/֫ۧܿ;->ܽ:I

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    :goto_0
    invoke-direct {p0}, Ll/֫ۧܿ;->ܳ()V

    .line 79
    invoke-direct {p0}, Ll/֫ۧܿ;->ܿ()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 75
    :try_start_4
    iget p2, p0, Ll/֫ۧܿ;->ܽ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/֫ۧܿ;->ܽ:I

    throw p1

    :catchall_1
    move-exception p1

    .line 76
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    .line 78
    invoke-direct {p0}, Ll/֫ۧܿ;->ܳ()V

    .line 79
    invoke-direct {p0}, Ll/֫ۧܿ;->ܿ()V

    .line 80
    throw p1
.end method

.method public final ֫(Ll/᩶֫ܿ;)Ljava/lang/Object;
    .locals 3

    .line 85
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 86
    :try_start_0
    iget v1, p0, Ll/֫ۧܿ;->ᩳ:I

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2, p1}, Ll/֫ۧܿ;->֫(Ljava/lang/Object;Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    .line 87
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/֫ۛᩳ;)V
    .locals 2

    .line 96
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 97
    :try_start_0
    iget-boolean v1, p0, Ll/֫ۧܿ;->ܳ:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 98
    iput-boolean v1, p0, Ll/֫ۧܿ;->ܳ:Z

    .line 99
    iput-object p1, p0, Ll/֫ۧܿ;->᩻:Ll/֫ۛᩳ;

    .line 100
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    invoke-direct {p0}, Ll/֫ۧܿ;->ܳ()V

    .line 102
    invoke-direct {p0}, Ll/֫ۧܿ;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    .line 100
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Z)V
    .locals 2

    .line 23
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_1

    .line 25
    :try_start_0
    iget-boolean p1, p0, Ll/֫ۧܿ;->ܳ:Z

    if-nez p1, :cond_0

    .line 26
    iget p1, p0, Ll/֫ۧܿ;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֫ۧܿ;->ᩳ:I

    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Text owner is closed"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :cond_1
    iget p1, p0, Ll/֫ۧܿ;->ᩳ:I

    if-eqz p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    .line 29
    iput p1, p0, Ll/֫ۧܿ;->ᩳ:I

    .line 31
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    invoke-direct {p0}, Ll/֫ۧܿ;->ܳ()V

    .line 33
    invoke-direct {p0}, Ll/֫ۧܿ;->ܿ()V

    return-void

    .line 28
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Unbalanced internal read-only state"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 31
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫()Z
    .locals 2

    .line 39
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll/֫ۧܿ;->ܳ:Z

    if-nez v1, :cond_0

    iget v1, p0, Ll/֫ۧܿ;->ᩳ:I

    if-nez v1, :cond_0

    iget v1, p0, Ll/֫ۧܿ;->ܽ:I

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ()Z
    .locals 1

    .line 36
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/֫ۧܿ;->ܽ:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 2

    .line 116
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Ll/֫ۧܿ;->ܳ:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    invoke-direct {p0}, Ll/֫ۧܿ;->ܳ()V

    return-void

    :catchall_0
    move-exception v1

    .line 116
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩳ()Ll/ۗ᩻᩵;
    .locals 3

    .line 44
    iget-object v0, p0, Ll/֫ۧܿ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 45
    :try_start_0
    iget-boolean v1, p0, Ll/֫ۧܿ;->ܳ:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Text owner is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/IllegalStateException;)Ll/ۗ᩻᩵;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 46
    :cond_0
    invoke-virtual {p0}, Ll/֫ۧܿ;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-static {v1}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 47
    :cond_1
    iget-object v1, p0, Ll/֫ۧܿ;->֫:Ll/ۗ᩻᩵;

    if-nez v1, :cond_2

    new-instance v1, Ll/ۗ᩻᩵;

    invoke-direct {v1}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v1, p0, Ll/֫ۧܿ;->֫:Ll/ۗ᩻᩵;

    .line 48
    :cond_2
    iget-object v1, p0, Ll/֫ۧܿ;->֫:Ll/ۗ᩻᩵;

    new-instance v2, Ll/ۚ۬ۚ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 49
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
