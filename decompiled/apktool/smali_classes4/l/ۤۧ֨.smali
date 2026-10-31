.class public final Ll/ۤۧ֨;
.super Ll/ۢܽ֨;
.source "K3OA"


# static fields
.field public static final ֫ۧ:Ljava/util/Hashtable;

.field public static final ۟֫:Ll/ۛۚۢ;

.field public static final ۧۧ:Ljava/util/Hashtable;


# instance fields
.field public ۗ֫:Ljava/lang/String;

.field public ۙ֫:I

.field public ۛ֫:Ljava/util/ArrayList;

.field public ۤ֫:Ll/᩶ۗۚ;

.field public ۨ֫:Z

.field public final ۫֫:Ll/᩷ۧ֨;

.field public ۬֫:I

.field public ܰ֫:I

.field public ᩺֫:Ll/᩷ۗۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 45
    new-instance v0, Ll/ۛۚۢ;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ll/ۛۚۢ;-><init>(I)V

    sput-object v0, Ll/ۤۧ֨;->۟֫:Ll/ۛۚۢ;

    .line 48
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Ll/ۤۧ֨;->ۧۧ:Ljava/util/Hashtable;

    .line 49
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    sput-object v1, Ll/ۤۧ֨;->֫ۧ:Ljava/util/Hashtable;

    .line 54
    sget-object v2, Ll/۫ۧ֨;->ۡ֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    sget-object v2, Ll/۫ۧ֨;->ܰ:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-object v2, Ll/۫ۧ֨;->᩺:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v2, Ll/۫ۧ֨;->ۧ֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v2, Ll/۫ۧ֨;->ۤ:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v2, Ll/۫ۧ֨;->۫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v2, Ll/۫ۧ֨;->ۢ֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v2, Ll/۫ۧ֨;->ۨ:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v2, Ll/۫ۧ֨;->ܽ֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v2, Ll/۫ۧ֨;->۟:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v2, Ll/۫ۧ֨;->᩻֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v2, Ll/۫ۧ֨;->ᩳ֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v2, Ll/۫ۧ֨;->ܿ֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v2, Ll/۫ۧ֨;->ۛ:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v2, Ll/۫ۧ֨;->֫֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v2, Ll/۫ۧ֨;->ܳ֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v2, Ll/۫ۧ֨;->᩷֫:Ll/۫ۧ֨;

    invoke-virtual {v2}, Ll/۫ۧ֨;->᩷()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Ll/۬ۧ֨;->ۗ:Ll/۬ۧ֨;

    invoke-virtual {v0}, Ll/۬ۧ֨;->ۧ()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v0, Ll/۬ۧ֨;->۬:Ll/۬ۧ֨;

    invoke-virtual {v0}, Ll/۬ۧ֨;->ۧ()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Ll/۬ۧ֨;->ܰ:Ll/۬ۧ֨;

    invoke-virtual {v0}, Ll/۬ۧ֨;->ۧ()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Ll/۬ۧ֨;->۟:Ll/۬ۧ֨;

    invoke-virtual {v0}, Ll/۬ۧ֨;->ۧ()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Ll/۬ۧ֨;->ۨ:Ll/۬ۧ֨;

    invoke-virtual {v0}, Ll/۬ۧ֨;->ۧ()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Ll/۬ۧ֨;->ۛ:Ll/۬ۧ֨;

    invoke-virtual {v0}, Ll/۬ۧ֨;->ۧ()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Ll/۬ۧ֨;->ۤ:Ll/۬ۧ֨;

    invoke-virtual {v0}, Ll/۬ۧ֨;->ۧ()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Ll/۬ۧ֨;->᩺:Ll/۬ۧ֨;

    invoke-virtual {v0}, Ll/۬ۧ֨;->ۧ()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Ll/۬ۧ֨;->۫:Ll/۬ۧ֨;

    invoke-virtual {v0}, Ll/۬ۧ֨;->ۧ()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/᩷ۧ֨;)V
    .locals 2

    .line 104
    iget-object v0, p1, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-direct {p0, v0}, Ll/ۢܽ֨;-><init>(Ll/֨۬ۚ;)V

    const/4 v0, 0x0

    .line 96
    iput-boolean v0, p0, Ll/ۤۧ֨;->ۨ֫:Z

    const-string v1, ""

    .line 502
    iput-object v1, p0, Ll/ۤۧ֨;->ۗ֫:Ljava/lang/String;

    .line 503
    iput v0, p0, Ll/ۤۧ֨;->۬֫:I

    .line 504
    iput v0, p0, Ll/ۤۧ֨;->ۙ֫:I

    .line 505
    iput v0, p0, Ll/ۤۧ֨;->ܰ֫:I

    .line 105
    iput-object p1, p0, Ll/ۤۧ֨;->۫֫:Ll/᩷ۧ֨;

    .line 106
    iget-object p1, p1, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    iput-object p1, p0, Ll/ۤۧ֨;->ۤ֫:Ll/᩶ۗۚ;

    .line 107
    sget-object p1, Ll/֨۟ۚ;->ۤ:Ll/֨۟ۚ;

    iput-object p1, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    .line 108
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2f

    .line 387
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 388
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 389
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ll/ۤۧ֨;I)Ljava/lang/String;
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-byte p0, p1

    .line 410
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    sget-object v0, Ll/ۤۧ֨;->֫ۧ:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۬ۧ֨;

    if-nez p0, :cond_0

    const-string p0, "BOGUS_SUBTAG:"

    .line 0
    invoke-static {p1, p0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 414
    :cond_0
    invoke-static {p0}, Ll/۬ۧ֨;->֫(Ll/۬ۧ֨;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۗۧ֨;)Ll/ܿ᩺ᩴ;
    .locals 2

    .line 543
    invoke-virtual {p0}, Ll/ۗۧ֨;->֫()Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/᩸᩹ۡ;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/᩸᩹ۡ;-><init>(I)V

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۤۧ֨;)Ll/᩷ۧ֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۧ֨;->۫֫:Ll/᩷ۧ֨;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۤۧ֨;)Ll/᩶ۗۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۧ֨;->ۤ֫:Ll/᩶ۗۚ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۤۧ֨;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final getName(I)Ljava/lang/String;
    .locals 2

    .line 254
    new-instance v0, Ll/᩺ۜܳ;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/᩺ۜܳ;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "<invalid constant pool index:"

    const-string v1, ">"

    .line 0
    invoke-static {p1, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 258
    :cond_0
    invoke-static {v0}, Ll/ܰۘܺ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֨(I)Ll/ۗۧ֨;
    .locals 1

    .line 181
    invoke-virtual {p0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    iget-object v0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗۧ֨;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֨()V
    .locals 4

    .line 512
    iget-object v0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۘۧ֨;

    invoke-direct {v1, p0}, Ll/ۘۧ֨;-><init>(Ll/ۤۧ֨;)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    .line 513
    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->max()Ll/ᩳ۫ᩴ;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ll/ᩳ۫ᩴ;->orElse(I)I

    move-result v0

    .line 514
    iget-object v1, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0x64

    if-le v1, v2, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    :goto_0
    iput v1, p0, Ll/ۤۧ֨;->ۙ֫:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 524
    iput v0, p0, Ll/ۤۧ֨;->ܰ֫:I

    .line 525
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "const #%-"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۤۧ֨;->ۙ֫:I

    const-string v3, "d = "

    .line 0
    invoke-static {v2, v3, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 525
    iput-object v0, p0, Ll/ۤۧ֨;->ۗ֫:Ljava/lang/String;

    .line 526
    iget-object v2, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 19
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 526
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Ll/ۤۧ֨;->۬֫:I

    .line 533
    invoke-virtual {p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v0

    iget v1, p0, Ll/ۤۧ֨;->۬֫:I

    add-int/2addr v0, v1

    iget v1, p0, Ll/ۤۧ֨;->ܰ֫:I

    add-int/2addr v0, v1

    .line 538
    sget v2, Ll/ۢܽ֨;->۠֫:I

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    .line 533
    iput v1, p0, Ll/ۢܽ֨;->᩶:I

    return-void
.end method

.method public final ֫(ILjava/util/function/Function;)Ljava/lang/String;
    .locals 4

    .line 327
    invoke-virtual {p0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 330
    :cond_0
    iget-object v0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗۧ֨;

    if-eqz v0, :cond_2

    .line 331
    iget-object v2, v0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    sget-object v3, Ll/۫ۧ֨;->۫:Ll/۫ۧ֨;

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_0
    if-nez v1, :cond_3

    .line 321
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 323
    :cond_3
    check-cast v1, Ll/۠ۧ֨;

    invoke-virtual {p0, v1}, Ll/ۤۧ֨;->֫(Ll/۠ۧ֨;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۠ۧ֨;)Ljava/lang/String;
    .locals 3

    .line 354
    iget-object p1, p1, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const-string v0, "#"

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 362
    invoke-virtual {p0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 365
    :cond_0
    iget-object v1, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗۧ֨;

    if-eqz p1, :cond_3

    .line 366
    iget-object v1, p1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    sget-object v2, Ll/۫ۧ֨;->ۡ֫:Ll/۫ۧ֨;

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 369
    :cond_1
    check-cast p1, Ll/ۙۧ֨;

    .line 371
    iget-object p1, p1, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    const-string v0, "["

    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "\""

    .line 0
    invoke-static {v0, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    return-object p1

    :cond_3
    :goto_0
    return-object v0
.end method

.method public final ֫(Ll/۫ۧ֨;)Ljava/lang/String;
    .locals 2

    .line 116
    iget-boolean v0, p0, Ll/ۤۧ֨;->ۨ֫:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ll/۫ۧ֨;->֫(Ll/۫ۧ֨;)Ljava/lang/String;

    move-result-object p1

    const-string v1, " "

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public final ֫(Ljava/io/DataInputStream;)V
    .locals 12

    .line 136
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    .line 138
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 139
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v1, "constant_pool_count = "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v4, v2, [Ljava/lang/Object;

    .line 140
    iget-object v5, p0, Ll/ۤۧ֨;->ۤ֫:Ll/᩶ۗۚ;

    invoke-virtual {v5, v1, v4}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x1

    const/4 v4, 0x1

    :goto_0
    if-ge v4, v0, :cond_1

    .line 142
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    move-result v6

    .line 143
    sget-object v7, Ll/ۤۧ֨;->ۧۧ:Ljava/util/Hashtable;

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۫ۧ֨;

    if-eqz v7, :cond_0

    .line 149
    invoke-virtual {v7}, Ll/۫ۧ֨;->ۧ()I

    move-result v8

    const-string v9, " tag["

    const-string v10, "]\t=\t"

    const-string v11, "\tCP entry #"

    .line 0
    invoke-static {v11, v4, v9, v10, v6}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 150
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-array v10, v2, [Ljava/lang/Object;

    invoke-virtual {v5, v9, v10}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    packed-switch v9, :pswitch_data_0

    .line 171
    new-instance p1, Ljava/lang/ClassFormatError;

    const-string v0, "invalid constant type: "

    .line 0
    invoke-static {v6, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 171
    invoke-direct {p1, v0}, Ljava/lang/ClassFormatError;-><init>(Ljava/lang/String;)V

    throw p1

    .line 170
    :pswitch_0
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    new-instance v9, Ll/֨ۧ֨;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v10

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v11

    invoke-direct {v9, p0, v7, v10, v11}, Ll/֨ۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;II)V

    invoke-virtual {v6, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 169
    :pswitch_1
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    new-instance v9, Ll/֨ۧ֨;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v10

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v11

    invoke-direct {v9, p0, v7, v10, v11}, Ll/֨ۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;II)V

    invoke-virtual {v6, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 166
    :pswitch_2
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    new-instance v9, Ll/۠ۧ֨;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v10

    invoke-direct {v9, p0, v7, v10}, Ll/۠ۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;I)V

    invoke-virtual {v6, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 161
    :pswitch_3
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    new-instance v9, Ll/ܶۧ֨;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readDouble()D

    move-result-wide v10

    invoke-direct {v9, p0, v7, v10, v11}, Ll/ܶۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;D)V

    invoke-virtual {v6, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 163
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 155
    :pswitch_4
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    new-instance v9, Ll/᩶ۧ֨;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v10

    invoke-direct {v9, p0, v7, v10, v11}, Ll/᩶ۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;J)V

    invoke-virtual {v6, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 157
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 159
    :pswitch_5
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    new-instance v9, Ll/᩸ۧ֨;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readFloat()F

    move-result v10

    invoke-direct {v9, p0, v7, v10}, Ll/᩸ۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;F)V

    invoke-virtual {v6, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 153
    :pswitch_6
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    new-instance v9, Ll/᩹ۧ֨;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v10

    invoke-direct {v9, p0, v7, v10}, Ll/᩹ۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;I)V

    invoke-virtual {v6, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 152
    :pswitch_7
    iget-object v6, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    new-instance v9, Ll/ۙۧ֨;

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v10

    .line 767
    invoke-direct {v9, p0, v7, v10}, Ll/ۗۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;Ljava/lang/Object;)V

    .line 152
    invoke-virtual {v6, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_1
    add-int/2addr v4, v8

    goto/16 :goto_0

    .line 145
    :cond_0
    new-instance p1, Ljava/lang/ClassFormatError;

    .line 147
    invoke-virtual {v5}, Ll/᩶ۗۚ;->ܳ()Ll/᩻۬ۚ;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v2

    aput-object v3, v5, v1

    const/4 v0, 0x2

    aput-object v4, v5, v0

    const-string v0, "Error while reading constant pool for %s: unexpected tag at #%d: %d"

    .line 146
    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/ClassFormatError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final ֫(Z)V
    .locals 0

    .line 112
    iput-boolean p1, p0, Ll/ۤۧ֨;->ۨ֫:Z

    return-void
.end method

.method public final ۘ()Z
    .locals 1

    .line 454
    iget-boolean v0, p0, Ll/ۢܽ֨;->ᩴ֫:Z

    return v0
.end method

.method public final ۚ(I)Ljava/lang/String;
    .locals 2

    .line 267
    new-instance v0, Ll/ۧ᩵᩷;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ۧ᩵᩷;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Ll/ۤۧ֨;->֫(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۚ()V
    .locals 7

    .line 483
    iget-boolean v0, p0, Ll/ۢܽ֨;->ۤ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۢܽ֨;->ܺ֫:Z

    if-nez v0, :cond_0

    .line 484
    iget-object v0, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    invoke-virtual {v0}, Ll/֨۟ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "// "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 484
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 486
    :goto_0
    iget-object v2, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 487
    iget-object v2, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗۧ֨;

    .line 488
    iget-object v3, p0, Ll/ۤۧ֨;->ۗ֫:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    invoke-virtual {p0, v3, v5}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v2, :cond_1

    const-string v2, "null;"

    .line 491
    invoke-virtual {p0, v2}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_1

    .line 493
    :cond_1
    invoke-virtual {v2}, Ll/ۗۧ֨;->ۧ()I

    move-result v6

    .line 538
    sget v3, Ll/ۢܽ֨;->۠֫:I

    iget v4, p0, Ll/ۤۧ֨;->ܰ֫:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 732
    iput v3, v2, Ll/ۗۧ֨;->֫:I

    .line 496
    iget-object v3, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    iget v4, p0, Ll/ۤۧ֨;->ܰ֫:I

    invoke-virtual {v2, v3, v4}, Ll/ۗۧ֨;->ۧ(Ll/֨۬ۚ;I)V

    :goto_1
    add-int/2addr v1, v6

    goto :goto_0

    .line 178
    :cond_2
    iget-object v0, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    const-string v1, ""

    invoke-interface {v0, v1}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۜ(I)Ljava/lang/String;
    .locals 4

    const-string v0, "#"

    if-eqz p1, :cond_4

    .line 437
    invoke-virtual {p0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 440
    :cond_0
    iget-object v1, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۧ֨;

    if-nez v1, :cond_1

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 444
    :cond_1
    instance-of v0, v1, Ll/֨ۧ֨;

    if-eqz v0, :cond_3

    move-object v0, v1

    check-cast v0, Ll/֨ۧ֨;

    .line 445
    iget-object v2, v0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Ll/ۤۧ֨;->۫֫:Ll/᩷ۧ֨;

    iget v3, v3, Ll/᩷ۧ֨;->ۤۧ:I

    if-ne v2, v3, :cond_3

    .line 1164
    iget-object v2, v0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    sget-object v3, Ll/۫ۧ֨;->ۨ:Ll/۫ۧ֨;

    if-eq v2, v3, :cond_2

    sget-object v3, Ll/۫ۧ֨;->ܽ֫:Ll/۫ۧ֨;

    if-eq v2, v3, :cond_2

    sget-object v3, Ll/۫ۧ֨;->۟:Ll/۫ۧ֨;

    if-ne v2, v3, :cond_3

    .line 446
    :cond_2
    iget p1, v0, Ll/֨ۧ֨;->ۜ:I

    .line 449
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-static {v1}, Ll/۫ۧ֨;->֫(Ll/۫ۧ֨;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :cond_4
    :goto_0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۠(I)Ljava/lang/String;
    .locals 7

    .line 287
    iget-object v0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗۧ֨;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 288
    iget-object v4, v0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    sget-object v5, Ll/۫ۧ֨;->᩻֫:Ll/۫ۧ֨;

    if-ne v4, v5, :cond_1

    const/4 v4, 0x5

    new-array v4, v4, [Ll/۫ۧ֨;

    sget-object v5, Ll/۫ۧ֨;->ܽ֫:Ll/۫ۧ֨;

    aput-object v5, v4, v3

    sget-object v5, Ll/۫ۧ֨;->۟:Ll/۫ۧ֨;

    aput-object v5, v4, v2

    sget-object v5, Ll/۫ۧ֨;->ᩳ֫:Ll/۫ۧ֨;

    aput-object v5, v4, v1

    sget-object v5, Ll/۫ۧ֨;->ۛ:Ll/۫ۧ֨;

    const/4 v6, 0x3

    aput-object v5, v4, v6

    sget-object v5, Ll/۫ۧ֨;->֫֫:Ll/۫ۧ֨;

    const/4 v6, 0x4

    aput-object v5, v4, v6

    .line 297
    iget-object v5, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-static {v5}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v5

    new-instance v6, Ll/֡ۧ֨;

    invoke-direct {v6, v4}, Ll/֡ۧ֨;-><init>([Ll/۫ۧ֨;)V

    invoke-interface {v5, v6}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    new-instance v5, Ll/ۚۧ֨;

    invoke-direct {v5, p1}, Ll/ۚۧ֨;-><init>(I)V

    .line 298
    invoke-interface {v4, v5}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    invoke-interface {v4}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object v4

    .line 299
    invoke-virtual {v4}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 293
    :cond_0
    invoke-virtual {v0}, Ll/ۗۧ֨;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 290
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۤۧ֨;->ۤ֫:Ll/᩶ۗۚ;

    invoke-virtual {v0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v4, v5, v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "The ConstantPool[{0}] must be a CONSTANT_NameAndType_info structure with a field descriptor"

    invoke-static {v0, v5}, Ll/ܰۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 291
    iget-boolean v4, p0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v4, :cond_2

    return-object v0

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v3

    aput-object v0, v1, v2

    const-string p1, "??? #%d %s"

    .line 19
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۠()Ljava/util/List;
    .locals 3

    .line 542
    iget-object v0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ᩴۧ֨;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ᩴۧ֨;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩵ۧ֨;

    invoke-direct {v1, v2}, Ll/᩵ۧ֨;-><init>(I)V

    .line 543
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->flatMap(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 544
    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ(I)Ljava/lang/String;
    .locals 2

    .line 421
    invoke-virtual {p0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "<invalid constant pool index: %d>"

    .line 19
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 424
    :cond_0
    iget-object v0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗۧ֨;

    if-nez p1, :cond_1

    const-string p1, "<null>"

    return-object p1

    .line 428
    :cond_1
    invoke-virtual {p1}, Ll/ۗۧ֨;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(ILjava/util/function/Function;)Ljava/lang/String;
    .locals 2

    .line 195
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 196
    invoke-virtual {p0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗۧ֨;

    if-eqz p1, :cond_0

    .line 198
    iget-object v0, p1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    sget-object v1, Ll/۫ۧ֨;->ۡ֫:Ll/۫ۧ֨;

    if-ne v0, v1, :cond_0

    .line 199
    check-cast p1, Ll/ۙۧ֨;

    .line 200
    iget-object p1, p1, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    return-object p2
.end method

.method public final ܳ(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 308
    new-instance v0, Ll/᩺ۜܳ;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/᩺ۜܳ;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Ll/ۤۧ֨;->֫(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 309
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 19
    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 p1, 0x2f

    const/16 p2, 0x2e

    .line 309
    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܶ(I)Ljava/lang/String;
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗۧ֨;

    if-eqz p1, :cond_0

    .line 272
    instance-of v0, p1, Ll/֨ۧ֨;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֨ۧ֨;

    .line 273
    invoke-virtual {p1}, Ll/֨ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 275
    :cond_0
    invoke-virtual {p1}, Ll/ۗۧ֨;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ᩴ()V
    .locals 7

    .line 460
    iget-boolean v0, p0, Ll/ۢܽ֨;->ۤ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۢܽ֨;->ܺ֫:Z

    if-nez v0, :cond_0

    .line 461
    iget-object v0, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    invoke-virtual {v0}, Ll/֨۟ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "// "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 461
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 463
    :goto_0
    iget-object v2, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 464
    iget-object v2, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗۧ֨;

    .line 465
    iget-object v3, p0, Ll/ۤۧ֨;->ۗ֫:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    invoke-virtual {p0, v3, v5}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v2, :cond_1

    const-string v2, "null;"

    .line 468
    invoke-virtual {p0, v2}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_1

    .line 470
    :cond_1
    invoke-virtual {v2}, Ll/ۗۧ֨;->ۧ()I

    move-result v6

    .line 538
    sget v3, Ll/ۢܽ֨;->۠֫:I

    iget v4, p0, Ll/ۤۧ֨;->ܰ֫:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 732
    iput v3, v2, Ll/ۗۧ֨;->֫:I

    .line 473
    iget-object v3, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    iget v4, p0, Ll/ۤۧ֨;->ܰ֫:I

    invoke-virtual {v2, v3, v4}, Ll/ۗۧ֨;->֫(Ll/֨۬ۚ;I)V

    :goto_1
    add-int/2addr v1, v6

    goto :goto_0

    .line 178
    :cond_2
    iget-object v0, p0, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    const-string v1, ""

    invoke-interface {v0, v1}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩶(I)Z
    .locals 4

    .line 124
    iget-object v0, p0, Ll/ۤۧ֨;->᩺֫:Ll/᩷ۗۚ;

    if-nez v0, :cond_0

    .line 125
    new-instance v0, Ll/᩷ۗۚ;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ll/᩷ۗۚ;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    iput-object v0, p0, Ll/ۤۧ֨;->᩺֫:Ll/᩷ۗۚ;

    .line 127
    :cond_0
    iget-object v0, p0, Ll/ۤۧ֨;->᩺֫:Ll/᩷ۗۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩷ۗۚ;->֫(Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public final ᩸(I)Ljava/lang/String;
    .locals 3

    .line 213
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 224
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 214
    invoke-virtual {p0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 215
    iget-object v1, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗۧ֨;

    if-eqz p1, :cond_0

    .line 216
    iget-object v1, p1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    sget-object v2, Ll/۫ۧ֨;->ܳ֫:Ll/۫ۧ֨;

    if-ne v1, v2, :cond_0

    .line 217
    invoke-virtual {p1}, Ll/ۗۧ֨;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ᩹(I)Ljava/lang/String;
    .locals 3

    .line 234
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 245
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 235
    invoke-virtual {p0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 236
    iget-object v1, p0, Ll/ۤۧ֨;->ۛ֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗۧ֨;

    if-eqz p1, :cond_0

    .line 237
    iget-object v1, p1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    sget-object v2, Ll/۫ۧ֨;->᩷֫:Ll/۫ۧ֨;

    if-ne v1, v2, :cond_0

    .line 238
    invoke-virtual {p1}, Ll/ۗۧ֨;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method
