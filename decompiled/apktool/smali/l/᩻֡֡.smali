.class public final Ll/᩻֡֡;
.super Ljava/lang/Object;
.source "88WZ"

# interfaces
.implements Ll/֡֨֡;


# instance fields
.field public final ֫:C

.field public ۧ:I

.field public ܽ:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(C)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput v0, p0, Ll/᩻֡֡;->ۧ:I

    .line 19
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/᩻֡֡;->ܽ:Ljava/util/LinkedList;

    .line 23
    iput-char p1, p0, Ll/᩻֡֡;->֫:C

    return-void
.end method


# virtual methods
.method public final ֫()C
    .locals 1

    .line 33
    iget-char v0, p0, Ll/᩻֡֡;->֫:C

    return v0
.end method

.method public final ֫(Ll/ܺ᩵֡;Ll/ܺ᩵֡;)I
    .locals 5

    .line 49
    iget-object v0, p1, Ll/ܺ᩵֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 72
    iget-object v1, p0, Ll/᩻֡֡;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡֨֡;

    .line 73
    invoke-interface {v3}, Ll/֡֨֡;->ۧ()I

    move-result v4

    if-gt v4, v0, :cond_0

    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {v1}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/֡֨֡;

    .line 82
    :goto_0
    invoke-interface {v3, p1, p2}, Ll/֡֨֡;->֫(Ll/ܺ᩵֡;Ll/ܺ᩵֡;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/֡֨֡;)V
    .locals 5

    .line 42
    invoke-interface {p1}, Ll/֡֨֡;->ۧ()I

    move-result v0

    .line 43
    iget-object v1, p0, Ll/᩻֡֡;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    .line 45
    :goto_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 46
    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡֨֡;

    .line 47
    invoke-interface {v3}, Ll/֡֨֡;->ۧ()I

    move-result v4

    if-le v0, v4, :cond_0

    .line 49
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 50
    invoke-interface {v2, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eq v0, v4, :cond_1

    goto :goto_0

    .line 54
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Cannot add two delimiter processors for char \'"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-char v4, p0, Ll/᩻֡֡;->֫:C

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v4, "\' and minimum length "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "; conflicting processors: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 66
    :cond_2
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 67
    iput v0, p0, Ll/᩻֡֡;->ۧ:I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 38
    iget v0, p0, Ll/᩻֡֡;->ۧ:I

    return v0
.end method

.method public final ܽ()C
    .locals 1

    .line 28
    iget-char v0, p0, Ll/᩻֡֡;->֫:C

    return v0
.end method
