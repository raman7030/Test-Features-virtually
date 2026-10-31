.class public final Ll/᩸ᩴܿ;
.super Ljava/lang/Object;
.source "014Z"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ۙ:Ll/᩶ۡۡ;

.field public final synthetic ᩶:Ll/᩶ۡۡ;

.field public final synthetic ᩸:Ll/ۗᩴܿ;

.field public final synthetic ᩹:Ll/ᩴᩴܿ;


# direct methods
.method public constructor <init>(Ll/ۗᩴܿ;Ll/ᩴᩴܿ;Ll/᩶ۡۡ;Ll/᩶ۡۡ;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ᩴܿ;->᩸:Ll/ۗᩴܿ;

    iput-object p2, p0, Ll/᩸ᩴܿ;->᩹:Ll/ᩴᩴܿ;

    iput-object p3, p0, Ll/᩸ᩴܿ;->᩶:Ll/᩶ۡۡ;

    iput-object p4, p0, Ll/᩸ᩴܿ;->ۙ:Ll/᩶ۡۡ;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 72
    iget-object p2, p0, Ll/᩸ᩴܿ;->᩹:Ll/ᩴᩴܿ;

    invoke-virtual {p2, p3}, Ll/֫᩷ۡ;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۠ᩴܿ;

    .line 73
    iget-object p4, p0, Ll/᩸ᩴܿ;->᩸:Ll/ۗᩴܿ;

    invoke-static {p4, p2}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;Ll/۠ᩴܿ;)V

    if-nez p2, :cond_0

    .line 75
    invoke-virtual {p0, p1}, Ll/᩸ᩴܿ;->onNothingSelected(Landroid/widget/AdapterView;)V

    return-void

    .line 78
    :cond_0
    invoke-static {p4}, Ll/ۗᩴܿ;->ᩳ(Ll/ۗᩴܿ;)V

    .line 79
    invoke-virtual {p4, p3}, Ll/ۗᩴܿ;->֫(I)V

    .line 80
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string p3, "text_translator_engine"

    invoke-interface {p2}, Ll/۠ᩴܿ;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 1

    const/4 p1, 0x0

    .line 85
    iget-object v0, p0, Ll/᩸ᩴܿ;->᩸:Ll/ۗᩴܿ;

    invoke-static {v0, p1}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;Ll/۠ᩴܿ;)V

    .line 86
    iget-object p1, p0, Ll/᩸ᩴܿ;->᩶:Ll/᩶ۡۡ;

    invoke-static {p1}, Ll/ۗᩴܿ;->֫(Ll/᩶ۡۡ;)V

    .line 87
    iget-object p1, p0, Ll/᩸ᩴܿ;->ۙ:Ll/᩶ۡۡ;

    invoke-static {p1}, Ll/ۗᩴܿ;->֫(Ll/᩶ۡۡ;)V

    const/4 p1, -0x1

    .line 88
    invoke-virtual {v0, p1}, Ll/ۗᩴܿ;->֫(I)V

    return-void
.end method
