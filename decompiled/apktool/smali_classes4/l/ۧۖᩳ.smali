.class public Ll/ۧۖᩳ;
.super Ll/ۡۘᩳ;
.source "P53D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ll/ۡۘᩳ;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V
    .locals 1

    .line 17
    invoke-super {p0, p1, p2}, Ll/ۡۘᩳ;->֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V

    const-string p1, "categoryOther"

    .line 18
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    const-string p1, "text_page_size"

    .line 20
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܳ(Z)V

    return-void
.end method

.method public ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "EditorPreferences"

    return-object v0
.end method
