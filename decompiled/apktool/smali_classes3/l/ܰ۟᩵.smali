.class public final Ll/ܰ۟᩵;
.super Ljava/lang/Object;
.source "A4DP"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/۟۟᩵;

.field public final synthetic ܽ:Ll/ۧ֫֡;

.field public final ᩳ:[Z


# direct methods
.method public constructor <init>(Ll/ۧ֫֡;Ll/۟۟᩵;)V
    .locals 0

    .line 837
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ۟᩵;->ܽ:Ll/ۧ֫֡;

    .line 838
    iput-object p2, p0, Ll/ܰ۟᩵;->ۧ:Ll/۟۟᩵;

    .line 839
    iget-boolean p2, p2, Ll/۟۟᩵;->ܳ:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p1, Ll/ۧ֫֡;->᩻֫:I

    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Ll/ܰ۟᩵;->ᩳ:[Z

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۚᩳ֡;
    .locals 4

    .line 887
    iget-object v0, p0, Ll/ܰ۟᩵;->ܽ:Ll/ۧ֫֡;

    monitor-enter v0

    .line 888
    :try_start_0
    iget-boolean v1, p0, Ll/ܰ۟᩵;->֫:Z

    if-nez v1, :cond_2

    .line 891
    iget-object v1, p0, Ll/ܰ۟᩵;->ۧ:Ll/۟۟᩵;

    iget-object v2, v1, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    if-eq v2, p0, :cond_0

    .line 892
    invoke-static {}, Ll/᩻ᩳ֡;->֫()Ll/ۚᩳ֡;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 894
    :cond_0
    iget-boolean v2, v1, Ll/۟۟᩵;->ܳ:Z

    if-nez v2, :cond_1

    .line 895
    iget-object v2, p0, Ll/ܰ۟᩵;->ᩳ:[Z

    const/4 v3, 0x1

    aput-boolean v3, v2, p1

    .line 897
    :cond_1
    iget-object v1, v1, Ll/۟۟᩵;->ܽ:[Ljava/io/File;

    aget-object p1, v1, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 900
    :try_start_1
    iget-object v1, p0, Ll/ܰ۟᩵;->ܽ:Ll/ۧ֫֡;

    iget-object v1, v1, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    invoke-interface {v1, p1}, Ll/ᩳܽ֡;->ܳ(Ljava/io/File;)Ll/ۚᩳ֡;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 904
    :try_start_2
    new-instance v1, Ll/᩺۟᩵;

    invoke-direct {v1, p0, p1}, Ll/᩺۟᩵;-><init>(Ll/ܰ۟᩵;Ll/ۚᩳ֡;)V

    monitor-exit v0

    return-object v1

    .line 902
    :catch_0
    invoke-static {}, Ll/᩻ᩳ֡;->֫()Ll/ۚᩳ֡;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 889
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 911
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 3

    .line 935
    iget-object v0, p0, Ll/ܰ۟᩵;->ܽ:Ll/ۧ֫֡;

    monitor-enter v0

    .line 936
    :try_start_0
    iget-boolean v1, p0, Ll/ܰ۟᩵;->֫:Z

    if-nez v1, :cond_1

    .line 939
    iget-object v1, p0, Ll/ܰ۟᩵;->ۧ:Ll/۟۟᩵;

    iget-object v1, v1, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    if-ne v1, p0, :cond_0

    .line 940
    iget-object v1, p0, Ll/ܰ۟᩵;->ܽ:Ll/ۧ֫֡;

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Ll/ۧ֫֡;->֫(Ll/ܰ۟᩵;Z)V

    :cond_0
    const/4 v1, 0x1

    .line 942
    iput-boolean v1, p0, Ll/ܰ۟᩵;->֫:Z

    .line 943
    monitor-exit v0

    return-void

    .line 937
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    .line 943
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ()V
    .locals 3

    .line 919
    iget-object v0, p0, Ll/ܰ۟᩵;->ܽ:Ll/ۧ֫֡;

    monitor-enter v0

    .line 920
    :try_start_0
    iget-boolean v1, p0, Ll/ܰ۟᩵;->֫:Z

    if-nez v1, :cond_1

    .line 923
    iget-object v1, p0, Ll/ܰ۟᩵;->ۧ:Ll/۟۟᩵;

    iget-object v1, v1, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    const/4 v2, 0x1

    if-ne v1, p0, :cond_0

    .line 924
    iget-object v1, p0, Ll/ܰ۟᩵;->ܽ:Ll/ۧ֫֡;

    invoke-virtual {v1, p0, v2}, Ll/ۧ֫֡;->֫(Ll/ܰ۟᩵;Z)V

    .line 926
    :cond_0
    iput-boolean v2, p0, Ll/ܰ۟᩵;->֫:Z

    .line 927
    monitor-exit v0

    return-void

    .line 921
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    .line 927
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()V
    .locals 4

    .line 849
    iget-object v0, p0, Ll/ܰ۟᩵;->ۧ:Ll/۟۟᩵;

    iget-object v1, v0, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    if-ne v1, p0, :cond_1

    const/4 v1, 0x0

    .line 850
    :goto_0
    iget-object v2, p0, Ll/ܰ۟᩵;->ܽ:Ll/ۧ֫֡;

    iget v3, v2, Ll/ۧ֫֡;->᩻֫:I

    if-ge v1, v3, :cond_0

    .line 852
    :try_start_0
    iget-object v2, v2, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v3, v0, Ll/۟۟᩵;->ܽ:[Ljava/io/File;

    aget-object v3, v3, v1

    invoke-interface {v2, v3}, Ll/ᩳܽ֡;->᩻(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 857
    iput-object v1, v0, Ll/۟۟᩵;->ۧ:Ll/ܰ۟᩵;

    :cond_1
    return-void
.end method
