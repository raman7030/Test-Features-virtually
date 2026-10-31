.class public final Ll/ܳܺܳ;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ll/᩷᩻ᩳ;


# instance fields
.field public final synthetic ᩸:Ll/᩻ܺܳ;


# direct methods
.method public constructor <init>(Ll/᩻ܺܳ;)V
    .locals 0

    .line 691
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Ll/ܶ᩵ܿ;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 694
    :try_start_0
    iget-object v1, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    iget-object v2, v1, Ll/᩻ܺܳ;->ܺ:Ll/ۚۛܳ;

    if-nez v2, :cond_0

    .line 695
    iget-object v1, v1, Ll/᩻ܺܳ;->ܳ:Ljava/util/ArrayList;

    invoke-static {v1, p1}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    .line 698
    :cond_0
    invoke-virtual {v2, p1}, Ll/ۚۛܳ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 700
    :goto_0
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

.method public final declared-synchronized ֫(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 704
    :try_start_0
    iget-object v1, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    new-instance v2, Ll/ۚۛܳ;

    iget-object v3, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    iget-object v3, v3, Ll/᩻ܺܳ;->ۡ:Ll/ܽۢܳ;

    invoke-static {v3}, Ll/ۘ᩶;->ۡۨ֨(Ljava/lang/Object;)Ll/ܽ᩷ܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽ᩷ܳ;->᩷()I

    move-result v3

    iget-object v4, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    iget-object v5, v4, Ll/᩻ܺܳ;->ۢ:Ljava/lang/String;

    iget-object v4, v4, Ll/᩻ܺܳ;->ܳ:Ljava/util/ArrayList;

    invoke-direct {v2, v3, p1, v5, v4}, Ll/ۚۛܳ;-><init>(ILnet/sf/sevenzipjbinding/IInArchive;Ljava/lang/String;Ljava/util/ArrayList;)V

    iput-object v2, v1, Ll/᩻ܺܳ;->ܺ:Ll/ۚۛܳ;

    .line 707
    iget-object p1, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    iget-object p1, p1, Ll/᩻ܺܳ;->ܳ:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 708
    iget-object v2, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    iget-object v2, v2, Ll/᩻ܺܳ;->ܺ:Ll/ۚۛܳ;

    invoke-virtual {v2, v1}, Ll/ۚۛܳ;->֫(Ll/ܶ᩵ܿ;)V

    goto :goto_0

    .line 710
    :cond_0
    iget-object p1, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    iget-object p1, p1, Ll/᩻ܺܳ;->ܳ:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/֨ۤ;->᩶ۖۢ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 711
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

.method public final ܽ()V
    .locals 2

    .line 715
    iget-object v0, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/᩻ܺܳ;->᩻:Z

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 720
    iget-object v0, p0, Ll/ܳܺܳ;->᩸:Ll/᩻ܺܳ;

    iget-object v0, v0, Ll/᩻ܺܳ;->ۜ:Ll/ۧۢܳ;

    invoke-virtual {v0}, Ll/ۧۢܳ;->ۧ()Z

    move-result v0

    return v0
.end method
