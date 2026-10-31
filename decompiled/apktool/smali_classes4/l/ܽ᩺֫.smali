.class public final Ll/ܽ᩺֫;
.super Ljava/lang/Object;
.source "07NF"

# interfaces
.implements Ll/᩵ۢۧ;


# static fields
.field public static final ܳ:Ll/۠ᩴ֫;

.field public static final ᩻:Ll/۠ᩴ֫;


# instance fields
.field public ֫:[B

.field public ۧ:I

.field public final ܽ:Ll/᩵ۢۧ;

.field public ܿ:Ll/۠ᩴ֫;

.field public final ᩳ:Ll/۠ᩴ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1864
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "application/id3"

    .line 1865
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    sput-object v0, Ll/ܽ᩺֫;->᩻:Ll/۠ᩴ֫;

    .line 1866
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "application/x-emsg"

    .line 1867
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    sput-object v0, Ll/ܽ᩺֫;->ܳ:Ll/۠ᩴ֫;

    return-void
.end method

.method public constructor <init>(Ll/᩵ۢۧ;I)V
    .locals 1

    .line 1878
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1880
    iput-object p1, p0, Ll/ܽ᩺֫;->ܽ:Ll/᩵ۢۧ;

    const/4 p1, 0x1

    if-eq p2, p1, :cond_1

    const/4 p1, 0x3

    if-ne p2, p1, :cond_0

    .line 1886
    sget-object p1, Ll/ܽ᩺֫;->ܳ:Ll/۠ᩴ֫;

    iput-object p1, p0, Ll/ܽ᩺֫;->ᩳ:Ll/۠ᩴ֫;

    goto :goto_0

    .line 1889
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown metadataType: "

    .line 0
    invoke-static {p2, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1889
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1883
    :cond_1
    sget-object p1, Ll/ܽ᩺֫;->᩻:Ll/۠ᩴ֫;

    iput-object p1, p0, Ll/ܽ᩺֫;->ᩳ:Ll/۠ᩴ֫;

    :goto_0
    const/4 p1, 0x0

    new-array p2, p1, [B

    .line 1892
    iput-object p2, p0, Ll/ܽ᩺֫;->֫:[B

    .line 1893
    iput p1, p0, Ll/ܽ᩺֫;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢᩴ֫;IZ)I
    .locals 0

    .line 168
    invoke-virtual {p0, p1, p2, p3}, Ll/ܽ᩺֫;->ۧ(Ll/ۢᩴ֫;IZ)I

    move-result p1

    return p1
.end method

.method public final ֫(ILl/ᩳ֨֫;)V
    .locals 1

    const/4 v0, 0x0

    .line 176
    invoke-virtual {p0, p2, p1, v0}, Ll/ܽ᩺֫;->֫(Ll/ᩳ֨֫;II)V

    return-void
.end method

.method public final synthetic ֫(J)V
    .locals 0

    return-void
.end method

.method public final ֫(JIIILl/ᩴۢۧ;)V
    .locals 9

    .line 1933
    iget-object v0, p0, Ll/ܽ᩺֫;->ܿ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1984
    iget v0, p0, Ll/ܽ᩺֫;->ۧ:I

    sub-int/2addr v0, p5

    sub-int p4, v0, p4

    .line 1987
    iget-object v1, p0, Ll/ܽ᩺֫;->֫:[B

    invoke-static {v1, p4, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p4

    .line 1988
    new-instance v1, Ll/ᩳ֨֫;

    invoke-direct {v1, p4}, Ll/ᩳ֨֫;-><init>([B)V

    .line 1990
    iget-object p4, p0, Ll/ܽ᩺֫;->֫:[B

    const/4 v2, 0x0

    invoke-static {p4, v0, p4, v2, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1991
    iput p5, p0, Ll/ܽ᩺֫;->ۧ:I

    .line 1936
    iget-object p4, p0, Ll/ܽ᩺֫;->ܿ:Ll/۠ᩴ֫;

    iget-object p4, p4, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object p5, p0, Ll/ܽ᩺֫;->ᩳ:Ll/۠ᩴ֫;

    iget-object v0, p5, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    iget-object p5, p5, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {p4, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_0

    .line 1939
    :cond_0
    iget-object p4, p0, Ll/ܽ᩺֫;->ܿ:Ll/۠ᩴ֫;

    iget-object p4, p4, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v0, "application/x-emsg"

    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 1941
    invoke-static {v1}, Ll/ۙۡۧ;->֫(Ll/ᩳ֨֫;)Ll/᩶ۡۧ;

    move-result-object p4

    .line 1964
    invoke-virtual {p4}, Ll/᩶ۡۧ;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1965
    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 1966
    invoke-static {p5, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1950
    new-instance v1, Ll/ᩳ֨֫;

    .line 1951
    invoke-virtual {p4}, Ll/᩶ۡۧ;->ۧ()[B

    move-result-object p4

    .line 155
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1951
    invoke-direct {v1, p4}, Ll/ᩳ֨֫;-><init>([B)V

    .line 1957
    :goto_0
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֫()I

    move-result v6

    .line 1959
    iget-object v2, p0, Ll/ܽ᩺֫;->ܽ:Ll/᩵ۢۧ;

    invoke-interface {v2, v6, v1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    const/4 v7, 0x0

    move-wide v3, p1

    move v5, p3

    move-object v8, p6

    .line 1960
    invoke-interface/range {v2 .. v8}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    return-void

    .line 1947
    :cond_1
    invoke-virtual {p4}, Ll/᩶ۡۧ;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    .line 1945
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Ignoring EMSG. Expected it to contain wrapped "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " but actual wrapped format: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1943
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-void

    .line 1953
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Ignoring sample for unsupported format: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Ll/ܽ᩺֫;->ܿ:Ll/۠ᩴ֫;

    iget-object p2, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/۠ᩴ֫;)V
    .locals 1

    .line 1898
    iput-object p1, p0, Ll/ܽ᩺֫;->ܿ:Ll/۠ᩴ֫;

    .line 1899
    iget-object p1, p0, Ll/ܽ᩺֫;->ܽ:Ll/᩵ۢۧ;

    iget-object v0, p0, Ll/ܽ᩺֫;->ᩳ:Ll/۠ᩴ֫;

    invoke-interface {p1, v0}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;II)V
    .locals 2

    .line 1921
    iget p3, p0, Ll/ܽ᩺֫;->ۧ:I

    add-int/2addr p3, p2

    .line 1970
    iget-object v0, p0, Ll/ܽ᩺֫;->֫:[B

    array-length v1, v0

    if-ge v1, p3, :cond_0

    .line 1971
    div-int/lit8 v1, p3, 0x2

    add-int/2addr v1, p3

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p3

    iput-object p3, p0, Ll/ܽ᩺֫;->֫:[B

    .line 1922
    :cond_0
    iget-object p3, p0, Ll/ܽ᩺֫;->֫:[B

    iget v0, p0, Ll/ܽ᩺֫;->ۧ:I

    invoke-virtual {p1, v0, p2, p3}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 1923
    iget p1, p0, Ll/ܽ᩺֫;->ۧ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ܽ᩺֫;->ۧ:I

    return-void
.end method

.method public final ۧ(Ll/ۢᩴ֫;IZ)I
    .locals 3

    .line 1906
    iget v0, p0, Ll/ܽ᩺֫;->ۧ:I

    add-int/2addr v0, p2

    .line 1970
    iget-object v1, p0, Ll/ܽ᩺֫;->֫:[B

    array-length v2, v1

    if-ge v2, v0, :cond_0

    .line 1971
    div-int/lit8 v2, v0, 0x2

    add-int/2addr v2, v0

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽ᩺֫;->֫:[B

    .line 1907
    :cond_0
    iget-object v0, p0, Ll/ܽ᩺֫;->֫:[B

    iget v1, p0, Ll/ܽ᩺֫;->ۧ:I

    invoke-interface {p1, v0, v1, p2}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    if-eqz p3, :cond_1

    return p2

    .line 1912
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 1915
    :cond_2
    iget p2, p0, Ll/ܽ᩺֫;->ۧ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ܽ᩺֫;->ۧ:I

    return p1
.end method
