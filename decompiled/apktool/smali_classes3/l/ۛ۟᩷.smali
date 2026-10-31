.class public Ll/ۛ۟᩷;
.super Ll/ۡ᩻֫;
.source "O1JS"

# interfaces
.implements Ll/ܶܳۡ;
.implements Ll/۠ܳۡ;


# instance fields
.field public ۗ:Z

.field public ۙ:Ll/ۧ۫᩷;

.field public ۤ:Ll/ۘۛ᩷;

.field public ۫:Ljava/util/Stack;

.field public ۬:Ll/۬۬ۧ;

.field public ᩶:Ll/ۧ۫᩷;

.field public ᩸:Ll/ۤ۟᩷;

.field public ᩹:Ll/᩵ۨ᩷;


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f0d01e2

    .line 62
    invoke-direct {p0, v0}, Ll/ۡ᩻֫;-><init>(I)V

    .line 58
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    return-void
.end method

.method public static synthetic ֫(Ll/ۛ۟᩷;)V
    .locals 1

    .line 253
    iget-object p0, p0, Ll/ۛ۟᩷;->۬:Ll/۬۬ۧ;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/۬۬ۧ;->suppressLayout(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛ۟᩷;Ll/ܽ᩻ۡ;)V
    .locals 1

    .line 267
    iget-object v0, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ܿ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    .line 268
    invoke-direct {p0}, Ll/ۛ۟᩷;->ܽ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛ۟᩷;Ll/ܽ᩻ۡ;ZLandroid/view/MenuItem;)V
    .locals 2

    .line 233
    invoke-interface {p3}, Landroid/view/MenuItem;->getItemId()I

    move-result p3

    const v0, 0x7f120530

    if-ne p3, v0, :cond_0

    .line 234
    iget-object p0, p0, Ll/ۛ۟᩷;->ۤ:Ll/ۘۛ᩷;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۘۛ᩷;->ۧ(Ljava/lang/String;)V

    goto :goto_1

    .line 237
    :cond_0
    iget-object p3, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    invoke-virtual {p3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֨ۛ᩷;

    if-eqz p2, :cond_2

    .line 239
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ll/֨ۛ᩷;->֫(Ljava/lang/String;)Ll/ۚۛ᩷;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    .line 242
    :cond_1
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ۜ()V

    .line 243
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/֨ۛ᩷;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 244
    :cond_2
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ll/۫ܿ᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Ll/۫ܿ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p3, p2, v0}, Ll/֨ۛ᩷;->֫(Ljava/lang/String;Ljava/lang/Runnable;)I

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    .line 247
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/ۛ۟᩷;->ᩳ()V

    .line 248
    iget-object p0, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    invoke-virtual {p0}, Ll/ۤ۟᩷;->ۚ()V

    :goto_1
    return-void
.end method

