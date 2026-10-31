.class public final Ll/֡᩺ۡ;
.super Ljava/lang/Object;
.source "07T7"


# instance fields
.field public ֫:Ljava/util/Map;

.field public ۧ:Ll/ۘ᩺ۡ;

.field public final ܽ:Ll/᩸ۛۡ;

.field public final ܿ:Ll/᩸ۛۡ;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/᩸ۛۡ;Ll/᩸ۛۡ;)V
    .locals 0

    .line 403
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 405
    iput-object p1, p0, Ll/֡᩺ۡ;->ܽ:Ll/᩸ۛۡ;

    .line 406
    iput-object p2, p0, Ll/֡᩺ۡ;->ܿ:Ll/᩸ۛۡ;

    .line 407
    invoke-virtual {p0}, Ll/֡᩺ۡ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ll/ۖ᩵;

    invoke-direct {p1}, Ll/ۖ᩵;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩸ۛۡ;Ll/֡᩺ۡ;)V
    .locals 1

    .line 418
    iget-object v0, p0, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-static {v0, p1, p2}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    iget-object p1, p0, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    const/16 p2, 0x14

    if-ne p1, p2, :cond_0

    .line 420
    new-instance p1, Ljava/util/HashMap;

    iget-object p2, p0, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Ll/֡᩺ۡ;->֫:Ljava/util/Map;

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 3

    .line 425
    iget-object v0, p0, Ll/֡᩺ۡ;->ܿ:Ll/᩸ۛۡ;

    invoke-virtual {v0}, Ll/᩸ۛۡ;->length()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    sub-int/2addr v1, v2

    .line 426
    invoke-virtual {v0, v1}, Ll/᩸ۛۡ;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v2
.end method
