.class public enum Ll/ۛۢ۠;
.super Ljava/lang/Enum;
.source "D26X"


# static fields
.field public static final enum ۗ:Ll/ۛۢ۠;

.field public static final synthetic ۙ:[Ll/ۛۢ۠;

.field public static final ۛ:Ll/ۙ֨۠;

.field public static final enum ۤ:Ll/ۛۢ۠;

.field public static final enum ۫:Ll/ۛۢ۠;

.field public static final enum ۬:Ll/ۛۢ۠;


# instance fields
.field public final ᩶:I

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 43
    new-instance v7, Ll/ۛۢ۠;

    sget-object v8, Ll/ۧۡ۠;->ۜ֫:Ll/ۧۡ۠;

    const/4 v9, 0x0

    new-array v6, v9, [Ll/ۧۡ۠;

    const-string v1, "COMPACT1"

    const/4 v2, 0x0

    const-string v3, "compact1"

    const/4 v4, 0x1

    move-object v0, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v6}, Ll/ۛۢ۠;-><init>(Ljava/lang/String;ILjava/lang/String;ILl/ۧۡ۠;[Ll/ۧۡ۠;)V

    sput-object v7, Ll/ۛۢ۠;->ۗ:Ll/ۛۢ۠;

    .line 44
    new-instance v7, Ll/ۛۢ۠;

    const/4 v4, 0x2

    new-array v6, v9, [Ll/ۧۡ۠;

    const-string v1, "COMPACT2"

    const/4 v2, 0x1

    const-string v3, "compact2"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/ۛۢ۠;-><init>(Ljava/lang/String;ILjava/lang/String;ILl/ۧۡ۠;[Ll/ۧۡ۠;)V

    sput-object v7, Ll/ۛۢ۠;->۬:Ll/ۛۢ۠;

    .line 45
    new-instance v7, Ll/ۛۢ۠;

    const/4 v4, 0x3

    new-array v6, v9, [Ll/ۧۡ۠;

    const-string v1, "COMPACT3"

    const/4 v2, 0x2

    const-string v3, "compact3"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/ۛۢ۠;-><init>(Ljava/lang/String;ILjava/lang/String;ILl/ۧۡ۠;[Ll/ۧۡ۠;)V

    sput-object v7, Ll/ۛۢ۠;->۫:Ll/ۛۢ۠;

    .line 47
    new-instance v0, Ll/ۤۢ۠;

    invoke-direct {v0}, Ll/ۤۢ۠;-><init>()V

    sput-object v0, Ll/ۛۢ۠;->ۤ:Ll/ۛۢ۠;

    .line 42
    invoke-static {}, Ll/ۛۢ۠;->֫()[Ll/ۛۢ۠;

    move-result-object v0

    sput-object v0, Ll/ۛۢ۠;->ۙ:[Ll/ۛۢ۠;

    .line 54
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ۛۢ۠;->ۛ:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x0

    .line 73
    iput-object p1, p0, Ll/ۛۢ۠;->᩸:Ljava/lang/String;

    const p2, 0x7fffffff

    .line 74
    iput p2, p0, Ll/ۛۢ۠;->᩶:I

    .line 75
    iput-object p1, p0, Ll/ۛۢ۠;->᩹:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۛۢ۠;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;ILjava/lang/String;ILl/ۧۡ۠;[Ll/ۧۡ۠;)V
    .locals 0

    .line 78
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 79
    iput-object p3, p0, Ll/ۛۢ۠;->᩸:Ljava/lang/String;

    .line 80
    iput p4, p0, Ll/ۛۢ۠;->᩶:I

    .line 81
    invoke-static {p5, p6}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Ll/ۛۢ۠;->᩹:Ljava/util/Set;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۛۢ۠;
    .locals 1

    .line 42
    const-class v0, Ll/ۛۢ۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۛۢ۠;

    return-object p0
.end method

.method public static values()[Ll/ۛۢ۠;
    .locals 1

    .line 42
    sget-object v0, Ll/ۛۢ۠;->ۙ:[Ll/ۛۢ۠;

    invoke-virtual {v0}, [Ll/ۛۢ۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۛۢ۠;

    return-object v0
.end method

.method public static ֫(I)Ll/ۛۢ۠;
    .locals 5

    .line 95
    invoke-static {}, Ll/ۛۢ۠;->values()[Ll/ۛۢ۠;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 96
    iget v4, v3, Ll/ۛۢ۠;->᩶:I

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۛۢ۠;
    .locals 5

    .line 86
    invoke-static {}, Ll/ۛۢ۠;->values()[Ll/ۛۢ۠;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 87
    iget-object v4, v3, Ll/ۛۢ۠;->᩸:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ۛۢ۠;
    .locals 4

    .line 57
    sget-object v0, Ll/ۛۢ۠;->ۛ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۢ۠;

    if-nez v1, :cond_2

    .line 59
    invoke-static {p0}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v2

    .line 60
    sget-object v3, Ll/֡ۖ۠;->ۖۧ:Ll/֡ۖ۠;

    invoke-virtual {v2, v3}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 61
    invoke-static {v2}, Ll/ۛۢ۠;->֫(Ljava/lang/String;)Ll/ۛۢ۠;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    .line 62
    sget-object v1, Ll/ۛۢ۠;->ۤ:Ll/ۛۢ۠;

    .line 63
    :cond_1
    invoke-virtual {p0, v0, v1}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    :cond_2
    return-object v1
.end method

.method public static synthetic ֫()[Ll/ۛۢ۠;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ۛۢ۠;

    .line 42
    sget-object v1, Ll/ۛۢ۠;->ۗ:Ll/ۛۢ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۢ۠;->۬:Ll/ۛۢ۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۢ۠;->۫:Ll/ۛۢ۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۢ۠;->ۤ:Ll/ۛۢ۠;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫(Ll/ۧۡ۠;)Z
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۛۢ۠;->᩹:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
