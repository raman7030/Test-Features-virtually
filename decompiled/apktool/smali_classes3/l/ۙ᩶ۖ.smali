.class public final Ll/ۙ᩶ۖ;
.super Ll/᩺᩶ۖ;
.source "159C"

# interfaces
.implements Ll/ۗ᩶ۖ;


# instance fields
.field public ܺ:Ll/۬᩶ۖ;


# direct methods
.method public constructor <init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;Ll/۬᩶ۖ;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Ll/᩺᩶ۖ;-><init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;)V

    .line 51
    iput-object p3, p0, Ll/ۙ᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "if "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " GOTO "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙ᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    invoke-virtual {v1}, Ll/۬᩶ۖ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;
    .locals 3

    .line 56
    iget-object v0, p0, Ll/ۙ᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    invoke-virtual {p1, v0}, Ll/֨᩹ۖ;->֫(Ll/۬᩶ۖ;)Ll/۬᩶ۖ;

    move-result-object v0

    .line 57
    new-instance v1, Ll/ۙ᩶ۖ;

    iget-object v2, p0, Ll/᩺᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {v2, p1}, Ll/۠᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;

    move-result-object p1

    iget-object v2, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-direct {v1, v2, p1, v0}, Ll/ۙ᩶ۖ;-><init>(Ll/۟᩶ۖ;Ll/۠᩶ۖ;Ll/۬᩶ۖ;)V

    return-object v1
.end method

.method public final ֫()Ll/۬᩶ۖ;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/ۙ᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    return-object v0
.end method
