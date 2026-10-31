.class public final Ll/᩹ۛ֡;
.super Ljava/util/AbstractList;
.source "B5S9"


# instance fields
.field public final synthetic ᩸:Ll/۬ۛ֡;


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;)V
    .locals 0

    .line 624
    iput-object p1, p0, Ll/᩹ۛ֡;->᩸:Ll/۬ۛ֡;

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    if-ltz p1, :cond_1

    .line 389
    iget-object v0, p0, Ll/᩹ۛ֡;->᩸:Ll/۬ۛ֡;

    iget v1, v0, Ll/۬ۛ֡;->ۖ:I

    if-ge p1, v1, :cond_1

    .line 630
    invoke-static {v0}, Ll/۬ۛ֡;->֫(Ll/۬ۛ֡;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 631
    iget-object v1, v0, Ll/۬ۛ֡;->֫:Ll/ᩳۛ֡;

    invoke-virtual {v1, v0, p1}, Ll/ᩳۛ֡;->ۧ(Ll/۬ۛ֡;I)Ll/ۗܰ֡;

    move-result-object p1

    return-object p1

    .line 633
    :cond_0
    new-instance v1, Ll/ۗܰ֡;

    invoke-direct {v1, v0, p1}, Ll/ۗܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object v1

    .line 628
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 638
    iget-object v0, p0, Ll/᩹ۛ֡;->᩸:Ll/۬ۛ֡;

    .line 389
    iget v0, v0, Ll/۬ۛ֡;->ۖ:I

    return v0
.end method
