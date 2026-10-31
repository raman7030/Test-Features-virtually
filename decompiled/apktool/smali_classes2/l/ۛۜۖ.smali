.class public abstract Ll/ۛۜۖ;
.super Ljava/lang/Object;
.source "Y4D9"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x1L

.field public static final ᩶:Ll/᩶ۜۖ;

.field public static final ᩹:Ll/ۛۜۖ;


# instance fields
.field public ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 76
    new-instance v0, Ll/۫ۜۖ;

    sget-object v1, Ll/ܰᩴۖ;->֫:[B

    invoke-direct {v0, v1}, Ll/۫ۜۖ;-><init>([B)V

    sput-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    .line 116
    invoke-static {}, Ll/֡ۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ll/ۤۜۖ;

    .line 95
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 116
    :cond_0
    new-instance v0, Ll/᩸ۜۖ;

    .line 105
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 116
    :goto_0
    sput-object v0, Ll/ۛۜۖ;->᩶:Ll/᩶ۜۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 124
    iput v0, p0, Ll/ۛۜۖ;->᩸:I

    return-void
.end method

.method public static ֫(II[B)Ll/ۛۜۖ;
    .locals 2

    add-int v0, p0, p1

    .line 401
    array-length v1, p2

    invoke-static {p0, v0, v1}, Ll/ۛۜۖ;->ۧ(III)I

    .line 402
    new-instance v0, Ll/۫ۜۖ;

    sget-object v1, Ll/ۛۜۖ;->᩶:Ll/᩶ۜۖ;

    invoke-interface {v1, p0, p1, p2}, Ll/᩶ۜۖ;->֫(II[B)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ll/۫ۜۖ;-><init>([B)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۛۜۖ;
    .locals 2

    .line 510
    new-instance v0, Ll/۫ۜۖ;

    sget-object v1, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ll/۫ۜۖ;-><init>([B)V

    return-object v0
.end method

.method public static ۧ(III)I
    .locals 3

    sub-int v0, p1, p0

    or-int v1, p0, p1

    or-int/2addr v1, v0

    sub-int v2, p2, p1

    or-int/2addr v1, v2

    if-gez v1, :cond_2

    if-ltz p0, :cond_1

    if-ge p1, p0, :cond_0

    .line 1331
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Beginning index larger than ending index: "

    const-string v1, ", "

    .line 0
    invoke-static {v0, p0, p1, v1}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1331
    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1335
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "End index: "

    const-string v1, " >= "

    .line 0
    invoke-static {v0, p1, p2, v1}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1335
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1328
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Beginning index: "

    const-string v0, " < 0"

    .line 0
    invoke-static {p0, p2, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1328
    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return v0
.end method


# virtual methods
.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public final hashCode()I
    .locals 2

    .line 975
    iget v0, p0, Ll/ۛۜۖ;->᩸:I

    if-nez v0, :cond_1

    .line 978
    invoke-virtual {p0}, Ll/ۛۜۖ;->size()I

    move-result v0

    const/4 v1, 0x0

    .line 979
    invoke-virtual {p0, v0, v1, v0}, Ll/ۛۜۖ;->֫(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 983
    :cond_0
    iput v0, p0, Ll/ۛۜۖ;->᩸:I

    :cond_1
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 157
    new-instance v0, Ll/۠ۜۖ;

    invoke-direct {v0, p0}, Ll/۠ۜۖ;-><init>(Ll/ۛۜۖ;)V

    return-object v0
.end method

.method public abstract size()I
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1342
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1345
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    .line 1346
    invoke-virtual {p0}, Ll/ۛۜۖ;->size()I

    move-result v1

    .line 1353
    invoke-virtual {p0}, Ll/ۛۜۖ;->size()I

    move-result v2

    const/16 v3, 0x32

    if-gt v2, v3, :cond_0

    invoke-static {p0}, Ll/֫֨ۖ;->֫(Ll/ۛۜۖ;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    const/16 v4, 0x2f

    invoke-virtual {p0, v3, v4}, Ll/ۛۜۖ;->ۧ(II)Ll/ۛۜۖ;

    move-result-object v3

    invoke-static {v3}, Ll/֫֨ۖ;->֫(Ll/ۛۜۖ;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "..."

    .line 0
    invoke-static {v2, v3, v4}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1342
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "<ByteString@"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " size="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " contents=\""

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\">"

    .line 0
    invoke-static {v3, v2, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫(I)B
.end method

.method public abstract ֫(III)I
.end method

.method public abstract ֫(Ljava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method public abstract ֫(I[BII)V
.end method

.method public abstract ֫(Ll/ܳ᩷ۖ;)V
.end method

.method public abstract ۧ(I)B
.end method

.method public abstract ۧ(II)Ll/ۛۜۖ;
.end method

.method public abstract ۧ()Z
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 883
    sget-object v0, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    .line 863
    invoke-virtual {p0}, Ll/ۛۜۖ;->size()I

    move-result v1

    if-nez v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Ll/ۛۜۖ;->֫(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ܽ()Ll/۟ۜۖ;
.end method

.method public final ܿ()[B
    .locals 3

    .line 753
    invoke-virtual {p0}, Ll/ۛۜۖ;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 755
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    return-object v0

    .line 757
    :cond_0
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 758
    invoke-virtual {p0, v2, v1, v2, v0}, Ll/ۛۜۖ;->֫(I[BII)V

    return-object v1
.end method

.method public final ᩳ()I
    .locals 1

    .line 1283
    iget v0, p0, Ll/ۛۜۖ;->᩸:I

    return v0
.end method
