.class public final Ll/ۜۙۖ;
.super Ll/᩺᩶ۖ;
.source "Q695"


# direct methods
.method public constructor <init>(Ll/۠᩶ۖ;)V
    .locals 1

    .line 35
    sget-object v0, Ll/۟᩶ۖ;->ܳ֫:Ll/۟᩶ۖ;

    invoke-direct {p0, v0, p1}, Ll/᩺᩶ۖ;-><init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "void "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;
    .locals 2

    .line 40
    new-instance v0, Ll/ۜۙۖ;

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v1, p1}, Ll/۠᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۜۙۖ;-><init>(Ll/۠᩶ۖ;)V

    return-object v0
.end method
