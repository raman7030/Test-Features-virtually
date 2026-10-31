.class public Ll/֨ܳᩳ;
.super Ljava/lang/Object;
.source "BB70"

# interfaces
.implements Lnet/sf/sevenzipjbinding/ICryptoGetTextPassword;


# instance fields
.field public ۗ:Z

.field public ۙ:Ljava/lang/String;

.field public ۤ:Z

.field public ۫:Z

.field public ۬:Ljava/util/function/BooleanSupplier;

.field public ᩶:Ljava/util/Iterator;

.field public final ᩸:Ll/ۗܺ᩷;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ll/֡ܳᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֨ܳᩳ;->۬:Ljava/util/function/BooleanSupplier;

    .line 29
    iput-object p1, p0, Ll/֨ܳᩳ;->᩸:Ll/ۗܺ᩷;

    return-void
.end method

.method public static synthetic ֫(Ll/֨ܳᩳ;Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Ll/֨ܳᩳ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method private ᩶֫()V
    .locals 2

    .line 93
    iget-boolean v0, p0, Ll/֨ܳᩳ;->᩹:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֨ܳᩳ;->۬:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 94
    iput-boolean v0, p0, Ll/֨ܳᩳ;->᩹:Z

    .line 95
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v1, "Cancel"

    invoke-direct {v0, v1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public cryptoGetTextPassword()Ljava/lang/String;
    .locals 4

    .line 64
    invoke-direct {p0}, Ll/֨ܳᩳ;->᩶֫()V

    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, Ll/֨ܳᩳ;->ۤ:Z

    .line 66
    iget-object v1, p0, Ll/֨ܳᩳ;->ۙ:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 67
    iget-object v1, p0, Ll/֨ܳᩳ;->᩶:Ljava/util/Iterator;

    if-nez v1, :cond_0

    .line 68
    invoke-static {}, Ll/ۤܺܳ;->ۧ()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, p0, Ll/֨ܳᩳ;->᩶:Ljava/util/Iterator;

    .line 70
    :cond_0
    iget-object v1, p0, Ll/֨ܳᩳ;->᩶:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 71
    iget-object v1, p0, Ll/֨ܳᩳ;->᩶:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Ll/֨ܳᩳ;->ۙ:Ljava/lang/String;

    .line 72
    iput-boolean v0, p0, Ll/֨ܳᩳ;->ۗ:Z

    .line 73
    iput-boolean v2, p0, Ll/֨ܳᩳ;->۫:Z

    goto :goto_0

    .line 75
    :cond_1
    iput-boolean v2, p0, Ll/֨ܳᩳ;->ۗ:Z

    .line 76
    new-instance v1, Ll/۫֨ܳ;

    new-instance v2, Ll/ۚܳᩳ;

    invoke-direct {v2, p0}, Ll/ۚܳᩳ;-><init>(Ll/֨ܳᩳ;)V

    iget-object v3, p0, Ll/֨ܳᩳ;->᩸:Ll/ۗܺ᩷;

    invoke-direct {v1, v3, v2}, Ll/۫֨ܳ;-><init>(Ll/ۗܺ᩷;Ll/۬֨ܳ;)V

    iget-object v2, p0, Ll/֨ܳᩳ;->۬:Ljava/util/function/BooleanSupplier;

    .line 78
    invoke-virtual {v1, v2}, Ll/۫֨ܳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 79
    invoke-virtual {v1}, Ll/۫֨ܳ;->֫()Z

    move-result v1

    iput-boolean v1, p0, Ll/֨ܳᩳ;->۫:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Ll/֨ܳᩳ;->᩹:Z

    .line 80
    invoke-direct {p0}, Ll/֨ܳᩳ;->᩶֫()V

    goto :goto_0

    .line 83
    :cond_2
    iput-boolean v2, p0, Ll/֨ܳᩳ;->ۗ:Z

    .line 84
    iput-boolean v2, p0, Ll/֨ܳᩳ;->۫:Z

    .line 87
    :goto_0
    invoke-direct {p0}, Ll/֨ܳᩳ;->᩶֫()V

    .line 88
    iget-object v0, p0, Ll/֨ܳᩳ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public ֫(Ljava/util/function/BooleanSupplier;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/֨ܳᩳ;->۬:Ljava/util/function/BooleanSupplier;

    return-void
.end method

.method public ۖ()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Ll/֨ܳᩳ;->۫:Z

    return v0
.end method

.method public ܶ֫()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/֨ܳᩳ;->ۙ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/֨ܳᩳ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public ܺ(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Ll/֨ܳᩳ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public ᩸֫()Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Ll/֨ܳᩳ;->᩹:Z

    return v0
.end method

.method public ᩹֫()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Ll/֨ܳᩳ;->ۤ:Z

    return v0
.end method

.method public ᩺()Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Ll/֨ܳᩳ;->ۗ:Z

    return v0
.end method
