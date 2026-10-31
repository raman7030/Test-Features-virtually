.class public final Ll/۟ۘۖ;
.super Ll/ۧᩴۖ;
.source "X93U"


# instance fields
.field public ۜ:Ljava/lang/reflect/Method;

.field public final ۢ:Ljava/lang/reflect/Method;

.field public ܳ:Ljava/lang/reflect/Method;

.field public ܽ:Ljava/lang/reflect/Method;

.field public ܿ:Ljava/lang/reflect/Method;

.field public final ᩳ:Ll/ۢۖۖ;

.field public final ᩷:Z

.field public final ᩻:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 6

    .line 2881
    invoke-direct {p0, p3, p4, p2}, Ll/ۧᩴۖ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 2883
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۚ()Ll/ۢۖۖ;

    move-result-object v0

    iput-object v0, p0, Ll/۟ۘۖ;->ᩳ:Ll/ۢۖۖ;

    .line 2885
    iget-object v0, p0, Ll/ۧᩴۖ;->ۧ:Ljava/lang/Class;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Ll/ۖۖۖ;

    aput-object v4, v2, v3

    const-string v4, "valueOf"

    invoke-static {v0, v4, v2}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Ll/۟ۘۖ;->ۢ:Ljava/lang/reflect/Method;

    .line 2886
    iget-object v0, p0, Ll/ۧᩴۖ;->ۧ:Ljava/lang/Class;

    const-string v2, "getValueDescriptor"

    new-array v4, v3, [Ljava/lang/Class;

    invoke-static {v0, v2, v4}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Ll/۟ۘۖ;->᩻:Ljava/lang/reflect/Method;

    .line 2888
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۨ()Z

    move-result p1

    xor-int/lit8 v0, p1, 0x1

    iput-boolean v0, p0, Ll/۟ۘۖ;->᩷:Z

    if-nez p1, :cond_0

    const-string p1, "get"

    const-string v0, "Value"

    .line 0
    invoke-static {p1, p2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v4, v1, [Ljava/lang/Class;

    .line 2890
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v3

    .line 2891
    invoke-static {p3, v2, v4}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    iput-object p3, p0, Ll/۟ۘۖ;->ܿ:Ljava/lang/reflect/Method;

    .line 0
    invoke-static {p1, p2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p3, v1, [Ljava/lang/Class;

    aput-object v5, p3, v3

    .line 2893
    invoke-static {p4, p1, p3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/۟ۘۖ;->ܳ:Ljava/lang/reflect/Method;

    const-string p1, "set"

    .line 0
    invoke-static {p1, p2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Class;

    aput-object v5, p3, v3

    aput-object v5, p3, v1

    .line 2895
    invoke-static {p4, p1, p3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/۟ۘۖ;->ۜ:Ljava/lang/reflect/Method;

    const-string p1, "add"

    .line 0
    invoke-static {p1, p2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Class;

    aput-object v5, p2, v3

    .line 2897
    invoke-static {p4, p1, p2}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/۟ۘۖ;->ܽ:Ljava/lang/reflect/Method;

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۘᩴۖ;)Ljava/lang/Object;
    .locals 2

    .line 2935
    iget-boolean v0, p0, Ll/۟ۘۖ;->᩷:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2936
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    iget-object p1, p0, Ll/۟ۘۖ;->ܿ:Ljava/lang/reflect/Method;

    invoke-static {p1, p2, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 2937
    iget-object p2, p0, Ll/۟ۘۖ;->ᩳ:Ll/ۢۖۖ;

    invoke-virtual {p2, p1}, Ll/ۢۖۖ;->ۧ(I)Ll/ۖۖۖ;

    move-result-object p1

    return-object p1

    .line 2619
    :cond_0
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1, p2}, Ll/֫ᩴۖ;->֫(ILl/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    .line 2939
    iget-object v0, p0, Ll/۟ۘۖ;->᩻:Ljava/lang/reflect/Method;

    invoke-static {v0, p1, p2}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 4

    .line 2915
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2649
    iget-object v1, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v1, p1}, Ll/֫ᩴۖ;->ۧ(Ll/ۘᩴۖ;)I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 2918
    invoke-virtual {p0, v2, p1}, Ll/۟ۘۖ;->֫(ILl/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2920
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V
    .locals 3

    .line 2953
    iget-boolean v0, p0, Ll/۟ۘۖ;->᩷:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2959
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p3, Ll/ۖۖۖ;

    .line 2960
    invoke-virtual {p3}, Ll/ۖۖۖ;->getNumber()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p2, v0, v2

    aput-object p3, v0, v1

    .line 2956
    iget-object p2, p0, Ll/۟ۘۖ;->ۜ:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    aput-object p3, v0, v2

    .line 2963
    iget-object p3, p0, Ll/۟ۘۖ;->ۢ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    invoke-static {p3, v1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-super {p0, p1, p2, p3}, Ll/ۧᩴۖ;->֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;
    .locals 4

    .line 2925
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2654
    iget-object v1, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v1, p1}, Ll/֫ᩴۖ;->ܽ(Ll/᩶ۘۖ;)I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 2928
    invoke-virtual {p0, p1, v2}, Ll/۟ۘۖ;->ۧ(Ll/᩶ۘۖ;I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2930
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/᩶ۘۖ;I)Ljava/lang/Object;
    .locals 2

    .line 2944
    iget-boolean v0, p0, Ll/۟ۘۖ;->᩷:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2945
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p2, v0, v1

    iget-object p2, p0, Ll/۟ۘۖ;->ܳ:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 2946
    iget-object p2, p0, Ll/۟ۘۖ;->ᩳ:Ll/ۢۖۖ;

    invoke-virtual {p2, p1}, Ll/ۢۖۖ;->ۧ(I)Ll/ۖۖۖ;

    move-result-object p1

    return-object p1

    .line 2624
    :cond_0
    iget-object v0, p0, Ll/ۧᩴۖ;->֫:Ll/֫ᩴۖ;

    invoke-virtual {v0, p1, p2}, Ll/֫ᩴۖ;->֫(Ll/᩶ۘۖ;I)Ljava/lang/Object;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    .line 2948
    iget-object v0, p0, Ll/۟ۘۖ;->᩻:Ljava/lang/reflect/Method;

    invoke-static {v0, p1, p2}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 3

    .line 2968
    iget-boolean v0, p0, Ll/۟ۘۖ;->᩷:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 2970
    check-cast p2, Ll/ۖۖۖ;

    .line 2972
    invoke-virtual {p2}, Ll/ۖۖۖ;->getNumber()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p2, v0, v1

    .line 2971
    iget-object p2, p0, Ll/۟ۘۖ;->ܽ:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p2, v0, v1

    .line 2975
    iget-object p2, p0, Ll/۟ۘۖ;->ۢ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-super {p0, p1, p2}, Ll/ۧᩴۖ;->ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    return-void
.end method
