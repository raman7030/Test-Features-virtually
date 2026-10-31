.class public final Ll/᩶ܽ۠;
.super Ljava/util/AbstractQueue;
.source "X426"


# instance fields
.field public ᩸:Ljava/util/LinkedList;

.field public final synthetic ᩹:Ll/ۙܽ۠;


# direct methods
.method public constructor <init>(Ll/ۙܽ۠;)V
    .locals 0

    .line 156
    iput-object p1, p0, Ll/᩶ܽ۠;->᩹:Ll/ۙܽ۠;

    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    .line 187
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Ll/᩶ܽ۠;->᩸:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/᩶ܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    .line 156
    check-cast p1, Ll/֫ۤ֨;

    .line 168
    iget-object v0, p0, Ll/᩶ܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Ll/᩶ܽ۠;->᩹:Ll/ۙܽ۠;

    iget-object v0, v0, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final peek()Ljava/lang/Object;
    .locals 2

    .line 184
    iget-object v0, p0, Ll/᩶ܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۤ֨;

    return-object v0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 2

    .line 176
    iget-object v0, p0, Ll/᩶ܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 178
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۤ֨;

    .line 179
    iget-object v1, p0, Ll/᩶ܽ۠;->᩹:Ll/ۙܽ۠;

    iget-object v1, v1, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 164
    iget-object v0, p0, Ll/᩶ܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    return v0
.end method
