.class public final Ll/֫ܰܿ;
.super Ljava/lang/Object;
.source "X4ZQ"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:I

.field public final ۙ:Ll/ᩳܽܳ;

.field public final ۛ:I

.field public ۤ:Ll/ۢܽܳ;

.field public ۨ:Ll/ܺܽܳ;

.field public final ۫:Ll/ۧܰܿ;

.field public ۬:Z

.field public final ܰ:Ll/ܽܽܳ;

.field public ᩶:Z

.field public final ᩸:Ll/ۢܽܳ;

.field public final ᩹:Ll/᩷ܽܳ;

.field public final ᩺:I


# direct methods
.method public constructor <init>(Ll/ۧܰܿ;Ll/ۢܽܳ;Ll/᩷ܽܳ;Ll/ᩳܽܳ;Ll/ܽܽܳ;III)V
    .locals 0

    .line 874
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 875
    iput-object p1, p0, Ll/֫ܰܿ;->۫:Ll/ۧܰܿ;

    .line 876
    iput-object p2, p0, Ll/֫ܰܿ;->᩸:Ll/ۢܽܳ;

    .line 877
    iput-object p3, p0, Ll/֫ܰܿ;->᩹:Ll/᩷ܽܳ;

    .line 878
    iput-object p4, p0, Ll/֫ܰܿ;->ۙ:Ll/ᩳܽܳ;

    .line 879
    iput-object p5, p0, Ll/֫ܰܿ;->ܰ:Ll/ܽܽܳ;

    .line 880
    iput p6, p0, Ll/֫ܰܿ;->᩺:I

    .line 881
    iput p7, p0, Ll/֫ܰܿ;->ۗ:I

    .line 882
    iput p8, p0, Ll/֫ܰܿ;->ۛ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ܰܿ;)Ll/ۢܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܰܿ;->᩸:Ll/ۢܽܳ;

    return-object p0
.end method

