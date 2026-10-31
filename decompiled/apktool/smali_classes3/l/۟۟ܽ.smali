.class public Ll/۟۟ܽ;
.super Ll/۫۟ܽ;
.source "K9RZ"


# instance fields
.field public ᩶ۧ:Ll/۠֫ᩳ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ll/۫۟ܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ᩴ۟ܽ;)V
    .locals 5

    .line 51
    invoke-virtual {p0}, Ll/۫۟ܽ;->ۧ֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Ll/۟۟ܽ;->᩶ۧ:Ll/۠֫ᩳ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 55
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 56
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ۟ܽ;

    .line 57
    iget-object v4, p0, Ll/۟۟ܽ;->᩶ۧ:Ll/۠֫ᩳ;

    invoke-virtual {v4, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ֫ᩳ;

    .line 58
    iget-object v3, v3, Ll/ۡ۟ܽ;->᩷:Ljava/lang/String;

    iput-object v3, v4, Ll/ܶ֫ᩳ;->ᩳ:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 61
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/۟۟ܽ;->᩶ۧ:Ll/۠֫ᩳ;

    invoke-virtual {v0}, Ll/۠֫ᩳ;->᩷()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    invoke-virtual {p1}, Ll/ᩴ۟ܽ;->run()V

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 546
    invoke-virtual {p0, p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public ֫(Z)V
    .locals 1

    .line 34
    new-instance p1, Ll/۠֫ᩳ;

    sget v0, Ll/ܿ֡ܿ;->֫:I

    .line 153
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 34
    invoke-direct {p1, v0}, Ll/۠֫ᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object p1, p0, Ll/۟۟ܽ;->᩶ۧ:Ll/۠֫ᩳ;

    return-void
.end method

.method public final ֫֫()Ljava/lang/String;
    .locals 1

    const-string v0, "INTERNAL:ArscTranslationEditor"

    return-object v0
.end method

.method public ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "ArscConfigTranslationMode"

    return-object v0
.end method

.method public final ۨ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ܳ֫()V
    .locals 8

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۟۟ܽ;->᩶ۧ:Ll/۠֫ᩳ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    iget-object v1, p0, Ll/۟۟ܽ;->᩶ۧ:Ll/۠֫ᩳ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 41
    iget-object v4, p0, Ll/۟۟ܽ;->᩶ۧ:Ll/۠֫ᩳ;

    invoke-virtual {v4, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ֫ᩳ;

    .line 42
    iget-object v5, v4, Ll/ܶ֫ᩳ;->ۧ:Ljava/lang/String;

    iget-object v6, v4, Ll/ܶ֫ᩳ;->ܽ:Ljava/lang/String;

    .line 24
    new-instance v7, Ll/ۡ۟ܽ;

    invoke-direct {v7, v5, v3, v6, v2}, Ll/ۡ۟ܽ;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 43
    iget-object v4, v4, Ll/ܶ֫ᩳ;->ᩳ:Ljava/lang/String;

    iput-object v4, v7, Ll/ۡ۟ܽ;->᩷:Ljava/lang/String;

    .line 44
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, v0}, Ll/۫۟ܽ;->֫(Ljava/util/ArrayList;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "<"

    .line 92
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "&"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 94
    :cond_1
    :try_start_0
    new-instance v1, Ll/۟ۖܽ;

    invoke-direct {v1}, Ll/۟ۖܽ;-><init>()V

    .line 95
    new-instance v2, Ljava/io/StringReader;

    invoke-direct {v2, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ll/۟ۖܽ;->֫(Ljava/io/Reader;)V

    .line 97
    :goto_0
    invoke-virtual {v1}, Ll/۟ۖܽ;->ۖ()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eq p1, v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return v0

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ֫()V
    .locals 3

    .line 143
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f12042f

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f1200f9

    .line 144
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    const v1, 0x7f120189

    const/4 v2, 0x0

    .line 145
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 146
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 121
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xc8

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 123
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x3c

    if-eq v2, v3, :cond_2

    const/16 v3, 0x26

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 112
    :cond_2
    :goto_1
    invoke-static {p1}, Ll/ۘۘܿ;->֫(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public final ᩺()Ljava/lang/String;
    .locals 6

    const v0, 0x7f12016b

    .line 433
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120168

    .line 72
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    const-string v3, ", "

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v2, "\u3002"

    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 76
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\uff0c"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 0
    :cond_1
    invoke-static {v0, v3, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
