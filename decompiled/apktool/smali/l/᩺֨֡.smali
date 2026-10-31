.class public final Ll/᩺֨֡;
.super Ljava/lang/Object;
.source "07TI"


# instance fields
.field public final ֫:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ljava/util/BitSet;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/᩺֨֡;->֫:Ljava/util/BitSet;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺֨֡;)Ljava/util/BitSet;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺֨֡;->֫:Ljava/util/BitSet;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ܰ֨֡;
    .locals 1

    .line 68
    new-instance v0, Ll/ܰ֨֡;

    invoke-direct {v0, p0}, Ll/ܰ֨֡;-><init>(Ll/᩺֨֡;)V

    return-object v0
.end method

.method public final ֫(C)V
    .locals 1

    const/16 v0, 0x7f

    if-gt p1, v0, :cond_0

    .line 42
    iget-object v0, p0, Ll/᩺֨֡;->֫:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can only match ASCII characters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(CC)V
    .locals 0

    :goto_0
    if-gt p1, p2, :cond_0

    .line 62
    invoke-virtual {p0, p1}, Ll/᩺֨֡;->֫(C)V

    add-int/lit8 p1, p1, 0x1

    int-to-char p1, p1

    goto :goto_0

    :cond_0
    return-void
.end method
