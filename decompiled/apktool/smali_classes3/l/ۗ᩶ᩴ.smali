.class public final Ll/ۗ᩶ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۘ᩶ᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final d:Ll/ۗ᩶ᩴ;

.field public static final e:[Ll/ۗ᩶ᩴ;

.field public static final serialVersionUID:J = 0x145a0d680453ed8aL


# instance fields
.field public final transient a:I

.field public final transient b:Ll/ᩴ᩹ᩴ;

.field public final transient c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    .line 139
    new-instance v0, Ll/ۗ᩶ᩴ;

    const/16 v1, 0x74c

    const/4 v2, 0x1

    invoke-static {v1, v2, v2}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v1

    const-string v3, "Meiji"

    const/4 v4, -0x1

    invoke-direct {v0, v4, v1, v3}, Ll/ۗ᩶ᩴ;-><init>(ILl/ᩴ᩹ᩴ;Ljava/lang/String;)V

    sput-object v0, Ll/ۗ᩶ᩴ;->d:Ll/ۗ᩶ᩴ;

    .line 145
    new-instance v1, Ll/ۗ᩶ᩴ;

    const/4 v3, 0x7

    const/16 v4, 0x1e

    const/16 v5, 0x778

    invoke-static {v5, v3, v4}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v3

    const-string v4, "Taisho"

    const/4 v5, 0x0

    invoke-direct {v1, v5, v3, v4}, Ll/ۗ᩶ᩴ;-><init>(ILl/ᩴ᩹ᩴ;Ljava/lang/String;)V

    .line 151
    new-instance v3, Ll/ۗ᩶ᩴ;

    const/16 v4, 0xc

    const/16 v6, 0x19

    const/16 v7, 0x786

    invoke-static {v7, v4, v6}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v4

    const-string v6, "Showa"

    invoke-direct {v3, v2, v4, v6}, Ll/ۗ᩶ᩴ;-><init>(ILl/ᩴ᩹ᩴ;Ljava/lang/String;)V

    .line 157
    new-instance v4, Ll/ۗ᩶ᩴ;

    const/16 v6, 0x7c5

    const/16 v7, 0x8

    invoke-static {v6, v2, v7}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v6

    const-string v7, "Heisei"

    const/4 v8, 0x2

    invoke-direct {v4, v8, v6, v7}, Ll/ۗ᩶ᩴ;-><init>(ILl/ᩴ᩹ᩴ;Ljava/lang/String;)V

    .line 165
    new-instance v6, Ll/ۗ᩶ᩴ;

    const/16 v7, 0x7e3

    const/4 v9, 0x5

    invoke-static {v7, v9, v2}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v7

    const-string v10, "Reiwa"

    const/4 v11, 0x3

    invoke-direct {v6, v11, v7, v10}, Ll/ۗ᩶ᩴ;-><init>(ILl/ᩴ᩹ᩴ;Ljava/lang/String;)V

    new-array v7, v9, [Ll/ۗ᩶ᩴ;

    .line 183
    sput-object v7, Ll/ۗ᩶ᩴ;->e:[Ll/ۗ᩶ᩴ;

    aput-object v0, v7, v5

    aput-object v1, v7, v2

    aput-object v3, v7, v8

    aput-object v4, v7, v11

    const/4 v0, 0x4

    aput-object v6, v7, v0

    return-void
.end method

.method public constructor <init>(ILl/ᩴ᩹ᩴ;Ljava/lang/String;)V
    .locals 0

    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 256
    iput p1, p0, Ll/ۗ᩶ᩴ;->a:I

    .line 257
    iput-object p2, p0, Ll/ۗ᩶ᩴ;->b:Ll/ᩴ᩹ᩴ;

    .line 258
    iput-object p3, p0, Ll/ۗ᩶ᩴ;->c:Ljava/lang/String;

    return-void
.end method

.method public static j(Ll/ᩴ᩹ᩴ;)Ll/ۗ᩶ᩴ;
    .locals 3

    .line 368
    sget-object v0, Ll/ۙ᩶ᩴ;->d:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p0, v0}, Ll/ᩴ᩹ᩴ;->c0(Ll/۬᩹ᩴ;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 371
    sget-object v0, Ll/ۗ᩶ᩴ;->e:[Ll/ۗ᩶ᩴ;

    array-length v0, v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 372
    sget-object v1, Ll/ۗ᩶ᩴ;->e:[Ll/ۗ᩶ᩴ;

    aget-object v1, v1, v0

    .line 373
    iget-object v2, v1, Ll/ۗ᩶ᩴ;->b:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p0, v2}, Ll/ᩴ᩹ᩴ;->R(Ll/۬᩹ᩴ;)I

    move-result v2

    if-ltz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p0, 0x0

    return-object p0

    .line 369
    :cond_2
    new-instance p0, Ll/ܺ᩹ᩴ;

    const-string v0, "JapaneseDate before Meiji 6 are not supported"

    invoke-direct {p0, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static o(I)Ll/ۗ᩶ᩴ;
    .locals 3

    add-int/lit8 v0, p0, 0x1

    if-ltz v0, :cond_0

    .line 297
    sget-object v1, Ll/ۗ᩶ᩴ;->e:[Ll/ۗ᩶ᩴ;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 300
    aget-object p0, v1, v0

    return-object p0

    .line 298
    :cond_0
    new-instance v0, Ll/ܺ᩹ᩴ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid era: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 488
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 504
    new-instance v0, Ll/۟᩹ᩴ;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0}, Ll/۟᩹ᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic G(Ll/ۤۗᩴ;)J
    .locals 2

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->d(Ll/ۘ᩶ᩴ;Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->f(Ll/ۘ᩶ᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic e(Ll/ۤۗᩴ;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->e(Ll/ۘ᩶ᩴ;Ll/ۤۗᩴ;)Z

    move-result p1

    return p1
.end method

.method public final getValue()I
    .locals 1

    .line 422
    iget v0, p0, Ll/ۗ᩶ᩴ;->a:I

    return v0
.end method

.method public final k()Ll/ۗ᩶ᩴ;
    .locals 2

    .line 199
    sget-object v0, Ll/ۗ᩶ᩴ;->e:[Ll/ۗ᩶ᩴ;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    if-ne p0, v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 472
    :cond_0
    iget v0, p0, Ll/ۗ᩶ᩴ;->a:I

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/ۗ᩶ᩴ;->o(I)Ll/ۗ᩶ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic l(Ll/ۤۗᩴ;)I
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->c(Ll/ۘ᩶ᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 1

    .line 453
    sget-object v0, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    .line 454
    sget-object p1, Ll/᩹᩶ᩴ;->c:Ll/᩹᩶ᩴ;

    invoke-virtual {p1, v0}, Ll/᩹᩶ᩴ;->v(Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 179
    :cond_0
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    .line 301
    sget-object v0, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {p0}, Ll/ۗ᩶ᩴ;->getValue()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 467
    iget-object v0, p0, Ll/ۗ᩶ᩴ;->c:Ljava/lang/String;

    return-object v0
.end method
