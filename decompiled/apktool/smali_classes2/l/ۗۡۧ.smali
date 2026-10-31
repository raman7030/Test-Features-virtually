.class public final Ll/ۗۡۧ;
.super Ljava/lang/Object;
.source "T8TA"

# interfaces
.implements Ll/ܳ᩵֫;


# instance fields
.field public final ֫:I

.field public final ۜ:I

.field public final ۧ:I

.field public final ܳ:[B

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;IIII[B)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput p1, p0, Ll/ۗۡۧ;->᩻:I

    .line 65
    iput-object p2, p0, Ll/ۗۡۧ;->ܿ:Ljava/lang/String;

    .line 66
    iput-object p3, p0, Ll/ۗۡۧ;->ܽ:Ljava/lang/String;

    .line 67
    iput p4, p0, Ll/ۗۡۧ;->ۜ:I

    .line 68
    iput p5, p0, Ll/ۗۡۧ;->ᩳ:I

    .line 69
    iput p6, p0, Ll/ۗۡۧ;->ۧ:I

    .line 70
    iput p7, p0, Ll/ۗۡۧ;->֫:I

    .line 71
    iput-object p8, p0, Ll/ۗۡۧ;->ܳ:[B

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ll/ۗۡۧ;
    .locals 10

    .line 129
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    .line 130
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 131
    sget-object v2, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 133
    invoke-virtual {p0, v0, v2}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    .line 132
    invoke-static {v0}, Ll/ۢ᩵֫;->ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 134
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 510
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v3}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    .line 136
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v4

    .line 137
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    .line 138
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    .line 139
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    .line 140
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 141
    new-array v8, v0, [B

    const/4 v9, 0x0

    .line 142
    invoke-virtual {p0, v9, v0, v8}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 144
    new-instance p0, Ll/ۗۡۧ;

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Ll/ۗۡۧ;-><init>(ILjava/lang/String;Ljava/lang/String;IIII[B)V

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 89
    const-class v2, Ll/ۗۡۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 92
    :cond_1
    check-cast p1, Ll/ۗۡۧ;

    .line 93
    iget v2, p0, Ll/ۗۡۧ;->᩻:I

    iget v3, p1, Ll/ۗۡۧ;->᩻:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ۗۡۧ;->ܿ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۗۡۧ;->ܿ:Ljava/lang/String;

    .line 94
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ۗۡۧ;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۗۡۧ;->ܽ:Ljava/lang/String;

    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ll/ۗۡۧ;->ۜ:I

    iget v3, p1, Ll/ۗۡۧ;->ۜ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ۗۡۧ;->ᩳ:I

    iget v3, p1, Ll/ۗۡۧ;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ۗۡۧ;->ۧ:I

    iget v3, p1, Ll/ۗۡۧ;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ۗۡۧ;->֫:I

    iget v3, p1, Ll/ۗۡۧ;->֫:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ۗۡۧ;->ܳ:[B

    iget-object p1, p1, Ll/ۗۡۧ;->ܳ:[B

    .line 100
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 106
    iget v0, p0, Ll/ۗۡۧ;->᩻:I

    add-int/lit16 v0, v0, 0x20f

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 107
    iget-object v2, p0, Ll/ۗۡۧ;->ܿ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 108
    iget-object v2, p0, Ll/ۗۡۧ;->ܽ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 109
    iget v1, p0, Ll/ۗۡۧ;->ۜ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 110
    iget v1, p0, Ll/ۗۡۧ;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 111
    iget v1, p0, Ll/ۗۡۧ;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 112
    iget v1, p0, Ll/ۗۡۧ;->֫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 113
    iget-object v1, p0, Ll/ۗۡۧ;->ܳ:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Picture: mimeType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗۡۧ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗۡۧ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫()Ll/۠ᩴ֫;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ll/ᩳ᩵֫;)V
    .locals 2

    .line 76
    iget-object v0, p0, Ll/ۗۡۧ;->ܳ:[B

    iget v1, p0, Ll/ۗۡۧ;->᩻:I

    invoke-virtual {p1, v1, v0}, Ll/ᩳ᩵֫;->֫(I[B)V

    return-void
.end method

.method public final synthetic ۧ()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
