.class public final Ll/ᩳ᩶ۖ;
.super Ll/ᩴ᩶ۖ;
.source "F4V4"


# instance fields
.field public ۗ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    sget-object v0, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    invoke-direct {p0, v0}, Ll/ᩴ᩶ۖ;-><init>(Ll/֨᩶ۖ;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 48
    sget-object v0, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    invoke-direct {p0, v0}, Ll/ᩴ᩶ۖ;-><init>(Ll/֨᩶ۖ;)V

    .line 49
    iput p1, p0, Ll/ᩳ᩶ۖ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 27
    invoke-virtual {p0}, Ll/ᩳ᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۠᩶ۖ;
    .locals 2

    .line 54
    new-instance v0, Ll/ᩳ᩶ۖ;

    iget v1, p0, Ll/ᩳ᩶ۖ;->ۗ:I

    invoke-direct {v0, v1}, Ll/ᩳ᩶ۖ;-><init>(I)V

    .line 57
    iget-object v1, p0, Ll/۠᩶ۖ;->᩶:Ljava/lang/String;

    iput-object v1, v0, Ll/۠᩶ۖ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;
    .locals 0

    .line 63
    invoke-virtual {p1, p0}, Ll/֨᩹ۖ;->֫(Ll/ᩳ᩶ۖ;)Ll/ᩳ᩶ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "a"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ᩳ᩶ۖ;->ۗ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
