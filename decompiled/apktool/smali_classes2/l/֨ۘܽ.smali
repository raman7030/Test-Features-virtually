.class public final Ll/֨ۘܽ;
.super Ll/ۡۘܽ;
.source "N1FO"


# instance fields
.field public ܿ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ll/ۡۘܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 79
    const-class v2, Ll/֨ۘܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 81
    :cond_1
    check-cast p1, Ll/֨ۘܽ;

    .line 83
    iget v2, p0, Ll/ۡۘܽ;->ܽ:I

    iget v3, p1, Ll/ۡۘܽ;->ܽ:I

    if-eq v2, v3, :cond_2

    return v1

    .line 84
    :cond_2
    iget v2, p0, Ll/ۡۘܽ;->֫:I

    iget v3, p1, Ll/ۡۘܽ;->֫:I

    if-eq v2, v3, :cond_3

    return v1

    .line 85
    :cond_3
    iget-object v2, p0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    if-eqz v2, :cond_5

    .line 86
    iget-object v3, p1, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p1, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    return v0

    :cond_4
    return v1

    .line 88
    :cond_5
    iget-object p1, p1, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    if-nez p1, :cond_6

    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 94
    iget-object v0, p0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 95
    iget v1, p0, Ll/ۡۘܽ;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 96
    iget v1, p0, Ll/ۡۘܽ;->֫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "XmlText{text=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', line="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۡۘܽ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", column="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۡۘܽ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۡۘܽ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۡۘܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۤۜܽ;Ljava/util/HashMap;)V
    .locals 1

    .line 48
    iget v0, p0, Ll/ۡۘܽ;->ܽ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 49
    iget v0, p0, Ll/ۡۘܽ;->֫:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 50
    iget v0, p0, Ll/ۡۘܽ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 51
    iget v0, p0, Ll/ۡۘܽ;->ۧ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 52
    iget-object v0, p0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/ۡۘܽ;->֫(Ll/ۤۜܽ;Ljava/util/HashMap;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;Landroid/util/SparseArray;)V
    .locals 1

    .line 57
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    iput v0, p0, Ll/ۡۘܽ;->ܽ:I

    .line 58
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    iput v0, p0, Ll/ۡۘܽ;->֫:I

    .line 59
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    iput v0, p0, Ll/ۡۘܽ;->ᩳ:I

    .line 60
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    iput v0, p0, Ll/ۡۘܽ;->ۧ:I

    .line 61
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
