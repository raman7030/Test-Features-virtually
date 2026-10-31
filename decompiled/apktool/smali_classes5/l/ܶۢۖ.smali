.class public final enum Ll/ܶۢۖ;
.super Ljava/lang/Enum;
.source "T9Q9"

# interfaces
.implements Ll/ܰ֡ۖ;


# static fields
.field public static final enum ۗ:Ll/ܶۢۖ;

.field public static final ۙ:I = 0x1

.field public static final enum ۛ:Ll/ܶۢۖ;

.field public static final ۤ:I = 0x2

.field public static final ۨ:I = 0x3

.field public static final enum ۫:Ll/ܶۢۖ;

.field public static final ۬:I

.field public static final ܰ:Ll/۬ᩴۖ;

.field public static final enum ᩶:Ll/ܶۢۖ;

.field public static final synthetic ᩹:[Ll/ܶۢۖ;

.field public static final ᩺:[Ll/ܶۢۖ;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 39236
    new-instance v0, Ll/ܶۢۖ;

    const-string v1, "FIELD_PRESENCE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/ܶۢۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ܶۢۖ;->ۗ:Ll/ܶۢۖ;

    .line 39240
    new-instance v1, Ll/ܶۢۖ;

    const-string v3, "EXPLICIT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Ll/ܶۢۖ;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ll/ܶۢۖ;->᩶:Ll/ܶۢۖ;

    .line 39244
    new-instance v3, Ll/ܶۢۖ;

    const-string v5, "IMPLICIT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Ll/ܶۢۖ;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ll/ܶۢۖ;->۫:Ll/ܶۢۖ;

    .line 39248
    new-instance v5, Ll/ܶۢۖ;

    const-string v7, "LEGACY_REQUIRED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Ll/ܶۢۖ;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ll/ܶۢۖ;->ۛ:Ll/ܶۢۖ;

    const/4 v7, 0x4

    new-array v7, v7, [Ll/ܶۢۖ;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 39231
    sput-object v7, Ll/ܶۢۖ;->᩹:[Ll/ܶۢۖ;

    .line 39252
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ܶۢۖ;

    .line 39258
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 39252
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 39311
    new-instance v0, Ll/۠ۢۖ;

    .line 39312
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39311
    sput-object v0, Ll/ܶۢۖ;->ܰ:Ll/۬ᩴۖ;

    .line 39331
    invoke-static {}, Ll/ܶۢۖ;->values()[Ll/ܶۢۖ;

    move-result-object v0

    sput-object v0, Ll/ܶۢۖ;->᩺:[Ll/ܶۢۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 39344
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39345
    iput p3, p0, Ll/ܶۢۖ;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܶۢۖ;
    .locals 1

    .line 39231
    const-class v0, Ll/ܶۢۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܶۢۖ;

    return-object p0
.end method

.method public static values()[Ll/ܶۢۖ;
    .locals 1

    .line 39231
    sget-object v0, Ll/ܶۢۖ;->᩹:[Ll/ܶۢۖ;

    invoke-virtual {v0}, [Ll/ܶۢۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܶۢۖ;

    return-object v0
.end method

.method public static ֫(I)Ll/ܶۢۖ;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 39301
    :cond_0
    sget-object p0, Ll/ܶۢۖ;->ۛ:Ll/ܶۢۖ;

    return-object p0

    .line 39300
    :cond_1
    sget-object p0, Ll/ܶۢۖ;->۫:Ll/ܶۢۖ;

    return-object p0

    .line 39299
    :cond_2
    sget-object p0, Ll/ܶۢۖ;->᩶:Ll/ܶۢۖ;

    return-object p0

    .line 39298
    :cond_3
    sget-object p0, Ll/ܶۢۖ;->ۗ:Ll/ܶۢۖ;

    return-object p0
.end method

.method public static ֫(Ll/ۖۖۖ;)Ll/ܶۢۖ;
    .locals 2

    .line 39335
    invoke-virtual {p0}, Ll/ۖۖۖ;->getType()Ll/ۢۖۖ;

    move-result-object v0

    invoke-static {}, Ll/ܶۢۖ;->ܿ()Ll/ۢۖۖ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 39339
    sget-object v0, Ll/ܶۢۖ;->᩺:[Ll/ܶۢۖ;

    invoke-virtual {p0}, Ll/ۖۖۖ;->ܺ()I

    move-result p0

    aget-object p0, v0, p0

    return-object p0

    .line 39336
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "EnumValueDescriptor is not for this type."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(I)Ll/ܶۢۖ;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 39289
    invoke-static {p0}, Ll/ܶۢۖ;->֫(I)Ll/ܶۢۖ;

    move-result-object p0

    return-object p0
.end method

.method public static final ܿ()Ll/ۢۖۖ;
    .locals 2

    .line 39328
    sget v0, Ll/ۛۢۖ;->ۨ:I

    .line 39217
    invoke-static {}, Ll/ۧۖۖ;->ܿ֫()Ll/ᩳۖۖ;

    move-result-object v0

    .line 39328
    invoke-virtual {v0}, Ll/ᩳۖۖ;->ᩴ()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖۖ;

    return-object v0
.end method

.method public static ᩻()Ll/۬ᩴۖ;
    .locals 1

    .line 39308
    sget-object v0, Ll/ܶۢۖ;->ܰ:Ll/۬ᩴۖ;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    .line 39279
    iget v0, p0, Ll/ܶۢۖ;->᩸:I

    return v0
.end method

.method public final ֫()Ll/ۢۖۖ;
    .locals 1

    .line 39324
    invoke-static {}, Ll/ܶۢۖ;->ܿ()Ll/ۢۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ۖۖۖ;
    .locals 2

    .line 39320
    invoke-static {}, Ll/ܶۢۖ;->ܿ()Ll/ۢۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۖۖ;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۖۖ;

    return-object v0
.end method
