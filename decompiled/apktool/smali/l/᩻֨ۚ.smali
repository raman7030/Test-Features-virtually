.class public final Ll/᩻֨ۚ;
.super Ll/ۖ֨ۚ;
.source "U4HR"


# instance fields
.field public final ۜ:Ljava/lang/StringBuilder;

.field public ܳ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/StringBuilder;

.field public ᩳ:Z

.field public final ᩻:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Ll/ۖ֨ۚ;-><init>()V

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/᩻֨ۚ;->ܿ:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 57
    iput-object v0, p0, Ll/᩻֨ۚ;->ܳ:Ljava/lang/String;

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/᩻֨ۚ;->᩻:Ljava/lang/StringBuilder;

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/᩻֨ۚ;->ۜ:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 60
    iput-boolean v0, p0, Ll/᩻֨ۚ;->ᩳ:Z

    .line 63
    sget-object v0, Ll/ܺ֨ۚ;->ۙ:Ll/ܺ֨ۚ;

    iput-object v0, p0, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 78
    iget-object v0, p0, Ll/᩻֨ۚ;->ܿ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<!doctype "

    const-string v2, ">"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()V
    .locals 1

    .line 68
    invoke-super {p0}, Ll/ۖ֨ۚ;->᩻()V

    .line 69
    iget-object v0, p0, Ll/᩻֨ۚ;->ܿ:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ۖ֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    const/4 v0, 0x0

    .line 70
    iput-object v0, p0, Ll/᩻֨ۚ;->ܳ:Ljava/lang/String;

    .line 71
    iget-object v0, p0, Ll/᩻֨ۚ;->᩻:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ۖ֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    .line 72
    iget-object v0, p0, Ll/᩻֨ۚ;->ۜ:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ۖ֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    const/4 v0, 0x0

    .line 73
    iput-boolean v0, p0, Ll/᩻֨ۚ;->ᩳ:Z

    return-void
.end method
