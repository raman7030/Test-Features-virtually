.class public abstract Ll/ۘۜۖ;
.super Ljava/lang/Object;
.source "V9OM"

# interfaces
.implements Ll/ۡ֡ۖ;


# instance fields
.field public memoizedHashCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return-void
.end method

.method private ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Serializing "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " threw an IOException (should never happen)."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/util/List;)V
    .locals 0

    .line 117
    invoke-static {p0, p1}, Ll/ۖۜۖ;->֫(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static ֫(Ll/ۛۜۖ;)V
    .locals 1

    .line 111
    invoke-virtual {p0}, Ll/ۛۜۖ;->ۧ()Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 112
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Byte string is not UTF-8."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getMemoizedSerializedSize()I
    .locals 1

    .line 79
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getSerializedSize(Ll/ۢۚۖ;)I
    .locals 2

    .line 88
    invoke-virtual {p0}, Ll/ۘۜۖ;->getMemoizedSerializedSize()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 90
    invoke-interface {p1, p0}, Ll/ۢۚۖ;->֫(Ll/ۘۜۖ;)I

    move-result p1

    .line 91
    invoke-virtual {p0, p1}, Ll/ۘۜۖ;->setMemoizedSerializedSize(I)V

    return p1

    :cond_0
    return v0
.end method

.method public newUninitializedMessageException()Ll/ᩳ֨ۖ;
    .locals 1

    .line 98
    new-instance v0, Ll/ᩳ֨ۖ;

    invoke-direct {v0}, Ll/ᩳ֨ۖ;-><init>()V

    return-object v0
.end method

.method public setMemoizedSerializedSize(I)V
    .locals 0

    .line 83
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public toByteArray()[B
    .locals 3

    .line 46
    :try_start_0
    invoke-interface {p0}, Ll/ۡ֡ۖ;->getSerializedSize()I

    move-result v0

    new-array v1, v0, [B

    .line 47
    sget v2, Ll/ܳ᩷ۖ;->ۧ:I

    .line 105
    new-instance v2, Ll/ܽ᩷ۖ;

    invoke-direct {v2, v1, v0}, Ll/ܽ᩷ۖ;-><init>([BI)V

    .line 48
    invoke-interface {p0, v2}, Ll/ۡ֡ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    .line 921
    invoke-virtual {v2}, Ll/ܽ᩷ۖ;->֫()I

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    .line 922
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 52
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "byte array"

    invoke-direct {p0, v2}, Ll/ۘۜۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toByteString()Ll/ۛۜۖ;
    .locals 3

    .line 35
    :try_start_0
    invoke-interface {p0}, Ll/ۡ֡ۖ;->getSerializedSize()I

    move-result v0

    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    .line 1230
    new-instance v1, Ll/ۗۜۖ;

    invoke-direct {v1, v0}, Ll/ۗۜۖ;-><init>(I)V

    .line 36
    invoke-virtual {v1}, Ll/ۗۜۖ;->ۧ()Ll/ܳ᩷ۖ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ۡ֡ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    .line 37
    invoke-virtual {v1}, Ll/ۗۜۖ;->֫()Ll/ۛۜۖ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 39
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "ByteString"

    invoke-direct {p0, v2}, Ll/ۘۜۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public writeDelimitedTo(Ljava/io/OutputStream;)V
    .locals 3

    .line 66
    invoke-interface {p0}, Ll/ۡ֡ۖ;->getSerializedSize()I

    move-result v0

    .line 69
    invoke-static {v0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v1

    add-int/2addr v1, v0

    const/16 v2, 0x1000

    if-le v1, v2, :cond_0

    const/16 v1, 0x1000

    .line 84
    :cond_0
    new-instance v2, Ll/ܿ᩷ۖ;

    invoke-direct {v2, p1, v1}, Ll/ܿ᩷ۖ;-><init>(Ljava/io/OutputStream;I)V

    .line 71
    invoke-virtual {v2, v0}, Ll/ܿ᩷ۖ;->ܽ(I)V

    .line 72
    invoke-interface {p0, v2}, Ll/ۡ֡ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    .line 73
    invoke-virtual {v2}, Ll/ܿ᩷ۖ;->ܽ()V

    return-void
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 2

    .line 58
    invoke-interface {p0}, Ll/ۡ֡ۖ;->getSerializedSize()I

    move-result v0

    sget v1, Ll/ܳ᩷ۖ;->ۧ:I

    const/16 v1, 0x1000

    if-le v0, v1, :cond_0

    const/16 v0, 0x1000

    .line 84
    :cond_0
    new-instance v1, Ll/ܿ᩷ۖ;

    invoke-direct {v1, p1, v0}, Ll/ܿ᩷ۖ;-><init>(Ljava/io/OutputStream;I)V

    .line 60
    invoke-interface {p0, v1}, Ll/ۡ֡ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    .line 61
    invoke-virtual {v1}, Ll/ܿ᩷ۖ;->ܽ()V

    return-void
.end method
