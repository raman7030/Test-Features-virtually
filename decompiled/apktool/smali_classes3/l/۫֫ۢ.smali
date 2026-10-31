.class public final Ll/۫֫ۢ;
.super Ljava/lang/Object;
.source "KAQ1"


# static fields
.field public static ܽ:Ljava/lang/ref/WeakReference;


# instance fields
.field public final ֫:Ll/۬ۛ֡;

.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    const-string v0, "/assets/android_dex"

    .line 102
    invoke-static {v0}, Ll/۠۫ۡ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Ll/۬ۛ֡;->֫([B)Ll/۬ۛ֡;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ll/۬ۛ֡;->ܳ()I

    move-result v1

    .line 104
    iput-object v0, p0, Ll/۫֫ۢ;->֫:Ll/۬ۛ֡;

    .line 105
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v2, p0, Ll/۫֫ۢ;->ۧ:Ljava/util/HashMap;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 107
    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->֫(I)I

    move-result v3

    .line 108
    invoke-virtual {v0, v2}, Ll/۬ۛ֡;->ۘ(I)I

    move-result v4

    .line 109
    invoke-virtual {v0, v3}, Ll/۬ۛ֡;->ܺ(I)Ljava/lang/String;

    move-result-object v5

    .line 110
    iget-object v6, p0, Ll/۫֫ۢ;->ۧ:Ljava/util/HashMap;

    new-instance v7, Ll/ۤ֫ۢ;

    invoke-direct {v7, v3, v4}, Ll/ۤ֫ۢ;-><init>(II)V

    invoke-virtual {v6, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 113
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ֫()Ll/۫֫ۢ;
    .locals 3

    .line 81
    sget-object v0, Ll/۫֫ۢ;->ܽ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫֫ۢ;

    if-eqz v0, :cond_0

    return-object v0

    .line 87
    :cond_0
    const-class v0, Ll/۫֫ۢ;

    monitor-enter v0

    .line 88
    :try_start_0
    sget-object v1, Ll/۫֫ۢ;->ܽ:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    .line 89
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫֫ۢ;

    if-eqz v1, :cond_1

    .line 91
    monitor-exit v0

    return-object v1

    .line 94
    :cond_1
    new-instance v1, Ll/۫֫ۢ;

    invoke-direct {v1}, Ll/۫֫ۢ;-><init>()V

    .line 95
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Ll/۫֫ۢ;->ܽ:Ljava/lang/ref/WeakReference;

    .line 96
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 97
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/᩺֫ۢ;
    .locals 3

    .line 119
    iget-object v0, p0, Ll/۫֫ۢ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ֫ۢ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 123
    :cond_0
    new-instance v0, Ll/۠ۛ֡;

    iget v1, p1, Ll/ۤ֫ۢ;->ۧ:I

    iget p1, p1, Ll/ۤ֫ۢ;->֫:I

    iget-object v2, p0, Ll/۫֫ۢ;->֫:Ll/۬ۛ֡;

    invoke-direct {v0, v2, v1, p1}, Ll/۠ۛ֡;-><init>(Ll/۬ۛ֡;II)V

    .line 124
    new-instance p1, Ll/᩺֫ۢ;

    invoke-direct {p1, v0}, Ll/᩺֫ۢ;-><init>(Ll/ۡ֫ۚ;)V

    return-object p1
.end method
