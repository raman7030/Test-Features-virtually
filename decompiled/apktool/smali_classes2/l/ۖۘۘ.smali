.class public final Ll/ۖۘۘ;
.super Ll/᩶ۘۘ;
.source "W7WW"


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 75
    invoke-direct {p0}, Ll/᩶ۘۘ;-><init>()V

    .line 130
    new-instance v0, Ll/ܺۘۘ;

    .line 318
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    .line 172
    iput v1, v0, Ll/ܺۘۘ;->᩷ۧ:I

    .line 254
    new-instance v1, Ll/᩹ۘۘ;

    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 254
    iput-object v1, v0, Ll/ܺۘۘ;->ۡ֫:Ll/᩹ۘۘ;

    .line 255
    new-instance v1, Ll/᩹ۘۘ;

    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 255
    iput-object v1, v0, Ll/ܺۘۘ;->ۤ:Ll/᩹ۘۘ;

    .line 256
    new-instance v1, Ll/᩹ۘۘ;

    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 256
    iput-object v1, v0, Ll/ܺۘۘ;->ۙ:Ll/᩹ۘۘ;

    const/16 v1, 0x10

    new-array v2, v1, [S

    .line 259
    iput-object v2, v0, Ll/ܺۘۘ;->᩶:[S

    new-array v1, v1, [S

    .line 261
    iput-object v1, v0, Ll/ܺۘۘ;->᩶֫:[S

    const/16 v1, 0x23d

    new-array v2, v1, [I

    .line 264
    iput-object v2, v0, Ll/ܺۘۘ;->ܳ֫:[I

    new-array v1, v1, [B

    .line 272
    iput-object v1, v0, Ll/ܺۘۘ;->ۨ:[B

    const/4 v1, 0x0

    .line 316
    iput-object v1, v0, Ll/ܺۘۘ;->۟:Ll/ᩴۘۘ;

    .line 319
    iput-object p0, v0, Ll/ܺۘۘ;->ۧۧ:Ll/ۖۘۘ;

    const/16 v1, 0x47a

    new-array v1, v1, [S

    .line 320
    iput-object v1, v0, Ll/ܺۘۘ;->ܰ:[S

    const/16 v1, 0x7a

    new-array v1, v1, [S

    .line 321
    iput-object v1, v0, Ll/ܺۘۘ;->᩺:[S

    const/16 v1, 0x4e

    new-array v1, v1, [S

    .line 322
    iput-object v1, v0, Ll/ܺۘۘ;->ۗ:[S

    .line 130
    iput-object v0, p0, Ll/᩶ۘۘ;->ᩳ:Ll/ܺۘۘ;

    .line 131
    invoke-virtual {v0, p1}, Ll/ܺۘۘ;->֫(I)I

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 78
    :cond_0
    new-instance v0, Ll/ۘۘۘ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 43
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 78
    throw v0
.end method
