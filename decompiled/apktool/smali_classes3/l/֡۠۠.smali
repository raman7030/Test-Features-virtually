.class public abstract Ll/֡۠۠;
.super Ll/ۢ۠۠;
.source "37P4"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩶:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 139
    invoke-direct {p0, p1}, Ll/ۢ۠۠;-><init>(Ljava/lang/Object;)V

    const/4 p1, -0x1

    .line 134
    iput p1, p0, Ll/֡۠۠;->᩹:I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 132
    check-cast p1, Ll/֡۠۠;

    .line 145
    iget v0, p0, Ll/֡۠۠;->᩹:I

    iget p1, p1, Ll/֡۠۠;->᩹:I

    if-ge v0, p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-ne v0, p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public abstract ܿ()Ljava/lang/Iterable;
.end method
