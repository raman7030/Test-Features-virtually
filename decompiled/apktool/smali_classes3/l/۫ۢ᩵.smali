.class public final enum Ll/۫ۢ᩵;
.super Ljava/lang/Enum;
.source "I81G"


# static fields
.field public static final enum ۗ:Ll/۫ۢ᩵;

.field public static final enum ۙ:Ll/۫ۢ᩵;

.field public static final enum ۛ:Ll/۫ۢ᩵;

.field public static final enum ۤ:Ll/۫ۢ᩵;

.field public static final ۫:I = 0x3f

.field public static final ۬:I = 0xc0

.field public static final synthetic ᩶:[Ll/۫ۢ᩵;


# instance fields
.field public final ᩸:Ljava/lang/String;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 15
    new-instance v0, Ll/۫ۢ᩵;

    const-string v1, ""

    const/16 v2, 0x80

    const-string v3, "Unknown"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ll/۫ۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/۫ۢ᩵;->ۛ:Ll/۫ۢ᩵;

    .line 19
    new-instance v0, Ll/۫ۢ᩵;

    const/4 v1, 0x1

    const-string v2, "standard label"

    const-string v3, "Standard"

    invoke-direct {v0, v3, v1, v2, v4}, Ll/۫ۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/۫ۢ᩵;->ۤ:Ll/۫ۢ᩵;

    .line 23
    new-instance v0, Ll/۫ۢ᩵;

    const-string v1, "compressed label"

    const/16 v2, 0xc0

    const-string v3, "Compressed"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Ll/۫ۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/۫ۢ᩵;->ۙ:Ll/۫ۢ᩵;

    .line 27
    new-instance v0, Ll/۫ۢ᩵;

    const-string v1, "extended label"

    const/16 v2, 0x40

    const-string v3, "Extended"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Ll/۫ۢ᩵;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Ll/۫ۢ᩵;->ۗ:Ll/۫ۢ᩵;

    .line 11
    invoke-static {}, Ll/۫ۢ᩵;->ܿ()[Ll/۫ۢ᩵;

    move-result-object v0

    sput-object v0, Ll/۫ۢ᩵;->᩶:[Ll/۫ۢ᩵;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 40
    iput-object p3, p0, Ll/۫ۢ᩵;->᩸:Ljava/lang/String;

    .line 41
    iput p4, p0, Ll/۫ۢ᩵;->᩹:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۫ۢ᩵;
    .locals 1

    .line 11
    const-class v0, Ll/۫ۢ᩵;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۫ۢ᩵;

    return-object p0
.end method

.method public static values()[Ll/۫ۢ᩵;
    .locals 1

    .line 11
    sget-object v0, Ll/۫ۢ᩵;->᩶:[Ll/۫ۢ᩵;

    invoke-virtual {v0}, [Ll/۫ۢ᩵;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۫ۢ᩵;

    return-object v0
.end method

.method public static ֫(I)Ll/۫ۢ᩵;
    .locals 5

    and-int/lit16 p0, p0, 0xc0

    .line 68
    invoke-static {}, Ll/۫ۢ᩵;->values()[Ll/۫ۢ᩵;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 69
    iget v4, v3, Ll/۫ۢ᩵;->᩹:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 71
    :cond_1
    sget-object p0, Ll/۫ۢ᩵;->ۛ:Ll/۫ۢ᩵;

    return-object p0
.end method

.method public static ۧ(I)I
    .locals 0

    and-int/lit8 p0, p0, 0x3f

    return p0
.end method

.method public static synthetic ܿ()[Ll/۫ۢ᩵;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/۫ۢ᩵;

    .line 11
    sget-object v1, Ll/۫ۢ᩵;->ۛ:Ll/۫ۢ᩵;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/۫ۢ᩵;->ۤ:Ll/۫ۢ᩵;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/۫ۢ᩵;->ۙ:Ll/۫ۢ᩵;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/۫ۢ᩵;->ۗ:Ll/۫ۢ᩵;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/۫ۢ᩵;->ۧ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/۫ۢ᩵;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public ۧ()I
    .locals 1

    .line 59
    iget v0, p0, Ll/۫ۢ᩵;->᩹:I

    return v0
.end method
