.class public final Ll/ܶۤ᩻;
.super Ljava/lang/Object;
.source "M6WW"


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public ۜ:Ll/ۛ᩵᩷;

.field public ۢ:Ljava/lang/String;

.field public final ۧ:Ll/֡ۤ᩻;

.field public ܳ:Z

.field public ܽ:Z

.field public ܿ:Ljava/lang/Runnable;

.field public ᩳ:Ll/֡ۚۢ;

.field public final ᩷:Ljava/util/ArrayList;

.field public ᩻:Ll/֫ۗۧ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶۤ᩻;->᩷:Ljava/util/ArrayList;

    .line 47
    iput-object p1, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    .line 48
    new-instance p1, Ll/֡ۤ᩻;

    invoke-direct {p1, p0}, Ll/֡ۤ᩻;-><init>(Ll/ܶۤ᩻;)V

    iput-object p1, p0, Ll/ܶۤ᩻;->ۧ:Ll/֡ۤ᩻;

    return-void
.end method

.method private ֫(Ll/ۛۢۜ;)Ljava/lang/String;
    .locals 1

    .line 276
    sget-object v0, Ll/ᩴۤ᩻;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const p1, 0x7f120571

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p1}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p1

    :cond_1
    const p1, 0x7f120575

    goto :goto_0

    :cond_2
    const p1, 0x7f120574

    :goto_0
    iget-object v0, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static bridge synthetic ֫(Ll/ܶۤ᩻;Ll/ۛۢۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶۤ᩻;->֫(Ll/ۛۢۜ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܶۤ᩻;)Ll/ۗܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    return-object p0
.end method

.method public static ֫(Landroid/view/View;Ll/ۗܺ᩷;Ll/֡ۚۢ;)Ll/ܶۤ᩻;
    .locals 1

    .line 53
    new-instance v0, Ll/ܶۤ᩻;

    invoke-direct {v0, p1}, Ll/ܶۤ᩻;-><init>(Ll/ۗܺ᩷;)V

    .line 60
    iput-object p2, v0, Ll/ܶۤ᩻;->ᩳ:Ll/֡ۚۢ;

    const p1, 0x7f0a04c3

    .line 61
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Ll/ۖۢۡ;

    .line 62
    invoke-virtual {p0}, Ll/ۖۢۡ;->ܳ()V

    .line 63
    iget-object p1, v0, Ll/ܶۤ᩻;->ۧ:Ll/֡ۤ᩻;

    invoke-virtual {p0, p1}, Ll/ۖۢۡ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 64
    new-instance p1, Ll/֫ۗۧ;

    new-instance p2, Ll/ۡۤ᩻;

    invoke-direct {p2, v0}, Ll/ۡۤ᩻;-><init>(Ll/ܶۤ᩻;)V

    invoke-direct {p1, p2}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    iput-object p1, v0, Ll/ܶۤ᩻;->᩻:Ll/֫ۗۧ;

    .line 102
    invoke-virtual {p1, p0}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    .line 103
    invoke-direct {v0}, Ll/ܶۤ᩻;->ܿ()V

    return-object v0
.end method

.method public static ֫(Ll/ܶۤ᩻;I)V
    .locals 9

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 149
    :goto_0
    iget-object v1, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    invoke-direct {p0}, Ll/ܶۤ᩻;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Ll/ܶۤ᩻;->ۜ:Ll/ۛ᩵᩷;

    if-nez v2, :cond_4

    iget-boolean v2, p0, Ll/ܶۤ᩻;->ܳ:Z

    if-eqz v2, :cond_1

    goto :goto_1

    .line 150
    :cond_1
    invoke-virtual {v1}, Ll/᩻ܽ;->֫()Ll/᩵ᩳ;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "mcp-file-rule-"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ll/ܺۤ᩻;

    invoke-direct {v4, p0, p1}, Ll/ܺۤ᩻;-><init>(Ll/ܶۤ᩻;Z)V

    .line 150
    invoke-static {v2, v3, v4}, Ll/᩵֡᩷;->֫(Ll/᩵ᩳ;Ljava/lang/String;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;

    move-result-object v2

    iput-object v2, p0, Ll/ܶۤ᩻;->ۜ:Ll/ۛ᩵᩷;

    .line 163
    instance-of v2, v1, Ll/۠᩶᩷;

    if-eqz v2, :cond_2

    check-cast v1, Ll/۠᩶᩷;

    .line 164
    invoke-virtual {v1, v0}, Ll/۠᩶᩷;->֫(Z)V

    :cond_2
    if-eqz p1, :cond_3

    .line 167
    :try_start_0
    iget-object v2, p0, Ll/ܶۤ᩻;->ۜ:Ll/ۛ᩵᩷;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const v4, 0x7f12056c

    const/4 v3, 0x0

    const/4 v6, 0x0

    .line 1630
    invoke-virtual/range {v2 .. v8}, Ll/ܶ᩵᩷;->֫(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    .line 168
    :cond_3
    iget-object p1, p0, Ll/ܶۤ᩻;->ۜ:Ll/ۛ᩵᩷;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/16 v1, 0xe

    const v2, 0x7f12056b

    .line 0
    invoke-static {p1, v2, v0, v0, v1}, Ll/ۛ᩵᩷;->֫(Ll/ۛ᩵᩷;ILjava/lang/String;[Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 170
    invoke-direct {p0}, Ll/ܶۤ᩻;->ܳ()V

    .line 171
    throw p1

    :cond_4
    :goto_1
    return-void
.end method

.method public static ֫(Ll/ܶۤ᩻;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 177
    iput-boolean v0, p0, Ll/ܶۤ᩻;->ܳ:Z

    .line 178
    new-instance v0, Ll/ۘۤ᩻;

    invoke-direct {v0, p0, p1, p2}, Ll/ۘۤ᩻;-><init>(Ll/ܶۤ᩻;Ljava/lang/String;Z)V

    .line 212
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۤ᩻;Ll/ۖۤ᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܶۤ᩻;->ܿ:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic ֫(Ll/ܶۤ᩻;Ll/ܰۢۜ;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    iget-object p1, p1, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-static {p1}, Ll/᩸ۛ᩻;->ܽ(Ljava/lang/String;)V

    .line 262
    invoke-direct {p0}, Ll/ܶۤ᩻;->ܿ()V

    return-void
.end method

.method public static ֫(Ll/ܶۤ᩻;Ll/ܰۢۜ;Ll/ۛۢۜ;Z)V
    .locals 0

    .line 253
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p3, :cond_0

    .line 130
    :try_start_0
    invoke-static {p1, p2}, Ll/᩸ۛ᩻;->֫(Ll/ܰۢۜ;Ll/ۛۢۜ;)V

    goto :goto_0

    .line 131
    :cond_0
    iget-object p1, p1, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/᩸ۛ᩻;->֫(Ljava/lang/String;Ll/ۛۢۜ;)V

    .line 132
    :goto_0
    invoke-direct {p0}, Ll/ܶۤ᩻;->ܿ()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const p0, 0x7f120578

    .line 134
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public static ֫(Ll/ܶۤ᩻;Ll/ܰۢۜ;Z)V
    .locals 8

    .line 241
    iget-object v0, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    if-eqz p2, :cond_0

    sget-object v1, Ll/ۛۢۜ;->ۙ:Ll/ۛۢۜ;

    goto :goto_0

    :cond_0
    iget-object v1, p1, Ll/ܰۢۜ;->֫:Ll/ۛۢۜ;

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    filled-new-array {v1}, [I

    move-result-object v4

    .line 242
    invoke-virtual {p1}, Ll/ܰۢۜ;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f120576

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    iget-object v1, p1, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    :goto_1
    move-object v6, v1

    .line 243
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 244
    invoke-virtual {v1, v6}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 270
    sget-object v0, Ll/ۛۢۜ;->ۙ:Ll/ۛۢۜ;

    invoke-direct {p0, v0}, Ll/ܶۤ᩻;->֫(Ll/ۛۢۜ;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ll/ۛۢۜ;->ۗ:Ll/ۛۢۜ;

    invoke-direct {p0, v2}, Ll/ܶۤ᩻;->֫(Ll/ۛۢۜ;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/ۛۢۜ;->᩶:Ll/ۛۢۜ;

    .line 271
    invoke-direct {p0, v3}, Ll/ܶۤ᩻;->֫(Ll/ۛۢۜ;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 245
    aget v2, v4, v2

    new-instance v3, Ll/᩷ܿ᩷;

    const/4 v5, 0x2

    invoke-direct {v3, v5, v4}, Ll/᩷ܿ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v0, v2, v3}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/ۜۤ᩻;

    move-object v2, v0

    move-object v3, p0

    move-object v5, p1

    move v7, p2

    invoke-direct/range {v2 .. v7}, Ll/ۜۤ᩻;-><init>(Ll/ܶۤ᩻;[ILl/ܰۢۜ;Ljava/lang/String;Z)V

    const v2, 0x7f12070a

    .line 246
    invoke-virtual {v1, v2, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v2, 0x0

    .line 258
    invoke-virtual {v1, v0, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    if-nez p2, :cond_2

    .line 259
    invoke-virtual {p1}, Ll/ܰۢۜ;->֫()Z

    move-result p2

    if-nez p2, :cond_2

    .line 260
    new-instance p2, Ll/᩷ۤ᩻;

    invoke-direct {p2, p0, p1}, Ll/᩷ۤ᩻;-><init>(Ll/ܶۤ᩻;Ll/ܰۢۜ;)V

    const p0, 0x7f1205ca

    invoke-virtual {v1, p0, p2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 265
    :cond_2
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static ֫(Ll/ܶۤ᩻;[ILl/ܰۢۜ;Ljava/lang/String;Z)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    invoke-static {}, Ll/ۛۢۜ;->values()[Ll/ۛۢۜ;

    move-result-object v0

    const/4 v1, 0x0

    aget p1, p1, v1

    aget-object p1, v0, p1

    .line 248
    invoke-static {}, Ll/᩸ۛ᩻;->ۧ()Ll/۟ۢۜ;

    move-result-object v0

    iget-object v0, v0, Ll/۟ۢۜ;->ܿ:Ljava/util/List;

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 249
    check-cast v0, Ll/ܰۢۜ;

    iget-object v0, v0, Ll/ܰۢۜ;->֫:Ll/ۛۢۜ;

    .line 250
    invoke-virtual {p2}, Ll/ܰۢۜ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ll/ۛۢۜ;->ۗ:Ll/ۛۢۜ;

    if-ne p1, v1, :cond_0

    if-eq v0, p1, :cond_0

    .line 251
    iget-object v0, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 251
    invoke-virtual {v1, p3}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    const p3, 0x7f120570

    .line 252
    invoke-virtual {v1, p3}, Ll/᩵ۚۢ;->֫(I)V

    new-instance p3, Ll/ۢۤ᩻;

    invoke-direct {p3, p0, p2, p1, p4}, Ll/ۢۤ᩻;-><init>(Ll/ܶۤ᩻;Ll/ܰۢۜ;Ll/ۛۢۜ;Z)V

    const p0, 0x7f12070a

    .line 253
    invoke-virtual {v1, p0, p3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 p1, 0x0

    .line 254
    invoke-virtual {v1, p0, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_0
    if-eqz p4, :cond_1

    .line 130
    :try_start_0
    invoke-static {p2, p1}, Ll/᩸ۛ᩻;->֫(Ll/ܰۢۜ;Ll/ۛۢۜ;)V

    goto :goto_0

    .line 131
    :cond_1
    iget-object p2, p2, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-static {p2, p1}, Ll/᩸ۛ᩻;->֫(Ljava/lang/String;Ll/ۛۢۜ;)V

    .line 132
    :goto_0
    invoke-direct {p0}, Ll/ܶۤ᩻;->ܿ()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const p0, 0x7f120578

    .line 134
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܶۤ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶۤ᩻;->ܳ()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܶۤ᩻;)Ll/֡ۤ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۤ᩻;->ۧ:Ll/֡ۤ᩻;

    return-object p0
.end method

.method public static ۧ(Ll/ܶۤ᩻;I)Z
    .locals 0

    if-lez p1, :cond_0

    .line 108
    iget-object p0, p0, Ll/ܶۤ᩻;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-ge p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ܳ()V
    .locals 2

    .line 220
    iget-object v0, p0, Ll/ܶۤ᩻;->ۜ:Ll/ۛ᩵᩷;

    if-eqz v0, :cond_0

    .line 221
    invoke-virtual {v0}, Ll/ܶ᩵᩷;->֫()V

    const/4 v0, 0x0

    .line 222
    iput-object v0, p0, Ll/ܶۤ᩻;->ۜ:Ll/ۛ᩵᩷;

    .line 223
    iget-object v0, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    instance-of v1, v0, Ll/۠᩶᩷;

    if-eqz v1, :cond_0

    check-cast v0, Ll/۠᩶᩷;

    const/4 v1, 0x0

    .line 224
    invoke-virtual {v0, v1}, Ll/۠᩶᩷;->֫(Z)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ܶۤ᩻;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ܶۤ᩻;->ܳ:Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܶۤ᩻;)Ll/֫ۗۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۤ᩻;->᩻:Ll/֫ۗۧ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܶۤ᩻;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۤ᩻;->ۢ:Ljava/lang/String;

    return-object p0
.end method

.method private ܿ()V
    .locals 5

    .line 118
    invoke-static {}, Ll/᩸ۛ᩻;->ۧ()Ll/۟ۢۜ;

    move-result-object v0

    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f120577

    iget-object v3, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-static {}, Ll/᩸ۛ᩻;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 121
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "\n\n"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const v4, 0x7f12056f

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܶۤ᩻;->ۢ:Ljava/lang/String;

    .line 122
    iget-object v1, p0, Ll/ܶۤ᩻;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 123
    iget-object v0, v0, Ll/۟ۢۜ;->ܿ:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 124
    iget-object v0, p0, Ll/ܶۤ᩻;->ۧ:Ll/֡ۤ᩻;

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ܶۤ᩻;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۤ᩻;->᩷:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ᩳ()Z
    .locals 2

    .line 216
    iget-boolean v0, p0, Ll/ܶۤ᩻;->ܽ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܶۤ᩻;->ᩳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ᩻(Ll/ܶۤ᩻;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶۤ᩻;->ᩳ()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 140
    invoke-direct {p0}, Ll/ܶۤ᩻;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܶۤ᩻;->ۜ:Ll/ۛ᩵᩷;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ܶۤ᩻;->ܳ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    iget-object v1, p0, Ll/ܶۤ᩻;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, v1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v2, 0x7f12056a

    .line 141
    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    const v2, 0x7f12056c

    .line 142
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f12056b

    .line 143
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll/᩻ۤ᩻;

    invoke-direct {v2, p0}, Ll/᩻ۤ᩻;-><init>(Ll/ܶۤ᩻;)V

    .line 142
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 144
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 231
    iput-boolean v0, p0, Ll/ܶۤ᩻;->ܽ:Z

    .line 232
    invoke-direct {p0}, Ll/ܶۤ᩻;->ܳ()V

    .line 233
    iget-object v0, p0, Ll/ܶۤ᩻;->ܿ:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 234
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x0

    .line 235
    iput-object v0, p0, Ll/ܶۤ᩻;->ܿ:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 0

    .line 113
    invoke-direct {p0}, Ll/ܶۤ᩻;->ܿ()V

    return-void
.end method
