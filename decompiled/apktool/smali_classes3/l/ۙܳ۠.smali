.class public final Ll/ۙܳ۠;
.super Ll/۫ܳ۠;
.source "U7M7"


# instance fields
.field public final ۜ:Ll/᩷۠ᩴ;

.field public final ᩻:Ll/ۛܳ۠;


# direct methods
.method public constructor <init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;Ll/ۛܳ۠;)V
    .locals 0

    .line 111
    invoke-direct {p0, p1, p2}, Ll/۫ܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;)V

    .line 112
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Ll/ۙܳ۠;->ۜ:Ll/᩷۠ᩴ;

    .line 113
    iput-object p4, p0, Ll/ۙܳ۠;->᩻:Ll/ۛܳ۠;

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;Ll/ۛܳ۠;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۙܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;Ll/ۛܳ۠;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 2

    .line 118
    iget-object v0, p0, Ll/ۙܳ۠;->᩻:Ll/ۛܳ۠;

    iget-object v1, p0, Ll/ۙܳ۠;->ۜ:Ll/᩷۠ᩴ;

    invoke-virtual {v0, v1}, Ll/ۨܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DirectoryFileObject["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۙܳ۠;->ۜ:Ll/᩷۠ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙܳ۠;->᩻:Ll/ۛܳ۠;

    iget-object v1, v1, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    const-string v2, "]"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/util/Collection;)Ljava/lang/String;
    .locals 3

    .line 123
    iget-object p1, p0, Ll/ۙܳ۠;->᩻:Ll/ۛܳ۠;

    .line 515
    iget-object p1, p1, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    const-string v0, "."

    .line 528
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 529
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v1, "/"

    .line 524
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/۫ܳ۠;
    .locals 4

    .line 133
    new-instance v0, Ll/ۙܳ۠;

    iget-object v1, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    .line 134
    invoke-interface {v1, p1}, Ll/᩷۠ᩴ;->resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v1

    new-instance v2, Ll/ۛܳ۠;

    iget-object v3, p0, Ll/ۙܳ۠;->᩻:Ll/ۛܳ۠;

    .line 136
    invoke-virtual {v3}, Ll/ۛܳ۠;->֫()Ll/ۤܳ۠;

    move-result-object v3

    invoke-direct {v2, v3, p1}, Ll/ۛܳ۠;-><init>(Ll/ۤܳ۠;Ljava/lang/String;)V

    iget-object p1, p0, Ll/۫ܳ۠;->֫:Ll/᩷ܿ۠;

    iget-object v3, p0, Ll/ۙܳ۠;->ۜ:Ll/᩷۠ᩴ;

    invoke-direct {v0, p1, v1, v3, v2}, Ll/ۙܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;Ll/ۛܳ۠;)V

    return-object v0
.end method
