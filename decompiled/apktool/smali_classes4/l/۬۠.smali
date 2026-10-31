.class public Ll/۬۠;
.super Ll/ܶ۠;
.source "W1DE"


# instance fields
.field public ܰ֫:I

.field public ᩺֫:[Ll/ܶ۠;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ll/ܶ۠;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ܶ۠;

    .line 14
    iput-object v0, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    const/4 v0, 0x0

    .line 15
    iput v0, p0, Ll/۬۠;->ܰ֫:I

    return-void
.end method


# virtual methods
.method public final ֫(ILl/֡ܶ;Ljava/util/ArrayList;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 58
    :goto_0
    iget v2, p0, Ll/۬۠;->ܰ֫:I

    if-ge v1, v2, :cond_0

    .line 59
    iget-object v2, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v2, v2, v1

    .line 60
    invoke-virtual {p2, v2}, Ll/֡ܶ;->֫(Ll/ܶ۠;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 62
    :cond_0
    :goto_1
    iget v1, p0, Ll/۬۠;->ܰ֫:I

    if-ge v0, v1, :cond_1

    .line 63
    iget-object v1, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v1, v1, v0

    .line 64
    invoke-static {v1, p1, p3, p2}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܶ۠;)V
    .locals 3

    if-eq p1, p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    iget v0, p0, Ll/۬۠;->ܰ֫:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    array-length v2, v1

    if-le v0, v2, :cond_1

    .line 32
    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܶ۠;

    iput-object v0, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    .line 34
    :cond_1
    iget-object v0, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    iget v1, p0, Ll/۬۠;->ܰ֫:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 35
    iput v1, p0, Ll/۬۠;->ܰ֫:I

    :cond_2
    :goto_0
    return-void
.end method

.method public ֫(Ll/ܶ۠;Ljava/util/HashMap;)V
    .locals 3

    .line 40
    invoke-super {p0, p1, p2}, Ll/ܶ۠;->֫(Ll/ܶ۠;Ljava/util/HashMap;)V

    .line 41
    check-cast p1, Ll/۬۠;

    const/4 v0, 0x0

    .line 42
    iput v0, p0, Ll/۬۠;->ܰ֫:I

    .line 43
    iget v1, p1, Ll/۬۠;->ܰ֫:I

    :goto_0
    if-ge v0, v1, :cond_0

    .line 45
    iget-object v2, p1, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v2, v2, v0

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ۠;

    invoke-virtual {p0, v2}, Ll/۬۠;->֫(Ll/ܶ۠;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 53
    iput v0, p0, Ll/۬۠;->ܰ֫:I

    .line 54
    iget-object v0, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ᩻֫()V
    .locals 0

    return-void
.end method
