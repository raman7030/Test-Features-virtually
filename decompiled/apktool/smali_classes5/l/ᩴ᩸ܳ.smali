.class public final Ll/ᩴ᩸ܳ;
.super Ll/֨ܶܳ;
.source "94PF"


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/lang/String;

.field public final ۫:Ljava/lang/String;

.field public final synthetic ۬:Ll/֡᩸ܳ;

.field public final ᩶:Ll/ۨܺ᩷;


# direct methods
.method public constructor <init>(Ll/֡᩸ܳ;Lbin/mt/plus/Main;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 107
    iput-object p1, p0, Ll/ᩴ᩸ܳ;->۬:Ll/֡᩸ܳ;

    .line 12
    invoke-direct {p0, p2}, Ll/ۨ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 105
    sget-object p1, Ll/᩶ۖܳ;->֡:Ll/᩶ۖܳ;

    .line 252
    iget-object p1, p1, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    .line 105
    iput-object p1, p0, Ll/ᩴ᩸ܳ;->᩶:Ll/ۨܺ᩷;

    .line 109
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩸ܳ;->۫:Ljava/lang/String;

    .line 110
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩸ܳ;->ۙ:Ljava/lang/String;

    const-string p2, "Android/data/"

    .line 111
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    .line 113
    iput-object p1, p0, Ll/ᩴ᩸ܳ;->ۗ:Ljava/lang/String;

    return-void

    .line 115
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩸ܳ;->ۗ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴ᩸ܳ;)Ll/ۨܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩸ܳ;->᩶:Ll/ۨܺ᩷;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴ᩸ܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩸ܳ;->ۙ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴ᩸ܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩸ܳ;->ۗ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴ᩸ܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩸ܳ;->۫:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 125
    iget-object p1, p0, Ll/ᩴ᩸ܳ;->۬:Ll/֡᩸ܳ;

    iget-object v0, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/ۗܶܳ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Ll/֨ܶܳ;->᩹:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 127
    iget-object v1, p0, Ll/ᩴ᩸ܳ;->ۙ:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 129
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    sget v0, Ll/ܿۛ᩷;->ۛۧ:I

    .line 1693
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ܿۛ᩷;

    iget-object v2, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "projectPath"

    .line 1694
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1695
    invoke-virtual {v2, v0}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 131
    :cond_1
    invoke-virtual {p1}, Ll/֡᩸ܳ;->ܿ()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method
