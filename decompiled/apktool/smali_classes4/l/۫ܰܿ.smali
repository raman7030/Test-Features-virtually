.class public final Ll/۫ܰܿ;
.super Ljava/lang/Object;
.source "F70U"

# interfaces
.implements Ll/ۜۧܳ;


# instance fields
.field public final ۗ:I

.field public final ۙ:Ll/ܶ᩺ܿ;

.field public ۤ:Z

.field public final ۫:Ljava/util/ArrayList;

.field public final ۬:Ll/ۨܰܿ;

.field public ᩶:Z

.field public ᩸:Ll/۬ܰܿ;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/ܶ᩺ܿ;)V
    .locals 3

    .line 894
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 886
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫ܰܿ;->۫:Ljava/util/ArrayList;

    const-string v0, "file"

    .line 895
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 896
    iput-object p2, p0, Ll/۫ܰܿ;->ۙ:Ll/ܶ᩺ܿ;

    const p2, 0x7fffffff

    .line 900
    iput p2, p0, Ll/۫ܰܿ;->ۗ:I

    .line 901
    invoke-static {}, Ll/ܳܽܳ;->ۧ()Ll/ܿܽܳ;

    move-result-object p2

    const/4 v0, 0x0

    .line 905
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۜۧ()Ljava/nio/channels/FileChannel;

    move-result-object p1

    const-string v1, "checkpoint channel"

    .line 904
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3

    .line 906
    :try_start_1
    new-instance v0, Ll/ۨܰܿ;

    invoke-direct {v0, p1, p2}, Ll/ۨܰܿ;-><init>(Ljava/nio/channels/FileChannel;Ll/ܿܽܳ;)V

    iput-object v0, p0, Ll/۫ܰܿ;->۬:Ll/ۨܰܿ;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    move-object v2, v0

    move-object v0, p1

    move-object p1, v2

    goto :goto_1

    :catch_3
    move-exception p1

    goto :goto_1

    :catch_4
    move-exception p1

    goto :goto_1

    :catch_5
    move-exception p1

    :goto_1
    if-eqz v0, :cond_0

    .line 910
    :try_start_2
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 913
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 916
    :cond_0
    :goto_2
    :try_start_3
    invoke-virtual {p2}, Ll/ܿܽܳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    .line 918
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 920
    :goto_3
    throw p1
.end method

.method public static bridge synthetic ֫(Ll/۫ܰܿ;)Ll/ۨܰܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ܰܿ;->۬:Ll/ۨܰܿ;

    return-object p0
.end method

.method public static ֫(Ll/۫ܰܿ;Ll/۬ܰܿ;)V
    .locals 1

    .line 956
    iget-object v0, p0, Ll/۫ܰܿ;->᩸:Ll/۬ܰܿ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 959
    iput-object p1, p0, Ll/۫ܰܿ;->᩸:Ll/۬ܰܿ;

    return-void

    .line 957
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Hex restore delta entry is not active"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/۫ܰܿ;)V
    .locals 1

    .line 1036
    iget-boolean v0, p0, Ll/۫ܰܿ;->᩹:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/۫ܰܿ;->᩶:Z

    if-nez v0, :cond_0

    iget-boolean p0, p0, Ll/۫ܰܿ;->ۤ:Z

    if-nez p0, :cond_0

    return-void

    .line 1037
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Hex restore delta store is not writable"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 989
    iget-boolean v0, p0, Ll/۫ܰܿ;->᩹:Z

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x1

    .line 992
    iput-boolean v0, p0, Ll/۫ܰܿ;->᩹:Z

    .line 994
    iget-object v1, p0, Ll/۫ܰܿ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    :goto_0
    if-ltz v2, :cond_2

    .line 996
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗܰܿ;

    invoke-virtual {v3}, Ll/ۗܰܿ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-nez v0, :cond_1

    move-object v0, v3

    goto :goto_1

    .line 1001
    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 1005
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1007
    :try_start_1
    iget-object v1, p0, Ll/۫ܰܿ;->۬:Ll/ۨܰܿ;

    invoke-virtual {v1}, Ll/ۨܰܿ;->ۧ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    if-nez v0, :cond_3

    move-object v0, v1

    goto :goto_2

    .line 1012
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    if-eqz v0, :cond_7

    .line 1022
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_6

    .line 1025
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_5

    .line 1028
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/lang/Error;

    .line 1029
    throw v0

    .line 1031
    :cond_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Unable to close hex restore delta store"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1025
    :cond_5
    check-cast v0, Ljava/lang/RuntimeException;

    .line 1026
    throw v0

    .line 1022
    :cond_6
    check-cast v0, Ljava/io/IOException;

    .line 1023
    throw v0

    :cond_7
    :goto_3
    return-void
