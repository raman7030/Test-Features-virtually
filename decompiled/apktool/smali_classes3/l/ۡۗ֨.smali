.class public final Ll/ۡۗ֨;
.super Ljava/lang/Object;
.source "B417"


# instance fields
.field public ֡:Z

.field public ֫:Ll/۟۬֨;

.field public ۖ:Ll/᩻ۗ֨;

.field public ۘ:Ll/ܰ᩵֨;

.field public ۚ:Ll/᩻ۗ֨;

.field public ۜ:Z

.field public ۡ:Ll/ܽܽ۠;

.field public ۢ:Ll/ۙᩴ֨;

.field public ۧ:Ll/ۙ֨֨;

.field public ܳ:Z

.field public ܺ:Ll/ۚۚ۠;

.field public ܽ:Ll/ۛ֡֨;

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩴ:Z

.field public ᩵:I

.field public ᩷:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Ll/ۡۗ֨;->ۘ:Ll/ܰ᩵֨;

    const/4 v1, 0x0

    .line 50
    iput v1, p0, Ll/ۡۗ֨;->᩵:I

    .line 54
    iput-boolean v1, p0, Ll/ۡۗ֨;->᩻:Z

    .line 58
    iput-boolean v1, p0, Ll/ۡۗ֨;->ᩴ:Z

    .line 63
    iput-boolean v1, p0, Ll/ۡۗ֨;->ۜ:Z

    .line 67
    iput-boolean v1, p0, Ll/ۡۗ֨;->᩷:Z

    .line 71
    iput-boolean v1, p0, Ll/ۡۗ֨;->ܿ:Z

    .line 75
    sget-object v2, Ll/۟۬֨;->۬:Ll/۟۬֨;

    iput-object v2, p0, Ll/ۡۗ֨;->֫:Ll/۟۬֨;

    .line 80
    iput-boolean v1, p0, Ll/ۡۗ֨;->ᩳ:Z

    .line 85
    iput-boolean v1, p0, Ll/ۡۗ֨;->ܳ:Z

    .line 89
    iput-boolean v1, p0, Ll/ۡۗ֨;->֡:Z

    .line 93
    iput-object v0, p0, Ll/ۡۗ֨;->ۡ:Ll/ܽܽ۠;

    .line 102
    iput-object v0, p0, Ll/ۡۗ֨;->ܽ:Ll/ۛ֡֨;

    .line 107
    iput-object v0, p0, Ll/ۡۗ֨;->ۖ:Ll/᩻ۗ֨;

    .line 112
    iput-object v0, p0, Ll/ۡۗ֨;->ۚ:Ll/᩻ۗ֨;

    .line 116
    iput-object v0, p0, Ll/ۡۗ֨;->ۧ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AttrContext["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۡۗ֨;->ۘ:Ll/ܰ᩵֨;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܰ᩵֨;)Ll/ۡۗ֨;
    .locals 1

    .line 128
    new-instance v0, Ll/ۡۗ֨;

    invoke-direct {v0}, Ll/ۡۗ֨;-><init>()V

    .line 129
    iput-object p1, v0, Ll/ۡۗ֨;->ۘ:Ll/ܰ᩵֨;

    .line 130
    iget p1, p0, Ll/ۡۗ֨;->᩵:I

    iput p1, v0, Ll/ۡۗ֨;->᩵:I

    .line 131
    iget-boolean p1, p0, Ll/ۡۗ֨;->᩻:Z

    iput-boolean p1, v0, Ll/ۡۗ֨;->᩻:Z

    .line 132
    iget-boolean p1, p0, Ll/ۡۗ֨;->ᩴ:Z

    iput-boolean p1, v0, Ll/ۡۗ֨;->ᩴ:Z

    .line 133
    iget-object p1, p0, Ll/ۡۗ֨;->ۡ:Ll/ܽܽ۠;

    iput-object p1, v0, Ll/ۡۗ֨;->ۡ:Ll/ܽܽ۠;

    .line 134
    iget-object p1, p0, Ll/ۡۗ֨;->ۢ:Ll/ۙᩴ֨;

    iput-object p1, v0, Ll/ۡۗ֨;->ۢ:Ll/ۙᩴ֨;

    .line 135
    iget-object p1, p0, Ll/ۡۗ֨;->ܽ:Ll/ۛ֡֨;

    iput-object p1, v0, Ll/ۡۗ֨;->ܽ:Ll/ۛ֡֨;

    .line 136
    iget-object p1, p0, Ll/ۡۗ֨;->ۖ:Ll/᩻ۗ֨;

    iput-object p1, v0, Ll/ۡۗ֨;->ۖ:Ll/᩻ۗ֨;

    .line 137
    iget-object p1, p0, Ll/ۡۗ֨;->ۚ:Ll/᩻ۗ֨;

    iput-object p1, v0, Ll/ۡۗ֨;->ۚ:Ll/᩻ۗ֨;

    .line 138
    iget-object p1, p0, Ll/ۡۗ֨;->ۧ:Ll/ۙ֨֨;

    iput-object p1, v0, Ll/ۡۗ֨;->ۧ:Ll/ۙ֨֨;

    .line 139
    iget-boolean p1, p0, Ll/ۡۗ֨;->ۜ:Z

    iput-boolean p1, v0, Ll/ۡۗ֨;->ۜ:Z

    .line 140
    iget-boolean p1, p0, Ll/ۡۗ֨;->ܿ:Z

    iput-boolean p1, v0, Ll/ۡۗ֨;->ܿ:Z

    .line 141
    iget-boolean p1, p0, Ll/ۡۗ֨;->᩷:Z

    iput-boolean p1, v0, Ll/ۡۗ֨;->᩷:Z

    .line 142
    iget-object p1, p0, Ll/ۡۗ֨;->֫:Ll/۟۬֨;

    iput-object p1, v0, Ll/ۡۗ֨;->֫:Ll/۟۬֨;

    .line 143
    iget-boolean p1, p0, Ll/ۡۗ֨;->ᩳ:Z

    iput-boolean p1, v0, Ll/ۡۗ֨;->ᩳ:Z

    .line 144
    iget-boolean p1, p0, Ll/ۡۗ֨;->ܳ:Z

    iput-boolean p1, v0, Ll/ۡۗ֨;->ܳ:Z

    .line 145
    iget-object p1, p0, Ll/ۡۗ֨;->ܺ:Ll/ۚۚ۠;

    iput-object p1, v0, Ll/ۡۗ֨;->ܺ:Ll/ۚۚ۠;

    .line 146
    iget-boolean p1, p0, Ll/ۡۗ֨;->֡:Z

    iput-boolean p1, v0, Ll/ۡۗ֨;->֡:Z

    return-object v0
.end method
