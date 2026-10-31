.class public final Ll/ܳ֫ۚ;
.super Ljava/lang/Object;
.source "W8EK"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/ۜ֫ۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-virtual {p1, p2}, Ll/ۜ֫ۚ;->֫(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/ܳ֫ۚ;->֫:I

    .line 10
    invoke-virtual {p1, p3}, Ll/ۜ֫ۚ;->֫(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/ܳ֫ۚ;->ۧ:I

    .line 11
    invoke-virtual {p1, p4}, Ll/ۜ֫ۚ;->֫(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ܳ֫ۚ;->ܽ:I

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

    .line 17
    const-class v2, Ll/ܳ֫ۚ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Ll/ܳ֫ۚ;

    .line 20
    iget v2, p0, Ll/ܳ֫ۚ;->֫:I

    iget v3, p1, Ll/ܳ֫ۚ;->֫:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ܳ֫ۚ;->ۧ:I

    iget v3, p1, Ll/ܳ֫ۚ;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ܳ֫ۚ;->ܽ:I

    iget p1, p1, Ll/ܳ֫ۚ;->ܽ:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 26
    iget v0, p0, Ll/ܳ֫ۚ;->֫:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ܳ֫ۚ;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 27
    iget v1, p0, Ll/ܳ֫ۚ;->ܽ:I

    add-int/2addr v0, v1

    return v0
.end method
