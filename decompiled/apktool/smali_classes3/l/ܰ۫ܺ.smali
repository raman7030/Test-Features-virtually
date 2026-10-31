.class public final Ll/ܰ۫ܺ;
.super Ljava/util/AbstractSequentialList;
.source "P5NR"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:Ljava/util/List;

.field public final ᩹:Ll/ܽܶܺ;


# direct methods
.method public constructor <init>(Ljava/util/List;Ll/ܽܶܺ;)V
    .locals 0

    .line 566
    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    iput-object p1, p0, Ll/ܰ۫ܺ;->᩸:Ljava/util/List;

    .line 902
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    iput-object p2, p0, Ll/ܰ۫ܺ;->᩹:Ll/ܽܶܺ;

    return-void
.end method


# virtual methods
.method public final isEmpty()Z
    .locals 1

    .line 587
    iget-object v0, p0, Ll/ܰ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    .line 592
    new-instance v0, Ll/᩺۫ܺ;

    iget-object v1, p0, Ll/ܰ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/᩺۫ܺ;-><init>(Ll/ܰ۫ܺ;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public final removeRange(II)V
    .locals 1

    .line 577
    iget-object v0, p0, Ll/ܰ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final size()I
    .locals 1

    .line 582
    iget-object v0, p0, Ll/ܰ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
