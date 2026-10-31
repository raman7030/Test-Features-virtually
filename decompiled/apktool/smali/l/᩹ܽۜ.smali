.class public final Ll/᩹ܽۜ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:Ll/ܺᩳۜ;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ll/ᩴܽۜ;


# direct methods
.method public constructor <init>(Ll/ᩴܽۜ;)V
    .locals 6

    .line 885
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 880
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩹ܽۜ;->ۧ:Ljava/util/HashMap;

    .line 886
    iput-object p1, p0, Ll/᩹ܽۜ;->ܽ:Ll/ᩴܽۜ;

    .line 887
    iget-object p1, p1, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    invoke-static {p1}, Ll/ܰᩳۜ;->֫(Ll/ܳܳܽ;)Ll/ܺᩳۜ;

    move-result-object v1

    iput-object v1, p0, Ll/᩹ܽۜ;->֫:Ll/ܺᩳۜ;

    .line 888
    invoke-virtual {p1}, Ll/ܳܳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object p1

    .line 986
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ܽ;

    .line 987
    invoke-interface {v1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const-string v2, "android"

    .line 989
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/16 v3, 0x7f

    if-eq v1, v3, :cond_0

    .line 991
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v4, v2, v5

    const-string v4, "app%02x"

    invoke-static {v3, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 1017
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    if-eq p1, v1, :cond_1

    .line 1018
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 1019
    :cond_1
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡᩻ܽ;

    .line 1020
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1021
    new-instance v2, Ll/ۛۤᩳ;

    const/4 v4, 0x4

    invoke-direct {v2, v4, p3}, Ll/ۛۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v2}, Ll/֡᩻ܽ;->֫(Ll/ܶ᩻ܽ;)I

    move-result v2

    if-eq v2, v1, :cond_0

    .line 1023
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result p0

    shl-int/lit8 p0, p0, 0x18

    invoke-interface {v3}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result p1

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    or-int/2addr p0, v2

    return p0

    :cond_3
    return v1
.end method

.method public static ֫(ILl/ۢ᩻ܽ;)Ljava/lang/String;
    .locals 6

    ushr-int/lit8 v0, p0, 0x18

    and-int/lit16 v0, v0, 0xff

    ushr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 1000
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘ᩻ܽ;

    .line 1001
    invoke-interface {v3}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v4

    if-eq v4, v0, :cond_1

    goto :goto_0

    .line 1004
    :cond_1
    invoke-interface {v3}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡᩻ܽ;

    .line 1005
    invoke-interface {v4}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v5

    if-ne v5, v1, :cond_2

    .line 1006
    invoke-interface {v4}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۖᩳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 1010
    invoke-static {p1}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 1011
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/᩹ܽۜ;->֫(ILl/ۢ᩻ܽ;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫(ILjava/lang/String;)I
    .locals 6

    const-string v0, ":"

    const/4 v1, 0x2

    .line 957
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 958
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v1, :cond_0

    .line 959
    aget-object p2, v0, v3

    .line 960
    aget-object v0, v0, v4

    move-object v5, v0

    move-object v0, p2

    move-object p2, v5

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x2f

    .line 962
    invoke-virtual {p2, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    goto :goto_1

    .line 966
    :cond_1
    invoke-virtual {p2, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/2addr v1, v4

    .line 967
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    if-eqz v0, :cond_3

    .line 970
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    .line 973
    :cond_2
    invoke-virtual {p0, v0}, Ll/᩹ܽۜ;->֫(Ljava/lang/String;)I

    move-result p1

    if-ne p1, v2, :cond_3

    :goto_1
    return v2

    .line 978
    :cond_3
    :goto_2
    invoke-virtual {p0}, Ll/᩹ܽۜ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    invoke-static {v0, p1, v3, p2}, Ll/᩹ܽۜ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-ne v0, v2, :cond_4

    if-ne p1, v4, :cond_4

    .line 980
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v0

    invoke-static {v0, p1, v3, p2}, Ll/᩹ܽۜ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_4
    return v0
.end method

.method public final ֫(Ljava/lang/String;)I
    .locals 3

    const/4 v0, -0x1

    .line 947
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Ll/᩹ܽۜ;->ۧ:Ljava/util/HashMap;

    invoke-static {v2, p1, v1}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_0

    const-string v0, "android"

    .line 948
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 1

    .line 943
    invoke-virtual {p0}, Ll/᩹ܽۜ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    invoke-static {p1, v0}, Ll/᩹ܽۜ;->֫(ILl/ۢ᩻ܽ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 896
    iget-object v0, p0, Ll/᩹ܽۜ;->ܽ:Ll/ᩴܽۜ;

    iget-object v0, v0, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ܿᩳܽ;
    .locals 1

    .line 900
    iget-object v0, p0, Ll/᩹ܽۜ;->ܽ:Ll/ᩴܽۜ;

    iget-object v0, v0, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->ۧ()Ll/ܿᩳܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(ILjava/lang/String;)Ll/᩶ܽۜ;
    .locals 7

    .line 908
    invoke-virtual {p0}, Ll/᩹ܽۜ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    invoke-static {v0, p1, p2}, Ll/ۡᩳۜ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;)Ll/ۜ᩻ܽ;

    move-result-object v4

    const/4 v0, 0x0

    if-eqz v4, :cond_3

    const v1, 0xffff

    and-int/2addr v1, p1

    .line 909
    invoke-interface {v4, v1}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    .line 912
    :cond_0
    invoke-interface {v4, v1}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_2

    .line 916
    :cond_1
    iget-object v3, p0, Ll/᩹ܽۜ;->ܽ:Ll/ᩴܽۜ;

    iget-object v5, v3, Ll/ᩴܽۜ;->֫:Ll/᩺᩻ܽ;

    invoke-static {v5, p1, p2}, Ll/ۡᩳۜ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;)Ll/ۜ᩻ܽ;

    move-result-object v5

    if-nez v5, :cond_2

    :goto_0
    move-object v5, v0

    goto :goto_1

    .line 917
    :cond_2
    invoke-interface {v5, v1}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v0

    goto :goto_0

    .line 918
    :goto_1
    new-instance v0, Ll/᩶ܽۜ;

    .line 919
    invoke-static {v3, v4, v2}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Ll/᩷᩻ܽ;

    move-result-object v6

    move-object v1, v0

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Ll/᩶ܽۜ;-><init>(ILjava/lang/String;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;Ll/᩷᩻ܽ;)V

    :cond_3
    :goto_2
    return-object v0
.end method

.method public final ܽ()Ll/ܺᩳۜ;
    .locals 1

    .line 892
    iget-object v0, p0, Ll/᩹ܽۜ;->֫:Ll/ܺᩳۜ;

    return-object v0
.end method
