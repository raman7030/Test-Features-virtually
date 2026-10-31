.class public final Ll/ᩳ۫ܳ;
.super Ll/ۧۙۧ;
.source "A940"


# instance fields
.field public final synthetic ֫:Ll/ܿ۫ܳ;

.field public final synthetic ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ܿ۫ܳ;Ljava/util/ArrayList;)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    iput-object p1, p0, Ll/ᩳ۫ܳ;->֫:Ll/ܿ۫ܳ;

    iput-object p2, p0, Ll/ᩳ۫ܳ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 238
    iget-object v0, p0, Ll/ᩳ۫ܳ;->֫:Ll/ܿ۫ܳ;

    iget-object v0, v0, Ll/ܿ۫ܳ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(II)Z
    .locals 1

    .line 248
    iget-object v0, p0, Ll/ᩳ۫ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll/ᩳ۫ܳ;->֫:Ll/ܿ۫ܳ;

    iget-object v0, v0, Ll/ܿ۫ܳ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 233
    iget-object v0, p0, Ll/ᩳ۫ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۧ(II)Z
    .locals 1

    .line 243
    iget-object v0, p0, Ll/ᩳ۫ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll/ᩳ۫ܳ;->֫:Ll/ܿ۫ܳ;

    iget-object v0, v0, Ll/ܿ۫ܳ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
