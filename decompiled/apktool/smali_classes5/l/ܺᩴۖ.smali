.class public final Ll/ܺᩴۖ;
.super Ll/ۛۖۖ;
.source "X93U"


# instance fields
.field public ֫:Ll/ۤۘۖ;

.field public final ۧ:Ljava/lang/reflect/Method;

.field public final ܳ:Ljava/lang/Class;

.field public final ܽ:Ljava/lang/reflect/Method;

.field public final ܿ:Ll/᩻֡ۖ;

.field public final ᩳ:Ll/ۤۖۖ;


# direct methods
.method public constructor <init>(Ll/ܶۘۖ;Ljava/lang/Class;Ll/᩻֡ۖ;Ll/ۤۖۖ;)V
    .locals 1

    .line 1703
    invoke-direct {p0}, Ll/ۛۖۖ;-><init>()V

    .line 1704
    const-class v0, Ll/᩻֡ۖ;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1705
    invoke-virtual {p2, p3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1706
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 1707
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Bad messageDefaultInstance for "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1709
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ܺᩴۖ;->֫:Ll/ۤۘۖ;

    .line 1710
    iput-object p2, p0, Ll/ܺᩴۖ;->ܳ:Ljava/lang/Class;

    .line 1711
    iput-object p3, p0, Ll/ܺᩴۖ;->ܿ:Ll/᩻֡ۖ;

    .line 1713
    const-class p1, Ll/ܰ֡ۖ;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Class;

    .line 1714
    const-class p3, Ll/ۖۖۖ;

    const/4 v0, 0x0

    aput-object p3, p1, v0

    const-string p3, "valueOf"

    invoke-static {p2, p3, p1}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ܺᩴۖ;->ܽ:Ljava/lang/reflect/Method;

    const-string p1, "getValueDescriptor"

    new-array p3, v0, [Ljava/lang/Class;

    .line 1715
    invoke-static {p2, p1, p3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ܺᩴۖ;->ۧ:Ljava/lang/reflect/Method;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 1717
    iput-object p1, p0, Ll/ܺᩴۖ;->ܽ:Ljava/lang/reflect/Method;

    .line 1718
    iput-object p1, p0, Ll/ܺᩴۖ;->ۧ:Ljava/lang/reflect/Method;

    .line 1720
    :goto_1
    iput-object p4, p0, Ll/ܺᩴۖ;->ᩳ:Ll/ۤۖۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1773
    invoke-virtual {p0}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v0

    .line 1774
    invoke-virtual {v0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1775
    invoke-virtual {v0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v1

    sget-object v2, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-eq v1, v2, :cond_1

    .line 1776
    invoke-virtual {v0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->۬:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    .line 1778
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1779
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1780
    invoke-virtual {p0, v1}, Ll/ܺᩴۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0

    .line 1787
    :cond_3
    invoke-virtual {p0, p1}, Ll/ܺᩴۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܳ᩵ۖ;)Ljava/lang/Object;
    .locals 7

    .line 1819
    invoke-virtual {p0}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v0

    .line 1820
    invoke-virtual {v0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ܺᩴۖ;->ۧ:Ljava/lang/reflect/Method;

    const/4 v4, 0x2

    if-eqz v1, :cond_2

    .line 1821
    invoke-virtual {v0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->۬:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_3

    .line 1823
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1824
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1842
    invoke-virtual {p0}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v5

    .line 1843
    sget-object v6, Ll/᩸ۘۖ;->֫:[I

    invoke-virtual {v5}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    if-eq v5, v4, :cond_0

    goto :goto_1

    :cond_0
    new-array v5, v2, [Ljava/lang/Object;

    .line 1845
    invoke-static {v3, v1, v5}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1825
    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    .line 1842
    :cond_2
    invoke-virtual {p0}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v0

    .line 1843
    sget-object v1, Ll/᩸ۘۖ;->֫:[I

    invoke-virtual {v0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v4, :cond_4

    :cond_3
    return-object p1

    :cond_4
    new-array v0, v2, [Ljava/lang/Object;

    .line 1845
    invoke-static {v3, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֡ۖۖ;)V
    .locals 1

    .line 1725
    iget-object v0, p0, Ll/ܺᩴۖ;->֫:Ll/ۤۘۖ;

    if-nez v0, :cond_0

    .line 1728
    new-instance v0, Ll/ۡᩴۖ;

    invoke-direct {v0, p1}, Ll/ۡᩴۖ;-><init>(Ll/֡ۖۖ;)V

    iput-object v0, p0, Ll/ܺᩴۖ;->֫:Ll/ۤۘۖ;

    return-void

    .line 1726
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already initialized."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1797
    invoke-virtual {p0}, Ll/ܺᩴۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v0

    .line 1798
    sget-object v1, Ll/᩸ۘۖ;->֫:[I

    invoke-virtual {v0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 1806
    iget-object p1, p0, Ll/ܺᩴۖ;->ܽ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1800
    :cond_1
    iget-object v0, p0, Ll/ܺᩴۖ;->ܳ:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return-object p1

    .line 1803
    :cond_2
    iget-object v0, p0, Ll/ܺᩴۖ;->ܿ:Ll/᩻֡ۖ;

    invoke-interface {v0}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object v0

    check-cast p1, Ll/᩻֡ۖ;

    invoke-interface {v0, p1}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p1

    invoke-interface {p1}, Ll/ܳ֡ۖ;->build()Ll/᩻֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/֡ۖۖ;
    .locals 2

    .line 1746
    iget-object v0, p0, Ll/ܺᩴۖ;->֫:Ll/ۤۘۖ;

    if-eqz v0, :cond_0

    .line 1749
    invoke-interface {v0}, Ll/ۤۘۖ;->᩻()Ll/֡ۖۖ;

    move-result-object v0

    return-object v0

    .line 1747
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getDescriptor() called before internalInit()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()Ll/᩻֡ۖ;
    .locals 1

    .line 1758
    iget-object v0, p0, Ll/ܺᩴۖ;->ܿ:Ll/᩻֡ۖ;

    return-object v0
.end method

.method public final ᩳ()Ll/ۤۖۖ;
    .locals 1

    .line 1763
    iget-object v0, p0, Ll/ܺᩴۖ;->ᩳ:Ll/ۤۖۖ;

    return-object v0
.end method
