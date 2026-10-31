.class public abstract Ll/ܶ᩵ܿ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# static fields
.field public static final ۙ:Ljava/lang/String;

.field public static final ᩶:Ljava/util/regex/Pattern;

.field public static final ᩹:Ljava/util/regex/Pattern;


# instance fields
.field public ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 62
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    sput-object v0, Ll/ܶ᩵ܿ;->ۙ:Ljava/lang/String;

    .line 63
    sget-object v0, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    .line 64
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 65
    sget-char v0, Ljava/io/File;->pathSeparatorChar:C

    const-string v0, "(.*) \\((\\d+)\\)"

    .line 1143
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܶ᩵ܿ;->᩹:Ljava/util/regex/Pattern;

    const-string v0, "(.*)\\((\\d+)\\)"

    .line 1144
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܶ᩵ܿ;->᩶:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ܺ(Ljava/lang/String;)Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    const/16 v1, 0x2e

    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const-string v1, ""

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v16, ".lz4"

    const-string v17, ".tar.lz4"

    const-string v2, ".1"

    const-string v3, ".apk.1"

    const-string v4, ".png"

    const-string v5, ".9.png"

    const-string v6, ".gz"

    const-string v7, ".tar.gz"

    const-string v8, ".xz"

    const-string v9, ".tar.xz"

    const-string v10, ".zst"

    const-string v11, ".tar.zst"

    const-string v12, ".zstd"

    const-string v13, ".tar.zstd"

    const-string v14, ".bz2"

    const-string v15, ".tar.bz2"

    .line 83
    filled-new-array/range {v2 .. v17}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :goto_1
    const/16 v4, 0x10

    if-ge v3, v4, :cond_2

    .line 94
    aget-object v4, v2, v3

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v4, v3, 0x1

    aget-object v5, v2, v4

    invoke-static {v5, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 95
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v1

    aget-object v2, v2, v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    :cond_2
    return-object v1
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 61
    check-cast p1, Ll/ܶ᩵ܿ;

    .line 1232
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1206
    :cond_0
    instance-of v0, p1, Ll/ܶ᩵ܿ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 1209
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getParent()Ljava/lang/String;
.end method

.method public final hashCode()I
    .locals 1

    .line 1216
    iget v0, p0, Ll/ܶ᩵ܿ;->᩸:I

    if-nez v0, :cond_0

    .line 1218
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 1219
    iput v0, p0, Ll/ܶ᩵ܿ;->᩸:I

    :cond_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1227
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Z
    .locals 2

    .line 357
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v0

    sget v1, Ll/ܿ֡ܿ;->֫:I

    .line 566
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    move-result v0

    return v0
.end method

.method public abstract ֡֫()Z
.end method

.method public final ֡ۧ()Ljava/lang/String;
    .locals 2

    .line 769
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    .line 770
    :try_start_0
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 771
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    return-object v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    .line 769
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
.end method

.method public ֨()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract ֨֫()Z
.end method

.method public ֨ۧ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ۜܶܿ;

    return v0
.end method

.method public final ֫(Ll/ܿۖ᩷;)J
    .locals 6

    .line 332
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 413
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 335
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_0

    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-nez v4, :cond_0

    .line 336
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ᩵ܿ;

    invoke-virtual {v4, p1}, Ll/ܶ᩵ܿ;->֫(Ll/ܿۖ᩷;)J

    move-result-wide v4

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1

    .line 340
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 2

    .line 1190
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Z)Ll/ܶ᩵ܿ;
    .locals 7

    .line 1152
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1153
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 1157
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 1160
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const-string v2, ""

    goto :goto_0

    .line 1164
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘ֫()Ljava/lang/String;

    move-result-object v2

    .line 1165
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-eqz p1, :cond_2

    .line 1168
    sget-object v4, Ll/ܶ᩵ܿ;->᩹:Ljava/util/regex/Pattern;

    goto :goto_1

    :cond_2
    sget-object v4, Ll/ܶ᩵ܿ;->᩶:Ljava/util/regex/Pattern;

    .line 1169
    :goto_1
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 1170
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    const/4 v5, 0x2

    .line 1173
    :try_start_0
    invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 1174
    invoke-virtual {v4, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    .line 0
    :cond_3
    :goto_2
    invoke-static {v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-eqz p1, :cond_4

    const-string p1, " ("

    goto :goto_3

    :cond_4
    const-string p1, "("

    .line 1178
    :goto_3
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, ")"

    .line 1179
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_5
    add-int/2addr v3, v6

    .line 1183
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 1184
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_5

    return-object v2

    :cond_6
    :goto_4
    return-object p0
.end method

.method public ֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;
    .locals 1

    .line 385
    new-instance v0, Ll/ᩴ᩵ܿ;

    invoke-direct {v0, p0, p1}, Ll/᩷᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ۜ᩵ܿ;)V

    return-object v0
.end method

.method public final ֫(Ljava/io/InputStream;)V
    .locals 3

    const-wide/16 v0, -0x1

    const/4 v2, 0x0

    .line 816
    invoke-virtual {p0, p1, v0, v1, v2}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V

    return-void
.end method

.method public final ֫(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V
    .locals 0

    .line 820
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 821
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ܶ᩵ܿ;->ۧ(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V

    return-void
.end method

.method public final ֫(Ljava/io/OutputStream;Ll/֨᩸ܿ;)V
    .locals 3

    .line 689
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 695
    :try_start_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v1

    invoke-static {v0, p1, v1, v2, p2}, Ll/ܳ֡ܿ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ۚ᩸ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 696
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_0

    .line 694
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw p1

    :catch_0
    move-exception p1

    .line 691
    invoke-static {p0, p1}, Ll/۫ᩴܿ;->֫(Ll/ܶ᩵ܿ;Ljava/io/IOException;)V

    .line 692
    throw p1
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    .line 849
    invoke-virtual {p1}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1}, Ll/ۤۜܽ;->size()I

    move-result p1

    invoke-virtual {p0, v0, v1, p1}, Ll/ܶ᩵ܿ;->֫([BII)V

    return-void
.end method

.method public final ֫(Ll/۬֡ܿ;)V
    .locals 1

    .line 943
    new-instance v0, Ll/ۤ֡ܿ;

    invoke-direct {v0, p0}, Ll/ۤ֡ܿ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 47
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ۤ֡ܿ;->֫(Ll/ۗ֡ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 51
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_0
    move-exception p1

    .line 49
    throw p1
.end method

.method public final ֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V
    .locals 2

    .line 995
    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 997
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 998
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 999
    :cond_0
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Move failed, target exists: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v0}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 999
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 1003
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 1005
    :cond_2
    new-instance p2, Ll/ܿ᩵ܿ;

    invoke-direct {p2}, Ll/ܿ᩵ܿ;-><init>()V

    invoke-virtual {p0, p1, p2}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;)V

    .line 1006
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;)V
    .locals 3

    .line 723
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    .line 725
    invoke-virtual {p2, p0}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 726
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 727
    invoke-virtual {p2, p1}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    goto :goto_0

    .line 729
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ()V

    :goto_0
    const/4 v0, 0x1

    .line 413
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 731
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 732
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 733
    invoke-virtual {v1, v2, p2}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;)V

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x0

    .line 530
    invoke-virtual {p0, p1, p2, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;Ll/ۚ᩸ܿ;)V

    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;Ll/ۚ᩸ܿ;)V
    .locals 11

    .line 576
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    .line 578
    invoke-virtual {p2, p0}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 580
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    .line 539
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨()Z

    move-result v1

    const/4 v7, 0x0

    if-eqz v1, :cond_c

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܶ()Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_2

    .line 542
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_2

    .line 0
    :cond_2
    instance-of v1, p0, Ll/ۜܶܿ;

    if-nez v1, :cond_3

    instance-of v1, p1, Ll/ۜܶܿ;

    if-eqz v1, :cond_5

    .line 546
    :cond_3
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v1

    const-wide/32 v8, 0x1f400000

    cmp-long v3, v1, v8

    if-lez v3, :cond_4

    goto/16 :goto_2

    .line 549
    :cond_4
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v1

    invoke-interface {v1}, Ll/֡᩶ܿ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_5

    goto/16 :goto_2

    .line 553
    :cond_5
    instance-of v1, p1, Ll/ۧ᩹ܿ;

    if-eqz v1, :cond_6

    move-object v1, p1

    check-cast v1, Ll/ۧ᩹ܿ;

    .line 554
    invoke-virtual {v1}, Ll/ۧ᩹ܿ;->֫ܽ()Z

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {v1}, Ll/ۧ᩹ܿ;->۟ۧ()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v1

    invoke-interface {v1}, Ll/֡᩶ܿ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_6

    goto/16 :goto_2

    .line 558
    :cond_6
    instance-of v1, p0, Ll/ۧ᩹ܿ;

    if-eqz v1, :cond_7

    move-object v1, p0

    check-cast v1, Ll/ۧ᩹ܿ;

    .line 559
    invoke-virtual {v1}, Ll/ۧ᩹ܿ;->۟ۧ()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v1

    invoke-interface {v1}, Ll/֡᩶ܿ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_2

    .line 563
    :cond_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x16

    if-gt v1, v2, :cond_8

    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v1

    invoke-interface {v1}, Ll/֡᩶ܿ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 564
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-nez v1, :cond_c

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_2

    .line 582
    :cond_8
    invoke-static {v7}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v1

    .line 583
    invoke-static {p3}, Ll/֫᩵ܿ;->֫(Ll/ۚ᩸ܿ;)Ll/֫᩵ܿ;

    move-result-object v2

    if-nez v2, :cond_9

    const/4 v3, 0x0

    goto :goto_0

    .line 585
    :cond_9
    :try_start_0
    new-instance v3, Ll/᩵᩵ܿ;

    invoke-direct {v3, v2, v4, v5}, Ll/᩵᩵ܿ;-><init>(Ll/֫᩵ܿ;J)V

    .line 603
    :goto_0
    new-instance v4, Ll/֡᩵ܿ;

    invoke-direct {v4, p0, v1, v3}, Ll/֡᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/᩵᩶ܿ;Ljava/util/function/IntConsumer;)V

    invoke-virtual {p1, v4}, Ll/ܶ᩵ܿ;->֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;

    move-result-object v3

    .line 614
    invoke-virtual {v3}, Ll/᩷᩵ܿ;->ܽ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 623
    invoke-virtual {v1}, Ll/᩵᩶ܿ;->ᩴ()V

    if-eqz v2, :cond_f

    .line 625
    invoke-virtual {v2}, Ll/֫᩵ܿ;->ۧ()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 617
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_a

    const-string p3, "Unable to open source file"

    .line 618
    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    .line 619
    invoke-static {p0, p1}, Ll/۫ᩴܿ;->֫(Ll/ܶ᩵ܿ;Ljava/io/IOException;)V

    .line 621
    :cond_a
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 623
    :goto_1
    invoke-virtual {v1}, Ll/᩵᩶ܿ;->ᩴ()V

    if-eqz v2, :cond_b

    .line 625
    invoke-virtual {v2}, Ll/֫᩵ܿ;->ۧ()V

    .line 627
    :cond_b
    throw p1

    :cond_c
    :goto_2
    const/4 v1, 0x1

    new-array v8, v1, [Z

    aput-boolean v7, v8, v7

    .line 632
    :try_start_2
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v9
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 638
    :try_start_3
    new-instance v10, Ll/ۚ᩵ܿ;

    move-object v1, v10

    move-object v2, v8

    move-object v3, v9

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Ll/ۚ᩵ܿ;-><init>([ZLjava/io/InputStream;JLl/ۚ᩸ܿ;)V

    invoke-virtual {p1, v10}, Ll/ܶ᩵ܿ;->֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;

    move-result-object v1

    .line 651
    invoke-virtual {v1}, Ll/᩷᩵ܿ;->ܽ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v9, :cond_d

    .line 652
    :try_start_4
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 653
    :cond_d
    aget-boolean v1, v8, v7

    if-eqz v1, :cond_e

    if-eqz p3, :cond_e

    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 654
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 658
    :cond_e
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 659
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ll/ܶ᩵ܿ;->֫(J)Z

    :cond_f
    :goto_3
    if-eqz p3, :cond_10

    .line 662
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result p3

    if-nez p3, :cond_12

    :cond_10
    if-nez v0, :cond_12

    if-eqz p2, :cond_11

    .line 665
    invoke-virtual {p2, p1}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 667
    :cond_11
    invoke-static {p1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;)V

    :cond_12
    return-void

    :catchall_1
    move-exception p2

    if-eqz v9, :cond_13

    .line 637
    :try_start_5
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_13
    :goto_4
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p2

    .line 653
    aget-boolean v0, v8, v7

    if-eqz v0, :cond_14

    if-eqz p3, :cond_14

    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result p3

    if-eqz p3, :cond_14

    .line 654
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 656
    :cond_14
    throw p2

    :catch_1
    move-exception p1

    .line 634
    invoke-static {p0, p1}, Ll/۫ᩴܿ;->֫(Ll/ܶ᩵ܿ;Ljava/io/IOException;)V

    .line 635
    throw p1
.end method

.method public final ֫(Ll/ܶ᩵ܿ;ZZLjava/lang/Runnable;)V
    .locals 2

    .line 1039
    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 1042
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-nez v0, :cond_c

    .line 1045
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1046
    :cond_0
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Target file is a directory: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p3}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 1046
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1021
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1054
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v0, ".force_replace_target"

    .line 1057
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 1023
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 1024
    :cond_2
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Unable to move target file to rollback file: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p3}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 1024
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1055
    :cond_3
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Target file has no parent for rollback: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p3}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 1055
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    const/4 v0, 0x0

    .line 1028
    :goto_1
    :try_start_0
    invoke-virtual {p0, p1, p4}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_8

    .line 1096
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p3

    if-nez p3, :cond_5

    goto :goto_2

    :cond_5
    if-nez p2, :cond_6

    .line 1100
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    .line 1064
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".bak"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    invoke-static {p1, p2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 1104
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    move-result p2

    if-nez p2, :cond_7

    .line 1105
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    .line 1108
    :cond_7
    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 1109
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_8
    :goto_2
    return-void

    :catch_0
    move-exception p2

    .line 1076
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p4

    if-eqz p4, :cond_9

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    move-result p4

    if-nez p4, :cond_9

    .line 1077
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v1, "Unable to delete failed target file: "

    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p4}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p4

    .line 1117
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, p4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_9
    if-eqz v0, :cond_a

    .line 1079
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p4

    if-eqz p4, :cond_a

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p4

    if-nez p4, :cond_a

    .line 1080
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Unable to restore original target file: "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p4}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 1117
    new-instance p4, Ljava/io/IOException;

    invoke-direct {p4, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    if-eqz p3, :cond_b

    .line 1082
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result p1

    if-nez p1, :cond_b

    .line 1083
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Unable to delete source file after replace failure: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 1117
    new-instance p3, Ljava/io/IOException;

    invoke-direct {p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1085
    :cond_b
    throw p2

    .line 1043
    :cond_c
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Source file is a directory: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, p2}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 1043
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1040
    :cond_d
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Source and target are the same file: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, p2}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 1040
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫([B)V
    .locals 2

    const/4 v0, 0x0

    .line 787
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ܶ᩵ܿ;->֫([BII)V

    return-void
.end method

.method public final ֫([BII)V
    .locals 7

    .line 791
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 792
    invoke-static {p0}, Ll/ܿ֡ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 793
    :goto_0
    new-instance v0, Ll/֨᩵ܿ;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v1 .. v6}, Ll/֨᩵ܿ;-><init>(Ll/ܶ᩵ܿ;[BIIZ)V

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;

    move-result-object p1

    .line 812
    invoke-virtual {p1}, Ll/᩷᩵ܿ;->ܽ()V

    return-void
.end method

.method public ֫(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)Z
    .locals 3

    .line 1194
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 1195
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v1, "/"

    .line 1196
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1197
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1198
    :cond_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1199
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1200
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ֫֫()Ljava/lang/String;
    .locals 1

    .line 290
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۖ֫()Ljava/lang/String;
    .locals 1

    .line 225
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܰ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ۗ()Z
.end method

.method public ۗ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۘ֫()Ljava/lang/String;
    .locals 1

    .line 108
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܶ᩵ܿ;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘۧ()[B
    .locals 3

    .line 743
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    .line 744
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v1

    long-to-int v2, v1

    invoke-static {v0, v2}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 745
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    return-object v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    .line 743
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
.end method

.method public abstract ۙ()Z
.end method

.method public final ۙ֫()Z
    .locals 1

    .line 1268
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۚ()Z
    .locals 1

    .line 373
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֡()Z

    move-result v0

    return v0
.end method

.method public ۚۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۛ()V
    .locals 2

    .line 1121
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1122
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1123
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "File "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " exists and is not a directory. Unable to create directory."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1125
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1128
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1129
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 1130
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to create directory "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v0}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 1131
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_0
    return-void
.end method

.method public abstract ۛ֫()J
.end method

.method public abstract ۜ(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
.end method

.method public ۜ֫()Ll/ܶ᩵ܿ;
    .locals 1

    .line 142
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method

.method public abstract ۜۧ()Ljava/nio/channels/FileChannel;
.end method

.method public abstract ۠()Z
.end method

.method public abstract ۠֫()Z
.end method

.method public final ۠ۧ()Landroid/net/Uri;
    .locals 1

    .line 302
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۨ᩵ܿ;->֫(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ(Ljava/lang/String;)V
    .locals 1

    .line 853
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->֫([B)V

    return-void
.end method

.method public ۡ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۡ֫()Ljava/lang/String;
    .locals 3

    .line 118
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 120
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not parent: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 120
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۡۧ()I
    .locals 3

    .line 778
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    const/4 v1, 0x4

    :try_start_0
    new-array v2, v1, [B

    .line 2064
    invoke-static {v0, v2, v1}, Ll/᩹ۢ֡;->ۧ(Ljava/io/InputStream;[BI)V

    const/4 v1, 0x0

    .line 780
    invoke-static {v1, v2}, Ll/ܺܰۡ;->֫(I[B)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 781
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    return v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    .line 778
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
.end method

.method public ۢ()Ll/ۧ᩹ܿ;
    .locals 1

    .line 1260
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;
    .locals 0

    .line 499
    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->᩷(Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object p1

    invoke-static {p1}, Ll/֡ۖܽ;->֫(Ll/ۖۖܽ;)Ll/᩻ۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ۢ֫()Ll/ܶ᩵ܿ;
    .locals 3

    .line 257
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 259
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not parent: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 259
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract ۢۧ()Ljava/io/InputStream;
.end method

.method public abstract ۤ()Z
.end method

.method public ۤ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ۧ(Z)Ljava/util/List;
.end method

.method public ۧ()Ll/۬۠ܿ;
    .locals 1

    .line 1312
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ۧ(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V
    .locals 8

    .line 825
    invoke-static {p0}, Ll/ܿ֡ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v7, 0x0

    .line 826
    :goto_0
    new-instance v0, Ll/۠᩵ܿ;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Ll/۠᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ljava/io/InputStream;JLl/ۚ᩸ܿ;Z)V

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;

    move-result-object p1

    .line 845
    invoke-virtual {p1}, Ll/᩷᩵ܿ;->ܽ()V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 4

    .line 889
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 859
    array-length v0, p1

    .line 863
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 864
    invoke-static {p0}, Ll/ܿ֡ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 865
    :goto_0
    invoke-virtual {p0, v3}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v3

    .line 866
    :try_start_0
    invoke-virtual {v3, p1, v2, v0}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 867
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    if-eqz v1, :cond_1

    .line 869
    invoke-static {p0}, Ll/ܿ֡ܿ;->ܽ(Ll/ܶ᩵ܿ;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    if-eqz v3, :cond_2

    .line 865
    :try_start_1
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p1
.end method

.method public abstract ۧ(Ll/ܶ᩵ܿ;)Z
.end method

.method public ۧ(Ll/ܿۖ᩷;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ֫()Ljava/lang/String;
    .locals 3

    .line 103
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0}, Ll/ܶ᩵ܿ;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧۧ()Ljava/io/BufferedInputStream;
    .locals 2

    .line 423
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    .line 424
    instance-of v1, v0, Ljava/io/BufferedInputStream;

    if-eqz v1, :cond_0

    .line 425
    check-cast v0, Ljava/io/BufferedInputStream;

    return-object v0

    .line 426
    :cond_0
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v1
.end method

.method public ۨ()V
    .locals 1

    .line 1138
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    return-void
.end method

.method public ۫()Z
    .locals 1

    .line 313
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v0

    return v0
.end method

.method public ۫֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ۬()Z
.end method

.method public final ܰ()Ljava/lang/String;
    .locals 3

    .line 147
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܿ֫()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v1, "/"

    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    .line 152
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۜ֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_7

    .line 155
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, ".."

    .line 157
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 158
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    const-string v2, "./"

    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x2

    .line 161
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    const-string v2, "../"

    .line 162
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x3

    .line 163
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 164
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    goto :goto_0

    .line 166
    :cond_5
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 156
    :cond_6
    :goto_1
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 169
    :cond_7
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ܰ֫()Ljava/util/List;
.end method

.method public final ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 907
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ܳۧ()Ljava/io/BufferedReader;
    .locals 4

    .line 438
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 442
    new-instance v1, Ljava/io/BufferedReader;

    .line 434
    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 442
    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    return-object v1
.end method

.method public ܶ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܶۧ()Landroid/net/Uri;
    .locals 2

    .line 130
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public abstract ܺ()Z
.end method

.method public abstract ܺ֫()Ljava/lang/String;
.end method

.method public final ܺۧ()[B
    .locals 5

    .line 752
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    const-wide/32 v2, 0x1400000

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 754
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    return-object v0

    .line 757
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 758
    :try_start_1
    invoke-static {v0, v1, v2}, Ll/֡ۤۡ;->֫(JLjava/io/InputStream;)[B

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    .line 759
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    return-object v0

    :catchall_0
    move-exception v0

    if-eqz v2, :cond_2

    .line 757
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 760
    :catch_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    return-object v0
.end method

.method public abstract ܽ(Z)Ljava/io/OutputStream;
.end method

.method public ܽ(Ljava/lang/String;)V
    .locals 1

    .line 233
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public ܽ֫()Landroid/net/Uri;
    .locals 1

    .line 298
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ܿ()Ll/ۡܶܿ;
    .locals 1

    .line 1296
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 274
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object v0

    .line 275
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public ܿ֫()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܿۧ()Ljava/io/BufferedOutputStream;
    .locals 2

    const/4 v0, 0x0

    .line 456
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v0

    .line 457
    instance-of v1, v0, Ljava/io/BufferedOutputStream;

    if-eqz v1, :cond_0

    .line 458
    check-cast v0, Ljava/io/BufferedOutputStream;

    return-object v0

    .line 459
    :cond_0
    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-direct {v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v1
.end method

.method public final ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 280
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public abstract ᩴ()Z
.end method

.method public final ᩴ֫()Ll/ܶ᩵ܿ;
    .locals 1

    const-string v0, ".tmp"

    .line 903
    invoke-static {p0, v0}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method

.method public ᩵֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵ۧ()Ll/۬ۜܽ;
    .locals 2

    .line 765
    new-instance v0, Ll/۬ۜܽ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۬ۜܽ;-><init>([B)V

    return-object v0
.end method

.method public final ᩶()V
    .locals 5

    .line 916
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 918
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 919
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    .line 922
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".bak"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 923
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 924
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public ᩶֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ᩷(Ljava/lang/String;)Ll/ۖۖܽ;
.end method

.method public ᩷()Ll/ܺ֡ܿ;
    .locals 1

    .line 1240
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ᩸()V
    .locals 2

    .line 928
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".bak"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 929
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 930
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 931
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 933
    :cond_0
    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    :cond_1
    return-void
.end method

.method public final ᩸֫()Z
    .locals 1

    .line 218
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܿ֫()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩸ۧ()Ll/ܺ֡ܿ;
    .locals 3

    .line 1244
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1245
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩷()Ll/ܺ֡ܿ;

    move-result-object v0

    return-object v0

    .line 0
    :cond_0
    instance-of v0, p0, Ll/۬۠ܿ;

    if-eqz v0, :cond_1

    .line 1247
    new-instance v0, Ll/ܺ֡ܿ;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ܺ֡ܿ;-><init>(Ljava/io/File;Z)V

    return-object v0

    .line 1248
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1249
    new-instance v0, Ll/ܺ֡ܿ;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۧ᩹ܿ;->֫ܽ()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Ll/ܺ֡ܿ;-><init>(Ljava/io/File;Z)V

    return-object v0

    .line 1251
    :cond_2
    new-instance v0, Ll/ܺ֡ܿ;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 49
    invoke-direct {v0, v1, v2}, Ll/ܺ֡ܿ;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public ᩹()Ll/ۤ᩵ܿ;
    .locals 1

    .line 188
    new-instance v0, Ll/᩶᩵ܿ;

    invoke-direct {v0, p0}, Ll/ۤ᩵ܿ;-><init>(Ll/ܶ᩵ܿ;)V

    return-object v0
.end method

.method public ᩹֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ᩺()Ll/ܶ᩵ܿ;
    .locals 0

    return-object p0
.end method

.method public abstract ᩺֫()J
.end method

.method public ᩻()Ll/۬ܶܿ;
    .locals 1

    .line 1304
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ᩻(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 903
    invoke-static {p0, p1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩻֫()Ll/ܶ᩵ܿ;
    .locals 2

    .line 248
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 250
    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
