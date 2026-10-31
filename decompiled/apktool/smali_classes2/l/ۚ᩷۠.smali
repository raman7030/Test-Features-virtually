.class public final Ll/ۚ᩷۠;
.super Ljava/lang/Object;
.source "24FJ"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ۗ:I

.field public ۙ:[Ll/ۙ֨֨;

.field public final synthetic ۬:Ll/֨᩷۠;

.field public ᩶:I

.field public ᩸:Ll/۠֨۠;

.field public ᩹:[I


# direct methods
.method public constructor <init>(Ll/֨᩷۠;)V
    .locals 1

    .line 1666
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩷۠;->۬:Ll/֨᩷۠;

    .line 1667
    new-instance p1, Ll/۠֨۠;

    const/4 v0, 0x0

    .line 100
    invoke-direct {p1, v0}, Ll/۠֨۠;-><init>(Z)V

    .line 1667
    iput-object p1, p0, Ll/ۚ᩷۠;->᩸:Ll/۠֨۠;

    const/16 p1, 0x10

    new-array p1, p1, [Ll/ۙ֨֨;

    .line 1668
    iput-object p1, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۚ᩷۠;
    .locals 4

    const-string v0, "duping state "

    .line 1673
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ᩷۠;

    .line 1674
    new-instance v2, Ll/۠֨۠;

    iget-object v3, p0, Ll/ۚ᩷۠;->᩸:Ll/۠֨۠;

    invoke-direct {v2, v3}, Ll/۠֨۠;-><init>(Ll/۠֨۠;)V

    iput-object v2, v1, Ll/ۚ᩷۠;->᩸:Ll/۠֨۠;

    .line 1675
    iget-object v2, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    invoke-virtual {v2}, [Ll/ۙ֨֨;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ۙ֨֨;

    iput-object v2, v1, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    .line 1676
    iget-object v2, p0, Ll/ۚ᩷۠;->᩹:[I

    if-eqz v2, :cond_0

    invoke-virtual {v2}, [I->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    iput-object v2, v1, Ll/ۚ᩷۠;->᩹:[I

    .line 1677
    :cond_0
    iget-object v2, p0, Ll/ۚ᩷۠;->۬:Ll/֨᩷۠;

    iget-boolean v2, v2, Ll/֨᩷۠;->ܳ:Z

    if-eqz v2, :cond_1

    .line 1678
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, -0x1

    .line 1826
    invoke-virtual {p0, v0}, Ll/ۚ᩷۠;->֫(I)V
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object v1

    :catch_0
    move-exception v0

    .line 1683
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final ֫(I)V
    .locals 9

    .line 1830
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stackMap for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩷۠;->۬:Ll/֨᩷۠;

    iget-object v3, v2, Ll/֨᩷۠;->֨:Ll/ۘ֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v2, Ll/֨᩷۠;->֨:Ll/ۘ֡֨;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 1832
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1}, Ljava/io/PrintStream;->println()V

    goto :goto_0

    .line 1834
    :cond_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, " at "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1835
    :goto_0
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v0, " stack (from bottom):"

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 1836
    :goto_1
    iget v1, p0, Ll/ۚ᩷۠;->ۗ:I

    const-string v3, ": "

    const-string v4, "  "

    if-ge v0, v1, :cond_1

    .line 1837
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 0
    invoke-static {v0, v4, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 1837
    iget-object v4, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    aget-object v4, v4, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1840
    :cond_1
    iget v0, v2, Ll/֨᩷۠;->֡:I

    :cond_2
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_3

    .line 1841
    iget-object v1, p0, Ll/ۚ᩷۠;->᩸:Ll/۠֨۠;

    invoke-virtual {v1, v0}, Ll/۠֨۠;->ᩳ(I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-ltz v0, :cond_4

    .line 1847
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v5, " locals:"

    invoke-virtual {v1, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_4
    const/4 v1, 0x0

    :goto_3
    if-gt v1, v0, :cond_8

    .line 1849
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 1850
    iget-object v5, p0, Ll/ۚ᩷۠;->᩸:Ll/۠֨۠;

    invoke-virtual {v5, v1}, Ll/۠֨۠;->ᩳ(I)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 1851
    iget-object v5, v2, Ll/֨᩷۠;->᩵:[Ll/ܺ᩷۠;

    aget-object v5, v5, v1

    if-nez v5, :cond_5

    .line 1853
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v6, "(none)"

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_4

    .line 1852
    :cond_5
    iget-object v5, v5, Ll/ܺ᩷۠;->ܽ:Ll/۫֡֨;

    if-nez v5, :cond_6

    .line 1855
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v6, "UNKNOWN!"

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_4

    .line 1857
    :cond_6
    sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, ""

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " of type "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v2, Ll/֨᩷۠;->᩺:Ll/ۛ᩸֨;

    .line 1858
    invoke-virtual {v5, v8}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1857
    invoke-virtual {v6, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_4

    .line 1860
    :cond_7
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v6, "undefined"

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 1863
    :cond_8
    iget v0, p0, Ll/ۚ᩷۠;->᩶:I

    if-eqz v0, :cond_a

    .line 1864
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, " locks:"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 1865
    :goto_5
    iget v0, p0, Ll/ۚ᩷۠;->᩶:I

    if-ge p1, v0, :cond_9

    .line 1866
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ᩷۠;->᩹:[I

    aget v2, v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    .line 1868
    :cond_9
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p1}, Ljava/io/PrintStream;->println()V

    :cond_a
    return-void
.end method

.method public final ֫(Ll/ۙ֨֨;)V
    .locals 5

    .line 1770
    iget-object v0, p0, Ll/ۚ᩷۠;->۬:Ll/֨᩷۠;

    iget-object v1, v0, Ll/֨᩷۠;->᩺:Ll/ۛ᩸֨;

    invoke-static {v0}, Ll/֨᩷۠;->֫(Ll/֨᩷۠;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1771
    :cond_0
    sget-object v0, Ll/᩷᩷۠;->֫:[I

    invoke-virtual {p1}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/16 v2, 0xa

    if-eq v0, v2, :cond_1

    const/16 v2, 0xb

    if-eq v0, v2, :cond_1

    :goto_0
    return-void

    .line 1774
    :cond_1
    invoke-static {p1}, Ll/֨᩷۠;->ۧ(Ll/ۙ֨֨;)I

    move-result v0

    .line 1775
    iget-object v2, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    iget v3, p0, Ll/ۚ᩷۠;->ۗ:I

    sub-int/2addr v3, v0

    aget-object v2, v2, v3

    .line 1776
    invoke-virtual {v1, v2}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    .line 1777
    invoke-virtual {v1, p1}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    const/4 v4, 0x1

    .line 1071
    invoke-virtual {v1, v2, v3, v4}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v1

    .line 1776
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    .line 1778
    iget-object v1, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    iget v2, p0, Ll/ۚ᩷۠;->ۗ:I

    sub-int/2addr v2, v0

    aput-object p1, v1, v2

    return-void
.end method

.method public final ۧ(Ll/ۙ֨֨;)V
    .locals 6

    .line 1704
    iget-object v0, p0, Ll/ۚ᩷۠;->۬:Ll/֨᩷۠;

    iget-boolean v1, v0, Ll/֨᩷۠;->ܳ:Z

    if-eqz v1, :cond_0

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "   pushing "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1705
    :cond_0
    sget-object v1, Ll/᩷᩷۠;->֫:[I

    invoke-virtual {p1}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_1

    const/4 v4, 0x3

    if-eq v1, v4, :cond_1

    const/16 v4, 0x8

    if-eq v1, v4, :cond_1

    const/16 v4, 0x9

    if-eq v1, v4, :cond_4

    goto :goto_0

    .line 1712
    :cond_1
    iget-object p1, v0, Ll/֨᩷۠;->ۨ:Ll/᩷ۚ֨;

    iget-object p1, p1, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 1717
    :goto_0
    iget-object v1, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    iget v4, p0, Ll/ۚ᩷۠;->ۗ:I

    add-int/2addr v4, v2

    invoke-static {v4, v1}, Ll/ۛ᩸ۘ;->֫(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ۙ֨֨;

    iput-object v1, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    .line 1718
    iget v4, p0, Ll/ۚ᩷۠;->ۗ:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Ll/ۚ᩷۠;->ۗ:I

    aput-object p1, v1, v4

    .line 1719
    invoke-static {p1}, Ll/֨᩷۠;->ۧ(Ll/ۙ֨֨;)I

    move-result v1

    if-eq v1, v3, :cond_3

    if-ne v1, v2, :cond_2

    .line 1723
    iget-object p1, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    iget v1, p0, Ll/ۚ᩷۠;->ۗ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۚ᩷۠;->ۗ:I

    const/4 v2, 0x0

    aput-object v2, p1, v1

    goto :goto_1

    .line 1726
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 1728
    :cond_3
    :goto_1
    iget p1, p0, Ll/ۚ᩷۠;->ۗ:I

    iget v1, v0, Ll/֨᩷۠;->ۚ:I

    if-le p1, v1, :cond_4

    .line 1729
    iput p1, v0, Ll/֨᩷۠;->ۚ:I

    :cond_4
    return-void
.end method

.method public final ܽ()Ll/ۙ֨֨;
    .locals 5

    .line 1733
    iget-object v0, p0, Ll/ۚ᩷۠;->۬:Ll/֨᩷۠;

    iget-boolean v0, v0, Ll/֨᩷۠;->ܳ:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "   popping 1"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1734
    :cond_0
    iget v0, p0, Ll/ۚ᩷۠;->ۗ:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ۚ᩷۠;->ۗ:I

    .line 1735
    iget-object v2, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    aget-object v3, v2, v0

    const/4 v4, 0x0

    .line 1736
    aput-object v4, v2, v0

    if-eqz v3, :cond_1

    .line 1737
    invoke-static {v3}, Ll/֨᩷۠;->ۧ(Ll/ۙ֨֨;)I

    move-result v0

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    return-object v3
.end method

.method public final ܽ(I)V
    .locals 3

    .line 1756
    iget-object v0, p0, Ll/ۚ᩷۠;->۬:Ll/֨᩷۠;

    iget-boolean v0, v0, Ll/֨᩷۠;->ܳ:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "   popping "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    :goto_0
    if-lez p1, :cond_1

    .line 1758
    iget-object v0, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    iget v1, p0, Ll/ۚ᩷۠;->ۗ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۚ᩷۠;->ۗ:I

    const/4 v2, 0x0

    aput-object v2, v0, v1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ᩳ()Ll/ۙ֨֨;
    .locals 5

    .line 1746
    iget-object v0, p0, Ll/ۚ᩷۠;->۬:Ll/֨᩷۠;

    iget-boolean v0, v0, Ll/֨᩷۠;->ܳ:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "   popping 2"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1747
    :cond_0
    iget v0, p0, Ll/ۚ᩷۠;->ۗ:I

    add-int/lit8 v1, v0, -0x2

    iput v1, p0, Ll/ۚ᩷۠;->ۗ:I

    .line 1748
    iget-object v2, p0, Ll/ۚ᩷۠;->ۙ:[Ll/ۙ֨֨;

    aget-object v3, v2, v1

    const/4 v4, 0x0

    .line 1749
    aput-object v4, v2, v1

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    .line 1750
    aget-object v0, v2, v0

    if-nez v0, :cond_1

    if-eqz v3, :cond_1

    .line 1751
    invoke-static {v3}, Ll/֨᩷۠;->ۧ(Ll/ۙ֨֨;)I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 1750
    :goto_0
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    return-object v3
.end method
