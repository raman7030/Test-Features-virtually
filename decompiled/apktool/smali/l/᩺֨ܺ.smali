.class public final Ll/᩺֨ܺ;
.super Ljava/lang/Object;
.source "V4HZ"


# direct methods
.method public static ֫(Landroid/content/Context;)V
    .locals 15

    .line 70
    new-instance v5, Ll/۟֨ܺ;

    invoke-direct {v5}, Ll/۟֨ܺ;-><init>()V

    if-eqz p0, :cond_9

    const-string v6, "pl_droidsonroids_gif"

    .line 33
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    const-string v3, "Beginning load of %s..."

    .line 134
    invoke-static {v3, v1}, Ll/۟֨ܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    iget-object v7, v5, Ll/۟֨ܺ;->ۧ:Ll/ۨ֨ܺ;

    iget-object v8, v5, Ll/۟֨ܺ;->ܽ:Ljava/util/HashSet;

    invoke-virtual {v8, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-array p0, v0, [Ljava/lang/Object;

    aput-object v6, p0, v2

    const-string v0, "%s already loaded previously!"

    .line 158
    invoke-static {v0, p0}, Ll/۟֨ܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_0
    const/4 v9, 0x2

    const/4 v10, 0x0

    .line 163
    :try_start_0
    move-object v1, v7

    check-cast v1, Ll/֫۠ܺ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-static {v6}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v8, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "%s (%s) was loaded normally!"

    new-array v3, v9, [Ljava/lang/Object;

    aput-object v6, v3, v2

    aput-object v10, v3, v0

    .line 165
    invoke-static {v1, v3}, Ll/۟֨ܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception v1

    .line 169
    invoke-static {v1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v0, [Ljava/lang/Object;

    aput-object v1, v3, v2

    const-string v1, "Loading the library normally failed: %s"

    invoke-static {v1, v3}, Ll/۟֨ܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    new-array v1, v9, [Ljava/lang/Object;

    aput-object v6, v1, v2

    aput-object v10, v1, v0

    const-string v0, "%s (%s) was not loaded normally, re-linking..."

    .line 172
    invoke-static {v0, v1}, Ll/۟֨ܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    invoke-virtual {v5, p0}, Ll/۟֨ܺ;->֫(Landroid/content/Context;)Ljava/io/File;

    move-result-object v11

    .line 174
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p0, 0x1

    const/4 v0, 0x0

    goto/16 :goto_6

    :cond_1
    const-string v0, "lib"

    .line 217
    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    .line 251
    invoke-virtual {v5, p0}, Ll/۟֨ܺ;->֫(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    .line 252
    move-object v2, v7

    check-cast v2, Ll/֫۠ܺ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    invoke-static {v6}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 253
    new-instance v4, Ll/ܰ֨ܺ;

    invoke-direct {v4, v3}, Ll/ܰ֨ܺ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    .line 262
    :cond_2
    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_4

    aget-object v12, v0, v4

    .line 263
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    .line 264
    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    const/4 v12, 0x1

    const/4 v13, 0x0

    .line 180
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    array-length v1, v0

    if-lez v1, :cond_5

    :goto_3
    move-object v3, v0

    goto :goto_5

    .line 54
    :cond_5
    sget-object v0, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    .line 55
    :cond_6
    sget-object v1, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 57
    :cond_7
    :goto_4
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 181
    :goto_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    invoke-static {v6}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 180
    iget-object v0, v5, Ll/۟֨ܺ;->֫:Ll/ۤ֨ܺ;

    move-object v1, p0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v11

    invoke-virtual/range {v0 .. v5}, Ll/ۤ֨ܺ;->֫(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ll/۟֨ܺ;)V

    goto :goto_0

    .line 206
    :goto_6
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    check-cast v7, Ll/֫۠ܺ;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-static {v1}, Ljava/lang/System;->load(Ljava/lang/String;)V

    .line 207
    invoke-virtual {v8, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-array v1, v9, [Ljava/lang/Object;

    .line 208
    aput-object v6, v1, v0

    aput-object v10, v1, p0

    const-string p0, "%s (%s) was re-linked!"

    invoke-static {p0, v1}, Ll/۟֨ܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_7
    return-void

    .line 131
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given library is either null or empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 127
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given context is null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
