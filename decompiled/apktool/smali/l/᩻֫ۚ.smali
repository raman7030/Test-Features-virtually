.class public final Ll/᩻֫ۚ;
.super Ljava/lang/Object;
.source "M8FO"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:[I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۜ֫ۚ;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-virtual {p1, p2}, Ll/ۜ֫ۚ;->֫(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/᩻֫ۚ;->֫:I

    .line 14
    invoke-virtual {p1, p3}, Ll/ۜ֫ۚ;->֫(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/᩻֫ۚ;->ۧ:I

    .line 15
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    new-array p2, p2, [I

    iput-object p2, p0, Ll/᩻֫ۚ;->ܽ:[I

    .line 16
    invoke-virtual {p1, p5}, Ll/ۜ֫ۚ;->֫(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/᩻֫ۚ;->ᩳ:I

    const/4 p2, 0x0

    .line 17
    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    .line 18
    iget-object p3, p0, Ll/᩻֫ۚ;->ܽ:[I

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/CharSequence;

    invoke-interface {p5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p5}, Ll/ۜ֫ۚ;->֫(Ljava/lang/String;)I

    move-result p5

    aput p5, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
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

    if-eqz p1, :cond_2

    .line 25
    const-class v2, Ll/᩻֫ۚ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 27
    :cond_1
    check-cast p1, Ll/᩻֫ۚ;

    .line 28
    iget v2, p0, Ll/᩻֫ۚ;->֫:I

    iget v3, p1, Ll/᩻֫ۚ;->֫:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩻֫ۚ;->ۧ:I

    iget v3, p1, Ll/᩻֫ۚ;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩻֫ۚ;->ᩳ:I

    iget v3, p1, Ll/᩻֫ۚ;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩻֫ۚ;->ܽ:[I

    iget-object p1, p1, Ll/᩻֫ۚ;->ܽ:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 34
    iget v0, p0, Ll/᩻֫ۚ;->֫:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/᩻֫ۚ;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 35
    iget-object v1, p0, Ll/᩻֫ۚ;->ܽ:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 36
    iget v0, p0, Ll/᩻֫ۚ;->ᩳ:I

    add-int/2addr v1, v0

    return v1
.end method
