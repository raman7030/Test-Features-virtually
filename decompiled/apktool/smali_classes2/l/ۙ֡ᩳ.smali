.class public final Ll/ۙ֡ᩳ;
.super Ljava/lang/Object;
.source "1AOV"


# static fields
.field public static ܳ:I

.field public static ܿ:Z

.field public static final synthetic ᩳ:I

.field public static ᩻:Z


# instance fields
.field public final ֫:Ljava/util/function/BooleanSupplier;

.field public final ۧ:Ll/ۗ֡ᩳ;

.field public final ܽ:Ll/ۛ֡ᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 28
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "tfcgi"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ll/ۙ֡ᩳ;->ܳ:I

    .line 30
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "tfcge"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ll/ۙ֡ᩳ;->ܿ:Z

    .line 32
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "tfrge"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ll/ۙ֡ᩳ;->᩻:Z

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Ljava/util/function/BooleanSupplier;Ll/ܽܰᩳ;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p2, p0, Ll/ۙ֡ᩳ;->֫:Ljava/util/function/BooleanSupplier;

    const p2, 0x7f0a059c

    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/ۛ֡ᩳ;

    iput-object p2, p0, Ll/ۙ֡ᩳ;->ܽ:Ll/ۛ֡ᩳ;

    const v0, 0x7f0a059d

    .line 56
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۗ֡ᩳ;

    iput-object p1, p0, Ll/ۙ֡ᩳ;->ۧ:Ll/ۗ֡ᩳ;

    .line 61
    invoke-virtual {p0}, Ll/ۙ֡ᩳ;->֫()V

    .line 62
    instance-of v0, p3, Landroid/view/View;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 63
    :goto_0
    invoke-virtual {p1, p2, p3, v0}, Ll/ۗ֡ᩳ;->֫(Ll/ۛ֡ᩳ;Ll/ܽܰᩳ;Landroid/view/View;)V

    .line 64
    new-instance p1, Ll/᩶֡ᩳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, p1}, Ll/ۛ֡ᩳ;->֫(Ll/ۖܰۧ;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Ll/۫ۨᩳ;)V
    .locals 1

    .line 43
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ܶ֡ᩳ;

    invoke-direct {v0, p2}, Ll/ܶ֡ᩳ;-><init>(Ll/۫ۨᩳ;)V

    invoke-direct {p0, p1, v0, p2}, Ll/ۙ֡ᩳ;-><init>(Landroid/view/View;Ljava/util/function/BooleanSupplier;Ll/ܽܰᩳ;)V

    return-void
.end method

.method public constructor <init>(Ll/֨֡ᩳ;Ll/۫ۨᩳ;)V
    .locals 2

    .line 39
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ܶ֡ᩳ;

    invoke-direct {v0, p2}, Ll/ܶ֡ᩳ;-><init>(Ll/۫ۨᩳ;)V

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object v0, p0, Ll/ۙ֡ᩳ;->֫:Ljava/util/function/BooleanSupplier;

    const v0, 0x7f0a059c

    .line 48
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۛ֡ᩳ;

    iput-object v0, p0, Ll/ۙ֡ᩳ;->ܽ:Ll/ۛ֡ᩳ;

    const v1, 0x7f0a059d

    .line 49
    invoke-virtual {p1, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۗ֡ᩳ;

    iput-object p1, p0, Ll/ۙ֡ᩳ;->ۧ:Ll/ۗ֡ᩳ;

    .line 61
    invoke-virtual {p0}, Ll/ۙ֡ᩳ;->֫()V

    .line 63
    invoke-virtual {p1, v0, p2, p2}, Ll/ۗ֡ᩳ;->֫(Ll/ۛ֡ᩳ;Ll/ܽܰᩳ;Landroid/view/View;)V

    .line 64
    new-instance p1, Ll/᩶֡ᩳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p1}, Ll/ۛ֡ᩳ;->֫(Ll/ۖܰۧ;)V

    return-void
.end method

