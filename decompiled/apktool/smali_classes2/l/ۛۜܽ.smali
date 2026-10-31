.class public final Ll/ۛۜܽ;
.super Ljava/lang/Object;
.source "91H5"


# instance fields
.field public final ֫:Ll/ۗۜܽ;

.field public ۧ:I


# direct methods
.method public constructor <init>(Ll/ۗۜܽ;I)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    .line 14
    iput p2, p0, Ll/ۛۜܽ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 98
    iget-object v0, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۗۜܽ;->֫(I)I

    move-result v0

    return v0
.end method

.method public final ֫([B)V
    .locals 2

    .line 84
    iget-object v0, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    invoke-virtual {v0, v1, p1}, Ll/ۗۜܽ;->֫(I[B)V

    .line 85
    iget v0, p0, Ll/ۛۜܽ;->ۧ:I

    array-length p1, p1

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۛۜܽ;->ۧ:I

    return-void
.end method

.method public final ֫(I)[I
    .locals 2

    .line 68
    iget-object v0, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    invoke-virtual {v0, v1, p1}, Ll/ۗۜܽ;->֫(II)[I

    move-result-object v0

    .line 69
    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v1

    iput p1, p0, Ll/ۛۜܽ;->ۧ:I

    return-object v0
.end method

.method public final ۜ()V
    .locals 1

    .line 106
    iget v0, p0, Ll/ۛۜܽ;->ۧ:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ۛۜܽ;->ۧ:I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 18
    iget v0, p0, Ll/ۛۜܽ;->ۧ:I

    return v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 4

    .line 74
    iget v0, p0, Ll/ۛۜܽ;->ۧ:I

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    move v2, p1

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_1

    .line 60
    iget-object v2, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    invoke-virtual {v2, v0}, Ll/ۗۜܽ;->ᩳ(I)S

    move-result v2

    int-to-char v2, v2

    add-int/lit8 v0, v0, 0x2

    if-nez v2, :cond_0

    goto :goto_1

    .line 65
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v2, v3

    goto :goto_0

    .line 67
    :cond_1
    :goto_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 76
    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, v1

    iput p1, p0, Ll/ۛۜܽ;->ۧ:I

    return-object v0
.end method

.method public final ܳ()I
    .locals 2

    .line 32
    iget-object v0, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۗۜܽ;->ܿ(I)I

    move-result v0

    .line 33
    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۛۜܽ;->ۧ:I

    return v0
.end method

.method public final ܽ()B
    .locals 2

    .line 26
    iget-object v0, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۗۜܽ;->ۧ(I)B

    move-result v0

    .line 27
    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۛۜܽ;->ۧ:I

    return v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 22
    iput p1, p0, Ll/ۛۜܽ;->ۧ:I

    return-void
.end method

.method public final ܿ()S
    .locals 2

    .line 38
    iget-object v0, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۗۜܽ;->ᩳ(I)S

    move-result v0

    .line 39
    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ۛۜܽ;->ۧ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 50
    iget-object v0, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۗۜܽ;->ܽ(I)I

    move-result v0

    .line 51
    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ۛۜܽ;->ۧ:I

    return v0
.end method

.method public final ᩳ(I)V
    .locals 1

    .line 110
    iget v0, p0, Ll/ۛۜܽ;->ۧ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۛۜܽ;->ۧ:I

    return-void
.end method

.method public final ᩻()I
    .locals 2

    .line 44
    iget-object v0, p0, Ll/ۛۜܽ;->֫:Ll/ۗۜܽ;

    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۗۜܽ;->ܳ(I)I

    move-result v0

    .line 45
    iget v1, p0, Ll/ۛۜܽ;->ۧ:I

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ۛۜܽ;->ۧ:I

    return v0
.end method
