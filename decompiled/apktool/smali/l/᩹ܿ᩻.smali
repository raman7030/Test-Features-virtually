.class public final Ll/᩹ܿ᩻;
.super Ll/ۗ۠ܳ;
.source "98AW"


# instance fields
.field public final synthetic ۛ:Ll/۫ܿ᩻;

.field public final synthetic ۨ:Ljava/lang/String;

.field public final synthetic ܰ:Ll/ۧۗ᩻;

.field public final synthetic ᩺:Ll/ۖۢܳ;


# direct methods
.method public constructor <init>(Ll/۫ܿ᩻;Ll/ܽۢܳ;Ljava/lang/String;ZLjava/lang/String;Ll/ۧۗ᩻;Ll/ۖۢܳ;Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Ll/᩹ܿ᩻;->ۛ:Ll/۫ܿ᩻;

    iput-object p6, p0, Ll/᩹ܿ᩻;->ܰ:Ll/ۧۗ᩻;

    iput-object p7, p0, Ll/᩹ܿ᩻;->᩺:Ll/ۖۢܳ;

    iput-object p8, p0, Ll/᩹ܿ᩻;->ۨ:Ljava/lang/String;

    invoke-direct {p0, p2, p3, p4, p5}, Ll/ۗ۠ܳ;-><init>(Ll/ܽۢܳ;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    .line 87
    invoke-virtual {p0}, Ll/ۗ۠ܳ;->֫()I

    move-result v2

    .line 88
    invoke-virtual {p0}, Ll/ۗ۠ܳ;->ܽ()I

    move-result v3

    .line 89
    iget-object p1, p0, Ll/᩹ܿ᩻;->ܰ:Ll/ۧۗ᩻;

    invoke-virtual {p1}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result p1

    iget-object v1, p0, Ll/᩹ܿ᩻;->᩺:Ll/ۖۢܳ;

    if-eqz p1, :cond_0

    .line 90
    invoke-virtual {v1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    new-instance p2, Ll/᩸ܿ᩻;

    invoke-direct {p2, p0, v1, v2, v3}, Ll/᩸ܿ᩻;-><init>(Ll/᩹ܿ᩻;Ll/ۖۢܳ;II)V

    iget-object v0, p0, Ll/᩹ܿ᩻;->ۨ:Ljava/lang/String;

    invoke-static {p2, p1, v0}, Ll/ۤۗܳ;->֫(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 93
    iget-object v0, p0, Ll/᩹ܿ᩻;->ۛ:Ll/۫ܿ᩻;

    invoke-static/range {v0 .. v5}, Ll/۫ܿ᩻;->֫(Ll/۫ܿ᩻;Ll/ۖۢܳ;IILl/ۨۧᩳ;Z)V

    :cond_1
    return-void
.end method
