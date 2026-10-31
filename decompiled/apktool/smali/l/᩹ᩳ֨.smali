.class public Ll/᩹ᩳ֨;
.super Ll/֨᩺ۚ;
.source "97F2"

# interfaces
.implements Ljava/lang/Comparable;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 276
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 35
    invoke-direct {p0, p1, p2}, Ll/ۜۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 270
    check-cast p1, Ll/᩹ᩳ֨;

    .line 43
    iget-object v0, p0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 308
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 299
    instance-of v0, p1, Ll/᩹ᩳ֨;

    if-eqz v0, :cond_0

    .line 300
    check-cast p1, Ll/᩹ᩳ֨;

    .line 43
    iget-object v0, p0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 301
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 294
    invoke-virtual {p0}, Ll/֨᩺ۚ;->֫()I

    move-result v0

    .line 43
    iget-object v1, p0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 294
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0xb

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x1

    new-array v1, v0, [Ll/֫ܿ֨;

    .line 313
    sget-object v2, Ll/֫ܿ֨;->۬:Ll/֫ܿ֨;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v1}, Ll/ۧܿ֨;->֫([Ll/֫ܿ֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 285
    invoke-virtual {p0}, Ll/֨᩺ۚ;->֫()I

    move-result v1

    .line 313
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 43
    iget-object v2, p0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v3

    aput-object v2, v4, v0

    const-string v0, "#%-4d /* %s */"

    .line 313
    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 43
    :cond_0
    iget-object v0, p0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public ܿ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
