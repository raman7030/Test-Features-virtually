.class public final Ll/ᩳ۫ۢ;
.super Ljava/lang/Object;
.source "Q6Q0"


# instance fields
.field public final ֫:[B


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    add-int/lit8 p1, p1, 0x1

    .line 16
    new-array p1, p1, [B

    iput-object p1, p0, Ll/ᩳ۫ۢ;->֫:[B

    const/4 v0, 0x5

    .line 18
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([BB)V

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)Z
    .locals 3

    .line 22
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳ֡;

    .line 23
    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/16 v2, 0x2c

    if-eq v1, v2, :cond_1

    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v0

    const/16 v1, 0x28

    if-ne v0, v1, :cond_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ᩳ۫ۢ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ۫ۢ;->֫:[B

    return-object p0
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ᩳ۫ۢ;->֫:[B

    aget-byte p1, v0, p1

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ᩳ۫ۢ;Ljava/util/ArrayList;)Z
    .locals 3

    .line 104
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳ֡;

    .line 105
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 106
    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/16 v2, 0x2c

    if-eq v1, v2, :cond_1

    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/16 v2, 0x28

    if-ne v1, v2, :cond_0

    .line 107
    :cond_1
    invoke-interface {v0}, Ll/֡ܳ֡;->ᩳ()I

    move-result v0

    .line 108
    iget-object v1, p0, Ll/ᩳ۫ۢ;->֫:[B

    aget-byte v1, v1, v0

    iget-object v2, p1, Ll/ᩳ۫ۢ;->֫:[B

    aget-byte v0, v2, v0

    if-eq v1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 100
    iget-object v0, p0, Ll/ᩳ۫ۢ;->֫:[B

    aget-byte p1, v0, p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(I)Z
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ᩳ۫ۢ;->֫:[B

    aget-byte p1, v0, p1

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
