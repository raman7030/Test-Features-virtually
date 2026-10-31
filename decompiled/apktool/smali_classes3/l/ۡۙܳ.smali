.class public final enum Ll/ۡۙܳ;
.super Ljava/lang/Enum;
.source "P735"


# static fields
.field public static final enum ۗ:Ll/ۡۙܳ;

.field public static final synthetic ۙ:[Ll/ۡۙܳ;

.field public static final enum ۛ:Ll/ۡۙܳ;

.field public static final enum ۤ:Ll/ۡۙܳ;

.field public static final enum ۨ:Ll/ۡۙܳ;

.field public static final enum ۫:Ll/ۡۙܳ;

.field public static final enum ۬:Ll/ۡۙܳ;


# instance fields
.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    .line 9
    new-instance v6, Ll/ۡۙܳ;

    const v4, 0x7f12091b

    const v5, 0x7f1203bf

    const-string v1, "CONTAINS"

    const/4 v2, 0x0

    const/4 v9, 0x1

    move-object v0, v6

    move v3, v9

    invoke-direct/range {v0 .. v5}, Ll/ۡۙܳ;-><init>(Ljava/lang/String;IIII)V

    sput-object v6, Ll/ۡۙܳ;->ۗ:Ll/ۡۙܳ;

    .line 11
    new-instance v0, Ll/ۡۙܳ;

    const v11, 0x7f12091e

    const v12, 0x7f1203c1

    const-string v8, "PREFIX"

    const/4 v3, 0x2

    move-object v7, v0

    move v10, v3

    invoke-direct/range {v7 .. v12}, Ll/ۡۙܳ;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Ll/ۡۙܳ;->۫:Ll/ۡۙܳ;

    .line 13
    new-instance v0, Ll/ۡۙܳ;

    const v5, 0x7f12091c

    const v6, 0x7f1203c3

    const-string v2, "SUFFIX"

    const/4 v9, 0x3

    move-object v1, v0

    move v4, v9

    invoke-direct/range {v1 .. v6}, Ll/ۡۙܳ;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Ll/ۡۙܳ;->ۛ:Ll/ۡۙܳ;

    .line 15
    new-instance v0, Ll/ۡۙܳ;

    const v11, 0x7f12030e

    const v12, 0x7f1203c0

    const-string v8, "EXACT"

    const/4 v3, 0x4

    move-object v7, v0

    move v10, v3

    invoke-direct/range {v7 .. v12}, Ll/ۡۙܳ;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Ll/ۡۙܳ;->۬:Ll/ۡۙܳ;

    .line 17
    new-instance v0, Ll/ۡۙܳ;

    const v5, 0x7f120b82

    const v6, 0x7f1203c4

    const-string v2, "WILDCARD"

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/ۡۙܳ;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Ll/ۡۙܳ;->ۨ:Ll/ۡۙܳ;

    .line 19
    new-instance v0, Ll/ۡۙܳ;

    const v11, 0x7f1207ff

    const v12, 0x7f1203c2

    const-string v8, "REGEX"

    const/4 v9, 0x5

    const/4 v10, 0x5

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/ۡۙܳ;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Ll/ۡۙܳ;->ۤ:Ll/ۡۙܳ;

    .line 8
    invoke-static {}, Ll/ۡۙܳ;->᩻()[Ll/ۡۙܳ;

    move-result-object v0

    sput-object v0, Ll/ۡۙܳ;->ۙ:[Ll/ۡۙܳ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIII)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    iput p3, p0, Ll/ۡۙܳ;->᩶:I

    .line 33
    iput p4, p0, Ll/ۡۙܳ;->᩸:I

    .line 34
    iput p5, p0, Ll/ۡۙܳ;->᩹:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۡۙܳ;
    .locals 1

    .line 8
    const-class v0, Ll/ۡۙܳ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۡۙܳ;

    return-object p0
.end method

.method public static values()[Ll/ۡۙܳ;
    .locals 1

    .line 8
    sget-object v0, Ll/ۡۙܳ;->ۙ:[Ll/ۡۙܳ;

    invoke-virtual {v0}, [Ll/ۡۙܳ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۡۙܳ;

    return-object v0
.end method

.method public static ֫(I)Ll/ۡۙܳ;
    .locals 5

    .line 64
    invoke-static {}, Ll/ۡۙܳ;->values()[Ll/ۡۙܳ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 65
    iget v4, v3, Ll/ۡۙܳ;->᩶:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 69
    :cond_1
    sget-object p0, Ll/ۡۙܳ;->ۨ:Ll/ۡۙܳ;

    return-object p0
.end method

.method public static synthetic ᩻()[Ll/ۡۙܳ;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ll/ۡۙܳ;

    .line 8
    sget-object v1, Ll/ۡۙܳ;->ۗ:Ll/ۡۙܳ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۙܳ;->۫:Ll/ۡۙܳ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۙܳ;->ۛ:Ll/ۡۙܳ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۙܳ;->۬:Ll/ۡۙܳ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۙܳ;->ۨ:Ll/ۡۙܳ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۙܳ;->ۤ:Ll/ۡۙܳ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()I
    .locals 1

    .line 49
    iget v0, p0, Ll/ۡۙܳ;->᩸:I

    return v0
.end method

.method public ۧ()I
    .locals 1

    .line 57
    iget v0, p0, Ll/ۡۙܳ;->᩹:I

    return v0
.end method

.method public ܿ()I
    .locals 1

    .line 41
    iget v0, p0, Ll/ۡۙܳ;->᩶:I

    return v0
.end method
