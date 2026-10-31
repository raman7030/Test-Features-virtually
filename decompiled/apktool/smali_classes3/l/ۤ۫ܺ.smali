.class public Ll/ۤ۫ܺ;
.super Ljava/util/AbstractList;
.source "P5NR"


# instance fields
.field public final ᩸:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 850
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    iput-object p1, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    return-void
.end method

.method private ֫(I)I
    .locals 1

    .line 905
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 866
    invoke-static {p1, v0}, Ll/ۘܶܺ;->ۧ(II)V

    sub-int/2addr v0, p1

    return v0
.end method

.method public static synthetic ֫(Ll/ۤ۫ܺ;I)I
    .locals 0

    .line 847
    invoke-direct {p0, p1}, Ll/ۤ۫ܺ;->֫(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 1

    .line 872
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    invoke-direct {p0, p1}, Ll/ۤ۫ܺ;->֫(I)I

    move-result p1

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public final clear()V
    .locals 1

    .line 877
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 905
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 860
    invoke-static {p1, v1}, Ll/ۘܶܺ;->֫(II)V

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    .line 900
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 916
    invoke-virtual {p0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 921
    invoke-direct {p0, p1}, Ll/ۤ۫ܺ;->֫(I)I

    move-result p1

    .line 922
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    .line 923
    new-instance v0, Ll/۫۫ܺ;

    invoke-direct {v0, p0, p1}, Ll/۫۫ܺ;-><init>(Ll/ۤ۫ܺ;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 2

    .line 905
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 860
    invoke-static {p1, v1}, Ll/ۘܶܺ;->֫(II)V

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    .line 883
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final removeRange(II)V
    .locals 0

    .line 888
    invoke-virtual {p0, p1, p2}, Ll/ۤ۫ܺ;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 905
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 860
    invoke-static {p1, v1}, Ll/ۘܶܺ;->֫(II)V

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    .line 894
    invoke-interface {v0, v1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 905
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    .line 905
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 910
    invoke-static {p1, p2, v1}, Ll/ۘܶܺ;->֫(III)V

    .line 911
    invoke-direct {p0, p2}, Ll/ۤ۫ܺ;->֫(I)I

    move-result p2

    invoke-direct {p0, p1}, Ll/ۤ۫ܺ;->֫(I)I

    move-result p1

    invoke-interface {v0, p2, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ll/۟۫ܺ;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 855
    iget-object v0, p0, Ll/ۤ۫ܺ;->᩸:Ljava/util/List;

    return-object v0
.end method
