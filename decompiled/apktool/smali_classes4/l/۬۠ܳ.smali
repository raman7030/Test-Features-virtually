.class public final Ll/۬۠ܳ;
.super Ll/֨ܶܳ;
.source "M5NX"

# interfaces
.implements Ll/ۤ۠ܳ;


# instance fields
.field public final synthetic ۗ:Ll/ۛ۠ܳ;

.field public final ۙ:Ljava/lang/String;

.field public final ۫:I

.field public final ۬:Ljava/lang/String;

.field public final ᩶:Ll/ۨܺ᩷;


# direct methods
.method public constructor <init>(Ll/ۛ۠ܳ;Lbin/mt/plus/Main;Ll/ܽ᩷ܳ;)V
    .locals 0

    .line 96
    iput-object p1, p0, Ll/۬۠ܳ;->ۗ:Ll/ۛ۠ܳ;

    .line 12
    invoke-direct {p0, p2}, Ll/ۨ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 98
    invoke-virtual {p3}, Ll/ܽ᩷ܳ;->ܳ()Ll/۫ۜܳ;

    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ll/۫ۜܳ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/۬۠ܳ;->۬:Ljava/lang/String;

    .line 100
    invoke-virtual {p1}, Ll/۫ۜܳ;->ܽ()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/۬۠ܳ;->ۙ:Ljava/lang/String;

    .line 101
    invoke-virtual {p1}, Ll/۫ۜܳ;->֫()Ll/᩶ۖܳ;

    move-result-object p1

    .line 252
    iget-object p1, p1, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    .line 101
    iput-object p1, p0, Ll/۬۠ܳ;->᩶:Ll/ۨܺ᩷;

    .line 102
    invoke-virtual {p3}, Ll/ܽ᩷ܳ;->᩷()I

    move-result p1

    iput p1, p0, Ll/۬۠ܳ;->۫:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬۠ܳ;)Ll/ۨܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬۠ܳ;->᩶:Ll/ۨܺ᩷;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۬۠ܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬۠ܳ;->ۙ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/۬۠ܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬۠ܳ;->۬:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 117
    iget-object p1, p0, Ll/۬۠ܳ;->ۗ:Ll/ۛ۠ܳ;

    iget-object v0, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/ۗܶܳ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/֨ܶܳ;->᩹:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 119
    :cond_0
    iget-object v0, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {v0}, Lbin/mt/plus/Main;->ۨ()V

    .line 120
    invoke-virtual {v0}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 121
    iget v1, p0, Ll/۬۠ܳ;->۫:I

    invoke-virtual {v0, v1}, Ll/ۢۘܳ;->ܽ(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 122
    invoke-static {p1}, Ll/ۛ۠ܳ;->֫(Ll/ۛ۠ܳ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫()I
    .locals 1

    .line 112
    iget v0, p0, Ll/۬۠ܳ;->۫:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method
