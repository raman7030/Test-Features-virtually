.class public final Ll/ۚܺܳ;
.super Ll/ۤۙۧ;
.source "47JB"


# instance fields
.field public final synthetic ᩳ:Ll/ۗܺܳ;


# direct methods
.method public constructor <init>(Ll/ۗܺܳ;)V
    .locals 0

    .line 144
    iput-object p1, p0, Ll/ۚܺܳ;->ᩳ:Ll/ۗܺܳ;

    invoke-direct {p0}, Ll/ۤۙۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 1

    .line 153
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 154
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    if-ltz p1, :cond_1

    if-gez p2, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    iget-object p3, p0, Ll/ۚܺܳ;->ᩳ:Ll/ۗܺܳ;

    invoke-static {p3}, Ll/ۗܺܳ;->ܽ(Ll/ۗܺܳ;)Ljava/util/List;

    move-result-object p3

    move-object v0, p3

    monitor-enter v0

    .line 159
    :try_start_0
    iget-object p3, p0, Ll/ۚܺܳ;->ᩳ:Ll/ۗܺܳ;

    invoke-static {p3}, Ll/ۗܺܳ;->ܽ(Ll/ۗܺܳ;)Ljava/util/List;

    move-result-object p3

    invoke-static {p1, p2, p3}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 160
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    iget-object p3, p0, Ll/ۚܺܳ;->ᩳ:Ll/ۗܺܳ;

    invoke-static {p3}, Ll/ۗܺܳ;->֫(Ll/ۗܺܳ;)Ll/ܶܺܳ;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    .line 162
    invoke-static {}, Ll/ۤܺܳ;->ܳ()V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 160
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)I
    .locals 1

    const/4 p1, 0x3

    const/4 v0, 0x0

    .line 148
    invoke-static {p1, v0}, Ll/ۤۙۧ;->ܽ(II)I

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(Ll/ۗ۬ۧ;)V
    .locals 0

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
