.class public final synthetic Ll/ܳᩳۢ;
.super Ljava/lang/Object;
.source "UATT"

# interfaces
.implements Ll/᩶֫ۢ;


# instance fields
.field public final synthetic ᩸:Ll/ۜᩳۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ۜᩳۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳᩳۢ;->᩸:Ll/ۜᩳۢ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;Ll/ܿۖ᩷;)Ljava/lang/Runnable;
    .locals 7

    .line 291
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 292
    new-instance v1, Ll/᩻ᩳۢ;

    invoke-direct {v1, p1}, Ll/᩻ᩳۢ;-><init>(Ljava/lang/CharSequence;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 294
    :goto_0
    :try_start_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 295
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_2

    .line 298
    :cond_0
    invoke-virtual {v1, v3, v2}, Ll/᩻ᩳۢ;->֫(IZ)I

    move-result v4

    if-ne v4, v3, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 303
    :cond_1
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x22

    if-ne v5, v6, :cond_2

    .line 309
    new-instance v5, Ll/ۢۧۢ;

    invoke-direct {v5}, Ll/ۢۧۢ;-><init>()V

    add-int/lit8 v3, v3, 0x1

    .line 310
    iput v3, v5, Ll/ۢۧۢ;->ܽ:I

    add-int/lit8 v6, v4, -0x1

    .line 311
    iput v6, v5, Ll/ۢۧۢ;->֫:I

    .line 312
    invoke-interface {p1, v3, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v5, Ll/ۢۧۢ;->ۧ:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 605
    :try_start_1
    sget-object v6, Ll/ۤۘ֡;->ᩳ:Ll/ۛۘ֡;

    invoke-virtual {v6, v3}, Ll/ۨۘ֡;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 314
    iput-object v3, v5, Ll/ۢۧۢ;->ᩳ:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 316
    :catch_0
    :try_start_2
    iget-object v3, v5, Ll/ۢۧۢ;->ۧ:Ljava/lang/String;

    iput-object v3, v5, Ll/ۢۧۢ;->ᩳ:Ljava/lang/String;

    .line 318
    :goto_1
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_2
    move v3, v4

    goto :goto_0

    .line 323
    :catch_1
    :cond_3
    :goto_2
    new-instance p1, Ll/֡᩷ᩳ;

    const/4 p2, 0x2

    iget-object v1, p0, Ll/ܳᩳۢ;->᩸:Ll/ۜᩳۢ;

    invoke-direct {p1, p2, v1, v0}, Ll/֡᩷ᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
