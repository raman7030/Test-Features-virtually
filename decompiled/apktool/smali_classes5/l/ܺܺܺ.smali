.class public final Ll/ܺܺܺ;
.super Ll/֡ܺܺ;
.source "KBBH"


# static fields
.field public static final ۙ:Ll/ܺܺܺ;

.field public static final ᩶:Ll/ܺܺܺ;

.field public static final ᩹:Ll/ܺܺܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 30
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    .line 53
    new-instance v1, Ll/ܺܺܺ;

    .line 62
    invoke-direct {v1, v0}, Ll/֡ܺܺ;-><init>(I)V

    .line 30
    sput-object v1, Ll/ܺܺܺ;->᩹:Ll/ܺܺܺ;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 35
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    .line 53
    new-instance v1, Ll/ܺܺܺ;

    .line 62
    invoke-direct {v1, v0}, Ll/֡ܺܺ;-><init>(I)V

    .line 35
    sput-object v1, Ll/ܺܺܺ;->᩶:Ll/ܺܺܺ;

    const/high16 v0, 0x40000000    # 2.0f

    .line 40
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    .line 53
    new-instance v1, Ll/ܺܺܺ;

    .line 62
    invoke-direct {v1, v0}, Ll/֡ܺܺ;-><init>(I)V

    .line 40
    sput-object v1, Ll/ܺܺܺ;->ۙ:Ll/ܺܺܺ;

    return-void
.end method

.method public static ֫(I)Ll/ܺܺܺ;
    .locals 1

    .line 53
    new-instance v0, Ll/ܺܺܺ;

    .line 62
    invoke-direct {v0, p0}, Ll/֡ܺܺ;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 80
    sget-object v0, Ll/۟ܺܺ;->᩷֫:Ll/۟ܺܺ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 70
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "float{0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " / "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 96
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "float"

    return-object v0
.end method
