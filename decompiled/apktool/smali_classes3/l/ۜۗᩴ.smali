.class public final Ll/ۜۗᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/۫ۗᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final d:Ll/ۜۗᩴ;

.field public static final serialVersionUID:J = -0xcbe97ad039fbcL


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 139
    new-instance v0, Ll/ۜۗᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Ll/ۜۗᩴ;-><init>(III)V

    sput-object v0, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    const-string v0, "([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?"

    const/4 v2, 0x2

    .line 148
    invoke-static {v0, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 0
    sget-object v3, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    aput-object v3, v0, v1

    sget-object v1, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    aput-object v1, v0, v2

    invoke-static {v0}, Ll/᩺ۚᩴ;->B([Ljava/lang/Object;)Ljava/util/List;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 416
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 417
    iput p1, p0, Ll/ۜۗᩴ;->a:I

    .line 418
    iput p2, p0, Ll/ۜۗᩴ;->b:I

    .line 419
    iput p3, p0, Ll/ۜۗᩴ;->c:I

    return-void
.end method

.method public static a(III)Ll/ۜۗᩴ;
    .locals 1

    or-int v0, p0, p1

    or-int/2addr v0, p2

    if-nez v0, :cond_0

    .line 404
    sget-object p0, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    return-object p0

    .line 406
    :cond_0
    new-instance v0, Ll/ۜۗᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۜۗᩴ;-><init>(III)V

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1070
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1060
    new-instance v0, Ll/᩷ۗᩴ;

    const/16 v1, 0xe

    invoke-direct {v0, v1, p0}, Ll/᩷ۗᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 997
    :cond_0
    instance-of v1, p1, Ll/ۜۗᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 998
    check-cast p1, Ll/ۜۗᩴ;

    .line 999
    iget v1, p0, Ll/ۜۗᩴ;->a:I

    iget v3, p1, Ll/ۜۗᩴ;->a:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Ll/ۜۗᩴ;->b:I

    iget v3, p1, Ll/ۜۗᩴ;->b:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Ll/ۜۗᩴ;->c:I

    iget p1, p1, Ll/ۜۗᩴ;->c:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 1013
    iget v0, p0, Ll/ۜۗᩴ;->a:I

    iget v1, p0, Ll/ۜۗᩴ;->b:I

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v0

    iget v0, p0, Ll/ۜۗᩴ;->c:I

    const/16 v2, 0x10

    invoke-static {v0, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final l(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 5

    const-string v0, "temporal"

    .line 973
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 974
    sget-object v0, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ᩶ᩴ;

    if-eqz v0, :cond_1

    .line 975
    sget-object v1, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    invoke-virtual {v1, v0}, Ll/ۙ᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 976
    :cond_0
    new-instance p1, Ll/ܺ᩹ᩴ;

    invoke-interface {v0}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Chronology mismatch, expected: ISO, actual: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1

    .line 900
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۜۗᩴ;->b:I

    if-nez v0, :cond_2

    .line 901
    iget v0, p0, Ll/ۜۗᩴ;->a:I

    if-eqz v0, :cond_3

    int-to-long v0, v0

    .line 902
    sget-object v2, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    goto :goto_1

    .line 859
    :cond_2
    iget v1, p0, Ll/ۜۗᩴ;->a:I

    int-to-long v1, v1

    const-wide/16 v3, 0xc

    mul-long v1, v1, v3

    int-to-long v3, v0

    add-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-eqz v0, :cond_3

    .line 907
    sget-object v0, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 910
    :cond_3
    :goto_1
    iget v0, p0, Ll/ۜۗᩴ;->c:I

    if-eqz v0, :cond_4

    int-to-long v0, v0

    .line 911
    sget-object v2, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1027
    sget-object v0, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    if-ne p0, v0, :cond_0

    const-string v0, "P0D"

    return-object v0

    .line 1030
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "P"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1032
    iget v1, p0, Ll/ۜۗᩴ;->a:I

    if-eqz v1, :cond_1

    .line 1033
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x59

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1035
    :cond_1
    iget v1, p0, Ll/ۜۗᩴ;->b:I

    if-eqz v1, :cond_2

    .line 1036
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x4d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1038
    :cond_2
    iget v1, p0, Ll/ۜۗᩴ;->c:I

    if-eqz v1, :cond_3

    .line 1039
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1041
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
