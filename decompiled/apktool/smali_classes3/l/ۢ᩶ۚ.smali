.class public final Ll/ۢ᩶ۚ;
.super Ljava/lang/Object;
.source "63ZD"


# direct methods
.method public static ֫(Ljava/lang/Object;)V
    .locals 3

    .line 186
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    .line 187
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, "org/objectweb/asm/"

    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Test$"

    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "org/objectweb/asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?"

    .line 199
    invoke-static {v1, v0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "org/objectweb/asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?"

    .line 201
    invoke-static {v1, v0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 189
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const-string v1, ".class"

    .line 0
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 189
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 210
    :try_start_0
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    :try_start_1
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    .line 212
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    const v0, 0xffff

    if-ne p0, v0, :cond_2

    goto :goto_1

    .line 217
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "ASM10_EXPERIMENTAL can only be used by classes compiled with --enable-preview"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 210
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :try_start_4
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    .line 214
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "I/O error, can\'t check class version"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 207
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Bytecode not available, can\'t check class version"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_1
    return-void
.end method
