.class public final Ll/ܶ᩹۠;
.super Ljava/lang/Object;
.source "A41J"


# static fields
.field public static final ֫:Ljava/util/Set;

.field public static final ۧ:Ljava/util/Set;

.field public static final ܳ:Ljava/util/Set;

.field public static final ܽ:Ljava/util/Set;

.field public static final ܿ:Ljava/util/Set;

.field public static final ᩳ:Ljava/util/Set;

.field public static final ᩻:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 67
    sget-object v0, Ll/᩺᩸۠;->ۗ:Ll/᩺᩸۠;

    .line 68
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ܶ᩹۠;->֫:Ljava/util/Set;

    .line 70
    sget-object v0, Ll/᩺᩸۠;->ۛ:Ll/᩺᩸۠;

    sget-object v1, Ll/᩺᩸۠;->۫:Ll/᩺᩸۠;

    .line 71
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ܶ᩹۠;->ۧ:Ljava/util/Set;

    .line 73
    sget-object v0, Ll/᩺᩸۠;->۟:Ll/᩺᩸۠;

    .line 74
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ܶ᩹۠;->ܽ:Ljava/util/Set;

    .line 76
    sget-object v0, Ll/᩺᩸۠;->ܽ֫:Ll/᩺᩸۠;

    .line 77
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ܶ᩹۠;->ܿ:Ljava/util/Set;

    .line 79
    sget-object v0, Ll/᩺᩸۠;->֫֫:Ll/᩺᩸۠;

    .line 80
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ܶ᩹۠;->ᩳ:Ljava/util/Set;

    .line 83
    sget-object v0, Ll/᩺᩸۠;->ۙ:Ll/᩺᩸۠;

    sget-object v1, Ll/᩺᩸۠;->۬:Ll/᩺᩸۠;

    sget-object v2, Ll/᩺᩸۠;->᩺:Ll/᩺᩸۠;

    sget-object v3, Ll/᩺᩸۠;->ܿ֫:Ll/᩺᩸۠;

    sget-object v4, Ll/᩺᩸۠;->᩹:Ll/᩺᩸۠;

    .line 84
    invoke-static {v0, v1, v2, v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ܶ᩹۠;->᩻:Ljava/util/Set;

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    .line 0
    sget-object v2, Ll/᩺᩸۠;->ܳ֫:Ll/᩺᩸۠;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(I)V

    aget-object v0, v1, v3

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 92
    sput-object v0, Ll/ܶ᩹۠;->ܳ:Ljava/util/Set;

    return-void

    .line 0
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "duplicate element: "

    invoke-static {v0, v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/util/Set;)Ljava/util/ArrayList;
    .locals 3

    .line 228
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 229
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩸۠;

    .line 230
    invoke-interface {v1}, Ll/ۨ᩸۠;->֫()Ll/᩺᩸۠;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 231
    const-class v2, Ll/ܰ᩸۠;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩸۠;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 1

    .line 138
    sget-object v0, Ll/ܶ᩹۠;->֫:Ljava/util/Set;

    invoke-static {p0, v0}, Ll/ܶ᩹۠;->֫(Ljava/lang/Iterable;Ljava/util/Set;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 1

    .line 156
    sget-object v0, Ll/ܶ᩹۠;->ܽ:Ljava/util/Set;

    invoke-static {p0, v0}, Ll/ܶ᩹۠;->֫(Ljava/lang/Iterable;Ljava/util/Set;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method
