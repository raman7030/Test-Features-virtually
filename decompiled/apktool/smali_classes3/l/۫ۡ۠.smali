.class public final Ll/۫ۡ۠;
.super Ljava/lang/Object;
.source "V6B4"


# instance fields
.field public ֫:Ll/ۧ᩶۠;

.field public ۧ:Ll/᩹ܶ۠;

.field public ܽ:Ljava/io/PrintWriter;

.field public ᩳ:Ljava/io/PrintWriter;


# direct methods
.method public constructor <init>(Ljava/io/PrintWriter;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p1, p0, Ll/۫ۡ۠;->ܽ:Ljava/io/PrintWriter;

    iput-object p1, p0, Ll/۫ۡ۠;->ᩳ:Ljava/io/PrintWriter;

    return-void
.end method

.method private ֫(Ljava/lang/IllegalAccessError;)Z
    .locals 8

    .line 395
    const-class v0, Ll/۫ۡ۠;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "(?i)(?<=tried to access class )([a-z_$][a-z\\d_$]*\\.)*[a-z_$][a-z\\d_$]*"

    .line 396
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 397
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 398
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 400
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    .line 401
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 402
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 403
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    if-eq v3, v1, :cond_1

    .line 405
    invoke-virtual {p1}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    move-result-object p1

    invoke-virtual {p1}, Ljava/security/ProtectionDomain;->getCodeSource()Ljava/security/CodeSource;

    move-result-object p1

    .line 406
    invoke-virtual {v0}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/ProtectionDomain;->getCodeSource()Ljava/security/CodeSource;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    .line 408
    iget-object v3, p0, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    invoke-virtual {p1}, Ljava/security/CodeSource;->getLocation()Ljava/net/URL;

    move-result-object p1

    .line 409
    invoke-virtual {v0}, Ljava/security/CodeSource;->getLocation()Ljava/net/URL;

    move-result-object v0

    .line 408
    sget-object v4, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3758
    new-instance v4, Ll/۫۠۠;

    const-string v5, "compiler"

    const-string v6, "two.class.loaders.2"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object p1, v7, v2

    aput-object v0, v7, v1

    invoke-direct {v4, v5, v6, v7}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    invoke-virtual {v3, v4}, Ll/᩹ܶ۠;->ۧ(Ll/ۙ۠۠;)V

    goto :goto_0

    .line 411
    :cond_0
    iget-object p1, p0, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v0, Ll/ۛᩴ۠;->ۨᩳ:Ll/۫۠۠;

    invoke-virtual {p1, v0}, Ll/᩹ܶ۠;->ۧ(Ll/ۙ۠۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return v1

    :catchall_0
    :cond_1
    return v2
.end method


# virtual methods
.method public final ֫([Ljava/lang/String;)Ll/۬ۡ۠;
    .locals 16

    move-object/from16 v1, p0

    .line 174
    new-instance v2, Ll/ۗ֨۠;

    invoke-direct {v2}, Ll/ۗ֨۠;-><init>()V

    .line 175
    sget v0, Ll/ۨܿ۠;->᩻֫:I

    .line 145
    new-instance v0, Ll/ۘܿ۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v3, Ll/ۧ᩶۠;

    invoke-virtual {v2, v3, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;Ll/᩶֨۠;)V

    const-string v4, "dev"

    const-string v5, "compiler"

    .line 195
    iget-object v0, v1, Ll/۫ۡ۠;->ᩳ:Ljava/io/PrintWriter;

    .line 196
    sget-object v6, Ll/᩹ܶ۠;->ۙ:Ll/ۙ֨۠;

    invoke-virtual {v2, v6, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 199
    iget-object v0, v1, Ll/۫ۡ۠;->ܽ:Ljava/io/PrintWriter;

    .line 200
    sget-object v6, Ll/᩹ܶ۠;->᩹:Ll/ۙ֨۠;

    invoke-virtual {v2, v6, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 203
    invoke-static {v2}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v0

    iput-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    move-object/from16 v6, p1

    .line 205
    array-length v7, v6

    if-nez v7, :cond_0

    .line 206
    new-instance v2, Ll/ۗۡ۠;

    invoke-direct {v2, v0}, Ll/ۚۖ۠;-><init>(Ll/᩹ܶ۠;)V

    .line 213
    :try_start_0
    sget-object v0, Ll/֡ۖ۠;->ۙ֫:Ll/֡ۖ۠;

    const-string v3, "-help"

    invoke-virtual {v0, v2, v3}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;)V
    :try_end_0
    .catch Ll/ۖۖ۠; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    :catch_0
    sget-object v0, Ll/۬ۡ۠;->ۙ:Ll/۬ۡ۠;

    :goto_0
    move-object v2, v0

    goto/16 :goto_c

    :cond_0
    const/4 v7, 0x0

    const/4 v8, 0x1

    .line 222
    :try_start_1
    invoke-static/range {p1 .. p1}, Ll/ۖܶ۠;->֫([Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴۡ۠;->֫(Ll/ۖܶ۠;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_1
    .catch Ll/ۘۡ۠; {:try_start_1 .. :try_end_1} :catch_d
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_c
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_1 .. :try_end_1} :catch_b
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_a

    .line 110
    sget-object v6, Ll/ܺۡ۠;->ۖ:Ll/ۙ֨۠;

    invoke-virtual {v2, v6}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܺۡ۠;

    if-nez v6, :cond_1

    .line 112
    new-instance v6, Ll/ܺۡ۠;

    invoke-direct {v6, v2}, Ll/ܺۡ۠;-><init>(Ll/ۗ֨۠;)V

    .line 236
    :cond_1
    invoke-virtual {v6, v0}, Ll/ܺۡ۠;->֫(Ljava/util/ArrayList;)V

    .line 238
    iget-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    iget v0, v0, Ll/᩹ܶ۠;->ۘ:I

    if-lez v0, :cond_2

    .line 239
    sget-object v0, Ll/۬ۡ۠;->ۙ:Ll/۬ۡ۠;

    goto :goto_0

    .line 241
    :cond_2
    invoke-static {v2}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v9

    const-string v0, "stdout"

    .line 244
    invoke-virtual {v9, v0}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 246
    iget-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    invoke-virtual {v0}, Ll/᩹ܶ۠;->ܽ()V

    .line 247
    iget-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    new-instance v10, Ljava/io/PrintWriter;

    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-direct {v10, v11, v8}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;Z)V

    invoke-virtual {v0, v10}, Ll/᩹ܶ۠;->֫(Ljava/io/PrintWriter;)V

    :cond_3
    const-string v0, "nonBatchMode"

    .line 252
    invoke-virtual {v9, v0}, Ll/ۨܶ۠;->ܽ(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 253
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    .line 59
    new-instance v0, Ll/ۢܿ۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v10, Ll/ۖܿ۠;

    invoke-virtual {v2, v10, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;Ll/᩶֨۠;)V

    .line 260
    :cond_4
    invoke-virtual {v2, v3}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ᩶۠;

    iput-object v0, v1, Ll/۫ۡ۠;->֫:Ll/ۧ᩶۠;

    .line 261
    instance-of v3, v0, Ll/֡ۡ۠;

    if-eqz v3, :cond_5

    check-cast v0, Ll/֡ۡ۠;

    .line 262
    invoke-virtual {v0}, Ll/֡ۡ۠;->֫()Ll/ۧ᩶۠;

    move-result-object v0

    .line 263
    :cond_5
    instance-of v3, v0, Ll/᩷ܿ۠;

    if-eqz v3, :cond_7

    move-object v3, v0

    check-cast v3, Ll/᩷ܿ۠;

    .line 264
    invoke-virtual {v3, v2}, Ll/᩷ܿ۠;->֫(Ll/ۗ֨۠;)V

    .line 265
    invoke-virtual {v6}, Ll/ܺۡ۠;->ۧ()Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 289
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v0, 0x1

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    .line 291
    :try_start_2
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/֡ۖ۠;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v3, v12, v13}, Ll/᩷ܿ۠;->֫(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result v11
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    and-int/2addr v0, v11

    goto :goto_1

    :catch_1
    move-exception v0

    .line 293
    iget-object v12, v3, Ll/᩷ܿ۠;->ۨ:Ll/᩹ܶ۠;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/֡ۖ۠;

    invoke-virtual {v11}, Ll/֡ۖ۠;->᩻()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget-object v13, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1618
    new-instance v13, Ll/۫۠۠;

    const/4 v14, 0x2

    new-array v14, v14, [Ljava/lang/Object;

    aput-object v11, v14, v7

    aput-object v0, v14, v8

    const-string v0, "illegal.argument.for.option"

    invoke-direct {v13, v5, v0, v14}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    invoke-virtual {v12, v13}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    const/4 v0, 0x0

    goto :goto_1

    :cond_6
    move v3, v0

    goto :goto_2

    :cond_7
    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_2
    const-string v0, "showClass"

    .line 269
    invoke-virtual {v9, v0}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_d

    .line 271
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v5, "com.sun.tools.javac.Main"

    .line 470
    :cond_8
    iget-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v7, Ll/᩸ܶ۠;->᩶:Ll/᩸ܶ۠;

    invoke-virtual {v0, v7}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v7

    const-string v0, "javac: show class: "

    .line 471
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 473
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v8, "/"

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v10, 0x2e

    const/16 v11, 0x2f

    invoke-virtual {v5, v10, v11}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, ".class"

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-class v13, Ll/۫ۡ۠;

    invoke-virtual {v13, v0}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 475
    new-instance v15, Ljava/lang/StringBuilder;

    const-string v14, "  "

    invoke-direct {v15, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 478
    :cond_9
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v10, v11}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v5
    :try_end_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :try_start_4
    const-string v0, "SHA-256"

    .line 481
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 482
    new-instance v8, Ljava/security/DigestInputStream;

    invoke-direct {v8, v5, v0}, Ljava/security/DigestInputStream;-><init>(Ljava/io/InputStream;Ljava/security/MessageDigest;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const/16 v10, 0x2000

    :try_start_5
    new-array v10, v10, [B

    .line 485
    :cond_a
    invoke-virtual {v8, v10}, Ljava/io/InputStream;->read([B)I

    move-result v11

    if-gtz v11, :cond_a

    .line 486
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 487
    :try_start_6
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 488
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 489
    array-length v10, v0

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_b

    aget-byte v12, v0, v11

    const-string v13, "%02x"

    .line 490
    invoke-static {v12}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v12

    const/4 v14, 0x1

    new-array v14, v14, [Ljava/lang/Object;

    const/4 v15, 0x0

    aput-object v12, v14, v15

    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 491
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "  SHA-256 checksum: "

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v5, :cond_d

    .line 492
    :try_start_7
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v10, v0

    .line 482
    :try_start_8
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v8, v0

    :try_start_9
    invoke-virtual {v10, v8}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v10
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v0

    move-object v8, v0

    if-eqz v5, :cond_c

    .line 478
    :try_start_a
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v5, v0

    :try_start_b
    invoke-virtual {v8, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_c
    :goto_5
    throw v8
    :try_end_b
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    .line 493
    :goto_6
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "  cannot compute digest: "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 276
    :cond_d
    :goto_7
    invoke-virtual {v6}, Ll/ܺۡ۠;->᩻()Z

    move-result v0

    and-int/2addr v0, v3

    if-eqz v0, :cond_1b

    .line 277
    iget-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    iget v0, v0, Ll/᩹ܶ۠;->ۘ:I

    if-lez v0, :cond_e

    goto/16 :goto_a

    .line 280
    :cond_e
    invoke-virtual {v6}, Ll/ܺۡ۠;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 281
    sget-object v0, Ll/۬ۡ۠;->۬:Ll/۬ۡ۠;

    goto/16 :goto_0

    :cond_f
    const-string v0, "debug.completionDeps"

    .line 284
    invoke-virtual {v9, v0}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 285
    invoke-static {v2}, Ll/ܽ۠۠;->ۧ(Ll/ۗ֨۠;)V

    .line 288
    :cond_10
    invoke-static {v2}, Ll/ܶۖ֨;->֫(Ll/ۗ֨۠;)Ll/ܳۖ֨;

    move-result-object v0

    check-cast v0, Ll/ܶۖ֨;

    .line 291
    invoke-virtual {v6}, Ll/ܺۡ۠;->ܿ()Ljava/util/Set;

    move-result-object v3

    .line 292
    invoke-virtual {v0, v3}, Ll/ܶۖ֨;->֫(Ljava/util/Set;)V

    .line 295
    iget-object v3, v1, Ll/۫ۡ۠;->֫:Ll/ۧ᩶۠;

    sget-object v5, Ll/֡ۖ۠;->֫ۧ:Ll/֡ۖ۠;

    iget-object v7, v5, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-interface {v3, v7}, Ll/ܿ᩶۠;->֫(Ljava/lang/String;)I

    move-result v3

    const/4 v7, 0x1

    if-ne v3, v7, :cond_11

    .line 296
    invoke-static {v2}, Ll/ۧۡ۠;->֫(Ll/ۗ֨۠;)Ll/ۧۡ۠;

    move-result-object v3

    .line 297
    invoke-virtual {v3}, Ll/ۧۡ۠;->ܺ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v3

    .line 298
    iget-object v7, v1, Ll/۫ۡ۠;->֫:Ll/ۧ᩶۠;

    iget-object v5, v5, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {v3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v7, v3, v5}, Ll/ۧ᩶۠;->֫(Ljava/util/Iterator;Ljava/lang/String;)Z

    .line 302
    :cond_11
    invoke-static {v2}, Ll/ۙۡ۠;->֫(Ll/ۗ֨۠;)Ll/ۙۡ۠;

    move-result-object v2

    .line 305
    invoke-virtual {v6}, Ll/ܺۡ۠;->ܽ()Ll/ۖܶ۠;

    move-result-object v3

    .line 306
    invoke-virtual {v3}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_12

    .line 307
    invoke-virtual {v0, v3}, Ll/ܶۖ֨;->֫(Ll/ۖܶ۠;)V

    .line 310
    :cond_12
    sget-object v0, Ll/֡ۖ۠;->ۘܽ:Ll/֡ۖ۠;

    invoke-virtual {v9, v0}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 312
    iget-object v0, v2, Ll/ۙۡ۠;->ܳ:Ll/ۖܶ۠;

    iget-object v3, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v5, Ll/᩸ܶ۠;->᩶:Ll/᩸ܶ۠;

    invoke-virtual {v3, v5}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, v2, Ll/ۙۡ۠;->ܳ:Ll/ۖܶ۠;

    :cond_13
    const-string v0, "printArgsToFile"

    .line 315
    invoke-virtual {v9, v0}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    .line 317
    :try_start_c
    invoke-virtual {v6}, Ll/ܺۡ۠;->ᩳ()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v6}, Ll/ܺۡ۠;->֫()Ljava/util/LinkedHashSet;

    move-result-object v3

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v5

    invoke-virtual {v2, v0, v3, v5}, Ll/ۙۡ۠;->֫(Ljava/util/Set;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V

    .line 319
    iget-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    iget-object v0, v0, Ll/᩹ܶ۠;->ܺ:Ljava/util/HashSet;

    if-eqz v0, :cond_15

    .line 320
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 321
    iget-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    const-string v3, "all expected diagnostics found"

    invoke-virtual {v0, v3}, Ll/᩹ܶ۠;->֫(Ljava/lang/String;)V

    .line 322
    sget-object v0, Ll/۬ۡ۠;->۬:Ll/۬ۡ۠;

    goto/16 :goto_9

    .line 324
    :cond_14
    iget-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "expected diagnostic keys not found: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    iget-object v5, v5, Ll/᩹ܶ۠;->ܺ:Ljava/util/HashSet;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/᩹ܶ۠;->֫(Ljava/lang/String;)V

    .line 325
    sget-object v0, Ll/۬ۡ۠;->ۗ:Ll/۬ۡ۠;

    goto/16 :goto_9

    .line 329
    :cond_15
    invoke-virtual {v2}, Ll/ۙۡ۠;->ܽ()I

    move-result v0

    if-nez v0, :cond_16

    sget-object v0, Ll/۬ۡ۠;->۬:Ll/۬ۡ۠;

    goto/16 :goto_9

    :cond_16
    sget-object v0, Ll/۬ۡ۠;->ۗ:Ll/۬ۡ۠;
    :try_end_c
    .catch Ljava/lang/OutOfMemoryError; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/lang/StackOverflowError; {:try_start_c .. :try_end_c} :catch_8
    .catch Ll/᩻۠۠; {:try_start_c .. :try_end_c} :catch_7
    .catch Ll/ۧᩴ۠; {:try_start_c .. :try_end_c} :catch_6
    .catch Ll/ܽ᩸۠; {:try_start_c .. :try_end_c} :catch_5
    .catch Ljava/lang/IllegalAccessError; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    goto/16 :goto_9

    :catchall_4
    move-exception v0

    .line 353
    :try_start_d
    invoke-virtual {v2}, Ll/ۙۡ۠;->ܽ()I

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v9, v4}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_18

    .line 354
    :cond_17
    invoke-virtual {v1, v0}, Ll/۫ۡ۠;->֫(Ljava/lang/Throwable;)V

    .line 356
    :cond_18
    sget-object v0, Ll/۬ۡ۠;->᩶:Ll/۬ۡ۠;

    goto/16 :goto_9

    :catch_4
    move-exception v0

    .line 344
    invoke-direct {v1, v0}, Ll/۫ۡ۠;->֫(Ljava/lang/IllegalAccessError;)Z

    move-result v3

    if-eqz v3, :cond_19

    .line 345
    invoke-virtual {v1, v0}, Ll/۫ۡ۠;->֫(Ljava/lang/Throwable;)V

    .line 348
    :cond_19
    sget-object v0, Ll/۬ۡ۠;->᩶:Ll/۬ۡ۠;

    goto :goto_9

    :catch_5
    move-exception v0

    .line 342
    invoke-virtual {v0}, Ll/ܽ᩸۠;->getCause()Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :catch_6
    move-exception v0

    .line 456
    iget-object v3, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v4, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    const-string v5, "msg.proc.annotation.uncaught.exception"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5, v6}, Ll/᩹ܶ۠;->ۧ(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    iget-object v3, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v4, Ll/᩸ܶ۠;->᩶:Ll/᩸ܶ۠;

    invoke-virtual {v3, v4}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 339
    sget-object v0, Ll/۬ۡ۠;->۫:Ll/۬ۡ۠;

    goto :goto_9

    :catch_7
    move-exception v0

    .line 432
    iget-object v3, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/᩹ܶ۠;->֫(Ljava/lang/String;)V

    .line 433
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_1a

    invoke-virtual {v9, v4}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1a

    .line 434
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    iget-object v3, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v4, Ll/᩸ܶ۠;->᩶:Ll/᩸ܶ۠;

    invoke-virtual {v3, v4}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 336
    :cond_1a
    sget-object v0, Ll/۬ۡ۠;->۫:Ll/۬ۡ۠;

    goto :goto_9

    :catch_8
    move-exception v0

    goto :goto_8

    :catch_9
    move-exception v0

    .line 448
    :goto_8
    iget-object v3, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v4, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    const-string v5, "msg.resource"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5, v6}, Ll/᩹ܶ۠;->ۧ(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    iget-object v3, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v4, Ll/᩸ܶ۠;->᩶:Ll/᩸ܶ۠;

    invoke-virtual {v3, v4}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 333
    sget-object v0, Ll/۬ۡ۠;->۫:Ll/۬ۡ۠;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 363
    :goto_9
    invoke-virtual {v2}, Ll/ۙۡ۠;->֫()V

    goto/16 :goto_0

    :catchall_5
    move-exception v0

    invoke-virtual {v2}, Ll/ۙۡ۠;->֫()V

    .line 368
    throw v0

    .line 278
    :cond_1b
    :goto_a
    sget-object v0, Ll/۬ۡ۠;->ۙ:Ll/۬ۡ۠;

    goto/16 :goto_0

    :catch_a
    move-exception v0

    .line 230
    iget-object v2, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v3, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    const-string v4, "msg.io"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5}, Ll/᩹ܶ۠;->ۧ(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget-object v2, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v3, Ll/᩸ܶ۠;->᩶:Ll/᩸ܶ۠;

    invoke-virtual {v2, v3}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 232
    sget-object v0, Ll/۬ۡ۠;->۫:Ll/۬ۡ۠;

    goto/16 :goto_0

    :catch_b
    move-exception v0

    goto :goto_b

    :catch_c
    move-exception v0

    .line 227
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1508
    new-instance v2, Ll/۫۠۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const-string v0, "file.not.found"

    invoke-direct {v2, v5, v0, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-virtual {v1, v2}, Ll/۫ۡ۠;->֫(Ll/۫۠۠;)V

    .line 228
    sget-object v0, Ll/۬ۡ۠;->۫:Ll/۬ۡ۠;

    goto/16 :goto_0

    :catch_d
    move-exception v0

    const/4 v2, 0x1

    .line 224
    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3894
    new-instance v3, Ll/۫۠۠;

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v0, v0, Ll/ۘۡ۠;->᩸:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v0, v4, v6

    const-string v0, "unmatched.quote"

    invoke-direct {v3, v5, v0, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    invoke-virtual {v1, v3}, Ll/۫ۡ۠;->֫(Ll/۫۠۠;)V

    .line 155
    iget-object v0, v1, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v3, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v4, "javac"

    aput-object v4, v2, v6

    const-string v4, "msg.usage"

    invoke-virtual {v0, v3, v4, v2}, Ll/᩹ܶ۠;->ۧ(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    sget-object v0, Ll/۬ۡ۠;->ۙ:Ll/۬ۡ۠;

    goto/16 :goto_0

    .line 179
    :goto_c
    :try_start_e
    iget-object v0, v1, Ll/۫ۡ۠;->֫:Ll/ۧ᩶۠;

    if-eqz v0, :cond_1c

    .line 180
    invoke-interface {v0}, Ll/ۧ᩶۠;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_e

    goto :goto_d

    :catch_e
    move-exception v0

    .line 182
    invoke-virtual {v1, v0}, Ll/۫ۡ۠;->֫(Ljava/lang/Throwable;)V

    :cond_1c
    :goto_d
    return-object v2
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 5

    .line 425
    iget-object v0, p0, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v1, Ll/ܶܶ۠;->ۙ:Ll/ܶܶ۠;

    invoke-static {}, Ll/ۙۡ۠;->ۜ()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-string v2, "msg.bug"

    invoke-virtual {v0, v1, v2, v3}, Ll/᩹ܶ۠;->ۧ(Ll/ܶܶ۠;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iget-object v0, p0, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v1, Ll/᩸ܶ۠;->᩶:Ll/᩸ܶ۠;

    invoke-virtual {v0, v1}, Ll/᩹ܶ۠;->֫(Ll/᩸ܶ۠;)Ljava/io/PrintWriter;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    return-void
.end method

.method public final ֫(Ll/۫۠۠;)V
    .locals 2

    .line 161
    iget-object v0, p0, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    invoke-virtual {v0, p1}, Ll/᩹ܶ۠;->֫(Ll/ۙ۠۠;)Ljava/lang/String;

    move-result-object p1

    .line 162
    iget-object v0, p0, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    sget-object v1, Ll/ۛᩴ۠;->ۖ֫:Ll/۫۠۠;

    invoke-virtual {v0, v1}, Ll/᩹ܶ۠;->֫(Ll/ۙ۠۠;)Ljava/lang/String;

    move-result-object v0

    .line 163
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    invoke-static {v0, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 164
    :goto_0
    iget-object v0, p0, Ll/۫ۡ۠;->ۧ:Ll/᩹ܶ۠;

    invoke-virtual {v0, p1}, Ll/᩹ܶ۠;->֫(Ljava/lang/String;)V

    return-void
.end method
