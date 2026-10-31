.class public final Ll/᩺ܽ֫;
.super Ll/ܰܽ֫;
.source "DB30"


# instance fields
.field public volatile ۧ:Ll/᩺ᩳ֫;

.field public volatile ܽ:Ll/᩸ᩳ֫;


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;IIZ)Ljava/lang/CharSequence;
    .locals 1

    .line 1777
    iget-object v0, p0, Ll/᩺ܽ֫;->ܽ:Ll/᩸ᩳ֫;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩸ᩳ֫;->֫(Ljava/lang/CharSequence;IIZ)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/view/inputmethod/EditorInfo;)V
    .locals 3

    .line 1782
    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v1, p0, Ll/᩺ܽ֫;->ۧ:Ll/᩺ᩳ֫;

    invoke-virtual {v1}, Ll/᩺ᩳ֫;->ܽ()I

    move-result v1

    const-string v2, "android.support.text.emoji.emojiCompat_metadataVersion"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 1783
    iget-object p1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    const-string v0, "android.support.text.emoji.emojiCompat_replaceAll"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ֫(Ll/᩺ᩳ֫;)V
    .locals 5

    .line 1735
    iput-object p1, p0, Ll/᩺ܽ֫;->ۧ:Ll/᩺ᩳ֫;

    .line 1736
    new-instance p1, Ll/᩸ᩳ֫;

    iget-object v0, p0, Ll/᩺ܽ֫;->ۧ:Ll/᩺ᩳ֫;

    iget-object v1, p0, Ll/ܰܽ֫;->֫:Ll/ۜᩳ֫;

    .line 1738
    invoke-static {v1}, Ll/ۜᩳ֫;->֫(Ll/ۜᩳ֫;)Ll/֫ᩳ֫;

    move-result-object v1

    iget-object v2, p0, Ll/ܰܽ֫;->֫:Ll/ۜᩳ֫;

    .line 1739
    invoke-static {v2}, Ll/ۜᩳ֫;->ۧ(Ll/ۜᩳ֫;)Ll/ۧᩳ֫;

    move-result-object v2

    .line 35
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x22

    if-lt v3, v4, :cond_0

    .line 36
    invoke-static {}, Ll/᩵ᩳ֫;->֫()Ljava/util/Set;

    move-result-object v3

    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, Ll/֡ᩳ֫;->֫()Ljava/util/Set;

    move-result-object v3

    .line 1742
    :goto_0
    invoke-direct {p1, v0, v1, v2, v3}, Ll/᩸ᩳ֫;-><init>(Ll/᩺ᩳ֫;Ll/֫ᩳ֫;Ll/ۧᩳ֫;Ljava/util/Set;)V

    iput-object p1, p0, Ll/᩺ܽ֫;->ܽ:Ll/᩸ᩳ֫;

    .line 1745
    iget-object p1, p0, Ll/ܰܽ֫;->֫:Ll/ۜᩳ֫;

    invoke-virtual {p1}, Ll/ۜᩳ֫;->ܽ()V

    return-void
.end method