.method public static bridge synthetic ֫(I)V
    .locals 0

    .line 0
    sput p0, Ll/ۙ֡ᩳ;->ܳ:I

    return-void
.end method

.method public static synthetic ֫(Ll/ۙ֡ᩳ;)V
    .locals 2

    .line 150
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 151
    iget-object v1, p0, Ll/ۙ֡ᩳ;->ܽ:Ll/ۛ֡ᩳ;

    invoke-virtual {v1, v0}, Ll/ۛ֡ᩳ;->֫(Ljava/util/ArrayList;)V

    .line 152
    invoke-virtual {p0}, Ll/ۙ֡ᩳ;->֫()V

    return-void
.end method

.method public static synthetic ۧ()V
    .locals 3

    .line 106
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    .line 107
    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    sget-boolean v1, Ll/ۙ֡ᩳ;->ܿ:Z

    const-string v2, "tfcge"

    .line 108
    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    .line 109
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ۧ(Z)V
    .locals 3

    .line 103
    sget-boolean v0, Ll/ۙ֡ᩳ;->ܿ:Z

    if-eq v0, p0, :cond_0

    .line 104
    sput-boolean p0, Ll/ۙ֡ᩳ;->ܿ:Z

    .line 106
    new-instance p0, Ll/۠֡ᩳ;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll/۠֡ᩳ;-><init>(I)V

    const-string v0, "tfcge"

    const-wide/16 v1, 0x1388

    invoke-static {v0, v1, v2, p0}, Ll/֫ۨۡ;->֫(Ljava/lang/Object;JLjava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܽ()I
    .locals 1

    .line 0
    sget v0, Ll/ۙ֡ᩳ;->ܳ:I

    return v0
.end method

.method public static ܽ(Z)V
    .locals 2

    .line 94
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "tfrge"

    .line 0
    invoke-static {v0, v1, p0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 95
    sput-boolean p0, Ll/ۙ֡ᩳ;->᩻:Z

    return-void
.end method

.method public static ܿ()Z
    .locals 1

    .line 90
    sget-boolean v0, Ll/ۙ֡ᩳ;->᩻:Z

    return v0
.end method

.method public static ᩳ()Z
    .locals 1

    .line 99
    sget-boolean v0, Ll/ۙ֡ᩳ;->ܿ:Z

    return v0
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 136
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "symbol_input"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Ll/ۙ֡ᩳ;->֫:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0, v2}, Ll/ۙ֡ᩳ;->֫(Z)V

    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/֫ܿܿ;Ll/ۤۤᩳ;Ll/ۤۤᩳ;)V
    .locals 3

    .line 144
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 145
    invoke-interface {p2}, Ll/֫ܿܿ;->֫()Ll/۫ۨᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܽۧ()I

    move-result v1

    iget-object v2, p0, Ll/ۙ֡ᩳ;->ܽ:Ll/ۛ֡ᩳ;

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 146
    invoke-virtual {v2, v0, p2, p3, p4}, Ll/ۛ֡ᩳ;->֫(Ljava/util/ArrayList;Ll/֫ܿܿ;Ll/ۤۤᩳ;Ll/ۤۤᩳ;)V

    .line 147
    sget p2, Ll/ۙ֡ᩳ;->ܳ:I

    invoke-virtual {v2, p2}, Ll/ۛ֡ᩳ;->֫(I)V

    .line 149
    invoke-static {}, Ll/۠ܳܿ;->ۧ()Ll/ۚۡ֫;

    move-result-object p2

    new-instance p3, Ll/᩸֡ᩳ;

    const/4 p4, 0x0

    invoke-direct {p3, p4, p0}, Ll/᩸֡ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p1, p3}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 118
    iget-object v0, p0, Ll/ۙ֡ᩳ;->ۧ:Ll/ۗ֡ᩳ;

    iget-object v1, p0, Ll/ۙ֡ᩳ;->ܽ:Ll/ۛ֡ᩳ;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 119
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 120
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/16 p1, 0x8

    .line 122
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 123
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
