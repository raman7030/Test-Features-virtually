.class public Ll/۟᩶᩷;
.super Ll/᩸᩸ۧ;
.source "S54T"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ll/᩸᩸ۧ;-><init>()V

    return-void
.end method

.method private ֫(Ll/ۗ᩸ۧ;)V
    .locals 5

    .line 87
    invoke-virtual {p1}, Ll/ۗ᩸ۧ;->ۢ֫()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    .line 88
    invoke-virtual {p1, v1}, Ll/ۗ᩸ۧ;->ܳ(I)Ll/֫᩸ۧ;

    move-result-object v2

    .line 89
    instance-of v3, v2, Ll/᩵ܶۧ;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Ll/᩵ܶۧ;

    .line 90
    invoke-static {}, Ll/֫ۙ᩷;->ۨ()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v2}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 91
    invoke-virtual {v3}, Ll/᩵ܶۧ;->᩵֫()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v3, v2}, Ll/᩵ܶۧ;->֫(Ljava/lang/CharSequence;)V

    .line 93
    :cond_0
    invoke-virtual {v3, p0}, Ll/֫᩸ۧ;->֫(Ll/۟᩶᩷;)V

    goto :goto_1

    .line 94
    :cond_1
    instance-of v3, v2, Ll/֨᩹ۧ;

    if-eqz v3, :cond_2

    .line 95
    invoke-virtual {v2, p0}, Ll/֫᩸ۧ;->֫(Ll/۟᩶᩷;)V

    goto :goto_1

    .line 96
    :cond_2
    instance-of v3, v2, Ll/ۜܶۧ;

    if-eqz v3, :cond_3

    .line 97
    invoke-virtual {v2, p0}, Ll/֫᩸ۧ;->֫(Ll/۟᩶᩷;)V

    goto :goto_1

    .line 98
    :cond_3
    instance-of v3, v2, Ll/ᩳ۬᩷;

    if-eqz v3, :cond_4

    .line 99
    invoke-virtual {v2, p0}, Ll/֫᩸ۧ;->֫(Ll/۟᩶᩷;)V

    goto :goto_1

    .line 100
    :cond_4
    instance-of v3, v2, Ll/ۗ᩸ۧ;

    if-eqz v3, :cond_5

    .line 101
    check-cast v2, Ll/ۗ᩸ۧ;

    invoke-direct {p0, v2}, Ll/۟᩶᩷;->֫(Ll/ۗ᩸ۧ;)V

    :cond_5
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫᩸ۧ;Ljava/lang/Object;)V
    .locals 3

    .line 108
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object v0

    instance-of v1, v0, Ll/֫ۙ᩷;

    if-eqz v1, :cond_0

    check-cast v0, Ll/֫ۙ᩷;

    .line 109
    invoke-virtual {v0, p0, p1, p2}, Ll/֫ۙ᩷;->֫(Ll/۟᩶᩷;Ll/֫᩸ۧ;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    instance-of v0, p1, Ll/᩵ܶۧ;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ll/᩵ܶۧ;

    .line 114
    invoke-static {}, Ll/֫ۙ᩷;->ۨ()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 117
    :cond_1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p2}, Ll/᩵ܶۧ;->ܽ(Ljava/lang/String;)I

    move-result p2

    .line 118
    invoke-virtual {v0}, Ll/᩵ܶۧ;->ᩴ֫()[Ljava/lang/CharSequence;

    move-result-object v0

    aget-object p2, v0, p2

    invoke-virtual {p1, p2}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 73
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "preferencesName"

    .line 74
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 75
    invoke-virtual {p0}, Ll/᩸᩸ۧ;->ܽ()Ll/ܿ᩹ۧ;

    move-result-object v2

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ܿ᩹ۧ;->֫(Ljava/lang/String;)V

    :cond_0
    const-string v1, "layoutID"

    .line 76
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Ll/᩸᩸ۧ;->֫(I)V

    .line 77
    invoke-virtual {p0}, Ll/᩸᩸ۧ;->ᩳ()Ll/ۜ᩹ۧ;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/۟᩶᩷;->֫(Ll/ۗ᩸ۧ;)V

    .line 78
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object v1

    instance-of v2, v1, Ll/֫ۙ᩷;

    if-eqz v2, :cond_1

    check-cast v1, Ll/֫ۙ᩷;

    .line 79
    invoke-virtual {p0}, Ll/᩸᩸ۧ;->ᩳ()Ll/ۜ᩹ۧ;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Ll/֫ۙ᩷;->֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V

    :cond_1
    const-string v1, "scrollTo"

    .line 81
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 82
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ll/᩸᩸ۧ;->ۧ(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
