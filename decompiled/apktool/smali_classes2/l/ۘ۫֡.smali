.class public final Ll/ۘ۫֡;
.super Ljava/util/AbstractList;
.source "H4NZ"


# instance fields
.field public final synthetic ᩸:Ll/֨۫֡;


# direct methods
.method public constructor <init>(Ll/֨۫֡;)V
    .locals 0

    .line 242
    iput-object p1, p0, Ll/ۘ۫֡;->᩸:Ll/֨۫֡;

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 245
    invoke-virtual {p0}, Ll/ۘ۫֡;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 248
    iget-object v0, p0, Ll/ۘ۫֡;->᩸:Ll/֨۫֡;

    invoke-static {v0}, Ll/֨۫֡;->֫(Ll/֨۫֡;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 249
    invoke-static {v0}, Ll/֨۫֡;->ۧ(Ll/֨۫֡;)V

    .line 251
    :cond_0
    iget-object v0, v0, Ll/֨۫֡;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺ۫֡;

    iget-object p1, p1, Ll/ܺ۫֡;->ᩳ:Ll/۟۬֡;

    return-object p1

    .line 246
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 2

    .line 256
    iget-object v0, p0, Ll/ۘ۫֡;->᩸:Ll/֨۫֡;

    invoke-static {v0}, Ll/֨۫֡;->֫(Ll/֨۫֡;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 257
    invoke-static {v0}, Ll/֨۫֡;->ۧ(Ll/֨۫֡;)V

    .line 260
    :cond_0
    iget-object v0, v0, Ll/֨۫֡;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method
