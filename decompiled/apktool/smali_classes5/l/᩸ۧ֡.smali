.class public final Ll/᩸ۧ֡;
.super Ll/ܶ۟᩵;
.source "I4F9"


# instance fields
.field public final synthetic ᩶:Ll/᩹ۧ֡;

.field public final ᩹:Ll/ۙۧ֡;


# direct methods
.method public constructor <init>(Ll/᩹ۧ֡;Ll/ۙۧ֡;)V
    .locals 2

    .line 668
    iput-object p1, p0, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    .line 669
    iget-object p1, p1, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s"

    invoke-direct {p0, p1, v0}, Ll/ܶ۟᩵;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 670
    iput-object p2, p0, Ll/᩸ۧ֡;->᩹:Ll/ۙۧ֡;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 674
    iget-object v0, p0, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    iget-object v1, p0, Ll/᩸ۧ֡;->᩹:Ll/ۙۧ֡;

    sget-object v2, Ll/ܰ֫֡;->ۨ:Ll/ܰ֫֡;

    const/4 v3, 0x1

    .line 80
    :try_start_0
    invoke-virtual {v1, v3, p0}, Ll/ۙۧ֡;->֫(ZLl/᩸ۧ֡;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 678
    :goto_0
    invoke-virtual {v1, v4, p0}, Ll/ۙۧ֡;->֫(ZLl/᩸ۧ֡;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 680
    :cond_0
    sget-object v3, Ll/ܰ֫֡;->᩺:Ll/ܰ֫֡;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 681
    :try_start_1
    sget-object v2, Ll/ܰ֫֡;->᩶:Ll/ܰ֫֡;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 687
    :try_start_2
    invoke-virtual {v0, v3, v2}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catchall_0
    move-exception v3

    goto :goto_1

    :cond_1
    :try_start_3
    const-string v3, "Required SETTINGS preface not received"

    new-array v4, v4, [Ljava/lang/Object;

    .line 81
    invoke-static {v3, v4}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v3, 0x0

    throw v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    move-object v4, v3

    move-object v3, v2

    goto :goto_3

    :catch_0
    move-object v3, v2

    .line 683
    :catch_1
    :try_start_4
    sget-object v2, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 687
    :try_start_5
    invoke-virtual {v0, v2, v2}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 690
    :catch_2
    :goto_2
    invoke-static {v1}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception v4

    .line 687
    :goto_3
    :try_start_6
    invoke-virtual {v0, v3, v2}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 690
    :catch_3
    invoke-static {v1}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    throw v4
.end method
