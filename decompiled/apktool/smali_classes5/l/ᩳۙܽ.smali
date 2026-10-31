.class public final Ll/ᩳۙܽ;
.super Ll/ۧۙۧ;
.source "28VT"


# instance fields
.field public final synthetic ֫:Ljava/util/ArrayList;

.field public final synthetic ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    iput-object p1, p0, Ll/ᩳۙܽ;->ۧ:Ljava/util/List;

    iput-object p2, p0, Ll/ᩳۙܽ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ᩳۙܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(II)Z
    .locals 1

    .line 215
    iget-object v0, p0, Ll/ᩳۙܽ;->ۧ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Ll/ᩳۙܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 198
    iget-object v0, p0, Ll/ᩳۙܽ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ۧ(II)Z
    .locals 4

    .line 208
    iget-object v0, p0, Ll/ᩳۙܽ;->ۧ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 2860
    invoke-static {p1}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    const-string v3, "/"

    if-nez v0, :cond_1

    .line 2866
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 2870
    :cond_0
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 209
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ᩳۙܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 2860
    invoke-static {p2}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2866
    invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v2, :cond_2

    goto :goto_1

    .line 2870
    :cond_2
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 210
    :cond_3
    :goto_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
