.class public final enum Ll/ۛۢ᩵;
.super Ljava/lang/Enum;
.source "K9U2"


# static fields
.field public static final ֫֫:Z = true

.field public static final enum ۗ:Ll/ۛۢ᩵;

.field public static final enum ۙ:Ll/ۛۢ᩵;

.field public static final ۛ:I = 0x7fff

.field public static final ۟:Z = false

.field public static final enum ۤ:Ll/ۛۢ᩵;

.field public static ۧ֫:Ll/֫᩻֨; = null

.field public static final enum ۨ:Ll/ۛۢ᩵;

.field public static final enum ۫:Ll/ۛۢ᩵;

.field public static final enum ۬:Ll/ۛۢ᩵;

.field public static final enum ܰ:Ll/ۛۢ᩵;

.field public static final synthetic ᩶:[Ll/ۛۢ᩵;

.field public static final ᩺:I = 0x8000


# instance fields
.field public final ᩸:Ljava/lang/String;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 18
    new-instance v0, Ll/ۛۢ᩵;

    const/4 v1, 0x0

    const-string v2, "?"

    const-string v3, "CLASS_UNKNOWN"

    invoke-direct {v0, v3, v1, v2, v1}, Ll/ۛۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/ۛۢ᩵;->ܰ:Ll/ۛۢ᩵;

    .line 22
    new-instance v0, Ll/ۛۢ᩵;

    const/4 v1, 0x1

    const-string v2, "in"

    const-string v3, "CLASS_IN"

    invoke-direct {v0, v3, v1, v2, v1}, Ll/ۛۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    .line 26
    new-instance v0, Ll/ۛۢ᩵;

    const/4 v1, 0x2

    const-string v2, "cs"

    const-string v3, "CLASS_CS"

    invoke-direct {v0, v3, v1, v2, v1}, Ll/ۛۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/ۛۢ᩵;->۬:Ll/ۛۢ᩵;

    .line 30
    new-instance v0, Ll/ۛۢ᩵;

    const/4 v1, 0x3

    const-string v2, "ch"

    const-string v3, "CLASS_CH"

    invoke-direct {v0, v3, v1, v2, v1}, Ll/ۛۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/ۛۢ᩵;->ۗ:Ll/ۛۢ᩵;

    .line 34
    new-instance v0, Ll/ۛۢ᩵;

    const/4 v1, 0x4

    const-string v2, "hs"

    const-string v3, "CLASS_HS"

    invoke-direct {v0, v3, v1, v2, v1}, Ll/ۛۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/ۛۢ᩵;->۫:Ll/ۛۢ᩵;

    .line 38
    new-instance v0, Ll/ۛۢ᩵;

    const-string v1, "none"

    const/16 v2, 0xfe

    const-string v3, "CLASS_NONE"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ۛۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/ۛۢ᩵;->ۨ:Ll/ۛۢ᩵;

    .line 42
    new-instance v0, Ll/ۛۢ᩵;

    const-string v1, "any"

    const/16 v2, 0xff

    const-string v3, "CLASS_ANY"

    const/4 v4, 0x6

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ۛۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/ۛۢ᩵;->ۙ:Ll/ۛۢ᩵;

    .line 14
    invoke-static {}, Ll/ۛۢ᩵;->ܿ()[Ll/ۛۢ᩵;

    move-result-object v0

    sput-object v0, Ll/ۛۢ᩵;->᩶:[Ll/ۛۢ᩵;

    .line 44
    const-class v0, Ll/ۛۢ᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۛۢ᩵;->ۧ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 73
    iput-object p3, p0, Ll/ۛۢ᩵;->᩸:Ljava/lang/String;

    .line 74
    iput p4, p0, Ll/ۛۢ᩵;->᩹:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۛۢ᩵;
    .locals 1

    .line 14
    const-class v0, Ll/ۛۢ᩵;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۛۢ᩵;

    return-object p0
.end method

.method public static values()[Ll/ۛۢ᩵;
    .locals 1

    .line 14
    sget-object v0, Ll/ۛۢ᩵;->᩶:[Ll/ۛۢ᩵;

    invoke-virtual {v0}, [Ll/ۛۢ᩵;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۛۢ᩵;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۛۢ᩵;
    .locals 6

    if-eqz p0, :cond_1

    .line 111
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 112
    invoke-static {}, Ll/ۛۢ᩵;->values()[Ll/ۛۢ᩵;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 113
    iget-object v5, v4, Ll/ۛۢ᩵;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 116
    :cond_1
    sget-object v0, Ll/ۛۢ᩵;->ۧ֫:Ll/֫᩻֨;

    const-string v1, "Could not find record class for name: {}"

    invoke-interface {v0, p0, v1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    sget-object p0, Ll/ۛۢ᩵;->ܰ:Ll/ۛۢ᩵;

    return-object p0
.end method

.method public static ۧ(I)Ll/ۛۢ᩵;
    .locals 6

    and-int/lit16 v0, p0, 0x7fff

    .line 126
    invoke-static {}, Ll/ۛۢ᩵;->values()[Ll/ۛۢ᩵;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 127
    iget v5, v4, Ll/ۛۢ᩵;->᩹:I

    if-ne v5, v0, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 129
    :cond_1
    sget-object v0, Ll/ۛۢ᩵;->ۧ֫:Ll/֫᩻֨;

    const-string v1, "Could not find record class for index: {}"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0, v1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    sget-object p0, Ll/ۛۢ᩵;->ܰ:Ll/ۛۢ᩵;

    return-object p0
.end method

.method public static synthetic ܿ()[Ll/ۛۢ᩵;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ll/ۛۢ᩵;

    .line 14
    sget-object v1, Ll/ۛۢ᩵;->ܰ:Ll/ۛۢ᩵;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۢ᩵;->۬:Ll/ۛۢ᩵;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۢ᩵;->ۗ:Ll/ۛۢ᩵;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۢ᩵;->۫:Ll/ۛۢ᩵;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۢ᩵;->ۨ:Ll/ۛۢ᩵;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۢ᩵;->ۙ:Ll/ۛۢ᩵;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۛۢ᩵;->ۧ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ۛۢ᩵;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public ֫(I)Z
    .locals 1

    .line 102
    sget-object v0, Ll/ۛۢ᩵;->ܰ:Ll/ۛۢ᩵;

    if-eq p0, v0, :cond_0

    const v0, 0x8000

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ۧ()I
    .locals 1

    .line 92
    iget v0, p0, Ll/ۛۢ᩵;->᩹:I

    return v0
.end method
