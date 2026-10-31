.class public final Ll/ۙ᩺᩻;
.super Ljava/lang/Object;
.source "I78P"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܳ:I

.field public final ܽ:Ljava/util/ArrayList;

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIIILjava/util/AbstractCollection;Ljava/util/AbstractCollection;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙ᩺᩻;->ܽ:Ljava/util/ArrayList;

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙ᩺᩻;->ۧ:Ljava/util/ArrayList;

    .line 21
    iput p1, p0, Ll/ۙ᩺᩻;->֫:I

    .line 22
    iput p2, p0, Ll/ۙ᩺᩻;->ܳ:I

    .line 23
    iput p3, p0, Ll/ۙ᩺᩻;->ܿ:I

    .line 24
    iput p4, p0, Ll/ۙ᩺᩻;->ᩳ:I

    .line 25
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 26
    iget-object p3, p0, Ll/ۙ᩺᩻;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 29
    iget-object p3, p0, Ll/ۙ᩺᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-void
.end method
