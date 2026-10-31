.class public final Ll/ܳᩳ᩻;
.super Ljava/lang/Object;
.source "Y96B"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 214
    iput-boolean v0, p0, Ll/ܳᩳ᩻;->ۧ:Z

    .line 215
    iput-boolean v0, p0, Ll/ܳᩳ᩻;->֫:Z

    .line 216
    iput-boolean v0, p0, Ll/ܳᩳ᩻;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 223
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const/4 v1, 0x0

    const-string v2, "edfa"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result v0

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 228
    :goto_0
    iput-boolean v2, p0, Ll/ܳᩳ᩻;->ۧ:Z

    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 229
    :goto_1
    iput-boolean v2, p0, Ll/ܳᩳ᩻;->֫:Z

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    .line 230
    :cond_2
    iput-boolean v1, p0, Ll/ܳᩳ᩻;->ܽ:Z

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 219
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    .line 235
    iget-boolean v1, p0, Ll/ܳᩳ᩻;->ۧ:Z

    .line 238
    iget-boolean v2, p0, Ll/ܳᩳ᩻;->֫:Z

    if-eqz v2, :cond_0

    or-int/lit8 v1, v1, 0x2

    .line 241
    :cond_0
    iget-boolean v2, p0, Ll/ܳᩳ᩻;->ܽ:Z

    if-eqz v2, :cond_1

    or-int/lit8 v1, v1, 0x4

    :cond_1
    int-to-byte v1, v1

    const-string v2, "edfa"

    .line 219
    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    return-void
.end method
