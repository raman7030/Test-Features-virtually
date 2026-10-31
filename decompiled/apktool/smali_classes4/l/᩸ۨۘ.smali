.class public final Ll/᩸ۨۘ;
.super Ljava/lang/Object;
.source "Q8YQ"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:F


# direct methods
.method public constructor <init>(Ljava/lang/String;F)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput p2, p0, Ll/᩸ۨۘ;->ۧ:F

    .line 18
    iput-object p1, p0, Ll/᩸ۨۘ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Dimension{value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩸ۨۘ;->ۧ:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", unit=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩸ۨۘ;->֫:Ljava/lang/String;

    const-string v2, "\'}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
