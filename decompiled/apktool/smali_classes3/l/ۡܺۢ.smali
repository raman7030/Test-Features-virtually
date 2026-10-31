.class public Ll/ۡܺۢ;
.super Ll/ۧ᩶;
.source "F1PL"


# static fields
.field public static final ۛ:Ll/ܿ۟᩵;

.field public static final ۤ:Ll/ᩴ᩵;

.field public static final ۨ:Ll/ᩴ᩵;

.field public static ܰ:Ljava/util/HashMap;

.field public static final ᩺:Ll/ᩴ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 42
    new-instance v0, Ll/ᩴ᩵;

    invoke-direct {v0}, Ll/ᩴ᩵;-><init>()V

    sput-object v0, Ll/ۡܺۢ;->ۨ:Ll/ᩴ᩵;

    .line 43
    new-instance v0, Ll/ᩴ᩵;

    invoke-direct {v0}, Ll/ᩴ᩵;-><init>()V

    sput-object v0, Ll/ۡܺۢ;->᩺:Ll/ᩴ᩵;

    .line 44
    new-instance v0, Ll/ᩴ᩵;

    invoke-direct {v0}, Ll/ᩴ᩵;-><init>()V

    sput-object v0, Ll/ۡܺۢ;->ۤ:Ll/ᩴ᩵;

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۡܺۢ;->ܰ:Ljava/util/HashMap;

    .line 49
    invoke-static {}, Ll/۠ۛۡ;->֫()Ll/ᩳ۟᩵;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    .line 50
    invoke-virtual {v0, v2, v3, v1}, Ll/ᩳ۟᩵;->ۧ(JLjava/util/concurrent/TimeUnit;)V

    .line 51
    invoke-virtual {v0, v2, v3, v1}, Ll/ᩳ۟᩵;->ܽ(JLjava/util/concurrent/TimeUnit;)V

    .line 52
    invoke-virtual {v0, v2, v3, v1}, Ll/ᩳ۟᩵;->֫(JLjava/util/concurrent/TimeUnit;)V

    new-instance v1, Ll/ܶۛۡ;

    invoke-direct {v1}, Ll/ܶۛۡ;-><init>()V

    .line 53
    invoke-virtual {v0, v1}, Ll/ᩳ۟᩵;->֫(Ljavax/net/SocketFactory;)V

    new-instance v1, Ll/ۛۚ᩷;

    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {v0, v1}, Ll/ᩳ۟᩵;->֫(Ll/᩺ܰ᩵;)V

    .line 55
    invoke-virtual {v0}, Ll/ᩳ۟᩵;->֫()Ll/ܿ۟᩵;

    move-result-object v0

    sput-object v0, Ll/ۡܺۢ;->ۛ:Ll/ܿ۟᩵;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ll/ۧ᩶;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 1

    .line 156
    sget-object v0, Ll/ۡܺۢ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜܺۢ;

    if-nez v0, :cond_1

    .line 158
    sget-object v0, Ll/ۡܺۢ;->ۨ:Ll/ᩴ᩵;

    invoke-virtual {v0, p0}, Ll/ᩴ᩵;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/16 p0, 0x64

    return p0

    .line 162
    :cond_1
    invoke-static {v0}, Ll/ۜܺۢ;->֫(Ll/ۜܺۢ;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ܽܺۢ;)Z
    .locals 2

    .line 68
    sget-object v0, Ll/ۡܺۢ;->ܰ:Ljava/util/HashMap;

    iget-object v1, p0, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ۡܺۢ;->᩺:Ll/ᩴ᩵;

    iget-object v1, p0, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ᩴ᩵;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 70
    :cond_0
    sget-object v0, Ll/ۡܺۢ;->ۨ:Ll/ᩴ᩵;

    iget-object v1, p0, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    .line 71
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 72
    new-instance v1, Ll/ۢܺۢ;

    invoke-direct {v1, p0}, Ll/ۢܺۢ;-><init>(Ll/ܽܺۢ;)V

    const-string p0, "task"

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 73
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p0

    invoke-static {p0, v0}, Ll/ۧ᩶;->֫(Landroid/app/Application;Landroid/content/Intent;)V

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 152
    sget-object v0, Ll/ۡܺۢ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;)V
    .locals 12

    const-string v0, "taskID"

    const-string v1, "Unexpected response code "

    const-string v2, "task"

    .line 79
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ll/ۢܺۢ;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    iget-object v2, p1, Ll/ۢܺۢ;->ۙ:Ljava/lang/String;

    sget-object v3, Ll/ۡܺۢ;->ۨ:Ll/ᩴ᩵;

    invoke-virtual {v3, v2}, Ll/ᩴ᩵;->remove(Ljava/lang/Object;)Z

    .line 81
    sget-object v3, Ll/ۡܺۢ;->ۤ:Ll/ᩴ᩵;

    invoke-virtual {v3, v2}, Ll/ᩴ᩵;->remove(Ljava/lang/Object;)Z

    .line 82
    sget-object v4, Ll/ۡܺۢ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    invoke-static {}, Ll/ܿܺۢ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 85
    invoke-virtual {v5, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    const-string v6, "packageUpload"

    .line 86
    invoke-virtual {v5, v6}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    const-string v7, "key"

    .line 88
    invoke-virtual {v5, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 89
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v8

    if-nez v8, :cond_1

    :goto_0
    return-void

    .line 92
    :cond_1
    new-instance v8, Ll/ۜܺۢ;

    invoke-direct {v8, v2}, Ll/ۜܺۢ;-><init>(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v4, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    const-string v9, "error"

    .line 95
    invoke-virtual {v5, v9}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->۬()Z

    .line 97
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 98
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v1

    const/16 v5, 0x64

    .line 99
    invoke-virtual {v8, v5}, Ll/ۜܺۢ;->֫(I)V

    goto :goto_1

    .line 101
    :cond_2
    iget-object v5, p1, Ll/ۢܺۢ;->᩶:Ljava/lang/String;

    invoke-static {v6, v5}, Ll/֫ܺۢ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 102
    new-instance v9, Ll/᩵ۛۡ;

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v10

    invoke-direct {v9, v10, v11}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v10, Ll/ܳܺۢ;

    invoke-direct {v10, v8}, Ll/ܳܺۢ;-><init>(Ll/ۜܺۢ;)V

    invoke-virtual {v9, v10}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 103
    new-instance v8, Ll/᩻ܺۢ;

    .line 28
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object v2, v8, Ll/᩻ܺۢ;->ᩳ:Ljava/lang/String;

    .line 175
    iput-object v6, v8, Ll/᩻ܺۢ;->ۧ:Ll/ܶ᩵ܿ;

    .line 176
    iput-object v9, v8, Ll/᩻ܺۢ;->ܽ:Ll/᩵ۛۡ;

    .line 104
    new-instance v9, Ll/ۢ۟᩵;

    invoke-direct {v9}, Ll/ۢ۟᩵;-><init>()V

    const/4 v10, 0x0

    aget-object v10, v5, v10

    .line 105
    invoke-virtual {v9, v10}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    const-string v10, "PUT"

    .line 244
    invoke-virtual {v9, v10, v8}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    const-string v10, "Content-Md5"

    const/4 v11, 0x2

    .line 106
    aget-object v11, v5, v11

    .line 107
    invoke-virtual {v9, v10, v11}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-virtual {v9}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v9

    .line 109
    sget-object v10, Ll/ۡܺۢ;->ۛ:Ll/ܿ۟᩵;

    invoke-virtual {v10, v9}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v9

    .line 110
    iput-object v9, v8, Ll/᩻ܺۢ;->֫:Ll/ܽܰ᩵;

    .line 111
    invoke-interface {v9}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v8

    .line 112
    invoke-interface {v9}, Ll/ܽܰ᩵;->᩻()Z

    move-result v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v9, :cond_3

    .line 146
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 114
    :cond_3
    :try_start_1
    invoke-virtual {v8}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v9

    if-eqz v9, :cond_5

    const/4 v1, 0x1

    .line 121
    aget-object v1, v5, v1

    .line 122
    invoke-virtual {v7, v1}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V

    .line 124
    :goto_1
    invoke-virtual {v3, v2}, Ll/ᩴ᩵;->contains(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_4

    .line 146
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 127
    :cond_4
    :try_start_2
    invoke-static {v1, p1}, Ll/֫ܺۢ;->֫(Ljava/lang/String;Ll/ۢܺۢ;)I

    move-result p1

    .line 128
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۬()Z

    .line 129
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->۬()Z

    .line 131
    sget-object v1, Ll/ۡܺۢ;->᩺:Ll/ᩴ᩵;

    invoke-virtual {v1, v2}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    .line 133
    new-instance v1, Landroid/content/Intent;

    const-string v3, "bin.mt.protect.ProtectUploadService.ACTION_SUCCESS"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "id"

    .line 135
    invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 136
    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 119
    :cond_5
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 139
    :try_start_4
    new-instance v1, Landroid/content/Intent;

    const-string v3, "bin.mt.protect.ProtectUploadService.ACTION_FAIL"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    instance-of v0, p1, Ll/֫ۛۡ;

    if-nez v0, :cond_6

    instance-of v0, p1, Ll/᩵ۤۡ;

    if-eqz v0, :cond_7

    :cond_6
    const-string v0, "message"

    .line 142
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 144
    :cond_7
    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 146
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :goto_2
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    throw p1
.end method
