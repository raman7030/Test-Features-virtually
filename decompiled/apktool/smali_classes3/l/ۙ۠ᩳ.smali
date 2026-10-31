.class public final Ll/ۙ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/ᩴۛ᩷;


# instance fields
.field public ֫:Z

.field public final synthetic ۜ:Ll/۠ۘᩳ;

.field public ۧ:Z

.field public final synthetic ܳ:Ll/ܶ᩺ᩳ;

.field public final ܽ:Ll/ۤۜܽ;

.field public final synthetic ܿ:Ll/۫ۨᩳ;

.field public final synthetic ᩳ:Ll/᩹ܶᩳ;

.field public final synthetic ᩻:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/۫ۨᩳ;Ll/ܶ᩺ᩳ;Ll/۠ۘᩳ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 1761
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۠ᩳ;->ᩳ:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ۙ۠ᩳ;->ܿ:Ll/۫ۨᩳ;

    iput-object p3, p0, Ll/ۙ۠ᩳ;->ܳ:Ll/ܶ᩺ᩳ;

    iput-object p4, p0, Ll/ۙ۠ᩳ;->ۜ:Ll/۠ۘᩳ;

    iput-object p5, p0, Ll/ۙ۠ᩳ;->᩻:Ll/ܶ᩵ܿ;

    .line 1762
    new-instance p1, Ll/ۤۜܽ;

    invoke-direct {p1}, Ll/ۤۜܽ;-><init>()V

    iput-object p1, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1787
    :try_start_0
    iget-boolean v1, p0, Ll/ۙ۠ᩳ;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 1789
    :try_start_1
    iget-boolean v1, p0, Ll/ۙ۠ᩳ;->֫:Z

    if-eqz v1, :cond_1

    .line 1790
    iget-object v1, p0, Ll/ۙ۠ᩳ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 1791
    iget-object v1, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    invoke-virtual {v1}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v1

    iget-object v3, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    invoke-virtual {v3}, Ll/ۤۜܽ;->size()I

    move-result v3

    invoke-static {v3, v1}, Ll/ۘۤۡ;->֫(I[B)[B

    move-result-object v3

    .line 1792
    iget-object v1, p0, Ll/ۙ۠ᩳ;->ᩳ:Ll/᩹ܶᩳ;

    monitor-enter v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v4, p0, Ll/ۙ۠ᩳ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v4, v3}, Ll/ܶ᩵ܿ;->֫([B)V

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1798
    :goto_0
    :try_start_3
    iput-boolean v2, p0, Ll/ۙ۠ᩳ;->ۧ:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_0
    move-exception v3

    .line 1792
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v3

    .line 1789
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v3, "Legacy save was not captured"

    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 1796
    :goto_1
    :try_start_6
    iget-object v3, p0, Ll/ۙ۠ᩳ;->ۜ:Ll/۠ۘᩳ;

    invoke-virtual {v3, v1}, Ll/۠ۘᩳ;->֫(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v1

    .line 1794
    iget-object v3, p0, Ll/ۙ۠ᩳ;->ۜ:Ll/۠ۘᩳ;

    invoke-virtual {v3, v1}, Ll/۠ۘᩳ;->֫(Ljava/lang/Throwable;)V

    iget-object v3, p0, Ll/ۙ۠ᩳ;->ᩳ:Ll/᩹ܶᩳ;

    iget-object v3, v3, Ll/֫ۘᩳ;->۫:Ll/᩶ܶᩳ;

    invoke-virtual {v3, v1}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    .line 1799
    :goto_2
    :try_start_7
    iget-object v1, p0, Ll/ۙ۠ᩳ;->ۜ:Ll/۠ۘᩳ;

    invoke-virtual {v1}, Ll/۠ۘᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1801
    monitor-exit v0

    return-void

    .line 1798
    :goto_3
    :try_start_8
    iput-boolean v2, p0, Ll/ۙ۠ᩳ;->ۧ:Z

    .line 1799
    iget-object v2, p0, Ll/ۙ۠ᩳ;->ۜ:Ll/۠ۘᩳ;

    invoke-virtual {v2}, Ll/۠ۘᩳ;->close()V

    .line 1800
    throw v1

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v1
.end method

.method public final declared-synchronized ۧ()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1767
    :try_start_0
    iget-boolean v1, p0, Ll/ۙ۠ᩳ;->֫:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Ll/ۙ۠ᩳ;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    .line 1769
    :try_start_1
    iget-object v2, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    const v3, 0x52631361

    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 1770
    iget-object v2, p0, Ll/ۙ۠ᩳ;->ᩳ:Ll/᩹ܶᩳ;

    invoke-static {v2}, Ll/᩹ܶᩳ;->᩵(Ll/᩹ܶᩳ;)Ll/᩺ܶᩳ;

    move-result-object v2

    .line 1771
    iget-object v3, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    if-eqz v2, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->֫(Z)V

    if-eqz v2, :cond_2

    .line 1772
    iget-object v3, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    invoke-virtual {v2, v3}, Ll/᩺ܶᩳ;->֫(Ll/ۤۜܽ;)V

    .line 1773
    :cond_2
    iget-object v2, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    const v3, 0x52631362

    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 1774
    iget-object v2, p0, Ll/ۙ۠ᩳ;->ܿ:Ll/۫ۨᩳ;

    iget-object v3, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    invoke-virtual {v2, v3, v1}, Ll/۫ۨᩳ;->֫(Ll/ۤۜܽ;Z)V

    .line 1775
    iget-object v2, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    const v3, 0x52631363

    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 1776
    iget-object v2, p0, Ll/ۙ۠ᩳ;->ܳ:Ll/ܶ᩺ᩳ;

    iget-object v3, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    invoke-virtual {v2, v3}, Ll/ܶ᩺ᩳ;->ۧ(Ll/ۤۜܽ;)V

    .line 1777
    iget-object v2, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    const v3, 0x52631364

    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 1778
    iget-object v2, p0, Ll/ۙ۠ᩳ;->ܳ:Ll/ܶ᩺ᩳ;

    iget-object v3, p0, Ll/ۙ۠ᩳ;->ܽ:Ll/ۤۜܽ;

    invoke-virtual {v2, v3}, Ll/ܶ᩺ᩳ;->֫(Ll/ۤۜܽ;)V

    .line 1779
    iput-boolean v1, p0, Ll/ۙ۠ᩳ;->֫:Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1783
    monitor-exit v0

    return-void

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    .line 1781
    :goto_1
    :try_start_2
    iput-boolean v1, p0, Ll/ۙ۠ᩳ;->ۧ:Z

    iget-object v1, p0, Ll/ۙ۠ᩳ;->ۜ:Ll/۠ۘᩳ;

    invoke-virtual {v1, v2}, Ll/۠ۘᩳ;->֫(Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1767
    :cond_3
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method
