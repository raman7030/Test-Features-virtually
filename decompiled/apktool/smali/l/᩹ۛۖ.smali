.class public final enum Ll/᩹ۛۖ;
.super Ljava/lang/Enum;
.source "B9J1"


# static fields
.field public static final enum ۗ:Ll/᩹ۛۖ;

.field public static final enum ۙ:Ll/᩹ۛۖ;

.field public static final enum ۛ:Ll/᩹ۛۖ;

.field public static final enum ۤ:Ll/᩹ۛۖ;

.field public static final enum ۫:Ll/᩹ۛۖ;

.field public static final enum ۬:Ll/᩹ۛۖ;

.field public static final enum ᩶:Ll/᩹ۛۖ;

.field public static final synthetic ᩹:[Ll/᩹ۛۖ;


# instance fields
.field public ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 21
    new-instance v0, Ll/᩹ۛۖ;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/᩹ۛۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩹ۛۖ;->ۛ:Ll/᩹ۛۖ;

    .line 22
    new-instance v0, Ll/᩹ۛۖ;

    const/4 v1, 0x1

    const/16 v2, 0x202

    const-string v3, "SMB_2_0_2"

    invoke-direct {v0, v3, v1, v2}, Ll/᩹ۛۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩹ۛۖ;->ۙ:Ll/᩹ۛۖ;

    .line 23
    new-instance v0, Ll/᩹ۛۖ;

    const/4 v1, 0x2

    const/16 v2, 0x210

    const-string v3, "SMB_2_1"

    invoke-direct {v0, v3, v1, v2}, Ll/᩹ۛۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩹ۛۖ;->ۗ:Ll/᩹ۛۖ;

    .line 24
    new-instance v0, Ll/᩹ۛۖ;

    const/4 v1, 0x3

    const/16 v2, 0x2ff

    const-string v3, "SMB_2XX"

    invoke-direct {v0, v3, v1, v2}, Ll/᩹ۛۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩹ۛۖ;->᩶:Ll/᩹ۛۖ;

    .line 25
    new-instance v0, Ll/᩹ۛۖ;

    const/4 v1, 0x4

    const/16 v2, 0x300

    const-string v3, "SMB_3_0"

    invoke-direct {v0, v3, v1, v2}, Ll/᩹ۛۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩹ۛۖ;->۬:Ll/᩹ۛۖ;

    .line 26
    new-instance v0, Ll/᩹ۛۖ;

    const/4 v1, 0x5

    const/16 v2, 0x302

    const-string v3, "SMB_3_0_2"

    invoke-direct {v0, v3, v1, v2}, Ll/᩹ۛۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩹ۛۖ;->۫:Ll/᩹ۛۖ;

    .line 27
    new-instance v0, Ll/᩹ۛۖ;

    const/4 v1, 0x6

    const/16 v2, 0x311

    const-string v3, "SMB_3_1_1"

    invoke-direct {v0, v3, v1, v2}, Ll/᩹ۛۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩹ۛۖ;->ۤ:Ll/᩹ۛۖ;

    .line 20
    invoke-static {}, Ll/᩹ۛۖ;->ۧ()[Ll/᩹ۛۖ;

    move-result-object v0

    sput-object v0, Ll/᩹ۛۖ;->᩹:[Ll/᩹ۛۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    iput p3, p0, Ll/᩹ۛۖ;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩹ۛۖ;
    .locals 1

    .line 20
    const-class v0, Ll/᩹ۛۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩹ۛۖ;

    return-object p0
.end method

.method public static values()[Ll/᩹ۛۖ;
    .locals 1

    .line 20
    sget-object v0, Ll/᩹ۛۖ;->᩹:[Ll/᩹ۛۖ;

    invoke-virtual {v0}, [Ll/᩹ۛۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩹ۛۖ;

    return-object v0
.end method

.method public static ֫(I)Ll/᩹ۛۖ;
    .locals 5

    .line 59
    invoke-static {}, Ll/᩹ۛۖ;->values()[Ll/᩹ۛۖ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 60
    invoke-virtual {v3}, Ll/᩹ۛۖ;->getValue()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 64
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown SMB2 Dialect: "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 64
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/util/Set;)Z
    .locals 1

    .line 50
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ۛۖ;

    .line 51
    invoke-virtual {v0}, Ll/᩹ۛۖ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic ۧ()[Ll/᩹ۛۖ;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ll/᩹ۛۖ;

    .line 20
    sget-object v1, Ll/᩹ۛۖ;->ۛ:Ll/᩹ۛۖ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩹ۛۖ;->ۙ:Ll/᩹ۛۖ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩹ۛۖ;->ۗ:Ll/᩹ۛۖ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/᩹ۛۖ;->᩶:Ll/᩹ۛۖ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/᩹ۛۖ;->۬:Ll/᩹ۛۖ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/᩹ۛۖ;->۫:Ll/᩹ۛۖ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/᩹ۛۖ;->ۤ:Ll/᩹ۛۖ;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 36
    iget v0, p0, Ll/᩹ۛۖ;->᩸:I

    return v0
.end method

.method public ֫()Z
    .locals 1

    .line 40
    sget-object v0, Ll/᩹ۛۖ;->۬:Ll/᩹ۛۖ;

    if-eq p0, v0, :cond_1

    sget-object v0, Ll/᩹ۛۖ;->۫:Ll/᩹ۛۖ;

    if-eq p0, v0, :cond_1

    sget-object v0, Ll/᩹ۛۖ;->ۤ:Ll/᩹ۛۖ;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
