.class public final Ll/ᩳ᩺֫;
.super Ll/ۘܽۧ;
.source "07NF"


# instance fields
.field public final ֫֫:Ljava/util/Map;

.field public ۟:Ll/᩵ᩴ֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/᩸ܿۧ;Ll/ۙۛ֫;Ll/ܶۛ֫;Ljava/util/Map;)V
    .locals 0

    .line 1762
    invoke-direct {p0, p1, p2, p3}, Ll/ۘܽۧ;-><init>(Ll/᩸ܿۧ;Ll/ۙۛ֫;Ll/ܶۛ֫;)V

    .line 1763
    iput-object p4, p0, Ll/ᩳ᩺֫;->֫֫:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵ᩴ֫;)V
    .locals 0

    .line 1782
    iput-object p1, p0, Ll/ᩳ᩺֫;->۟:Ll/᩵ᩴ֫;

    .line 1783
    invoke-virtual {p0}, Ll/ۘܽۧ;->᩷()V

    return-void
.end method

.method public final ۧ(Ll/۠ᩴ֫;)Ll/۠ᩴ֫;
    .locals 9

    .line 1790
    iget-object v0, p0, Ll/ᩳ᩺֫;->۟:Ll/᩵ᩴ֫;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Ll/۠ᩴ֫;->ۘ:Ll/᩵ᩴ֫;

    :goto_0
    if-eqz v0, :cond_1

    .line 1793
    iget-object v1, p0, Ll/ᩳ᩺֫;->֫֫:Ljava/util/Map;

    iget-object v2, v0, Ll/᩵ᩴ֫;->ۙ:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ᩴ֫;

    if-eqz v1, :cond_1

    move-object v0, v1

    .line 1798
    :cond_1
    iget-object v1, p1, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    goto :goto_3

    .line 1814
    :cond_2
    invoke-virtual {v1}, Ll/᩻᩵֫;->֫()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    const/4 v6, -0x1

    if-ge v5, v3, :cond_4

    .line 1817
    invoke-virtual {v1, v5}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v7

    .line 1818
    instance-of v8, v7, Ll/ۢܺۧ;

    if-eqz v8, :cond_3

    .line 1819
    check-cast v7, Ll/ۢܺۧ;

    const-string v8, "com.apple.streaming.transportStreamTimestamp"

    .line 1820
    iget-object v7, v7, Ll/ۢܺۧ;->ۧ:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    const/4 v5, -0x1

    :goto_2
    if-ne v5, v6, :cond_5

    goto :goto_6

    :cond_5
    const/4 v6, 0x1

    if-ne v3, v6, :cond_6

    :goto_3
    move-object v1, v2

    goto :goto_6

    :cond_6
    add-int/lit8 v2, v3, -0x1

    .line 1832
    new-array v2, v2, [Ll/ܳ᩵֫;

    :goto_4
    if-ge v4, v3, :cond_9

    if-eq v4, v5, :cond_8

    if-ge v4, v5, :cond_7

    move v6, v4

    goto :goto_5

    :cond_7
    add-int/lit8 v6, v4, -0x1

    .line 1836
    :goto_5
    invoke-virtual {v1, v4}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v7

    aput-object v7, v2, v6

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 1839
    :cond_9
    new-instance v1, Ll/᩻᩵֫;

    invoke-direct {v1, v2}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    .line 1799
    :goto_6
    iget-object v2, p1, Ll/۠ᩴ֫;->ۘ:Ll/᩵ᩴ֫;

    if-ne v0, v2, :cond_a

    iget-object v2, p1, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    if-eq v1, v2, :cond_b

    .line 1800
    :cond_a
    invoke-virtual {p1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֨ᩴ֫;->֫(Ll/᩵ᩴ֫;)V

    invoke-virtual {p1, v1}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    invoke-virtual {p1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    .line 1802
    :cond_b
    invoke-super {p0, p1}, Ll/ۘܽۧ;->ۧ(Ll/۠ᩴ֫;)Ll/۠ᩴ֫;

    move-result-object p1

    return-object p1
.end method
