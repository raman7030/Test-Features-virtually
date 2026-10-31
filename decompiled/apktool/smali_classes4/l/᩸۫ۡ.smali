.class public final Ll/᩸۫ۡ;
.super Ljava/lang/Object;
.source "82VA"


# instance fields
.field public final ֫:Ljava/io/File;

.field public final ۧ:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Ll/᩸۫ۡ;->֫:Ljava/io/File;

    .line 57
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".new"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/᩸۫ۡ;->ۧ:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 73
    iget-object v0, p0, Ll/᩸۫ۡ;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 74
    iget-object v0, p0, Ll/᩸۫ۡ;->ۧ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public final ֫(Ljava/io/FileOutputStream;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_1

    .line 234
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    :catch_0
    :try_start_1
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    .line 146
    :goto_0
    iget-object p1, p0, Ll/᩸۫ۡ;->ۧ:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_1

    .line 147
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    :goto_1
    return-void
.end method

.method public final ۧ(Ljava/io/FileOutputStream;)V
    .locals 2

    .line 234
    :try_start_0
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :catch_0
    :try_start_1
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    .line 248
    :goto_0
    iget-object p1, p0, Ll/᩸۫ۡ;->֫:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 253
    :cond_0
    iget-object v0, p0, Ll/᩸۫ۡ;->ۧ:Ljava/io/File;

    invoke-virtual {v0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 225
    iget-object v0, p0, Ll/᩸۫ۡ;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method public final ܳ()[B
    .locals 6

    .line 180
    invoke-virtual {p0}, Ll/᩸۫ۡ;->ܿ()Ljava/io/FileInputStream;

    move-result-object v0

    .line 183
    :try_start_0
    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    move-result v1

    .line 184
    new-array v1, v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 186
    :cond_0
    :goto_0
    array-length v4, v1

    sub-int/2addr v4, v3

    invoke-virtual {v0, v1, v3, v4}, Ljava/io/FileInputStream;->read([BII)I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v4, :cond_1

    .line 203
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    return-object v1

    :cond_1
    add-int/2addr v3, v4

    .line 195
    :try_start_1
    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    move-result v4

    .line 196
    array-length v5, v1

    sub-int/2addr v5, v3

    if-le v4, v5, :cond_0

    add-int/2addr v4, v3

    .line 197
    new-array v4, v4, [B

    .line 198
    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v1, v4

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 203
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 204
    throw v1
.end method

.method public final ܽ()Ljava/io/File;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/᩸۫ۡ;->֫:Ljava/io/File;

    return-object v0
.end method

.method public final ܿ()Ljava/io/FileInputStream;
    .locals 3

    .line 166
    iget-object v0, p0, Ll/᩸۫ۡ;->ۧ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    iget-object v2, p0, Ll/᩸۫ۡ;->֫:Ljava/io/File;

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 167
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_0

    .line 168
    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    :cond_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 229
    iget-object v0, p0, Ll/᩸۫ۡ;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ljava/io/FileOutputStream;
    .locals 5

    .line 94
    iget-object v0, p0, Ll/᩸۫ۡ;->ۧ:Ljava/io/File;

    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    nop

    .line 96
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    .line 97
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 101
    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :catch_1
    move-exception v1

    .line 103
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to create new file "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 98
    :cond_0
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to create directory for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
