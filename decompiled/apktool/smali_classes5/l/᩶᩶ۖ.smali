.class public final Ll/᩶᩶ۖ;
.super Ll/ۨ᩶ۖ;
.source "94VR"

# interfaces
.implements Ll/ۗ᩶ۖ;


# instance fields
.field public ۡ:Ll/۬᩶ۖ;


# direct methods
.method public constructor <init>(Ll/۬᩶ۖ;)V
    .locals 1

    .line 42
    sget-object v0, Ll/۟᩶ۖ;->ۗ:Ll/۟᩶ۖ;

    invoke-direct {p0, v0}, Ll/ۨ᩶ۖ;-><init>(Ll/۟᩶ۖ;)V

    .line 43
    iput-object p1, p0, Ll/᩶᩶ۖ;->ۡ:Ll/۬᩶ۖ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 54
    iget-object v0, p0, Ll/᩶᩶ۖ;->ۡ:Ll/۬᩶ۖ;

    invoke-virtual {v0}, Ll/۬᩶ۖ;->᩻()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GOTO "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/᩶᩶ۖ;->ۡ:Ll/۬᩶ۖ;

    invoke-virtual {p1, v0}, Ll/֨᩹ۖ;->֫(Ll/۬᩶ۖ;)Ll/۬᩶ۖ;

    move-result-object p1

    .line 49
    new-instance v0, Ll/᩶᩶ۖ;

    invoke-direct {v0, p1}, Ll/᩶᩶ۖ;-><init>(Ll/۬᩶ۖ;)V

    return-object v0
.end method

.method public final ֫()Ll/۬᩶ۖ;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/᩶᩶ۖ;->ۡ:Ll/۬᩶ۖ;

    return-object v0
.end method
