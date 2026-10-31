.class public abstract Ll/ܳ᩷ۖ;
.super Ll/֨ۜۖ;
.source "39NU"


# static fields
.field public static final synthetic ۧ:I

.field public static final ܽ:Z

.field public static final ᩳ:Ljava/util/logging/Logger;


# instance fields
.field public ֫:Ll/᩻᩷ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Ll/ܳ᩷ۖ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ܳ᩷ۖ;->ᩳ:Ljava/util/logging/Logger;

    .line 38
    invoke-static {}, Ll/᩸֨ۖ;->ᩳ()Z

    move-result v0

    sput-boolean v0, Ll/ܳ᩷ۖ;->ܽ:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ll/ܳ᩷ۖ;-><init>()V

    return-void
.end method

.method public static ֫(ILl/ܺ᩵ۖ;)I
    .locals 1

    .line 632
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    .line 840
    invoke-virtual {p1}, Ll/ܺ᩵ۖ;->֫()I

    move-result p1

    .line 869
    invoke-static {p1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v0

    add-int/2addr v0, p1

    add-int/2addr v0, p0

    return v0
.end method

.method public static ۧ(Ljava/lang/String;)I
    .locals 1

    .line 825
    :try_start_0
    invoke-static {p0}, Ll/۫֨ۖ;->֫(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ll/ۗ֨ۖ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 828
    :catch_0
    sget-object v0, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 829
    array-length p0, p0

    .line 869
    :goto_0
    invoke-static {p0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static ۧ(Ll/ۡ֡ۖ;)I
    .locals 1

    .line 860
    invoke-interface {p0}, Ll/ۡ֡ۖ;->getSerializedSize()I

    move-result p0

    .line 869
    invoke-static {p0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static synthetic ۧ()Z
    .locals 1

    .line 36
    sget-boolean v0, Ll/ܳ᩷ۖ;->ܽ:Z

    return v0
.end method

.method public static ܳ(I)I
    .locals 0

    shl-int/lit8 p0, p0, 0x3

    .line 688
    invoke-static {p0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result p0

    return p0
.end method

.method public static ܳ(II)I
    .locals 2

    .line 488
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    int-to-long v0, p1

    .line 696
    invoke-static {v0, v1}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static ܽ(IJ)I
    .locals 0

    .line 528
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    .line 764
    invoke-static {p1, p2}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static ܽ(ILl/ۛۜۖ;)I
    .locals 1

    .line 608
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    .line 845
    invoke-virtual {p1}, Ll/ۛۜۖ;->size()I

    move-result p1

    .line 869
    invoke-static {p1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v0

    add-int/2addr v0, p1

    add-int/2addr v0, p0

    return v0
.end method

.method public static ܽ(J)I
    .locals 0

    .line 772
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x280

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method public static ܿ(I)I
    .locals 0

    .line 512
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static ܿ(II)I
    .locals 2

    .line 592
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    int-to-long v0, p1

    .line 696
    invoke-static {v0, v1}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static ᩳ(I)I
    .locals 0

    .line 583
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ᩳ(IJ)I
    .locals 0

    .line 536
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    invoke-static {p1, p2}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static ᩳ(ILl/ۡ֡ۖ;)I
    .locals 0

    .line 640
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    invoke-static {p1}, Ll/ܳ᩷ۖ;->ۧ(Ll/ۡ֡ۖ;)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static ᩻(I)I
    .locals 0

    .line 740
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x160

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method public static ᩻(II)I
    .locals 0

    .line 496
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    invoke-static {p1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public abstract ֫(B)V
.end method

.method public abstract ֫(I)V
.end method

.method public abstract ֫(II)V
.end method

.method public abstract ֫(IJ)V
.end method

.method public abstract ֫(ILjava/lang/String;)V
.end method

.method public abstract ֫(ILl/ۛۜۖ;)V
.end method

.method public final ֫(ILl/ۡ֡ۖ;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    .line 994
    invoke-virtual {p0, p1, v0}, Ll/ܳ᩷ۖ;->ܽ(II)V

    .line 1019
    invoke-interface {p2, p0}, Ll/ۡ֡ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    const/4 p2, 0x4

    .line 996
    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    return-void
.end method

.method public abstract ֫(ILl/ۡ֡ۖ;Ll/ۢۚۖ;)V
.end method

.method public abstract ֫(IZ)V
.end method

.method public abstract ֫(I[B)V
.end method

.method public abstract ֫(J)V
.end method

.method public abstract ֫(Ljava/lang/String;)V
.end method

.method public final ֫(Ljava/lang/String;Ll/ۗ֨ۖ;)V
    .locals 3

    .line 967
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v1, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    sget-object v2, Ll/ܳ᩷ۖ;->ᩳ:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0, v1, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 976
    sget-object p2, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 978
    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 979
    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p2, p1}, Ll/֨ۜۖ;->֫(II[B)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 981
    new-instance p2, Ll/ᩳ᩷ۖ;

    invoke-direct {p2, p1}, Ll/ᩳ᩷ۖ;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public abstract ֫(Ll/ۛۜۖ;)V
.end method

.method public abstract ֫(Ll/ۡ֡ۖ;)V
.end method

.method public abstract ۧ(I)V
.end method

.method public abstract ۧ(II)V
.end method

.method public abstract ۧ(IJ)V
.end method

.method public abstract ۧ(ILl/ۛۜۖ;)V
.end method

.method public abstract ۧ(ILl/ۡ֡ۖ;)V
.end method

.method public abstract ۧ(J)V
.end method

.method public abstract ܽ(I)V
.end method

.method public abstract ܽ(II)V
.end method

.method public abstract ܽ(ILl/ۡ֡ۖ;)V
.end method

.method public abstract ᩳ(II)V
.end method