.method public static bridge synthetic ۜ(Ll/֫ܰܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ܰܿ;->᩺:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/֫ܰܿ;)Ll/ᩳܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܰܿ;->ۙ:Ll/ᩳܽܳ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/֫ܰܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ܰܿ;->ۛ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/֫ܰܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ܰܿ;->ۗ:I

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/֫ܰܿ;)Ll/ۢܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܰܿ;->ۤ:Ll/ۢܽܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֫ܰܿ;)Ll/ۧܰܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܰܿ;->۫:Ll/ۧܰܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/֫ܰܿ;)Ll/ܺܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ܰܿ;->ۨ:Ll/ܺܽܳ;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 924
    :try_start_0
    iget-boolean v1, p0, Ll/֫ܰܿ;->᩶:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 925
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 927
    :try_start_1
    iput-boolean v1, p0, Ll/֫ܰܿ;->᩶:Z

    .line 928
    iget-object v1, p0, Ll/֫ܰܿ;->ܰ:Ll/ܽܽܳ;

    invoke-virtual {v1}, Ll/ܽܽܳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 931
    :try_start_2
    iget-object v1, p0, Ll/֫ܰܿ;->᩹:Ll/᩷ܽܳ;

    invoke-virtual {v1}, Ll/᩷ܽܳ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 936
    :goto_0
    :try_start_3
    iget-object v2, p0, Ll/֫ܰܿ;->ۨ:Ll/ܺܽܳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v2, :cond_2

    .line 938
    :try_start_4
    invoke-virtual {v2}, Ll/ܺܽܳ;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    :catch_1
    move-exception v2

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_1

    .line 943
    :cond_1
    :try_start_5
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 947
    :cond_2
    :goto_1
    iget-object v2, p0, Ll/֫ܰܿ;->ۤ:Ll/ۢܽܳ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v2, :cond_4

    .line 949
    :try_start_6
    invoke-virtual {v2}, Ll/ۢܽܳ;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_2

    :catch_2
    move-exception v2

    if-nez v1, :cond_3

    move-object v1, v2

    goto :goto_2

    .line 954
    :cond_3
    :try_start_7
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_4
    :goto_2
    if-nez v1, :cond_5

    .line 961
    monitor-exit v0

    return-void

    .line 959
    :cond_5
    :try_start_8
    throw v1

    :catchall_0
    move-exception v1

    .line 961
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/᩻۟ܿ;)V
    .locals 4

    .line 887
    monitor-enter p0

    .line 888
    :try_start_0
    iget-boolean v0, p0, Ll/֫ܰܿ;->᩶:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֫ܰܿ;->۬:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    .line 891
    iput-boolean v0, p0, Ll/֫ܰܿ;->۬:Z

    .line 892
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v0, 0x0

    .line 896
    :try_start_1
    iget-object v1, p0, Ll/֫ܰܿ;->᩹:Ll/᩷ܽܳ;

    invoke-virtual {v1, p1}, Ll/᩷ܽܳ;->֫(Ll/᩻۟ܿ;)Ll/ۢܽܳ;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 897
    :try_start_2
    iget-object v2, p0, Ll/֫ܰܿ;->ܰ:Ll/ܽܽܳ;

    invoke-virtual {v2, p1}, Ll/ܽܽܳ;->֫(Ll/ܿۖ᩷;)Ll/ܺܽܳ;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 898
    :try_start_3
    monitor-enter p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 899
    :try_start_4
    iget-boolean v2, p0, Ll/֫ܰܿ;->᩶:Z

    if-nez v2, :cond_0

    .line 902
    iput-object v1, p0, Ll/֫ܰܿ;->ۤ:Ll/ۢܽܳ;

    .line 903
    iput-object p1, p0, Ll/֫ܰܿ;->ۨ:Ll/ܺܽܳ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 906
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 912
    iget-object p1, p0, Ll/֫ܰܿ;->ܰ:Ll/ܽܽܳ;

    invoke-virtual {p1}, Ll/ܽܽܳ;->close()V

    .line 914
    :try_start_6
    iget-object p1, p0, Ll/֫ܰܿ;->᩹:Ll/᩷ܽܳ;

    invoke-virtual {p1}, Ll/᩷ܽܳ;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    move-object v1, v0

    goto :goto_0

    .line 900
    :cond_0
    :try_start_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Paste request is closed"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    move-object v0, p1

    move-object p1, v3

    .line 906
    :goto_0
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    throw p1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_3

    :catch_3
    move-exception p1

    goto :goto_3

    :catchall_2
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception v0

    goto :goto_1

    :catch_5
    move-exception v0

    goto :goto_1

    :catch_6
    move-exception v0

    :goto_1
    move-object v3, v0

    move-object v0, p1

    move-object p1, v3

    goto :goto_3

    :catchall_3
    move-exception p1

    goto :goto_6

    :catch_7
    move-exception p1

    goto :goto_2

    :catch_8
    move-exception p1

    goto :goto_2

    :catch_9
    move-exception p1

    :goto_2
    move-object v1, v0

    :goto_3
    if-eqz v0, :cond_1

    .line 561
    :try_start_a
    invoke-virtual {v0}, Ll/ܺܽܳ;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_4

    :catch_a
    move-exception v0

    .line 563
    :try_start_b
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :cond_1
    :goto_4
    if-eqz v1, :cond_2

    .line 568
    :try_start_c
    invoke-virtual {v1}, Ll/ۢܽܳ;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_b
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_5

    :catch_b
    move-exception v0

    .line 570
    :try_start_d
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 909
    :cond_2
    :goto_5
    throw p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 912
    :goto_6
    iget-object v0, p0, Ll/֫ܰܿ;->ܰ:Ll/ܽܽܳ;

    invoke-virtual {v0}, Ll/ܽܽܳ;->close()V

    .line 914
    :try_start_e
    iget-object v0, p0, Ll/֫ܰܿ;->᩹:Ll/᩷ܽܳ;

    invoke-virtual {v0}, Ll/᩷ܽܳ;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_c

    .line 919
    :catch_c
    throw p1

    .line 889
    :cond_3
    :try_start_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Paste request is already consumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_4
    move-exception p1

    .line 892
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    throw p1
.end method
