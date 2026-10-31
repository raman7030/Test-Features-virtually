.class public final Ll/ۜۧܽ;
.super Ljava/lang/Object;
.source "1AMN"

# interfaces
.implements Ll/ܳۧܽ;


# instance fields
.field public final ֫:Ll/ۚ֫ܽ;

.field public final ۧ:Ll/ܿۧܽ;

.field public final ܽ:Ll/᩻ۧܽ;


# direct methods
.method public constructor <init>(Ll/ۚ֫ܽ;Ll/᩻ۧܽ;Ll/ܿۧܽ;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ll/ۜۧܽ;->֫:Ll/ۚ֫ܽ;

    .line 33
    iput-object p2, p0, Ll/ۜۧܽ;->ܽ:Ll/᩻ۧܽ;

    .line 34
    iput-object p3, p0, Ll/ۜۧܽ;->ۧ:Ll/ܿۧܽ;

    .line 97
    invoke-virtual {p1}, Ll/ۚ֫ܽ;->ᩳ()I

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ll/ۚ֫ܽ;->֫()I

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Bounds must be non zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 98
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/ۚ֫ܽ;->ۧ()I

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ll/ۚ֫ܽ;->ܽ()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Bounding rectangle must start at the top or left window edge for folding features"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-nez p1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 169
    :goto_0
    const-class v2, Ll/ۜۧܽ;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    if-eqz p1, :cond_6

    .line 76
    check-cast p1, Ll/ۜۧܽ;

    .line 78
    iget-object v1, p0, Ll/ۜۧܽ;->֫:Ll/ۚ֫ܽ;

    iget-object v3, p1, Ll/ۜۧܽ;->֫:Ll/ۚ֫ܽ;

    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    .line 79
    :cond_3
    iget-object v1, p0, Ll/ۜۧܽ;->ܽ:Ll/᩻ۧܽ;

    iget-object v3, p1, Ll/ۜۧܽ;->ܽ:Ll/᩻ۧܽ;

    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    .line 34
    :cond_4
    iget-object v1, p0, Ll/ۜۧܽ;->ۧ:Ll/ܿۧܽ;

    iget-object p1, p1, Ll/ۜۧܽ;->ۧ:Ll/ܿۧܽ;

    .line 80
    invoke-static {v1, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0

    .line 76
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hashCode()I
    .locals 2

    .line 86
    iget-object v0, p0, Ll/ۜۧܽ;->֫:Ll/ۚ֫ܽ;

    invoke-virtual {v0}, Ll/ۚ֫ܽ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 87
    iget-object v1, p0, Ll/ۜۧܽ;->ܽ:Ll/᩻ۧܽ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 34
    iget-object v0, p0, Ll/ۜۧܽ;->ۧ:Ll/ܿۧܽ;

    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HardwareFoldingFeature { "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۜۧܽ;->֫:Ll/ۚ֫ܽ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜۧܽ;->ܽ:Ll/᩻ۧܽ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    iget-object v1, p0, Ll/ۜۧܽ;->ۧ:Ll/ܿۧܽ;

    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Landroid/graphics/Rect;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ۜۧܽ;->֫:Ll/ۚ֫ܽ;

    invoke-virtual {v0}, Ll/ۚ֫ܽ;->ܿ()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Z
    .locals 3

    .line 122
    invoke-static {}, Ll/᩻ۧܽ;->ۧ()Ll/᩻ۧܽ;

    move-result-object v0

    .line 46
    iget-object v1, p0, Ll/ۜۧܽ;->ܽ:Ll/᩻ۧܽ;

    invoke-static {v1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    return v2

    .line 117
    :cond_0
    invoke-static {}, Ll/᩻ۧܽ;->֫()Ll/᩻ۧܽ;

    move-result-object v0

    .line 47
    invoke-static {v1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    iget-object v0, p0, Ll/ۜۧܽ;->ۧ:Ll/ܿۧܽ;

    .line 47
    sget-object v1, Ll/ܿۧܽ;->ܽ:Ll/ܿۧܽ;

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ll/ᩳۧܽ;
    .locals 2

    .line 60
    iget-object v0, p0, Ll/ۜۧܽ;->֫:Ll/ۚ֫ܽ;

    invoke-virtual {v0}, Ll/ۚ֫ܽ;->ᩳ()I

    move-result v1

    invoke-virtual {v0}, Ll/ۚ֫ܽ;->֫()I

    move-result v0

    if-le v1, v0, :cond_0

    .line 61
    sget-object v0, Ll/ᩳۧܽ;->ۧ:Ll/ᩳۧܽ;

    return-object v0

    .line 63
    :cond_0
    sget-object v0, Ll/ᩳۧܽ;->ܽ:Ll/ᩳۧܽ;

    return-object v0
.end method
