.class public final Ll/ۢ᩺᩻;
.super Ljava/lang/Object;
.source "W7A7"


# instance fields
.field public final ֫:[I

.field public ۧ:I

.field public ܽ:[I

.field public final ܿ:[[B

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 888
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [I

    .line 878
    iput-object v1, p0, Ll/ۢ᩺᩻;->֫:[I

    new-array v0, v0, [[B

    .line 879
    iput-object v0, p0, Ll/ۢ᩺᩻;->ܿ:[[B

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 880
    iput-object v0, p0, Ll/ۢ᩺᩻;->ܽ:[I

    const/4 v0, -0x1

    .line 889
    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    .line 890
    iget-object v1, p0, Ll/ۢ᩺᩻;->ܽ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    return-void
.end method

.method public static ֫(ILl/ۢ᩺᩻;)V
    .locals 5

    move-object v0, p1

    .line 0
    monitor-enter v0

    const/4 v1, 0x0

    .line 959
    :goto_0
    :try_start_0
    iget v2, p1, Ll/ۢ᩺᩻;->ۧ:I

    if-ge v1, v2, :cond_1

    .line 960
    iget-object v3, p1, Ll/ۢ᩺᩻;->ܽ:[I

    aget v4, v3, v1

    if-ne v4, p0, :cond_0

    add-int/lit8 v2, v2, -0x1

    .line 961
    iput v2, p1, Ll/ۢ᩺᩻;->ۧ:I

    .line 962
    aget p0, v3, v2

    aput p0, v3, v1

    const/4 p0, -0x1

    .line 963
    aput p0, v3, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 967
    :cond_1
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 968
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

.method public static ֫(Ll/ۢ᩺᩻;)V
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 935
    monitor-exit v0

    return-void
.end method

.method public static ֫(Ll/ۢ᩺᩻;IZ)Z
    .locals 5

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v1, 0x0

    if-nez p2, :cond_2

    const/4 p2, 0x0

    .line 903
    :goto_0
    :try_start_0
    iget-object v2, p0, Ll/ۢ᩺᩻;->֫:[I

    array-length v3, v2

    if-ge p2, v3, :cond_1

    .line 904
    aget v2, v2, p2

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Ll/ۢ᩺᩻;->ܿ:[[B

    aget-object v2, v2, p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    .line 942
    monitor-exit v0

    return v1

    :cond_2
    const/4 p2, 0x0

    .line 985
    :goto_2
    :try_start_1
    iget v2, p0, Ll/ۢ᩺᩻;->ۧ:I

    const/4 v3, 0x1

    if-ge p2, v2, :cond_4

    .line 986
    iget-object v4, p0, Ll/ۢ᩺᩻;->ܽ:[I

    aget v4, v4, p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v4, p1, :cond_3

    const/4 p2, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    :goto_3
    if-eqz p2, :cond_5

    .line 945
    monitor-exit v0

    return v1

    .line 947
    :cond_5
    :try_start_2
    iget-object p2, p0, Ll/ۢ᩺᩻;->ܽ:[I

    array-length v1, p2

    if-ne v2, v1, :cond_6

    .line 948
    array-length v1, p2

    mul-int/lit8 v1, v1, 0x2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p2

    iput-object p2, p0, Ll/ۢ᩺᩻;->ܽ:[I

    .line 949
    iget v1, p0, Ll/ۢ᩺᩻;->ۧ:I

    array-length v2, p2

    const/4 v4, -0x1

    invoke-static {p2, v1, v2, v4}, Ljava/util/Arrays;->fill([IIII)V

    .line 951
    :cond_6
    iget-object p2, p0, Ll/ۢ᩺᩻;->ܽ:[I

    iget v1, p0, Ll/ۢ᩺᩻;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۢ᩺᩻;->ۧ:I

    aput p1, p2, v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 952
    monitor-exit v0

    return v3

    :catchall_0
    move-exception p0

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static ۧ(ILl/ۢ᩺᩻;)V
    .locals 4

    move-object v0, p1

    .line 0
    monitor-enter v0

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 985
    :goto_1
    :try_start_0
    iget v3, p1, Ll/ۢ᩺᩻;->ۧ:I

    if-ge v2, v3, :cond_1

    .line 986
    iget-object v3, p1, Ll/ۢ᩺᩻;->ܽ:[I

    aget v3, v3, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, p0, :cond_0

    const/4 v1, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    .line 976
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 978
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 979
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Interrupted while reading smali cache data"

    invoke-direct {p1, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 982
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method


# virtual methods
.method public final declared-synchronized ֫(I[B)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 915
    :goto_0
    :try_start_0
    iget-object v2, p0, Ll/ۢ᩺᩻;->֫:[I

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 916
    aget v2, v2, v1

    if-ne v2, p1, :cond_0

    .line 917
    iget-object p1, p0, Ll/ۢ᩺᩻;->ܿ:[[B

    aput-object p2, p1, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 918
    monitor-exit v0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 921
    :cond_1
    :try_start_1
    iget v1, p0, Ll/ۢ᩺᩻;->ᩳ:I

    aput p1, v2, v1

    .line 922
    iget-object p1, p0, Ll/ۢ᩺᩻;->ܿ:[[B

    aput-object p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    .line 923
    array-length p1, v2

    rem-int/2addr v1, p1

    iput v1, p0, Ll/ۢ᩺᩻;->ᩳ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 924
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

.method public final declared-synchronized ֫(I)[B
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 903
    :goto_0
    :try_start_0
    iget-object v2, p0, Ll/ۢ᩺᩻;->֫:[I

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 904
    aget v2, v2, v1

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Ll/ۢ᩺᩻;->ܿ:[[B

    aget-object v2, v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 898
    :goto_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
