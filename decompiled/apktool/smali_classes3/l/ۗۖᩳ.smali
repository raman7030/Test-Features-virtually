.class public Ll/ۗۖᩳ;
.super Ll/ۧۖᩳ;
.source "061N"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ll/ۧۖᩳ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V
    .locals 1

    .line 19
    invoke-super {p0, p1, p2}, Ll/ۧۖᩳ;->֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V

    const-string p1, "symbol_input"

    .line 20
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    const-string p1, "custom_symbols"

    .line 21
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    const-string p1, "edit_auto_indent"

    .line 22
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    const-string p1, "edit_indent_with_tabs"

    .line 23
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    const-string p1, "categoryLargeFiles"

    .line 25
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "ViewerPreferences"

    return-object v0
.end method
