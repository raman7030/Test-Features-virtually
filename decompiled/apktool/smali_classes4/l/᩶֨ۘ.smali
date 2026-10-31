.class public final enum Ll/᩶֨ۘ;
.super Ljava/lang/Enum;
.source "L7JV"


# static fields
.field public static final synthetic ۛ:Ll/᩹᩸᩵;

.field public static final enum ۟:Ll/᩶֨ۘ;

.field public static final synthetic ۨ:[Ll/᩶֨ۘ;

.field public static final enum ܰ:Ll/᩶֨ۘ;

.field public static final enum ᩺:Ll/᩶֨ۘ;


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public final ۤ:[I

.field public final ۫:I

.field public final ۬:I

.field public final ᩶:I

.field public final ᩸:F

.field public final ᩹:F


# direct methods
.method public static constructor <clinit>()V
    .locals 23

    .line 36
    new-instance v11, Ll/᩶֨ۘ;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    const/high16 v3, 0x41800000    # 16.0f

    const/high16 v4, 0x41000000    # 8.0f

    sget-object v5, Ll/ܳ᩻ܳ;->֫:[I

    const/4 v6, 0x1

    const/4 v7, 0x4

    const/4 v8, 0x5

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Ll/᩶֨ۘ;-><init>(Ljava/lang/String;IFF[IIIIII)V

    sput-object v11, Ll/᩶֨ۘ;->᩺:Ll/᩶֨ۘ;

    .line 46
    new-instance v0, Ll/᩶֨ۘ;

    const/16 v21, 0x3

    const/16 v22, 0x1

    const-string v13, "SPRING"

    const/4 v14, 0x1

    const/high16 v15, 0x41800000    # 16.0f

    const/high16 v16, 0x40800000    # 4.0f

    sget-object v17, Ll/ܳ᩻ܳ;->ۧ:[I

    const/16 v18, 0x2

    const/16 v19, 0x4

    const/16 v20, 0x5

    move-object v12, v0

    invoke-direct/range {v12 .. v22}, Ll/᩶֨ۘ;-><init>(Ljava/lang/String;IFF[IIIIII)V

    sput-object v0, Ll/᩶֨ۘ;->ܰ:Ll/᩶֨ۘ;

    .line 56
    new-instance v0, Ll/᩶֨ۘ;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const-string v2, "WORM"

    const/4 v3, 0x2

    const/high16 v4, 0x41800000    # 16.0f

    const/high16 v5, 0x40800000    # 4.0f

    sget-object v6, Ll/ܳ᩻ܳ;->ܽ:[I

    const/4 v7, 0x1

    const/4 v8, 0x3

    const/4 v9, 0x4

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Ll/᩶֨ۘ;-><init>(Ljava/lang/String;IFF[IIIIII)V

    sput-object v0, Ll/᩶֨ۘ;->۟:Ll/᩶֨ۘ;

    invoke-static {}, Ll/᩶֨ۘ;->ᩴ()[Ll/᩶֨ۘ;

    move-result-object v0

    sput-object v0, Ll/᩶֨ۘ;->ۨ:[Ll/᩶֨ۘ;

    invoke-static {v0}, Ll/᩶᩸᩵;->֫([Ljava/lang/Enum;)Ll/᩹᩸᩵;

    move-result-object v0

    sput-object v0, Ll/᩶֨ۘ;->ۛ:Ll/᩹᩸᩵;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IFF[IIIIII)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    iput p3, p0, Ll/᩶֨ۘ;->᩸:F

    .line 28
    iput p4, p0, Ll/᩶֨ۘ;->᩹:F

    .line 29
    iput-object p5, p0, Ll/᩶֨ۘ;->ۤ:[I

    .line 30
    iput p6, p0, Ll/᩶֨ۘ;->ۙ:I

    .line 31
    iput p7, p0, Ll/᩶֨ۘ;->۬:I

    .line 32
    iput p8, p0, Ll/᩶֨ۘ;->۫:I

    .line 33
    iput p9, p0, Ll/᩶֨ۘ;->ۗ:I

    .line 34
    iput p10, p0, Ll/᩶֨ۘ;->᩶:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩶֨ۘ;
    .locals 1

    .line 0
    const-class v0, Ll/᩶֨ۘ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩶֨ۘ;

    return-object p0
.end method

.method public static values()[Ll/᩶֨ۘ;
    .locals 1

    .line 0
    sget-object v0, Ll/᩶֨ۘ;->ۨ:[Ll/᩶֨ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶֨ۘ;

    return-object v0
.end method

.method public static ֡()Ll/᩹᩸᩵;
    .locals 1

    .line 0
    sget-object v0, Ll/᩶֨ۘ;->ۛ:Ll/᩹᩸᩵;

    return-object v0
.end method

.method public static final synthetic ᩴ()[Ll/᩶֨ۘ;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/᩶֨ۘ;

    .line 0
    sget-object v1, Ll/᩶֨ۘ;->᩺:Ll/᩶֨ۘ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩶֨ۘ;->ܰ:Ll/᩶֨ۘ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩶֨ۘ;->۟:Ll/᩶֨ۘ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public final ֫()F
    .locals 1

    .line 27
    iget v0, p0, Ll/᩶֨ۘ;->᩸:F

    return v0
.end method

.method public final ۡ()I
    .locals 1

    .line 32
    iget v0, p0, Ll/᩶֨ۘ;->۫:I

    return v0
.end method

.method public final ۢ()I
    .locals 1

    .line 31
    iget v0, p0, Ll/᩶֨ۘ;->۬:I

    return v0
.end method

.method public final ۧ()F
    .locals 1

    .line 28
    iget v0, p0, Ll/᩶֨ۘ;->᩹:F

    return v0
.end method

.method public final ܺ()[I
    .locals 1

    .line 29
    iget-object v0, p0, Ll/᩶֨ۘ;->ۤ:[I

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 34
    iget v0, p0, Ll/᩶֨ۘ;->᩶:I

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 33
    iget v0, p0, Ll/᩶֨ۘ;->ۗ:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 30
    iget v0, p0, Ll/᩶֨ۘ;->ۙ:I

    return v0
.end method
