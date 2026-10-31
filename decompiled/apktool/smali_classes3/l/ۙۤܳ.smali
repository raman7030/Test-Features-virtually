.class public Ll/ۙۤܳ;
.super Ljava/lang/Object;
.source "9AJ5"

# interfaces
.implements Ll/᩸۬ܳ;


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 4

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Ll/ۙۤܳ;->᩹:Z

    .line 18
    invoke-static {}, Ll/᩹֡ܿ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 60
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "def_mov_recycle_bin"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 18
    :goto_0
    iput-boolean v3, p0, Ll/ۙۤܳ;->ۗ:Z

    .line 19
    iput v0, p0, Ll/ۙۤܳ;->᩸:I

    .line 29
    iput-boolean p1, p0, Ll/ۙۤܳ;->ۙ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙۤܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۙۤܳ;->᩸:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ۙۤܳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۙۤܳ;->᩸:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙۤܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ۙۤܳ;->᩹:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۙۤܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ۙۤܳ;->ۗ:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۙۤܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۙۤܳ;->ۙ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۙۤܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۙۤܳ;->ۗ:Z

    return p0
.end method


# virtual methods
.method public ֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I
    .locals 8

    if-nez p5, :cond_0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 141
    invoke-static/range {v0 .. v5}, Ll/ۘ᩺ۘ;->֫(Ll/᩸۬ܳ;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I

    move-result p1

    return p1

    :cond_0
    const/4 p4, 0x1

    .line 144
    filled-new-array {p4}, [I

    move-result-object p5

    .line 145
    iget v5, p0, Ll/ۙۤܳ;->᩸:I

    .line 146
    new-instance v7, Ll/᩶ۤܳ;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ll/᩶ۤܳ;-><init>(Ll/ۙۤܳ;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;I[I)V

    .line 44
    new-instance p1, Ll/ܺܶۢ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v7, p1}, Ll/۠ܶۢ;->֫(Ljava/util/function/BooleanSupplier;)Z

    move-result p1

    xor-int/lit8 p2, p1, 0x1

    .line 209
    iput-boolean p2, p0, Ll/ۙۤܳ;->᩶:Z

    if-nez p1, :cond_1

    return p4

    :cond_1
    const/4 p1, 0x0

    .line 210
    aget p1, p5, p1

    return p1
.end method

.method public ֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V
    .locals 7

    .line 73
    new-instance v6, Ll/᩸ۤܳ;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Ll/᩸ۤܳ;-><init>(Ll/ۙۤܳ;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    .line 44
    new-instance p1, Ll/ܺܶۢ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v6, p1}, Ll/۠ܶۢ;->֫(Ljava/util/function/BooleanSupplier;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    .line 131
    iput-boolean p1, p0, Ll/ۙۤܳ;->᩶:Z

    return-void
.end method

.method public ֫(Z)Z
    .locals 0

    if-nez p1, :cond_1

    .line 55
    invoke-virtual {p0}, Ll/ۙۤܳ;->᩵()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public ۬()I
    .locals 1

    .line 220
    iget v0, p0, Ll/ۙۤܳ;->᩸:I

    return v0
.end method

.method public ܶ()Z
    .locals 1

    .line 60
    iget-boolean v0, p0, Ll/ۙۤܳ;->ۗ:Z

    return v0
.end method

.method public ܿ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Ll/ۙۤܳ;->ۙ:Z

    return-void
.end method

.method public ᩵()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Ll/ۙۤܳ;->᩹:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public ᩻()Z
    .locals 1

    .line 215
    iget-boolean v0, p0, Ll/ۙۤܳ;->᩶:Z

    return v0
.end method
