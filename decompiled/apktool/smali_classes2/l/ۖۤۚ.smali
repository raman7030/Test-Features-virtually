.class public abstract Ll/ۖۤۚ;
.super Ljava/lang/Object;
.source "37DX"


# instance fields
.field public final ֫:Ll/ۧۤۚ;

.field public ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۧۤۚ;Ljava/lang/Object;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    .line 37
    iput-object p2, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 61
    :cond_0
    instance-of v1, p1, Ll/ۖۤۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 62
    :cond_1
    check-cast p1, Ll/ۖۤۚ;

    .line 63
    iget-object v1, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    iget-object v3, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    iget-object p1, p1, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 53
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 54
    iget-object v1, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 81
    iget-object v0, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {v0}, Ll/ۧۤۚ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۖۤۚ;->֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, " : \'"

    const-string v3, "\']"

    const-string v4, "["

    .line 0
    invoke-static {v4, v0, v2, v1, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    if-nez v0, :cond_0

    const-string v0, "?"

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {v0}, Ll/ۧۤۚ;->ۧ()B

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 68
    :cond_0
    instance-of v1, p1, Ll/ۖۤۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 69
    :cond_1
    check-cast p1, Ll/ۖۤۚ;

    iget-object v1, p1, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    .line 70
    iget-object v3, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    instance-of v4, v3, Ll/ܺۤۚ;

    iget-object v5, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    if-eqz v4, :cond_3

    .line 71
    iget-object p1, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    instance-of v4, p1, Ll/ܺۤۚ;

    if-eqz v4, :cond_2

    .line 72
    check-cast v3, Ll/ܺۤۚ;

    invoke-virtual {v3, p1}, Ll/ܺۤۚ;->֫(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-ne v5, v1, :cond_2

    return v0

    :cond_2
    return v2

    .line 76
    :cond_3
    iget-object p1, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    if-ne v5, v1, :cond_4

    return v0

    :cond_4
    return v2
.end method

.method public ۧ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
