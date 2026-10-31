.class public final Ll/۟۟᩵;
.super Ljava/lang/Object;
.source "A4DP"


# instance fields
.field public final ֫:[Ljava/io/File;

.field public final synthetic ۜ:Ll/ۧ֫֡;

.field public ۧ:Ll/ܰ۟᩵;

.field public ܳ:Z

.field public final ܽ:[Ljava/io/File;

.field public final ܿ:[J

.field public final ᩳ:Ljava/lang/String;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/ۧ֫֡;Ljava/lang/String;)V
    .locals 6

    .line 975
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟۟᩵;->ۜ:Ll/ۧ֫֡;

    .line 976
    iput-object p2, p0, Ll/۟۟᩵;->ᩳ:Ljava/lang/String;

    .line 978
    iget v0, p1, Ll/ۧ֫֡;->᩻֫:I

    iget-object p1, p1, Ll/ۧ֫֡;->ۙ:Ljava/io/File;

    new-array v1, v0, [J

    iput-object v1, p0, Ll/۟۟᩵;->ܿ:[J

    .line 979
    new-array v1, v0, [Ljava/io/File;

    iput-object v1, p0, Ll/۟۟᩵;->֫:[Ljava/io/File;

    .line 980
    new-array v1, v0, [Ljava/io/File;

    iput-object v1, p0, Ll/۟۟᩵;->ܽ:[Ljava/io/File;

    .line 983
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 p2, 0x2e

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 984
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 986
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 987
    iget-object v3, p0, Ll/۟۟᩵;->֫:[Ljava/io/File;

    new-instance v4, Ljava/io/File;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v4, v3, v2

    const-string v3, ".tmp"

    .line 988
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 989
    iget-object v3, p0, Ll/۟۟᩵;->ܽ:[Ljava/io/File;

    new-instance v4, Ljava/io/File;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v4, v3, v2

    .line 990
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫֫֡;
    .locals 11

    .line 1026
    iget-object v6, p0, Ll/۟۟᩵;->ۜ:Ll/ۧ֫֡;

    iget v7, v6, Ll/ۧ֫֡;->᩻֫:I

    invoke-static {v6}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1028
    new-array v8, v7, [Ll/֨ᩳ֡;

    const/4 v9, 0x0

    const/4 v0, 0x0

    .line 1031
    :goto_0
    :try_start_0
    iget v1, v6, Ll/ۧ֫֡;->᩻֫:I

    if-ge v0, v1, :cond_0

    .line 1032
    iget-object v1, v6, Ll/ۧ֫֡;->۬:Ll/ᩳܽ֡;

    iget-object v2, p0, Ll/۟۟᩵;->֫:[Ljava/io/File;

    aget-object v2, v2, v0

    invoke-interface {v1, v2}, Ll/ᩳܽ֡;->ܿ(Ljava/io/File;)Ll/֨ᩳ֡;

    move-result-object v1

    aput-object v1, v8, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1034
    :cond_0
    new-instance v10, Ll/֫֫֡;

    iget-object v2, p0, Ll/۟۟᩵;->ᩳ:Ljava/lang/String;

    iget-wide v3, p0, Ll/۟۟᩵;->᩻:J

    move-object v0, v10

    move-object v1, v6

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Ll/֫֫֡;-><init>(Ll/ۧ֫֡;Ljava/lang/String;J[Ll/֨ᩳ֡;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v10

    :catch_0
    nop

    :goto_1
    if-ge v9, v7, :cond_1

    .line 1038
    aget-object v0, v8, v9

    if-eqz v0, :cond_1

    .line 1039
    invoke-static {v0}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 1047
    :cond_1
    :try_start_1
    invoke-virtual {v6, p0}, Ll/ۧ֫֡;->֫(Ll/۟۟᩵;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v0, 0x0

    return-object v0

    .line 1026
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method
