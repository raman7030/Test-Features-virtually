.class public final Ll/۟ᩴ۠;
.super Ljava/lang/Object;
.source "Y7PB"


# static fields
.field public static final ۧ:Ll/ۙ֨۠;


# instance fields
.field public final ֫:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 111
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/۟ᩴ۠;->ۧ:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 5

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    sget-object v0, Ll/۟ᩴ۠;->ۧ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 141
    invoke-static {p1}, Ll/ۛ۠۠;->֫(Ll/ۗ֨۠;)Ll/ۛ۠۠;

    .line 143
    invoke-static {p1}, Ll/ۛۖ֨;->֫(Ll/ۗ֨۠;)V

    .line 144
    invoke-static {p1}, Ll/ܺۘ۠;->֫(Ll/ۗ֨۠;)Ll/ܺۘ۠;

    const/16 p1, 0x8

    new-array v0, p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "H1"

    aput-object v2, v0, v1

    const-string v2, "H2"

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const-string v2, "H3"

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const-string v2, "H4"

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const-string v2, "H5"

    const/4 v3, 0x4

    aput-object v2, v0, v3

    const-string v2, "H6"

    const/4 v3, 0x5

    aput-object v2, v0, v3

    const-string v2, "PRE"

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const-string v2, "P"

    const/4 v3, 0x7

    aput-object v2, v0, v3

    .line 0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, p1}, Ljava/util/HashSet;-><init>(I)V

    :goto_0
    if-ge v1, p1, :cond_1

    aget-object v3, v0, v1

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "duplicate element: "

    invoke-static {v3, v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    .line 145
    iput-object p1, p0, Ll/۟ᩴ۠;->֫:Ljava/util/Set;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)V
    .locals 1

    .line 119
    sget-object v0, Ll/۟ᩴ۠;->ۧ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ᩴ۠;

    if-nez v0, :cond_0

    .line 121
    new-instance v0, Ll/۟ᩴ۠;

    invoke-direct {v0, p0}, Ll/۟ᩴ۠;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-void
.end method
