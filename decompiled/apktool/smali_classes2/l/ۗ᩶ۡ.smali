.class public final Ll/ۗ᩶ۡ;
.super Ljava/lang/Object;
.source "UBJN"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ۫:Ll/ۗ᩶ۡ;


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public final ۬:I

.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Ll/ۗ᩶ۡ;

    invoke-direct {v0}, Ll/ۗ᩶ۡ;-><init>()V

    sput-object v0, Ll/ۗ᩶ۡ;->۫:Ll/ۗ᩶ۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 54
    iput v0, p0, Ll/ۗ᩶ۡ;->᩶:I

    iput v0, p0, Ll/ۗ᩶ۡ;->᩸:I

    iput v0, p0, Ll/ۗ᩶ۡ;->᩹:I

    iput v0, p0, Ll/ۗ᩶ۡ;->۬:I

    iput v0, p0, Ll/ۗ᩶ۡ;->ۙ:I

    iput v0, p0, Ll/ۗ᩶ۡ;->ۗ:I

    return-void
.end method

.method public constructor <init>(IIIIII)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p1, p0, Ll/ۗ᩶ۡ;->ۗ:I

    .line 40
    iput p2, p0, Ll/ۗ᩶ۡ;->ۙ:I

    .line 41
    iput p3, p0, Ll/ۗ᩶ۡ;->۬:I

    .line 42
    iput p4, p0, Ll/ۗ᩶ۡ;->᩹:I

    .line 43
    iput p5, p0, Ll/ۗ᩶ۡ;->᩸:I

    .line 44
    iput p6, p0, Ll/ۗ᩶ۡ;->᩶:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 168
    :cond_0
    instance-of v1, p1, Ll/ۗ᩶ۡ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 171
    :cond_1
    check-cast p1, Ll/ۗ᩶ۡ;

    .line 173
    iget v1, p1, Ll/ۗ᩶ۡ;->ۗ:I

    iget v3, p0, Ll/ۗ᩶ۡ;->ۗ:I

    if-ne v1, v3, :cond_2

    iget v1, p1, Ll/ۗ᩶ۡ;->ۙ:I

    iget v3, p0, Ll/ۗ᩶ۡ;->ۙ:I

    if-ne v1, v3, :cond_2

    iget v1, p1, Ll/ۗ᩶ۡ;->۬:I

    iget v3, p0, Ll/ۗ᩶ۡ;->۬:I

    if-ne v1, v3, :cond_2

    iget v1, p1, Ll/ۗ᩶ۡ;->᩹:I

    iget v3, p0, Ll/ۗ᩶ۡ;->᩹:I

    if-ne v1, v3, :cond_2

    iget v1, p1, Ll/ۗ᩶ۡ;->᩸:I

    iget v3, p0, Ll/ۗ᩶ۡ;->᩸:I

    if-ne v1, v3, :cond_2

    iget p1, p1, Ll/ۗ᩶ۡ;->᩶:I

    iget v1, p0, Ll/ۗ᩶ۡ;->᩶:I

    if-ne p1, v1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 8

    .line 183
    iget v0, p0, Ll/ۗ᩶ۡ;->ۗ:I

    .line 184
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ۗ᩶ۡ;->ۙ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/ۗ᩶ۡ;->۬:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ll/ۗ᩶ۡ;->᩹:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Ll/ۗ᩶ۡ;->᩸:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Ll/ۗ᩶ۡ;->᩶:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x6

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v2, v6, v0

    const/4 v0, 0x3

    aput-object v3, v6, v0

    const/4 v0, 0x4

    aput-object v4, v6, v0

    const/4 v0, 0x5

    aput-object v5, v6, v0

    .line 78
    invoke-static {v6}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 80
    iget v0, p0, Ll/ۗ᩶ۡ;->ۗ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string v0, "?"

    return-object v0

    .line 83
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    add-int/lit8 v3, v0, 0x1

    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x3a

    .line 85
    iget v4, p0, Ll/ۗ᩶ۡ;->ۙ:I

    if-eq v4, v1, :cond_1

    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v4, 0x1

    .line 87
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    :cond_1
    iget v5, p0, Ll/ۗ᩶ۡ;->᩹:I

    if-eq v5, v1, :cond_4

    const/16 v6, 0x2d

    .line 91
    iget v7, p0, Ll/ۗ᩶ۡ;->᩸:I

    if-ne v5, v0, :cond_2

    if-eq v7, v1, :cond_4

    if-eq v7, v4, :cond_4

    .line 93
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    .line 94
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    .line 98
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-eq v7, v1, :cond_3

    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    .line 101
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    if-eq v4, v1, :cond_4

    const-string v0, ":?"

    .line 105
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    :cond_4
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 188
    iget v0, p0, Ll/ۗ᩶ۡ;->ۗ:I

    return v0
.end method
