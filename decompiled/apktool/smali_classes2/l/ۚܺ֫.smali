.class public abstract Ll/ۚܺ֫;
.super Ljava/lang/Object;
.source "163F"


# instance fields
.field public final ᩶:Ljava/util/LinkedHashSet;

.field public final ᩸:Ljava/util/HashMap;

.field public volatile ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۚܺ֫;->᩸:Ljava/util/HashMap;

    .line 115
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ۚܺ֫;->᩶:Ljava/util/LinkedHashSet;

    const/4 v0, 0x0

    .line 117
    iput-boolean v0, p0, Ll/ۚܺ֫;->᩹:Z

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)V
    .locals 1

    .line 238
    instance-of v0, p0, Ljava/io/Closeable;

    if-eqz v0, :cond_0

    .line 240
    :try_start_0
    check-cast p0, Ljava/io/Closeable;

    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 242
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    const/4 v0, 0x1

    .line 169
    iput-boolean v0, p0, Ll/ۚܺ֫;->᩹:Z

    .line 174
    iget-object v0, p0, Ll/ۚܺ֫;->᩸:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 175
    monitor-enter v0

    .line 176
    :try_start_0
    iget-object v1, p0, Ll/ۚܺ֫;->᩸:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 178
    invoke-static {v2}, Ll/ۚܺ֫;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 180
    :cond_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 183
    :cond_1
    :goto_1
    iget-object v0, p0, Ll/ۚܺ֫;->᩶:Ljava/util/LinkedHashSet;

    if-eqz v0, :cond_3

    .line 184
    monitor-enter v0

    .line 185
    :try_start_1
    iget-object v1, p0, Ll/ۚܺ֫;->᩶:Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/Closeable;

    .line 186
    invoke-static {v2}, Ll/ۚܺ֫;->֫(Ljava/lang/Object;)V

    goto :goto_2

    .line 188
    :cond_2
    monitor-exit v0

    goto :goto_3

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1

    .line 190
    :cond_3
    :goto_3
    invoke-virtual {p0}, Ll/ۚܺ֫;->ܽ()V

    return-void
.end method

.method public final ֫(Ll/ᩳܺ֫;)V
    .locals 4

    const-string v1, "androidx.lifecycle.savedstate.vm.tag"

    .line 208
    iget-object v0, p0, Ll/ۚܺ֫;->᩸:Ljava/util/HashMap;

    monitor-enter v0

    .line 209
    :try_start_0
    iget-object v2, p0, Ll/ۚܺ֫;->᩸:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 211
    iget-object v3, p0, Ll/ۚܺ֫;->᩸:Ljava/util/HashMap;

    invoke-virtual {v3, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v2

    .line 215
    :goto_0
    iget-boolean v0, p0, Ll/ۚܺ֫;->᩹:Z

    if-eqz v0, :cond_2

    .line 219
    invoke-static {p1}, Ll/ۚܺ֫;->֫(Ljava/lang/Object;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 213
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 3

    const-string v1, "androidx.lifecycle.savedstate.vm.tag"

    .line 229
    iget-object v0, p0, Ll/ۚܺ֫;->᩸:Ljava/util/HashMap;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 232
    :cond_0
    monitor-enter v0

    .line 233
    :try_start_0
    iget-object v2, p0, Ll/ۚܺ֫;->᩸:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 234
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method
