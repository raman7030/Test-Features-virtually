.class public final enum Ll/ܰۡۖ;
.super Ljava/lang/Enum;
.source "T9Q9"

# interfaces
.implements Ll/ܰ֡ۖ;


# static fields
.field public static final enum ۗ:Ll/ܰۡۖ;

.field public static final ۙ:I = 0x2

.field public static final ۛ:[Ll/ܰۡۖ;

.field public static final ۤ:I = 0x1

.field public static final ۨ:Ll/۬ᩴۖ;

.field public static final enum ۫:Ll/ܰۡۖ;

.field public static final ۬:I = 0x3

.field public static final enum ᩶:Ll/ܰۡۖ;

.field public static final synthetic ᩹:[Ll/ܰۡۖ;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 21210
    new-instance v0, Ll/ܰۡۖ;

    const-string v1, "SPEED"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ll/ܰۡۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ܰۡۖ;->۫:Ll/ܰۡۖ;

    .line 21214
    new-instance v1, Ll/ܰۡۖ;

    const-string v4, "CODE_SIZE"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Ll/ܰۡۖ;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ll/ܰۡۖ;->᩶:Ll/ܰۡۖ;

    .line 21218
    new-instance v4, Ll/ܰۡۖ;

    const-string v6, "LITE_RUNTIME"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Ll/ܰۡۖ;-><init>(Ljava/lang/String;II)V

    sput-object v4, Ll/ܰۡۖ;->ۗ:Ll/ܰۡۖ;

    new-array v6, v7, [Ll/ܰۡۖ;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    aput-object v4, v6, v5

    .line 21205
    sput-object v6, Ll/ܰۡۖ;->᩹:[Ll/ܰۡۖ;

    .line 21222
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ܰۡۖ;

    .line 21228
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 21222
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 21276
    new-instance v0, Ll/᩺ۡۖ;

    .line 21277
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21276
    sput-object v0, Ll/ܰۡۖ;->ۨ:Ll/۬ᩴۖ;

    .line 21296
    invoke-static {}, Ll/ܰۡۖ;->values()[Ll/ܰۡۖ;

    move-result-object v0

    sput-object v0, Ll/ܰۡۖ;->ۛ:[Ll/ܰۡۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 21309
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 21310
    iput p3, p0, Ll/ܰۡۖ;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܰۡۖ;
    .locals 1

    .line 21205
    const-class v0, Ll/ܰۡۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܰۡۖ;

    return-object p0
.end method

.method public static values()[Ll/ܰۡۖ;
    .locals 1

    .line 21205
    sget-object v0, Ll/ܰۡۖ;->᩹:[Ll/ܰۡۖ;

    invoke-virtual {v0}, [Ll/ܰۡۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܰۡۖ;

    return-object v0
.end method

.method public static ֫(I)Ll/ܰۡۖ;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 21266
    :cond_0
    sget-object p0, Ll/ܰۡۖ;->ۗ:Ll/ܰۡۖ;

    return-object p0

    .line 21265
    :cond_1
    sget-object p0, Ll/ܰۡۖ;->᩶:Ll/ܰۡۖ;

    return-object p0

    .line 21264
    :cond_2
    sget-object p0, Ll/ܰۡۖ;->۫:Ll/ܰۡۖ;

    return-object p0
.end method

.method public static ֫(Ll/ۖۖۖ;)Ll/ܰۡۖ;
    .locals 2

    .line 21300
    invoke-virtual {p0}, Ll/ۖۖۖ;->getType()Ll/ۢۖۖ;

    move-result-object v0

    invoke-static {}, Ll/ܰۡۖ;->ܿ()Ll/ۢۖۖ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 21304
    sget-object v0, Ll/ܰۡۖ;->ۛ:[Ll/ܰۡۖ;

    invoke-virtual {p0}, Ll/ۖۖۖ;->ܺ()I

    move-result p0

    aget-object p0, v0, p0

    return-object p0

    .line 21301
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "EnumValueDescriptor is not for this type."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(I)Ll/ܰۡۖ;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 21255
    invoke-static {p0}, Ll/ܰۡۖ;->֫(I)Ll/ܰۡۖ;

    move-result-object p0

    return-object p0
.end method

.method public static final ܿ()Ll/ۢۖۖ;
    .locals 2

    .line 21293
    sget v0, Ll/۟ۡۖ;->ܺ֫:I

    .line 21191
    invoke-static {}, Ll/ۧۖۖ;->ۡ()Ll/ᩳۖۖ;

    move-result-object v0

    .line 21293
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

    .line 21273
    sget-object v0, Ll/ܰۡۖ;->ۨ:Ll/۬ᩴۖ;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    .line 21245
    iget v0, p0, Ll/ܰۡۖ;->᩸:I

    return v0
.end method

.method public final ֫()Ll/ۢۖۖ;
    .locals 1

    .line 21289
    invoke-static {}, Ll/ܰۡۖ;->ܿ()Ll/ۢۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ۖۖۖ;
    .locals 2

    .line 21285
    invoke-static {}, Ll/ܰۡۖ;->ܿ()Ll/ۢۖۖ;

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
