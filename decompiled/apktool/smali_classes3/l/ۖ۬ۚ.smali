.class public final Ll/ۖ۬ۚ;
.super Ll/ۘ۬ۚ;
.source "S7CW"


# static fields
.field public static final ۜ:Ljava/lang/String;


# instance fields
.field public ܳ:Ljava/io/FileOutputStream;

.field public ܽ:Ll/ܺ۬ۚ;

.field public ܿ:Ljava/io/File;

.field public ᩳ:Ljava/io/File;

.field public ᩻:Ljava/io/PrintWriter;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    invoke-static {}, Ll/֫۠ᩴ;->getDefault()Ll/۟֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ᩴ;->getSeparator()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۖ۬ۚ;->ۜ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ۖ۬ۚ;)Ljava/lang/String;
    .locals 4

    .line 144
    iget-object v0, p0, Ll/ۖ۬ۚ;->ᩳ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Ll/ۖ۬ۚ;->ܿ:Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    const-string v1, " = \""

    const-string v2, "\""

    const-string v3, "writing -d "

    .line 0
    invoke-static {v3, v0, v1, p0, v2}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final flush()V
    .locals 2

    .line 173
    iget-object v0, p0, Ll/ۖ۬ۚ;->ܳ:Ljava/io/FileOutputStream;

    if-eqz v0, :cond_0

    .line 175
    :try_start_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 177
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 78
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 79
    iget-object v1, p0, Ll/ۖ۬ۚ;->ᩳ:Ljava/io/File;

    if-eqz v1, :cond_2

    iget-object v2, p0, Ll/ۖ۬ۚ;->ܿ:Ljava/io/File;

    if-eqz v2, :cond_2

    const-string v2, ""

    if-eqz v1, :cond_0

    .line 80
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ll/ۖ۬ۚ;->ۜ:Ljava/lang/String;

    .line 81
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 82
    iget-object v3, p0, Ll/ۖ۬ۚ;->ܿ:Ljava/io/File;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    return-object v0
.end method

.method public final ֫()Ljava/io/DataOutputStream;
    .locals 3

    .line 184
    new-instance v0, Ljava/io/DataOutputStream;

    new-instance v1, Ljava/io/BufferedOutputStream;

    iget-object v2, p0, Ll/ۖ۬ۚ;->ܳ:Ljava/io/FileOutputStream;

    invoke-direct {v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method

.method public final ֫(Ljava/io/File;)V
    .locals 0

    .line 65
    iput-object p1, p0, Ll/ۖ۬ۚ;->ᩳ:Ljava/io/File;

    .line 66
    iget-object p1, p0, Ll/ۖ۬ۚ;->ܽ:Ll/ܺ۬ۚ;

    if-nez p1, :cond_0

    .line 67
    sget-object p1, Ll/ܺ۬ۚ;->᩹:Ll/ܺ۬ۚ;

    iput-object p1, p0, Ll/ۖ۬ۚ;->ܽ:Ll/ܺ۬ۚ;

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/io/File;Ljava/lang/String;)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۖ۬ۚ;->ᩳ:Ljava/io/File;

    if-nez v0, :cond_0

    .line 58
    iput-object p1, p0, Ll/ۖ۬ۚ;->ᩳ:Ljava/io/File;

    .line 59
    :cond_0
    sget-object p1, Ll/ܺ۬ۚ;->᩶:Ll/ܺ۬ۚ;

    iput-object p1, p0, Ll/ۖ۬ۚ;->ܽ:Ll/ܺ۬ۚ;

    .line 75
    iput-object p2, p0, Ll/ۘ۬ۚ;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۖ۬ۚ;->᩻:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/ܽ۫ᩴ;Ll/᩶ۗۚ;)V
    .locals 5

    .line 59
    iput-object p1, p0, Ll/ۘ۬ۚ;->ۧ:Ljava/lang/String;

    .line 114
    sget-object v0, Ll/ۖ۬ۚ;->ۜ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, ""

    if-eq v0, v1, :cond_1

    .line 116
    invoke-virtual {p3}, Ll/᩶ۗۚ;->᩷()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v4

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :goto_0
    add-int/2addr v0, v2

    .line 117
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object v1, v4

    .line 71
    :goto_1
    iget-object v0, p0, Ll/ۘ۬ۚ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 135
    invoke-virtual {p2, v4}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 0
    :cond_2
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 137
    invoke-virtual {p2, v4}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 139
    :goto_2
    iget-object p2, p0, Ll/ۖ۬ۚ;->ᩳ:Ljava/io/File;

    if-nez p2, :cond_3

    const-string p2, "writing to "

    const-string v0, " "

    .line 0
    invoke-static {p2, v1, v0, p1}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v3, [Ljava/lang/Object;

    .line 140
    invoke-virtual {p3, p2, v0}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    new-instance p2, Ljava/io/File;

    invoke-direct {p2, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Ll/ۖ۬ۚ;->ܿ:Ljava/io/File;

    goto :goto_3

    .line 143
    :cond_3
    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ۬ۚ;->ܿ:Ljava/io/File;

    .line 144
    new-instance p1, Ll/ۡ۬ۚ;

    invoke-direct {p1, p0}, Ll/ۡ۬ۚ;-><init>(Ll/ۖ۬ۚ;)V

    invoke-virtual {p3, p1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 145
    new-instance p1, Ljava/io/File;

    iget-object p2, p0, Ll/ۖ۬ۚ;->ܿ:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 146
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p2

    if-nez p2, :cond_4

    .line 147
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Object;

    aput-object p1, p2, v3

    const-string p1, "Cannot create {0}"

    invoke-virtual {p3, p1, p2}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 151
    :cond_4
    :goto_3
    new-instance p1, Ljava/io/FileOutputStream;

    iget-object p2, p0, Ll/ۖ۬ۚ;->ܿ:Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iput-object p1, p0, Ll/ۖ۬ۚ;->ܳ:Ljava/io/FileOutputStream;

    .line 152
    new-instance p1, Ljava/io/PrintWriter;

    new-instance p2, Ljava/io/OutputStreamWriter;

    iget-object p3, p0, Ll/ۖ۬ۚ;->ܳ:Ljava/io/FileOutputStream;

    invoke-direct {p2, p3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {p1, p2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iput-object p1, p0, Ll/ۖ۬ۚ;->᩻:Ljava/io/PrintWriter;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Ll/ۖ۬ۚ;->ܿ:Ljava/io/File;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "file stream"

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 157
    invoke-super {p0, p1}, Ll/ۘ۬ۚ;->ۧ(Ljava/lang/String;)V

    .line 158
    invoke-virtual {p0}, Ll/ۖ۬ۚ;->flush()V

    .line 160
    :try_start_0
    iget-object p1, p0, Ll/ۖ۬ۚ;->᩻:Ljava/io/PrintWriter;

    if-eqz p1, :cond_0

    .line 161
    invoke-virtual {p1}, Ljava/io/PrintWriter;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    :cond_0
    iget-object p1, p0, Ll/ۖ۬ۚ;->ܳ:Ljava/io/FileOutputStream;

    if-eqz p1, :cond_1

    .line 165
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 164
    iget-object v0, p0, Ll/ۖ۬ۚ;->ܳ:Ljava/io/FileOutputStream;

    if-eqz v0, :cond_2

    .line 165
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 167
    :cond_2
    throw p1
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ۖ۬ۚ;->᩻:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-void
.end method