.method public static ֫(Ll/ۛ۟᩷;Ll/᩵ۨ᩷;)V
    .locals 7

    .line 73
    iput-object p1, p0, Ll/ۛ۟᩷;->᩹:Ll/᩵ۨ᩷;

    .line 74
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "dataFile"

    .line 75
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 76
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ll/ۧ۫᩷;

    iput-object p1, p0, Ll/ۛ۟᩷;->ۙ:Ll/ۧ۫᩷;

    const-string p1, "configFile"

    .line 77
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ll/ۧ۫᩷;

    iput-object p1, p0, Ll/ۛ۟᩷;->᩶:Ll/ۧ۫᩷;

    const/4 p1, 0x1

    .line 78
    iput-boolean p1, p0, Ll/ۛ۟᩷;->ۗ:Z

    goto :goto_0

    .line 80
    :cond_0
    new-instance v0, Ll/ۧ۫᩷;

    invoke-virtual {p1}, Ll/᩵ۨ᩷;->᩷()Ll/ۧ۫᩷;

    move-result-object v2

    const-string v3, "search"

    invoke-direct {v0, v2, v3}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۛ۟᩷;->ۙ:Ll/ۧ۫᩷;

    .line 81
    new-instance v0, Ll/ۧ۫᩷;

    invoke-virtual {p1}, Ll/᩵ۨ᩷;->᩷()Ll/ۧ۫᩷;

    move-result-object p1

    const-string v2, "searchCfg"

    invoke-direct {v0, p1, v2}, Ll/ۧ۫᩷;-><init>(Ll/ۧ۫᩷;Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۛ۟᩷;->᩶:Ll/ۧ۫᩷;

    .line 82
    iput-boolean v1, p0, Ll/ۛ۟᩷;->ۗ:Z

    .line 83
    iget-object p1, p0, Ll/ۛ۟᩷;->ۤ:Ll/ۘۛ᩷;

    new-instance v0, Ll/ۜ᩸ܽ;

    invoke-direct {v0, p0}, Ll/ۜ᩸ܽ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, Ll/ۘۛ᩷;->֫(Ll/ۛ۟᩷;Ll/ۜ᩸ܽ;)V

    .line 169
    :goto_0
    iget-object p1, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    .line 170
    iget-object v0, p0, Ll/ۛ۟᩷;->ۙ:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    .line 173
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/ۛ۟᩷;->ۙ:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object v0

    invoke-static {v0}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const v3, -0x787dcb8e

    if-eq v2, v3, :cond_2

    goto/16 :goto_5

    .line 176
    :cond_2
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    .line 178
    new-instance v4, Ll/֨ۛ᩷;

    invoke-direct {v4, v0}, Ll/֨ۛ᩷;-><init>(Ll/۬ۜܽ;)V

    invoke-virtual {p1, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 180
    :cond_3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_5

    .line 182
    :cond_4
    iget-object v0, p0, Ll/ۛ۟᩷;->᩶:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->ܺ()[B

    move-result-object v0

    invoke-static {v0}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object v0

    .line 183
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const v3, -0x787dcb8d

    if-ne v2, v3, :cond_5

    .line 185
    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ۛ᩷;

    iget-object p1, p1, Ll/֨ۛ᩷;->֫:Ljava/util/HashSet;

    .line 186
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    :goto_2
    if-ge v1, v2, :cond_7

    .line 188
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    const v1, -0x787dcb8c

    if-ne v2, v1, :cond_7

    .line 191
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v1

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v1, :cond_7

    .line 193
    invoke-virtual {p1, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ۛ᩷;

    iget-object v3, v3, Ll/֨ۛ᩷;->֫:Ljava/util/HashSet;

    .line 194
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v4, :cond_6

    .line 196
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 92
    :catchall_0
    :cond_7
    :goto_5
    invoke-direct {p0}, Ll/ۛ۟᩷;->ۧ()V

    return-void
.end method

.method public static ֫(Ll/ۛ۟᩷;[Ljava/lang/Object;)V
    .locals 2

    .line 84
    iget-boolean v0, p0, Ll/ۛ۟᩷;->ۗ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 85
    aget-object v0, p1, v0

    check-cast v0, Ll/֨ۛ᩷;

    const/4 v1, 0x1

    .line 86
    aget-object p1, p1, v1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 117
    iget-object v1, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    if-nez p1, :cond_0

    .line 118
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    .line 120
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    invoke-direct {p0}, Ll/ۛ۟᩷;->ᩳ()V

    .line 122
    invoke-direct {p0}, Ll/ۛ۟᩷;->ۧ()V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۛ۟᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛ۟᩷;->ᩳ()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۛ۟᩷;)Ll/ۤ۟᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    return-object p0
.end method

.method private ۧ()V
    .locals 3

    .line 213
    iget-object v0, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    if-nez v0, :cond_0

    return-void

    .line 215
    :cond_0
    iget-object v0, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۛ᩷;

    invoke-virtual {v0}, Ll/֨ۛ᩷;->֫()Ljava/util/Set;

    move-result-object v0

    .line 216
    :goto_0
    iget-object v1, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Ll/ܰܳۡ;->֫(ILjava/util/Collection;)V

    .line 217
    iget-object v0, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    invoke-virtual {v0}, Ll/ܰܳۡ;->ܿ()V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۛ۟᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛ۟᩷;->ۧ()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۛ۟᩷;)Ll/᩵ۨ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۟᩷;->᩹:Ll/᩵ۨ᩷;

    return-object p0
.end method

.method private ܽ()V
    .locals 4

    .line 147
    iget-object v0, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 148
    iget-object v0, p0, Ll/ۛ۟᩷;->᩶:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->֫()Z

    return-void

    :cond_0
    const v1, -0x787dcb8c

    .line 0
    invoke-static {v1}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v1

    .line 153
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 154
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ۛ᩷;

    .line 155
    iget-object v2, v2, Ll/֨ۛ᩷;->֫:Ljava/util/HashSet;

    .line 156
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 157
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 158
    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    .line 162
    :cond_2
    :try_start_0
    iget-object v0, p0, Ll/ۛ۟᩷;->᩶:Ll/ۧ۫᩷;

    invoke-virtual {v1}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۧ۫᩷;->֫([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ܿ(Ll/ۛ۟᩷;)V
    .locals 1

    .line 206
    iget-object v0, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 207
    iget-object v0, p0, Ll/ۛ۟᩷;->ۙ:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->֫()Z

    .line 208
    iget-object v0, p0, Ll/ۛ۟᩷;->᩶:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۧ۫᩷;->֫()Z

    .line 209
    invoke-direct {p0}, Ll/ۛ۟᩷;->ۧ()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ۛ۟᩷;)Ljava/util/Stack;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    return-object p0
.end method

.method private ᩳ()V
    .locals 3

    const v0, -0x787dcb8e

    .line 0
    invoke-static {v0}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v0

    .line 132
    iget-object v1, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 133
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ۛ᩷;

    .line 134
    invoke-virtual {v2, v0}, Ll/֨ۛ᩷;->֫(Ll/ۤۜܽ;)V

    goto :goto_0

    .line 137
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/ۛ۟᩷;->ۙ:Ll/ۧ۫᩷;

    invoke-virtual {v0}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۧ۫᩷;->֫([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    :catch_0
    invoke-direct {p0}, Ll/ۛ۟᩷;->ܽ()V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ۛ۟᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛ۟᩷;->ܽ()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 67
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onCreate(Landroid/os/Bundle;)V

    .line 68
    new-instance p1, Ll/ۤ۟᩷;

    invoke-direct {p1, p0}, Ll/ۤ۟᩷;-><init>(Ll/ۛ۟᩷;)V

    iput-object p1, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    .line 69
    invoke-virtual {p1, p0}, Ll/ܰܳۡ;->֫(Ll/ܶܳۡ;)V

    .line 70
    iget-object p1, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    invoke-virtual {p1, p0}, Ll/ܰܳۡ;->֫(Ll/۠ܳۡ;)V

    .line 71
    new-instance p1, Ll/ۙܺ֫;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v0, Ll/ۘۛ᩷;

    invoke-virtual {p1, v0}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    check-cast p1, Ll/ۘۛ᩷;

    iput-object p1, p0, Ll/ۛ۟᩷;->ۤ:Ll/ۘۛ᩷;

    .line 72
    invoke-virtual {p1}, Ll/ۘۛ᩷;->ܳ()Ll/ۚۡ֫;

    move-result-object p1

    new-instance v0, Ll/֡۟᩷;

    invoke-direct {v0, p0}, Ll/֡۟᩷;-><init>(Ll/ۛ۟᩷;)V

    invoke-virtual {p1, p0, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public final onDestroyView()V
    .locals 2

    .line 111
    invoke-super {p0}, Ll/ۡ᩻֫;->onDestroyView()V

    .line 112
    iget-object v0, p0, Ll/ۛ۟᩷;->۬:Ll/۬۬ۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 113
    iput-object v1, p0, Ll/ۛ۟᩷;->۬:Ll/۬۬ۧ;

    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 105
    invoke-super {p0}, Ll/ۡ᩻֫;->onResume()V

    .line 106
    iget-object v0, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    const p2, 0x7f0a0486

    .line 98
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    iput-object p1, p0, Ll/ۛ۟᩷;->۬:Ll/۬۬ۧ;

    const-string p2, "RecyclerView2"

    .line 99
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 100
    iget-object p1, p0, Ll/ۛ۟᩷;->۬:Ll/۬۬ۧ;

    iget-object p2, p0, Ll/ۛ۟᩷;->᩸:Ll/ۤ۟᩷;

    invoke-virtual {p1, p2}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    return-void
.end method

.method public final ֫(Ll/ܽ᩻ۡ;)Z
    .locals 5

    .line 222
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->᩻()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 224
    iget-object v2, p0, Ll/ۛ۟᩷;->᩹:Ll/᩵ۨ᩷;

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩵ۨ᩷;->ۡ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    return v1

    .line 227
    :cond_0
    new-instance v2, Ll/᩸ۖ;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ܳ()Landroid/view/View;

    move-result-object v4

    .line 68
    invoke-direct {v2, v3, v4, v1}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    if-eqz v0, :cond_1

    .line 229
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v4, 0x7f120530

    invoke-interface {v3, v1, v4, v1, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 231
    :cond_1
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v4, 0x7f120874

    invoke-interface {v3, v1, v4, v1, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 232
    new-instance v1, Ll/ۚ۟᩷;

    invoke-direct {v1, p0, p1, v0}, Ll/ۚ۟᩷;-><init>(Ll/ۛ۟᩷;Ll/ܽ᩻ۡ;Z)V

    invoke-virtual {v2, v1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 252
    iget-object p1, p0, Ll/ۛ۟᩷;->۬:Ll/۬۬ۧ;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->suppressLayout(Z)V

    .line 253
    new-instance p1, Ll/ܺ᩵ܿ;

    const/4 v1, 0x6

    invoke-direct {p1, v1, p0}, Ll/ܺ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, p1}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    .line 254
    invoke-virtual {v2}, Ll/᩸ۖ;->ܿ()V

    return v0
.end method

.method public final ۧ(Ll/ܽ᩻ۡ;)V
    .locals 3

    .line 260
    iget-object v0, p0, Ll/ۛ۟᩷;->᩹:Ll/᩵ۨ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۨ᩷;->ۡ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 263
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܿۛ᩷;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 1347
    invoke-virtual {v0, v1, v2}, Ll/ܿۛ᩷;->ۧ(Ljava/lang/String;Ll/᩵ۛ᩷;)V

    .line 264
    iget-object v0, p0, Ll/ۛ۟᩷;->᩹:Ll/᩵ۨ᩷;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۨ᩷;->֫(Ljava/lang/String;)V

    .line 265
    iget-object v0, p0, Ll/ۛ۟᩷;->۫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۛ᩷;

    iget-object v0, v0, Ll/֨ۛ᩷;->֫:Ljava/util/HashSet;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 266
    new-instance v0, Ll/ۡ᩸ۡ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Ll/ۡ᩸ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v1, 0xc8

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_1
    :goto_0
    return-void
.end method
