.class public final Ll/ۛۖܿ;
.super Ljava/lang/Object;
.source "D6VU"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/util/List;

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;II)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p2, p0, Ll/ۛۖܿ;->ܽ:I

    .line 13
    iput p3, p0, Ll/ۛۖܿ;->֫:I

    .line 0
    new-instance p2, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 14
    iput-object p1, p0, Ll/ۛۖܿ;->ۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛۖܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛۖܿ;->֫:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۛۖܿ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۖܿ;->ۧ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۛۖܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛۖܿ;->ܽ:I

    return p0
.end method
