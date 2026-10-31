.class public final Ll/ۜ֡᩵;
.super Ljava/lang/Thread;
.source "0A0C"


# instance fields
.field public ۗ:Ll/ᩴۡ᩵;

.field public ۙ:Ljava/net/InetAddress;

.field public ۫:Ljava/net/UnknownHostException;

.field public ۬:I

.field public ᩶:Ll/᩷֡᩵;

.field public ᩸:[Ll/ۙۡ᩵;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩷֡᩵;Ljava/lang/String;ILjava/net/InetAddress;Ll/ۧܺ᩵;)V
    .locals 1

    const-string v0, "JCIFS-QueryThread: "

    .line 0
    invoke-static {v0, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 813
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 806
    iput-object v0, p0, Ll/ۜ֡᩵;->᩸:[Ll/ۙۡ᩵;

    .line 814
    iput-object p1, p0, Ll/ۜ֡᩵;->᩶:Ll/᩷֡᩵;

    .line 815
    iput-object p2, p0, Ll/ۜ֡᩵;->᩹:Ljava/lang/String;

    .line 816
    iput p3, p0, Ll/ۜ֡᩵;->۬:I

    .line 818
    iput-object p4, p0, Ll/ۜ֡᩵;->ۙ:Ljava/net/InetAddress;

    .line 819
    iput-object p5, p0, Ll/ۜ֡᩵;->ۗ:Ll/ᩴۡ᩵;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 826
    :try_start_0
    iget-object v0, p0, Ll/ۜ֡᩵;->ۗ:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܽ()Ll/᩶ۡ᩵;

    move-result-object v0

    iget-object v1, p0, Ll/ۜ֡᩵;->᩹:Ljava/lang/String;

    iget v2, p0, Ll/ۜ֡᩵;->۬:I

    iget-object v3, p0, Ll/ۜ֡᩵;->ۙ:Ljava/net/InetAddress;

    check-cast v0, Ll/ۢ֡᩵;

    .line 53
    invoke-virtual {v0, v1, v2, v3}, Ll/ۢ֡᩵;->֫(Ljava/lang/String;ILjava/net/InetAddress;)[Ll/ܺ֡᩵;

    move-result-object v0

    .line 826
    iput-object v0, p0, Ll/ۜ֡᩵;->᩸:[Ll/ۙۡ᩵;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 832
    iget-object v0, p0, Ll/ۜ֡᩵;->᩶:Ll/᩷֡᩵;

    monitor-enter v0

    .line 833
    :try_start_1
    iget-object v1, p0, Ll/ۜ֡᩵;->᩶:Ll/᩷֡᩵;

    iget v2, v1, Ll/᩷֡᩵;->֫:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Ll/᩷֡᩵;->֫:I

    .line 834
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 835
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 830
    :try_start_2
    new-instance v1, Ljava/net/UnknownHostException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Ll/ۜ֡᩵;->۫:Ljava/net/UnknownHostException;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 832
    iget-object v0, p0, Ll/ۜ֡᩵;->᩶:Ll/᩷֡᩵;

    monitor-enter v0

    .line 833
    :try_start_3
    iget-object v1, p0, Ll/ۜ֡᩵;->᩶:Ll/᩷֡᩵;

    iget v2, v1, Ll/᩷֡᩵;->֫:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Ll/᩷֡᩵;->֫:I

    .line 834
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 835
    monitor-exit v0

    goto :goto_0

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v1

    :catch_1
    move-exception v0

    .line 828
    :try_start_4
    iput-object v0, p0, Ll/ۜ֡᩵;->۫:Ljava/net/UnknownHostException;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 832
    iget-object v0, p0, Ll/ۜ֡᩵;->᩶:Ll/᩷֡᩵;

    monitor-enter v0

    .line 833
    :try_start_5
    iget-object v1, p0, Ll/ۜ֡᩵;->᩶:Ll/᩷֡᩵;

    iget v2, v1, Ll/᩷֡᩵;->֫:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Ll/᩷֡᩵;->֫:I

    .line 834
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 835
    monitor-exit v0

    :goto_0
    return-void

    :catchall_3
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v1

    .line 832
    :goto_1
    iget-object v0, p0, Ll/ۜ֡᩵;->᩶:Ll/᩷֡᩵;

    monitor-enter v0

    .line 833
    :try_start_6
    iget-object v2, p0, Ll/ۜ֡᩵;->᩶:Ll/᩷֡᩵;

    iget v3, v2, Ll/᩷֡᩵;->֫:I

    add-int/lit8 v3, v3, -0x1

    iput v3, v2, Ll/᩷֡᩵;->֫:I

    .line 834
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 835
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 836
    throw v1

    :catchall_4
    move-exception v1

    .line 835
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    throw v1
.end method

.method public final ֫()[Ll/ۙۡ᩵;
    .locals 1

    .line 844
    iget-object v0, p0, Ll/ۜ֡᩵;->᩸:[Ll/ۙۡ᩵;

    return-object v0
.end method

.method public final ۧ()Ljava/net/UnknownHostException;
    .locals 1

    .line 852
    iget-object v0, p0, Ll/ۜ֡᩵;->۫:Ljava/net/UnknownHostException;

    return-object v0
.end method
