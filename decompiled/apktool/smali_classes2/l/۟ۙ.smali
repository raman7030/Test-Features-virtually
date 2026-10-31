.class public final Ll/۟ۙ;
.super Ljava/lang/Object;
.source "L3XU"


# instance fields
.field public ֫:Landroid/content/ComponentName;

.field public ۖ:I

.field public ۜ:[Landroid/content/Intent;

.field public ۡ:Ljava/lang/CharSequence;

.field public ۢ:Ll/ۙۙ;

.field public ۧ:Ljava/util/Set;

.field public ܳ:Ll/ۙ۬;

.field public ܺ:[Ll/ܰ᩶;

.field public ܽ:Landroid/content/Context;

.field public ܿ:Landroid/os/PersistableBundle;

.field public ᩳ:Ljava/lang/CharSequence;

.field public ᩷:Ljava/lang/CharSequence;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 386
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 387
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ShortcutInfo;

    .line 388
    new-instance v2, Ll/ܰۙ;

    invoke-direct {v2, p0, v1}, Ll/ܰۙ;-><init>(Landroid/content/Context;Landroid/content/pm/ShortcutInfo;)V

    invoke-virtual {v2}, Ll/ܰۙ;->֫()Ll/۟ۙ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Ll/۟ۙ;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Landroid/content/Intent;
    .locals 2

    .line 297
    iget-object v0, p0, Ll/۟ۙ;->ۜ:[Landroid/content/Intent;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final ܽ()Ljava/lang/CharSequence;
    .locals 1

    .line 258
    iget-object v0, p0, Ll/۟ۙ;->᩷:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ᩳ()Landroid/content/pm/ShortcutInfo;
    .locals 7

    .line 126
    new-instance v0, Landroid/content/pm/ShortcutInfo$Builder;

    iget-object v0, p0, Ll/۟ۙ;->ܽ:Landroid/content/Context;

    iget-object v1, p0, Ll/۟ۙ;->᩻:Ljava/lang/String;

    new-instance v2, Landroid/content/pm/ShortcutInfo$Builder;

    invoke-direct {v2, v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v0, p0, Ll/۟ۙ;->᩷:Ljava/lang/CharSequence;

    .line 127
    invoke-virtual {v2, v0}, Landroid/content/pm/ShortcutInfo$Builder;->setShortLabel(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object v0

    iget-object v1, p0, Ll/۟ۙ;->ۜ:[Landroid/content/Intent;

    .line 128
    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setIntents([Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object v0

    .line 129
    iget-object v1, p0, Ll/۟ۙ;->ܳ:Ll/ۙ۬;

    if-eqz v1, :cond_0

    .line 130
    iget-object v2, p0, Ll/۟ۙ;->ܽ:Landroid/content/Context;

    invoke-virtual {v1, v2}, Ll/ۙ۬;->ۧ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 132
    :cond_0
    iget-object v1, p0, Ll/۟ۙ;->ۡ:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 133
    iget-object v1, p0, Ll/۟ۙ;->ۡ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setLongLabel(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 135
    :cond_1
    iget-object v1, p0, Ll/۟ۙ;->ᩳ:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 136
    iget-object v1, p0, Ll/۟ۙ;->ᩳ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setDisabledMessage(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 138
    :cond_2
    iget-object v1, p0, Ll/۟ۙ;->֫:Landroid/content/ComponentName;

    if-eqz v1, :cond_3

    .line 139
    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setActivity(Landroid/content/ComponentName;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 141
    :cond_3
    iget-object v1, p0, Ll/۟ۙ;->ۧ:Ljava/util/Set;

    if-eqz v1, :cond_4

    .line 142
    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setCategories(Ljava/util/Set;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 144
    :cond_4
    iget v1, p0, Ll/۟ۙ;->ۖ:I

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setRank(I)Landroid/content/pm/ShortcutInfo$Builder;

    .line 145
    iget-object v1, p0, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    if-eqz v1, :cond_5

    .line 146
    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 148
    :cond_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    const/4 v3, 0x0

    if-lt v1, v2, :cond_9

    .line 149
    iget-object v1, p0, Ll/۟ۙ;->ܺ:[Ll/ܰ᩶;

    if-eqz v1, :cond_7

    array-length v2, v1

    if-lez v2, :cond_7

    .line 150
    array-length v1, v1

    new-array v2, v1, [Landroid/app/Person;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_6

    .line 152
    iget-object v5, p0, Ll/۟ۙ;->ܺ:[Ll/ܰ᩶;

    aget-object v5, v5, v4

    invoke-virtual {v5}, Ll/ܰ᩶;->֫()Landroid/app/Person;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 154
    :cond_6
    invoke-virtual {v0, v2}, Landroid/content/pm/ShortcutInfo$Builder;->setPersons([Landroid/app/Person;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 156
    :cond_7
    iget-object v1, p0, Ll/۟ۙ;->ۢ:Ll/ۙۙ;

    if-eqz v1, :cond_8

    .line 157
    invoke-virtual {v1}, Ll/ۙۙ;->ۧ()Landroid/content/LocusId;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setLocusId(Landroid/content/LocusId;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 159
    :cond_8
    invoke-virtual {v0, v3}, Landroid/content/pm/ShortcutInfo$Builder;->setLongLived(Z)Landroid/content/pm/ShortcutInfo$Builder;

    goto :goto_2

    .line 177
    :cond_9
    iget-object v1, p0, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    if-nez v1, :cond_a

    .line 178
    new-instance v1, Landroid/os/PersistableBundle;

    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    iput-object v1, p0, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    .line 180
    :cond_a
    iget-object v1, p0, Ll/۟ۙ;->ܺ:[Ll/ܰ᩶;

    if-eqz v1, :cond_b

    array-length v2, v1

    if-lez v2, :cond_b

    .line 181
    iget-object v2, p0, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    const-string v4, "extraPersonCount"

    array-length v1, v1

    invoke-virtual {v2, v4, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/4 v1, 0x0

    .line 182
    :goto_1
    iget-object v2, p0, Ll/۟ۙ;->ܺ:[Ll/ܰ᩶;

    array-length v2, v2

    if-ge v1, v2, :cond_b

    .line 183
    iget-object v2, p0, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "extraPerson_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v5, v1, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Ll/۟ۙ;->ܺ:[Ll/ܰ᩶;

    aget-object v1, v6, v1

    .line 184
    invoke-virtual {v1}, Ll/ܰ᩶;->ۧ()Landroid/os/PersistableBundle;

    move-result-object v1

    .line 183
    invoke-virtual {v2, v4, v1}, Landroid/os/PersistableBundle;->putPersistableBundle(Ljava/lang/String;Landroid/os/PersistableBundle;)V

    move v1, v5

    goto :goto_1

    .line 187
    :cond_b
    iget-object v1, p0, Ll/۟ۙ;->ۢ:Ll/ۙۙ;

    if-eqz v1, :cond_c

    .line 188
    iget-object v2, p0, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    const-string v4, "extraLocusId"

    invoke-virtual {v1}, Ll/ۙۙ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v4, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    :cond_c
    iget-object v1, p0, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    const-string v2, "extraLongLived"

    invoke-virtual {v1, v2, v3}, Landroid/os/PersistableBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 191
    iget-object v1, p0, Ll/۟ۙ;->ܿ:Landroid/os/PersistableBundle;

    .line 164
    invoke-virtual {v0, v1}, Landroid/content/pm/ShortcutInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/content/pm/ShortcutInfo$Builder;

    .line 166
    :goto_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_d

    .line 167
    invoke-static {v0}, Ll/᩺ۙ;->֫(Landroid/content/pm/ShortcutInfo$Builder;)V

    .line 169
    :cond_d
    invoke-virtual {v0}, Landroid/content/pm/ShortcutInfo$Builder;->build()Landroid/content/pm/ShortcutInfo;

    move-result-object v0

    return-object v0
.end method
