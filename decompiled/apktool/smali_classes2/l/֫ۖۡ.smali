.class public final Ll/֫ۖۡ;
.super Ljava/lang/Object;
.source "B8WE"


# static fields
.field public static final synthetic ֫:I

.field public static ۧ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/֫ۖۡ;->ۧ:Ljava/util/ArrayList;

    .line 21
    invoke-static {}, Ll/֫ۖۡ;->ܽ()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ֫()V
    .locals 0

    .line 0
    invoke-static {}, Ll/֫ۖۡ;->ᩳ()V

    return-void
.end method

.method public static ۧ()Ljava/util/ArrayList;
    .locals 1

    .line 55
    sget-object v0, Ll/֫ۖۡ;->ۧ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static ܽ()V
    .locals 8

    const-string v0, "mfr"

    .line 28
    :try_start_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[B)[B

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 30
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, v1}, Ll/۬ۜܽ;-><init>([B)V

    const/4 v1, 0x0

    goto :goto_0

    .line 32
    :cond_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1, v0, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    .line 36
    :cond_1
    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-static {v0}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    const v2, 0x5495344a

    .line 39
    invoke-static {v0, v2}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 40
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    .line 41
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v3, v2, :cond_2

    .line 43
    new-instance v5, Ll/۟ܺۡ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->֡()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ll/۟ܺۡ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 45
    :cond_2
    sput-object v4, Ll/֫ۖۡ;->ۧ:Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    .line 47
    invoke-static {}, Ll/֫ۖۡ;->ᩳ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    :goto_2
    return-void
.end method

.method public static ᩳ()V
    .locals 4

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Ll/֫ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const v1, 0x5495344a

    .line 0
    invoke-static {v1}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v1

    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 67
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ܺۡ;

    .line 68
    invoke-static {v2}, Ll/۟ܺۡ;->֫(Ll/۟ܺۡ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->ۧ(Ljava/lang/String;)V

    .line 69
    invoke-static {v2}, Ll/۟ܺۡ;->ۧ(Ll/۟ܺۡ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 71
    :cond_0
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v2, "mfr"

    invoke-virtual {v1}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[B)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
