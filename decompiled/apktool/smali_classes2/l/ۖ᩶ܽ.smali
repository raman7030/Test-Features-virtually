.class public final synthetic Ll/ۖ᩶ܽ;
.super Ljava/lang/Object;
.source "34R9"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/᩷᩶ܽ;

.field public final synthetic ۙ:Ll/ۚۖۡ;

.field public final synthetic ᩶:Ll/ۚۖۡ;

.field public final synthetic ᩸:Ll/ᩴ᩶ܽ;

.field public final synthetic ᩹:Landroid/widget/Spinner;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴ᩶ܽ;Landroid/widget/Spinner;Ll/ۚۖۡ;Ll/ۚۖۡ;Ll/᩷᩶ܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩶ܽ;->᩸:Ll/ᩴ᩶ܽ;

    iput-object p2, p0, Ll/ۖ᩶ܽ;->᩹:Landroid/widget/Spinner;

    iput-object p3, p0, Ll/ۖ᩶ܽ;->᩶:Ll/ۚۖۡ;

    iput-object p4, p0, Ll/ۖ᩶ܽ;->ۙ:Ll/ۚۖۡ;

    iput-object p5, p0, Ll/ۖ᩶ܽ;->ۗ:Ll/᩷᩶ܽ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    .line 42
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string p2, "dex_search_type_class"

    .line 43
    iget-object v0, p0, Ll/ۖ᩶ܽ;->᩹:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    invoke-interface {p1, v1, p2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    .line 44
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 45
    iget-object p1, p0, Ll/ۖ᩶ܽ;->᩶:Ll/ۚۖۡ;

    invoke-virtual {p1}, Ll/ۚۖۡ;->ܳ()V

    .line 46
    iget-object p2, p0, Ll/ۖ᩶ܽ;->ۙ:Ll/ۚۖۡ;

    invoke-virtual {p2}, Ll/ۚۖۡ;->ܳ()V

    .line 47
    invoke-virtual {p1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 48
    invoke-virtual {p2}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 49
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v6

    .line 51
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 52
    new-instance p1, Ll/ۘ᩶ܽ;

    iget-object v2, p0, Ll/ۖ᩶ܽ;->᩸:Ll/ᩴ᩶ܽ;

    iget-object v3, p0, Ll/ۖ᩶ܽ;->ۗ:Ll/᩷᩶ܽ;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Ll/ۘ᩶ܽ;-><init>(Ll/ᩴ᩶ܽ;Ll/᩷᩶ܽ;Ljava/lang/String;Ljava/lang/String;I)V

    .line 81
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    :cond_0
    return-void
.end method
