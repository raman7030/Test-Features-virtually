.class public final Ll/ۙۖᩳ;
.super Ljava/lang/Object;
.source "DBK8"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final ۙ:Ll/۟ۖܽ;

.field public ᩶:I

.field public ᩸:Z

.field public final ᩹:Ll/ܺ֨ᩳ;


# direct methods
.method public constructor <init>(Ll/ܺ֨ᩳ;Ll/۟᩺ᩳ;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ll/۟ۖܽ;

    invoke-direct {v0}, Ll/۟ۖܽ;-><init>()V

    iput-object v0, p0, Ll/ۙۖᩳ;->ۙ:Ll/۟ۖܽ;

    const/4 v0, -0x1

    .line 15
    iput v0, p0, Ll/ۙۖᩳ;->᩶:I

    .line 25
    iput-object p1, p0, Ll/ۙۖᩳ;->᩹:Ll/ܺ֨ᩳ;

    .line 26
    invoke-direct {p0, p2}, Ll/ۙۖᩳ;->֫(Ljava/lang/CharSequence;)Z

    move-result p2

    iput-boolean p2, p0, Ll/ۙۖᩳ;->᩸:Z

    invoke-virtual {p1, p2}, Ll/ܺ֨ᩳ;->֫(Z)V

    return-void
.end method

.method public static ֫(Ll/۫ۨᩳ;Ll/ܺ֨ᩳ;)V
    .locals 2

    .line 19
    new-instance v0, Ll/ۙۖᩳ;

    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ۙۖᩳ;-><init>(Ll/ܺ֨ᩳ;Ll/۟᩺ᩳ;)V

    .line 20
    new-instance p1, Ll/֡֡ܿ;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ll/֡֡ܿ;-><init>(I)V

    invoke-virtual {p0, p1}, Ll/۫ۨᩳ;->֫(Ll/֡֡ܿ;)V

    .line 21
    invoke-virtual {p0, v0}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private ֫(Ljava/lang/CharSequence;)Z
    .locals 2

    .line 48
    new-instance v0, Ll/۬ۡ֡;

    invoke-direct {v0, p1}, Ll/۬ۡ֡;-><init>(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Ll/ۙۖᩳ;->ۙ:Ll/۟ۖܽ;

    invoke-virtual {p1, v0}, Ll/۟ۖܽ;->֫(Ljava/io/Reader;)V

    .line 51
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Ll/۟ۖܽ;->ۖ()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 53
    invoke-virtual {p1}, Ll/۟ۖܽ;->ۡ()Ll/ܽۘܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۘܽ;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ۙۖᩳ;->᩶:I

    .line 54
    invoke-virtual {p1}, Ll/۟ۖܽ;->ܳ()Ljava/lang/String;

    move-result-object p1

    const-string v0, "vector"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, -0x1

    .line 57
    iput v0, p0, Ll/ۙۖᩳ;->᩶:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 36
    iget p3, p0, Ll/ۙۖᩳ;->᩶:I

    const/4 p4, -0x1

    if-eq p3, p4, :cond_0

    if-le p2, p3, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    invoke-direct {p0, p1}, Ll/ۙۖᩳ;->֫(Ljava/lang/CharSequence;)Z

    move-result p1

    .line 40
    iget-boolean p2, p0, Ll/ۙۖᩳ;->᩸:Z

    if-eq p1, p2, :cond_1

    .line 41
    iput-boolean p1, p0, Ll/ۙۖᩳ;->᩸:Z

    .line 42
    iget-object p2, p0, Ll/ۙۖᩳ;->᩹:Ll/ܺ֨ᩳ;

    invoke-virtual {p2, p1}, Ll/ܺ֨ᩳ;->֫(Z)V

    :cond_1
    :goto_0
    return-void
.end method
