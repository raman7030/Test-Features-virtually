.class public final Ll/ۤ֨ܺ;
.super Ljava/lang/Object;
.source "ABKA"


# direct methods
.method public static ֫(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Ll/۫֨ܺ;
    .locals 13

    .line 72
    invoke-static {p0}, Ll/ۤ֨ܺ;->֫(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_5

    aget-object v4, p0, v2

    const/4 v5, 0x0

    :goto_1
    add-int/lit8 v6, v5, 0x1

    const/4 v7, 0x5

    const/4 v8, 0x1

    if-ge v5, v7, :cond_0

    .line 77
    :try_start_0
    new-instance v5, Ljava/util/zip/ZipFile;

    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v5, v9, v8}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v5

    goto :goto_2

    :catch_0
    move v5, v6

    goto :goto_1

    :cond_0
    :goto_2
    if-nez v3, :cond_1

    goto :goto_5

    :cond_1
    const/4 v5, 0x0

    :goto_3
    add-int/lit8 v6, v5, 0x1

    if-ge v5, v7, :cond_4

    .line 92
    array-length v5, p1

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v5, :cond_3

    aget-object v10, p1, v9

    .line 93
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "lib"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-char v12, Ljava/io/File;->separatorChar:C

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v10, v11, v1

    aput-object v4, v11, v8

    const-string v12, "Looking for %s in APK %s..."

    .line 96
    invoke-static {v12, v11}, Ll/۟֨ܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-virtual {v3, v10}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v10

    if-eqz v10, :cond_2

    .line 101
    new-instance p0, Ll/۫֨ܺ;

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object v3, p0, Ll/۫֨ܺ;->ۧ:Ljava/util/zip/ZipFile;

    .line 63
    iput-object v10, p0, Ll/۫֨ܺ;->֫:Ljava/util/zip/ZipEntry;

    return-object p0

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_3
    move v5, v6

    goto :goto_3

    .line 107
    :cond_4
    :try_start_1
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-object v3
.end method

.method public static ֫(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 259
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ֫(Landroid/content/Context;)[Ljava/lang/String;
    .locals 4

    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    .line 45
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-eqz v1, :cond_0

    .line 48
    array-length v1, v0

    const/4 v2, 0x1

    add-int/2addr v1, v2

    new-array v1, v1, [Ljava/lang/String;

    .line 49
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p0, v1, v3

    .line 50
    array-length p0, v0

    invoke-static {v0, v3, v1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    .line 53
    :cond_0
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
    .locals 7

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "lib"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-char v1, Ljava/io/File;->separatorChar:C

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "([^\\"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "]*)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 121
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    .line 123
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 124
    invoke-static {p0}, Ll/ۤ֨ܺ;->֫(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    .line 126
    :try_start_0
    new-instance v4, Ljava/util/zip/ZipFile;

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-direct {v4, v5, v3}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v4

    .line 132
    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 133
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/zip/ZipEntry;

    .line 134
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 135
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 136
    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 141
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    .line 142
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ll/۟֨ܺ;)V
    .locals 10

    const/4 p5, 0x0

    .line 162
    :try_start_0
    invoke-static {p1, p2, p3}, Ll/ۤ֨ܺ;->֫(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Ll/۫֨ܺ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v0, :cond_4

    .line 163
    iget-object p1, v0, Ll/۫֨ܺ;->ۧ:Ljava/util/zip/ZipFile;

    const/4 p2, 0x0

    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    const/4 v3, 0x5

    if-ge v1, v3, :cond_3

    :try_start_1
    const-string v1, "Found %s! Extracting..."

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    aput-object p3, v4, p2

    .line 180
    invoke-static {v1, v4}, Ll/۟֨ܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 182
    :try_start_2
    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p4}, Ljava/io/File;->createNewFile()Z

    move-result v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-nez v1, :cond_0

    goto :goto_5

    .line 193
    :cond_0
    :try_start_3
    iget-object v1, v0, Ll/۫֨ܺ;->֫:Ljava/util/zip/ZipEntry;

    invoke-virtual {p1, v1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 194
    :try_start_4
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, p4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const/16 v5, 0x1000

    :try_start_5
    new-array v5, v5, [B

    const-wide/16 v6, 0x0

    .line 241
    :goto_1
    invoke-virtual {v1, v5}, Ljava/io/InputStream;->read([B)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_2

    .line 248
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 196
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/FileDescriptor;->sync()V

    .line 197
    invoke-virtual {p4}, Ljava/io/File;->length()J

    move-result-wide v8
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    cmp-long v5, v6, v8

    if-eqz v5, :cond_1

    goto :goto_4

    .line 208
    :cond_1
    :try_start_6
    invoke-static {v1}, Ll/ۤ֨ܺ;->֫(Ljava/io/Closeable;)V

    .line 209
    invoke-static {v4}, Ll/ۤ֨ܺ;->֫(Ljava/io/Closeable;)V

    .line 213
    invoke-virtual {p4, v3, p2}, Ljava/io/File;->setReadable(ZZ)Z

    .line 214
    invoke-virtual {p4, v3, p2}, Ljava/io/File;->setExecutable(ZZ)Z

    .line 215
    invoke-virtual {p4, v3}, Ljava/io/File;->setWritable(Z)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_6

    .line 245
    :cond_2
    :try_start_7
    invoke-virtual {v4, v5, p2, v8}, Ljava/io/OutputStream;->write([BII)V
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    int-to-long v8, v8

    add-long/2addr v6, v8

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object p5, v4

    goto :goto_2

    :catchall_1
    move-exception p1

    :goto_2
    move-object p2, p5

    move-object p5, v1

    goto :goto_3

    :catch_0
    move-object v4, p5

    goto :goto_4

    :catchall_2
    move-exception p1

    move-object p2, p5

    .line 208
    :goto_3
    :try_start_8
    invoke-static {p5}, Ll/ۤ֨ܺ;->֫(Ljava/io/Closeable;)V

    .line 209
    invoke-static {p2}, Ll/ۤ֨ܺ;->֫(Ljava/io/Closeable;)V

    .line 210
    throw p1

    :catch_1
    move-object v1, p5

    move-object v4, v1

    .line 208
    :catch_2
    :goto_4
    invoke-static {v1}, Ll/ۤ֨ܺ;->֫(Ljava/io/Closeable;)V

    .line 209
    invoke-static {v4}, Ll/ۤ֨ܺ;->֫(Ljava/io/Closeable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catch_3
    :goto_5
    move v1, v2

    goto :goto_0

    .line 223
    :cond_3
    :goto_6
    :try_start_9
    invoke-virtual {p1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    :catch_4
    return-void

    .line 168
    :cond_4
    :try_start_a
    invoke-static {p1, p3}, Ll/ۤ֨ܺ;->֫(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception p1

    goto :goto_8

    :catch_5
    move-exception p1

    .line 173
    :try_start_b
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    .line 175
    :goto_7
    new-instance p4, Ll/ۛ֨ܺ;

    const-string p5, "Could not find \'"

    const-string v1, "\'. Looked for: "

    .line 0
    invoke-static {p5, p3, v1}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    .line 23
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", but only found: "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "."

    .line 0
    invoke-static {p3, p1, p2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-direct {p4, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 175
    throw p4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :goto_8
    move-object p5, v0

    goto :goto_9

    :catchall_4
    move-exception p1

    :goto_9
    if-eqz p5, :cond_5

    .line 222
    :try_start_c
    iget-object p2, p5, Ll/۫֨ܺ;->ۧ:Ljava/util/zip/ZipFile;

    .line 223
    invoke-virtual {p2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    .line 226
    :catch_6
    :cond_5
    throw p1
.end method
