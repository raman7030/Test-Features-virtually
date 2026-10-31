.class public Ll/ۙܶۧ;
.super Ll/ᩳ᩸ۧ;
.source "956H"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public ۛ:[Ljava/lang/CharSequence;

.field public ۨ:[Ljava/lang/CharSequence;

.field public ܰ:Z

.field public ᩺:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 53
    invoke-direct {p0}, Ll/ᩳ᩸ۧ;-><init>()V

    .line 44
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۙܶۧ;->᩺:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 71
    invoke-super {p0, p1}, Ll/ᩳ᩸ۧ;->onCreate(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    .line 73
    iget-object v1, p0, Ll/ۙܶۧ;->᩺:Ljava/util/HashSet;

    if-nez p1, :cond_1

    .line 106
    invoke-virtual {p0}, Ll/ᩳ᩸ۧ;->֫()Ll/ۧܶۧ;

    move-result-object p1

    check-cast p1, Ll/᩹ܶۧ;

    .line 76
    invoke-virtual {p1}, Ll/᩹ܶۧ;->ᩴ֫()[Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ll/᩹ܶۧ;->᩵֫()[Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 82
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 83
    invoke-virtual {p1}, Ll/᩹ܶۧ;->֡֫()Ljava/util/HashSet;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 84
    iput-boolean v0, p0, Ll/ۙܶۧ;->ܰ:Z

    .line 85
    invoke-virtual {p1}, Ll/᩹ܶۧ;->ᩴ֫()[Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ۙܶۧ;->ۛ:[Ljava/lang/CharSequence;

    .line 86
    invoke-virtual {p1}, Ll/᩹ܶۧ;->᩵֫()[Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܶۧ;->ۨ:[Ljava/lang/CharSequence;

    return-void

    .line 77
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "MultiSelectListPreference requires an entries array and an entryValues array."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 88
    :cond_1
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    const-string v2, "MultiSelectListPreferenceDialogFragment.values"

    .line 89
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    const-string v1, "MultiSelectListPreferenceDialogFragment.changed"

    .line 90
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۙܶۧ;->ܰ:Z

    const-string v0, "MultiSelectListPreferenceDialogFragment.entries"

    .line 91
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ۙܶۧ;->ۛ:[Ljava/lang/CharSequence;

    const-string v0, "MultiSelectListPreferenceDialogFragment.entryValues"

    .line 92
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܶۧ;->ۨ:[Ljava/lang/CharSequence;

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 98
    invoke-super {p0, p1}, Ll/ᩳ᩸ۧ;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۙܶۧ;->᩺:Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v1, "MultiSelectListPreferenceDialogFragment.values"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "MultiSelectListPreferenceDialogFragment.changed"

    .line 100
    iget-boolean v1, p0, Ll/ۙܶۧ;->ܰ:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "MultiSelectListPreferenceDialogFragment.entries"

    .line 101
    iget-object v1, p0, Ll/ۙܶۧ;->ۛ:[Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    const-string v0, "MultiSelectListPreferenceDialogFragment.entryValues"

    .line 102
    iget-object v1, p0, Ll/ۙܶۧ;->ۨ:[Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/app/AlertDialog$Builder;)V
    .locals 5

    .line 113
    iget-object v0, p0, Ll/ۙܶۧ;->ۨ:[Ljava/lang/CharSequence;

    array-length v0, v0

    .line 114
    new-array v1, v0, [Z

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 116
    iget-object v3, p0, Ll/ۙܶۧ;->ۨ:[Ljava/lang/CharSequence;

    aget-object v3, v3, v2

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ll/ۙܶۧ;->᩺:Ljava/util/HashSet;

    invoke-virtual {v4, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    aput-boolean v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 118
    :cond_0
    iget-object v0, p0, Ll/ۙܶۧ;->ۛ:[Ljava/lang/CharSequence;

    new-instance v2, Ll/᩶ܶۧ;

    invoke-direct {v2, p0}, Ll/᩶ܶۧ;-><init>(Ll/ۙܶۧ;)V

    invoke-virtual {p1, v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setMultiChoiceItems([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroid/app/AlertDialog$Builder;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 106
    invoke-virtual {p0}, Ll/ᩳ᩸ۧ;->֫()Ll/ۧܶۧ;

    move-result-object v0

    check-cast v0, Ll/᩹ܶۧ;

    if-eqz p1, :cond_0

    .line 140
    iget-boolean p1, p0, Ll/ۙܶۧ;->ܰ:Z

    if-eqz p1, :cond_0

    .line 142
    iget-object p1, p0, Ll/ۙܶۧ;->᩺:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    .line 143
    invoke-virtual {v0, p1}, Ll/᩹ܶۧ;->ܽ(Ljava/util/Set;)V

    :cond_0
    const/4 p1, 0x0

    .line 146
    iput-boolean p1, p0, Ll/ۙܶۧ;->ܰ:Z

    return-void
.end method
