.class public final Ll/ۙۘ۠;
.super Ljava/lang/Object;
.source "37RB"


# static fields
.field public static final ܽ:Ll/᩹ۘ۠;

.field public static final ᩳ:Ll/ۙ֨۠;


# instance fields
.field public ֫:Ljava/util/HashMap;

.field public final ۧ:Ll/ۛܶ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 55
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ۙۘ۠;->ᩳ:Ll/ۙ֨۠;

    .line 457
    new-instance v0, Ll/᩹ۘ۠;

    sget-object v1, Ll/᩶ۘ۠;->ۤ֫:Ll/᩶ۘ۠;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v2, v3}, Ll/᩹ۘ۠;-><init>(Ll/᩶ۘ۠;IILl/ۖܶ۠;)V

    sput-object v0, Ll/ۙۘ۠;->ܽ:Ll/᩹ۘ۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 5

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۙۘ۠;->֫:Ljava/util/HashMap;

    .line 65
    sget-object v0, Ll/ۙۘ۠;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 66
    invoke-static {p1}, Ll/ۛܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۛܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/ۙۘ۠;->ۧ:Ll/ۛܶ۠;

    .line 67
    invoke-static {}, Ll/᩶ۘ۠;->values()[Ll/᩶ۘ۠;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 68
    iget-object v3, v2, Ll/᩶ۘ۠;->᩸:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 69
    iget-object v4, p0, Ll/ۙۘ۠;->ۧ:Ll/ۛܶ۠;

    .line 414
    iget-object v4, v4, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v4, v3}, Ll/۫ܶ۠;->֫(Ljava/lang/String;)Ll/ۤܶ۠;

    .line 70
    iget-object v3, p0, Ll/ۙۘ۠;->֫:Ljava/util/HashMap;

    iget-object v4, v2, Ll/᩶ۘ۠;->᩸:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/᩶ۘ۠;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ۙۘ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶ۘ۠;

    if-eqz p1, :cond_0

    return-object p1

    .line 87
    :cond_0
    sget-object p1, Ll/᩶ۘ۠;->ۢۧ:Ll/᩶ۘ۠;

    return-object p1
.end method

.method public final ֫(Ll/ۤܶ۠;)Ll/᩶ۘ۠;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۙۘ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶ۘ۠;

    if-eqz p1, :cond_0

    return-object p1

    .line 82
    :cond_0
    sget-object p1, Ll/᩶ۘ۠;->ۢۧ:Ll/᩶ۘ۠;

    return-object p1
.end method
