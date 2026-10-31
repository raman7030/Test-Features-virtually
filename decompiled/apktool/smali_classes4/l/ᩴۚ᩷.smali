.class public final Ll/ᩴۚ᩷;
.super Ljava/lang/Object;
.source "E72G"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/ۚۚ᩷;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۚۚ᩷;)V
    .locals 1

    .line 1692
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1689
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴۚ᩷;->ܽ:Ljava/lang/String;

    .line 1692
    iput-object p1, p0, Ll/ᩴۚ᩷;->ۧ:Ll/ۚۚ᩷;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴۚ᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۚ᩷;->ܽ:Ljava/lang/String;

    return-object p0
.end method

.method public static ۧ(Ll/ᩴۚ᩷;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v1, 0x1

    .line 1705
    :try_start_0
    iput-boolean v1, p0, Ll/ᩴۚ᩷;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public declared-synchronized save(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation build Ll/ۙᩳ;
    .end annotation

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1698
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴۚ᩷;->֫:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/ᩴۚ᩷;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    const v1, 0x186a0

    if-le p1, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 1699
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p1, v1, :cond_2

    .line 1700
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-eq v1, v2, :cond_1

    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x31

    if-eq v1, v2, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 1702
    :cond_2
    :try_start_1
    iget-object p1, p0, Ll/ᩴۚ᩷;->ۧ:Ll/ۚۚ᩷;

    invoke-static {p1, p2}, Ll/ۚۚ᩷;->֫(Ll/ۚۚ᩷;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1703
    monitor-exit v0

    return-void

    .line 1698
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
