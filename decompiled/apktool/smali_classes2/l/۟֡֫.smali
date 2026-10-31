.class public final Ll/۟֡֫;
.super Ljava/lang/Object;
.source "82VA"


# instance fields
.field public final ֫:Ljava/io/File;

.field public final ۧ:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/۟֡֫;->ۧ:Ljava/io/File;

    .line 52
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".bak"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/۟֡֫;->֫:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/۟֡֫;->ۧ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 63
    iget-object v0, p0, Ll/۟֡֫;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public final ֫(Ljava/io/DataOutputStream;)V
    .locals 0

    .line 133
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 135
    iget-object p1, p0, Ll/۟֡֫;->֫:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 57
    iget-object v0, p0, Ll/۟֡֫;->ۧ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۟֡֫;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Ljava/io/FileInputStream;
    .locals 3

    .line 152
    iget-object v0, p0, Ll/۟֡֫;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    iget-object v2, p0, Ll/۟֡֫;->ۧ:Ljava/io/File;

    if-eqz v1, :cond_0

    .line 153
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 154
    invoke-virtual {v0, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 148
    :cond_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public final ᩳ()Ljava/io/OutputStream;
    .locals 5

    .line 96
    iget-object v0, p0, Ll/۟֡֫;->ۧ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 97
    iget-object v1, p0, Ll/۟֡֫;->֫:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 98
    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 99
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t rename file "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " to backup file "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 107
    :cond_1
    :goto_0
    :try_start_0
    new-instance v1, Ll/ܰ֡֫;

    invoke-direct {v1, v0}, Ll/ܰ֡֫;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    .line 109
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    const-string v3, "Couldn\'t create "

    if-eqz v2, :cond_2

    .line 110
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 115
    :try_start_1
    new-instance v1, Ll/ܰ֡֫;

    invoke-direct {v1, v0}, Ll/ܰ֡֫;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :catch_1
    move-exception v1

    .line 117
    new-instance v2, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 111
    :cond_2
    new-instance v2, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
