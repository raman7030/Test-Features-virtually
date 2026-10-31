.class public final Ll/۫᩵ܺ;
.super Ljava/lang/Object;
.source "UB7S"


# instance fields
.field public ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 219
    iput-object v0, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 280
    iget-object v0, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 282
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 283
    iget-object v1, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩵ܺ;

    .line 284
    invoke-virtual {v2}, Ll/۬᩵ܺ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 285
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 250
    iget-object v0, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Ll/۫᩵ܺ;)V
    .locals 2

    .line 239
    iget-object v0, p1, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_1

    .line 241
    :cond_0
    iget-object v0, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 242
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    .line 243
    :cond_1
    iget-object p1, p1, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬᩵ܺ;

    .line 244
    invoke-virtual {p0, v0}, Ll/۫᩵ܺ;->֫(Ll/۬᩵ܺ;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Ll/۬᩵ܺ;)V
    .locals 3

    .line 224
    iget-object v0, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 225
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    :cond_0
    const/4 v0, 0x0

    .line 226
    :goto_0
    iget-object v1, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 228
    iget-object v1, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩵ܺ;

    .line 229
    iget-object v1, v1, Ll/۬᩵ܺ;->֫:Ll/ۤ᩵ܺ;

    iget v1, v1, Ll/ۤ᩵ܺ;->ۧ:I

    iget-object v2, p1, Ll/۬᩵ܺ;->֫:Ll/ۤ᩵ܺ;

    iget v2, v2, Ll/ۤ᩵ܺ;->ۧ:I

    if-le v1, v2, :cond_1

    .line 230
    iget-object v1, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 234
    :cond_2
    iget-object v0, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 255
    iget-object v0, p0, Ll/۫᩵ܺ;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
