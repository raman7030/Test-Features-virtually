.class public final Ll/ܳۗ֡;
.super Ljava/util/AbstractList;
.source "B5DP"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final ᩸:[Ljava/lang/Object;


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ܳۗ֡;->᩸:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܳۗ֡;->᩸:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ܳۗ֡;->᩸:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method
