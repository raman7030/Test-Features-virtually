.class public abstract Ll/ܿ֨ۖ;
.super Ljava/lang/Object;
.source "E9PS"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ֫()Ljava/lang/Object;
.end method

.method public abstract ֫(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ֫(IILjava/lang/Object;)V
.end method

.method public abstract ֫(IJLjava/lang/Object;)V
.end method

.method public abstract ֫(ILjava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract ֫(Ljava/lang/Object;ILl/ۛۜۖ;)V
.end method

.method public abstract ֫(Ljava/lang/Object;Ll/ۜ۠ۖ;)V
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۧۚۖ;)Z
    .locals 6

    .line 60
    invoke-interface {p2}, Ll/ۧۚۖ;->getTag()I

    move-result v0

    ushr-int/lit8 v1, v0, 0x3

    and-int/lit8 v0, v0, 0x7

    const/4 v2, 0x1

    if-eqz v0, :cond_8

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v3, 0x4

    const/4 v4, 0x3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x5

    if-ne v0, v3, :cond_0

    .line 67
    invoke-interface {p2}, Ll/ۧۚۖ;->ۡ()I

    move-result p2

    invoke-virtual {p0, v1, p2, p1}, Ll/ܿ֨ۖ;->֫(IILjava/lang/Object;)V

    return v2

    .line 87
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->ܿ()Ll/۟ᩴۖ;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1

    .line 76
    :cond_2
    invoke-virtual {p0}, Ll/ܿ֨ۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    shl-int/lit8 v4, v1, 0x3

    or-int/2addr v3, v4

    .line 93
    :cond_3
    invoke-interface {p2}, Ll/ۧۚۖ;->ۘ()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_4

    .line 94
    invoke-virtual {p0, v0, p2}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;Ll/ۧۚۖ;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 79
    :cond_4
    invoke-interface {p2}, Ll/ۧۚۖ;->getTag()I

    move-result p2

    if-ne v3, p2, :cond_5

    .line 82
    invoke-virtual {p0, v0}, Ll/ܿ֨ۖ;->ܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, v1, p1, p2}, Ll/ܿ֨ۖ;->֫(ILjava/lang/Object;Ljava/lang/Object;)V

    return v2

    .line 80
    :cond_5
    invoke-static {}, Ll/֫᩵ۖ;->ۧ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 73
    :cond_6
    invoke-interface {p2}, Ll/ۧۚۖ;->ۜ()Ll/ۛۜۖ;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p2}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;ILl/ۛۜۖ;)V

    return v2

    .line 70
    :cond_7
    invoke-interface {p2}, Ll/ۧۚۖ;->֫()J

    move-result-wide v3

    invoke-virtual {p0, v1, v3, v4, p1}, Ll/ܿ֨ۖ;->֫(IJLjava/lang/Object;)V

    return v2

    .line 64
    :cond_8
    invoke-interface {p2}, Ll/ۧۚۖ;->ۚ()J

    move-result-wide v3

    invoke-virtual {p0, v1, v3, v4, p1}, Ll/ܿ֨ۖ;->ۧ(IJLjava/lang/Object;)V

    return v2
.end method

.method public abstract ֫(Ll/ۧۚۖ;)Z
.end method

.method public abstract ۧ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ۧ(IJLjava/lang/Object;)V
.end method

.method public abstract ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract ۧ(Ljava/lang/Object;Ll/ۜ۠ۖ;)V
.end method

.method public abstract ܳ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ܽ(Ljava/lang/Object;)I
.end method

.method public abstract ܽ(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract ܿ(Ljava/lang/Object;)V
.end method

.method public abstract ᩳ(Ljava/lang/Object;)I
.end method
