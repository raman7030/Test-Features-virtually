.class public final Ll/᩵᩹ܳ;
.super Ll/֨ܶܳ;
.source "164Z"


# instance fields
.field public final ۙ:Ll/֫᩶ܳ;

.field public final synthetic ᩶:Ll/ܽ᩶ܳ;


# direct methods
.method public constructor <init>(Ll/ܽ᩶ܳ;Lbin/mt/plus/Main;Ll/֫᩶ܳ;)V
    .locals 0

    .line 382
    iput-object p1, p0, Ll/᩵᩹ܳ;->᩶:Ll/ܽ᩶ܳ;

    .line 12
    invoke-direct {p0, p2}, Ll/ۨ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 384
    iput-object p3, p0, Ll/᩵᩹ܳ;->ۙ:Ll/֫᩶ܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩵᩹ܳ;)Ll/֫᩶ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵᩹ܳ;->ۙ:Ll/֫᩶ܳ;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 394
    iget-object p1, p0, Ll/᩵᩹ܳ;->᩶:Ll/ܽ᩶ܳ;

    iget-object p1, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p1}, Ll/ۗܶܳ;->ܽ()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Ll/֨ܶܳ;->᩹:Ll/ۡۤۡ;

    invoke-virtual {p1}, Ll/ۡۤۡ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 396
    :cond_0
    iget-object p1, p0, Ll/᩵᩹ܳ;->ۙ:Ll/֫᩶ܳ;

    iget-object v0, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-interface {p1, v0}, Ll/֫᩶ܳ;->֫(Lbin/mt/plus/Main;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
