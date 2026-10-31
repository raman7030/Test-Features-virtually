.class public final Ll/ۘ۬ۡ;
.super Ljava/lang/Object;
.source "G1U3"

# interfaces
.implements Ll/ۡ۬ۡ;


# instance fields
.field public ֫:I

.field public ۧ:[Ll/ۡ۬ۡ;


# direct methods
.method public varargs constructor <init>([Ll/ۡ۬ۡ;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ۘ۬ۡ;->ۧ:[Ll/ۡ۬ۡ;

    .line 18
    array-length p1, p1

    iput p1, p0, Ll/ۘ۬ۡ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 2

    const/4 v0, 0x0

    .line 42
    :goto_0
    iget v1, p0, Ll/ۘ۬ۡ;->֫:I

    if-ge v0, v1, :cond_0

    .line 43
    iget-object v1, p0, Ll/ۘ۬ۡ;->ۧ:[Ll/ۡ۬ۡ;

    aget-object v1, v1, v0

    invoke-interface {v1, p1}, Ll/ۡ۬ۡ;->֫(Ll/ۗۗۡ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
