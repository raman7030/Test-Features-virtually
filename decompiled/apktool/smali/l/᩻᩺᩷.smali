.class public final synthetic Ll/᩻᩺᩷;
.super Ljava/lang/Object;
.source "P1EM"

# interfaces
.implements Ll/۠ۛ᩷;


# instance fields
.field public final synthetic ᩸:Ll/ۡ᩺᩷;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۡ᩺᩷;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻᩺᩷;->᩸:Ll/ۡ᩺᩷;

    iput p2, p0, Ll/᩻᩺᩷;->᩹:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 5

    .line 2
    check-cast p1, Ll/֨᩺᩷;

    .line 142
    invoke-interface {p1}, Ll/֨᩺᩷;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻᩺᩷;->᩸:Ll/ۡ᩺᩷;

    invoke-virtual {v1, v0}, Ll/ۡ᩺᩷;->֫(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 143
    invoke-interface {p1}, Ll/֨᩺᩷;->֫()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_4

    if-nez p1, :cond_0

    goto :goto_1

    .line 146
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 147
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻᩻ܽ;

    .line 148
    iget v3, v2, Ll/᩻᩻ܽ;->ܳ:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    iget v3, v2, Ll/᩻᩻ܽ;->ۧ:I

    iget v4, p0, Ll/᩻᩺᩷;->᩹:I

    if-ne v3, v4, :cond_1

    .line 149
    new-instance v3, Ll/᩵ۛ᩷;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ll/᩵ۛ᩷;-><init>(I)V

    .line 150
    iget v4, v2, Ll/᩻᩻ܽ;->ܽ:I

    iput v4, v3, Ll/᩵ۛ᩷;->᩸:I

    .line 151
    iget v2, v2, Ll/᩻᩻ܽ;->֫:I

    iput v2, v3, Ll/᩵ۛ᩷;->᩹:I

    .line 152
    invoke-virtual {v3, v4, v2, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/CharSequence;)V

    .line 153
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 156
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    return-object v1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method
