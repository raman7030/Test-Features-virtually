.class public abstract Ll/۠ܶۢ;
.super Ljava/lang/Object;
.source "CAJ1"


# static fields
.field public static final ܳ:Ll/ۚۡ֫;

.field public static final synthetic ܿ:I

.field public static final ᩻:Ljava/util/concurrent/ConcurrentLinkedQueue;


# instance fields
.field public volatile ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public volatile ۧ:Ll/֡ۚۢ;

.field public volatile ܽ:Ll/֨ܶۢ;

.field public volatile ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    sput-object v0, Ll/۠ܶۢ;->᩻:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 24
    new-instance v0, Ll/ۚۡ֫;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-direct {v0, v1}, Ll/֡ۡ֫;-><init>(Ljava/lang/Object;)V

    .line 24
    sput-object v0, Ll/۠ܶۢ;->ܳ:Ll/ۚۡ֫;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    sget-object v0, Ll/֨ܶۢ;->᩶:Ll/֨ܶۢ;

    iput-object v0, p0, Ll/۠ܶۢ;->ܽ:Ll/֨ܶۢ;

    return-void
.end method

.method private ֫()V
    .locals 3

    .line 211
    iget-object v0, p0, Ll/۠ܶۢ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    .line 213
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 215
    :cond_0
    iget-object v0, p0, Ll/۠ܶۢ;->ۧ:Ll/֡ۚۢ;

    const/4 v2, 0x0

    .line 216
    iput-object v2, p0, Ll/۠ܶۢ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 217
    iput-object v2, p0, Ll/۠ܶۢ;->ۧ:Ll/֡ۚۢ;

    .line 218
    sget-object v2, Ll/֨ܶۢ;->᩹:Ll/֨ܶۢ;

    iput-object v2, p0, Ll/۠ܶۢ;->ܽ:Ll/֨ܶۢ;

    .line 219
    iput-boolean v1, p0, Ll/۠ܶۢ;->ᩳ:Z

    .line 220
    sget-object v1, Ll/۠ܶۢ;->᩻:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 221
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    if-eqz v0, :cond_1

    .line 223
    new-instance v1, Ll/᩷۠᩷;

    const/4 v2, 0x3

    invoke-direct {v1, v2, v0}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 225
    :cond_1
    sget-object v0, Ll/۠ܶۢ;->ܳ:Ll/ۚۡ֫;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method private declared-synchronized ֫(Ll/֨ܶۢ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 199
    :try_start_0
    iget-boolean v1, p0, Ll/۠ܶۢ;->ᩳ:Z

    if-eqz v1, :cond_0

    .line 200
    iput-object p1, p0, Ll/۠ܶۢ;->ܽ:Ll/֨ܶۢ;

    const/4 p1, 0x0

    .line 201
    iput-boolean p1, p0, Ll/۠ܶۢ;->ᩳ:Z

    const/4 p1, 0x0

    .line 202
    iput-object p1, p0, Ll/۠ܶۢ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 203
    iput-object p1, p0, Ll/۠ܶۢ;->ۧ:Ll/֡ۚۢ;

    .line 204
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 206
    :cond_0
    sget-object p1, Ll/۠ܶۢ;->ܳ:Ll/ۚۡ֫;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
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

.method public static synthetic ֫(Ll/۠ܶۢ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 129
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 130
    sget-object p1, Ll/֨ܶۢ;->᩹:Ll/֨ܶۢ;

    invoke-direct {p0, p1}, Ll/۠ܶۢ;->֫(Ll/֨ܶۢ;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/۠ܶۢ;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/view/View;Ll/֡ۚۢ;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 151
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    invoke-virtual {p0, p2}, Ll/۠ܶۢ;->֫(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 153
    sget-object p1, Ll/֨ܶۢ;->ۙ:Ll/֨ܶۢ;

    invoke-direct {p0, p1}, Ll/۠ܶۢ;->֫(Ll/֨ܶۢ;)V

    .line 154
    invoke-virtual {p3}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 156
    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠ܶۢ;Ll/֨ܶۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/۠ܶۢ;->֫(Ll/֨ܶۢ;)V

    return-void
.end method

.method public static ۧ(Lbin/mt/plus/Main;)V
    .locals 6

    .line 87
    :goto_0
    sget-object v1, Ll/۠ܶۢ;->᩻:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll/۠ܶۢ;

    if-eqz v2, :cond_5

    .line 88
    iget-boolean v0, v2, Ll/۠ܶۢ;->ᩳ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 91
    :cond_0
    iget-object v0, v2, Ll/۠ܶۢ;->ܽ:Ll/֨ܶۢ;

    sget-object v3, Ll/֨ܶۢ;->᩶:Ll/֨ܶۢ;

    if-ne v0, v3, :cond_4

    move-object v0, v2

    .line 0
    monitor-enter v0

    .line 104
    :try_start_0
    iget-object v1, v2, Ll/۠ܶۢ;->ܽ:Ll/֨ܶۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v1, v3, :cond_1

    .line 105
    monitor-exit v0

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 107
    :try_start_1
    iput-boolean v1, v2, Ll/۠ܶۢ;->ᩳ:Z

    .line 108
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 109
    invoke-virtual {v2, p0}, Ll/۠ܶۢ;->֫(Lbin/mt/plus/Main;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 111
    new-instance v4, Ll/ۚܶۢ;

    invoke-direct {v4, v2, v3}, Ll/ۚܶۢ;-><init>(Ll/۠ܶۢ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 125
    :cond_2
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    const/4 v4, 0x0

    .line 126
    invoke-virtual {p0, v4}, Ll/᩵ۚۢ;->֫(Z)V

    const v4, 0x7f12070a

    const/4 v5, 0x0

    .line 127
    invoke-virtual {p0, v4, v5}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v4, Ll/ۘܶۢ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2, v3}, Ll/ۘܶۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, 0x7f12015e

    .line 128
    invoke-virtual {p0, v5, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v4, Ll/ᩴܶۢ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2, v3}, Ll/ᩴܶۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 133
    invoke-virtual {p0, v4}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    new-instance v4, Ll/᩵ܶۢ;

    invoke-direct {v4, v2, v3}, Ll/᩵ܶۢ;-><init>(Ll/۠ܶۢ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 138
    invoke-virtual {p0, v4}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    if-eqz v1, :cond_3

    .line 144
    invoke-virtual {p0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    .line 146
    :cond_3
    invoke-virtual {v2, p0}, Ll/۠ܶۢ;->֫(Ll/᩵ۚۢ;)V

    .line 147
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p0

    .line 148
    iput-object v3, v2, Ll/۠ܶۢ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 149
    iput-object p0, v2, Ll/۠ܶۢ;->ۧ:Ll/֡ۚۢ;

    .line 150
    invoke-virtual {p0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v4

    new-instance v5, Ll/֡ܶۢ;

    invoke-direct {v5, v2, v3, v1, p0}, Ll/֡ܶۢ;-><init>(Ll/۠ܶۢ;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/view/View;Ll/֡ۚۢ;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    invoke-virtual {v2, p0}, Ll/۠ܶۢ;->֫(Ll/֡ۚۢ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    .line 96
    :cond_4
    invoke-interface {v1}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    goto/16 :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method public static synthetic ۧ(Ll/۠ܶۢ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 134
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 135
    sget-object p1, Ll/֨ܶۢ;->᩹:Ll/֨ܶۢ;

    invoke-direct {p0, p1}, Ll/۠ܶۢ;->֫(Ll/֨ܶۢ;)V

    :cond_0
    return-void
.end method

.method public static ܽ(Lbin/mt/plus/Main;)V
    .locals 2

    .line 84
    new-instance v0, Ll/ۖܶۢ;

    invoke-direct {v0, p0}, Ll/ۖܶۢ;-><init>(Lbin/mt/plus/Main;)V

    sget-object v1, Ll/۠ܶۢ;->ܳ:Ll/ۚۡ֫;

    invoke-virtual {v1, p0, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public static synthetic ܽ(Ll/۠ܶۢ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 139
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 140
    sget-object p1, Ll/֨ܶۢ;->᩶:Ll/֨ܶۢ;

    invoke-direct {p0, p1}, Ll/۠ܶۢ;->֫(Ll/֨ܶۢ;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract ֫(Lbin/mt/plus/Main;)Landroid/view/View;
.end method

.method public ֫(Ll/֡ۚۢ;)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/᩵ۚۢ;)V
    .locals 0

    return-void
.end method

.method public abstract ֫(Landroid/view/View;)Z
.end method

.method public final declared-synchronized ֫(Ljava/util/function/BooleanSupplier;)Z
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 51
    :try_start_0
    invoke-static {}, Ll/ۧۨۡ;->ܽ()V

    .line 52
    :catch_0
    :goto_0
    invoke-static {}, Ll/ܶ۠ۢ;->ۡ()Z

    move-result v1

    const-wide/16 v2, 0x64

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 53
    invoke-interface {p1}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 54
    monitor-exit v0

    return v4

    .line 58
    :cond_0
    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 63
    :cond_1
    :try_start_2
    invoke-interface {p1}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_2

    .line 64
    monitor-exit v0

    return v4

    .line 66
    :cond_2
    :try_start_3
    sget-object v1, Ll/۠ܶۢ;->᩻:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 67
    sget-object v1, Ll/۠ܶۢ;->ܳ:Ll/ۚۡ֫;

    new-instance v5, Ljava/lang/Object;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v5}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 68
    :catch_1
    :goto_1
    iget-boolean v1, p0, Ll/۠ܶۢ;->ᩳ:Z

    if-nez v1, :cond_5

    iget-object v1, p0, Ll/۠ܶۢ;->ܽ:Ll/֨ܶۢ;

    sget-object v5, Ll/֨ܶۢ;->᩶:Ll/֨ܶۢ;

    if-ne v1, v5, :cond_3

    goto :goto_2

    .line 79
    :cond_3
    iget-object p1, p0, Ll/۠ܶۢ;->ܽ:Ll/֨ܶۢ;

    sget-object v1, Ll/֨ܶۢ;->ۙ:Ll/֨ܶۢ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p1, v1, :cond_4

    const/4 v4, 0x1

    :cond_4
    monitor-exit v0

    return v4

    .line 69
    :cond_5
    :goto_2
    :try_start_4
    invoke-interface {p1}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 70
    invoke-direct {p0}, Ll/۠ܶۢ;->֫()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 71
    monitor-exit v0

    return v4

    .line 74
    :cond_6
    :try_start_5
    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 77
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method
