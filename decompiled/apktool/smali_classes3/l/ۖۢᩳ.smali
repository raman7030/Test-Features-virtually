.class public Ll/ۖۢᩳ;
.super Ll/ۧۖᩳ;
.source "G8VT"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ll/ۧۖᩳ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V
    .locals 1

    .line 17
    invoke-super {p0, p1, p2}, Ll/ۧۖᩳ;->֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V

    const-string p1, "edit_show_line_numbers"

    .line 18
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    const-string p1, "edit_fixed_line_numbers"

    .line 19
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    const-string p1, "edit_text_font_size"

    .line 20
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    const-string p1, "diff_text_font_size"

    .line 21
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ll/֫᩸ۧ;->ܳ(Z)V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "DiffPreferences"

    return-object v0
.end method
