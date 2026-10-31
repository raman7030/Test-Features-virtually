.class public final Ll/ۜܿۘ;
.super Ljava/lang/Object;
.source "M1ME"

# interfaces
.implements Ll/ᩳܿۘ;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 683
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 684
    iput-object p4, p0, Ll/ۜܿۘ;->ᩳ:Ljava/lang/CharSequence;

    .line 685
    iput p1, p0, Ll/ۜܿۘ;->ۧ:I

    .line 686
    iput p2, p0, Ll/ۜܿۘ;->ܽ:I

    .line 687
    iput p3, p0, Ll/ۜܿۘ;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_3

    .line 708
    const-class v0, Ll/ۜܿۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 710
    :cond_1
    check-cast p1, Ll/ۜܿۘ;

    .line 712
    iget v0, p0, Ll/ۜܿۘ;->֫:I

    iget v1, p1, Ll/ۜܿۘ;->֫:I

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 692
    :cond_2
    iget v0, p0, Ll/ۜܿۘ;->ۧ:I

    iget v1, p0, Ll/ۜܿۘ;->ܽ:I

    iget-object v2, p0, Ll/ۜܿۘ;->ᩳ:Ljava/lang/CharSequence;

    invoke-interface {v2, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v1, p1, Ll/ۜܿۘ;->ᩳ:Ljava/lang/CharSequence;

    iget v2, p1, Ll/ۜܿۘ;->ۧ:I

    iget p1, p1, Ll/ۜܿۘ;->ܽ:I

    invoke-interface {v1, v2, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 65
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 719
    iget v0, p0, Ll/ۜܿۘ;->֫:I

    return v0
.end method

.method public final ֫()I
    .locals 1

    .line 702
    iget v0, p0, Ll/ۜܿۘ;->ܽ:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 697
    iget v0, p0, Ll/ۜܿۘ;->ۧ:I

    return v0
.end method
