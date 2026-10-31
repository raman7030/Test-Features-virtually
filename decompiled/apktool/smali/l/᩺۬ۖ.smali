.class public final enum Ll/᩺۬ۖ;
.super Ljava/lang/Enum;
.source "Y9K4"


# static fields
.field public static final enum ۗ:Ll/᩺۬ۖ;

.field public static final enum ۙ:Ll/᩺۬ۖ;

.field public static final enum ۬:Ll/᩺۬ۖ;

.field public static final enum ᩶:Ll/᩺۬ۖ;

.field public static final synthetic ᩹:[Ll/᩺۬ۖ;


# instance fields
.field public ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 19
    new-instance v0, Ll/᩺۬ۖ;

    const-string v1, "UNIVERSAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/᩺۬ۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩺۬ۖ;->۬:Ll/᩺۬ۖ;

    .line 20
    new-instance v1, Ll/᩺۬ۖ;

    const/16 v3, 0x40

    const-string v4, "APPLICATION"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v3}, Ll/᩺۬ۖ;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ll/᩺۬ۖ;->᩶:Ll/᩺۬ۖ;

    .line 21
    new-instance v3, Ll/᩺۬ۖ;

    const/16 v4, 0x80

    const-string v6, "CONTEXT_SPECIFIC"

    const/4 v7, 0x2

    invoke-direct {v3, v6, v7, v4}, Ll/᩺۬ۖ;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ll/᩺۬ۖ;->ۙ:Ll/᩺۬ۖ;

    .line 22
    new-instance v4, Ll/᩺۬ۖ;

    const/16 v6, 0xc0

    const-string v8, "PRIVATE"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Ll/᩺۬ۖ;-><init>(Ljava/lang/String;II)V

    sput-object v4, Ll/᩺۬ۖ;->ۗ:Ll/᩺۬ۖ;

    const/4 v6, 0x4

    new-array v6, v6, [Ll/᩺۬ۖ;

    aput-object v0, v6, v2

    aput-object v1, v6, v5

    aput-object v3, v6, v7

    aput-object v4, v6, v9

    .line 18
    sput-object v6, Ll/᩺۬ۖ;->᩹:[Ll/᩺۬ۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    iput p3, p0, Ll/᩺۬ۖ;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩺۬ۖ;
    .locals 1

    .line 18
    const-class v0, Ll/᩺۬ۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩺۬ۖ;

    return-object p0
.end method

.method public static values()[Ll/᩺۬ۖ;
    .locals 1

    .line 18
    sget-object v0, Ll/᩺۬ۖ;->᩹:[Ll/᩺۬ۖ;

    invoke-virtual {v0}, [Ll/᩺۬ۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩺۬ۖ;

    return-object v0
.end method

.method public static ֫(B)Ll/᩺۬ۖ;
    .locals 5

    and-int/lit16 p0, p0, 0xc0

    .line 32
    invoke-static {}, Ll/᩺۬ۖ;->values()[Ll/᩺۬ۖ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 33
    iget v4, v3, Ll/᩺۬ۖ;->᩸:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 37
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Could not parse ASN.1 Tag Class (should be impossible)"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 41
    iget v0, p0, Ll/᩺۬ۖ;->᩸:I

    return v0
.end method
