.class public final Ll/۟ۨۘ;
.super Ll/۫ۨۘ;
.source "R905"


# instance fields
.field public final ֫:Ll/ۨۨۘ;

.field public final ۧ:Ll/ܰۨۘ;


# direct methods
.method public constructor <init>(Ll/ܰۨۘ;Ll/ۨۨۘ;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ll/۫ۨۘ;-><init>()V

    .line 33
    iput-object p1, p0, Ll/۟ۨۘ;->ۧ:Ll/ܰۨۘ;

    .line 34
    iput-object p2, p0, Ll/۟ۨۘ;->֫:Ll/ۨۨۘ;

    return-void
.end method

.method public static ۧ()Ll/۟ۨۘ;
    .locals 3

    .line 23
    new-instance v0, Ll/۟ۨۘ;

    .line 14
    new-instance v1, Ll/᩺ۨۘ;

    .line 6
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v2, Ll/ۛۨۘ;

    .line 9
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-direct {v0, v1, v2}, Ll/۟ۨۘ;-><init>(Ll/ܰۨۘ;Ll/ۨۨۘ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 1

    const-string v0, "data"

    .line 71
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/֨ۨۘ;
    .locals 12

    const-string v0, "data:"

    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Invalid data-uri: "

    if-eqz v0, :cond_b

    const/4 v0, 0x5

    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 47
    iget-object v2, p0, Ll/۟ۨۘ;->ۧ:Ll/ܰۨۘ;

    check-cast v2, Ll/᩺ۨۘ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x2c

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-gez v2, :cond_0

    move-object v2, v3

    goto/16 :goto_3

    :cond_0
    const/4 v5, 0x1

    if-lez v2, :cond_4

    .line 33
    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, ";"

    .line 34
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 35
    array-length v7, v6

    if-lez v7, :cond_4

    const/4 v8, -0x1

    const/16 v9, 0x2f

    const-string v10, "base64"

    if-ne v7, v5, :cond_2

    .line 39
    aget-object v6, v6, v4

    .line 40
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v6, 0x1

    move-object v8, v3

    goto :goto_2

    .line 44
    :cond_1
    invoke-virtual {v6, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-le v7, v8, :cond_4

    goto :goto_1

    .line 50
    :cond_2
    aget-object v11, v6, v4

    invoke-virtual {v11, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    if-le v9, v8, :cond_3

    .line 51
    aget-object v8, v6, v4

    goto :goto_0

    :cond_3
    move-object v8, v3

    :goto_0
    sub-int/2addr v7, v5

    .line 53
    aget-object v6, v6, v7

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_4
    move-object v6, v3

    :goto_1
    const/4 v7, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    .line 65
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v2, v7, :cond_5

    add-int/2addr v2, v5

    .line 66
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v0, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "\n"

    const-string v5, ""

    invoke-virtual {v0, v2, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 67
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    move-object v0, v3

    .line 76
    :cond_6
    new-instance v2, Ll/ۤۨۘ;

    invoke-direct {v2, v8, v0, v6}, Ll/ۤۨۘ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_3
    if-eqz v2, :cond_a

    .line 54
    :try_start_0
    iget-object v0, p0, Ll/۟ۨۘ;->֫:Ll/ۨۨۘ;

    check-cast v0, Ll/ۛۨۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "UTF-8"

    .line 27
    invoke-virtual {v2}, Ll/ۤۨۘ;->ܽ()Ljava/lang/String;

    move-result-object v1

    .line 29
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_8

    .line 30
    invoke-virtual {v2}, Ll/ۤۨۘ;->֫()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0, v4}, Landroid/util/Base64;->decode([BI)[B

    move-result-object v3

    goto :goto_4

    .line 33
    :cond_7
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_8
    :goto_4
    if-eqz v3, :cond_9

    .line 64
    invoke-virtual {v2}, Ll/ۤۨۘ;->ۧ()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 63
    invoke-static {v0, p1}, Ll/۠ۨۘ;->֫(Ljava/io/InputStream;Ljava/lang/String;)Ll/֨ۨۘ;

    move-result-object p1

    return-object p1

    .line 60
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Decoding data-uri failed: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 56
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot decode data-uri: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 49
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
