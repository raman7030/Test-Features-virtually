.class public final Ll/ܳܿۘ;
.super Ljava/lang/Object;
.source "M1ME"

# interfaces
.implements Ll/ᩳܿۘ;


# instance fields
.field public final ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 726
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 727
    iput p1, p0, Ll/ܳܿۘ;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    .line 743
    const-class v1, Ll/ܳܿۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 748
    const-class v0, Ll/ܳܿۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫()I
    .locals 1

    .line 737
    iget v0, p0, Ll/ܳܿۘ;->֫:I

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 732
    iget v0, p0, Ll/ܳܿۘ;->֫:I

    return v0
.end method