.end method

.method public final finish()V
    .locals 2

    .line 965
    iget-boolean v0, p0, Ll/۫ܰܿ;->᩹:Z

    if-nez v0, :cond_1

    .line 968
    iget-object v0, p0, Ll/۫ܰܿ;->᩸:Ll/۬ܰܿ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 971
    iput-boolean v0, p0, Ll/۫ܰܿ;->᩶:Z

    return-void

    .line 969
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Hex restore delta entry is incomplete"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 966
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Hex restore delta store is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ֫()V
    .locals 2

    .line 977
    iget-boolean v0, p0, Ll/۫ܰܿ;->᩹:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/۫ܰܿ;->ۤ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/۫ܰܿ;->᩶:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۫ܰܿ;->᩸:Ll/۬ܰܿ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 980
    iput-boolean v0, p0, Ll/۫ܰܿ;->ۤ:Z

    .line 981
    iput-boolean v0, p0, Ll/۫ܰܿ;->᩹:Z

    .line 982
    iget-object v0, p0, Ll/۫ܰܿ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 983
    iget-object v0, p0, Ll/۫ܰܿ;->۬:Ll/ۨܰܿ;

    invoke-virtual {v0}, Ll/ۨܰܿ;->ۧ()V

    return-void

    .line 978
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Hex restore delta store is not transferable"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܿ(I)Ll/ܳۧܳ;
    .locals 3

    .line 1036
    iget-boolean v0, p0, Ll/۫ܰܿ;->᩹:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/۫ܰܿ;->᩶:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/۫ܰܿ;->ۤ:Z

    if-nez v0, :cond_3

    .line 928
    iget-object v0, p0, Ll/۫ܰܿ;->᩸:Ll/۬ܰܿ;

    if-nez v0, :cond_2

    if-lez p1, :cond_1

    .line 931
    iget v0, p0, Ll/۫ܰܿ;->ۗ:I

    if-gt p1, v0, :cond_1

    const/4 v0, 0x0

    .line 936
    :try_start_0
    new-instance v1, Ll/ۗܰܿ;

    iget-object v2, p0, Ll/۫ܰܿ;->۬:Ll/ۨܰܿ;

    invoke-direct {v1, v2, p1}, Ll/ۗܰܿ;-><init>(Ll/ۨܰܿ;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3

    .line 937
    :try_start_1
    new-instance v0, Ll/۬ܰܿ;

    iget-object v2, p0, Ll/۫ܰܿ;->ۙ:Ll/ܶ᩺ܿ;

    invoke-direct {v0, p0, v1, v2, p1}, Ll/۬ܰܿ;-><init>(Ll/۫ܰܿ;Ll/ۗܰܿ;Ll/ܶ᩺ܿ;I)V

    .line 939
    iget-object p1, p0, Ll/۫ܰܿ;->۫:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 940
    iput-object v0, p0, Ll/۫ܰܿ;->᩸:Ll/۬ܰܿ;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    move-object v0, v1

    goto :goto_1

    :catch_3
    move-exception p1

    goto :goto_1

    :catch_4
    move-exception p1

    goto :goto_1

    :catch_5
    move-exception p1

    :goto_1
    if-eqz v0, :cond_0

    .line 945
    :try_start_2
    invoke-virtual {v0}, Ll/ۗܰܿ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6

    goto :goto_2

    :catch_6
    move-exception v0

    .line 947
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 950
    :cond_0
    :goto_2
    throw p1

    .line 932
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid hex restore delta entry length"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 929
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Previous hex restore delta entry is unfinished"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1037
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Hex restore delta store is not writable"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
