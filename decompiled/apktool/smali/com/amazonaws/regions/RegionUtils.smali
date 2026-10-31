.class public Lcom/amazonaws/regions/RegionUtils;
.super Ljava/lang/Object;
.source "RegionUtils.java"


# static fields
.field public static final ֫:Lcom/amazonaws/logging/Log;

.field public static ۧ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "com.amazonaws.request"

    .line 41
    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/String;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/regions/RegionUtils;->֫:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Lcom/amazonaws/regions/Region;
    .locals 3

    .line 77
    const-class v0, Lcom/amazonaws/regions/RegionUtils;

    monitor-enter v0

    .line 47
    :try_start_0
    sget-object v1, Lcom/amazonaws/regions/RegionUtils;->ۧ:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 48
    invoke-static {}, Lcom/amazonaws/regions/RegionUtils;->֫()V

    .line 51
    :cond_0
    sget-object v1, Lcom/amazonaws/regions/RegionUtils;->ۧ:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    .line 77
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/regions/Region;

    .line 78
    invoke-virtual {v1}, Lcom/amazonaws/regions/Region;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    .line 51
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ֫()V
    .locals 4

    .line 2
    const-class v0, Lcom/amazonaws/regions/RegionUtils;

    .line 3
    monitor-enter v0

    :try_start_0
    const-string v1, "com.amazonaws.regions.RegionUtils.fileOverride"

    .line 125
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 127
    :try_start_1
    invoke-static {}, Lcom/amazonaws/regions/RegionUtils;->ۧ()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 129
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Couldn\'t find regions override file specified"

    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 134
    :cond_0
    :goto_0
    sget-object v1, Lcom/amazonaws/regions/RegionUtils;->ۧ:Ljava/util/ArrayList;

    if-nez v1, :cond_2

    .line 175
    sget-object v1, Lcom/amazonaws/regions/RegionUtils;->֫:Lcom/amazonaws/logging/Log;

    invoke-interface {v1}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Initializing the regions with default regions"

    .line 176
    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 178
    :cond_1
    invoke-static {}, Lcom/amazonaws/regions/RegionDefaults;->֫()Ljava/util/ArrayList;

    move-result-object v1

    sput-object v1, Lcom/amazonaws/regions/RegionUtils;->ۧ:Ljava/util/ArrayList;

    .line 138
    :cond_2
    sget-object v1, Lcom/amazonaws/regions/RegionUtils;->ۧ:Ljava/util/ArrayList;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    .line 141
    monitor-exit v0

    return-void

    .line 139
    :cond_3
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to initialize the regions."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 141
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public static ۧ()V
    .locals 4

    const-string v0, "com.amazonaws.regions.RegionUtils.fileOverride"

    .line 144
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 145
    sget-object v1, Lcom/amazonaws/regions/RegionUtils;->֫:Lcom/amazonaws/logging/Log;

    invoke-interface {v1}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 146
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Using local override of the regions file ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ") to initiate regions data..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 150
    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 151
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 163
    :try_start_0
    new-instance v2, Lcom/amazonaws/regions/RegionMetadataParser;

    invoke-direct {v2}, Lcom/amazonaws/regions/RegionMetadataParser;-><init>()V

    .line 164
    invoke-static {v0}, Lcom/amazonaws/regions/RegionMetadataParser;->֫(Ljava/io/FileInputStream;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/regions/RegionUtils;->ۧ:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v2, "Failed to parse regional endpoints"

    .line 166
    invoke-interface {v1, v2, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method
