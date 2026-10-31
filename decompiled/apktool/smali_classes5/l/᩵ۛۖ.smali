.class public final Ll/᩵ۛۖ;
.super Ll/ۘۛۖ;
.source "79FR"


# instance fields
.field public ܽ:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/EnumSet;)V
    .locals 1

    .line 24
    new-instance v0, Ll/ܺۛۖ;

    invoke-direct {v0}, Ll/ܺۛۖ;-><init>()V

    invoke-direct {p0, v0}, Ll/֨֫ۘ;-><init>(Ll/ۚ֫ۘ;)V

    .line 36
    iput-object p1, p0, Ll/᩵ۛۖ;->ܽ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SMB_COM_NEGOTIATE"

    return-object v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 5

    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(B)V

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "SMB 2.002"

    .line 47
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    iget-object v2, p0, Ll/᩵ۛۖ;->ܽ:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v3

    const/4 v4, 0x1

    if-gt v3, v4, :cond_0

    sget-object v3, Ll/᩹ۛۖ;->ۙ:Ll/᩹ۛۖ;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    const-string v2, "SMB 2.???"

    .line 49
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 54
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v4

    add-int/2addr v0, v3

    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 59
    invoke-virtual {p1, v4}, Ll/ۤܰۖ;->֫(B)V

    .line 60
    sget-object v2, Ll/۠ܰۖ;->ܿ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1, v2}, Ll/ۤܰۖ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    goto :goto_1

    .line 62
    :cond_3
    iget-object v0, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v0, Ll/ܺۛۖ;

    invoke-virtual {p1}, Ll/ۤܰۖ;->ܺ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ܺۛۖ;->֫(I)V

    return-void
.end method
