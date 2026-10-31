.class public Ll/ۚܶۧ;
.super Ll/ᩳ᩸ۧ;
.source "Q4II"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public ۛ:I

.field public ۨ:[Ljava/lang/CharSequence;

.field public ᩺:[Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 45
    invoke-direct {p0}, Ll/ᩳ᩸ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 62
    invoke-super {p0, p1}, Ll/ᩳ᩸ۧ;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_1

    .line 90
    invoke-virtual {p0}, Ll/ᩳ᩸ۧ;->֫()Ll/ۧܶۧ;

    move-result-object p1

    check-cast p1, Ll/᩵ܶۧ;

    .line 66
    invoke-virtual {p1}, Ll/᩵ܶۧ;->ᩴ֫()[Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/᩵ܶۧ;->֡֫()[Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 71
    invoke-virtual {p1}, Ll/᩵ܶۧ;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ܶۧ;->ܽ(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۚܶۧ;->ۛ:I

    .line 72
    invoke-virtual {p1}, Ll/᩵ܶۧ;->ᩴ֫()[Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܶۧ;->ۨ:[Ljava/lang/CharSequence;

    .line 73
    invoke-virtual {p1}, Ll/᩵ܶۧ;->֡֫()[Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/ۚܶۧ;->᩺:[Ljava/lang/CharSequence;

    return-void

    .line 67
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ListPreference requires an entries array and an entryValues array."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string v0, "ListPreferenceDialogFragment.index"

    const/4 v1, 0x0

    .line 75
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ۚܶۧ;->ۛ:I

    const-string v0, "ListPreferenceDialogFragment.entries"

    .line 76
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܶۧ;->ۨ:[Ljava/lang/CharSequence;

    const-string v0, "ListPreferenceDialogFragment.entryValues"

    .line 77
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/ۚܶۧ;->᩺:[Ljava/lang/CharSequence;

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 83
    invoke-super {p0, p1}, Ll/ᩳ᩸ۧ;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "ListPreferenceDialogFragment.index"

    .line 84
    iget v1, p0, Ll/ۚܶۧ;->ۛ:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "ListPreferenceDialogFragment.entries"

    .line 85
    iget-object v1, p0, Ll/ۚܶۧ;->ۨ:[Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    const-string v0, "ListPreferenceDialogFragment.entryValues"

    .line 86
    iget-object v1, p0, Ll/ۚܶۧ;->᩺:[Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/app/AlertDialog$Builder;)V
    .locals 3

    .line 97
    iget-object v0, p0, Ll/ۚܶۧ;->ۨ:[Ljava/lang/CharSequence;

    iget v1, p0, Ll/ۚܶۧ;->ۛ:I

    new-instance v2, Ll/֡ܶۧ;

    invoke-direct {v2, p0}, Ll/֡ܶۧ;-><init>(Ll/ۚܶۧ;)V

    invoke-virtual {p1, v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const/4 v0, 0x0

    .line 113
    invoke-virtual {p1, v0, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    return-void
.end method

.method public final ֫(Z)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 90
    invoke-virtual {p0}, Ll/ᩳ᩸ۧ;->֫()Ll/ۧܶۧ;

    move-result-object v0

    check-cast v0, Ll/᩵ܶۧ;

    if-eqz p1, :cond_0

    .line 123
    iget p1, p0, Ll/ۚܶۧ;->ۛ:I

    if-ltz p1, :cond_0

    .line 124
    iget-object v1, p0, Ll/ۚܶۧ;->᩺:[Ljava/lang/CharSequence;

    aget-object p1, v1, p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 125
    invoke-virtual {v0, p1}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    .line 126
    invoke-virtual {v0, p1}, Ll/᩵ܶۧ;->ᩳ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
