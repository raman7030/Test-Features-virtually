.class public final Ll/᩷ܶ֨;
.super Ll/۬᩸֨;
.source "X43L"


# instance fields
.field public ᩸:Ljava/util/HashSet;

.field public final synthetic ᩹:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1910
    iput-object p1, p0, Ll/᩷ܶ֨;->᩹:Ll/ۛ᩸֨;

    .line 1912
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/᩷ܶ֨;->᩸:Ljava/util/HashSet;

    return-void
.end method

.method private ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z
    .locals 4

    .line 1936
    new-instance v0, Ll/۠᩸֨;

    iget-object v1, p0, Ll/᩷ܶ֨;->᩹:Ll/ۛ᩸֨;

    invoke-direct {v0, p1, p2, v1}, Ll/۠᩸֨;-><init>(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ۛ᩸֨;)V

    .line 1937
    iget-object v2, p0, Ll/᩷ܶ֨;->᩸:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1939
    :try_start_0
    invoke-virtual {v1, p1, p2}, Ll/ۛ᩸֨;->᩻(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1941
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 1942
    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 1

    .line 1910
    check-cast p1, Ll/ۙ֨֨;

    .line 1916
    sget-object v0, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1917
    invoke-virtual {p0, p2, p1}, Ll/۠ܶ֨;->ۧ(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    .line 1919
    :cond_0
    invoke-direct {p0, p2, p1}, Ll/᩷ܶ֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, p1, p2}, Ll/᩷ܶ֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1910
    check-cast p2, Ll/ۙ֨֨;

    .line 1950
    invoke-virtual {p1}, Ll/᩶֨֨;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1951
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 1953
    :cond_0
    sget-object v0, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1954
    invoke-virtual {p1}, Ll/᩶֨֨;->ۜ֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1955
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    invoke-direct {p0, p2, p1}, Ll/᩷ܶ֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1957
    :cond_1
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    invoke-direct {p0, p1, p2}, Ll/᩷ܶ֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1960
    :cond_2
    invoke-virtual {p2}, Ll/ۙ֨֨;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1961
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 1963
    :cond_3
    invoke-virtual {p1}, Ll/᩶֨֨;->ۜ֫()Z

    move-result v0

    iget-object v1, p0, Ll/᩷ܶ֨;->᩹:Ll/ۛ᩸֨;

    if-eqz v0, :cond_6

    .line 1964
    invoke-virtual {p2}, Ll/ۙ֨֨;->ۜ֫()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1965
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->ۗ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 1923
    new-instance v0, Ll/۠᩸֨;

    invoke-direct {v0, p1, p2, v1}, Ll/۠᩸֨;-><init>(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ۛ᩸֨;)V

    .line 1924
    iget-object v2, p0, Ll/᩷ܶ֨;->᩸:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1632
    :try_start_0
    iget-object v3, v1, Ll/ۛ᩸֨;->ܿ֫:Ll/֨᩸۠;

    invoke-virtual {v1, p1, p2, v3}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1928
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 1929
    throw p1

    :cond_4
    const/4 p1, 0x1

    :goto_0
    xor-int/lit8 p1, p1, 0x1

    .line 1965
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1966
    :cond_5
    invoke-virtual {p2}, Ll/ۙ֨֨;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1967
    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->ۙ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    invoke-direct {p0, p2, p1}, Ll/᩷ܶ֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1968
    :cond_6
    invoke-virtual {p1}, Ll/᩶֨֨;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1969
    invoke-virtual {p2}, Ll/ۙ֨֨;->ۜ֫()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1970
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->ۗ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/᩷ܶ֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1972
    :cond_7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method
