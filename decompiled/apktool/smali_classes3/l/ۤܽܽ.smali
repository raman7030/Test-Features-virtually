.class public final enum Ll/ۤܽܽ;
.super Ljava/lang/Enum;
.source "66JZ"


# static fields
.field public static final enum ۗ:Ll/ۤܽܽ;

.field public static final enum ۙ:Ll/ۤܽܽ;

.field public static final synthetic ᩶:[Ll/ۤܽܽ;


# instance fields
.field public final ᩸:I

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 5
    new-instance v0, Ll/ۤܽܽ;

    const/16 v1, 0x40

    const-string v2, "aosp"

    const-string v3, "AOSP"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ۤܽܽ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    new-instance v0, Ll/ۤܽܽ;

    const/16 v1, 0x4c

    const-string v2, "motorola76"

    const-string v3, "MOTOROLA_76"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ۤܽܽ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    .line 4
    invoke-static {}, Ll/ۤܽܽ;->ۧ()[Ll/ۤܽܽ;

    move-result-object v0

    sput-object v0, Ll/ۤܽܽ;->᩶:[Ll/ۤܽܽ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 11
    iput p3, p0, Ll/ۤܽܽ;->᩸:I

    .line 12
    iput-object p4, p0, Ll/ۤܽܽ;->᩹:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۤܽܽ;
    .locals 1

    .line 4
    const-class v0, Ll/ۤܽܽ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۤܽܽ;

    return-object p0
.end method

.method public static values()[Ll/ۤܽܽ;
    .locals 1

    .line 4
    sget-object v0, Ll/ۤܽܽ;->᩶:[Ll/ۤܽܽ;

    invoke-virtual {v0}, [Ll/ۤܽܽ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۤܽܽ;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۤܽܽ;
    .locals 5

    .line 17
    invoke-static {}, Ll/ۤܽܽ;->values()[Ll/ۤܽܽ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 18
    iget-object v4, v3, Ll/ۤܽܽ;->᩹:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 20
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown config layout: "

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic ۧ()[Ll/ۤܽܽ;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/ۤܽܽ;

    .line 4
    sget-object v1, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()I
    .locals 1

    .line 25
    sget-object v0, Ll/ۤܽܽ;->ۗ:Ll/ۤܽܽ;

    if-ne p0, v0, :cond_0

    const/high16 v0, 0x1c0000

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
