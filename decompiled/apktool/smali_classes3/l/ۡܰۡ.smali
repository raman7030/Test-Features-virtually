.class public final Ll/ۡܰۡ;
.super Ljava/lang/Object;
.source "G4GB"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ֫֫:Ljava/io/OutputStream;

.field public final ۗ:[B

.field public ۙ:Ljava/lang/String;

.field public final ۛ:Ljava/util/ArrayList;

.field public ۟:I

.field public final ۤ:Ll/ܶ᩵ܿ;

.field public ۧ֫:Ljava/lang/String;

.field public ۨ:Ll/ۢۖᩴ;

.field public ۫:Ljava/nio/charset/Charset;

.field public ۬:Ll/ۡ᩺ۡ;

.field public ܰ:I

.field public final ܽ֫:J

.field public ܿ֫:Z

.field public ᩳ֫:Ll/ۨܰۡ;

.field public ᩶:Ll/ۤܰۡ;

.field public ᩸:[B

.field public final ᩹:Ll/᩻ۖܽ;

.field public ᩺:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 114
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    const-wide/16 v0, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;JLl/ۙۨܳ;)V

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 3

    const-wide/16 v0, -0x1

    const/4 v2, 0x0

    .line 118
    invoke-direct {p0, p1, v0, v1, v2}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;JLl/ۙۨܳ;)V

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;JLl/ۙۨܳ;)V
    .locals 9

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡܰۡ;->ۛ:Ljava/util/ArrayList;

    const/16 v0, 0x8

    .line 91
    iput v0, p0, Ll/ۡܰۡ;->۟:I

    const/4 v0, -0x1

    .line 93
    iput v0, p0, Ll/ۡܰۡ;->ܰ:I

    .line 95
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    iput-object v0, p0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    .line 109
    new-instance v0, Ll/ۢۖᩴ;

    invoke-direct {v0}, Ll/ۢۖᩴ;-><init>()V

    iput-object v0, p0, Ll/ۡܰۡ;->ۨ:Ll/ۢۖᩴ;

    const/16 v0, 0x2000

    new-array v0, v0, [B

    .line 249
    iput-object v0, p0, Ll/ۡܰۡ;->ۗ:[B

    .line 152
    iput-object p1, p0, Ll/ۡܰۡ;->ۤ:Ll/ܶ᩵ܿ;

    .line 153
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-gtz v2, :cond_1

    const-string p2, "rw"

    .line 156
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p2

    iput-object p2, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    const-wide/16 p2, -0x1

    .line 157
    iput-wide p2, p0, Ll/ۡܰۡ;->ܽ֫:J

    goto :goto_0

    :cond_1
    const-wide/32 v0, 0xf000

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    const-wide v0, 0xffffffffL

    cmp-long v2, p2, v0

    if-gtz v2, :cond_2

    .line 161
    new-instance v7, Ll/ᩴۢᩴ;

    invoke-direct {v7}, Ll/ᩴۢᩴ;-><init>()V

    .line 162
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 163
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۖۢ֡;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 164
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll/ۜܰۡ;

    move-object v3, v1

    move-object v4, p0

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, Ll/ۜܰۡ;-><init>(Ll/ۡܰۡ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ᩴۢᩴ;Ll/۬ۤ;)V

    invoke-static {v0, p2, p3, v1}, Ll/᩶ۖܽ;->֫(Ljava/lang/String;JLl/᩹ۖܽ;)Ll/᩶ۖܽ;

    move-result-object p4

    .line 176
    invoke-static {p4}, Ll/֡ۖܽ;->֫(Ll/ۖۖܽ;)Ll/᩻ۖܽ;

    move-result-object p4

    iput-object p4, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    .line 177
    iput-wide p2, p0, Ll/ۡܰۡ;->ܽ֫:J

    const p2, 0x8074b50

    .line 178
    invoke-direct {p0, p2}, Ll/ۡܰۡ;->ܽ(I)V

    .line 180
    :goto_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܺܰۡ;->֫(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۡܰۡ;->ܿ֫:Z

    return-void

    .line 159
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Zip split segment size should between 64K and 4,294,967,295"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/᩻ۖܽ;)V
    .locals 2

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡܰۡ;->ۛ:Ljava/util/ArrayList;

    const/16 v0, 0x8

    .line 91
    iput v0, p0, Ll/ۡܰۡ;->۟:I

    const/4 v0, -0x1

    .line 93
    iput v0, p0, Ll/ۡܰۡ;->ܰ:I

    .line 95
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    iput-object v0, p0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    .line 109
    new-instance v0, Ll/ۢۖᩴ;

    invoke-direct {v0}, Ll/ۢۖᩴ;-><init>()V

    iput-object v0, p0, Ll/ۡܰۡ;->ۨ:Ll/ۢۖᩴ;

    const/16 v0, 0x2000

    new-array v0, v0, [B

    .line 249
    iput-object v0, p0, Ll/ۡܰۡ;->ۗ:[B

    .line 141
    iput-object p1, p0, Ll/ۡܰۡ;->ۤ:Ll/ܶ᩵ܿ;

    .line 142
    iput-object p2, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    const-wide/16 v0, -0x1

    .line 143
    iput-wide v0, p0, Ll/ۡܰۡ;->ܽ֫:J

    .line 144
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܺܰۡ;->֫(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۡܰۡ;->ܿ֫:Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۡܰۡ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ᩴۢᩴ;Ll/۬ۤ;I)Ll/ۖۖܽ;
    .locals 4

    .line 165
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    add-int/lit8 v1, p5, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 p2, 0x1

    aput-object v1, v2, p2

    const-string p2, "%s.z%02d"

    invoke-static {v0, p2, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    const-string p2, "rw"

    .line 166
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->᩷(Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object p2

    .line 167
    invoke-virtual {p3, p5}, Ll/ᩴۢᩴ;->add(I)Z

    move-result p3

    if-eqz p3, :cond_1

    const-wide/16 v0, 0x0

    .line 168
    invoke-interface {p2, v0, v1}, Ll/ۖۖܽ;->setLength(J)V

    if-eqz p4, :cond_0

    .line 170
    invoke-interface {p4, p1}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    .line 172
    :cond_0
    iput-object p1, p0, Ll/ۡܰۡ;->᩺:Ll/ܶ᩵ܿ;

    :cond_1
    return-object p2
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Ll/ۡܰۡ;
    .locals 6

    const-string v0, "rw"

    .line 123
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v0

    .line 125
    :try_start_0
    invoke-virtual {v0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 128
    new-instance v1, Ll/ۡܰۡ;

    invoke-direct {v1, p0, v0}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;Ll/᩻ۖܽ;)V

    return-object v1

    .line 126
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v1, "ZIP output file must be empty"

    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 131
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ll/᩻ۖܽ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    .line 133
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 135
    :goto_1
    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۡܰۡ;)Ll/ۡ᩺ۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    return-object p0
.end method

.method private ֫(JJJJ)V
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    const/4 v9, 0x1

    const/4 v10, 0x0

    const v11, 0xffff

    const-wide v12, 0xffffffffL

    .line 877
    iget-object v14, v0, Ll/ۡܰۡ;->ۛ:Ljava/util/ArrayList;

    const-wide/32 v15, 0xffff

    cmp-long v17, v1, v15

    if-gez v17, :cond_1

    cmp-long v17, v3, v15

    if-gez v17, :cond_1

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-ge v15, v11, :cond_1

    cmp-long v15, v5, v12

    if-gtz v15, :cond_1

    cmp-long v15, v7, v12

    if-lez v15, :cond_0

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v12, 0x1

    :goto_1
    if-eqz v12, :cond_5

    const v13, 0x6064b50

    .line 880
    invoke-direct {v0, v13}, Ll/ۡܰۡ;->ܽ(I)V

    move v15, v12

    const-wide/16 v11, 0x2c

    .line 881
    invoke-direct {v0, v11, v12}, Ll/ۡܰۡ;->ۧ(J)V

    const/16 v11, 0x14

    .line 882
    invoke-direct {v0, v11}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 883
    invoke-direct {v0, v11}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 884
    invoke-direct/range {p0 .. p2}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 885
    invoke-direct {v0, v3, v4}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 886
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v11

    int-to-long v11, v11

    invoke-direct {v0, v11, v12}, Ll/ۡܰۡ;->ۧ(J)V

    .line 887
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v11

    int-to-long v11, v11

    invoke-direct {v0, v11, v12}, Ll/ۡܰۡ;->ۧ(J)V

    .line 888
    invoke-direct {v0, v5, v6}, Ll/ۡܰۡ;->ۧ(J)V

    .line 889
    invoke-direct {v0, v7, v8}, Ll/ۡܰۡ;->ۧ(J)V

    const v11, 0x7064b50

    .line 894
    invoke-direct {v0, v11}, Ll/ۡܰۡ;->ܽ(I)V

    .line 895
    iget-wide v11, v0, Ll/ۡܰۡ;->ܽ֫:J

    const-wide/16 v16, -0x1

    cmp-long v18, v11, v16

    if-nez v18, :cond_2

    .line 896
    invoke-direct {v0, v10}, Ll/ۡܰۡ;->ܽ(I)V

    add-long v10, v5, v7

    .line 897
    invoke-direct {v0, v10, v11}, Ll/ۡܰۡ;->ۧ(J)V

    .line 898
    invoke-direct {v0, v9}, Ll/ۡܰۡ;->ܽ(I)V

    goto :goto_4

    :cond_2
    cmp-long v10, v1, v3

    if-eqz v10, :cond_3

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    :goto_2
    long-to-int v10, v1

    .line 901
    invoke-direct {v0, v10}, Ll/ۡܰۡ;->ܽ(I)V

    if-eqz v9, :cond_4

    const-wide/16 v9, 0x0

    goto :goto_3

    .line 902
    :cond_4
    invoke-direct/range {p0 .. p0}, Ll/ۡܰۡ;->ۘ()J

    move-result-wide v9

    const-wide/16 v11, 0x40

    sub-long/2addr v9, v11

    :goto_3
    invoke-direct {v0, v9, v10}, Ll/ۡܰۡ;->ۧ(J)V

    const-wide/16 v9, 0x1

    add-long/2addr v9, v1

    long-to-int v10, v9

    .line 903
    invoke-direct {v0, v10}, Ll/ۡܰۡ;->ܽ(I)V

    goto :goto_4

    :cond_5
    move v15, v12

    .line 906
    :goto_4
    iget-object v9, v0, Ll/ۡܰۡ;->ۙ:Ljava/lang/String;

    if-nez v9, :cond_6

    sget-object v9, Ll/ۚ᩺ۘ;->֫:[B

    goto :goto_5

    :cond_6
    iget-object v10, v0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    invoke-virtual {v9, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v9

    :goto_5
    const v10, 0x6054b50

    .line 907
    invoke-direct {v0, v10}, Ll/ۡܰۡ;->ܽ(I)V

    long-to-int v2, v1

    .line 908
    invoke-direct {v0, v2}, Ll/ۡܰۡ;->ᩳ(I)V

    long-to-int v1, v3

    .line 909
    invoke-direct {v0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    if-eqz v15, :cond_7

    const v1, 0xffff

    .line 911
    invoke-direct {v0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 912
    invoke-direct {v0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    const-wide v1, 0xffffffffL

    .line 913
    invoke-direct {v0, v1, v2}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 914
    invoke-direct {v0, v1, v2}, Ll/ۡܰۡ;->ᩳ(J)V

    goto :goto_6

    .line 916
    :cond_7
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 917
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 918
    invoke-direct {v0, v5, v6}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 919
    invoke-direct {v0, v7, v8}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 921
    :goto_6
    array-length v1, v9

    invoke-direct {v0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 922
    invoke-direct {v0, v9}, Ll/ۡܰۡ;->ܽ([B)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡ᩺ۡ;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۡܰۡ;->ܽ(Ll/ۡ᩺ۡ;)V

    return-void
.end method

.method private ۖ()I
    .locals 6

    const-wide/16 v0, -0x1

    .line 926
    iget-wide v2, p0, Ll/ۡܰۡ;->ܽ֫:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_1

    .line 929
    iget-object v0, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    div-long/2addr v0, v2

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return v2

    .line 0
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 927
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method private ۘ()J
    .locals 5

    const-wide/16 v0, -0x1

    .line 933
    iget-wide v2, p0, Ll/ۡܰۡ;->ܽ֫:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_0

    .line 936
    iget-object v0, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    rem-long/2addr v0, v2

    return-wide v0

    .line 934
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public static bridge synthetic ۧ(Ll/ۡܰۡ;)Ljava/nio/charset/Charset;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    return-object p0
.end method

.method private ۧ(J)V
    .locals 5

    const-wide/16 v0, 0xff

    and-long v2, p1, v0

    long-to-int v3, v2

    .line 973
    iget-object v2, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v2, v3}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x8

    ushr-long v3, p1, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    .line 974
    invoke-virtual {v2, v4}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x10

    ushr-long v3, p1, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    .line 975
    invoke-virtual {v2, v4}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x18

    ushr-long v3, p1, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    .line 976
    invoke-virtual {v2, v4}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x20

    ushr-long v3, p1, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    .line 977
    invoke-virtual {v2, v4}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x28

    ushr-long v3, p1, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    .line 978
    invoke-virtual {v2, v4}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x30

    ushr-long v3, p1, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    .line 979
    invoke-virtual {v2, v4}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x38

    ushr-long/2addr p1, v3

    and-long/2addr p1, v0

    long-to-int p2, p1

    .line 980
    invoke-virtual {v2, p2}, Ll/᩻ۖܽ;->write(I)V

    return-void
.end method

.method private ۧ(Ll/ۡ᩺ۡ;)V
    .locals 12

    .line 260
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    if-eqz v0, :cond_0

    .line 261
    invoke-virtual {p0}, Ll/ۡܰۡ;->ܽ()V

    .line 263
    :cond_0
    iget-wide v0, p0, Ll/ۡܰۡ;->ܽ֫:J

    const-wide/16 v2, -0x1

    iget-object v4, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    cmp-long v5, v0, v2

    if-eqz v5, :cond_1

    .line 264
    invoke-direct {p0}, Ll/ۡܰۡ;->ۖ()I

    move-result v0

    iput v0, p1, Ll/ۡ᩺ۡ;->ۗ:I

    .line 265
    invoke-direct {p0}, Ll/ۡܰۡ;->ۘ()J

    move-result-wide v0

    iput-wide v0, p1, Ll/ۡ᩺ۡ;->ۨ:J

    .line 944
    invoke-virtual {v4}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    .line 266
    iput-wide v0, p1, Ll/ۡ᩺ۡ;->ۛ:J

    goto :goto_0

    .line 944
    :cond_1
    invoke-virtual {v4}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    .line 268
    iput-wide v0, p1, Ll/ۡ᩺ۡ;->ۛ:J

    iput-wide v0, p1, Ll/ۡ᩺ۡ;->ۨ:J

    .line 270
    :goto_0
    iget-object v0, p0, Ll/ۡܰۡ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    iget-boolean v0, p1, Ll/ۡ᩺ۡ;->ܰ:Z

    iget-boolean v1, p1, Ll/ۡ᩺ۡ;->֫֫:Z

    const/4 v2, 0x0

    if-nez v0, :cond_d

    .line 273
    iput-object p1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    .line 275
    iget-object v0, p0, Ll/ۡܰۡ;->ۧ֫:Ljava/lang/String;

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    .line 276
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 278
    :goto_1
    iget v6, p0, Ll/ۡܰۡ;->۟:I

    .line 280
    new-instance v7, Ll/ۤܰۡ;

    invoke-direct {v7, v4}, Ll/ۤܰۡ;-><init>(Ll/᩻ۖܽ;)V

    iput-object v7, p0, Ll/ۡܰۡ;->᩶:Ll/ۤܰۡ;

    if-eqz v5, :cond_5

    .line 284
    new-instance v5, Ll/ۚܰۡ;

    const/4 v8, 0x3

    invoke-direct {v5, v7, v0, v8, v2}, Ll/ۚܰۡ;-><init>(Ljava/io/OutputStream;Ljava/lang/String;IZ)V

    .line 285
    sget v0, Ll/۠᩺ۡ;->᩹:I

    const/4 v0, 0x7

    new-array v7, v0, [B

    .line 152
    sget-boolean v9, Ll/ۖܰۡ;->֫:Z

    const/4 v9, 0x2

    .line 54
    invoke-static {v2, v9, v7}, Ll/ܺܰۡ;->ۧ(II[B)V

    const-string v10, "AE"

    .line 153
    invoke-virtual {v10}, Ljava/lang/String;->getBytes()[B

    move-result-object v10

    .line 72
    array-length v11, v10

    add-int/2addr v11, v9

    if-gt v11, v0, :cond_4

    .line 75
    array-length v0, v10

    invoke-static {v10, v2, v7, v9, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    int-to-byte v0, v8

    const/4 v2, 0x4

    aput-byte v0, v7, v2

    const/4 v0, 0x5

    .line 54
    invoke-static {v0, v6, v7}, Ll/ܺܰۡ;->ۧ(II[B)V

    .line 286
    iget-object v0, p1, Ll/ۡ᩺ۡ;->ۧ֫:[B

    iget-object v2, p1, Ll/ۡ᩺ۡ;->᩸:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    const v2, 0x9901

    if-eqz v0, :cond_3

    .line 287
    iget-object v0, p1, Ll/ۡ᩺ۡ;->ۧ֫:[B

    invoke-static {v2, v0, v7}, Ll/۠᩺ۡ;->֫(I[B[B)[B

    move-result-object v0

    iput-object v0, p1, Ll/ۡ᩺ۡ;->᩸:[B

    iput-object v0, p1, Ll/ۡ᩺ۡ;->ۧ֫:[B

    goto :goto_2

    .line 289
    :cond_3
    iget-object v0, p1, Ll/ۡ᩺ۡ;->ۧ֫:[B

    invoke-static {v2, v0, v7}, Ll/۠᩺ۡ;->֫(I[B[B)[B

    move-result-object v0

    iput-object v0, p1, Ll/ۡ᩺ۡ;->ۧ֫:[B

    .line 290
    iget-object v0, p1, Ll/ۡ᩺ۡ;->᩸:[B

    invoke-static {v2, v0, v7}, Ll/۠᩺ۡ;->֫(I[B[B)[B

    move-result-object v0

    iput-object v0, p1, Ll/ۡ᩺ۡ;->᩸:[B

    :goto_2
    const/16 v6, 0x63

    const/4 v2, 0x1

    move-object v7, v5

    goto :goto_3

    .line 73
    :cond_4
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_5
    :goto_3
    if-eqz v1, :cond_6

    or-int/lit16 v2, v2, 0x800

    .line 299
    :cond_6
    iput v2, p1, Ll/ۡ᩺ۡ;->۫:I

    .line 300
    iput v6, p1, Ll/ۡ᩺ۡ;->ܽ֫:I

    .line 302
    invoke-direct {p0, p1}, Ll/ۡܰۡ;->ܿ(Ll/ۡ᩺ۡ;)V

    .line 944
    invoke-virtual {v4}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    .line 303
    iput-wide v0, p1, Ll/ۡ᩺ۡ;->ۤ:J

    .line 305
    iget p1, p0, Ll/ۡܰۡ;->۟:I

    if-eqz p1, :cond_c

    const/16 v0, 0x8

    if-eq p1, v0, :cond_a

    const/16 v0, 0xc

    if-eq p1, v0, :cond_9

    const/16 v0, 0x24

    if-eq p1, v0, :cond_8

    const/16 v0, 0x5f

    if-ne p1, v0, :cond_7

    const/4 p1, 0x6

    .line 328
    invoke-static {v7, p1}, Ll/֨ۨۡ;->֫(Ljava/io/OutputStream;I)Ljava/io/OutputStream;

    move-result-object v7

    goto :goto_5

    .line 331
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unsupported compression method "

    .line 0
    invoke-static {v6, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 331
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 321
    :cond_8
    new-instance p1, Ll/ۘ۟ۡ;

    invoke-direct {p1, v7}, Ll/ۘ۟ۡ;-><init>(Ljava/io/OutputStream;)V

    goto :goto_4

    .line 325
    :cond_9
    new-instance p1, Ll/ܺ۠֡;

    const/16 v0, 0x9

    .line 221
    invoke-direct {p1, v7, v0}, Ll/ܺ۠֡;-><init>(Ljava/io/OutputStream;I)V

    goto :goto_4

    .line 307
    :cond_a
    iget p1, p0, Ll/ۡܰۡ;->ܰ:I

    const/16 v0, 0xa

    if-ne p1, v0, :cond_b

    .line 309
    :try_start_0
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->ۧ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 313
    invoke-static {v7}, Lnet/sf/sevenzipjbinding/SevenZip;->֫(Ljava/io/OutputStream;)Ljava/io/OutputStream;

    move-result-object v7

    goto :goto_5

    :catch_0
    move-exception p1

    .line 311
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 315
    :cond_b
    new-instance p1, Ll/֫۟ۡ;

    iget v0, p0, Ll/ۡܰۡ;->ܰ:I

    .line 11
    new-instance v1, Ljava/util/zip/Deflater;

    invoke-direct {v1, v0, v3}, Ljava/util/zip/Deflater;-><init>(IZ)V

    invoke-direct {p1, v7, v1}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V

    :goto_4
    move-object v7, p1

    .line 333
    :cond_c
    :goto_5
    new-instance p1, Ll/ۨܰۡ;

    invoke-direct {p1, v7}, Ll/ۨܰۡ;-><init>(Ljava/io/OutputStream;)V

    iput-object p1, p0, Ll/ۡܰۡ;->ᩳ֫:Ll/ۨܰۡ;

    return-void

    .line 335
    :cond_d
    iput v2, p1, Ll/ۡ᩺ۡ;->ܽ֫:I

    if-eqz v1, :cond_e

    const/16 v0, 0x800

    .line 337
    iput v0, p1, Ll/ۡ᩺ۡ;->۫:I

    .line 339
    :cond_e
    invoke-direct {p0, p1}, Ll/ۡܰۡ;->ܿ(Ll/ۡ᩺ۡ;)V

    .line 944
    invoke-virtual {v4}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    .line 340
    iput-wide v0, p1, Ll/ۡ᩺ۡ;->ۤ:J

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۡܰۡ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܰۡ;->ۛ:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ܽ(I)V
    .locals 2

    and-int/lit16 v0, p1, 0xff

    .line 966
    iget-object v1, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v1, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 967
    invoke-virtual {v1, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 968
    invoke-virtual {v1, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    .line 969
    invoke-virtual {v1, p1}, Ll/᩻ۖܽ;->write(I)V

    return-void
.end method

.method public static ܽ(Ll/ۡ᩺ۡ;)V
    .locals 10

    .line 565
    iget-wide v0, p0, Ll/ۡ᩺ۡ;->᩷֫:J

    const-wide v2, 0xf0000000L

    const-wide v4, 0xffffffffL

    const/4 v6, 0x1

    const-wide/16 v7, -0x1

    cmp-long v9, v0, v2

    if-ltz v9, :cond_0

    iget-wide v2, p0, Ll/ۡ᩺ۡ;->᩶:J

    cmp-long v9, v2, v7

    if-nez v9, :cond_0

    .line 566
    iput-boolean v6, p0, Ll/ۡ᩺ۡ;->ۢ֫:Z

    goto :goto_0

    :cond_0
    cmp-long v2, v0, v4

    if-gez v2, :cond_1

    .line 567
    iget-wide v2, p0, Ll/ۡ᩺ۡ;->᩶:J

    cmp-long v9, v2, v4

    if-ltz v9, :cond_2

    .line 569
    :cond_1
    iput-boolean v6, p0, Ll/ۡ᩺ۡ;->ۢ֫:Z

    .line 571
    :cond_2
    :goto_0
    iget-wide v2, p0, Ll/ۡ᩺ۡ;->ۨ:J

    cmp-long v9, v2, v4

    if-ltz v9, :cond_3

    .line 572
    iput-boolean v6, p0, Ll/ۡ᩺ۡ;->ܳ֫:Z

    :cond_3
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v7

    if-nez v4, :cond_4

    .line 575
    iput-wide v2, p0, Ll/ۡ᩺ۡ;->᩷֫:J

    .line 577
    :cond_4
    iget-wide v0, p0, Ll/ۡ᩺ۡ;->᩶:J

    cmp-long v4, v0, v7

    if-nez v4, :cond_5

    .line 578
    iput-wide v2, p0, Ll/ۡ᩺ۡ;->᩶:J

    :cond_5
    return-void
.end method

.method private ܽ([B)V
    .locals 3

    .line 952
    array-length v0, p1

    if-lez v0, :cond_0

    .line 953
    iget-object v0, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 111
    array-length v2, p1

    invoke-virtual {v0, p1, v1, v2}, Ll/᩻ۖܽ;->write([BII)V

    :cond_0
    return-void
.end method

.method private ܿ(Ll/ۡ᩺ۡ;)V
    .locals 12

    .line 516
    invoke-static {p1}, Ll/ۡܰۡ;->ܽ(Ll/ۡ᩺ۡ;)V

    iget-object v0, p1, Ll/ۡ᩺ۡ;->ᩳ֫:[B

    const v1, 0x4034b50

    .line 518
    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ܽ(I)V

    .line 71
    iget-boolean v1, p1, Ll/ۡ᩺ۡ;->ۢ֫:Z

    const/4 v2, 0x1

    if-nez v1, :cond_3

    iget-boolean v1, p1, Ll/ۡ᩺ۡ;->ܳ֫:Z

    if-eqz v1, :cond_0

    goto :goto_1

    .line 85
    :cond_0
    iget v1, p1, Ll/ۡ᩺ۡ;->ܽ֫:I

    if-nez v1, :cond_2

    .line 75
    iget v1, p1, Ll/ۡ᩺ۡ;->۫:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0xa

    goto :goto_2

    :cond_2
    :goto_0
    const/16 v1, 0x14

    goto :goto_2

    :cond_3
    :goto_1
    const/16 v1, 0x2d

    .line 519
    :goto_2
    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 520
    iget v1, p1, Ll/ۡ᩺ۡ;->۫:I

    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 521
    iget v1, p1, Ll/ۡ᩺ۡ;->ܽ֫:I

    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 522
    iget v1, p1, Ll/ۡ᩺ۡ;->ۡ֫:I

    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ܽ(I)V

    .line 523
    iget v1, p1, Ll/ۡ᩺ۡ;->ۙ:I

    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ܽ(I)V

    .line 524
    iget-boolean v1, p1, Ll/ۡ᩺ۡ;->ۢ֫:Z

    if-eqz v1, :cond_4

    const-wide v3, 0xffffffffL

    .line 525
    invoke-direct {p0, v3, v4}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 526
    invoke-direct {p0, v3, v4}, Ll/ۡܰۡ;->ᩳ(J)V

    goto :goto_3

    .line 528
    :cond_4
    iget-wide v3, p1, Ll/ۡ᩺ۡ;->᩶:J

    invoke-direct {p0, v3, v4}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 529
    iget-wide v3, p1, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-direct {p0, v3, v4}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 531
    :goto_3
    array-length v1, v0

    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 534
    iget-boolean v1, p1, Ll/ۡ᩺ۡ;->ۢ֫:Z

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    const/16 v1, 0x10

    new-array v1, v1, [B

    .line 536
    iget-wide v4, p1, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-static {v4, v5, v3, v1}, Ll/ۖܰۡ;->֫(JI[B)V

    const/16 v4, 0x8

    .line 537
    iget-wide v5, p1, Ll/ۡ᩺ۡ;->᩶:J

    invoke-static {v5, v6, v4, v1}, Ll/ۖܰۡ;->֫(JI[B)V

    .line 538
    iget-object v4, p1, Ll/ۡ᩺ۡ;->ۧ֫:[B

    invoke-static {v2, v4, v1}, Ll/۠᩺ۡ;->֫(I[B[B)[B

    move-result-object v1

    goto :goto_4

    .line 540
    :cond_5
    iget-object v1, p1, Ll/ۡ᩺ۡ;->ۧ֫:[B

    invoke-static {v2, v1}, Ll/۠᩺ۡ;->ۧ(I[B)[B

    move-result-object v1

    .line 542
    :goto_4
    iget-boolean v2, p0, Ll/ۡܰۡ;->ܿ֫:Z

    if-eqz v2, :cond_a

    iget v2, p1, Ll/ۡ᩺ۡ;->ܽ֫:I

    if-nez v2, :cond_a

    .line 544
    iget-boolean p1, p1, Ll/ۡ᩺ۡ;->۟:Z

    if-nez p1, :cond_7

    new-instance p1, Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v2, ".so"

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_5

    :cond_6
    const/4 p1, 0x4

    goto :goto_6

    :cond_7
    :goto_5
    const/16 p1, 0x4000

    .line 944
    :goto_6
    iget-object v2, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v2}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v4

    const-wide/16 v6, 0x2

    add-long/2addr v4, v6

    .line 550
    array-length v2, v0

    int-to-long v6, v2

    add-long/2addr v4, v6

    .line 774
    array-length v2, v1

    int-to-long v6, v2

    add-long/2addr v6, v4

    int-to-long v8, p1

    .line 783
    rem-long/2addr v6, v8

    const-wide/16 v10, 0x0

    cmp-long v2, v6, v10

    if-nez v2, :cond_8

    goto :goto_8

    .line 777
    :cond_8
    invoke-static {v1}, Ll/۠᩺ۡ;->֫([B)[B

    move-result-object v1

    .line 778
    array-length v2, v1

    int-to-long v6, v2

    add-long/2addr v4, v6

    .line 787
    rem-long/2addr v4, v8

    long-to-int v2, v4

    if-nez v2, :cond_9

    goto :goto_7

    :cond_9
    sub-int v3, p1, v2

    .line 779
    :goto_7
    array-length p1, v1

    add-int/2addr p1, v3

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    .line 553
    :cond_a
    :goto_8
    array-length p1, v1

    invoke-direct {p0, p1}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 554
    invoke-direct {p0, v0}, Ll/ۡܰۡ;->ܽ([B)V

    .line 556
    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ܽ([B)V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ۡܰۡ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡܰۡ;->ܽ֫:J

    return-wide v0
.end method

.method private ᩳ(I)V
    .locals 2

    and-int/lit16 v0, p1, 0xff

    .line 961
    iget-object v1, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v1, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    .line 962
    invoke-virtual {v1, p1}, Ll/᩻ۖܽ;->write(I)V

    return-void
.end method

.method private ᩳ(J)V
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const-wide v0, 0xffffffffL

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    const-wide/16 v0, 0xff

    and-long v2, p1, v0

    long-to-int v3, v2

    .line 987
    iget-object v2, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v2, v3}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x8

    ushr-long v3, p1, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    .line 988
    invoke-virtual {v2, v4}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x10

    ushr-long v3, p1, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    .line 989
    invoke-virtual {v2, v4}, Ll/᩻ۖܽ;->write(I)V

    const/16 v3, 0x18

    ushr-long/2addr p1, v3

    and-long/2addr p1, v0

    long-to-int p2, p1

    .line 990
    invoke-virtual {v2, p2}, Ll/᩻ۖܽ;->write(I)V

    return-void

    .line 985
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Value out of unsigned int."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ᩳ(Ll/ۡ᩺ۡ;)V
    .locals 9

    .line 71
    iget-boolean v0, p1, Ll/ۡ᩺ۡ;->ۢ֫:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-boolean v0, p1, Ll/ۡ᩺ۡ;->ܳ֫:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 792
    :goto_1
    iget-object v3, p1, Ll/ۡ᩺ۡ;->᩹:[B

    iget-object v4, p1, Ll/ۡ᩺ۡ;->ᩳ֫:[B

    if-eqz v0, :cond_2

    const/16 v5, 0x18

    new-array v5, v5, [B

    .line 796
    iget-wide v6, p1, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-static {v6, v7, v1, v5}, Ll/ۖܰۡ;->֫(JI[B)V

    const/16 v1, 0x8

    .line 797
    iget-wide v6, p1, Ll/ۡ᩺ۡ;->᩶:J

    invoke-static {v6, v7, v1, v5}, Ll/ۖܰۡ;->֫(JI[B)V

    const/16 v1, 0x10

    .line 798
    iget-wide v6, p1, Ll/ۡ᩺ۡ;->ۨ:J

    invoke-static {v6, v7, v1, v5}, Ll/ۖܰۡ;->֫(JI[B)V

    .line 799
    iget-object v1, p1, Ll/ۡ᩺ۡ;->᩸:[B

    invoke-static {v2, v1, v5}, Ll/۠᩺ۡ;->֫(I[B[B)[B

    move-result-object v1

    goto :goto_2

    .line 801
    :cond_2
    iget-object v1, p1, Ll/ۡ᩺ۡ;->᩸:[B

    invoke-static {v2, v1}, Ll/۠᩺ۡ;->ۧ(I[B)[B

    move-result-object v1

    :goto_2
    const v5, 0x2014b50

    .line 804
    invoke-direct {p0, v5}, Ll/ۡܰۡ;->ܽ(I)V

    .line 71
    iget-boolean v5, p1, Ll/ۡ᩺ۡ;->ۢ֫:Z

    const/16 v6, 0x2d

    if-nez v5, :cond_4

    iget-boolean v5, p1, Ll/ۡ᩺ۡ;->ܳ֫:Z

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    const/16 v5, 0x14

    goto :goto_4

    :cond_4
    :goto_3
    const/16 v5, 0x2d

    :goto_4
    and-int/lit16 v5, v5, 0xff

    .line 957
    iget-object v7, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v7, v5}, Ll/᩻ۖܽ;->write(I)V

    .line 806
    iget v5, p1, Ll/ۡ᩺ۡ;->᩻֫:I

    and-int/lit16 v5, v5, 0xff

    .line 957
    invoke-virtual {v7, v5}, Ll/᩻ۖܽ;->write(I)V

    .line 71
    iget-boolean v5, p1, Ll/ۡ᩺ۡ;->ۢ֫:Z

    if-nez v5, :cond_8

    iget-boolean v5, p1, Ll/ۡ᩺ۡ;->ܳ֫:Z

    if-eqz v5, :cond_5

    goto :goto_6

    .line 85
    :cond_5
    iget v5, p1, Ll/ۡ᩺ۡ;->ܽ֫:I

    if-nez v5, :cond_7

    .line 75
    iget v5, p1, Ll/ۡ᩺ۡ;->۫:I

    and-int/2addr v2, v5

    if-eqz v2, :cond_6

    goto :goto_5

    :cond_6
    const/16 v6, 0xa

    goto :goto_6

    :cond_7
    :goto_5
    const/16 v6, 0x14

    .line 807
    :cond_8
    :goto_6
    invoke-direct {p0, v6}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 808
    iget v2, p1, Ll/ۡ᩺ۡ;->۫:I

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 809
    iget v2, p1, Ll/ۡ᩺ۡ;->ܽ֫:I

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 810
    iget v2, p1, Ll/ۡ᩺ۡ;->ۡ֫:I

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ܽ(I)V

    .line 811
    iget v2, p1, Ll/ۡ᩺ۡ;->ۙ:I

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ܽ(I)V

    const-wide v5, 0xffffffffL

    if-eqz v0, :cond_9

    .line 813
    invoke-direct {p0, v5, v6}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 814
    invoke-direct {p0, v5, v6}, Ll/ۡܰۡ;->ᩳ(J)V

    goto :goto_7

    .line 816
    :cond_9
    iget-wide v7, p1, Ll/ۡ᩺ۡ;->᩶:J

    invoke-direct {p0, v7, v8}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 817
    iget-wide v7, p1, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-direct {p0, v7, v8}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 819
    :goto_7
    array-length v2, v4

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 820
    array-length v2, v1

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 821
    array-length v2, v3

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 822
    iget v2, p1, Ll/ۡ᩺ۡ;->ۗ:I

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 823
    iget v2, p1, Ll/ۡ᩺ۡ;->᩺:I

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ᩳ(I)V

    .line 824
    iget v2, p1, Ll/ۡ᩺ۡ;->۬:I

    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ܽ(I)V

    if-eqz v0, :cond_a

    .line 826
    invoke-direct {p0, v5, v6}, Ll/ۡܰۡ;->ᩳ(J)V

    goto :goto_8

    .line 828
    :cond_a
    iget-wide v5, p1, Ll/ۡ᩺ۡ;->ۨ:J

    invoke-direct {p0, v5, v6}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 830
    :goto_8
    invoke-direct {p0, v4}, Ll/ۡܰۡ;->ܽ([B)V

    .line 831
    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ܽ([B)V

    .line 832
    invoke-direct {p0, v3}, Ll/ۡܰۡ;->ܽ([B)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 18

    move-object/from16 v10, p0

    .line 697
    iget-object v0, v10, Ll/ۡܰۡ;->ۛ:Ljava/util/ArrayList;

    iget-object v11, v10, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v11}, Ll/᩻ۖܽ;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 699
    :cond_0
    iget-object v1, v10, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    if-eqz v1, :cond_1

    .line 700
    invoke-virtual/range {p0 .. p0}, Ll/ۡܰۡ;->ܽ()V

    .line 701
    :cond_1
    iget-object v1, v10, Ll/ۡܰۡ;->᩸:[B

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    .line 944
    invoke-virtual {v11}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v3

    const-wide/16 v5, 0x1000

    .line 705
    rem-long/2addr v3, v5

    long-to-int v4, v3

    if-eqz v4, :cond_2

    rsub-int v3, v4, 0x1000

    .line 707
    new-array v3, v3, [B

    invoke-direct {v10, v3}, Ll/ۡܰۡ;->ܽ([B)V

    .line 710
    :cond_2
    array-length v3, v1

    add-int/lit8 v3, v3, 0x20

    .line 712
    rem-int/lit16 v4, v3, 0x1000

    if-eqz v4, :cond_4

    rsub-int v5, v4, 0x1000

    const/16 v6, 0xc

    if-ge v5, v6, :cond_3

    rsub-int v5, v4, 0x2000

    .line 718
    :cond_3
    new-array v4, v5, [B

    add-int/lit8 v6, v5, -0x8

    int-to-long v6, v6

    .line 719
    invoke-static {v6, v7, v2, v4}, Ll/ܺܰۡ;->֫(JI[B)V

    const v6, 0x42726577

    const/16 v7, 0x8

    .line 720
    invoke-static {v7, v6, v4}, Ll/ܺܰۡ;->֫(II[B)V

    add-int/2addr v3, v5

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    :goto_0
    int-to-long v5, v3

    const-wide/16 v7, 0x8

    sub-long/2addr v5, v7

    .line 724
    invoke-direct {v10, v5, v6}, Ll/ۡܰۡ;->ۧ(J)V

    .line 725
    invoke-direct {v10, v1}, Ll/ۡܰۡ;->ܽ([B)V

    if-eqz v4, :cond_5

    .line 727
    invoke-direct {v10, v4}, Ll/ۡܰۡ;->ܽ([B)V

    .line 729
    :cond_5
    invoke-direct {v10, v5, v6}, Ll/ۡܰۡ;->ۧ(J)V

    const-wide v3, 0x20676953204b5041L

    .line 730
    invoke-direct {v10, v3, v4}, Ll/ۡܰۡ;->ۧ(J)V

    const-wide v3, 0x3234206b636f6c42L    # 7.465385175170059E-67

    .line 731
    invoke-direct {v10, v3, v4}, Ll/ۡܰۡ;->ۧ(J)V

    .line 734
    :cond_6
    :try_start_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v3, -0x1

    .line 738
    iget-wide v5, v10, Ll/ۡܰۡ;->ܽ֫:J

    cmp-long v1, v5, v3

    if-nez v1, :cond_8

    .line 944
    invoke-virtual {v11}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v8

    .line 740
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩺ۡ;

    .line 741
    invoke-direct {v10, v1}, Ll/ۡܰۡ;->ᩳ(Ll/ۡ᩺ۡ;)V

    goto :goto_1

    .line 944
    :cond_7
    invoke-virtual {v11}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    sub-long v6, v0, v8

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object/from16 v1, p0

    .line 744
    invoke-direct/range {v1 .. v9}, Ll/ۡܰۡ;->֫(JJJJ)V

    .line 745
    invoke-virtual {v11}, Ll/᩻ۖܽ;->close()V

    return-void

    .line 747
    :cond_8
    invoke-direct/range {p0 .. p0}, Ll/ۡܰۡ;->ۘ()J

    move-result-wide v8

    .line 748
    invoke-direct/range {p0 .. p0}, Ll/ۡܰۡ;->ۖ()I

    move-result v1

    int-to-long v12, v1

    .line 944
    invoke-virtual {v11}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v3

    .line 752
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۡ᩺ۡ;

    .line 753
    invoke-direct {v10, v7}, Ll/ۡܰۡ;->ᩳ(Ll/ۡ᩺ۡ;)V

    goto :goto_2

    .line 944
    :cond_9
    invoke-virtual {v11}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v14

    sub-long/2addr v14, v3

    const-wide/16 v3, 0x1

    add-long/2addr v3, v12

    const-wide/32 v16, 0xffff

    cmp-long v1, v3, v16

    if-gez v1, :cond_a

    cmp-long v1, v12, v16

    if-gez v1, :cond_a

    .line 837
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const v1, 0xffff

    if-ge v0, v1, :cond_a

    const-wide v0, 0xffffffffL

    cmp-long v7, v14, v0

    if-gtz v7, :cond_a

    cmp-long v7, v8, v0

    if-lez v7, :cond_b

    :cond_a
    const/16 v2, 0x4c

    :cond_b
    add-int/lit8 v2, v2, 0x16

    .line 869
    iget-object v0, v10, Ll/ۡܰۡ;->ۙ:Ljava/lang/String;

    if-nez v0, :cond_c

    sget-object v0, Ll/ۚ᩺ۘ;->֫:[B

    goto :goto_3

    :cond_c
    iget-object v1, v10, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 870
    :goto_3
    array-length v0, v0

    add-int/2addr v2, v0

    int-to-long v0, v2

    .line 760
    invoke-direct/range {p0 .. p0}, Ll/ۡܰۡ;->ۘ()J

    move-result-wide v16

    add-long v16, v16, v0

    cmp-long v0, v16, v5

    if-lez v0, :cond_d

    .line 762
    invoke-virtual {v11}, Ll/᩻ۖܽ;->flush()V

    .line 763
    invoke-virtual {v11}, Ll/᩻ۖܽ;->ۜ֫()Ll/ۖۖܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ۖܽ;

    invoke-virtual {v0}, Ll/᩶ۖܽ;->֫()V

    move-wide v2, v3

    goto :goto_4

    :cond_d
    move-wide v2, v12

    :goto_4
    move-object/from16 v1, p0

    move-wide v4, v12

    move-wide v6, v14

    .line 766
    invoke-direct/range {v1 .. v9}, Ll/ۡܰۡ;->֫(JJJJ)V

    .line 768
    invoke-virtual {v11}, Ll/᩻ۖܽ;->close()V

    .line 769
    iget-object v0, v10, Ll/ۡܰۡ;->᩺:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v10, Ll/ۡܰۡ;->ۤ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    return-void

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 736
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final write(I)V
    .locals 1

    .line 583
    iget-object v0, p0, Ll/ۡܰۡ;->ᩳ֫:Ll/ۨܰۡ;

    invoke-virtual {v0, p1}, Ll/ۨܰۡ;->write(I)V

    return-void
.end method

.method public final write([B)V
    .locals 1

    .line 587
    iget-object v0, p0, Ll/ۡܰۡ;->ᩳ֫:Ll/ۨܰۡ;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 591
    iget-object v0, p0, Ll/ۡܰۡ;->ᩳ֫:Ll/ۨܰۡ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۨܰۡ;->write([BII)V

    return-void
.end method

.method public final ֫()Ljava/io/OutputStream;
    .locals 1

    .line 604
    iget-object v0, p0, Ll/ۡܰۡ;->֫֫:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    return-object v0

    .line 606
    :cond_0
    new-instance v0, Ll/᩷ܰۡ;

    invoke-direct {v0, p0}, Ll/᩷ܰۡ;-><init>(Ll/ۡܰۡ;)V

    iput-object v0, p0, Ll/ۡܰۡ;->֫֫:Ljava/io/OutputStream;

    return-object v0
.end method

.method public final ֫(Ll/ᩳܰۡ;Ljava/lang/String;)Ll/ۢܰۡ;
    .locals 5

    .line 447
    iget-wide v0, p0, Ll/ۡܰۡ;->ܽ֫:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const-string v0, "/"

    .line 450
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\\"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 453
    iget v0, p0, Ll/ۡܰۡ;->۟:I

    .line 454
    iget-object v1, p0, Ll/ۡܰۡ;->ۧ֫:Ljava/lang/String;

    const/4 v2, 0x0

    .line 455
    iput v2, p0, Ll/ۡܰۡ;->۟:I

    const/4 v2, 0x0

    .line 456
    iput-object v2, p0, Ll/ۡܰۡ;->ۧ֫:Ljava/lang/String;

    .line 457
    new-instance v2, Ll/ۡ᩺ۡ;

    iget-object v3, p0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    invoke-direct {v2, p2, v3}, Ll/ۡ᩺ۡ;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    const/4 p2, 0x1

    .line 458
    iput-boolean p2, v2, Ll/ۡ᩺ۡ;->۟:Z

    .line 459
    invoke-direct {p0, v2}, Ll/ۡܰۡ;->ۧ(Ll/ۡ᩺ۡ;)V

    .line 460
    iput v0, p0, Ll/ۡܰۡ;->۟:I

    .line 461
    iput-object v1, p0, Ll/ۡܰۡ;->ۧ֫:Ljava/lang/String;

    .line 462
    new-instance p2, Ll/ۢܰۡ;

    invoke-direct {p2, p1, p0}, Ll/ۢܰۡ;-><init>(Ll/ᩳܰۡ;Ll/ۡܰۡ;)V

    return-object p2

    .line 451
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid host entry name: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 448
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Virtual entry is not supported in split mode"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(I)V
    .locals 0

    .line 208
    iput p1, p0, Ll/ۡܰۡ;->ܰ:I

    return-void
.end method

.method public final ֫(I[B)V
    .locals 2

    const/4 v0, 0x0

    .line 381
    iget-object v1, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v1, p2, v0, p1}, Ll/᩻ۖܽ;->write([BII)V

    return-void
.end method

.method public final ֫(Ljava/io/InputStream;)V
    .locals 3

    const/16 v0, 0x1000

    new-array v0, v0, [B

    .line 597
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x0

    .line 598
    invoke-virtual {p0, v0, v2, v1}, Ll/ۡܰۡ;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 252
    new-instance v0, Ll/ۡ᩺ۡ;

    iget-object v1, p0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ll/ۡ᩺ۡ;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    invoke-direct {p0, v0}, Ll/ۡܰۡ;->ۧ(Ll/ۡ᩺ۡ;)V

    return-void
.end method

.method public final ֫(Ll/ۗ᩺ۡ;)V
    .locals 2

    .line 256
    new-instance v0, Ll/ۡ᩺ۡ;

    iget-object v1, p0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ll/ۡ᩺ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/nio/charset/Charset;)V

    invoke-direct {p0, v0}, Ll/ۡܰۡ;->ۧ(Ll/ۡ᩺ۡ;)V

    return-void
.end method

.method public final ֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)V
    .locals 2

    .line 405
    invoke-virtual {p0, p1}, Ll/ۡܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 408
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۡܰۡ;->ۧ(Ll/ۗ᩺ۡ;)V

    .line 409
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    .line 410
    invoke-virtual {p2, p1}, Ll/ᩳܰۡ;->ᩳ(Ll/ۗ᩺ۡ;)Ll/۫ܰۡ;

    move-result-object p1

    .line 413
    :goto_0
    iget-object p2, p0, Ll/ۡܰۡ;->ۗ:[B

    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 414
    invoke-virtual {p0, v0, p2}, Ll/ۡܰۡ;->֫(I[B)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;Ll/֨᩸ܿ;)V
    .locals 12

    if-nez p3, :cond_0

    .line 421
    invoke-virtual {p0, p1, p2}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)V

    return-void

    .line 424
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۡܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 425
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v2

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v4

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v6

    move-object v1, p3

    invoke-interface/range {v1 .. v7}, Ll/֨᩸ܿ;->֫(JJJ)V

    return-void

    .line 428
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۡܰۡ;->ۧ(Ll/ۗ᩺ۡ;)V

    .line 429
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_3

    .line 430
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v8

    .line 432
    invoke-virtual {p2, p1}, Ll/ᩳܰۡ;->ᩳ(Ll/ۗ᩺ۡ;)Ll/۫ܰۡ;

    move-result-object p1

    const-wide/16 v0, 0x0

    .line 435
    :goto_0
    iget-object p2, p0, Ll/ۡܰۡ;->ۗ:[B

    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    .line 436
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 439
    :cond_2
    invoke-virtual {p0, v2, p2}, Ll/ۡܰۡ;->֫(I[B)V

    int-to-long v2, v2

    add-long v10, v0, v2

    move-object v1, p3

    move-wide v4, v10

    move-wide v6, v8

    .line 441
    invoke-interface/range {v1 .. v7}, Ll/֨᩸ܿ;->֫(JJJ)V

    move-wide v0, v10

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ᩳܰۡ;)V
    .locals 5

    .line 236
    iget-wide v0, p0, Ll/ۡܰۡ;->ܽ֫:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 239
    invoke-virtual {p1}, Ll/ᩳܰۡ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۡܰۡ;->᩸:[B

    return-void

    .line 237
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "ApkSigBlockPairsData is not supported in split mode"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜ()V
    .locals 1

    const/4 v0, 0x1

    .line 188
    iput-boolean v0, p0, Ll/ۡܰۡ;->ܿ֫:Z

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 200
    iput p1, p0, Ll/ۡܰۡ;->۟:I

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 224
    iput-object p1, p0, Ll/ۡܰۡ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ(Ll/ۗ᩺ۡ;)V
    .locals 7

    .line 345
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    if-eqz v0, :cond_0

    .line 346
    invoke-virtual {p0}, Ll/ۡܰۡ;->ܽ()V

    .line 347
    :cond_0
    new-instance v0, Ll/ۡ᩺ۡ;

    iget-object v1, p0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ll/ۡ᩺ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/nio/charset/Charset;)V

    .line 348
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 349
    iget v1, v0, Ll/ۡ᩺ۡ;->۫:I

    const/4 v2, 0x1

    or-int/2addr v1, v2

    iput v1, v0, Ll/ۡ᩺ۡ;->۫:I

    .line 350
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۢ()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v1

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_1

    .line 351
    iget v1, v0, Ll/ۡ᩺ۡ;->۫:I

    or-int/2addr v1, v3

    iput v1, v0, Ll/ۡ᩺ۡ;->۫:I

    .line 352
    iput-boolean v2, v0, Ll/ۡ᩺ۡ;->ۜ֫:Z

    .line 353
    iput-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    goto :goto_0

    .line 354
    :cond_1
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۢ()I

    move-result v1

    const/16 v2, 0x63

    if-ne v1, v2, :cond_2

    .line 355
    iput v2, v0, Ll/ۡ᩺ۡ;->ܽ֫:I

    .line 358
    :cond_2
    :goto_0
    iget-boolean v1, v0, Ll/ۡ᩺ۡ;->֫֫:Z

    if-eqz v1, :cond_3

    .line 359
    iget v1, v0, Ll/ۡ᩺ۡ;->۫:I

    or-int/lit16 v1, v1, 0x800

    iput v1, v0, Ll/ۡ᩺ۡ;->۫:I

    .line 360
    :cond_3
    iget-wide v1, p0, Ll/ۡܰۡ;->ܽ֫:J

    const-wide/16 v3, -0x1

    iget-object v5, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    cmp-long v6, v1, v3

    if-eqz v6, :cond_4

    .line 361
    invoke-direct {p0}, Ll/ۡܰۡ;->ۖ()I

    move-result v1

    iput v1, v0, Ll/ۡ᩺ۡ;->ۗ:I

    .line 362
    invoke-direct {p0}, Ll/ۡܰۡ;->ۘ()J

    move-result-wide v1

    iput-wide v1, v0, Ll/ۡ᩺ۡ;->ۨ:J

    .line 944
    invoke-virtual {v5}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v1

    .line 363
    iput-wide v1, v0, Ll/ۡ᩺ۡ;->ۛ:J

    goto :goto_1

    .line 944
    :cond_4
    invoke-virtual {v5}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v1

    .line 365
    iput-wide v1, v0, Ll/ۡ᩺ۡ;->ۛ:J

    iput-wide v1, v0, Ll/ۡ᩺ۡ;->ۨ:J

    .line 367
    :goto_1
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۛ()Z

    move-result v1

    iput-boolean v1, v0, Ll/ۡ᩺ۡ;->۟:Z

    .line 368
    iget-object v1, p0, Ll/ۡܰۡ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    invoke-direct {p0, v0}, Ll/ۡܰۡ;->ܿ(Ll/ۡ᩺ۡ;)V

    .line 944
    invoke-virtual {v5}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v1

    .line 370
    iput-wide v1, v0, Ll/ۡ᩺ۡ;->ۤ:J

    .line 371
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۛ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 372
    iget-object v1, p0, Ll/ۡܰۡ;->ۨ:Ll/ۢۖᩴ;

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, v0}, Ll/ۢۖᩴ;->֫(JLjava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void
.end method

.method public final ۧ([B)V
    .locals 5

    .line 243
    iget-wide v0, p0, Ll/ۡܰۡ;->ܽ֫:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 246
    iput-object p1, p0, Ll/ۡܰۡ;->᩸:[B

    return-void

    .line 244
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "ApkSigBlockPairsData is not supported in split mode"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()I
    .locals 1

    .line 204
    iget v0, p0, Ll/ۡܰۡ;->۟:I

    return v0
.end method

.method public final ܽ()V
    .locals 12

    .line 620
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    if-nez v0, :cond_0

    return-void

    .line 623
    :cond_0
    iget-boolean v1, v0, Ll/ۡ᩺ۡ;->ۜ֫:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 624
    iget v0, v0, Ll/ۡ᩺ۡ;->۫:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    const v0, 0x8074b50

    .line 625
    invoke-direct {p0, v0}, Ll/ۡܰۡ;->ܽ(I)V

    .line 626
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget v0, v0, Ll/ۡ᩺ۡ;->ۙ:I

    invoke-direct {p0, v0}, Ll/ۡܰۡ;->ܽ(I)V

    .line 627
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-boolean v1, v0, Ll/ۡ᩺ۡ;->ۢ֫:Z

    if-eqz v1, :cond_1

    .line 628
    iget-wide v0, v0, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-direct {p0, v0, v1}, Ll/ۡܰۡ;->ۧ(J)V

    .line 629
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-wide v0, v0, Ll/ۡ᩺ۡ;->᩶:J

    invoke-direct {p0, v0, v1}, Ll/ۡܰۡ;->ۧ(J)V

    goto :goto_0

    .line 631
    :cond_1
    iget-wide v0, v0, Ll/ۡ᩺ۡ;->᩶:J

    invoke-direct {p0, v0, v1}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 632
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-wide v0, v0, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-direct {p0, v0, v1}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 635
    :cond_2
    :goto_0
    iput-object v2, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    return-void

    .line 638
    :cond_3
    iget-object v0, p0, Ll/ۡܰۡ;->ᩳ֫:Ll/ۨܰۡ;

    invoke-virtual {v0}, Ll/ۨܰۡ;->close()V

    .line 640
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-object v1, p0, Ll/ۡܰۡ;->ᩳ֫:Ll/ۨܰۡ;

    invoke-virtual {v1}, Ll/ۨܰۡ;->ܽ()I

    move-result v1

    iput v1, v0, Ll/ۡ᩺ۡ;->ۙ:I

    .line 641
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-object v1, p0, Ll/ۡܰۡ;->᩶:Ll/ۤܰۡ;

    invoke-virtual {v1}, Ll/ۤܰۡ;->֫()J

    move-result-wide v3

    iput-wide v3, v0, Ll/ۡ᩺ۡ;->᩶:J

    .line 642
    iget-object v0, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-object v1, p0, Ll/ۡܰۡ;->ᩳ֫:Ll/ۨܰۡ;

    invoke-virtual {v1}, Ll/ۨܰۡ;->֫()J

    move-result-wide v3

    iput-wide v3, v0, Ll/ۡ᩺ۡ;->᩷֫:J

    .line 944
    iget-object v0, p0, Ll/ۡܰۡ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v3

    .line 645
    iget-object v1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-wide v5, v1, Ll/ۡ᩺ۡ;->ۛ:J

    const-wide/16 v7, 0xe

    add-long/2addr v5, v7

    .line 940
    invoke-virtual {v0, v5, v6}, Ll/᩻ۖܽ;->seek(J)V

    .line 646
    iget-object v1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget v1, v1, Ll/ۡ᩺ۡ;->ۙ:I

    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ܽ(I)V

    .line 647
    iget-object v1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-boolean v5, v1, Ll/ۡ᩺ۡ;->ۢ֫:Z

    const-wide v6, 0xffffffffL

    if-eqz v5, :cond_5

    .line 648
    iget-wide v8, v1, Ll/ۡ᩺ۡ;->᩷֫:J

    const/4 v5, 0x4

    cmp-long v10, v8, v6

    if-gez v10, :cond_4

    iget-wide v8, v1, Ll/ۡ᩺ۡ;->᩶:J

    cmp-long v10, v8, v6

    if-gez v10, :cond_4

    const/4 v6, 0x0

    .line 650
    iput-boolean v6, v1, Ll/ۡ᩺ۡ;->ۢ֫:Z

    .line 651
    invoke-direct {p0, v8, v9}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 652
    iget-object v1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-wide v7, v1, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-direct {p0, v7, v8}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 655
    iget-object v1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-object v1, v1, Ll/ۡ᩺ۡ;->ᩳ֫:[B

    array-length v1, v1

    add-int/2addr v1, v5

    .line 948
    invoke-virtual {v0, v1}, Ll/᩻ۖܽ;->skipBytes(I)I

    .line 658
    invoke-direct {p0, v6}, Ll/ۡܰۡ;->ᩳ(I)V

    const/16 v1, 0x10

    .line 659
    invoke-direct {p0, v1}, Ll/ۡܰۡ;->ᩳ(I)V

    const-wide/16 v5, 0x0

    .line 660
    invoke-direct {p0, v5, v6}, Ll/ۡܰۡ;->ۧ(J)V

    .line 661
    invoke-direct {p0, v5, v6}, Ll/ۡܰۡ;->ۧ(J)V

    goto :goto_1

    .line 663
    :cond_4
    invoke-direct {p0, v6, v7}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 664
    invoke-direct {p0, v6, v7}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 667
    iget-object v1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-object v1, v1, Ll/ۡ᩺ۡ;->ᩳ֫:[B

    array-length v1, v1

    add-int/2addr v1, v5

    .line 948
    invoke-virtual {v0, v1}, Ll/᩻ۖܽ;->skipBytes(I)I

    invoke-virtual {v0, v5}, Ll/᩻ۖܽ;->skipBytes(I)I

    .line 673
    iget-object v1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-wide v5, v1, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-direct {p0, v5, v6}, Ll/ۡܰۡ;->ۧ(J)V

    .line 674
    iget-object v1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-wide v5, v1, Ll/ۡ᩺ۡ;->᩶:J

    invoke-direct {p0, v5, v6}, Ll/ۡܰۡ;->ۧ(J)V

    goto :goto_1

    .line 677
    :cond_5
    iget-wide v8, v1, Ll/ۡ᩺ۡ;->᩶:J

    cmp-long v5, v8, v6

    if-gez v5, :cond_6

    iget-wide v10, v1, Ll/ۡ᩺ۡ;->᩷֫:J

    cmp-long v1, v10, v6

    if-gez v1, :cond_6

    .line 684
    invoke-direct {p0, v8, v9}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 685
    iget-object v1, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-wide v5, v1, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-direct {p0, v5, v6}, Ll/ۡܰۡ;->ᩳ(J)V

    .line 688
    :goto_1
    invoke-virtual {v0, v3, v4}, Ll/᩻ۖܽ;->seek(J)V

    .line 690
    iput-object v2, p0, Ll/ۡܰۡ;->ᩳ֫:Ll/ۨܰۡ;

    .line 691
    iput-object v2, p0, Ll/ۡܰۡ;->᩶:Ll/ۤܰۡ;

    .line 692
    iput-object v2, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    return-void

    .line 679
    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Zip entry size needs zip64: name="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-object v3, v3, Ll/ۡ᩺ۡ;->ᩳ֫:[B

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", compressedSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-wide v2, v2, Ll/ۡ᩺ۡ;->᩶:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۡܰۡ;->۬:Ll/ۡ᩺ۡ;

    iget-wide v2, v2, Ll/ۡ᩺ۡ;->᩷֫:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(Ll/ۗ᩺ۡ;)Z
    .locals 7

    .line 385
    iget-wide v0, p0, Ll/ۡܰۡ;->ܽ֫:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 388
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 389
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۘ()Ll/ۗ᩺ۡ;

    move-result-object v0

    .line 390
    iget-object v1, p0, Ll/ۡܰۡ;->ۨ:Ll/ۢۖᩴ;

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ۢۖᩴ;->ۧ(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩺ۡ;

    if-eqz v1, :cond_0

    .line 392
    new-instance v2, Ll/ۡ᩺ۡ;

    iget-object v3, p0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    invoke-direct {v2, p1, v3}, Ll/ۡ᩺ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/nio/charset/Charset;)V

    .line 393
    invoke-static {v2}, Ll/ۡܰۡ;->ܽ(Ll/ۡ᩺ۡ;)V

    .line 394
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v3

    iput v3, v2, Ll/ۡ᩺ۡ;->۫:I

    .line 395
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۖ()J

    move-result-wide v3

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v5

    sub-long/2addr v3, v5

    iget-wide v5, v1, Ll/ۡ᩺ۡ;->ۤ:J

    add-long/2addr v3, v5

    iput-wide v3, v2, Ll/ۡ᩺ۡ;->ۛ:J

    iput-wide v3, v2, Ll/ۡ᩺ۡ;->ۨ:J

    .line 396
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v3

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v5

    sub-long/2addr v3, v5

    iget-wide v0, v1, Ll/ۡ᩺ۡ;->ۤ:J

    add-long/2addr v3, v0

    iput-wide v3, v2, Ll/ۡ᩺ۡ;->ۤ:J

    .line 397
    iget-object p1, p0, Ll/ۡܰۡ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 386
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Virtual entry is not supported in split mode"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x1

    .line 232
    iput-boolean v0, p0, Ll/ۡܰۡ;->ܿ֫:Z

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 216
    iput-object p1, p0, Ll/ۡܰۡ;->ۧ֫:Ljava/lang/String;

    return-void
.end method

.method public final ᩻()V
    .locals 1

    .line 2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 192
    iput-object v0, p0, Ll/ۡܰۡ;->۫:Ljava/nio/charset/Charset;

    return-void
.end method
