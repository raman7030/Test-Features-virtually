.class public final enum Ll/ܺۨܳ;
.super Ljava/lang/Enum;
.source "F8CE"


# static fields
.field public static final enum ۗ:Ll/ܺۨܳ;

.field public static final enum ۙ:Ll/ܺۨܳ;

.field public static final enum ۛ:Ll/ܺۨܳ;

.field public static final enum ۤ:Ll/ܺۨܳ;

.field public static final enum ۨ:Ll/ܺۨܳ;

.field public static final ۫:I = 0x10000

.field public static final enum ۬:Ll/ܺۨܳ;

.field public static final synthetic ᩶:[Ll/ܺۨܳ;


# instance fields
.field public final ᩸:Ll/ۢۨܳ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 35
    new-instance v0, Ll/ܺۨܳ;

    new-instance v1, Ll/ᩳۨܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "GZIP"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v2, v1}, Ll/ܺۨܳ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۢۨܳ;)V

    sput-object v0, Ll/ܺۨܳ;->ۗ:Ll/ܺۨܳ;

    .line 66
    new-instance v0, Ll/ܺۨܳ;

    new-instance v1, Ll/ܿۨܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "XZ"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v2, v1}, Ll/ܺۨܳ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۢۨܳ;)V

    sput-object v0, Ll/ܺۨܳ;->ۤ:Ll/ܺۨܳ;

    .line 95
    new-instance v0, Ll/ܺۨܳ;

    new-instance v1, Ll/ܳۨܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "BZIP2"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v2, v1}, Ll/ܺۨܳ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۢۨܳ;)V

    sput-object v0, Ll/ܺۨܳ;->ۙ:Ll/ܺۨܳ;

    .line 124
    new-instance v0, Ll/ܺۨܳ;

    new-instance v1, Ll/᩻ۨܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "ZSTD"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v2, v1}, Ll/ܺۨܳ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۢۨܳ;)V

    sput-object v0, Ll/ܺۨܳ;->ۨ:Ll/ܺۨܳ;

    .line 148
    new-instance v0, Ll/ܺۨܳ;

    new-instance v1, Ll/ۜۨܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "LZ4"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v3, v2, v1}, Ll/ܺۨܳ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۢۨܳ;)V

    sput-object v0, Ll/ܺۨܳ;->۬:Ll/ܺۨܳ;

    .line 176
    new-instance v0, Ll/ܺۨܳ;

    new-instance v1, Ll/᩷ۨܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "ZLIB"

    const/4 v3, 0x5

    invoke-direct {v0, v2, v3, v2, v1}, Ll/ܺۨܳ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۢۨܳ;)V

    sput-object v0, Ll/ܺۨܳ;->ۛ:Ll/ܺۨܳ;

    .line 34
    invoke-static {}, Ll/ܺۨܳ;->֫()[Ll/ܺۨܳ;

    move-result-object v0

    sput-object v0, Ll/ܺۨܳ;->᩶:[Ll/ܺۨܳ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ll/ۢۨܳ;)V
    .locals 0

    .line 273
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 274
    iput-object p3, p0, Ll/ܺۨܳ;->᩹:Ljava/lang/String;

    .line 275
    iput-object p4, p0, Ll/ܺۨܳ;->᩸:Ll/ۢۨܳ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܺۨܳ;
    .locals 1

    .line 34
    const-class v0, Ll/ܺۨܳ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܺۨܳ;

    return-object p0
.end method

.method public static values()[Ll/ܺۨܳ;
    .locals 1

    .line 34
    sget-object v0, Ll/ܺۨܳ;->᩶:[Ll/ܺۨܳ;

    invoke-virtual {v0}, [Ll/ܺۨܳ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܺۨܳ;

    return-object v0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Z
    .locals 7

    const/4 v0, 0x0

    .line 256
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    :try_start_1
    invoke-static {}, Ll/ܺۨܳ;->ۧ()[B

    move-result-object v1

    .line 258
    sget-object v2, Ll/᩹ۢ֡;->֫:[B

    .line 1876
    array-length v2, v1

    invoke-static {p0, v1, v2}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;[BI)I

    move-result v2

    .line 259
    invoke-static {}, Ll/ܺۨܳ;->values()[Ll/ܺۨܳ;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 260
    invoke-virtual {v6, v1, v2}, Ll/ܺۨܳ;->֫([BI)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_1

    const/4 v1, 0x1

    if-eqz p0, :cond_0

    .line 265
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return v0

    :catchall_0
    move-exception v1

    if-eqz p0, :cond_3

    .line 256
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_4
    return v0
.end method

.method public static synthetic ֫()[Ll/ܺۨܳ;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ll/ܺۨܳ;

    .line 34
    sget-object v1, Ll/ܺۨܳ;->ۗ:Ll/ܺۨܳ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܺۨܳ;->ۤ:Ll/ܺۨܳ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ܺۨܳ;->ۙ:Ll/ܺۨܳ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ܺۨܳ;->ۨ:Ll/ܺۨܳ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ܺۨܳ;->۬:Ll/ܺۨܳ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/ܺۨܳ;->ۛ:Ll/ܺۨܳ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static ۧ()[B
    .locals 1

    const/16 v0, 0x1000

    new-array v0, v0, [B

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 279
    iget-object v0, p0, Ll/ܺۨܳ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public ֫(Ll/۠ۖܽ;)J
    .locals 2

    .line 287
    iget-object v0, p0, Ll/ܺۨܳ;->᩸:Ll/ۢۨܳ;

    invoke-interface {v0, p1}, Ll/ۢۨܳ;->֫(Ll/۠ۖܽ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public ֫(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    .line 291
    iget-object v0, p0, Ll/ܺۨܳ;->᩸:Ll/ۢۨܳ;

    invoke-interface {v0, p1}, Ll/ۢۨܳ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/io/OutputStream;IJ)Ljava/io/OutputStream;
    .locals 1

    .line 313
    iget-object v0, p0, Ll/ܺۨܳ;->᩸:Ll/ۢۨܳ;

    invoke-interface {v0, p1, p2, p3, p4}, Ll/ۢۨܳ;->֫(Ljava/io/OutputStream;IJ)Ljava/io/OutputStream;

    move-result-object p1

    return-object p1
.end method

.method public ֫([BI)Z
    .locals 1

    .line 283
    iget-object v0, p0, Ll/ܺۨܳ;->᩸:Ll/ۢۨܳ;

    invoke-interface {v0, p1, p2}, Ll/ۢۨܳ;->֫([BI)Z

    move-result p1

    return p1
.end method

.method public ۧ(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 3

    .line 296
    sget-object v0, Ll/ܺۨܳ;->ۙ:Ll/ܺۨܳ;

    if-ne p0, v0, :cond_0

    .line 297
    new-instance v0, Ll/ۧۨܳ;

    invoke-direct {v0, p1}, Ll/ۧۨܳ;-><init>(Ljava/io/InputStream;)V

    return-object v0

    .line 299
    :cond_0
    sget-object v0, Ll/ܺۨܳ;->ۗ:Ll/ܺۨܳ;

    if-ne p0, v0, :cond_1

    .line 300
    new-instance v0, Ll/ۖۨܳ;

    invoke-direct {v0, p1}, Ll/ۖۨܳ;-><init>(Ljava/io/InputStream;)V

    return-object v0

    .line 302
    :cond_1
    sget-object v0, Ll/ܺۨܳ;->ۛ:Ll/ܺۨܳ;

    if-ne p0, v0, :cond_2

    .line 303
    new-instance v0, Ll/ۘۨܳ;

    .line 18
    new-instance v1, Ljava/util/zip/Inflater;

    invoke-direct {v1}, Ljava/util/zip/Inflater;-><init>()V

    const/high16 v2, 0x10000

    invoke-direct {v0, p1, v1, v2}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;I)V

    return-object v0

    .line 305
    :cond_2
    invoke-virtual {p0, p1}, Ll/ܺۨܳ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
