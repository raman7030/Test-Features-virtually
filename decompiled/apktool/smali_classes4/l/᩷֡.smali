.class public abstract Ll/᩷֡;
.super Ljava/lang/Object;
.source "41BY"


# direct methods
.method public static ֫(I[D[[D)Ll/᩷֡;
    .locals 3

    .line 30
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v1, :cond_0

    const/4 p0, 0x2

    :cond_0
    if-eqz p0, :cond_2

    if-eq p0, v2, :cond_1

    .line 39
    new-instance p0, Ll/ܺ֡;

    invoke-direct {p0, p1, p2}, Ll/ܺ֡;-><init>([D[[D)V

    return-object p0

    .line 37
    :cond_1
    new-instance p0, Ll/ۜ֡;

    const/4 v0, 0x0

    aget-wide v1, p1, v0

    aget-object p1, p2, v0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-wide v1, p0, Ll/ۜ֡;->֫:D

    .line 65
    iput-object p1, p0, Ll/ۜ֡;->ۧ:[D

    return-object p0

    .line 35
    :cond_2
    new-instance p0, Ll/ۖ֡;

    invoke-direct {p0, p1, p2}, Ll/ۖ֡;-><init>([D[[D)V

    return-object p0
.end method

.method public static ֫([I[D[[D)Ll/᩷֡;
    .locals 1

    .line 44
    new-instance v0, Ll/᩻֡;

    invoke-direct {v0, p0, p1, p2}, Ll/᩻֡;-><init>([I[D[[D)V

    return-object v0
.end method


# virtual methods
.method public abstract ֫(D)D
.end method

.method public abstract ֫(D[D)V
.end method

.method public abstract ֫(D[F)V
.end method

.method public abstract ֫()[D
.end method

.method public abstract ۧ(D)D
.end method

.method public abstract ۧ(D[D)V
.end method
