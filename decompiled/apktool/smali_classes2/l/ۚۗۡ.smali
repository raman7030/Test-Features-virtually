.class public final Ll/ۚۗۡ;
.super Ljava/lang/Object;
.source "C1TT"


# static fields
.field public static final ۧ:[Ljava/lang/String;


# instance fields
.field public ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "[0oO]{3,}"

    const-string v1, "[Ii]{6,}"

    const-string v2, ".*[^a-zA-Z0-9_$/].*"

    .line 11
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۚۗۡ;->ۧ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚۗۡ;->֫:Ljava/util/ArrayList;

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :goto_0
    const/4 p1, 0x3

    if-ge v1, p1, :cond_1

    .line 20
    sget-object p1, Ll/ۚۗۡ;->ۧ:[Ljava/lang/String;

    aget-object p1, p1, v1

    .line 31
    iget-object v0, p0, Ll/ۚۗۡ;->֫:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object p1

    .line 1601
    new-instance v2, Ll/ۛۘܽ;

    invoke-direct {v2, p1}, Ll/ۛۘܽ;-><init>(Ll/ۨۘܽ;)V

    .line 31
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "\n"

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 31
    iget-object v3, p0, Ll/ۚۗۡ;->֫:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v2

    .line 1601
    new-instance v4, Ll/ۛۘܽ;

    invoke-direct {v4, v2}, Ll/ۛۘܽ;-><init>(Ll/ۨۘܽ;)V

    .line 31
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method private ܳ(Ljava/lang/String;)Z
    .locals 5

    .line 102
    iget-object v0, p0, Ll/ۚۗۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 103
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۘܽ;

    .line 1624
    invoke-virtual {v4}, Ll/ۛۘܽ;->get()Ll/۫ۘܽ;

    move-result-object v4

    invoke-virtual {v4, p1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v4}, Ll/۫ۘܽ;->matches()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Z
    .locals 4

    .line 39
    invoke-direct {p0, p1}, Ll/ۚۗۡ;->ܳ(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/16 v0, 0x2f

    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    add-int/2addr v0, v1

    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    :goto_1
    const/16 v3, 0x24

    .line 52
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    if-eq v3, v2, :cond_3

    .line 53
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 54
    invoke-direct {p0, v3}, Ll/ۚۗۡ;->ܳ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_2
    return v1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 60
    invoke-direct {p0, p1}, Ll/ۚۗۡ;->ܳ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Ll/ۚۗۡ;->ܳ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 2

    .line 82
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    goto :goto_1

    .line 85
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x2f

    .line 88
    invoke-static {p1, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/String;C)I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 94
    :cond_2
    :goto_1
    invoke-direct {p0, p1}, Ll/ۚۗۡ;->ܳ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ܿ(Ljava/lang/String;)Z
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Ll/ۚۗۡ;->ܳ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ᩳ(Ljava/lang/String;)Z
    .locals 3

    .line 64
    invoke-virtual {p0, p1}, Ll/ۚۗۡ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x2f

    .line 70
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    .line 71
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 98
    invoke-direct {p0, v1}, Ll/ۚۗۡ;->ܳ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 98
    invoke-direct {p0, p1}, Ll/ۚۗۡ;->ܳ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
