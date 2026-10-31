.class public final Ll/ۧۘ֨;
.super Ll/ۡۘ֨;
.source "G67D"


# instance fields
.field public final ۧ:Ll/ۙ֨֨;


# direct methods
.method public constructor <init>(Ll/ۙ֨֨;Ll/ۛ᩸֨;)V
    .locals 3

    .line 122
    invoke-virtual {p1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {p2, p1}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;)Ll/ܳ֡֨;

    move-result-object v0

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {p2, p1}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    .line 125
    :goto_0
    new-instance v1, Ll/᩶ۚ֨;

    iget-object v2, p2, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object v2, v2, Ll/᩷ۚ֨;->ᩴ:Ll/ۙ֨֨;

    invoke-virtual {v2}, Ll/ۙ֨֨;->۫()Ll/ۙ֨֨;

    move-result-object v2

    .line 126
    invoke-static {v0}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    iget-object p2, p2, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object p2, p2, Ll/᩷ۚ֨;->ᩴ:Ll/ۙ֨֨;

    iget-object p2, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-direct {v1, p2, v2, v0}, Ll/᩶ۚ֨;-><init>(Ll/᩶֡֨;Ll/ۙ֨֨;Ll/ۖܶ۠;)V

    .line 118
    invoke-direct {p0, v1}, Ll/ۡۘ֨;-><init>(Ll/ۙ֨֨;)V

    .line 119
    iput-object p1, p0, Ll/ۧۘ֨;->ۧ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۧۘ֨;->ۧ:Ll/ۙ֨֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".class"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۛ᩸۠;)Ljava/lang/Object;
    .locals 0

    .line 139
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final ֫(Ll/ۢۘ֨;)V
    .locals 0

    .line 116
    invoke-interface {p1, p0}, Ll/ۢۘ֨;->֫(Ll/ۧۘ֨;)V

    return-void
.end method
