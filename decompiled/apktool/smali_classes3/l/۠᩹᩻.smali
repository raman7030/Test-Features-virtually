.class public final Ll/۠᩹᩻;
.super Ll/ۗ۠ܳ;
.source "P1ZZ"


# instance fields
.field public final synthetic ۛ:Ll/᩶᩹᩻;

.field public final synthetic ۨ:Ljava/lang/String;

.field public final synthetic ܰ:Ll/ۧۗ᩻;

.field public final synthetic ᩺:Ll/ۖۢܳ;


# direct methods
.method public constructor <init>(Ll/᩶᩹᩻;Ll/ܽۢܳ;Ljava/lang/String;ZLjava/lang/String;Ll/ۧۗ᩻;Ll/ۖۢܳ;Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Ll/۠᩹᩻;->ۛ:Ll/᩶᩹᩻;

    iput-object p6, p0, Ll/۠᩹᩻;->ܰ:Ll/ۧۗ᩻;

    iput-object p7, p0, Ll/۠᩹᩻;->᩺:Ll/ۖۢܳ;

    iput-object p8, p0, Ll/۠᩹᩻;->ۨ:Ljava/lang/String;

    invoke-direct {p0, p2, p3, p4, p5}, Ll/ۗ۠ܳ;-><init>(Ll/ܽۢܳ;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic ֫(Ll/۠᩹᩻;Ll/ۖۢܳ;Ll/ۨۧᩳ;Z)V
    .locals 1

    .line 95
    iget-object v0, p0, Ll/۠᩹᩻;->ۛ:Ll/᩶᩹᩻;

    invoke-virtual {p0}, Ll/ۗ۠ܳ;->ܽ()I

    move-result p0

    invoke-static {v0, p1, p0, p2, p3}, Ll/᩶᩹᩻;->֫(Ll/᩶᩹᩻;Ll/ۖۢܳ;ILl/ۨۧᩳ;Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    .line 93
    iget-object p1, p0, Ll/۠᩹᩻;->ܰ:Ll/ۧۗ᩻;

    invoke-virtual {p1}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result p1

    iget-object p2, p0, Ll/۠᩹᩻;->᩺:Ll/ۖۢܳ;

    if-eqz p1, :cond_0

    .line 94
    invoke-virtual {p2}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    new-instance v0, Ll/֨᩹᩻;

    invoke-direct {v0, p0, p2}, Ll/֨᩹᩻;-><init>(Ll/۠᩹᩻;Ll/ۖۢܳ;)V

    iget-object p2, p0, Ll/۠᩹᩻;->ۨ:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Ll/ۤۗܳ;->֫(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    .line 97
    :cond_0
    invoke-virtual {p0}, Ll/ۗ۠ܳ;->ܽ()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/۠᩹᩻;->ۛ:Ll/᩶᩹᩻;

    invoke-static {v2, p2, p1, v0, v1}, Ll/᩶᩹᩻;->֫(Ll/᩶᩹᩻;Ll/ۖۢܳ;ILl/ۨۧᩳ;Z)V

    :cond_1
    return-void
.end method
